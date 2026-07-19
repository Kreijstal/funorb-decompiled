/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends coa {
    static dfa field_t;
    static int[] field_w;
    static char[] field_x;
    static String field_u;
    static String field_v;

    final static mi a(in param0, boolean param1) {
        int fieldTemp$9 = 0;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        mi stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        mi stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            fieldTemp$9 = param0.field_b - 1;
            param0.field_b = param0.field_b - 1;
            var2_int = fieldTemp$9;
            var3 = new StringBuilder();
            var4 = param0.b(21098);
            discarded$10 = var3.append((char) var4);
            var5 = param1 ? 1 : 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.a(0)) {
                    break L3;
                  } else {
                    var6 = param0.b(21098);
                    stackOut_3_0 = var5;
                    stackIn_15_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 != 0) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                if (var6 == 92) {
                                  break L7;
                                } else {
                                  discarded$11 = var3.append((char) var6);
                                  if (var7 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var5 = 1;
                              break L6;
                            }
                            if (var6 != var4) {
                              break L4;
                            } else {
                              if (var7 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        discarded$12 = var3.append((char) var6);
                        var5 = 0;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
                stackOut_14_0 = 34;
                stackIn_15_0 = stackOut_14_0;
                break L2;
              }
              L8: {
                if (stackIn_15_0 != var4) {
                  stackOut_17_0 = nl.field_d;
                  stackIn_18_0 = stackOut_17_0;
                  break L8;
                } else {
                  stackOut_16_0 = ma.field_e;
                  stackIn_18_0 = stackOut_16_0;
                  break L8;
                }
              }
              var6 = stackIn_18_0;
              stackOut_18_0 = new mi(var6, var2_int, var3.toString());
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("hb.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    public hb() {
    }

    public static void b(boolean param0) {
        field_w = null;
        field_v = null;
        field_u = null;
        field_t = null;
        if (!param0) {
          field_u = (String) null;
          field_x = null;
          return;
        } else {
          field_x = null;
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_h.a(param0, (byte) -2);
        var12 = var13;
        var11 = var12;
        var3 = var11;
        if (this.field_h.field_f) {
          if (this.a(false)) {
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            var7 = this.field_r * (param0 % this.field_r);
            var8 = 0;
            L0: while (true) {
              L1: {
                if (ns.field_g <= var8) {
                  if (param1 == -1) {
                    break L1;
                  } else {
                    discarded$4 = hb.d(113);
                    return var11;
                  }
                } else {
                  var9 = this.field_p[var8 % this.field_m + var7];
                  var6[var8] = sea.c(4080, var9 << -617884060);
                  var5[var8] = sea.c(var9, 65280) >> 1974776580;
                  var4[var8] = sea.c(4080, var9 >> 1426423564);
                  var8++;
                  if (var10 != 0) {
                    break L1;
                  } else {
                    if (var10 == 0) {
                      continue L0;
                    } else {
                      if (param1 == -1) {
                        return var11;
                      } else {
                        discarded$5 = hb.d(113);
                        return var11;
                      }
                    }
                  }
                }
              }
              return var11;
            }
          } else {
            if (param1 != -1) {
              discarded$6 = hb.d(113);
              return var11;
            } else {
              return var11;
            }
          }
        } else {
          if (param1 == -1) {
            return var11;
          } else {
            discarded$7 = hb.d(113);
            return var11;
          }
        }
    }

    final static boolean d(int param0) {
        lqa var1 = null;
        int var2 = 0;
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          var2 = 74 % ((-14 - param0) / 45);
          return var1.field_d;
        }
    }

    static {
        field_u = "Connection timed out. Please try using a different server.";
        field_x = new char[]{(char)91, (char)93, (char)35};
        field_v = "No Medal";
    }
}
