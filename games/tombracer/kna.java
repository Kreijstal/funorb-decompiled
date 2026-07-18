/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kna extends csa {
    private fsa field_A;
    static String field_E;
    static String field_C;
    static String field_B;
    static String field_D;

    public static void y(int param0) {
        field_D = null;
        field_E = null;
        field_C = null;
        field_B = null;
        if (param0 != 0) {
            kna.y(74);
        }
    }

    kna(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    lj u(int param0) {
        if (param0 >= -60) {
            boolean discarded$0 = ((kna) this).z(-82);
            return (lj) (Object) ((kna) this).field_A;
        }
        return (lj) (Object) ((kna) this).field_A;
    }

    final void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        mka var10 = null;
        csa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        csa stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        int stackIn_13_2 = 0;
        la stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        mka stackIn_13_6 = null;
        csa stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        int stackIn_14_2 = 0;
        la stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        mka stackIn_14_6 = null;
        csa stackIn_15_0 = null;
        boolean stackIn_15_1 = false;
        int stackIn_15_2 = 0;
        la stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        mka stackIn_15_6 = null;
        int stackIn_15_7 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        csa stackOut_12_0 = null;
        boolean stackOut_12_1 = false;
        int stackOut_12_2 = 0;
        la stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        mka stackOut_12_6 = null;
        csa stackOut_14_0 = null;
        boolean stackOut_14_1 = false;
        int stackOut_14_2 = 0;
        la stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        mka stackOut_14_6 = null;
        int stackOut_14_7 = 0;
        csa stackOut_13_0 = null;
        boolean stackOut_13_1 = false;
        int stackOut_13_2 = 0;
        la stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        mka stackOut_13_6 = null;
        int stackOut_13_7 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((kna) this).field_z.a(param5, 14530)) {
              return;
            } else {
              L1: {
                var13 = ((kna) this).a(param0, 3, param2);
                if (param6 == null) {
                  break L1;
                } else {
                  var13.b(true, 11468);
                  break L1;
                }
              }
              L2: {
                var13.a(((kna) this).field_z, (byte) 121);
                var13.m(1, ((kna) this).field_j);
                if (param1) {
                  break L2;
                } else {
                  ((kna) this).field_A = null;
                  break L2;
                }
              }
              var13.c(((kna) this).field_p, -19879);
              var13.a(((kna) this).field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L3: while (true) {
                if (((kna) this).field_t.length <= var9) {
                  L4: {
                    if (param6 == null) {
                      L5: {
                        if (!((kna) this).z(0)) {
                          break L5;
                        } else {
                          var13.c(437453352, true);
                          break L5;
                        }
                      }
                      param2.a(var13, (byte) 32);
                      break L4;
                    } else {
                      param6.a(-39, var13);
                      break L4;
                    }
                  }
                  L6: {
                    if (!((kna) this).a(6)) {
                      break L6;
                    } else {
                      if (!((kna) this).field_x) {
                        var13.m(-82);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ((kna) this).field_A = var13;
                  break L0;
                } else {
                  L7: {
                    var10 = ((kna) this).field_t[var9];
                    var11 = var10.a(-89);
                    if (var11 != null) {
                      L8: {
                        stackOut_12_0 = (csa) var11;
                        stackOut_12_1 = param0;
                        stackOut_12_2 = 1;
                        stackOut_12_3 = (la) param2;
                        stackOut_12_4 = param3 - -var10.b((byte) -125);
                        stackOut_12_5 = param4;
                        stackOut_12_6 = (mka) var10;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_14_4 = stackOut_12_4;
                        stackIn_14_5 = stackOut_12_5;
                        stackIn_14_6 = stackOut_12_6;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        stackIn_13_5 = stackOut_12_5;
                        stackIn_13_6 = stackOut_12_6;
                        if (param1) {
                          stackOut_14_0 = (csa) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = stackIn_14_2;
                          stackOut_14_3 = (la) (Object) stackIn_14_3;
                          stackOut_14_4 = stackIn_14_4;
                          stackOut_14_5 = stackIn_14_5;
                          stackOut_14_6 = (mka) (Object) stackIn_14_6;
                          stackOut_14_7 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          stackIn_15_4 = stackOut_14_4;
                          stackIn_15_5 = stackOut_14_5;
                          stackIn_15_6 = stackOut_14_6;
                          stackIn_15_7 = stackOut_14_7;
                          break L8;
                        } else {
                          stackOut_13_0 = (csa) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = stackIn_13_2;
                          stackOut_13_3 = (la) (Object) stackIn_13_3;
                          stackOut_13_4 = stackIn_13_4;
                          stackOut_13_5 = stackIn_13_5;
                          stackOut_13_6 = (mka) (Object) stackIn_13_6;
                          stackOut_13_7 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          stackIn_15_4 = stackOut_13_4;
                          stackIn_15_5 = stackOut_13_5;
                          stackIn_15_6 = stackOut_13_6;
                          stackIn_15_7 = stackOut_13_7;
                          break L8;
                        }
                      }
                      ((csa) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, stackIn_15_3, stackIn_15_4, stackIn_15_5 - -((mka) (Object) stackIn_15_6).a(stackIn_15_7 != 0), param5, var13);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var8;
            stackOut_28_1 = new StringBuilder().append("kna.FB(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    kna(la param0, int param1) {
        super(param0, param1);
    }

    boolean z(int param0) {
        if (param0 != 0) {
            field_C = null;
            return true;
        }
        return true;
    }

    abstract fsa a(boolean param0, int param1, la param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "<%0> cannot join; the game is full.";
        field_E = "Offer rematch";
        field_B = "Withdraw request to join <%0>'s game";
        field_D = "A fascinating scientific anomaly, these discs are kept in motion by a peculiar interaction of the temple's magnetic forces.";
    }
}
