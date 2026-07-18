/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_a;
    static int field_b;
    static da field_e;
    static boolean field_d;
    static int field_f;
    static String field_c;

    final static String a(long param0, byte param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = Confined.field_J ? 1 : 0;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (0L != param0 % 37L) {
              var3 = 0;
              var4 = param0;
              if (param1 > 59) {
                L0: while (true) {
                  if (var4 == 0L) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$5 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ud.field_q[(int)(var7 + -(param0 * 37L))];
                          if (var9 == 95) {
                            var10 = -1 + var12.length();
                            var9 = 160;
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$6 = var12.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                int discarded$7 = hd.a(98);
                L3: while (true) {
                  if (var4 == 0L) {
                    var13 = new StringBuilder(var3);
                    L4: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$8 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ud.field_q[(int)(var7 + -(param0 * 37L))];
                          if (var9 == 95) {
                            var10 = -1 + var13.length();
                            var9 = 160;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        StringBuilder discarded$9 = var13.append((char) var9);
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L3;
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

    public static void a() {
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static int a(int param0) {
        if (param0 <= 38) {
            field_a = null;
            return oj.field_A;
        }
        return oj.field_A;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Login: ";
        field_e = new da();
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_f = 128;
    }
}
