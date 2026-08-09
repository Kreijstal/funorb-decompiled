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
            this.z(-82);
            return (lj) ((Object) this.field_A);
        }
        return (lj) ((Object) this.field_A);
    }

    final void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6) {
        csa stackIn_14_0;
        boolean stackIn_14_1;
        int stackIn_14_2;
        la stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        mka stackIn_14_6;
        csa stackIn_15_0;
        boolean stackIn_15_1;
        int stackIn_15_2;
        la stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        mka stackIn_15_6;
        int stackIn_15_7;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        mka var10 = null;
        csa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_z.a(param5, 14530)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var13 = this.a(param0, 3, param2);
                if (param6 == null) {
                  break L1;
                } else {
                  var13.b(true, 11468);
                  break L1;
                }
              }
              L2: {
                var13.a(this.field_z, (byte) 121);
                var13.m(1, this.field_j);
                if (param1) {
                  break L2;
                } else {
                  this.field_A = (fsa) null;
                  break L2;
                }
              }
              var13.c(this.field_p, -19879);
              var13.a(this.field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L3: while (true) {
                if (this.field_t.length <= var9) {
                  L4: {
                    if (param6 == null) {
                      L5: {
                        if (!this.z(0)) {
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
                    if (!this.a(6)) {
                      break L6;
                    } else {
                      if (!this.field_x) {
                        var13.m(-82);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_A = var13;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L7: {
                    var10 = this.field_t[var9];
                    var11 = var10.a(-89);
                    if (var11 != null) {
                      L8: {
                        stackIn_14_0 = (csa) (var11);

                        stackIn_14_1 = param0;

                        stackIn_14_2 = 1;

                        stackIn_14_3 = (la) (param2);

                        stackIn_14_4 = param3 - -var10.b((byte) -125);

                        stackIn_14_5 = param4;

                        stackIn_14_6 = (mka) (var10);

                        if (param1) {
                          stackIn_15_0 = (csa) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = stackIn_14_2;
                          stackIn_15_3 = (la) ((Object) stackIn_14_3);
                          stackIn_15_4 = stackIn_14_4;
                          stackIn_15_5 = stackIn_14_5;
                          stackIn_15_6 = (mka) ((Object) stackIn_14_6);
                          stackIn_15_7 = 0;
                          break L8;
                        } else {
                          stackIn_15_0 = (csa) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = stackIn_14_2;
                          stackIn_15_3 = (la) ((Object) stackIn_14_3);
                          stackIn_15_4 = stackIn_14_4;
                          stackIn_15_5 = stackIn_14_5;
                          stackIn_15_6 = (mka) ((Object) stackIn_14_6);
                          stackIn_15_7 = 1;
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
            stackIn_30_0 = (RuntimeException) (var8);

            stackIn_30_1 = new StringBuilder().append("kna.FB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    kna(la param0, int param1) {
        super(param0, param1);
    }

    boolean z(int param0) {
        if (param0 != 0) {
            field_C = (String) null;
            return true;
        }
        return true;
    }

    abstract fsa a(boolean param0, int param1, la param2);

    static {
        field_C = "<%0> cannot join; the game is full.";
        field_E = "Offer rematch";
        field_B = "Withdraw request to join <%0>'s game";
        field_D = "A fascinating scientific anomaly, these discs are kept in motion by a peculiar interaction of the temple's magnetic forces.";
    }
}
