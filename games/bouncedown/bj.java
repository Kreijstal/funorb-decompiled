/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends ak {
    private boolean field_D;
    private int field_H;
    private int field_C;
    static ng field_E;
    private int field_G;
    private boolean field_F;
    private int field_B;

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param2, param3, (byte) 14, param0)) {
                break L1;
              } else {
                this.a(param0, param3, param2, 32362);
                this.a(param2, (byte) 12, param0, param3);
                discarded$64 = param3.append(" revert=").append(this.field_F);
                if (this.field_G == 2147483647) {
                  break L1;
                } else {
                  if (-2147483648 == (this.field_C ^ -1)) {
                    break L1;
                  } else {
                    discarded$65 = param3.append(" to ").append(this.field_G).append(',').append(this.field_C);
                    break L1;
                  }
                }
              }
            }
            if (param1) {
              stackIn_8_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("bj.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void k(int param0) {
        field_E = null;
        if (param0 > -107) {
            field_E = (ng) null;
        }
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, (int) (char)param4, param5);
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "bj.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(wi param0, byte param1, int param2, si param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            StringBuilder stackIn_41_1 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            hh var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = Bounce.field_N;
            try {
              L0: {
                L1: {
                  var18 = new hh();
                  var18.field_j = param0.d((byte) -109);
                  var18.field_g = param0.j(-3);
                  var18.field_n = new mk[var18.field_j];
                  var18.field_o = new int[var18.field_j];
                  var18.field_i = new int[var18.field_j];
                  var18.field_l = new int[var18.field_j];
                  var18.field_m = new byte[var18.field_j][][];
                  var18.field_s = new mk[var18.field_j];
                  if (param1 < -123) {
                    break L1;
                  } else {
                    bj.k(26);
                    break L1;
                  }
                }
                var5 = 0;
                L2: while (true) {
                  if (var18.field_j <= var5) {
                    ob.field_c.a(1, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param0.d((byte) -77);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L5;
                              } else {
                                if (2 == var6_int) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param0.b(true);
                                  var8 = param0.b(true);
                                  var9 = param0.d((byte) -82);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var9 <= var11_int) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if ((var6_int ^ -1) != -4) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param0.j(-3);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param0.a((byte) 124, var13, var21[var12_int], 0);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_o[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var17 >= var9) {
                                          var18.field_s[var5] = param3.a(var8, pf.a(var20, -1), 8532, var12);
                                          var18.field_m[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = pf.a(var10[var17], -1);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.b(true);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param0.b(true);
                            dupTemp$1 = param0.b(true);
                            var15 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param0.j(-3);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_o[var5] = var6_int;
                          var18.field_l[var5] = var9;
                          var18.field_n[var5] = param3.a(var15, pf.a(var16, -1), (byte) 48);
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_i[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_i[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_i[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_i[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_i[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_38_0 = (RuntimeException) (var4);

                stackIn_38_1 = new StringBuilder().append("bj.GA(");

                if (param0 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L18;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L18;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (!(this.field_x instanceof wd)) {
                        break L4;
                      } else {
                        if (!((wd) ((Object) this.field_x)).field_y) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if ((this.field_u ^ -1) != -2) {
                      break L3;
                    } else {
                      L5: {
                        var5_int = -param1 + (-this.field_B + uc.field_C);
                        var6 = ll.field_y + -this.field_H - param2;
                        if (this.field_r != var5_int) {
                          break L5;
                        } else {
                          if (var6 != this.field_i) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_r = var5_int;
                      this.field_i = var6;
                      if (!(this.field_n instanceof ni)) {
                        break L2;
                      } else {
                        ((ni) ((Object) this.field_n)).a(param2, (byte) -98, param1, (bj) (this));
                        break L2;
                      }
                    }
                  }
                  if (this.field_F) {
                    L6: {
                      if (this.field_r == this.field_G) {
                        break L6;
                      } else {
                        L7: {
                          var5_int = -this.field_r + this.field_G;
                          stackIn_16_0 = this;

                          stackIn_16_1 = this.field_r;

                          if (-3 <= (Math.abs(var5_int) ^ -1)) {
                            stackIn_18_0 = this;

                            if ((var5_int ^ -1) < -1) {
                              stackIn_19_0 = this;
                              stackIn_19_1 = stackIn_16_1;
                              stackIn_19_2 = 1;
                              break L7;
                            } else {
                              stackIn_19_0 = this;
                              stackIn_19_1 = stackIn_16_1;
                              stackIn_19_2 = -1;
                              break L7;
                            }
                          } else {
                            stackIn_19_0 = this;
                            stackIn_19_1 = stackIn_16_1;
                            stackIn_19_2 = var5_int >> 906782145;
                            break L7;
                          }
                        }
                        ((bj) (this)).field_r = stackIn_19_1 + stackIn_19_2;
                        break L6;
                      }
                    }
                    if (this.field_C != this.field_i) {
                      L8: {
                        var5_int = this.field_C - this.field_i;
                        stackIn_26_0 = this;

                        stackIn_26_1 = this.field_i;

                        if (-3 > (Math.abs(var5_int) ^ -1)) {
                          stackIn_27_0 = this;
                          stackIn_27_1 = stackIn_26_1;
                          stackIn_27_2 = var5_int >> 637263329;
                          break L8;
                        } else {
                          stackIn_25_0 = this;

                          if ((var5_int ^ -1) >= -1) {
                            stackIn_27_0 = this;
                            stackIn_27_1 = stackIn_26_1;
                            stackIn_27_2 = -1;
                            break L8;
                          } else {
                            stackIn_27_0 = this;
                            stackIn_27_1 = stackIn_26_1;
                            stackIn_27_2 = 1;
                            break L8;
                          }
                        }
                      }
                      ((bj) (this)).field_i = stackIn_27_1 + stackIn_27_2;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    super.a(param0 ^ 0, param1, param2, param3);
                    break L1;
                  }
                }
                super.a(param0 ^ 0, param1, param2, param3);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("bj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        super.i(-41);
        this.field_x.b(this.field_m, 80, this.field_k, 0, 0);
        this.field_G = this.field_r;
        this.field_C = this.field_i;
        if (param0 >= -21) {
            bj.a((byte) 10, 120);
        }
    }

    final static String j(int param0) {
        if (param0 != 44) {
            bj.k(19);
        }
        if (!(null != ja.field_b)) {
            return "";
        }
        return ja.field_b;
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            L1: {
              Bounce.a(va.field_b, q.field_M, 22668, 0, w.field_d, param1, true);
              if (param0 == -125) {
                break L1;
              } else {
                field_E = (ng) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= q.field_M) {
                L3: {
                  Bounce.a(mg.field_n, q.field_M + param1, 22668, param1, uc.field_A, param1 + param1, false);
                  if (param1 >= q.field_M) {
                    break L3;
                  } else {
                    q.field_M = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                w.field_f[var2_int + param1] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "bj.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private bj(int param0, int param1, int param2, int param3, fc param4, sk param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_C = 2147483647;
        this.field_G = 2147483647;
        try {
            this.field_D = param8 ? true : false;
            this.field_F = param7 ? true : false;
            this.field_x = param6;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!this.field_D) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.c(param3, param4 ^ 28455, param6, param2, param5)) {
              stackIn_10_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_u = param0;
              if ((param0 ^ -1) == -2) {
                this.field_H = -param6 + (-this.field_i + param5);
                nd.field_A = (bj) (this);
                this.field_B = -param2 + (param3 + -this.field_r);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("bj.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    static {
        field_E = null;
    }
}
