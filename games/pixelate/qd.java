/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qd extends fa {
    private boolean field_K;
    private byte[][] field_Q;
    private static kg[] field_A;
    private int field_H;
    private static boolean[] field_s;
    private static int[] field_u;
    private static int field_N;
    private boolean field_R;
    private static float[] field_v;
    private static int field_n;
    private int field_r;
    private static byte[] field_x;
    private static int[] field_B;
    private static int[] field_w;
    private float[] field_J;
    private static float[] field_p;
    private byte[] field_D;
    private int field_M;
    private static float[] field_I;
    private static float[] field_E;
    private int field_t;
    private static int field_O;
    private int field_G;
    private static dl[] field_L;
    private static int field_P;
    private static float[] field_y;
    private static float[] field_F;
    private int field_m;
    private static en[] field_z;
    static ac[] field_q;
    private int field_C;
    private static float[] field_o;
    private int field_k;
    private static boolean field_l;

    final static float e(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    private final static void a(byte[] param0, int param1) {
        field_x = param0;
        field_N = 0;
        field_P = 0;
    }

    final static qd a(fm param0, String param1, String param2) {
        try {
            qd var4_ref = null;
            if (!qd.a(param0)) {
                boolean discarded$0 = param0.a(0, param1, param2);
                return null;
            }
            byte[] var3 = param0.a((byte) 24, param2, param1);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            {
                var4_ref = new qd(var3);
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final sp a(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        float[] var7 = null;
        float[] var11 = null;
        float[] var13 = null;
        byte[] var14 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0[0] > 0) {
              break L0;
            } else {
              return null;
            }
          }
        }
        L1: {
          if (((qd) this).field_D != null) {
            break L1;
          } else {
            ((qd) this).field_t = 0;
            ((qd) this).field_J = new float[field_n];
            ((qd) this).field_D = new byte[((qd) this).field_k];
            ((qd) this).field_r = 0;
            ((qd) this).field_C = 0;
            break L1;
          }
        }
        L2: while (true) {
          if (((qd) this).field_C >= ((qd) this).field_Q.length) {
            ((qd) this).field_J = null;
            var14 = ((qd) this).field_D;
            ((qd) this).field_D = null;
            return new sp(((qd) this).field_m, var14, ((qd) this).field_M, ((qd) this).field_G, ((qd) this).field_K);
          } else {
            L3: {
              if (param0 == null) {
                break L3;
              } else {
                if (param0[0] > 0) {
                  break L3;
                } else {
                  return null;
                }
              }
            }
            L4: {
              var13 = this.a(((qd) this).field_C);
              var11 = var13;
              var7 = var11;
              if (var7 == null) {
                break L4;
              } else {
                L5: {
                  var3 = ((qd) this).field_r;
                  var4 = var13.length;
                  if (var4 <= ((qd) this).field_k - var3) {
                    break L5;
                  } else {
                    var4 = ((qd) this).field_k - var3;
                    break L5;
                  }
                }
                var5 = 0;
                L6: while (true) {
                  if (var5 >= var4) {
                    L7: {
                      if (param0 == null) {
                        break L7;
                      } else {
                        param0[0] = param0[0] - (var3 - ((qd) this).field_r);
                        break L7;
                      }
                    }
                    ((qd) this).field_r = var3;
                    break L4;
                  } else {
                    L8: {
                      var6 = (int)(128.0f + var13[var5] * 128.0f);
                      if ((var6 & -256) == 0) {
                        break L8;
                      } else {
                        var6 = ~var6 >> 31;
                        break L8;
                      }
                    }
                    int incrementValue$1 = var3;
                    var3++;
                    ((qd) this).field_D[incrementValue$1] = (byte)(var6 - 128);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            ((qd) this).field_C = ((qd) this).field_C + 1;
            continue L2;
          }
        }
    }

    private final void b(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        we var2 = new we(param0);
        ((qd) this).field_m = var2.k(0);
        ((qd) this).field_k = var2.k(0);
        ((qd) this).field_M = var2.k(0);
        ((qd) this).field_G = var2.k(0);
        if (((qd) this).field_G < 0) {
            ((qd) this).field_G = ~((qd) this).field_G;
            ((qd) this).field_K = true;
        }
        int var3 = var2.k(0);
        if (var3 < 0) {
            throw new IOException();
        }
        ((qd) this).field_Q = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.f(255);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.a(var6, 0, -72, var5);
            ((qd) this).field_Q[var4] = var6;
        }
    }

    final sp a() {
        byte[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        float[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ((qd) this).field_t = 0;
        ((qd) this).field_J = new float[field_n];
        var1 = new byte[((qd) this).field_k];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((qd) this).field_Q.length) {
            ((qd) this).field_J = null;
            return new sp(((qd) this).field_m, var1, ((qd) this).field_M, ((qd) this).field_G, ((qd) this).field_K);
          } else {
            var4 = this.a(var3);
            if (var4 != null) {
              L1: {
                var5 = var4.length;
                if (var5 <= ((qd) this).field_k - var2) {
                  break L1;
                } else {
                  var5 = ((qd) this).field_k - var2;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 < var5) {
                  L3: {
                    var7 = (int)(128.0f + var4[var6] * 128.0f);
                    if ((var7 & -256) == 0) {
                      break L3;
                    } else {
                      var7 = ~var7 >> 31;
                      break L3;
                    }
                  }
                  int incrementValue$1 = var2;
                  var2++;
                  var1[incrementValue$1] = (byte)(var7 - 128);
                  var6++;
                  continue L2;
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static int c() {
        int var0 = field_x[field_N] >> field_P & 1;
        field_P = field_P + 1;
        field_N = field_N + (field_P >> 3);
        field_P = field_P & 7;
        return var0;
    }

    final static qd a(fm param0, int param1, int param2) {
        try {
            qd var4_ref = null;
            if (!qd.a(param0)) {
                boolean discarded$0 = param0.a(param1, param2, -2);
                return null;
            }
            byte[] var3 = param0.a(param1, param2, true);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            {
                var4_ref = new qd(var3);
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final float[] a(int param0) {
        int var2 = 0;
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
        kg var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        Object var17 = null;
        int var18_int = 0;
        float[] var18 = null;
        int var19 = 0;
        float[] var20_ref_float__ = null;
        int var20 = 0;
        int var21_int = 0;
        float[] var21 = null;
        float[] var22 = null;
        float[] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        float var26_float = 0.0f;
        int var26 = 0;
        float var27 = 0.0f;
        int var27_int = 0;
        float var28 = 0.0f;
        int var28_int = 0;
        float var29 = 0.0f;
        int var29_int = 0;
        float var30 = 0.0f;
        int var30_int = 0;
        float var31 = 0.0f;
        int var31_int = 0;
        int var32_int = 0;
        float var32 = 0.0f;
        int var33_int = 0;
        float var33 = 0.0f;
        float var34 = 0.0f;
        float var35 = 0.0f;
        float var36 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float[] var40 = null;
        int var41 = 0;
        dl var42 = null;
        int[] var44 = null;
        float[] var45 = null;
        float[] var46 = null;
        int[] var48 = null;
        float[] var49 = null;
        float[] var50 = null;
        int[] var52 = null;
        float[] var53 = null;
        float[] var54 = null;
        float[] var55 = null;
        int[] var56 = null;
        float[] var57 = null;
        float[] var58 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        Object stackIn_109_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        float[] stackOut_39_0 = null;
        float[] stackOut_38_0 = null;
        float[] stackOut_42_0 = null;
        float[] stackOut_41_0 = null;
        float[] stackOut_45_0 = null;
        float[] stackOut_44_0 = null;
        int[] stackOut_48_0 = null;
        int[] stackOut_47_0 = null;
        Object stackOut_108_0 = null;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        L0: {
          qd.a(((qd) this).field_Q[param0], 0);
          int discarded$1 = qd.c();
          var2 = qd.f(aq.a((byte) 19, field_w.length - 1));
          var3 = field_s[var2] ? 1 : 0;
          if (var3 == 0) {
            stackOut_2_0 = field_O;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = field_n;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = 0;
          var6 = 0;
          if (var3 == 0) {
            break L1;
          } else {
            L2: {
              if (qd.c() == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              if (qd.c() == 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var6 = stackIn_10_0;
            break L1;
          }
        }
        L4: {
          L5: {
            var7 = var4 >> 1;
            if (var3 == 0) {
              break L5;
            } else {
              if (var5 != 0) {
                break L5;
              } else {
                var8 = (var4 >> 2) - (field_O >> 2);
                var9 = (var4 >> 2) + (field_O >> 2);
                var10 = field_O >> 1;
                break L4;
              }
            }
          }
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
          break L4;
        }
        L6: {
          L7: {
            if (var3 == 0) {
              break L7;
            } else {
              if (var6 != 0) {
                break L7;
              } else {
                var11 = var4 - (var4 >> 2) - (field_O >> 2);
                var12 = var4 - (var4 >> 2) + (field_O >> 2);
                var13 = field_O >> 1;
                break L6;
              }
            }
          }
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
          break L6;
        }
        L8: {
          var14 = field_A[field_w[var2]];
          var16 = var14.field_c;
          var17_int = var14.field_d[var16];
          if (field_z[var17_int].b()) {
            stackOut_21_0 = 0;
            stackIn_22_0 = stackOut_21_0;
            break L8;
          } else {
            stackOut_20_0 = 1;
            stackIn_22_0 = stackOut_20_0;
            break L8;
          }
        }
        var15 = stackIn_22_0;
        var16 = var15;
        var17_int = 0;
        L9: while (true) {
          if (var17_int >= var14.field_a) {
            L10: {
              if (var15 != 0) {
                break L10;
              } else {
                var17_int = var14.field_c;
                var18_int = var14.field_d[var17_int];
                field_z[var18_int].a(field_y, var4 >> 1);
                break L10;
              }
            }
            L11: {
              if (var15 == 0) {
                var17_int = var4 >> 1;
                var18_int = var4 >> 2;
                var19 = var4 >> 3;
                var57 = field_y;
                var53 = var57;
                var49 = var53;
                var45 = var49;
                var20_ref_float__ = var45;
                var21_int = 0;
                L12: while (true) {
                  if (var21_int >= var17_int) {
                    var41 = var17_int;
                    var21_int = var41;
                    L13: while (true) {
                      if (var41 >= var4) {
                        L14: {
                          if (var3 == 0) {
                            stackOut_39_0 = (float[]) field_F;
                            stackIn_40_0 = stackOut_39_0;
                            break L14;
                          } else {
                            stackOut_38_0 = (float[]) field_E;
                            stackIn_40_0 = stackOut_38_0;
                            break L14;
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var3 == 0) {
                            stackOut_42_0 = (float[]) field_I;
                            stackIn_43_0 = stackOut_42_0;
                            break L15;
                          } else {
                            stackOut_41_0 = (float[]) field_p;
                            stackIn_43_0 = stackOut_41_0;
                            break L15;
                          }
                        }
                        L16: {
                          var22 = stackIn_43_0;
                          if (var3 == 0) {
                            stackOut_45_0 = (float[]) field_o;
                            stackIn_46_0 = stackOut_45_0;
                            break L16;
                          } else {
                            stackOut_44_0 = (float[]) field_v;
                            stackIn_46_0 = stackOut_44_0;
                            break L16;
                          }
                        }
                        L17: {
                          var23 = stackIn_46_0;
                          if (var3 == 0) {
                            stackOut_48_0 = (int[]) field_B;
                            stackIn_49_0 = stackOut_48_0;
                            break L17;
                          } else {
                            stackOut_47_0 = (int[]) field_u;
                            stackIn_49_0 = stackOut_47_0;
                            break L17;
                          }
                        }
                        var56 = stackIn_49_0;
                        var52 = var56;
                        var48 = var52;
                        var44 = var48;
                        var24 = var44;
                        var25 = 0;
                        L18: while (true) {
                          if (var25 >= var18_int) {
                            var25 = 0;
                            L19: while (true) {
                              if (var25 >= var19) {
                                var25 = aq.a((byte) 78, var4 - 1);
                                var26 = 0;
                                L20: while (true) {
                                  if (var26 >= var25 - 3) {
                                    var26 = 1;
                                    L21: while (true) {
                                      if (var26 >= var19 - 1) {
                                        var26 = 0;
                                        L22: while (true) {
                                          if (var26 >= var17_int) {
                                            var26 = 0;
                                            L23: while (true) {
                                              if (var26 >= var19) {
                                                var26 = 0;
                                                L24: while (true) {
                                                  if (var26 >= var19) {
                                                    var26 = 0;
                                                    L25: while (true) {
                                                      if (var26 >= var18_int) {
                                                        var26 = 0;
                                                        L26: while (true) {
                                                          if (var26 >= var18_int) {
                                                            var26 = 0;
                                                            L27: while (true) {
                                                              if (var26 >= var18_int) {
                                                                var26 = 0;
                                                                L28: while (true) {
                                                                  if (var26 >= var18_int) {
                                                                    var26 = 0;
                                                                    L29: while (true) {
                                                                      if (var26 >= var18_int) {
                                                                        var26 = var8;
                                                                        L30: while (true) {
                                                                          if (var26 >= var9) {
                                                                            var26 = var11;
                                                                            L31: while (true) {
                                                                              if (var26 >= var12) {
                                                                                break L11;
                                                                              } else {
                                                                                var27 = (float)Math.sin(((double)(var26 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                                                                                field_y[var26] = field_y[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                                var26++;
                                                                                continue L31;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                                                                            field_y[var26] = field_y[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                            var26++;
                                                                            continue L30;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var20_ref_float__[var17_int + var26] = var20_ref_float__[var4 - var26 - 1];
                                                                        var26++;
                                                                        continue L29;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var20_ref_float__[var18_int + var26] = -var20_ref_float__[var18_int - var26 - 1];
                                                                    var26++;
                                                                    continue L28;
                                                                  }
                                                                }
                                                              } else {
                                                                var20_ref_float__[var26] = var20_ref_float__[var18_int + var26];
                                                                var26++;
                                                                continue L27;
                                                              }
                                                            }
                                                          } else {
                                                            var20_ref_float__[var4 - var18_int + var26] = -var57[var26];
                                                            var26++;
                                                            continue L26;
                                                          }
                                                        }
                                                      } else {
                                                        var20_ref_float__[var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26] + var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26 + 1];
                                                        var20_ref_float__[var17_int - 1 - var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26 + 1] - var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26];
                                                        var26++;
                                                        continue L25;
                                                      }
                                                    }
                                                  } else {
                                                    var27 = var23[2 * var26];
                                                    var28 = var23[2 * var26 + 1];
                                                    var29 = var20_ref_float__[var17_int + 2 * var26];
                                                    var30 = var20_ref_float__[var17_int + 2 * var26 + 1];
                                                    var31 = var20_ref_float__[var4 - 2 - 2 * var26];
                                                    var32 = var20_ref_float__[var4 - 1 - 2 * var26];
                                                    var33 = var28 * (var29 - var31) + var27 * (var30 + var32);
                                                    var20_ref_float__[var17_int + 2 * var26] = (var29 + var31 + var33) * 0.5f;
                                                    var20_ref_float__[var4 - 2 - 2 * var26] = (var29 + var31 - var33) * 0.5f;
                                                    var33 = var28 * (var30 + var32) - var27 * (var29 - var31);
                                                    var20_ref_float__[var17_int + 2 * var26 + 1] = (var30 - var32 + var33) * 0.5f;
                                                    var20_ref_float__[var4 - 1 - 2 * var26] = (-var30 + var32 + var33) * 0.5f;
                                                    var26++;
                                                    continue L24;
                                                  }
                                                }
                                              } else {
                                                var20_ref_float__[var4 - 1 - 2 * var26] = var20_ref_float__[4 * var26];
                                                var20_ref_float__[var4 - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 1];
                                                var20_ref_float__[var4 - var18_int - 1 - 2 * var26] = var20_ref_float__[4 * var26 + 2];
                                                var20_ref_float__[var4 - var18_int - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 3];
                                                var26++;
                                                continue L23;
                                              }
                                            }
                                          } else {
                                            var20_ref_float__[var26] = var20_ref_float__[2 * var26 + 1];
                                            var26++;
                                            continue L22;
                                          }
                                        }
                                      } else {
                                        var27_int = var56[var26];
                                        if (var26 < var27_int) {
                                          var28_int = 8 * var26;
                                          var29_int = 8 * var27_int;
                                          var30 = var20_ref_float__[var28_int + 1];
                                          var20_ref_float__[var28_int + 1] = var20_ref_float__[var29_int + 1];
                                          var20_ref_float__[var29_int + 1] = var30;
                                          var30 = var20_ref_float__[var28_int + 3];
                                          var20_ref_float__[var28_int + 3] = var20_ref_float__[var29_int + 3];
                                          var20_ref_float__[var29_int + 3] = var30;
                                          var30 = var20_ref_float__[var28_int + 5];
                                          var20_ref_float__[var28_int + 5] = var20_ref_float__[var29_int + 5];
                                          var20_ref_float__[var29_int + 5] = var30;
                                          var30 = var20_ref_float__[var28_int + 7];
                                          var20_ref_float__[var28_int + 7] = var20_ref_float__[var29_int + 7];
                                          var20_ref_float__[var29_int + 7] = var30;
                                          var26++;
                                          continue L21;
                                        } else {
                                          var26++;
                                          continue L21;
                                        }
                                      }
                                    }
                                  } else {
                                    var27_int = var4 >> var26 + 2;
                                    var28_int = 8 << var26;
                                    var29_int = 0;
                                    L32: while (true) {
                                      if (var29_int >= 2 << var26) {
                                        var26++;
                                        continue L20;
                                      } else {
                                        var30_int = var4 - var27_int * 2 * var29_int;
                                        var31_int = var4 - var27_int * (2 * var29_int + 1);
                                        var32_int = 0;
                                        L33: while (true) {
                                          if (var32_int >= var4 >> var26 + 4) {
                                            var29_int++;
                                            continue L32;
                                          } else {
                                            var33_int = 4 * var32_int;
                                            var34 = var20_ref_float__[var30_int - 1 - var33_int];
                                            var35 = var20_ref_float__[var30_int - 3 - var33_int];
                                            var36 = var20_ref_float__[var31_int - 1 - var33_int];
                                            var37 = var20_ref_float__[var31_int - 3 - var33_int];
                                            var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                                            var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                                            var38 = var21[var32_int * var28_int];
                                            var39 = var21[var32_int * var28_int + 1];
                                            var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                                            var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
                                            var32_int++;
                                            continue L33;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var26_float = var20_ref_float__[var17_int + 3 + 4 * var25];
                                var27 = var20_ref_float__[var17_int + 1 + 4 * var25];
                                var28 = var20_ref_float__[4 * var25 + 3];
                                var29 = var20_ref_float__[4 * var25 + 1];
                                var20_ref_float__[var17_int + 3 + 4 * var25] = var26_float + var28;
                                var20_ref_float__[var17_int + 1 + 4 * var25] = var27 + var29;
                                var30 = var21[var17_int - 4 - 4 * var25];
                                var31 = var21[var17_int - 3 - 4 * var25];
                                var20_ref_float__[4 * var25 + 3] = (var26_float - var28) * var30 - (var27 - var29) * var31;
                                var20_ref_float__[4 * var25 + 1] = (var27 - var29) * var30 + (var26_float - var28) * var31;
                                var25++;
                                continue L19;
                              }
                            }
                          } else {
                            var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
                            var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
                            var28 = var21[2 * var25];
                            var29 = var21[2 * var25 + 1];
                            var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
                            var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
                            var25++;
                            continue L18;
                          }
                        }
                      } else {
                        var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
                        var41++;
                        continue L13;
                      }
                    }
                  } else {
                    var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
                    var21_int++;
                    continue L12;
                  }
                }
              } else {
                var17_int = var4 >> 1;
                L34: while (true) {
                  if (var17_int >= var4) {
                    break L11;
                  } else {
                    field_y[var17_int] = 0.0f;
                    var17_int++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              var17 = null;
              if (((qd) this).field_t <= 0) {
                break L35;
              } else {
                L36: {
                  var18_int = ((qd) this).field_t + var4 >> 2;
                  var58 = new float[var18_int];
                  var54 = var58;
                  var50 = var54;
                  var46 = var50;
                  var40 = var46;
                  var17 = (Object) (Object) var40;
                  if (((qd) this).field_R) {
                    break L36;
                  } else {
                    var19 = 0;
                    L37: while (true) {
                      if (var19 >= ((qd) this).field_H) {
                        break L36;
                      } else {
                        var20 = (((qd) this).field_t >> 1) + var19;
                        var40[var19] = var40[var19] + ((qd) this).field_J[var20];
                        var19++;
                        continue L37;
                      }
                    }
                  }
                }
                if (var15 != 0) {
                  break L35;
                } else {
                  var19 = var8;
                  L38: while (true) {
                    if (var19 >= var4 >> 1) {
                      break L35;
                    } else {
                      var20 = var58.length - (var4 >> 1) + var19;
                      var40[var20] = var40[var20] + field_y[var19];
                      var19++;
                      continue L38;
                    }
                  }
                }
              }
            }
            L39: {
              var18 = ((qd) this).field_J;
              ((qd) this).field_J = field_y;
              field_y = var18;
              ((qd) this).field_t = var4;
              ((qd) this).field_H = var12 - (var4 >> 1);
              stackOut_108_0 = this;
              stackIn_110_0 = stackOut_108_0;
              stackIn_109_0 = stackOut_108_0;
              if (var15 == 0) {
                stackOut_110_0 = this;
                stackOut_110_1 = 0;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                break L39;
              } else {
                stackOut_109_0 = this;
                stackOut_109_1 = 1;
                stackIn_111_0 = stackOut_109_0;
                stackIn_111_1 = stackOut_109_1;
                break L39;
              }
            }
            ((qd) this).field_R = stackIn_111_1 != 0;
            return (float[]) var17;
          } else {
            var42 = field_L[var14.field_b[var17_int]];
            var55 = field_y;
            var42.a(var55, var4 >> 1, var16 != 0);
            var17_int++;
            continue L9;
          }
        }
    }

    private final static boolean a(fm param0) {
        byte[] var1 = null;
        if (!field_l) {
            var1 = param0.a(0, 0, true);
            if (var1 == null) {
                return false;
            }
            qd.a(var1);
        }
        return true;
    }

    final static void a(byte[] param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6_ref_float__ = null;
        int var6 = 0;
        int var7_int = 0;
        float[] var7 = null;
        int var8_int = 0;
        float[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        boolean[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        boolean[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        boolean[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        boolean[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        qd.a(param0, 0);
        field_O = 1 << qd.f(4);
        field_n = 1 << qd.f(4);
        field_y = new float[field_n];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = qd.f(8) + 1;
            field_q = new ac[var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = qd.f(6) + 1;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2) {
                    var2 = qd.f(6) + 1;
                    field_z = new en[var2];
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2) {
                        var3 = qd.f(6) + 1;
                        field_L = new dl[var3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var4 = qd.f(6) + 1;
                            field_A = new kg[var4];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var4) {
                                var5 = qd.f(6) + 1;
                                field_s = new boolean[var5];
                                field_w = new int[var5];
                                var6 = 0;
                                L6: while (true) {
                                  if (var6 >= var5) {
                                    field_l = true;
                                    return;
                                  } else {
                                    L7: {
                                      stackOut_37_0 = (boolean[]) field_s;
                                      stackOut_37_1 = var6;
                                      stackIn_39_0 = stackOut_37_0;
                                      stackIn_39_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (qd.c() == 0) {
                                        stackOut_39_0 = (boolean[]) (Object) stackIn_39_0;
                                        stackOut_39_1 = stackIn_39_1;
                                        stackOut_39_2 = 0;
                                        stackIn_40_0 = stackOut_39_0;
                                        stackIn_40_1 = stackOut_39_1;
                                        stackIn_40_2 = stackOut_39_2;
                                        break L7;
                                      } else {
                                        stackOut_38_0 = (boolean[]) (Object) stackIn_38_0;
                                        stackOut_38_1 = stackIn_38_1;
                                        stackOut_38_2 = 1;
                                        stackIn_40_0 = stackOut_38_0;
                                        stackIn_40_1 = stackOut_38_1;
                                        stackIn_40_2 = stackOut_38_2;
                                        break L7;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2 != 0;
                                    int discarded$3 = qd.f(16);
                                    int discarded$4 = qd.f(16);
                                    field_w[var6] = qd.f(8);
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_A[var5] = new kg();
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            field_L[var4] = new dl();
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        field_z[var3] = new en();
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    int discarded$5 = qd.f(16);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                field_q[var2] = new ac();
                var2++;
                continue L1;
              }
            }
          } else {
            L8: {
              if (var1 == 0) {
                stackOut_4_0 = field_O;
                stackIn_5_0 = stackOut_4_0;
                break L8;
              } else {
                stackOut_3_0 = field_n;
                stackIn_5_0 = stackOut_3_0;
                break L8;
              }
            }
            var2 = stackIn_5_0;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            var6_ref_float__ = new float[var3];
            var7_int = 0;
            L9: while (true) {
              if (var7_int >= var4) {
                var7 = new float[var3];
                var8_int = 0;
                L10: while (true) {
                  if (var8_int >= var4) {
                    var8 = new float[var4];
                    var9_int = 0;
                    L11: while (true) {
                      if (var9_int >= var5) {
                        var9 = new int[var5];
                        var10 = aq.a((byte) 46, var5 - 1);
                        var11 = 0;
                        L12: while (true) {
                          if (var11 >= var5) {
                            if (var1 == 0) {
                              field_F = var6_ref_float__;
                              field_I = var7;
                              field_o = var8;
                              field_B = var9;
                              var1++;
                              continue L0;
                            } else {
                              field_E = var6_ref_float__;
                              field_p = var7;
                              field_v = var8;
                              field_u = var9;
                              var1++;
                              continue L0;
                            }
                          } else {
                            var9[var11] = tm.b(var11, -23439, var10);
                            var11++;
                            continue L12;
                          }
                        }
                      } else {
                        var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
                        var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
                        var9_int++;
                        continue L11;
                      }
                    }
                  } else {
                    var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
                    var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
                    var8_int++;
                    continue L10;
                  }
                }
              } else {
                var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
                var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
                var7_int++;
                continue L9;
              }
            }
          }
        }
    }

    final static int f(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var1 = 0;
        int var2 = 0;
        while (param0 >= 8 - field_P) {
            var3 = 8 - field_P;
            var4 = (1 << var3) - 1;
            var1 = var1 + ((field_x[field_N] >> field_P & var4) << var2);
            field_P = 0;
            field_N = field_N + 1;
            var2 = var2 + var3;
            param0 = param0 - var3;
        }
        if (param0 > 0) {
            var3 = (1 << param0) - 1;
            var1 = var1 + ((field_x[field_N] >> field_P & var3) << var2);
            field_P = field_P + param0;
        }
        return var1;
    }

    private qd(byte[] param0) throws IOException {
        this.b(param0);
    }

    public static void b() {
        field_x = null;
        field_q = null;
        field_z = null;
        field_L = null;
        field_A = null;
        field_s = null;
        field_w = null;
        field_y = null;
        field_F = null;
        field_I = null;
        field_o = null;
        field_E = null;
        field_p = null;
        field_v = null;
        field_B = null;
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
    }
}
