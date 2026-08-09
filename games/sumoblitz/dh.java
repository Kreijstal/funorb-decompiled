/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends wp {
    private long field_L;
    private int field_I;
    static float[] field_N;
    private boolean field_G;
    private int field_E;
    private long field_J;
    private int field_F;
    static float[] field_M;
    private int field_K;
    private boolean field_O;
    static int[] field_H;

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param1 < -42) {
                break L1;
              } else {
                this.field_G = true;
                break L1;
              }
            }
            if (super.a(param0, -128, param2, param3, param4, param5, param6)) {
              if (!(this.field_w instanceof de)) {
                stackIn_20_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var8_int = ((de) ((Object) this.field_w)).a(param4, (pk) (this), ko.field_p, pi.field_e, -4059, param6);
                  stackIn_7_0 = this;

                  stackIn_7_1 = 124;

                  if (-1 != var8_int) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = var8_int;
                    break L2;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = 0;
                    break L2;
                  }
                }
                L3: {
                  this.a(stackIn_8_1, stackIn_8_2);
                  var8_long = wq.a(-17);
                  stackIn_10_0 = this;

                  if (250L <= var8_long - this.field_L) {
                    stackIn_11_0 = this;
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = this;
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  ((dh) (this)).field_G = stackIn_11_1 != 0;
                  if (!this.field_G) {
                    break L4;
                  } else {
                    L5: {
                      this.field_E = this.g(14236);
                      this.field_F = this.d(true);
                      if ((this.field_F ^ -1) >= -1) {
                        break L5;
                      } else {
                        if (this.field_m.charAt(this.field_F + -1) == 32) {
                          this.field_F = this.field_F - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_K = this.field_F;
                    break L4;
                  }
                }
                this.field_L = var8_long;
                stackIn_18_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("dh.R(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < 84) {
            this.field_I = 55;
        }
        this.field_F = param1;
        if (!(hw.field_b[81])) {
            this.field_E = this.field_F;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        if (param2) {
            field_N = (float[]) null;
        }
        int var3 = param0 >>> -322954945;
        return (var3 + param0) / param1 + -var3;
    }

    public static void j(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
            field_N = (float[]) null;
        }
    }

    private final String k(int param0) {
        if (param0 > -99) {
            this.field_G = true;
        }
        int var2 = this.field_E < this.field_F ? this.field_E : this.field_F;
        int var3 = this.field_F > this.field_E ? this.field_F : this.field_E;
        return this.field_m.substring(var2, var3);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.h((byte) -80);
                this.a(true, var2);
            } catch (Exception exception) {
            }
            if (param0 != -1) {
                this.field_O = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_L = -107L;
                break L1;
              }
            }
            L2: {
              if (0 != (this.field_I ^ -1)) {
                var3_int = this.field_I + -this.field_m.length();
                if (var3_int >= 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_F == this.field_m.length()) {
                this.field_m = this.field_m + param1;
                break L3;
              } else {
                this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
                break L3;
              }
            }
            this.field_F = this.field_F + param1.length();
            this.field_E = this.field_F;
            this.g((byte) 88);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("dh.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int g(int param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_F != 0) {
          if (param0 == 14236) {
            var2 = -1 + this.field_F;
            L0: while (true) {
              L1: {
                if (var2 <= 0) {
                  break L1;
                } else {
                  if (this.field_m.charAt(var2 - 1) == 32) {
                    break L1;
                  } else {
                    var2--;
                    continue L0;
                  }
                }
              }
              return var2;
            }
          } else {
            return 31;
          }
        } else {
          return this.field_F;
        }
    }

    dh(String param0, qm param1, int param2) {
        super(param0, param1);
        this.field_L = 0L;
        this.field_G = false;
        this.field_K = -1;
        try {
            this.field_I = param2;
            this.field_w = ks.field_x.field_j;
            this.a(true, param0, (byte) 118);
            this.field_O = true;
            this.field_J = wq.a(-9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            L2: {
              this.field_m = param1;
              var4_int = param1.length();
              if ((this.field_I ^ -1) == 0) {
                break L2;
              } else {
                if (var4_int > this.field_I) {
                  this.field_m = this.field_m.substring(0, this.field_I);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_m.length();
              this.field_E = dupTemp$1;
              this.field_F = dupTemp$1;
              if (!param0) {
                this.g((byte) 103);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 >= 3) {
                break L4;
              } else {
                field_N = (float[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("dh.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_J = wq.a(-6);
            if (param1 == 60) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (62 != param1) {
                if (param2 > 9) {
                  L1: {
                    if (32 > param1) {
                      break L1;
                    } else {
                      if (126 >= param1) {
                        L2: {
                          if (this.field_F == this.field_E) {
                            break L2;
                          } else {
                            this.h((byte) -71);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (-1 == this.field_I) {
                              break L4;
                            } else {
                              if (this.field_m.length() < this.field_I) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (this.field_F >= this.field_m.length()) {
                              this.field_m = this.field_m + param1;
                              dupTemp$0 = this.field_m.length();
                              this.field_F = dupTemp$0;
                              this.field_E = dupTemp$0;
                              break L5;
                            } else {
                              this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
                              this.field_F = this.field_F + 1;
                              this.field_E = this.field_F;
                              break L5;
                            }
                          }
                          this.g((byte) 124);
                          break L3;
                        }
                        stackIn_77_0 = 1;
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if ((param3 ^ -1) == -86) {
                      if (this.field_F == this.field_E) {
                        if (0 >= this.field_F) {
                          break L6;
                        } else {
                          this.field_E = -1 + this.field_F;
                          this.h((byte) 127);
                          stackIn_66_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        this.h((byte) 122);
                        stackIn_63_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      if (101 != param3) {
                        if (param3 == 13) {
                          this.i(-1);
                          stackIn_60_0 = 1;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          if (96 == param3) {
                            if (this.field_F > 0) {
                              L7: {
                                stackIn_56_0 = this;

                                stackIn_56_1 = 127;

                                if (hw.field_b[82]) {
                                  stackIn_57_0 = this;
                                  stackIn_57_1 = stackIn_56_1;
                                  stackIn_57_2 = this.g(14236);
                                  break L7;
                                } else {
                                  stackIn_57_0 = this;
                                  stackIn_57_1 = stackIn_56_1;
                                  stackIn_57_2 = -1 + this.field_F;
                                  break L7;
                                }
                              }
                              this.a(stackIn_57_1, stackIn_57_2);
                              stackIn_58_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param3 != 97) {
                              if (-103 == (param3 ^ -1)) {
                                this.a(93, 0);
                                stackIn_51_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (param3 == 103) {
                                  this.a(121, this.field_m.length());
                                  stackIn_49_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if (-85 == (param3 ^ -1)) {
                                    this.e((byte) -106);
                                    stackIn_47_0 = 1;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    L8: {
                                      if (!hw.field_b[82]) {
                                        break L8;
                                      } else {
                                        if (param3 != 65) {
                                          break L8;
                                        } else {
                                          this.f(96);
                                          stackIn_35_0 = 1;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!hw.field_b[82]) {
                                        break L9;
                                      } else {
                                        if (-67 == (param3 ^ -1)) {
                                          this.e(false);
                                          stackIn_45_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (!hw.field_b[82]) {
                                      break L6;
                                    } else {
                                      if ((param3 ^ -1) == -68) {
                                        this.h(-1);
                                        stackIn_43_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (this.field_F >= this.field_m.length()) {
                                break L6;
                              } else {
                                L10: {
                                  stackIn_26_0 = this;

                                  stackIn_26_1 = 111;

                                  if (!hw.field_b[82]) {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = stackIn_26_1;
                                    stackIn_27_2 = this.field_F - -1;
                                    break L10;
                                  } else {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = stackIn_26_1;
                                    stackIn_27_2 = this.d(true);
                                    break L10;
                                  }
                                }
                                this.a(stackIn_27_1, stackIn_27_2);
                                stackIn_28_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_F != this.field_E) {
                          this.h((byte) 123);
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (this.field_F < this.field_m.length()) {
                            this.field_E = this.field_F - -1;
                            this.h((byte) -69);
                            stackIn_17_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackIn_79_0 = 0;
                  decompiledRegionSelector0 = 16;
                  break L0;
                } else {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var5);

            stackIn_82_1 = new StringBuilder().append("dh.KA(");

            if (param0 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L11;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_43_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_49_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_66_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_77_0 != 0;
                                      } else {
                                        return stackIn_79_0 != 0;
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
    }

    private final void h(byte param0) {
        int var3 = 0;
        int var2 = 0;
        if (this.field_F != this.field_E) {
            var2 = this.field_E >= this.field_F ? this.field_F : this.field_E;
            var3 = this.field_E < this.field_F ? this.field_F : this.field_E;
            this.field_F = var2;
            this.field_E = var2;
            this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
            this.g((byte) 81);
        }
        var2 = -67 / ((85 - param0) / 37);
    }

    private final void e(byte param0) {
        if (!(!(this.field_o instanceof pw))) {
            ((pw) ((Object) this.field_o)).a((dh) (this), -66);
        }
        if (param0 != -106) {
            this.g((byte) -55);
        }
    }

    private final void f(int param0) {
        if (param0 != 96) {
            return;
        }
        this.e(false);
        this.h((byte) 123);
    }

    private final void f(byte param0) {
        ag var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        de var9;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_O) {
          this.field_s = 0;
          this.field_n = 0;
          return;
        } else {
          if (this.field_w instanceof de) {
            L0: {
              var9 = (de) ((Object) this.field_w);
              var3 = var9.b(-3, (pk) (this));
              var4 = var3.a((byte) -15);
              if (param0 == -44) {
                break L0;
              } else {
                field_H = (int[]) null;
                break L0;
              }
            }
            var5 = var9.a(param0 ^ -120, (pk) (this));
            var6 = var9.a(14763) >> 1411058977;
            if (-var6 + var5 <= var4) {
              L1: {
                var7 = this.field_s + var3.a((byte) 113, this.field_F);
                if (-var6 + var5 >= var7) {
                  if (var6 <= var7) {
                    break L1;
                  } else {
                    this.field_s = -var7 - -var6 + this.field_s;
                    break L1;
                  }
                } else {
                  this.field_s = -var7 - (-var5 + (var6 - this.field_s));
                  break L1;
                }
              }
              L2: {
                if (this.field_s <= 0) {
                  if (var6 + -var5 <= this.field_s) {
                    break L2;
                  } else {
                    this.field_s = -var5 - -var6;
                    break L2;
                  }
                } else {
                  this.field_s = 0;
                  break L2;
                }
              }
              return;
            } else {
              this.field_n = 0;
              this.field_s = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final void i(int param0) {
        this.field_F = 0;
        this.field_E = 0;
        this.field_m = "";
        this.g((byte) 104);
        if (param0 != -1) {
            this.field_O = true;
        }
    }

    private final void e(boolean param0) {
        String var2 = this.k(-115);
        if (!((var2.length() ^ -1) >= -1)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0) {
            this.f((byte) -38);
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        de var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 62, param2, param3);
              var5_int = 109 % ((-25 - param1) / 45);
              this.f((byte) -44);
              if (this.field_l == 1) {
                L2: {
                  if (this.field_w instanceof de) {
                    var6 = (de) ((Object) this.field_w);
                    var7 = var6.a(param0, (pk) (this), ko.field_p, pi.field_e, -4059, param3);
                    if (var7 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_G) {
                          break L3;
                        } else {
                          if (this.field_K <= var7) {
                            break L3;
                          } else {
                            if (this.field_E >= var7) {
                              break L3;
                            } else {
                              var7 = this.field_K;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_F = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_J = wq.a(-93);
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
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("dh.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        de var8 = null;
        long var6 = 0L;
        int discarded$0 = 0;
        if (null != this.field_w) {
            if (!(-1 != (param3 ^ -1))) {
                this.field_w.a((pk) (this), param1, 5592405, this.field_x, param0);
                if (this.field_w instanceof de) {
                    var8 = (de) ((Object) this.field_w);
                    if (this.field_F != this.field_E) {
                        var8.a(param0, this.field_E, 0, this.field_F, (pk) (this), param1);
                    }
                    var6 = wq.a(-6);
                    if (500L > (-this.field_J + var6) % 1000L) {
                        var8.a(1, param0, param1, this.field_F, (pk) (this));
                    }
                }
            }
        }
        if (param2 >= -35) {
            discarded$0 = this.d(false);
        }
    }

    private final int d(boolean param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.f((byte) -32);
            break L0;
          }
        }
        var2 = this.field_m.length();
        if (this.field_F != var2) {
          var3 = this.field_F + 1;
          L1: while (true) {
            L2: {
              if (var2 <= var3) {
                break L2;
              } else {
                if (32 == this.field_m.charAt(var3 + -1)) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        } else {
          return this.field_F;
        }
    }

    void g(byte param0) {
        if (this.field_o instanceof pw) {
            ((pw) ((Object) this.field_o)).a((dh) (this), (byte) -128);
        }
        if (param0 <= 78) {
            dh.j(5);
        }
    }

    static {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; (var2 ^ -1) > -16385; var2++) {
            field_N[var2] = (float)Math.sin(var0 * (double)var2);
            field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
