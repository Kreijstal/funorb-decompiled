/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl extends hf {
    private long field_O;
    private int field_T;
    private boolean field_N;
    private boolean field_M;
    static nh[] field_R;
    static boolean field_S;
    private int field_Q;
    private int field_L;
    private long field_K;
    private int field_P;
    static int field_J;

    private final int k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = ((kl) this).field_p.length();
            if (((kl) this).field_L == var2_int) {
              stackOut_4_0 = ((kl) this).field_L;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 <= -121) {
                var3 = ((kl) this).field_L - -1;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_int <= var3) {
                        break L3;
                      } else {
                        stackOut_11_0 = 32;
                        stackIn_19_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (stackIn_12_0 == ((kl) this).field_p.charAt(-1 + var3)) {
                            break L3;
                          } else {
                            var3++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var3;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = -45;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.CA(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        va var2_ref = null;
        em var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!((kl) this).field_N) {
              ((kl) this).field_t = 0;
              ((kl) this).field_q = 0;
              return;
            } else {
              if (!(((kl) this).field_l instanceof va)) {
                return;
              } else {
                L1: {
                  if (param0 <= -41) {
                    break L1;
                  } else {
                    boolean discarded$1 = ((kl) this).a(63, (vg) null, -100, (byte) -115, 14, 55, 25);
                    break L1;
                  }
                }
                var2_ref = (va) (Object) ((kl) this).field_l;
                var3 = var2_ref.a((vg) this, true);
                var4 = var3.a(-17287);
                var5 = var2_ref.a((vg) this, -120);
                var6 = var2_ref.a((byte) -120) >> -268237535;
                if (var4 >= -var6 + var5) {
                  L2: {
                    L3: {
                      var7 = ((kl) this).field_t - -var3.a(103, ((kl) this).field_L);
                      if (~(-var6 + var5) > ~var7) {
                        break L3;
                      } else {
                        if (~var6 >= ~var7) {
                          break L2;
                        } else {
                          ((kl) this).field_t = ((kl) this).field_t - (var7 + -var6);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ((kl) this).field_t = -var6 + (var5 + (-var7 + ((kl) this).field_t));
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (((kl) this).field_t <= 0) {
                        break L5;
                      } else {
                        ((kl) this).field_t = 0;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (~((kl) this).field_t <= ~(-var5 - -var6)) {
                      break L4;
                    } else {
                      ((kl) this).field_t = var6 + -var5;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  ((kl) this).field_q = 0;
                  ((kl) this).field_t = 0;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.R(" + param0 + ')');
        }
    }

    final void a(boolean param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            if (param2 == -19116) {
              L2: {
                ((kl) this).field_p = param1;
                var4_int = param1.length();
                if (-1 == ((kl) this).field_P) {
                  break L2;
                } else {
                  if (~var4_int >= ~((kl) this).field_P) {
                    break L2;
                  } else {
                    ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_P);
                    break L2;
                  }
                }
              }
              L3: {
                int dupTemp$3 = ((kl) this).field_p.length();
                ((kl) this).field_Q = dupTemp$3;
                ((kl) this).field_L = dupTemp$3;
                if (!param0) {
                  ((kl) this).m((byte) -9);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("kl.IA(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final void h(byte param0) {
        ((kl) this).field_p = "";
        if (param0 != 88) {
            return;
        }
        try {
            ((kl) this).field_L = 0;
            ((kl) this).field_Q = 0;
            ((kl) this).m((byte) -76);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "kl.V(" + param0 + ')');
        }
    }

    void m(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((kl) this).field_u instanceof kd) {
                ((kd) (Object) ((kl) this).field_u).a(true, (kl) this);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 84 % ((35 - param0) / 33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.DA(" + param0 + ')');
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_98_0 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        Object stackIn_110_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_118_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_110_0 = null;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_115_0 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 63) {
                break L1;
              } else {
                ((kl) this).field_P = 111;
                break L1;
              }
            }
            L2: {
              ((kl) this).field_K = la.a(false);
              if (param1 == 60) {
                break L2;
              } else {
                if (param1 != 62) {
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (param1 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (~((kl) this).field_Q == ~((kl) this).field_L) {
                            break L4;
                          } else {
                            this.i(63);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (((kl) this).field_P == -1) {
                              break L6;
                            } else {
                              if (((kl) this).field_p.length() >= ((kl) this).field_P) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (~((kl) this).field_L <= ~((kl) this).field_p.length()) {
                                break L8;
                              } else {
                                ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                                ((kl) this).field_L = ((kl) this).field_L + 1;
                                ((kl) this).field_Q = ((kl) this).field_L;
                                if (!DrPhlogistonSavesTheEarth.field_D) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            ((kl) this).field_p = ((kl) this).field_p + param1;
                            int dupTemp$1 = ((kl) this).field_p.length();
                            ((kl) this).field_L = dupTemp$1;
                            ((kl) this).field_Q = dupTemp$1;
                            break L7;
                          }
                          ((kl) this).m((byte) -102);
                          break L5;
                        }
                        stackOut_31_0 = 1;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      }
                    }
                  }
                  L9: {
                    if (85 != param0) {
                      if (param0 != 101) {
                        if (param0 != 13) {
                          if (param0 == 96) {
                            if (((kl) this).field_L <= 0) {
                              break L9;
                            } else {
                              L10: {
                                stackOut_109_0 = this;
                                stackIn_114_0 = stackOut_109_0;
                                stackIn_110_0 = stackOut_109_0;
                                if (ck.field_f[82]) {
                                  stackOut_114_0 = this;
                                  stackOut_114_1 = this.l((byte) 75);
                                  stackIn_115_0 = stackOut_114_0;
                                  stackIn_115_1 = stackOut_114_1;
                                  break L10;
                                } else {
                                  stackOut_110_0 = this;
                                  stackIn_112_0 = stackOut_110_0;
                                  stackOut_112_0 = this;
                                  stackOut_112_1 = -1 + ((kl) this).field_L;
                                  stackIn_115_0 = stackOut_112_0;
                                  stackIn_115_1 = stackOut_112_1;
                                  break L10;
                                }
                              }
                              this.a(stackIn_115_1, (byte) -59);
                              stackOut_115_0 = 1;
                              stackIn_116_0 = stackOut_115_0;
                              return stackIn_116_0 != 0;
                            }
                          } else {
                            if (param0 == 97) {
                              if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                                break L9;
                              } else {
                                L11: {
                                  stackOut_100_0 = this;
                                  stackIn_105_0 = stackOut_100_0;
                                  stackIn_101_0 = stackOut_100_0;
                                  if (ck.field_f[82]) {
                                    stackOut_105_0 = this;
                                    stackOut_105_1 = this.k(-125);
                                    stackIn_106_0 = stackOut_105_0;
                                    stackIn_106_1 = stackOut_105_1;
                                    break L11;
                                  } else {
                                    stackOut_101_0 = this;
                                    stackIn_103_0 = stackOut_101_0;
                                    stackOut_103_0 = this;
                                    stackOut_103_1 = ((kl) this).field_L - -1;
                                    stackIn_106_0 = stackOut_103_0;
                                    stackIn_106_1 = stackOut_103_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_106_1, (byte) -59);
                                stackOut_106_0 = 1;
                                stackIn_107_0 = stackOut_106_0;
                                return stackIn_107_0 != 0;
                              }
                            } else {
                              if (param0 == 102) {
                                this.a(0, (byte) -59);
                                stackOut_97_0 = 1;
                                stackIn_98_0 = stackOut_97_0;
                                return stackIn_98_0 != 0;
                              } else {
                                if (param0 == 103) {
                                  this.a(((kl) this).field_p.length(), (byte) -59);
                                  stackOut_95_0 = 1;
                                  stackIn_96_0 = stackOut_95_0;
                                  return stackIn_96_0 != 0;
                                } else {
                                  if (param0 == 84) {
                                    this.j(0);
                                    stackOut_93_0 = 1;
                                    stackIn_94_0 = stackOut_93_0;
                                    return stackIn_94_0 != 0;
                                  } else {
                                    L12: {
                                      if (!ck.field_f[82]) {
                                        break L12;
                                      } else {
                                        if (param0 != 65) {
                                          break L12;
                                        } else {
                                          this.h(-1);
                                          stackOut_75_0 = 1;
                                          stackIn_76_0 = stackOut_75_0;
                                          return stackIn_76_0 != 0;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (!ck.field_f[82]) {
                                        break L13;
                                      } else {
                                        if (param0 == 66) {
                                          this.i((byte) 124);
                                          stackOut_91_0 = 1;
                                          stackIn_92_0 = stackOut_91_0;
                                          return stackIn_92_0 != 0;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (!ck.field_f[82]) {
                                      break L9;
                                    } else {
                                      if (param0 == 67) {
                                        this.g((byte) -53);
                                        stackOut_89_0 = 1;
                                        stackIn_90_0 = stackOut_89_0;
                                        return stackIn_90_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((kl) this).h((byte) 88);
                          stackOut_54_0 = 1;
                          stackIn_55_0 = stackOut_54_0;
                          return stackIn_55_0 != 0;
                        }
                      } else {
                        if (((kl) this).field_Q == ((kl) this).field_L) {
                          if (~((kl) this).field_L <= ~((kl) this).field_p.length()) {
                            break L9;
                          } else {
                            ((kl) this).field_Q = 1 + ((kl) this).field_L;
                            this.i(-108);
                            stackOut_51_0 = 1;
                            stackIn_52_0 = stackOut_51_0;
                            return stackIn_52_0 != 0;
                          }
                        } else {
                          this.i(-79);
                          stackOut_48_0 = 1;
                          stackIn_49_0 = stackOut_48_0;
                          return stackIn_49_0 != 0;
                        }
                      }
                    } else {
                      if (((kl) this).field_Q == ((kl) this).field_L) {
                        if (((kl) this).field_L > 0) {
                          ((kl) this).field_Q = ((kl) this).field_L + -1;
                          this.i(-117);
                          stackOut_42_0 = 1;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0 != 0;
                        } else {
                          break L9;
                        }
                      } else {
                        this.i(-48);
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      }
                    }
                  }
                  stackOut_117_0 = 0;
                  stackIn_118_0 = stackOut_117_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) var5;
            stackOut_119_1 = new StringBuilder().append("kl.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param2 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L14;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L14;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_123_0, stackIn_123_2 + ',' + param3 + ')');
        }
        return stackIn_118_0 != 0;
    }

    kl(String param0, fd param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((kl) this).field_O = 0L;
        ((kl) this).field_M = false;
        ((kl) this).field_T = -1;
        try {
          L0: {
            ((kl) this).field_P = param2;
            ((kl) this).field_l = ja.field_Q.field_f;
            ((kl) this).a(true, param0, -19116);
            ((kl) this).field_N = true;
            ((kl) this).field_K = la.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kl.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (~((kl) this).field_L == ~((kl) this).field_Q) {
                break L1;
              } else {
                L2: {
                  if (~((kl) this).field_Q > ~((kl) this).field_L) {
                    stackOut_6_0 = ((kl) this).field_Q;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ((kl) this).field_L;
                    stackIn_7_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var2_int = stackIn_7_0;
                  if (((kl) this).field_L > ((kl) this).field_Q) {
                    stackOut_10_0 = ((kl) this).field_L;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_8_0 = ((kl) this).field_Q;
                    stackIn_11_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var3 = stackIn_11_0;
                ((kl) this).field_L = var2_int;
                ((kl) this).field_Q = var2_int;
                ((kl) this).field_p = ((kl) this).field_p.substring(0, var2_int) + ((kl) this).field_p.substring(var3, ((kl) this).field_p.length());
                ((kl) this).m((byte) -45);
                break L1;
              }
            }
            var2_int = -42 % ((param0 - -1) / 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.U(" + param0 + ')');
        }
    }

    private final int l(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        char stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        char stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (((kl) this).field_L == 0) {
              stackOut_4_0 = ((kl) this).field_L;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 == 75) {
                var2_int = -1 + ((kl) this).field_L;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (0 >= var2_int) {
                        break L3;
                      } else {
                        stackOut_11_0 = ((kl) this).field_p.charAt(var2_int - 1);
                        stackIn_19_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var3 != 0) {
                          break L2;
                        } else {
                          if (stackIn_12_0 == 32) {
                            break L3;
                          } else {
                            var2_int--;
                            if (var3 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 119;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.P(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        va var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              this.k((byte) -101);
              if (((kl) this).field_y == 1) {
                L2: {
                  if (((kl) this).field_l instanceof va) {
                    var5_ref = (va) (Object) ((kl) this).field_l;
                    var6 = var5_ref.a((vg) this, param1, param2, ob.field_g, 3, ck.field_c);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((kl) this).field_M) {
                          break L3;
                        } else {
                          if (~((kl) this).field_T >= ~var6) {
                            break L3;
                          } else {
                            if (var6 > ((kl) this).field_Q) {
                              var6 = ((kl) this).field_T;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((kl) this).field_L = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((kl) this).field_K = la.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param3 <= -127) {
                break L4;
              } else {
                this.g((byte) 12);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("kl.I(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((kl) this).field_L = param0;
              if (!ck.field_f[81]) {
                ((kl) this).field_Q = ((kl) this).field_L;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -59) {
                break L2;
              } else {
                ((kl) this).field_K = -78L;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "kl.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, (byte) 115, param4, param5, param6)) {
                break L1;
              } else {
                if (!(((kl) this).field_l instanceof va)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((va) (Object) ((kl) this).field_l).a((vg) this, param5, param6, ob.field_g, 3, ck.field_c);
                    stackOut_4_0 = this;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var8_int != -1) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = var8_int;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 0;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_8_1, (byte) -59);
                    var8_long = la.a(false);
                    stackOut_8_0 = this;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (250L <= -((kl) this).field_O + var8_long) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((kl) this).field_M = stackIn_12_1 != 0;
                    if (!((kl) this).field_M) {
                      break L4;
                    } else {
                      L5: {
                        ((kl) this).field_Q = this.l((byte) 75);
                        ((kl) this).field_L = this.k(-124);
                        if (((kl) this).field_L <= 0) {
                          break L5;
                        } else {
                          if (32 == ((kl) this).field_p.charAt(((kl) this).field_L - 1)) {
                            ((kl) this).field_L = ((kl) this).field_L - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((kl) this).field_T = ((kl) this).field_L;
                      break L4;
                    }
                  }
                  ((kl) this).field_O = var8_long;
                  stackOut_23_0 = 1;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                }
              }
            }
            if (param3 > 113) {
              stackOut_28_0 = 0;
              stackIn_29_0 = stackOut_28_0;
              break L0;
            } else {
              stackOut_26_0 = 1;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var8;
            stackOut_30_1 = new StringBuilder().append("kl.JA(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_29_0 != 0;
    }

    final static String a(String param0, vj param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1.a(0)) {
              L1: {
                if (param2 == 27867) {
                  break L1;
                } else {
                  field_R = null;
                  break L1;
                }
              }
              stackOut_6_0 = param3 + " - " + param1.d((byte) 95) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("kl.AA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void j(byte param0) {
        try {
            field_R = null;
            int var1_int = 94 % ((25 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "kl.HA(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_J = 68;
                break L1;
              }
            }
            L2: {
              if (((kl) this).field_u instanceof kd) {
                ((kd) (Object) ((kl) this).field_u).a((kl) this, (byte) 83);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.T(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        try {
            RuntimeException runtimeException = null;
            String var2 = null;
            RuntimeException decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = this.b(false);
                  if (var2.length() <= 0) {
                    break L1;
                  } else {
                    java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b(false)), (java.awt.datatransfer.ClipboardOwner) null);
                    break L1;
                  }
                }
                L2: {
                  if (param0 > 54) {
                    break L2;
                  } else {
                    ((kl) this).a((vg) null, 116, 13, (byte) 24);
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              runtimeException = decompiledCaughtException;
              throw ie.a((Throwable) (Object) runtimeException, "kl.S(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_11_0 = 0;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        String stackOut_11_0 = null;
        Object stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              if (((kl) this).field_L > ((kl) this).field_Q) {
                stackOut_3_0 = ((kl) this).field_Q;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((kl) this).field_L;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            if (!param0) {
              L2: {
                if (~((kl) this).field_Q > ~((kl) this).field_L) {
                  stackOut_10_0 = ((kl) this).field_L;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = ((kl) this).field_Q;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              var3 = stackIn_11_0;
              stackOut_11_0 = ((kl) this).field_p.substring(var2_int, var3);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (String) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.EA(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        va var5_ref = null;
        long var6 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -21) {
              L1: {
                if (null == ((kl) this).field_l) {
                  break L1;
                } else {
                  if (0 != param1) {
                    break L1;
                  } else {
                    ((kl) this).field_l.a(((kl) this).field_E, 102, (vg) this, param3, param0);
                    if (((kl) this).field_l instanceof va) {
                      L2: {
                        var5_ref = (va) (Object) ((kl) this).field_l;
                        if (~((kl) this).field_Q == ~((kl) this).field_L) {
                          break L2;
                        } else {
                          var5_ref.a(((kl) this).field_L, param3, -128, (vg) this, param0, ((kl) this).field_Q);
                          break L2;
                        }
                      }
                      var6 = la.a(false);
                      if ((-((kl) this).field_K + var6) % 1000L < 500L) {
                        var5_ref.a(param3, param0, (vg) this, ((kl) this).field_L, (byte) -90);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var5, "kl.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void g(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                    var3 = 108 / ((64 - param0) / 44);
                    this.i(-122);
                    this.a(5, var2);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw ie.a((Throwable) (Object) var2_ref2, "kl.GA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.i((byte) 59);
              if (param0 == -1) {
                break L1;
              } else {
                this.g((byte) 55);
                break L1;
              }
            }
            this.i(-45);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "kl.W(" + param0 + ')');
        }
    }

    private final void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (((kl) this).field_P != -1) {
                var3_int = ((kl) this).field_P - ((kl) this).field_p.length();
                if (var3_int >= 0) {
                  return;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (((kl) this).field_L != ((kl) this).field_p.length()) {
                  break L3;
                } else {
                  ((kl) this).field_p = ((kl) this).field_p + param1;
                  if (!DrPhlogistonSavesTheEarth.field_D) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
              break L2;
            }
            if (param0 == 5) {
              ((kl) this).field_L = ((kl) this).field_L + param1.length();
              ((kl) this).field_Q = ((kl) this).field_L;
              ((kl) this).m((byte) 122);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) runtimeException;
            stackOut_18_1 = new StringBuilder().append("kl.Q(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new nh[5];
    }
}
