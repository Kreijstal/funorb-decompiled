/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends al {
    static tg[] field_j;
    static int[] field_n;
    private ba field_k;
    static String field_m;
    static String field_l;

    bd(ba param0, ba param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vf b(String param0, byte param1) {
        uh var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vf stackIn_8_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            var4 = (String) null;
            this.a((String) null, (byte) 8);
          }
          if (this.field_k instanceof wc) {
            var3 = ((wc) ((Object) this.field_k)).a(true);
            if (var3 != null &&
              var3.a((byte) 123) != mc.field_a) {
              stackIn_8_0 = a.field_e;
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_k.field_h)) {
            stackIn_12_0 = a.field_e;
          } else {
            stackIn_12_0 = mc.field_a;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("bd.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_l = null;
        field_m = null;
        field_n = null;
        int var1 = 117 / ((66 - param0) / 51);
        field_j = null;
    }

    final String a(String param0, byte param1) {
        uh var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof wc) {
            var3 = ((wc) ((Object) this.field_k)).a(true);
            if (var3 != null) {
              if (var3.a((byte) 125) == mc.field_a &&
                !param0.equals(this.field_k.field_h)) {
                stackIn_7_0 = mf.field_c;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.c((byte) 66);
              return stackIn_9_0;
            }
          }
          if (param1 != -114) {
            field_j = (tg[]) null;
          }
          if (param0.equals(this.field_k.field_h)) {
            return null;
          }
          stackIn_15_0 = mf.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("bd.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "This password contains your email address, and would be easy to guess";
        field_n = new int[8192];
    }
}
