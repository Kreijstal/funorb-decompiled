/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pm extends gn {
    private long field_T;
    static String field_P;
    static k field_R;
    private int field_O;
    static int field_Q;
    private boolean field_U;
    private int field_V;
    private long field_X;
    private boolean field_M;
    private int field_W;
    private int field_S;
    static ri field_N;

    final boolean a(int param0, char param1, cf param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_T = bl.a((byte) 45);
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
                          if (this.field_S == this.field_O) {
                            break L3;
                          } else {
                            this.c(false);
                            break L3;
                          }
                        }
                        L4: {
                          if (0 == (this.field_W ^ -1)) {
                            break L4;
                          } else {
                            if (this.field_j.length() < this.field_W) {
                              break L4;
                            } else {
                              return true;
                            }
                          }
                        }
                        L5: {
                          if (this.field_O >= this.field_j.length()) {
                            this.field_j = this.field_j + param1;
                            dupTemp$0 = this.field_j.length();
                            this.field_O = dupTemp$0;
                            this.field_S = dupTemp$0;
                            break L5;
                          } else {
                            this.field_j = this.field_j.substring(0, this.field_O) + param1 + this.field_j.substring(this.field_O, this.field_j.length());
                            this.field_O = this.field_O + 1;
                            this.field_S = this.field_O;
                            break L5;
                          }
                        }
                        this.j(param3 ^ -14400);
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L6: {
                    if (param0 == 85) {
                      if (this.field_O == this.field_S) {
                        if (this.field_O <= 0) {
                          break L6;
                        } else {
                          this.field_S = -1 + this.field_O;
                          this.c(false);
                          stackIn_71_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        }
                      } else {
                        this.c(false);
                        stackIn_68_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      if ((param0 ^ -1) == -102) {
                        if (this.field_O == this.field_S) {
                          if (this.field_O < this.field_j.length()) {
                            this.field_S = this.field_O + 1;
                            this.c(false);
                            stackIn_65_0 = 1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            break L6;
                          }
                        } else {
                          this.c(false);
                          stackIn_61_0 = 1;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        }
                      } else {
                        if (param0 != 13) {
                          if ((param0 ^ -1) != -97) {
                            if (97 != param0) {
                              if (param0 != 102) {
                                if (-104 == (param0 ^ -1)) {
                                  this.b(false, this.field_j.length());
                                  stackIn_58_0 = 1;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (84 == param0) {
                                    this.h(97);
                                    stackIn_56_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    L7: {
                                      if (!lc.field_m[82]) {
                                        break L7;
                                      } else {
                                        if (-66 == (param0 ^ -1)) {
                                          this.f(102);
                                          stackIn_54_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (!lc.field_m[82]) {
                                        break L8;
                                      } else {
                                        if ((param0 ^ -1) == -67) {
                                          this.i((byte) -60);
                                          stackIn_52_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (!lc.field_m[82]) {
                                      break L6;
                                    } else {
                                      if (param0 != 67) {
                                        break L6;
                                      } else {
                                        this.i(param3 + 6458);
                                        stackIn_50_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.b(false, 0);
                                stackIn_38_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              if (this.field_O >= this.field_j.length()) {
                                break L6;
                              } else {
                                L9: {
                                  stackIn_33_0 = this;

                                  stackIn_33_1 = 0;

                                  if (!lc.field_m[82]) {
                                    stackIn_34_0 = this;
                                    stackIn_34_1 = stackIn_33_1;
                                    stackIn_34_2 = this.field_O + 1;
                                    break L9;
                                  } else {
                                    stackIn_34_0 = this;
                                    stackIn_34_1 = stackIn_33_1;
                                    stackIn_34_2 = this.g(param3 + 6329);
                                    break L9;
                                  }
                                }
                                this.b(stackIn_34_1 != 0, stackIn_34_2);
                                stackIn_35_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_O ^ -1) >= -1) {
                              break L6;
                            } else {
                              L10: {
                                stackIn_26_0 = this;

                                stackIn_26_1 = 0;

                                if (lc.field_m[82]) {
                                  stackIn_27_0 = this;
                                  stackIn_27_1 = stackIn_26_1;
                                  stackIn_27_2 = this.h((byte) -110);
                                  break L10;
                                } else {
                                  stackIn_27_0 = this;
                                  stackIn_27_1 = stackIn_26_1;
                                  stackIn_27_2 = -1 + this.field_O;
                                  break L10;
                                }
                              }
                              this.b(stackIn_27_1 != 0, stackIn_27_2);
                              stackIn_28_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        } else {
                          this.b(true);
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param3 == -6208) {
                    stackIn_76_0 = 0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  } else {
                    stackIn_74_0 = 0;
                    decompiledRegionSelector0 = 15;
                    break L0;
                  }
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
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("pm.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L11;
            } else {
              stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ')');
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
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_35_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_38_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_50_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_52_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_54_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_56_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_58_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_61_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_65_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_68_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_71_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_74_0 != 0;
                                      } else {
                                        return stackIn_76_0 != 0;
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

    public static void d(boolean param0) {
        if (param0) {
            field_P = (String) null;
        }
        field_R = null;
        field_P = null;
        field_N = null;
    }

    private final void i(byte param0) {
        if (param0 != -60) {
            field_R = (k) null;
        }
        String var2 = this.k(-112);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(param0 ^ 67))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(this.field_h instanceof rk)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((rk) ((Object) this.field_h)).b(param5, param6, bd.field_g, bo.field_d, 98, (cf) (this));
                    stackIn_4_0 = this;

                    stackIn_4_1 = 0;

                    if (-1 == var8_int) {
                      stackIn_5_0 = this;
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 0;
                      break L2;
                    } else {
                      stackIn_5_0 = this;
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = var8_int;
                      break L2;
                    }
                  }
                  L3: {
                    this.b(stackIn_5_1 != 0, stackIn_5_2);
                    var8_long = bl.a((byte) 115);
                    stackIn_7_0 = this;

                    if ((-this.field_X + var8_long ^ -1L) <= -251L) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 0;
                      break L3;
                    } else {
                      stackIn_8_0 = this;
                      stackIn_8_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((pm) (this)).field_M = stackIn_8_1 != 0;
                    if (this.field_M) {
                      L5: {
                        this.field_S = this.h((byte) -110);
                        this.field_O = this.g(114);
                        if (-1 <= (this.field_O ^ -1)) {
                          break L5;
                        } else {
                          if (32 == this.field_j.charAt(-1 + this.field_O)) {
                            this.field_O = this.field_O - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_V = this.field_O;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_X = var8_long;
                  stackIn_16_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("pm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final void b(boolean param0) {
        this.field_S = 0;
        if (!param0) {
            this.field_V = 88;
        }
        this.field_j = "";
        this.field_O = 0;
        this.j(8192);
    }

    private final int g(int param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 > 110) {
            break L0;
          } else {
            pm.d(true);
            break L0;
          }
        }
        var2 = this.field_j.length();
        if (this.field_O == var2) {
          return this.field_O;
        } else {
          var3 = 1 + this.field_O;
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (this.field_j.charAt(-1 + var3) == 32) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            return var3;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        rk var8 = null;
        long var6 = 0L;
        if (param0 != -2) {
            this.field_O = -67;
        }
        if (null != this.field_h) {
            if (!(0 != param2)) {
                this.field_h.a(this.field_F, param1, -15112, param3, (cf) (this));
                if (!(!(this.field_h instanceof rk))) {
                    var8 = (rk) ((Object) this.field_h);
                    if (!(this.field_S == this.field_O)) {
                        var8.a(this.field_S, param1, this.field_O, param3, param0 ^ -93, (cf) (this));
                    }
                    var6 = bl.a((byte) 56);
                    if (!(500L <= (-this.field_T + var6) % 1000L)) {
                        var8.a((cf) (this), (byte) 2, param3, this.field_O, param1);
                    }
                }
            }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(this.field_S == this.field_O)) {
            var2 = this.field_O <= this.field_S ? this.field_O : this.field_S;
            var3 = this.field_O > this.field_S ? this.field_O : this.field_S;
            this.field_S = var2;
            this.field_O = var2;
            this.field_j = this.field_j.substring(0, var2) + this.field_j.substring(var3, this.field_j.length());
            this.j(8192);
        }
        if (param0) {
            this.field_V = 105;
        }
    }

    private final void g(byte param0) {
        mp var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rk var9;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_U) {
          if (this.field_h instanceof rk) {
            L0: {
              var9 = (rk) ((Object) this.field_h);
              var3 = var9.a((cf) (this), -112);
              if (param0 < -60) {
                break L0;
              } else {
                this.field_W = -107;
                break L0;
              }
            }
            var4 = var3.b(101);
            var5 = var9.a((cf) (this), true);
            var6 = var9.a(0) >> -1925733471;
            if (var4 < var5 - var6) {
              this.field_z = 0;
              this.field_q = 0;
              return;
            } else {
              L1: {
                var7 = this.field_z - -var3.a(52224, this.field_O);
                if (var5 + -var6 >= var7) {
                  if (var7 < var6) {
                    this.field_z = this.field_z - -var6 + -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_z = this.field_z + (-var7 - (-var5 + var6));
                  break L1;
                }
              }
              L2: {
                if (-1 > (this.field_z ^ -1)) {
                  this.field_z = 0;
                  break L2;
                } else {
                  if (-var5 + var6 > this.field_z) {
                    this.field_z = -var5 - -var6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_z = 0;
          this.field_q = 0;
          return;
        }
    }

    pm(String param0, bj param1, int param2) {
        super(param0, param1);
        this.field_M = false;
        this.field_V = -1;
        this.field_X = 0L;
        try {
            this.field_W = param2;
            this.field_h = ra.field_o.field_o;
            this.a(true, param0, (byte) 108);
            this.field_U = true;
            this.field_T = bl.a((byte) 106);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String k(int param0) {
        int var2 = this.field_O > this.field_S ? this.field_S : this.field_O;
        int var3 = this.field_O <= this.field_S ? this.field_S : this.field_O;
        if (param0 >= -98) {
            ul var4 = (ul) null;
            pm.a((ul) null, -5, 40, (ul) null, -102);
        }
        return this.field_j.substring(var2, var3);
    }

    private final void i(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.c(false);
                if (param0 == 250) {
                  this.a(var2, (byte) 112);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        rk var5 = null;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.g((byte) -84);
            if (1 == this.field_u) {
                if (this.field_h instanceof rk) {
                    var5 = (rk) ((Object) this.field_h);
                    var6 = var5.b(param2, param3, bd.field_g, bo.field_d, 98, (cf) (this));
                    if (!((var6 ^ -1) == 0)) {
                        if (this.field_M && var6 < this.field_V && this.field_S < var6) {
                            var6 = this.field_V;
                        }
                        this.field_O = var6;
                    }
                }
                this.field_T = bl.a((byte) 121);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pm.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void j(int param0) {
        if (this.field_A instanceof fi) {
            ((fi) ((Object) this.field_A)).a((pm) (this), 0);
        }
        if (param0 != 8192) {
            this.field_T = 67L;
        }
    }

    private final void b(boolean param0, int param1) {
        this.field_O = param1;
        if (!lc.field_m[81]) {
            this.field_S = this.field_O;
        }
        if (param0) {
            String var4 = (String) null;
            this.a((String) null, (byte) -92);
        }
    }

    private final int h(byte param0) {
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        } else {
          var2 = this.field_O + -1;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (32 == this.field_j.charAt(var2 + -1)) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 == -110) {
                break L2;
              } else {
                this.h(15);
                break L2;
              }
            }
            return var2;
          }
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (!((this.field_W ^ -1) == 0)) {
            var3_int = this.field_W + -this.field_j.length();
            if (0 <= var3_int) {
                return;
            }
            param0 = param0.substring(0, var3_int);
        }
        if (this.field_O != this.field_j.length()) {
            this.field_j = this.field_j.substring(0, this.field_O) + param0 + this.field_j.substring(this.field_O, this.field_j.length());
        } else {
            this.field_j = this.field_j + param0;
        }
        this.field_O = this.field_O + param0.length();
        if (param1 <= 109) {
            return;
        }
        try {
            this.field_S = this.field_O;
            this.j(8192);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        this.i((byte) -60);
        this.c(false);
        if (param0 != 102) {
            this.b(true, -83);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!(null == ui.field_j)) {
            qk.a(ui.field_j, -123);
        }
        if (param0) {
            ul var3 = (ul) null;
            pm.a((ul) null, -81, 46, (ul) null, -115);
        }
        if (!(null == pk.field_b)) {
            pk.field_b.b(param1, (byte) 47);
        }
        hd.a(param1, -19);
        if (null != bk.field_i) {
            bk.field_i.c(param1, -1);
        }
        ie.a(param1, param0);
    }

    final static sl a(ul param0, int param1, int param2, ul param3, int param4) {
        RuntimeException var5 = null;
        sl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param2, param3, param1, (byte) -42)) {
              L1: {
                if (param4 == -29435) {
                  break L1;
                } else {
                  field_R = (k) null;
                  break L1;
                }
              }
              stackIn_6_0 = me.a(param0.a(param2, true, param1), true);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("pm.EA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    private final void h(int param0) {
        if (!(!(this.field_A instanceof fi))) {
            ((fi) ((Object) this.field_A)).a((pm) (this), true);
        }
        if (param0 != 97) {
            this.field_S = -78;
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
              this.field_j = param1;
              var4_int = param1.length();
              if (-1 == this.field_W) {
                break L2;
              } else {
                if (this.field_W >= var4_int) {
                  break L2;
                } else {
                  this.field_j = this.field_j.substring(0, this.field_W);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_j.length();
              this.field_S = dupTemp$1;
              this.field_O = dupTemp$1;
              if (!param0) {
                this.j(8192);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 > 102) {
                break L4;
              } else {
                this.a(91, 117, 22, -113);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("pm.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        field_P = null;
        field_R = new k(256);
    }
}
