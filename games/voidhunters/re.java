/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ar {
    private boolean field_f;
    private int field_h;
    private int field_e;
    private int field_j;
    private no field_g;
    static dja field_k;
    private int field_l;
    private String field_m;
    private int field_i;
    static wdb field_n;

    public static void d(int param0) {
        if (param0 != -2705) {
          field_n = (wdb) null;
          field_n = null;
          field_k = null;
          return;
        }
        field_n = null;
        field_k = null;
    }

    private final toa a(int param0, String param1, no param2, int param3) {
        toa var5 = null;
        RuntimeException var5_ref = null;
        toa var6 = null;
        toa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 77) {
            re.a(-111, (byte) -91);
          }
          var6 = new toa(-param2.field_k + param3, param3 + param2.field_A, param1.length());
          var5 = var6;
          this.field_c = new toa[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("re.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, String param3, no param4, int param5, int param6, int param7) {
        toa stackIn_35_0;
        toa stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        toa stackIn_36_0 = null;
        toa stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        no stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        toa var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param0 == 0) {
            param0 = param4.field_H;
          }
          if (param3 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_g == param4 &&
            !this.field_f &&
            this.field_l == param5 &&
            param7 == this.field_j &&
            param0 == this.field_i &&
            this.field_h == param1 &&
            param2 == this.field_e &&
            this.field_m != null &&
            this.field_m.equals(param3)) {
            return;
          }
          this.field_e = param2;
          this.field_l = param5;
          this.field_f = false;
          this.field_h = param1;
          this.field_m = param3;
          this.field_i = param0;
          this.field_j = param7;
          this.field_g = param4;
          var16 = new String[param4.c(param3, param2) + 1];
          var17 = var16;
          var10 = Math.max(1, param4.a(param3, new int[]{param2}, var17));
          if (this.field_j == param6 &&
            1 == var10) {
            this.field_j = 1;
          }
          if (0 == this.field_j) {
            var11 = param4.field_k;
          } else {
            if (this.field_j != 1) {
              if (this.field_j != 2) {
                var12 = (-(var10 * this.field_i) + this.field_h) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param4.field_k;
                this.field_i = this.field_i + var12;
              } else {
                var11 = -(var10 * this.field_i) + (this.field_h - param4.field_A);
              }
            } else {
              var11 = param4.field_k + (this.field_h - this.field_i * var10 >> 1);
            }
          }
          this.field_c = new toa[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param4.field_k + var11;
            stackIn_35_3 = var11 + param4.field_A;
            if (var13 != null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            }
            var14 = new toa(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param4.b(var13);
              stackIn_39_0 = (no) (param4);
              if (param5 != 3) {
                stackIn_40_1 = 0;
              } else {
                stackIn_40_1 = this.a(false, param2, param4.b(var13), var13);
              }
              tbb.a(stackIn_39_0, stackIn_40_1, var14, var13, 18126);
            }
            var11 = var11 + param0;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("re.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, no param1, int param2, String param3, int param4) {
        toa var7 = null;
        toa var8 = null;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_g == param1 &&
          this.field_f &&
          0 == this.field_l &&
          null != this.field_m &&
          this.field_m.equals(param3)) {
          return;
        }
        try {
          this.field_g = param1;
          this.field_f = true;
          this.field_m = param3;
          this.field_l = 0;
          var7 = this.a(param2 + 108, param3, param1, param0);
          var8 = var7;
          var7.field_c[0] = param4;
          var8.field_c[param3.length()] = param4 + param1.b(param3);
          if (param2 != -3) {
            field_n = (wdb) null;
          }
          tbb.a(param1, 0, var8, param3, 18126);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, no param4) {
        toa var8 = null;
        int var7 = 0;
        if (param2 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_g == param4 &&
          this.field_f &&
          this.field_l == 1 &&
          null != this.field_m &&
          this.field_m.equals(param2)) {
          return;
        }
        this.field_g = param4;
        this.field_l = 1;
        this.field_f = true;
        if (param0 != -2661) {
          return;
        }
        try {
          var8 = this.a(113, param2, param4, param3);
          var7 = param4.b(param2);
          var8.field_c[0] = -(var7 >> 1) + param1;
          var8.field_c[param2.length()] = (var7 >> 1) + param1;
          tbb.a(param4, 0, var8, param2, 18126);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "re.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, no param1, int param2, int param3, String param4) {
        toa var8 = null;
        toa var9 = null;
        if (param4 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_g == param1 &&
          this.field_f &&
          this.field_l == 2 &&
          null != this.field_m &&
          this.field_m.equals(param4)) {
          return;
        }
        this.field_l = 2;
        this.field_m = param4;
        if (param2 < 30) {
          return;
        }
        try {
          this.field_f = true;
          this.field_g = param1;
          var8 = this.a(93, param4, param1, param0);
          var9 = var8;
          var9.field_c[0] = -param1.b(param4) + param3;
          var9.field_c[param4.length()] = param3;
          tbb.a(param1, 0, var9, param4, 18126);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "re.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public re() {
    }

    final static void a(int param0, byte param1) {
        hlb.field_p = param0;
        if (null != aab.field_o) {
          aab.field_o.b(param0, (byte) 14);
          if (param1 >= -93) {
            re.d(-100);
            if (null != ew.field_p) {
              ew.field_p.b((byte) -108, param0);
            }
            return;
          }
          if (null != ew.field_p) {
            ew.field_p.b((byte) -108, param0);
          }
          return;
        }
        if (param1 < -93) {
          if (null != ew.field_p) {
            ew.field_p.b((byte) -108, param0);
          }
          return;
        }
        re.d(-100);
        if (null != ew.field_p) {
          ew.field_p.b((byte) -108, param0);
        }
    }

    static {
        field_k = (dja) ((Object) new bf());
    }
}
