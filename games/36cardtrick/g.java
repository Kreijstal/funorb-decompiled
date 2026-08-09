/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class g extends lk implements u {
    static String field_B;
    static kc[] field_C;
    static int[][] field_y;
    bk field_z;
    static int field_A;

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Main.field_T;
        if ((param3 ^ -1) == param2 && null != this.field_v) {
            this.field_v.a(param0, (lk) (this), 11447, param1, true);
        }
        qd var5 = new qd(this.field_z);
        lk var6 = (lk) ((Object) var5.c((byte) -13));
        while (var6 != null) {
            var6.a(param0 - -this.field_o, this.field_i + param1, -1, param3);
            var6 = (lk) ((Object) var5.a((byte) 101));
        }
    }

    final static void k(int param0) {
        if (!(eh.d(19314))) {
            return;
        }
        sc.a(param0, (byte) 122, false);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(1);
    }

    lk i(int param0) {
        qd var2;
        lk var3;
        int var4;
        L0: {
          var4 = Main.field_T;
          var2 = new qd(this.field_z);
          if (param0 == -1) {
            break L0;
          } else {
            this.field_z = (bk) null;
            break L0;
          }
        }
        var3 = (lk) ((Object) var2.b((byte) -33));
        L1: while (true) {
          if (var3 != null) {
            if (var3.d(param0 ^ -122)) {
              return var3;
            } else {
              var3 = (lk) ((Object) var2.a(28869));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(lk param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_z.a(param0, param1 ^ 27284);
              if (param1 == 118) {
                break L1;
              } else {
                field_y = (int[][]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("g.RA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 < 44) {
            field_C = (kc[]) null;
        }
        return null != this.i(-1) ? true : false;
    }

    void a(int param0, int param1, lk param2, int param3) {
        qd var5 = null;
        lk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Main.field_T;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3 ^ 0);
              var5 = new qd(this.field_z);
              if (param3 == 3) {
                break L1;
              } else {
                this.f(-85);
                break L1;
              }
            }
            var6 = (lk) ((Object) var5.b((byte) -33));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.b(55)) {
                    break L3;
                  } else {
                    var6.a(this.field_i + param0, param1 + this.field_o, param2, param3 + 0);
                    var6 = (lk) ((Object) var5.a(28869));
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
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("g.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, lk param1) {
        qd var3 = null;
        RuntimeException var3_ref = null;
        lk var4 = null;
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
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              var3 = new qd(this.field_z);
              if (param0 > 71) {
                break L1;
              } else {
                this.field_z = (bk) null;
                break L1;
              }
            }
            var4 = (lk) ((Object) var3.b((byte) -33));
            L2: while (true) {
              if (var4 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(90, param1)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (lk) ((Object) var3.a(28869));
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

            stackIn_14_1 = new StringBuilder().append("g.B(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void b(boolean param0) {
        field_C = null;
        field_y = (int[][]) null;
        field_B = null;
        if (!param0) {
            g.b(true);
        }
    }

    private final void h(int param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_z);
        if (param0 != 1) {
            this.a(43, -101, -28, -27, false);
        }
        lk var3 = (lk) ((Object) var2.b((byte) -33));
        while (var3 != null) {
            var3.g(param0 ^ 26946);
            var3 = (lk) ((Object) var2.a(param0 ^ 28868));
        }
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        qd var5 = null;
        lk var6 = null;
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
        var8 = Main.field_T;
        try {
          L0: {
            L1: {
              var5 = new qd(this.field_z);
              if (param1 < -46) {
                break L1;
              } else {
                this.f(-89);
                break L1;
              }
            }
            var6 = (lk) ((Object) var5.b((byte) -33));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param3 < var7) {
                    var6.a(param0, false, 1 + param3, param2);
                    var6 = (lk) ((Object) var5.a(28869));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("g.AB(");

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
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        qd var7 = null;
        lk var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Main.field_T;
        try {
          L0: {
            L1: {
              var7 = new qd(this.field_z);
              if (!param0) {
                break L1;
              } else {
                this.field_z = (bk) null;
                break L1;
              }
            }
            var8 = (lk) ((Object) var7.b((byte) -33));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(-100)) {
                    break L3;
                  } else {
                    var8.a(param0, param1, param2, this.field_o + param3, this.field_i + param4, param5);
                    var8 = (lk) ((Object) var7.a(28869));
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

            stackIn_10_1 = new StringBuilder().append("g.O(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(lk param0, byte param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        qd var5 = null;
        lk var6 = null;
        int var7 = 0;
        qd var8 = null;
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
        var7 = Main.field_T;
        try {
          L0: {
            if (this.field_z.a(2220)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -28) {
                  break L1;
                } else {
                  field_y = (int[][]) null;
                  break L1;
                }
              }
              var8 = new qd(this.field_z);
              var4 = (lk) ((Object) var8.b((byte) -33));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(param1 + 142)) {
                      var5 = new qd(this.field_z);
                      var5.a(25755, var4);
                      var6 = (lk) ((Object) var5.a(28869));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(89, param0)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (lk) ((Object) var5.a(28869));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (lk) ((Object) var8.a(28869));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("g.PA(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
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

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        RuntimeException var8 = null;
        lk var9 = null;
        int var10 = 0;
        qd var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param5 == -1) {
                break L1;
              } else {
                field_A = 26;
                break L1;
              }
            }
            var11 = new qd(this.field_z);
            var9 = (lk) ((Object) var11.b((byte) -33));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(103)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(param5 + 70)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, param5 ^ 0, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (lk) ((Object) var11.a(param5 ^ -28870));
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

            stackIn_15_1 = new StringBuilder().append("g.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean b(int param0, lk param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        qd var5_ref_qd = null;
        int var5 = 0;
        lk var6 = null;
        int var7 = 0;
        qd var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          L0: {
            if (!this.field_z.a(2220)) {
              var8 = new qd(this.field_z);
              var4 = (lk) ((Object) var8.c((byte) -13));
              L1: while (true) {
                if (var4 == null) {
                  var5 = 15 % ((param0 - 29) / 60);
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (!var4.d(72)) {
                      break L2;
                    } else {
                      var5_ref_qd = new qd(this.field_z);
                      var5_ref_qd.a((byte) -8, (qb) (var4));
                      var6 = (lk) ((Object) var5_ref_qd.a((byte) 79));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(97, param1)) {
                            var6 = (lk) ((Object) var5_ref_qd.a((byte) 99));
                            continue L3;
                          } else {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (lk) ((Object) var8.a((byte) 80));
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
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("g.SA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        lk var8 = null;
        qd var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          L0: {
            if (param1 <= -99) {
              var9 = new qd(this.field_z);
              var8 = (lk) ((Object) var9.b((byte) -33));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(111)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var8.d(109)) {
                          break L3;
                        } else {
                          if (!var8.a(param0, (byte) -123, param2, param3)) {
                            break L3;
                          } else {
                            stackIn_10_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      var8 = (lk) ((Object) var9.a(28869));
                      continue L1;
                    }
                  }
                }
                var6 = param2;
                if ((var6 ^ -1) == -81) {
                  L4: {
                    if (!ge.field_c[81]) {
                      stackIn_17_0 = this.a(param3, (byte) -28);
                      break L4;
                    } else {
                      stackIn_17_0 = this.b(-85, param3);
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
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("g.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final String b(byte param0) {
        qd var2;
        lk var3;
        String var4;
        int var5;
        var5 = Main.field_T;
        var2 = new qd(this.field_z);
        var3 = (lk) ((Object) var2.b((byte) -33));
        if (param0 == -79) {
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.b((byte) -79);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (lk) ((Object) var2.a(28869));
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

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param2 == -1) {
              L1: {
                L2: {
                  param0 = wk.a('_', 58, param0, "");
                  var3 = gi.a(100, param0);
                  if ((param1.indexOf(param0) ^ -1) != 0) {
                    break L2;
                  } else {
                    if (param1.indexOf(var3) == -1) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
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
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("g.WA(");

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
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        lk var9 = null;
        int var10 = 0;
        lk var11 = null;
        qd var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param3 <= -14) {
                break L1;
              } else {
                var11 = (lk) null;
                this.a(95, -63, -9, 109, -30, 36, (lk) null);
                break L1;
              }
            }
            var12 = new qd(this.field_z);
            var9 = (lk) ((Object) var12.b((byte) -33));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(24)) {
                    break L3;
                  } else {
                    if (!var9.a(this.field_o + param0, this.field_i + param1, param2, -24, param4, param5, param6)) {
                      var9 = (lk) ((Object) var12.a(28869));
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

            stackIn_14_1 = new StringBuilder().append("g.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    g(int param0, int param1, int param2, int param3, ci param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
        this.field_z = new bk();
    }

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
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
              if (!this.a(param3, param2, param1, param0)) {
                break L1;
              } else {
                this.a(param0, (byte) -16, param3, param2);
                this.a(param0, -93, param3, param2);
                break L1;
              }
            }
            stackIn_3_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("g.V(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean j(int param0) {
        String var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 7) {
            break L0;
          } else {
            var2 = (String) null;
            g.a((String) null, (String) null, 67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == cb.field_j) {
              break L2;
            } else {
              if (ra.field_b != ad.field_q) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = Main.field_T;
        if (param0 != -1) {
            return -49;
        }
        int var2 = 0;
        qd var3 = new qd(this.field_z);
        lk var4 = (lk) ((Object) var3.b((byte) -33));
        while (var4 != null) {
            var5 = var4.f(param0 ^ 0);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (lk) ((Object) var3.a(28869));
        }
        return var2;
    }

    final void c(byte param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(this.field_z);
        lk var3 = (lk) ((Object) var2.b((byte) -33));
        if (param0 < 27) {
            g.a(-76);
        }
        while (var3 != null) {
            var3.c((byte) 105);
            var3 = (lk) ((Object) var2.a(28869));
        }
    }

    final static void a(int param0) {
        int var1 = -50 % ((param0 - 41) / 51);
        if (mf.field_i < 70) {
            wf.a(mf.field_i - -10, -78);
        } else {
            wf.a(80, -114);
        }
    }

    static {
        field_B = "Names cannot contain consecutive spaces";
        field_y = new int[][]{new int[]{5, 6, 7, 8, 9, 10, 11}, new int[]{0, 1, 2, 3, 4, 12, 13, 14}};
    }
}
