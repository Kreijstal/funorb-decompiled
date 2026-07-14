/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private static int[] field_b;
    int field_c;
    static String field_f;
    static String field_e;
    static int[] field_a;
    static String field_d;

    final static boolean a(int param0) {
        if (param0 != -2477) {
            field_d = null;
        }
        return ed.field_b;
    }

    final static int a(boolean param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var4 = -1;
        for (var5 = param1; param2 > var5; var5++) {
            var4 = field_b[255 & (var4 ^ param3[var5])] ^ var4 >>> -429782424;
        }
        if (param0) {
            Object var7 = null;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(char param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = fleas.field_A ? 1 : 0;
          var4 = param1.length();
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - param2;
          if (var7 != 0) {
            var8_int = 0;
            L1: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (-1 >= (var8_int ^ -1)) {
                var6 = var6 + var7;
                var8_int++;
                continue L1;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var8 = new StringBuilder(var6);
        var9 = 0;
        L2: while (true) {
          var10 = param1.indexOf((int) param0, var9);
          if (-1 < (var10 ^ -1)) {
            StringBuilder discarded$3 = var8.append(param1.substring(var9));
            return var8.toString();
          } else {
            StringBuilder discarded$4 = var8.append(param1.substring(var9, var10));
            var9 = 1 + var10;
            StringBuilder discarded$5 = var8.append(param3);
            continue L2;
          }
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (param1 < -94) {
            break L0;
          } else {
            var8 = null;
            break L0;
          }
        }
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(var6 + -64);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (122 < var6) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L3;
                    }
                  }
                }
                if (48 > var6) {
                  break L3;
                } else {
                  if (var6 > 57) {
                    break L3;
                  } else {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    uj(int param0) {
        ((uj) this).field_c = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 124) {
            uj.a((byte) -12);
        }
        field_f = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            field_f = "Resume Game";
            field_e = "Play free version";
            field_d = "Level failed! Too many fleas died!";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0 ^ -1) == -2) {
                  var0 = -306674912 ^ var0 >>> -26146047;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
