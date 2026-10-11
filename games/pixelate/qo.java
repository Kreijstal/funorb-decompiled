/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends mg {
    static fm field_u;
    private c field_p;
    static ak field_q;
    static int field_o;
    static int field_s;
    static String field_m;
    static boolean field_z;
    static ii field_r;
    static String[] field_t;
    static tf field_v;
    static int field_A;
    static ge field_n;
    static int[] field_w;
    static String field_x;
    static java.security.SecureRandom field_y;

    final static String e(int param0) {
        if (param0 != 480) {
          qo.b(false);
          return vi.field_o.h(5);
        }
        return vi.field_o.h(5);
    }

    final String a(int param0, String param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -76) {
            var4 = (String) null;
            this.a(-37, (String) null);
          }
          if (this.field_p instanceof bp) {
            var3 = ((bp) ((Object) this.field_p)).a(1);
            if (var3 != null) {
              if (var3.a((byte) 68) == qk.field_g &&
                !param1.equals(this.field_p.field_q)) {
                stackIn_7_0 = sk.field_d;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.b((byte) -7);
              return stackIn_9_0;
            }
          }
          if (param1.equals(this.field_p.field_q)) {
            return null;
          }
          stackIn_13_0 = sk.field_d;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("qo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_t = null;
        field_y = null;
        field_v = null;
        field_q = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_w = null;
        if (param0) {
          field_m = null;
          field_r = null;
          return;
        }
    }

    qo(c param0, c param1) {
        super(param0);
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final dj a(String param0, boolean param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        dj stackIn_2_0 = null;
        dj stackIn_9_0 = null;
        dj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (dj) null;
            return stackIn_2_0;
          }
          if (this.field_p instanceof bp) {
            var3 = ((bp) ((Object) this.field_p)).a(1);
            if (var3 != null &&
              var3.a((byte) 69) != qk.field_g) {
              stackIn_9_0 = sk.field_a;
              return stackIn_9_0;
            }
          }
          if (param0.equals(this.field_p.field_q)) {
            stackIn_13_0 = qk.field_g;
          } else {
            stackIn_13_0 = sk.field_a;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qo.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Report abuse";
        field_A = 3;
        field_t = new String[]{"The darker squares around the edge of the grid are called the <col=ffff00>buffer zone</col>. They do not count as part of the picture.", "Use them to place awkward pieces half-on, half-off the grid."};
        field_w = new int[8192];
        field_o = 480;
        field_z = true;
        field_x = "Find opponents";
    }
}
