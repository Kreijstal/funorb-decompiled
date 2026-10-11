/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    private boolean field_c;
    private boolean field_a;
    static mr field_b;

    final void a(byte param0) {
        this.field_a = true;
        int var2 = -27 / ((55 - param0) / 56);
    }

    final boolean b(int param0) {
        if (param0 != -59) {
          this.b(-10);
        }
        return this.field_c;
    }

    public static void d(int param0) {
        if (param0 != 32) {
          return;
        }
        field_b = null;
    }

    final void c(int param0) {
        this.field_a = true;
        if (param0 > -18) {
          return;
        }
        this.field_c = true;
    }

    final static ha a(java.awt.Canvas param0, d param1, int param2, byte param3) {
        RuntimeException var4 = null;
        ha stackIn_2_0 = null;
        cka stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < -76) {
            stackIn_4_0 = new cka(param0, param1, param2);
            return (ha) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (ha) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("on.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 != 86) {
          return;
        }
        if (!this.field_a) {
          this.field_c = false;
        }
        this.field_a = false;
    }

    final void b(byte param0) {
        this.field_a = false;
        this.field_c = false;
        if (param0 != 93) {
          this.field_a = true;
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        d var6 = null;
        String stackIn_3_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = mpa.a(-73, param2, param0);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param1 > -37) {
            var6 = (d) null;
            on.a((java.awt.Canvas) null, (d) null, 122, (byte) 69);
          }
          for (var4 = 0; var4 < param0.length(); var4++) {
            if (!fqa.a(false, param0.charAt(var4))) {
              stackIn_12_0 = jra.field_b;
              return stackIn_12_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("on.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1) {
        boolean stackIn_26_0 = false;
        if (param0 != 15) {
          on.d(119);
        }
        boolean decompiledFrameRemainder0 = true;
        if (!oj.field_tb[82] &&
          !oj.field_tb[86] && (param1 >= 16 &&
          27 >= param1 ||
          param1 >= 32 &&
          param1 <= 43 ||
          param1 >= 48 &&
          param1 <= 58 ||
          64 <= param1 &&
          73 >= param1 ||
          (param1 == 80 ||
          param1 == 83 ||
          param1 == 84 ||
          param1 == 85 ||
          param1 == 59 ||
          param1 == 74 ||
          param1 == 28))) {
          stackIn_26_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_26_0 = false;
        }
        return stackIn_26_0;
    }

    static {
    }
}
