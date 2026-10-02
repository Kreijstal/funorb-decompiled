/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends q {
    private String field_j;
    static wg field_n;
    static int field_l;
    private boolean field_i;
    private n field_m;
    static int[] field_k;

    mk(dj param0, dj param1) {
        super(param0);
        this.field_j = "";
        this.field_i = false;
        try {
            this.field_m = new n(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= 0) {
            mk.a(83, true);
            ih.field_c.a((byte) -110, param1);
            return;
        }
        ih.field_c.a((byte) -110, param1);
    }

    final lh a(int param0, String param1) {
        h var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_8_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a(param0, param1) == si.field_m) {
            stackIn_2_0 = si.field_m;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_j)) {
            var3 = ci.a(-1, param1);
            if (!var3.a(-76)) {
              stackIn_8_0 = si.field_n;
              return stackIn_8_0;
            }
            this.field_j = param1;
            this.field_i = var3.a((byte) -52);
          }
          if (!this.field_i) {
            stackIn_13_0 = si.field_m;
          } else {
            stackIn_13_0 = kk.field_w;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3_ref);
          stackIn_16_1 = new StringBuilder().append("mk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 422) {
            mk.c((byte) -50);
          }
          if (this.field_m.a(-257, param1) == si.field_m) {
            stackIn_5_0 = this.field_m.b(422, param1);
            return stackIn_5_0;
          }
          if (this.a(-257, param1) != si.field_m) {
            return da.field_e;
          }
          stackIn_9_0 = g.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);
          stackIn_12_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 != -9) {
            field_k = (int[]) null;
        }
    }

    final static jg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cd var4 = null;
        cd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 111 % ((param0 - 9) / 38);
          var4 = new cd();
          ((jg) ((Object) var4)).field_b = param2;
          ((jg) ((Object) var4)).field_e = param1;
          stackIn_1_0 = (cd) (var4);
          return (jg) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var3);
          stackIn_4_1 = new StringBuilder().append("mk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = new int[]{16407324, 16429852, 11199532, 9487646, 15149096};
    }
}
