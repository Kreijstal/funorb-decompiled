/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends qo {
    private int field_l;
    private int field_m;
    static String field_h;
    private boolean field_f;
    static String field_o;
    private int field_p;
    static bc field_k;
    static String field_n;
    private String field_g;
    private nq field_j;
    static String[] field_r;
    private int field_q;
    private int field_i;

    final void a(int param0, String param1, int param2, nq param3, int param4) {
        ha var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_j == param3 && this.field_f && this.field_p == 1 && this.field_g != null &&
          this.field_g.equals(param1)) {
          return;
        }
        try {
          this.field_p = 1;
          this.field_f = true;
          this.field_j = param3;
          var8 = this.a(param0, param3, param1, (byte) 15);
          var7 = param3.c(param1);
          var8.field_b[param2] = -(var7 >> 1) + param4;
          var8.field_b[param1.length()] = param4 + (var7 >> 1);
          ta.a(param1, var8, 27329, 0, param3);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "la.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, nq param6, int param7) {
        ha stackIn_33_0;
        ha stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        ha stackIn_34_0 = null;
        ha stackIn_34_1 = null;
        int stackIn_34_4 = 0;
        String stackIn_38_0 = null;
        ha stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_39_3;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ha var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param7 == param1) {
            param7 = param6.field_L;
          }
          if (param0 == null) {
            this.field_d = null;
            return;
          }
          if (this.field_j == param6 &&
            !this.field_f &&
            param2 == this.field_p &&
            param3 == this.field_l &&
            this.field_m == param7 &&
            param5 == this.field_i &&
            this.field_q == param4 &&
            this.field_g != null &&
            this.field_g.equals(param0)) {
            return;
          }
          this.field_f = false;
          this.field_j = param6;
          this.field_l = param3;
          this.field_q = param4;
          this.field_p = param2;
          this.field_g = param0;
          this.field_i = param5;
          this.field_m = param7;
          var16 = new String[1 + param6.a(param0, param4)];
          var17 = var16;
          var10 = Math.max(1, param6.a(param0, new int[]{param4}, var17));
          if (this.field_l == 3 &&
            var10 == 1) {
            this.field_l = 1;
          }
          if (this.field_l == 0) {
            var11 = param6.field_J;
          } else {
            if (1 == this.field_l) {
              var11 = param6.field_J + (this.field_i - var10 * this.field_m >> 1);
            } else {
              if (2 != this.field_l) {
                var12 = (this.field_i - this.field_m * var10) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = var12 + param6.field_J;
                this.field_m = this.field_m + var12;
              } else {
                var11 = this.field_i - param6.field_q - this.field_m * var10;
              }
            }
          }
          this.field_d = new ha[var10];
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_33_0 = null;
            stackIn_33_1 = null;
            stackIn_33_2 = -param6.field_J + var11;
            stackIn_33_3 = var11 + param6.field_q;
            if (var13 != null) {
              stackIn_34_0 = null;
              stackIn_34_1 = null;
              stackIn_34_4 = var13.length();
            } else {
              stackIn_34_0 = null;
              stackIn_34_1 = null;
              stackIn_34_4 = 0;
            }
            var14 = new ha(stackIn_33_2, stackIn_33_3, stackIn_34_4);
            var14.field_b[0] = 0;
            if (var13 != null) {
              var14.field_b[var13.length()] = param6.c(var13);
              stackIn_38_0 = var13;
              stackIn_38_1 = var14;
              stackIn_38_2 = param1 + 27329;
              if (param2 == 3) {
                stackIn_39_3 = this.a(param1 ^ -28135, param4, param6.c(var13), var13);
              } else {
                stackIn_39_3 = 0;
              }
              ta.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_39_3, param6);
            }
            this.field_d[var12Lifetime1] = var14;
            var11 = var11 + param7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_44_0 = var9;
          stackIn_44_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param7).append(')').toString());
        }
    }

    private final ha a(int param0, nq param1, String param2, byte param3) {
        ha var5 = null;
        RuntimeException var5_ref = null;
        ha var6 = null;
        ha stackIn_2_0 = null;
        ha stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ha(-param1.field_J + param0, param0 + param1.field_q, param2.length());
          var5 = var6;
          this.field_d = new ha[]{var6};
          if (param3 == 15) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (ha) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("la.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 36) {
          la.a((byte) 14);
        }
        field_k = null;
        field_r = null;
        field_n = null;
        field_o = null;
    }

    final void a(nq param0, int param1, int param2, String param3, int param4) {
        ha var7 = null;
        ha var8 = null;
        if (param3 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_j == param0 && this.field_f && 0 == this.field_p && null != this.field_g &&
          this.field_g.equals(param3)) {
          return;
        }
        try {
          this.field_j = param0;
          this.field_g = param3;
          this.field_f = true;
          this.field_p = 0;
          if (param2 != -4) {
            this.field_p = -108;
          }
          var7 = this.a(param1, param0, param3, (byte) 15);
          var8 = var7;
          var7.field_b[0] = param4;
          var8.field_b[param3.length()] = param0.c(param3) + param4;
          ta.a(param3, var8, param2 + 27333, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "la.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, nq param2, String param3, int param4) {
        ha var9 = null;
        ha var10 = null;
        if (param3 == null) {
          this.field_d = null;
          return;
        }
        if (param2 == this.field_j &&
          this.field_f &&
          this.field_p == 2 &&
          this.field_g != null &&
          this.field_g.equals(param3)) {
          return;
        }
        try {
          this.field_f = true;
          this.field_j = param2;
          this.field_p = 2;
          this.field_g = param3;
          int var7 = 79 / ((59 - param0) / 47);
          var9 = this.a(param1, param2, param3, (byte) 15);
          var10 = var9;
          var10.field_b[0] = -param2.c(param3) + param4;
          var10.field_b[param3.length()] = param4;
          ta.a(param3, var10, 27329, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "la.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public la() {
    }

    final static void a(boolean param0) {
        String var2 = (String) null;
        ce.a("", (String) null, (byte) 3);
        if (param0) {
          field_h = (String) null;
        }
    }

    static {
        field_o = "Exploiting a bug";
        field_n = "Game Type: Capture and Hold";
        field_r = new String[]{null, "turntime_icons", "game_icons", "galaxysize_icons", "type_icons"};
    }
}
