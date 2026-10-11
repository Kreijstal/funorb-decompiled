/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uv extends gm {
    private ne[] field_p;
    static int[] field_o;
    static long field_n;

    final static int b(int param0) {
        if (param0 != -25843) {
          jn var2 = (jn) null;
          uv.a(-92, -128, -112, -123, (jn) null, -24);
          return -hu.field_b + dj.field_n;
        }
        return -hu.field_b + dj.field_n;
    }

    uv(ne[] param0) {
        try {
          this.field_e = kw.field_b;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, jn param4, int param5) {
        float[] dupTemp$2 = null;
        int var6_int = 0;
        float[] var7 = null;
        vt var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        float[] var7Lifetime1;
        vt var8Lifetime1;
        float[] var7Lifetime2;
        float[] var7Lifetime1Lifetime1;
        int var6_intLifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = 0;
          if (param2 != -9) {
            return;
          }
          while (8 > var6_int) {
            var7 = new float[]{0.0f, (float)(-(fi.a(param5, he.field_o, (byte) -96) + 1))};
            var13 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6_int) * 0.017453292519943295));
            var12 = var13;
            var10 = var12;
            var7Lifetime2 = var10;
            var8 = new vt(24, param3, param1, param0, (int)var13[0] << 8, (int)var13[1] << 8, 0);
            param4.a((ms) (var8), (byte) 39);
            var6_int++;
          }
          for (var6_intLifetime1 = 0; var6_intLifetime1 < 8; var6_intLifetime1++) {
            var7Lifetime1 = new float[]{0.0f, (float)(-(1 + fi.a(param5, he.field_o, (byte) -96)))};
            dupTemp$2 = kt.a((byte) -92, var7Lifetime1, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6_intLifetime1)));
            var11 = dupTemp$2;
            var7Lifetime1Lifetime1 = dupTemp$2;
            var8Lifetime1 = new vt(24, param3, param1, param0, (int)var11[0] << 8, (int)var11[1] << 8, 1);
            param4.a((ms) (var8Lifetime1), (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          lk.b(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, 10197915);
          if (param3) {
            stackIn_6_0 = (((wp) (param0)).field_C) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (param2 != 5592405) {
            uv.b(124);
          }
          if (param3) {
            stackIn_14_0 = (param0.d(-1)) ? 1 : 0;
          } else {
            stackIn_14_0 = 0;
          }
          var7 = stackIn_14_0;
          var8 = 0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          stackIn_19_0 = (var6_int != 0) ? 2394342 : 16777215;
          var9 = stackIn_19_0;
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_p[var8];
          var11 = param4 - (-param0.field_r - (param0.field_q - var10.field_e) / 2);
          var12 = (param0.field_p - var10.field_a) / 2 + (param0.field_v + param1);
          var13 = param0.field_q / 2 + (param4 + param0.field_r);
          var10.a(var11, var12);
          this.field_e.a(this.a(true, param0), var13, param1, var9, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("uv.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -31) {
          field_n = -34L;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, byte param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param3 > -78) {
              field_n = 102L;
            }
            var7 = param1.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param0) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param0 + var9;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("uv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
