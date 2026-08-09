/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends rm {
    private boolean field_I;
    static String field_M;
    private boolean field_G;
    private int field_N;
    private long field_P;
    static int[] field_K;
    private int field_L;
    static int[] field_J;
    private int field_O;
    private long field_H;
    static boolean field_R;
    private int field_Q;

    private final void a(boolean param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          if (this.field_O == this.field_L) {
            break L0;
          } else {
            L1: {
              if (this.field_O <= this.field_L) {
                stackIn_4_0 = this.field_O;
                break L1;
              } else {
                stackIn_4_0 = this.field_L;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (this.field_L >= this.field_O) {
                stackIn_7_0 = this.field_L;
                break L2;
              } else {
                stackIn_7_0 = this.field_O;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            this.field_O = var2;
            this.field_L = var2;
            this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
            this.f((byte) 100);
            break L0;
          }
        }
        if (param0) {
          this.field_G = false;
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 == -31523) {
          this.field_O = param1;
          if (!lk.field_g[81]) {
            this.field_L = this.field_O;
            return;
          } else {
            return;
          }
        } else {
          this.a(-33, -31, 0, 101);
          this.field_O = param1;
          if (lk.field_g[81]) {
            return;
          } else {
            this.field_L = this.field_O;
            return;
          }
        }
    }

    private final void m(int param0) {
        this.j(-117);
        if (param0 <= 93) {
            nk.n(-47);
            this.a(false);
            return;
        }
        this.a(false);
    }

    private final void b(boolean param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.a(false);
                if (param0) {
                  this.a(-127, var2);
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

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (this.field_l instanceof vc) {
                L1: {
                  var8_int = ((vc) ((Object) this.field_l)).a(param2, (byte) 76, nc.field_g, param0, (n) (this), rf.field_X);
                  stackIn_6_0 = this;

                  stackIn_6_1 = -31523;

                  if (var8_int != -1) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = var8_int;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 0;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = bb.b(-1);
                  stackIn_9_0 = this;

                  if (-251L >= (-this.field_H + var8_long ^ -1L)) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((nk) (this)).field_G = stackIn_10_1 != 0;
                  if (this.field_G) {
                    L4: {
                      this.field_L = this.a((byte) 70);
                      this.field_O = this.e((byte) -88);
                      if ((this.field_O ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (32 != this.field_q.charAt(this.field_O + -1)) {
                          break L4;
                        } else {
                          this.field_O = this.field_O - 1;
                          break L4;
                        }
                      }
                    }
                    this.field_Q = this.field_O;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_H = var8_long;
                stackIn_17_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 1;
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
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("nk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        vc var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.k(-62);
              if ((this.field_v ^ -1) != -2) {
                break L1;
              } else {
                L2: {
                  if (this.field_l instanceof vc) {
                    var5 = (vc) ((Object) this.field_l);
                    var6 = var5.a(param2, (byte) 110, nc.field_g, param0, (n) (this), rf.field_X);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_G) {
                          break L3;
                        } else {
                          if (var6 >= this.field_Q) {
                            break L3;
                          } else {
                            if (var6 <= this.field_L) {
                              break L3;
                            } else {
                              var6 = this.field_Q;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_O = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_P = bb.b(-1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("nk.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        vc var8;
        if (this.field_l != null) {
          if (-1 == (param3 ^ -1)) {
            L0: {
              this.field_l.a(this.field_D, param2, -101, (n) (this), param1);
              if (!(this.field_l instanceof vc)) {
                break L0;
              } else {
                L1: {
                  var8 = (vc) ((Object) this.field_l);
                  if (this.field_O != this.field_L) {
                    var8.a(-108, param1, param2, this.field_O, this.field_L, (n) (this));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var6 = bb.b(-1);
                if (-501L < ((var6 + -this.field_P) % 1000L ^ -1L)) {
                  var8.a(param2, (n) (this), this.field_O, (byte) -98, param1);
                  break L0;
                } else {
                  if (param0 != -9532) {
                    this.k(-36);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -9532) {
              this.k(-36);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -9532) {
            this.k(-36);
            return;
          } else {
            return;
          }
        }
    }

    private final String g(byte param0) {
        int var3 = -83 / ((-74 - param0) / 45);
        int var2 = this.field_L >= this.field_O ? this.field_O : this.field_L;
        int var4 = this.field_L >= this.field_O ? this.field_L : this.field_O;
        return this.field_q.substring(var2, var4);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = this.field_q.length();
        if (this.field_O != var2) {
          if (param0 == -88) {
            var3 = 1 + this.field_O;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (this.field_q.charAt(var3 + -1) ^ -1)) {
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
            return -8;
          }
        } else {
          return this.field_O;
        }
    }

    nk(String param0, tb param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_Q = -1;
        this.field_H = 0L;
        try {
            this.field_N = param2;
            this.field_l = pc.field_b.field_s;
            this.a(true, param0, 1471);
            this.field_I = true;
            this.field_P = bb.b(-1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 != (this.field_N ^ -1)) {
                var3_int = this.field_N + -this.field_q.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
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
              if (param0 < -117) {
                break L2;
              } else {
                this.field_L = -34;
                break L2;
              }
            }
            L3: {
              if (this.field_O != this.field_q.length()) {
                this.field_q = this.field_q.substring(0, this.field_O) + param1 + this.field_q.substring(this.field_O, this.field_q.length());
                break L3;
              } else {
                this.field_q = this.field_q + param1;
                break L3;
              }
            }
            this.field_O = this.field_O + param1.length();
            this.field_L = this.field_O;
            this.f((byte) -123);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("nk.EA(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (this.field_O == 0) {
          return this.field_O;
        } else {
          var2 = -1 + this.field_O;
          var3 = 56 / ((5 - param0) / 42);
          L0: while (true) {
            if ((var2 ^ -1) < -1) {
              if (32 != this.field_q.charAt(-1 + var2)) {
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

    private final void l(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        if (!(this.field_t instanceof ed)) {
          if (param0 <= 83) {
            discarded$2 = this.e((byte) -112);
            return;
          } else {
            return;
          }
        } else {
          ((ed) ((Object) this.field_t)).a((byte) 19, (nk) (this));
          if (param0 > 83) {
            return;
          } else {
            discarded$3 = this.e((byte) -112);
            return;
          }
        }
    }

    void f(byte param0) {
        if (!(!(this.field_t instanceof ed))) {
            ((ed) ((Object) this.field_t)).a((nk) (this), -110);
        }
        int var2 = 81 % ((param0 - -44) / 59);
    }

    private final void k(int param0) {
        int var3;
        lm var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        vc var10;
        var9 = HoldTheLine.field_D;
        if (this.field_I) {
          if (this.field_l instanceof vc) {
            var10 = (vc) ((Object) this.field_l);
            var3 = 14 / ((70 - param0) / 49);
            var4 = var10.a((byte) 20, (n) (this));
            var5 = var4.a((byte) 98);
            var6 = var10.a(9, (n) (this));
            var7 = var10.a(true) >> 1791053921;
            if (var6 + -var7 <= var5) {
              var8 = this.field_m - -var4.a(16777215, this.field_O);
              if (-var7 + var6 >= var8) {
                if (var8 >= var7) {
                  if (0 >= this.field_m) {
                    if (this.field_m < -var6 - -var7) {
                      this.field_m = -var6 - -var7;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_m = 0;
                    return;
                  }
                } else {
                  this.field_m = this.field_m - -var7 + -var8;
                  if (0 >= this.field_m) {
                    if (this.field_m >= -var6 - -var7) {
                      return;
                    } else {
                      this.field_m = -var6 - -var7;
                      return;
                    }
                  } else {
                    this.field_m = 0;
                    return;
                  }
                }
              } else {
                this.field_m = this.field_m - (var8 - -var7) + var6;
                if (0 >= this.field_m) {
                  if (this.field_m >= -var6 - -var7) {
                    return;
                  } else {
                    this.field_m = -var6 - -var7;
                    return;
                  }
                } else {
                  this.field_m = 0;
                  return;
                }
              }
            } else {
              this.field_y = 0;
              this.field_m = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_m = 0;
          this.field_y = 0;
          return;
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            this.field_P = bb.b(-1);
            if (param2 == -78) {
              L1: {
                if (param3 == 60) {
                  break L1;
                } else {
                  if (param3 == 62) {
                    break L1;
                  } else {
                    L2: {
                      if (param3 < 32) {
                        break L2;
                      } else {
                        if (param3 <= 126) {
                          L3: {
                            if (this.field_L == this.field_O) {
                              break L3;
                            } else {
                              this.a(false);
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (0 == (this.field_N ^ -1)) {
                                break L5;
                              } else {
                                if (this.field_q.length() >= this.field_N) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (this.field_O < this.field_q.length()) {
                                this.field_q = this.field_q.substring(0, this.field_O) + param3 + this.field_q.substring(this.field_O, this.field_q.length());
                                this.field_O = this.field_O + 1;
                                this.field_L = this.field_O;
                                break L6;
                              } else {
                                this.field_q = this.field_q + param3;
                                dupTemp$0 = this.field_q.length();
                                this.field_O = dupTemp$0;
                                this.field_L = dupTemp$0;
                                break L6;
                              }
                            }
                            this.f((byte) 126);
                            break L4;
                          }
                          stackIn_75_0 = 1;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if (param1 == 85) {
                        if (this.field_L != this.field_O) {
                          this.a(false);
                          stackIn_64_0 = 1;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if ((this.field_O ^ -1) >= -1) {
                            break L7;
                          } else {
                            this.field_L = -1 + this.field_O;
                            this.a(false);
                            stackIn_62_0 = 1;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          }
                        }
                      } else {
                        if (param1 == 101) {
                          if (this.field_L == this.field_O) {
                            if (this.field_O >= this.field_q.length()) {
                              break L7;
                            } else {
                              this.field_L = 1 + this.field_O;
                              this.a(false);
                              stackIn_58_0 = 1;
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          } else {
                            this.a(false);
                            stackIn_55_0 = 1;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          }
                        } else {
                          if (13 == param1) {
                            this.o(1);
                            stackIn_52_0 = 1;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            if (param1 == 96) {
                              if (0 >= this.field_O) {
                                break L7;
                              } else {
                                L8: {
                                  stackIn_48_0 = this;

                                  stackIn_48_1 = -31523;

                                  if (lk.field_g[82]) {
                                    stackIn_49_0 = this;
                                    stackIn_49_1 = stackIn_48_1;
                                    stackIn_49_2 = this.a((byte) -37);
                                    break L8;
                                  } else {
                                    stackIn_49_0 = this;
                                    stackIn_49_1 = stackIn_48_1;
                                    stackIn_49_2 = -1 + this.field_O;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_49_1, stackIn_49_2);
                                stackIn_50_0 = 1;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              if ((param1 ^ -1) == -98) {
                                if (this.field_O >= this.field_q.length()) {
                                  break L7;
                                } else {
                                  L9: {
                                    stackIn_42_0 = this;

                                    stackIn_42_1 = -31523;

                                    if (!lk.field_g[82]) {
                                      stackIn_43_0 = this;
                                      stackIn_43_1 = stackIn_42_1;
                                      stackIn_43_2 = 1 + this.field_O;
                                      break L9;
                                    } else {
                                      stackIn_43_0 = this;
                                      stackIn_43_1 = stackIn_42_1;
                                      stackIn_43_2 = this.e((byte) -88);
                                      break L9;
                                    }
                                  }
                                  this.a(stackIn_43_1, stackIn_43_2);
                                  stackIn_44_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                }
                              } else {
                                if ((param1 ^ -1) != -103) {
                                  if (103 != param1) {
                                    if (84 == param1) {
                                      this.l(93);
                                      stackIn_38_0 = 1;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    } else {
                                      L10: {
                                        if (!lk.field_g[82]) {
                                          break L10;
                                        } else {
                                          if ((param1 ^ -1) == -66) {
                                            this.m(103);
                                            stackIn_36_0 = 1;
                                            decompiledRegionSelector0 = 6;
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (!lk.field_g[82]) {
                                          break L11;
                                        } else {
                                          if (-67 == (param1 ^ -1)) {
                                            this.j(-73);
                                            stackIn_34_0 = 1;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      if (!lk.field_g[82]) {
                                        break L7;
                                      } else {
                                        if (67 != param1) {
                                          break L7;
                                        } else {
                                          this.b(true);
                                          stackIn_32_0 = 1;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    this.a(-31523, this.field_q.length());
                                    stackIn_21_0 = 1;
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                } else {
                                  this.a(-31523, 0);
                                  stackIn_18_0 = 1;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_77_0 = 0;
                    decompiledRegionSelector0 = 16;
                    break L0;
                  }
                }
              }
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var5);

            stackIn_80_1 = new StringBuilder().append("nk.T(");

            if (param0 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L12;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_38_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_44_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_50_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_52_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_55_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_58_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_62_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_64_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
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
    }

    private final void j(int param0) {
        try {
            String var2;
            var2 = this.g((byte) -126);
            if (param0 <= -37) {
              if (var2.length() > 0) {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              } else {
                return;
              }
            } else {
              this.field_I = false;
              if (var2.length() <= 0) {
                return;
              } else {
                java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param2 == 1471) {
                break L2;
              } else {
                this.o(114);
                break L2;
              }
            }
            L3: {
              this.field_q = param1;
              var4_int = param1.length();
              if (this.field_N == -1) {
                break L3;
              } else {
                if (this.field_N >= var4_int) {
                  break L3;
                } else {
                  this.field_q = this.field_q.substring(0, this.field_N);
                  break L3;
                }
              }
            }
            dupTemp$1 = this.field_q.length();
            this.field_L = dupTemp$1;
            this.field_O = dupTemp$1;
            if (param0) {
              break L0;
            } else {
              this.f((byte) 19);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final void o(int param0) {
        this.field_O = 0;
        this.field_q = "";
        this.field_L = 0;
        this.f((byte) 105);
        if (param0 != 1) {
            this.b(true);
        }
    }

    public static void n(int param0) {
        field_M = null;
        field_J = null;
        if (param0 != 3875) {
            return;
        }
        field_K = null;
    }

    static {
        field_M = "Create a free account to";
    }
}
