/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends mn {
    private ik field_v;
    private int field_w;

    final static short[] a(short[] param0, int param1, bv param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param2.g(45, param1);
            if (var4_int != 0) {
              if (param3 == 10064) {
                L1: {
                  L2: {
                    if (param0 == null) {
                      break L2;
                    } else {
                      if (var4_int == param0.length) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.g(123, 4);
                  var6 = (short)param2.g(param3 + -10172, 16);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param0[var7] = (short)(param2.g(63, var5) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param0[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_6_0 = (short[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("to.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        if (vi.field_a != null) {
          if (0 != vi.field_a.length) {
            if ((param0 ^ -1) <= -1) {
              if (param0 >= vi.field_a.length) {
                return;
              } else {
                we.a(100, param2, vi.field_a[param0]);
                var3 = -110 / ((-58 - param1) / 63);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, float param1, String param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pq.field_a != null) {
                break L1;
              } else {
                pq.field_a = new cr(rl.field_C, aw.field_h);
                rl.field_C.a(pq.field_a, param3 + 1);
                break L1;
              }
            }
            pq.field_a.a(param1, 30, param0, param2);
            qn.b();
            nw.b((byte) 92, true);
            if (param3 == -1) {
              break L0;
            } else {
              to.a(-96, (byte) 21, 26);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("to.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final bd a(int param0, ha param1) {
        RuntimeException var3 = null;
        String var4 = null;
        ua stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.d(-104);
              if (param0 > 31) {
                break L1;
              } else {
                var4 = (String) null;
                to.a(true, -1.1208561658859253f, (String) null, -70);
                break L1;
              }
            }
            this.field_v.a((byte) -37, param1);
            stackIn_3_0 = new ua(this.field_v, this.field_w, this.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("to.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (bd) ((Object) stackIn_3_0);
    }

    to(ik param0, int param1, int param2) {
        try {
            this.field_w = param1;
            this.field_p = param2;
            this.field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
