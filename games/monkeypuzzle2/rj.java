/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rj extends t {
    private int field_E;
    private int field_J;
    private long field_K;
    private int field_D;
    static String field_B;
    static le field_H;
    private boolean field_G;
    private int field_I;
    private long field_F;
    private boolean field_C;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0) {
          return;
        } else {
          L0: {
            if (((rj) this).field_E != ((rj) this).field_D) {
              L1: {
                if (((rj) this).field_E > ((rj) this).field_D) {
                  stackOut_5_0 = ((rj) this).field_D;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((rj) this).field_E;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_6_0;
                if (((rj) this).field_E > ((rj) this).field_D) {
                  stackOut_8_0 = ((rj) this).field_E;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((rj) this).field_D;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var3 = stackIn_9_0;
              ((rj) this).field_E = var2;
              ((rj) this).field_D = var2;
              ((rj) this).field_s = ((rj) this).field_s.substring(0, var2) + ((rj) this).field_s.substring(var3, ((rj) this).field_s.length());
              ((rj) this).m(0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_70_0 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        try {
          L0: {
            L1: {
              ((rj) this).field_K = pf.a(0);
              var5_int = 84 / ((param3 - 37) / 50);
              if (param1 == 60) {
                break L1;
              } else {
                if (param1 == 62) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 32) {
                      break L2;
                    } else {
                      if (param1 > 126) {
                        break L2;
                      } else {
                        L3: {
                          if (~((rj) this).field_D == ~((rj) this).field_E) {
                            break L3;
                          } else {
                            this.a(false);
                            break L3;
                          }
                        }
                        L4: {
                          if (((rj) this).field_I == -1) {
                            break L4;
                          } else {
                            if (((rj) this).field_s.length() < ((rj) this).field_I) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          if (((rj) this).field_E >= ((rj) this).field_s.length()) {
                            ((rj) this).field_s = ((rj) this).field_s + param1;
                            int dupTemp$1 = ((rj) this).field_s.length();
                            ((rj) this).field_E = dupTemp$1;
                            ((rj) this).field_D = dupTemp$1;
                            break L5;
                          } else {
                            ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_E) + param1 + ((rj) this).field_s.substring(((rj) this).field_E, ((rj) this).field_s.length());
                            ((rj) this).field_E = ((rj) this).field_E + 1;
                            ((rj) this).field_D = ((rj) this).field_E;
                            break L5;
                          }
                        }
                        ((rj) this).m(0);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                  L6: {
                    if (param2 != 85) {
                      if (param2 != 101) {
                        if (param2 == 13) {
                          ((rj) this).f((byte) -108);
                          stackOut_70_0 = 1;
                          stackIn_71_0 = stackOut_70_0;
                          return stackIn_71_0 != 0;
                        } else {
                          if (param2 == 96) {
                            if (((rj) this).field_E > 0) {
                              L7: {
                                stackOut_65_0 = this;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (!dl.field_c[82]) {
                                  stackOut_67_0 = this;
                                  stackOut_67_1 = -1 + ((rj) this).field_E;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L7;
                                } else {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = this.l(-1);
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L7;
                                }
                              }
                              this.a(stackIn_68_1, -102);
                              stackOut_68_0 = 1;
                              stackIn_69_0 = stackOut_68_0;
                              return stackIn_69_0 != 0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param2 != 97) {
                              if (param2 == 102) {
                                this.a(0, -126);
                                stackOut_61_0 = 1;
                                stackIn_62_0 = stackOut_61_0;
                                return stackIn_62_0 != 0;
                              } else {
                                if (103 != param2) {
                                  if (84 != param2) {
                                    L8: {
                                      if (!dl.field_c[82]) {
                                        break L8;
                                      } else {
                                        if (param2 == 65) {
                                          this.c((byte) -121);
                                          stackOut_59_0 = 1;
                                          stackIn_60_0 = stackOut_59_0;
                                          return stackIn_60_0 != 0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!dl.field_c[82]) {
                                        break L9;
                                      } else {
                                        if (param2 != 66) {
                                          break L9;
                                        } else {
                                          this.b(true);
                                          stackOut_53_0 = 1;
                                          stackIn_54_0 = stackOut_53_0;
                                          return stackIn_54_0 != 0;
                                        }
                                      }
                                    }
                                    if (!dl.field_c[82]) {
                                      break L6;
                                    } else {
                                      if (param2 != 67) {
                                        break L6;
                                      } else {
                                        this.e((byte) 63);
                                        stackOut_57_0 = 1;
                                        stackIn_58_0 = stackOut_57_0;
                                        return stackIn_58_0 != 0;
                                      }
                                    }
                                  } else {
                                    this.d((byte) -118);
                                    stackOut_46_0 = 1;
                                    stackIn_47_0 = stackOut_46_0;
                                    return stackIn_47_0 != 0;
                                  }
                                } else {
                                  this.a(((rj) this).field_s.length(), -105);
                                  stackOut_43_0 = 1;
                                  stackIn_44_0 = stackOut_43_0;
                                  return stackIn_44_0 != 0;
                                }
                              }
                            } else {
                              if (~((rj) this).field_E <= ~((rj) this).field_s.length()) {
                                break L6;
                              } else {
                                L10: {
                                  stackOut_36_0 = this;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_37_0 = stackOut_36_0;
                                  if (dl.field_c[82]) {
                                    stackOut_38_0 = this;
                                    stackOut_38_1 = this.n(-1033);
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    break L10;
                                  } else {
                                    stackOut_37_0 = this;
                                    stackOut_37_1 = 1 + ((rj) this).field_E;
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_39_1, -109);
                                stackOut_39_0 = 1;
                                stackIn_40_0 = stackOut_39_0;
                                return stackIn_40_0 != 0;
                              }
                            }
                          }
                        }
                      } else {
                        if (((rj) this).field_D != ((rj) this).field_E) {
                          this.a(false);
                          stackOut_30_0 = 1;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0 != 0;
                        } else {
                          if (((rj) this).field_E < ((rj) this).field_s.length()) {
                            ((rj) this).field_D = 1 + ((rj) this).field_E;
                            this.a(false);
                            stackOut_28_0 = 1;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0 != 0;
                          } else {
                            break L6;
                          }
                        }
                      }
                    } else {
                      if (((rj) this).field_D != ((rj) this).field_E) {
                        this.a(false);
                        stackOut_22_0 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0 != 0;
                      } else {
                        if (((rj) this).field_E <= 0) {
                          break L6;
                        } else {
                          ((rj) this).field_D = ((rj) this).field_E - 1;
                          this.a(false);
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_72_0 = 0;
                  stackIn_73_0 = stackOut_72_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var5;
            stackOut_74_1 = new StringBuilder().append("rj.V(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L11;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L11;
            }
          }
          throw la.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_73_0 != 0;
    }

    private final void a(int param0, int param1) {
        L0: {
          ((rj) this).field_E = param0;
          if (!dl.field_c[81]) {
            ((rj) this).field_D = ((rj) this).field_E;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -89) {
          this.e((byte) 122);
          return;
        } else {
          return;
        }
    }

    rj(String param0, of param1, int param2) {
        super(param0, param1);
        ((rj) this).field_J = -1;
        ((rj) this).field_C = false;
        ((rj) this).field_F = 0L;
        try {
            ((rj) this).field_I = param2;
            ((rj) this).field_h = hi.field_b.field_o;
            ((rj) this).a(true, -5905, param0);
            ((rj) this).field_G = true;
            ((rj) this).field_K = pf.a(0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        String var2 = this.p(18587);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.p(18587)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    public static void o(int param0) {
        field_B = null;
        field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        Object var8 = null;
        ui var9 = null;
        if (null != ((rj) this).field_h) {
          if (0 == param1) {
            ((rj) this).field_h.a(((rj) this).field_w, (we) this, param2, param3, 110);
            if (((rj) this).field_h instanceof ui) {
              var9 = (ui) (Object) ((rj) this).field_h;
              if (((rj) this).field_D == ((rj) this).field_E) {
                var6 = pf.a(param0 + -30);
                if ((-((rj) this).field_K + var6) % 1000L >= 500L) {
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) this, param3, param2, ((rj) this).field_E, 0);
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var9.a(119, (we) this, ((rj) this).field_D, param3, ((rj) this).field_E, param2);
                var6 = pf.a(param0 + -30);
                if ((-((rj) this).field_K + var6) % 1000L >= 500L) {
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) this, param3, param2, ((rj) this).field_E, 0);
                  if (param0 != 30) {
                    var8 = null;
                    ((rj) this).a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 != 30) {
                var8 = null;
                ((rj) this).a(false, 120, (String) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 30) {
              return;
            } else {
              var8 = null;
              ((rj) this).a(false, 120, (String) null);
              return;
            }
          }
        } else {
          if (param0 != 30) {
            var8 = null;
            ((rj) this).a(false, 120, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        ui var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -98);
              this.k(95);
              if (((rj) this).field_t != 1) {
                break L1;
              } else {
                L2: {
                  if (((rj) this).field_h instanceof ui) {
                    var5 = (ui) (Object) ((rj) this).field_h;
                    var6 = var5.a(param2, p.field_a, (we) this, ei.field_a, true, param1);
                    if (-1 != var6) {
                      L3: {
                        if (!((rj) this).field_C) {
                          break L3;
                        } else {
                          if (var6 >= ((rj) this).field_J) {
                            break L3;
                          } else {
                            if (var6 <= ((rj) this).field_D) {
                              break L3;
                            } else {
                              var6 = ((rj) this).field_J;
                              break L3;
                            }
                          }
                        }
                      }
                      ((rj) this).field_E = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((rj) this).field_K = pf.a(0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("rj.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + -24 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (bi.a(param1, 20558, false)) {
              var3_int = 0;
              L1: while (true) {
                if (param1.length() <= var3_int) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  if (!vb.a((byte) 115, param1.charAt(var3_int))) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("rj.K(").append(false).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + 20 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1033) {
          var2 = ((rj) this).field_s.length();
          if (var2 == ((rj) this).field_E) {
            return ((rj) this).field_E;
          } else {
            var3 = ((rj) this).field_E + 1;
            L0: while (true) {
              if (var2 > var3) {
                if (((rj) this).field_s.charAt(var3 + -1) != 32) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          field_B = null;
          var2 = ((rj) this).field_s.length();
          if (var2 == ((rj) this).field_E) {
            return ((rj) this).field_E;
          } else {
            var3 = ((rj) this).field_E + 1;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((rj) this).field_s.charAt(var3 + -1)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final String p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 18587) {
          L0: {
            ((rj) this).field_F = -108L;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_10_0 = ((rj) this).field_D;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((rj) this).field_E;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_13_0 = ((rj) this).field_E;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((rj) this).field_D;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return ((rj) this).field_s.substring(var2, var3);
        } else {
          L2: {
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_3_0 = ((rj) this).field_D;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((rj) this).field_E;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (((rj) this).field_D < ((rj) this).field_E) {
              stackOut_6_0 = ((rj) this).field_E;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((rj) this).field_D;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return ((rj) this).field_s.substring(var2, var3);
        }
    }

    final void f(byte param0) {
        ((rj) this).field_s = "";
        ((rj) this).field_E = 0;
        ((rj) this).field_D = 0;
        ((rj) this).m(0);
        if (param0 >= -3) {
            ((rj) this).field_F = 110L;
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -5905) {
                break L2;
              } else {
                String discarded$4 = this.p(100);
                break L2;
              }
            }
            L3: {
              ((rj) this).field_s = param2;
              var4_int = param2.length();
              if (((rj) this).field_I == -1) {
                break L3;
              } else {
                if (var4_int > ((rj) this).field_I) {
                  ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_I);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            int dupTemp$5 = ((rj) this).field_s.length();
            ((rj) this).field_D = dupTemp$5;
            ((rj) this).field_E = dupTemp$5;
            if (!param0) {
              ((rj) this).m(param1 ^ -5905);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rj.FA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void e(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 63) {
                break L0;
              } else {
                this.a(true);
                break L0;
              }
            }
            try {
              L1: {
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.a(false);
                this.a(false, var2_ref);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
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
            if (0 != ((rj) this).field_I) {
              var3_int = ((rj) this).field_I + -((rj) this).field_s.length();
              if (-1 <= var3_int) {
                return;
              } else {
                param1 = param1.substring(0, var3_int);
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (((rj) this).field_E != ((rj) this).field_s.length()) {
              ((rj) this).field_s = ((rj) this).field_s.substring(0, ((rj) this).field_E) + param1 + ((rj) this).field_s.substring(((rj) this).field_E, ((rj) this).field_s.length());
              break L1;
            } else {
              ((rj) this).field_s = ((rj) this).field_s + param1;
              break L1;
            }
          }
          ((rj) this).field_E = ((rj) this).field_E + param1.length();
          ((rj) this).field_D = ((rj) this).field_E;
          ((rj) this).m(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rj.J(").append(false).append(',');
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((rj) this).field_E != 0) {
          var2 = -1 + ((rj) this).field_E;
          L0: while (true) {
            if (var2 > 0) {
              if (((rj) this).field_s.charAt(-1 + var2) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((rj) this).field_E;
        }
    }

    private final void c(byte param0) {
        this.b(true);
        int var2 = 0;
        this.a(false);
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
                if (((rj) this).field_h instanceof ui) {
                  L2: {
                    var8_int = ((ui) (Object) ((rj) this).field_h).a(param6, p.field_a, (we) this, ei.field_a, true, param0);
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var8_int == -1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = var8_int;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_7_1, -120);
                    var8_long = pf.a(0);
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (250L <= var8_long - ((rj) this).field_F) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((rj) this).field_C = stackIn_10_1 != 0;
                    if (!((rj) this).field_C) {
                      break L4;
                    } else {
                      L5: {
                        ((rj) this).field_D = this.l(-1);
                        ((rj) this).field_E = this.n(param3 ^ 592);
                        if (((rj) this).field_E <= 0) {
                          break L5;
                        } else {
                          if (((rj) this).field_s.charAt(((rj) this).field_E - 1) == 32) {
                            ((rj) this).field_E = ((rj) this).field_E - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((rj) this).field_J = ((rj) this).field_E;
                      break L4;
                    }
                  }
                  ((rj) this).field_F = var8_long;
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param3 == -1625) {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              ((rj) this).field_D = 46;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final void d(byte param0) {
        if (((rj) this).field_o instanceof vc) {
            ((vc) (Object) ((rj) this).field_o).a(-88, (rj) this);
            return;
        }
    }

    private final void k(int param0) {
        aa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ui var10 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((rj) this).field_G) {
          if (((rj) this).field_h instanceof ui) {
            var10 = (ui) (Object) ((rj) this).field_h;
            var3 = var10.a(-1, (we) this);
            var4 = var3.a(true);
            var5 = var10.b((we) this, true);
            var7 = 85;
            var6 = var10.a(2) >> 1;
            if (-var6 + var5 > var4) {
              ((rj) this).field_k = 0;
              ((rj) this).field_i = 0;
              return;
            } else {
              var8 = ((rj) this).field_k - -var3.a(115, ((rj) this).field_E);
              if (var5 - var6 < var8) {
                ((rj) this).field_k = ((rj) this).field_k - (-var5 + (var6 + var8));
                if (0 >= ((rj) this).field_k) {
                  if (-var5 - -var6 > ((rj) this).field_k) {
                    ((rj) this).field_k = var6 + -var5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((rj) this).field_k = 0;
                  return;
                }
              } else {
                if (var6 > var8) {
                  ((rj) this).field_k = ((rj) this).field_k + -var8 + var6;
                  if (0 >= ((rj) this).field_k) {
                    if (-var5 - -var6 <= ((rj) this).field_k) {
                      return;
                    } else {
                      ((rj) this).field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rj) this).field_k = 0;
                    return;
                  }
                } else {
                  if (0 >= ((rj) this).field_k) {
                    if (-var5 - -var6 <= ((rj) this).field_k) {
                      return;
                    } else {
                      ((rj) this).field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    ((rj) this).field_k = 0;
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          ((rj) this).field_i = 0;
          ((rj) this).field_k = 0;
          return;
        }
    }

    void m(int param0) {
        Object var3 = null;
        if (!(((rj) this).field_o instanceof vc)) {
          if (param0 != 0) {
            var3 = null;
            ((rj) this).a(false, -10, (String) null);
            return;
          } else {
            return;
          }
        } else {
          ((vc) (Object) ((rj) this).field_o).b(16926, (rj) this);
          if (param0 == 0) {
            return;
          } else {
            var3 = null;
            ((rj) this).a(false, -10, (String) null);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = null;
        field_H = new le(540, 140);
    }
}
