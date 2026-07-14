/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends dk {
    private int[][] field_u;
    int[] field_w;
    static String field_s;
    static bd field_r;
    private int[] field_q;
    private String[] field_v;
    static pe field_t;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var10 = HostileSpawn.field_I ? 1 : 0;
        int var7 = 0;
        int var9 = param1;
        if (param5 != 32101) {
            hj.e(123);
        }
        while (var9 < param4 + param1) {
            var8 = param3 + (-param3 + param2) * (var9 - param1) / param4;
            si.e(param0, var9, param6, var7, var8);
            var9++;
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_t = null;
        field_s = null;
        if (param0 > -36) {
            field_t = null;
        }
    }

    final static String d(int param0) {
        if (param0 < 33) {
            return null;
        }
        return ad.field_c;
    }

    final static void a(String param0, int param1) {
        fl.field_b = param0;
        if (param1 < 37) {
            hj.a(-85, -127, -125, -96, -52, -34, 65);
        }
    }

    private final void a(int param0, int param1, vi param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nd var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if (param1 == 19711) {
            break L0;
          } else {
            ((hj) this).field_v = null;
            break L0;
          }
        }
        L1: {
          if (1 == param0) {
            ((hj) this).field_v = cj.a(param2.o(32), -14, '<');
            break L1;
          } else {
            if ((param0 ^ -1) != -3) {
              if ((param0 ^ -1) != -4) {
                if (4 == param0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param2.l(32270);
                ((hj) this).field_q = new int[var4];
                ((hj) this).field_u = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param2.e(8);
                    var7 = mb.c(param1 + -41805, var6);
                    if (var7 != null) {
                      ((hj) this).field_q[var5] = var6;
                      ((hj) this).field_u[var5] = new int[var7.field_b];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_b > var8) {
                          ((hj) this).field_u[var5][var8] = param2.e(8);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var4 = param2.l(param1 ^ 13041);
              ((hj) this).field_w = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((hj) this).field_w[var5] = param2.e(bm.a(param1, 19703));
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static ll b(String param0, int param1) {
        if (param1 != 11242) {
            return null;
        }
        if (param0 != null) {
            // ifeq L26
        } else {
            return sg.field_d;
        }
        int var2 = param0.indexOf('@');
        if (!(-1 != var2)) {
            return gf.field_f;
        }
        String var3 = param0.substring(0, var2);
        String var4 = param0.substring(var2 + 1);
        ll var5 = ml.a(-99, var3);
        if (!(var5 == null)) {
            return var5;
        }
        return ic.b(var4, (byte) -36);
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        ki.field_f = ee.field_b;
        if (param2 == 0) {
          L0: {
            if (-256 != (param3 ^ -1)) {
              L1: {
                if ((param3 ^ -1) > -101) {
                  break L1;
                } else {
                  if (param3 <= 105) {
                    var4 = args;
                    jj.a((byte) -112, var4);
                    nl.field_a = vf.a(args, true);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              nl.field_a = an.a(param3, -10, param1);
              break L0;
            } else {
              L2: {
                if (13 <= ia.field_h) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L2;
                }
              }
              nl.field_a = qi.a(stackIn_6_0 != 0, false);
              var6 = null;
              jj.a((byte) -112, (String[]) null);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(vi param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        L0: while (true) {
          var3 = param0.l(param1 ^ 32334);
          if (var3 != 0) {
            this.a(var3, 19711, param0);
            continue L0;
          } else {
            L1: {
              if (param1 == 64) {
                break L1;
              } else {
                String discarded$1 = ((hj) this).d((byte) -9);
                break L1;
              }
            }
            return;
          }
        }
    }

    hj() {
    }

    final String d(byte param0) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(((hj) this).field_v != null)) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((hj) this).field_v[0]);
        int var3 = -127 / ((20 - param0) / 54);
        for (var4 = 1; ((hj) this).field_v.length > var4; var4++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var6.append(((hj) this).field_v[var4]);
        }
        return var2.toString();
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (((hj) this).field_w != null) {
            for (var2 = 0; var2 < ((hj) this).field_w.length; var2++) {
                ((hj) this).field_w[var2] = ll.a(((hj) this).field_w[var2], 32768);
            }
        }
        if (param0 <= 61) {
            Object var4 = null;
            ll discarded$0 = hj.b((String) null, 23);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Score: <col=ffffff><%0></col> points";
    }
}
