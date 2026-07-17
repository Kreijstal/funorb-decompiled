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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = ((kl) this).field_p.length();
        if (((kl) this).field_L == var2) {
          return ((kl) this).field_L;
        } else {
          if (param0 <= -121) {
            var3 = ((kl) this).field_L - -1;
            L0: while (true) {
              if (var2 > var3) {
                if (32 != ((kl) this).field_p.charAt(-1 + var3)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return -45;
          }
        }
    }

    private final void k() {
        em var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        va var10 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((kl) this).field_N) {
          ((kl) this).field_t = 0;
          ((kl) this).field_q = 0;
          return;
        } else {
          if (!(((kl) this).field_l instanceof va)) {
            return;
          } else {
            var10 = (va) (Object) ((kl) this).field_l;
            var3 = var10.a((vg) this, true);
            var4 = var3.a(-17287);
            var5 = var10.a((vg) this, -120);
            var6 = var10.a((byte) -120) >> 1;
            if (var4 >= -var6 + var5) {
              var7 = ((kl) this).field_t - -var3.a(103, ((kl) this).field_L);
              if (-var6 + var5 < var7) {
                ((kl) this).field_t = -var6 + (var5 + (-var7 + ((kl) this).field_t));
                if (((kl) this).field_t <= 0) {
                  if (((kl) this).field_t >= -var5 - -var6) {
                    return;
                  } else {
                    ((kl) this).field_t = var6 + -var5;
                    return;
                  }
                } else {
                  ((kl) this).field_t = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (((kl) this).field_t <= 0) {
                    if (((kl) this).field_t < -var5 - -var6) {
                      ((kl) this).field_t = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((kl) this).field_t = 0;
                    return;
                  }
                } else {
                  ((kl) this).field_t = ((kl) this).field_t - (var7 + -var6);
                  if (((kl) this).field_t <= 0) {
                    if (((kl) this).field_t >= -var5 - -var6) {
                      return;
                    } else {
                      ((kl) this).field_t = var6 + -var5;
                      return;
                    }
                  } else {
                    ((kl) this).field_t = 0;
                    return;
                  }
                }
              }
            } else {
              ((kl) this).field_q = 0;
              ((kl) this).field_t = 0;
              return;
            }
          }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
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
                  if (var4_int <= ((kl) this).field_P) {
                    break L2;
                  } else {
                    ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_P);
                    break L2;
                  }
                }
              }
              int dupTemp$2 = ((kl) this).field_p.length();
              ((kl) this).field_Q = dupTemp$2;
              ((kl) this).field_L = dupTemp$2;
              if (!param0) {
                ((kl) this).m((byte) -9);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("kl.IA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    final void h(byte param0) {
        ((kl) this).field_p = "";
        if (param0 != 88) {
            return;
        }
        ((kl) this).field_L = 0;
        ((kl) this).field_Q = 0;
        ((kl) this).m((byte) -76);
    }

    void m(byte param0) {
        if (!(!(((kl) this).field_u instanceof kd))) {
            ((kd) (Object) ((kl) this).field_u).a(true, (kl) this);
        }
        int var2 = 84 % ((35 - param0) / 33);
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_68_0 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_73_0 = 0;
        Object stackOut_64_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
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
            ((kl) this).field_K = la.a(false);
            if (param1 == 60) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (param1 != 62) {
                L2: {
                  if (param1 < 32) {
                    break L2;
                  } else {
                    if (param1 > 126) {
                      break L2;
                    } else {
                      L3: {
                        if (~((kl) this).field_Q == ~((kl) this).field_L) {
                          break L3;
                        } else {
                          this.i(63);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (((kl) this).field_P == -1) {
                            break L5;
                          } else {
                            if (((kl) this).field_p.length() >= ((kl) this).field_P) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (~((kl) this).field_L <= ~((kl) this).field_p.length()) {
                            ((kl) this).field_p = ((kl) this).field_p + param1;
                            int dupTemp$3 = ((kl) this).field_p.length();
                            ((kl) this).field_L = dupTemp$3;
                            ((kl) this).field_Q = dupTemp$3;
                            break L6;
                          } else {
                            ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                            ((kl) this).field_L = ((kl) this).field_L + 1;
                            ((kl) this).field_Q = ((kl) this).field_L;
                            break L6;
                          }
                        }
                        ((kl) this).m((byte) -102);
                        break L4;
                      }
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    }
                  }
                }
                L7: {
                  if (85 != param0) {
                    if (param0 != 101) {
                      if (param0 != 13) {
                        if (param0 == 96) {
                          if (((kl) this).field_L <= 0) {
                            break L7;
                          } else {
                            L8: {
                              stackOut_70_0 = this;
                              stackIn_72_0 = stackOut_70_0;
                              stackIn_71_0 = stackOut_70_0;
                              if (ck.field_f[82]) {
                                int discarded$4 = 75;
                                stackOut_72_0 = this;
                                stackOut_72_1 = this.l();
                                stackIn_73_0 = stackOut_72_0;
                                stackIn_73_1 = stackOut_72_1;
                                break L8;
                              } else {
                                stackOut_71_0 = this;
                                stackOut_71_1 = -1 + ((kl) this).field_L;
                                stackIn_73_0 = stackOut_71_0;
                                stackIn_73_1 = stackOut_71_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_73_1, (byte) -59);
                            stackOut_73_0 = 1;
                            stackIn_74_0 = stackOut_73_0;
                            return stackIn_74_0 != 0;
                          }
                        } else {
                          if (param0 == 97) {
                            if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                              break L7;
                            } else {
                              L9: {
                                stackOut_64_0 = this;
                                stackIn_66_0 = stackOut_64_0;
                                stackIn_65_0 = stackOut_64_0;
                                if (ck.field_f[82]) {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = this.k(-125);
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  break L9;
                                } else {
                                  stackOut_65_0 = this;
                                  stackOut_65_1 = ((kl) this).field_L - -1;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  break L9;
                                }
                              }
                              this.a(stackIn_67_1, (byte) -59);
                              stackOut_67_0 = 1;
                              stackIn_68_0 = stackOut_67_0;
                              return stackIn_68_0 != 0;
                            }
                          } else {
                            if (param0 == 102) {
                              this.a(0, (byte) -59);
                              stackOut_61_0 = 1;
                              stackIn_62_0 = stackOut_61_0;
                              return stackIn_62_0 != 0;
                            } else {
                              if (param0 == 103) {
                                this.a(((kl) this).field_p.length(), (byte) -59);
                                stackOut_59_0 = 1;
                                stackIn_60_0 = stackOut_59_0;
                                return stackIn_60_0 != 0;
                              } else {
                                if (param0 == 84) {
                                  this.j(0);
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  return stackIn_58_0 != 0;
                                } else {
                                  L10: {
                                    if (!ck.field_f[82]) {
                                      break L10;
                                    } else {
                                      if (param0 != 65) {
                                        break L10;
                                      } else {
                                        int discarded$5 = -1;
                                        this.h();
                                        stackOut_45_0 = 1;
                                        stackIn_46_0 = stackOut_45_0;
                                        return stackIn_46_0 != 0;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (!ck.field_f[82]) {
                                      break L11;
                                    } else {
                                      if (param0 == 66) {
                                        this.i((byte) 124);
                                        stackOut_55_0 = 1;
                                        stackIn_56_0 = stackOut_55_0;
                                        return stackIn_56_0 != 0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (!ck.field_f[82]) {
                                    break L7;
                                  } else {
                                    if (param0 == 67) {
                                      this.g((byte) -53);
                                      stackOut_53_0 = 1;
                                      stackIn_54_0 = stackOut_53_0;
                                      return stackIn_54_0 != 0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        ((kl) this).h((byte) 88);
                        stackOut_36_0 = 1;
                        stackIn_37_0 = stackOut_36_0;
                        return stackIn_37_0 != 0;
                      }
                    } else {
                      if (((kl) this).field_Q == ((kl) this).field_L) {
                        if (~((kl) this).field_L <= ~((kl) this).field_p.length()) {
                          break L7;
                        } else {
                          ((kl) this).field_Q = 1 + ((kl) this).field_L;
                          this.i(-108);
                          stackOut_33_0 = 1;
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0 != 0;
                        }
                      } else {
                        this.i(-79);
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      }
                    }
                  } else {
                    if (((kl) this).field_Q == ((kl) this).field_L) {
                      if (((kl) this).field_L > 0) {
                        ((kl) this).field_Q = ((kl) this).field_L + -1;
                        this.i(-117);
                        stackOut_26_0 = 1;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0 != 0;
                      } else {
                        break L7;
                      }
                    } else {
                      this.i(-48);
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    }
                  }
                }
                stackOut_75_0 = 0;
                stackIn_76_0 = stackOut_75_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("kl.BA(").append(param0).append(44).append(param1).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L12;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L12;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param3 + 41);
        }
        return stackIn_76_0 != 0;
    }

    kl(String param0, fd param1, int param2) {
        super(param0, param1);
        ((kl) this).field_O = 0L;
        ((kl) this).field_M = false;
        ((kl) this).field_T = -1;
        try {
            ((kl) this).field_P = param2;
            ((kl) this).field_l = ja.field_Q.field_f;
            ((kl) this).a(true, param0, -19116);
            ((kl) this).field_N = true;
            ((kl) this).field_K = la.a(false);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((kl) this).field_L != ((kl) this).field_Q) {
            var2 = ((kl) this).field_Q >= ((kl) this).field_L ? ((kl) this).field_L : ((kl) this).field_Q;
            var3 = ((kl) this).field_L <= ((kl) this).field_Q ? ((kl) this).field_Q : ((kl) this).field_L;
            ((kl) this).field_L = var2;
            ((kl) this).field_Q = var2;
            ((kl) this).field_p = ((kl) this).field_p.substring(0, var2) + ((kl) this).field_p.substring(var3, ((kl) this).field_p.length());
            ((kl) this).m((byte) -45);
        }
        var2 = -42 % ((param0 - -1) / 39);
    }

    private final int l() {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((kl) this).field_L == 0) {
          return ((kl) this).field_L;
        } else {
          var2 = -1 + ((kl) this).field_L;
          L0: while (true) {
            if (0 < var2) {
              if (((kl) this).field_p.charAt(var2 - 1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        va var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              int discarded$2 = -101;
              this.k();
              if (((kl) this).field_y == 1) {
                L2: {
                  if (((kl) this).field_l instanceof va) {
                    var7 = (va) (Object) ((kl) this).field_l;
                    var6 = var7.a((vg) this, param1, param2, ob.field_g, 3, ck.field_c);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((kl) this).field_M) {
                          break L3;
                        } else {
                          if (((kl) this).field_T <= var6) {
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
            if (param3 <= -127) {
              break L0;
            } else {
              this.g((byte) 12);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("kl.I(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, byte param1) {
        ((kl) this).field_L = param0;
        if (!(ck.field_f[81])) {
            ((kl) this).field_Q = ((kl) this).field_L;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var8_int != -1) {
                      stackOut_4_0 = this;
                      stackOut_4_1 = var8_int;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = 0;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, (byte) -59);
                    var8_long = la.a(false);
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (250L <= -((kl) this).field_O + var8_long) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((kl) this).field_M = stackIn_8_1 != 0;
                    if (!((kl) this).field_M) {
                      break L4;
                    } else {
                      L5: {
                        int discarded$1 = 75;
                        ((kl) this).field_Q = this.l();
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
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              }
            }
            if (param3 > 113) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              stackOut_17_0 = 1;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var8;
            stackOut_21_1 = new StringBuilder().append("kl.JA(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final static String a(String param0, vj param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1.a(0)) {
              stackOut_3_0 = param3 + " - " + param1.d((byte) 95) + "%";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kl.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(27867).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void j() {
        field_R = null;
        int var1 = 0;
    }

    private final void j(int param0) {
        if (!(!(((kl) this).field_u instanceof kd))) {
            ((kd) (Object) ((kl) this).field_u).a((kl) this, (byte) 83);
        }
    }

    private final void i(byte param0) {
        try {
            String var2 = null;
            Object var3 = null;
            int discarded$4 = 0;
            var2 = this.b();
            if (var2.length() <= 0) {
              if (param0 <= 54) {
                var3 = null;
                ((kl) this).a((vg) null, 116, 13, (byte) 24);
                return;
              } else {
                return;
              }
            } else {
              int discarded$5 = 0;
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b()), (java.awt.datatransfer.ClipboardOwner) null);
              if (param0 > 54) {
                return;
              } else {
                var3 = null;
                ((kl) this).a((vg) null, 116, 13, (byte) 24);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String b() {
        int var2 = ((kl) this).field_L <= ((kl) this).field_Q ? ((kl) this).field_L : ((kl) this).field_Q;
        int var3 = ((kl) this).field_Q >= ((kl) this).field_L ? ((kl) this).field_Q : ((kl) this).field_L;
        return ((kl) this).field_p.substring(var2, var3);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6 = 0L;
        va var8 = null;
        if (param2 == -21) {
          if (null != ((kl) this).field_l) {
            if (0 == param1) {
              ((kl) this).field_l.a(((kl) this).field_E, 102, (vg) this, param3, param0);
              if (((kl) this).field_l instanceof va) {
                var8 = (va) (Object) ((kl) this).field_l;
                if (((kl) this).field_Q == ((kl) this).field_L) {
                  var6 = la.a(false);
                  if ((-((kl) this).field_K + var6) % 1000L >= 500L) {
                    return;
                  } else {
                    var8.a(param3, param0, (vg) this, ((kl) this).field_L, (byte) -90);
                    return;
                  }
                } else {
                  L0: {
                    var8.a(((kl) this).field_L, param3, -128, (vg) this, param0, ((kl) this).field_Q);
                    var6 = la.a(false);
                    if ((-((kl) this).field_K + var6) % 1000L < 500L) {
                      var8.a(param3, param0, (vg) this, ((kl) this).field_L, (byte) -90);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                var3 = 108 / ((64 - param0) / 44);
                this.i(-122);
                this.a(5, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h() {
        this.i((byte) 59);
        this.i(-45);
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
              if (((kl) this).field_L != ((kl) this).field_p.length()) {
                ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                break L2;
              } else {
                ((kl) this).field_p = ((kl) this).field_p + param1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("kl.Q(").append(5).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new nh[5];
    }
}
