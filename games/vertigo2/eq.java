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
        ((eq) this).field_y = 0;
        ((eq) this).field_A = 4096;
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
            var3 = ((eq) this).field_x.a(param0, (byte) 82);
            if (((eq) this).field_x.field_i) {
              var4 = ((eq) this).a(0, -1, param0);
              var5 = 0;
              L1: while (true) {
                if (var5 >= we.field_M) {
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (((eq) this).field_y <= var6) {
                    if (((eq) this).field_A >= var6) {
                      var3[var5] = var6;
                      var5++;
                      continue L1;
                    } else {
                      var3[var5] = ((eq) this).field_A;
                      var5++;
                      continue L1;
                    }
                  } else {
                    var3[var5] = ((eq) this).field_y;
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
          return null;
        }
    }

    final static bs a(long param0, byte param1) {
        if (param1 < 80) {
            return null;
        }
        return (bs) (Object) ck.field_I.a(3661, param0);
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
        int[][] var34 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            ((eq) this).field_y = 22;
            break L0;
          }
        }
        L1: {
          var42 = ((eq) this).field_v.a(param1, param0 + 3778);
          var34 = var42;
          var26 = var34;
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (((eq) this).field_v.field_c) {
            var41 = ((eq) this).c(0, 3, param1);
            var43 = var41[0];
            var44 = var41[1];
            var45 = var41[2];
            var46 = var42[0];
            var38 = var46;
            var30 = var38;
            var22 = var30;
            var8 = var22;
            var47 = var42[1];
            var39 = var47;
            var31 = var39;
            var23 = var31;
            var9 = var23;
            var48 = var42[2];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L2: while (true) {
              if (we.field_M <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var43[var11];
                  var13 = var44[var11];
                  var14 = var45[var11];
                  if (((eq) this).field_y > var12) {
                    var8[var11] = ((eq) this).field_y;
                    break L3;
                  } else {
                    if (((eq) this).field_A >= var12) {
                      var46[var11] = var12;
                      break L3;
                    } else {
                      var8[var11] = ((eq) this).field_A;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((eq) this).field_y > var13) {
                    var9[var11] = ((eq) this).field_y;
                    break L4;
                  } else {
                    if (var13 <= ((eq) this).field_A) {
                      var47[var11] = var13;
                      break L4;
                    } else {
                      var9[var11] = ((eq) this).field_A;
                      break L4;
                    }
                  }
                }
                if (((eq) this).field_y <= var14) {
                  if (((eq) this).field_A < var14) {
                    var10[var11] = ((eq) this).field_A;
                    var11++;
                    continue L2;
                  } else {
                    var48[var11] = var14;
                    var11++;
                    continue L2;
                  }
                } else {
                  var10[var11] = ((eq) this).field_y;
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
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(param0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (var4 == 0) {
            ((eq) this).field_y = param2.a((byte) -11);
            break L0;
          } else {
            if (1 != var4) {
              if (-3 != (var4 ^ -1)) {
                break L0;
              } else {
                L1: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (1 != param2.h(-11)) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((eq) this).field_o = stackIn_10_1 != 0;
                break L0;
              }
            } else {
              ((eq) this).field_A = param2.a((byte) -11);
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 110) {
            break L2;
          } else {
            ((eq) this).field_y = -81;
            break L2;
          }
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          um.field_F = oe.field_qb;
          if (param2 != -256) {
            L1: {
              if (100 > param2) {
                break L1;
              } else {
                if (-106 <= (param2 ^ -1)) {
                  var4 = args;
                  vj.a((byte) -76, var4);
                  rf.field_p = oq.a(param3 + -11, args);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            rf.field_p = fn.a(param2, true, param1);
            break L0;
          } else {
            L2: {
              stackOut_1_0 = -2956;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-14 <= ea.field_e) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L2;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L2;
              }
            }
            rf.field_p = gi.a(stackIn_4_0, stackIn_4_1 != 0);
            var6 = null;
            vj.a((byte) -107, (String[]) null);
            break L0;
          }
        }
        L3: {
          if (param3 == 0) {
            break L3;
          } else {
            field_B = null;
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Remove name";
        field_C = "Options";
        field_E = "Waiting for levels";
    }
}
