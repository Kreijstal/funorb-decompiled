/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int[] field_d;
    static long field_b;
    static int field_a;
    static boolean field_c;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15873) {
                break L1;
              } else {
                field_b = -75L;
                break L1;
              }
            }
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "hb.B(" + param0 + ')');
        }
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
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_16_0 = false;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
              stackOut_2_0 = ~var4;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= ~var3.length) {
                      break L4;
                    } else {
                      var5 = up.a((byte) -67, '(', var3[var4]);
                      if (var9 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (null == var5) {
                            break L5;
                          } else {
                            L6: {
                              if (var5.length == 2) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var5[1] = ne.a(')', (byte) 111, "", var5[1]);
                            var6 = new nc(lob.a(-92, (CharSequence) (Object) var5[1]));
                            var7 = new nc[]{var6};
                            var8 = (rqa) (Object) var2_ref.d(0);
                            L7: while (true) {
                              if (var8 == null) {
                                break L5;
                              } else {
                                stackOut_16_0 = var8.a(true, var5[0], var7);
                                stackIn_3_0 = stackOut_16_0 ? 1 : 0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var9 != 0) {
                                  continue L2;
                                } else {
                                  L8: {
                                    if (stackIn_17_0) {
                                      nc discarded$1 = var8.a(var7, param1 + -157);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var8 = (rqa) (Object) var2_ref.a((byte) 12);
                                  if (var9 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("hb.A(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final static void a(kka param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            be.a(32, true, param0);
            var2_int = -81 / ((param1 - -42) / 61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hb.C(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 8;
    }
}
