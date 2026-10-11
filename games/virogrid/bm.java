/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ie {
    private int field_l;
    private int field_q;
    static wl field_i;
    private int field_j;
    private int field_p;
    private String field_h;
    private boolean field_m;
    private e field_f;
    static String field_g;
    private int field_k;
    static String field_o;
    static String field_n;

    final void a(int param0, byte param1, e param2, int param3, String param4) {
        RuntimeException var6 = null;
        ri var7 = null;
        ri var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == null) {
            this.field_d = null;
            return;
          }
          if (this.field_f == param2 &&
            this.field_m &&
            0 == this.field_j &&
            this.field_h != null &&
            this.field_h.equals(param4)) {
            return;
          }
          this.field_f = param2;
          this.field_m = true;
          this.field_j = 0;
          this.field_h = param4;
          var7 = this.a(false, param4, param2, param0);
          var8 = var7;
          var7.field_d[0] = param3;
          var8.field_d[param4.length()] = param3 + param2.a(param4);
          bd.a(param1 ^ 91, 0, var8, param2, param4);
          if (param1 == 59) {
            return;
          }
          this.field_h = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("bm.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static mg[] a(int param0, int param1, int param2, byte param3) {
        if (param3 < -68) {
          return he.b(param2, 1, param1, (byte) 89, param0);
        }
        bm.a('￶', true);
        return he.b(param2, 1, param1, (byte) 89, param0);
    }

    final static void d(int param0, int param1) {
        c.field_a = param0;
        if (param1 != 0) {
          field_g = (String) null;
          if (null != vg.field_B) {
            vg.field_B.e(2, param0);
          }
          if (null != wc.field_f) {
            wc.field_f.a((byte) 90, param0);
            return;
          }
          return;
        }
        if (null != vg.field_B) {
          vg.field_B.e(2, param0);
        }
        if (null == wc.field_f) {
          return;
        }
        wc.field_f.a((byte) 90, param0);
    }

    final void a(byte param0, int param1, String param2, int param3, e param4) {
        ri var8 = null;
        ri var9 = null;
        if (param2 == null) {
          this.field_d = null;
          return;
        }
        if (param0 > -49) {
          return;
        }
        if (param4 == this.field_f && this.field_m && this.field_j == 2 && this.field_h != null &&
          this.field_h.equals(param2)) {
          return;
        }
        try {
          this.field_j = 2;
          this.field_f = param4;
          this.field_h = param2;
          this.field_m = true;
          var8 = this.a(false, param2, param4, param3);
          var9 = var8;
          var9.field_d[0] = -param4.a(param2) + param1;
          var9.field_d[param2.length()] = param1;
          bd.a(37, 0, var9, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "bm.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, String param4, e param5, int param6, int param7) {
        ri stackIn_37_0;
        ri stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        ri stackIn_38_0 = null;
        ri stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ri var14 = null;
        int var15 = 0;
        String var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        int var12Lifetime1;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          if (param3 == 0) {
            param3 = param5.field_J;
          }
          if (param4 == null) {
            this.field_d = null;
            return;
          }
          if (param5 == this.field_f &&
            !this.field_m &&
            this.field_j == param1 &&
            param0 == this.field_l &&
            param3 == this.field_q &&
            param7 == this.field_k &&
            this.field_p == param6 &&
            this.field_h != null &&
            this.field_h.equals(param4)) {
            return;
          }
          this.field_l = param0;
          this.field_j = param1;
          this.field_q = param3;
          this.field_k = param7;
          this.field_h = param4;
          this.field_f = param5;
          this.field_m = false;
          this.field_p = param6;
          var17 = new String[1 + param5.b(param4, param6)];
          var18 = var17;
          if (!param2) {
            var16 = (String) null;
            this.a(-35, (byte) -77, (e) null, 104, (String) null);
          }
          var10 = Math.max(1, param5.a(param4, new int[]{param6}, var18));
          if (this.field_l == 3 &&
            var10 == 1) {
            this.field_l = 1;
          }
          if (0 != this.field_l) {
            if (1 == this.field_l) {
              var11 = (-(var10 * this.field_q) + this.field_k >> 1) + param5.field_H;
            } else {
              if (this.field_l != 2) {
                var12 = (this.field_k - this.field_q * var10) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = param5.field_H + var12;
                this.field_q = this.field_q + var12;
              } else {
                var11 = -(var10 * this.field_q) + (-param5.field_G + this.field_k);
              }
            }
          } else {
            var11 = param5.field_H;
          }
          this.field_d = new ri[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var17[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param5.field_H + var11;
            stackIn_37_3 = var11 + param5.field_G;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new ri(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_d[0] = 0;
            if (var13 != null) {
              var14.field_d[var13.length()] = param5.a(var13);
              stackIn_42_0 = 62;
              if (param1 != 3) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(var13, param5.a(var13), true, param6);
              }
              bd.a(stackIn_42_0, stackIn_43_1, var14, param5, var13);
            }
            var11 = var11 + param3;
            this.field_d[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("bm.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          return true;
        }
        if (65 <= param0) {
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (122 >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (122 < param0) {
          return false;
        }
        return true;
    }

    private final ri a(boolean param0, String param1, e param2, int param3) {
        ri var5 = null;
        RuntimeException var5_ref = null;
        ri var6 = null;
        ri stackIn_2_0 = null;
        ri stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ri(-param2.field_H + param3, param3 + param2.field_G, param1.length());
          var5 = var6;
          if (param0) {
            stackIn_2_0 = (ri) null;
            return stackIn_2_0;
          }
          this.field_d = new ri[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("bm.J(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        if (50 != param1) {
          throw new IllegalArgumentException();
        }
        if (param0 > -77) {
          bm.d(-53, 115);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 == 2797) {
          field_o = null;
          field_i = null;
          field_n = null;
          field_g = null;
          return;
        }
        field_g = (String) null;
        field_o = null;
        field_i = null;
        field_n = null;
        field_g = null;
    }

    final void a(String param0, byte param1, e param2, int param3, int param4) {
        ri var7 = null;
        int var8 = 0;
        if (param0 == null) {
          this.field_d = null;
          return;
        }
        if (this.field_f == param2 && this.field_m && this.field_j == 1 && this.field_h != null &&
          this.field_h.equals(param0)) {
          return;
        }
        try {
          int var6_int = 78 / ((-27 - param1) / 49);
          this.field_m = true;
          this.field_j = 1;
          this.field_f = param2;
          var7 = this.a(false, param0, param2, param4);
          var8 = param2.a(param0);
          var7.field_d[0] = param3 - (var8 >> 1);
          var7.field_d[param0.length()] = (var8 >> 1) + param3;
          bd.a(94, 0, var7, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "bm.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public bm() {
    }

    static {
        field_g = "This game has been updated! Please reload this page.";
        field_i = new wl();
        field_o = "Auto-respond to <%0>";
        field_n = "Waiting for sound effects";
    }
}
