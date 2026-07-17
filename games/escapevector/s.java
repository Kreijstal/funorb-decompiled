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
        if (param1 == 13) {
          return true;
        } else {
          if (param0 != 15) {
            s.d((byte) 54);
            return di.field_d.b((byte) -18);
          } else {
            return di.field_d.b((byte) -18);
          }
        }
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
        Object var9 = null;
        n var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
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
              var10 = new n(param1);
              var3 = var10.e(0);
              if (param0 == -26) {
                break L1;
              } else {
                var9 = null;
                String discarded$2 = s.a((byte) 49, (CharSequence[]) null);
                break L1;
              }
            }
            L2: {
              var4 = var10.g(-5053);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (m.field_q == 0) {
                    break L3;
                  } else {
                    if (m.field_q < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var10.g(-5053);
                    if (0 > var5) {
                      break L4;
                    } else {
                      L5: {
                        if (m.field_q == 0) {
                          break L5;
                        } else {
                          if (m.field_q >= var5) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var18 = new byte[var5];
                        var16 = var18;
                        var14 = var16;
                        var12 = var14;
                        var6 = var12;
                        if (1 != var3) {
                          var7 = (Object) (Object) tc.field_g;
                          synchronized (var7) {
                            L7: {
                              tc.field_g.a(122, var18, var10);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          int discarded$3 = i.a(var18, var5, param1, var4, 9);
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
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5_ref_byte__ = var11;
                  var10.a(var17, (byte) -96, 0, var4);
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
            stackOut_24_1 = new StringBuilder().append("s.G(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    public static void d(byte param0) {
        if (param0 != 34) {
            return;
        }
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
            stackOut_4_1 = new StringBuilder().append("s.B(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
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
