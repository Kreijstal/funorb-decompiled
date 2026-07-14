/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends hg {
    private ed[] field_l;
    private int field_q;
    static hf field_p;
    static dh field_g;
    static String field_j;
    static String[] field_i;
    static String field_o;
    static char[] field_n;
    static char[][] field_k;
    private int field_m;
    static String field_h;

    public static void e(int param0) {
        field_k = null;
        field_o = null;
        field_j = null;
        int var1 = -112 % ((-22 - param0) / 61);
        field_p = null;
        field_g = null;
        field_n = null;
        field_i = null;
        field_h = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        ed var3 = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        ((tc) this).field_m = 0;
        if (null == ((tc) this).field_l) {
          return;
        } else {
          if (0 != ((tc) this).field_l.length) {
            L0: {
              if (param0 > 84) {
                break L0;
              } else {
                tc.e(-24);
                break L0;
              }
            }
            var2 = 0;
            L1: while (true) {
              if (((tc) this).field_l.length <= var2) {
                return;
              } else {
                var3 = ((tc) this).field_l[var2];
                if (var3 != null) {
                  ((tc) this).field_m = ((tc) this).field_m + var3.field_A;
                  ((tc) this).field_m = ((tc) this).field_m + ((tc) this).field_q;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        L0: {
          var6 = EscapeVector.field_A;
          if (param0 == 103) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        if (((tc) this).field_l == null) {
          return;
        } else {
          if (((tc) this).field_l.length == 0) {
            return;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((tc) this).field_l.length) {
                return;
              } else {
                var5 = ((tc) this).field_l[var4];
                if (var5 != null) {
                  var5.e(param1, param2);
                  param1 = param1 + var5.field_A;
                  param1 = param1 + ((tc) this).field_q;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int d(int param0) {
        if (param0 != 11384) {
            this.a((byte) -120);
        }
        return ((tc) this).field_m;
    }

    tc(ed[] param0, int param1) {
        ((tc) this).field_q = param1;
        ((tc) this).field_l = param0;
        this.a((byte) 112);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new hf();
        field_g = new dh();
        field_n = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_i = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_o = "Skip Tutorial";
        field_h = "SPACE or SHIFT";
        field_k = new char[][]{new char[13], new char[14]};
    }
}
