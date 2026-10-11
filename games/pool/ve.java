/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends op {
    private String field_t;
    private int field_n;
    static long field_m;
    private boolean field_k;
    static int field_j;
    static int[] field_w;
    static String[][] field_q;
    static String field_o;
    private lr field_i;
    static ml field_l;
    private int field_r;
    private int field_s;
    private int field_u;
    private static int field_p;
    private int field_v;

    final static void a(int param0, int param1, int param2, nm param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          Pool.field_I = param3;
          bk.field_v = param2;
          if (param0 < 106) {
            return;
          }
          ld.field_b = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ve.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final vj a(lr param0, int param1, boolean param2, String param3) {
        vj var5 = null;
        RuntimeException var5_ref = null;
        vj stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            this.field_t = (String) null;
          }
          var5 = new vj(param1 - param0.field_C, param1 + param0.field_w, param3.length());
          this.field_b = new vj[]{var5};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ve.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, lr param2, boolean param3, int param4) {
        RuntimeException runtimeException = null;
        vj var6 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            this.field_b = null;
            return;
          }
          if (param2 == this.field_i &&
            this.field_k &&
            0 == this.field_s &&
            this.field_t != null &&
            this.field_t.equals(param1)) {
            return;
          }
          this.field_t = param1;
          this.field_s = 0;
          this.field_i = param2;
          this.field_k = param3;
          var6 = this.a(param2, param0, true, param1);
          var6.field_h[0] = param4;
          var6.field_h[param1.length()] = param4 + param2.b(param1);
          kh.a(param1, var6, 6110, 0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_22_0 = runtimeException;
          stackIn_22_1 = new StringBuilder().append("ve.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        try {
          boolean decompiledSharedTail0 = !(ec.field_b <= 32);
          if (!decompiledSharedTail0) {
            ka.a(true, 0);
            decompiledSharedTail0 = (Pool.field_O != 0);
          }
          if (decompiledSharedTail0) {
            var1_int = ec.field_b % 32;
            if (var1_int == 0) {
              var1_int = 32;
            }
            ka.a(true, ec.field_b - var1_int);
          }
          var1_intLifetime1 = -10 / ((74 - param0) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ve.M(" + param0 + ')');
        }
    }

    final static String d(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = "";
          if (param0 < 116) {
            field_p = -70;
          }
          if (null != vj.field_j) {
            var1 = vj.field_j.h(-103);
          }
          if (var1.length() == 0) {
            var1 = rf.a((byte) -119);
          }
          if (var1.length() == 0) {
            var1 = tf.field_b;
          }
          stackIn_14_0 = var1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ve.J(" + param0 + ')');
        }
    }

    final void a(lr param0, int param1, int param2, String param3, boolean param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        vj var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          if (param4) {
            this.field_n = 107;
          }
          if (null == param3) {
            this.field_b = null;
            return;
          }
          if (param0 == this.field_i &&
            this.field_k &&
            this.field_s == 1 &&
            null != this.field_t &&
            this.field_t.equals(param3)) {
            return;
          }
          this.field_k = true;
          this.field_s = 1;
          this.field_i = param0;
          var6 = this.a(param0, param2, true, param3);
          var7 = param0.b(param3);
          var6.field_h[0] = param1 - (var7 >> 1);
          var6.field_h[param3.length()] = (var7 >> 1) + param1;
          kh.a(param3, var6, 6110, 0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_27_0 = var6_ref;
          stackIn_27_1 = new StringBuilder().append("ve.S(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(String param0, lr param1, boolean param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        vj var6 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0) {
            this.field_b = null;
            return;
          }
          if (param2) {
            return;
          }
          if (param1 == this.field_i &&
            this.field_k &&
            this.field_s == 2 &&
            this.field_t != null &&
            this.field_t.equals(param0)) {
            return;
          }
          this.field_t = param0;
          this.field_k = true;
          this.field_i = param1;
          this.field_s = 2;
          var6 = this.a(param1, param3, true, param0);
          var6.field_h[0] = param4 - param1.b(param0);
          var6.field_h[param0.length()] = param4;
          kh.a(param0, var6, 6110, 0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_28_0 = runtimeException;
          stackIn_28_1 = new StringBuilder().append("ve.R(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, String param1, lr param2, int param3, int param4, int param5, int param6, int param7) {
        vj stackIn_63_0;
        vj stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        vj stackIn_64_0 = null;
        vj stackIn_64_1 = null;
        int stackIn_64_4 = 0;
        String stackIn_70_0 = null;
        vj stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackIn_71_3;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        vj var14 = null;
        int var15 = 0;
        int var12Lifetime1;
        var15 = Pool.field_O;
        try {
          if (param4 == param7) {
            param4 = param2.field_G;
          }
          if (param1 == null) {
            this.field_b = null;
            return;
          }
          if (this.field_i == param2 &&
            !this.field_k &&
            ~param0 == ~this.field_s &&
            this.field_r == param6 &&
            param4 == this.field_v &&
            this.field_u == param3 &&
            ~this.field_n == ~param5 &&
            this.field_t != null &&
            this.field_t.equals(param1)) {
            return;
          }
          this.field_n = param5;
          this.field_s = param0;
          this.field_u = param3;
          this.field_v = param4;
          this.field_t = param1;
          this.field_r = param6;
          this.field_k = false;
          this.field_i = param2;
          var9 = new String[1 + param2.b(param1, param5)];
          var10 = Math.max(1, param2.a(param1, new int[]{param5}, var9));
          if (3 == this.field_r &&
            var10 == 1) {
            this.field_r = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_b = new vj[var10];
          if (this.field_r == 0) {
            var11 = param2.field_C;
            decompiledFrameRemainder0 = (var15 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_r != 1) {
              if (this.field_r != 2) {
                var12 = (this.field_u - var10 * this.field_v) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param2.field_C;
                this.field_v = this.field_v + var12;
                if (var15 != 0) {
                  var11 = -(this.field_v * var10) - param2.field_w + this.field_u;
                  var11 = (this.field_u - this.field_v * var10 >> 1) + param2.field_C;
                }
              } else {
                var11 = -(this.field_v * var10) - param2.field_w + this.field_u;
                if (var15 != 0) {
                  var11 = (this.field_u - this.field_v * var10 >> 1) + param2.field_C;
                }
              }
            } else {
              var11 = (this.field_u - this.field_v * var10 >> 1) + param2.field_C;
            }
          }
          var12Lifetime1 = 0;
          while (var10 > var12Lifetime1) {
            var13 = var9[var12Lifetime1];
            if (var15 != 0) {
              return;
            }
            stackIn_63_0 = null;
            stackIn_63_1 = null;
            stackIn_63_2 = -param2.field_C + var11;
            stackIn_63_3 = param2.field_w + var11;
            if (var13 == null) {
              stackIn_64_0 = null;
              stackIn_64_1 = null;
              stackIn_64_4 = 0;
            } else {
              stackIn_64_0 = null;
              stackIn_64_1 = null;
              stackIn_64_4 = var13.length();
            }
            var14 = new vj(stackIn_63_2, stackIn_63_3, stackIn_64_4);
            var14.field_h[0] = 0;
            if (null != var13) {
              var14.field_h[var13.length()] = param2.b(var13);
              stackIn_70_0 = var13;
              stackIn_70_1 = var14;
              stackIn_70_2 = 6110;
              if (param0 == 3) {
                stackIn_71_3 = this.a(param2.b(var13), (byte) 105, var13, param5);
              } else {
                stackIn_71_3 = 0;
              }
              kh.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_71_3, param2);
            }
            this.field_b[var12Lifetime1] = var14;
            var11 = var11 + param4;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_77_0 = var9_ref;
          stackIn_77_1 = new StringBuilder().append("ve.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public ve() {
    }

    final static void a(int param0, boolean param1, int[] param2, boolean param3, boolean param4, int[] param5, oc param6) {
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime2Lifetime1;
        int var24Lifetime2Lifetime2;
        int var25Lifetime2Lifetime1;
        int var25Lifetime2Lifetime2;
        int var26Lifetime2Lifetime1;
        int var26Lifetime2Lifetime2;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var13 = var26 * param5[5] + var24 * param5[3] + param5[4] * var25 >> 14;
          var12 = param5[5] * var23 + (var21 * param5[3] + param5[4] * var22) >> 14;
          var29 = param2[11] >> 2;
          var17 = param5[8] * var29 + var27 * param5[6] + param5[7] * var28 >> 14;
          var19 = param5[9] * var24 + param5[10] * var25 + param5[11] * var26 >> 14;
          var16 = param5[6] * var24 - (-(param5[7] * var25) - var26 * param5[8]) >> 14;
          if (param0 != -3) {
            field_l = (ml) null;
          }
          var15 = var23 * param5[8] + (param5[7] * var22 + param5[6] * var21) >> 14;
          var18 = var23 * param5[11] + var21 * param5[9] + param5[10] * var22 >> 14;
          var14 = param5[5] * var29 + var27 * param5[3] + param5[4] * var28 >> 14;
          var20 = var29 * param5[11] + (var27 * param5[9] + param5[10] * var28) >> 14;
          var21Lifetime1 = param5[0] - param2[0];
          var22Lifetime1 = param5[1] - param2[1];
          var23Lifetime1 = -param2[2] + param5[2];
          var9 = param2[3] * var21Lifetime1 + var22Lifetime1 * param2[4] + param2[5] * var23Lifetime1 >> 16 - ob.field_i;
          var10 = param2[8] * var23Lifetime1 + var21Lifetime1 * param2[6] + var22Lifetime1 * param2[7] >> 16 - ob.field_i;
          var11 = var21Lifetime1 * param2[9] - (-(var22Lifetime1 * param2[10]) - var23Lifetime1 * param2[11]) >> 16;
          var21Lifetime2 = fb.field_q;
          var22Lifetime2 = fb.field_d;
          for (var23Lifetime2 = 0; param6.field_k > var23Lifetime2; var23Lifetime2++) {
            var24Lifetime1 = param6.field_m[var23Lifetime2];
            var25Lifetime1 = param6.field_s[var23Lifetime2];
            var26Lifetime1 = param6.field_l[var23Lifetime2];
            var27Lifetime1 = var9 + (var18 * var26Lifetime1 + var15 * var25Lifetime1 + var24Lifetime1 * var12 >> -ob.field_i + 16);
            var28Lifetime1 = (var26Lifetime1 * var19 + (var16 * var25Lifetime1 + var24Lifetime1 * var13) >> -ob.field_i + 16) + var10;
            var29Lifetime1 = (var20 * var26Lifetime1 + var24Lifetime1 * var14 + var17 * var25Lifetime1 >> 16) + var11;
            if (var29Lifetime1 < 50) {
              fe.field_L[var23Lifetime2] = -2147483648;
            } else {
              ch.field_M[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
              li.field_h[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
              if (var29Lifetime1 > var8) {
                var8 = var29Lifetime1;
              }
              if (var29Lifetime1 < var7_int) {
                var7_int = var29Lifetime1;
              }
              fe.field_L[var23Lifetime2] = var29Lifetime1;
            }
            if (param1) {
              ie.field_d[var23Lifetime2] = var27Lifetime1 >> ob.field_i;
              vj.field_a[var23Lifetime2] = var28Lifetime1 >> ob.field_i;
              ja.field_d[var23Lifetime2] = var29Lifetime1;
            }
          }
          if (param6.field_g != null &&
            param6.field_e != null &&
            param6.field_D != null &&
            null != param6.field_C &&
            null != param6.field_M &&
            null != param6.field_c &&
            null != param6.field_J &&
            null != param6.field_A &&
            null != param6.field_E) {
            for (var23Lifetime3 = 0; var23Lifetime3 < param6.field_d; var23Lifetime3++) {
              var24Lifetime2 = param6.field_g[var23Lifetime3];
              var25Lifetime2 = param6.field_e[var23Lifetime3];
              var26Lifetime2 = param6.field_D[var23Lifetime3];
              ap.field_B[var23Lifetime3] = (var25Lifetime2 * var15 + var24Lifetime2 * var12 + var18 * var26Lifetime2 >> 16) + var9;
              ge.field_p[var23Lifetime3] = var10 + (var16 * var25Lifetime2 + (var24Lifetime2 * var13 + var26Lifetime2 * var19) >> 16);
              dn.field_n[var23Lifetime3] = (var26Lifetime2 * var20 + var17 * var25Lifetime2 + var24Lifetime2 * var14 >> 16) + var11;
              var24Lifetime2Lifetime1 = param6.field_C[var23Lifetime3];
              var25Lifetime2Lifetime1 = param6.field_M[var23Lifetime3];
              var26Lifetime2Lifetime1 = param6.field_c[var23Lifetime3];
              hp.field_d[var23Lifetime3] = (var18 * var26Lifetime2Lifetime1 + (var24Lifetime2Lifetime1 * var12 + var15 * var25Lifetime2Lifetime1) >> 16) + var9;
              fj.field_g[var23Lifetime3] = (var26Lifetime2Lifetime1 * var19 + (var16 * var25Lifetime2Lifetime1 + var24Lifetime2Lifetime1 * var13) >> 16) + var10;
              kn.field_c[var23Lifetime3] = (var24Lifetime2Lifetime1 * var14 + (var25Lifetime2Lifetime1 * var17 + var20 * var26Lifetime2Lifetime1) >> 16) + var11;
              var24Lifetime2Lifetime2 = param6.field_J[var23Lifetime3];
              var25Lifetime2Lifetime2 = param6.field_A[var23Lifetime3];
              var26Lifetime2Lifetime2 = param6.field_E[var23Lifetime3];
              sl.field_P[var23Lifetime3] = var9 + (var18 * var26Lifetime2Lifetime2 + var24Lifetime2Lifetime2 * var12 + var25Lifetime2Lifetime2 * var15 >> 16);
              oi.field_w[var23Lifetime3] = (var26Lifetime2Lifetime2 * var19 + var25Lifetime2Lifetime2 * var16 + var24Lifetime2Lifetime2 * var13 >> 16) + var10;
              mp.field_P[var23Lifetime3] = var11 + (var17 * var25Lifetime2Lifetime2 + var14 * var24Lifetime2Lifetime2 + var26Lifetime2Lifetime2 * var20 >> 16);
            }
          }
          if (param4) {
            var9Lifetime1 = param5[3];
            var10Lifetime1 = param5[4];
            var11Lifetime1 = param5[5];
            var12Lifetime1 = param5[6];
            var13Lifetime1 = param5[7];
            var14Lifetime1 = param5[8];
            var15Lifetime1 = param5[9];
            var16Lifetime1 = param5[10];
            var17Lifetime1 = param5[11];
            for (var18Lifetime1 = 0; param6.field_o > var18Lifetime1; var18Lifetime1++) {
              if (oj.field_r.length <= var18Lifetime1) {
                break;
              }
              var19Lifetime1 = param6.field_Q[var18Lifetime1];
              var20Lifetime1 = param6.field_p[var18Lifetime1];
              var21Lifetime3 = param6.field_j[var18Lifetime1];
              oj.field_r[var18Lifetime1] = var15Lifetime1 * var21Lifetime3 + (var12Lifetime1 * var20Lifetime1 + var19Lifetime1 * var9Lifetime1) >> 16;
              wa.field_mb[var18Lifetime1] = var16Lifetime1 * var21Lifetime3 + var20Lifetime1 * var13Lifetime1 + var10Lifetime1 * var19Lifetime1 >> 16;
              al.field_g[var18Lifetime1] = var21Lifetime3 * var17Lifetime1 + var19Lifetime1 * var11Lifetime1 + var20Lifetime1 * var14Lifetime1 >> 16;
            }
          }
          ej.a(param3, var8, var7_int, (byte) 48, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_64_0 = var7;
          stackIn_64_1 = new StringBuilder().append("ve.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param6 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_l = null;
          field_w = null;
          field_q = (String[][]) null;
          if (param0 != -13268) {
            field_p = 75;
          }
          field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ve.K(" + param0 + ')');
        }
    }

    static {
        field_q = new String[][]{new String[]{"60", "45", "30", "20", "15", "10"}, null, null, null};
        field_o = "Allow spectators?";
        field_p = 16;
        field_j = 1 << field_p;
        field_l = new ml("");
    }
}
