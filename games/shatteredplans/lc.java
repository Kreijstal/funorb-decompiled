/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc {
    static gq field_b;
    static String field_d;
    static volatile int field_c;
    static String field_a;

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) + (param1 >>> 1 & -715827883);
        param1 = ((-858993460 & param1) >>> 2) + (param1 & 858993459);
        param1 = 252645135 & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        if (param0 == 12330) {
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        field_d = (String) null;
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    final static String a(int param0, byte param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -60) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (param0 == 1) {
            stackIn_5_0 = re.a(ea.field_e, 4371, new String[]{param2});
            return stackIn_5_0;
          }
          if (param0 == 2) {
            stackIn_8_0 = re.a(p.field_y, 4371, new String[]{param2});
            return stackIn_8_0;
          }
          if (3 == param0) {
            stackIn_12_0 = re.a(fa.field_Y, 4371, new String[]{param2});
            return stackIn_12_0;
          }
          if (4 == param0) {
            stackIn_15_0 = re.a(vn.field_p, 4371, new String[]{param2});
            return stackIn_15_0;
          }
          if (param0 == 5) {
            stackIn_18_0 = re.a(eh.field_N, 4371, new String[]{param2});
            return stackIn_18_0;
          }
          if (6 == param0) {
            stackIn_22_0 = re.a(lh.field_E, 4371, new String[]{param2});
            return stackIn_22_0;
          }
          if (7 == param0) {
            stackIn_26_0 = re.a(kq.field_i, 4371, new String[]{param2});
            return stackIn_26_0;
          }
          if (param0 == 8) {
            stackIn_30_0 = re.a(cq.field_F, 4371, new String[]{param2});
            return stackIn_30_0;
          }
          if (11 == param0) {
            stackIn_34_0 = re.a(s.field_b, 4371, new String[]{param2});
            return stackIn_34_0;
          }
          if (param0 == 12) {
            stackIn_38_0 = re.a(ja.field_l, 4371, new String[]{param2});
            return stackIn_38_0;
          }
          if (param0 != 13) {
            return null;
          }
          stackIn_42_0 = re.a(sa.field_c, 4371, new String[]{param2});
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("lc.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 > -63) {
          String var2 = (String) null;
          lc.a(-68, (byte) 83, (String) null);
          if (js.field_j == -aj.field_c + 0) {
            js.field_j = js.field_j + 1;
            return;
          }
          if (250 - aj.field_c != js.field_j) {
            js.field_j = js.field_j + 1;
            return;
          }
          js.field_j = js.field_j + 1;
          return;
        }
        if (js.field_j == -aj.field_c + 0) {
          js.field_j = js.field_j + 1;
          return;
        }
        if (250 - aj.field_c != js.field_j) {
          js.field_j = js.field_j + 1;
          return;
        }
        js.field_j = js.field_j + 1;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = (String) null;
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    abstract ci a(int param0);

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, byte param1);

    static {
        field_d = "Click to hide the Fleet Info window.";
        field_b = new gq(11, 0, 1, 2);
        field_c = 0;
        field_a = "Kick";
    }
}
