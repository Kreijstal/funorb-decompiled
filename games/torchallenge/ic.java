/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ic extends ee implements gk {
    static ka[] field_D;
    static int[][] field_B;
    ee field_A;
    static int[][] field_E;
    static lj field_C;

    void a(ee param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, (byte) -109, param3);
              if (this.field_A == null) {
                break L1;
              } else {
                this.field_A.a(param0, this.field_m + param1, (byte) -124, param3 - -this.field_i);
                break L1;
              }
            }
            if (param2 < -97) {
              break L0;
            } else {
              field_B = (int[][]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ic.U(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean b(ee param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= 0) {
              L1: {
                L2: {
                  if (this.field_A == null) {
                    break L2;
                  } else {
                    if (this.field_A.c(88)) {
                      break L2;
                    } else {
                      if (!this.field_A.a(param0, 0)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ic.M(");

            if (param0 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static char a(byte param0, int param1) {
        int var2;
        int var3;
        var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          L0: {
            if (128 > var2) {
              break L0;
            } else {
              if ((var2 ^ -1) <= -161) {
                break L0;
              } else {
                L1: {
                  var3 = ae.field_p[var2 + -128];
                  if (var3 != 0) {
                    break L1;
                  } else {
                    var3 = 63;
                    break L1;
                  }
                }
                var2 = var3;
                break L0;
              }
            }
          }
          if (param1 != -11721) {
            ic.a((byte) 85, 82);
            return (char)var2;
          } else {
            return (char)var2;
          }
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
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
              if (param3) {
                break L1;
              } else {
                field_E = (int[][]) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(param0, param1, -127, param2)) {
                break L2;
              } else {
                this.a(param2, -96, param0, param1);
                this.a((byte) 113, param2, param0, param1);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ic.W(");

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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ic.g(90);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_A) {
                  break L3;
                } else {
                  if (!this.field_A.a(param0, 0)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ic.RA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        boolean discarded$4 = false;
        ee var3;
        if (param0 != 6064) {
          L0: {
            var3 = (ee) null;
            discarded$4 = this.a(-127, (ee) null);
            if (this.field_A != null) {
              this.field_A.d(param0 ^ 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_A != null) {
              this.field_A.d(param0 ^ 0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    ee c(byte param0) {
        ee var2;
        var2 = this.field_A;
        if (var2 != null) {
          if (!var2.c(122)) {
            if (param0 < -24) {
              return null;
            } else {
              this.b(false);
              return null;
            }
          } else {
            return var2;
          }
        } else {
          if (param0 < -24) {
            return null;
          } else {
            this.b(false);
            return null;
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -81) {
                break L1;
              } else {
                this.field_A = (ee) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_A == null) {
                  break L3;
                } else {
                  if (!this.field_A.a(param0, param1, param2 ^ 0, this.field_i + param3, param4 - -this.field_m, param5, param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("ic.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$11 = param1.append('\n');
              if (param0 > 90) {
                break L1;
              } else {
                field_D = (ka[]) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param3 < var5_int) {
                if (this.field_A != null) {
                  this.field_A.a(param2, 1 + param3, param1, true);
                  break L0;
                } else {
                  discarded$12 = param1.append("null");
                  return;
                }
              } else {
                discarded$13 = param1.append(' ');
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ic.O(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final int e(int param0) {
        if (param0 != -15000) {
            return 18;
        }
        return this.field_A == null ? 0 : this.field_A.e(-15000);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5, byte param6, boolean param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          L0: {
            L1: {
              if (null != qf.field_e) {
                break L1;
              } else {
                ui.c(-112);
                break L1;
              }
            }
            L2: {
              var8 = param4;
              if (param6 == 127) {
                break L2;
              } else {
                ic.g(29);
                break L2;
              }
            }
            L3: {
              var9 = ag.field_e.field_K + ag.field_e.field_x;
              var10 = var9 - -2;
              if (!param7) {
                break L3;
              } else {
                L4: {
                  if (param4 != null) {
                    break L4;
                  } else {
                    if (param5 == null) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param5 == param4) {
                    break L5;
                  } else {
                    if (param5 != null) {
                      var8 = param5;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var11 = ag.field_e.a(var8);
                  var12 = 1;
                  if (var11 <= param3) {
                    break L6;
                  } else {
                    var11 = param3;
                    var12 = ag.field_e.a(var8, var11);
                    break L6;
                  }
                }
                L7: {
                  var13 = var12 * var10;
                  if (param1 > 16) {
                    break L7;
                  } else {
                    var11 = param1 * var11 >> -2018781564;
                    var13 = param1 * var13 >> 1489389828;
                    break L7;
                  }
                }
                var14 = param2 + -(var11 >> 607973217);
                var15 = -(var13 >> -2025978911) + param0;
                var16 = ph.field_m[0].field_q;
                var17 = ph.field_m[0].field_v;
                ch.a(240, var14 + -(var16 * 2), -(2 * var17) + var15, var13 - -(4 * var17), true, var16 * 4 + var11, ph.field_m);
                if (16 < param1) {
                  ag.field_e.a(var8, var14, var15, var11, var13, 6488064, -1, 0, 0, var10);
                  break L3;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8_ref);

            stackIn_22_1 = new StringBuilder().append("ic.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        ee var7;
        if (param0 <= 100) {
          var7 = (ee) null;
          this.a(-124, -100, 56, -77, 47, 51, (ee) null);
          super.a((byte) 105, param1, param2, param3, param4);
          this.a(25);
          return;
        } else {
          super.a((byte) 105, param1, param2, param3, param4);
          this.a(25);
          return;
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_A) {
                break L1;
              } else {
                if (!this.field_A.c(122)) {
                  break L1;
                } else {
                  if (this.field_A.a(param0, param1, (byte) 70, param3)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param0;
            if ((var5_int ^ -1) != -81) {
              if (param2 > 9) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L2: {
                if (nj.field_c[81]) {
                  stackIn_10_0 = this.a(0, param3);
                  break L2;
                } else {
                  stackIn_10_0 = this.b(param3, -54);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ic.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
            if (!(this.field_A == null)) {
                this.field_A.a(param0 + this.field_i, (byte) 35, param2, this.field_m + param3, param4, param5);
            }
            int var7_int = -37 % ((param1 - -29) / 39);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ic.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 < 76) {
            return true;
        }
        return null != this.c((byte) -92) ? true : false;
    }

    final boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (null == this.field_A) {
                    break L2;
                  } else {
                    if (!this.field_A.c(85)) {
                      break L2;
                    } else {
                      if (!this.field_A.a(0, param1, param2, param3, param4, param5, param6)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
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
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("ic.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    private final boolean a(int param0, ee param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a(72, -19, false, 110);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_A == null) {
                  break L3;
                } else {
                  if (this.field_A.c(param0 + 114)) {
                    break L3;
                  } else {
                    if (!this.field_A.a(param1, 0)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ic.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ic(int param0, int param1, int param2, int param3, j param4, gg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String b(boolean param0) {
        String var2;
        String var3;
        var2 = super.b(param0);
        if (!param0) {
          if (null != this.field_A) {
            var3 = this.field_A.b(false);
            if (var3 != null) {
              return var3;
            } else {
              return var2;
            }
          } else {
            return var2;
          }
        } else {
          field_C = (lj) null;
          if (null != this.field_A) {
            var3 = this.field_A.b(false);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        }
    }

    void a(int param0, int param1, boolean param2, int param3) {
        if (param3 == 0) {
          if (this.field_q != null) {
            this.field_q.a((ee) (this), param0, param1, (byte) 97, true);
            if (!param2) {
              if (this.field_A != null) {
                this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
                return;
              } else {
                return;
              }
            } else {
              field_D = (ka[]) null;
              if (this.field_A != null) {
                this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
                return;
              } else {
                return;
              }
            }
          } else {
            if (!param2) {
              if (this.field_A != null) {
                this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
                return;
              } else {
                return;
              }
            } else {
              field_D = (ka[]) null;
              if (this.field_A != null) {
                this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (!param2) {
            if (this.field_A != null) {
              this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
              return;
            } else {
              return;
            }
          } else {
            field_D = (ka[]) null;
            if (this.field_A != null) {
              this.field_A.a(param0 - -this.field_i, param1 + this.field_m, false, param3);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int a(qa param0, qa param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -47) {
                break L1;
              } else {
                field_D = (ka[]) null;
                break L1;
              }
            }
            var4 = (String) null;
            stackIn_3_0 = pd.a(param0, 0, (String) null, false, 0, -1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ic.I(");

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
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(int param0) {
        field_B = (int[][]) null;
        field_D = null;
        field_C = null;
        field_E = (int[][]) null;
        if (param0 != 1) {
            field_E = (int[][]) null;
        }
    }

    void a(int param0) {
        int var2;
        if (this.field_A != null) {
          this.field_A.b((byte) 121);
          var2 = 53 / ((-45 - param0) / 48);
          return;
        } else {
          var2 = 53 / ((-45 - param0) / 48);
          return;
        }
    }

    static {
        field_B = new int[][]{new int[]{0, 0, 48, 6, 544, 140, 161, 26, 77, 26, 506, 26}, new int[]{1, 0, 116, 20, 407, 89, 229, 40}, new int[]{2, 1, 116, 9, 407, 89, 181, 29}, new int[]{3, 1, 117, 12, 407, 89, 159, 32}, new int[]{4, 1, 117, 9, 407, 90, 164, 29}, new int[]{4, 1, 117, 9, 407, 90, 164, 29}, new int[]{0, 0, 48, 16, 544, 140, 161, 36, 77, 36, 506, 36}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{5, 0, 189, 8, 247, 89, 212, 28}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{6, 0, 336, 14, 247, 89, 404, 34}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1}};
    }
}
