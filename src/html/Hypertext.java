/* Hypertext.java */
/* Generated By:JavaCC: Do not edit this line. Hypertext.java */
package html;
    public class Hypertext implements HypertextConstants {
        public static void main(String[] args) throws ParseException, TokenMgrError {
            Hypertext parser = new Hypertext(System.in);
            System.out.println(parser.create());
        }

        private static String stringifyStyle(String[] parameters) {
            String res = "";
            if(!parameters[0].isEmpty()) {
                res += " style=\"color:" + parameters[0] + ";";
                if(!parameters[1].isEmpty()) {
                    res += "font-family:" + parameters[1] + ";";
                }
                res += "\">";
            } else if(!parameters[1].isEmpty()) {
                res += " style=\"font-family:" + parameters[1] + ";\">";
            } else {
                res += ">";
            }
            res += parameters[2];
            return res;
        }

  final public String create() throws ParseException {String html = "";
        String lineParse;
        String nextLine;
    jj_consume_token(5);
    lineParse = element();
html += lineParse;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 5:{
html += '\n';
      nextLine = create();
html += nextLine;
      break;
      }
    case 0:{
      jj_consume_token(0);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return html;}
    throw new Error("Missing return statement in function");
}

  final public String element() throws ParseException {String tag;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 6:{
      tag = img();
      break;
      }
    case 9:{
      tag = header();
      break;
      }
    case 10:{
      tag = para();
      break;
      }
    case 11:{
      tag = url();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return tag;}
    throw new Error("Missing return statement in function");
}

  final public String img() throws ParseException {String tag = "<img src=\"";
        String src;
    jj_consume_token(6);
    jj_consume_token(7);
    jj_consume_token(8);
    src = sentence();
tag += src.substring(1, src.length() - 1) + "\"/>"; {if ("" != null) return tag;}
    throw new Error("Missing return statement in function");
}

  final public String header() throws ParseException {String tag = "<h1";
        String contents[];
    jj_consume_token(9);
    contents = decoratedText();
tag += stringifyStyle(contents) + "</h1>";
            {if ("" != null) return tag;}
    throw new Error("Missing return statement in function");
}

  final public String para() throws ParseException {String tag = "<p";
        String[] contents;
    jj_consume_token(10);
    contents = decoratedText();
tag += stringifyStyle(contents) + "</p>";
            {if ("" != null) return tag;}
    throw new Error("Missing return statement in function");
}

  final public String url() throws ParseException {String tag = "<a ";
        String[] contents;
    jj_consume_token(11);
    contents = decoratedURL();
tag += "href=\"" + contents[3] + "\"";
            tag += stringifyStyle(contents) + "</a>";
            {if ("" != null) return tag;}
    throw new Error("Missing return statement in function");
}

  final public String[] decoratedText() throws ParseException {String[] contents = {"","",""};
        String text = "";
        String color = "";
        String font = "";
        String[] details = {"","",""};
    if (jj_2_1(2)) {
      text = text();
contents[2] = text;
    } else if (jj_2_2(2)) {
      color = color();
contents[0] = color;
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 7:{
        font = font();
contents[1] = font;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_1:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_1;
      }
      jj_consume_token(12);
      details = decoratedText();
for(int i = 0; i < 3; i++){ if(!details[i].isEmpty()) { contents[i] = details[i]; } }
    }
{if ("" != null) return contents;}
    throw new Error("Missing return statement in function");
}

  final public String[] decoratedURL() throws ParseException {String[] contents = {"","","",""};
        String text = "";
        String color = "";
        String font = "";
        String link = "";
        String[] details = {"",""};
    text = text();
contents[2] = text;
    jj_consume_token(12);
    jj_consume_token(7);
    jj_consume_token(11);
    link = sentence();
contents[3] = link.substring(1, link.length() - 1);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 12:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      jj_consume_token(12);
      details = decoration();
if(!details[0].isEmpty()) contents[0] = details[0]; if(!details[1].isEmpty()) contents[1] = details[1];
    }
{if ("" != null) return contents;}
    throw new Error("Missing return statement in function");
}

  final public String[] decoration() throws ParseException {String[] contents = {"",""};
        String color = "";
        String font = "";
    if (jj_2_4(2)) {
      color = color();
contents[0] = color;
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 7:{
        font = font();
contents[1] = font;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return contents;}
    throw new Error("Missing return statement in function");
}

  final public String text() throws ParseException {String text;
    jj_consume_token(7);
    jj_consume_token(13);
    text = sentence();
{if ("" != null) return text.substring(1, text.length() - 1);}
    throw new Error("Missing return statement in function");
}

  final public String color() throws ParseException {String color;
    jj_consume_token(7);
    jj_consume_token(14);
    color = sentence();
{if ("" != null) return color.substring(1, color.length() - 1);}
    throw new Error("Missing return statement in function");
}

  final public String font() throws ParseException {String font;
    jj_consume_token(7);
    jj_consume_token(15);
    font = sentence();
{if ("" != null) return font.substring(1, font.length() - 1);}
    throw new Error("Missing return statement in function");
}

  final public String sentence() throws ParseException {Token token;
        String res = "";
    token = jj_consume_token(SENTENCE);
res = token.image; {if ("" != null) return res;}
    throw new Error("Missing return statement in function");
}

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_4()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_3_2()
 {
    if (jj_3R_color_161_9_4()) return true;
    return false;
  }

  private boolean jj_3R_font_170_9_7()
 {
    if (jj_scan_token(7)) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_3R_color_161_9_4()) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_text_152_9_3()) return true;
    return false;
  }

  private boolean jj_3R_decoratedText_118_9_5()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_1()) {
    jj_scanpos = xsp;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_decoratedText_118_119_6()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_color_161_9_4()
 {
    if (jj_scan_token(7)) return true;
    if (jj_scan_token(14)) return true;
    return false;
  }

  private boolean jj_3R_decoratedText_118_119_6()
 {
    if (jj_3R_font_170_9_7()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(12)) return true;
    if (jj_3R_decoratedText_118_9_5()) return true;
    return false;
  }

  private boolean jj_3R_text_152_9_3()
 {
    if (jj_scan_token(7)) return true;
    if (jj_scan_token(13)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public HypertextTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x21,0xe40,0x80,0x1000,0x80,};
	}
  final private JJCalls[] jj_2_rtns = new JJCalls[4];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Hypertext(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Hypertext(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new HypertextTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Hypertext(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new HypertextTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new HypertextTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Hypertext(HypertextTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(HypertextTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 5; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[17];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 5; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 17; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 4; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			   case 3: jj_3_4(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

    }