/*
 * Decompiled by CFR-JS 0.4.0.
 */
class r extends um {
    static int field_z;
    static String field_B;
    static int field_w;
    static int field_x;
    static boolean field_A;
    static String field_y;
    static String field_v;
    static int[] field_C;

    public static void d() {
        field_C = null;
        field_v = null;
        field_y = null;
        field_B = null;
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 72) {
                break L1;
              } else {
                int discarded$4 = r.a((byte) 33, 79);
                break L1;
              }
            }
            L2: {
              int discarded$5 = -22;
              var2_int = qp.a(kb.field_Yb, gh.field_f);
              if (var2_int != 1) {
                break L2;
              } else {
                param1 = "<img=0>" + param1;
                break L2;
              }
            }
            L3: {
              if (var2_int == 2) {
                param1 = "<img=1>" + param1;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_7_0 = (String) param1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("r.EA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    r(int param0) {
        this(a.field_u, param0);
    }

    final static boolean c(byte param0) {
        if (param0 < -80) {
          if (qg.field_A >= 20) {
            int discarded$13 = 7457;
            if (kb.i()) {
              if (fp.field_x > 0) {
                if (am.i(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$14 = r.c((byte) 16);
          if (qg.field_A >= 20) {
            int discarded$15 = 7457;
            if (kb.i()) {
              if (fp.field_x > 0) {
                if (am.i(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    r(dh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        if (param0 != -82) {
          field_B = null;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        } else {
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        if (param1 != -20618) {
            return;
        }
        try {
            if (!(!param0)) {
                ig.b(param3.field_s, param3.field_o + param2, param3.field_t, param4 + param3.field_w, -17634);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "r.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
        field_w = 480;
        field_y = "You are invited to <%0>'s game.";
        field_v = "Options";
        field_C = new int[5];
        field_B = "Report abuse";
    }
}
