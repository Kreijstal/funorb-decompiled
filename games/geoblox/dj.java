/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends hk {
    static byte[] field_F;
    private int field_H;
    private int field_L;
    private int field_J;
    private boolean field_G;
    private boolean field_E;
    private long field_P;
    static byte[][] field_I;
    private int field_M;
    private long field_O;
    static int[] field_N;

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 0) {
            this.field_J = -7;
        }
        if (this.field_L != this.field_H) {
            var2 = this.field_L >= this.field_H ? this.field_H : this.field_L;
            var3 = this.field_H > this.field_L ? this.field_H : this.field_L;
            this.field_H = var2;
            this.field_L = var2;
            this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
            this.g((byte) -117);
        }
    }

    void a(boolean param0, int param1, el param2, int param3) {
        int var6 = 0;
        cc var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.j(-115);
              if (-2 == (this.field_f ^ -1)) {
                L2: {
                  if (!(this.field_q instanceof cc)) {
                    break L2;
                  } else {
                    var7 = (cc) ((Object) this.field_q);
                    var6 = var7.a((el) (this), qa.field_a, -15539, param1, ue.field_e, param3);
                    if (-1 != var6) {
                      L3: {
                        if (!this.field_G) {
                          break L3;
                        } else {
                          if (this.field_J <= var6) {
                            break L3;
                          } else {
                            if (this.field_L >= var6) {
                              break L3;
                            } else {
                              var6 = this.field_J;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_H = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_O = oa.a(-12520);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                field_I = (byte[][]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("dj.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    private final int h(byte param0) {
        String discarded$1 = null;
        int var2;
        int var3;
        int var4;
        var4 = Geoblox.field_C;
        var2 = this.field_s.length();
        if (var2 != this.field_H) {
          L0: {
            var3 = 1 + this.field_H;
            if (param0 == -57) {
              break L0;
            } else {
              discarded$1 = this.k((byte) -79);
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var3 >= var2) {
                break L2;
              } else {
                if (32 == this.field_s.charAt(-1 + var3)) {
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
          return this.field_H;
        }
    }

    private final String k(byte param0) {
        int var2 = 33 % ((-77 - param0) / 39);
        int var3 = this.field_L >= this.field_H ? this.field_H : this.field_L;
        int var4 = this.field_L < this.field_H ? this.field_H : this.field_L;
        return this.field_s.substring(var3, var4);
    }

    final static dm[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -70) {
            field_F = (byte[]) null;
        }
        dm[] var6 = new dm[9];
        dm[] var5 = var6;
        dm dupTemp$0 = ef.a(0, param0, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        dm dupTemp$1 = ef.a(0, param2, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param3 == 0)) {
            var6[4] = ef.a(0, param3, 64);
        }
        return var5;
    }

    dj(String param0, bb param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_P = 0L;
        this.field_J = -1;
        try {
            this.field_M = param2;
            this.field_q = hb.field_j.field_g;
            this.a(-128, param0, true);
            this.field_E = true;
            this.field_O = oa.a(-12520);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        this.i(-23161);
        if (param0 <= 29) {
            this.field_G = false;
        }
        this.g(0);
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = -6 / ((param1 - 63) / 50);
              if (this.field_M != -1) {
                var4 = this.field_M + -this.field_s.length();
                if (-1 < (var4 ^ -1)) {
                  param0 = param0.substring(0, var4);
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_H != this.field_s.length()) {
                this.field_s = this.field_s.substring(0, this.field_H) + param0 + this.field_s.substring(this.field_H, this.field_s.length());
                break L2;
              } else {
                this.field_s = this.field_s + param0;
                break L2;
              }
            }
            this.field_H = this.field_H + param0.length();
            this.field_L = this.field_H;
            this.g((byte) -36);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("dj.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        this.field_H = param0;
        if (param1 >= -114) {
            this.j(-114);
        }
        if (!(kj.field_o[81])) {
            this.field_L = this.field_H;
        }
    }

    public static void l(byte param0) {
        field_F = null;
        if (param0 != -15) {
            return;
        }
        field_N = null;
        field_I = (byte[][]) null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
            L1: {
              if (!super.a(param0, 104, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (!(this.field_q instanceof cc)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((cc) ((Object) this.field_q)).a((el) (this), qa.field_a, -15539, param0, ue.field_e, param2);
                    stackIn_4_0 = this;

                    if ((var8_int ^ -1) != 0) {
                      stackIn_5_0 = this;
                      stackIn_5_1 = var8_int;
                      break L2;
                    } else {
                      stackIn_5_0 = this;
                      stackIn_5_1 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    this.a(stackIn_5_1, (byte) -123);
                    var8_long = oa.a(-12520);
                    stackIn_7_0 = this;

                    if (-251L >= (var8_long - this.field_P ^ -1L)) {
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
                    ((dj) (this)).field_G = stackIn_8_1 != 0;
                    if (this.field_G) {
                      L5: {
                        this.field_L = this.j((byte) 77);
                        this.field_H = this.h((byte) -57);
                        if (0 >= this.field_H) {
                          break L5;
                        } else {
                          if (-33 != (this.field_s.charAt(this.field_H + -1) ^ -1)) {
                            break L5;
                          } else {
                            this.field_H = this.field_H - 1;
                            break L5;
                          }
                        }
                      }
                      this.field_J = this.field_H;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_P = var8_long;
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var8_int = 70 / ((param1 - -3) / 38);
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("dj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    private final void f(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.g(param0 ^ param0);
                this.a(var2, param0 ^ 43);
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

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        cc var6;
        long var7;
        L0: {
          var5 = -124 % ((param2 - 1) / 43);
          if (this.field_q == null) {
            break L0;
          } else {
            if (param3 == 0) {
              L1: {
                this.field_q.a(param0, -8, param1, this.field_D, (el) (this));
                if (!(this.field_q instanceof cc)) {
                  break L1;
                } else {
                  L2: {
                    var6 = (cc) ((Object) this.field_q);
                    if (this.field_H != this.field_L) {
                      var6.a(this.field_L, 0, param1, param0, this.field_H, (el) (this));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = oa.a(-12520);
                  if (((-this.field_O + var7) % 1000L ^ -1L) <= -501L) {
                    break L1;
                  } else {
                    var6.a(param0, this.field_H, -2, (el) (this), param1);
                    break L0;
                  }
                }
              }
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void m(byte param0) {
        if (this.field_u instanceof ga) {
            ((ga) ((Object) this.field_u)).a((dj) (this), -18649);
        }
        if (param0 < 107) {
            this.field_G = true;
        }
    }

    private final int j(byte param0) {
        int var2;
        int var3;
        var3 = Geoblox.field_C;
        if (0 != this.field_H) {
          if (param0 == 77) {
            var2 = this.field_H + -1;
            L0: while (true) {
              L1: {
                if (-1 <= (var2 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_s.charAt(var2 - 1) == 32) {
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
            return 108;
          }
        } else {
          return this.field_H;
        }
    }

    private final void i(int param0) {
        if (param0 != -23161) {
            return;
        }
        String var2 = this.k((byte) -128);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k((byte) -117))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void i(byte param0) {
        this.field_L = 0;
        this.field_H = 0;
        this.field_s = "";
        this.g((byte) -78);
        if (param0 <= 20) {
            this.field_E = true;
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        int dupTemp$0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param1 == 13) {
              this.field_O = oa.a(-12520);
              if (60 == param2) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 != 62) {
                  L1: {
                    if (32 > param2) {
                      break L1;
                    } else {
                      if (param2 <= 126) {
                        L2: {
                          if (this.field_H == this.field_L) {
                            break L2;
                          } else {
                            this.g(0);
                            break L2;
                          }
                        }
                        L3: {
                          L4: {
                            if (-1 == this.field_M) {
                              break L4;
                            } else {
                              if (this.field_s.length() < this.field_M) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (this.field_H >= this.field_s.length()) {
                              this.field_s = this.field_s + param2;
                              dupTemp$0 = this.field_s.length();
                              this.field_H = dupTemp$0;
                              this.field_L = dupTemp$0;
                              break L5;
                            } else {
                              this.field_s = this.field_s.substring(0, this.field_H) + param2 + this.field_s.substring(this.field_H, this.field_s.length());
                              this.field_H = this.field_H + 1;
                              this.field_L = this.field_H;
                              break L5;
                            }
                          }
                          this.g((byte) -36);
                          break L3;
                        }
                        stackIn_76_0 = 1;
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    if ((param0 ^ -1) == -86) {
                      if (this.field_H == this.field_L) {
                        if (0 < this.field_H) {
                          this.field_L = this.field_H + -1;
                          this.g(param1 ^ 13);
                          stackIn_65_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          break L6;
                        }
                      } else {
                        this.g(0);
                        stackIn_61_0 = 1;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      }
                    } else {
                      if (101 != param0) {
                        if (param0 == 13) {
                          this.i((byte) 76);
                          stackIn_58_0 = 1;
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          if (-97 == (param0 ^ -1)) {
                            if (0 < this.field_H) {
                              L7: {
                                stackIn_54_0 = this;

                                if (!kj.field_o[82]) {
                                  stackIn_55_0 = this;
                                  stackIn_55_1 = this.field_H - 1;
                                  break L7;
                                } else {
                                  stackIn_55_0 = this;
                                  stackIn_55_1 = this.j((byte) 77);
                                  break L7;
                                }
                              }
                              this.a(stackIn_55_1, (byte) -126);
                              stackIn_56_0 = 1;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L6;
                            }
                          } else {
                            if (-98 == (param0 ^ -1)) {
                              if (this.field_H >= this.field_s.length()) {
                                break L6;
                              } else {
                                L8: {
                                  stackIn_47_0 = this;

                                  if (!kj.field_o[82]) {
                                    stackIn_48_0 = this;
                                    stackIn_48_1 = this.field_H - -1;
                                    break L8;
                                  } else {
                                    stackIn_48_0 = this;
                                    stackIn_48_1 = this.h((byte) -57);
                                    break L8;
                                  }
                                }
                                this.a(stackIn_48_1, (byte) -125);
                                stackIn_49_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              }
                            } else {
                              if (102 != param0) {
                                if (param0 == 103) {
                                  this.a(this.field_s.length(), (byte) -126);
                                  stackIn_43_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if (-85 != (param0 ^ -1)) {
                                    L9: {
                                      if (!kj.field_o[82]) {
                                        break L9;
                                      } else {
                                        if (param0 != 65) {
                                          break L9;
                                        } else {
                                          this.h(112);
                                          stackIn_32_0 = 1;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!kj.field_o[82]) {
                                        break L10;
                                      } else {
                                        if (-67 != (param0 ^ -1)) {
                                          break L10;
                                        } else {
                                          this.i(-23161);
                                          stackIn_36_0 = 1;
                                          decompiledRegionSelector0 = 7;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!kj.field_o[82]) {
                                      break L6;
                                    } else {
                                      if (67 == param0) {
                                        this.f(82);
                                        stackIn_41_0 = 1;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  } else {
                                    this.m((byte) 111);
                                    stackIn_28_0 = 1;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              } else {
                                this.a(0, (byte) -118);
                                stackIn_24_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_L != this.field_H) {
                          this.g(0);
                          stackIn_18_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (this.field_H >= this.field_s.length()) {
                            break L6;
                          } else {
                            this.field_L = this.field_H - -1;
                            this.g(0);
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  stackIn_78_0 = 0;
                  decompiledRegionSelector0 = 16;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var5);

            stackIn_81_1 = new StringBuilder().append("dj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L11;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L11;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_32_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_36_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_43_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_49_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_56_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_58_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_61_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_65_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_76_0 != 0;
                                      } else {
                                        return stackIn_78_0 != 0;
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

    private final void j(int param0) {
        dk var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        cc var9;
        var8 = Geoblox.field_C;
        if (!this.field_E) {
          this.field_n = 0;
          this.field_k = 0;
          return;
        } else {
          if (!(this.field_q instanceof cc)) {
            return;
          } else {
            var9 = (cc) ((Object) this.field_q);
            if (param0 <= -66) {
              var3 = var9.a((byte) 119, (el) (this));
              var4 = var3.a(96);
              var5 = var9.a((el) (this), -1);
              var6 = var9.a(1) >> -2144366815;
              if (var4 >= var5 + -var6) {
                L0: {
                  var7 = this.field_k + var3.a(this.field_H, 120);
                  if (var7 > var5 - var6) {
                    this.field_k = this.field_k - (var7 - -var6 - var5);
                    break L0;
                  } else {
                    if (var7 >= var6) {
                      break L0;
                    } else {
                      this.field_k = this.field_k - (-var6 + var7);
                      break L0;
                    }
                  }
                }
                L1: {
                  if ((this.field_k ^ -1) >= -1) {
                    if (var6 + -var5 <= this.field_k) {
                      break L1;
                    } else {
                      this.field_k = var6 + -var5;
                      break L1;
                    }
                  } else {
                    this.field_k = 0;
                    break L1;
                  }
                }
                return;
              } else {
                this.field_k = 0;
                this.field_n = 0;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = 8 / ((param0 - -65) / 44);
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              this.field_s = param1;
              var5 = param1.length();
              if (0 == (this.field_M ^ -1)) {
                break L2;
              } else {
                if (this.field_M < var5) {
                  this.field_s = this.field_s.substring(0, this.field_M);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$1 = this.field_s.length();
              this.field_L = dupTemp$1;
              this.field_H = dupTemp$1;
              if (param2) {
                break L3;
              } else {
                this.g((byte) -58);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("dj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    void g(byte param0) {
        if (param0 >= -16) {
            return;
        }
        if (!(!(this.field_u instanceof ga))) {
            ((ga) ((Object) this.field_u)).a((dj) (this), (byte) 74);
        }
    }

    static {
        field_F = new byte[520];
        field_I = new byte[1000][];
        field_N = new int[8192];
    }
}
