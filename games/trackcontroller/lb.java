/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends rh {
    static boolean field_M;
    private int field_L;
    private long field_R;
    static rd field_O;
    private boolean field_K;
    private long field_I;
    private boolean field_P;
    private int field_N;
    private int field_Q;
    private int field_J;

    final boolean a(byte param0, char param1, al param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_I = qg.a(false);
              var5_int = -37 % ((param0 - 17) / 51);
              if (param1 == 60) {
                break L1;
              } else {
                if (62 == param1) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 32) {
                      break L2;
                    } else {
                      if (param1 <= 126) {
                        L3: {
                          if (this.field_N == this.field_Q) {
                            break L3;
                          } else {
                            this.j(29388);
                            break L3;
                          }
                        }
                        L4: {
                          L5: {
                            if (this.field_J == -1) {
                              break L5;
                            } else {
                              if (this.field_s.length() < this.field_J) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (this.field_Q < this.field_s.length()) {
                              this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
                              this.field_Q = this.field_Q + 1;
                              this.field_N = this.field_Q;
                              break L6;
                            } else {
                              this.field_s = this.field_s + param1;
                              dupTemp$0 = this.field_s.length();
                              this.field_Q = dupTemp$0;
                              this.field_N = dupTemp$0;
                              break L6;
                            }
                          }
                          this.b(true);
                          break L4;
                        }
                        stackIn_72_0 = 1;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    if (param3 != 85) {
                      if ((param3 ^ -1) == -102) {
                        if (this.field_Q != this.field_N) {
                          this.j(29388);
                          stackIn_61_0 = 1;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          if (this.field_Q >= this.field_s.length()) {
                            break L7;
                          } else {
                            this.field_N = 1 + this.field_Q;
                            this.j(29388);
                            stackIn_59_0 = 1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      } else {
                        if (param3 == 13) {
                          this.l(-90);
                          stackIn_55_0 = 1;
                          decompiledRegionSelector0 = 11;
                          break L0;
                        } else {
                          if ((param3 ^ -1) != -97) {
                            if (97 != param3) {
                              if (param3 == 102) {
                                this.a(-19166, 0);
                                stackIn_53_0 = 1;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (-104 == (param3 ^ -1)) {
                                  this.a(-19166, this.field_s.length());
                                  stackIn_51_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if ((param3 ^ -1) != -85) {
                                    L8: {
                                      if (!ni.field_m[82]) {
                                        break L8;
                                      } else {
                                        if (-66 == (param3 ^ -1)) {
                                          this.d((byte) 13);
                                          stackIn_49_0 = 1;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!ni.field_m[82]) {
                                        break L9;
                                      } else {
                                        if (66 != param3) {
                                          break L9;
                                        } else {
                                          this.m(118);
                                          stackIn_42_0 = 1;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (!ni.field_m[82]) {
                                      break L7;
                                    } else {
                                      if (param3 == 67) {
                                        this.e((byte) 82);
                                        stackIn_47_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        return false;
                                      }
                                    }
                                  } else {
                                    this.c(false);
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              if (this.field_Q >= this.field_s.length()) {
                                break L7;
                              } else {
                                L10: {
                                  stackIn_28_0 = this;

                                  stackIn_28_1 = -19166;

                                  if (!ni.field_m[82]) {
                                    stackIn_29_0 = this;
                                    stackIn_29_1 = stackIn_28_1;
                                    stackIn_29_2 = 1 + this.field_Q;
                                    break L10;
                                  } else {
                                    stackIn_29_0 = this;
                                    stackIn_29_1 = stackIn_28_1;
                                    stackIn_29_2 = this.r(0);
                                    break L10;
                                  }
                                }
                                this.a(stackIn_29_1, stackIn_29_2);
                                stackIn_30_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          } else {
                            if ((this.field_Q ^ -1) >= -1) {
                              break L7;
                            } else {
                              L11: {
                                stackIn_21_0 = this;

                                stackIn_21_1 = -19166;

                                if (ni.field_m[82]) {
                                  stackIn_22_0 = this;
                                  stackIn_22_1 = stackIn_21_1;
                                  stackIn_22_2 = this.k(-1);
                                  break L11;
                                } else {
                                  stackIn_22_0 = this;
                                  stackIn_22_1 = stackIn_21_1;
                                  stackIn_22_2 = -1 + this.field_Q;
                                  break L11;
                                }
                              }
                              this.a(stackIn_22_1, stackIn_22_2);
                              stackIn_23_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_N == this.field_Q) {
                        if (this.field_Q <= 0) {
                          break L7;
                        } else {
                          this.field_N = -1 + this.field_Q;
                          this.j(29388);
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        this.j(29388);
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_74_0 = 0;
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
          L12: {
            var5 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var5);

            stackIn_77_1 = new StringBuilder().append("lb.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L12;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L12;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_49_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_51_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_53_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_55_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_59_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_61_0 != 0;
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

    public static void n(int param0) {
        if (param0 != -85) {
            lb.n(-22);
        }
        field_O = null;
    }

    private final void e(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            try {
              L0: {
                var3 = -49 % ((-7 - param0) / 53);
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.j(29388);
                this.a(0, var2);
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

    private final void c(boolean param0) {
        if (!(!(this.field_l instanceof se))) {
            ((se) ((Object) this.field_l)).b(-28, (lb) (this));
        }
        if (param0) {
            this.field_N = -68;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
            if (super.a(param0, param1, param2, param3, param4 + param4, param5, param6)) {
              if (this.field_y instanceof dl) {
                L1: {
                  var8_int = ((dl) ((Object) this.field_y)).a(param6, kf.field_b, 81, fg.field_a, param5, (al) (this));
                  stackIn_6_0 = this;

                  stackIn_6_1 = -19166;

                  if (var8_int == -1) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = var8_int;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_7_1, stackIn_7_2);
                  var8_long = qg.a(false);
                  stackIn_9_0 = this;

                  if ((-this.field_R + var8_long ^ -1L) <= -251L) {
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
                  ((lb) (this)).field_K = stackIn_10_1 != 0;
                  if (!this.field_K) {
                    break L3;
                  } else {
                    L4: {
                      this.field_N = this.k(param4 + -1);
                      this.field_Q = this.r(0);
                      if (0 >= this.field_Q) {
                        break L4;
                      } else {
                        if (32 == this.field_s.charAt(-1 + this.field_Q)) {
                          this.field_Q = this.field_Q - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_L = this.field_Q;
                    break L3;
                  }
                }
                this.field_R = var8_long;
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

            stackIn_22_1 = new StringBuilder().append("lb.R(");

            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        dl var8 = null;
        long var6 = 0L;
        if (param3 != 29221) {
            this.d((byte) 60);
        }
        if (this.field_y != null && param0 == 0) {
            this.field_y.a(-24969, (al) (this), param2, this.field_B, param1);
            if (this.field_y instanceof dl) {
                var8 = (dl) ((Object) this.field_y);
                if (this.field_Q != this.field_N) {
                    var8.b(param1, param2, this.field_Q, -84, this.field_N, (al) (this));
                }
                var6 = qg.a(false);
                if (500L > (var6 + -this.field_I) % 1000L) {
                    var8.a(this.field_Q, (al) (this), param3 ^ -29312, param2, param1);
                }
            }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$2 = 0;
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
              if (param1 != null) {
                break L1;
              } else {
                param1 = "";
                break L1;
              }
            }
            L2: {
              this.field_s = param1;
              var4_int = -28 % ((param2 - 12) / 39);
              var5 = param1.length();
              if ((this.field_J ^ -1) == 0) {
                break L2;
              } else {
                if (this.field_J >= var5) {
                  break L2;
                } else {
                  this.field_s = this.field_s.substring(0, this.field_J);
                  break L2;
                }
              }
            }
            L3: {
              dupTemp$2 = this.field_s.length();
              this.field_N = dupTemp$2;
              this.field_Q = dupTemp$2;
              if (!param0) {
                this.b(true);
                break L3;
              } else {
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

            stackIn_11_1 = new StringBuilder().append("lb.F(").append(param0).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -19166) {
            return;
        }
        this.field_Q = param1;
        if (!(ni.field_m[81])) {
            this.field_N = this.field_Q;
        }
    }

    private final String p(int param0) {
        if (param0 > -82) {
            this.a(-5, 11);
        }
        int var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
        int var3 = this.field_N < this.field_Q ? this.field_Q : this.field_N;
        return this.field_s.substring(var2, var3);
    }

    private final void d(byte param0) {
        this.m(param0 + 110);
        if (param0 != 13) {
            return;
        }
        this.j(29388);
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (0 != this.field_Q) {
          var2 = param0 + this.field_Q;
          L0: while (true) {
            L1: {
              if (-1 <= (var2 ^ -1)) {
                break L1;
              } else {
                if (-33 == (this.field_s.charAt(-1 + var2) ^ -1)) {
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
          return this.field_Q;
        }
    }

    private final int r(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = this.field_s.length();
        if (this.field_Q != var2) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              lb.o(54);
              break L0;
            }
          }
          var3 = 1 + this.field_Q;
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
          return this.field_Q;
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
            if (param0 == 0) {
              L1: {
                if (this.field_J == -1) {
                  break L1;
                } else {
                  var3_int = this.field_J + -this.field_s.length();
                  if (0 <= var3_int) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    param1 = param1.substring(0, var3_int);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_Q == this.field_s.length()) {
                  this.field_s = this.field_s + param1;
                  break L2;
                } else {
                  this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
                  break L2;
                }
              }
              this.field_Q = this.field_Q + param1.length();
              this.field_N = this.field_Q;
              this.b(true);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lb.K(").append(param0).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    private final void q(int param0) {
        int var2;
        dl var3;
        rb var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = TrackController.field_F ? 1 : 0;
        if (this.field_P) {
          var2 = 124 / ((param0 - 28) / 54);
          if (this.field_y instanceof dl) {
            var3 = (dl) ((Object) this.field_y);
            var4 = var3.a((byte) 110, (al) (this));
            var5 = var4.c(-1);
            var6 = var3.a((al) (this), 121);
            var7 = var3.a((byte) 46) >> -95509567;
            if (-var7 + var6 > var5) {
              this.field_o = 0;
              this.field_A = 0;
              return;
            } else {
              L0: {
                var8 = this.field_o + var4.a((byte) 111, this.field_Q);
                if (var6 - var7 < var8) {
                  this.field_o = -var7 - -var6 - (var8 - this.field_o);
                  break L0;
                } else {
                  if (var7 > var8) {
                    this.field_o = var7 - var8 + this.field_o;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if ((this.field_o ^ -1) < -1) {
                  this.field_o = 0;
                  break L1;
                } else {
                  if (this.field_o >= -var6 - -var7) {
                    break L1;
                  } else {
                    this.field_o = var7 + -var6;
                    break L1;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_o = 0;
          this.field_A = 0;
          return;
        }
    }

    private final void m(int param0) {
        String var2 = this.p(-95);
        if ((var2.length() ^ -1) < -1) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(-87))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 <= 115) {
            al var3 = (al) null;
            this.a(-33, -113, (byte) 101, (al) null);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = r.a(param0, -11133);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L3: {
                            if (sf.a(var4.charAt(0), -33)) {
                              break L3;
                            } else {
                              if (sf.a(var4.charAt(var4.length() - 1), -33)) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param2 == 1236) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param0.length()) {
                                      if (var5 > 0) {
                                        stackIn_36_0 = wd.field_J;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!sf.a((char) var7, param2 ^ -1269)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (!param1) {
                                            stackIn_31_0 = rb.field_d;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackIn_21_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_18_0 = wd.field_J;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = ei.field_j;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = ei.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = ei.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("lb.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        int var6 = 0;
        dl var7 = null;
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
              this.q(param2 ^ 92);
              if (-2 == (this.field_r ^ -1)) {
                L2: {
                  if (this.field_y instanceof dl) {
                    var7 = (dl) ((Object) this.field_y);
                    var6 = var7.a(param0, kf.field_b, 119, fg.field_a, param1, (al) (this));
                    if ((var6 ^ -1) != 0) {
                      L3: {
                        if (!this.field_K) {
                          break L3;
                        } else {
                          if (this.field_L <= var6) {
                            break L3;
                          } else {
                            if (this.field_N < var6) {
                              var6 = this.field_L;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_Q = var6;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_I = qg.a(false);
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
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    void b(boolean param0) {
        if (!(!(this.field_l instanceof se))) {
            ((se) ((Object) this.field_l)).a(-12230, (lb) (this));
        }
        if (!param0) {
            this.a(69, -108, 109, -105);
        }
    }

    lb(String param0, tg param1, int param2) {
        super(param0, param1);
        this.field_L = -1;
        this.field_K = false;
        this.field_R = 0L;
        try {
            this.field_y = field_O.field_e;
            this.field_J = param2;
            this.a(true, param0, -74);
            this.field_P = true;
            this.field_I = qg.a(false);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void o(int param0) {
        mc.field_H = new vd();
        re.field_g.b(mc.field_H, -103);
        if (param0 > -78) {
            CharSequence var2 = (CharSequence) null;
            lb.a((CharSequence) null, false, -68);
        }
    }

    final void l(int param0) {
        this.field_s = "";
        this.field_N = 0;
        this.field_Q = 0;
        this.b(true);
        if (param0 > -67) {
            this.field_J = -105;
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_N != this.field_Q) {
            var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
            var3 = this.field_Q <= this.field_N ? this.field_N : this.field_Q;
            this.field_Q = var2;
            this.field_N = var2;
            this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
            this.b(true);
        }
        if (param0 != 29388) {
            this.q(93);
        }
    }

    static {
    }
}
