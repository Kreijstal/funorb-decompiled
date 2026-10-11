/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ie {
    static tn field_I;

    private ne(int param0, int param1, int param2, int param3, eb param4, fn param5, ng param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_H = param6;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        bn var7 = null;
        bn var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var8 = qf.field_a;
          var7 = var8;
          if (var8 != null) {
            if (!this.a(param3 ^ 96, param1, param4, param0, param5)) {
              return;
            }
            if (this.field_n instanceof s) {
              ((s) (this.field_n)).a(116, var8, this);
              qf.field_a = null;
              return;
            }
            if (var8.field_n instanceof s) {
              ((s) (var8.field_n)).a(param3 ^ -106, var8, this);
              qf.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("ne.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 != -1879863704) {
          field_I = (tn) null;
        }
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return param1 + 1;
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var3 = lg.a(11, param1, param2);
          if (param0 < 56) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < param2.length(); var4++) {
            if (!oh.a(param2.charAt(var4), -112)) {
              stackIn_13_0 = nj.field_g;
              return stackIn_13_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ne.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_I = null;
    }
}
