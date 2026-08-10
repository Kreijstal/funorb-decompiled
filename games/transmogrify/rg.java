/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends lj {
    private int field_E;
    static int[] field_D;
    private boolean field_A;
    static int[] field_B;
    private int field_H;
    static oe[] field_L;
    private boolean field_J;
    static String field_I;
    private long field_K;
    private int field_F;
    private int field_M;
    private long field_C;

    private final void o(int param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_F == this.field_H) {
            break L0;
          } else {
            L1: {
              if (this.field_F >= this.field_H) {
                stackIn_4_0 = this.field_H;
                break L1;
              } else {
                stackIn_4_0 = this.field_F;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_F < this.field_H) {
                stackIn_7_0 = this.field_H;
                break L2;
              } else {
                stackIn_7_0 = this.field_F;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_H = var2;
            this.field_F = var2;
            this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
            this.e((byte) 71);
            break L0;
          }
        }
        if (param0 != 1) {
          this.i(-74);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        long var6;
        m var8;
        if (null != this.field_q) {
          if (param2 == 0) {
            this.field_q.a(param0, param1, this.field_t, (byte) 107, (qg) (this));
            if (this.field_q instanceof m) {
              var8 = (m) ((Object) this.field_q);
              if (this.field_H == this.field_F) {
                var6 = lk.a(0);
                if (-501L >= ((-this.field_C + var6) % 1000L ^ -1L)) {
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                } else {
                  var8.a(param0, this.field_H, param1, (qg) (this), true);
                  var5 = 55 % ((77 - param3) / 34);
                  return;
                }
              } else {
                L0: {
                  var8.a((qg) (this), param1, param0, this.field_F, (byte) -49, this.field_H);
                  var6 = lk.a(0);
                  if (-501L < ((-this.field_C + var6) % 1000L ^ -1L)) {
                    var8.a(param0, this.field_H, param1, (qg) (this), true);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = 55 % ((77 - param3) / 34);
                return;
              }
            } else {
              var5 = 55 % ((77 - param3) / 34);
              return;
            }
          } else {
            var5 = 55 % ((77 - param3) / 34);
            return;
          }
        } else {
          var5 = 55 % ((77 - param3) / 34);
          return;
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_k.length();
        if (var2 != this.field_H) {
          if (param0 == -7638) {
            var3 = this.field_H - -1;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_k.charAt(var3 - 1) ^ -1)) {
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
            this.field_H = -53;
            var3 = this.field_H - -1;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_k.charAt(var3 - 1) ^ -1)) {
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
        } else {
          return this.field_H;
        }
    }

    private final void k(int param0) {
        this.d(false);
        this.o(1);
        if (param0 < 53) {
            this.i(-12);
        }
    }

    private final void a(int param0, boolean param1) {
        if (param1) {
          L0: {
            this.e((byte) -89);
            this.field_H = param0;
            if (!ve.field_B[81]) {
              this.field_F = this.field_H;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.field_H = param0;
            if (!ve.field_B[81]) {
              this.field_F = this.field_H;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(String param0, boolean param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                param0 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_k = param0;
              var4_int = param0.length();
              if ((this.field_E ^ -1) == 0) {
                break L2;
              } else {
                if (var4_int <= this.field_E) {
                  break L2;
                } else {
                  this.field_k = this.field_k.substring(0, this.field_E);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_k.length();
              this.field_F = dupTemp$1;
              this.field_H = dupTemp$1;
              if (!param1) {
                this.e((byte) 108);
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 == 1) {
              break L0;
            } else {
              this.field_M = -100;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("rg.HA(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                L1: {
                  if (param0 > 107) {
                    break L1;
                  } else {
                    this.j(33);
                    break L1;
                  }
                }
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.o(1);
                this.a(true, var2);
                break L0;
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
        if ((this.field_E ^ -1) != 0) {
            var3_int = this.field_E + -this.field_k.length();
            if (-1 >= (var3_int ^ -1)) {
                return;
            }
            param1 = param1.substring(0, var3_int);
        }
        if (this.field_H != this.field_k.length()) {
            this.field_k = this.field_k.substring(0, this.field_H) + param1 + this.field_k.substring(this.field_H, this.field_k.length());
        } else {
            this.field_k = this.field_k + param1;
        }
        if (!param0) {
            return;
        }
        try {
            this.field_H = this.field_H + param1.length();
            this.field_F = this.field_H;
            this.e((byte) 50);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "rg.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        String var4;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -30) {
          if (0 == this.field_H) {
            return this.field_H;
          } else {
            var2 = -1 + this.field_H;
            L0: while (true) {
              if (0 < var2) {
                if (this.field_k.charAt(var2 + -1) != 32) {
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
        } else {
          var4 = (String) null;
          this.a((String) null, true, 10);
          if (0 == this.field_H) {
            return this.field_H;
          } else {
            var2 = -1 + this.field_H;
            L1: while (true) {
              if (0 < var2) {
                if (this.field_k.charAt(var2 + -1) != 32) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        }
    }

    public static void g(byte param0) {
        if (param0 >= -40) {
          field_L = (oe[]) null;
          field_I = null;
          field_B = null;
          field_D = null;
          field_L = null;
          return;
        } else {
          field_I = null;
          field_B = null;
          field_D = null;
          field_L = null;
          return;
        }
    }

    rg(String param0, ma param1, int param2) {
        super(param0, param1);
        this.field_K = 0L;
        this.field_M = -1;
        this.field_A = false;
        try {
            this.field_E = param2;
            this.field_q = vi.field_e.field_f;
            this.a(param0, true, 1);
            this.field_J = true;
            this.field_C = lk.a(0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        this.field_H = 0;
        if (param0 != 81) {
            return;
        }
        this.field_k = "";
        this.field_F = 0;
        this.e((byte) 107);
    }

    private final String f(byte param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        if (param0 <= 7) {
          return (String) null;
        } else {
          L0: {
            if (this.field_F >= this.field_H) {
              stackIn_4_0 = this.field_H;
              break L0;
            } else {
              stackIn_4_0 = this.field_F;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_H <= this.field_F) {
              stackIn_7_0 = this.field_F;
              break L1;
            } else {
              stackIn_7_0 = this.field_H;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_k.substring(var2, var3);
        }
    }

    private final void h(int param0) {
        ue var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        m var9;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (!this.field_J) {
          this.field_o = 0;
          this.field_r = 0;
          return;
        } else {
          if (!(this.field_q instanceof m)) {
            return;
          } else {
            var9 = (m) ((Object) this.field_q);
            var3 = var9.a((qg) (this), -2);
            var4 = var3.b((byte) 3);
            var5 = var9.b(param0, (qg) (this));
            var6 = var9.a(true) >> 88541697;
            if (var4 < var5 + -var6) {
              this.field_o = 0;
              this.field_r = 0;
              return;
            } else {
              var7 = this.field_r + var3.c(0, this.field_H);
              if (var7 > var5 - var6) {
                this.field_r = this.field_r + -var6 - (-var5 - -var7);
                if (this.field_r <= 0) {
                  if (this.field_r >= -var5 + var6) {
                    return;
                  } else {
                    this.field_r = var6 + -var5;
                    return;
                  }
                } else {
                  this.field_r = 0;
                  return;
                }
              } else {
                if (var6 <= var7) {
                  if (this.field_r <= 0) {
                    if (this.field_r < -var5 + var6) {
                      this.field_r = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_r = 0;
                    return;
                  }
                } else {
                  this.field_r = this.field_r - var7 - -var6;
                  if (this.field_r <= 0) {
                    if (this.field_r >= -var5 + var6) {
                      return;
                    } else {
                      this.field_r = var6 + -var5;
                      return;
                    }
                  } else {
                    this.field_r = 0;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.b(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_q instanceof m)) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((m) ((Object) this.field_q)).a(param6, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
                  stackIn_5_0 = this;

                  if (0 == (var8_int ^ -1)) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    break L1;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, false);
                  var8_long = lk.a(param4 + 30386);
                  stackIn_8_0 = this;

                  if ((-this.field_K + var8_long ^ -1L) <= -251L) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((rg) (this)).field_A = stackIn_9_1 != 0;
                  if (!this.field_A) {
                    break L3;
                  } else {
                    L4: {
                      this.field_F = this.l(-119);
                      this.field_H = this.m(-7638);
                      if (0 >= this.field_H) {
                        break L4;
                      } else {
                        if (this.field_k.charAt(-1 + this.field_H) != 32) {
                          break L4;
                        } else {
                          this.field_H = this.field_H - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_M = this.field_H;
                    break L3;
                  }
                }
                this.field_K = var8_long;
                stackIn_15_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("rg.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        m var5 = null;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.h(0);
            if (this.field_s == 1) {
                if (this.field_q instanceof m) {
                    var5 = (m) ((Object) this.field_q);
                    var6 = var5.a(param0, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
                    if (0 != (var6 ^ -1)) {
                        if (this.field_A && var6 < this.field_M && var6 > this.field_F) {
                            var6 = this.field_M;
                        }
                        this.field_H = var6;
                    }
                }
                this.field_C = lk.a(0);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "rg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_C = lk.a(0);
            if (60 == param3) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 != 62) {
                L1: {
                  var5_int = -98 / ((param2 - 65) / 55);
                  if (param3 < 32) {
                    break L1;
                  } else {
                    if (param3 <= 126) {
                      L2: {
                        if (this.field_H != this.field_F) {
                          this.o(1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if ((this.field_E ^ -1) == 0) {
                            break L4;
                          } else {
                            if (this.field_k.length() >= this.field_E) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (this.field_H >= this.field_k.length()) {
                            this.field_k = this.field_k + param3;
                            dupTemp$0 = this.field_k.length();
                            this.field_H = dupTemp$0;
                            this.field_F = dupTemp$0;
                            break L5;
                          } else {
                            this.field_k = this.field_k.substring(0, this.field_H) + param3 + this.field_k.substring(this.field_H, this.field_k.length());
                            this.field_H = this.field_H + 1;
                            this.field_F = this.field_H;
                            break L5;
                          }
                        }
                        this.e((byte) 53);
                        break L3;
                      }
                      stackIn_74_0 = 1;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if ((param0 ^ -1) == -86) {
                    if (this.field_F != this.field_H) {
                      this.o(1);
                      stackIn_62_0 = 1;
                      decompiledRegionSelector0 = 13;
                      break L0;
                    } else {
                      if (-1 <= (this.field_H ^ -1)) {
                        break L6;
                      } else {
                        this.field_F = -1 + this.field_H;
                        this.o(1);
                        stackIn_60_0 = 1;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    }
                  } else {
                    if (param0 == 101) {
                      if (this.field_F != this.field_H) {
                        this.o(1);
                        stackIn_56_0 = 1;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        if (this.field_H >= this.field_k.length()) {
                          break L6;
                        } else {
                          this.field_F = this.field_H + 1;
                          this.o(1);
                          stackIn_54_0 = 1;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        }
                      }
                    } else {
                      if ((param0 ^ -1) == -14) {
                        this.i(81);
                        stackIn_50_0 = 1;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if ((param0 ^ -1) != -97) {
                          if (-98 == (param0 ^ -1)) {
                            if (this.field_H < this.field_k.length()) {
                              L7: {
                                stackIn_46_0 = this;

                                if (ve.field_B[82]) {
                                  stackIn_47_0 = this;
                                  stackIn_47_1 = this.m(-7638);
                                  break L7;
                                } else {
                                  stackIn_47_0 = this;
                                  stackIn_47_1 = 1 + this.field_H;
                                  break L7;
                                }
                              }
                              this.a(stackIn_47_1, false);
                              stackIn_48_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param0 != 102) {
                              if (103 != param0) {
                                if (84 == param0) {
                                  this.j(24349);
                                  stackIn_41_0 = 1;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                } else {
                                  L8: {
                                    if (!ve.field_B[82]) {
                                      break L8;
                                    } else {
                                      if (65 == param0) {
                                        this.k(62);
                                        stackIn_39_0 = 1;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ve.field_B[82]) {
                                      break L9;
                                    } else {
                                      if (-67 != (param0 ^ -1)) {
                                        break L9;
                                      } else {
                                        this.d(false);
                                        stackIn_32_0 = 1;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!ve.field_B[82]) {
                                    break L6;
                                  } else {
                                    if (param0 == 67) {
                                      this.h((byte) 115);
                                      stackIn_37_0 = 1;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                this.a(this.field_k.length(), false);
                                stackIn_24_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              this.a(0, false);
                              stackIn_21_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        } else {
                          if (-1 <= (this.field_H ^ -1)) {
                            break L6;
                          } else {
                            L10: {
                              stackIn_15_0 = this;

                              if (ve.field_B[82]) {
                                stackIn_16_0 = this;
                                stackIn_16_1 = this.l(-85);
                                break L10;
                              } else {
                                stackIn_16_0 = this;
                                stackIn_16_1 = this.field_H + -1;
                                break L10;
                              }
                            }
                            this.a(stackIn_16_1, false);
                            stackIn_17_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_76_0 = 0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_79_0 = (RuntimeException) (var5);

            stackIn_79_1 = new StringBuilder().append("rg.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_48_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_54_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
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

    void e(byte param0) {
        int discarded$1 = 0;
        L0: {
          if (this.field_m instanceof fb) {
            ((fb) ((Object) this.field_m)).a((rg) (this), -122);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 43) {
          discarded$1 = this.l(-86);
          return;
        } else {
          return;
        }
    }

    final static void n(int param0) {
        ub.field_d = false;
        nf.field_l.d((byte) 29);
        if (param0 < 66) {
            rg.n(74);
        }
    }

    private final void j(int param0) {
        L0: {
          if (this.field_m instanceof fb) {
            ((fb) ((Object) this.field_m)).a(1330, (rg) (this));
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 24349) {
          this.e((byte) 99);
          return;
        } else {
          return;
        }
    }

    private final void d(boolean param0) {
        try {
            String var2;
            if (param0) {
              L0: {
                this.h((byte) 92);
                var2 = this.f((byte) 77);
                if (-1 > (var2.length() ^ -1)) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.f((byte) 77);
                if (-1 > (var2.length() ^ -1)) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
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

    static {
        field_B = new int[]{200, 300, 300, 500, 300, 500, 200, 500, 500, 1000, 300, 300, 200, 300, 300, 300};
        field_I = "Email (Login):";
    }
}
