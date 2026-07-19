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
            if (this.field_E != this.field_D) {
              L1: {
                if (this.field_E > this.field_D) {
                  stackOut_5_0 = this.field_D;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = this.field_E;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_6_0;
                if (this.field_E > this.field_D) {
                  stackOut_8_0 = this.field_E;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = this.field_D;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var3 = stackIn_9_0;
              this.field_E = var2;
              this.field_D = var2;
              this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
              this.m(0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int dupTemp$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_71_0 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        try {
          L0: {
            L1: {
              this.field_K = pf.a(0);
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
                          if (this.field_D == this.field_E) {
                            break L3;
                          } else {
                            this.a(false);
                            break L3;
                          }
                        }
                        L4: {
                          if ((this.field_I ^ -1) == 0) {
                            break L4;
                          } else {
                            if (this.field_s.length() < this.field_I) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (this.field_E >= this.field_s.length()) {
                              break L6;
                            } else {
                              this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
                              this.field_E = this.field_E + 1;
                              this.field_D = this.field_E;
                              if (!MonkeyPuzzle2.field_F) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_s = this.field_s + param1;
                          dupTemp$1 = this.field_s.length();
                          this.field_E = dupTemp$1;
                          this.field_D = dupTemp$1;
                          break L5;
                        }
                        this.m(0);
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L7: {
                    if ((param2 ^ -1) != -86) {
                      if (param2 != 101) {
                        if (-14 == (param2 ^ -1)) {
                          this.f((byte) -108);
                          stackOut_71_0 = 1;
                          stackIn_72_0 = stackOut_71_0;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if (param2 == 96) {
                            if (-1 > (this.field_E ^ -1)) {
                              L8: {
                                stackOut_66_0 = this;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_67_0 = stackOut_66_0;
                                if (!dl.field_c[82]) {
                                  stackOut_68_0 = this;
                                  stackOut_68_1 = -1 + this.field_E;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  break L8;
                                } else {
                                  stackOut_67_0 = this;
                                  stackOut_67_1 = this.l(-1);
                                  stackIn_69_0 = stackOut_67_0;
                                  stackIn_69_1 = stackOut_67_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_69_1, -102);
                              stackOut_69_0 = 1;
                              stackIn_70_0 = stackOut_69_0;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != 97) {
                              if (param2 == 102) {
                                this.a(0, -126);
                                stackOut_62_0 = 1;
                                stackIn_63_0 = stackOut_62_0;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if (103 != param2) {
                                  if (84 != param2) {
                                    L9: {
                                      if (!dl.field_c[82]) {
                                        break L9;
                                      } else {
                                        if ((param2 ^ -1) == -66) {
                                          this.c((byte) -121);
                                          stackOut_60_0 = 1;
                                          stackIn_61_0 = stackOut_60_0;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!dl.field_c[82]) {
                                        break L10;
                                      } else {
                                        if (-67 != (param2 ^ -1)) {
                                          break L10;
                                        } else {
                                          this.b(true);
                                          stackOut_54_0 = 1;
                                          stackIn_55_0 = stackOut_54_0;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!dl.field_c[82]) {
                                      break L7;
                                    } else {
                                      if (param2 != 67) {
                                        break L7;
                                      } else {
                                        this.e((byte) 63);
                                        stackOut_58_0 = 1;
                                        stackIn_59_0 = stackOut_58_0;
                                        decompiledRegionSelector0 = 10;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.d((byte) -118);
                                    stackOut_47_0 = 1;
                                    stackIn_48_0 = stackOut_47_0;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  }
                                } else {
                                  this.a(this.field_s.length(), -105);
                                  stackOut_44_0 = 1;
                                  stackIn_45_0 = stackOut_44_0;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            } else {
                              if (this.field_E >= this.field_s.length()) {
                                break L7;
                              } else {
                                L11: {
                                  stackOut_37_0 = this;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  if (dl.field_c[82]) {
                                    stackOut_39_0 = this;
                                    stackOut_39_1 = this.n(-1033);
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    break L11;
                                  } else {
                                    stackOut_38_0 = this;
                                    stackOut_38_1 = 1 + this.field_E;
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_40_1 = stackOut_38_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_40_1, -109);
                                stackOut_40_0 = 1;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_D != this.field_E) {
                          this.a(false);
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_E < this.field_s.length()) {
                            this.field_D = 1 + this.field_E;
                            this.a(false);
                            stackOut_29_0 = 1;
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                    } else {
                      if (this.field_D != this.field_E) {
                        this.a(false);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (-1 <= (this.field_E ^ -1)) {
                          break L7;
                        } else {
                          this.field_D = this.field_E - 1;
                          this.a(false);
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var5);
            stackOut_75_1 = new StringBuilder().append("rj.V(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_41_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_55_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_59_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_61_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_63_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_70_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_72_0 != 0;
                                    } else {
                                      return stackIn_74_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        L0: {
          this.field_E = param0;
          if (!dl.field_c[81]) {
            this.field_D = this.field_E;
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
        this.field_J = -1;
        this.field_C = false;
        this.field_F = 0L;
        try {
            this.field_I = param2;
            this.field_h = hi.field_b.field_o;
            this.a(true, -5905, param0);
            this.field_G = true;
            this.field_K = pf.a(0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        try {
            String var2 = null;
            var2 = this.p(18587);
            if (!param0) {
              return;
            } else {
              L0: {
                if (0 >= var2.length()) {
                  break L0;
                } else {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(18587))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void o(int param0) {
        field_B = null;
        if (param0 != 0) {
            field_B = (String) null;
            field_H = null;
            return;
        }
        field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        String var8 = null;
        ui var9 = null;
        if (null != this.field_h) {
          if (0 == param1) {
            this.field_h.a(this.field_w, (we) (this), param2, param3, 110);
            if (this.field_h instanceof ui) {
              var9 = (ui) ((Object) this.field_h);
              if (this.field_D == this.field_E) {
                var6 = pf.a(param0 + -30);
                if (-501L >= ((-this.field_K + var6) % 1000L ^ -1L)) {
                  if (param0 != 30) {
                    var8 = (String) null;
                    this.a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) (this), param3, param2, this.field_E, 0);
                  if (param0 != 30) {
                    var8 = (String) null;
                    this.a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var9.a(119, (we) (this), this.field_D, param3, this.field_E, param2);
                var6 = pf.a(param0 + -30);
                if (-501L >= ((-this.field_K + var6) % 1000L ^ -1L)) {
                  if (param0 != 30) {
                    var8 = (String) null;
                    this.a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var9.a((we) (this), param3, param2, this.field_E, 0);
                  if (param0 != 30) {
                    var8 = (String) null;
                    this.a(false, 120, (String) null);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param0 != 30) {
                var8 = (String) null;
                this.a(false, 120, (String) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 30) {
              return;
            } else {
              var8 = (String) null;
              this.a(false, 120, (String) null);
              return;
            }
          }
        } else {
          if (param0 != 30) {
            var8 = (String) null;
            this.a(false, 120, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var6 = 0;
        ui var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param3 < -13) {
                break L1;
              } else {
                rj.o(59);
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, (byte) -98);
              this.k(95);
              if (-2 != (this.field_t ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (this.field_h instanceof ui) {
                    var7 = (ui) ((Object) this.field_h);
                    var6 = var7.a(param2, p.field_a, (we) (this), ei.field_a, true, param1);
                    if (-1 != var6) {
                      L4: {
                        if (!this.field_C) {
                          break L4;
                        } else {
                          if (var6 >= this.field_J) {
                            break L4;
                          } else {
                            if (var6 <= this.field_D) {
                              break L4;
                            } else {
                              var6 = this.field_J;
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_E = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_K = pf.a(0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("rj.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_9_0 = 0;
        byte stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (bi.a(param1, 20558, param0)) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length() <= var3_int) {
                      break L3;
                    } else {
                      stackOut_6_0 = vb.a((byte) 115, param1.charAt(var3_int));
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = param2;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == 20) {
                    break L4;
                  } else {
                    rj.o(-49);
                    break L4;
                  }
                }
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("rj.K(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_8_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1033) {
          var2 = this.field_s.length();
          if (var2 == this.field_E) {
            return this.field_E;
          } else {
            var3 = this.field_E + 1;
            L0: while (true) {
              if (var2 > var3) {
                stackOut_21_0 = -33;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (var4 == 0) {
                  if (stackIn_23_0 != (this.field_s.charAt(var3 + -1) ^ -1)) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_22_0;
                }
              } else {
                return var3;
              }
            }
          }
        } else {
          field_B = (String) null;
          var2 = this.field_s.length();
          if (var2 == this.field_E) {
            return this.field_E;
          } else {
            var3 = this.field_E + 1;
            L1: while (true) {
              if (var2 > var3) {
                stackOut_8_0 = -33;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var4 == 0) {
                  if (stackIn_10_0 != (this.field_s.charAt(var3 + -1) ^ -1)) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_9_0;
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
            this.field_F = -108L;
            if (this.field_D < this.field_E) {
              stackOut_10_0 = this.field_D;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_E;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (this.field_D < this.field_E) {
              stackOut_13_0 = this.field_E;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = this.field_D;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return this.field_s.substring(var2, var3);
        } else {
          L2: {
            if (this.field_D < this.field_E) {
              stackOut_3_0 = this.field_D;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = this.field_E;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (this.field_D < this.field_E) {
              stackOut_6_0 = this.field_E;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = this.field_D;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return this.field_s.substring(var2, var3);
        }
    }

    final void f(byte param0) {
        this.field_s = "";
        this.field_E = 0;
        this.field_D = 0;
        this.m(0);
        if (param0 >= -3) {
            this.field_F = 110L;
        }
    }

    final void a(boolean param0, int param1, String param2) {
        String discarded$4 = null;
        int dupTemp$5 = 0;
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
                discarded$4 = this.p(100);
                break L2;
              }
            }
            L3: {
              this.field_s = param2;
              var4_int = param2.length();
              if (0 == (this.field_I ^ -1)) {
                break L3;
              } else {
                if (var4_int > this.field_I) {
                  this.field_s = this.field_s.substring(0, this.field_I);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            dupTemp$5 = this.field_s.length();
            this.field_D = dupTemp$5;
            this.field_E = dupTemp$5;
            if (!param0) {
              this.m(param1 ^ -5905);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("rj.FA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if (0 != (this.field_I ^ -1)) {
                var3_int = this.field_I + -this.field_s.length();
                if (-1 >= (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                if (this.field_E != this.field_s.length()) {
                  break L3;
                } else {
                  this.field_s = this.field_s + param1;
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
              break L2;
            }
            this.field_E = this.field_E + param1.length();
            this.field_D = this.field_E;
            this.m(0);
            if (!param0) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.f((byte) -115);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("rj.J(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        char stackIn_6_0 = 0;
        char stackIn_7_0 = 0;
        char stackOut_5_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_E != 0) {
          var2 = param0 + this.field_E;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              stackOut_5_0 = this.field_s.charAt(-1 + var2);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var3 == 0) {
                if (stackIn_7_0 != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return this.field_E;
        }
    }

    private final void c(byte param0) {
        this.b(true);
        int var2 = -6 % ((param0 - -65) / 35);
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
        int decompiledRegionSelector0 = 0;
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
              if (super.a(param0, param1, param2, param3 ^ 0, param4, param5, param6)) {
                if (this.field_h instanceof ui) {
                  L2: {
                    var8_int = ((ui) ((Object) this.field_h)).a(param6, p.field_a, (we) (this), ei.field_a, true, param0);
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (0 == (var8_int ^ -1)) {
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
                    if (250L <= var8_long - this.field_F) {
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
                    ((rj) (this)).field_C = stackIn_10_1 != 0;
                    if (!this.field_C) {
                      break L4;
                    } else {
                      L5: {
                        this.field_D = this.l(-1);
                        this.field_E = this.n(param3 ^ 592);
                        if (this.field_E <= 0) {
                          break L5;
                        } else {
                          if (this.field_s.charAt(this.field_E - 1) == 32) {
                            this.field_E = this.field_E - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_J = this.field_E;
                      break L4;
                    }
                  }
                  this.field_F = var8_long;
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_D = 46;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var8);
            stackOut_22_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    private final void d(byte param0) {
        if (!(this.field_o instanceof vc)) {
          if (param0 > -94) {
            this.field_J = -3;
            return;
          } else {
            return;
          }
        } else {
          ((vc) ((Object) this.field_o)).a(-88, (rj) (this));
          if (param0 <= -94) {
            return;
          } else {
            this.field_J = -3;
            return;
          }
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
        if (this.field_G) {
          if (this.field_h instanceof ui) {
            var10 = (ui) ((Object) this.field_h);
            var3 = var10.a(-1, (we) (this));
            var4 = var3.a(true);
            var5 = var10.b((we) (this), true);
            var7 = -85 / ((27 - param0) / 63);
            var6 = var10.a(2) >> -793386367;
            if (-var6 + var5 > var4) {
              this.field_k = 0;
              this.field_i = 0;
              return;
            } else {
              L0: {
                var8 = this.field_k - -var3.a(115, this.field_E);
                if (var5 - var6 < var8) {
                  break L0;
                } else {
                  if (var6 > var8) {
                    this.field_k = this.field_k + -var8 + var6;
                    if (var9 == 0) {
                      if (0 >= this.field_k) {
                        if (-var5 - -var6 > this.field_k) {
                          this.field_k = var6 + -var5;
                          if (var9 != 0) {
                            this.field_k = 0;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_k = 0;
                        return;
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    if (0 >= this.field_k) {
                      if (-var5 - -var6 > this.field_k) {
                        this.field_k = var6 + -var5;
                        if (var9 == 0) {
                          return;
                        } else {
                          this.field_k = 0;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      this.field_k = 0;
                      return;
                    }
                  }
                }
              }
              this.field_k = this.field_k - (-var5 + (var6 + var8));
              if (0 >= this.field_k) {
                if (-var5 - -var6 > this.field_k) {
                  this.field_k = var6 + -var5;
                  if (var9 == 0) {
                    return;
                  } else {
                    this.field_k = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_k = 0;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_i = 0;
          this.field_k = 0;
          return;
        }
    }

    void m(int param0) {
        String var3 = null;
        if (!(this.field_o instanceof vc)) {
          if (param0 != 0) {
            var3 = (String) null;
            this.a(false, -10, (String) null);
            return;
          } else {
            return;
          }
        } else {
          ((vc) ((Object) this.field_o)).b(16926, (rj) (this));
          if (param0 == 0) {
            return;
          } else {
            var3 = (String) null;
            this.a(false, -10, (String) null);
            return;
          }
        }
    }

    static {
        field_B = null;
        field_H = new le(540, 140);
    }
}
