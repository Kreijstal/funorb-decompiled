/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends oa {
    static ed field_H;
    byte field_y;
    int field_F;
    static int field_D;
    n field_A;
    static boolean field_E;
    static String field_C;
    static int field_z;
    static String[] field_I;
    static ed field_G;
    static String field_B;
    static int field_x;

    final static boolean a(byte param0, int param1) {
        if (!(param1 != 13)) {
            return true;
        }
        return di.field_d.b((byte) -18);
    }

    final static byte[] a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        n var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_7_0 = null;
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
        byte[] stackOut_6_0 = null;
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
              var9 = new n(param1);
              var3 = var9.e(0);
              var4 = var9.g(-5053);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (m.field_q == 0) {
                    break L2;
                  } else {
                    if (m.field_q < var4) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.g(-5053);
                    if (0 > var5) {
                      break L3;
                    } else {
                      L4: {
                        if (m.field_q == 0) {
                          break L4;
                        } else {
                          if (m.field_q >= var5) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = (Object) (Object) tc.field_g;
                          synchronized (var7) {
                            L6: {
                              tc.field_g.a(122, var17, var9);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$1 = i.a(var17, var5, param1, var4, 9);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
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
                  var9.a(var16, (byte) -96, 0, var4);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
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
            stackOut_22_1 = new StringBuilder().append("s.G(").append(-26).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    public static void d(byte param0) {
        field_B = null;
        field_I = null;
        field_H = null;
        field_G = null;
        field_C = null;
    }

    s() {
    }

    final byte[] a(boolean param0) {
        if (!((s) this).field_u) {
          if (((s) this).field_A.field_m >= ((s) this).field_A.field_g.length - ((s) this).field_y) {
            if (!param0) {
              ((s) this).field_A = null;
              return ((s) this).field_A.field_g;
            } else {
              return ((s) this).field_A.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final int g(int param0) {
        if (param0 != 100) {
            ((s) this).field_F = -96;
            if (!(null != ((s) this).field_A)) {
                return 0;
            }
            return ((s) this).field_A.field_m * 100 / (-((s) this).field_y + ((s) this).field_A.field_g.length);
        }
        if (!(null != ((s) this).field_A)) {
            return 0;
        }
        return ((s) this).field_A.field_m * 100 / (-((s) this).field_y + ((s) this).field_A.field_g.length);
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -4) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = s.a((byte) -12, (CharSequence[]) null);
                break L1;
              }
            }
            stackOut_2_0 = ua.a(0, param1.length, param1, 4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("s.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Mouse over an icon for details";
        field_D = 0;
        field_B = "Names can only contain letters, numbers, spaces and underscores";
    }
}
