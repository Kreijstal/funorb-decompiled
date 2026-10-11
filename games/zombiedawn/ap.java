/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends al {
    private int field_D;
    private boolean field_H;
    private boolean field_t;
    private int field_x;
    static int field_u;
    private int field_q;
    private int field_G;
    static long field_m;
    private boolean field_F;
    private boolean field_o;
    private int field_n;
    private int field_E;
    private int field_B;
    private int field_A;
    private int field_z;
    static String field_w;
    static String field_s;
    private int field_p;
    private int field_r;
    private boolean field_y;
    private int field_v;

    public static void a(boolean param0) {
        if (param0) {
          field_s = (String) null;
          field_w = null;
          field_s = null;
          return;
        }
        field_w = null;
        field_s = null;
    }

    ap(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, ua.field_a);
        this.field_x = 0;
        this.field_o = false;
        this.field_F = false;
        this.field_H = false;
        this.field_G = 8;
        this.field_y = false;
        this.field_t = false;
        this.field_v = 8;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, boolean param5, boolean param6, boolean param7) {
        boolean stackIn_6_1 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_16_1 = false;
        int stackIn_19_1 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_1 = 0;
        boolean stackIn_30_1 = false;
        int[] stackIn_44_1 = null;
        int stackIn_48_1 = 0;
        boolean stackIn_52_1 = false;
        boolean stackIn_56_1 = false;
        boolean stackIn_63_1 = false;
        int stackIn_66_1 = 0;
        int stackIn_69_1 = 0;
        int stackIn_72_1 = 0;
        boolean stackIn_77_1 = false;
        int[] stackIn_91_1 = null;
        int stackIn_95_1 = 0;
        boolean stackIn_99_1 = false;
        boolean stackIn_103_1 = false;
        int stackIn_106_1 = 0;
        int stackIn_109_1 = 0;
        int stackIn_112_1 = 0;
        int[] stackIn_125_1 = null;
        int stackIn_129_1 = 0;
        int[] stackIn_142_1 = null;
        int stackIn_146_1 = 0;
        int[] stackIn_162_1 = null;
        int stackIn_166_1 = 0;
        int[] stackIn_174_1 = null;
        int stackIn_178_1 = 0;
        boolean stackIn_188_1 = false;
        int[] stackIn_196_1 = null;
        int stackIn_200_1 = 0;
        int var10;
        boolean decompiledFrameRemainder2 = true;
        var10 = ZombieDawn.field_J;
        this.field_D = param4;
        this.field_r = param2;
        if (param6) {
          if (3 == param1) {
            stackIn_52_1 = true;
            decompiledFrameRemainder2 = false;
          }
          else {
            if (param1 == 7) {
              this.field_y = true;
              stackIn_6_1 = (5 == param1);
              boolean decompiledFrameRemainder1 = true;
              this.field_t = stackIn_6_1;
              this.field_p = param0;
              if (param6 && (param1 == 6 ||
                param1 == 1)) {
                stackIn_12_1 = true;
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_12_1 = false;
              }
              this.field_o = stackIn_12_1;
              stackIn_16_1 = (param5) && (this.field_r > 0);
              this.field_H = stackIn_16_1;
              if (vi.field_a) {
                stackIn_19_1 = f.field_c;
              } else {
                stackIn_19_1 = ja.field_a;
              }
              this.field_A = stackIn_19_1;
              if (vi.field_a) {
                stackIn_22_1 = mf.field_c;
              } else {
                stackIn_22_1 = cn.field_g;
              }
              this.field_E = stackIn_22_1;
              if (!vi.field_a) {
                stackIn_25_1 = gk.field_G;
              } else {
                stackIn_25_1 = lo.field_m;
              }
              this.field_n = stackIn_25_1;
              this.field_G = 8;
              if (param6 &&
                param1 == 6) {
                stackIn_30_1 = !(param4 <= 0);
                this.field_H = stackIn_30_1;
                this.field_A = this.field_A * 5;
              }
              this.field_v = 8;
              this.field_B = 50;
              this.field_z = 50;
              if (param3 >= -19) {
                this.a((byte) -39);
              }
              if (!param6) {
                if (!param5) {
                  if (dj.field_e.b(-25983)) {
                    stackIn_44_1 = kc.field_Y;
                  } else {
                    stackIn_44_1 = po.field_wb;
                  }
                  this.field_h = stackIn_44_1;
                } else {
                  this.field_h = ua.field_a;
                }
                if (param5) {
                  stackIn_48_1 = 1;
                } else {
                  stackIn_48_1 = 2;
                }
                this.field_x = stackIn_48_1;
              } else {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                } else {
                  if (param1 == 7) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                  }
                }
              }
              this.field_F = this.field_t;
              this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
              return;
            }
          }
        }
        if (decompiledFrameRemainder2) {
          stackIn_52_1 = false;
        }
        this.field_y = stackIn_52_1;
        stackIn_56_1 = (param6) && (5 == param1);
        boolean decompiledFrameRemainder0 = true;
        this.field_t = stackIn_56_1;
        this.field_p = param0;
        if (param6) {
          if (param1 == 6) {
            stackIn_99_1 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            if (param1 == 1) {
              this.field_o = true;
              stackIn_63_1 = (param5) && (this.field_r > 0);
              this.field_H = stackIn_63_1;
              if (vi.field_a) {
                stackIn_66_1 = f.field_c;
              } else {
                stackIn_66_1 = ja.field_a;
              }
              this.field_A = stackIn_66_1;
              if (vi.field_a) {
                stackIn_69_1 = mf.field_c;
              } else {
                stackIn_69_1 = cn.field_g;
              }
              this.field_E = stackIn_69_1;
              if (!vi.field_a) {
                stackIn_72_1 = gk.field_G;
              } else {
                stackIn_72_1 = lo.field_m;
              }
              this.field_n = stackIn_72_1;
              this.field_G = 8;
              if (param6 &&
                param1 == 6) {
                stackIn_77_1 = !(param4 <= 0);
                this.field_H = stackIn_77_1;
                this.field_A = this.field_A * 5;
              }
              this.field_v = 8;
              this.field_B = 50;
              this.field_z = 50;
              if (param3 >= -19) {
                this.a((byte) -39);
              }
              if (!param6) {
                if (!param5) {
                  if (dj.field_e.b(-25983)) {
                    stackIn_91_1 = kc.field_Y;
                  } else {
                    stackIn_91_1 = po.field_wb;
                  }
                  this.field_h = stackIn_91_1;
                } else {
                  this.field_h = ua.field_a;
                }
                if (param5) {
                  stackIn_95_1 = 1;
                } else {
                  stackIn_95_1 = 2;
                }
                this.field_x = stackIn_95_1;
              } else {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                } else {
                  if (param1 == 7) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                  }
                }
              }
              this.field_F = this.field_t;
              this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
              return;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_99_1 = false;
        }
        this.field_o = stackIn_99_1;
        stackIn_103_1 = (param5) && (this.field_r > 0);
        this.field_H = stackIn_103_1;
        if (vi.field_a) {
          stackIn_106_1 = f.field_c;
        } else {
          stackIn_106_1 = ja.field_a;
        }
        this.field_A = stackIn_106_1;
        if (vi.field_a) {
          stackIn_109_1 = mf.field_c;
        } else {
          stackIn_109_1 = cn.field_g;
        }
        this.field_E = stackIn_109_1;
        if (!vi.field_a) {
          stackIn_112_1 = gk.field_G;
        } else {
          stackIn_112_1 = lo.field_m;
        }
        this.field_n = stackIn_112_1;
        this.field_G = 8;
        if (!param6) {
          this.field_v = 8;
          this.field_B = 50;
          this.field_z = 50;
          if (param3 < -19) {
            if (!param6) {
              if (!param5) {
                if (dj.field_e.b(-25983)) {
                  stackIn_125_1 = kc.field_Y;
                } else {
                  stackIn_125_1 = po.field_wb;
                }
                this.field_h = stackIn_125_1;
              } else {
                this.field_h = ua.field_a;
              }
              if (param5) {
                stackIn_129_1 = 1;
              } else {
                stackIn_129_1 = 2;
              }
              this.field_x = stackIn_129_1;
            } else {
              this.field_x = -1;
              this.field_h = ua.field_a;
              if (3 == param1) {
                this.field_q = 1;
                this.field_h = fe.field_G;
              } else {
                if (param1 == 7) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                }
              }
            }
          } else {
            this.a((byte) -39);
            if (!param6) {
              if (!param5) {
                if (dj.field_e.b(-25983)) {
                  stackIn_142_1 = kc.field_Y;
                } else {
                  stackIn_142_1 = po.field_wb;
                }
                this.field_h = stackIn_142_1;
              } else {
                this.field_h = ua.field_a;
              }
              if (param5) {
                stackIn_146_1 = 1;
              } else {
                stackIn_146_1 = 2;
              }
              this.field_x = stackIn_146_1;
            } else {
              this.field_x = -1;
              this.field_h = ua.field_a;
              if (3 == param1) {
                this.field_q = 1;
                this.field_h = fe.field_G;
              } else {
                if (param1 == 7) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                }
              }
            }
          }
        } else {
          if (param1 == 6) {
            stackIn_188_1 = !(param4 <= 0);
            this.field_H = stackIn_188_1;
            this.field_A = this.field_A * 5;
            this.field_v = 8;
            this.field_B = 50;
            this.field_z = 50;
            if (param3 >= -19) {
              this.a((byte) -39);
            }
            if (param6) {
              this.field_x = -1;
              this.field_h = ua.field_a;
              if (3 == param1) {
                this.field_q = 1;
                this.field_h = fe.field_G;
              } else {
                if (param1 == 7) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                }
              }
            } else {
              if (!param5) {
                if (dj.field_e.b(-25983)) {
                  stackIn_196_1 = kc.field_Y;
                } else {
                  stackIn_196_1 = po.field_wb;
                }
                this.field_h = stackIn_196_1;
              } else {
                this.field_h = ua.field_a;
              }
              if (param5) {
                stackIn_200_1 = 1;
              } else {
                stackIn_200_1 = 2;
              }
              this.field_x = stackIn_200_1;
            }
          } else {
            this.field_v = 8;
            this.field_B = 50;
            this.field_z = 50;
            if (param3 >= -19) {
              this.a((byte) -39);
              if (!param6) {
                if (!param5) {
                  if (dj.field_e.b(-25983)) {
                    stackIn_162_1 = kc.field_Y;
                  } else {
                    stackIn_162_1 = po.field_wb;
                  }
                  this.field_h = stackIn_162_1;
                } else {
                  this.field_h = ua.field_a;
                }
                if (param5) {
                  stackIn_166_1 = 1;
                } else {
                  stackIn_166_1 = 2;
                }
                this.field_x = stackIn_166_1;
              } else {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                } else {
                  if (param1 == 7) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                  }
                }
              }
            } else {
              if (param6) {
                this.field_x = -1;
                this.field_h = ua.field_a;
                if (3 == param1) {
                  this.field_q = 1;
                  this.field_h = fe.field_G;
                } else {
                  if (param1 == 7) {
                    this.field_q = 1;
                    this.field_h = fe.field_G;
                  }
                }
              } else {
                if (!param5) {
                  if (dj.field_e.b(-25983)) {
                    stackIn_174_1 = kc.field_Y;
                  } else {
                    stackIn_174_1 = po.field_wb;
                  }
                  this.field_h = stackIn_174_1;
                } else {
                  this.field_h = ua.field_a;
                }
                if (param5) {
                  stackIn_178_1 = 1;
                } else {
                  stackIn_178_1 = 2;
                }
                this.field_x = stackIn_178_1;
              }
            }
          }
        }
        this.field_F = this.field_t;
        this.field_b.a(this.b(true, ha.field_b, ei.field_K), true, -20258);
    }

    private final String d(byte param0) {
        int var2 = this.field_r / 60;
        int var3 = 123 % ((param0 - 44) / 37);
        int var4 = this.field_r % 60;
        return var2 + ":" + (var4 >= 10 ? "" : "0") + var4;
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        int var5;
        int var6;
        hi var7;
        hi var9;
        hi var10;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = ZombieDawn.field_J;
        super.a((byte) -104, param1);
        var3 = 121 / ((-39 - param0) / 61);
        if (this.field_F) {
          if (this.field_b.field_d == 0) {
            if (this.field_h[0] != 39) {
              if (2 == this.field_x) {
                return;
              }
              fieldTemp$5 = this.field_B - 1;
              this.field_B = this.field_B - 1;
              if (fieldTemp$5 > 0) {
                return;
              }
              if (!this.field_y) {
                if (0 < this.field_D &&
                  !this.field_t) {
                  this.field_z = this.field_z + 1;
                  this.field_G = 9;
                  this.field_p = this.field_p + this.field_A;
                  this.field_D = this.field_D - 1;
                  this.field_B = 500 / this.field_z;
                  if (this.field_B < 2) {
                    this.field_B = 2;
                  }
                  if (this.field_D != 0) {
                    if (!this.field_y) {
                      kh.a(58, false);
                      return;
                    }
                    if (this.field_D < 9999999) {
                      kh.a(58, false);
                      return;
                    }
                  }
                  this.field_G = 8;
                  this.field_B = 50;
                  if (this.field_H) {
                    kh.a(58, false);
                    return;
                  }
                  tp.a(123, false, w.field_a[6]);
                  kh.a(58, false);
                  return;
                }
                if (this.field_r <= 0) {
                  this.field_v = 8;
                  return;
                }
                if (!this.field_H) {
                  this.field_v = 8;
                  return;
                }
                this.field_v = 9;
                this.field_p = this.field_p + this.field_E;
                this.field_B = 2;
                this.field_r = this.field_r - 2;
                if (this.field_r <= 0) {
                  this.field_r = 0;
                  tp.a(85, false, w.field_a[6]);
                }
                kh.a(57, false).h(3 * ge.field_c >> 3);
                return;
              }
              if (this.field_D < 9999999) {
                this.field_D = this.field_D + this.field_q;
                if (this.field_D >= 9999999) {
                  this.field_p = this.field_p + this.field_n;
                  this.field_D = 9999999;
                }
                this.field_q = this.field_q + (1 + (this.field_q >> 4));
                kh.a(58, false);
              }
              this.field_B = 2;
              return;
            }
            this.field_b.b(1, -123);
          }
          if (2 == this.field_x) {
            return;
          }
          fieldTemp$6 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$6 > 0) {
            return;
          }
          if (this.field_y) {
            if (this.field_D < 9999999) {
              this.field_D = this.field_D + this.field_q;
              if (this.field_D >= 9999999) {
                this.field_p = this.field_p + this.field_n;
                this.field_D = 9999999;
              }
              this.field_q = this.field_q + (1 + (this.field_q >> 4));
              kh.a(58, false);
            }
            this.field_B = 2;
            return;
          }
          if (0 < this.field_D &&
            !this.field_t) {
            this.field_z = this.field_z + 1;
            this.field_G = 9;
            this.field_p = this.field_p + this.field_A;
            this.field_D = this.field_D - 1;
            this.field_B = 500 / this.field_z;
            if (this.field_B < 2) {
              this.field_B = 2;
            }
            if (this.field_D == 0 ||
              this.field_y &&
              this.field_D >= 9999999) {
              this.field_G = 8;
              this.field_B = 50;
              if (!this.field_H) {
                tp.a(123, false, w.field_a[6]);
              }
            }
            kh.a(58, false);
            return;
          }
          if (this.field_r <= 0) {
            this.field_v = 8;
          } else {
            if (!this.field_H) {
              this.field_v = 8;
            } else {
              this.field_v = 9;
              this.field_p = this.field_p + this.field_E;
              this.field_B = 2;
              this.field_r = this.field_r - 2;
              if (this.field_r <= 0) {
                this.field_r = 0;
                tp.a(85, false, w.field_a[6]);
              }
              kh.a(57, false).h(3 * ge.field_c >> 3);
            }
          }
          return;
        }
        if (this.field_y) {
          var7 = dj.field_e;
          var5 = this.field_n;
          var7.field_eb = var7.field_eb + (var5 << 8);
          var7.field_G = var7.field_G + var5;
          var7.field_g = var7.field_g - var5 * var7.field_K;
          var7.field_l = var7.field_l + var5;
          var7.h(1);
          this.field_F = true;
          if (this.field_b.field_d == 0) {
            if (this.field_h[0] != 39) {
              if (2 == this.field_x) {
                return;
              }
              fieldTemp$3 = this.field_B - 1;
              this.field_B = this.field_B - 1;
              if (fieldTemp$3 > 0) {
                return;
              }
              if (this.field_y) {
                if (this.field_D < 9999999) {
                  this.field_D = this.field_D + this.field_q;
                  if (this.field_D >= 9999999) {
                    this.field_p = this.field_p + this.field_n;
                    this.field_D = 9999999;
                  }
                  this.field_q = this.field_q + (1 + (this.field_q >> 4));
                  kh.a(58, false);
                }
                this.field_B = 2;
                return;
              }
              if (0 >= this.field_D) {
                if (this.field_r <= 0) {
                  this.field_v = 8;
                } else {
                  if (!this.field_H) {
                    this.field_v = 8;
                  } else {
                    this.field_v = 9;
                    this.field_p = this.field_p + this.field_E;
                    this.field_B = 2;
                    this.field_r = this.field_r - 2;
                    if (this.field_r <= 0) {
                      this.field_r = 0;
                      tp.a(85, false, w.field_a[6]);
                    }
                    kh.a(57, false).h(3 * ge.field_c >> 3);
                  }
                }
                return;
              }
              if (this.field_t) {
                if (this.field_r <= 0) {
                  this.field_v = 8;
                } else {
                  if (!this.field_H) {
                    this.field_v = 8;
                  } else {
                    this.field_v = 9;
                    this.field_p = this.field_p + this.field_E;
                    this.field_B = 2;
                    this.field_r = this.field_r - 2;
                    if (this.field_r <= 0) {
                      this.field_r = 0;
                      tp.a(85, false, w.field_a[6]);
                    }
                    kh.a(57, false).h(3 * ge.field_c >> 3);
                  }
                }
                return;
              }
              this.field_z = this.field_z + 1;
              this.field_G = 9;
              this.field_p = this.field_p + this.field_A;
              this.field_D = this.field_D - 1;
              this.field_B = 500 / this.field_z;
              if (this.field_B < 2) {
                this.field_B = 2;
              }
              if (this.field_D == 0 ||
                this.field_y &&
                this.field_D >= 9999999) {
                this.field_G = 8;
                this.field_B = 50;
                if (!this.field_H) {
                  tp.a(123, false, w.field_a[6]);
                }
              }
              kh.a(58, false);
              return;
            }
            this.field_b.b(1, -123);
          }
          if (2 == this.field_x) {
            return;
          }
          fieldTemp$4 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$4 > 0) {
            return;
          }
          if (this.field_y) {
            if (this.field_D < 9999999) {
              this.field_D = this.field_D + this.field_q;
              if (this.field_D >= 9999999) {
                this.field_p = this.field_p + this.field_n;
                this.field_D = 9999999;
              }
              this.field_q = this.field_q + (1 + (this.field_q >> 4));
              kh.a(58, false);
            }
            this.field_B = 2;
            return;
          }
          if (0 < this.field_D &&
            !this.field_t) {
            this.field_z = this.field_z + 1;
            this.field_G = 9;
            this.field_p = this.field_p + this.field_A;
            this.field_D = this.field_D - 1;
            this.field_B = 500 / this.field_z;
            if (this.field_B < 2) {
              this.field_B = 2;
            }
            if (this.field_D == 0 ||
              this.field_y &&
              this.field_D >= 9999999) {
              this.field_G = 8;
              this.field_B = 50;
              if (!this.field_H) {
                tp.a(123, false, w.field_a[6]);
              }
            }
            kh.a(58, false);
            return;
          }
          if (this.field_r <= 0) {
            this.field_v = 8;
          } else {
            if (!this.field_H) {
              this.field_v = 8;
            } else {
              this.field_v = 9;
              this.field_p = this.field_p + this.field_E;
              this.field_B = 2;
              this.field_r = this.field_r - 2;
              if (this.field_r <= 0) {
                this.field_r = 0;
                tp.a(85, false, w.field_a[6]);
              }
              kh.a(57, false).h(3 * ge.field_c >> 3);
            }
          }
          return;
        }
        if (1 == this.field_x) {
          var9 = dj.field_e;
          var5Lifetime1 = (this.field_r + 1) / 2 * this.field_E + this.field_D * this.field_A;
          var9.field_eb = var9.field_eb + (var5Lifetime1 << 8);
          var9.field_g = var9.field_g - var9.field_K * var5Lifetime1;
          var9.field_l = var9.field_l + var5Lifetime1;
          var9.field_G = var9.field_G + var5Lifetime1;
          var9.h(1);
          this.field_F = true;
          if (this.field_b.field_d == 0 &&
            this.field_h[0] == 39) {
            this.field_b.b(1, -123);
          }
          if (2 == this.field_x) {
            return;
          }
          fieldTemp$2 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$2 > 0) {
            return;
          }
          if (!this.field_y) {
            if (0 < this.field_D &&
              !this.field_t) {
              this.field_z = this.field_z + 1;
              this.field_G = 9;
              this.field_p = this.field_p + this.field_A;
              this.field_D = this.field_D - 1;
              this.field_B = 500 / this.field_z;
              if (this.field_B < 2) {
                this.field_B = 2;
              }
              if (this.field_D != 0) {
                if (!this.field_y) {
                  kh.a(58, false);
                  return;
                }
                if (this.field_D < 9999999) {
                  kh.a(58, false);
                  return;
                }
              }
              this.field_G = 8;
              this.field_B = 50;
              if (this.field_H) {
                kh.a(58, false);
                return;
              }
              tp.a(123, false, w.field_a[6]);
              kh.a(58, false);
              return;
            }
            if (this.field_r <= 0) {
              this.field_v = 8;
              return;
            }
            if (!this.field_H) {
              this.field_v = 8;
              return;
            }
            this.field_v = 9;
            this.field_p = this.field_p + this.field_E;
            this.field_B = 2;
            this.field_r = this.field_r - 2;
            if (this.field_r <= 0) {
              this.field_r = 0;
              tp.a(85, false, w.field_a[6]);
            }
            kh.a(57, false).h(3 * ge.field_c >> 3);
            return;
          }
          if (this.field_D < 9999999) {
            this.field_D = this.field_D + this.field_q;
            if (this.field_D >= 9999999) {
              this.field_p = this.field_p + this.field_n;
              this.field_D = 9999999;
            }
            this.field_q = this.field_q + (1 + (this.field_q >> 4));
            kh.a(58, false);
          }
          this.field_B = 2;
          return;
        }
        if (this.field_x != -1) {
          this.field_F = true;
          if (this.field_b.field_d == 0 &&
            this.field_h[0] == 39) {
            this.field_b.b(1, -123);
          }
          if (2 == this.field_x) {
            return;
          }
          fieldTemp$0 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          if (!this.field_y) {
            if (0 < this.field_D &&
              !this.field_t) {
              this.field_z = this.field_z + 1;
              this.field_G = 9;
              this.field_p = this.field_p + this.field_A;
              this.field_D = this.field_D - 1;
              this.field_B = 500 / this.field_z;
              if (this.field_B < 2) {
                this.field_B = 2;
              }
              if (this.field_D != 0) {
                if (!this.field_y) {
                  kh.a(58, false);
                  return;
                }
                if (this.field_D < 9999999) {
                  kh.a(58, false);
                  return;
                }
              }
              this.field_G = 8;
              this.field_B = 50;
              if (this.field_H) {
                kh.a(58, false);
                return;
              }
              tp.a(123, false, w.field_a[6]);
              kh.a(58, false);
              return;
            }
            if (this.field_r <= 0) {
              this.field_v = 8;
              return;
            }
            if (!this.field_H) {
              this.field_v = 8;
              return;
            }
            this.field_v = 9;
            this.field_p = this.field_p + this.field_E;
            this.field_B = 2;
            this.field_r = this.field_r - 2;
            if (this.field_r <= 0) {
              this.field_r = 0;
              tp.a(85, false, w.field_a[6]);
            }
            kh.a(57, false).h(3 * ge.field_c >> 3);
            return;
          }
          if (this.field_D < 9999999) {
            this.field_D = this.field_D + this.field_q;
            if (this.field_D >= 9999999) {
              this.field_p = this.field_p + this.field_n;
              this.field_D = 9999999;
            }
            this.field_q = this.field_q + (1 + (this.field_q >> 4));
            kh.a(58, false);
          }
          this.field_B = 2;
          return;
        }
        var10 = dj.field_e;
        var5Lifetime2 = (this.field_r + 1) / 2 * this.field_E + this.field_D * this.field_A;
        var10.field_eb = var10.field_eb + (var5Lifetime2 << 8);
        var10.field_g = var10.field_g - var10.field_K * var5Lifetime2;
        var10.field_l = var10.field_l + var5Lifetime2;
        var10.field_G = var10.field_G + var5Lifetime2;
        var10.h(1);
        this.field_F = true;
        if (this.field_b.field_d == 0 &&
          this.field_h[0] == 39) {
          this.field_b.b(1, -123);
        }
        if (2 == this.field_x) {
          return;
        }
        fieldTemp$1 = this.field_B - 1;
        this.field_B = this.field_B - 1;
        if (fieldTemp$1 > 0) {
          return;
        }
        if (!this.field_y) {
          if (0 < this.field_D &&
            !this.field_t) {
            this.field_z = this.field_z + 1;
            this.field_G = 9;
            this.field_p = this.field_p + this.field_A;
            this.field_D = this.field_D - 1;
            this.field_B = 500 / this.field_z;
            if (this.field_B < 2) {
              this.field_B = 2;
            }
            if (this.field_D != 0) {
              if (!this.field_y) {
                kh.a(58, false);
                return;
              }
              if (this.field_D < 9999999) {
                kh.a(58, false);
                return;
              }
            }
            this.field_G = 8;
            this.field_B = 50;
            if (this.field_H) {
              kh.a(58, false);
              return;
            }
            tp.a(123, false, w.field_a[6]);
            kh.a(58, false);
            return;
          }
          if (this.field_r <= 0) {
            this.field_v = 8;
            return;
          }
          if (!this.field_H) {
            this.field_v = 8;
            return;
          }
          this.field_v = 9;
          this.field_p = this.field_p + this.field_E;
          this.field_B = 2;
          this.field_r = this.field_r - 2;
          if (this.field_r <= 0) {
            this.field_r = 0;
            tp.a(85, false, w.field_a[6]);
          }
          kh.a(57, false).h(3 * ge.field_c >> 3);
          return;
        }
        if (this.field_D < 9999999) {
          this.field_D = this.field_D + this.field_q;
          if (this.field_D >= 9999999) {
            this.field_p = this.field_p + this.field_n;
            this.field_D = 9999999;
          }
          this.field_q = this.field_q + (1 + (this.field_q >> 4));
          kh.a(58, false);
        }
        this.field_B = 2;
        return;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        Object var6;
        String var7;
        String var8;
        String var9;
        String var10;
        String var11;
        String var14;
        String var15;
        super.a((byte) -91);
        var2 = 8;
        var3 = 0;
        var4 = sg.field_jb.field_x + sg.field_jb.field_I;
        var5 = id.field_M + 94;
        var6 = null;
        if (this.field_x == 1) {
          var8 = ud.field_a;
          if (var8 == null) {
            return;
          }
          var5 = var5 + (var4 * (1 + sg.field_jb.a(var8, vh.field_b + 40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
          if (param0 >= -35) {
            this.field_r = -90;
          }
          if (var5 < 205) {
            var5 = 205;
          }
          var7 = gj.field_c;
          if (this.field_o) {
            var7 = sa.field_bb;
          } else {
            if (this.field_t) {
              var7 = kn.field_I;
            }
          }
          sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
        } else {
          if (this.field_x == 2) {
            var9 = fm.field_I;
            if (var9 == null) {
              return;
            }
            var5 = var5 + (var4 * (1 + sg.field_jb.a(var9, vh.field_b + 40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
            if (param0 >= -35) {
              this.field_r = -90;
            }
            if (var5 < 205) {
              var5 = 205;
            }
            var7 = gj.field_c;
            if (this.field_o) {
              var7 = sa.field_bb;
            } else {
              if (this.field_t) {
                var7 = kn.field_I;
              }
            }
            sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
          } else {
            if (this.field_x == -1) {
              if (vl.field_b.f(-107) != 27) {
                var10 = tc.field_u;
                if (var10 == null) {
                  return;
                }
                var5 = var5 + (var4 * (1 + sg.field_jb.a(var10, vh.field_b + 40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
                sharedTailExit_1: {
                  if (param0 < -35) {
                    if (var5 < 205) {
                      var5 = 205;
                    }
                    var7 = gj.field_c;
                    if (this.field_o) {
                      var7 = sa.field_bb;
                    } else {
                      if (this.field_t) {
                        var7 = kn.field_I;
                      }
                    }
                  } else {
                    this.field_r = -90;
                    if (var5 < 205) {
                      var5 = 205;
                    }
                    var11 = gj.field_c;
                    if (this.field_o) {
                      var7 = sa.field_bb;
                    } else {
                      if (!this.field_t) {
                        sg.field_jb.b(var11, vh.field_b + 350, var5, this.field_G, var3);
                        break sharedTailExit_1;
                      }
                      var7 = kn.field_I;
                    }
                  }
                  sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
                }
                sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                var5 = var5 + (var4 + 5);
                if (this.field_H) {
                  sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                  sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                }
                sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M + 340, var2, var3);
                sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                return;
              }
              var6 = hb.field_D[vl.field_b.field_bb];
            }
            if (var6 == null) {
              return;
            }
            var5 = var5 + (var4 * (1 + sg.field_jb.a((String) (var6), vh.field_b + 40, var5, 560, 240, var2, var3, 1, 0, 30)) - 5);
            if (param0 >= -35) {
              this.field_r = -90;
              if (var5 < 205) {
                var5 = 205;
              }
              var7 = gj.field_c;
              boolean decompiledFrameRemainder0 = true;
              if (this.field_o) {
                var7 = sa.field_bb;
              } else {
                if (this.field_t) {
                  var14 = kn.field_I;
                  sg.field_jb.b(var14, vh.field_b + 350, var5, this.field_G, var3);
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
              }
            } else {
              if (var5 < 205) {
                var5 = 205;
              }
              var7 = gj.field_c;
              if (this.field_o) {
                var7 = sa.field_bb;
              } else {
                if (this.field_t) {
                  var15 = kn.field_I;
                  sg.field_jb.b(var15, vh.field_b + 350, var5, this.field_G, var3);
                  sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
                  var5 = var5 + (var4 + 5);
                  if (this.field_H) {
                    sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
                    sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
                  }
                  sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M + 340, var2, var3);
                  sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
                  return;
                }
              }
              sg.field_jb.b(var7, vh.field_b + 350, var5, this.field_G, var3);
            }
          }
        }
        sg.field_jb.c(Integer.toString(this.field_D), 370 + vh.field_b, var5, this.field_G, var3);
        var5 = var5 + (var4 + 5);
        if (this.field_H) {
          sg.field_jb.b(hp.field_y, 350 + vh.field_b, var5, this.field_v, var3);
          sg.field_jb.c(this.d((byte) -99), 370 + vh.field_b, var5, this.field_v, var3);
        }
        sg.field_jb.b(aj.field_d, vh.field_b + 350, id.field_M + 340, var2, var3);
        sg.field_jb.c(qi.a(true, 0, jp.field_a, (long)this.field_p, (byte) 113), 370 + vh.field_b, 340 + id.field_M, var2, var3);
    }

    final void b(byte param0) {
        vn[] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        vn[] stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        vn[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        vn[] stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 >= 105) {
          if (640 != bd.field_e) {
            stackIn_18_0 = qk.field_Hb;
            stackIn_19_1 = (2 != this.field_x) ? 2 : 3;
            ((vn) (Object) stackIn_18_0[stackIn_19_1]).a(0, 0, bd.field_e, nh.field_P);
          } else {
            if (nh.field_P == 480) {
              if (this.field_x == 2) {
                qk.field_Hb[3].e(0, 0);
              } else {
                qk.field_Hb[2].e(0, 0);
              }
            } else {
              stackIn_23_0 = qk.field_Hb;
              stackIn_24_1 = (2 != this.field_x) ? 2 : 3;
              ((vn) (Object) stackIn_23_0[stackIn_24_1]).a(0, 0, bd.field_e, nh.field_P);
            }
          }
        } else {
          this.a((byte) 101);
          if (640 != bd.field_e) {
            stackIn_4_0 = qk.field_Hb;
            stackIn_5_1 = (2 != this.field_x) ? 2 : 3;
            ((vn) (Object) stackIn_4_0[stackIn_5_1]).a(0, 0, bd.field_e, nh.field_P);
          } else {
            if (nh.field_P == 480) {
              if (this.field_x != 2) {
                qk.field_Hb[2].e(0, 0);
              } else {
                qk.field_Hb[3].e(0, 0);
              }
            } else {
              stackIn_9_0 = qk.field_Hb;
              stackIn_10_1 = (2 != this.field_x) ? 2 : 3;
              ((vn) (Object) stackIn_9_0[stackIn_10_1]).a(0, 0, bd.field_e, nh.field_P);
            }
          }
        }
    }

    static {
        field_s = "Accept";
        field_w = "Loading levels";
    }
}
