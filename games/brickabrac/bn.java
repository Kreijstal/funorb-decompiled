/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bn extends vi {
    int field_s;
    static String field_t;
    static jp field_p;
    int field_u;
    static mh field_q;
    static wq field_r;

    boolean a(no param0, byte param1) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var6Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var34 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param0.field_u;
          var4 = var3_int + param0.field_j;
          var5 = var3_int + param0.field_m;
          var6 = -this.field_m - (this.field_s >> 1) + var5;
          if (var6 < 0) {
            var6 = -var6;
          }
          if (var3_int + (this.field_s >> 1) <= var6) {
            return false;
          }
          var6Lifetime1 = -(this.field_u >> 1) - (this.field_j - var4);
          if (var6Lifetime1 < 0) {
            var6Lifetime1 = -var6Lifetime1;
          }
          if (var6Lifetime1 >= (this.field_u >> 1) + var3_int) {
            return false;
          }
          var7 = var4;
          var8 = var5;
          if (this.field_m <= var5) {
            if (this.field_s + this.field_m < var5) {
              var8 = this.field_m + this.field_s;
            }
          } else {
            var8 = this.field_m;
          }
          if (var4 < this.field_j) {
            var7 = this.field_j;
          } else {
            if (var4 > this.field_j + this.field_u) {
              var7 = this.field_u + this.field_j;
            }
          }
          var9 = (-var4 + var7) * (var7 - var4) + (var8 - var5) * (-var5 + var8);
          if (var9 > var3_int * var3_int) {
            return false;
          }
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = 0;
          var18 = -this.field_o + param0.field_o;
          var19 = -var3_int + this.field_m - var5;
          var20 = var19 << 8;
          var21 = -var5 + (this.field_m + var3_int) + this.field_s;
          var22 = var21 << 8;
          if (var18 != 0) {
            var22 = var22 / var18;
            var20 = var20 / var18;
          }
          var23 = -3 / ((param1 + 29) / 35);
          if (var20 < var22) {
            var14Lifetime1 = var19;
            var17Lifetime1 = 1;
            var12Lifetime1 = var20;
          } else {
            var14Lifetime1 = var21;
            var12Lifetime1 = var22;
            var17Lifetime1 = 2;
          }
          var14Lifetime1 = var14Lifetime1 + var5;
          var24 = -this.field_k + param0.field_k;
          var25 = -var3_int + this.field_j - var4;
          var26 = var25 << 8;
          var27 = -var4 + (this.field_j + var3_int + this.field_u);
          var28 = var27 << 8;
          if (var24 != 0) {
            var28 = var28 / var24;
            var26 = var26 / var24;
          }
          if (var28 <= var26) {
            var13Lifetime1 = var27;
            var16Lifetime1 = 4;
            var11Lifetime1 = var28;
          } else {
            var16Lifetime1 = 8;
            var11Lifetime1 = var26;
            var13Lifetime1 = var25;
          }
          var13Lifetime1 = var13Lifetime1 + var4;
          var29 = var4 + (var12Lifetime1 * var24 >> 8);
          var30 = (var18 * var11Lifetime1 >> 8) + var5;
          if (var18 != 0 &&
            var29 >= this.field_j - var3_int &&
            var29 <= var3_int + this.field_u + this.field_j) {
            if (var24 != 0 &&
              -var3_int + this.field_m <= var30 &&
              var3_int + this.field_m + this.field_s >= var30) {
              if (var12Lifetime1 >= var11Lifetime1) {
                var10Lifetime1 = var11Lifetime1;
                var15Lifetime1 = var16Lifetime1;
                var14Lifetime1 = var5 + (var18 * var10Lifetime1 >> 8);
              } else {
                var15Lifetime1 = var17Lifetime1;
                var10Lifetime1 = var12Lifetime1;
                var13Lifetime1 = (var24 * var10Lifetime1 >> 8) + var4;
              }
            } else {
              var15Lifetime1 = var17Lifetime1;
              var10Lifetime1 = var12Lifetime1;
              var13Lifetime1 = var4 + (var10Lifetime1 * var24 >> 8);
            }
          } else {
            var10Lifetime1 = var11Lifetime1;
            var15Lifetime1 = var16Lifetime1;
            var14Lifetime1 = (var10Lifetime1 * var18 >> 8) + var5;
          }
          var31 = 0;
          var32 = 0;
          if (var15Lifetime1 == 8) {
            var31 = 256;
          }
          if (4 == var15Lifetime1) {
            var31 = -256;
          }
          if (1 == var15Lifetime1) {
            var32 = 256;
          }
          if (2 == var15Lifetime1) {
            var32 = -256;
          }
          var33 = -(var32 * var18 + var31 * var24) >> 8;
          if (var33 > 0) {
            return false;
          }
          if (var10Lifetime1 > ea.field_b) {
            return true;
          }
          oh.field_f = var13Lifetime1 - param0.field_u;
          ea.field_b = var10Lifetime1;
          mn.field_A = var31;
          ae.field_b = var32;
          dj.field_c = this;
          sh.field_a = var15Lifetime1;
          mm.field_Tb = -param0.field_u + var14Lifetime1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("bn.F(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(')').toString());
        }
    }

    bn(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3, param6);
        this.field_s = param5;
        this.field_u = param4;
    }

    final boolean a(no param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        int var17 = 0;
        long var9Lifetime1;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_long = (long)param0.field_u;
          var5 = (long)param0.field_j;
          var7 = (long)param0.field_m;
          var9 = (long)(-this.field_m - this.field_s / 2) + var7;
          if (var9 < 0L) {
            var9 = -var9;
          }
          if (var9 >= (long)(this.field_s / 2) + var3_long) {
            return false;
          }
          var9Lifetime1 = var5 + (long)(-this.field_j - this.field_u / 2);
          if (var9Lifetime1 < 0L) {
            var9Lifetime1 = -var9Lifetime1;
          }
          if (param1) {
            bn.c(111);
          }
          if (var3_long + (long)(this.field_u / 2) <= var9Lifetime1) {
            return false;
          }
          var11 = var5;
          var13 = var7;
          if (var5 < (long)this.field_j) {
            var11 = (long)this.field_j;
          } else {
            if (var5 > (long)(this.field_j + this.field_u)) {
              var11 = (long)(this.field_j + this.field_u);
            }
          }
          if (var7 >= (long)this.field_m) {
            if (var7 > (long)(this.field_s + this.field_m)) {
              var13 = (long)(this.field_m + this.field_s);
            }
          } else {
            var13 = (long)this.field_m;
          }
          var15 = (var11 - var5) * (var11 - var5) + (-var7 + var13) * (var13 - var7);
          if (var15 <= var3_long * var3_long) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("bn.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(byte param0, j param1, no param2) {
        try {
          if (param0 != 53) {
            no var5 = (no) null;
            this.a((no) null, (byte) 44);
          }
          param2.field_j = oh.field_f;
          param2.field_m = mm.field_Tb;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "bn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 62 / ((25 - param0) / 57);
        if (ej.field_I != null) {
          ej.field_I.m(17);
        }
        pq.field_o = new qo();
        rj.field_c.b((byte) 110, pq.field_o);
    }

    int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 79) {
            this.field_s = 1;
          }
          stackIn_3_0 = (33029 + this.field_s * 37 << 13) + (41 * this.field_u + 29813 << 2) ^ super.a(80, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        int var1 = 51 / ((-46 - param0) / 34);
        field_t = null;
    }

    static {
        field_t = "Offer rematch";
    }
}
