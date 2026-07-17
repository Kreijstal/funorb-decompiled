/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ml extends en {
    private int field_t;
    static int field_l;
    private int field_q;
    private int field_v;
    static ri field_p;
    private int field_r;
    static boolean field_u;
    private int field_k;
    private byte[] field_n;
    private int field_m;
    private int field_o;
    static hr[] field_w;
    private int field_s;

    final void b(int param0) {
        ((ml) this).field_o = 0;
        if (param0 >= -7) {
            ((ml) this).field_r = 119;
            ((ml) this).field_m = 0;
            return;
        }
        ((ml) this).field_m = 0;
    }

    void a(byte param0, int param1, int param2) {
        if (param2 != 4096) {
            return;
        }
        ((ml) this).field_n[param1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
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
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            L1: {
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (param2 >= 0) {
                stackOut_23_0 = this;
                stackOut_23_1 = param2;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L1;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = -param2;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L1;
              }
            }
            ((ml) this).field_q = -stackIn_24_1 + ((ml) this).field_s;
            ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_q >> 12;
            ((ml) this).field_t = 4096;
            ((ml) this).field_m = ((ml) this).field_q;
            break L0;
          } else {
            ((ml) this).field_t = ((ml) this).field_q * ((ml) this).field_k >> 12;
            if (((ml) this).field_t >= 0) {
              if (4096 < ((ml) this).field_t) {
                L2: {
                  ((ml) this).field_t = 4096;
                  stackOut_17_0 = this;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (param2 < 0) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = -param2;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L2;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = param2;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L2;
                  }
                }
                ((ml) this).field_q = -stackIn_20_1 + ((ml) this).field_s;
                ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_q >> 12;
                ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_t >> 12;
                ((ml) this).field_m = ((ml) this).field_m + (((ml) this).field_v * ((ml) this).field_q >> 12);
                ((ml) this).field_v = ((ml) this).field_v * ((ml) this).field_r >> 12;
                break L0;
              } else {
                L3: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param2 < 0) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = -param2;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = param2;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                ((ml) this).field_q = -stackIn_13_1 + ((ml) this).field_s;
                ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_q >> 12;
                ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_t >> 12;
                ((ml) this).field_m = ((ml) this).field_m + (((ml) this).field_v * ((ml) this).field_q >> 12);
                ((ml) this).field_v = ((ml) this).field_v * ((ml) this).field_r >> 12;
                if (param1 != 1157) {
                  ((ml) this).field_n = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L4: {
                ((ml) this).field_t = 0;
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param2 < 0) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = -param2;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L4;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = param2;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L4;
                }
              }
              ((ml) this).field_q = -stackIn_5_1 + ((ml) this).field_s;
              ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_q >> 12;
              ((ml) this).field_q = ((ml) this).field_q * ((ml) this).field_t >> 12;
              ((ml) this).field_m = ((ml) this).field_m + (((ml) this).field_v * ((ml) this).field_q >> 12);
              ((ml) this).field_v = ((ml) this).field_v * ((ml) this).field_r >> 12;
              if (param1 != 1157) {
                ((ml) this).field_n = null;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param1 != 1157) {
          ((ml) this).field_n = null;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        ((ml) this).field_m = ((ml) this).field_m >> 4;
        ((ml) this).field_v = ((ml) this).field_r;
        if (((ml) this).field_m >= 0) {
          if (((ml) this).field_m <= 255) {
            int fieldTemp$3 = ((ml) this).field_o;
            ((ml) this).field_o = ((ml) this).field_o + 1;
            ((ml) this).a((byte)((ml) this).field_m, fieldTemp$3, 4096);
            ((ml) this).field_m = 0;
            if (param0) {
              ((ml) this).a((byte) -52, 1, -122);
              return;
            } else {
              return;
            }
          } else {
            ((ml) this).field_m = 255;
            int fieldTemp$4 = ((ml) this).field_o;
            ((ml) this).field_o = ((ml) this).field_o + 1;
            ((ml) this).a((byte)((ml) this).field_m, fieldTemp$4, 4096);
            ((ml) this).field_m = 0;
            if (!param0) {
              return;
            } else {
              ((ml) this).a((byte) -52, 1, -122);
              return;
            }
          }
        } else {
          ((ml) this).field_m = 0;
          int fieldTemp$5 = ((ml) this).field_o;
          ((ml) this).field_o = ((ml) this).field_o + 1;
          ((ml) this).a((byte)((ml) this).field_m, fieldTemp$5, 4096);
          ((ml) this).field_m = 0;
          if (!param0) {
            return;
          } else {
            ((ml) this).a((byte) -52, 1, -122);
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_w = null;
        field_p = null;
        if (param0 != 30) {
            ml.c((byte) 34);
        }
    }

    ml(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        ((ml) this).field_k = (int)(4096.0f * param7);
        ((ml) this).field_s = (int)(param6 * 4096.0f);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-param5)) * 4096.0);
        ((ml) this).field_r = dupTemp$0;
        ((ml) this).field_v = dupTemp$0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
