/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua extends hf {
    private boolean field_A;
    private static int[] field_l;
    private static ui[] field_k;
    private int field_H;
    private static int[] field_f;
    static ae[] field_u;
    private static int field_v;
    private static float[] field_B;
    private static boolean[] field_o;
    private static float[] field_g;
    private boolean field_i;
    private static int field_j;
    private static int field_y;
    private static we[] field_N;
    private static float[] field_K;
    private static float[] field_r;
    private int field_m;
    private int field_J;
    private static float[] field_w;
    private byte[] field_E;
    private float[] field_C;
    private static int[] field_D;
    private static float[] field_s;
    private static int field_t;
    private int field_I;
    private byte[][] field_p;
    private static u[] field_F;
    private static float[] field_h;
    private static boolean field_z;
    private int field_q;
    private static byte[] field_L;
    private int field_M;
    private int field_x;
    private int field_n;

    private final static void a(byte[] param0, int param1) {
        field_L = param0;
        field_y = param1;
        field_j = 0;
    }

    final static float d(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    final static ua a(rh param0, int param1, int param2) {
        try {
            if (!ua.a(param0)) {
                boolean discarded$0 = param0.a((byte) 37, param1, param2);
                return null;
            }
            byte[] var3 = param0.a(param1, -28153, param2);
            if (var3 == null) {
                return null;
            }
            ua var4 = null;
            try {
                var4 = new ua(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final gd a(int[] param0) {
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
          if (((ua) this).field_E != null) {
            break L1;
          } else {
            ((ua) this).field_M = 0;
            ((ua) this).field_C = new float[field_t];
            ((ua) this).field_E = new byte[((ua) this).field_H];
            ((ua) this).field_J = 0;
            ((ua) this).field_x = 0;
            break L1;
          }
        }
        L2: while (true) {
          if (((ua) this).field_x >= ((ua) this).field_p.length) {
            ((ua) this).field_C = null;
            var14 = ((ua) this).field_E;
            ((ua) this).field_E = null;
            return new gd(((ua) this).field_q, var14, ((ua) this).field_I, ((ua) this).field_n, ((ua) this).field_A);
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
              var13 = this.c(((ua) this).field_x);
              var11 = var13;
              var7 = var11;
              if (var7 == null) {
                break L4;
              } else {
                L5: {
                  var3 = ((ua) this).field_J;
                  var4 = var13.length;
                  if (var4 <= ((ua) this).field_H - var3) {
                    break L5;
                  } else {
                    var4 = ((ua) this).field_H - var3;
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
                        param0[0] = param0[0] - (var3 - ((ua) this).field_J);
                        break L7;
                      }
                    }
                    ((ua) this).field_J = var3;
                    break L4;
                  } else {
                    L8: {
                      var6 = (int)(128.0f + var13[var5] * 128.0f);
                      if ((var6 & -256) == 0) {
                        break L8;
                      } else {
                        var6 = (var6 ^ -1) >> 31;
                        break L8;
                      }
                    }
                    var3++;
                    ((ua) this).field_E[var3] = (byte)(var6 - 128);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            ((ua) this).field_x = ((ua) this).field_x + 1;
            continue L2;
          }
        }
    }

    final static int b() {
        int var0 = field_L[field_y] >> field_j & 1;
        field_j = field_j + 1;
        field_y = field_y + (field_j >> 3);
        field_j = field_j & 7;
        return var0;
    }

    final static int b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var1 = 0;
        int var2 = 0;
        while (param0 >= 8 - field_j) {
            var3 = 8 - field_j;
            var4 = (1 << var3) - 1;
            var1 = var1 + ((field_L[field_y] >> field_j & var4) << var2);
            field_j = 0;
            field_y = field_y + 1;
            var2 = var2 + var3;
            param0 = param0 - var3;
        }
        if (param0 > 0) {
            var3 = (1 << param0) - 1;
            var1 = var1 + ((field_L[field_y] >> field_j & var3) << var2);
            field_j = field_j + param0;
        }
        return var1;
    }

    final static ua a(rh param0, String param1, String param2) {
        try {
            if (!ua.a(param0)) {
                boolean discarded$0 = param0.a((byte) 113, param2, param1);
                return null;
            }
            byte[] var3 = param0.a(0, param2, param1);
            if (var3 == null) {
                return null;
            }
            ua var4 = null;
            try {
                var4 = new ua(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        qc var2 = new qc(param0);
        ((ua) this).field_q = var2.a((byte) -53);
        ((ua) this).field_H = var2.a((byte) -128);
        ((ua) this).field_I = var2.a((byte) -128);
        ((ua) this).field_n = var2.a((byte) -89);
        if (((ua) this).field_n < 0) {
            ((ua) this).field_n = ((ua) this).field_n ^ -1;
            ((ua) this).field_A = true;
        }
        int var3 = var2.a((byte) -108);
        if (var3 < 0) {
            throw new IOException();
        }
        ((ua) this).field_p = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.c((byte) 34);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.b(29915, var5, var6, 0);
            ((ua) this).field_p[var4] = var6;
        }
    }

    final gd c() {
        byte[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        float[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ((ua) this).field_M = 0;
        ((ua) this).field_C = new float[field_t];
        var1 = new byte[((ua) this).field_H];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((ua) this).field_p.length) {
            ((ua) this).field_C = null;
            return new gd(((ua) this).field_q, var1, ((ua) this).field_I, ((ua) this).field_n, ((ua) this).field_A);
          } else {
            var4 = this.c(var3);
            if (var4 != null) {
              L1: {
                var5 = var4.length;
                if (var5 <= ((ua) this).field_H - var2) {
                  break L1;
                } else {
                  var5 = ((ua) this).field_H - var2;
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
                      var7 = (var7 ^ -1) >> 31;
                      break L3;
                    }
                  }
                  var2++;
                  var1[var2] = (byte)(var7 - 128);
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
        ua.a(param0, 0);
        field_v = 1 << ua.b(4);
        field_t = 1 << ua.b(4);
        field_B = new float[field_t];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = ua.b(8) + 1;
            field_u = new ae[var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = ua.b(6) + 1;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2) {
                    var2 = ua.b(6) + 1;
                    field_F = new u[var2];
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2) {
                        var3 = ua.b(6) + 1;
                        field_k = new ui[var3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var4 = ua.b(6) + 1;
                            field_N = new we[var4];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var4) {
                                var5 = ua.b(6) + 1;
                                field_o = new boolean[var5];
                                field_D = new int[var5];
                                var6 = 0;
                                L6: while (true) {
                                  if (var6 >= var5) {
                                    field_z = true;
                                    return;
                                  } else {
                                    L7: {
                                      stackOut_37_0 = (boolean[]) field_o;
                                      stackOut_37_1 = var6;
                                      stackIn_39_0 = stackOut_37_0;
                                      stackIn_39_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (ua.b() == 0) {
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
                                    int discarded$3 = ua.b(16);
                                    int discarded$4 = ua.b(16);
                                    field_D[var6] = ua.b(8);
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_N[var5] = new we();
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            field_k[var4] = new ui();
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        field_F[var3] = new u();
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    int discarded$5 = ua.b(16);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                field_u[var2] = new ae();
                var2++;
                continue L1;
              }
            }
          } else {
            L8: {
              if (var1 == 0) {
                stackOut_4_0 = field_v;
                stackIn_5_0 = stackOut_4_0;
                break L8;
              } else {
                stackOut_3_0 = field_t;
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
                        var10 = hj.a((byte) 58, var5 - 1);
                        var11 = 0;
                        L12: while (true) {
                          if (var11 >= var5) {
                            if (var1 == 0) {
                              field_s = var6_ref_float__;
                              field_K = var7;
                              field_r = var8;
                              field_f = var9;
                              var1++;
                              continue L0;
                            } else {
                              field_w = var6_ref_float__;
                              field_g = var7;
                              field_h = var8;
                              field_l = var9;
                              var1++;
                              continue L0;
                            }
                          } else {
                            var9[var11] = nd.a(var11, 0, var10);
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

    public static void a() {
        field_L = null;
        field_u = null;
        field_F = null;
        field_k = null;
        field_N = null;
        field_o = null;
        field_D = null;
        field_B = null;
        field_s = null;
        field_K = null;
        field_r = null;
        field_w = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_l = null;
    }

    private final float[] c(int param0) {
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
        we var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        Object var17 = null;
        float[] var17_array = null;
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
        ui var42 = null;
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
          ua.a(((ua) this).field_p[param0], 0);
          int discarded$1 = ua.b();
          var2 = ua.b(hj.a((byte) 58, field_D.length - 1));
          var3 = field_o[var2] ? 1 : 0;
          if (var3 == 0) {
            stackOut_2_0 = field_v;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = field_t;
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
              if (ua.b() == 0) {
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
              if (ua.b() == 0) {
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
                var8 = (var4 >> 2) - (field_v >> 2);
                var9 = (var4 >> 2) + (field_v >> 2);
                var10 = field_v >> 1;
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
                var11 = var4 - (var4 >> 2) - (field_v >> 2);
                var12 = var4 - (var4 >> 2) + (field_v >> 2);
                var13 = field_v >> 1;
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
          var14 = field_N[field_D[var2]];
          var16 = var14.field_a;
          var17_int = var14.field_c[var16];
          if (field_F[var17_int].b()) {
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
          if (var17_int >= var14.field_b) {
            L10: {
              if (var15 != 0) {
                break L10;
              } else {
                var17_int = var14.field_a;
                var18_int = var14.field_c[var17_int];
                field_F[var18_int].a(field_B, var4 >> 1);
                break L10;
              }
            }
            L11: {
              if (var15 == 0) {
                var17_int = var4 >> 1;
                var18_int = var4 >> 2;
                var19 = var4 >> 3;
                var57 = field_B;
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
                            stackOut_39_0 = (float[]) field_s;
                            stackIn_40_0 = stackOut_39_0;
                            break L14;
                          } else {
                            stackOut_38_0 = (float[]) field_w;
                            stackIn_40_0 = stackOut_38_0;
                            break L14;
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var3 == 0) {
                            stackOut_42_0 = (float[]) field_K;
                            stackIn_43_0 = stackOut_42_0;
                            break L15;
                          } else {
                            stackOut_41_0 = (float[]) field_g;
                            stackIn_43_0 = stackOut_41_0;
                            break L15;
                          }
                        }
                        L16: {
                          var22 = stackIn_43_0;
                          if (var3 == 0) {
                            stackOut_45_0 = (float[]) field_r;
                            stackIn_46_0 = stackOut_45_0;
                            break L16;
                          } else {
                            stackOut_44_0 = (float[]) field_h;
                            stackIn_46_0 = stackOut_44_0;
                            break L16;
                          }
                        }
                        L17: {
                          var23 = stackIn_46_0;
                          if (var3 == 0) {
                            stackOut_48_0 = (int[]) field_f;
                            stackIn_49_0 = stackOut_48_0;
                            break L17;
                          } else {
                            stackOut_47_0 = (int[]) field_l;
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
                                var25 = hj.a((byte) 58, var4 - 1);
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
                                                                                field_B[var26] = field_B[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                                var26++;
                                                                                continue L31;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                                                                            field_B[var26] = field_B[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
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
                    field_B[var17_int] = 0.0f;
                    var17_int++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              var17 = null;
              if (((ua) this).field_M <= 0) {
                break L35;
              } else {
                L36: {
                  var18_int = ((ua) this).field_M + var4 >> 2;
                  var58 = new float[var18_int];
                  var54 = var58;
                  var50 = var54;
                  var46 = var50;
                  var40 = var46;
                  var17_array = var40;
                  if (((ua) this).field_i) {
                    break L36;
                  } else {
                    var19 = 0;
                    L37: while (true) {
                      if (var19 >= ((ua) this).field_m) {
                        break L36;
                      } else {
                        var20 = (((ua) this).field_M >> 1) + var19;
                        var40[var19] = var40[var19] + ((ua) this).field_C[var20];
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
                      var40[var20] = var40[var20] + field_B[var19];
                      var19++;
                      continue L38;
                    }
                  }
                }
              }
            }
            L39: {
              var18 = ((ua) this).field_C;
              ((ua) this).field_C = field_B;
              field_B = var18;
              ((ua) this).field_M = var4;
              ((ua) this).field_m = var12 - (var4 >> 1);
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
            ((ua) this).field_i = stackIn_111_1 != 0;
            return var17_array;
          } else {
            var42 = field_k[var14.field_d[var17_int]];
            var55 = field_B;
            var42.a(var55, var4 >> 1, var16 != 0);
            var17_int++;
            continue L9;
          }
        }
    }

    private final static boolean a(rh param0) {
        byte[] var1 = null;
        if (!field_z) {
            var1 = param0.a(0, -28153, 0);
            if (var1 == null) {
                return false;
            }
            ua.a(var1);
        }
        return true;
    }

    private ua(byte[] param0) throws IOException {
        this.b(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = false;
    }
}
