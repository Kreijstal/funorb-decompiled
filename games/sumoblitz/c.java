/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends nl {
    static int field_s;
    static String field_q;
    static int field_r;
    static String field_t;
    static int[] field_u;

    final String a(boolean param0, pk param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_s = -86;
                break L1;
              }
            }
            stackIn_3_0 = oc.a(param1.field_m.length(), '*', -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("c.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        if (param0 != 22760) {
          field_q = (String) null;
          field_t = null;
          field_q = null;
          field_u = null;
          return;
        } else {
          field_t = null;
          field_q = null;
          field_u = null;
          return;
        }
    }

    private c(vn param0, int param1) {
        super(param0, param1);
    }

    c(int param0) {
        this(kw.field_b, param0);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = wd.field_e;
          synchronized (var1) {
            L0: {
              if (param0 >= 108) {
                L1: {
                  bj.field_a = ua.field_a;
                  kj.field_e = kj.field_e + 1;
                  if (0 > lv.field_i) {
                    var5 = 0;
                    var2 = var5;
                    L2: while (true) {
                      if (-113 >= (var5 ^ -1)) {
                        lv.field_i = ks.field_v;
                        break L1;
                      } else {
                        hw.field_b[var5] = false;
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    L3: while (true) {
                      if (ks.field_v == lv.field_i) {
                        break L1;
                      } else {
                        var2 = jf.field_d[ks.field_v];
                        ks.field_v = 127 & ks.field_v + 1;
                        if (0 <= var2) {
                          hw.field_b[var2] = true;
                          continue L3;
                        } else {
                          hw.field_b[var2 ^ -1] = false;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                ua.field_a = jt.field_s;
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "c.K(" + param0 + ')');
        }
    }

    static {
        field_q = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_t = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_u = new int[]{1, 1, 1};
    }
}
