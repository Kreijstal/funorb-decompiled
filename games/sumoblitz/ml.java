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
        this.field_o = 0;
        if (param0 >= -7) {
            this.field_r = 119;
            this.field_m = 0;
            return;
        }
        this.field_m = 0;
    }

    void a(byte param0, int param1, int param2) {
        if (param2 != 4096) {
            return;
        }
        this.field_n[param1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          L1: {
            var5 = Sumoblitz.field_L ? 1 : 0;
            if (param0 == 0) {
              break L1;
            } else {
              L2: {
                this.field_t = this.field_q * this.field_k >> 680930956;
                if ((this.field_t ^ -1) <= -1) {
                  if (4096 < this.field_t) {
                    this.field_t = 4096;
                    break L2;
                  } else {
                    L3: {
                      stackOut_19_0 = this;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if ((param2 ^ -1) > -1) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = -param2;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L3;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = param2;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L3;
                      }
                    }
                    L4: {
                      ((ml) (this)).field_q = -stackIn_22_1 + this.field_s;
                      this.field_q = this.field_q * this.field_q >> -692464628;
                      this.field_q = this.field_q * this.field_t >> -1408196340;
                      this.field_m = this.field_m + (this.field_v * this.field_q >> 1577914572);
                      this.field_v = this.field_v * this.field_r >> 367150284;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_23_0 = this;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if ((param2 ^ -1) <= -1) {
                            stackOut_25_0 = this;
                            stackOut_25_1 = param2;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L5;
                          } else {
                            stackOut_24_0 = this;
                            stackOut_24_1 = -param2;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            break L5;
                          }
                        }
                        ((ml) (this)).field_q = -stackIn_26_1 + this.field_s;
                        this.field_q = this.field_q * this.field_q >> 710292556;
                        this.field_t = 4096;
                        this.field_m = this.field_q;
                        break L4;
                      }
                    }
                    if (param1 != 1157) {
                      this.field_n = (byte[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  this.field_t = 0;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    L6: {
                      if (4096 < this.field_t) {
                        this.field_t = 4096;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      stackOut_6_0 = this;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if ((param2 ^ -1) > -1) {
                        stackOut_8_0 = this;
                        stackOut_8_1 = -param2;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L7;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = param2;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L7;
                      }
                    }
                    L8: {
                      ((ml) (this)).field_q = -stackIn_9_1 + this.field_s;
                      this.field_q = this.field_q * this.field_q >> -692464628;
                      this.field_q = this.field_q * this.field_t >> -1408196340;
                      this.field_m = this.field_m + (this.field_v * this.field_q >> 1577914572);
                      this.field_v = this.field_v * this.field_r >> 367150284;
                      if (var5 == 0) {
                        break L8;
                      } else {
                        L9: {
                          stackOut_10_0 = this;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if ((param2 ^ -1) <= -1) {
                            stackOut_12_0 = this;
                            stackOut_12_1 = param2;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L9;
                          } else {
                            stackOut_11_0 = this;
                            stackOut_11_1 = -param2;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L9;
                          }
                        }
                        ((ml) (this)).field_q = -stackIn_13_1 + this.field_s;
                        this.field_q = this.field_q * this.field_q >> 710292556;
                        this.field_t = 4096;
                        this.field_m = this.field_q;
                        break L8;
                      }
                    }
                    if (param1 != 1157) {
                      this.field_n = (byte[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              L10: {
                stackOut_32_0 = this;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if ((param2 ^ -1) > -1) {
                  stackOut_34_0 = this;
                  stackOut_34_1 = -param2;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L10;
                } else {
                  stackOut_33_0 = this;
                  stackOut_33_1 = param2;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L10;
                }
              }
              ((ml) (this)).field_q = -stackIn_35_1 + this.field_s;
              this.field_q = this.field_q * this.field_q >> -692464628;
              this.field_q = this.field_q * this.field_t >> -1408196340;
              this.field_m = this.field_m + (this.field_v * this.field_q >> 1577914572);
              this.field_v = this.field_v * this.field_r >> 367150284;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L11: {
            stackOut_36_0 = this;
            stackIn_38_0 = stackOut_36_0;
            stackIn_37_0 = stackOut_36_0;
            if ((param2 ^ -1) <= -1) {
              stackOut_38_0 = this;
              stackOut_38_1 = param2;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              break L11;
            } else {
              stackOut_37_0 = this;
              stackOut_37_1 = -param2;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              break L11;
            }
          }
          ((ml) (this)).field_q = -stackIn_39_1 + this.field_s;
          this.field_q = this.field_q * this.field_q >> 710292556;
          this.field_t = 4096;
          this.field_m = this.field_q;
          break L0;
        }
        if (param1 != 1157) {
          this.field_n = (byte[]) null;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        this.field_m = this.field_m >> 4;
        this.field_v = this.field_r;
        if (-1 >= (this.field_m ^ -1)) {
          if (-256 <= (this.field_m ^ -1)) {
            fieldTemp$5 = this.field_o;
            this.field_o = this.field_o + 1;
            this.a((byte)this.field_m, fieldTemp$5, 4096);
            this.field_m = 0;
            if (param0) {
              this.a((byte) -52, 1, -122);
              return;
            } else {
              return;
            }
          } else {
            this.field_m = 255;
            fieldTemp$6 = this.field_o;
            this.field_o = this.field_o + 1;
            this.a((byte)this.field_m, fieldTemp$6, 4096);
            this.field_m = 0;
            if (param0) {
              this.a((byte) -52, 1, -122);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_m = 0;
          if (Sumoblitz.field_L) {
            if (-256 > (this.field_m ^ -1)) {
              this.field_m = 255;
              fieldTemp$7 = this.field_o;
              this.field_o = this.field_o + 1;
              this.a((byte)this.field_m, fieldTemp$7, 4096);
              this.field_m = 0;
              if (param0) {
                this.a((byte) -52, 1, -122);
                return;
              } else {
                return;
              }
            } else {
              fieldTemp$8 = this.field_o;
              this.field_o = this.field_o + 1;
              this.a((byte)this.field_m, fieldTemp$8, 4096);
              this.field_m = 0;
              if (param0) {
                this.a((byte) -52, 1, -122);
                return;
              } else {
                return;
              }
            }
          } else {
            fieldTemp$9 = this.field_o;
            this.field_o = this.field_o + 1;
            this.a((byte)this.field_m, fieldTemp$9, 4096);
            this.field_m = 0;
            if (param0) {
              this.a((byte) -52, 1, -122);
              return;
            } else {
              return;
            }
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
        this.field_k = (int)(4096.0f * param7);
        this.field_s = (int)(param6 * 4096.0f);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-param5)) * 4096.0);
        this.field_r = dupTemp$0;
        this.field_v = dupTemp$0;
    }

    static {
        field_l = 0;
    }
}
