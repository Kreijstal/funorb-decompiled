/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static boolean field_b;
    static dm field_c;
    static ck field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -23) {
            int discarded$0 = qj.b((byte) 28);
        }
    }

    final static int b(byte param0) {
        if (param0 != 81) {
            int discarded$0 = qj.b((byte) -12);
            return rd.field_u;
        }
        return rd.field_u;
    }

    final static String a(String param0, String param1, char param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = Geoblox.field_C;
        var4 = param0.length();
        var5 = param1.length();
        if (param3 >= 79) {
          var6 = var4;
          var7 = var5 + -1;
          if (0 == var7) {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L0: while (true) {
              var10 = param0.indexOf((int) param2, var9);
              if (var10 >= 0) {
                StringBuilder discarded$12 = var12.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$13 = var12.append(param1);
                continue L0;
              } else {
                StringBuilder discarded$14 = var12.append(param0.substring(var9));
                return var12.toString();
              }
            }
          } else {
            var8_int = 0;
            L1: while (true) {
              var8_int = param0.indexOf((int) param2, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L1;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L2: while (true) {
                  var10 = param0.indexOf((int) param2, var9);
                  if (var10 >= 0) {
                    StringBuilder discarded$15 = var13.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$16 = var13.append(param1);
                    continue L2;
                  } else {
                    StringBuilder discarded$17 = var13.append(param0.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          }
        } else {
          field_b = false;
          var6 = var4;
          var7 = var5 + -1;
          if (0 == var7) {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param0.indexOf((int) param2, var9);
              if (var10 >= 0) {
                StringBuilder discarded$18 = var8.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$19 = var8.append(param1);
                continue L3;
              } else {
                StringBuilder discarded$20 = var8.append(param0.substring(var9));
                return var8.toString();
              }
            }
          } else {
            var8_int = 0;
            L4: while (true) {
              var8_int = param0.indexOf((int) param2, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L4;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L5: while (true) {
                  var10 = param0.indexOf((int) param2, var9);
                  if (var10 >= 0) {
                    StringBuilder discarded$21 = var8.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$22 = var8.append(param1);
                    continue L5;
                  } else {
                    StringBuilder discarded$23 = var8.append(param0.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ck(10, 2, 2, 0);
    }
}
