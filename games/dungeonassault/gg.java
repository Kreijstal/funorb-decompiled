/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static ba field_c;
    static long field_d;
    int field_b;
    int field_f;
    static String field_e;
    static int[] field_a;
    static int[] field_g;

    final static void a(byte param0) {
        pp stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        pp stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        pp stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        pp stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        pp stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        pp stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        pp stackIn_32_0 = null;
        boolean stackIn_33_1 = false;
        int var1;
        int var1Lifetime1;
        int var1Lifetime2;
        k.field_b = null;
        if (qc.field_y < 0) {
          var1 = 80 % ((-39 - param0) / 42);
          stackIn_3_0 = wf.field_w;
          stackIn_4_1 = (null == k.field_b) ? false : true;
          stackIn_3_0.field_w = stackIn_4_1;
          return;
        }
        if (qc.field_y >= ao.field_o) {
          var1Lifetime1 = 80 % ((-39 - param0) / 42);
          stackIn_8_0 = wf.field_w;
          stackIn_9_1 = (null == k.field_b) ? false : true;
          stackIn_8_0.field_w = stackIn_9_1;
          return;
        }
        var1Lifetime2 = qc.field_y - vd.field_a;
        if (var1Lifetime2 < 0) {
          var1Lifetime2 = 80 % ((-39 - param0) / 42);
          stackIn_13_0 = wf.field_w;
          stackIn_14_1 = (null == k.field_b) ? false : true;
          stackIn_13_0.field_w = stackIn_14_1;
        } else {
          if (10 <= var1Lifetime2) {
            var1Lifetime2 = 80 % ((-39 - param0) / 42);
            stackIn_18_0 = wf.field_w;
            stackIn_19_1 = (null == k.field_b) ? false : true;
            stackIn_18_0.field_w = stackIn_19_1;
          } else {
            if (null == fb.field_d[var1Lifetime2]) {
              var1Lifetime2 = 80 % ((-39 - param0) / 42);
              stackIn_23_0 = wf.field_w;
              stackIn_24_1 = (null == k.field_b) ? false : true;
              stackIn_23_0.field_w = stackIn_24_1;
            } else {
              if (eh.a(true, fb.field_d[var1Lifetime2].field_i)) {
                var1Lifetime2 = 80 % ((-39 - param0) / 42);
                stackIn_32_0 = wf.field_w;
                stackIn_33_1 = (null == k.field_b) ? false : true;
                stackIn_32_0.field_w = stackIn_33_1;
              } else {
                k.field_b = fb.field_d[var1Lifetime2].field_i;
                var1Lifetime2 = 80 % ((-39 - param0) / 42);
                stackIn_28_0 = wf.field_w;
                stackIn_29_1 = (null == k.field_b) ? false : true;
                stackIn_28_0.field_w = stackIn_29_1;
              }
            }
          }
        }
        return;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 == 0) {
          field_c = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_c = (ba) null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    final static void a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != a.field_n) {
            a.field_n.j((byte) 51);
          }
          wo.field_e = new dn(param2, param1, false, true, true);
          ta.field_a.b(1, wo.field_e);
          if (param0 < -88) {
            return;
          }
          var4 = (byte[]) null;
          gg.a((byte) -64, (byte[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var4 = 57 / ((-44 - param0) / 40);
          var3 = new byte[var2_int];
          cj.a(param1, 0, var3, 0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("gg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        String var1 = null;
        if (!qc.field_t) {
          throw new IllegalStateException();
        }
        if (param0 == 0) {
          if (a.field_n != null) {
            a.field_n.j((byte) 56);
          }
          var1 = dm.a(param0 + 121);
          wo.field_e = new dn(var1, (String) null, true, false, false);
          lg.field_w.a(ta.field_a, -1);
          ta.field_a.b(1, wo.field_e);
          ta.field_a.h((byte) 59);
          return;
        }
    }

    gg(int param0, int param1) {
        this.field_b = param1;
        this.field_f = param0;
    }

    static {
        field_e = "Raider";
        field_c = new ba("usename");
        field_a = new int[1024];
        field_g = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
}
