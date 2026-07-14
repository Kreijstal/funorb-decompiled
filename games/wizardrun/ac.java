/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends rk {
    static int field_r;
    private String[] field_v;
    static int[] field_q;
    static o field_s;
    private int[] field_w;
    static int field_t;
    int[] field_p;
    private int[][] field_u;

    final String d(int param0) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((ac) this).field_v) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ac) this).field_v[0]);
        for (var3 = 1; var3 < ((ac) this).field_v.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ac) this).field_v[var3]);
        }
        if (param0 != 10592) {
            field_t = 109;
        }
        return var2.toString();
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        if (!(((ac) this).field_p == null)) {
            for (var2 = 0; ((ac) this).field_p.length > var2; var2++) {
                ((ac) this).field_p[var2] = sd.a(((ac) this).field_p[var2], 32768);
            }
        }
        if (param0 >= -118) {
            Object var4 = null;
            this.a(92, (va) null, 16);
        }
    }

    final static boolean a(byte param0) {
        pk var1 = null;
        int var2 = 0;
        int var3 = 0;
        pk var4 = null;
        var3 = wizardrun.field_H;
        var4 = (pk) (Object) kj.field_d.b((byte) 46);
        var1 = var4;
        if (var1 != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= var1.field_r) {
              if (param0 > 60) {
                return true;
              } else {
                field_t = -99;
                return true;
              }
            } else {
              L1: {
                if (null != var4.field_l[var2]) {
                  if (var4.field_l[var2].field_a != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (null != var4.field_m[var2]) {
                if (-1 == (var4.field_m[var2].field_a ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            return;
        }
        int discarded$0 = tf.a(-20232);
    }

    private final void a(int param0, va param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bh var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = wizardrun.field_H;
          if (param0 >= 24) {
            break L0;
          } else {
            field_r = 59;
            break L0;
          }
        }
        L1: {
          if (-2 != (param2 ^ -1)) {
            if ((param2 ^ -1) != -3) {
              if ((param2 ^ -1) != -4) {
                if (param2 == 4) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param1.f(255);
                ((ac) this).field_w = new int[var4];
                ((ac) this).field_u = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param1.j(-14477);
                    var7 = nh.a(0, var6);
                    if (var7 != null) {
                      ((ac) this).field_w[var5] = var6;
                      ((ac) this).field_u[var5] = new int[var7.field_f];
                      var8 = 0;
                      L3: while (true) {
                        if (var8 < var7.field_f) {
                          ((ac) this).field_u[var5][var8] = param1.j(-14477);
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
              var4 = param1.f(255);
              ((ac) this).field_p = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((ac) this).field_p[var5] = param1.j(-14477);
                  var5++;
                  continue L4;
                }
              }
            }
          } else {
            ((ac) this).field_v = tj.a(param1.d(0), -22710, '<');
            break L1;
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            field_s = null;
        }
        field_s = null;
        field_q = null;
    }

    ac() {
    }

    final void a(va param0, int param1) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        while (true) {
            var3 = param0.f(255);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(117, param0, var3);
        }
        var3 = 44 % ((-38 - param1) / 36);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[4];
    }
}
