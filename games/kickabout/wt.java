/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wt extends fd implements jp {
    static int field_v;
    static int field_x;
    static ut field_y;
    static ut[] field_z;
    fd[] field_w;
    static wu field_A;

    private final boolean a(fd param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (this.field_w == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -28) {
                var4_int = 0;
                L1: while (true) {
                  if (var4_int >= this.field_w.length) {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_w[var4_int];
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (var5.b(100)) {
                          var4_int = var4_int + param2;
                          L3: while (true) {
                            if (var4_int >= this.field_w.length) {
                              break L2;
                            } else {
                              L4: {
                                var6 = this.field_w[var4_int];
                                if (var6 != null) {
                                  if (!var6.a(param0, param1 ^ -28)) {
                                    break L4;
                                  } else {
                                    stackIn_19_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              var4_int = var4_int + param2;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("wt.I(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    final boolean b(int param0) {
        if (param0 < 10) {
            return true;
        }
        return this.a(true) != null ? true : false;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        fd var6 = null;
        StringBuilder stackIn_6_0 = null;
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
            L1: {
              if (param0 == 17883) {
                break L1;
              } else {
                var6 = (fd) null;
                this.a(125, (fd) null, 11, -44, 107, -118, 34);
                break L1;
              }
            }
            L2: {
              if (this.a(1, param3, param2, param1)) {
                this.b(param1, param3, param2, param0 ^ -3421);
                this.a(param2, 10, param1, param3);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("wt.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static wh a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (-17 >= (pn.field_z.a(false) ^ -1)) {
            return null;
        }
        int var7 = -79 % ((-85 - param5) / 32);
        wh var6 = new wh(param3, param0, param4, param2, param1);
        pn.field_z.a(var6, 3);
        return var6;
    }

    public static void b(boolean param0) {
        field_y = null;
        field_z = null;
        if (param0) {
            field_y = (ut) null;
        }
        field_A = null;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        fd var10 = null;
        fd[] var11 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (null == this.field_w) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 10) {
                  break L1;
                } else {
                  var10 = (fd) null;
                  this.a((byte) 88, (fd) null, 119, 67);
                  break L1;
                }
              }
              var11 = this.field_w;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var11.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var11[var6];
                  discarded$6 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param2 < var8) {
                      L4: {
                        if (var7 != null) {
                          var7.a(17883, param2 - -1, param0, param3);
                          break L4;
                        } else {
                          discarded$7 = param3.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$8 = param3.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("wt.M(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, fd param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 9) {
              stackIn_4_0 = this.a(-17305, param1, 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wt.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -118);
    }

    private final boolean b(fd param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 84) {
                break L1;
              } else {
                this.f((byte) 119);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, -28, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wt.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        fd[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (null != this.field_w) {
              var9 = this.field_w;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  L2: {
                    if (param1 < -60) {
                      break L2;
                    } else {
                      field_v = -42;
                      break L2;
                    }
                  }
                  var5_int = param3;
                  if (80 == var5_int) {
                    L3: {
                      if (!ne.field_G[81]) {
                        stackIn_19_0 = this.b(param2, 87);
                        break L3;
                      } else {
                        stackIn_19_0 = this.a(9, param2);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.b(35)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, (byte) -123, param2, param3)) {
                          break L4;
                        } else {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("wt.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static void a(int param0, nu param1, int param2, ut[] param3) {
        int var4_int = 0;
        int var5 = 0;
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
        RuntimeException var4 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            nw.field_b = param1;
            ek.field_G = param2;
            tm.field_n = param3;
            if (param0 == 0) {
              L1: {
                if ((ek.field_G ^ -1) == 1) {
                  af.field_a = null;
                  break L1;
                } else {
                  af.field_a = new dt[4];
                  var4_int = 0;
                  L2: while (true) {
                    if ((var4_int ^ -1) <= -5) {
                      break L1;
                    } else {
                      af.field_a[var4_int] = new dt((gm) ((Object) nw.field_b.field_P[nw.field_b.field_g[ek.field_G].field_p][var4_int - -1]), var4_int + 1);
                      var4_int++;
                      continue L2;
                    }
                  }
                }
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
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("wt.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(tj param0, nl param1, byte param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        nl stackIn_17_0 = null;
        nl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        try {
          L0: {
            L1: {
              if (-1 != param0.field_m) {
                break L1;
              } else {
                if (0 == param0.field_h) {
                  break L1;
                } else {
                  L2: {
                    var4_int = -(param1.field_o >> 235307553) + 20;
                    if (param2 == -75) {
                      break L2;
                    } else {
                      var8 = (String[]) null;
                      wt.a(69, (String[]) null);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = (param1.field_w + -param0.field_p) / param0.field_h;
                    var5 = 9 * var5 >> -468456381;
                    if (-3 <= (var5 ^ -1)) {
                      break L3;
                    } else {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_t - -(param0.field_q * var5);
                          var7 = Math.abs(-var6 + param1.field_M);
                          if ((var6 ^ -1) >= -24379393) {
                            break L4;
                          } else {
                            if (var6 < 34275328) {
                              if (-28 + (var7 >> 1397024848) > 12) {
                                param1.c(var6, 5);
                                stackIn_20_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                L5: {
                                  stackIn_17_0 = (nl) (param1);

                                  if (param1.field_M < var6) {
                                    stackIn_18_0 = (nl) ((Object) stackIn_17_0);
                                    stackIn_18_1 = 8;
                                    break L5;
                                  } else {
                                    stackIn_18_0 = (nl) ((Object) stackIn_17_0);
                                    stackIn_18_1 = 2;
                                    break L5;
                                  }
                                }
                                stackIn_18_0.field_G = stackIn_18_1;
                                return true;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        param1.field_G = 0;
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 3;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("wt.F(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final static wn a(int param0, String[] param1) {
        wn var2 = null;
        RuntimeException var2_ref = null;
        wn stackIn_2_0 = null;
        wn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -108) {
              var2 = new wn(false);
              var2.field_f = param1;
              stackIn_4_0 = (wn) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("wt.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void a(byte param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5;
        fd var6;
        int var7;
        L0: {
          var7 = Kickabout.field_G;
          if (0 != param0) {
            break L0;
          } else {
            if (null == this.field_r) {
              break L0;
            } else {
              this.field_r.a(126, true, param3, (fd) (this), param2);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == 65) {
            break L1;
          } else {
            field_x = -84;
            break L1;
          }
        }
        L2: {
          if (this.field_w != null) {
            var5 = this.field_w.length + -1;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = this.field_w[var5];
                if (var6 != null) {
                  var6.a(param0, 65, param2 - -this.field_t, this.field_g + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final String f(int param0) {
        fd[] var2;
        int var3;
        fd var4;
        int var6;
        fd[] var7;
        String var5;
        var6 = Kickabout.field_G;
        if (this.field_w != null) {
          L0: {
            var7 = this.field_w;
            var2 = var7;
            if (param0 == -1) {
              break L0;
            } else {
              field_A = (wu) null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var7.length > var3) {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.f(-1);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final int f(byte param0) {
        int var2;
        fd[] var3;
        int var4;
        fd var5;
        int var7;
        int var6;
        fd var8;
        var7 = Kickabout.field_G;
        var2 = 0;
        var3 = this.field_w;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 == 118) {
                break L1;
              } else {
                var8 = (fd) null;
                this.a(20, (fd) null, 22, -126, -123, 63, -127);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.f((byte) 118);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    wt(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (this.field_w != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_v = -64;
                  break L1;
                }
              }
              var12 = this.field_w;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(param0, param1 - -this.field_g, param2, param3, param4, param5 - -this.field_t, param6)) {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("wt.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    private final fd a(boolean param0) {
        fd[] var2;
        int var3;
        fd var4;
        int var5;
        fd[] var6;
        var5 = Kickabout.field_G;
        if (null != this.field_w) {
          var6 = this.field_w;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (!param0) {
                this.f(91);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.b(100)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        fd[] var7 = null;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        fd[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (null != this.field_w) {
              var11 = this.field_w;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var11.length <= var8) {
                  L2: {
                    if (param4 == -1) {
                      break L2;
                    } else {
                      wt.a(-45, false, false, 110, 69, -102);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(this.field_g + param0, param1, param2, param3, -1, this.field_t + param5);
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7_ref);

            stackIn_13_1 = new StringBuilder().append("wt.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        fd[] var5 = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null != this.field_w) {
              var9 = this.field_w;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a((byte) 12, param1, this.field_t + param2, this.field_g + param3);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("wt.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, fd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (this.field_w != null) {
              L1: {
                if (param0 == -17305) {
                  break L1;
                } else {
                  field_z = (ut[]) null;
                  break L1;
                }
              }
              var4_int = -1 + this.field_w.length;
              L2: while (true) {
                if (-1 < (var4_int ^ -1)) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_w[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.b(92)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param2;
                        L4: while (true) {
                          if (var4_int < 0) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_w[var4_int];
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (var6.a(param1, 0)) {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var4_int - param2;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("wt.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final void g(int param0) {
        fd[] var2;
        int var3;
        fd var4;
        int var5;
        fd[] var6;
        var5 = Kickabout.field_G;
        var6 = this.field_w;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_z = (ut[]) null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.g(84);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (null == this.field_w) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_w;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  var9 = -27 / ((param6 - 63) / 56);
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.b(127)) {
                        break L2;
                      } else {
                        if (var10.a(param0, param1, param2, param3, param4, param5, -87)) {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("wt.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final boolean a(fd param0, int param1) {
        fd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var7 = this.field_w;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (var5.a(param0, param1 + 0)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("wt.HA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
    }
}
