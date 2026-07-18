/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mn {
    private int field_y;
    static String[] field_v;
    static String field_x;
    static um field_B;
    private int field_A;
    static String field_w;
    private int field_z;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_7_0 = new String(var3);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  var5 = param0.charAt(var4);
                  if (var4 == 0) {
                    var5 = hc.a(98, (char) var5);
                    break L2;
                  } else {
                    var5 = Character.toLowerCase((char) var5);
                    break L2;
                  }
                }
                var3[var4] = (char)var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("jc.E(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 42 + ')');
        }
        return stackIn_8_0;
    }

    final static b b(int param0, int param1) {
        b var2 = new b();
        ta.field_O.a((byte) -119, (tc) (Object) var2);
        a.a(4, (byte) -32);
        return var2;
    }

    private final String a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = ((jc) this).a(125, param0, "deploy");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jc.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_x = null;
        field_B = null;
        int var1 = 0;
        field_v = null;
        field_w = null;
    }

    jc(int param0, int param1, int param2, int param3) {
        ((jc) this).field_p = param0;
        ((jc) this).field_A = param1;
        ((jc) this).field_y = param3;
        ((jc) this).field_z = param2;
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
        ne var4 = null;
        jd var5 = null;
        jd var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        pl stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_18_0 = null;
        pl stackOut_23_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            ((jc) this).d(96);
            var5 = param1.c(((jc) this).field_z, true, ((jc) this).field_A);
            var6 = var5;
            if (var6 != null) {
              if (((jc) this).field_p == var6.field_O) {
                if (!var6.field_s) {
                  if (0 < (bw.field_m[var5.field_N][10] & 1024)) {
                    L1: {
                      var4 = param1.field_Eb[var6.field_J - -(var6.field_w * param1.field_v)];
                      if (34 != var6.field_N) {
                        break L1;
                      } else {
                        if (var4.f(19725)) {
                          break L1;
                        } else {
                          String discarded$6 = this.a(new String[2], false);
                          stackOut_14_0 = null;
                          stackIn_15_0 = stackOut_14_0;
                          return (bd) (Object) stackIn_15_0;
                        }
                      }
                    }
                    L2: {
                      if (var6.field_N != 7) {
                        break L2;
                      } else {
                        if (var4.field_h == 0) {
                          break L2;
                        } else {
                          String discarded$7 = this.a(new String[2], false);
                          stackOut_18_0 = null;
                          stackIn_19_0 = stackOut_18_0;
                          return (bd) (Object) stackIn_19_0;
                        }
                      }
                    }
                    if (param0 > 31) {
                      stackOut_23_0 = new pl(((jc) this).field_p, var6, ((jc) this).field_y);
                      stackIn_24_0 = stackOut_23_0;
                      break L0;
                    } else {
                      stackOut_21_0 = null;
                      stackIn_22_0 = stackOut_21_0;
                      return (bd) (Object) stackIn_22_0;
                    }
                  } else {
                    String discarded$8 = this.a(new String[3], false);
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (bd) (Object) stackIn_11_0;
                  }
                } else {
                  String discarded$9 = this.a(new String[3], false);
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return (bd) (Object) stackIn_8_0;
                }
              } else {
                String discarded$10 = this.a(new String[4], false);
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (bd) (Object) stackIn_5_0;
              }
            } else {
              String discarded$11 = this.a(new String[2], false);
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("jc.C(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return (bd) (Object) stackIn_24_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Send private Quick Chat to <%0>";
        field_x = "Warning! All your portals are blocked and you haven't moved a unit recently. You have <%0> turns until you fail the mission.";
    }
}
