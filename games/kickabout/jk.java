/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends gn {
    private int[] field_q;
    byte[] field_p;
    static int[] field_g;
    byte[] field_k;
    static int field_f;
    static String field_i;
    static String field_o;
    static long[] field_m;
    short[] field_r;
    byte[] field_n;
    gl[] field_e;
    int field_j;
    to[] field_l;
    static int field_h;

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        if (param0 != 0) {
          field_g = (int[]) null;
        }
        var1 = nj.a(-128);
        var3 = var1 - pc.field_c;
        if (30000L < var3) {
          cv.field_d = 0;
          pc.field_c = var1;
          return true;
        }
        var5 = 3000;
        if (cv.field_d >= 7) {
          var5 = 12000;
        } else {
          if (cv.field_d < 5) {
            if (cv.field_d >= 3) {
              var5 = 6000;
            }
          } else {
            var5 = 9000;
          }
        }
        if ((long)var5 >= var3) {
          return false;
        }
        pc.field_c = var1;
        cv.field_d = cv.field_d + 1;
        return true;
    }

    final static void a(int param0) {
        int var3_int = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        gm var11 = null;
        gm var12 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var10 = Kickabout.field_G;
        try {
          if (!vl.field_d &&
            bm.field_I == 0) {
            return;
          }
          var1_int = -pq.field_Q.field_o + gp.field_i;
          var2 = hq.field_d;
          if (param0 != 16777215) {
            jk.a(32);
          }
          pq.field_Q.b(var1_int, var2, al.a(false, (byte) 51));
          if (tb.field_w != null) {
            pt.a(1 + var1_int + jt.field_yb, param0 ^ -16754303, 1 + var1_int, 1 + var2 + om.field_Bb, 1 + var2);
            for (var3_int = 0; 2 > var3_int; var3_int++) {
              if (mk.field_c != -2) {
                stackIn_17_0 = (var3_int != tb.field_w.field_g[mk.field_c].field_p) ? 0 : 1;
              } else {
                stackIn_17_0 = (var3_int != 0) ? 0 : 1;
              }
              var4 = stackIn_17_0;
              for (var5 = 0; var5 < 5; var5++) {
                var11 = (gm) (tb.field_w.field_P[var3_int][var5]);
                stackIn_22_0 = (var4 != 0) ? 2271999 : 16716032;
                var7 = stackIn_22_0;
                if (var5 == 0) {
                  var7 = 16776960;
                }
                var8 = var11.field_kb >> 16;
                var9 = var11.field_bb >> 16;
                if (ia.field_c) {
                  var8 = -var8 + 896;
                  var9 = -var9 + 1344;
                }
                var9 = 23 * var9 >> 8;
                var8 = var8 * 23 >> 8;
                on.d(var8 + (var1_int + 1), var9 + (1 + var2), 3, var7);
                on.c(var8 + var1_int + 1, var9 + 1 + var2, 3, 65793);
              }
            }
            var3 = (ob) (tb.field_w.field_V);
            var4Lifetime1 = var3.field_N >> 16;
            var5Lifetime1 = var3.field_E >> 16;
            if (tb.field_w.field_V.field_m != -1) {
              var12 = (gm) (tb.field_w.b((byte) -96));
              stackIn_34_0 = (!var12.b(false)) ? 40 : 30;
              var7Lifetime1 = stackIn_34_0;
              var5Lifetime1 = (var12.field_bb >> 16) + var12.field_n * var7Lifetime1;
              var4Lifetime1 = var12.field_j * var7Lifetime1 + (var12.field_kb >> 16);
            }
            if (ia.field_c) {
              var5Lifetime1 = -var5Lifetime1 + 1344;
              var4Lifetime1 = 896 - var4Lifetime1;
            }
            var5Lifetime1 = var5Lifetime1 * 23 >> 8;
            var4Lifetime1 = var4Lifetime1 * 23 >> 8;
            on.d(var4Lifetime1 + (1 + var1_int), var5Lifetime1 + (var2 + 1), 3, 16777215);
            on.c(var4Lifetime1 + 1 + var1_int, 1 + (var2 + var5Lifetime1), 3, 65793);
            ta.e(125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "jk.A(" + param0 + ')');
        }
    }

    final boolean a(rj param0, int[] param1, byte param2, byte[] param3) {
        int var8 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          if (param2 < 103) {
            this.field_e = (gl[]) null;
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_q[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) == 0) {
                    var7 = param0.b(10, var9 >> 2, param1);
                  } else {
                    var7 = param0.a(var9 >> 2, 10, param1);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_l[var8] = (to) (var7);
                  this.field_q[var8] = 0;
                }
              }
            }
          }
          stackIn_23_0 = var5_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("jk.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        we.field_a.a((byte) -124, (fd) (new nn()));
        if (param0 > -119) {
          jk.b(114);
        }
    }

    public static void f(byte param0) {
        field_o = null;
        field_m = null;
        field_i = null;
        field_g = null;
        if (param0 > -24) {
          jk.a(72);
        }
    }

    jk(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        gl dupTemp$8 = null;
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
        gl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        gl var15_ref = null;
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
        iw var38 = null;
        byte[] var39 = null;
        gl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gl var48 = null;
        gl var49 = null;
        gl var50 = null;
        gl var51 = null;
        gl var52 = null;
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
          this.field_e = new gl[128];
          this.field_l = new to[128];
          this.field_n = new byte[128];
          this.field_p = new byte[128];
          this.field_k = new byte[128];
          this.field_q = new int[128];
          this.field_r = new short[128];
          var38 = new iw(param0);
          for (var3 = 0; 0 != var38.field_f[var3 + var38.field_n]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.j((byte) -55);
          }
          var3++;
          var38.field_n = var38.field_n + 1;
          var5Lifetime1 = var38.field_n;
          var38.field_n = var38.field_n + var3;
          for (var6 = 0; var38.field_f[var6 + var38.field_n] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.j((byte) -124);
          }
          var6++;
          var38.field_n = var38.field_n + 1;
          var8Lifetime1 = var38.field_n;
          var38.field_n = var38.field_n + var6;
          for (var9 = 0; var38.field_f[var9 + var38.field_n] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.j((byte) -89);
          }
          var38.field_n = var38.field_n + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.h((byte) -126);
              if (var15_int != 0) {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new gl[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new gl();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.h((byte) -118);
            if (0 < var16_int) {
              var15_ref.field_m = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.h((byte) -117);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_b = new byte[2 + 2 * var16_intLifetime1];
              var40.field_b[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.h((byte) -105);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.h((byte) -121);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; 0 != var38.field_f[var17 + var38.field_n]; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.j((byte) -121);
          }
          var17++;
          var38.field_n = var38.field_n + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.h((byte) -125);
            this.field_r[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.h((byte) -124);
            this.field_r[var20Lifetime1] = (short)(this.field_r[var20Lifetime1] + (var19Lifetime2 << 8));
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
              var22 = var38.l(-35);
            }
            this.field_r[var23] = (short)(this.field_r[var23] + (qj.b(-1 + var22, 2) << 14));
            this.field_q[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_q[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_f[incrementValue$6] - 1;
              }
              this.field_p[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (this.field_q[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                if (var21Lifetime2 >= var56.length) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_f[incrementValue$4] + 16 << 2;
              }
              var20Lifetime4--;
              this.field_k[var25_int] = (byte)var24Lifetime1;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_q[var26] != 0) {
              if (0 == var20Lifetime5) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              var20Lifetime5--;
              this.field_e[var26] = (gl) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_q[var27] > 0) {
                var26Lifetime1 = 1 + var38.h((byte) -120);
              }
            }
            var20Lifetime6--;
            this.field_n[var27] = (byte)var26Lifetime1;
          }
          this.field_j = 1 + var38.h((byte) -106);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_m) {
              for (var29 = 1; var29 < var45.field_m.length; var29 += 2) {
                var45.field_m[var29] = var38.j((byte) -47);
              }
            }
            if (null != var45.field_b) {
              for (var29Lifetime5 = 3; -2 + var45.field_b.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_b[var29Lifetime5] = var38.j((byte) -79);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.j((byte) -121);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.j((byte) -82);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_b != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_b.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.h((byte) -114) + var19Lifetime3 + 1;
                var48.field_b[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_m != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_m.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 - (-1 - var38.h((byte) -107));
                var49.field_m[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.h((byte) -118);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 + 1 + var38.h((byte) -118);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_n[var29Lifetime3] = (byte)(this.field_n[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = var28 * (var30 - var27Lifetime6Lifetime1) + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = vc.a(var30 - var27Lifetime6Lifetime1, var32, (byte) -72);
                this.field_n[var33] = (byte)(var34 * this.field_n[var33] + 32 >> 6);
                var32 = var32 + (-var28 + var31);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_n[var30Lifetime2] = (byte)(var28 * this.field_n[var30Lifetime2] + 32 >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.h((byte) -115);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.h((byte) -115) + (1 + var19Lifetime6);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (this.field_k[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_k[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = vc.a(var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1, var32Lifetime1, (byte) -72);
                var35 = (255 & this.field_k[var37]) + var34Lifetime1;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_k[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.field_k[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_k[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_n = var38.h((byte) -111);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (var50.field_m != null) {
              var50.field_e = var38.h((byte) -120);
            }
            if (var50.field_b != null) {
              var50.field_l = var38.h((byte) -117);
            }
            if (var50.field_n > 0) {
              var50.field_g = var38.h((byte) -120);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_h = var38.h((byte) -118);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_h > 0) {
              var51.field_j = var38.h((byte) -114);
            }
          }
          for (var27Lifetime12 = 0; var12 > var27Lifetime12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_j > 0) {
              var52.field_k = var38.h((byte) -112);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("jk.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    static {
        field_o = "<%0> scores a goal, bringing their game against <%1> level at <%2> goal(s) each.";
        field_i = "Player names can be up to 12 letters, numbers and underscores";
        field_f = 0;
        field_g = new int[74];
        field_m = new long[]{52428L, 32768L, 63569L};
        field_g[37] = 2;
        field_g[57] = 5;
        field_g[66] = 5;
        field_g[63] = 5;
        field_g[1] = 0;
        field_g[5] = 2;
        field_g[41] = 2;
        field_g[33] = 1;
        field_g[34] = 2;
        field_g[12] = 0;
        field_g[31] = 1;
        field_g[19] = 0;
        field_g[50] = 4;
        field_g[62] = 5;
        field_g[61] = 5;
        field_g[27] = 1;
        field_g[53] = 4;
        field_g[47] = 3;
        field_g[22] = 1;
        field_g[48] = 3;
        field_g[56] = 5;
        field_g[72] = 5;
        field_g[71] = 5;
        field_g[23] = 1;
        field_g[14] = 0;
        field_g[58] = 5;
        field_g[20] = 0;
        field_g[4] = 2;
        field_g[43] = 2;
        field_g[6] = 2;
        field_g[70] = 5;
        field_g[7] = 1;
        field_g[13] = 0;
        field_g[26] = 1;
        field_g[9] = 1;
        field_g[17] = 0;
        field_g[8] = 1;
        field_g[2] = 0;
        field_g[15] = 0;
        field_g[68] = 5;
        field_g[69] = 5;
        field_g[3] = 0;
        field_g[28] = 1;
        field_g[40] = 2;
        field_g[24] = 1;
        field_g[59] = 5;
        field_g[29] = 1;
        field_g[38] = 2;
        field_g[0] = 5;
        field_g[36] = 2;
        field_g[42] = 2;
        field_g[11] = 0;
        field_g[60] = 5;
        field_g[44] = 2;
        field_g[64] = 5;
        field_g[52] = 4;
        field_g[18] = 0;
        field_g[25] = 1;
        field_g[35] = 2;
        field_g[39] = 2;
        field_g[30] = 1;
        field_g[54] = 5;
        field_g[73] = 5;
        field_g[32] = 1;
        field_g[65] = 5;
        field_g[55] = 5;
        field_g[21] = 0;
        field_g[10] = 0;
        field_g[45] = 2;
        field_g[16] = 0;
        field_g[49] = 3;
        field_g[46] = 3;
        field_g[51] = 4;
        field_g[67] = 5;
        field_h = 0;
    }
}
