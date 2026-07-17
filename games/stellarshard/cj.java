/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int field_c;
    static int field_d;
    static int field_a;
    static rd field_b;

    final static void b(int param0) {
    }

    final static pb[] a(int param0, int param1, int param2, int param3) {
        if (param3 != -17768) {
          field_a = 35;
          return a.a(param1, param0, 1, -128, param2);
        } else {
          return a.a(param1, param0, 1, -128, param2);
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static String a(long param0, byte param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = stellarshard.field_B;
        if (0L < param0) {
          if (param0 < 6582952005840035281L) {
            if (param0 % 37L != 0L) {
              if (param1 > -54) {
                return null;
              } else {
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (0L == var4) {
                    var6 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$2 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = wb.field_d[(int)(var7 + -(param0 * 37L))];
                          if (var9 == 95) {
                            var10 = -1 + var6.length();
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            var9 = 160;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$3 = var6.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ef.a(50, (byte) 63);
        field_b = new rd();
    }
}
