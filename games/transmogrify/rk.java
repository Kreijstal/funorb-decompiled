/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends ri {
    static int[] field_n;
    static int field_p;
    private String[] field_s;
    int[] field_m;
    private int[] field_o;
    static ti[] field_r;
    static int[] field_q;
    private int[][] field_l;

    final static String a(Throwable param0, boolean param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        kl var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Transmogrify.field_A ? 1 : 0;
          if (!(param0 instanceof kl)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (kl) (Object) param0;
            var2 = var14.field_a + " | ";
            param0 = var14.field_b;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if ((var9 ^ -1) == 0) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 < (var12 ^ -1)) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            if (!param1) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              return null;
            }
          }
        }
    }

    final void a(oa param0, int param1) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        while (true) {
            var3 = param0.d((byte) 102);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(32512, var3, param0);
        }
        if (param1 != -1) {
            Object var5 = null;
            ((rk) this).a((oa) null, 91);
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            rk.b(true);
        }
        field_n = null;
        field_r = null;
        field_q = null;
    }

    private final void a(int param0, int param1, oa param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tf var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          if (param0 == 32512) {
            break L0;
          } else {
            var10 = null;
            this.a(61, -106, (oa) null);
            break L0;
          }
        }
        L1: {
          if (-2 != (param1 ^ -1)) {
            if (param1 == -3) {
              var4 = param2.d((byte) 55);
              ((rk) this).field_m = new int[var4];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((rk) this).field_m[var5] = param2.a((byte) -113);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if (-4 == param1) {
                var4 = param2.d((byte) 110);
                ((rk) this).field_l = new int[var4][];
                ((rk) this).field_o = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param2.a((byte) -126);
                    var7 = kb.a(var6, true);
                    if (var7 != null) {
                      ((rk) this).field_o[var5] = var6;
                      ((rk) this).field_l[var5] = new int[var7.field_b];
                      var8 = 0;
                      L4: while (true) {
                        if (var8 < var7.field_b) {
                          ((rk) this).field_l[var5][var8] = param2.a((byte) -108);
                          var8++;
                          continue L4;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (-5 == (param1 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            ((rk) this).field_s = vi.a('<', param2.g(param0 + -20264), 0);
            break L1;
          }
        }
    }

    final String d(byte param0) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(((rk) this).field_s != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((rk) this).field_s[0]);
        for (var3 = 1; ((rk) this).field_s.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((rk) this).field_s[var3]);
        }
        var3 = -74 / ((-54 - param0) / 52);
        return var2.toString();
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        if (!(((rk) this).field_m == null)) {
            for (var2 = 0; var2 < ((rk) this).field_m.length; var2++) {
                ((rk) this).field_m[var2] = cl.b(((rk) this).field_m[var2], 32768);
            }
        }
        if (param0 < 44) {
            Object var4 = null;
            this.a(119, -125, (oa) null);
        }
    }

    rk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[12];
        field_r = new ti[8];
        field_q = new int[8192];
    }
}
