/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends ji {
    private int field_y;
    private int field_A;
    static cr field_z;
    static String field_E;
    static fe field_F;
    static String field_B;
    static String field_C;

    public static void g(int param0) {
        field_F = null;
        field_E = null;
        if (param0 != 11902) {
            eq.g(-49);
        }
        field_z = null;
        field_C = null;
        field_B = null;
    }

    public eq() {
        super(1, false);
        this.field_y = 0;
        this.field_A = 4096;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var3 = this.field_x.a(param0, (byte) 82);
            if (this.field_x.field_i) {
              var4 = this.a(0, -1, param0);
              var5 = 0;
              L1: while (true) {
                if (var5 >= we.field_M) {
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (this.field_y <= var6) {
                    if (this.field_A >= var6) {
                      var3[var5] = var6;
                      var5++;
                      continue L1;
                    } else {
                      var3[var5] = this.field_A;
                      var5++;
                      continue L1;
                    }
                  } else {
                    var3[var5] = this.field_y;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final static bs a(long param0, byte param1) {
        if (param1 < 80) {
            return (bs) null;
        }
        return (bs) ((Object) ck.field_I.a(3661, param0));
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            this.field_y = 22;
            break L0;
          }
        }
        L1: {
          var26 = this.field_v.a(param1, param0 + 3778);
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (this.field_v.field_c) {
            var37 = this.c(0, 3, param1);
            var38 = var37[0];
            var39 = var37[1];
            var40 = var37[2];
            var30 = var26[0];
            var22 = var30;
            var8 = var22;
            var31 = var26[1];
            var23 = var31;
            var9 = var23;
            var32 = var26[2];
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L2: while (true) {
              if (we.field_M <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var38[var11];
                  var13 = var39[var11];
                  var14 = var40[var11];
                  if (this.field_y > var12) {
                    var8[var11] = this.field_y;
                    break L3;
                  } else {
                    if (this.field_A >= var12) {
                      var30[var11] = var12;
                      break L3;
                    } else {
                      var8[var11] = this.field_A;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_y > var13) {
                    var9[var11] = this.field_y;
                    break L4;
                  } else {
                    if (var13 <= this.field_A) {
                      var31[var11] = var13;
                      break L4;
                    } else {
                      var9[var11] = this.field_A;
                      break L4;
                    }
                  }
                }
                if (this.field_y <= var14) {
                  if (this.field_A < var14) {
                    var10[var11] = this.field_A;
                    var11++;
                    continue L2;
                  } else {
                    var32[var11] = var14;
                    var11++;
                    continue L2;
                  }
                } else {
                  var10[var11] = this.field_y;
                  var11++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (-6582952005840035282L >= (param1 ^ -1L)) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = bd.field_d[(int)(var7 + -(param1 * 37L))];
            if (95 == var9) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(param0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int == 0) {
                this.field_y = param2.a((byte) -11);
                break L1;
              } else {
                if (1 != var4_int) {
                  if (-3 != (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (1 != param2.h(-11)) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((eq) (this)).field_o = stackIn_11_1 != 0;
                    break L1;
                  }
                } else {
                  this.field_A = param2.a((byte) -11);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                this.field_y = -81;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("eq.C(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              um.field_F = oe.field_qb;
              if ((param2 ^ -1) != -256) {
                L2: {
                  if (100 > param2) {
                    break L2;
                  } else {
                    if (-106 <= (param2 ^ -1)) {
                      var4_array = args;
                      vj.a((byte) -76, var4_array);
                      rf.field_p = oq.a(param3 + -11, args);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                rf.field_p = fn.a(param2, true, param1);
                break L1;
              } else {
                L3: {
                  stackOut_2_0 = -2956;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (-14 >= (ea.field_e ^ -1)) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L3;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L3;
                  }
                }
                rf.field_p = gi.a(stackIn_5_0, stackIn_5_1 != 0);
                var6 = (String[]) null;
                vj.a((byte) -107, (String[]) null);
                break L1;
              }
            }
            L4: {
              if (param3 == 0) {
                break L4;
              } else {
                field_B = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("eq.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_B = "Remove name";
        field_C = "Options";
        field_E = "Waiting for levels";
    }
}
