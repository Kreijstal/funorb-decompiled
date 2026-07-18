/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_e;
    static int[] field_g;
    static String field_a;
    static int field_f;
    static int field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        iw var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -3) {
                break L1;
              } else {
                hh.a((byte) 111);
                break L1;
              }
            }
            L2: {
              var9 = new iw(param0);
              var3 = var9.h((byte) -107);
              var4 = var9.k(param1 + 7);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (jk.field_h == 0) {
                    break L3;
                  } else {
                    if (var4 > jk.field_h) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.k(4);
                    if (var5 < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (jk.field_h == 0) {
                          break L5;
                        } else {
                          if (~var5 >= ~jk.field_h) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = (Object) (Object) lj.field_g;
                          synchronized (var7) {
                            L7: {
                              lj.field_g.a(-4019, var9, var17);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          int discarded$1 = au.a(var17, var5, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackOut_22_0 = (byte[]) var6;
                      stackIn_23_0 = stackOut_22_0;
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
                  var9.a(var16, 0, (byte) -6, var4);
                  stackOut_8_0 = (byte[]) var5_ref_byte__;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("hh.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 53) {
          var2 = null;
          byte[] discarded$2 = hh.a((byte[]) null, (byte) -12);
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(byte param0) {
        if (10 > vj.field_c) {
            return false;
        }
        if (13 > hl.field_d) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Join";
        field_a = "Gameplay";
        field_b = "Please log in as a subscribing member to access this feature.";
        field_c = "Click to turn on the buyout for this auction";
    }
}
