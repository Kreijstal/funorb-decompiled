/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ef field_f;
    static String field_c;
    static String field_e;
    static gh field_b;
    static int field_h;
    static String field_g;
    static String field_a;
    static int[] field_d;

    final static void a(boolean param0) {
        if (param0) {
          if (null == qi.field_d) {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          } else {
            return;
          }
        } else {
          field_h = 85;
          if (null != qi.field_d) {
            return;
          } else {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          }
        }
    }

    final static void a(int param0, pn param1, int param2, ic param3, boolean param4, java.awt.Component param5) {
        try {
            int var6_int = 23 / ((-76 - param0) / 40);
            v.a(param2, param4, param2, param3, param1, param5, 1024, -98);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ah var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = wi.a(param1, (byte) 122);
              if (param0 == -31) {
                break L1;
              } else {
                field_h = 51;
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (null != var4.field_ac) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (null == nf.field_b) {
                  break L4;
                } else {
                  if (kh.a(false, param2) == null) {
                    break L4;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
              }
              stackIn_11_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("qm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(int param0) {
        if (param0 != 20272) {
          L0: {
            field_e = (String) null;
            if (null != ch.field_O) {
              ch.field_O.m(param0 ^ 20312);
              break L0;
            } else {
              break L0;
            }
          }
          nm.field_o = new qc();
          ci.field_a.c(nm.field_o, param0 + -22929007);
          return;
        } else {
          L1: {
            if (null != ch.field_O) {
              ch.field_O.m(param0 ^ 20312);
              break L1;
            } else {
              break L1;
            }
          }
          nm.field_o = new qc();
          ci.field_a.c(nm.field_o, param0 + -22929007);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        int var1 = 3 / ((param0 - -55) / 62);
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_f = new ef();
        field_e = "<br><br><col=ffffff>This sentinel uses the following ";
        field_h = -1;
        field_c = "RMB <img=26>: Scroll view";
        field_g = "Show private chat from my friends and opponents";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = new int[]{108, -1, 30, 28, 29, -1, -1, -1, -1, -1, -1};
    }
}
