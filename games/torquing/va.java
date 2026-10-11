/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va extends lg {
    int field_D;
    int field_E;
    static bp field_H;
    int field_G;
    int field_C;
    int field_I;
    int field_F;

    final static boolean b(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() >= fa.field_d) {
            if (param0.length() > jp.field_i) {
              return true;
            }
            if (param1 != 25326) {
              field_H = (bp) null;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("va.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(h param0, byte param1, int param2) {
        df var3 = null;
        try {
          var3 = wa.field_d;
          var3.f(-58, param2);
          var3.b(90, 2);
          if (param1 <= 117) {
            Random var4 = (Random) null;
            va.a(82, (byte) 63, (Random) null);
          }
          var3.b(90, 0);
          var3.b(90, param0.field_m);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "va.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_H = null;
        if (param0) {
          return;
        }
        field_H = (bp) null;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21369) {
            field_H = (bp) null;
          }
          stackIn_3_0 = jn.a(param1, (byte) 100, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("va.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        CharSequence var13 = null;
        var12 = Torquing.field_u;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, (byte) 73)) {
            if (param6 > 5) {
              return false;
            }
            var13 = (CharSequence) null;
            va.a(56, (CharSequence) null);
            return false;
          }
          var8_int = param4 - this.field_G - (param1 + this.field_w);
          var9 = -this.field_k + (-param2 - this.field_F + param3);
          if (this.field_C * this.field_C > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - wa.field_e;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_E;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_E;
              }
            }
            this.field_D = (int)(var10 * (double)this.field_E / 6.283185307179586);
            while (this.field_E <= this.field_D) {
              this.field_D = this.field_D - this.field_E;
            }
            while (this.field_D < 0) {
              this.field_D = this.field_D + this.field_E;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("va.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    final static wc a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        wc var9 = null;
        RuntimeException var9_ref = null;
        wc stackIn_2_0 = null;
        wc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new wc(param3, param8, param2, param4, param6, param1, param7);
          so.field_t.a((byte) 54, var9);
          bp.a(var9, 1, param5);
          if (param0) {
            stackIn_4_0 = var9;
            return stackIn_4_0;
          }
          stackIn_2_0 = (wc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = var9_ref;
          stackIn_7_1 = new StringBuilder().append("va.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param8).append(')').toString());
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        h var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (uk.a(false, param0)) {
            stackIn_5_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 32);
            return stackIn_5_0;
          }
          if (param1 < 119) {
            var5 = (h) null;
            va.a((h) null, (byte) -75, 70);
          }
          var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_12_0 = b.e(param0, var4, -25034);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("va.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_H = new bp();
    }
}
