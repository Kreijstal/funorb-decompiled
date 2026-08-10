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
        int var2;
        int var3;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        if (param0) {
          return;
        } else {
          L0: {
            if (this.field_E != this.field_D) {
              L1: {
                if (this.field_E > this.field_D) {
                  stackIn_6_0 = this.field_D;
                  break L1;
                } else {
                  stackIn_6_0 = this.field_E;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_6_0;
                if (this.field_E > this.field_D) {
                  stackIn_9_0 = this.field_E;
                  break L2;
                } else {
                  stackIn_9_0 = this.field_D;
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
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
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
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
                          if (this.field_E >= this.field_s.length()) {
                            this.field_s = this.field_s + param1;
                            dupTemp$0 = this.field_s.length();
                            this.field_E = dupTemp$0;
                            this.field_D = dupTemp$0;
                            break L5;
                          } else {
                            this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
                            this.field_E = this.field_E + 1;
                            this.field_D = this.field_E;
                            break L5;
                          }
                        }
                        this.m(0);
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L6: {
                    if ((param2 ^ -1) != -86) {
                      if (param2 != 101) {
                        if (-14 == (param2 ^ -1)) {
                          this.f((byte) -108);
                          stackIn_71_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if (param2 == 96) {
                            if (-1 > (this.field_E ^ -1)) {
                              L7: {
                                stackIn_67_0 = this;

                                if (!dl.field_c[82]) {
                                  stackIn_68_0 = this;
                                  stackIn_68_1 = -1 + this.field_E;
                                  break L7;
                                } else {
                                  stackIn_68_0 = this;
                                  stackIn_68_1 = this.l(-1);
                                  break L7;
                                }
                              }
                              this.a(stackIn_68_1, -102);
                              stackIn_69_0 = 1;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param2 != 97) {
                              if (param2 == 102) {
                                this.a(0, -126);
                                stackIn_62_0 = 1;
                                decompiledRegionSelector0 = 12;
                                break L0;
                              } else {
                                if (103 != param2) {
                                  if (84 != param2) {
                                    L8: {
                                      if (!dl.field_c[82]) {
                                        break L8;
                                      } else {
                                        if ((param2 ^ -1) == -66) {
                                          this.c((byte) -121);
                                          stackIn_60_0 = 1;
                                          decompiledRegionSelector0 = 11;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!dl.field_c[82]) {
                                        break L9;
                                      } else {
                                        if (-67 != (param2 ^ -1)) {
                                          break L9;
                                        } else {
                                          this.b(true);
                                          stackIn_54_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
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
                                        stackIn_58_0 = 1;
                                        decompiledRegionSelector0 = 10;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    this.d((byte) -118);
                                    stackIn_47_0 = 1;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  }
                                } else {
                                  this.a(this.field_s.length(), -105);
                                  stackIn_44_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            } else {
                              if (this.field_E >= this.field_s.length()) {
                                break L6;
                              } else {
                                L10: {
                                  stackIn_38_0 = this;

                                  if (dl.field_c[82]) {
                                    stackIn_39_0 = this;
                                    stackIn_39_1 = this.n(-1033);
                                    break L10;
                                  } else {
                                    stackIn_39_0 = this;
                                    stackIn_39_1 = 1 + this.field_E;
                                    break L10;
                                  }
                                }
                                this.a(stackIn_39_1, -109);
                                stackIn_40_0 = 1;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_D != this.field_E) {
                          this.a(false);
                          stackIn_31_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (this.field_E < this.field_s.length()) {
                            this.field_D = 1 + this.field_E;
                            this.a(false);
                            stackIn_29_0 = 1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                    } else {
                      if (this.field_D != this.field_E) {
                        this.a(false);
                        stackIn_23_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (-1 <= (this.field_E ^ -1)) {
                          break L6;
                        } else {
                          this.field_D = this.field_E - 1;
                          this.a(false);
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_73_0 = 0;
                  decompiledRegionSelector0 = 15;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_76_0 = (RuntimeException) (var5);

            stackIn_76_1 = new StringBuilder().append("rj.V(");

            if (param0 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L11;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_40_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_44_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_54_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_58_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_60_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_62_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_69_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_71_0 != 0;
                                    } else {
                                      return stackIn_73_0 != 0;
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
            String var2;
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
        long var6;
        String var8;
        ui var9;
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
        ui var7 = null;
        int var6 = 0;
        try {
            if (param3 >= -13) {
                rj.o(59);
            }
            super.a(param0, param1, param2, (byte) -98);
            this.k(95);
            if (-2 == (this.field_t ^ -1)) {
                if (!(!(this.field_h instanceof ui))) {
                    var7 = (ui) ((Object) this.field_h);
                    var6 = var7.a(param2, p.field_a, (we) (this), ei.field_a, true, param1);
                    if (!(-1 == var6)) {
                        if (this.field_C && var6 < this.field_J && var6 > this.field_D) {
                            var6 = this.field_J;
                        }
                        this.field_E = var6;
                    }
                }
                this.field_K = pf.a(0);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (bi.a(param1, 20558, param0)) {
              var3_int = 0;
              L1: while (true) {
                if (param1.length() <= var3_int) {
                  L2: {
                    if (param2 == 20) {
                      break L2;
                    } else {
                      rj.o(-49);
                      break L2;
                    }
                  }
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!vb.a((byte) 115, param1.charAt(var3_int))) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("rj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1033) {
          var2 = this.field_s.length();
          if (var2 == this.field_E) {
            return this.field_E;
          } else {
            var3 = this.field_E + 1;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_s.charAt(var3 + -1) ^ -1)) {
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
          field_B = (String) null;
          var2 = this.field_s.length();
          if (var2 == this.field_E) {
            return this.field_E;
          } else {
            var3 = this.field_E + 1;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_s.charAt(var3 + -1) ^ -1)) {
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        int var3;
        if (param0 != 18587) {
          L0: {
            this.field_F = -108L;
            if (this.field_D < this.field_E) {
              stackIn_11_0 = this.field_D;
              break L0;
            } else {
              stackIn_11_0 = this.field_E;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (this.field_D < this.field_E) {
              stackIn_14_0 = this.field_E;
              break L1;
            } else {
              stackIn_14_0 = this.field_D;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return this.field_s.substring(var2, var3);
        } else {
          L2: {
            if (this.field_D < this.field_E) {
              stackIn_4_0 = this.field_D;
              break L2;
            } else {
              stackIn_4_0 = this.field_E;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (this.field_D < this.field_E) {
              stackIn_7_0 = this.field_E;
              break L3;
            } else {
              stackIn_7_0 = this.field_D;
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
        String discarded$2 = null;
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                discarded$2 = this.p(100);
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
            dupTemp$3 = this.field_s.length();
            this.field_D = dupTemp$3;
            this.field_E = dupTemp$3;
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
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rj.FA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void e(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
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
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.a(false);
                this.a(false, var2);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
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
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              if (this.field_E != this.field_s.length()) {
                this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
                break L2;
              } else {
                this.field_s = this.field_s + param1;
                break L2;
              }
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("rj.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_E != 0) {
          var2 = param0 + this.field_E;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              if (this.field_s.charAt(-1 + var2) != 32) {
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
          return this.field_E;
        }
    }

    private final void c(byte param0) {
        this.b(true);
        int var2 = -6 % ((param0 - -65) / 35);
        this.a(false);
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (super.a(param0, param1, param2, param3 ^ 0, param4, param5, param6)) {
                if (this.field_h instanceof ui) {
                  L2: {
                    var8_int = ((ui) ((Object) this.field_h)).a(param6, p.field_a, (we) (this), ei.field_a, true, param0);
                    stackIn_6_0 = this;

                    if (0 == (var8_int ^ -1)) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_7_1, -120);
                    var8_long = pf.a(0);
                    stackIn_9_0 = this;

                    if (250L <= var8_long - this.field_F) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 0;
                      break L3;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 1;
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
                  stackIn_17_0 = 1;
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
              stackIn_21_0 = 0;
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
            stackIn_24_0 = (RuntimeException) (var8);

            stackIn_24_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        aa var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ui var10;
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
              var8 = this.field_k - -var3.a(115, this.field_E);
              if (var5 - var6 < var8) {
                this.field_k = this.field_k - (-var5 + (var6 + var8));
                if (0 >= this.field_k) {
                  if (-var5 - -var6 > this.field_k) {
                    this.field_k = var6 + -var5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_k = 0;
                  return;
                }
              } else {
                if (var6 > var8) {
                  this.field_k = this.field_k + -var8 + var6;
                  if (0 >= this.field_k) {
                    if (-var5 - -var6 <= this.field_k) {
                      return;
                    } else {
                      this.field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_k = 0;
                    return;
                  }
                } else {
                  if (0 >= this.field_k) {
                    if (-var5 - -var6 <= this.field_k) {
                      return;
                    } else {
                      this.field_k = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_k = 0;
                    return;
                  }
                }
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
        String var3;
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
