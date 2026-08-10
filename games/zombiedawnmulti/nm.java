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
        this.field_v = (param1 * 54 + (6 * param3 + param2 * -15) + -(param8 * 27)) / 18;
        this.field_p = (-(27 * param0) + 6 * param4 + (-15 * param5 - -(54 * param7))) / 18;
        this.field_s = param2;
        this.field_h = (54 * param8 + (-(27 * param1) + (param3 * -15 + param2 * 6))) / 18;
        this.field_n = (param0 * 54 + (-(param7 * 27) + (-15 * param4 - -(6 * param5)))) / 18;
        this.field_e = param3;
        this.field_o = param5;
        if (param6 != 0) {
            this.a(-46, 18, 71, -61, 29, -12, 103, -61, 65);
        } else {
            this.field_l = param4;
            return;
        }
        this.field_l = param4;
    }

    private final void b(int param0) {
        float stackIn_6_0 = 0.0f;
        float stackIn_24_0 = 0.0f;
        float var2;
        float var3;
        int var4;
        int var5;
        var2 = 320.0f * this.field_d;
        if (param0 == 27) {
          if (var2 <= (float)this.field_k) {
            L0: {
              if (!he.field_a) {
                stackIn_24_0 = this.field_d * 200.0f;
                break L0;
              } else {
                stackIn_24_0 = this.field_d * 240.0f;
                break L0;
              }
            }
            var3 = stackIn_24_0;
            if (var3 <= (float)this.field_g) {
              L1: {
                var4 = (int)((float)(320 + this.field_q) - var2);
                if (var4 < this.field_k) {
                  this.field_k = var4;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = (int)((float)(this.field_j + 240) - var3);
              if (this.field_g > var5) {
                this.field_g = var5;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                this.field_g = (int)var3;
                var4 = (int)((float)(320 + this.field_q) - var2);
                if (var4 < this.field_k) {
                  this.field_k = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = (int)((float)(this.field_j + 240) - var3);
              if (this.field_g > var5) {
                this.field_g = var5;
                return;
              } else {
                return;
              }
            }
          } else {
            L3: {
              this.field_k = (int)var2;
              if (!he.field_a) {
                stackIn_6_0 = this.field_d * 200.0f;
                break L3;
              } else {
                stackIn_6_0 = this.field_d * 240.0f;
                break L3;
              }
            }
            var3 = stackIn_6_0;
            if (var3 <= (float)this.field_g) {
              L4: {
                var4 = (int)((float)(320 + this.field_q) - var2);
                if (var4 < this.field_k) {
                  this.field_k = var4;
                  break L4;
                } else {
                  break L4;
                }
              }
              var5 = (int)((float)(this.field_j + 240) - var3);
              if (this.field_g > var5) {
                this.field_g = var5;
                return;
              } else {
                return;
              }
            } else {
              L5: {
                this.field_g = (int)var3;
                var4 = (int)((float)(320 + this.field_q) - var2);
                if (var4 < this.field_k) {
                  this.field_k = var4;
                  break L5;
                } else {
                  break L5;
                }
              }
              var5 = (int)((float)(this.field_j + 240) - var3);
              if (this.field_g <= var5) {
                return;
              } else {
                this.field_g = var5;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static uj b(int param0, int param1) {
        wj var2;
        var2 = new wj(param1);
        fd.field_M.a(var2, false);
        if (param0 > -125) {
          return (uj) null;
        } else {
          return var2.field_m;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != 105) {
            return;
        }
        m.c(540);
        oo.e(param0, param4, param3, param1);
    }

    public static void a(int param0) {
        field_b = null;
        field_u = null;
        if (param0 != 6) {
            return;
        }
        field_w = null;
        field_m = null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_h = 13;
          return (int)((float)this.field_g + this.field_d * (float)(param1 - 240));
        } else {
          return (int)((float)this.field_g + this.field_d * (float)(param1 - 240));
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 25992) {
          return;
        } else {
          this.field_g = this.field_g - param1;
          this.field_k = this.field_k - param0;
          this.b(27);
          return;
        }
    }

    final void a(byte param0) {
        if (param0 <= 41) {
            this.c(-95, 100);
            if (!(!gf.field_h)) {
                return;
            }
            this.field_g = this.field_l;
            this.field_f = true;
            this.field_k = this.field_e;
            this.field_t = 0.0f;
            this.field_i = 0.004999999888241291f;
            return;
        }
        if (!(!gf.field_h)) {
            return;
        }
        this.field_g = this.field_l;
        this.field_f = true;
        this.field_k = this.field_e;
        this.field_t = 0.0f;
        this.field_i = 0.004999999888241291f;
    }

    final int c(int param0, int param1) {
        if (param1 != -20126) {
          return 52;
        } else {
          return (int)((float)(-this.field_k) + (this.field_d * 320.0f + (float)param0));
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 2) {
          this.a(48, (byte) 69, 41);
          return (int)(this.field_d * (float)(param0 - 320) + (float)this.field_k);
        } else {
          return (int)(this.field_d * (float)(param0 - 320) + (float)this.field_k);
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != 0) {
          field_w = (ja) null;
          return ah.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
        } else {
          return ah.field_d[65535 & (int)(32768.0 * param1 / 3.141592653589793)];
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, byte param4, boolean param5) {
        int stackIn_13_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_60_0 = 0;
        float var7;
        int var7_int;
        float var8;
        int var9;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_f) {
          if (0.00001 >= (double)this.field_i) {
            this.field_f = false;
            if (param4 != -91) {
              return;
            } else {
              this.b(27);
              return;
            }
          } else {
            if (1.0f > this.field_t) {
              L0: {
                this.field_t = this.field_t + this.field_i;
                if ((double)this.field_t > 0.87) {
                  this.field_i = (float)((double)this.field_i - 0.0001);
                  break L0;
                } else {
                  break L0;
                }
              }
              var7 = this.field_t;
              var8 = -var7 + 1.0f;
              this.field_k = (int)(var7 * (var7 * (var8 * (float)(3 * this.field_v))) + (var8 * (float)this.field_e * var8 * var8 + var8 * ((float)(3 * this.field_h) * var8) * var7) + var7 * ((float)this.field_s * var7) * var7);
              this.field_g = (int)(var7 * (var8 * (float)(3 * this.field_p)) * var7 + (var8 * ((float)this.field_l * var8) * var8 + var7 * (var8 * (float)(3 * this.field_n) * var8)) + var7 * (var7 * (var7 * (float)this.field_o)));
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            } else {
              this.field_f = false;
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            }
          }
        } else {
          if (-1 <= (this.field_r ^ -1)) {
            if (0 >= this.field_a) {
              L1: {
                if (this.field_a < 0) {
                  this.field_a = this.field_a + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 < (this.field_r ^ -1)) {
                  this.field_r = this.field_r + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1) {
                  stackIn_60_0 = 2;
                  break L3;
                } else {
                  stackIn_60_0 = 1;
                  break L3;
                }
              }
              var7_int = stackIn_60_0 * (int)(this.field_d * 8.0f);
              if (!param2) {
                L4: {
                  if (param3) {
                    this.field_a = var7_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!param5) {
                  L5: {
                    if (param0) {
                      this.field_a = -var7_int;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_g = this.field_g + this.field_r;
                  this.field_k = this.field_k + this.field_a;
                  if (param4 != -91) {
                    return;
                  } else {
                    this.b(27);
                    return;
                  }
                } else {
                  L6: {
                    this.field_r = var7_int;
                    if (param0) {
                      this.field_a = -var7_int;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_g = this.field_g + this.field_r;
                  this.field_k = this.field_k + this.field_a;
                  if (param4 != -91) {
                    return;
                  } else {
                    this.b(27);
                    return;
                  }
                }
              } else {
                L7: {
                  this.field_r = -var7_int;
                  if (param3) {
                    this.field_a = var7_int;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!param5) {
                    break L8;
                  } else {
                    this.field_r = var7_int;
                    break L8;
                  }
                }
                L9: {
                  if (param0) {
                    this.field_a = -var7_int;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_g = this.field_g + this.field_r;
                this.field_k = this.field_k + this.field_a;
                if (param4 != -91) {
                  return;
                } else {
                  this.b(27);
                  return;
                }
              }
            } else {
              L10: {
                this.field_a = this.field_a - 1;
                if (this.field_a < 0) {
                  this.field_a = this.field_a + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-1 < (this.field_r ^ -1)) {
                  this.field_r = this.field_r + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param1) {
                  stackIn_37_0 = 2;
                  break L12;
                } else {
                  stackIn_37_0 = 1;
                  break L12;
                }
              }
              L13: {
                var7_int = stackIn_37_0 * (int)(this.field_d * 8.0f);
                if (!param2) {
                  break L13;
                } else {
                  this.field_r = -var7_int;
                  break L13;
                }
              }
              L14: {
                if (param3) {
                  this.field_a = var7_int;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (!param5) {
                  break L15;
                } else {
                  this.field_r = var7_int;
                  break L15;
                }
              }
              L16: {
                if (param0) {
                  this.field_a = -var7_int;
                  break L16;
                } else {
                  break L16;
                }
              }
              this.field_g = this.field_g + this.field_r;
              this.field_k = this.field_k + this.field_a;
              if (param4 != -91) {
                return;
              } else {
                this.b(27);
                return;
              }
            }
          } else {
            L17: {
              this.field_r = this.field_r - 1;
              if (0 >= this.field_a) {
                break L17;
              } else {
                this.field_a = this.field_a - 1;
                break L17;
              }
            }
            L18: {
              if (this.field_a < 0) {
                this.field_a = this.field_a + 1;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (-1 < (this.field_r ^ -1)) {
                this.field_r = this.field_r + 1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (param1) {
                stackIn_13_0 = 2;
                break L20;
              } else {
                stackIn_13_0 = 1;
                break L20;
              }
            }
            L21: {
              var7_int = stackIn_13_0 * (int)(this.field_d * 8.0f);
              if (!param2) {
                break L21;
              } else {
                this.field_r = -var7_int;
                break L21;
              }
            }
            L22: {
              if (param3) {
                this.field_a = var7_int;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (!param5) {
                break L23;
              } else {
                this.field_r = var7_int;
                break L23;
              }
            }
            L24: {
              if (param0) {
                this.field_a = -var7_int;
                break L24;
              } else {
                break L24;
              }
            }
            this.field_g = this.field_g + this.field_r;
            this.field_k = this.field_k + this.field_a;
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
          nm.a(-81, -0.29647944214546124);
          return (int)((float)(-this.field_g) + (this.field_d * 240.0f + (float)param0));
        } else {
          return (int)((float)(-this.field_g) + (this.field_d * 240.0f + (float)param0));
        }
    }

    nm(int param0, int param1) {
        this.field_a = 0;
        this.field_r = 0;
        this.field_f = false;
        this.field_d = 1.0f;
        this.field_j = param1 - 240;
        this.field_q = -320 + param0;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        this.a(this.field_j / 2, (byte) -39, this.field_q / 2);
    }

    final void a(int param0, byte param1, int param2) {
        this.field_g = param0;
        this.field_k = param2;
        this.b(27);
        if (param1 > -35) {
            nm.a(-48, -0.08284056706899026);
        }
    }

    static {
        field_m = new int[8192];
        field_u = new int[]{};
        field_b = "2- and 4-player games!";
    }
}
