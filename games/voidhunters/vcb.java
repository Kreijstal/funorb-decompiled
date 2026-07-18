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
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                break L1;
              } else {
                if (!((vcb) this).field_y) {
                  break L1;
                } else {
                  L2: {
                    if (!((vcb) this).field_G) {
                      break L2;
                    } else {
                      if (((vcb) this).field_A == param3) {
                        this.a((byte) -17, -((vcb) this).field_K + ((vcb) this).field_L);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!((vcb) this).field_G) {
                      break L3;
                    } else {
                      if (((vcb) this).field_v != param3) {
                        break L3;
                      } else {
                        this.a((byte) -17, ((vcb) this).field_K + ((vcb) this).field_L);
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (!((vcb) this).field_w) {
                      break L4;
                    } else {
                      if (((vcb) this).field_D == param3) {
                        this.a(-51, ((vcb) this).field_M - ((vcb) this).field_H);
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!((vcb) this).field_w) {
                    break L1;
                  } else {
                    if (((vcb) this).field_C != param3) {
                      break L1;
                    } else {
                      this.a(-23, ((vcb) this).field_M + ((vcb) this).field_H);
                      break L1;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 == 11) {
                break L5;
              } else {
                ((vcb) this).field_G = false;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("vcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (!(((vcb) this).field_P.field_t instanceof htb)) {
                  break L2;
                } else {
                  if (!((htb) (Object) ((vcb) this).field_P.field_t).field_x) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((vcb) this).field_P.field_n == 1) {
                L3: {
                  if (((vcb) this).field_w) {
                    var5_int = ((vcb) this).field_M;
                    int discarded$2 = 79;
                    this.h();
                    if (var5_int == ((vcb) this).field_M) {
                      break L3;
                    } else {
                      if (((vcb) this).field_l instanceof lt) {
                        ((lt) (Object) ((vcb) this).field_l).a((vcb) this, ((vcb) this).field_M, ((vcb) this).field_M, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    int discarded$3 = -8;
                    this.i();
                    break L3;
                  }
                }
                if (!((vcb) this).field_G) {
                  this.e(param2 ^ -981);
                  break L1;
                } else {
                  var5_int = ((vcb) this).field_L;
                  this.g(127);
                  if (var5_int == ((vcb) this).field_L) {
                    break L1;
                  } else {
                    if (((vcb) this).field_l instanceof lt) {
                      ((lt) (Object) ((vcb) this).field_l).a((vcb) this, ((vcb) this).field_L, ((vcb) this).field_M, true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!((vcb) this).field_N.field_x) {
                break L4;
              } else {
                if (1 != ((vcb) this).field_N.field_z) {
                  break L4;
                } else {
                  if (((vcb) this).field_G) {
                    if (((vcb) this).field_w) {
                      var5_int = -((vcb) this).field_P.field_g + -(((vcb) this).field_P.field_h >> 1) + (-param1 + kc.field_b) + -((vcb) this).field_g;
                      var6 = uia.field_b + -param0 + (-((vcb) this).field_r - (((vcb) this).field_P.field_r + (((vcb) this).field_P.field_f >> 1)));
                      if (Math.abs(var6) <= Math.abs(var5_int)) {
                        if (var5_int <= 0) {
                          this.a(-116, ((vcb) this).field_M + -((vcb) this).field_x);
                          break L4;
                        } else {
                          this.a(-15, ((vcb) this).field_x + ((vcb) this).field_M);
                          break L4;
                        }
                      } else {
                        if (0 < var6) {
                          this.a((byte) -17, ((vcb) this).field_L - -((vcb) this).field_F);
                          break L4;
                        } else {
                          this.a((byte) -17, -((vcb) this).field_F + ((vcb) this).field_L);
                          break L4;
                        }
                      }
                    } else {
                      if (uia.field_b <= param0 - (-((vcb) this).field_P.field_r + -(((vcb) this).field_P.field_f >> 1))) {
                        this.a((byte) -17, ((vcb) this).field_L - ((vcb) this).field_F);
                        break L4;
                      } else {
                        this.a((byte) -17, ((vcb) this).field_L - -((vcb) this).field_F);
                        break L4;
                      }
                    }
                  } else {
                    if (!((vcb) this).field_w) {
                      break L4;
                    } else {
                      if ((((vcb) this).field_P.field_h >> 1) + (((vcb) this).field_P.field_g + param1) >= kc.field_b) {
                        this.a(107, -((vcb) this).field_x + ((vcb) this).field_M);
                        break L4;
                      } else {
                        this.a(-102, ((vcb) this).field_M - -((vcb) this).field_x);
                        break L4;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("vcb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
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
        int discarded$1 = -8;
        this.i();
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = VoidHunters.field_G;
          if (param1 < 0) {
            ((vcb) this).field_L = 0;
            break L0;
          } else {
            if (param1 > 65536) {
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
        int var4 = -34;
        ((vcb) this).c(-3393, var3 <= var2 ? 0 : (((vcb) this).field_P.field_r + -var2 << 16) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        this.b(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (!(!(((vcb) this).field_l instanceof lt))) {
            ((lt) (Object) ((vcb) this).field_l).a(((vcb) this).field_M, ((vcb) this).field_L, (vcb) this, -125);
        }
    }

    private final void a(int param0, boolean param1) {
        htb stackIn_1_0 = null;
        htb stackIn_2_0 = null;
        htb stackIn_3_0 = null;
        htb stackIn_4_0 = null;
        htb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        htb stackIn_8_0 = null;
        htb stackIn_9_0 = null;
        htb stackIn_10_0 = null;
        htb stackIn_11_0 = null;
        htb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        htb stackIn_15_0 = null;
        htb stackIn_16_0 = null;
        htb stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        htb stackIn_20_0 = null;
        htb stackIn_21_0 = null;
        htb stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        htb stackOut_0_0 = null;
        htb stackOut_1_0 = null;
        htb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        htb stackOut_2_0 = null;
        htb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        htb stackOut_7_0 = null;
        htb stackOut_8_0 = null;
        htb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        htb stackOut_9_0 = null;
        htb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        htb stackOut_14_0 = null;
        htb stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        htb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        htb stackOut_19_0 = null;
        htb stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        htb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
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
              if (!((vcb) this).field_w) {
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
        L2: {
          stackIn_5_0.field_x = stackIn_5_1 != 0;
          if (((vcb) this).field_P.field_t instanceof htb) {
            L3: {
              L4: {
                stackOut_7_0 = (htb) (Object) ((vcb) this).field_P.field_t;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (param1) {
                  break L4;
                } else {
                  stackOut_8_0 = (htb) (Object) stackIn_8_0;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (!((vcb) this).field_w) {
                    stackOut_11_0 = (htb) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (htb) (Object) stackIn_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (htb) (Object) stackIn_10_0;
              stackOut_10_1 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              break L3;
            }
            stackIn_12_0.field_x = stackIn_12_1 != 0;
            break L2;
          } else {
            break L2;
          }
        }
        L5: {
          if (((vcb) this).field_A == null) {
            break L5;
          } else {
            L6: {
              stackOut_14_0 = ((vcb) this).field_A;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param1) {
                stackOut_16_0 = (htb) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L6;
              } else {
                stackOut_15_0 = (htb) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L6;
              }
            }
            stackIn_17_0.field_x = stackIn_17_1 != 0;
            break L5;
          }
        }
        L7: {
          if (null == ((vcb) this).field_v) {
            break L7;
          } else {
            L8: {
              stackOut_19_0 = ((vcb) this).field_v;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param1) {
                stackOut_21_0 = (htb) (Object) stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (htb) (Object) stackIn_20_0;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            stackIn_22_0.field_x = stackIn_22_1 != 0;
            break L7;
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

    private final void h() {
        int var2 = null != ((vcb) this).field_D ? ((vcb) this).field_D.field_g - -((vcb) this).field_D.field_h : ((vcb) this).field_N.field_g;
        int var3 = ((vcb) this).field_C != null ? ((vcb) this).field_C.field_g - ((vcb) this).field_P.field_h : ((vcb) this).field_N.field_h + ((vcb) this).field_N.field_g + -((vcb) this).field_P.field_h;
        this.b(var3 <= var2 ? 0 : (((vcb) this).field_P.field_g + -var2 << 16) / (var3 - var2), 65536);
    }

    vcb(int param0, int param1, int param2, int param3, wwa param4, wwa param5, wwa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((vcb) this).field_F = 8192;
        ((vcb) this).field_x = 8192;
        ((vcb) this).field_B = 0;
        ((vcb) this).field_y = true;
        ((vcb) this).field_L = 32768;
        ((vcb) this).field_H = 1024;
        ((vcb) this).field_J = 0;
        ((vcb) this).field_K = 1024;
        ((vcb) this).field_M = 32768;
        try {
          L0: {
            L1: {
              ((vcb) this).field_u = new shb[6];
              ef dupTemp$2 = new ef(param0, param1, param7, param8, (wwa) null, (sba) null, (shb) (Object) new htb(0, 0, param7, param8, param6, (sba) null), false, false);
              ((vcb) this).field_P = dupTemp$2;
              ((vcb) this).field_u[0] = (shb) (Object) dupTemp$2;
              htb dupTemp$3 = new htb(param0, param1, param7, param8, param5, (sba) null);
              ((vcb) this).field_N = dupTemp$3;
              ((vcb) this).field_u[1] = (shb) (Object) dupTemp$3;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param11) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vcb) this).field_w = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param12) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((vcb) this).field_G = stackIn_7_1 != 0;
            ((vcb) this).field_J = param9;
            ((vcb) this).field_B = param10;
            this.b(param13, 65536);
            ((vcb) this).c(-3393, param14);
            ((vcb) this).a(param0, param2, param3, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var16;
            stackOut_9_1 = new StringBuilder().append("vcb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void j(byte param0) {
        if (param0 != -7) {
            field_E = null;
        }
        field_E = null;
        field_z = null;
    }

    private final int k() {
        return (((vcb) this).field_P.field_f << 16) / ((vcb) this).field_N.field_f;
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
        ((vcb) this).field_P.field_r = (((vcb) this).field_L * (-var2 + var3) >> 16) + var2;
        if (param0 != 0) {
            vcb.f(-79);
        }
    }

    private final void i() {
        int var2 = null == ((vcb) this).field_D ? ((vcb) this).field_N.field_g : ((vcb) this).field_D.field_h + ((vcb) this).field_D.field_g;
        int var3 = null != ((vcb) this).field_C ? -((vcb) this).field_P.field_h + ((vcb) this).field_C.field_g : ((vcb) this).field_N.field_h + (((vcb) this).field_N.field_g + -((vcb) this).field_P.field_h);
        ((vcb) this).field_P.field_g = ((var3 + -var2) * ((vcb) this).field_M >> 16) + var2;
    }

    final static tjb a(int param0, llb param1, llb param2, llb param3, rn param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        tjb[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        rn var13_ref_rn = null;
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
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        tjb stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        tjb stackOut_26_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param4.field_l != null) {
                  stackOut_6_0 = param4.field_l.length;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param4.field_n) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = param4.field_n.length;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                if (param0 == 0) {
                  break L3;
                } else {
                  vcb.j((byte) 98);
                  break L3;
                }
              }
              L4: {
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
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (var12 >= param4.field_l.length) {
                      break L4;
                    } else {
                      var13_ref_rn = lnb.field_i.a((byte) -72, param4.field_l[var12]);
                      var8[var12] = var13_ref_rn.field_p;
                      var9[var12] = param4.field_q[var12];
                      var11[var12] = vcb.a(0, param1, param2, param3, var13_ref_rn);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param4.field_n != null) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (var14 >= param4.field_n.length) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param4.field_n[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = cu.field_p;
                          var9[var14 + var12] = param4.field_m[var14];
                          var10[var12 - -var14] = param4.field_n[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = usa.field_o.a(var15, -118);
                            var8[var14 + var12] = var16.a(80);
                            var9[var14 + var12] = param4.field_m[var14];
                            if (var9[var12 - -var14] > 0) {
                              break L9;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            }
                          }
                          var10[var14 + var12] = param4.field_n[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
              stackOut_26_0 = new tjb(0L, param1, param2, param3, var11, var24, var8, var25);
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (tjb) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("vcb.V(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return stackIn_27_0;
    }

    final void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (null != ((vcb) this).field_D) {
            ((vcb) this).field_D.field_g = 0;
            ((vcb) this).field_D.field_r = ((vcb) this).field_f - ((vcb) this).field_D.field_f >> 1;
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
            ((vcb) this).field_C.field_r = ((vcb) this).field_f + -((vcb) this).field_C.field_f >> 1;
            ((vcb) this).field_N.field_h = ((vcb) this).field_h + (-((vcb) this).field_N.field_g - ((vcb) this).field_C.field_h);
            break L1;
          } else {
            ((vcb) this).field_N.field_h = -((vcb) this).field_N.field_g + ((vcb) this).field_h;
            break L1;
          }
        }
        L2: {
          int discarded$1 = -8;
          this.i();
          if (((vcb) this).field_A == null) {
            ((vcb) this).field_N.field_r = 0;
            break L2;
          } else {
            ((vcb) this).field_A.field_r = 0;
            ((vcb) this).field_A.field_g = ((vcb) this).field_h - ((vcb) this).field_A.field_h >> 1;
            ((vcb) this).field_N.field_r = ((vcb) this).field_A.field_r + ((vcb) this).field_A.field_f;
            break L2;
          }
        }
        L3: {
          if (((vcb) this).field_v != null) {
            ((vcb) this).field_v.field_r = ((vcb) this).field_f + -((vcb) this).field_v.field_f;
            ((vcb) this).field_v.field_g = -((vcb) this).field_v.field_h + ((vcb) this).field_h >> 1;
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
        ef var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((vcb) this).field_L = -9;
                break L1;
              }
            }
            L2: {
              var3 = ((vcb) this).field_P;
              if (var3 == null) {
                break L2;
              } else {
                if (!((shb) (Object) var3).a(param0, param1)) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vcb.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 < 0) {
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
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 != 32) {
            vcb.j((byte) -101);
        }
        if (hlb.field_p < 224) {
            var1 = hlb.field_p % 32;
            re.a(-var1 + hlb.field_p - -32, (byte) -100);
        } else {
            re.a(256, (byte) -126);
        }
    }

    private final void a(byte param0, int param1) {
        ((vcb) this).c(-3393, param1);
        if (((vcb) this).field_l instanceof lt) {
            ((lt) (Object) ((vcb) this).field_l).a(((vcb) this).field_L, ((vcb) this).field_L, (vcb) this, -123);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (!((vcb) this).field_y) {
                  break L1;
                } else {
                  if (!((vcb) this).field_P.e((byte) -120)) {
                    break L1;
                  } else {
                    if (98 == param1) {
                      this.a((byte) -17, ((vcb) this).field_L - ((vcb) this).field_K);
                      stackOut_38_0 = 1;
                      stackIn_39_0 = stackOut_38_0;
                      return stackIn_39_0 != 0;
                    } else {
                      if (param1 != 99) {
                        if (96 != param1) {
                          if (param1 != 97) {
                            if (param1 != 104) {
                              if (param1 != 105) {
                                if (102 == param1) {
                                  L2: {
                                    if (!((vcb) this).field_G) {
                                      break L2;
                                    } else {
                                      if (!si.field_o[82]) {
                                        break L2;
                                      } else {
                                        this.a((byte) -17, 0);
                                        stackOut_32_0 = 1;
                                        stackIn_33_0 = stackOut_32_0;
                                        return stackIn_33_0 != 0;
                                      }
                                    }
                                  }
                                  if (((vcb) this).field_w) {
                                    this.a(-119, 0);
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    return stackIn_37_0 != 0;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  if (103 != param1) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!((vcb) this).field_G) {
                                        break L3;
                                      } else {
                                        if (!si.field_o[82]) {
                                          break L3;
                                        } else {
                                          this.a((byte) -17, 65536);
                                          stackOut_25_0 = 1;
                                          stackIn_26_0 = stackOut_25_0;
                                          return stackIn_26_0 != 0;
                                        }
                                      }
                                    }
                                    if (!((vcb) this).field_w) {
                                      break L1;
                                    } else {
                                      this.a(param0 + 15790, 65536);
                                      stackOut_28_0 = 1;
                                      stackIn_29_0 = stackOut_28_0;
                                      return stackIn_29_0 != 0;
                                    }
                                  }
                                }
                              } else {
                                int discarded$2 = 110;
                                this.a((byte) -17, ((vcb) this).field_L + this.k());
                                stackOut_19_0 = 1;
                                stackIn_20_0 = stackOut_19_0;
                                return stackIn_20_0 != 0;
                              }
                            } else {
                              int discarded$3 = 110;
                              this.a((byte) -17, ((vcb) this).field_L - this.k());
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            }
                          } else {
                            this.a(116, ((vcb) this).field_M - -((vcb) this).field_H);
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          }
                        } else {
                          this.a(param0 + 15923, ((vcb) this).field_M + -((vcb) this).field_H);
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      } else {
                        this.a((byte) -17, ((vcb) this).field_K + ((vcb) this).field_L);
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      }
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var5;
            stackOut_42_1 = new StringBuilder().append("vcb.N(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L4;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ')');
        }
        return stackIn_41_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[250][];
        field_z = (dja) (Object) new ej();
    }
}
