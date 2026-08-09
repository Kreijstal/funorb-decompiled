/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vd extends wj implements e {
    static Random field_z;
    static String[] field_B;
    eaa field_A;
    static vr field_y;

    void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(param2 ^ -104);
    }

    private final void h(int param0) {
        int var4 = BachelorFridge.field_y;
        rna var2 = new rna(this.field_A);
        wj var5 = (wj) ((Object) var2.b((byte) 86));
        while (var5 != null) {
            var5.d(6);
            var5 = (wj) ((Object) var2.a((byte) 0));
        }
        int var3 = -30 % ((param0 - -8) / 57);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        int var5 = 123 / ((-20 - param0) / 54);
        if (-1 == (param2 ^ -1)) {
            if (!(this.field_f == null)) {
                this.field_f.a(param3, (wj) (this), 32679, param1, true);
            }
        }
        rna var6 = new rna(this.field_A);
        wj var7 = (wj) ((Object) var6.c((byte) 120));
        while (var7 != null) {
            var7.a((byte) -104, param1 - -this.field_v, param2, this.field_s + param3);
            var7 = (wj) ((Object) var6.d((byte) -124));
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var5 = new rna(this.field_A);
            var6 = (wj) ((Object) var5.b((byte) 40));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param3 <= -77) {
                    break L2;
                  } else {
                    field_z = (Random) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param0 < var7) {
                    var6.a(param1, 1 + param0, (byte) 113, param2);
                    var6 = (wj) ((Object) var5.a((byte) 0));
                    continue L1;
                  } else {
                    discarded$3 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("vd.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(byte param0, vr param1) {
        RuntimeException var2 = null;
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
              if (param0 == 89) {
                break L1;
              } else {
                field_z = (Random) null;
                break L1;
              }
            }
            stackIn_3_0 = param1.b((byte) 107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vd.BB(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(double param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 81) {
                break L1;
              } else {
                field_z = (Random) null;
                break L1;
              }
            }
            L2: {
              if (in.field_e != param0) {
                var3_int = 0;
                L3: while (true) {
                  if ((var3_int ^ -1) <= -257) {
                    in.field_e = param0;
                    break L2;
                  } else {
                    L4: {
                      var4 = (int)(255.0 * Math.pow((double)var3_int / 255.0, param0));
                      stackIn_9_0 = jna.field_f;

                      stackIn_9_1 = var3_int;

                      if (-256 > (var4 ^ -1)) {
                        stackIn_10_0 = (int[]) ((Object) stackIn_9_0);
                        stackIn_10_1 = stackIn_9_1;
                        stackIn_10_2 = 255;
                        break L4;
                      } else {
                        stackIn_10_0 = (int[]) ((Object) stackIn_9_0);
                        stackIn_10_1 = stackIn_9_1;
                        stackIn_10_2 = var4;
                        break L4;
                      }
                    }
                    stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "vd.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != wt.field_n) {
            var3 = wt.field_n.a(param1, true);
            if ((var3 ^ -1) != 1) {
                if (0 != (var3 ^ -1)) {
                    var4 = wt.field_n.g(0) ? 1 : 0;
                    ula.a(param2, (byte) 75, wt.field_n.h((byte) 82), var3, var4 != 0, wt.field_n.field_Eb);
                }
                wt.field_n = null;
                di.c(-121);
            }
        }
        if (param0 != -35) {
            vd.a((byte) 62, true, 65);
        }
    }

    wj g(int param0) {
        rna var2;
        wj var3;
        int var4;
        vr var5;
        L0: {
          var4 = BachelorFridge.field_y;
          var2 = new rna(this.field_A);
          if (param0 < -26) {
            break L0;
          } else {
            var5 = (vr) null;
            vd.a((byte) 113, (vr) null);
            break L0;
          }
        }
        var3 = (wj) ((Object) var2.b((byte) 106));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e(1023)) {
              var3 = (wj) ((Object) var2.a((byte) 0));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(wj param0, int param1) {
        rna var3 = null;
        RuntimeException var3_ref = null;
        wj var4 = null;
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
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3 = new rna(this.field_A);
              if (param1 <= -78) {
                break L1;
              } else {
                this.c((byte) -5);
                break L1;
              }
            }
            var4 = (wj) ((Object) var3.b((byte) -117));
            L2: while (true) {
              if (var4 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param0, -117)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (wj) ((Object) var3.a((byte) 0));
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

            stackIn_14_1 = new StringBuilder().append("vd.W(");

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
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(int param0, wj param1) {
        RuntimeException var3 = null;
        wj var4 = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        wj var8 = null;
        rna var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.field_A.e(12917)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = new rna(this.field_A);
                if (param0 < -121) {
                  break L1;
                } else {
                  var8 = (wj) null;
                  this.b(-33, -39, 54, -107, -45, (wj) null, -22);
                  break L1;
                }
              }
              var4 = (wj) ((Object) var9.c((byte) 121));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.e(1023)) {
                      break L3;
                    } else {
                      var5 = new rna(this.field_A);
                      var5.a(var4, (byte) -86);
                      var6 = (wj) ((Object) var5.d((byte) -124));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param1, -112)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (wj) ((Object) var5.d((byte) -124));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (wj) ((Object) var9.d((byte) -124));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("vd.WA(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        wj var9 = null;
        int var10 = 0;
        rna var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var11 = new rna(this.field_A);
              if (param1 == -7375) {
                break L1;
              } else {
                this.a(78, -90, (byte) 87, -47, 82);
                break L1;
              }
            }
            var9 = (wj) ((Object) var11.b((byte) -103));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a((byte) -106)) {
                    break L3;
                  } else {
                    if (!var9.b(param0, -7375, param2 - -this.field_s, param3, param4 - -this.field_v, param5, param6)) {
                      var9 = (wj) ((Object) var11.a((byte) 0));
                      continue L2;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("vd.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        wj var8 = null;
        rna var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var9 = new rna(this.field_A);
            var8 = (wj) ((Object) var9.b((byte) -109));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a((byte) -106)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.e(1023)) {
                        break L3;
                      } else {
                        if (!var8.a(10, param1, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var8 = (wj) ((Object) var9.a((byte) 0));
                    continue L1;
                  }
                }
              }
              L4: {
                if (param0 == 10) {
                  break L4;
                } else {
                  field_y = (vr) null;
                  break L4;
                }
              }
              var6 = param1;
              if (var6 == 80) {
                L5: {
                  if (wga.field_q[81]) {
                    stackIn_16_0 = this.a(-128, param3);
                    break L5;
                  } else {
                    stackIn_16_0 = this.b(param3, 1);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("vd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_16_0;
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new rna(this.field_A);
            var6 = (wj) ((Object) var5.b((byte) 14));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a((byte) -106)) {
                    break L2;
                  } else {
                    var6.a(param0 + this.field_s, param1 + this.field_v, param2, 20);
                    var6 = (wj) ((Object) var5.a((byte) 0));
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

            stackIn_8_1 = new StringBuilder().append("vd.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
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
              if (param2 >= 20) {
                break L1;
              } else {
                field_z = (Random) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param1, param3, (byte) 122)) {
                this.a(9, param0, param3, param1);
                this.a(param1, param0, param3, (byte) -108);
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

            stackIn_9_1 = new StringBuilder().append("vd.V(");

            if (param0 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        rna var8 = null;
        RuntimeException var8_ref = null;
        wj var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = new rna(this.field_A);
            var9 = (wj) ((Object) var8.b((byte) 127));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a((byte) -106)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.e(1023)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, 13, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (wj) ((Object) var8.a((byte) 0));
                    continue L1;
                  }
                }
              }
              if (param1 == 13) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_y = (vr) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("vd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    String c(byte param0) {
        rna var2;
        wj var3;
        String var4;
        int var5;
        StringBuilder var6;
        L0: {
          var5 = BachelorFridge.field_y;
          var2 = new rna(this.field_A);
          if (param0 == 16) {
            break L0;
          } else {
            var6 = (StringBuilder) null;
            this.a(-68, (Hashtable) null, (StringBuilder) null, (byte) -17);
            break L0;
          }
        }
        var3 = (wj) ((Object) var2.b((byte) -122));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 16);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (wj) ((Object) var2.a((byte) 0));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void c(wj param0, int param1) {
        try {
            this.field_A.a(param0, true);
            int var3_int = 69 % ((param1 - -70) / 50);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vd.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            this.b(-75);
        }
        return this.g(-29) != null ? true : false;
    }

    vd(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
        this.field_A = new eaa();
    }

    final boolean b(wj param0, int param1) {
        RuntimeException var3 = null;
        wj var4 = null;
        rna var5 = null;
        wj var6 = null;
        int var7 = 0;
        rna var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
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
            if (this.field_A.e(12917)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 1) {
                var8 = new rna(this.field_A);
                var4 = (wj) ((Object) var8.b((byte) 30));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.e(1023)) {
                        break L2;
                      } else {
                        var5 = new rna(this.field_A);
                        var5.a(param1 + 5999, var4);
                        var6 = (wj) ((Object) var5.a((byte) 0));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, -123)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (wj) ((Object) var5.a((byte) 0));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (wj) ((Object) var8.a((byte) 0));
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("vd.RA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    public static void i(int param0) {
        field_z = null;
        if (param0 != 20742) {
            vd.i(-83);
        }
        field_y = null;
        field_B = null;
    }

    final int b(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0 >= -3) {
            this.field_A = (eaa) null;
        }
        rna var3 = new rna(this.field_A);
        wj var4 = (wj) ((Object) var3.b((byte) 36));
        while (var4 != null) {
            var5 = var4.b(-61);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (wj) ((Object) var3.a((byte) 0));
        }
        return var2;
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        rna var7 = null;
        wj var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var7 = new rna(this.field_A);
            var8 = (wj) ((Object) var7.b((byte) -128));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a((byte) -106)) {
                    break L2;
                  } else {
                    var8.a(param0 + this.field_s, param1, (byte) -101, param3, param4, param5 - -this.field_v);
                    var8 = (wj) ((Object) var7.a((byte) 0));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param2 == -101) {
                  break L3;
                } else {
                  this.e(50);
                  break L3;
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

            stackIn_10_1 = new StringBuilder().append("vd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != 31) {
            field_y = (vr) null;
        }
        rna var2 = new rna(this.field_A);
        wj var3 = (wj) ((Object) var2.b((byte) 79));
        while (var3 != null) {
            var3.f(31);
            var3 = (wj) ((Object) var2.a((byte) 0));
        }
    }

    static {
        field_z = new Random();
    }
}
