/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private int field_a;
    private int field_r;
    private int field_m;
    private int field_i;
    private int field_l;
    private int field_f;
    private int field_k;
    private int field_q;
    static String field_j;
    private boolean field_e;
    private int field_h;
    private static String[] field_p;
    private int field_o;
    private int field_b;
    boolean field_d;
    private int field_g;
    private int field_c;
    private int field_n;

    final static void a(byte param0) {
        if (param0 != 5) {
          field_j = (String) null;
          al.field_g = new vna();
          return;
        }
        al.field_g = new vna();
    }

    private final boolean c(int param0) {
        if (this.field_n < this.field_c) {
          return false;
        }
        if (this.field_m > this.field_i) {
          return false;
        }
        if (this.field_r < this.field_n) {
          return false;
        }
        if (this.field_o < this.field_i) {
          return false;
        }
        if (param0 == 17973) {
          return true;
        }
        return false;
    }

    final int b(int param0) {
        if (param0 != 2) {
          this.field_h = -59;
          return this.field_i;
        }
        return this.field_i;
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        if (param0 >= 98) {
          if (this.field_d) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_k > this.field_g) {
            decompiledFrameRemainder1 = (this.field_f != this.field_i);
            if (decompiledFrameRemainder1) {
              this.field_g = this.field_g + this.field_h;
              this.field_i = this.field_i + this.field_b;
            }
          } else {
            decompiledFrameRemainder1 = (this.field_n != this.field_a);
            if (decompiledFrameRemainder1) {
              this.field_n = this.field_n + this.field_q;
              this.field_k = this.field_k + this.field_l;
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.field_e) {
              return;
            }
            if (this.c(17973)) {
              return;
            }
          }
          this.field_d = true;
          return;
        }
        discarded$0 = this.c(-119);
        if (this.field_d) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_k > this.field_g) {
          decompiledFrameRemainder0 = (this.field_f != this.field_i);
          if (decompiledFrameRemainder0) {
            this.field_g = this.field_g + this.field_h;
            this.field_i = this.field_i + this.field_b;
          }
        } else {
          decompiledFrameRemainder0 = (this.field_n != this.field_a);
          if (decompiledFrameRemainder0) {
            this.field_n = this.field_n + this.field_q;
            this.field_k = this.field_k + this.field_l;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_e) {
            return;
          }
          if (this.c(17973)) {
            return;
          }
        }
        this.field_d = true;
        return;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int stackIn_5_1 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_18_0;
        int stackIn_18_3;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackIn_35_0;
        int stackIn_35_3;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_56_0;
        int stackIn_56_3;
        var17 = TombRacer.field_G ? 1 : 0;
        this.field_r = param3;
        if (param6 > param5) {
          stackIn_5_1 = 1;
        } else {
          if (param6 < param5) {
            stackIn_5_1 = -1;
          } else {
            stackIn_5_1 = 0;
          }
        }
        this.field_b = stackIn_5_1;
        this.field_f = param6 / param2;
        this.field_o = param8;
        this.field_a = param7 / param2;
        this.field_m = param0;
        this.field_n = param4 / param2;
        this.field_i = param5 / param2;
        if (param4 >= param7) {
          if (param7 >= param4) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = -1;
          }
        } else {
          stackIn_10_1 = 1;
        }
        this.field_q = stackIn_10_1;
        this.field_c = param9;
        var11 = ua.a(param7 - param4, 47);
        var12 = ua.a(param6 - param5, 28);
        var13 = param2 * this.field_n;
        var14 = param2 + var13;
        var15 = this.field_i * param2;
        var16 = param2 + var15;
        if (var11 <= 0) {
          this.field_l = 0;
          this.field_k = 2147483647;
          if (var12 <= 0) {
            this.field_g = 2147483647;
            this.field_h = 0;
          } else {
            if (this.field_i == this.field_f) {
              this.field_g = 2147483647;
              this.field_h = 0;
            } else {
              stackIn_17_1 = var12;
              stackIn_17_2 = -28970;
              if (this.field_i > this.field_f) {
                stackIn_18_0 = this;
                stackIn_18_3 = param5 - var15;
              } else {
                stackIn_18_0 = this;
                stackIn_18_3 = -param5 + var16;
              }
              this.field_g = bs.a(stackIn_17_1, stackIn_17_2, stackIn_18_3);
              this.field_h = bs.a(var12, -28970, param2);
            }
          }
          this.field_e = true;
          this.field_d = false;
          while (!this.field_d) {
            if (!this.c(17973)) {
              this.d(121);
              continue;
            }
            break;
          }
          this.field_e = false;
          if (param1 != 7) {
            this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
          }
          return;
        }
        if (this.field_n == this.field_a) {
          this.field_l = 0;
          this.field_k = 2147483647;
          if (var12 <= 0) {
            this.field_g = 2147483647;
            this.field_h = 0;
          } else {
            if (this.field_i == this.field_f) {
              this.field_g = 2147483647;
              this.field_h = 0;
            } else {
              stackIn_34_1 = var12;
              stackIn_34_2 = -28970;
              if (this.field_i > this.field_f) {
                stackIn_35_0 = this;
                stackIn_35_3 = param5 - var15;
              } else {
                stackIn_35_0 = this;
                stackIn_35_3 = -param5 + var16;
              }
              this.field_g = bs.a(stackIn_34_1, stackIn_34_2, stackIn_35_3);
              this.field_h = bs.a(var12, -28970, param2);
            }
          }
          this.field_e = true;
          this.field_d = false;
          while (!this.field_d) {
            if (!this.c(17973)) {
              this.d(121);
              continue;
            }
            break;
          }
          this.field_e = false;
          if (param1 != 7) {
            this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
          }
          return;
        }
        stackIn_50_1 = var11;
        stackIn_50_2 = param1 ^ -28975;
        if (this.field_n > this.field_a) {
          stackIn_51_3 = -var13 + param4;
        } else {
          stackIn_51_3 = -param4 + var14;
        }
        this.field_k = bs.a(stackIn_50_1, stackIn_50_2, stackIn_51_3);
        this.field_l = bs.a(var11, -28970, param2);
        if (var12 <= 0) {
          this.field_g = 2147483647;
          this.field_h = 0;
          this.field_e = true;
          this.field_d = false;
          while (!this.field_d) {
            if (!this.c(17973)) {
              this.d(121);
              continue;
            }
            break;
          }
        } else {
          if (this.field_i == this.field_f) {
            this.field_g = 2147483647;
            this.field_h = 0;
            this.field_e = true;
            this.field_d = false;
            while (!this.field_d) {
              if (!this.c(17973)) {
                this.d(121);
                continue;
              }
              break;
            }
          } else {
            stackIn_55_1 = var12;
            stackIn_55_2 = -28970;
            if (this.field_i > this.field_f) {
              stackIn_56_0 = this;
              stackIn_56_3 = param5 - var15;
            } else {
              stackIn_56_0 = this;
              stackIn_56_3 = -param5 + var16;
            }
            this.field_g = bs.a(stackIn_55_1, stackIn_55_2, stackIn_56_3);
            this.field_h = bs.a(var12, -28970, param2);
            this.field_e = true;
            this.field_d = false;
            while (!this.field_d) {
              if (!this.c(17973)) {
                this.d(121);
                continue;
              }
              break;
            }
          }
        }
        this.field_e = false;
        if (param1 == 7) {
          return;
        }
        this.a(39, (byte) -58, -65, -8, -39, 28, -20, -89, -15, -1);
    }

    final int b(byte param0) {
        if (param0 != 75) {
          this.field_k = -47;
          return this.field_n;
        }
        return this.field_n;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (-param0 + param3 < pka.field_b) {
          ov.a(param4, param0, param1, false, param2, param5, param3);
        } else {
          if (ss.field_c < param0 + param3) {
            ov.a(param4, param0, param1, false, param2, param5, param3);
          } else {
            if (gca.field_d > -param0 + param1) {
              ov.a(param4, param0, param1, false, param2, param5, param3);
            } else {
              if (param1 + param0 <= hc.field_h) {
                vsa.a(param1, param0, 0, param5, param2, param4, param3);
              } else {
                ov.a(param4, param0, param1, false, param2, param5, param3);
              }
            }
          }
        }
        if (param6 <= -67) {
          return;
        }
        field_p = (String[]) null;
    }

    public static void a(int param0) {
        field_p = null;
        field_j = null;
        if (param0 != -25802) {
          nf.a(-39, -25, -55, -64, -108, -100, 117);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.a(param5, (byte) 7, param3, param6 - 1, param4, param1, param7, param0, -1 + param2, 0);
    }

    static {
        field_j = "OK";
        field_p = new String[2];
        field_p[1] = "Key";
        field_p[0] = "Coin";
    }
}
