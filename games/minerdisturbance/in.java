/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_c;
    static String field_a;
    static String field_b;

    final static byte[] a(byte[] param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        sb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new sb(param0);
              var3 = var9.d((byte) -54);
              var4 = var9.b((byte) 69);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (eg.field_h == 0) {
                    break L2;
                  } else {
                    if (var4 > eg.field_h) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(var17, (byte) -120, 0, var4);
                  stackOut_20_0 = (byte[]) var5;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.b((byte) 20);
                    if (0 > var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (eg.field_h == 0) {
                          break L4;
                        } else {
                          if (var5_int <= eg.field_h) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 != 1) {
                          var7 = (Object) (Object) pi.field_g;
                          synchronized (var7) {
                            L6: {
                              pi.field_g.a(var9, true, var16);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$2 = 9;
                          int discarded$3 = va.a(var6, var5_int, param0, var4);
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) var6;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("in.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 0 + ')');
        }
        return stackIn_21_0;
    }

    final static bg a(int param0, byte param1) {
        bg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        bg[] var5 = null;
        var4 = MinerDisturbance.field_ab;
        int discarded$2 = -5596;
        var5 = pm.b();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (param0 != var5[var3].field_c) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 14912) {
            return;
        }
        field_c = null;
    }

    final static String a(CharSequence[] param0) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
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
            int discarded$4 = 0;
            int discarded$5 = 0;
            stackOut_0_0 = kl.a(param0, param0.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("in.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Checking";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
