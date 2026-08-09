/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg extends gn {
    private static int[] field_g;
    private static byte[] field_G;
    private static float[] field_H;
    private int field_D;
    private int field_k;
    static ho[] field_F;
    private static float[] field_p;
    private static float[] field_e;
    private int field_o;
    private static int field_B;
    private static int field_h;
    private static float[] field_j;
    private int field_A;
    private int field_q;
    private static float[] field_x;
    private static boolean[] field_K;
    private static boolean field_z;
    private static int field_C;
    private byte[] field_J;
    private static float[] field_w;
    private static oq[] field_I;
    private static int[] field_L;
    private static int[] field_t;
    private int field_n;
    private boolean field_r;
    private boolean field_v;
    private static hb[] field_m;
    private static int field_i;
    private static km[] field_y;
    private int field_l;
    private int field_s;
    private float[] field_u;
    private byte[][] field_E;
    private static float[] field_f;

    final to a(int[] param0) {
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
          if (this.field_J != null) {
            break L1;
          } else {
            this.field_D = 0;
            this.field_u = new float[field_i];
            this.field_J = new byte[this.field_s];
            this.field_q = 0;
            this.field_n = 0;
            break L1;
          }
        }
        L2: while (true) {
          if (this.field_n >= this.field_E.length) {
            this.field_u = null;
            var12 = this.field_J;
            this.field_J = null;
            return new to(this.field_k, var12, this.field_l, this.field_o, this.field_v);
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
              var7 = this.b(this.field_n);
              if (var7 == null) {
                break L4;
              } else {
                L5: {
                  var3 = this.field_q;
                  var4 = var7.length;
                  if (var4 <= this.field_s - var3) {
                    break L5;
                  } else {
                    var4 = this.field_s - var3;
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
                        param0[0] = param0[0] - (var3 - this.field_q);
                        break L7;
                      }
                    }
                    this.field_q = var3;
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
                    this.field_J[incrementValue$0] = (byte)(var6 - 128);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
            this.field_n = this.field_n + 1;
            continue L2;
          }
        }
    }

    final static tg a(sj param0, String param1, String param2) {
        try {
            tg var4_ref = null;
            if (!tg.a(param0)) {
                param0.a(param1, param2, (byte) -10);
                return null;
            }
            byte[] var3 = param0.a(param2, param1, 124);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new tg(var3);
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

    private final void a(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        iw var2 = new iw(param0);
        this.field_k = var2.k(4);
        this.field_s = var2.k(4);
        this.field_l = var2.k(4);
        this.field_o = var2.k(4);
        if (this.field_o < 0) {
            this.field_o = this.field_o ^ -1;
            this.field_v = true;
        }
        int var3 = var2.k(4);
        if (var3 < 0) {
            throw new IOException();
        }
        this.field_E = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.h((byte) -128);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.a(var6, 0, (byte) -6, var5);
            this.field_E[var4] = var6;
        }
    }

    final static tg a(sj param0, int param1, int param2) {
        try {
            tg var4_ref = null;
            if (!tg.a(param0)) {
                param0.a(param2, 51, param1);
                return null;
            }
            byte[] var3 = param0.b(param1, -32669, param2);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new tg(var3);
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

    public static void a() {
        field_G = null;
        field_F = null;
        field_y = null;
        field_m = null;
        field_I = null;
        field_K = null;
        field_g = null;
        field_j = null;
        field_p = null;
        field_e = null;
        field_H = null;
        field_w = null;
        field_x = null;
        field_f = null;
        field_t = null;
        field_L = null;
    }

    private final static void a(byte[] param0, int param1) {
        field_G = param0;
        field_C = param1;
        field_h = 0;
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
        tg.a(param0, 0);
        field_B = 1 << tg.e(4);
        field_i = 1 << tg.e(4);
        field_j = new float[field_i];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = tg.e(8) + 1;
            field_F = new ho[var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = tg.e(6) + 1;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2) {
                    var2 = tg.e(6) + 1;
                    field_y = new km[var2];
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2) {
                        var3 = tg.e(6) + 1;
                        field_m = new hb[var3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var4 = tg.e(6) + 1;
                            field_I = new oq[var4];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var4) {
                                var5 = tg.e(6) + 1;
                                field_K = new boolean[var5];
                                field_g = new int[var5];
                                var6 = 0;
                                L6: while (true) {
                                  if (var6 >= var5) {
                                    field_z = true;
                                    return;
                                  } else {
                                    L7: {
                                      stackIn_39_0 = (boolean[]) (field_K);

                                      stackIn_39_1 = var6;

                                      if (tg.b() == 0) {
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
                                    tg.e(16);
                                    tg.e(16);
                                    field_g[var6] = tg.e(8);
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_I[var5] = new oq();
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            field_m[var4] = new hb();
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        field_y[var3] = new km();
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    tg.e(16);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                field_F[var2] = new ho();
                var2++;
                continue L1;
              }
            }
          } else {
            L8: {
              if (var1 == 0) {
                stackIn_5_0 = field_B;
                break L8;
              } else {
                stackIn_5_0 = field_i;
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
                        var10 = cm.a(true, var5 - 1);
                        var11 = 0;
                        L12: while (true) {
                          if (var11 >= var5) {
                            if (var1 == 0) {
                              field_p = var6_ref_float__;
                              field_e = var7;
                              field_H = var8;
                              field_t = var9;
                              var1++;
                              continue L0;
                            } else {
                              field_w = var6_ref_float__;
                              field_x = var7;
                              field_f = var8;
                              field_L = var9;
                              var1++;
                              continue L0;
                            }
                          } else {
                            var9[var11] = sf.a(-5974, var11, var10);
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

    final static int b() {
        int var0 = field_G[field_C] >> field_h & 1;
        field_h = field_h + 1;
        field_C = field_C + (field_h >> 3);
        field_h = field_h & 7;
        return var0;
    }

    final static int e(int param0) {
        int var4 = 0;
        int var3 = 0;
        int var1 = 0;
        int var2 = 0;
        while (param0 >= 8 - field_h) {
            var3 = 8 - field_h;
            var4 = (1 << var3) - 1;
            var1 = var1 + ((field_G[field_C] >> field_h & var4) << var2);
            field_h = 0;
            field_C = field_C + 1;
            var2 = var2 + var3;
            param0 = param0 - var3;
        }
        if (param0 > 0) {
            var3 = (1 << param0) - 1;
            var1 = var1 + ((field_G[field_C] >> field_h & var3) << var2);
            field_h = field_h + param0;
        }
        return var1;
    }

    private final static boolean a(sj param0) {
        byte[] var1 = null;
        if (!field_z) {
            var1 = param0.b(0, -32669, 0);
            if (var1 == null) {
                return false;
            }
            tg.b(var1);
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

    final to c() {
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        int var3;
        float[] var4;
        int var5;
        int var6;
        int var7;
        this.field_D = 0;
        this.field_u = new float[field_i];
        var1 = new byte[this.field_s];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_E.length) {
            this.field_u = null;
            return new to(this.field_k, var1, this.field_l, this.field_o, this.field_v);
          } else {
            var4 = this.b(var3);
            if (var4 != null) {
              L1: {
                var5 = var4.length;
                if (var5 <= this.field_s - var2) {
                  break L1;
                } else {
                  var5 = this.field_s - var2;
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

    private final float[] b(int param0) {
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
        oq var14;
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
        hb var42;
        int[] var44;
        float[] var45;
        float[] var46;
        int[] var48;
        float[] var49;
        float[] var50;
        float[] var52;
        L0: {
          tg.a(this.field_E[param0], 0);
          tg.b();
          var2 = tg.e(cm.a(true, field_g.length - 1));
          var3 = field_K[var2] ? 1 : 0;
          if (var3 == 0) {
            stackIn_3_0 = field_B;
            break L0;
          } else {
            stackIn_3_0 = field_i;
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
              if (tg.b() == 0) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              if (tg.b() == 0) {
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
                var8 = (var4 >> 2) - (field_B >> 2);
                var9 = (var4 >> 2) + (field_B >> 2);
                var10 = field_B >> 1;
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
                var11 = var4 - (var4 >> 2) - (field_B >> 2);
                var12 = var4 - (var4 >> 2) + (field_B >> 2);
                var13 = field_B >> 1;
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
          var14 = field_I[field_g[var2]];
          var16 = var14.field_c;
          var17_int = var14.field_a[var16];
          if (field_y[var17_int].b()) {
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
          if (var17_int >= var14.field_b) {
            L10: {
              if (var15 != 0) {
                break L10;
              } else {
                var17_int = var14.field_c;
                var18_int = var14.field_a[var17_int];
                field_y[var18_int].a(field_j, var4 >> 1);
                break L10;
              }
            }
            L11: {
              if (var15 == 0) {
                var17_int = var4 >> 1;
                var18_int = var4 >> 2;
                var19 = var4 >> 3;
                var49 = field_j;
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
                            stackIn_40_0 = (float[]) (field_p);
                            break L14;
                          } else {
                            stackIn_40_0 = (float[]) (field_w);
                            break L14;
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var3 == 0) {
                            stackIn_43_0 = (float[]) (field_e);
                            break L15;
                          } else {
                            stackIn_43_0 = (float[]) (field_x);
                            break L15;
                          }
                        }
                        L16: {
                          var22 = stackIn_43_0;
                          if (var3 == 0) {
                            stackIn_46_0 = (float[]) (field_H);
                            break L16;
                          } else {
                            stackIn_46_0 = (float[]) (field_f);
                            break L16;
                          }
                        }
                        L17: {
                          var23 = stackIn_46_0;
                          if (var3 == 0) {
                            stackIn_49_0 = (int[]) (field_t);
                            break L17;
                          } else {
                            stackIn_49_0 = (int[]) (field_L);
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
                                var25 = cm.a(true, var4 - 1);
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
                                                                                field_j[var26] = field_j[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                                var26++;
                                                                                continue L31;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                                                                            field_j[var26] = field_j[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
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
                    field_j[var17_int] = 0.0f;
                    var17_int++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              var17 = null;
              if (this.field_D <= 0) {
                break L35;
              } else {
                L36: {
                  var18_int = this.field_D + var4 >> 2;
                  var50 = new float[var18_int];
                  var46 = var50;
                  var40 = var46;
                  var17 = var40;
                  if (this.field_r) {
                    break L36;
                  } else {
                    var19 = 0;
                    L37: while (true) {
                      if (var19 >= this.field_A) {
                        break L36;
                      } else {
                        var20 = (this.field_D >> 1) + var19;
                        var40[var19] = var40[var19] + this.field_u[var20];
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
                      var40[var20] = var40[var20] + field_j[var19];
                      var19++;
                      continue L38;
                    }
                  }
                }
              }
            }
            L39: {
              var18 = this.field_u;
              this.field_u = field_j;
              field_j = var18;
              this.field_D = var4;
              this.field_A = var12 - (var4 >> 1);
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
            ((tg) (this)).field_r = stackIn_111_1 != 0;
            return (float[]) (var17);
          } else {
            var42 = field_m[var14.field_d[var17_int]];
            var52 = field_j;
            var42.a(var52, var4 >> 1, var16 != 0);
            var17_int++;
            continue L9;
          }
        }
    }

    private tg(byte[] param0) throws IOException {
        this.a(param0);
    }

    static {
        field_z = false;
    }
}
