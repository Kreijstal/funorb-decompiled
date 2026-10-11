/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_c;
    static boolean field_d;
    static cc field_a;
    private kc[] field_b;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        uk.a(this.field_b, (byte) -104, param2, param1, param4, param3);
        if (param0 > -69) {
          vk var7 = (vk) null;
          vg.a((vk) null, 11);
        }
    }

    vg(kc[] param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -72) {
          return;
        }
        field_c = null;
    }

    final static void a(vk param0, int param1) {
        int var2_int = 0;
        vk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Main.field_T;
        try {
          if (null == param0.field_i) {
            return;
          }
          if (~param0.field_c != param1 ||
            param0.field_h != 0) {
            for (var2_int = 0; jh.field_c > var2_int; var2_int++) {
              var3 = me.field_b[var2_int];
              if (var3.field_k == 2 &&
                param0.field_c == var3.field_c &&
                var3.field_h == param0.field_h) {
                return;
              }
            }
          }
          if (null != param0.field_a) {
          }
          lh.a(7743, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("vg.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = true;
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new cc();
    }
}
