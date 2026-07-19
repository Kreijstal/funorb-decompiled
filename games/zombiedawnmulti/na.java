/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends rg {
    static ri field_I;
    static String field_F;
    int field_E;
    static ja[] field_G;
    static int[][] field_J;
    static int[] field_K;
    static ri[][] field_H;

    na(cf param0) {
        super(param0.field_y, param0.field_i, param0.field_n, param0.field_w, (nl) null, (bj) null);
        try {
            param0.b(0, 0, 28972, this.field_n, this.field_w);
            this.field_E = 256;
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_K = null;
        field_H = (ri[][]) null;
        field_F = null;
        field_G = null;
        field_I = null;
        if (param0 >= -59) {
          return;
        } else {
          field_J = (int[][]) null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ja var6 = null;
        if (-1 == (param2 ^ -1)) {
          if (this.field_B == null) {
            return;
          } else {
            if (this.field_E != 0) {
              if ((this.field_E ^ -1) != -257) {
                var6 = new ja(this.field_B.field_n, this.field_B.field_w);
                r.a(0, var6);
                if (param0 != -2) {
                  field_G = (ja[]) null;
                  this.field_B.a(param0 + 0, 0, param2, 0);
                  ql.a(true);
                  var6.c(param3 - -this.field_y, param1 + this.field_i, this.field_E);
                  return;
                } else {
                  this.field_B.a(param0 + 0, 0, param2, 0);
                  ql.a(true);
                  var6.c(param3 - -this.field_y, param1 + this.field_i, this.field_E);
                  return;
                }
              } else {
                this.field_B.a(-2, param1 + this.field_i, param2, param3 - -this.field_y);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public na() {
        super(0, 0, 0, 0, (nl) null, (bj) null);
        this.field_E = 256;
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (qj.field_p) {
          if (io.field_g) {
            if ((se.field_E ^ -1) >= -1) {
              return false;
            } else {
              var3 = (400 - se.field_E >> -1753618463) + 10;
              var4 = 20 + se.field_E + param1;
              var5 = 40;
              if (param0 > var3) {
                if (var5 < param2) {
                  if (param0 < var3 + var4) {
                    if (var5 + hj.field_g <= param2) {
                      return false;
                    } else {
                      iq.a(-14, (byte) 99);
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, fh param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var9 = null;
        int[][] var12 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = param1.field_i.field_k;
              var7 = var9;
              var6 = var7;
              var12 = var6;
              dq.field_j = new int[var9.length][var9[0].length];
              var3 = 0;
              if (param0 > 124) {
                break L1;
              } else {
                field_J = (int[][]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 >= var12.length) {
                break L0;
              } else {
                if (var5 == 0) {
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      if (var4 >= var12[0].length) {
                        var3++;
                        break L4;
                      } else {
                        if (var5 != 0) {
                          break L4;
                        } else {
                          L5: {
                            stackOut_9_0 = dq.field_j[var3];
                            stackOut_9_1 = var4;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (0 != tq.b(1, var12[var3][var4])) {
                              stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              break L5;
                            } else {
                              stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = -1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              break L5;
                            }
                          }
                          stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                          var4++;
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("na.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static boolean a(int[] param0, byte param1, String param2, long param3, int param4) {
        boolean discarded$2 = false;
        ld var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -35) {
                break L1;
              } else {
                discarded$2 = na.b(-55, -5, 10);
                break L1;
              }
            }
            if (tn.a(param2, param3, (byte) -91, param4, param0)) {
              L2: {
                if (1 != param4) {
                  break L2;
                } else {
                  param4 = 0;
                  break L2;
                }
              }
              qf.field_g = param2;
              va.field_a = param4;
              var7 = (CharSequence) ((Object) param2);
              ql.field_a = tg.a(var7, false);
              jj.field_M = param3;
              var6 = id.a(kb.field_x, bb.field_k, (byte) -65, param0, tg.field_d);
              wi.a((byte) 4, var6);
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6_ref);
            stackOut_9_1 = new StringBuilder().append("na.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_F = "Confuse clueless humans with smoke and mirrors...";
        field_H = new ri[1][];
    }
}
