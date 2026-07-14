/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ec {
    private int[][] field_q;
    static String field_o;
    static String field_r;
    private String[] field_p;
    static String[] field_s;
    int[] field_n;
    private int[] field_m;

    final void a(gb param0, boolean param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param1) {
            ba.f(1);
        }
        while (true) {
            var3 = param0.j(255);
            if (var3 == 0) {
                break;
            }
            this.a(var3, param0, 0);
        }
    }

    private final void a(int param0, gb param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          if (1 == param0) {
            ((ba) this).field_p = b.a(param1.h(72), '<', true);
            break L0;
          } else {
            if (param0 != 2) {
              if ((param0 ^ -1) != -4) {
                if ((param0 ^ -1) == -5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param1.j(param2 + 255);
                ((ba) this).field_q = new int[var4][];
                ((ba) this).field_m = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param1.i(38);
                    var7 = uf.a(var6, (byte) -121);
                    if (var7 != null) {
                      ((ba) this).field_m[var5] = var6;
                      ((ba) this).field_q[var5] = new int[var7.field_c];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_c) {
                          ((ba) this).field_q[var5][var8] = param1.i(-122);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var4 = param1.j(255);
              ((ba) this).field_n = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((ba) this).field_n[var5] = param1.i(-108);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        L4: {
          if (param2 == 0) {
            break L4;
          } else {
            var10 = null;
            ((ba) this).a((gb) null, true);
            break L4;
          }
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 < 93) {
            ((ba) this).g(41);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((ba) this).field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ba) this).field_p[0]);
        for (var3 = 1; ((ba) this).field_p.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ba) this).field_p[var3]);
        }
        return var2.toString();
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        if (param0 <= 33) {
            return;
        }
        if (((ba) this).field_n != null) {
            for (var2 = 0; var2 < ((ba) this).field_n.length; var2++) {
                ((ba) this).field_n[var2] = qk.a(((ba) this).field_n[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 < 6) {
            field_o = null;
        }
        field_r = null;
        field_s = null;
    }

    ba() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
        field_r = "You are not currently logged in to the<nbsp>game.";
    }
}
