/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends ek {
    static int field_M;
    static int field_N;
    static String[] field_K;
    static String field_L;

    dl(String param0, kg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_H = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private dl(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
        try {
          this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1, ck param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (param2 != tc.field_Tb) {
            if (param2 != null) {
              param2.e(0, param3, param4);
            } else {
              hk.a(0, 0, 640, 480, 0);
            }
          } else {
            lj.a(param4, param3, 0, true);
          }
          if (param1) {
            fj.a(0, param4, -26, param3);
          }
          if (param0 >= 40) {
            return;
          }
          field_L = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dl.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_K = null;
        field_L = null;
    }

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ck var4 = null;
        cl var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          var5 = (cl) (oe.field_I.c((byte) 113));
          while (var5 != null) {
            fh.a((byte) 104, var5, param1);
            var5 = (cl) (oe.field_I.d(true));
          }
          if (param0 == 640) {
            return;
          }
          var4 = (ck) null;
          dl.a((byte) 62, true, (ck) null, -96, 15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "dl.L(" + param0 + ',' + param1 + ')');
        }
    }

    private dl(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        try {
          this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_H = !this.field_H ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static boolean a(int param0) {
        if (param0 != 480) {
          return true;
        }
        return 250 < gd.field_e ? true : false;
    }

    static {
        field_M = 20;
        field_L = "Stage <%0>";
        field_N = -1;
    }
}
