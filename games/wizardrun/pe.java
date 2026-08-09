/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pe extends ub implements bg {
    static String[] field_z;
    oi field_A;
    static int field_B;
    static long field_D;
    static md field_y;
    static int[] field_C;

    final void a(ub param0, byte param1) {
        try {
            if (param1 <= 15) {
                field_y = (md) null;
            }
            this.field_A.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pe.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        pf var5 = null;
        int var6 = 0;
        ub var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            var6 = -90 % ((param1 - 30) / 43);
            var5 = new pf(this.field_A);
            var7 = (ub) ((Object) var5.a((byte) 31));
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                discarded$3 = param3.append('\n');
                var8 = 0;
                L2: while (true) {
                  if (param0 < var8) {
                    var7.a(param2, (byte) 102, 1 + param0, param3);
                    var7 = (ub) ((Object) var5.b(35));
                    continue L1;
                  } else {
                    discarded$4 = param3.append(' ');
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("pe.TA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -23) {
            field_z = (String[]) null;
        }
        field_z = null;
        field_y = null;
        field_C = null;
    }

    final void b(boolean param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(this.field_A);
        if (param0) {
            field_B = -77;
        }
        ub var3 = (ub) ((Object) var2.a((byte) 31));
        while (var3 != null) {
            var3.b(param0);
            var3 = (ub) ((Object) var2.b(35));
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = wizardrun.field_H;
        if (param2 == 0) {
            if (!(this.field_w == null)) {
                this.field_w.a(param0, param3, (ub) (this), true, true);
            }
        }
        pf var5 = new pf(this.field_A);
        ub var6 = (ub) ((Object) var5.b((byte) 103));
        while (var6 != null) {
            var6.a(param0 - -this.field_o, 0, param2, param3 + this.field_l);
            var6 = (ub) ((Object) var5.a(true));
        }
        if (param1 != 0) {
            StringBuilder var8 = (StringBuilder) null;
            this.b(67, 85, (Hashtable) null, (StringBuilder) null);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            ed.f(param4, param2, 1 + param3, 10000536);
            if (param1 == -14) {
              L1: {
                ed.f(param4, param0 + param2, 1 + param3, 12105912);
                var5_int = 1;
                var6 = param0;
                if (param2 - -var5_int < ed.field_i) {
                  var5_int = ed.field_i + -param2;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 + param2 <= ed.field_b) {
                  break L2;
                } else {
                  var6 = -param2 + ed.field_b;
                  break L2;
                }
              }
              var7 = var5_int;
              L3: while (true) {
                if (var6 <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var7 * 48 / param0 + 152;
                  var9 = var8 << 112111600 | var8 << 474831688 | var8;
                  ed.field_k[param4 + ed.field_h * (param2 - -var7)] = var9;
                  ed.field_k[param3 + (param4 + ed.field_h * (var7 + param2))] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "pe.KA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 102) {
                break L1;
              } else {
                field_y = (md) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(param3, param0, param2, true)) {
                break L2;
              } else {
                this.a(83, param2, param0, param3);
                this.b(param2, -21, param0, param3);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pe.U(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 152) {
            return (java.awt.Container) null;
        }
        if (null != he.field_u) {
            return (java.awt.Container) ((Object) he.field_u);
        }
        return (java.awt.Container) ((Object) jg.f(1));
    }

    final boolean b(ub param0, int param1) {
        RuntimeException var3 = null;
        ub var4 = null;
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        pf var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            if (!this.field_A.f(8192)) {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  field_D = -109L;
                  break L1;
                }
              }
              var8 = new pf(this.field_A);
              var4 = (ub) ((Object) var8.a((byte) 31));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.d((byte) 53)) {
                      break L3;
                    } else {
                      var5 = new pf(this.field_A);
                      var5.a(var4, -79);
                      var6 = (ub) ((Object) var5.b(35));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param0, param1 ^ 9)) {
                            var6 = (ub) ((Object) var5.b(35));
                            continue L4;
                          } else {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ub) ((Object) var8.b(35));
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("pe.PA(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        pf var8 = null;
        ub var9 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var8 = new pf(this.field_A);
              var9 = (ub) ((Object) var8.a((byte) 31));
              if (param2 <= -96) {
                break L1;
              } else {
                field_z = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c((byte) 72)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d((byte) 53)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, (byte) -126, param3)) {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (ub) ((Object) var8.b(35));
                    continue L2;
                  }
                }
              }
              var6 = param1;
              if (var6 != 80) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (!hi.field_p[81]) {
                    stackIn_15_0 = this.b(param3, 1);
                    break L5;
                  } else {
                    stackIn_15_0 = this.a((byte) -117, param3);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pe.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new pf(this.field_A);
            var6 = (ub) ((Object) var5.a((byte) 31));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.c((byte) -50)) {
                    break L2;
                  } else {
                    var6.a(10000536, this.field_l + param1, this.field_o + param2, param3);
                    var6 = (ub) ((Object) var5.b(35));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("pe.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0, ub param1) {
        RuntimeException var3 = null;
        ub var4 = null;
        pf var5 = null;
        ub var6 = null;
        int var7 = 0;
        pf var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            if (!this.field_A.f(8192)) {
              var8 = new pf(this.field_A);
              if (param0 == -117) {
                var4 = (ub) ((Object) var8.b((byte) 51));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (var4.d((byte) 53)) {
                        var5 = new pf(this.field_A);
                        var5.a(-80, var4);
                        var6 = (ub) ((Object) var5.a(true));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param1, param0 ^ -125)) {
                              var6 = (ub) ((Object) var5.a(true));
                              continue L3;
                            } else {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (ub) ((Object) var8.a(true));
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
          L4: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("pe.QA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final static o[] a(String param0, kl param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.b(-1, param0);
              var5 = param1.a(var4_int, param2, -11986);
              if (param3 >= 86) {
                break L1;
              } else {
                field_B = -113;
                break L1;
              }
            }
            stackIn_3_0 = cf.a(var4_int, 30736, param1, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pe.SA(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    pe(int param0, int param1, int param2, int param3, bf param4) {
        super(param0, param1, param2, param3, param4, (ce) null);
        this.field_A = new oi();
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        pf var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ub var10 = null;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            var8 = new pf(this.field_A);
            var9 = 18 % ((param1 - 12) / 36);
            var10 = (ub) ((Object) var8.a((byte) 31));
            L1: while (true) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  if (!var10.c((byte) -76)) {
                    break L2;
                  } else {
                    if (var10.a(this.field_o + param0, (byte) 83, param2, this.field_l + param3, param4, param5, param6)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var10 = (ub) ((Object) var8.b(35));
                      continue L1;
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8_ref);

            stackIn_13_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final String c(boolean param0) {
        pf var2;
        ub var3;
        String var4;
        int var5;
        var5 = wizardrun.field_H;
        if (!param0) {
          var2 = new pf(this.field_A);
          var3 = (ub) ((Object) var2.a((byte) 31));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c(false);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (ub) ((Object) var2.b(35));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        pf var7 = null;
        ub var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var7 = new pf(this.field_A);
              if (param5 == 0) {
                break L1;
              } else {
                this.field_A = (oi) null;
                break L1;
              }
            }
            var8 = (ub) ((Object) var7.a((byte) 31));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.c((byte) 110)) {
                    break L3;
                  } else {
                    var8.a(this.field_o + param0, param1, this.field_l + param2, param3, param4, param5 ^ 0);
                    var8 = (ub) ((Object) var7.b(35));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("pe.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
    }

    private final void f(int param0) {
        int var4 = wizardrun.field_H;
        pf var2 = new pf(this.field_A);
        ub var3 = (ub) ((Object) var2.a((byte) 31));
        while (var3 != null) {
            var3.c(param0 ^ 124);
            var3 = (ub) ((Object) var2.b(35));
        }
        if (param0 != 1) {
            ub var5 = (ub) null;
            this.a(-40, 28, -74, -73, (ub) null, -112);
        }
    }

    ub d(int param0) {
        pf var2;
        ub var3;
        int var4;
        L0: {
          var4 = wizardrun.field_H;
          var2 = new pf(this.field_A);
          if (param0 == -16) {
            break L0;
          } else {
            field_z = (String[]) null;
            break L0;
          }
        }
        var3 = (ub) ((Object) var2.a((byte) 31));
        L1: while (true) {
          if (var3 != null) {
            if (var3.d((byte) 53)) {
              return var3;
            } else {
              var3 = (ub) ((Object) var2.b(35));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        ub var9 = null;
        int var10 = 0;
        StringBuilder var11 = null;
        pf var12 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            var12 = new pf(this.field_A);
            var9 = (ub) ((Object) var12.a((byte) 31));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c((byte) -109)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.d((byte) 53)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, -23023, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (ub) ((Object) var12.b(35));
                    continue L1;
                  }
                }
              }
              if (param1 == -23023) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var11 = (StringBuilder) null;
                this.a((Hashtable) null, (byte) 115, 4, (StringBuilder) null);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("pe.M(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean a(ub param0, int param1) {
        pf var3 = null;
        RuntimeException var3_ref = null;
        ub var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var3 = new pf(this.field_A);
              if (param1 == 8) {
                break L1;
              } else {
                field_C = (int[]) null;
                break L1;
              }
            }
            var4 = (ub) ((Object) var3.a((byte) 31));
            L2: while (true) {
              if (var4 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param0, param1 ^ 0)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (ub) ((Object) var3.b(35));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("pe.J(");

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
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(114, param1, param2, param3, param4);
        if (param0 < 108) {
            this.d((byte) 109);
        }
        this.f(1);
    }

    final int e(byte param0) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        int var2 = 0;
        pf var3 = new pf(this.field_A);
        ub var4 = (ub) ((Object) var3.a((byte) 31));
        while (var4 != null) {
            var5 = var4.e((byte) 93);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ub) ((Object) var3.b(35));
        }
        if (param0 < 23) {
            return -1;
        }
        return var2;
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
            return false;
        }
        return this.d(-16) != null ? true : false;
    }

    static {
        field_z = new String[16];
    }
}
