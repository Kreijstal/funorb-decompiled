/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends mc {
    static boolean field_w;
    static rj field_y;
    static ah field_p;
    static je field_u;
    static String field_t;
    int field_s;
    int field_C;
    int field_z;
    static String field_A;
    static int[] field_q;
    static wf field_x;
    static boolean field_r;
    static a field_v;
    static String field_n;
    static String field_o;
    static ri field_B;

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -95) {
            return;
          }
          mn.a((java.awt.Component) ((Object) param1), true);
          vb.a(-51, (java.awt.Component) ((Object) param1));
          if (null == qf.field_k) {
            return;
          }
          qf.field_k.a(0, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("oa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0, double param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == 1.0) {
          return param0;
        }
        if (param2 == 45) {
          var4 = param0 >> 16;
          var5 = (param0 & 65416) >> 8;
          var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
          var6 = param0 & 255;
          var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
          var6 = (int)(256.0 * Math.pow((double)var6 / 256.0, param1));
          return (var4 << 16) + ((var5 << 8) + var6);
        }
        oa.a(-17);
        var4Lifetime1 = param0 >> 16;
        var5Lifetime1 = (param0 & 65416) >> 8;
        var4Lifetime1 = (int)(Math.pow((double)var4Lifetime1 / 256.0, param1) * 256.0);
        var6Lifetime1 = param0 & 255;
        var5Lifetime1 = (int)(Math.pow((double)var5Lifetime1 / 256.0, param1) * 256.0);
        var6Lifetime1 = (int)(256.0 * Math.pow((double)var6Lifetime1 / 256.0, param1));
        return (var4Lifetime1 << 16) + ((var5Lifetime1 << 8) + var6Lifetime1);
    }

    public static void a(int param0) {
        field_q = null;
        field_v = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_p = null;
        field_A = null;
        if (param0 == -25731) {
          field_y = null;
          field_B = null;
          field_o = null;
          field_t = null;
          return;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 65416) {
            return false;
          }
          if (fd.field_J == null) {
            return false;
          }
          stackIn_10_0 = !(param0.toLowerCase().indexOf(fd.field_J.toLowerCase()) < 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("oa.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 == 13309) {
          var3 = -1 + param2 & param0 >> 31;
          return var3 + ((param0 >>> 31) + param0) % param2;
        }
        return 105;
    }

    static {
        field_t = "Connection restored.";
        field_u = new je();
        field_A = "Open";
        field_n = "Login: ";
        field_r = true;
        field_o = "Join <%0>'s game";
        field_q = new int[8192];
        field_v = new a();
    }
}
