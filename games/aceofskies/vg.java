/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vg extends pp {
    private int field_i;
    private boolean field_m;
    private int field_k;
    private int field_g;
    static ei field_h;
    private String field_l;
    private int field_d;
    private int field_c;
    private BitmapFont field_f;
    static Hashtable field_j;
    static int[] field_e;

    final void a(int param0, BitmapFont param1, int param2, String param3, int param4) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (param3 == null) {
            this.field_b = null;
            return;
          }
          if (this.field_f == param1 &&
            this.field_m &&
            this.field_d == 1 &&
            null != this.field_l &&
            this.field_l.equals(param3)) {
            return;
          }
          this.field_d = 1;
          if (param0 < 1) {
            String var8 = (String) null;
            this.a(-95, (BitmapFont) null, -118, (String) null, -117);
          }
          this.field_f = param1;
          this.field_m = true;
          co var9 = this.a(param4, 77, param1, param3);
          int var7 = param1.measureTextWidth(param3);
          var9.field_h[0] = param2 - (var7 >> 1);
          var9.field_h[param3.length()] = (var7 >> 1) + param2;
          ng.a(param1, param3, var9, 0, (byte) 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var6;
          StringBuilder stackIn_16_1 = new StringBuilder().append("vg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2, int param3, BitmapFont param4) {
        if (param1 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_f == param4 &&
          this.field_m &&
          this.field_d == 2 &&
          null != this.field_l &&
          this.field_l.equals(param1)) {
          return;
        }
        try {
          this.field_d = 2;
          this.field_m = true;
          this.field_l = param1;
          if (param0 != 2137) {
            field_j = (Hashtable) null;
          }
          this.field_f = param4;
          co var8 = this.a(param3, 43, param4, param1);
          co var9 = var8;
          var9.field_h[0] = -param4.measureTextWidth(param1) + param2;
          var9.field_h[param1.length()] = param2;
          ng.a(param4, param1, var9, 0, (byte) 30);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2, BitmapFont param3, byte param4) {
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (param3 == this.field_f &&
          this.field_m &&
          this.field_d == 0 &&
          null != this.field_l &&
          this.field_l.equals(param0)) {
          return;
        }
        try {
          this.field_d = 0;
          this.field_f = param3;
          this.field_m = true;
          this.field_l = param0;
          co var8 = this.a(param2, -128, param3, param0);
          co var9 = var8;
          var8.field_h[0] = param1;
          var9.field_h[param0.length()] = param3.measureTextWidth(param0) + param1;
          if (param4 >= -45) {
            BitmapFont var7 = (BitmapFont) null;
            this.a(-111, (String) null, -109, -118, (BitmapFont) null);
          }
          ng.a(param3, param0, var9, 0, (byte) 30);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final co a(int param0, int param1, BitmapFont param2, String param3) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          int var5_int = -90 / ((-38 - param1) / 52);
          co var6 = new co(param0 - param2.maxAscent, param2.maxDescent + param0, param3.length());
          this.field_b = new co[]{var6};
          co stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var5;
          StringBuilder stackIn_4_1 = new StringBuilder().append("vg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(String param0, BitmapFont param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_39_4 = 0;
        int stackIn_44_3;
        String stackIn_50_2 = null;
        String stackIn_53_2 = null;
        int var11 = 0;
        int var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param7 == 0) {
            param7 = param1.lineAdvance;
          }
          if (param0 == null) {
            this.field_b = null;
            return;
          }
          if (param1 == this.field_f &&
            !this.field_m &&
            this.field_d == param6 &&
            param2 == this.field_g &&
            this.field_c == param7 &&
            param5 == this.field_k &&
            param4 == this.field_i &&
            this.field_l != null &&
            this.field_l.equals(param0)) {
            return;
          }
          this.field_g = param2;
          this.field_d = param6;
          this.field_k = param5;
          this.field_f = param1;
          this.field_c = param7;
          if (param3 != 127395681) {
            field_h = (ei) null;
          }
          this.field_m = false;
          this.field_l = param0;
          this.field_i = param4;
          String[] var16 = new String[1 + param1.countWrappedLines(param0, param4)];
          String[] var17 = var16;
          int var10 = Math.max(1, param1.wrapText(param0, new int[]{param4}, var17));
          if (this.field_g == 3 &&
            var10 == 1) {
            this.field_g = 1;
          }
          this.field_b = new co[var10];
          if (0 == this.field_g) {
            var11 = param1.maxAscent;
          } else if (this.field_g == 1) {
            var11 = param1.maxAscent + (this.field_k - this.field_c * var10 >> 1);
          } else if (this.field_g == 2) {
            var11 = -(this.field_c * var10) + (-param1.maxDescent + this.field_k);
          } else {
            int var12 = (this.field_k - this.field_c * var10) / (var10 + 1);
            if (var12 < 0) {
              var12 = 0;
            }
            this.field_c = this.field_c + var12;
            var11 = param1.maxAscent + var12;
          }
          for (int var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            String var13 = var16[var12Lifetime1];
            co stackIn_38_0 = null;
            co stackIn_38_1 = null;
            int stackIn_38_2 = -param1.maxAscent + var11;
            int stackIn_38_3 = param1.maxDescent + var11;
            if (var13 == null) {
              stackIn_39_4 = 0;
            } else {
              co stackIn_39_0 = null;
              co stackIn_39_1 = null;
              stackIn_39_4 = var13.length();
            }
            co var14 = new co(stackIn_38_2, stackIn_38_3, stackIn_39_4);
            var14.field_h[0] = 0;
            if (var13 != null) {
              var14.field_h[var13.length()] = param1.measureTextWidth(var13);
              BitmapFont stackIn_43_0 = (BitmapFont) (param1);
              String stackIn_43_1 = var13;
              co stackIn_43_2 = var14;
              if (param6 != 3) {
                stackIn_44_3 = 0;
              } else {
                stackIn_44_3 = this.a(param4, -1, var13, param1.measureTextWidth(var13));
              }
              ng.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_44_3, (byte) 30);
            }
            var11 = var11 + param7;
            this.field_b[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_49_0 = var9;
          StringBuilder stackIn_49_1 = new StringBuilder().append("vg.F(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          StringBuilder stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 0) {
          vg.b(-51);
        }
        field_h = null;
        field_e = null;
    }

    public vg() {
    }

    static {
        field_h = new ei();
        field_j = new Hashtable();
        field_e = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
          int var0 = var1;
          for (int var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_e[var1] = var0;
        }
    }
}
