/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ro {
    static String[] field_q;
    static String field_x;
    static String field_s;
    private String field_r;
    private int field_t;
    static boolean[] field_m;
    private cc field_p;
    static long field_w;
    private int field_j;
    private int field_k;
    static int field_l;
    private int field_n;
    private int field_v;
    static lg field_u;
    private boolean field_o;

    final void a(int param0, cc param1, String param2, int param3, int param4) {
        lq var8 = null;
        int var7 = 0;
        if (param3 != -12558) {
          return;
        }
        if (param2 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_p == param1 &&
          this.field_o &&
          this.field_n == 1 &&
          null != this.field_r &&
          this.field_r.equals(param2)) {
          return;
        }
        try {
          this.field_n = 1;
          this.field_p = param1;
          this.field_o = true;
          var8 = this.a(param2, (byte) 45, param1, param0);
          var7 = param1.c(param2);
          var8.field_c[0] = param4 - (var7 >> 1);
          var8.field_c[param2.length()] = param4 + (var7 >> 1);
          tn.$cfr$intArgs$a$95d5eaff65e7(var8, param2, param1, 28, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "sl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean b(int param0) {
        int var1 = -92 / ((param0 - 49) / 40);
        return dc.field_L != null ? true : uj.field_g;
    }

    final void b(int param0, cc param1, String param2, int param3, int param4) {
        lq var7 = null;
        lq var8 = null;
        if (param2 == null) {
          this.field_c = null;
          return;
        }
        if (param1 == this.field_p &&
          this.field_o &&
          0 == this.field_n &&
          null != this.field_r &&
          this.field_r.equals(param2)) {
          return;
        }
        try {
          this.field_o = true;
          this.field_r = param2;
          this.field_n = 0;
          this.field_p = param1;
          if (param0 >= -84) {
            this.field_j = -69;
          }
          var7 = this.a(param2, (byte) 45, param1, param3);
          var8 = var7;
          var7.field_c[0] = param4;
          var8.field_c[param2.length()] = param1.c(param2) + param4;
          tn.$cfr$intArgs$a$95d5eaff65e7(var8, param2, param1, 17, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "sl.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_u = null;
        field_x = null;
        field_m = null;
        field_s = null;
        if (param0 <= 25) {
          field_s = (String) null;
        }
    }

    final void a(int param0, String param1, int param2, cc param3, int param4, int param5, int param6, int param7) {
        lq stackIn_34_0;
        lq stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        lq stackIn_35_0 = null;
        lq stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        lq stackIn_38_0;
        String stackIn_38_1;
        cc stackIn_38_2;
        int stackIn_38_3;
        int stackIn_39_4;
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
        lq var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          if (0 == param7) {
            param7 = param3.field_D;
          }
          if (param1 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_p == param3 &&
            !this.field_o &&
            this.field_n == param4 &&
            this.field_j == param0 &&
            this.field_t == param7 &&
            param5 == this.field_k &&
            param6 == this.field_v &&
            null != this.field_r &&
            this.field_r.equals(param1)) {
            return;
          }
          this.field_v = param6;
          this.field_p = param3;
          this.field_o = false;
          this.field_r = param1;
          this.field_k = param5;
          this.field_n = param4;
          this.field_j = param0;
          this.field_t = param7;
          var16 = new String[param2 + param3.b(param1, param6)];
          var17 = var16;
          var10 = Math.max(1, param3.a(param1, new int[]{param6}, var17));
          if (3 == this.field_j &&
            1 == var10) {
            this.field_j = 1;
          }
          if (0 != this.field_j) {
            if (this.field_j != 1) {
              if (2 == this.field_j) {
                var11 = -(var10 * this.field_t) + (-param3.field_M + this.field_k);
              } else {
                var12 = (this.field_k - this.field_t * var10) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param3.field_z;
                this.field_t = this.field_t + var12;
              }
            } else {
              var11 = (this.field_k - var10 * this.field_t >> 1) + param3.field_z;
            }
          } else {
            var11 = param3.field_z;
          }
          this.field_c = new lq[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = var11 - param3.field_z;
            stackIn_34_3 = param3.field_M + var11;
            if (var13 == null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var13.length();
            }
            var14 = new lq(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param3.c(var13);
              stackIn_38_0 = var14;
              stackIn_38_1 = var13;
              stackIn_38_2 = (cc) (param3);
              stackIn_38_3 = 83;
              if (param4 == 3) {
                stackIn_39_4 = this.a(var13, false, param3.c(var13), param6);
              } else {
                stackIn_39_4 = 0;
              }
              tn.$cfr$intArgs$a$95d5eaff65e7(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_39_4);
            }
            var11 = var11 + param7;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_44_0 = var9;
          stackIn_44_1 = new StringBuilder().append("sl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, byte param1, cc param2, int param3, String param4) {
        lq var8 = null;
        lq var9 = null;
        if (param1 <= 83) {
          field_l = 50;
        }
        if (param4 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_p == param2 && this.field_o && this.field_n == 2 && this.field_r != null &&
          this.field_r.equals(param4)) {
          return;
        }
        try {
          this.field_o = true;
          this.field_r = param4;
          this.field_n = 2;
          this.field_p = param2;
          var8 = this.a(param4, (byte) 45, param2, param3);
          var9 = var8;
          var9.field_c[0] = -param2.c(param4) + param0;
          var9.field_c[param4.length()] = param0;
          tn.$cfr$intArgs$a$95d5eaff65e7(var9, param4, param2, 119, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "sl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public sl() {
    }

    private final lq a(String param0, byte param1, cc param2, int param3) {
        lq var5 = null;
        RuntimeException var5_ref = null;
        lq var6 = null;
        lq stackIn_2_0 = null;
        lq stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new lq(param3 - param2.field_z, param2.field_M + param3, param0.length());
          var5 = var6;
          if (param1 != 45) {
            stackIn_2_0 = (lq) null;
            return stackIn_2_0;
          }
          this.field_c = new lq[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("sl.A(");
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_x = "Return to Main Menu";
        field_s = "Add name";
        field_w = 20000000L;
    }
}
