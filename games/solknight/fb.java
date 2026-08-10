/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, String param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12239) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            gb.field_i = da.field_d;
            if (param2 == 255) {
              L2: {
                stackIn_12_0 = 0;

                if (13 <= uh.field_d) {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 0;
                  break L2;
                } else {
                  stackIn_13_0 = stackIn_12_0;
                  stackIn_13_1 = 1;
                  break L2;
                }
              }
              a.field_h = di.a(stackIn_13_0 != 0, stackIn_13_1 != 0);
              var6 = (String[]) null;
              kf.a(1, (String[]) null);
              break L0;
            } else {
              if ((param2 ^ -1) > -101) {
                a.field_h = mh.a(param2, true, param3);
                return;
              } else {
                if ((param2 ^ -1) >= -106) {
                  var4 = param1;
                  kf.a(1, var4);
                  a.field_h = wk.a((byte) 17, param1);
                  return;
                } else {
                  a.field_h = mh.a(param2, true, param3);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("fb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            String var2 = (String) null;
            fb.a(-18, (String[]) null, -68, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != 255) {
          L0: {
            fb.a(true);
            if (null != u.field_b) {
              u.field_b.d(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L1;
            } else {
              break L1;
            }
          }
          df.h(-1);
          return;
        } else {
          L2: {
            if (null != u.field_b) {
              u.field_b.d(true);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != pc.field_b) {
              pc.field_b.f((byte) -85);
              break L3;
            } else {
              break L3;
            }
          }
          df.h(-1);
          return;
        }
    }

    static {
        field_c = 0;
        field_b = new int[1024];
        field_a = true;
    }
}
