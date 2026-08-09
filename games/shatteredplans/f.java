/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class f extends vg implements ni {
    static String field_z;
    static boolean field_C;
    static int[] field_y;
    static String field_B;
    pf field_A;

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        int var10 = 0;
        vg var11 = null;
        on var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var11 = (vg) null;
                this.a(118, -43, -76, (vg) null, 87, 88, 5);
                break L1;
              }
            }
            var12 = new on(this.field_A);
            var9 = (vg) ((Object) var12.a(2));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(param0 + 2048)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.f(1)) {
                        break L4;
                      } else {
                        if (!var9.a(0, param1, param2, param3, param4, param5, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (vg) ((Object) var12.a((byte) 58));
                    continue L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("f.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException var8 = null;
        vg var9 = null;
        int var10 = 0;
        vg var11 = null;
        on var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new on(this.field_A);
              if (param2 >= 95) {
                break L1;
              } else {
                var11 = (vg) null;
                this.a((vg) null, -47);
                break L1;
              }
            }
            var9 = (vg) ((Object) var12.a(2));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.c(2048)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, (byte) 109, param3, param4 + this.field_m, param5 + this.field_q, param6)) {
                      var9 = (vg) ((Object) var12.a((byte) 87));
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

            stackIn_14_1 = new StringBuilder().append("f.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        vg var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        on var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new on(this.field_A);
            var6_ref_vg = (vg) ((Object) var8.a(param2 ^ 15));
            L1: while (true) {
              L2: {
                if (var6_ref_vg == null) {
                  break L2;
                } else {
                  if (!var6_ref_vg.c(param2 ^ 2061)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var6_ref_vg.f(1)) {
                        break L3;
                      } else {
                        if (var6_ref_vg.a(param0, param1, 13, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6_ref_vg = (vg) ((Object) var8.a((byte) 84));
                    continue L1;
                  }
                }
              }
              if (param2 == 13) {
                var6 = param0;
                if (var6 == 80) {
                  L4: {
                    if (di.field_p[81]) {
                      stackIn_18_0 = this.a(param3, true);
                      break L4;
                    } else {
                      stackIn_18_0 = this.a(param3, param2 + 105);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("f.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    vg i(int param0) {
        on var2;
        vg var3;
        int var4;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = new on(this.field_A);
          if (param0 == 1) {
            break L0;
          } else {
            field_C = true;
            break L0;
          }
        }
        var3 = (vg) ((Object) var2.a(param0 ^ 3));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.f(1)) {
              var3 = (vg) ((Object) var2.a((byte) 121));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 103, param3, param4);
        if (param2 < 99) {
            this.i(-8);
        }
        this.h(-87);
    }

    private final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        on var5 = null;
        vg var6 = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new on(this.field_A);
              if (param2 < -21) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var6 = (vg) ((Object) var5.a(2));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param0.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param3) {
                    var6.a((byte) 125, param1, param3 - -1, param0);
                    var6 = (vg) ((Object) var5.a((byte) 89));
                    continue L2;
                  } else {
                    discarded$4 = param0.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("f.QA(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        on var3 = new on(this.field_A);
        vg var4 = (vg) ((Object) var3.a(2));
        while (var4 != null) {
            var5 = var4.e(param0 ^ 0);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (vg) ((Object) var3.a((byte) 51));
        }
        if (param0 != -600269855) {
            field_B = (String) null;
        }
        return var2;
    }

    final boolean a(byte param0, vg param1) {
        on var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new on(this.field_A);
            var6 = (vg) ((Object) var3.a(2));
            L1: while (true) {
              if (var6 == null) {
                var4 = -111 / ((param0 - 61) / 59);
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var6.a((byte) 125, param1)) {
                  var6 = (vg) ((Object) var3.a((byte) 100));
                  continue L1;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("f.CA(").append(param0).append(',');

            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(vg param0, boolean param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        on var5 = null;
        vg var6 = null;
        int var7 = 0;
        on var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_A.g(-86)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new on(this.field_A);
                if (param1) {
                  break L1;
                } else {
                  field_B = (String) null;
                  break L1;
                }
              }
              var4 = (vg) ((Object) var8.c(-30));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.f(1)) {
                      break L3;
                    } else {
                      var5 = new on(this.field_A);
                      var5.a((byte) 109, var4);
                      var6 = (vg) ((Object) var5.b((byte) -124));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a((byte) 124, param0)) {
                            var6 = (vg) ((Object) var5.b((byte) -124));
                            continue L4;
                          } else {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (vg) ((Object) var8.b((byte) -124));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("f.RA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        vg var5 = null;
        on var6 = null;
        vg var7 = null;
        int var8 = 0;
        on var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_A.g(102)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 70 % ((5 - param1) / 50);
              var9 = new on(this.field_A);
              var5 = (vg) ((Object) var9.a(2));
              L1: while (true) {
                if (var5 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var5.f(1)) {
                      var6 = new on(this.field_A);
                      var6.a(false, var5);
                      var7 = (vg) ((Object) var6.a((byte) 54));
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a((byte) 123, param0)) {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var7 = (vg) ((Object) var6.a((byte) 68));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5 = (vg) ((Object) var9.a((byte) 111));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("f.DA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 0 && null != this.field_p) {
            this.field_p.a((vg) (this), param3, true, param2, (byte) 12);
        }
        on var5 = new on(this.field_A);
        if (param1 != -11857) {
            return;
        }
        vg var6 = (vg) ((Object) var5.c(param1 ^ -11803));
        while (var6 != null) {
            var6.a(param0, -11857, this.field_q + param2, this.field_m + param3);
            var6 = (vg) ((Object) var5.b((byte) -124));
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = 31 % ((64 - param0) / 61);
              if (this.a(false, param2, param3, param1)) {
                this.a(param1, param2, false, param3);
                this.a(param3, param1, (byte) -114, param2);
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("f.NA(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, mj param1) {
        mj var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param1.b((byte) -127);
            var2 = (mj) ((Object) gr.field_p.d(param0 + 60));
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param1, param0 ^ -60)) {
                    break L2;
                  } else {
                    var2 = (mj) ((Object) gr.field_p.a((byte) -71));
                    continue L1;
                  }
                }
              }
              if (param0 == -60) {
                L3: {
                  if (var2 != null) {
                    wp.a((byte) -127, param1, var2);
                    break L3;
                  } else {
                    gr.field_p.a((byte) -113, param1);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("f.SA(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_z = null;
        if (param0 < 88) {
            field_C = true;
        }
        field_y = null;
        field_B = null;
    }

    private final void h(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= -58) {
            vg var5 = (vg) null;
            this.a((byte) -71, (vg) null);
        }
        on var2 = new on(this.field_A);
        vg var3 = (vg) ((Object) var2.a(2));
        while (var3 != null) {
            var3.d((byte) 90);
            var3 = (vg) ((Object) var2.a((byte) 63));
        }
    }

    final void b(byte param0, vg param1) {
        try {
            if (param0 >= -41) {
                field_z = (String) null;
            }
            this.field_A.a((byte) -113, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "f.LA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        on var7 = null;
        vg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new on(this.field_A);
            var8 = (vg) ((Object) var7.a(param4 + 600269857));
            if (param4 == -600269855) {
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.c(2048)) {
                      break L2;
                    } else {
                      var8.a(param0, this.field_q + param1, param2 - -this.field_m, param3, -600269855, param5);
                      var8 = (vg) ((Object) var7.a((byte) 60));
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7_ref);

            stackIn_9_1 = new StringBuilder().append("f.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = -104 / ((param0 - -84) / 33);
        on var3 = new on(this.field_A);
        vg var4 = (vg) ((Object) var3.a(2));
        while (var4 != null) {
            var4.e((byte) -121);
            var4 = (vg) ((Object) var3.a((byte) 88));
        }
    }

    String c(boolean param0) {
        on var2;
        vg var3;
        String var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = new on(this.field_A);
        if (param0) {
          var3 = (vg) ((Object) var2.a(2));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c(true);
              if (var4 == null) {
                var3 = (vg) ((Object) var2.a((byte) 104));
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    f(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
        this.field_A = new pf();
    }

    void a(int param0, int param1, vg param2, byte param3) {
        on var5 = null;
        vg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new on(this.field_A);
            var6 = (vg) ((Object) var5.a(2));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.c(2048)) {
                    break L2;
                  } else {
                    var6.a(this.field_m + param0, this.field_q + param1, param2, (byte) 91);
                    var6 = (vg) ((Object) var5.a((byte) 94));
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

            stackIn_8_1 = new StringBuilder().append("f.PA(").append(param0).append(',').append(param1).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            field_z = (String) null;
        }
        return this.i(1) != null ? true : false;
    }

    static {
        field_B = "You are offering a rematch.";
        field_z = "Options";
        field_C = false;
    }
}
