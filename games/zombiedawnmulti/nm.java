/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    private int field_j;
    private int field_p;
    private int field_r;
    static long field_c;
    private int field_n;
    static ja field_w;
    private int field_a;
    int field_k;
    static String field_b;
    private int field_s;
    static int[] field_m;
    float field_i;
    private int field_o;
    private int field_l;
    private int field_q;
    private int field_e;
    int field_g;
    float field_t;
    boolean field_f;
    static int[] field_u;
    private int field_h;
    private int field_v;
    float field_d;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((nm) this).field_v = (param1 * 54 + (6 * param3 + param2 * -15) + -(param8 * 27)) / 18;
        ((nm) this).field_p = (-(27 * param0) + 6 * param4 + (-15 * param5 - -(54 * param7))) / 18;
        ((nm) this).field_s = param2;
        ((nm) this).field_h = (54 * param8 + (-(27 * param1) + (param3 * -15 + param2 * 6))) / 18;
        ((nm) this).field_n = (param0 * 54 + (-(param7 * 27) + (-15 * param4 - -(6 * param5)))) / 18;
        ((nm) this).field_e = param3;
        ((nm) this).field_o = param5;
        if (param6 != 0) {
            ((nm) this).a(-46, 18, 71, -61, 29, -12, 103, -61, 65);
        } else {
            ((nm) this).field_l = param4;
            return;
        }
        ((nm) this).field_l = param4;
    }

    private final void b(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        float stackIn_4_0 = 0.0f;
        float stackIn_22_0 = 0.0f;
        float stackOut_21_0 = 0.0f;
        float stackOut_20_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        var2 = 320.0f * ((nm) this).field_d;
        if (var2 <= (float)((nm) this).field_k) {
          L0: {
            if (!he.field_a) {
              stackOut_21_0 = ((nm) this).field_d * 200.0f;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              stackOut_20_0 = ((nm) this).field_d * 240.0f;
              stackIn_22_0 = stackOut_20_0;
              break L0;
            }
          }
          var3 = stackIn_22_0;
          if (var3 <= (float)((nm) this).field_g) {
            L1: {
              var4 = (int)((float)(320 + ((nm) this).field_q) - var2);
              if (var4 < ((nm) this).field_k) {
                ((nm) this).field_k = var4;
                break L1;
              } else {
                break L1;
              }
            }
            var5 = (int)((float)(((nm) this).field_j + 240) - var3);
            if (((nm) this).field_g > var5) {
              ((nm) this).field_g = var5;
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ((nm) this).field_g = (int)var3;
              var4 = (int)((float)(320 + ((nm) this).field_q) - var2);
              if (var4 < ((nm) this).field_k) {
                ((nm) this).field_k = var4;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = (int)((float)(((nm) this).field_j + 240) - var3);
            if (((nm) this).field_g > var5) {
              ((nm) this).field_g = var5;
              return;
            } else {
              return;
            }
          }
        } else {
          L3: {
            ((nm) this).field_k = (int)var2;
            if (!he.field_a) {
              stackOut_3_0 = ((nm) this).field_d * 200.0f;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = ((nm) this).field_d * 240.0f;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          var3 = stackIn_4_0;
          if (var3 <= (float)((nm) this).field_g) {
            L4: {
              var4 = (int)((float)(320 + ((nm) this).field_q) - var2);
              if (var4 < ((nm) this).field_k) {
                ((nm) this).field_k = var4;
                break L4;
              } else {
                break L4;
              }
            }
            var5 = (int)((float)(((nm) this).field_j + 240) - var3);
            if (((nm) this).field_g > var5) {
              ((nm) this).field_g = var5;
              return;
            } else {
              return;
            }
          } else {
            L5: {
              ((nm) this).field_g = (int)var3;
              var4 = (int)((float)(320 + ((nm) this).field_q) - var2);
              if (var4 < ((nm) this).field_k) {
                ((nm) this).field_k = var4;
                break L5;
              } else {
                break L5;
              }
            }
            var5 = (int)((float)(((nm) this).field_j + 240) - var3);
            if (((nm) this).field_g <= var5) {
              return;
            } else {
              ((nm) this).field_g = var5;
              return;
            }
          }
        }
    }

    final static uj b(int param0, int param1) {
        wj var2 = null;
        var2 = new wj(param1);
        fd.field_M.a((br) (Object) var2, false);
        if (param0 > -125) {
          return null;
        } else {
          return var2.field_m;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        m.c(540);
        oo.e(param0, param4, param3, param1);
    }

    public static void a(int param0) {
        field_b = null;
        field_u = null;
        field_w = null;
        field_m = null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          ((nm) this).field_h = 13;
          return (int)((float)((nm) this).field_g + ((nm) this).field_d * (float)(param1 - 240));
        } else {
          return (int)((float)((nm) this).field_g + ((nm) this).field_d * (float)(param1 - 240));
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 25992) {
          return;
        } else {
          ((nm) this).field_g = ((nm) this).field_g - param1;
          ((nm) this).field_k = ((nm) this).field_k - param0;
          this.b(27);
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 41) {
            int discarded$10 = ((nm) this).c(-95, 100);
            if (!(!gf.field_h)) {
                return;
            }
            ((nm) this).field_g = ((nm) this).field_l;
            ((nm) this).field_f = true;
            ((nm) this).field_k = ((nm) this).field_e;
            ((nm) this).field_t = 0.0f;
            ((nm) this).field_i = 0.004999999888241291f;
            return;
        }
        if (!(!gf.field_h)) {
            return;
        }
        ((nm) this).field_g = ((nm) this).field_l;
        ((nm) this).field_f = true;
        ((nm) this).field_k = ((nm) this).field_e;
        ((nm) this).field_t = 0.0f;
        ((nm) this).field_i = 0.004999999888241291f;
    }

    final int c(int param0, int param1) {
        if (param1 != -20126) {
          return 52;
        } else {
          return (int)((float)(-((nm) this).field_k) + (((nm) this).field_d * 320.0f + (float)param0));
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 2) {
          ((nm) this).a(48, (byte) 69, 41);
          return (int)(((nm) this).field_d * (float)(param0 - 320) + (float)((nm) this).field_k);
        } else {
          return (int)(((nm) this).field_d * (float)(param0 - 320) + (float)((nm) this).field_k);
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != 0) {
          field_w = null;
          return ah.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
        } else {
          return ah.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, byte param4, boolean param5) {
        float var7 = 0.0f;
        int var7_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((nm) this).field_f) {
          if (0.00001 >= (double)((nm) this).field_i) {
            ((nm) this).field_f = false;
            if (param4 != -91) {
              return;
            } else {
              this.b(27);
              return;
            }
          } else {
            if (1.0f > ((nm) this).field_t) {
              L0: {
                ((nm) this).field_t = ((nm) this).field_t + ((nm) this).field_i;
                if ((double)((nm) this).field_t > 0.87) {
                  ((nm) this).field_i = (float)((double)((nm) this).field_i - 0.0001);
                  break L0;
                } else {
                  break L0;
                }
              }
              var7 = ((nm) this).field_t;
              var8 = -var7 + 1.0f;
              ((nm) this).field_k = (int)(var7 * (var7 * (var8 * (float)(3 * ((nm) this).field_v))) + (var8 * (float)((nm) this).field_e * var8 * var8 + var8 * ((float)(3 * ((nm) this).field_h) * var8) * var7) + var7 * ((float)((nm) this).field_s * var7) * var7);
              ((nm) this).field_g = (int)(var7 * (var8 * (float)(3 * ((nm) this).field_p)) * var7 + (var8 * ((float)((nm) this).field_l * var8) * var8 + var7 * (var8 * (float)(3 * ((nm) this).field_n) * var8)) + var7 * (var7 * (var7 * (float)((nm) this).field_o)));
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            } else {
              ((nm) this).field_f = false;
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            }
          }
        } else {
          if (((nm) this).field_r <= 0) {
            if (0 >= ((nm) this).field_a) {
              L1: {
                if (((nm) this).field_a < 0) {
                  ((nm) this).field_a = ((nm) this).field_a + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((nm) this).field_r < 0) {
                  ((nm) this).field_r = ((nm) this).field_r + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1) {
                  stackOut_59_0 = 2;
                  stackIn_60_0 = stackOut_59_0;
                  break L3;
                } else {
                  stackOut_58_0 = 1;
                  stackIn_60_0 = stackOut_58_0;
                  break L3;
                }
              }
              var7_int = stackIn_60_0 * (int)(((nm) this).field_d * 8.0f);
              if (!param2) {
                L4: {
                  if (param3) {
                    ((nm) this).field_a = var7_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!param5) {
                  L5: {
                    if (param0) {
                      ((nm) this).field_a = -var7_int;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((nm) this).field_g = ((nm) this).field_g + ((nm) this).field_r;
                  ((nm) this).field_k = ((nm) this).field_k + ((nm) this).field_a;
                  if (param4 != -91) {
                    return;
                  } else {
                    this.b(27);
                    return;
                  }
                } else {
                  L6: {
                    ((nm) this).field_r = var7_int;
                    if (param0) {
                      ((nm) this).field_a = -var7_int;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((nm) this).field_g = ((nm) this).field_g + ((nm) this).field_r;
                  ((nm) this).field_k = ((nm) this).field_k + ((nm) this).field_a;
                  if (param4 != -91) {
                    return;
                  } else {
                    this.b(27);
                    return;
                  }
                }
              } else {
                L7: {
                  ((nm) this).field_r = -var7_int;
                  if (param3) {
                    ((nm) this).field_a = var7_int;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!param5) {
                    break L8;
                  } else {
                    ((nm) this).field_r = var7_int;
                    break L8;
                  }
                }
                L9: {
                  if (param0) {
                    ((nm) this).field_a = -var7_int;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((nm) this).field_g = ((nm) this).field_g + ((nm) this).field_r;
                ((nm) this).field_k = ((nm) this).field_k + ((nm) this).field_a;
                if (param4 != -91) {
                  return;
                } else {
                  this.b(27);
                  return;
                }
              }
            } else {
              L10: {
                ((nm) this).field_a = ((nm) this).field_a - 1;
                if (((nm) this).field_a < 0) {
                  ((nm) this).field_a = ((nm) this).field_a + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (((nm) this).field_r < 0) {
                  ((nm) this).field_r = ((nm) this).field_r + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param1) {
                  stackOut_36_0 = 2;
                  stackIn_37_0 = stackOut_36_0;
                  break L12;
                } else {
                  stackOut_35_0 = 1;
                  stackIn_37_0 = stackOut_35_0;
                  break L12;
                }
              }
              L13: {
                var7_int = stackIn_37_0 * (int)(((nm) this).field_d * 8.0f);
                if (!param2) {
                  break L13;
                } else {
                  ((nm) this).field_r = -var7_int;
                  break L13;
                }
              }
              L14: {
                if (param3) {
                  ((nm) this).field_a = var7_int;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (!param5) {
                  break L15;
                } else {
                  ((nm) this).field_r = var7_int;
                  break L15;
                }
              }
              L16: {
                if (param0) {
                  ((nm) this).field_a = -var7_int;
                  break L16;
                } else {
                  break L16;
                }
              }
              ((nm) this).field_g = ((nm) this).field_g + ((nm) this).field_r;
              ((nm) this).field_k = ((nm) this).field_k + ((nm) this).field_a;
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            }
          } else {
            L17: {
              ((nm) this).field_r = ((nm) this).field_r - 1;
              if (0 >= ((nm) this).field_a) {
                break L17;
              } else {
                ((nm) this).field_a = ((nm) this).field_a - 1;
                break L17;
              }
            }
            L18: {
              if (((nm) this).field_a < 0) {
                ((nm) this).field_a = ((nm) this).field_a + 1;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (((nm) this).field_r < 0) {
                ((nm) this).field_r = ((nm) this).field_r + 1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (param1) {
                stackOut_12_0 = 2;
                stackIn_13_0 = stackOut_12_0;
                break L20;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L20;
              }
            }
            L21: {
              var7_int = stackIn_13_0 * (int)(((nm) this).field_d * 8.0f);
              if (!param2) {
                break L21;
              } else {
                ((nm) this).field_r = -var7_int;
                break L21;
              }
            }
            L22: {
              if (param3) {
                ((nm) this).field_a = var7_int;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (!param5) {
                break L23;
              } else {
                ((nm) this).field_r = var7_int;
                break L23;
              }
            }
            L24: {
              if (param0) {
                ((nm) this).field_a = -var7_int;
                break L24;
              } else {
                break L24;
              }
            }
            ((nm) this).field_g = ((nm) this).field_g + ((nm) this).field_r;
            ((nm) this).field_k = ((nm) this).field_k + ((nm) this).field_a;
            if (param4 != -91) {
              return;
            } else {
              this.b(27);
              return;
            }
          }
        }
    }

    final int d(int param0, int param1) {
        if (param1 < 104) {
          return (int)((float)(-((nm) this).field_g) + (((nm) this).field_d * 240.0f + (float)param0));
        } else {
          return (int)((float)(-((nm) this).field_g) + (((nm) this).field_d * 240.0f + (float)param0));
        }
    }

    nm(int param0, int param1) {
        ((nm) this).field_a = 0;
        ((nm) this).field_r = 0;
        ((nm) this).field_f = false;
        ((nm) this).field_d = 1.0f;
        ((nm) this).field_j = param1 - 240;
        ((nm) this).field_q = -320 + param0;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((nm) this).a(((nm) this).field_j / 2, (byte) -39, ((nm) this).field_q / 2);
    }

    final void a(int param0, byte param1, int param2) {
        ((nm) this).field_g = param0;
        ((nm) this).field_k = param2;
        this.b(27);
        if (param1 > -35) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_u = new int[]{};
        field_b = "2- and 4-player games!";
    }
}
