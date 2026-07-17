/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts extends da {
    private int[] field_e;
    private kj field_f;
    private int[] field_j;
    private int[] field_h;
    private int[] field_i;
    private byte[][] field_g;

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        Object var16 = null;
        nj var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
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
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var16 = null;
          var16_ref = (nj) (Object) param12;
          var34 = var16_ref.field_h;
          var33 = var34;
          var32 = var33;
          var31 = var32;
          var17 = var31;
          var18 = var16_ref.field_g;
          var19 = param9 - ((ts) this).field_f.field_z;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * ((ts) this).field_f.field_f;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var34.length >= param10 + param6) {
            stackOut_4_0 = param10 + param6;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param14 + var34.length;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var21 = stackIn_5_0;
        var22 = var20;
        L2: while (true) {
          if (var22 >= var21) {
            return;
          } else {
            L3: {
              var23 = var17[var22 - param14] + param13;
              var24 = var18[var22 - param14];
              var25 = param5;
              if (var19 <= var23) {
                var26 = var23 - var19;
                if (var26 < param5) {
                  param3 = param3 + var26;
                  var25 = var25 - var26;
                  param4 = param4 + var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              } else {
                var26 = var19 - var23;
                if (var26 < var24) {
                  var24 = var24 - var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              }
            }
            L4: {
              var26 = 0;
              if (var25 >= var24) {
                var26 = var25 - var24;
                break L4;
              } else {
                var24 = var25;
                break L4;
              }
            }
            var27 = -var24;
            L5: while (true) {
              if (var27 >= 0) {
                param3 = param3 + (var26 + param8);
                param4 = param4 + (var26 + param7);
                var22++;
                continue L2;
              } else {
                int incrementValue$2 = param3;
                param3++;
                var28 = param0[incrementValue$2] & 255;
                if (var28 == 0) {
                  param4++;
                  var27++;
                  continue L5;
                } else {
                  var29 = ((param2 & 16711935) * var28 & -16711936) + ((param2 & 65280) * var28 & 16711680) >> 8;
                  var28 = 256 - var28;
                  var30 = param1[param4];
                  int incrementValue$3 = param4;
                  param4++;
                  param1[incrementValue$3] = (((var30 & 16711935) * var28 & -16711936) + ((var30 & 65280) * var28 & 16711680) >> 8) + var29;
                  var27++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        if (param5 != null) {
          L0: {
            param1 = param1 + ((ts) this).field_h[param0];
            param2 = param2 + ((ts) this).field_i[param0];
            var9 = ((ts) this).field_e[param0];
            var10 = ((ts) this).field_j[param0];
            var11 = ((ts) this).field_f.field_f;
            var12 = param1 + param2 * var11;
            var13 = var11 - var9;
            var14 = 0;
            var15 = 0;
            if (param2 >= ((ts) this).field_f.field_w) {
              break L0;
            } else {
              var16 = ((ts) this).field_f.field_w - param2;
              var10 = var10 - var16;
              param2 = ((ts) this).field_f.field_w;
              var15 = var15 + var16 * var9;
              var12 = var12 + var16 * var11;
              break L0;
            }
          }
          L1: {
            if (param2 + var10 <= ((ts) this).field_f.field_D) {
              break L1;
            } else {
              var10 = var10 - (param2 + var10 - ((ts) this).field_f.field_D);
              break L1;
            }
          }
          L2: {
            if (param1 >= ((ts) this).field_f.field_z) {
              break L2;
            } else {
              var16 = ((ts) this).field_f.field_z - param1;
              var9 = var9 - var16;
              param1 = ((ts) this).field_f.field_z;
              var15 = var15 + var16;
              var12 = var12 + var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L2;
            }
          }
          L3: {
            if (param1 + var9 <= ((ts) this).field_f.field_k) {
              break L3;
            } else {
              var16 = param1 + var9 - ((ts) this).field_f.field_k;
              var9 = var9 - var16;
              var14 = var14 + var16;
              var13 = var13 + var16;
              break L3;
            }
          }
          L4: {
            if (var9 <= 0) {
              break L4;
            } else {
              if (var10 > 0) {
                this.a(((ts) this).field_g[param0], ((ts) this).field_f.field_E, param3, var15, var12, var9, var10, var13, var14, param1, param2, ((ts) this).field_e[param0], param5, param6, param7);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          ((ts) this).fa(param0, param1, param2, param3, param4);
          return;
        }
    }

    ts(kj param0, vs param1, vd[] param2, int[] param3, int[] param4) {
        super((ha) (Object) param0, param1);
        int var6 = 0;
        vd var7 = null;
        byte[] var14 = null;
        byte[] var9 = null;
        int var10 = 0;
        ((ts) this).field_f = param0;
        ((ts) this).field_f = param0;
        ((ts) this).field_e = param3;
        ((ts) this).field_j = param4;
        ((ts) this).field_g = new byte[param2.length][];
        ((ts) this).field_i = new int[param2.length];
        ((ts) this).field_h = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            var7 = param2[var6];
            if (var7.field_e != null) {
                ((ts) this).field_g[var6] = var7.field_e;
            } else {
                var14 = var7.field_d;
                ((ts) this).field_g[var6] = new byte[var14.length];
                var9 = new byte[var14.length];
                for (var10 = 0; var10 < var14.length; var10++) {
                    var9[var10] = (byte)(var14[var10] == 0 ? 0 : -1);
                }
            }
            ((ts) this).field_i[var6] = var7.field_i;
            ((ts) this).field_h[var6] = var7.field_a;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                var12 = param0[incrementValue$66] & 255;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
                  var12 = 256 - var12;
                  var14 = param1[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param1[incrementValue$67] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          param1 = param1 + ((ts) this).field_h[param0];
          param2 = param2 + ((ts) this).field_i[param0];
          var6 = ((ts) this).field_e[param0];
          var7 = ((ts) this).field_j[param0];
          var8 = ((ts) this).field_f.field_f;
          var9 = param1 + param2 * var8;
          var10 = var8 - var6;
          var11 = 0;
          var12 = 0;
          if (param2 >= ((ts) this).field_f.field_w) {
            break L0;
          } else {
            var13 = ((ts) this).field_f.field_w - param2;
            var7 = var7 - var13;
            param2 = ((ts) this).field_f.field_w;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
            break L0;
          }
        }
        L1: {
          if (param2 + var7 <= ((ts) this).field_f.field_D) {
            break L1;
          } else {
            var7 = var7 - (param2 + var7 - ((ts) this).field_f.field_D);
            break L1;
          }
        }
        L2: {
          if (param1 >= ((ts) this).field_f.field_z) {
            break L2;
          } else {
            var13 = ((ts) this).field_f.field_z - param1;
            var6 = var6 - var13;
            param1 = ((ts) this).field_f.field_z;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= ((ts) this).field_f.field_k) {
            break L3;
          } else {
            var13 = param1 + var6 - ((ts) this).field_f.field_k;
            var6 = var6 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var7 > 0) {
              this.a(((ts) this).field_g[param0], ((ts) this).field_f.field_E, param3, var12, var9, var6, var7, var10, var11);
              return;
            } else {
              break L4;
            }
          }
        }
    }
}
