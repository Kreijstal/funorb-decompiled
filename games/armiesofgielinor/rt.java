/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends oj {
    static String field_B;
    private int field_y;
    static int field_D;
    private int field_C;
    static long field_z;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true) | this.a(this.field_C, 15, param2, param0, this.field_y);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("rt.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          for (var5 = param1; var4 > var5; var5++) {
            if (param2 == param0.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rt.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = -56 / ((param0 - 53) / 51);
        return null;
    }

    public static void e(byte param0) {
        if (param0 < 78) {
          rt.g(98);
          field_B = null;
          return;
        }
        field_B = null;
    }

    final static boolean a(boolean param0, Class param1) {
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_12_0 = (Integer.TYPE == param1) || (Short.TYPE == param1) || (param1 == Long.TYPE) || (Byte.TYPE == param1) || (Float.TYPE == param1) || (param1 == Double.TYPE);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("rt.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 <= 102) {
            rt.e((byte) -63);
          }
          if (kr.field_y[0] == null) {
            return;
          }
          if (2 >= kr.field_y[0].length) {
            return;
          }
          var1_int = 0;
          while (true) {
            if (kr.field_y[0].length <= var1_int) {
              return;
            }
            if (kr.field_y[0][var1_int] != 25) {
              var1_int++;
              continue;
            }
            break;
          }
          kr.field_y[0][var1_int] = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "rt.S(" + param0 + ')');
        }
    }

    final static int g(int param0) {
        if (param0 != 0) {
          return 45;
        }
        return wr.field_L;
    }

    final void a(ha param0, int param1) {
        try {
          param0.field_Eb[param0.field_v * this.field_w.field_w + this.field_w.field_J].field_c = null;
          param0.field_Eb[param0.field_v * this.field_C + this.field_y].field_c = this.field_w;
          param0.field_Eb[param0.field_v * this.field_C + this.field_y].field_l = false;
          this.field_w.field_w = this.field_C;
          this.field_w.field_I = false;
          if (param1 != -26661) {
            rt.e((byte) -101);
          }
          this.field_w.field_Y = this.field_w.field_t;
          this.field_w.field_J = this.field_y;
          this.field_w.field_ab = 0;
          this.field_w.a((byte) -96);
          this.field_w.field_S = false;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "rt.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_B = (String) null;
          }
          ep.a(!param0, param1, param2);
          if (null == ad.field_I) {
            return;
          }
          op.a(-110, ad.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rt.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    rt(jd param0, int param1, int param2) {
        try {
          this.field_w = param0;
          this.field_m = 25;
          this.field_C = param2;
          this.field_y = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "rt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_B = "Elapsed time";
    }
}
