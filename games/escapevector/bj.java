/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bj extends hm implements ba {
    static boolean[] field_E;
    static java.awt.Image field_z;
    static mf field_B;
    static String field_D;
    cn field_A;
    static int field_y;
    static ie field_C;
    static int[] field_F;

    private final void f(byte param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(this.field_A);
        if (param0 != 6) {
            bj.e((byte) -76);
        }
        hm var3 = (hm) ((Object) var2.c(param0 ^ 9));
        while (var3 != null) {
            var3.i(0);
            var3 = (hm) ((Object) var2.a(53));
        }
    }

    public static void g(byte param0) {
        field_C = null;
        field_z = null;
        field_D = null;
        field_F = null;
        if (param0 != -68) {
            field_F = (int[]) null;
        }
        field_B = null;
        field_E = null;
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return false;
        }
        return this.a(true) != null ? true : false;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.field_A;
        if (param1 <= 85) {
            StringBuilder var8 = (StringBuilder) null;
            this.a(37, (Hashtable) null, (StringBuilder) null, 58);
        }
        if (param2 == 0) {
            if (!(null == this.field_s)) {
                this.field_s.a(param3, param0, -42, (hm) (this), true);
            }
        }
        wf var5 = new wf(this.field_A);
        hm var6 = (hm) ((Object) var5.b(-31616));
        while (var6 != null) {
            var6.a(param0 - -this.field_j, (byte) 127, param2, this.field_k + param3);
            var6 = (hm) ((Object) var5.a((byte) 59));
        }
    }

    bj(int param0, int param1, int param2, int param3, db param4) {
        super(param0, param1, param2, param3, param4, (wn) null);
        this.field_A = new cn();
    }

    final static boolean e(byte param0) {
        int var1;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var1 = -82 % ((34 - param0) / 63);
            if (aj.b(-105)) {
              break L1;
            } else {
              if (0 >= s.field_x) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = 0;
        wf var3 = new wf(this.field_A);
        if (param0 != 12050) {
            return 121;
        }
        hm var4 = (hm) ((Object) var3.c(15));
        while (var4 != null) {
            var5 = var4.e(12050);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (hm) ((Object) var3.a(56));
        }
        return var2;
    }

    final String d(int param0) {
        wf var2;
        hm var3;
        String var4;
        int var5;
        Hashtable var6;
        L0: {
          var5 = EscapeVector.field_A;
          var2 = new wf(this.field_A);
          if (param0 == 1) {
            break L0;
          } else {
            var6 = (Hashtable) null;
            this.a((StringBuilder) null, -16, (Hashtable) null, 72);
            break L0;
          }
        }
        var3 = (hm) ((Object) var2.c(15));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.d(1);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (hm) ((Object) var2.a(param0 + 57));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        RuntimeException var8_ref = null;
        hm var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 == 3) {
              var8 = new wf(this.field_A);
              var9 = (hm) ((Object) var8.c(param2 ^ 12));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b((byte) 48)) {
                      break L2;
                    } else {
                      if (!var9.a(this.field_j + param0, param1, (byte) 3, param3, this.field_k + param4, param5, param6)) {
                        var9 = (hm) ((Object) var8.a(108));
                        continue L1;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
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
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("bj.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        wf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        hm var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var5 = new wf(this.field_A);
            var8 = (hm) ((Object) var5.c(15));
            if (param3 > 0) {
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b((byte) 48)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var8.h(0)) {
                          break L3;
                        } else {
                          if (!var8.a(param0, param1, param2, 37)) {
                            break L3;
                          } else {
                            stackIn_9_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var8 = (hm) ((Object) var5.a(54));
                      continue L1;
                    }
                  }
                }
                var6 = param2;
                if (80 == var6) {
                  L4: {
                    if (!ik.field_h[81]) {
                      stackIn_16_0 = this.a(param0, true);
                      break L4;
                    } else {
                      stackIn_16_0 = this.a((byte) 22, param0);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
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
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("bj.G(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (!param3) {
            return;
        }
        this.f((byte) 6);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        wf var8 = null;
        RuntimeException var8_ref = null;
        hm var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param2 < -103) {
                break L1;
              } else {
                field_B = (mf) null;
                break L1;
              }
            }
            var8 = new wf(this.field_A);
            var9 = (hm) ((Object) var8.c(15));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) 48)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.h(0)) {
                        break L4;
                      } else {
                        if (var9.b(param0, param1, (byte) -127, param3, param4, param5, param6)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (hm) ((Object) var8.a(102));
                    continue L2;
                  }
                }
              }
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("bj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new wf(this.field_A);
            var6 = (hm) ((Object) var5.c(15));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b((byte) 48)) {
                    break L2;
                  } else {
                    var6.a(-14472, this.field_j + param1, param2 - -this.field_k, param3);
                    var6 = (hm) ((Object) var5.a(57));
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

            stackIn_8_1 = new StringBuilder().append("bj.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void f(int param0) {
        int var4 = EscapeVector.field_A;
        wf var2 = new wf(this.field_A);
        hm var3 = (hm) ((Object) var2.c(15));
        while (var3 != null) {
            var3.f(111);
            var3 = (hm) ((Object) var2.a(25));
        }
        if (param0 < 46) {
            hm var5 = (hm) null;
            this.a((hm) null, 'c', -45, -89);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = -53 / ((param0 - 70) / 45);
        int var3 = param2 / 2500;
        var3 = kf.a(106, param1, var3);
        return var3;
    }

    final boolean a(byte param0, hm param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        wf var8 = null;
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
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (!this.field_A.a(param0 ^ -106)) {
              var8 = new wf(this.field_A);
              if (param0 == 22) {
                var4 = (hm) ((Object) var8.b(-31616));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.h(0)) {
                        break L2;
                      } else {
                        var5 = new wf(this.field_A);
                        var5.a((byte) 55, (hg) (var4));
                        var6 = (hm) ((Object) var5.a((byte) 47));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(-4659, param1)) {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (hm) ((Object) var5.a((byte) 80));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (hm) ((Object) var8.a((byte) 74));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
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

            stackIn_22_1 = new StringBuilder().append("bj.RA(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    final boolean a(hm param0, boolean param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        wf var5 = null;
        hm var6 = null;
        int var7 = 0;
        hm var8 = null;
        wf var9 = null;
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
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_A.a(-97)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = new wf(this.field_A);
                if (param1) {
                  break L1;
                } else {
                  var8 = (hm) null;
                  this.a(31, -112, (byte) -74, 114, -25, (hm) null, -91);
                  break L1;
                }
              }
              var4 = (hm) ((Object) var9.c(15));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.h(0)) {
                      var5 = new wf(this.field_A);
                      var5.a(-12818, var4);
                      var6 = (hm) ((Object) var5.a(125));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(-4659, param0)) {
                            var6 = (hm) ((Object) var5.a(80));
                            continue L4;
                          } else {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (hm) ((Object) var9.a(98));
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

            stackIn_22_1 = new StringBuilder().append("bj.PA(");

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
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
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

    final boolean a(int param0, hm param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        hm var4 = null;
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
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3 = new wf(this.field_A);
              if (param0 == -4659) {
                break L1;
              } else {
                bj.e((byte) 13);
                break L1;
              }
            }
            var4 = (hm) ((Object) var3.c(15));
            L2: while (true) {
              if (var4 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(-4659, param1)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (hm) ((Object) var3.a(param0 + 4779));
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

            stackIn_14_1 = new StringBuilder().append("bj.M(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    hm a(boolean param0) {
        wf var2;
        hm var3;
        int var4;
        L0: {
          var4 = EscapeVector.field_A;
          var2 = new wf(this.field_A);
          if (param0) {
            break L0;
          } else {
            field_y = 52;
            break L0;
          }
        }
        var3 = (hm) ((Object) var2.c(15));
        L1: while (true) {
          if (var3 != null) {
            if (var3.h(0)) {
              return var3;
            } else {
              var3 = (hm) ((Object) var2.a(78));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        wf var5 = null;
        hm var6 = null;
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
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5 = new wf(this.field_A);
              if (param3 > 95) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            var6 = (hm) ((Object) var5.c(15));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param0.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param1 < var7) {
                    var6.a(0, param2, param0, param1 - -1);
                    var6 = (hm) ((Object) var5.a(31));
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

            stackIn_12_1 = new StringBuilder().append("bj.IA(");

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final void b(hm param0, boolean param1) {
        try {
            if (param1) {
                hm var4 = (hm) null;
                this.a((byte) -114, (hm) null);
            }
            this.field_A.a(-12328, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bj.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        RuntimeException runtimeException = null;
        wf var7 = null;
        hm var8_ref_hm = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var7 = new wf(this.field_A);
            var8_ref_hm = (hm) ((Object) var7.c(15));
            L1: while (true) {
              L2: {
                if (var8_ref_hm == null) {
                  break L2;
                } else {
                  if (!var8_ref_hm.b((byte) 48)) {
                    break L2;
                  } else {
                    var8_ref_hm.a(param0, this.field_k + param1, param2, param3 + this.field_j, param4, (byte) -113);
                    var8_ref_hm = (hm) ((Object) var7.a(29));
                    continue L1;
                  }
                }
              }
              var8 = -114 % ((-39 - param5) / 45);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("bj.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (param0 == 0) {
                break L1;
              } else {
                this.a(-82, (byte) 105, -122, -83);
                break L1;
              }
            }
            L2: {
              if (!this.a(param3, param1, param2, false)) {
                break L2;
              } else {
                this.a(param1, param2, param3, 1);
                this.a(param2, param3, param1, 115);
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

            stackIn_8_1 = new StringBuilder().append("bj.AA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_D = "TNT";
        field_F = new int[]{15, 19};
        field_y = 0;
    }
}
