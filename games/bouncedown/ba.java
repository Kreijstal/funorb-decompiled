/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends wd {
    private boolean field_H;
    static tj field_E;
    private boolean field_C;
    private long field_L;
    private int field_F;
    private int field_D;
    static boolean field_B;
    private int field_K;
    private long field_J;
    static boolean field_I;
    private int field_G;

    private final void b(int param0, int param1) {
        ((ba) this).field_G = param0;
        if (!ng.field_a[81]) {
            ((ba) this).field_K = ((ba) this).field_G;
        }
        if (param1 != 102) {
            ((ba) this).field_C = true;
        }
    }

    private final void i(int param0) {
        if (((ba) this).field_n instanceof gl) {
            ((gl) (Object) ((ba) this).field_n).a((byte) -51, (ba) this);
        }
    }

    private final String j(int param0) {
        int var2 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_K : ((ba) this).field_G;
        int var4 = -121 % ((param0 - -61) / 36);
        int var3 = ((ba) this).field_K >= ((ba) this).field_G ? ((ba) this).field_K : ((ba) this).field_G;
        return ((ba) this).field_h.substring(var2, var3);
    }

    private final void f(byte param0) {
        int var2 = 0;
        this.i((byte) 84);
        this.b(true);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((ba) this).field_K == ((ba) this).field_G)) {
            var2 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_K : ((ba) this).field_G;
            var3 = ((ba) this).field_G > ((ba) this).field_K ? ((ba) this).field_G : ((ba) this).field_K;
            ((ba) this).field_K = var2;
            ((ba) this).field_G = var2;
            ((ba) this).field_h = ((ba) this).field_h.substring(0, var2) + ((ba) this).field_h.substring(var3, ((ba) this).field_h.length());
            ((ba) this).h((byte) 88);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (!(((ba) this).field_D == -1)) {
            var3_int = ((ba) this).field_D + -((ba) this).field_h.length();
            if (var3_int >= 0) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (((ba) this).field_G == ((ba) this).field_h.length()) {
            ((ba) this).field_h = ((ba) this).field_h + param1;
        } else {
            ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_G) + param1 + ((ba) this).field_h.substring(((ba) this).field_G, ((ba) this).field_h.length());
        }
        ((ba) this).field_G = ((ba) this).field_G + param1.length();
        ((ba) this).field_K = ((ba) this).field_G;
        if (param0 != 28383) {
            return;
        }
        try {
            ((ba) this).h((byte) 88);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ba.BA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                var5 = null;
                ((ba) this).a(32, -52, -24, (lk) null);
                break L2;
              }
            }
            L3: {
              ((ba) this).field_h = param1;
              var4_int = param1.length();
              if (((ba) this).field_D == -1) {
                break L3;
              } else {
                if (var4_int > ((ba) this).field_D) {
                  ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_D);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$3 = ((ba) this).field_h.length();
              ((ba) this).field_K = dupTemp$3;
              ((ba) this).field_G = dupTemp$3;
              if (!param0) {
                ((ba) this).h((byte) 88);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ba.M(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    private final void g(byte param0) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_int = 0;
                var3 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.b(true);
                this.a(28383, var3);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h(byte param0) {
        if (((ba) this).field_n instanceof gl) {
            ((gl) (Object) ((ba) this).field_n).a((ba) this, (byte) 98);
        }
        if (param0 != 88) {
            ba.a((byte) -91, 122L);
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        sf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              this.e((byte) 126);
              if (1 == ((ba) this).field_u) {
                L2: {
                  if (!(((ba) this).field_j instanceof sf)) {
                    break L2;
                  } else {
                    var5 = (sf) (Object) ((ba) this).field_j;
                    var6 = var5.a((lk) this, param2, ll.field_y, param1, param0 + -57, uc.field_C);
                    if (-1 == var6) {
                      break L2;
                    } else {
                      L3: {
                        if (!((ba) this).field_C) {
                          break L3;
                        } else {
                          if (((ba) this).field_F <= var6) {
                            break L3;
                          } else {
                            if (var6 <= ((ba) this).field_K) {
                              break L3;
                            } else {
                              var6 = ((ba) this).field_F;
                              break L3;
                            }
                          }
                        }
                      }
                      ((ba) this).field_G = var6;
                      break L2;
                    }
                  }
                }
                ((ba) this).field_L = fa.a(-55);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("ba.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    ba(String param0, sk param1, int param2) {
        super(param0, param1);
        ((ba) this).field_J = 0L;
        ((ba) this).field_F = -1;
        ((ba) this).field_C = false;
        try {
            ((ba) this).field_D = param2;
            ((ba) this).field_j = ma.field_m.field_e;
            ((ba) this).a(true, param0, true);
            ((ba) this).field_H = true;
            ((ba) this).field_L = fa.a(-96);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ba.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (param0 >= 44) {
          var2 = ((ba) this).field_h.length();
          if (var2 != ((ba) this).field_G) {
            var3 = 1 + ((ba) this).field_G;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (32 == ((ba) this).field_h.charAt(var3 + -1)) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return ((ba) this).field_G;
          }
        } else {
          return -111;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
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
        int stackOut_18_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_55_0 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_3_0 = 0;
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
              ((ba) this).field_L = fa.a(param3 + 14452);
              if (param1 == 60) {
                break L1;
              } else {
                if (62 == param1) {
                  break L1;
                } else {
                  L2: {
                    if (param3 == -14565) {
                      break L2;
                    } else {
                      ((ba) this).h((byte) -70);
                      break L2;
                    }
                  }
                  L3: {
                    if (param1 < 32) {
                      break L3;
                    } else {
                      if (param1 > 126) {
                        break L3;
                      } else {
                        L4: {
                          if (~((ba) this).field_G == ~((ba) this).field_K) {
                            break L4;
                          } else {
                            this.b(true);
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (((ba) this).field_D == -1) {
                              break L6;
                            } else {
                              if (((ba) this).field_h.length() >= ((ba) this).field_D) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (((ba) this).field_G < ((ba) this).field_h.length()) {
                              ((ba) this).field_h = ((ba) this).field_h.substring(0, ((ba) this).field_G) + param1 + ((ba) this).field_h.substring(((ba) this).field_G, ((ba) this).field_h.length());
                              ((ba) this).field_G = ((ba) this).field_G + 1;
                              ((ba) this).field_K = ((ba) this).field_G;
                              break L7;
                            } else {
                              ((ba) this).field_h = ((ba) this).field_h + param1;
                              int dupTemp$1 = ((ba) this).field_h.length();
                              ((ba) this).field_G = dupTemp$1;
                              ((ba) this).field_K = dupTemp$1;
                              break L7;
                            }
                          }
                          ((ba) this).h((byte) 88);
                          break L5;
                        }
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                    }
                  }
                  if (param2 != 85) {
                    L8: {
                      if (param2 != 101) {
                        if (13 != param2) {
                          if (param2 != 96) {
                            if (param2 != 97) {
                              if (102 == param2) {
                                this.b(0, 102);
                                stackOut_73_0 = 1;
                                stackIn_74_0 = stackOut_73_0;
                                return stackIn_74_0 != 0;
                              } else {
                                if (103 != param2) {
                                  if (param2 == 84) {
                                    this.i(30483);
                                    stackOut_71_0 = 1;
                                    stackIn_72_0 = stackOut_71_0;
                                    return stackIn_72_0 != 0;
                                  } else {
                                    L9: {
                                      if (!ng.field_a[82]) {
                                        break L9;
                                      } else {
                                        if (param2 == 65) {
                                          this.f((byte) 107);
                                          stackOut_69_0 = 1;
                                          stackIn_70_0 = stackOut_69_0;
                                          return stackIn_70_0 != 0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!ng.field_a[82]) {
                                        break L10;
                                      } else {
                                        if (param2 != 66) {
                                          break L10;
                                        } else {
                                          this.i((byte) 103);
                                          stackOut_63_0 = 1;
                                          stackIn_64_0 = stackOut_63_0;
                                          return stackIn_64_0 != 0;
                                        }
                                      }
                                    }
                                    if (!ng.field_a[82]) {
                                      break L8;
                                    } else {
                                      if (param2 != 67) {
                                        break L8;
                                      } else {
                                        this.g((byte) -11);
                                        stackOut_67_0 = 1;
                                        stackIn_68_0 = stackOut_67_0;
                                        return stackIn_68_0 != 0;
                                      }
                                    }
                                  }
                                } else {
                                  this.b(((ba) this).field_h.length(), 102);
                                  stackOut_55_0 = 1;
                                  stackIn_56_0 = stackOut_55_0;
                                  return stackIn_56_0 != 0;
                                }
                              }
                            } else {
                              if (~((ba) this).field_G <= ~((ba) this).field_h.length()) {
                                break L8;
                              } else {
                                L11: {
                                  stackOut_48_0 = this;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  if (ng.field_a[82]) {
                                    stackOut_50_0 = this;
                                    stackOut_50_1 = this.a(param3 + 14657);
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    break L11;
                                  } else {
                                    stackOut_49_0 = this;
                                    stackOut_49_1 = ((ba) this).field_G - -1;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    break L11;
                                  }
                                }
                                this.b(stackIn_51_1, param3 + 14667);
                                stackOut_51_0 = 1;
                                stackIn_52_0 = stackOut_51_0;
                                return stackIn_52_0 != 0;
                              }
                            }
                          } else {
                            if (((ba) this).field_G <= 0) {
                              break L8;
                            } else {
                              L12: {
                                stackOut_41_0 = this;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_42_0 = stackOut_41_0;
                                if (!ng.field_a[82]) {
                                  stackOut_43_0 = this;
                                  stackOut_43_1 = -1 + ((ba) this).field_G;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  break L12;
                                } else {
                                  stackOut_42_0 = this;
                                  stackOut_42_1 = this.k(param3 ^ -14565);
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  break L12;
                                }
                              }
                              this.b(stackIn_44_1, param3 ^ -14467);
                              stackOut_44_0 = 1;
                              stackIn_45_0 = stackOut_44_0;
                              return stackIn_45_0 != 0;
                            }
                          }
                        } else {
                          ((ba) this).h(123);
                          stackOut_37_0 = 1;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0 != 0;
                        }
                      } else {
                        if (~((ba) this).field_K != ~((ba) this).field_G) {
                          this.b(true);
                          stackOut_34_0 = 1;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0 != 0;
                        } else {
                          if (((ba) this).field_G < ((ba) this).field_h.length()) {
                            ((ba) this).field_K = ((ba) this).field_G + 1;
                            this.b(true);
                            stackOut_32_0 = 1;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    break L0;
                  } else {
                    if (((ba) this).field_K != ((ba) this).field_G) {
                      this.b(true);
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    } else {
                      if (0 < ((ba) this).field_G) {
                        ((ba) this).field_K = -1 + ((ba) this).field_G;
                        this.b(true);
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var5;
            stackOut_77_1 = new StringBuilder().append("ba.E(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L13;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L13;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_76_0 != 0;
    }

    final void h(int param0) {
        ((ba) this).field_G = 0;
        ((ba) this).field_h = "";
        ((ba) this).field_K = 0;
        ((ba) this).h((byte) 88);
        if (param0 <= 107) {
            Object var3 = null;
            ((ba) this).a(120, -64, -29, (lk) null);
        }
    }

    private final void e(byte param0) {
        int var8 = Bounce.field_N;
        if (!(((ba) this).field_H)) {
            ((ba) this).field_v = 0;
            ((ba) this).field_o = 0;
            return;
        }
        if (!(((ba) this).field_j instanceof sf)) {
            return;
        }
        sf var9 = (sf) (Object) ((ba) this).field_j;
        ed var3 = var9.b((lk) this, 0);
        int var4 = var3.b(106);
        int var5 = var9.a((lk) this, (byte) -55);
        int var6 = var9.a(68) >> 1;
        if (!(-var6 + var5 <= var4)) {
            ((ba) this).field_o = 0;
            ((ba) this).field_v = 0;
            return;
        }
        int var7 = ((ba) this).field_v - -var3.a(((ba) this).field_G, 81);
        if (-var6 + var5 < var7) {
            ((ba) this).field_v = ((ba) this).field_v + (-var7 + (var5 + -var6));
        } else {
            if (!(var6 <= var7)) {
                ((ba) this).field_v = ((ba) this).field_v - (var7 + -var6);
            }
        }
        if (0 < ((ba) this).field_v) {
            ((ba) this).field_v = 0;
        } else {
            if (-var5 + var6 > ((ba) this).field_v) {
                ((ba) this).field_v = var6 + -var5;
            }
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 == ((ba) this).field_G) {
          return ((ba) this).field_G;
        } else {
          var2 = -1 + ((ba) this).field_G;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((ba) this).field_h.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(byte param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param1);
                  if (param0 <= -29) {
                    break L1;
                  } else {
                    ba.a((byte) 115, 7L);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(((ba) this).field_j instanceof sf)) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L1: {
                  var8_int = ((sf) (Object) ((ba) this).field_j).a((lk) this, param6, ll.field_y, param2, -66, uc.field_C);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (-1 == var8_int) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_6_1, param4 ^ 28481);
                  var8_long = fa.a(-99);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var8_long + -((ba) this).field_J >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((ba) this).field_C = stackIn_9_1 != 0;
                  if (((ba) this).field_C) {
                    L4: {
                      ((ba) this).field_K = this.k(param4 + -28455);
                      ((ba) this).field_G = this.a(116);
                      if (((ba) this).field_G <= 0) {
                        break L4;
                      } else {
                        if (((ba) this).field_h.charAt(-1 + ((ba) this).field_G) == 32) {
                          ((ba) this).field_G = ((ba) this).field_G - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((ba) this).field_F = ((ba) this).field_G;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((ba) this).field_J = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("ba.IA(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    public static void d(byte param0) {
        field_E = null;
    }

    private final void i(byte param0) {
        int var2 = 89 % ((-11 - param0) / 49);
        String var3 = this.j(65);
        if (!(var3.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(-116)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        sf var8 = null;
        long var6 = 0L;
        if (null != ((ba) this).field_j) {
            if (!(param0 != 0)) {
                ((ba) this).field_j.a(param1, (lk) this, (byte) 91, ((ba) this).field_y, param3);
                if (!(!(((ba) this).field_j instanceof sf))) {
                    var8 = (sf) (Object) ((ba) this).field_j;
                    if (((ba) this).field_G != ((ba) this).field_K) {
                        var8.a(param3, (lk) this, param1, ((ba) this).field_G, ((ba) this).field_K, (byte) 87);
                    }
                    var6 = fa.a(-84);
                    if (!((-((ba) this).field_L + var6) % 1000L >= 500L)) {
                        var8.a((lk) this, ((ba) this).field_G, (byte) 65, param1, param3);
                    }
                }
            }
        }
        if (param2 <= 33) {
            ((ba) this).field_H = true;
        }
    }

    static {
    }
}
