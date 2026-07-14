/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends sl {
    private boolean field_q;
    private int field_G;
    static int field_z;
    static int field_v;
    private int field_D;
    private int field_u;
    static la field_C;
    private int field_s;
    private int field_F;
    static rl field_y;
    private short[][] field_B;
    static String field_r;
    static String field_w;
    static String[] field_t;
    private ja field_x;
    private boolean field_E;
    private int field_A;
    private u field_p;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        gd.field_x = param0 ? true : false;
        super.a(false, 1000, param0);
        ((ra) this).field_p = nl.a(((ra) this).field_s, ((ra) this).field_E, -257, ((ra) this).field_a - -(26 * ((ra) this).field_D), ((ra) this).field_G, ((ra) this).field_F, ((ra) this).field_u * 26 + ((ra) this).field_f, ((ra) this).field_d[((ra) this).field_u][((ra) this).field_D]);
        if (((ra) this).field_h >= ((ra) this).field_A) {
            if (((ra) this).field_p != null) {
                ((ra) this).field_x.a((fc) (Object) ((ra) this).field_p, (byte) -78);
            }
            var2 = he.field_e.nextInt() & 16777215;
            ((ra) this).field_A = ((ra) this).field_h - -8 + sc.a(var2, -1);
        }
        u var4 = (u) (Object) ((ra) this).field_x.b(2);
        while (var4 != null) {
            var4.d(18132);
            var4 = (u) (Object) ((ra) this).field_x.a(10);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int[] param5, int param6, int[] param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        L0: {
          var16 = TrackController.field_F ? 1 : 0;
          var12 = param11 * param1;
          var13 = param9;
          if (param4 == -64) {
            break L0;
          } else {
            var17 = null;
            ra.a(-30, -95, 92, -104, (byte) 105, (int[]) null, 27, (int[]) null, -25, 18, -33, 60);
            break L0;
          }
        }
        var14 = -param2;
        L1: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            var15 = -param6;
            L2: while (true) {
              if (var15 >= 0) {
                param0 = param0 + param8;
                param10 = param10 + (-param9 + var13 - -param1);
                param9 = var13;
                param3++;
                if (param3 == param11) {
                  param3 = 0;
                  param10 = param10 - var12;
                  var14++;
                  continue L1;
                } else {
                  var14++;
                  continue L1;
                }
              } else {
                param0++;
                param10++;
                param5[param0] = param7[param10];
                param9++;
                if (param1 == param9) {
                  param10 = param10 - param1;
                  param9 = 0;
                  var15++;
                  continue L2;
                } else {
                  var15++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static hg a(int param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        hg var2 = new hg(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qk.field_M);
        if (param0 != -502) {
            field_v = 93;
        }
        ff.b(126);
        return var2;
    }

    public static void a(int param0) {
        field_w = null;
        field_t = null;
        if (param0 >= -64) {
            field_r = null;
        }
        field_y = null;
        field_r = null;
        field_C = null;
    }

    ra(byte[][] param0, int[][] param1, int[][] param2, int param3, int param4, boolean param5) {
        super(param5, param3, param4);
        int var7 = 0;
        int var8 = 0;
        ((ra) this).field_q = true;
        ((ra) this).field_E = true;
        ((ra) this).field_x = new ja();
        ((ra) this).a(param1, (byte) 50, param2, param0);
        ((ra) this).field_B = new short[param0.length][param0[0].length];
        for (var7 = 0; var7 < param1.length; var7++) {
            for (var8 = 0; var8 < param1[var7].length; var8++) {
                if ((64 & param1[var7][var8]) != 0) {
                    ((ra) this).field_D = var8;
                    ((ra) this).field_u = var7;
                    ((ra) this).field_d[var7][var8] = ma.a(64, param1[var7][var8]);
                    ((ra) this).field_F = ud.a((byte) -56, ((ra) this).field_d[var7][var8]);
                    ((ra) this).field_s = e.a(((ra) this).field_d[var7][var8], -1932340400, ((ra) this).field_F);
                }
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = TrackController.field_F ? 1 : 0;
        if (param3 > -39) {
            ((ra) this).a(false);
        }
        int var8 = e.field_a[((ra) this).field_d[((ra) this).field_u][((ra) this).field_D]] & (param6 | param4 | param1);
        var8 = this.b(var8, ((ra) this).field_D, 16384, ((ra) this).field_u);
        if (param4 == var8) {
            ((ra) this).field_s = param2;
        } else {
            if (param6 == var8) {
                ((ra) this).field_s = param5;
            } else {
                if (param1 == var8) {
                    ((ra) this).field_s = param0;
                } else {
                    ((ra) this).field_q = false;
                }
            }
        }
    }

    ra(ea param0, int param1, int param2) {
        this(param0.field_o, param0.field_d, param0.field_i, param1, param2, true);
    }

    final void c(byte param0) {
        int var3 = 0;
        short[] var4 = null;
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        short[][] var2 = ((ra) this).field_B;
        if (param0 <= 42) {
            return;
        }
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            for (var5 = 0; var4.length > var5; var5++) {
                var4[var5] = (short)he.field_e.nextInt();
            }
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        u var5 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        super.a(param0, 101);
        if (param1 >= 72) {
          var5 = (u) (Object) ((ra) this).field_x.b(2);
          L0: while (true) {
            if (var5 == null) {
              if (!((ra) this).field_q) {
                return;
              } else {
                L1: {
                  ((ra) this).field_G = ((ra) this).field_G + 1;
                  if (13 == ((ra) this).field_G + 1) {
                    L2: {
                      ((ra) this).field_G = -13;
                      if (((ra) this).field_d[((ra) this).field_u][((ra) this).field_D] != 24) {
                        break L2;
                      } else {
                        if (256 != ((ra) this).field_F) {
                          break L2;
                        } else {
                          L3: {
                            ((ra) this).field_F = 512;
                            stackOut_14_0 = this;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (((ra) this).field_E) {
                              stackOut_16_0 = this;
                              stackOut_16_1 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L3;
                            } else {
                              stackOut_15_0 = this;
                              stackOut_15_1 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L3;
                            }
                          }
                          ((ra) this).field_E = stackIn_17_1 != 0;
                          ((ra) this).field_s = 4096;
                          break L1;
                        }
                      }
                    }
                    L4: {
                      if ((((ra) this).field_d[((ra) this).field_u][((ra) this).field_D] ^ -1) != -26) {
                        break L4;
                      } else {
                        if ((((ra) this).field_F ^ -1) == -129) {
                          L5: {
                            ((ra) this).field_s = 2048;
                            ((ra) this).field_F = 1024;
                            stackOut_45_0 = this;
                            stackIn_47_0 = stackOut_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            if (((ra) this).field_E) {
                              stackOut_47_0 = this;
                              stackOut_47_1 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              break L5;
                            } else {
                              stackOut_46_0 = this;
                              stackOut_46_1 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_48_1 = stackOut_46_1;
                              break L5;
                            }
                          }
                          ((ra) this).field_E = stackIn_48_1 != 0;
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (((ra) this).field_s != 4096) {
                          break L7;
                        } else {
                          if (((ra) this).field_D == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (((ra) this).field_s != 8192) {
                          break L8;
                        } else {
                          if (-1 + ((ra) this).field_o[0].length == ((ra) this).field_D) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (16384 != ((ra) this).field_s) {
                          break L9;
                        } else {
                          if (0 == ((ra) this).field_u) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if ((((ra) this).field_s ^ -1) != -2049) {
                          break L10;
                        } else {
                          if (((ra) this).field_u != ((ra) this).field_o.length + -1) {
                            break L10;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 = ((ra) this).field_s;
                      if (var3 != 4096) {
                        if (var3 == -8193) {
                          ((ra) this).field_D = ((ra) this).field_D + 1;
                          ((ra) this).field_F = 256;
                          this.a(2048, 4, 8192, -48, 1, 16384, 16);
                          break L1;
                        } else {
                          if (16384 != var3) {
                            if (-2049 != var3) {
                              break L1;
                            } else {
                              ((ra) this).field_F = 1024;
                              ((ra) this).field_u = ((ra) this).field_u + 1;
                              this.a(8192, 32, 2048, -66, 2, 4096, 16);
                              break L1;
                            }
                          } else {
                            ((ra) this).field_u = ((ra) this).field_u - 1;
                            ((ra) this).field_F = 128;
                            this.a(8192, 8, 16384, -123, 2, 4096, 4);
                            break L1;
                          }
                        }
                      } else {
                        ((ra) this).field_F = 512;
                        ((ra) this).field_D = ((ra) this).field_D - 1;
                        this.a(2048, 8, 4096, -41, 1, 16384, 32);
                        break L1;
                      }
                    }
                    ((ra) this).field_G = 13;
                    ((ra) this).field_q = false;
                    return;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L11: {
                if (var5.e(0)) {
                  break L11;
                } else {
                  var5.a(-26);
                  break L11;
                }
              }
              var5 = (u) (Object) ((ra) this).field_x.a(10);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        var5 = sc.a(param0, -1);
        if (var5 < 2) {
          return param0;
        } else {
          L0: {
            if (var5 <= 2) {
              break L0;
            } else {
              var6 = (int)(Math.random() * (double)var5);
              var7 = 0;
              L1: while (true) {
                if (var7 >= 32) {
                  break L0;
                } else {
                  L2: {
                    if ((1 & param0 ^ -1) != -2) {
                      break L2;
                    } else {
                      var6--;
                      if (var6 == 0) {
                        return 1 << var7;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0 = param0 >> 1;
                  var7++;
                  continue L1;
                }
              }
            }
          }
          var6 = -1;
          var7 = -1;
          var8 = 0;
          L3: while (true) {
            L4: {
              if (-33 >= var8) {
                break L4;
              } else {
                L5: {
                  if (1 != (param0 & 1)) {
                    break L5;
                  } else {
                    if (0 != var7) {
                      var6 = var8;
                      break L4;
                    } else {
                      var7 = var8;
                      break L5;
                    }
                  }
                }
                param0 = param0 >> 1;
                var8++;
                continue L3;
              }
            }
            L6: {
              if (param2 == 16384) {
                break L6;
              } else {
                var12 = null;
                hg discarded$1 = ra.a(-59, (byte[]) null);
                break L6;
              }
            }
            L7: {
              var8 = (-var7 + 9) * var7 / 2 + (var6 - 1);
              var9 = 1 << var8;
              if ((var9 & ((ra) this).field_B[param3][param1]) == 0) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L7;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L7;
              }
            }
            L8: {
              var10 = stackIn_23_0;
              ((ra) this).field_B[param3][param1] = (short)ma.a((int) ((ra) this).field_B[param3][param1], var9);
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (var10 != 0) {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = var6;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L8;
              } else {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = var7;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L8;
              }
            }
            return stackIn_26_0 << stackIn_26_1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = -1;
        field_r = "Level ";
        field_w = "Waiting for extra data";
        field_t = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
