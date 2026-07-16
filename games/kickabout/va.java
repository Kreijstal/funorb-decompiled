/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va extends hs {
    private boolean field_B;
    private int field_z;
    static String[][] field_y;
    private ut[] field_C;
    static hd field_w;
    static long field_o;
    private int field_G;
    private int field_D;
    static String field_K;
    private boolean field_k;
    static int field_J;
    private boolean field_u;
    private byte[] field_t;
    private int[] field_v;
    private boolean field_m;
    private boolean field_L;
    private tf field_r;
    private int field_H;
    static String field_F;
    private int field_s;
    private int field_I;
    boolean field_l;
    private boolean field_j;
    private int field_q;
    private boolean field_E;
    private boolean field_n;
    private boolean field_x;
    private int field_p;

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nl[] var7 = null;
        int var8 = 0;
        nl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        var4 = ((va) this).field_a.field_g[((va) this).field_g].field_p;
        var5 = -1;
        var6 = 2147483647;
        var7 = ((va) this).field_a.field_P[var4];
        var8 = 1;
        L0: while (true) {
          if (var7.length <= var8) {
            this.g(var5 + param2, -1);
            return;
          } else {
            L1: {
              var9 = var7[var8];
              var10 = -param1 + var9.f(-125);
              var11 = -param0 + var9.a(true);
              var12 = var10 * var10 + var11 * var11;
              if ((((va) this).field_a.a((byte) 6, var4, var8) ^ -1) <= -1) {
                var12 = var12 << 1;
                break L1;
              } else {
                break L1;
              }
            }
            if (var12 < var6) {
              var6 = var12;
              var5 = var8;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 >= -56) {
            return -33;
        }
        return dq.a((byte) -61, param1, ru.field_l);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        boolean stackIn_11_3 = false;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        boolean stackIn_12_3 = false;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        boolean stackIn_13_3 = false;
        int stackIn_13_4 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean stackOut_10_3 = false;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        boolean stackOut_12_3 = false;
        int stackOut_12_4 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        boolean stackOut_11_3 = false;
        int stackOut_11_4 = 0;
        var5 = Kickabout.field_G;
        if (((va) this).field_a.field_X.field_m >= 40) {
          return;
        } else {
          L0: {
            if (-1 < (((va) this).field_a.field_V.field_m ^ -1)) {
              break L0;
            } else {
              if (0 > ((va) this).field_s) {
                break L0;
              } else {
                if (((va) this).field_a.field_V.field_m != ((va) this).field_s) {
                  L1: {
                    L2: {
                      if (1 == rm.field_C) {
                        break L2;
                      } else {
                        if (-3 == (rm.field_C ^ -1)) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      stackOut_10_0 = 0;
                      stackOut_10_1 = -1;
                      stackOut_10_2 = -79;
                      stackOut_10_3 = param0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      if (param0) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        break L3;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        break L3;
                      }
                    }
                    wh discarded$10 = gt.a(stackIn_13_0 != 0, stackIn_13_1, (byte) stackIn_13_2, fd.a(stackIn_13_3, stackIn_13_4 != 0, (byte) 97, false, false));
                    break L1;
                  }
                  L4: {
                    if ((rm.field_C ^ -1) == -2) {
                      if (!param0) {
                        wh discarded$11 = gt.a(false, -1, (byte) 81, 3);
                        break L4;
                      } else {
                        wh discarded$12 = gt.a(false, -1, (byte) -111, 4);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-3 == (rm.field_C ^ -1)) {
                      if (!param0) {
                        wh discarded$13 = gt.a(false, -1, (byte) -99, 24);
                        break L5;
                      } else {
                        wh discarded$14 = gt.a(false, -1, (byte) 104, 25);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if ((rm.field_C ^ -1) != -4) {
                    break L0;
                  } else {
                    if (!param0) {
                      wh discarded$15 = gt.a(false, -1, (byte) -70, 30);
                      break L0;
                    } else {
                      wh discarded$16 = gt.a(false, -1, (byte) 79, 31);
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (param1 == 3) {
            L6: {
              if (0 != (((va) this).field_s ^ -1)) {
                break L6;
              } else {
                if ((1 + -param2 ^ -1) != (((va) this).field_a.field_V.field_m ^ -1)) {
                  break L6;
                } else {
                  if (param2 != ((va) this).field_D) {
                    break L6;
                  } else {
                    L7: {
                      if (-2 != (rm.field_C ^ -1)) {
                        break L7;
                      } else {
                        wh discarded$17 = gt.a(false, -1, (byte) 91, 5);
                        break L7;
                      }
                    }
                    L8: {
                      if (2 == rm.field_C) {
                        wh discarded$18 = gt.a(false, -1, (byte) 91, 26);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if ((rm.field_C ^ -1) != -4) {
                      break L6;
                    } else {
                      wh discarded$19 = gt.a(false, -1, (byte) 96, 32);
                      break L6;
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final int h(int param0) {
        if (param0 != -41) {
            ((va) this).field_m = false;
        }
        return ((va) this).a((byte) 13) ? ((va) this).field_g : ((va) this).field_a.b((byte) -69, ((va) this).field_h);
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_113_0 = 0;
        boolean stackIn_113_1 = false;
        int stackIn_113_2 = 0;
        int stackIn_114_0 = 0;
        boolean stackIn_114_1 = false;
        int stackIn_114_2 = 0;
        int stackIn_115_0 = 0;
        boolean stackIn_115_1 = false;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_112_0 = 0;
        boolean stackOut_112_1 = false;
        int stackOut_112_2 = 0;
        int stackOut_114_0 = 0;
        boolean stackOut_114_1 = false;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_113_0 = 0;
        boolean stackOut_113_1 = false;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_120_3 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (!((va) this).field_E) {
            gs.a(0);
            ((va) this).field_E = true;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (40 > ((va) this).field_a.field_X.field_m) {
            ((va) this).field_p = ((va) this).field_p - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 != (((va) this).field_a.field_X.field_m ^ -1)) {
            ((va) this).field_B = true;
            break L2;
          } else {
            if (!((va) this).field_B) {
              break L2;
            } else {
              wh discarded$12 = sp.c(34, 75);
              ((va) this).field_B = false;
              break L2;
            }
          }
        }
        L3: {
          if (!((va) this).field_f) {
            if (!((va) this).field_f) {
              break L3;
            } else {
              if (-101 > (((va) this).field_a.field_v ^ -1)) {
                break L3;
              } else {
                if (((va) this).field_j) {
                  break L3;
                } else {
                  ((va) this).field_j = true;
                  wh discarded$13 = sp.c(33, 98);
                  break L3;
                }
              }
            }
          } else {
            if (!((va) this).field_f) {
              break L3;
            } else {
              if (-101 > (((va) this).field_a.field_v ^ -1)) {
                break L3;
              } else {
                if (((va) this).field_j) {
                  break L3;
                } else {
                  ((va) this).field_j = true;
                  wh discarded$14 = sp.c(33, 98);
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (-2 != ((va) this).field_g) {
            stackOut_22_0 = ((va) this).field_a.field_g[((va) this).field_g].field_p;
            stackIn_23_0 = stackOut_22_0;
            break L4;
          } else {
            stackOut_21_0 = 0;
            stackIn_23_0 = stackOut_21_0;
            break L4;
          }
        }
        L5: {
          var2 = stackIn_23_0;
          if (((va) this).field_a.field_V.field_m != var2) {
            stackOut_25_0 = 0;
            stackIn_26_0 = stackOut_25_0;
            break L5;
          } else {
            stackOut_24_0 = 1;
            stackIn_26_0 = stackOut_24_0;
            break L5;
          }
        }
        L6: {
          var3 = stackIn_26_0;
          stackOut_26_0 = 44040192;
          stackIn_28_0 = stackOut_26_0;
          stackIn_27_0 = stackOut_26_0;
          if (-1 == (var2 ^ -1)) {
            stackOut_28_0 = stackIn_28_0;
            stackOut_28_1 = -655360;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            break L6;
          } else {
            stackOut_27_0 = stackIn_27_0;
            stackOut_27_1 = 655360;
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            break L6;
          }
        }
        L7: {
          if (stackIn_29_0 + stackIn_29_1 <= ((va) this).field_a.field_V.field_p) {
            stackOut_31_0 = 0;
            stackIn_32_0 = stackOut_31_0;
            break L7;
          } else {
            stackOut_30_0 = 1;
            stackIn_32_0 = stackOut_30_0;
            break L7;
          }
        }
        L8: {
          L9: {
            var4 = stackIn_32_0;
            if (var2 != 0) {
              break L9;
            } else {
              if (var4 != 0) {
                break L9;
              } else {
                stackOut_34_0 = 1;
                stackIn_42_0 = stackOut_34_0;
                break L8;
              }
            }
          }
          if (1 == var2) {
            if (var4 != 0) {
              stackOut_40_0 = 1;
              stackIn_42_0 = stackOut_40_0;
              break L8;
            } else {
              stackOut_39_0 = 0;
              stackIn_42_0 = stackOut_39_0;
              break L8;
            }
          } else {
            stackOut_37_0 = 0;
            stackIn_42_0 = stackOut_37_0;
            break L8;
          }
        }
        L10: {
          var5 = stackIn_42_0;
          if (var5 != 0) {
            stackOut_44_0 = 0;
            stackIn_45_0 = stackOut_44_0;
            break L10;
          } else {
            stackOut_43_0 = 1;
            stackIn_45_0 = stackOut_43_0;
            break L10;
          }
        }
        var6 = stackIn_45_0;
        if (param0 == 2115) {
          L11: {
            if (var6 != 0) {
              stackOut_49_0 = 0;
              stackIn_50_0 = stackOut_49_0;
              break L11;
            } else {
              stackOut_48_0 = 1;
              stackIn_50_0 = stackOut_48_0;
              break L11;
            }
          }
          L12: {
            stackOut_50_0 = stackIn_50_0;
            stackIn_52_0 = stackOut_50_0;
            stackIn_51_0 = stackOut_50_0;
            if (((va) this).field_L) {
              stackOut_52_0 = stackIn_52_0;
              stackOut_52_1 = 0;
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              break L12;
            } else {
              stackOut_51_0 = stackIn_51_0;
              stackOut_51_1 = 1;
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              break L12;
            }
          }
          L13: {
            if (stackIn_53_0 == stackIn_53_1) {
              break L13;
            } else {
              if (-41 < (((va) this).field_a.field_X.field_m ^ -1)) {
                L14: {
                  stackOut_56_0 = this;
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_57_0 = stackOut_56_0;
                  if (var6 == 0) {
                    stackOut_58_0 = this;
                    stackOut_58_1 = 0;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    break L14;
                  } else {
                    stackOut_57_0 = this;
                    stackOut_57_1 = 1;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    break L14;
                  }
                }
                ((va) this).field_L = stackIn_59_1 != 0;
                so.a(rm.field_C, vi.field_n, true, ((va) this).field_L);
                break L13;
              } else {
                break L13;
              }
            }
          }
          L15: {
            if (!vi.field_n) {
              break L15;
            } else {
              L16: {
                L17: {
                  if (rm.field_C == 1) {
                    break L17;
                  } else {
                    if (2 != rm.field_C) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                this.a(var3 != 0, 4, var5 != 0);
                break L16;
              }
              if (3 == rm.field_C) {
                this.o(-23079);
                break L15;
              } else {
                break L15;
              }
            }
          }
          L18: {
            L19: {
              L20: {
                if ((((va) this).field_a.field_V.field_m ^ -1) != 0) {
                  break L20;
                } else {
                  if ((((va) this).field_s ^ -1) <= -1) {
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              if (0 > ((va) this).field_a.field_V.field_j) {
                break L18;
              } else {
                break L19;
              }
            }
            if (Math.abs(((va) this).field_a.field_V.field_n >> -2081994576) <= 4) {
              if ((((va) this).field_a.field_V.e(-118) ^ -1) < -6553601) {
                wh discarded$15 = sp.c(37, -113);
                break L18;
              } else {
                wh discarded$16 = sp.c(36, param0 ^ -2087);
                break L18;
              }
            } else {
              wh discarded$17 = sp.c(35, param0 + -2024);
              break L18;
            }
          }
          L21: {
            if (!vi.field_n) {
              break L21;
            } else {
              this.a(var3 != 0, param0 + -2112, var2);
              break L21;
            }
          }
          L22: {
            if (!vi.field_n) {
              break L22;
            } else {
              L23: {
                if (((va) this).field_a.field_V.field_y) {
                  break L23;
                } else {
                  if (((va) this).field_a.field_V.field_x) {
                    break L23;
                  } else {
                    break L22;
                  }
                }
              }
              L24: {
                if (24248320 < ((va) this).field_a.field_V.field_t) {
                  if (((va) this).field_a.field_V.field_t < 34603008) {
                    if ((((va) this).field_a.field_V.field_v ^ -1) > -2359297) {
                      stackOut_90_0 = 1;
                      stackIn_92_0 = stackOut_90_0;
                      break L24;
                    } else {
                      stackOut_89_0 = 0;
                      stackIn_92_0 = stackOut_89_0;
                      break L24;
                    }
                  } else {
                    stackOut_87_0 = 0;
                    stackIn_92_0 = stackOut_87_0;
                    break L24;
                  }
                } else {
                  stackOut_85_0 = 0;
                  stackIn_92_0 = stackOut_85_0;
                  break L24;
                }
              }
              L25: {
                var7 = stackIn_92_0;
                if ((((va) this).field_a.field_V.field_t ^ -1) < -19573419) {
                  if (39146837 <= ((va) this).field_a.field_V.field_t) {
                    stackOut_96_0 = 0;
                    stackIn_98_0 = stackOut_96_0;
                    break L25;
                  } else {
                    stackOut_95_0 = 1;
                    stackIn_98_0 = stackOut_95_0;
                    break L25;
                  }
                } else {
                  stackOut_93_0 = 0;
                  stackIn_98_0 = stackOut_93_0;
                  break L25;
                }
              }
              var8 = stackIn_98_0;
              if (var5 != 0) {
                break L22;
              } else {
                if (var8 == 0) {
                  break L22;
                } else {
                  if (var7 != 0) {
                    break L22;
                  } else {
                    L26: {
                      if ((rm.field_C ^ -1) == -2) {
                        wh discarded$18 = gt.a(false, -1, (byte) 122, 5);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if ((rm.field_C ^ -1) != -3) {
                        break L27;
                      } else {
                        wh discarded$19 = gt.a(false, -1, (byte) -106, 26);
                        break L27;
                      }
                    }
                    if ((rm.field_C ^ -1) == -4) {
                      wh discarded$20 = gt.a(false, -1, (byte) -75, 32);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
            }
          }
          L28: {
            L29: {
              if (((va) this).field_a.field_X.field_j[0] != ((va) this).field_v[0]) {
                break L29;
              } else {
                if (((va) this).field_a.field_X.field_j[1] != ((va) this).field_v[1]) {
                  break L29;
                } else {
                  break L28;
                }
              }
            }
            L30: {
              ji.k(param0 + -2115);
              stackOut_112_0 = rm.field_C;
              stackOut_112_1 = vi.field_n;
              stackOut_112_2 = 1;
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              stackIn_113_2 = stackOut_112_2;
              if (var5 != 0) {
                stackOut_114_0 = stackIn_114_0;
                stackOut_114_1 = stackIn_114_1;
                stackOut_114_2 = stackIn_114_2;
                stackOut_114_3 = 0;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                stackIn_115_2 = stackOut_114_2;
                stackIn_115_3 = stackOut_114_3;
                break L30;
              } else {
                stackOut_113_0 = stackIn_113_0;
                stackOut_113_1 = stackIn_113_1;
                stackOut_113_2 = stackIn_113_2;
                stackOut_113_3 = 1;
                stackIn_115_0 = stackOut_113_0;
                stackIn_115_1 = stackOut_113_1;
                stackIn_115_2 = stackOut_113_2;
                stackIn_115_3 = stackOut_113_3;
                break L30;
              }
            }
            so.a(stackIn_115_0, stackIn_115_1, stackIn_115_2 != 0, stackIn_115_3 != 0);
            if (!vi.field_n) {
              break L28;
            } else {
              L31: {
                if ((rm.field_C ^ -1) == -2) {
                  L32: {
                    stackOut_118_0 = 0;
                    stackOut_118_1 = -1;
                    stackOut_118_2 = -87;
                    stackIn_120_0 = stackOut_118_0;
                    stackIn_120_1 = stackOut_118_1;
                    stackIn_120_2 = stackOut_118_2;
                    stackIn_119_0 = stackOut_118_0;
                    stackIn_119_1 = stackOut_118_1;
                    stackIn_119_2 = stackOut_118_2;
                    if (var5 != 0) {
                      stackOut_120_0 = stackIn_120_0;
                      stackOut_120_1 = stackIn_120_1;
                      stackOut_120_2 = stackIn_120_2;
                      stackOut_120_3 = 3;
                      stackIn_121_0 = stackOut_120_0;
                      stackIn_121_1 = stackOut_120_1;
                      stackIn_121_2 = stackOut_120_2;
                      stackIn_121_3 = stackOut_120_3;
                      break L32;
                    } else {
                      stackOut_119_0 = stackIn_119_0;
                      stackOut_119_1 = stackIn_119_1;
                      stackOut_119_2 = stackIn_119_2;
                      stackOut_119_3 = 23;
                      stackIn_121_0 = stackOut_119_0;
                      stackIn_121_1 = stackOut_119_1;
                      stackIn_121_2 = stackOut_119_2;
                      stackIn_121_3 = stackOut_119_3;
                      break L32;
                    }
                  }
                  wh discarded$21 = gt.a(stackIn_121_0 != 0, stackIn_121_1, (byte) stackIn_121_2, stackIn_121_3);
                  break L31;
                } else {
                  break L31;
                }
              }
              L33: {
                if (2 == rm.field_C) {
                  L34: {
                    stackOut_124_0 = 0;
                    stackOut_124_1 = -1;
                    stackOut_124_2 = 113;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    stackIn_126_2 = stackOut_124_2;
                    stackIn_125_0 = stackOut_124_0;
                    stackIn_125_1 = stackOut_124_1;
                    stackIn_125_2 = stackOut_124_2;
                    if (var5 != 0) {
                      stackOut_126_0 = stackIn_126_0;
                      stackOut_126_1 = stackIn_126_1;
                      stackOut_126_2 = stackIn_126_2;
                      stackOut_126_3 = 24;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      stackIn_127_2 = stackOut_126_2;
                      stackIn_127_3 = stackOut_126_3;
                      break L34;
                    } else {
                      stackOut_125_0 = stackIn_125_0;
                      stackOut_125_1 = stackIn_125_1;
                      stackOut_125_2 = stackIn_125_2;
                      stackOut_125_3 = 27;
                      stackIn_127_0 = stackOut_125_0;
                      stackIn_127_1 = stackOut_125_1;
                      stackIn_127_2 = stackOut_125_2;
                      stackIn_127_3 = stackOut_125_3;
                      break L34;
                    }
                  }
                  wh discarded$22 = gt.a(stackIn_127_0 != 0, stackIn_127_1, (byte) stackIn_127_2, stackIn_127_3);
                  break L33;
                } else {
                  break L33;
                }
              }
              if ((rm.field_C ^ -1) == -4) {
                L35: {
                  stackOut_130_0 = 0;
                  stackOut_130_1 = -1;
                  stackOut_130_2 = -100;
                  stackIn_132_0 = stackOut_130_0;
                  stackIn_132_1 = stackOut_130_1;
                  stackIn_132_2 = stackOut_130_2;
                  stackIn_131_0 = stackOut_130_0;
                  stackIn_131_1 = stackOut_130_1;
                  stackIn_131_2 = stackOut_130_2;
                  if (var5 != 0) {
                    stackOut_132_0 = stackIn_132_0;
                    stackOut_132_1 = stackIn_132_1;
                    stackOut_132_2 = stackIn_132_2;
                    stackOut_132_3 = 30;
                    stackIn_133_0 = stackOut_132_0;
                    stackIn_133_1 = stackOut_132_1;
                    stackIn_133_2 = stackOut_132_2;
                    stackIn_133_3 = stackOut_132_3;
                    break L35;
                  } else {
                    stackOut_131_0 = stackIn_131_0;
                    stackOut_131_1 = stackIn_131_1;
                    stackOut_131_2 = stackIn_131_2;
                    stackOut_131_3 = 43;
                    stackIn_133_0 = stackOut_131_0;
                    stackIn_133_1 = stackOut_131_1;
                    stackIn_133_2 = stackOut_131_2;
                    stackIn_133_3 = stackOut_131_3;
                    break L35;
                  }
                }
                wh discarded$23 = gt.a(stackIn_133_0 != 0, stackIn_133_1, (byte) stackIn_133_2, stackIn_133_3);
                break L28;
              } else {
                break L28;
              }
            }
          }
          L36: {
            ((va) this).field_v[0] = ((va) this).field_a.field_X.field_j[0];
            ((va) this).field_v[1] = ((va) this).field_a.field_X.field_j[1];
            if (((va) this).field_a.field_V.field_m == 1 - ((va) this).field_D) {
              ((va) this).field_D = ((va) this).field_a.field_V.field_m;
              break L36;
            } else {
              break L36;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 121 % ((17 - param0) / 35);
            if (((va) this).field_k) {
              break L1;
            } else {
              if (!((va) this).field_m) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static ec f(int param0) {
        if (param0 != -1) {
            java.awt.Container discarded$0 = va.d((byte) -2);
        }
        return new ec(he.a(320), lj.a(false));
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ki var7 = null;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Kickabout.field_G;
        L0: while (true) {
          L1: {
            if (127 < Math.abs(param0)) {
              break L1;
            } else {
              if (Math.abs(param1) <= 127) {
                if (param2 == -1) {
                  L2: {
                    var4 = (byte)param0;
                    var5 = (byte)param1;
                    if (((va) this).field_a.c(((va) this).field_g, -111)) {
                      stackOut_9_0 = ((va) this).field_a.a((byte) 97, ((va) this).field_g).field_L;
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  L3: {
                    var6 = stackIn_10_0;
                    var7 = hw.a(((va) this).field_g, var6, 85, (byte) var5, (byte) var4);
                    this.a(false, var7);
                    if (((va) this).field_f) {
                      or.field_d.b(71, (byte) 94);
                      or.field_d.a(114, var6);
                      or.field_d.a(111, var4);
                      or.field_d.a(125, var5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
          }
          param1 = param1 / 2;
          param0 = param0 / 2;
          continue L0;
        }
    }

    final void m(int param0) {
        if (param0 > -77) {
            this.g(-34, -31);
        }
        this.a(((va) this).field_a, ((va) this).field_f, 370);
        ((va) this).a((tf) null, (byte) -126);
    }

    private final void n(int param0) {
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean[] var12 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var12 = ne.field_G;
          var2 = var12;
          if (!var12[rb.field_Kb]) {
            if (var12[98]) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_6_0;
          if (!var12[uv.field_e]) {
            if (var12[96]) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L1;
            }
          } else {
            stackOut_7_0 = 1;
            stackIn_12_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_12_0;
          if (var12[oc.field_e]) {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L2;
          } else {
            if (var12[99]) {
              stackOut_15_0 = 1;
              stackIn_18_0 = stackOut_15_0;
              break L2;
            } else {
              stackOut_14_0 = 0;
              stackIn_18_0 = stackOut_14_0;
              break L2;
            }
          }
        }
        L3: {
          var5 = stackIn_18_0;
          if (param0 < -110) {
            break L3;
          } else {
            ((va) this).field_s = -84;
            break L3;
          }
        }
        L4: {
          if (!var12[pb.field_A]) {
            if (var12[97]) {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L4;
            } else {
              stackOut_23_0 = 0;
              stackIn_26_0 = stackOut_23_0;
              break L4;
            }
          } else {
            stackOut_21_0 = 1;
            stackIn_26_0 = stackOut_21_0;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_26_0;
          if (((va) this).field_f) {
            break L5;
          } else {
            if (ja.field_O) {
              L6: {
                if (var12[rb.field_Kb]) {
                  break L6;
                } else {
                  if (var12[oc.field_e]) {
                    break L6;
                  } else {
                    if (var12[uv.field_e]) {
                      break L6;
                    } else {
                      if (var12[pb.field_A]) {
                        break L6;
                      } else {
                        L7: {
                          if (var12[98]) {
                            break L7;
                          } else {
                            if (var12[99]) {
                              break L7;
                            } else {
                              if (var12[96]) {
                                break L7;
                              } else {
                                if (!var12[97]) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        tq.a((byte) 50, false);
                        break L5;
                      }
                    }
                  }
                }
              }
              tq.a((byte) 50, true);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L8: {
          if (((va) this).field_l) {
            L9: {
              if (((va) this).a((byte) 13)) {
                L10: {
                  if (ia.field_c) {
                    var7 = var3;
                    var3 = var5;
                    var5 = var7;
                    var7 = var4;
                    var4 = var6;
                    var6 = var7;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var7 = 0;
                  if (var3 == 0) {
                    break L11;
                  } else {
                    var7 = var7 | 4;
                    break L11;
                  }
                }
                L12: {
                  if (var5 != 0) {
                    var7 = var7 | 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var4 == 0) {
                    break L13;
                  } else {
                    var7 = var7 | 2;
                    break L13;
                  }
                }
                L14: {
                  if (var6 != 0) {
                    var7 = var7 | 8;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (((va) this).field_H != var7) {
                    break L15;
                  } else {
                    if (((va) this).field_a.a((byte) -38, ((va) this).field_g).field_G == var7) {
                      break L9;
                    } else {
                      break L15;
                    }
                  }
                }
                ((va) this).field_H = var7;
                this.b(false);
                break L9;
              } else {
                break L9;
              }
            }
            if (!var2[kq.field_Jb]) {
              if (!var2[f.field_a]) {
                break L8;
              } else {
                ((va) this).field_q = ((va) this).field_q + 16;
                if (((va) this).field_q > 256) {
                  ((va) this).field_q = 256;
                  break L8;
                } else {
                  if (!var2[f.field_a]) {
                    break L8;
                  } else {
                    ((va) this).field_q = ((va) this).field_q + 16;
                    if (((va) this).field_q <= 256) {
                      break L8;
                    } else {
                      ((va) this).field_q = 256;
                      break L8;
                    }
                  }
                }
              }
            } else {
              if (!var2[f.field_a]) {
                break L8;
              } else {
                ((va) this).field_q = ((va) this).field_q + 16;
                if (((va) this).field_q <= 256) {
                  break L8;
                } else {
                  ((va) this).field_q = 256;
                  break L8;
                }
              }
            }
          } else {
            L16: {
              L17: {
                L18: {
                  var7 = 15;
                  if (var4 != 0) {
                    break L18;
                  } else {
                    if (var6 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (var3 != 0) {
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L17;
                    } else {
                      break L19;
                    }
                  }
                }
                var7 = var7 * 200;
                break L16;
              }
              var7 = var7 << 8;
              break L16;
            }
            L20: {
              var7 = var7 / hw.field_i;
              var8 = 0;
              var9 = 0;
              if (var4 == 0) {
                break L20;
              } else {
                var8 = var8 - var7;
                break L20;
              }
            }
            L21: {
              var10 = 0;
              if (var3 == 0) {
                break L21;
              } else {
                var9 = var9 - var7;
                break L21;
              }
            }
            L22: {
              if (var6 != 0) {
                var8 = var8 + var7;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (var5 == 0) {
                break L23;
              } else {
                var9 = var9 + var7;
                break L23;
              }
            }
            L24: {
              if (var2[kq.field_Jb]) {
                var10 -= 16;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (!var2[f.field_a]) {
                break L25;
              } else {
                var10 += 16;
                break L25;
              }
            }
            sj.a((double)var9, (byte) 127, (double)var8, (double)var10);
            break L8;
          }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        nl var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        Object stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        Object stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        Object stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        Object stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        int stackIn_14_2 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackOut_8_0 = null;
        boolean stackOut_8_1 = false;
        Object stackOut_10_0 = null;
        boolean stackOut_10_1 = false;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        boolean stackOut_11_1 = false;
        Object stackOut_13_0 = null;
        boolean stackOut_13_1 = false;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        boolean stackOut_12_1 = false;
        int stackOut_12_2 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (!kl.b(640)) {
            break L0;
          } else {
            if (((va) this).b((byte) -65)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (2 != ip.field_a) {
            break L1;
          } else {
            ((va) this).field_m = true;
            break L1;
          }
        }
        L2: {
          if (ip.field_a == 1) {
            ((va) this).field_k = true;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          stackOut_8_0 = this;
          stackOut_8_1 = ((va) this).field_k;
          stackIn_10_0 = stackOut_8_0;
          stackIn_10_1 = stackOut_8_1;
          stackIn_9_0 = stackOut_8_0;
          stackIn_9_1 = stackOut_8_1;
          if (vd.field_c != 1) {
            stackOut_10_0 = this;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            stackIn_11_2 = stackOut_10_2;
            break L3;
          } else {
            stackOut_9_0 = this;
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_11_2 = stackOut_9_2;
            break L3;
          }
        }
        L4: {
          ((va) this).field_k = stackIn_11_1 & stackIn_11_2 != 0;
          stackOut_11_0 = this;
          stackOut_11_1 = ((va) this).field_m;
          stackIn_13_0 = stackOut_11_0;
          stackIn_13_1 = stackOut_11_1;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          if (-3 != (vd.field_c ^ -1)) {
            stackOut_13_0 = this;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            break L4;
          } else {
            stackOut_12_0 = this;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_14_2 = stackOut_12_2;
            break L4;
          }
        }
        L5: {
          ((va) this).field_m = stackIn_14_1 & stackIn_14_2 != 0;
          if (param0 == 16623) {
            break L5;
          } else {
            ((va) this).field_n = true;
            break L5;
          }
        }
        L6: {
          if (!((va) this).a((byte) 13)) {
            if (2 == ip.field_a) {
              L7: {
                stackOut_56_0 = this;
                stackIn_58_0 = stackOut_56_0;
                stackIn_57_0 = stackOut_56_0;
                if (((va) this).field_l) {
                  stackOut_58_0 = this;
                  stackOut_58_1 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  break L7;
                } else {
                  stackOut_57_0 = this;
                  stackOut_57_1 = 1;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  break L7;
                }
              }
              ((va) this).field_l = stackIn_59_1 != 0;
              break L6;
            } else {
              break L6;
            }
          } else {
            if (!((va) this).field_l) {
              break L6;
            } else {
              if (!((va) this).field_a.field_R[((va) this).field_g].d(param0 ^ 19800)) {
                break L6;
              } else {
                L8: {
                  if (!((va) this).field_k) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L8;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    var2 = stackIn_22_0;
                    var3 = ((va) this).field_m ? 1 : 0;
                    var4 = ((va) this).field_a.a((byte) 122, ((va) this).field_g);
                    if (0 == ((va) this).field_I) {
                      break L10;
                    } else {
                      if (var2 != 0) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if ((wt.field_x ^ -1) != 0) {
                      break L11;
                    } else {
                      if (0 == (us.field_j ^ -1)) {
                        ((va) this).field_z = -1;
                        ((va) this).field_G = -1;
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ((va) this).field_z = ai.a(wt.field_x, 6784) - var4.f(-103);
                  ((va) this).field_G = qj.a(-6779, us.field_j) + -var4.a(true);
                  break L9;
                }
                if (-2 == (var4.field_u ^ -1)) {
                  L12: {
                    if (var2 != 0) {
                      break L12;
                    } else {
                      if (var3 == 0) {
                        this.c(((va) this).field_z, ((va) this).field_G, -1);
                        break L12;
                      } else {
                        break L6;
                      }
                    }
                  }
                  break L6;
                } else {
                  L13: {
                    if (-1 != wt.field_x) {
                      break L13;
                    } else {
                      if (0 != (us.field_j ^ -1)) {
                        break L13;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L14: {
                    if (!((va) this).field_a.c(((va) this).field_g, -115)) {
                      L15: {
                        if (var2 == 0) {
                          break L15;
                        } else {
                          if (var4.d((byte) 102)) {
                            this.c(((va) this).field_z, ((va) this).field_G, -1);
                            ((va) this).field_k = false;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (!((va) this).field_m) {
                        break L14;
                      } else {
                        this.b(qj.a(-6779, us.field_j), ai.a(wt.field_x, 6784), 1);
                        ((va) this).field_m = false;
                        break L14;
                      }
                    } else {
                      if (var2 == 0) {
                        if (var3 != 0) {
                          this.g(7, -1);
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        this.g(6, param0 + -16624);
                        break L14;
                      }
                    }
                  }
                  if (var2 == 0) {
                    ((va) this).field_I = 0;
                    break L6;
                  } else {
                    ((va) this).field_I = ((va) this).field_I + 1;
                    break L6;
                  }
                }
              }
            }
          }
        }
        L16: {
          var2 = id.field_v;
          if (((va) this).field_l) {
            L17: {
              if ((var2 ^ -1) >= -1) {
                break L17;
              } else {
                ((va) this).field_q = ((va) this).field_q - 16;
                if (-129 >= (((va) this).field_q ^ -1)) {
                  break L17;
                } else {
                  ((va) this).field_q = 128;
                  break L17;
                }
              }
            }
            if (-1 < (var2 ^ -1)) {
              ((va) this).field_q = ((va) this).field_q + 16;
              if (((va) this).field_q <= 256) {
                break L16;
              } else {
                ((va) this).field_q = 256;
                break L16;
              }
            } else {
              break L16;
            }
          } else {
            L18: {
              if (0 >= var2) {
                break L18;
              } else {
                sj.a(0.0, (byte) 127, 0.0, -16.0);
                break L18;
              }
            }
            if (-1 < (var2 ^ -1)) {
              sj.a(0.0, (byte) 127, 0.0, 16.0);
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    final void a(tf param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        ak var4 = null;
        int var5 = Kickabout.field_G;
        if (null != ((va) this).field_r) {
            ((va) this).field_r.b(22997);
        } else {
            ((va) this).field_r = new tf();
        }
        for (var3 = 0; 2 > var3; var3++) {
            for (var4_int = 0; var4_int < 5; var4_int++) {
                ((va) this).field_r.a((gn) (Object) lb.a((gm) (Object) ((va) this).field_a.field_P[var3][var4_int], 1), 3);
            }
        }
        ((va) this).field_r.a((gn) (Object) mr.a((ob) (Object) ((va) this).field_a.field_V, false), 3);
        ((va) this).field_r.a((gn) (Object) re.a(true, 115), 3);
        var3 = -88 / ((4 - param1) / 50);
        ((va) this).field_r.a((gn) (Object) re.a(false, 92), 3);
        if (param0 != null) {
            var4 = (ak) (Object) param0.g(24009);
            while (var4 != null) {
                var4.c((byte) -109);
                ((va) this).field_r.a((gn) (Object) var4, 3);
                var4 = (ak) (Object) param0.c(33);
            }
        }
        uc.a(((va) this).field_r, -22488);
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        wh var4 = null;
        if (-1 <= (((va) this).field_p ^ -1)) {
            if ((((va) this).field_a.field_X.field_m ^ -1) > -41) {
                if (!vs.a(90, 28)) {
                    if (!vs.a(117, 29)) {
                        var2 = this.a((byte) -97, 2);
                        var3 = 1 == var2 ? 1 + this.a((byte) -104, 2) : this.a((byte) -103, 3) - -3;
                        var4 = gt.a(false, -1, (byte) -65, 28 + var2);
                        if (!(var4 == null)) {
                            var4.a(200, true);
                            var4.a(200, (byte) -4);
                            var4.a(var3, param0 ^ -23079);
                        }
                        ((va) this).field_p = this.a((byte) -89, 400) + 600;
                    }
                }
            }
        }
        if (param0 != -23079) {
            ((va) this).field_z = 59;
        }
    }

    private final void a(nu param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        up var13_ref_up = null;
        int var13 = 0;
        int var14_int = 0;
        vn var14 = null;
        gm var15 = null;
        int var16 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        ob stackIn_6_0 = null;
        ob stackIn_7_0 = null;
        ob stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        gm stackIn_22_0 = null;
        gm stackIn_23_0 = null;
        gm stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        ob stackOut_5_0 = null;
        ob stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ob stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        gm stackOut_21_0 = null;
        gm stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        gm stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          var16 = Kickabout.field_G;
          if (param2 == 370) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = param1;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (wp.field_f) {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          param1 = stackIn_5_0 & stackIn_5_1 != 0;
          param0.field_V = (tj) (Object) new ob(param0.field_V);
          stackOut_5_0 = (ob) (Object) param0.field_V;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (!param1) {
            stackOut_7_0 = (ob) (Object) stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = (ob) (Object) stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        stackIn_8_0.field_I = stackIn_8_1 != 0;
        var4 = 0;
        L3: while (true) {
          if (var4 >= 2) {
            return;
          } else {
            var5 = param0.field_H[var4];
            var6 = param0.field_d[var4];
            var7 = param0.field_Q[var4];
            var8 = 0;
            L4: while (true) {
              if (var8 >= 5) {
                var4++;
                continue L3;
              } else {
                L5: {
                  if (0 == var8) {
                    var9 = 4;
                    var10 = 1;
                    var11 = 0;
                    var12 = 0;
                    break L5;
                  } else {
                    var13_ref_up = param0.field_b[var4][var8 - 1];
                    var9 = var13_ref_up.field_q;
                    var14_int = var13_ref_up.field_j;
                    var12 = (var14_int & 15) >> 1669010176;
                    var10 = var14_int >> -1621354040 & 15;
                    var11 = (var14_int & 245) >> 154279492;
                    break L5;
                  }
                }
                L6: {
                  if (wn.a((byte) 24)) {
                    if (param0.field_P[var4][var8].field_N.c((byte) -107, param0.field_P[var4][var8].field_y)) {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_21_0 = stackOut_18_0;
                      break L6;
                    }
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_21_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var13 = stackIn_21_0;
                  var14 = fp.a(var5, var6, var10, var9, var11, var12, var7, false, ((va) this).field_n, var13 != 0);
                  var15 = new gm(var14, var9, false, param0.field_P[var4][var8]);
                  stackOut_21_0 = (gm) var15;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (!param1) {
                    stackOut_23_0 = (gm) (Object) stackIn_23_0;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L7;
                  } else {
                    stackOut_22_0 = (gm) (Object) stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L7;
                  }
                }
                stackIn_24_0.field_E = stackIn_24_1 != 0;
                param0.field_P[var4][var8] = (nl) (Object) var15;
                var8++;
                continue L4;
              }
            }
          }
        }
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
            Object var4 = null;
            ((va) this).a((tf) null, (byte) -3);
        }
    }

    private final void a(boolean param0, ki param1) {
        ((va) this).field_a.a(param1, -115);
        if (!param0) {
          L0: {
            L1: {
              if (param1.field_r == 0) {
                break L1;
              } else {
                if (1 != param1.field_r) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((gm) (Object) ((va) this).field_a.a((byte) 105, ((va) this).field_g)).field_Z = false;
            break L0;
          }
          L2: {
            if (2 != param1.field_r) {
              break L2;
            } else {
              if (!((va) this).field_a.c(((va) this).field_g, -7)) {
                break L2;
              } else {
                if (!ei.field_n) {
                  break L2;
                } else {
                  if (ja.field_O) {
                    break L2;
                  } else {
                    this.a(hw.a(param1.field_u, param1.field_v, -115, param1.field_p, param1.field_o), -122);
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        gm var3 = null;
        int var4 = 0;
        ob var4_ref_ob = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var7_double = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        if (((va) this).field_l) {
          if (-26 > (((va) this).field_a.field_X.field_m ^ -1)) {
            mj.a(128.0, 60, 448.0, 672.0);
            return;
          } else {
            if (ja.field_O) {
              nt.j(13459);
              return;
            } else {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  this.a(false, 114, -8);
                  break L0;
                }
              }
              L1: {
                var2 = this.h(-41);
                var3 = (gm) (Object) ((va) this).field_a.a((byte) -70, var2);
                if (((va) this).field_a.c(var2, -67)) {
                  var4 = var3.g(1606384336);
                  var5 = var3.h(1000);
                  var6 = var3.field_j * 0;
                  var7 = 50 * var3.field_n;
                  mj.a((double)((va) this).field_q, 60, (double)(var6 + var4), (double)(var5 + var7));
                  break L1;
                } else {
                  L2: {
                    var4_ref_ob = (ob) (Object) ((va) this).field_a.field_V;
                    var5 = var4_ref_ob.field_t >> 574348496;
                    var6 = var4_ref_ob.c(true) - -(var4_ref_ob.field_p >> -2023500336) >> -96433023;
                    var7_double = (double)var3.field_kb / 65536.0;
                    var9 = (double)var3.field_bb / 65536.0;
                    var11 = (double)(((va) this).field_q + 40);
                    var13 = (double)(-var5) + var7_double;
                    var15 = (double)(-var6) + var9;
                    var17 = Math.sqrt(var13 * var13 + var15 * var15);
                    if (340.0 < var17) {
                      var11 = 340.0 * var11 / var17;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  mj.a(var11, 60, (double)((int)var7_double - -var5 >> -2085747135), (double)((int)var9 + var6 >> 1556134177));
                  break L1;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Kickabout.field_G;
          var2 = ((va) this).field_z;
          var3 = ((va) this).field_G;
          if (0 != (var2 ^ -1)) {
            break L0;
          } else {
            if (var3 == -1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (ia.field_c) {
            var2 = -var2;
            var3 = -var3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 > 102) {
            break L2;
          } else {
            ((va) this).field_L = true;
            break L2;
          }
        }
        L3: {
          L4: {
            var4 = (gm) (Object) ((va) this).field_a.a((byte) 93, ((va) this).field_g);
            var5 = ug.a(0, var4.field_kb >> 1639733136);
            var6 = lf.a((byte) -110, var4.field_bb >> 1851266352);
            if (!((va) this).field_a.c(((va) this).field_g, -50)) {
              break L4;
            } else {
              if ((var4.field_u ^ -1) != -3) {
                if (!((va) this).field_a.field_y) {
                  if (-2 == (var4.field_u ^ -1)) {
                    var7 = var4.a(var4.field_L, (byte) -68);
                    lo.a(706856675, 256, var7, var2, var3, true);
                    ee.a(653278209, var5, var6);
                    break L3;
                  } else {
                    lo.a(706856675, 128, 256, var2, var3, true);
                    ee.a(653278209, var5, var6);
                    break L3;
                  }
                } else {
                  return;
                }
              } else {
                break L4;
              }
            }
          }
          if (((va) this).field_a.field_l) {
            return;
          } else {
            if (-4 == (var4.field_u ^ -1)) {
              L5: {
                var7 = vf.field_I[3];
                if (0 == var4.field_J) {
                  var7 = var7 << 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var8 = var7 + -var4.field_L;
                if (-1 < (var8 ^ -1)) {
                  var8 = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              var9 = (var8 << 1240504968) / var7;
              var9 = 3 * var9 >> 276084738;
              lo.a(706856675, 256, var9, var2, var3, false);
              ee.a(653278209, var5, var6);
              break L3;
            } else {
              lo.a(706856675, 128, 192, var2, var3, false);
              ee.a(653278209, var5, var6);
              break L3;
            }
          }
        }
    }

    private final void a(ki param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        tj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nl var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nu var17 = null;
        var16 = Kickabout.field_G;
        if (ja.field_O) {
          return;
        } else {
          L0: {
            var17 = new nu(((va) this).field_a);
            if (param0 == null) {
              break L0;
            } else {
              var17.a(param0, -117);
              var17.a((byte) 120);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            L2: {
              if ((var4 ^ -1) <= -51) {
                break L2;
              } else {
                if (-1 == var17.field_V.field_m) {
                  break L2;
                } else {
                  var17.d(4);
                  var4++;
                  continue L1;
                }
              }
            }
            if ((var17.field_V.field_m ^ -1) != 0) {
              return;
            } else {
              var6 = var17.field_V;
              var6.a((byte) -86, ((va) this).field_a.field_t, ((va) this).field_a.field_B);
              L3: while (true) {
                L4: {
                  if (var6.field_k) {
                    break L4;
                  } else {
                    if (var6.field_v == 0) {
                      break L4;
                    } else {
                      var6.a((byte) -106, ((va) this).field_a.field_t, ((va) this).field_a.field_B);
                      continue L3;
                    }
                  }
                }
                var4 = var6.a(true);
                var5 = var6.c(879306160);
                var7 = -89 % ((param1 - -55) / 38);
                L5: while (true) {
                  if (250000 >= var6.e(28)) {
                    L6: {
                      if (param0 != null) {
                        var4 = var4 - -var6.a(true) >> -1986989567;
                        var5 = var6.c(879306160) + var5 >> -927078431;
                        break L6;
                      } else {
                        var4 = var6.a(true);
                        var5 = var6.c(879306160);
                        break L6;
                      }
                    }
                    var8 = ((va) this).field_a.field_g[((va) this).field_g].field_p;
                    var9 = -1;
                    var10 = 2147483647;
                    var11 = 1;
                    L7: while (true) {
                      if (((va) this).field_a.field_P[var8].length <= var11) {
                        L8: {
                          if (((va) this).field_a.a((byte) 6, var8, var9) == -1) {
                            this.g(var9 + 1, -1);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      } else {
                        var12 = ((va) this).field_a.field_P[var8][var11];
                        var13 = -var4 + (var12.field_M >> -963393264);
                        var14 = -var5 + (var12.field_w >> -1852706192);
                        var15 = var13 * var13 - -(var14 * var14);
                        if (var15 < var10) {
                          var10 = var15;
                          var9 = var11;
                          var11++;
                          continue L7;
                        } else {
                          var11++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    var6.a((byte) 122, ((va) this).field_a.field_t, ((va) this).field_a.field_B);
                    var6.a((byte) -70, ((va) this).field_a.field_t, ((va) this).field_a.field_B);
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    private final void k(int param0) {
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = -((va) this).field_a.field_O + ((va) this).field_a.field_v;
        if (param0 != 0) {
            ((va) this).f(-113, 91);
        }
        if (var2 < 120) {
            var3 = tb.field_q[var2 / 40 + 1];
            var4 = var3.field_o;
            var5 = var3.field_v;
            var2 = var2 % 40;
            var6 = 256;
            if (var2 > 35) {
                var6 = (-var2 + 40 << 223873800) / 5;
            } else {
                var5 = var5 * (var2 + 35) / 70;
                var4 = (var2 + 35) * var4 / 70;
                var6 = (var2 << -587862168) / 35;
            }
            var3.e(-var4 + 640 >> -1279046623, -var5 + 480 >> -733940127, var4, var5, var6);
        }
    }

    final static java.awt.Container d(byte param0) {
        if (rq.field_A != null) {
            return (java.awt.Container) (Object) rq.field_A;
        }
        int var1 = 25 % ((46 - param0) / 33);
        return (java.awt.Container) (Object) so.a(-120);
    }

    va(nu param0, int param1, nu param2, boolean param3, boolean param4) {
        super(param0, param1, param3, (int[]) null);
        int var6 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          ((va) this).field_D = 0;
          ((va) this).field_t = new byte[8];
          ((va) this).field_s = -2;
          ((va) this).field_j = false;
          ((va) this).field_l = true;
          ((va) this).field_I = 0;
          ((va) this).field_B = false;
          ((va) this).field_L = false;
          ((va) this).field_E = false;
          ((va) this).field_n = false;
          ((va) this).field_v = new int[2];
          ((va) this).field_j = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((va) this).field_x = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((va) this).field_B = stackIn_6_1 != 0;
          this.a(param0, param3, 370);
          ((va) this).a((tf) null, (byte) -97);
          var6 = this.h(-41);
          ((va) this).field_C = uj.a((byte) -97, param0.field_g, param0.field_S, param0.field_g[var6].field_p);
          ((va) this).field_l = true;
          sf.a(((va) this).field_h, param1, param0, true);
          wt.a(0, param0, var6, ((va) this).field_C);
          st.a(param0, var6, 50);
          ih.a(-3, param0, ((va) this).field_h);
          un.a(param0, ((va) this).field_h, 101);
          ((va) this).field_q = 172;
          if (-2 != (param0.field_g[var6].field_p ^ -1)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        ia.field_c = stackIn_9_0 != 0;
        gu.b(0, (byte) 60, vc.field_E[1]);
    }

    private final void b(boolean param0) {
        this.a(param0, mg.a(param0, ((va) this).field_H, ((va) this).field_g));
        if (!(!((va) this).field_f)) {
            or.field_d.b(68, (byte) -65);
            or.field_d.a(123, ((va) this).field_H);
        }
    }

    private final void g(int param0, int param1) {
        if (param1 != -1) {
            ((va) this).field_q = -15;
        }
        this.a(false, ha.b(1, ((va) this).field_g, param0));
        if (!(!((va) this).field_f)) {
            or.field_d.b(70, (byte) 99);
            or.field_d.a(param1 ^ -107, param0);
        }
    }

    final void g(int param0) {
        Object var3 = null;
        L0: {
          L1: {
            if (-2 != ((va) this).field_s) {
              break L1;
            } else {
              if ((((va) this).field_a.field_V.field_m ^ -1) != 0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((va) this).field_s = ((va) this).field_a.field_V.field_m;
          break L0;
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            var3 = null;
            this.a(true, (ki) null);
            break L2;
          }
        }
        L3: {
          if (-41 < (((va) this).field_a.field_X.field_m ^ -1)) {
            break L3;
          } else {
            ((va) this).field_s = -2;
            break L3;
          }
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        wh var6 = null;
        if (((va) this).field_p <= 0) {
            if (40 > ((va) this).field_a.field_X.field_m) {
                var4 = !param0 ? fd.a(false, true, (byte) 97, false, false) : fd.a(true, false, (byte) 97, true, !param2 ? true : false);
                var5 = this.a((byte) -64, 2) == 0 ? 1 : 0;
                var6 = gt.a(false, var5 == 0 ? 256 : 0, (byte) 65, var4);
                if (!(var6 == null)) {
                    var6.a(4, (byte) -4);
                }
                ((va) this).field_p = this.a((byte) -78, 100) - -200;
            }
        }
        if (param1 != 4) {
            ((va) this).field_q = -116;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        gm var4_ref_gm = null;
        int var4 = 0;
        int var5 = 0;
        ak var6 = null;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var5 = Kickabout.field_G;
          qa.i(-126);
          if (!((va) this).field_u) {
            break L0;
          } else {
            if (!((va) this).a((byte) 13)) {
              break L0;
            } else {
              this.e((byte) 107);
              break L0;
            }
          }
        }
        vc.i((byte) 45);
        var2 = 0;
        L1: while (true) {
          if (2 <= var2) {
            ((ob) (Object) ((va) this).field_a.field_V).l(param0 + -13);
            gs.b(0);
            if (param0 == 1) {
              var6 = (ak) (Object) ((va) this).field_r.g(24009);
              L2: while (true) {
                if (var6 == null) {
                  L3: {
                    if (ja.field_O) {
                      i.f(70);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (((va) this).field_C == null) {
                      break L4;
                    } else {
                      L5: {
                        if (!((va) this).field_f) {
                          stackOut_20_0 = 12;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      var2 = stackIn_21_0 + (hw.field_i * 100 >> -1996178264);
                      var3 = 0;
                      L6: while (true) {
                        if (((va) this).field_a.field_I <= var3) {
                          break L4;
                        } else {
                          if (((va) this).field_a.field_R[var3].d(3511)) {
                            var4_ref_gm = (gm) (Object) ((va) this).field_a.a((byte) 112, var3);
                            ((va) this).field_C[var3].c(ug.a(0, var4_ref_gm.g(1606384336)) - (((va) this).field_C[var3].field_o >> 167219585), lf.a((byte) -85, var4_ref_gm.h(1000)) - var2);
                            var3++;
                            continue L6;
                          } else {
                            var3++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if ((((va) this).field_a.field_X.field_m ^ -1) <= -41) {
                        break L8;
                      } else {
                        if (ja.field_O) {
                          break L8;
                        } else {
                          ns.a(3585);
                          jk.a(16777215);
                          if (!((va) this).a((byte) 13)) {
                            break L7;
                          } else {
                            nu.b(false);
                            break L7;
                          }
                        }
                      }
                    }
                    ue.a((byte) 70);
                    break L7;
                  }
                  L9: {
                    if (((va) this).field_f) {
                      if (((va) this).field_a.field_O < ((va) this).field_a.field_v) {
                        this.k(0);
                        if (!((va) this).a((byte) 13)) {
                          break L9;
                        } else {
                          if (((va) this).field_l) {
                            break L9;
                          } else {
                            un.field_d.d(vb.field_f.toUpperCase(), 320, 30, 16777215, -1);
                            break L9;
                          }
                        }
                      } else {
                        if (!((va) this).a((byte) 13)) {
                          break L9;
                        } else {
                          if (((va) this).field_l) {
                            break L9;
                          } else {
                            un.field_d.d(vb.field_f.toUpperCase(), 320, 30, 16777215, -1);
                            break L9;
                          }
                        }
                      }
                    } else {
                      if (!((va) this).a((byte) 13)) {
                        break L9;
                      } else {
                        if (((va) this).field_l) {
                          break L9;
                        } else {
                          un.field_d.d(vb.field_f.toUpperCase(), 320, 30, 16777215, -1);
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    if (((va) this).field_a.field_f) {
                      un.field_d.a("FB", 5, 17, 16777215, -1);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (gs.field_g) {
                      var2 = 370;
                      var3 = -45;
                      on.e(ug.a(0, var2), lf.a((byte) -89, var3), 155 * hw.field_i >> -1078692280, 45 * hw.field_i >> 1941204776, 16711935);
                      ev.a(((va) this).field_a, param0 ^ 72, 0);
                      ev.a(((va) this).field_a, 48, 1);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (!wl.field_g) {
                      break L12;
                    } else {
                      if (-5 != (((va) this).field_a.field_u ^ -1)) {
                        break L12;
                      } else {
                        var2 = pq.field_J / 5;
                        var3 = pq.field_J % 5;
                        vl.a(((va) this).field_a, (byte) -98);
                        if (var3 == 0) {
                          var4 = 1;
                          L13: while (true) {
                            if (var4 >= 5) {
                              break L12;
                            } else {
                              or.a(((va) this).field_a, var4, var2, (byte) 99);
                              var4++;
                              continue L13;
                            }
                          }
                        } else {
                          or.a(((va) this).field_a, var3, var2, (byte) 99);
                          break L12;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  var6.b(192);
                  var6 = (ak) (Object) ((va) this).field_r.c(33);
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var3 = 0;
            L14: while (true) {
              if (-6 >= (var3 ^ -1)) {
                var2++;
                continue L1;
              } else {
                fn.a((gm) (Object) ((va) this).field_a.field_P[var2][var3], 100);
                var3++;
                continue L14;
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_w = null;
        field_F = null;
        field_K = null;
        if (param0 != -40) {
            va.c((byte) -12);
        }
        field_y = null;
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var7 = Kickabout.field_G;
            if (83 == param2) {
              break L1;
            } else {
              if (-83 != (param2 ^ -1)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((va) this).field_f) {
            break L0;
          } else {
            if (ja.field_O) {
              L2: {
                stackOut_6_0 = 50;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (83 != param2) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              tq.a((byte) stackIn_9_0, stackIn_9_1 != 0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (!fm.a(false)) {
            break L3;
          } else {
            if (!ne.field_G[81]) {
              break L3;
            } else {
              if (param2 == 84) {
                L4: {
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (((va) this).field_l) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
                ((va) this).field_l = stackIn_17_1 != 0;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (param1 == 1670) {
            break L5;
          } else {
            boolean discarded$1 = ((va) this).a('�', 73, -75);
            break L5;
          }
        }
        if (((va) this).a((byte) 13)) {
          L6: {
            if (!((va) this).field_a.field_R[((va) this).field_g].d(param1 ^ 2865)) {
              break L6;
            } else {
              L7: {
                L8: {
                  if ((param2 ^ -1) == -84) {
                    break L8;
                  } else {
                    if (param2 != 82) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                this.g(0, param1 + -1671);
                break L7;
              }
              L9: {
                if (!((va) this).field_f) {
                  break L9;
                } else {
                  if (((va) this).field_x) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
              }
              var4 = 0;
              L10: while (true) {
                if (7 <= var4) {
                  ((va) this).field_t[7] = (byte)Character.toLowerCase(param0);
                  var4 = er.a(false, 8, ((va) this).field_t);
                  var5 = -1;
                  var6 = 0;
                  L11: while (true) {
                    if (ti.field_d.length <= var6) {
                      if (var5 == -1) {
                        break L6;
                      } else {
                        if (null == tu.field_E) {
                          break L6;
                        } else {
                          if (((va) this).field_a.a(var5, false, tu.field_E.field_e, ((va) this).field_g, tk.field_Ib)) {
                            L12: {
                              if ((var5 ^ -1) == -12) {
                                break L12;
                              } else {
                                if (var5 == 10) {
                                  break L12;
                                } else {
                                  this.a(false, fu.a(((va) this).field_g, (byte) 8, var5));
                                  break L12;
                                }
                              }
                            }
                            if (!((va) this).field_f) {
                              break L6;
                            } else {
                              or.field_d.b(76, (byte) 98);
                              or.field_d.a(0, 8, 1991220144, ((va) this).field_t);
                              break L6;
                            }
                          } else {
                            return true;
                          }
                        }
                      }
                    } else {
                      if (var4 == ti.field_d[var6]) {
                        var5 = var6;
                        var6++;
                        continue L11;
                      } else {
                        var6++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  ((va) this).field_t[var4] = ((va) this).field_t[1 + var4];
                  var4++;
                  continue L10;
                }
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final void a(int param0, boolean param1) {
        ((va) this).field_u = param1 ? true : false;
        if (((va) this).field_u) {
            this.n(-122);
            this.i(16623);
        }
        if (((va) this).field_g == ((va) this).field_a.field_V.field_j) {
            if (!(!ei.field_n)) {
                this.a((ki) null, -123);
            }
        }
        this.a(true, ((va) this).field_a);
        if (((va) this).field_a.field_G != ((va) this).field_n) {
            ((va) this).field_n = ((va) this).field_a.field_G;
            this.j(-90);
        }
        nl var4 = ((va) this).field_a.b((byte) -96);
        if (var4 != null) {
            ((ob) (Object) ((va) this).field_a.field_V).field_E = ((ob) (Object) ((va) this).field_a.field_V).field_E + (var4.field_n << 626465904);
        }
        if (param0 > -92) {
            return;
        }
        uc.a(((va) this).field_r, -22488);
        is.a(7249);
        this.l(2115);
        de.b(40);
        kl.c(88);
        he.i(0);
        qs.a(false);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        up var11_ref_up = null;
        int var11 = 0;
        int var12_int = 0;
        vn var12 = null;
        int var13 = 0;
        int stackIn_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var13 = Kickabout.field_G;
        var2 = 0;
        if (param0 <= -83) {
          L0: while (true) {
            if (var2 >= 2) {
              return;
            } else {
              var3 = ((va) this).field_a.field_H[var2];
              var4 = ((va) this).field_a.field_d[var2];
              var5 = ((va) this).field_a.field_Q[var2];
              var6 = 0;
              L1: while (true) {
                if (5 <= var6) {
                  var2++;
                  continue L0;
                } else {
                  L2: {
                    if (0 == var6) {
                      var8 = 1;
                      var7 = 4;
                      var10 = 0;
                      var9 = 0;
                      break L2;
                    } else {
                      var11_ref_up = ((va) this).field_a.field_b[var2][var6 + -1];
                      var7 = var11_ref_up.field_q;
                      var12_int = var11_ref_up.field_j;
                      var8 = var12_int >> -1418438776 & 15;
                      var10 = (var12_int & 15) >> 1705133248;
                      var9 = (var12_int & 251) >> 911056868;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if ((var7 ^ -1) > -1) {
                        break L4;
                      } else {
                        if (var7 < 5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7 = 0;
                    break L3;
                  }
                  L5: {
                    if (wn.a((byte) -86)) {
                      if (((va) this).field_a.field_P[var2][var6].field_N.c((byte) -107, ((va) this).field_a.field_P[var2][var6].field_y)) {
                        stackOut_28_0 = 1;
                        stackIn_27_0 = stackOut_28_0;
                        break L5;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L5;
                      }
                    } else {
                      stackOut_25_0 = 0;
                      stackIn_27_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  var11 = stackIn_27_0;
                  var12 = fp.a(var3, var4, var8, var7, var9, var10, var5, false, ((va) this).field_n, var11 != 0);
                  ((gm) (Object) ((va) this).field_a.field_P[var2][var6]).a(var12, (byte) -115);
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, nu param1) {
        int var3 = 0;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        if (!param0) {
            ((va) this).field_k = false;
        }
        for (var3 = 0; 2 > var3; var3++) {
            for (var4 = 0; var4 < 5; var4++) {
                var5 = (gm) (Object) param1.field_P[var3][var4];
                var6 = param1.field_X.field_n == var3 ? 1 : 0;
                var7 = param1.a((byte) 6, var3, var4);
                var8 = (var7 ^ -1) == 0 ? 0 : param1.field_R[var7].field_l;
                var5.a(var6 != 0, false, var8);
            }
        }
        ((ob) (Object) param1.field_V).a((gm) (Object) param1.b((byte) -96), (byte) 50);
    }

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          if (10 > hl.field_d) {
            L1: {
              var3 = 0;
              if (!oo.field_f) {
                break L1;
              } else {
                var3 = 1;
                oo.field_f = false;
                break L1;
              }
            }
            fo.a(var3 != 0, -68, ki.g((byte) 60), hm.field_A, pe.a((byte) 92));
            break L0;
          } else {
            if (!nq.i(-86)) {
              on.b();
              rv.a(320, 240, (byte) 122);
              su.a(27744, 0, 0, param0);
              break L0;
            } else {
              if (vj.field_c == 0) {
                vs.a(false, param1, (byte) 39);
                su.a(27744, 0, 0, param0);
                break L0;
              } else {
                wr.a(param0, -14142);
                break L0;
              }
            }
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            java.awt.Container discarded$1 = va.d((byte) -37);
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[][]{new String[4], new String[4]};
        field_J = 0;
        field_F = "Invite <%0> to this game";
        field_K = "More suggestions";
    }
}
