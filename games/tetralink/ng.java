/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends mc {
    static int field_D;
    static int field_t;
    static boolean field_r;
    static int[] field_s;
    static int field_n;
    static String field_E;
    lm[] field_v;
    static byte[][] field_q;
    wf[] field_z;
    static String field_x;
    int field_C;
    byte[] field_p;
    byte[] field_w;
    static int field_u;
    private int[] field_B;
    short[] field_o;
    static String field_y;
    byte[] field_A;

    final static sj a(byte param0, String[] param1) {
        sj var2 = null;
        RuntimeException var2_ref = null;
        sj stackIn_2_0 = null;
        sj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -67) {
            stackIn_2_0 = (sj) null;
            return stackIn_2_0;
          }
          var2 = new sj(false);
          var2.field_h = param1;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ng.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int[] param0, fa param1, byte param2, byte[] param3) {
        int var8 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          if (param2 != -114) {
            ng.a(-121);
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_B[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) != 0) {
                    var7 = param1.a(param0, var9 >> 2, 95);
                  } else {
                    var7 = param1.a((byte) 67, var9 >> 2, param0);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_z[var8] = (wf) (var7);
                  this.field_B[var8] = 0;
                }
              }
            }
          }
          stackIn_19_0 = var5_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ng.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1) {
        try {
          cl.field_b = param0;
          if (!param1) {
            ng.a(-44);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ng.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, boolean param2, hm param3, boolean param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          ai.field_e[0] = ca.field_i.nextInt();
          ai.field_e[1] = ca.field_i.nextInt();
          tb.field_j.field_t = 0;
          ai.field_e[2] = (int)(ca.field_g >> 32);
          ai.field_e[3] = (int)ca.field_g;
          tb.field_j.d(ai.field_e[0], (byte) -124);
          tb.field_j.d(ai.field_e[1], (byte) -124);
          tb.field_j.d(ai.field_e[2], (byte) -124);
          tb.field_j.d(ai.field_e[3], (byte) -124);
          mh.a(-105, tb.field_j);
          tb.field_j.b(param1, false);
          param3.a(-22017, tb.field_j);
          nd.field_Lb.field_t = 0;
          if (param2) {
            nd.field_Lb.a(18, false);
          } else {
            nd.field_Lb.a(16, false);
          }
          if (param0 != -34) {
            return;
          }
          nd.field_Lb.field_t = nd.field_Lb.field_t + 2;
          var5_int = nd.field_Lb.field_t;
          nd.field_Lb.d(lm.field_g, (byte) -124);
          nd.field_Lb.a(-1, tc.field_s);
          var6 = 0;
          if (pg.field_m) {
            var6 = var6 | 1;
          }
          if (mc.field_k) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (null != cl.field_b) {
            var6 = var6 | 16;
          }
          nd.field_Lb.a(var6, false);
          var7 = dd.a(lk.q(13), (byte) -87);
          if (var7 == null) {
            var7 = "";
          }
          nd.field_Lb.a(var7, 0);
          if (cl.field_b != null) {
            nd.field_Lb.a(cl.field_b, (byte) 103);
          }
          ae.a(ki.field_c, nd.field_Lb, tb.field_j, jg.field_c, 97);
          nd.field_Lb.a((byte) 17, nd.field_Lb.field_t - var5_int);
          ak.a((byte) -82, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ng.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_B = null;
        int var2 = 125 % ((param0 + 39) / 54);
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 < 12) {
          return;
        }
        field_s = null;
        field_q = (byte[][]) null;
        field_x = null;
        field_y = null;
    }

    ng(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        lm dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$4 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_206_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        lm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        lm var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        bh var38 = null;
        byte[] var39 = null;
        lm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        lm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        lm var48 = null;
        lm var49 = null;
        lm var50 = null;
        lm var51 = null;
        lm var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var27Lifetime12;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_z = new wf[128];
          this.field_B = new int[128];
          this.field_o = new short[128];
          this.field_A = new byte[128];
          this.field_p = new byte[128];
          this.field_w = new byte[128];
          this.field_v = new lm[128];
          var38 = new bh(param0);
          for (var3 = 0; var38.field_u[var3 + var38.field_t] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.g(-1772093437);
          }
          var3++;
          var38.field_t = var38.field_t + 1;
          var5Lifetime1 = var38.field_t;
          var38.field_t = var38.field_t + var3;
          for (var6 = 0; 0 != var38.field_u[var38.field_t + var6]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.g(-1772093437);
          }
          var38.field_t = var38.field_t + 1;
          var6++;
          var8Lifetime1 = var38.field_t;
          var38.field_t = var38.field_t + var6;
          for (var9 = 0; 0 != var38.field_u[var9 + var38.field_t]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.g(-1772093437);
          }
          var9++;
          var38.field_t = var38.field_t + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.d((byte) -99);
              if (var15_int == 0) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new lm[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new lm();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.d((byte) -99);
            if (var16_int > 0) {
              var15_ref.field_d = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.d((byte) -99);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_e = new byte[var16_intLifetime1 * 2 + 2];
              var40.field_e[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.d((byte) -99);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.d((byte) -99);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; 0 != var38.field_u[var38.field_t + var17]; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.g(-1772093437);
          }
          var38.field_t = var38.field_t + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.d((byte) -99);
            this.field_o[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.d((byte) -99);
            this.field_o[var20Lifetime1] = (short)(this.field_o[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var54.length > var21) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.b((byte) 120);
            }
            this.field_o[var23] = (short)(this.field_o[var23] + (pl.a(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.field_B[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_B[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length > var21Lifetime1) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_u[incrementValue$6];
              }
              var20Lifetime3--;
              this.field_p[var24] = (byte)var23Lifetime1;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (this.field_B[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_u[incrementValue$4] << 2;
              }
              this.field_w[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_B[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length <= var21Lifetime3) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              this.field_v[var26] = (lm) (var25);
              var20Lifetime5--;
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (0 == var20Lifetime6) {
              if (var54.length > var21Lifetime4) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (0 < this.field_B[var27]) {
                var26Lifetime1 = 1 + var38.d((byte) -99);
              }
            }
            this.field_A[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_C = 1 + var38.d((byte) -99);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_d != null) {
              for (var29 = 1; var45.field_d.length > var29; var29 += 2) {
                var45.field_d[var29] = var38.g(-1772093437);
              }
            }
            if (null != var45.field_e) {
              for (var29Lifetime5 = 3; var45.field_e.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_e[var29Lifetime5] = var38.g(-1772093437);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var46.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.g(-1772093437);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var58.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.g(-1772093437);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_e != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_e.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.d((byte) -99));
                var48.field_e[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_d) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_d.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.d((byte) -99) + (var19Lifetime4 + 1);
                var49.field_d[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.d((byte) -99);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var46.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.d((byte) -99) + (var19Lifetime5 + 1);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_A[var29Lifetime3] = (byte)(32 + var28 * this.field_A[var29Lifetime3] >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = var28 * (-var27Lifetime6Lifetime1 + var30) + (var30 - var27Lifetime6Lifetime1) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = sd.c(var32, -var27Lifetime6Lifetime1 + var30, -97);
                this.field_A[var33] = (byte)(var34 * this.field_A[var33] + 32 >> 6);
                var32 = var32 + (-var28 + var31);
              }
              var29Lifetime3Lifetime1 += 2;
              var27Lifetime6Lifetime1 = var30;
              var28 = var31;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; 128 > var30Lifetime2; var30Lifetime2++) {
              this.field_A[var30Lifetime2] = (byte)(this.field_A[var30Lifetime2] * var28 + 32 >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.d((byte) -99);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var58.length; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + var19Lifetime6 + var38.d((byte) -99);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28Lifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.field_w[var29Lifetime4]);
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_w[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var58.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) * var28Lifetime1 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = sd.c(var32Lifetime1, -var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, -81);
                var35 = var34Lifetime1 + (255 & this.field_w[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_w[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.field_w[var30Lifetime1Lifetime2]);
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_w[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_a = var38.d((byte) -99);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_d) {
              var50.field_b = var38.d((byte) -99);
            }
            if (var50.field_e != null) {
              var50.field_j = var38.d((byte) -99);
            }
            if (0 < var50.field_a) {
              var50.field_i = var38.d((byte) -99);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_k = var38.d((byte) -99);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_k > 0) {
              var51.field_c = var38.d((byte) -99);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_c > 0) {
              var52.field_h = var38.d((byte) -99);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("ng.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    static {
        field_E = "Quit";
        field_r = false;
        field_q = new byte[50][];
        field_y = "RuneScape clan";
        field_x = "Loading textures";
    }
}
