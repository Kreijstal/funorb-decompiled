/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends am {
    static String field_v;
    static int field_A;
    private int field_x;
    private int field_D;
    private int field_y;
    private short[] field_B;
    static gh field_C;
    static int field_z;
    private int field_t;
    private int field_s;
    private byte[] field_u;
    private int field_w;

    final static void d(int param0) {
        vo.field_a[61] = 27;
        vo.field_a[59] = 57;
        vo.field_a[93] = 43;
        vo.field_a[520] = 59;
        vo.field_a[222] = 58;
        vo.field_a[192] = 28;
        vo.field_a[92] = 74;
        vo.field_a[46] = 72;
        vo.field_a[44] = 71;
        vo.field_a[45] = 26;
        vo.field_a[47] = 73;
        vo.field_a[91] = 42;
        if (param0 > -45) {
            Object var2 = null;
            vn discarded$0 = qg.a((la) null, (la) null, (String) null, (String) null, 100);
        }
    }

    final static vn a(la param0, la param1, String param2, String param3, int param4) {
        int var5 = param1.a(param4 ^ -256, param2);
        int var6 = param1.a(param3, -112, var5);
        if (param4 != 255) {
            return null;
        }
        return gd.a(param1, var5, param0, var6, param4 ^ 237);
    }

    final static void a(double param0, double[] param1, int param2, double param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int stackIn_14_0 = 0;
        gg[] stackIn_14_1 = null;
        int stackIn_15_0 = 0;
        gg[] stackIn_15_1 = null;
        int stackIn_16_0 = 0;
        gg[] stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackOut_13_0 = 0;
        gg[] stackOut_13_1 = null;
        int stackOut_15_0 = 0;
        gg[] stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_14_0 = 0;
        gg[] stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        L0: {
          var13 = Torquing.field_u;
          if (!param4) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        L1: {
          if (param2 != 3) {
            if (1 != param2) {
              break L1;
            } else {
              L2: {
                var9 = 2500.0;
                if (param3 >= var9) {
                  var8 = (int)(0.5 + 100.0 * Math.sqrt(param3 / var9));
                  var7 = 96;
                  break L2;
                } else {
                  var7 = (int)(0.5 + 96.0 * param3 / var9);
                  var8 = 100;
                  break L2;
                }
              }
              L3: {
                if (null != ie.field_b) {
                  var11 = ap.b(ie.field_b.field_P.field_g, 0, param1, 0);
                  if (var11 <= 200.0) {
                    break L3;
                  } else {
                    var7 = (int)((double)(var7 * 200) / var11);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (var7 <= 16) {
                  break L4;
                } else {
                  L5: {
                    stackOut_13_0 = 1;
                    stackOut_13_1 = th.field_F;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (0.0 == param0) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = (gg[]) (Object) stackIn_15_1;
                      stackOut_15_2 = 25;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      break L5;
                    } else {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = (gg[]) (Object) stackIn_14_1;
                      stackOut_14_2 = 26;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      break L5;
                    }
                  }
                  ip.a(stackIn_16_0 != 0, nj.a(stackIn_16_1[stackIn_16_2], var8, var7));
                  break L4;
                }
              }
              if (0.0 != param0) {
                break L1;
              } else {
                if (-151 > (var8 ^ -1)) {
                  fq.a(false, 100, th.field_F[14], var7);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            th.a(100, th.field_F[28]);
            break L1;
          }
        }
        L6: {
          L7: {
            if (0 == qd.field_d) {
              break L7;
            } else {
              if (2 != param2) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          qd.field_d = param2;
          break L6;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
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
        int stackIn_8_0 = 0;
        byte[] stackIn_8_1 = null;
        int stackIn_9_0 = 0;
        byte[] stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_13_0 = 0;
        byte[] stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        byte[] stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        byte[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_38_0 = 0.0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackOut_7_0 = 0;
        byte[] stackOut_7_1 = null;
        int stackOut_9_0 = 0;
        byte[] stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        byte[] stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_12_0 = 0;
        byte[] stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_14_0 = 0;
        byte[] stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_13_0 = 0;
        byte[] stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        double stackOut_37_0 = 0.0;
        double stackOut_39_0 = 0.0;
        int stackOut_39_1 = 0;
        double stackOut_38_0 = 0.0;
        int stackOut_38_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var19 = Torquing.field_u;
          if (param0 >= 86) {
            break L0;
          } else {
            qg.d(72);
            break L0;
          }
        }
        L1: {
          var3 = ((qg) this).field_l.a(param1, 25657);
          if (!((qg) this).field_l.field_b) {
            break L1;
          } else {
            var4 = 2048 - -(dp.field_a[param1] * ((qg) this).field_w);
            var5 = var4 >> 1439259884;
            var6 = 1 + var5;
            var14 = 0;
            L2: while (true) {
              if (var14 >= ci.field_c) {
                break L1;
              } else {
                gq.field_b = 2147483647;
                gp.field_K = 2147483647;
                ln.field_F = 2147483647;
                hl.field_a = 2147483647;
                var15 = q.field_b[var14] * ((qg) this).field_D + 2048;
                var16 = var15 >> -1172010644;
                var17 = var16 - -1;
                var8 = var5 - 1;
                L3: while (true) {
                  if (var6 < var8) {
                    L4: {
                      var18 = ((qg) this).field_t;
                      if (var18 != 0) {
                        if (-2 == (var18 ^ -1)) {
                          var3[var14] = ln.field_F;
                          break L4;
                        } else {
                          if (-4 != (var18 ^ -1)) {
                            if (var18 == 4) {
                              var3[var14] = gp.field_K;
                              break L4;
                            } else {
                              if (-3 == (var18 ^ -1)) {
                                var3[var14] = ln.field_F + -hl.field_a;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            var3[var14] = gq.field_b;
                            break L4;
                          }
                        }
                      } else {
                        var3[var14] = hl.field_a;
                        break L4;
                      }
                    }
                    var14++;
                    continue L2;
                  } else {
                    L5: {
                      stackOut_7_0 = 255;
                      stackOut_7_1 = ((qg) this).field_u;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (((qg) this).field_w <= var8) {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = (byte[]) (Object) stackIn_9_1;
                        stackOut_9_2 = var8 - ((qg) this).field_w;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L5;
                      } else {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = (byte[]) (Object) stackIn_8_1;
                        stackOut_8_2 = var8;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L5;
                      }
                    }
                    var12 = stackIn_10_0 & stackIn_10_1[stackIn_10_2 & 255];
                    var7 = var16 + -1;
                    L6: while (true) {
                      if ((var17 ^ -1) > (var7 ^ -1)) {
                        var8++;
                        continue L3;
                      } else {
                        L7: {
                          stackOut_12_0 = 255;
                          stackOut_12_1 = ((qg) this).field_u;
                          stackOut_12_2 = 255;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          if (var7 >= ((qg) this).field_D) {
                            stackOut_14_0 = stackIn_14_0;
                            stackOut_14_1 = (byte[]) (Object) stackIn_14_1;
                            stackOut_14_2 = stackIn_14_2;
                            stackOut_14_3 = var7 + -((qg) this).field_D;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            break L7;
                          } else {
                            stackOut_13_0 = stackIn_13_0;
                            stackOut_13_1 = (byte[]) (Object) stackIn_13_1;
                            stackOut_13_2 = stackIn_13_2;
                            stackOut_13_3 = var7;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            break L7;
                          }
                        }
                        L8: {
                          var13 = (stackIn_15_0 & stackIn_15_1[stackIn_15_2 & stackIn_15_3 + var12]) * 2;
                          int incrementValue$1 = var13;
                          var13++;
                          var9 = -(var7 << 1373435212) + (-((qg) this).field_B[incrementValue$1] + var15);
                          var10 = -(var8 << -468475924) - ((qg) this).field_B[var13] + var4;
                          var18 = ((qg) this).field_y;
                          if (-2 == (var18 ^ -1)) {
                            var11 = var10 * var10 + var9 * var9 >> -363281524;
                            break L8;
                          } else {
                            if (3 != var18) {
                              if (-5 != (var18 ^ -1)) {
                                if (var18 == 5) {
                                  var9 = var9 * var9;
                                  var10 = var10 * var10;
                                  var11 = (int)(Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 16777216.0f))) * 4096.0);
                                  break L8;
                                } else {
                                  if (2 != var18) {
                                    var11 = (int)(4096.0 * Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)));
                                    break L8;
                                  } else {
                                    L9: {
                                      if ((var10 ^ -1) <= -1) {
                                        stackOut_44_0 = var10;
                                        stackIn_45_0 = stackOut_44_0;
                                        break L9;
                                      } else {
                                        stackOut_43_0 = -var10;
                                        stackIn_45_0 = stackOut_43_0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      stackOut_45_0 = stackIn_45_0;
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var9 < 0) {
                                        stackOut_47_0 = stackIn_47_0;
                                        stackOut_47_1 = -var9;
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        break L10;
                                      } else {
                                        stackOut_46_0 = stackIn_46_0;
                                        stackOut_46_1 = var9;
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        break L10;
                                      }
                                    }
                                    var11 = stackIn_48_0 + stackIn_48_1;
                                    break L8;
                                  }
                                }
                              } else {
                                L11: {
                                  if (var9 < 0) {
                                    stackOut_36_0 = -var9;
                                    stackIn_37_0 = stackOut_36_0;
                                    break L11;
                                  } else {
                                    stackOut_35_0 = var9;
                                    stackIn_37_0 = stackOut_35_0;
                                    break L11;
                                  }
                                }
                                L12: {
                                  var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                                  stackOut_37_0 = 4096.0;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  if (0 > var10) {
                                    stackOut_39_0 = stackIn_39_0;
                                    stackOut_39_1 = -var10;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    break L12;
                                  } else {
                                    stackOut_38_0 = stackIn_38_0;
                                    stackOut_38_1 = var10;
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_40_1 = stackOut_38_1;
                                    break L12;
                                  }
                                }
                                var10 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                                var11 = var10 + var9;
                                var11 = var11 * var11 >> -1256393812;
                                break L8;
                              }
                            } else {
                              L13: {
                                if ((var9 ^ -1) <= -1) {
                                  stackOut_26_0 = var9;
                                  stackIn_27_0 = stackOut_26_0;
                                  break L13;
                                } else {
                                  stackOut_25_0 = -var9;
                                  stackIn_27_0 = stackOut_25_0;
                                  break L13;
                                }
                              }
                              L14: {
                                var9 = stackIn_27_0;
                                if (-1 >= (var10 ^ -1)) {
                                  stackOut_29_0 = var10;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L14;
                                } else {
                                  stackOut_28_0 = -var10;
                                  stackIn_30_0 = stackOut_28_0;
                                  break L14;
                                }
                              }
                              L15: {
                                var10 = stackIn_30_0;
                                if ((var9 ^ -1) < (var10 ^ -1)) {
                                  stackOut_32_0 = var9;
                                  stackIn_33_0 = stackOut_32_0;
                                  break L15;
                                } else {
                                  stackOut_31_0 = var10;
                                  stackIn_33_0 = stackOut_31_0;
                                  break L15;
                                }
                              }
                              var11 = stackIn_33_0;
                              break L8;
                            }
                          }
                        }
                        L16: {
                          if ((var11 ^ -1) > (hl.field_a ^ -1)) {
                            gp.field_K = gq.field_b;
                            gq.field_b = ln.field_F;
                            ln.field_F = hl.field_a;
                            hl.field_a = var11;
                            break L16;
                          } else {
                            if (var11 < ln.field_F) {
                              gp.field_K = gq.field_b;
                              gq.field_b = ln.field_F;
                              ln.field_F = var11;
                              break L16;
                            } else {
                              if ((var11 ^ -1) <= (gq.field_b ^ -1)) {
                                if ((var11 ^ -1) <= (gp.field_K ^ -1)) {
                                  break L16;
                                } else {
                                  gp.field_K = var11;
                                  break L16;
                                }
                              } else {
                                gp.field_K = gq.field_b;
                                gq.field_b = var11;
                                break L16;
                              }
                            }
                          }
                        }
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          if (param1 == 35) {
            break L0;
          } else {
            ((qg) this).field_u = null;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if ((var4 ^ -1) != -1) {
            if (-2 != (var4 ^ -1)) {
              if (2 != var4) {
                if ((var4 ^ -1) != -4) {
                  if (4 != var4) {
                    if (var4 != 5) {
                      if (var4 != 6) {
                        break L1;
                      } else {
                        ((qg) this).field_w = param0.i((byte) -101);
                        break L1;
                      }
                    } else {
                      ((qg) this).field_D = param0.i((byte) -101);
                      break L1;
                    }
                  } else {
                    ((qg) this).field_y = param0.i((byte) -101);
                    break L1;
                  }
                } else {
                  ((qg) this).field_t = param0.i((byte) -101);
                  break L1;
                }
              } else {
                ((qg) this).field_s = param0.i(7088);
                break L1;
              }
            } else {
              ((qg) this).field_x = param0.i((byte) -101);
              break L1;
            }
          } else {
            int dupTemp$1 = param0.i((byte) -101);
            ((qg) this).field_w = dupTemp$1;
            ((qg) this).field_D = dupTemp$1;
            break L1;
          }
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        if (param0 <= 12) {
            this.b(-97);
        }
        Random var5 = new Random((long)((qg) this).field_x);
        Random var2 = var5;
        ((qg) this).field_B = new short[512];
        if ((((qg) this).field_s ^ -1) < -1) {
            for (var3 = 0; -513 < (var3 ^ -1); var3++) {
                ((qg) this).field_B[var3] = (short)va.a(((qg) this).field_s, (byte) 120, var5);
            }
        }
    }

    public static void c(int param0) {
        field_C = null;
        if (param0 != -1172010644) {
            field_v = null;
        }
        field_v = null;
    }

    public qg() {
        super(0, true);
        ((qg) this).field_B = new short[512];
        ((qg) this).field_y = 1;
        ((qg) this).field_D = 5;
        ((qg) this).field_u = new byte[512];
        ((qg) this).field_x = 0;
        ((qg) this).field_t = 2;
        ((qg) this).field_s = 2048;
        ((qg) this).field_w = 5;
    }

    final void a(byte param0) {
        ((qg) this).field_u = i.b(10758, ((qg) this).field_x);
        this.b(117);
        if (param0 <= 123) {
            field_z = 44;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_z = 100;
    }
}
