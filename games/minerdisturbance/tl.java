/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends pc {
    static int field_q;
    static String[][] field_n;
    static bg field_l;
    static String field_p;
    static long field_o;
    static int field_m;

    final static p a(String param0, bj param1, int param2, String param3, bj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        p stackIn_2_0 = null;
        p stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 2) {
              var5_int = param1.a(-39, param3);
              var6 = param1.a(param0, var5_int, param2 + -121);
              stackIn_4_0 = pj.a(-10, var5_int, param1, var6, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (p) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("tl.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void c(byte param0) {
        int var1 = -51 % ((50 - param0) / 55);
        field_p = null;
        field_l = null;
        field_n = (String[][]) null;
    }

    final static void b(byte param0) {
        if (param0 <= 67) {
          L0: {
            tl.b((byte) 89);
            if (mj.field_o != null) {
              mj.field_o.a();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != im.field_b) {
              im.field_b.a();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (mj.field_o != null) {
              mj.field_o.a();
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != im.field_b) {
              im.field_b.a();
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    tl(long param0, String param1) {
        super(param0, param1);
    }

    final ec b(int param0) {
        if (param0 != 0) {
            return (ec) null;
        }
        return fd.field_H;
    }

    static {
        field_q = 0;
        field_n = new String[][]{new String[]{"You can jump out of the water by getting a good kick off the bottom. Press and hold the <img=16> arrow until standing on the bottom of a pool. Then, press and hold the <img=17> arrow until you jump out of the water."}};
        field_p = "Fullscreen";
        field_l = new bg(6, 0, 4, 2);
    }
}
