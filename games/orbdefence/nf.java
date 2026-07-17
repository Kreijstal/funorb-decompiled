/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends o {
    int field_m;
    static String field_k;
    static String field_n;
    static String field_l;

    final static boolean e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var1 = (Object) (Object) ad.field_b;
        synchronized (var1) {
          L0: {
            if (md.field_g == pk.field_H) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              ob.field_K = g.field_g[md.field_g];
              od.field_k = ll.field_b[md.field_g];
              md.field_g = 1 + md.field_g & 127;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    nf(int param0) {
        ((nf) this).field_m = param0;
    }

    public static void h(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        mg var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_9_0 = null;
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
            if (param1 == -2) {
              L1: {
                var9 = new mg(param0);
                var3 = var9.b((byte) 90);
                var4 = var9.l(0);
                if (var4 < 0) {
                  break L1;
                } else {
                  L2: {
                    if (0 == lj.field_E) {
                      break L2;
                    } else {
                      if (var4 > lj.field_E) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var3 != 0) {
                    L3: {
                      var5 = var9.l(0);
                      if (0 > var5) {
                        break L3;
                      } else {
                        L4: {
                          if (lj.field_E == 0) {
                            break L4;
                          } else {
                            if (var5 > lj.field_E) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var17 = new byte[var5];
                          var15 = var17;
                          var13 = var15;
                          var11 = var13;
                          var6 = var11;
                          if (var3 != 1) {
                            var7 = (Object) (Object) tj.field_e;
                            synchronized (var7) {
                              L6: {
                                tj.field_e.a(var17, 693, var9);
                                break L6;
                              }
                            }
                            break L5;
                          } else {
                            int discarded$1 = ac.a(var17, var5, param0, var4, 9);
                            break L5;
                          }
                        }
                        stackOut_23_0 = (byte[]) var6;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a((byte) 114, var16, 0, var4);
                    stackOut_9_0 = (byte[]) var5_ref_byte__;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("nf.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 41);
        }
        return stackIn_24_0;
    }

    abstract Object f(int param0);

    abstract boolean g(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This game has been updated! Please reload this page.";
        field_l = "Achievements";
        field_n = "Orb Coins";
    }
}
