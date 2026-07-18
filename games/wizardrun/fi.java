/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends ml {
    int field_z;
    static int field_B;
    static int field_A;
    va field_C;
    static volatile int field_w;
    static String field_v;
    static int field_x;
    static ga field_y;
    byte field_D;

    final static String a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var11 = new char[var2_int];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var3 = var8;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var2_int) {
                stackOut_19_0 = new String(var11);
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = param0.charAt(var5);
                    if (var6 < 65) {
                      break L4;
                    } else {
                      if (var6 <= 90) {
                        var3[var5] = (char)(var6 + 32);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (97 > var6) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (48 > var6) {
                        break L7;
                      } else {
                        if (var6 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var5] = '_';
                    break L3;
                  }
                  var3[var5] = (char)var6;
                  break L3;
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("fi.M(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + 83 + ')');
        }
        return stackIn_20_0;
    }

    final static void f() {
        try {
            if (ub.field_t != null) {
                try {
                    ub.field_t.a(0L, (byte) -64);
                    ub.field_t.a(18729, nk.field_N.field_k, 24, nk.field_N.field_m);
                } catch (Exception exception) {
                }
            }
            nk.field_N.field_m = nk.field_N.field_m + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        field_y = null;
        int var1 = 0;
        field_v = null;
    }

    final int c(boolean param0) {
        if (param0) {
            byte[] discarded$0 = ((fi) this).d(123);
        }
        if (!(null != ((fi) this).field_C)) {
            return 0;
        }
        return ((fi) this).field_C.field_m * 100 / (-((fi) this).field_D + ((fi) this).field_C.field_k.length);
    }

    final byte[] d(int param0) {
        L0: {
          if (((fi) this).field_s) {
            break L0;
          } else {
            if (((fi) this).field_C.field_m >= -((fi) this).field_D + ((fi) this).field_C.field_k.length) {
              L1: {
                if (param0 == 95) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((fi) this).d(-58);
                  break L1;
                }
              }
              return ((fi) this).field_C.field_k;
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    fi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_w = 0;
        field_v = "This password contains your Player Name, and would be easy to guess";
    }
}
