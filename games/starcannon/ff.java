/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends uh {
    private String[] field_t;
    static int field_o;
    static String field_p;
    int[] field_s;
    static String field_q;
    private int[][] field_n;
    private int[] field_r;

    final static String g(int param0) {
        int var1 = 31 % ((param0 - 57) / 43);
        if (!(jl.field_a != uh.field_k)) {
            return jl.field_c;
        }
        if (!(jl.field_a != ie.field_x)) {
            return te.field_a;
        }
        if (!qa.field_a.b(false)) {
            return te.field_a;
        }
        return lc.field_hb;
    }

    final static boolean a(int param0, ld param1, ld param2) {
        int var4 = StarCannon.field_A;
        int var3 = -param2.field_hb + param1.field_hb;
        if (param1.field_gb == wg.field_a) {
            // wide iinc 3 -200
        } else {
            if (param1.field_gb == null) {
                // wide iinc 3 200
            }
        }
        if (param0 != 80) {
            return false;
        }
        if (wg.field_a != param2.field_gb) {
            // if_acmpne L113
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return var3 > 0 ? true : false;
    }

    private final void a(rb param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        o var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = StarCannon.field_A;
          var4 = -121 % ((1 - param2) / 57);
          if (param1 != 1) {
            if (param1 != 2) {
              if (param1 == -4) {
                var5 = param0.j(7909);
                ((ff) this).field_n = new int[var5][];
                ((ff) this).field_r = new int[var5];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var5) {
                    break L0;
                  } else {
                    var7 = param0.i(-1174051992);
                    var8 = qf.a(var7, 0);
                    if (var8 != null) {
                      ((ff) this).field_r[var6] = var7;
                      ((ff) this).field_n[var6] = new int[var8.field_a];
                      var9 = 0;
                      L2: while (true) {
                        if (var8.field_a > var9) {
                          ((ff) this).field_n[var6][var9] = param0.i(-1174051992);
                          var9++;
                          continue L2;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (-5 != param1) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var5 = param0.j(7909);
              ((ff) this).field_s = new int[var5];
              var6 = 0;
              L3: while (true) {
                if (var6 >= var5) {
                  break L0;
                } else {
                  ((ff) this).field_s[var6] = param0.i(-1174051992);
                  var6++;
                  continue L3;
                }
              }
            }
          } else {
            ((ff) this).field_t = uj.a(-46, '<', param0.a(-50));
            break L0;
          }
        }
    }

    final void a(rb param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        L0: while (true) {
          var3 = param0.j(7909);
          if (-1 != (var3 ^ -1)) {
            this.a(param0, var3, (byte) 99);
            continue L0;
          } else {
            L1: {
              if (param1 >= 24) {
                break L1;
              } else {
                ((ff) this).field_s = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = StarCannon.field_A;
        if (!(null == ((ff) this).field_s)) {
            for (var2 = 0; var2 < ((ff) this).field_s.length; var2++) {
                ((ff) this).field_s[var2] = cl.a(((ff) this).field_s[var2], 32768);
            }
        }
        if (param0 > -33) {
            String discarded$0 = ((ff) this).e(-31);
        }
    }

    final String e(int param0) {
        int var4 = StarCannon.field_A;
        StringBuilder var7 = new StringBuilder(80);
        var7 = var7;
        if (!(((ff) this).field_t != null)) {
            return "";
        }
        StringBuilder discarded$0 = var7.append(((ff) this).field_t[0]);
        int var3 = 1;
        if (param0 > -5) {
            Object var5 = null;
            boolean discarded$1 = ff.a(-127, (ld) null, (ld) null);
        }
        while (((ff) this).field_t.length > var3) {
            StringBuilder discarded$2 = var7.append("...");
            StringBuilder discarded$3 = var7.append(((ff) this).field_t[var3]);
            var3++;
        }
        return var7.toString();
    }

    public static void f(int param0) {
        field_q = null;
        field_p = null;
        if (param0 > -32) {
            String discarded$0 = ff.g(-95);
        }
    }

    ff() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Email (Login):";
        field_p = "The War is going badly for Earth.  The Battle of Proxima has seen the defeat of the Terran Space Navy, and the flagship TNS-HOOD has been destroyed.  A barbaric race of insectoids, the Paragula, is now in position to invade our solar system.<br><br>However, the valiant efforts of our unfortunate pilots have bought enough time for us to bring our experimental fighter, the 'Nova Ray', to battle readiness.  You must command this awesome vessel against almost impossible odds in the defence of Earth.<br><br>Good luck, and good hunting!";
    }
}
