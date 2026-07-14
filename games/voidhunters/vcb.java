/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vcb extends oda implements oo {
    private htb field_A;
    private boolean field_G;
    private boolean field_y;
    private htb field_N;
    private int field_J;
    int field_K;
    private htb field_C;
    private int field_F;
    private int field_x;
    private boolean field_w;
    private int field_B;
    int field_L;
    private ef field_P;
    private int field_H;
    private htb field_D;
    static byte[][] field_E;
    static dja field_z;
    int field_M;
    private htb field_v;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 != 1) {
            break L0;
          } else {
            if (!((vcb) this).field_y) {
              break L0;
            } else {
              L1: {
                if (!((vcb) this).field_G) {
                  break L1;
                } else {
                  if (((vcb) this).field_A == param3) {
                    this.a((byte) -17, -((vcb) this).field_K + ((vcb) this).field_L);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!((vcb) this).field_G) {
                  break L2;
                } else {
                  if (((vcb) this).field_v != param3) {
                    break L2;
                  } else {
                    this.a((byte) -17, ((vcb) this).field_K + ((vcb) this).field_L);
                    break L0;
                  }
                }
              }
              L3: {
                if (!((vcb) this).field_w) {
                  break L3;
                } else {
                  if (((vcb) this).field_D == param3) {
                    this.a(-51, ((vcb) this).field_M - ((vcb) this).field_H);
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              if (!((vcb) this).field_w) {
                break L0;
              } else {
                if (((vcb) this).field_C != param3) {
                  break L0;
                } else {
                  this.a(-23, ((vcb) this).field_M + ((vcb) this).field_H);
                  break L0;
                }
              }
            }
          }
        }
        L4: {
          if (param0 == 11) {
            break L4;
          } else {
            ((vcb) this).field_G = false;
            break L4;
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = VoidHunters.field_G;
            super.a(param0, param1, param2, param3);
            if (!(((vcb) this).field_P.field_t instanceof htb)) {
              break L1;
            } else {
              if (!((htb) (Object) ((vcb) this).field_P.field_t).field_x) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (-2 == (((vcb) this).field_P.field_n ^ -1)) {
            L2: {
              if (((vcb) this).field_w) {
                var5 = ((vcb) this).field_M;
                this.h((byte) 79);
                if (var5 == ((vcb) this).field_M) {
                  break L2;
                } else {
                  if (((vcb) this).field_l instanceof lt) {
                    ((lt) (Object) ((vcb) this).field_l).a((vcb) this, ((vcb) this).field_M, ((vcb) this).field_M, true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                this.i((byte) -8);
                break L2;
              }
            }
            if (!((vcb) this).field_G) {
              this.e(param2 ^ -981);
              break L0;
            } else {
              var5 = ((vcb) this).field_L;
              this.g(127);
              if (var5 == ((vcb) this).field_L) {
                break L0;
              } else {
                if (((vcb) this).field_l instanceof lt) {
                  ((lt) (Object) ((vcb) this).field_l).a((vcb) this, ((vcb) this).field_L, ((vcb) this).field_M, true);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!((vcb) this).field_N.field_x) {
            break L3;
          } else {
            if (1 != ((vcb) this).field_N.field_z) {
              break L3;
            } else {
              if (((vcb) this).field_G) {
                if (((vcb) this).field_w) {
                  var5 = -((vcb) this).field_P.field_g + -(((vcb) this).field_P.field_h >> 856790913) + (-param1 + kc.field_b) + -((vcb) this).field_g;
                  var6 = uia.field_b + -param0 + (-((vcb) this).field_r - (((vcb) this).field_P.field_r + (((vcb) this).field_P.field_f >> 171921409)));
                  if (Math.abs(var6) <= Math.abs(var5)) {
                    if ((var5 ^ -1) >= -1) {
                      this.a(-116, ((vcb) this).field_M + -((vcb) this).field_x);
                      break L3;
                    } else {
                      this.a(-15, ((vcb) this).field_x + ((vcb) this).field_M);
                      break L3;
                    }
                  } else {
                    if (0 < var6) {
                      this.a((byte) -17, ((vcb) this).field_L - -((vcb) this).field_F);
                      break L3;
                    } else {
                      this.a((byte) -17, -((vcb) this).field_F + ((vcb) this).field_L);
                      break L3;
                    }
                  }
                } else {
                  if (uia.field_b <= param0 - (-((vcb) this).field_P.field_r + -(((vcb) this).field_P.field_f >> 870890145))) {
                    this.a((byte) -17, ((vcb) this).field_L - ((vcb) this).field_F);
                    break L3;
                  } else {
                    this.a((byte) -17, ((vcb) this).field_L - -((vcb) this).field_F);
                    break L3;
                  }
                }
              } else {
                if (!((vcb) this).field_w) {
                  break L3;
                } else {
                  if ((((vcb) this).field_P.field_h >> -2115708159) + (((vcb) this).field_P.field_g + param1) >= kc.field_b) {
                    this.a(107, -((vcb) this).field_x + ((vcb) this).field_M);
                    break L3;
                  } else {
                    this.a(-102, ((vcb) this).field_M - -((vcb) this).field_x);
                    break L3;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 != 21944) {
            Object var5 = null;
            boolean discarded$0 = ((vcb) this).a(-20, -95, (shb) null, 'J');
        }
        if (param0 < param2) {
            var4 = ((vcb) this).field_N.field_h * param0 / param2;
            if (!(var4 >= ((vcb) this).field_J)) {
                var4 = ((vcb) this).field_J;
            }
            ((vcb) this).field_P.a(((vcb) this).field_P.field_g, var4, ((vcb) this).field_P.field_f, 1, ((vcb) this).field_P.field_r);
            this.a((byte) -63, true);
        } else {
            ((vcb) this).field_P.a(((vcb) this).field_P.field_g, ((vcb) this).field_N.field_h, ((vcb) this).field_P.field_f, param1 ^ 21945, ((vcb) this).field_P.field_r);
            this.a((byte) -110, false);
        }
        this.i((byte) -8);
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = VoidHunters.field_G;
          if ((param1 ^ -1) > -1) {
            ((vcb) this).field_L = 0;
            break L0;
          } else {
            if ((param1 ^ -1) < -65537) {
              ((vcb) this).field_L = 65536;
              break L0;
            } else {
              ((vcb) this).field_L = param1;
              break L0;
            }
          }
        }
        L1: {
          this.e(0);
          if (param0 == -3393) {
            break L1;
          } else {
            var5 = null;
            tjb discarded$1 = vcb.a(33, (llb) null, (llb) null, (llb) null, (rn) null);
            break L1;
          }
        }
    }

    private final void g(int param0) {
        int var2 = ((vcb) this).field_A == null ? ((vcb) this).field_N.field_r : ((vcb) this).field_A.field_f + ((vcb) this).field_A.field_r;
        int var3 = null != ((vcb) this).field_v ? -((vcb) this).field_P.field_f + ((vcb) this).field_v.field_r : ((vcb) this).field_N.field_f + ((vcb) this).field_N.field_r - ((vcb) this).field_P.field_f;
        int var4 = 68 / ((9 - param0) / 59);
        ((vcb) this).c(-3393, var3 <= var2 ? 0 : (((vcb) this).field_P.field_r + -var2 << 1407852400) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        this.b(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (!(!(((vcb) this).field_l instanceof lt))) {
            ((lt) (Object) ((vcb) this).field_l).a(((vcb) this).field_M, ((vcb) this).field_L, (vcb) this, -125);
        }
    }

    private final void a(int param0, boolean param1) {
        htb stackIn_3_0 = null;
        htb stackIn_4_0 = null;
        htb stackIn_5_0 = null;
        htb stackIn_6_0 = null;
        htb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        htb stackIn_10_0 = null;
        htb stackIn_11_0 = null;
        htb stackIn_12_0 = null;
        htb stackIn_13_0 = null;
        htb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        htb stackIn_17_0 = null;
        htb stackIn_18_0 = null;
        htb stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        htb stackIn_22_0 = null;
        htb stackIn_23_0 = null;
        htb stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        htb stackOut_2_0 = null;
        htb stackOut_3_0 = null;
        htb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        htb stackOut_4_0 = null;
        htb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        htb stackOut_9_0 = null;
        htb stackOut_10_0 = null;
        htb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        htb stackOut_11_0 = null;
        htb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        htb stackOut_16_0 = null;
        htb stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        htb stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        htb stackOut_21_0 = null;
        htb stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        htb stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.h((byte) -20);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = ((vcb) this).field_N;
            stackIn_5_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param1) {
              break L2;
            } else {
              stackOut_3_0 = (htb) (Object) stackIn_3_0;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!((vcb) this).field_w) {
                stackOut_6_0 = (htb) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_4_0 = (htb) (Object) stackIn_4_0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              }
            }
          }
          stackOut_5_0 = (htb) (Object) stackIn_5_0;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L1;
        }
        L3: {
          stackIn_7_0.field_x = stackIn_7_1 != 0;
          if (((vcb) this).field_P.field_t instanceof htb) {
            L4: {
              L5: {
                stackOut_9_0 = (htb) (Object) ((vcb) this).field_P.field_t;
                stackIn_12_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param1) {
                  break L5;
                } else {
                  stackOut_10_0 = (htb) (Object) stackIn_10_0;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!((vcb) this).field_w) {
                    stackOut_13_0 = (htb) (Object) stackIn_13_0;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L4;
                  } else {
                    stackOut_11_0 = (htb) (Object) stackIn_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    break L5;
                  }
                }
              }
              stackOut_12_0 = (htb) (Object) stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L4;
            }
            stackIn_14_0.field_x = stackIn_14_1 != 0;
            break L3;
          } else {
            break L3;
          }
        }
        L6: {
          if (((vcb) this).field_A == null) {
            break L6;
          } else {
            L7: {
              stackOut_16_0 = ((vcb) this).field_A;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param1) {
                stackOut_18_0 = (htb) (Object) stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = (htb) (Object) stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            stackIn_19_0.field_x = stackIn_19_1 != 0;
            break L6;
          }
        }
        L8: {
          if (null == ((vcb) this).field_v) {
            break L8;
          } else {
            L9: {
              stackOut_21_0 = ((vcb) this).field_v;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param1) {
                stackOut_23_0 = (htb) (Object) stackIn_23_0;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L9;
              } else {
                stackOut_22_0 = (htb) (Object) stackIn_22_0;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L9;
              }
            }
            stackIn_24_0.field_x = stackIn_24_1 != 0;
            break L8;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param0) {
            var4 = ((vcb) this).field_N.field_f * param0 / param1;
            if (!(((vcb) this).field_B <= var4)) {
                var4 = ((vcb) this).field_B;
            }
            ((vcb) this).field_P.a(((vcb) this).field_P.field_g, ((vcb) this).field_P.field_h, var4, 1, ((vcb) this).field_P.field_r);
            this.a(0, true);
        } else {
            ((vcb) this).field_P.a(((vcb) this).field_P.field_g, ((vcb) this).field_P.field_h, ((vcb) this).field_N.field_f, 1, ((vcb) this).field_P.field_r);
            this.a(0, false);
        }
        this.e(0);
        if (param2 < 126) {
            Object var5 = null;
            tjb discarded$0 = vcb.a(-91, (llb) null, (llb) null, (llb) null, (rn) null);
        }
    }

    private final void h(byte param0) {
        if (param0 <= 49) {
            ((vcb) this).c(17, -59, -81);
        }
        int var2 = null != ((vcb) this).field_D ? ((vcb) this).field_D.field_g - -((vcb) this).field_D.field_h : ((vcb) this).field_N.field_g;
        int var3 = ((vcb) this).field_C != null ? ((vcb) this).field_C.field_g - ((vcb) this).field_P.field_h : ((vcb) this).field_N.field_h + ((vcb) this).field_N.field_g + -((vcb) this).field_P.field_h;
        this.b(var3 <= var2 ? 0 : (((vcb) this).field_P.field_g + -var2 << 1306262288) / (var3 - var2), 65536);
    }

    vcb(int param0, int param1, int param2, int param3, wwa param4, wwa param5, wwa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ((vcb) this).field_F = 8192;
        ((vcb) this).field_x = 8192;
        ((vcb) this).field_B = 0;
        ((vcb) this).field_y = true;
        ((vcb) this).field_L = 32768;
        ((vcb) this).field_H = 1024;
        ((vcb) this).field_J = 0;
        ((vcb) this).field_K = 1024;
        ((vcb) this).field_M = 32768;
        ((vcb) this).field_u = new shb[6];
        ((vcb) this).field_P = new ef(param0, param1, param7, param8, (wwa) null, (sba) null, (shb) (Object) new htb(0, 0, param7, param8, param6, (sba) null), false, false);
        ((vcb) this).field_u[0] = (shb) (Object) new ef(param0, param1, param7, param8, (wwa) null, (sba) null, (shb) (Object) new htb(0, 0, param7, param8, param6, (sba) null), false, false);
        ((vcb) this).field_N = new htb(param0, param1, param7, param8, param5, (sba) null);
        ((vcb) this).field_u[1] = (shb) (Object) new htb(param0, param1, param7, param8, param5, (sba) null);
        ((vcb) this).field_w = param11 ? true : false;
        ((vcb) this).field_G = param12 ? true : false;
        ((vcb) this).field_J = param9;
        ((vcb) this).field_B = param10;
        this.b(param13, 65536);
        ((vcb) this).c(-3393, param14);
        ((vcb) this).a(param0, param2, param3, 1, param1);
    }

    public static void j(byte param0) {
        if (param0 != -7) {
            field_E = null;
        }
        field_E = null;
        field_z = null;
    }

    private final int k(byte param0) {
        if (param0 != 110) {
            ((vcb) this).field_M = 17;
        }
        return (((vcb) this).field_P.field_f << -699381232) / ((vcb) this).field_N.field_f;
    }

    private final void a(byte param0, boolean param1) {
        htb stackIn_1_0 = null;
        htb stackIn_2_0 = null;
        htb stackIn_3_0 = null;
        htb stackIn_4_0 = null;
        htb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        htb stackIn_9_0 = null;
        htb stackIn_10_0 = null;
        htb stackIn_11_0 = null;
        htb stackIn_12_0 = null;
        htb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        htb stackIn_16_0 = null;
        htb stackIn_17_0 = null;
        htb stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        htb stackIn_21_0 = null;
        htb stackIn_22_0 = null;
        htb stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        htb stackOut_0_0 = null;
        htb stackOut_1_0 = null;
        htb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        htb stackOut_2_0 = null;
        htb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        htb stackOut_8_0 = null;
        htb stackOut_9_0 = null;
        htb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        htb stackOut_10_0 = null;
        htb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        htb stackOut_15_0 = null;
        htb stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        htb stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        htb stackOut_20_0 = null;
        htb stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        htb stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          L1: {
            stackOut_0_0 = ((vcb) this).field_N;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param1) {
              break L1;
            } else {
              stackOut_1_0 = (htb) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!((vcb) this).field_G) {
                stackOut_4_0 = (htb) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_2_0 = (htb) (Object) stackIn_2_0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            }
          }
          stackOut_3_0 = (htb) (Object) stackIn_3_0;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          break L0;
        }
        stackIn_5_0.field_x = stackIn_5_1 != 0;
        if (param0 <= -34) {
          L2: {
            if (!(((vcb) this).field_P.field_t instanceof htb)) {
              break L2;
            } else {
              L3: {
                L4: {
                  stackOut_8_0 = (htb) (Object) ((vcb) this).field_P.field_t;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param1) {
                    break L4;
                  } else {
                    stackOut_9_0 = (htb) (Object) stackIn_9_0;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!((vcb) this).field_G) {
                      stackOut_12_0 = (htb) (Object) stackIn_12_0;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L3;
                    } else {
                      stackOut_10_0 = (htb) (Object) stackIn_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                }
                stackOut_11_0 = (htb) (Object) stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L3;
              }
              stackIn_13_0.field_x = stackIn_13_1 != 0;
              break L2;
            }
          }
          L5: {
            if (((vcb) this).field_D == null) {
              break L5;
            } else {
              L6: {
                stackOut_15_0 = ((vcb) this).field_D;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (!param1) {
                  stackOut_17_0 = (htb) (Object) stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L6;
                } else {
                  stackOut_16_0 = (htb) (Object) stackIn_16_0;
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L6;
                }
              }
              stackIn_18_0.field_x = stackIn_18_1 != 0;
              break L5;
            }
          }
          L7: {
            if (((vcb) this).field_C == null) {
              break L7;
            } else {
              L8: {
                stackOut_20_0 = ((vcb) this).field_C;
                stackIn_22_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (!param1) {
                  stackOut_22_0 = (htb) (Object) stackIn_22_0;
                  stackOut_22_1 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L8;
                } else {
                  stackOut_21_0 = (htb) (Object) stackIn_21_0;
                  stackOut_21_1 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  break L8;
                }
              }
              stackIn_23_0.field_x = stackIn_23_1 != 0;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void e(int param0) {
        int var2 = null == ((vcb) this).field_A ? ((vcb) this).field_N.field_r : ((vcb) this).field_A.field_f + ((vcb) this).field_A.field_r;
        int var3 = null == ((vcb) this).field_v ? ((vcb) this).field_N.field_r + (((vcb) this).field_N.field_f - ((vcb) this).field_P.field_f) : ((vcb) this).field_v.field_r - ((vcb) this).field_P.field_f;
        ((vcb) this).field_P.field_r = (((vcb) this).field_L * (-var2 + var3) >> -540725264) + var2;
        if (param0 != 0) {
            vcb.f(-79);
        }
    }

    private final void i(byte param0) {
        if (param0 != -8) {
            ((vcb) this).d(116);
        }
        int var2 = null == ((vcb) this).field_D ? ((vcb) this).field_N.field_g : ((vcb) this).field_D.field_h + ((vcb) this).field_D.field_g;
        int var3 = null != ((vcb) this).field_C ? -((vcb) this).field_P.field_h + ((vcb) this).field_C.field_g : ((vcb) this).field_N.field_h + (((vcb) this).field_N.field_g + -((vcb) this).field_P.field_h);
        ((vcb) this).field_P.field_g = ((var3 + -var2) * ((vcb) this).field_M >> -393002192) + var2;
    }

    final static tjb a(int param0, llb param1, llb param2, llb param3, rn param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        tjb[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        rn var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        pi var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = VoidHunters.field_G;
        if (param4 != null) {
          L0: {
            if (param4.field_l != null) {
              stackOut_4_0 = param4.field_l.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null == param4.field_n) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param4.field_n.length;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 + var6;
            var8 = new String[var7];
            if (param0 == 0) {
              break L2;
            } else {
              vcb.j((byte) 98);
              break L2;
            }
          }
          L3: {
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new tjb[var7];
            if (null == param4.field_l) {
              break L3;
            } else {
              var12 = 0;
              L4: while (true) {
                if (var12 >= param4.field_l.length) {
                  break L3;
                } else {
                  var13_ref = lnb.field_i.a((byte) -72, param4.field_l[var12]);
                  var8[var12] = var13_ref.field_p;
                  var9[var12] = param4.field_q[var12];
                  var11[var12] = vcb.a(0, param1, param2, param3, var13_ref);
                  var12++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param4.field_n != null) {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (var14 >= param4.field_n.length) {
                  break L5;
                } else {
                  var15 = param4.field_n[var14];
                  if (var15 == -1) {
                    var8[var14 + var12] = cu.field_p;
                    var9[var14 + var12] = param4.field_m[var14];
                    var10[var12 - -var14] = param4.field_n[var14];
                    var14++;
                    continue L6;
                  } else {
                    L7: {
                      var16 = usa.field_o.a(var15, -118);
                      var8[var14 + var12] = var16.a(80);
                      var9[var14 + var12] = param4.field_m[var14];
                      if (var9[var12 - -var14] > 0) {
                        break L7;
                      } else {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        break L7;
                      }
                    }
                    var10[var14 + var12] = param4.field_n[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          return new tjb(0L, param1, param2, param3, var11, var24, var8, var25);
        } else {
          return null;
        }
    }

    final void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (null != ((vcb) this).field_D) {
            ((vcb) this).field_D.field_g = 0;
            ((vcb) this).field_D.field_r = ((vcb) this).field_f - ((vcb) this).field_D.field_f >> -1547859519;
            ((vcb) this).field_N.field_g = ((vcb) this).field_D.field_g - -((vcb) this).field_D.field_h;
            break L0;
          } else {
            ((vcb) this).field_N.field_g = 0;
            break L0;
          }
        }
        L1: {
          if (((vcb) this).field_C != null) {
            ((vcb) this).field_C.field_g = ((vcb) this).field_h + -((vcb) this).field_C.field_h;
            ((vcb) this).field_C.field_r = ((vcb) this).field_f + -((vcb) this).field_C.field_f >> -535328607;
            ((vcb) this).field_N.field_h = ((vcb) this).field_h + (-((vcb) this).field_N.field_g - ((vcb) this).field_C.field_h);
            break L1;
          } else {
            ((vcb) this).field_N.field_h = -((vcb) this).field_N.field_g + ((vcb) this).field_h;
            break L1;
          }
        }
        L2: {
          this.i((byte) -8);
          if (((vcb) this).field_A == null) {
            ((vcb) this).field_N.field_r = 0;
            break L2;
          } else {
            ((vcb) this).field_A.field_r = 0;
            ((vcb) this).field_A.field_g = ((vcb) this).field_h - ((vcb) this).field_A.field_h >> -1143110175;
            ((vcb) this).field_N.field_r = ((vcb) this).field_A.field_r + ((vcb) this).field_A.field_f;
            break L2;
          }
        }
        L3: {
          if (((vcb) this).field_v != null) {
            ((vcb) this).field_v.field_r = ((vcb) this).field_f + -((vcb) this).field_v.field_f;
            ((vcb) this).field_v.field_g = -((vcb) this).field_v.field_h + ((vcb) this).field_h >> 33400769;
            ((vcb) this).field_N.field_f = -((vcb) this).field_N.field_r + (((vcb) this).field_f + -((vcb) this).field_v.field_f);
            break L3;
          } else {
            ((vcb) this).field_N.field_f = ((vcb) this).field_f + -((vcb) this).field_N.field_r;
            break L3;
          }
        }
        L4: {
          this.e(param0 ^ param0);
          if (((vcb) this).field_G) {
            break L4;
          } else {
            ((vcb) this).field_P.field_f = ((vcb) this).field_N.field_f;
            ((vcb) this).field_P.field_r = 0;
            break L4;
          }
        }
        L5: {
          if (((vcb) this).field_w) {
            break L5;
          } else {
            ((vcb) this).field_P.field_h = ((vcb) this).field_N.field_h;
            ((vcb) this).field_P.field_g = 0;
            break L5;
          }
        }
        ((vcb) this).field_P.a(false);
    }

    final boolean a(int param0, shb param1) {
        if (param0 != 0) {
            ((vcb) this).field_L = -9;
        }
        ef var3 = ((vcb) this).field_P;
        if (var3 != null) {
            if (((shb) (Object) var3).a(param0 ^ 0, param1)) {
                return true;
            }
        }
        return false;
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (-1 < (param0 ^ -1)) {
            ((vcb) this).field_M = 0;
            break L0;
          } else {
            if (param0 <= 65536) {
              ((vcb) this).field_M = param0;
              break L0;
            } else {
              ((vcb) this).field_M = 65536;
              break L0;
            }
          }
        }
        if (param1 == 65536) {
          this.i((byte) -8);
          return;
        } else {
          return;
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 != 32) {
            vcb.j((byte) -101);
        }
        if ((hlb.field_p ^ -1) > -225) {
            var1 = hlb.field_p % 32;
            re.a(-var1 + hlb.field_p - -32, (byte) -100);
        } else {
            re.a(256, (byte) -126);
        }
    }

    private final void a(byte param0, int param1) {
        ((vcb) this).c(-3393, param1);
        if (((vcb) this).field_l instanceof lt) {
            ((lt) (Object) ((vcb) this).field_l).a(((vcb) this).field_L, ((vcb) this).field_L, (vcb) this, param0 ^ 106);
        }
        if (param0 != -17) {
            this.i((byte) 62);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          L0: {
            if (!((vcb) this).field_y) {
              break L0;
            } else {
              if (!((vcb) this).field_P.e((byte) -120)) {
                break L0;
              } else {
                if (98 == param1) {
                  this.a((byte) -17, ((vcb) this).field_L - ((vcb) this).field_K);
                  return true;
                } else {
                  if ((param1 ^ -1) != -100) {
                    if (96 != param1) {
                      if (param1 != 97) {
                        if (param1 != -105) {
                          if (-106 != param1) {
                            if (102 == param1) {
                              L1: {
                                if (!((vcb) this).field_G) {
                                  break L1;
                                } else {
                                  if (!si.field_o[82]) {
                                    break L1;
                                  } else {
                                    this.a((byte) -17, 0);
                                    return true;
                                  }
                                }
                              }
                              if (((vcb) this).field_w) {
                                this.a(-119, 0);
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              if (103 != param1) {
                                break L0;
                              } else {
                                L2: {
                                  if (!((vcb) this).field_G) {
                                    break L2;
                                  } else {
                                    if (!si.field_o[82]) {
                                      break L2;
                                    } else {
                                      this.a((byte) -17, 65536);
                                      return true;
                                    }
                                  }
                                }
                                if (!((vcb) this).field_w) {
                                  break L0;
                                } else {
                                  this.a(param0 + 15790, 65536);
                                  return true;
                                }
                              }
                            }
                          } else {
                            this.a((byte) -17, ((vcb) this).field_L + this.k((byte) 110));
                            return true;
                          }
                        } else {
                          this.a((byte) -17, ((vcb) this).field_L - this.k((byte) 110));
                          return true;
                        }
                      } else {
                        this.a(116, ((vcb) this).field_M - -((vcb) this).field_H);
                        return true;
                      }
                    } else {
                      this.a(param0 + 15923, ((vcb) this).field_M + -((vcb) this).field_H);
                      return true;
                    }
                  } else {
                    this.a((byte) -17, ((vcb) this).field_K + ((vcb) this).field_L);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[250][];
        field_z = (dja) (Object) new ej();
    }
}
