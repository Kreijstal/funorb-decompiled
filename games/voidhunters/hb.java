/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int[] field_d;
    static long field_b;
    static int field_a;
    static boolean field_c;

    public static void a(int param0) {
        if (param0 != 15873) {
            field_b = -75L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        ij var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        nc var6 = null;
        nc[] var7 = null;
        rqa var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_12_0 = false;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            param0 = ne.a((char)param1, (byte) 119, "", param0);
            param0 = ne.a('\t', (byte) 124, "", param0);
            param0 = ne.a('\n', (byte) 99, ";", param0);
            var2_ref = clb.a(16);
            System.out.println("String s=" + param0);
            var3 = up.a((byte) -67, ';', param0);
            var4 = 0;
            L1: while (true) {
              stackOut_2_0 = var4;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                if (stackIn_3_0 >= var3.length) {
                  break L0;
                } else {
                  var5 = up.a((byte) -67, '(', var3[var4]);
                  if (var9 == 0) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.length == 2) {
                            break L4;
                          } else {
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5[1] = ne.a(')', (byte) 111, "", var5[1]);
                        var6 = new nc(lob.a(-92, (CharSequence) (Object) var5[1]));
                        var7 = new nc[]{var6};
                        var8 = (rqa) (Object) var2_ref.d(0);
                        L5: while (true) {
                          if (var8 == null) {
                            break L3;
                          } else {
                            stackOut_12_0 = var8.a(true, var5[0], var7);
                            stackIn_3_0 = stackOut_12_0 ? 1 : 0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var9 != 0) {
                              continue L2;
                            } else {
                              L6: {
                                if (stackIn_13_0) {
                                  nc discarded$1 = var8.a(var7, param1 + -157);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var8 = (rqa) (Object) var2_ref.a((byte) 12);
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("hb.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    final static void a(kka param0, byte param1) {
        try {
            be.a(32, true, param0);
            int var2_int = -81 / ((param1 - -42) / 61);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hb.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 8;
    }
}
