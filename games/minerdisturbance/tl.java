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
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            stackIn_2_0 = (p) null;
            return stackIn_2_0;
          }
          var5_int = param1.a(-39, param3);
          var6 = param1.a(param0, var5_int, param2 - 121);
          stackIn_4_0 = pj.a(-10, var5_int, param1, var6, param4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("tl.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        int var1 = -51 % ((50 - param0) / 55);
        field_p = null;
        field_l = null;
        field_n = (String[][]) null;
    }

    final static void b(byte param0) {
        if (param0 > 67) {
          if (mj.field_o != null) {
            mj.field_o.a();
          }
          if (null != im.field_b) {
            im.field_b.a();
          }
          return;
        }
        tl.b((byte) 89);
        if (mj.field_o != null) {
          mj.field_o.a();
        }
        if (null != im.field_b) {
          im.field_b.a();
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
