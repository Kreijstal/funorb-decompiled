/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends dv {
    static String field_A;
    static ea field_w;
    static String field_B;
    static String field_C;
    static int field_y;
    static String field_u;
    static String field_v;
    private dr[] field_z;
    static int field_x;

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_85_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.a(-31501)) {
              var12 = this.field_o.q(param0 ^ param0);
              var5 = this.field_o.o(param0 ^ 30781);
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var5 <= var9) {
                  L2: {
                    if (0 >= var5) {
                      stackIn_32_0 = 65535;
                      break L2;
                    } else {
                      stackIn_32_0 = var12.charAt(var5 - 1);
                      break L2;
                    }
                  }
                  L3: {
                    var9 = stackIn_32_0;
                    if (var12.length() <= var5) {
                      stackIn_36_0 = 65535;
                      break L3;
                    } else {
                      stackIn_36_0 = var12.charAt(var5);
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      L6: {
                        var10 = stackIn_36_0;
                        if (var6 == 0) {
                          break L6;
                        } else {
                          if (var8 != 0) {
                            break L6;
                          } else {
                            if ((param1 ^ -1) != -35) {
                              break L6;
                            } else {
                              if (var10 == 34) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        if (var7 == 0) {
                          break L7;
                        } else {
                          if (var8 != 0) {
                            break L7;
                          } else {
                            if (39 != param1) {
                              break L7;
                            } else {
                              if ((var10 ^ -1) == -40) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        if (var6 != 0) {
                          break L8;
                        } else {
                          if (var7 != 0) {
                            break L8;
                          } else {
                            if (param1 != 41) {
                              break L8;
                            } else {
                              if (var10 == 41) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        if ((param2 ^ -1) != -86) {
                          break L9;
                        } else {
                          L10: {
                            L11: {
                              if (var9 != 40) {
                                break L11;
                              } else {
                                if ((var10 ^ -1) == -42) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var6 == 0) {
                                break L12;
                              } else {
                                if (var9 != 34) {
                                  break L12;
                                } else {
                                  if (var10 == 34) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            if (var7 == 0) {
                              break L9;
                            } else {
                              if (39 != var9) {
                                break L9;
                              } else {
                                if (39 != var10) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          this.field_o.a(101, -26126, '￿');
                          break L9;
                        }
                      }
                      L13: {
                        discarded$0 = super.a(-30847, param1, param2);
                        var4 = this.field_o.q(param0 ^ -30847);
                        var5 = this.field_o.o(param0 ^ -30779);
                        if (var6 != 0) {
                          break L13;
                        } else {
                          if (var7 != 0) {
                            break L13;
                          } else {
                            if (param1 == 40) {
                              this.field_o.a(-1, -26126, ')');
                              this.field_o.a(-98, var5, var5);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        if (var6 != 0) {
                          break L14;
                        } else {
                          if (var7 != 0) {
                            break L14;
                          } else {
                            if ((param1 ^ -1) == -35) {
                              this.field_o.a(-1, -26126, '"');
                              this.field_o.a(param0 + 30749, var5, var5);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var7 != 0) {
                          break L4;
                        } else {
                          if (param1 == 39) {
                            this.field_o.a(-1, param0 + 4721, '\'');
                            this.field_o.a(-98, var5, var5);
                            break L4;
                          } else {
                            vs.field_c = wf.a(this.field_o.q(0), -101);
                            return true;
                          }
                        }
                      }
                    }
                    this.field_o.c(1 + var5, false);
                    break L4;
                  }
                  vs.field_c = wf.a(this.field_o.q(0), -101);
                  stackIn_85_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L15: {
                    if (var8 == 0) {
                      L16: {
                        L17: {
                          var10 = var12.charAt(var9);
                          if (var6 != 0) {
                            break L17;
                          } else {
                            if (var7 != 0) {
                              break L17;
                            } else {
                              stackIn_16_0 = 0;
                              break L16;
                            }
                          }
                        }
                        if (var10 == 92) {
                          stackIn_16_0 = 1;
                          break L16;
                        } else {
                          stackIn_16_0 = 0;
                          break L16;
                        }
                      }
                      L18: {
                        L19: {
                          var8 = stackIn_16_0;
                          stackIn_20_0 = var6;

                          if (var7 != 0) {
                            break L19;
                          } else {

                            if (var10 != 34) {
                              break L19;
                            } else {
                              stackIn_21_0 = stackIn_20_0;
                              stackIn_21_1 = 1;
                              break L18;
                            }
                          }
                        }
                        stackIn_21_0 = stackIn_20_0;
                        stackIn_21_1 = 0;
                        break L18;
                      }
                      L20: {
                        L21: {
                          var6 = stackIn_21_0 ^ stackIn_21_1;
                          stackIn_25_0 = var7;

                          if (var6 != 0) {
                            break L21;
                          } else {

                            if ((var10 ^ -1) != -40) {
                              break L21;
                            } else {
                              stackIn_26_0 = stackIn_25_0;
                              stackIn_26_1 = 1;
                              break L20;
                            }
                          }
                        }
                        stackIn_26_0 = stackIn_25_0;
                        stackIn_26_1 = 0;
                        break L20;
                      }
                      var7 = stackIn_26_0 ^ stackIn_26_1;
                      break L15;
                    } else {
                      var8 = 0;
                      break L15;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = super.a(-30847, param1, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "ij.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_85_0 != 0;
        }
    }

    ij(at param0, ka param1, hd param2) {
        super(param1, param2);
        int incrementValue$3 = 0;
        int var4_int = 0;
        dr var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            this.field_z = new dr[param0.b(false)];
            var4_int = 0;
            var5 = (dr) ((Object) param0.e((byte) 94));
            L1: while (true) {
              if (var5 == null) {
                this.a(-1, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_z.length + " methods at " + new Date() + ")</col>");
                break L0;
              } else {
                incrementValue$3 = var4_int;
                var4_int++;
                this.field_z[incrementValue$3] = var5;
                var5 = (dr) ((Object) param0.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ij.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);

            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);

            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final void b(int param0) {
        String var3 = null;
        try {
            int var2_int = -78 / ((param0 - 13) / 33);
            var3 = this.field_o.field_Pb.field_X;
            this.field_o.field_Pb.field_X = vs.field_c;
            super.b(-100);
            this.field_o.field_Pb.field_X = var3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ij.M(" + param0 + ')');
        }
    }

    final String[] b(boolean param0) {
        ui discarded$0 = null;
        int incrementValue$1 = 0;
        String[] stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        og[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        dr var10 = null;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        og var14 = null;
        ui var15 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = this.field_o.q(0);
              var6 = var13;
              var6 = var13;
              var3 = this.field_o.o(95);
              var4 = vv.a(var13, 114);
              var5 = ms.a(var3, var4, -122);
              this.field_s.field_S = 0;
              var6 = "";
              if (0 > var5) {
                break L1;
              } else {
                L2: {
                  var14 = var4[var5];
                  var8_int = -var14.field_s + var3;
                  if (rn.field_c != var14.field_q) {
                    break L2;
                  } else {
                    if (var8_int > 0) {
                      var6 = var14.field_o.substring(0, Math.min(var14.field_o.length(), var8_int));
                      this.field_s.field_S = this.field_t.a(var13.substring(0, var14.field_s));
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var9 = var5;
                var10_int = 0;
                L3: while (true) {
                  L4: {
                    if (-1 < (var9 ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if ((gm.field_d ^ -1) == (var4[var9].field_q ^ -1)) {
                          var10_int++;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var4[var9].field_q != mo.field_j) {
                          break L6;
                        } else {
                          var10_int--;
                          break L6;
                        }
                      }
                      if (var10_int < 0) {
                        break L4;
                      } else {
                        var9--;
                        continue L3;
                      }
                    }
                  }
                  if (0 >= var9) {
                    break L1;
                  } else {
                    if (var4[var9 + -1].field_q == rn.field_c) {
                      var6 = var4[-1 + var9].field_o;
                      this.field_s.field_S = this.field_t.a(var13.substring(0, var4[-1 + var9].field_s));
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L7: {
              var15 = this.a((byte) -75, var6);
              var8 = new String[var15.a(30578)];
              var9 = 0;
              var10 = (dr) ((Object) var15.a((byte) 43));
              if (param0) {
                break L7;
              } else {
                var12 = (String) null;
                discarded$0 = this.a((byte) 83, (String) null);
                break L7;
              }
            }
            L8: while (true) {
              if (var10 == null) {
                stackIn_27_0 = (String[]) (var8);
                break L0;
              } else {
                incrementValue$1 = var9;
                var9++;
                var8[incrementValue$1] = var10.field_A;
                var10 = (dr) ((Object) var15.c(24));
                continue L8;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ij.K(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    final static au b(byte param0, int param1) {
        au stackIn_2_0 = null;
        ms stackIn_7_0 = null;
        au stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == 74) {
              L1: {
                if (null != qm.field_J) {
                  stackIn_7_0 = qm.field_J.a((byte) -27, (long)param1);
                  break L1;
                } else {
                  stackIn_7_0 = null;
                  break L1;
                }
              }
              stackIn_8_0 = (au) ((Object) stackIn_7_0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (au) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ij.AA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void a(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        og[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dr var12_ref_dr = null;
        int var12 = 0;
        dr var13 = null;
        int var14 = 0;
        String var15 = null;
        og var16 = null;
        ui var17 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var15 = this.field_o.q(0);
              var6 = var15;
              var6 = var15;
              var3 = this.field_o.o(-105);
              var4 = vv.a(var15, param0 + -11);
              var5 = ms.a(var3, var4, -126);
              var6 = "";
              if (0 > var5) {
                break L1;
              } else {
                var16 = var4[var5];
                var8_int = var3 + -var16.field_s;
                if (rn.field_c != var16.field_q) {
                  break L1;
                } else {
                  if (0 >= var8_int) {
                    break L1;
                  } else {
                    if (var16.field_o.length() < var8_int) {
                      break L1;
                    } else {
                      var6 = var16.field_o.substring(0, var8_int);
                      break L1;
                    }
                  }
                }
              }
            }
            var17 = this.a((byte) -75, var6);
            if (0 == var17.a(30578)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == 122) {
                  break L2;
                } else {
                  this.b(77);
                  break L2;
                }
              }
              var8 = new StringBuilder();
              var9 = var6.length();
              var10 = 1;
              var11 = 2147483647;
              var12_ref_dr = (dr) ((Object) var17.a((byte) -110));
              L3: while (true) {
                if (var12_ref_dr == null) {
                  L4: while (true) {
                    L5: {
                      if (var10 == 0) {
                        break L5;
                      } else {
                        if ((var11 ^ -1) >= (var9 ^ -1)) {
                          break L5;
                        } else {
                          var12 = ((dr) ((Object) var17.a((byte) -112))).field_B.charAt(var9);
                          var13 = (dr) ((Object) var17.c(24));
                          L6: while (true) {
                            if (var13 == null) {
                              var9++;
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                discarded$0 = var8.append((char) var12);
                                continue L4;
                              }
                            } else {
                              L7: {
                                stackIn_26_0 = var10;

                                if ((var12 ^ -1) != (var13.field_B.charAt(var9) ^ -1)) {
                                  stackIn_27_0 = stackIn_26_0;
                                  stackIn_27_1 = 0;
                                  break L7;
                                } else {
                                  stackIn_27_0 = stackIn_26_0;
                                  stackIn_27_1 = 1;
                                  break L7;
                                }
                              }
                              var10 = stackIn_27_0 & stackIn_27_1;
                              var13 = (dr) ((Object) var17.c(24));
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var12 = var3 - -var8.length();
                      if (var6.length() + var8.length() == var11) {
                        L9: {
                          var12++;
                          discarded$1 = var8.append("()");
                          if ((var17.a(30578) ^ -1) != -2) {
                            break L9;
                          } else {
                            if (((dr) ((Object) var17.a((byte) 44))).field_u.length == 0) {
                              var12++;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        this.field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                        this.field_o.c(var12, false);
                        break L8;
                      } else {
                        this.field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                        this.field_o.c(var12, false);
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L10: {
                    if (var11 > var12_ref_dr.field_B.length()) {
                      var11 = var12_ref_dr.field_B.length();
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var12_ref_dr = (dr) ((Object) var17.c(24));
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ij.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ui a(byte param0, String param1) {
        ui var3 = null;
        int var4 = 0;
        int var5 = 0;
        ui var6 = null;
        ui stackIn_3_0 = null;
        ui stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -75) {
              var6 = new ui();
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (var4 >= this.field_z.length) {
                  stackIn_10_0 = (ui) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (this.field_z[var4].field_B.startsWith(param1)) {
                    this.field_z[var4].c((byte) -76);
                    var6.a(this.field_z[var4], false);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = (ui) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ij.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final boolean a(String param0, boolean param1) {
        try {
            og var5 = null;
            at var6 = null;
            es var7 = null;
            int stackIn_2_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_11_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            ef var3 = null;
            cb var3_ref = null;
            RuntimeException var3_ref2 = null;
            je var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    var6 = gu.a(false, param0);
                    if (param1) {
                      var7 = new es(var6);
                      var5 = fk.a(var7, -39);
                      if (!var7.a(124)) {
                        throw new ef(var7.a((byte) 13).field_s);
                      } else {
                        this.a(var5.a(1, this.field_z), -58);
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    } else {
                      stackIn_2_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (ef decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (ef) (Object) decompiledCaughtException;
                  param0 = "<col=55ff55>" + param0.substring(0, var3.field_b) + "</col>" + param0.substring(var3.field_b);
                  var4 = (je) ((Object) this.field_d.field_Jb.field_fb.d((byte) -98));
                  var4.field_X = this.field_c + param0;
                  return false;
                } catch (cb decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3_ref = (cb) (Object) decompiledCaughtException;
                  this.a(-1, var3_ref.field_b);
                  stackIn_11_0 = 0;
                  return stackIn_11_0 != 0;
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("ij.D(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L2;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L2;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0 != 0;
            } else {
              return stackIn_8_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        try {
            int var1_int = 10 % ((55 - param0) / 54);
            field_A = null;
            field_v = null;
            field_B = null;
            field_u = null;
            field_w = null;
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ij.W(" + param0 + ')');
        }
    }

    static {
        field_C = "Model Viewer";
        field_A = "Click a unit's base to select it";
        field_B = "The King Black Dragon is already available.";
        field_y = 0;
        field_v = "Group";
        field_u = "Report abuse";
        field_x = 480;
    }
}
