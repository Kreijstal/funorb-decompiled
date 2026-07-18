/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends oj {
    private boolean field_C;
    int field_B;
    private boolean field_D;
    private int field_y;
    int field_A;
    private int field_z;

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          System.out.println("Teleport event debug");
          System.out.println("Unit at " + ((ec) this).field_A + "," + ((ec) this).field_B);
          System.out.println("Jumped to " + (((ec) this).field_z + ((ec) this).field_A) + "," + (((ec) this).field_y - -((ec) this).field_B));
          var4 = -18 / ((param0 - 53) / 51);
          var3 = "EventTeleport: pos: (" + ((ec) this).field_A + "," + ((ec) this).field_B + ")" + ",d: (" + ((ec) this).field_z + "," + ((ec) this).field_y + ")";
          return var3;
        } else {
          var4 = -18 / ((param0 - 53) / 51);
          var3 = "EventTeleport: pos: (" + ((ec) this).field_A + "," + ((ec) this).field_B + ")" + ",d: (" + ((ec) this).field_z + "," + ((ec) this).field_y + ")";
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
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
              if (!((ec) this).a((byte) -39, param2, param0, true)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var4_int = stackIn_3_0;
              if (param1 <= -84) {
                break L2;
              } else {
                int discarded$2 = ec.a(-83, -34, -127);
                break L2;
              }
            }
            L3: {
              if (((ec) this).field_D) {
                break L3;
              } else {
                var4_int = var4_int != 0 | ((ec) this).a(((ec) this).field_B - -((ec) this).field_y, 15, param2, param0, ((ec) this).field_A - -((ec) this).field_z) ? 1 : 0;
                break L3;
              }
            }
            stackOut_7_0 = var4_int;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ec.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        ne var3_ref = null;
        ne var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((ec) this).field_C) {
              return;
            } else {
              L1: {
                ((ec) this).field_C = true;
                var4 = param0.field_Eb[((ec) this).field_A - -(((ec) this).field_B * param0.field_v)];
                var3_ref = var4;
                if (((ec) this).field_w.field_bb) {
                  ((ec) this).field_w.field_bb = false;
                  var4.field_c.field_bb = false;
                  param0.field_t[((ec) this).field_w.field_O].a((byte) -119, (tc) (Object) ((ec) this).field_w);
                  break L1;
                } else {
                  var3_ref.field_c = null;
                  var3_ref.field_m = var4.e(10);
                  if (!((ec) this).field_w.p(-43)) {
                    break L1;
                  } else {
                    param0.a(((ec) this).field_B, ((ec) this).field_A, param1 + 26661, 3);
                    break L1;
                  }
                }
              }
              ((ec) this).field_w.field_s = true;
              ((ec) this).field_w.field_J = ((ec) this).field_w.field_J + ((ec) this).field_z;
              ((ec) this).field_w.field_w = ((ec) this).field_w.field_w + ((ec) this).field_y;
              if (param1 == -26661) {
                L2: {
                  if (((ec) this).field_D) {
                    break L2;
                  } else {
                    param0.field_Eb[param0.field_v * ((ec) this).field_w.field_w + ((ec) this).field_w.field_J].field_c = ((ec) this).field_w;
                    if (!((ec) this).field_w.p(-70)) {
                      break L2;
                    } else {
                      param0.a(((ec) this).field_w.field_w, ((ec) this).field_w.field_J, 0, 3);
                      break L2;
                    }
                  }
                }
                fl.a(param0, -124);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ec.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 > 97) {
              var3_int = 0;
              var4 = od.field_b;
              L1: while (true) {
                if (wp.field_v.length <= var3_int) {
                  stackOut_16_0 = -1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ca.field_h[var3_int];
                    if (0 > var5) {
                      var4 = var4 + fh.field_e;
                      var3_int++;
                      break L2;
                    } else {
                      var6 = lg.a(wp.field_v[var3_int], true, (byte) -56);
                      var4 = var4 + cp.field_a;
                      var7 = rk.field_B + -(var6 >> 1);
                      if (!mu.a(param0, (el.field_c << 1) + q.field_B, param2, -et.field_b + var7, 5138823, var6 - -(et.field_b << 1), var4)) {
                        var4 = var4 + (cp.field_a + (el.field_c << 1) - -q.field_B);
                        var3_int++;
                        break L2;
                      } else {
                        stackOut_8_0 = var5;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -55;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ec.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    ec(int param0, int param1, int param2, boolean param3) {
        ((ec) this).field_z = param2 >> 8;
        ((ec) this).field_y = 255 & param2;
        ((ec) this).field_B = param1;
        ((ec) this).field_A = param0;
        ((ec) this).field_z = -128 + (((ec) this).field_z ^ 128);
        ((ec) this).field_y = (128 ^ ((ec) this).field_y) + -128;
        ((ec) this).field_D = param3 ? true : false;
        ((ec) this).field_m = ((ec) this).field_D ? 21 : 26;
    }

    ec(int param0, int param1, int param2, int param3, boolean param4) {
        ((ec) this).field_A = param0;
        ((ec) this).field_B = param1;
        ((ec) this).field_z = param2;
        ((ec) this).field_D = param4 ? true : false;
        ((ec) this).field_y = param3;
        ((ec) this).field_m = ((ec) this).field_D ? 21 : 26;
    }

    static {
    }
}
