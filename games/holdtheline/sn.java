/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sn extends hl {
    private boolean field_G;
    private static float[] field_H;
    private static int field_t;
    private static int[] field_y;
    private int field_q;
    private static int[] field_O;
    private static float[] field_o;
    private int field_k;
    private static float[] field_v;
    private static int field_N;
    private byte[][] field_n;
    private static s[] field_w;
    private static float[] field_P;
    private int field_D;
    private int field_C;
    private static boolean field_r;
    private static int[] field_z;
    private static float[] field_s;
    private int field_L;
    private float[] field_l;
    private int field_u;
    private int field_m;
    private static byte[] field_i;
    private byte[] field_I;
    private int field_J;
    private static nf[] field_B;
    private static float[] field_j;
    private static nb[] field_K;
    private static int field_A;
    static re[] field_F;
    private boolean field_E;
    private static int field_p;
    private static float[] field_x;
    private static boolean[] field_M;

    final static sn a(gn param0, String param1, String param2) {
        try {
            sn var4_ref = null;
            if (!sn.a(param0)) {
                param0.b(param1, param2, 92);
                return null;
            }
            byte[] var3 = param0.a(param2, false, param1);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new sn(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sn a(gn param0, int param1, int param2) {
        try {
            sn var4_ref = null;
            if (!sn.a(param0)) {
                param0.b(param1, param2, -1);
                return null;
            }
            byte[] var3 = param0.a(param1, true, param2);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new sn(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final el a(int[] param0) {
        int incrementValue$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        float[] var7;
        byte[] var12;
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
          if (this.field_I != null) {
            break L1;
          } else {
            this.field_L = 0;
            this.field_l = new float[field_p];
            this.field_I = new byte[this.field_D];
            this.field_m = 0;
            this.field_k = 0;
            break L1;
          }
        }
        L2: while (true) {
          if (this.field_k >= this.field_n.length) {
            this.field_l = null;
            var12 = this.field_I;
            this.field_I = null;
            return new el(this.field_q, var12, this.field_J, this.field_u, this.field_E);
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
              var7 = this.e(this.field_k);
              if (var7 == null) {
                break L4;
              } else {
                L5: {
                  var3 = this.field_m;
                  var4 = var7.length;
                  if (var4 <= this.field_D - var3) {
                    break L5;
                  } else {
                    var4 = this.field_D - var3;
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
                        param0[0] = param0[0] - (var3 - this.field_m);
                        break L7;
                      }
                    }
                    this.field_m = var3;
                    break L4;
                  } else {
                    L8: {
                      var6 = (int)(128.0f + var7[var5] * 128.0f);
                      if ((var6 & -256) == 0) {
                        break L8;
                      } else {
                        var6 = (var6 ^ -1) >> 31;
                        break L8;
                      }
                    }
                    incrementValue$0 = var3;
                    var3++;
                    this.field_I[incrementValue$0] = (byte)(var6 - 128);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            this.field_k = this.field_k + 1;
            continue L2;
          }
        }
    }

    private final float[] e(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        nf var14;
        int var15;
        int var16;
        int var17_int;
        Object var17;
        int var18_int;
        float[] var18;
        int var19;
        float[] var20_ref_float__;
        int var20;
        int var21_int;
        float[] var21;
        float[] var22;
        float[] var23;
        int[] var24;
        int var25;
        int var26;
        float var26_float;
        float var27;
        int var27_int;
        float var28;
        int var28_int;
        float var29;
        int var29_int;
        float var30;
        int var30_int;
        float var31;
        int var31_int;
        float var32;
        int var32_int;
        float var33;
        int var33_int;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float[] var40;
        int var41;
        s var42;
        int[] var44;
        float[] var45;
        float[] var46;
        int[] var48;
        float[] var49;
        float[] var50;
        float[] var52;
        L0: {
          sn.a(this.field_n[param0], 0);
          sn.b();
          var2 = sn.f(qm.a(field_O.length - 1, (byte) -82));
          var3 = field_M[var2] ? 1 : 0;
          if (var3 == 0) {
            stackIn_3_0 = field_t;
            break L0;
          } else {
            stackIn_3_0 = field_p;
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
              if (sn.b() == 0) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              if (sn.b() == 0) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 1;
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
                var8 = (var4 >> 2) - (field_t >> 2);
                var9 = (var4 >> 2) + (field_t >> 2);
                var10 = field_t >> 1;
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
                var11 = var4 - (var4 >> 2) - (field_t >> 2);
                var12 = var4 - (var4 >> 2) + (field_t >> 2);
                var13 = field_t >> 1;
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
          var14 = field_B[field_O[var2]];
          var16 = var14.field_b;
          var17_int = var14.field_a[var16];
          if (field_K[var17_int].b()) {
            stackIn_22_0 = 0;
            break L8;
          } else {
            stackIn_22_0 = 1;
            break L8;
          }
        }
        var15 = stackIn_22_0;
        var16 = var15;
        var17_int = 0;
        L9: while (true) {
          if (var17_int >= var14.field_d) {
            L10: {
              if (var15 != 0) {
                break L10;
              } else {
                var17_int = var14.field_b;
                var18_int = var14.field_a[var17_int];
                field_K[var18_int].a(field_v, var4 >> 1);
                break L10;
              }
            }
            L11: {
              if (var15 == 0) {
                var17_int = var4 >> 1;
                var18_int = var4 >> 2;
                var19 = var4 >> 3;
                var49 = field_v;
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
                            stackIn_40_0 = (float[]) (field_H);
                            break L14;
                          } else {
                            stackIn_40_0 = (float[]) (field_s);
                            break L14;
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var3 == 0) {
                            stackIn_43_0 = (float[]) (field_x);
                            break L15;
                          } else {
                            stackIn_43_0 = (float[]) (field_o);
                            break L15;
                          }
                        }
                        L16: {
                          var22 = stackIn_43_0;
                          if (var3 == 0) {
                            stackIn_46_0 = (float[]) (field_j);
                            break L16;
                          } else {
                            stackIn_46_0 = (float[]) (field_P);
                            break L16;
                          }
                        }
                        L17: {
                          var23 = stackIn_46_0;
                          if (var3 == 0) {
                            stackIn_49_0 = (int[]) (field_y);
                            break L17;
                          } else {
                            stackIn_49_0 = (int[]) (field_z);
                            break L17;
                          }
                        }
                        var48 = stackIn_49_0;
                        var44 = var48;
                        var24 = var44;
                        var25 = 0;
                        L18: while (true) {
                          if (var25 >= var18_int) {
                            var25 = 0;
                            L19: while (true) {
                              if (var25 >= var19) {
                                var25 = qm.a(var4 - 1, (byte) -98);
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
                                                                                field_v[var26] = field_v[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                                var26++;
                                                                                continue L31;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                                                                            field_v[var26] = field_v[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
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
                                                            var20_ref_float__[var4 - var18_int + var26] = -var49[var26];
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
                                        var27_int = var48[var26];
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
                    field_v[var17_int] = 0.0f;
                    var17_int++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              var17 = null;
              if (this.field_L <= 0) {
                break L35;
              } else {
                L36: {
                  var18_int = this.field_L + var4 >> 2;
                  var50 = new float[var18_int];
                  var46 = var50;
                  var40 = var46;
                  var17 = var40;
                  if (this.field_G) {
                    break L36;
                  } else {
                    var19 = 0;
                    L37: while (true) {
                      if (var19 >= this.field_C) {
                        break L36;
                      } else {
                        var20 = (this.field_L >> 1) + var19;
                        var40[var19] = var40[var19] + this.field_l[var20];
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
                      var20 = var50.length - (var4 >> 1) + var19;
                      var40[var20] = var40[var20] + field_v[var19];
                      var19++;
                      continue L38;
                    }
                  }
                }
              }
            }
            L39: {
              var18 = this.field_l;
              this.field_l = field_v;
              field_v = var18;
              this.field_L = var4;
              this.field_C = var12 - (var4 >> 1);
              stackIn_110_0 = this;

              if (var15 == 0) {
                stackIn_111_0 = this;
                stackIn_111_1 = 0;
                break L39;
              } else {
                stackIn_111_0 = this;
                stackIn_111_1 = 1;
                break L39;
              }
            }
            ((sn) (this)).field_G = stackIn_111_1 != 0;
            return (float[]) (var17);
          } else {
            var42 = field_w[var14.field_c[var17_int]];
            var52 = field_v;
            var42.a(var52, var4 >> 1, var16 != 0);
            var17_int++;
            continue L9;
          }
        }
    }

    private final static boolean a(gn param0) {
        byte[] var1 = null;
        if (!field_r) {
            var1 = param0.a(0, true, 0);
            if (var1 == null) {
                return false;
            }
            sn.b(var1);
        }
        return true;
    }

    final static float a(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    final static int b() {
        int var0 = field_i[field_N] >> field_A & 1;
        field_A = field_A + 1;
        field_N = field_N + (field_A >> 3);
        field_A = field_A & 7;
        return var0;
    }

    final el c() {
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        int var3;
        float[] var4;
        int var5;
        int var6;
        int var7;
        this.field_L = 0;
        this.field_l = new float[field_p];
        var1 = new byte[this.field_D];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_n.length) {
            this.field_l = null;
            return new el(this.field_q, var1, this.field_J, this.field_u, this.field_E);
          } else {
            var4 = this.e(var3);
            if (var4 != null) {
              L1: {
                var5 = var4.length;
                if (var5 <= this.field_D - var2) {
                  break L1;
                } else {
                  var5 = this.field_D - var2;
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
                  incrementValue$0 = var2;
                  var2++;
                  var1[incrementValue$0] = (byte)(var7 - 128);
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

    final static int f(int param0) {
        int var4 = 0;
        int var3 = 0;
        int var1 = 0;
        int var2 = 0;
        while (param0 >= 8 - field_A) {
            var3 = 8 - field_A;
            var4 = (1 << var3) - 1;
            var1 = var1 + ((field_i[field_N] >> field_A & var4) << var2);
            field_A = 0;
            field_N = field_N + 1;
            var2 = var2 + var3;
            param0 = param0 - var3;
        }
        if (param0 > 0) {
            var3 = (1 << param0) - 1;
            var1 = var1 + ((field_i[field_N] >> field_A & var3) << var2);
            field_A = field_A + param0;
        }
        return var1;
    }

    private final void a(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        th var2 = new th(param0);
        this.field_q = var2.a(-56);
        this.field_D = var2.a(-67);
        this.field_J = var2.a(-88);
        this.field_u = var2.a(113);
        if (this.field_u < 0) {
            this.field_u = this.field_u ^ -1;
            this.field_E = true;
        }
        int var3 = var2.a(47);
        if (var3 < 0) {
            throw new IOException();
        }
        this.field_n = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.f((byte) -36);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.a(var5, 0, (byte) 106, var6);
            this.field_n[var4] = var6;
        }
    }

    private final static void a(byte[] param0, int param1) {
        field_i = param0;
        field_N = param1;
        field_A = 0;
    }

    final static void b(byte[] param0) {
        int stackIn_5_0 = 0;
        boolean[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        float[] var6_ref_float__;
        int var7_int;
        float[] var7;
        int var8_int;
        float[] var8;
        int var9_int;
        int[] var9;
        int var10;
        int var11;
        sn.a(param0, 0);
        field_t = 1 << sn.f(4);
        field_p = 1 << sn.f(4);
        field_v = new float[field_p];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = sn.f(8) + 1;
            field_F = new re[var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = sn.f(6) + 1;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2) {
                    var2 = sn.f(6) + 1;
                    field_K = new nb[var2];
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2) {
                        var3 = sn.f(6) + 1;
                        field_w = new s[var3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var4 = sn.f(6) + 1;
                            field_B = new nf[var4];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var4) {
                                var5 = sn.f(6) + 1;
                                field_M = new boolean[var5];
                                field_O = new int[var5];
                                var6 = 0;
                                L6: while (true) {
                                  if (var6 >= var5) {
                                    field_r = true;
                                    return;
                                  } else {
                                    L7: {
                                      stackIn_39_0 = (boolean[]) (field_M);

                                      stackIn_39_1 = var6;

                                      if (sn.b() == 0) {
                                        stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = 0;
                                        break L7;
                                      } else {
                                        stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = 1;
                                        break L7;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2 != 0;
                                    sn.f(16);
                                    sn.f(16);
                                    field_O[var6] = sn.f(8);
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_B[var5] = new nf();
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            field_w[var4] = new s();
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        field_K[var3] = new nb();
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    sn.f(16);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                field_F[var2] = new re();
                var2++;
                continue L1;
              }
            }
          } else {
            L8: {
              if (var1 == 0) {
                stackIn_5_0 = field_t;
                break L8;
              } else {
                stackIn_5_0 = field_p;
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
                        var10 = qm.a(var5 - 1, (byte) -76);
                        var11 = 0;
                        L12: while (true) {
                          if (var11 >= var5) {
                            if (var1 == 0) {
                              field_H = var6_ref_float__;
                              field_x = var7;
                              field_j = var8;
                              field_y = var9;
                              var1++;
                              continue L0;
                            } else {
                              field_s = var6_ref_float__;
                              field_o = var7;
                              field_P = var8;
                              field_z = var9;
                              var1++;
                              continue L0;
                            }
                          } else {
                            var9[var11] = gd.a(var11, (byte) -26, var10);
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

    private sn(byte[] param0) throws IOException {
        this.a(param0);
    }

    public static void a() {
        field_i = null;
        field_F = null;
        field_K = null;
        field_w = null;
        field_B = null;
        field_M = null;
        field_O = null;
        field_v = null;
        field_H = null;
        field_x = null;
        field_j = null;
        field_s = null;
        field_o = null;
        field_P = null;
        field_y = null;
        field_z = null;
    }

    static {
        field_r = false;
    }
}
