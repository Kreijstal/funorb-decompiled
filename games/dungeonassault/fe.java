/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends l {
    private boolean field_q;
    private String field_l;
    private int field_j;
    static md field_k;
    private int field_m;
    private int field_p;
    private int field_h;
    private se field_i;
    static int[] field_g;
    static String[] field_n;
    private int field_o;

    final void a(int param0, byte param1, String param2, se param3, int param4) {
        tg var7 = null;
        if (param2 == null) {
          this.field_e = null;
          return;
        }
        int var6_int = -118 / ((29 - param1) / 50);
        if (param3 == this.field_i && this.field_q && 2 == this.field_h && this.field_l != null &&
          this.field_l.equals(param2)) {
          return;
        }
        try {
          this.field_l = param2;
          this.field_q = true;
          this.field_i = param3;
          this.field_h = 2;
          var7 = this.a(param2, param4, param3, 0);
          var7.field_k[0] = param0 - param3.b(param2);
          var7.field_k[param2.length()] = param0;
          bf.a(param2, var7, 0, param3, 15553);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fe.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, se param2, int param3, int param4) {
        tg var7 = null;
        tg var8 = null;
        if (param0 == null) {
          this.field_e = null;
          return;
        }
        if (param2 == this.field_i && this.field_q && this.field_h == 0 && this.field_l != null &&
          this.field_l.equals(param0)) {
          return;
        }
        this.field_h = 0;
        this.field_i = param2;
        this.field_q = true;
        this.field_l = param0;
        if (param1 > -17) {
          return;
        }
        try {
          var7 = this.a(param0, param4, param2, 0);
          var8 = var7;
          var7.field_k[0] = param3;
          var8.field_k[param0.length()] = param3 + param2.b(param0);
          bf.a(param0, var8, 0, param2, 15553);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fe.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -33) {
          fe.b((byte) -23);
        }
        field_n = null;
        field_g = null;
        field_k = null;
    }

    private final tg a(String param0, int param1, se param2, int param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        tg var6 = null;
        tg stackIn_2_0 = null;
        tg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            stackIn_2_0 = (tg) null;
            return stackIn_2_0;
          }
          var6 = new tg(param1 - param2.field_H, param2.field_E + param1, param0.length());
          var5 = var6;
          this.field_e = new tg[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("fe.R(");
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
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, String param1, se param2, byte param3, int param4) {
        tg var9 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_e = null;
          return;
        }
        if (param2 == this.field_i &&
          this.field_q &&
          this.field_h == 1 &&
          null != this.field_l &&
          this.field_l.equals(param1)) {
          return;
        }
        try {
          this.field_h = 1;
          this.field_q = true;
          this.field_i = param2;
          int var8 = -121 % ((34 - param3) / 47);
          var9 = this.a(param1, param0, param2, 0);
          var7 = param2.b(param1);
          var9.field_k[0] = param4 - (var7 >> 1);
          var9.field_k[param1.length()] = param4 + (var7 >> 1);
          bf.a(param1, var9, 0, param2, 15553);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fe.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, se param7) {
        tg stackIn_35_0;
        tg stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        tg stackIn_36_0 = null;
        tg stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        String stackIn_40_0 = null;
        tg stackIn_40_1 = null;
        int stackIn_41_2 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        tg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = DungeonAssault.field_K;
        try {
          if (0 == param6) {
            param6 = param7.field_R;
          }
          if (param0 == null) {
            this.field_e = null;
            return;
          }
          if (param7 == this.field_i &&
            !this.field_q &&
            param4 == this.field_h &&
            this.field_p == param2 &&
            this.field_o == param6 &&
            param3 == this.field_m &&
            this.field_j == param5 &&
            null != this.field_l &&
            this.field_l.equals(param0)) {
            return;
          }
          this.field_p = param2;
          this.field_h = param4;
          this.field_q = false;
          this.field_m = param3;
          this.field_j = param5;
          this.field_o = param6;
          this.field_l = param0;
          this.field_i = param7;
          var16 = new String[param7.c(param0, param5) + 1];
          var17 = var16;
          var10 = Math.max(1, param7.a(param0, new int[]{param5}, var17));
          if (this.field_p == 3 &&
            var10 == 1) {
            this.field_p = 1;
          }
          if (this.field_p == param1) {
            var11 = param7.field_H;
          } else {
            if (this.field_p == 1) {
              var11 = (-(this.field_o * var10) + this.field_m >> 1) + param7.field_H;
            } else {
              if (this.field_p != 2) {
                var12 = (this.field_m - this.field_o * var10) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_o = this.field_o + var12;
                var11 = param7.field_H + var12;
              } else {
                var11 = -param7.field_E + this.field_m - var10 * this.field_o;
              }
            }
          }
          this.field_e = new tg[var10];
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param7.field_H + var11;
            stackIn_35_3 = var11 + param7.field_E;
            if (var13 == null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            }
            var14 = new tg(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.field_k[0] = 0;
            if (var13 != null) {
              var14.field_k[var13.length()] = param7.b(var13);
              stackIn_40_0 = var13;
              stackIn_40_1 = var14;
              if (3 != param4) {
                stackIn_41_2 = 0;
              } else {
                stackIn_41_2 = this.a(var13, param1 + 0, param7.b(var13), param5);
              }
              bf.a(stackIn_40_0, stackIn_40_1, stackIn_41_2, param7, 15553);
            }
            var11 = var11 + param6;
            this.field_e[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_46_0 = var9;
          stackIn_46_1 = new StringBuilder().append("fe.T(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    public fe() {
    }

    static {
        field_k = new md();
        field_n = new String[]{"Reconnoitre", "Reveal two rooms at start of game. (Single use)"};
    }
}
