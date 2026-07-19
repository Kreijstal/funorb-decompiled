/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea extends hn {
    private int field_K;

    aea(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, this.field_K, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        RuntimeException decompiledCaughtException = null;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var10_int = 12 % ((param8 - 52) / 40);
                if (param0 != param2) {
                  break L2;
                } else {
                  if (param9 != param5) {
                    break L2;
                  } else {
                    if (param3 != param1) {
                      break L2;
                    } else {
                      if (param6 == param4) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var11 = param2;
              var12 = param5;
              var13 = param2 * 3;
              var14 = param5 * 3;
              var15 = param0 * 3;
              var16 = param9 * 3;
              var17 = param1 * 3;
              var18 = 3 * param6;
              var19 = var15 + (-var17 + (param3 - param2));
              var20 = -param5 + (var16 + (-var18 + param4));
              var21 = -var15 + (var17 - var15) + var13;
              var22 = var14 + (-var16 + -var16 + var18);
              var23 = var15 + -var13;
              var24 = var16 + -var14;
              var25 = 128;
              L3: while (true) {
                L4: {
                  L5: {
                    if ((var25 ^ -1) < -4097) {
                      break L5;
                    } else {
                      var26 = var25 * var25 >> 982197516;
                      var27 = var26 * var25 >> 977032172;
                      var28 = var19 * var27;
                      var29 = var27 * var20;
                      var30 = var26 * var21;
                      var31 = var22 * var26;
                      var32 = var23 * var25;
                      var33 = var24 * var25;
                      var34 = (var30 + (var28 - -var32) >> -2034570004) + param2;
                      var35 = (var29 + var31 + var33 >> -1516823732) + param5;
                      ik.a(var34, var11, -21, param7, var35, var12);
                      var12 = var35;
                      var11 = var34;
                      var25 += 128;
                      if (var36 != 0) {
                        break L4;
                      } else {
                        if (var36 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var36 == 0) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
                break L0;
              }
            }
            ik.a(param3, param2, 111, param7, param4, param5);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var10), "aea.WB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final boolean D(int param0) {
        fsa discarded$0 = null;
        if (param0 != 0) {
            la var3 = (la) null;
            discarded$0 = this.a((la) null, false, false);
            return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1) {
            this.field_K = -86;
            return true;
        }
        return true;
    }

    aea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
            this.field_K = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new fsa(param0, param2);
            var4.b((byte) -11, 2097152, 2097152);
            var5 = new lpa(param0, param1);
            var5.b(-5, this.field_K);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (ce) ((Object) var6.a(17, 102));
            var7.b(0, (byte) 23);
            var4.a(var5, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("aea.VB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final fsa a(int param0, boolean param1, la param2) {
        RuntimeException var4 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_2_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != 5) {
              stackOut_2_0 = (fsa) null;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("aea.SB(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
