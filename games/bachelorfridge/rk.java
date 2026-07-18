/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rk extends bw {
    int[] field_m;
    Random field_p;
    eaa field_h;
    wca field_o;
    int field_q;
    private int[] field_j;
    String field_n;
    private int field_l;
    int[] field_k;
    int field_f;
    static String field_r;
    boolean[] field_g;
    int field_i;

    final boolean a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param1 == 9) {
            break L0;
          } else {
            ((rk) this).field_f = -95;
            break L0;
          }
        }
        var7 = ((rk) this).field_m;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return false;
          } else {
            var5 = var7[var4];
            if (-1 != var5) {
              if (param0 == ((rk) this).field_o.field_g.field_b[var5]) {
                return true;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int[] param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = param2;
            var4 = var8;
            var5 = param1;
            L1: while (true) {
              if (var8.length <= var5) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == -1) {
                    break L2;
                  } else {
                    if (((rk) this).field_o.field_g.field_b[var6] != param0) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("rk.EB(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final boolean b(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        ho var3 = (ho) (Object) ((rk) this).field_h.b((byte) 90);
        while (var3 != null) {
            if (param1 == var3.field_i) {
                return true;
            }
            var3 = (ho) (Object) ((rk) this).field_h.c(0);
        }
        if (param0 != 8) {
            ((rk) this).field_p = null;
            return false;
        }
        return false;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (0 >= param1) {
          var3 = 88 / ((-81 - param0) / 38);
          var4 = 0;
          L0: while (true) {
            if (((rk) this).field_m.length <= var4) {
              return;
            } else {
              if (((rk) this).field_m[var4] >= 6) {
                ((rk) this).field_m[var4] = -1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final int c(int param0, int param1) {
        t var3 = null;
        L0: {
          if (param0 == 87) {
            break L0;
          } else {
            ((rk) this).field_g = null;
            break L0;
          }
        }
        var3 = (t) (Object) al.a(-104, param1);
        if (var3.field_p == 4) {
          if (!((rk) this).a(36, param0 + -78)) {
            if (((rk) this).a(35, 9)) {
              return ((a) (Object) al.a(param0 ^ 12, 35)).field_r;
            } else {
              if (!((rk) this).a(34, 9)) {
                return var3.field_t;
              } else {
                return ((a) (Object) al.a(-42, 34)).field_r;
              }
            }
          } else {
            return ((a) (Object) al.a(87, 36)).field_r;
          }
        } else {
          return var3.field_t;
        }
    }

    void a(byte param0, lu param1) {
        RuntimeException var3 = null;
        ho var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param1.d(((rk) this).field_o.field_b, 0);
              param1.e((int)((rk) this).field_c, -1615464796);
              param1.d(0, 0);
              var3_ref = (ho) (Object) ((rk) this).field_h.b((byte) 90);
              if (param0 < -21) {
                break L1;
              } else {
                var7 = null;
                break L1;
              }
            }
            param1.d(((rk) this).field_h.g(0), 0);
            L2: while (true) {
              if (var3_ref == null) {
                var4 = 1;
                var5 = 0;
                L3: while (true) {
                  if (var5 >= 13) {
                    param1.c(-1607631824, var4);
                    var8 = 0;
                    var5 = var8;
                    L4: while (true) {
                      if (var8 >= 5) {
                        break L0;
                      } else {
                        param1.b(((rk) this).field_m[var8], -124);
                        var8++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!((rk) this).field_g[var5]) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                param1.d(var3_ref.field_h.field_b, 0);
                param1.d(var3_ref.field_i, 0);
                var3_ref = (ho) (Object) ((rk) this).field_h.c(0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("rk.AA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final double a(oha param0, int param1) {
        t var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        double stackIn_2_0 = 0.0;
        int stackIn_8_0 = 0;
        double stackIn_9_0 = 0.0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        double stackOut_8_0 = 0.0;
        double stackOut_1_0 = 0.0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0.field_a == 1) {
              L1: {
                if (param1 == -5313) {
                  break L1;
                } else {
                  rk.c((byte) 75);
                  break L1;
                }
              }
              L2: {
                var3 = (t) (Object) param0;
                if (var3.c(27863)) {
                  stackOut_7_0 = 3;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 2;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              var4 = stackIn_8_0;
              stackOut_8_0 = it.field_c[((rk) this).field_k[var4]] / 100.0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = 1.0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("rk.RA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        rla stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        rla stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = qi.a(param1, (byte) 104);
            var3 = param1.b(16711935);
            stackOut_0_0 = new rla(var2, var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("rk.CB(").append(1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return (pp) (Object) stackIn_1_0;
    }

    rk(rk param0) {
        this(param0.field_o);
        RuntimeException var2 = null;
        ho var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            ((rk) this).field_n = param0.field_n;
            ((rk) this).field_q = param0.field_q;
            ((rk) this).field_h = new eaa();
            var2_ref = (ho) (Object) param0.field_h.b((byte) 90);
            L1: while (true) {
              if (var2_ref == null) {
                bl.a(param0.field_g, 0, ((rk) this).field_g, 0, ((rk) this).field_g.length);
                ((rk) this).field_j = new int[param0.field_j.length];
                var3 = 0;
                L2: while (true) {
                  if (((rk) this).field_j.length <= var3) {
                    ((rk) this).field_m = new int[5];
                    var5 = 0;
                    var3 = var5;
                    L3: while (true) {
                      if (var5 >= ((rk) this).field_m.length) {
                        L4: {
                          if (!((rk) this).a(84, 0, ((rk) this).field_m)) {
                            break L4;
                          } else {
                            ((rk) this).field_k[0] = ((rk) this).field_k[0] + 1;
                            break L4;
                          }
                        }
                        L5: {
                          if (!((rk) this).a(85, 0, ((rk) this).field_m)) {
                            break L5;
                          } else {
                            ((rk) this).field_k[1] = ((rk) this).field_k[1] + 1;
                            break L5;
                          }
                        }
                        L6: {
                          if (!((rk) this).a(86, 0, ((rk) this).field_m)) {
                            break L6;
                          } else {
                            ((rk) this).field_k[2] = ((rk) this).field_k[2] + 1;
                            break L6;
                          }
                        }
                        L7: {
                          if (!((rk) this).a(87, 0, ((rk) this).field_m)) {
                            break L7;
                          } else {
                            ((rk) this).field_k[3] = ((rk) this).field_k[3] + 1;
                            break L7;
                          }
                        }
                        int discarded$2 = 0;
                        int discarded$3 = this.a();
                        break L0;
                      } else {
                        ((rk) this).field_m[var5] = param0.field_m[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((rk) this).field_j[var3] = param0.field_j[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                ((rk) this).field_h.a((bw) (Object) var2_ref.c((byte) 68), true);
                ((rk) this).field_g[var2_ref.field_i * 3 - 2] = true;
                var2_ref = (ho) (Object) param0.field_h.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("rk.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = 31 * var1 - -((rk) this).field_q;
        var1 = 31 * var1 - -(((rk) this).field_o != null ? ((rk) this).field_o.hashCode() : 0);
        return var1;
    }

    private final void d(byte param0) {
        ((rk) this).field_n = ((rk) this).field_o.field_h;
    }

    final void a(lu param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            ((rk) this).field_c = (long)param0.f(-50);
            param0.field_g = param0.field_g + 1;
            var3_int = param0.b(16711935);
            ((rk) this).field_h = new eaa();
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                var4 = param0.a(3);
                ((rk) this).field_j = new int[rfa.a(param1, var4) + 1];
                ((rk) this).field_j[1] = ((rk) this).field_o.field_g.field_b[1];
                ((rk) this).field_j[0] = ((rk) this).field_o.field_g.field_b[0];
                var5 = 2;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 13) {
                    ((rk) this).field_m = new int[5];
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= 5) {
                        break L0;
                      } else {
                        ((rk) this).field_m[var6] = param0.c((byte) -85);
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      stackOut_6_0 = ((rk) this).field_g;
                      stackOut_6_1 = var6;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (dda.a(var4, 1 << 1 + var6) != 1 << var6 - -1) {
                        stackOut_8_0 = (boolean[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L4;
                      } else {
                        stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L4;
                      }
                    }
                    L5: {
                      stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                      if (!((rk) this).field_g[var6]) {
                        break L5;
                      } else {
                        ((rk) this).field_j[var5] = ((rk) this).field_o.field_g.field_b[2 + var6];
                        var5++;
                        break L5;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                ((rk) this).field_h.a((bw) (Object) new ho(fw.field_h[param0.b(16711935)], param0.b(16711935)), true);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("rk.QA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final lna e(byte param0) {
        int var6 = BachelorFridge.field_y;
        int[] var11 = new int[5];
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var8 = var9;
        int[] var7 = var8;
        int[] var2 = var7;
        bl.a(var11, 0, 5, ((rk) this).field_o.field_b);
        int[] var3 = ug.field_l[((rk) this).field_h.g(0)];
        if (param0 >= -8) {
            field_r = null;
        }
        ho var4 = (ho) (Object) ((rk) this).field_h.b((byte) 90);
        int var5 = 1;
        while (var4 != null) {
            var7[var5] = var4.field_h.field_b;
            var5++;
            var4 = (ho) (Object) ((rk) this).field_h.c(0);
        }
        return new lna(var7[var3[0]], var7[var3[1]], var7[var3[2]], var7[var3[3]], var7[var3[4]], var7[var3[5]], var7[var3[6]], var7[var3[7]], var7[var3[8]], var7[var3[9]], var7[var3[10]]);
    }

    final boolean a(byte param0, pd param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = 1 + ((rk) this).field_o.a(73, param1, ((rk) this).field_g);
              var5 = 0;
              if (var4_int != 0) {
                L2: {
                  if (var4_int <= 1) {
                    break L2;
                  } else {
                    if (param2 > 0) {
                      break L2;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    }
                  }
                }
                L3: {
                  if (var4_int != 3) {
                    break L3;
                  } else {
                    if (((rk) this).field_h.g(0) < 1) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var4_int != 4) {
                    break L4;
                  } else {
                    if (((rk) this).field_h.g(0) < 2) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                ((rk) this).field_g[-2 + 3 * var4_int] = true;
                ((rk) this).field_h.a((bw) (Object) new ho(param1, var4_int), true);
                var5 = 3 * var4_int;
                ((rk) this).field_i = var5;
                break L1;
              } else {
                var5 = ((rk) this).field_o.a(param1, 0, ((rk) this).field_g);
                if (var5 == -1) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                } else {
                  ((rk) this).field_g[var5] = true;
                  ((rk) this).field_i = 2 + var5;
                  break L1;
                }
              }
            }
            var13 = new int[1 + ((rk) this).field_j.length];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var6 = var10;
            var7 = 0;
            var8 = -81 % ((-25 - param0) / 62);
            L5: while (true) {
              if (~var7 <= ~((rk) this).field_j.length) {
                var6[var13.length + -1] = ((rk) this).field_o.field_g.field_b[var5 - -2];
                ((rk) this).field_j = var6;
                ((rk) this).field_f = param1.field_b;
                uca.a(35, (byte) -106);
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                var6[var7] = ((rk) this).field_j[var7];
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("rk.JB(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
        }
        return stackIn_27_0 != 0;
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 <= 92) {
            field_r = null;
        }
    }

    final int d(int param0, int param1) {
        t var3 = null;
        L0: {
          if (param0 > 122) {
            break L0;
          } else {
            ((rk) this).field_j = null;
            break L0;
          }
        }
        var3 = (t) (Object) al.a(114, param1);
        if (var3.field_p != 4) {
          return var3.field_r;
        } else {
          if (((rk) this).a(53, 9)) {
            return ((a) (Object) al.a(-82, 53)).field_q;
          } else {
            return var3.field_r;
          }
        }
    }

    private final int a() {
        ((rk) this).field_l = 0;
        return ((rk) this).field_l;
    }

    public final boolean equals(Object param0) {
        rk var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (param0 == this) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 != null) {
                if (this.getClass() != param0.getClass()) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  var2 = (rk) param0;
                  if (var2.field_q != var2.field_q) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    L1: {
                      if (var2.field_o == null) {
                        if (var2.field_o == null) {
                          break L1;
                        } else {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      } else {
                        if (var2.field_o.equals((Object) (Object) var2.field_o)) {
                          break L1;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2_ref;
            stackOut_24_1 = new StringBuilder().append("rk.equals(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    rk(wca param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((rk) this).field_q = 1;
        ((rk) this).field_j = new int[2];
        ((rk) this).field_h = new eaa();
        ((rk) this).field_g = new boolean[13];
        ((rk) this).field_f = -1;
        try {
          L0: {
            ((rk) this).field_o = param0;
            if (null != ((rk) this).field_o) {
              this.d((byte) -107);
              ((rk) this).field_k = new int[4];
              bl.a(((rk) this).field_o.field_l, 0, ((rk) this).field_k, 0, 4);
              ((rk) this).field_p = new Random();
              ((rk) this).field_j[1] = ((rk) this).field_o.field_g.field_b[1];
              ((rk) this).field_m = new int[5];
              ((rk) this).field_j[0] = ((rk) this).field_o.field_g.field_b[0];
              bl.a(((rk) this).field_m, 0, ((rk) this).field_m.length, -1);
              ((rk) this).field_m[0] = 0;
              ((rk) this).field_m[1] = 1;
              int discarded$2 = 0;
              int discarded$3 = this.a();
              ((rk) this).field_c = (long)kla.a(2147483647, ((rk) this).field_p, -2147483648);
              break L0;
            } else {
              throw new RuntimeException("You're not supposed to be able to breed random creatures any more!");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("rk.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Reject <%0> from this game";
    }
}
