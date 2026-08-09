/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static hj field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -11) {
                break L1;
              } else {
                var6 = (byte[]) null;
                i.a(true, (byte[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                tg.field_c = kf.field_d;
                if (-256 != (param3 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (13 <= ae.field_a) {
                      stackIn_7_0 = 0;
                      break L4;
                    } else {
                      stackIn_7_0 = 1;
                      break L4;
                    }
                  }
                  uc.field_q = fk.a(stackIn_7_0 != 0, (byte) -68);
                  var7 = (String[]) null;
                  gi.a((String[]) null, (byte) -73);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (100 > param3) {
                uc.field_q = oe.a(param3, param1, -3);
                return;
              } else {
                if ((param3 ^ -1) < -106) {
                  uc.field_q = oe.a(param3, param1, -3);
                  return;
                } else {
                  var8 = param2;
                  gi.a(var8, (byte) -66);
                  uc.field_q = hi.a(2, param2);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    uc.field_q = oe.a(param3, param1, -3);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("i.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 100) {
            i.a(8);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static wa a(boolean param0, byte[] param1) {
        wa var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        wa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new wa(param1, jd.field_g, wc.field_a, wh.field_b, m.field_a, vc.field_g, fl.field_a);
                md.a((byte) -118);
                if (!param0) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  i.a(true, (byte[]) null);
                  break L1;
                }
              }
              stackIn_6_0 = (wa) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("i.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}
