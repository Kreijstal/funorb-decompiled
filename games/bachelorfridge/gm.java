/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends sfa {
    int field_l;
    static boolean field_k;
    static int[] field_j;
    int field_i;

    final void a(int param0, lu param1) {
        try {
            int var3_int = -113 / ((61 - param0) / 53);
            param1.d(this.field_i | this.field_l << -776462653, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0, op param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        wia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aga var10 = null;
        aga var11 = null;
        try {
          L0: {
            L1: {
              var10 = this.field_h.a(42, param1);
              var11 = var10;
              var4 = param1.field_a[var10.field_x][var10.field_J];
              var5 = var11.a(51, (byte) -87) ? 1 : 0;
              var7 = 62 / ((param0 - -27) / 32);
              if ((var4.field_n ^ -1) != -28) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_3_0;
              if (1 == param1.field_E) {
                if (!var4.field_i) {
                  stackIn_9_0 = 1;
                  break L2;
                } else {
                  stackIn_9_0 = 0;
                  break L2;
                }
              } else {
                stackIn_9_0 = 0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (var5 != 0) {
                break L3;
              } else {
                if (var6 != 0) {
                  break L3;
                } else {
                  if (var8 == 0) {
                    stackIn_14_0 = this.field_l;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              var9 = this.field_l;
              if (var8 != 0) {
                var9 = var9 + (-1 + kla.a(3, param1.field_w, -2147483648));
                if (-2 >= (var9 ^ -1)) {
                  break L4;
                } else {
                  var9 = 1;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (var6 != 0) {
                L6: {
                  if (-2 == (var4.field_j ^ -1)) {
                    var9--;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var4.field_j != 2) {
                    break L7;
                  } else {
                    var9 -= 2;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    if (3 == var4.field_j) {
                      break L9;
                    } else {
                      if ((var4.field_j ^ -1) != -5) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var9 -= 3;
                  break L8;
                }
                if ((var9 ^ -1) > -2) {
                  var9 = 1;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
            stackIn_34_0 = param1.a(var9, var11, this.field_i, -1);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("gm.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_34_0;
        }
    }

    private final df b(int param0, int param1, boolean param2) {
        if (param0 != 25683) {
            return (df) null;
        }
        return new df(this.field_g, this.field_h, this.field_i, param1, param2);
    }

    gm(int param0, aga param1) {
        super(2, param0, new nq(param1));
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= param4) {
                break L1;
              } else {
                L2: {
                  var5_int = (param4 - -param0) / 2;
                  var6 = param4;
                  var7 = param2[var5_int];
                  param2[var5_int] = param2[param0];
                  param2[param0] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param0];
                  param3[param0] = var8;
                  if (2147483647 != var7) {
                    stackIn_5_0 = 1;
                    break L2;
                  } else {
                    stackIn_5_0 = 0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param4;
                L3: while (true) {
                  if (param0 <= var10) {
                    param2[param0] = param2[var6];
                    param2[var6] = var7;
                    param3[param0] = param3[var6];
                    param3[var6] = var8;
                    gm.a(-1 + var6, -30111, param2, param3, param4);
                    gm.a(param0, -30111, param2, param3, 1 + var6);
                    break L1;
                  } else {
                    if ((param2[var10] ^ -1) < (var7 - (var10 & var9) ^ -1)) {
                      var11 = param2[var10];
                      param2[var10] = param2[var6];
                      param2[var6] = var11;
                      var12 = param3[var10];
                      param3[var10] = param3[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param3[incrementValue$0] = var12;
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L4: {
              if (param1 == -30111) {
                break L4;
              } else {
                field_k = false;
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

            stackIn_16_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',');

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
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_j = null;
    }

    final ii a(op param0, int param1) {
        df stackIn_3_0 = null;
        df stackIn_8_0 = null;
        df stackIn_13_0 = null;
        df stackIn_20_0 = null;
        df stackIn_63_0 = null;
        df stackIn_65_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        wia var6 = null;
        aga var7 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        op var11 = null;
        aga var12 = null;
        aga var13 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var12 = this.field_h.a(32, param0);
            var13 = var12;
            if (8 != var13.field_y) {
              L1: {
                if ((var13.field_y ^ -1) != -12) {
                  break L1;
                } else {
                  if (-51 > (kla.a(100, param0.field_w, param1 + 2147483645) ^ -1)) {
                    stackIn_8_0 = this.b(25683, 0, true);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-31 != (param0.field_a[var12.field_x][var12.field_J].field_n ^ -1)) {
                  break L2;
                } else {
                  if ((var13.field_y ^ -1) != -33) {
                    stackIn_13_0 = this.b(25683, 0, true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var13.field_y == 51) {
                  this.field_i = 1 + kla.a(4, param0.field_w, -2147483648);
                  break L3;
                } else {
                  break L3;
                }
              }
              var13.field_s = this.field_i;
              this.field_l = this.a((byte) -97, param0);
              if (-1 == (this.field_l ^ -1)) {
                stackIn_20_0 = this.b(25683, 0, true);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L4: {
                  var4 = var13.field_x;
                  var5 = var13.field_J;
                  if (this.field_i != 2) {
                    if (this.field_i != 1) {
                      if (-5 != (this.field_i ^ -1)) {
                        if ((this.field_i ^ -1) != -4) {
                          break L4;
                        } else {
                          var5 = var5 + this.field_l;
                          break L4;
                        }
                      } else {
                        var4 = var4 + this.field_l;
                        break L4;
                      }
                    } else {
                      var5 = var5 - this.field_l;
                      break L4;
                    }
                  } else {
                    var4 = var4 - this.field_l;
                    break L4;
                  }
                }
                L5: {
                  if (param1 == 3) {
                    break L5;
                  } else {
                    var11 = (op) null;
                    this.a((op) null, -85);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (-23 == (param0.field_a[var4][var5].field_n ^ -1)) {
                      break L7;
                    } else {
                      if ((param0.field_a[var4][var5].field_n ^ -1) != -29) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_l = this.field_l - 1;
                  break L6;
                }
                L8: {
                  var6 = param0.field_a[var4][var5];
                  var7 = var6.field_l;
                  if (var7 == null) {
                    break L8;
                  } else {
                    L9: {
                      var8 = null;
                      if (var7.field_k[1] >= var12.field_k[1]) {
                        break L9;
                      } else {
                        if (var8 == null) {
                          break L9;
                        } else {
                          ((df) (var8)).field_t = true;
                          ((df) (var8)).field_n = ((df) (var8)).field_n - 1;
                          param0.field_a[var12.field_x][var12.field_J].field_l = null;
                          if (2 != ((df) (var8)).field_p) {
                            if (-5 != (((df) (var8)).field_p ^ -1)) {
                              if (-2 != (((df) (var8)).field_p ^ -1)) {
                                if (-4 == (((df) (var8)).field_p ^ -1)) {
                                  param0.field_a[var13.field_x][-1 + var13.field_J].field_l = var7;
                                  var7.field_J = var7.field_J - 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              } else {
                                param0.field_a[var13.field_x][1 + var13.field_J].field_l = var7;
                                var7.field_J = var7.field_J + 1;
                                break L8;
                              }
                            } else {
                              param0.field_a[-1 + var13.field_x][var13.field_J].field_l = var7;
                              var7.field_x = var7.field_x - 1;
                              break L8;
                            }
                          } else {
                            param0.field_a[1 + var12.field_x][var12.field_J].field_l = var7;
                            var7.field_x = var7.field_x + 1;
                            break L8;
                          }
                        }
                      }
                    }
                    var9 = -1 + this.field_l;
                    L10: while (true) {
                      L11: {
                        if (0 >= var9) {
                          break L11;
                        } else {
                          L12: {
                            if (this.field_i != 2) {
                              break L12;
                            } else {
                              if (null == param0.field_a[var13.field_x + -var9][var13.field_J].field_l) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (1 != this.field_i) {
                              break L13;
                            } else {
                              if (param0.field_a[var13.field_x][var13.field_J - var9].field_l != null) {
                                break L13;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L14: {
                            if ((this.field_i ^ -1) != -5) {
                              break L14;
                            } else {
                              if (param0.field_a[var13.field_x + var9][var13.field_J].field_l != null) {
                                break L14;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L15: {
                            if (-4 != (this.field_i ^ -1)) {
                              break L15;
                            } else {
                              if (param0.field_a[var13.field_x][var9 + var13.field_J].field_l != null) {
                                break L15;
                              } else {
                                return (ii) ((Object) this.b(25683, var9, true));
                              }
                            }
                          }
                          var9--;
                          continue L10;
                        }
                      }
                      stackIn_63_0 = this.b(25683, var9, true);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
                stackIn_65_0 = this.b(25683, this.field_l, false);
                decompiledRegionSelector0 = 5;
                break L0;
              }
            } else {
              stackIn_3_0 = this.b(25683, 0, true);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var3);

            stackIn_68_1 = new StringBuilder().append("gm.A(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L16;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L16;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ii) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ii) ((Object) stackIn_13_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (ii) ((Object) stackIn_20_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (ii) ((Object) stackIn_63_0);
                } else {
                  return (ii) ((Object) stackIn_65_0);
                }
              }
            }
          }
        }
    }

    static {
        field_k = false;
        field_j = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
    }
}
