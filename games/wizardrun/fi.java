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

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        L0: {
          var7 = wizardrun.field_H;
          var2 = param0.length();
          if ((var2 ^ -1) < -21) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var9 = new char[var2];
        var8 = var9;
        var3 = var8;
        var4 = 103 % ((param1 - -14) / 61);
        var5 = 0;
        L1: while (true) {
          if (var5 >= var2) {
            return new String(var9);
          } else {
            L2: {
              var6 = param0.charAt(var5);
              if (var6 < 65) {
                break L2;
              } else {
                if (var6 <= 90) {
                  var3[var5] = (char)(var6 + -65 - -97);
                  var5++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (97 > var6) {
                  break L4;
                } else {
                  if (var6 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (48 > var6) {
                  break L5;
                } else {
                  if (var6 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var3[var5] = (char)95;
              var5++;
              continue L1;
            }
            var3[var5] = (char)var6;
            var5++;
            continue L1;
          }
        }
    }

    final static void f(int param0) {
        try {
            if (ub.field_t != null) {
                try {
                    ub.field_t.a(0L, (byte) -64);
                    ub.field_t.a(18729, nk.field_N.field_k, 24, nk.field_N.field_m);
                } catch (Exception exception) {
                }
            }
            nk.field_N.field_m = nk.field_N.field_m + 24;
            if (param0 != 95) {
                field_A = 49;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        field_y = null;
        int var1 = -107 % ((-44 - param0) / 44);
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
