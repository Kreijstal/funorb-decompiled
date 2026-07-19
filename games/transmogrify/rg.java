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
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_F == this.field_H) {
            break L0;
          } else {
            L1: {
              if (this.field_F >= this.field_H) {
                stackOut_3_0 = this.field_H;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = this.field_F;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_F < this.field_H) {
                stackOut_6_0 = this.field_H;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = this.field_F;
                stackIn_7_0 = stackOut_5_0;
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
        int var5 = 0;
        long var6 = 0L;
        m var8 = null;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_k.length();
        if (var2 != this.field_H) {
          if (param0 == -7638) {
            var3 = this.field_H - -1;
            L0: while (true) {
              if (var2 > var3) {
                stackOut_17_0 = -33;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var4 == 0) {
                  if (stackIn_19_0 != (this.field_k.charAt(var3 - 1) ^ -1)) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_18_0;
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
                stackOut_7_0 = -33;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if (stackIn_9_0 != (this.field_k.charAt(var3 - 1) ^ -1)) {
                    var3++;
                    continue L1;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_8_0;
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
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
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
              dupTemp$2 = this.field_k.length();
              this.field_F = dupTemp$2;
              this.field_H = dupTemp$2;
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
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("rg.HA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
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
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.o(1);
                this.a(true, var2_ref);
                break L0;
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
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
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
              if ((this.field_E ^ -1) == 0) {
                break L1;
              } else {
                var3_int = this.field_E + -this.field_k.length();
                if (-1 < (var3_int ^ -1)) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              L3: {
                if (this.field_H == this.field_k.length()) {
                  break L3;
                } else {
                  this.field_k = this.field_k.substring(0, this.field_H) + param1 + this.field_k.substring(this.field_H, this.field_k.length());
                  if (!Transmogrify.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_k = this.field_k + param1;
              break L2;
            }
            if (param0) {
              this.field_H = this.field_H + param1.length();
              this.field_F = this.field_H;
              this.e((byte) 50);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("rg.DA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        char stackIn_9_0 = 0;
        char stackIn_10_0 = 0;
        char stackIn_22_0 = 0;
        char stackIn_23_0 = 0;
        char stackOut_21_0 = 0;
        char stackOut_8_0 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -30) {
          if (0 == this.field_H) {
            return this.field_H;
          } else {
            var2 = -1 + this.field_H;
            L0: while (true) {
              if (0 < var2) {
                stackOut_21_0 = this.field_k.charAt(var2 + -1);
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (var3 == 0) {
                  if (stackIn_23_0 != 32) {
                    var2--;
                    continue L0;
                  } else {
                    return var2;
                  }
                } else {
                  return stackIn_22_0;
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
                stackOut_8_0 = this.field_k.charAt(var2 + -1);
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var3 == 0) {
                  if (stackIn_10_0 != 32) {
                    var2--;
                    continue L1;
                  } else {
                    return var2;
                  }
                } else {
                  return stackIn_9_0;
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
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= 7) {
          return (String) null;
        } else {
          L0: {
            if (this.field_F >= this.field_H) {
              stackOut_3_0 = this.field_H;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_F;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_H <= this.field_F) {
              stackOut_6_0 = this.field_F;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_H;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_k.substring(var2, var3);
        }
    }

    private final void h(int param0) {
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        m var9 = null;
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
                  if (var8 != 0) {
                    if (this.field_r < -var5 + var6) {
                      this.field_r = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (var6 > var7) {
                  this.field_r = this.field_r - var7 - -var6;
                  if (var8 != 0) {
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
                      if (var8 != 0) {
                        if (this.field_r < -var5 + var6) {
                          this.field_r = var6 + -var5;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
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
                  }
                } else {
                  if (this.field_r <= 0) {
                    if (this.field_r < -var5 + var6) {
                      this.field_r = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_r = 0;
                    if (var8 != 0) {
                      if (this.field_r < -var5 + var6) {
                        this.field_r = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
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
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
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
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (super.b(param0, param1, param2, param3, param4, param5, param6)) {
              if (!(this.field_q instanceof m)) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = ((m) ((Object) this.field_q)).a(param6, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (0 == (var8_int ^ -1)) {
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
                  this.a(stackIn_6_1, false);
                  var8_long = lk.a(param4 + 30386);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if ((-this.field_K + var8_long ^ -1L) <= -251L) {
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
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
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
            stackOut_18_0 = (RuntimeException) (var8);
            stackOut_18_1 = new StringBuilder().append("rg.O(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
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
        RuntimeException runtimeException = null;
        m var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.h(0);
              if (this.field_s != 1) {
                break L1;
              } else {
                L2: {
                  if (!(this.field_q instanceof m)) {
                    break L2;
                  } else {
                    var5 = (m) ((Object) this.field_q);
                    var6 = var5.a(param0, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
                    if (0 == (var6 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_A) {
                          break L3;
                        } else {
                          if (var6 >= this.field_M) {
                            break L3;
                          } else {
                            if (var6 <= this.field_F) {
                              break L3;
                            } else {
                              var6 = this.field_M;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_H = var6;
                      break L2;
                    }
                  }
                }
                this.field_C = lk.a(0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        Object stackIn_14_0 = null;
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
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            this.field_C = lk.a(0);
            if (60 == param3) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
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
                          L6: {
                            if (this.field_H >= this.field_k.length()) {
                              break L6;
                            } else {
                              this.field_k = this.field_k.substring(0, this.field_H) + param3 + this.field_k.substring(this.field_H, this.field_k.length());
                              this.field_H = this.field_H + 1;
                              this.field_F = this.field_H;
                              if (!Transmogrify.field_A) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.field_k = this.field_k + param3;
                          dupTemp$1 = this.field_k.length();
                          this.field_H = dupTemp$1;
                          this.field_F = dupTemp$1;
                          break L5;
                        }
                        this.e((byte) 53);
                        break L3;
                      }
                      stackOut_74_0 = 1;
                      stackIn_75_0 = stackOut_74_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L7: {
                  if ((param0 ^ -1) == -86) {
                    if (this.field_F != this.field_H) {
                      this.o(1);
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      decompiledRegionSelector0 = 13;
                      break L0;
                    } else {
                      if (-1 <= (this.field_H ^ -1)) {
                        break L7;
                      } else {
                        this.field_F = -1 + this.field_H;
                        this.o(1);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    }
                  } else {
                    if (param0 == 101) {
                      if (this.field_F != this.field_H) {
                        this.o(1);
                        stackOut_55_0 = 1;
                        stackIn_56_0 = stackOut_55_0;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        if (this.field_H >= this.field_k.length()) {
                          break L7;
                        } else {
                          this.field_F = this.field_H + 1;
                          this.o(1);
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        }
                      }
                    } else {
                      if ((param0 ^ -1) == -14) {
                        this.i(81);
                        stackOut_49_0 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if ((param0 ^ -1) != -97) {
                          if (-98 == (param0 ^ -1)) {
                            if (this.field_H < this.field_k.length()) {
                              L8: {
                                stackOut_44_0 = this;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (ve.field_B[82]) {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = this.m(-7638);
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  break L8;
                                } else {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = 1 + this.field_H;
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_47_1, false);
                              stackOut_47_0 = 1;
                              stackIn_48_0 = stackOut_47_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param0 != 102) {
                              if (103 != param0) {
                                if (84 == param0) {
                                  this.j(24349);
                                  stackOut_40_0 = 1;
                                  stackIn_41_0 = stackOut_40_0;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                } else {
                                  L9: {
                                    if (!ve.field_B[82]) {
                                      break L9;
                                    } else {
                                      if (65 == param0) {
                                        this.k(62);
                                        stackOut_38_0 = 1;
                                        stackIn_39_0 = stackOut_38_0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!ve.field_B[82]) {
                                      break L10;
                                    } else {
                                      if (-67 != (param0 ^ -1)) {
                                        break L10;
                                      } else {
                                        this.d(false);
                                        stackOut_31_0 = 1;
                                        stackIn_32_0 = stackOut_31_0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!ve.field_B[82]) {
                                    break L7;
                                  } else {
                                    if (param0 == 67) {
                                      this.h((byte) 115);
                                      stackOut_36_0 = 1;
                                      stackIn_37_0 = stackOut_36_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              } else {
                                this.a(this.field_k.length(), false);
                                stackOut_23_0 = 1;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              this.a(0, false);
                              stackOut_20_0 = 1;
                              stackIn_21_0 = stackOut_20_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        } else {
                          if (-1 <= (this.field_H ^ -1)) {
                            break L7;
                          } else {
                            L11: {
                              stackOut_13_0 = this;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (ve.field_B[82]) {
                                stackOut_15_0 = this;
                                stackOut_15_1 = this.l(-85);
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                break L11;
                              } else {
                                stackOut_14_0 = this;
                                stackOut_14_1 = this.field_H + -1;
                                stackIn_16_0 = stackOut_14_0;
                                stackIn_16_1 = stackOut_14_1;
                                break L11;
                              }
                            }
                            this.a(stackIn_16_1, false);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
                decompiledRegionSelector0 = 15;
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
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("rg.K(").append(param0).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param2 + ',' + param3 + ')');
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
                                      return stackIn_75_0 != 0;
                                    } else {
                                      return stackIn_77_0 != 0;
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
        int discarded$2 = 0;
        L0: {
          if (this.field_m instanceof fb) {
            ((fb) ((Object) this.field_m)).a((rg) (this), -122);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 43) {
          discarded$2 = this.l(-86);
          return;
        } else {
          return;
        }
    }

    final static void n(int param0) {
        ub.field_d = false;
        int discarded$4 = nf.field_l.d((byte) 29);
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
            String var2 = null;
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
