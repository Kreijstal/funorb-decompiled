/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends hg {
    int field_p;
    int field_o;
    int field_j;
    static int[] field_n;
    int field_h;
    tl field_m;
    int field_q;
    static String[] field_k;
    int field_l;
    hl field_g;
    int field_i;

    final static int a(String param0, int param1, ih param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3_int = hn.a(param2, param1 + -16777215);
            var4 = 4 * var3_int + param2.b(param0);
            if (param1 == 16777215) {
              stackOut_3_0 = var4;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 56;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ic.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 > -97) {
            ic.a((byte) 51, false);
            ve.a(-58, param1, false);
            return;
        }
        ve.a(-58, param1, false);
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
            ic.a(false, 19, -31, -11, -87);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        if (param0 > -97) {
            return;
        }
        oe.c((byte) -14);
        hi.field_q = param1;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 108) {
                break L1;
              } else {
                ic.a(true);
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackOut_2_0 = cc.field_k.equals(sf.a(-67, var3));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ic.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_int = param1 + param2;
              var6 = param4 + param3;
              if (param2 <= em.field_a) {
                stackOut_3_0 = em.field_a;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (em.field_k >= param4) {
                stackOut_6_0 = em.field_k;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param4;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (!param0) {
                break L3;
              } else {
                field_k = (String[]) null;
                break L3;
              }
            }
            L4: {
              if (em.field_b > var5_int) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = em.field_b;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (var6 >= em.field_j) {
                stackOut_14_0 = em.field_j;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = var6;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (param2 < em.field_a) {
                break L6;
              } else {
                if (param2 < em.field_b) {
                  var11 = param2 + em.field_l * var8;
                  var12 = -var8 + (1 - -var10) >> -571096095;
                  L7: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L6;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 = var11 + em.field_l * 2;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (param4 < em.field_k) {
                break L8;
              } else {
                if (var6 >= em.field_j) {
                  break L8;
                } else {
                  var11 = var7 + em.field_l * param4;
                  var12 = -var7 + var9 + 1 >> -823102751;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                }
              }
            }
            L10: {
              if (em.field_a > var5_int) {
                break L10;
              } else {
                if (var5_int < em.field_b) {
                  var11 = em.field_l * (var8 - -(1 & var5_int - param2)) - -var5_int;
                  var12 = 1 - (-var10 - -var8) >> 851503265;
                  L11: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L10;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 = var11 + 2 * em.field_l;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (em.field_k > param4) {
                break L12;
              } else {
                if (var6 >= em.field_j) {
                  break L12;
                } else {
                  var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                  var12 = -var7 + (var9 + 1) >> 535621697;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ic() {
    }

    static {
        field_n = new int[]{23, 1, 2, 3, 4, 24, 6, 7, 9, 10};
        field_k = new String[]{"Welcome to the mothership's practice area.", "Press the 'UP' arrow to blast off. Easy does it.", "", "Now land again.", "Keep tapping the 'UP' arrow to limit your speed and land softly.", "", "Blast off and use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Press 'SPACE' or 'SHIFT' to activate your shield. The mothership will power your shield for you.", "Warning: after you leave the mothership, you only have three seconds' worth of shield per level!", "", "Land next to the container to attach your tether.", "", "", "Now blast off, and keep the container away from any walls!", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", "Shoot the barrier to open the exit.", "Press 'CTRL' to shoot.", "", "If you are ready to start the first mission, fly up and out into space.", "", "", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", ""};
    }
}
