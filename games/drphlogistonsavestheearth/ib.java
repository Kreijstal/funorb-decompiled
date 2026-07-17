/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib {
    static he[] field_r;
    private int field_s;
    double field_p;
    int field_m;
    int field_c;
    private int field_e;
    static int field_t;
    static int field_a;
    static int field_o;
    double field_b;
    int field_g;
    static int field_l;
    static vc field_f;
    boolean field_q;
    double field_k;
    double field_d;
    private int field_i;
    he field_n;
    static he[] field_j;
    static he[] field_u;
    private boolean field_h;

    ib(double param0, double param1, boolean param2, boolean param3) {
        this(param0, param1, -1, param2, param3);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= 6) {
          ib.a(108, -87, (byte) 42, 13, 35);
          aj.a(true);
          wj.d(param4, param0, param3, param1);
          return;
        } else {
          aj.a(true);
          wj.d(param4, param0, param3, param1);
          return;
        }
    }

    private final void c() {
        if (((ib) this).field_g == 7) {
          if (6 > sd.field_a.field_L) {
            ((ib) this).field_n = c.field_a[sd.field_a.field_L - 1];
            return;
          } else {
            ((ib) this).field_g = 6;
            ((ib) this).field_m = 5000;
            ((ib) this).field_n = p.field_e;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 <= -22) {
          L0: {
            int discarded$1 = 65;
            this.c();
            if (((ib) this).field_q) {
              break L0;
            } else {
              if (((ib) this).field_h) {
                break L0;
              } else {
                L1: {
                  ((ib) this).field_c = ((ib) this).field_c + 1;
                  ((ib) this).field_d = ((ib) this).field_d - 1.0;
                  if ((double)(-((ib) this).field_n.field_h) <= ((ib) this).field_d) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
                return stackIn_7_0 != 0;
              }
            }
          }
          ((ib) this).field_p = ((ib) this).field_p * 0.95;
          ((ib) this).field_s = ((ib) this).field_s - 1;
          ((ib) this).field_b = ((ib) this).field_b * 0.95;
          if (((ib) this).field_s >= 100) {
            ((ib) this).field_d = ((ib) this).field_d + ((ib) this).field_b;
            ((ib) this).field_k = ((ib) this).field_k + ((ib) this).field_p;
            if (0.0 <= ((ib) this).field_d) {
              if ((double)(-((ib) this).field_n.field_h + 640) >= ((ib) this).field_d) {
                if (((ib) this).field_k >= 0.0) {
                  if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                    if (!((ib) this).field_h) {
                      L2: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_141_0 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          break L2;
                        } else {
                          stackOut_140_0 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          break L2;
                        }
                      }
                      return stackIn_142_0 != 0;
                    } else {
                      L3: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_137_0 = 0;
                          stackIn_138_0 = stackOut_137_0;
                          break L3;
                        } else {
                          stackOut_136_0 = 1;
                          stackIn_138_0 = stackOut_136_0;
                          break L3;
                        }
                      }
                      return stackIn_138_0 != 0;
                    }
                  } else {
                    ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                    if (!((ib) this).field_h) {
                      L4: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_132_0 = 0;
                          stackIn_133_0 = stackOut_132_0;
                          break L4;
                        } else {
                          stackOut_131_0 = 1;
                          stackIn_133_0 = stackOut_131_0;
                          break L4;
                        }
                      }
                      return stackIn_133_0 != 0;
                    } else {
                      L5: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_128_0 = 0;
                          stackIn_129_0 = stackOut_128_0;
                          break L5;
                        } else {
                          stackOut_127_0 = 1;
                          stackIn_129_0 = stackOut_127_0;
                          break L5;
                        }
                      }
                      return stackIn_129_0 != 0;
                    }
                  }
                } else {
                  ((ib) this).field_p = Math.abs(((ib) this).field_p);
                  if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                    if (!((ib) this).field_h) {
                      L6: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_122_0 = 0;
                          stackIn_123_0 = stackOut_122_0;
                          break L6;
                        } else {
                          stackOut_121_0 = 1;
                          stackIn_123_0 = stackOut_121_0;
                          break L6;
                        }
                      }
                      return stackIn_123_0 != 0;
                    } else {
                      L7: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_118_0 = 0;
                          stackIn_119_0 = stackOut_118_0;
                          break L7;
                        } else {
                          stackOut_117_0 = 1;
                          stackIn_119_0 = stackOut_117_0;
                          break L7;
                        }
                      }
                      return stackIn_119_0 != 0;
                    }
                  } else {
                    ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                    if (!((ib) this).field_h) {
                      L8: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_113_0 = 0;
                          stackIn_114_0 = stackOut_113_0;
                          break L8;
                        } else {
                          stackOut_112_0 = 1;
                          stackIn_114_0 = stackOut_112_0;
                          break L8;
                        }
                      }
                      return stackIn_114_0 != 0;
                    } else {
                      L9: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_109_0 = 0;
                          stackIn_110_0 = stackOut_109_0;
                          break L9;
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_110_0 = stackOut_108_0;
                          break L9;
                        }
                      }
                      return stackIn_110_0 != 0;
                    }
                  }
                }
              } else {
                ((ib) this).field_b = -Math.abs(((ib) this).field_b);
                if (((ib) this).field_k >= 0.0) {
                  if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                    if (((ib) this).field_h) {
                      L10: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_101_0 = 0;
                          stackIn_102_0 = stackOut_101_0;
                          break L10;
                        } else {
                          stackOut_100_0 = 1;
                          stackIn_102_0 = stackOut_100_0;
                          break L10;
                        }
                      }
                      return stackIn_102_0 != 0;
                    } else {
                      L11: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_97_0 = 0;
                          stackIn_98_0 = stackOut_97_0;
                          break L11;
                        } else {
                          stackOut_96_0 = 1;
                          stackIn_98_0 = stackOut_96_0;
                          break L11;
                        }
                      }
                      return stackIn_98_0 != 0;
                    }
                  } else {
                    ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                    if (((ib) this).field_h) {
                      L12: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_91_0 = 0;
                          stackIn_92_0 = stackOut_91_0;
                          break L12;
                        } else {
                          stackOut_90_0 = 1;
                          stackIn_92_0 = stackOut_90_0;
                          break L12;
                        }
                      }
                      return stackIn_92_0 != 0;
                    } else {
                      L13: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_87_0 = 0;
                          stackIn_88_0 = stackOut_87_0;
                          break L13;
                        } else {
                          stackOut_86_0 = 1;
                          stackIn_88_0 = stackOut_86_0;
                          break L13;
                        }
                      }
                      return stackIn_88_0 != 0;
                    }
                  }
                } else {
                  L14: {
                    ((ib) this).field_p = Math.abs(((ib) this).field_p);
                    if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                      break L14;
                    } else {
                      ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                      break L14;
                    }
                  }
                  if (((ib) this).field_h) {
                    L15: {
                      if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                        stackOut_80_0 = 0;
                        stackIn_81_0 = stackOut_80_0;
                        break L15;
                      } else {
                        stackOut_79_0 = 1;
                        stackIn_81_0 = stackOut_79_0;
                        break L15;
                      }
                    }
                    return stackIn_81_0 != 0;
                  } else {
                    L16: {
                      if (0 < ((ib) this).field_s) {
                        stackOut_76_0 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        break L16;
                      } else {
                        stackOut_75_0 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        break L16;
                      }
                    }
                    return stackIn_77_0 != 0;
                  }
                }
              }
            } else {
              ((ib) this).field_b = Math.abs(((ib) this).field_b);
              if ((double)(-((ib) this).field_n.field_h + 640) >= ((ib) this).field_d) {
                if (((ib) this).field_k >= 0.0) {
                  if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                    if (((ib) this).field_h) {
                      L17: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_66_0 = 0;
                          stackIn_67_0 = stackOut_66_0;
                          break L17;
                        } else {
                          stackOut_65_0 = 1;
                          stackIn_67_0 = stackOut_65_0;
                          break L17;
                        }
                      }
                      return stackIn_67_0 != 0;
                    } else {
                      L18: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L18;
                        } else {
                          stackOut_61_0 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          break L18;
                        }
                      }
                      return stackIn_63_0 != 0;
                    }
                  } else {
                    ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                    if (((ib) this).field_h) {
                      L19: {
                        if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                          stackOut_56_0 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          break L19;
                        } else {
                          stackOut_55_0 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          break L19;
                        }
                      }
                      return stackIn_57_0 != 0;
                    } else {
                      L20: {
                        if (0 < ((ib) this).field_s) {
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L20;
                        } else {
                          stackOut_51_0 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L20;
                        }
                      }
                      return stackIn_53_0 != 0;
                    }
                  }
                } else {
                  L21: {
                    ((ib) this).field_p = Math.abs(((ib) this).field_p);
                    if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                      break L21;
                    } else {
                      ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                      break L21;
                    }
                  }
                  if (((ib) this).field_h) {
                    L22: {
                      if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L22;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L22;
                      }
                    }
                    return stackIn_46_0 != 0;
                  } else {
                    L23: {
                      if (0 < ((ib) this).field_s) {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        break L23;
                      } else {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        break L23;
                      }
                    }
                    return stackIn_42_0 != 0;
                  }
                }
              } else {
                L24: {
                  ((ib) this).field_b = -Math.abs(((ib) this).field_b);
                  if (((ib) this).field_k >= 0.0) {
                    break L24;
                  } else {
                    ((ib) this).field_p = Math.abs(((ib) this).field_p);
                    break L24;
                  }
                }
                L25: {
                  if ((double)(430 + -((ib) this).field_n.field_c) >= ((ib) this).field_k) {
                    break L25;
                  } else {
                    ((ib) this).field_p = -Math.abs(((ib) this).field_p);
                    break L25;
                  }
                }
                if (((ib) this).field_h) {
                  L26: {
                    if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L26;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L26;
                    }
                  }
                  return stackIn_33_0 != 0;
                } else {
                  L27: {
                    if (0 < ((ib) this).field_s) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L27;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L27;
                    }
                  }
                  return stackIn_29_0 != 0;
                }
              }
            }
          } else {
            ((ib) this).field_d = ((ib) this).field_d - 1.0;
            ((ib) this).field_b = 0.0;
            ((ib) this).field_p = 0.0;
            if (((ib) this).field_h) {
              L28: {
                if (((ib) this).field_d >= (double)(-((ib) this).field_n.field_h)) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L28;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L28;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              L29: {
                if (0 < ((ib) this).field_s) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L29;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L29;
                }
              }
              return stackIn_13_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == -114) {
          if (((ib) this).field_q) {
            if (((ib) this).field_s <= 62) {
              var2 = (int)(128.0 * ji.a(65535, (double)((ib) this).field_s / 5.0) + 127.0);
              ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k, var2);
              return;
            } else {
              ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k);
              return;
            }
          } else {
            L0: {
              if (((ib) this).field_c >= 25) {
                break L0;
              } else {
                var2 = -(((ib) this).field_c * 4) + 100;
                var3 = ((ib) this).field_c * 10;
                wj.c((int)((ib) this).field_d - -((ib) this).field_e, (int)((ib) this).field_k + ((ib) this).field_i, var2, 16777215, var3);
                break L0;
              }
            }
            ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k);
            return;
          }
        } else {
          field_t = -8;
          if (((ib) this).field_q) {
            if (((ib) this).field_s <= 62) {
              var2 = (int)(128.0 * ji.a(65535, (double)((ib) this).field_s / 5.0) + 127.0);
              ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k, var2);
              return;
            } else {
              ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k);
              return;
            }
          } else {
            L1: {
              if (((ib) this).field_c >= 25) {
                break L1;
              } else {
                var2 = -(((ib) this).field_c * 4) + 100;
                var3 = ((ib) this).field_c * 10;
                wj.c((int)((ib) this).field_d - -((ib) this).field_e, (int)((ib) this).field_k + ((ib) this).field_i, var2, 16777215, var3);
                break L1;
              }
            }
            ((ib) this).field_n.a((int)((ib) this).field_d, (int)((ib) this).field_k);
            return;
          }
        }
    }

    public static void a() {
        field_u = null;
        field_j = null;
        field_f = null;
        field_r = null;
    }

    ib(double param0, double param1, int param2, boolean param3, boolean param4) {
        double var8_double = 0.0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
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
        L0: {
          ((ib) this).field_s = 200;
          ((ib) this).field_p = 0.0;
          ((ib) this).field_d = param0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((ib) this).field_q = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
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
          ((ib) this).field_h = stackIn_6_1 != 0;
          ((ib) this).field_k = param1;
          ((ib) this).field_b = 0.0;
          ((ib) this).field_c = 0;
          if (!((ib) this).field_q) {
            break L2;
          } else {
            var8_double = 6.283185307179586 * Math.random();
            ((ib) this).field_b = 3.5 * ji.a(65535, var8_double);
            ((ib) this).field_p = 3.5 * pj.a(var8_double, 32768);
            break L2;
          }
        }
        L3: {
          if (!((ib) this).field_h) {
            break L3;
          } else {
            ((ib) this).field_p = -3.0;
            break L3;
          }
        }
        if (0 >= param2) {
          var8 = -1;
          var9 = 1;
          L4: while (true) {
            if (var9 == 0) {
              if (sd.field_a.field_A < 3 * (sd.field_a.field_q + 1) - -1 >> 1) {
                L5: {
                  ((ib) this).field_g = 1;
                  ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                  ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                  if (((ib) this).field_g != 7) {
                    break L5;
                  } else {
                    int discarded$15 = 65;
                    this.c();
                    break L5;
                  }
                }
                ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                return;
              } else {
                if (var8 < 4) {
                  if (sd.field_a.field_w < 9) {
                    L6: {
                      ((ib) this).field_g = 3;
                      ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                      ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                      if (((ib) this).field_g != 7) {
                        break L6;
                      } else {
                        int discarded$16 = 65;
                        this.c();
                        break L6;
                      }
                    }
                    ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                    ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                    return;
                  } else {
                    if (var8 < 29) {
                      L7: {
                        ((ib) this).field_g = 4;
                        ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                        ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                        if (((ib) this).field_g != 7) {
                          break L7;
                        } else {
                          int discarded$17 = 65;
                          this.c();
                          break L7;
                        }
                      }
                      ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                      ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                      return;
                    } else {
                      if (var8 < 49) {
                        L8: {
                          ((ib) this).field_g = 5;
                          ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                          ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                          if (((ib) this).field_g != 7) {
                            break L8;
                          } else {
                            int discarded$18 = 65;
                            this.c();
                            break L8;
                          }
                        }
                        ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                        ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                        return;
                      } else {
                        if (64 > var8) {
                          L9: {
                            ((ib) this).field_g = 6;
                            ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                            ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                            if (((ib) this).field_g != 7) {
                              break L9;
                            } else {
                              int discarded$19 = 65;
                              this.c();
                              break L9;
                            }
                          }
                          ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                          ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                          return;
                        } else {
                          if (79 <= var8) {
                            L10: {
                              ((ib) this).field_g = 2;
                              ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                              ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                              if (((ib) this).field_g != 7) {
                                break L10;
                              } else {
                                int discarded$20 = 65;
                                this.c();
                                break L10;
                              }
                            }
                            ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                            ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                            return;
                          } else {
                            if (sd.field_a.field_L >= 6) {
                              L11: {
                                ((ib) this).field_g = 2;
                                ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                                ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                                if (((ib) this).field_g != 7) {
                                  break L11;
                                } else {
                                  int discarded$21 = 65;
                                  this.c();
                                  break L11;
                                }
                              }
                              ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                              ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                              return;
                            } else {
                              ((ib) this).field_g = 7;
                              L12: {
                                ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                                ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                                if (((ib) this).field_g != 7) {
                                  break L12;
                                } else {
                                  int discarded$22 = 65;
                                  this.c();
                                  break L12;
                                }
                              }
                              ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                              ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (var8 < 29) {
                    L13: {
                      ((ib) this).field_g = 4;
                      ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                      ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                      if (((ib) this).field_g != 7) {
                        break L13;
                      } else {
                        int discarded$23 = 65;
                        this.c();
                        break L13;
                      }
                    }
                    ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                    ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                    return;
                  } else {
                    if (var8 < 49) {
                      L14: {
                        ((ib) this).field_g = 5;
                        ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                        ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                        if (((ib) this).field_g != 7) {
                          break L14;
                        } else {
                          int discarded$24 = 65;
                          this.c();
                          break L14;
                        }
                      }
                      ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                      ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                      return;
                    } else {
                      if (64 > var8) {
                        L15: {
                          ((ib) this).field_g = 6;
                          ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                          ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                          if (((ib) this).field_g != 7) {
                            break L15;
                          } else {
                            int discarded$25 = 65;
                            this.c();
                            break L15;
                          }
                        }
                        ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                        ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                        return;
                      } else {
                        if (79 <= var8) {
                          L16: {
                            ((ib) this).field_g = 2;
                            ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                            ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                            if (((ib) this).field_g != 7) {
                              break L16;
                            } else {
                              int discarded$26 = 65;
                              this.c();
                              break L16;
                            }
                          }
                          ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                          ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                          return;
                        } else {
                          if (sd.field_a.field_L >= 6) {
                            L17: {
                              ((ib) this).field_g = 2;
                              ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                              ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                              if (((ib) this).field_g != 7) {
                                break L17;
                              } else {
                                int discarded$27 = 65;
                                this.c();
                                break L17;
                              }
                            }
                            ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                            ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                            return;
                          } else {
                            ((ib) this).field_g = 7;
                            L18: {
                              ((ib) this).field_n = cj.field_h[((ib) this).field_g];
                              ((ib) this).field_m = nd.field_R[((ib) this).field_g];
                              if (((ib) this).field_g != 7) {
                                break L18;
                              } else {
                                int discarded$28 = 65;
                                this.c();
                                break L18;
                              }
                            }
                            ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
                            ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var8 = hi.a(100, 4, sf.field_d);
              var9 = 0;
              if (var8 < 0) {
                var9 = 1;
                continue L4;
              } else {
                L19: {
                  if (var8 >= 4) {
                    break L19;
                  } else {
                    if (sd.field_a.field_w >= 9) {
                      var9 = 1;
                      continue L4;
                    } else {
                      break L19;
                    }
                  }
                }
                if (var8 < 64) {
                  continue L4;
                } else {
                  if (var8 >= 79) {
                    continue L4;
                  } else {
                    if (sd.field_a.field_L < 6) {
                      continue L4;
                    } else {
                      var9 = 1;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          L20: {
            ((ib) this).field_g = param2;
            ((ib) this).field_n = cj.field_h[((ib) this).field_g];
            ((ib) this).field_m = nd.field_R[((ib) this).field_g];
            if (((ib) this).field_g != 7) {
              break L20;
            } else {
              int discarded$29 = 65;
              this.c();
              break L20;
            }
          }
          ((ib) this).field_e = ((ib) this).field_n.field_d / 2 - -((ib) this).field_n.field_a;
          ((ib) this).field_i = ((ib) this).field_n.field_f + ((ib) this).field_n.field_k / 2;
          return;
        }
    }

    static {
    }
}
