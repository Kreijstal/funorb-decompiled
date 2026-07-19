/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        byte[] discarded$0 = null;
        field_a = null;
        if (param0) {
            byte[] var2 = (byte[]) null;
            discarded$0 = qk.a(29, (byte[]) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        wf var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_21_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var10 = new wf(param1);
              var3 = var10.d(true);
              var4 = var10.d((byte) 19);
              var5 = -48 % ((-21 - param0) / 59);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (-1 == (jd.field_a ^ -1)) {
                    break L2;
                  } else {
                    if (jd.field_a < var4) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 != (var3 ^ -1)) {
                  L3: {
                    var6 = var10.d((byte) 19);
                    if (var6 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (jd.field_a ^ -1)) {
                          break L4;
                        } else {
                          if (jd.field_a < var6) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var14 = new byte[var6];
                          var12 = var14;
                          var7 = var12;
                          if (var3 == 1) {
                            break L6;
                          } else {
                            var8 = al.field_F;
                            synchronized (var8) {
                              L7: {
                                al.field_F.a(8, var14, var10);
                                break L7;
                              }
                            }
                            if (!Lexicominos.field_L) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        discarded$1 = ic.a(var14, var6, param1, var4, 9);
                        break L5;
                      }
                      stackOut_21_0 = (byte[]) (var7);
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var13 = new byte[var4];
                  var11 = var13;
                  var6_ref_byte__ = var11;
                  var10.a(105, var4, 0, var13);
                  stackOut_6_0 = (byte[]) (var6_ref_byte__);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 != 0) {
            return 118;
        }
        return ka.a(2);
    }

    static {
        field_a = "Loading...";
        field_b = "Unpacking sound effects";
    }
}
