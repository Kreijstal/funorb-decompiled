/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg extends gg {
    static pa field_k;
    private int field_o;
    private int field_r;
    private int field_t;
    static Object field_l;
    private int field_n;
    static int[] field_j;
    private byte[] field_s;
    private int field_p;
    private int field_u;
    private int field_m;
    private int field_q;

    public static void c(byte param0) {
        if (param0 > -18) {
            return;
        }
        field_l = null;
        field_j = null;
        field_k = null;
    }

    final void a(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        this.field_p = this.field_r;
        this.field_t = this.field_t >> 4;
        if ((this.field_t ^ -1) <= -1) {
          if (this.field_t <= 255) {
            fieldTemp$3 = this.field_u;
            this.field_u = this.field_u + 1;
            this.b(fieldTemp$3, param0 + -1, (byte)this.field_t);
            this.field_t = param0;
            return;
          } else {
            this.field_t = 255;
            fieldTemp$4 = this.field_u;
            this.field_u = this.field_u + 1;
            this.b(fieldTemp$4, param0 + -1, (byte)this.field_t);
            this.field_t = param0;
            return;
          }
        } else {
          this.field_t = 0;
          fieldTemp$5 = this.field_u;
          this.field_u = this.field_u + 1;
          this.b(fieldTemp$5, param0 + -1, (byte)this.field_t);
          this.field_t = param0;
          return;
        }
    }

    void b(int param0, int param1, byte param2) {
        this.field_s[param0] = (byte)param2;
        if (param1 != -1) {
            this.field_o = 29;
        }
    }

    final void c(int param0) {
        this.field_u = 0;
        if (param0 != -30042) {
            return;
        }
        this.field_t = 0;
    }

    final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 0) {
          L0: {
            stackOut_24_0 = this;
            stackIn_26_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (param1 >= 0) {
              stackOut_26_0 = this;
              stackOut_26_1 = param1;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              break L0;
            } else {
              stackOut_25_0 = this;
              stackOut_25_1 = -param1;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              break L0;
            }
          }
          ((lg) (this)).field_n = -stackIn_27_1 + this.field_m;
          this.field_q = 4096;
          this.field_n = this.field_n * this.field_n >> 1051823372;
          this.field_t = this.field_n;
          if (param2 < 107) {
            lg.c((byte) -61);
            return;
          } else {
            return;
          }
        } else {
          this.field_q = this.field_n * this.field_o >> -838056372;
          if ((this.field_q ^ -1) > -1) {
            L1: {
              this.field_q = 0;
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((param1 ^ -1) <= -1) {
                stackOut_19_0 = this;
                stackOut_19_1 = param1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L1;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = -param1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L1;
              }
            }
            ((lg) (this)).field_n = -stackIn_20_1 + this.field_m;
            this.field_n = this.field_n * this.field_n >> -736534868;
            this.field_n = this.field_q * this.field_n >> 826305964;
            this.field_t = this.field_t + (this.field_p * this.field_n >> 165503148);
            this.field_p = this.field_p * this.field_r >> 303118604;
            if (param2 < 107) {
              lg.c((byte) -61);
              return;
            } else {
              return;
            }
          } else {
            if (-4097 > (this.field_q ^ -1)) {
              L2: {
                this.field_q = 4096;
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if ((param1 ^ -1) <= -1) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = param1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = -param1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L2;
                }
              }
              ((lg) (this)).field_n = -stackIn_13_1 + this.field_m;
              this.field_n = this.field_n * this.field_n >> -736534868;
              this.field_n = this.field_q * this.field_n >> 826305964;
              this.field_t = this.field_t + (this.field_p * this.field_n >> 165503148);
              this.field_p = this.field_p * this.field_r >> 303118604;
              if (param2 < 107) {
                lg.c((byte) -61);
                return;
              } else {
                return;
              }
            } else {
              L3: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if ((param1 ^ -1) <= -1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = param1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = -param1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((lg) (this)).field_n = -stackIn_6_1 + this.field_m;
              this.field_n = this.field_n * this.field_n >> -736534868;
              this.field_n = this.field_q * this.field_n >> 826305964;
              this.field_t = this.field_t + (this.field_p * this.field_n >> 165503148);
              this.field_p = this.field_p * this.field_r >> 303118604;
              if (param2 < 107) {
                lg.c((byte) -61);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        pf.field_z = param0 >> -596835964 & 3;
        if (pf.field_z > param1) {
          L0: {
            pf.field_z = 2;
            fd.field_d = (15 & param0) >> 1035157122;
            if (fd.field_d > 2) {
              fd.field_d = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            b.field_a = param0 & 3;
            if ((b.field_a ^ -1) < -3) {
              b.field_a = 2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            fd.field_d = (15 & param0) >> 1035157122;
            if (fd.field_d > 2) {
              fd.field_d = 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            b.field_a = param0 & 3;
            if ((b.field_a ^ -1) < -3) {
              b.field_a = 2;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    lg(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        this.field_m = (int)(param6 * 4096.0f);
        this.field_o = (int)(param7 * 4096.0f);
        int dupTemp$0 = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
        this.field_r = dupTemp$0;
        this.field_p = dupTemp$0;
    }

    static {
    }
}
