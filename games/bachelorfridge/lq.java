/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class lq extends wj implements e {
    static String field_z;
    static int[] field_A;
    static int field_y;
    wj[] field_B;

    public static void a(int param0) {
        if (param0 < 43) {
            return;
        }
        field_A = null;
        field_z = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 20) {
              L1: {
                if (this.a(param0, param1, param3, (byte) 39)) {
                  this.a(9, param0, param3, param1);
                  this.a(param1, (byte) -28, param0, param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lq.V(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final wj b(boolean param0) {
        wj[] var2;
        int var3;
        wj var4;
        int var5;
        wj[] var6;
        var5 = BachelorFridge.field_y;
        if (null != this.field_B) {
          L0: {
            var6 = this.field_B;
            var2 = var6;
            if (!param0) {
              break L0;
            } else {
              this.field_B = (wj[]) null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.e(1023)) {
                  return var4;
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

    abstract void h(int param0);

    void a(int param0, int param1, wj param2, int param3) {
        wj[] var5 = null;
        int var6 = 0;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (this.field_B == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_B;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(param0 - -this.field_s, this.field_v + param1, param2, 20);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("lq.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param2 ^ -11436);
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        wj[] var7 = null;
        int var8 = 0;
        wj var9 = null;
        int var10 = 0;
        wj[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.field_B == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == -101) {
                  break L1;
                } else {
                  this.a((byte) -33, 24, -35, -40);
                  break L1;
                }
              }
              var11 = this.field_B;
              var7 = var11;
              var8 = 0;
              L2: while (true) {
                if (var11.length <= var8) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0 - -this.field_s, param1, (byte) -101, param3, param4, param5 - -this.field_v);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("lq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        wj[] var2;
        int var3;
        wj var4;
        int var5;
        wj[] var6;
        var5 = BachelorFridge.field_y;
        var6 = this.field_B;
        var2 = var6;
        var3 = 0;
        if (param0 == 31) {
          L0: while (true) {
            if (var3 >= var6.length) {
              return;
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.f(31);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void g(int param0) {
        cq var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              lc.field_l.f();
              nia.field_m.f();
              rq.field_f = rq.field_f - 1;
              if (0 == rq.field_f) {
                rq.field_f = 200;
                var1 = (cq) ((Object) rma.field_d.b((byte) 90));
                L2: while (true) {
                  if (var1 == null) {
                    if (jha.field_i != null) {
                      var1 = (cq) ((Object) jha.field_i.b((byte) 90));
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_h.a((byte) -106)) {
                              var1.a(false);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (cq) ((Object) jha.field_i.c(0));
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (var1.field_h.a((byte) -106)) {
                        break L5;
                      } else {
                        var1.a(false);
                        break L5;
                      }
                    }
                    var1 = (cq) ((Object) rma.field_d.c(0));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (param0 == 1) {
                break L6;
              } else {
                lq.a(61);
                break L6;
              }
            }
            L7: {
              if (null == uf.field_c) {
                break L7;
              } else {
                if (!uf.field_c.c(28607)) {
                  uw.field_o = null;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "lq.F(" + param0 + ')');
        }
    }

    private final boolean a(int param0, wj param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (null == this.field_B) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = param2;
              L1: while (true) {
                if (var4_int >= this.field_B.length) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = this.field_B[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.e(1023)) {
                        var4_int = var4_int + param0;
                        L3: while (true) {
                          if (this.field_B.length <= var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_B[var4_int];
                              if (var6 != null) {
                                if (!var6.a(param1, param2 ^ -86)) {
                                  break L4;
                                } else {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int + param0;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("lq.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        wj var7;
        int var8;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param2 != 0) {
            break L0;
          } else {
            if (null != this.field_f) {
              this.field_f.a(param3, (wj) (this), 32679, param1, true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var5 = -19 % ((param0 - -20) / 54);
          if (this.field_B == null) {
            break L1;
          } else {
            var6 = this.field_B.length + -1;
            L2: while (true) {
              if ((var6 ^ -1) > -1) {
                break L1;
              } else {
                var7 = this.field_B[var6];
                if (var7 != null) {
                  var7.a((byte) 125, param1 + this.field_v, param2, param3 + this.field_s);
                  var6--;
                  continue L2;
                } else {
                  var6--;
                  continue L2;
                }
              }
            }
          }
        }
    }

    lq(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        wj[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
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
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (null != this.field_B) {
              L1: {
                if (param1 == 13) {
                  break L1;
                } else {
                  field_z = (String) null;
                  break L1;
                }
              }
              var12 = this.field_B;
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
                      if (!var10.e(1023)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, 13, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
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

            stackIn_18_1 = new StringBuilder().append("lq.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param6 + ')');
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

    final int b(int param0) {
        int var2;
        wj[] var3;
        int var4;
        wj var5;
        int var7;
        int var6;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 <= -3) {
          var3 = this.field_B;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.b(-116);
                if (var6 > var2) {
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
        } else {
          return -10;
        }
    }

    final String c(byte param0) {
        wj[] var2;
        int var3;
        wj var4;
        int var6;
        wj[] var8;
        String var5;
        wj var7;
        var6 = BachelorFridge.field_y;
        if (this.field_B != null) {
          var8 = this.field_B;
          var2 = var8;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var8.length) {
              if (param0 != 16) {
                var7 = (wj) null;
                this.a(22, -72, ']', (wj) null);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var8[var3];
              if (var4 != null) {
                var5 = var4.c((byte) 16);
                if (var5 != null) {
                  return var5;
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

    private final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        int var7 = 0;
        wj var8 = null;
        int var9 = 0;
        int var10 = 0;
        wj[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.field_B == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var6 = -86 % ((param1 - 43) / 40);
              var11 = this.field_B;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var11.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var11[var7];
                  discarded$4 = param3.append('\n');
                  var9 = 0;
                  L2: while (true) {
                    if (var9 > param0) {
                      L3: {
                        if (var8 == null) {
                          discarded$5 = param3.append("null");
                          break L3;
                        } else {
                          var8.a(param2, param0 - -1, (byte) 56, param3);
                          break L3;
                        }
                      }
                      var7++;
                      continue L1;
                    } else {
                      discarded$6 = param3.append(' ');
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("lq.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        wj[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            if (null != this.field_B) {
              var9 = this.field_B;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param1;
                  if ((var5_int ^ -1) == -81) {
                    L2: {
                      if (wga.field_q[81]) {
                        stackIn_18_0 = this.b(param3, -99);
                        break L2;
                      } else {
                        stackIn_18_0 = this.a(90, param3);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (param0 == 10) {
                      stackIn_23_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L3;
                    } else {
                      if (!var7.e(1023)) {
                        break L3;
                      } else {
                        if (var7.a(10, param1, param2, param3)) {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
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
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5_ref);

            stackIn_26_1 = new StringBuilder().append("lq.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    private final boolean a(int param0, wj param1) {
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
            if (param0 > 24) {
              stackIn_4_0 = this.a(1, param1, 0);
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
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("lq.A(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean b(wj param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -58 % ((param1 - 15) / 53);
            stackIn_1_0 = this.a(param0, false, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("lq.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static kv a(ee param0, int param1, kv param2, int param3, int param4) {
        kv stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kv var10 = null;
        kv var11 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var10 = new kv(param2.field_q, param2.field_p);
              var11 = var10;
              if (param1 == 8533) {
                break L1;
              } else {
                field_z = (String) null;
                break L1;
              }
            }
            var11.b();
            param0.a(param4, param3, param2.field_q, param2.field_p);
            dg.d(0, param3, param4, param3, 16777215);
            dg.d(param2.field_q + param4, param3, param2.field_q, param3, 16777215);
            hga.field_U.a((byte) 117);
            var6 = 0;
            L2: while (true) {
              if (var6 >= param2.field_q) {
                stackIn_16_0 = (kv) (param2);
                break L0;
              } else {
                var7 = 0;
                var8 = var6;
                L3: while (true) {
                  if (var8 >= param2.field_v.length) {
                    var6++;
                    continue L2;
                  } else {
                    L4: {
                      if (0 != var10.field_v[var8]) {
                        var7 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var7 != 0) {
                        param2.field_v[var8] = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var8 = var8 + param2.field_q;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("lq.R(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_16_0;
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            return false;
        }
        return null != this.b(false) ? true : false;
    }

    private final boolean a(wj param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        wj stackIn_7_1 = null;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.field_B != null) {
              var4_int = this.field_B.length + -1;
              L1: while (true) {
                if ((var4_int ^ -1) > -1) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      this.f(-93);
                      break L2;
                    }
                  }
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = this.field_B[var4_int];
                  stackIn_7_0 = null;
                  stackIn_7_1 = (wj) (var5);
                  L3: {
                    if (stackIn_7_0 == stackIn_7_1) {
                      break L3;
                    } else {
                      if (!var5.e(1023)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param2;
                        L4: while (true) {
                          if ((var4_int ^ -1) > -1) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_B[var4_int];
                              if (null != var6) {
                                if (!var6.a(param0, -79)) {
                                  break L5;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("lq.T(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        wj[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (null != this.field_B) {
              var12 = this.field_B;
              var8 = var12;
              if (param1 == -7375) {
                var9 = 0;
                L1: while (true) {
                  if (var9 >= var12.length) {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L2;
                      } else {
                        if (var10.b(param0, -7375, this.field_s + param2, param3, this.field_v + param4, param5, param6)) {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("lq.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final boolean a(wj param0, int param1) {
        wj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wj var5 = null;
        int var6 = 0;
        wj[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var7 = this.field_B;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                if (param1 <= -78) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  field_z = (String) null;
                  return false;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (!var5.a(param0, -88)) {
                      break L2;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("lq.W(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    static {
        field_z = "Suggest muting this player";
        field_y = 0;
    }
}
