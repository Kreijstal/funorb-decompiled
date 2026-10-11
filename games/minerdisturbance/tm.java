/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends pi {
    private int field_F;
    private int field_y;
    private int field_n;
    private int field_H;
    static int field_v;
    private int field_A;
    private int field_z;
    private String[] field_t;
    private int field_r;
    private int field_C;
    private int field_J;
    private int field_o;
    private int field_p;
    private int field_w;
    private int field_E;
    int field_s;
    static byte[][] field_u;
    private int field_D;
    private int field_q;
    static int field_I;
    private int field_G;
    private boolean field_B;
    private float field_x;

    public static void a(byte param0) {
        try {
          field_u = (byte[][]) null;
          if (param0 >= -60) {
            field_I = 32;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "tm.F(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8) {
            this.field_B = true;
          }
          stackIn_7_0 = !(!(1.0f <= this.field_x));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.A(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        try {
          this.field_p = db.field_d;
          this.field_E = li.field_c;
          if (param0) {
            this.field_A = -66;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "tm.E(" + param0 + ')');
        }
    }

    final static void a(pb param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
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
        int var30 = 0;
        int stackIn_61_0Lifetime1;
        int stackIn_61_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = MinerDisturbance.field_ab;
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
          var13 = var26 * param3[5] + (var24 * param3[3] + param3[4] * var25) >> 14;
          var12 = param3[3] * var21 + (param3[4] * var22 + param3[5] * var23) >> 14;
          var29 = param2[11] >> 2;
          var17 = param3[6] * var27 + param3[7] * var28 + var29 * param3[8] >> 14;
          var18 = var23 * param3[11] + (var21 * param3[9] + param3[10] * var22) >> 14;
          var19 = var24 * param3[9] - (-(var25 * param3[10]) - param3[11] * var26) >> 14;
          var15 = param3[7] * var22 + param3[6] * var21 + param3[8] * var23 >> 14;
          var20 = var29 * param3[11] + var27 * param3[9] + param3[10] * var28 >> 14;
          var14 = param3[3] * var27 + var28 * param3[4] + param3[5] * var29 >> 14;
          var16 = var26 * param3[8] + (param3[6] * var24 + var25 * param3[7]) >> 14;
          var21Lifetime1 = -param2[0] + param3[0];
          var22Lifetime1 = param3[1] - param2[1];
          var23Lifetime1 = param3[2] - param2[2];
          var9 = var23Lifetime1 * param2[5] + (var22Lifetime1 * param2[4] + param2[3] * var21Lifetime1) >> -ml.field_d + 16;
          var11 = param2[10] * var22Lifetime1 + var21Lifetime1 * param2[9] + var23Lifetime1 * param2[11] >> 16;
          var10 = var22Lifetime1 * param2[7] + var21Lifetime1 * param2[6] + param2[8] * var23Lifetime1 >> -ml.field_d + 16;
          var21Lifetime2 = dj.field_d;
          var22Lifetime2 = dj.field_c;
          if (param1 != -363953584) {
            field_I = 80;
          }
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_y > var23Lifetime2) {
              var24Lifetime1 = param0.field_n[var23Lifetime2];
              var25Lifetime1 = param0.field_M[var23Lifetime2];
              var26Lifetime1 = param0.field_Q[var23Lifetime2];
              var27Lifetime1 = var9 + (var26Lifetime1 * var18 + var24Lifetime1 * var12 + var25Lifetime1 * var15 >> 16 - ml.field_d);
              var28Lifetime1 = var10 + (var19 * var26Lifetime1 + var24Lifetime1 * var13 + var25Lifetime1 * var16 >> 16 - ml.field_d);
              var29Lifetime1 = (var17 * var25Lifetime1 + var14 * var24Lifetime1 + var20 * var26Lifetime1 >> 16) + var11;
              stackIn_61_0 = var29Lifetime1;
              stackIn_61_1 = 50;
              if (var30 != 0) {
                if (stackIn_61_0 < stackIn_61_1) {
                  stackIn_70_0 = fb.field_b.length;
                  stackIn_70_1 = var18;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_61_0 >= stackIn_61_1) {
                  wa.field_d[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  ti.field_O[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  oc.field_l[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  oc.field_l[var23Lifetime2] = -2147483648;
                }
                if (param5) {
                  kk.field_b[var23Lifetime2] = var27Lifetime1 >> ml.field_d;
                  dm.field_d[var23Lifetime2] = var28Lifetime1 >> ml.field_d;
                  nf.field_d[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param0.field_b != null &&
                null != param0.field_D &&
                null != param0.field_o &&
                null != param0.field_p &&
                null != param0.field_N &&
                null != param0.field_S &&
                param0.field_m != null &&
                null != param0.field_L &&
                param0.field_k != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param0.field_I)) {
                  var24Lifetime1Lifetime1 = param0.field_b[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_D[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_o[var23Lifetime2];
                  sd.field_g[var23Lifetime2] = var9 + (var25Lifetime1Lifetime1 * var15 + var24Lifetime1Lifetime1 * var12 + var18 * var26Lifetime1Lifetime1 >> 16);
                  kk.field_c[var23Lifetime2] = (var16 * var25Lifetime1Lifetime1 + (var24Lifetime1Lifetime1 * var13 + var19 * var26Lifetime1Lifetime1) >> 16) + var10;
                  mj.field_n[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + (var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param0.field_p[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_N[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_S[var23Lifetime2];
                  bl.field_z[var23Lifetime2] = (var24Lifetime1Lifetime1 * var12 + (var25Lifetime1Lifetime1 * var15 + var18 * var26Lifetime1Lifetime1) >> 16) + var9;
                  jc.field_F[var23Lifetime2] = var10 + (var13 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var16 + var19 * var26Lifetime1Lifetime1 >> 16);
                  id.field_b[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 + var17 * var25Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1 >> 16);
                  var24Lifetime1Lifetime1 = param0.field_m[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_L[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_k[var23Lifetime2];
                  qg.field_n[var23Lifetime2] = var9 + (var15 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var12 + var18 * var26Lifetime1Lifetime1 >> 16);
                  pk.field_f[var23Lifetime2] = (var25Lifetime1Lifetime1 * var16 + var13 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var19 >> 16) + var10;
                  wc.field_a[var23Lifetime2] = (var20 * var26Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var17 + var24Lifetime1Lifetime1 * var14 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param4))) {
                var9 = param3[3];
                var10 = param3[4];
                var11 = param3[5];
                var12 = param3[6];
                var13 = param3[7];
                var14 = param3[8];
                var15 = param3[9];
                var16 = param3[10];
                var17 = param3[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_61_0Lifetime1 = var18;
                  stackIn_61_1Lifetime1 = param0.field_g;
                  if (stackIn_61_0Lifetime1 >= stackIn_61_1Lifetime1) {
                    break;
                  }
                  stackIn_70_0 = fb.field_b.length;
                  stackIn_70_1 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_70_0 <= stackIn_70_1) {
                    break;
                  }
                  var19 = param0.field_C[var18];
                  var20 = param0.field_q[var18];
                  var21Lifetime2 = param0.field_B[var18];
                  fb.field_b[var18] = var15 * var21Lifetime2 + (var20 * var12 + var9 * var19) >> 16;
                  sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21Lifetime2) >> 16;
                  h.field_a[var18] = var17 * var21Lifetime2 + (var14 * var20 + var19 * var11) >> 16;
                  var18++;
                }
              }
            }
            stackIn_70_0 = param6 ? 1 : 0;
            stackIn_70_1 = var7_int;
            break;
          }
          ri.a(stackIn_70_0 != 0, stackIn_70_1, var8, param0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_75_0 = var7;
          stackIn_75_1 = new StringBuilder().append("tm.D(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            return true;
          }
          var2_int = -li.field_c + this.field_E;
          var3 = -db.field_d + this.field_p;
          var4 = var2_int + this.field_z;
          var5 = this.field_C + var3;
          stackIn_25_0 = ((!(this.field_q >= 0) &&
            !(this.field_B)) ||
            ((this.field_x >= 1.0f) &&
            (!(var4 >= -405) ||
            !(var4 <= 640) ||
            !(var5 <= 480) ||
            !(var5 >= -40 - this.field_A))));
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.C(" + param0 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        try {
          var3_float = 1.0f - this.field_x;
          var4 = var3_float * var3_float;
          this.field_z = (int)(0.5f + (this.field_x * 2.0f * var3_float * (float)this.field_w + var4 * (float)this.field_y + this.field_x * this.field_x * (float)this.field_o));
          this.field_C = (int)(0.5f + ((float)this.field_r * (this.field_x * this.field_x) + (var4 * (float)this.field_H + (float)this.field_n * (this.field_x * 2.0f * var3_float))));
          this.field_x = this.field_x + 0.019999999552965164f;
          this.field_G = this.field_G + this.field_F;
          if (param1 < 21) {
            tm.a((pb) null, 112, (int[]) null, (int[]) null, true, false, true);
          }
          this.field_q = this.field_q - 1;
          if (1.0f < this.field_x) {
            this.field_x = 1.0f;
          }
          if (1 <= this.field_G) {
            if (this.field_G < 255) {
              return;
            }
            this.field_F = -10;
            this.field_G = 255;
            if (MinerDisturbance.field_ab == 0) {
              return;
            }
          }
          this.field_F = 10;
          this.field_G = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "tm.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        var28 = MinerDisturbance.field_ab;
        try {
          if (!d.field_b) {
            return;
          }
          var2_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
          if (350 + this.field_A > 470) {
          }
          if (this.field_D > 0 &&
            this.field_J > 0) {
            ef.field_b[3].a(-li.field_c + (this.field_D - ef.field_b[3].field_x), (ef.field_b[3].field_A >> 2) + (this.field_J - db.field_d), ~this.field_G | this.field_G << 12);
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = -li.field_c + this.field_E;
          var4 = -db.field_d + this.field_p;
          var5 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
          var6 = -db.field_d + 32 * hf.field_t + mf.field_i / 10;
          var7 = 360;
          if (var5 > (-96 + (this.field_z + var3) - 32) &&
            (45 + (this.field_z + var3 - (-var7 - 96))) > var5 &&
            var6 > -128 + (var4 + this.field_C) &&
            40 + this.field_A + (this.field_C + var4 + 96) > var6 && (!this.field_B ||
            this.field_x < 1.0f)) {
            stackIn_29_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_29_0 = 0;
          }
          boolean decompiledFrameCompleted0 = true;
          var8 = stackIn_29_0;
          if (var8 != 0) {
            var9 = 0;
            var10 = a.field_a[0].field_x >> 1;
            var11 = a.field_a[0].field_A >> 1;
            var12 = var10 + var5 + 96;
            var13 = var11 + var6 + 96;
            var14 = var11 + var6 - 96;
            var15 = var10 + var5 - 96;
            var16 = 0;
            if (var15 < 0) {
              var16 = var15 * -1;
              var15 = 0;
            }
            var17 = 0;
            if (var14 < 0) {
              var14 = 0;
            }
            if (eh.field_g - 1 < var12) {
              var17 = var12 + 1 - eh.field_g;
              var12 = -1 + eh.field_g;
            }
            if (var14 > -1 + eh.field_c) {
              var14 = eh.field_c - 1;
            }
            while (var14 < var13) {
              var9 = var9 + var16;
              stackIn_53_0 = var15;
              if (var28 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var18 = stackIn_53_0;
              while (var18 < var12) {
                incrementValue$0 = var9;
                var9++;
                m.field_j[incrementValue$0] = eh.field_f[var14 * eh.field_g + var18];
                var18++;
              }
              var9 = var9 + var17;
              var14++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_53_0 = this.field_B ? 1 : 0;
          }
          if (stackIn_53_0 != 0) {
            var9Lifetime1 = var7 + 60;
            var9Lifetime1 = var9Lifetime1 - (ah.field_c[2].field_x + ah.field_c[0].field_x);
            var10Lifetime1 = this.field_A + 60;
            var9Lifetime1 = var9Lifetime1 / ah.field_c[1].field_x * ah.field_c[1].field_x;
            var9Lifetime1 = var9Lifetime1 + (ah.field_c[2].field_x + ah.field_c[0].field_x);
            var10Lifetime1 = var10Lifetime1 - (ah.field_c[0].field_A + ah.field_c[6].field_A);
            var10Lifetime1 = (var10Lifetime1 / ah.field_c[3].field_A + 1) * ah.field_c[3].field_A;
            if ((var7 + 60) > var9Lifetime1) {
              var9Lifetime1 = var9Lifetime1 + ah.field_c[1].field_x;
            }
            var10Lifetime1 = var10Lifetime1 + (ah.field_c[0].field_A + ah.field_c[6].field_A);
            if (this.field_A + 60 > var10Lifetime1) {
              var10Lifetime1 = var10Lifetime1 + ah.field_c[1].field_A;
            }
            var11Lifetime1 = 60 + var7 - var9Lifetime1;
            var12Lifetime1 = -var10Lifetime1 + 60 + this.field_A;
            g.a(this.field_C + var4 + var12Lifetime1 / 2, var10Lifetime1, var3 + (this.field_z + var11Lifetime1 / 2), var9Lifetime1, (byte) 31, ah.field_c);
          }
          if (stackIn_53_0 == 0 ||
            var28 != 0) {
            g.a(var4 + this.field_C, 60 + this.field_A, var3 + this.field_z, var7 + 60, (byte) 93, hd.field_d);
          }
          var9Lifetime2 = 0;
          var10Lifetime2 = 30 + this.field_z + var3;
          var11Lifetime2 = var4 + (40 + this.field_C);
          var12Lifetime2 = 0;
          if (this.field_B) {
            var12Lifetime2 = mm.field_a.field_I + mm.field_a.field_E;
            mm.field_a.a(oe.field_f, var10Lifetime2, var11Lifetime2, 1, 8063303);
          }
          var13Lifetime1 = 0;
          if (param0 != 94) {
            return;
          }
          while (true) {
            if (this.field_t.length <= var13Lifetime1) {
              var13Lifetime1 = 0;
              stackIn_99_0 = -4;
              stackIn_99_1 = ~this.field_s;
              break;
            }
            stackIn_99_0 = 3;
            stackIn_99_1 = this.field_s;
            if (var28 == 0) {
              if (stackIn_99_0 == stackIn_99_1 &&
                1 < var13Lifetime1 &&
                5 > var13Lifetime1 ||
                (16 == this.field_s ||
                this.field_s == 13 ||
                this.field_s == 0 ||
                2 == this.field_s ||
                this.field_s == 9)) {
                var7 = 313;
              } else {
                var7 = 360;
              }
              ce.field_d.a(this.field_t[var13Lifetime1], -var7 + 360 + var10Lifetime2, var12Lifetime2 + var9Lifetime2 * var2_int + var11Lifetime2 - ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var2_int);
              var9Lifetime2 = var9Lifetime2 + ce.field_d.a(this.field_t[var13Lifetime1], var7);
              var13Lifetime1++;
              continue;
            }
            break;
          }
          boolean decompiledFrameRemainder1 = true;
          if (stackIn_99_0 == stackIn_99_1) {
            fl.field_j[7].c(var10Lifetime2, var11Lifetime2 + 35);
          }
          if (stackIn_99_0 != stackIn_99_1 ||
            var28 != 0) {
            if (this.field_s == 9) {
              fl.field_j[3].c(var10Lifetime2, 35 + var11Lifetime2);
              var13Lifetime1 = fl.field_j[3].field_j;
              decompiledFrameRemainder1 = (var28 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (this.field_s != 2) {
                if (0 == this.field_s ||
                  16 == this.field_s) {
                  fl.field_j[5].c(var10Lifetime2, var11Lifetime2 + 20);
                  var13Lifetime1 = fl.field_j[5].field_j;
                  decompiledFrameRemainder1 = (var28 != 0);
                }
                if ((decompiledFrameRemainder1) &&
                  (this.field_s == 13)) {
                  fl.field_j[9].c(var10Lifetime2, 15 + var11Lifetime2);
                  var13Lifetime1 = fl.field_j[9].field_j;
                  if (var28 != 0) {
                    fl.field_j[8].c(var10Lifetime2, var11Lifetime2);
                    var13Lifetime1 = fl.field_j[8].field_j;
                  }
                }
              } else {
                fl.field_j[8].c(var10Lifetime2, var11Lifetime2);
                var13Lifetime1 = fl.field_j[8].field_j;
              }
            }
          }
          if (this.field_B) {
            ce.field_d.a(ni.field_b, var10Lifetime2, (1 + var9Lifetime2) * var2_int + var11Lifetime2 + var12Lifetime2, 1, -1);
            if (var28 != 0) {
              ce.field_d.a(aj.field_a, var10Lifetime2, var12Lifetime2 + (var11Lifetime2 + var2_int * (var9Lifetime2 + 1)), 1, -1);
              ce.field_d.c(qe.field_d, -15 + (var10Lifetime2 + var7 + var13Lifetime1), var11Lifetime2 - (-(var2_int * (var9Lifetime2 + 1)) - var12Lifetime2), 1, -1);
              ce.field_d.c(Integer.toString(this.field_q / 100), var13Lifetime1 + (var7 + var10Lifetime2), var11Lifetime2 - (-(var2_int * (1 + var9Lifetime2)) - var12Lifetime2), 1, -1);
            }
          } else {
            ce.field_d.a(aj.field_a, var10Lifetime2, var12Lifetime2 + (var11Lifetime2 + var2_int * (var9Lifetime2 + 1)), 1, -1);
            ce.field_d.c(qe.field_d, -15 + (var10Lifetime2 + var7 + var13Lifetime1), var11Lifetime2 - (-(var2_int * (var9Lifetime2 + 1)) - var12Lifetime2), 1, -1);
            ce.field_d.c(Integer.toString(this.field_q / 100), var13Lifetime1 + (var7 + var10Lifetime2), var11Lifetime2 - (-(var2_int * (1 + var9Lifetime2)) - var12Lifetime2), 1, -1);
          }
          if (var8 != 0) {
            var14Lifetime1 = 0;
            var15Lifetime1 = a.field_a[0].field_x >> 1;
            var16Lifetime1 = a.field_a[0].field_A >> 1;
            var17Lifetime1 = var15Lifetime1 + (var5 + 96);
            var18Lifetime1 = var16Lifetime1 + (var6 + 96);
            var19 = var16Lifetime1 + (-96 + var6);
            var20 = var15Lifetime1 + var5 - 96;
            var21 = 0;
            if (var20 < 0) {
              var21 = var20 * -1;
              var20 = 0;
            }
            var22 = 0;
            if (-1 + eh.field_g < var17Lifetime1) {
              var22 = -eh.field_g + 1 + var17Lifetime1;
              var17Lifetime1 = -1 + eh.field_g;
            }
            if (0 > var19) {
              var19 = 0;
            }
            if (eh.field_c - 1 < var19) {
              var19 = -1 + eh.field_c;
            }
            while (true) {
              if (var19 >= var18Lifetime1) {
                return;
              }
              var14Lifetime1 = var14Lifetime1 + var21;
              if (var28 != 0) {
                return;
              }
              var23 = var20;
              while (var17Lifetime1 > var23) {
                var24 = ec.field_b[var14Lifetime1];
                var25 = -var24 + 256;
                var26 = eh.field_f[eh.field_g * var19 + var23];
                incrementValue$1 = var14Lifetime1;
                var14Lifetime1++;
                var27 = m.field_j[incrementValue$1];
                eh.field_f[var23 + eh.field_g * var19] = c.a(16711680, var24 * c.a(var27, 65280) + c.a(var26, 65280) * var25) + c.a(-16711936, var25 * c.a(var26, 16711935) + c.a(var27, 16711935) * var24) >> 8;
                var23++;
              }
              var14Lifetime1 = var14Lifetime1 + var22;
              var19++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.G(" + param0 + ')');
        }
    }

    tm(int param0, int param1, int param2, boolean param3) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          if (e.field_i[param0].length == 1) {
            this.field_t = e.field_i[param0][0];
            if (var10 != 0) {
              this.field_t = e.field_i[param0][cm.field_o];
            }
          } else {
            this.field_t = e.field_i[param0][cm.field_o];
          }
          if (null == this.field_t) {
            return;
          }
          this.field_J = param2;
          this.field_q = 2000;
          this.field_x = 0.0f;
          this.field_s = param0;
          this.field_D = param1;
          this.field_B = param3;
          var5_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
          var6 = 360;
          if (this.field_s == 9 ||
            this.field_s == 2 ||
            this.field_s == 0 ||
            this.field_s == 16 ||
            this.field_s == 13) {
            var6 = 313;
          }
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 >= this.field_t.length))) {
            stackIn_37_0 = this.field_s;
            stackIn_37_1 = 3;
            if (var10 == 0) {
              if (stackIn_37_0 == stackIn_37_1 &&
                var7 > 1) {
                var6 = 320;
              }
              this.field_A = this.field_A + ce.field_d.a(this.field_t[var7], var6);
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_A = this.field_A + ce.field_d.a(uf.field_v, var6);
            this.field_A = this.field_A * var5_int;
            this.field_A = this.field_A + 10;
            if (this.field_B) {
              this.field_A = this.field_A + (mm.field_a.field_E + mm.field_a.field_I);
            }
            var7 = 380;
            stackIn_37_0 = 0;
            stackIn_37_1 = param1;
          }
          if (stackIn_37_0 >= stackIn_37_1) {
            param1 = 320;
          }
          if (stackIn_37_0 < stackIn_37_1 ||
            var10 != 0) {
            param1 = param1 - li.field_c;
          }
          var8 = 20 + this.field_A;
          var9 = -var8 + (-64 + 32 * hf.field_t) - db.field_d;
          this.field_o = 32 * ca.field_k - li.field_c - 180;
          if (!(db.field_d + var9 >= 32) ||
            this.field_B) {
            var9 = 64 + (32 * hf.field_t - db.field_d);
          }
          this.field_z = -var7;
          this.field_C = 480 + var8;
          boolean decompiledSharedTail0 = !(this.field_o < 0);
          if (!decompiledSharedTail0) {
            this.field_o = 64;
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.field_o > (1024 - li.field_c - 405))) {
            this.field_o = -li.field_c + 555;
          }
          this.field_H = this.field_C;
          this.field_y = this.field_z;
          this.field_r = var9;
          this.field_w = 180 + (this.field_r + this.field_z);
          this.field_E = li.field_c;
          this.field_p = db.field_d;
          this.field_n = this.field_C + this.field_o + this.field_A / 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "tm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_u = new byte[250][];
    }
}
