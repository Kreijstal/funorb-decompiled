/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fta {
    static fpa field_c;
    static iu field_b;
    static iu field_a;

    final static int c(int param0) {
        if (param0 > -86) {
            int discarded$0 = fta.c(114);
            return ov.field_p;
        }
        return ov.field_p;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        var4 = param0.length();
        var5 = param1.length();
        var6 = param3.length();
        if (var5 != 0) {
          var7 = var4;
          var8 = -var5 + var6;
          if (0 == var8) {
            var9 = new StringBuilder(var7);
            var10 = param2;
            L0: while (true) {
              var11 = param0.indexOf(param1, var10);
              if (var11 < 0) {
                StringBuilder discarded$6 = var9.append(param0.substring(var10));
                return var9.toString();
              } else {
                StringBuilder discarded$7 = var9.append(param0.substring(var10, var11));
                StringBuilder discarded$8 = var9.append(param3);
                var10 = var5 + var11;
                continue L0;
              }
            }
          } else {
            var9_int = 0;
            L1: while (true) {
              var9_int = param0.indexOf(param1, var9_int);
              if ((var9_int ^ -1) <= -1) {
                var7 = var7 + var8;
                var9_int = var9_int + var5;
                continue L1;
              } else {
                var9 = new StringBuilder(var7);
                var10 = param2;
                L2: while (true) {
                  var11 = param0.indexOf(param1, var10);
                  if (var11 < 0) {
                    StringBuilder discarded$9 = var9.append(param0.substring(var10));
                    return var9.toString();
                  } else {
                    StringBuilder discarded$10 = var9.append(param0.substring(var10, var11));
                    StringBuilder discarded$11 = var9.append(param3);
                    var10 = var5 + var11;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final boolean a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if ((Object) (Object) ria.field_o != this) {
            if ((Object) (Object) eo.field_w != this) {
              if (this == (Object) (Object) uga.field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          String discarded$4 = fta.a((String) null, (String) null, -76, (String) null);
          if ((Object) (Object) ria.field_o != this) {
            if ((Object) (Object) eo.field_w == this) {
              return true;
            } else {
              L0: {
                if (this != (Object) (Object) uga.field_n) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new fpa();
    }
}
