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
        ((lg) this).field_p = ((lg) this).field_r;
        ((lg) this).field_t = ((lg) this).field_t >> 4;
        if (((lg) this).field_t >= 0) {
          if (((lg) this).field_t <= 255) {
            int fieldTemp$3 = ((lg) this).field_u;
            ((lg) this).field_u = ((lg) this).field_u + 1;
            ((lg) this).b(fieldTemp$3, param0 + -1, (byte)((lg) this).field_t);
            ((lg) this).field_t = param0;
            return;
          } else {
            ((lg) this).field_t = 255;
            int fieldTemp$4 = ((lg) this).field_u;
            ((lg) this).field_u = ((lg) this).field_u + 1;
            ((lg) this).b(fieldTemp$4, param0 + -1, (byte)((lg) this).field_t);
            ((lg) this).field_t = param0;
            return;
          }
        } else {
          ((lg) this).field_t = 0;
          int fieldTemp$5 = ((lg) this).field_u;
          ((lg) this).field_u = ((lg) this).field_u + 1;
          ((lg) this).b(fieldTemp$5, param0 + -1, (byte)((lg) this).field_t);
          ((lg) this).field_t = param0;
          return;
        }
    }

    void b(int param0, int param1, byte param2) {
        ((lg) this).field_s[param0] = (byte)param2;
        if (param1 != -1) {
            ((lg) this).field_o = 29;
        }
    }

    final void c(int param0) {
        ((lg) this).field_u = 0;
        if (param0 != -30042) {
            return;
        }
        ((lg) this).field_t = 0;
    }

    final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 0) {
          L0: {
            stackOut_21_0 = this;
            stackIn_23_0 = stackOut_21_0;
            stackIn_22_0 = stackOut_21_0;
            if (param1 >= 0) {
              stackOut_23_0 = this;
              stackOut_23_1 = param1;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L0;
            } else {
              stackOut_22_0 = this;
              stackOut_22_1 = -param1;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              break L0;
            }
          }
          ((lg) this).field_n = -stackIn_24_1 + ((lg) this).field_m;
          ((lg) this).field_q = 4096;
          ((lg) this).field_n = ((lg) this).field_n * ((lg) this).field_n >> 12;
          ((lg) this).field_t = ((lg) this).field_n;
          if (param2 >= 107) {
            return;
          } else {
            lg.c((byte) -61);
            return;
          }
        } else {
          ((lg) this).field_q = ((lg) this).field_n * ((lg) this).field_o >> 12;
          if (((lg) this).field_q < 0) {
            L1: {
              ((lg) this).field_q = 0;
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (param1 >= 0) {
                stackOut_17_0 = this;
                stackOut_17_1 = param1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L1;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = -param1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L1;
              }
            }
            ((lg) this).field_n = -stackIn_18_1 + ((lg) this).field_m;
            ((lg) this).field_n = ((lg) this).field_n * ((lg) this).field_n >> 12;
            ((lg) this).field_n = ((lg) this).field_q * ((lg) this).field_n >> 12;
            ((lg) this).field_t = ((lg) this).field_t + (((lg) this).field_p * ((lg) this).field_n >> 12);
            ((lg) this).field_p = ((lg) this).field_p * ((lg) this).field_r >> 12;
            if (param2 >= 107) {
              return;
            } else {
              lg.c((byte) -61);
              return;
            }
          } else {
            if (((lg) this).field_q > 4096) {
              L2: {
                ((lg) this).field_q = 4096;
                stackOut_9_0 = this;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param1 >= 0) {
                  stackOut_11_0 = this;
                  stackOut_11_1 = param1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = this;
                  stackOut_10_1 = -param1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L2;
                }
              }
              ((lg) this).field_n = -stackIn_12_1 + ((lg) this).field_m;
              ((lg) this).field_n = ((lg) this).field_n * ((lg) this).field_n >> 12;
              ((lg) this).field_n = ((lg) this).field_q * ((lg) this).field_n >> 12;
              ((lg) this).field_t = ((lg) this).field_t + (((lg) this).field_p * ((lg) this).field_n >> 12);
              ((lg) this).field_p = ((lg) this).field_p * ((lg) this).field_r >> 12;
              if (param2 >= 107) {
                return;
              } else {
                lg.c((byte) -61);
                return;
              }
            } else {
              L3: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1 >= 0) {
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
              ((lg) this).field_n = -stackIn_6_1 + ((lg) this).field_m;
              ((lg) this).field_n = ((lg) this).field_n * ((lg) this).field_n >> 12;
              ((lg) this).field_n = ((lg) this).field_q * ((lg) this).field_n >> 12;
              ((lg) this).field_t = ((lg) this).field_t + (((lg) this).field_p * ((lg) this).field_n >> 12);
              ((lg) this).field_p = ((lg) this).field_p * ((lg) this).field_r >> 12;
              if (param2 >= 107) {
                return;
              } else {
                lg.c((byte) -61);
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        pf.field_z = param0 >> 4 & 3;
        if (pf.field_z > 2) {
          L0: {
            pf.field_z = 2;
            fd.field_d = (15 & param0) >> 2;
            if (fd.field_d > 2) {
              fd.field_d = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            b.field_a = param0 & 3;
            if (b.field_a > 2) {
              b.field_a = 2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            fd.field_d = (15 & param0) >> 2;
            if (fd.field_d > 2) {
              fd.field_d = 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            b.field_a = param0 & 3;
            if (b.field_a > 2) {
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
        ((lg) this).field_m = (int)(param6 * 4096.0f);
        ((lg) this).field_o = (int)(param7 * 4096.0f);
        int dupTemp$0 = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
        ((lg) this).field_r = dupTemp$0;
        ((lg) this).field_p = dupTemp$0;
    }

    static {
    }
}
