/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends gb {
    static int[] field_m;
    private java.nio.ByteBuffer field_n;
    static int field_l;
    static String field_h;
    static String field_k;
    static String field_g;
    static int field_j;
    static String field_i;

    final byte[] a(int param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_n.capacity()];
        var2 = var3;
        this.field_n.position(0);
        this.field_n.get(var3);
        if (param0 != -21109) {
          return (byte[]) null;
        } else {
          return var3;
        }
    }

    final void a(byte param0, byte[] param1) {
        this.field_n = java.nio.ByteBuffer.allocateDirect(param1.length);
        this.field_n.position(0);
        if (param0 > -30) {
            return;
        }
        try {
            this.field_n.put(param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ge.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = null;
            if (param0 == 0) {
              L1: {
                if (dn.field_Ub == null) {
                  break L1;
                } else {
                  if (dn.field_Ub.equals(param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = dn.field_Ub;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (null == ja.field_h) {
                  break L2;
                } else {
                  if (ja.field_h.equals(param2.getParameter("session"))) {
                    break L2;
                  } else {
                    var4 = ja.field_h;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = fc.a(-19571, param1, (String) (var3), (String) (var4), -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("ge.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void b(int param0) {
        if (param0 <= 3) {
            return;
        }
        field_i = null;
        field_h = null;
        field_m = null;
        field_g = null;
        field_k = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -32) {
          return -20;
        } else {
          param0--;
          param0 = param0 | param0 >>> -1882720287;
          param0 = param0 | param0 >>> 296757634;
          param0 = param0 | param0 >>> -1076979676;
          param0 = param0 | param0 >>> -44437880;
          param0 = param0 | param0 >>> 1392010064;
          return param0 + 1;
        }
    }

    ge() {
    }

    static {
        field_l = 0;
        field_k = "Add name";
        field_h = "Suggest muting this player";
        field_g = "Fullscreen";
        field_m = jg.a(true);
        field_i = "Detail: High";
        field_j = 0;
    }
}
