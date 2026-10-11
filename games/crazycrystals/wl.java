/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends ij {
    volatile boolean field_n;
    boolean field_q;
    boolean field_l;
    static volatile boolean field_m;
    static dl[][] field_p;
    static dl field_o;

    abstract byte[] e(int param0);

    final static void a(int[] param0, jg param1, int param2, boolean param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        var30 = CrazyCrystals.field_B;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var12 = param5[5] * var23 + param5[4] * var22 + param5[3] * var21 >> 14;
          var29 = param0[11] >> 2;
          var13 = param5[3] * var24 + (var25 * param5[4] + var26 * param5[5]) >> 14;
          var14 = var29 * param5[5] + (param5[3] * var27 + param5[4] * var28) >> 14;
          var20 = var29 * param5[11] + param5[10] * var28 + param5[9] * var27 >> 14;
          var19 = var24 * param5[param2] - (-(var25 * param5[10]) - param5[11] * var26) >> 14;
          var16 = param5[8] * var26 + var25 * param5[7] + param5[6] * var24 >> 14;
          var18 = param5[9] * var21 - (-(var22 * param5[10]) - param5[11] * var23) >> 14;
          var17 = var29 * param5[8] + (var27 * param5[6] + var28 * param5[7]) >> 14;
          var15 = var21 * param5[6] + var22 * param5[7] + param5[8] * var23 >> 14;
          var21 = -param0[0] + param5[0];
          var22 = param5[1] - param0[1];
          var23 = param5[2] - param0[2];
          var9 = var23 * param0[5] + (var21 * param0[3] + var22 * param0[4]) >> 16 - li.field_c;
          var11 = param0[9] * var21 + (param0[10] * var22 + var23 * param0[11]) >> 16;
          var10 = var23 * param0[8] + param0[6] * var21 + var22 * param0[7] >> 16 - li.field_c;
          var21 = nb.field_h;
          var22 = nb.field_f;
          var23 = 0;
          L1: while (true) {
            if (var23 < param1.field_n) {
              var24 = param1.field_L[var23];
              var25 = param1.field_G[var23];
              var26 = param1.field_b[var23];
              var27 = (var15 * var25 + var12 * var24 + var26 * var18 >> 16 - li.field_c) + var9;
              var28 = var10 + (var19 * var26 + var25 * var16 + var13 * var24 >> 16 - li.field_c);
              var29 = var11 + (var26 * var20 + var14 * var24 + var25 * var17 >> 16);
              stackIn_62_0 = ~var29;
              stackIn_62_1 = -51;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  if (cf.field_b.length <= var18) {
                    break L1;
                  }
                  var19 = param1.field_a[var18];
                  var20 = param1.field_N[var18];
                  var21 = param1.field_u[var18];
                  cf.field_b[var18] = var15 * var21 + var12 * var20 + var9 * var19 >> 16;
                  jp.field_a[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
                  vm.field_d[var18] = var19 * var11 - (-(var14 * var20) - var21 * var17) >> 16;
                  var18++;
                  break L1;
                }
                break L1;
              }
              if (stackIn_62_0 > stackIn_62_1) {
                cf.field_g[var23] = -2147483648;
              } else {
                dn.field_a[var23] = var21 + var27 / var29;
                qk.field_E[var23] = var28 / var29 + var22;
                cf.field_g[var23] = var29;
                if (var29 > var8) {
                  var8 = var29;
                }
                if (var29 < var7_int) {
                  var7_int = var29;
                }
              }
              if (param3) {
                gl.field_d[var23] = var27 >> li.field_c;
                qm.field_q[var23] = var28 >> li.field_c;
                ff.field_b[var23] = var29;
              }
              var23++;
              continue;
            }
            boolean decompiledFrameCompleted0 = true;
            if (param1.field_P != null &&
              null != param1.field_f &&
              null != param1.field_H &&
              null != param1.field_q &&
              param1.field_d != null &&
              param1.field_M != null &&
              null != param1.field_z &&
              param1.field_m != null &&
              param1.field_y != null) {
              var23 = 0;
              while (!(param1.field_I <= var23)) {
                var24 = param1.field_P[var23];
                var25 = param1.field_f[var23];
                var26 = param1.field_H[var23];
                qa.field_i[var23] = (var12 * var24 - (-(var15 * var25) - var18 * var26) >> 16) + var9;
                fh.field_k[var23] = var10 + (var25 * var16 + var24 * var13 + var19 * var26 >> 16);
                vg.field_b[var23] = (var14 * var24 - (-(var17 * var25) - var26 * var20) >> 16) + var11;
                var24 = param1.field_q[var23];
                var25 = param1.field_d[var23];
                var26 = param1.field_M[var23];
                ol.field_C[var23] = (var15 * var25 + (var12 * var24 + var26 * var18) >> 16) + var9;
                ud.field_bb[var23] = (var24 * var13 + var16 * var25 + var26 * var19 >> 16) + var10;
                ol.field_y[var23] = var11 + (var26 * var20 + var14 * var24 + var17 * var25 >> 16);
                var24 = param1.field_z[var23];
                var25 = param1.field_m[var23];
                var26 = param1.field_y[var23];
                hp.field_q[var23] = (var18 * var26 + var25 * var15 + var24 * var12 >> 16) + var9;
                vf.field_e[var23] = var10 + (var25 * var16 + (var13 * var24 + var19 * var26) >> 16);
                d.field_a[var23] = (var25 * var17 + var24 * var14 + var26 * var20 >> 16) + var11;
                var23++;
                if (var30 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (!param6) {
                break L1;
              }
              var9 = param5[3];
              var10 = param5[4];
              var11 = param5[5];
              var12 = param5[6];
              var13 = param5[7];
              var14 = param5[8];
              var15 = param5[9];
              var16 = param5[10];
              var17 = param5[11];
            }
            var18 = 0;
            do {
              stackIn_62_0 = var18;
              stackIn_62_1 = param1.field_D;
              if (stackIn_62_0 >= stackIn_62_1) {
                break;
              }
              if (cf.field_b.length <= var18) {
                break;
              }
              var19 = param1.field_a[var18];
              var20 = param1.field_N[var18];
              var21 = param1.field_u[var18];
              cf.field_b[var18] = var15 * var21 + var12 * var20 + var9 * var19 >> 16;
              jp.field_a[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
              vm.field_d[var18] = var19 * var11 - (-(var14 * var20) - var21 * var17) >> 16;
              var18++;
            } while (var30 == 0);
            break;
          }
          ok.a(param1, var7_int, (byte) -119, param4, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("wl.K(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param6).append(')').toString());
        }
    }

    wl() {
        this.field_n = true;
    }

    final static dl[] a(int param0, int param1, db param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        dl[] stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 53) {
            wl.a((byte) 54);
          }
          if (gm.a(param2, param0, true, param1)) {
            stackIn_7_0 = mm.a(71);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (dl[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wl.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] a(byte param0) {
        RuntimeException var1 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -26) {
            field_m = false;
          }
          stackIn_4_0 = new int[8];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wl.L(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          sm.field_j = (63 & param1) >> 4;
          j.field_j = (param1 & 13) >> 2;
          if (sm.field_j > 2) {
            sm.field_j = 2;
          }
          if (j.field_j > 2) {
            j.field_j = 2;
          }
          no.field_m = 3 & param1;
          if (no.field_m > 2) {
            no.field_m = 2;
          }
          if (param0 != 7) {
            field_o = (dl) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "wl.N(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
          field_p = (dl[][]) null;
          field_o = null;
          if (param0 >= -38) {
            wl.a((byte) 90);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wl.M(" + param0 + ')');
        }
    }

    abstract int b(byte param0);

    final static dl a(String param0, db param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dl stackIn_2_0 = null;
        dl stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param3, -1);
          if (param2 != 10) {
            stackIn_2_0 = (dl) null;
            return stackIn_2_0;
          }
          var5 = param1.a(-2862, param0, var4_int);
          stackIn_4_0 = sj.a(var5, var4_int, param1, 28);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wl.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_m = false;
    }
}
