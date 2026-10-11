/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends mf {
    static mi field_j;
    static String field_k;
    private ul field_l;
    static double field_m;
    static double field_i;
    private ul field_h;

    gl(ul param0, ul param1, ul param2) {
        super(param0);
        try {
          this.field_h = param1;
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 >= -1) {
          return;
        }
        field_j = null;
    }

    final fi a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        fi stackIn_4_0 = null;
        fi stackIn_8_0 = null;
        fi stackIn_11_0 = null;
        fi stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.field_B.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 > -44) {
            field_i = 1.1993332607782194;
          }
          if (var4.length() == 0) {
            stackIn_4_0 = fb.field_e;
            return stackIn_4_0;
          }
          if (!wd.a(0, var3, var4)) {
            stackIn_8_0 = fb.field_e;
            return stackIn_8_0;
          }
          if (!this.a(param1, (byte) -69)) {
            stackIn_13_0 = nn.field_q;
            return stackIn_13_0;
          }
          stackIn_11_0 = fb.field_e;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("gl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.field_B.toLowerCase();
          var4 = param0.toLowerCase();
          var5 = -119 % ((30 - param1) / 41);
          if (0 < var3.length()) {
            if (0 >= var4.length()) {
              return false;
            }
            var6 = var3.lastIndexOf("@");
            if (0 <= var6 &&
              -1 + var3.length() > var6) {
              var7 = var3.substring(0, var6);
              var8 = var3.substring(var6 + 1);
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
              if (var4.indexOf(var8) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("gl.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_h.field_B.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (ef.a(101, var5)) {
            stackIn_6_0 = vm.field_bb;
            return stackIn_6_0;
          }
          if (lc.a(param1, var5)) {
            stackIn_10_0 = oe.field_T;
            return stackIn_10_0;
          }
          if (wc.a(var5, -81)) {
            stackIn_13_0 = mk.field_m;
            return stackIn_13_0;
          }
          if (this.a(param0, (byte) 124)) {
            stackIn_17_0 = mg.field_f;
            return stackIn_17_0;
          }
          if (var6.length() <= 0) {
            stackIn_20_0 = si.field_f;
            return stackIn_20_0;
          }
          if (nm.a(var6, (byte) 96, var5)) {
            stackIn_24_0 = fg.field_pb;
            return stackIn_24_0;
          }
          if (qd.a(var6, var5, false)) {
            stackIn_28_0 = wh.field_eb;
            return stackIn_28_0;
          }
          if (!ig.a(var6, 0, var5)) {
            return vm.field_bb;
          }
          stackIn_32_0 = fg.field_pb;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("gl.A(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = 0.0;
    }
}
