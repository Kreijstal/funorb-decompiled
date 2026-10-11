/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends ff {
    private String field_d;
    static int field_h;
    static bk field_e;
    private String field_f;
    static long field_c;
    static de field_g;

    public static void c(byte param0) {
        field_e = null;
        if (param0 < 123) {
          return;
        }
        field_g = null;
    }

    final void a(int param0, pb param1) {
        try {
          if (param0 != -1) {
            field_e = (bk) null;
          }
          param1.a(744825352, this.field_f);
          param1.b(this.field_d, 15045);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        if (param0 != 22) {
          return;
        }
        if (null != wd.field_e) {
          wd.field_e.c();
        }
        if (null != cb.field_g) {
          cb.field_g.c();
        }
    }

    final fe a(byte param0) {
        if (param0 != -24) {
          this.field_d = (String) null;
        }
        return tf.field_o;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        try {
          if (param1 == null) {
            stackIn_3_0 = ke.field_b;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (1 <= var3_int &&
            12 >= var3_int) {
            var4 = ff.a((byte) 116, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!tg.a((byte) -63, var4.charAt(0)) &&
                !tg.a((byte) -63, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                if (param0) {
                  jl.c((byte) 94);
                }
                for (var6 = 0; var6 < param1.length(); var6++) {
                  var7 = param1.charAt(var6);
                  if (!tg.a((byte) -63, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (2 <= var5 &&
                    !param2) {
                    stackIn_30_0 = g.field_B;
                    return stackIn_30_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_35_0 = kl.field_P;
                return stackIn_35_0;
              }
              stackIn_18_0 = kl.field_P;
              return stackIn_18_0;
            }
            stackIn_13_0 = ke.field_b;
            return stackIn_13_0;
          }
          stackIn_8_0 = ke.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("jl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    jl(String param0, String param1) {
        try {
          this.field_d = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 20971555;
        field_g = new de(15, 0, 1, 0);
    }
}
