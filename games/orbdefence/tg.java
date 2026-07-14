/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_d;
    static long field_a;
    static int[] field_b;
    static va field_c;

    final static ti a(String param0, int param1) {
        String var2 = null;
        Object var3 = null;
        ti var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var3 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (qb.field_a != null) {
          if (param1 == 256) {
            L0: {
              var8 = (CharSequence) (Object) param0;
              var2 = ua.a(-21, var8);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (String) (Object) var3_ref;
                break L0;
              }
            }
            var3_ref = (ti) (Object) qb.field_a.a((byte) 109, (long)var2.hashCode());
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var9 = (CharSequence) (Object) var3_ref.field_db;
                  var4 = ua.a(param1 ^ 346, var9);
                  if (var4 == null) {
                    var4 = var3_ref.field_db;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (ti) (Object) qb.field_a.c((byte) -97);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            L3: {
              field_c = null;
              var6 = (CharSequence) (Object) param0;
              var2 = ua.a(-21, var6);
              if (var2 != null) {
                break L3;
              } else {
                var2 = (String) (Object) var6;
                break L3;
              }
            }
            var3_ref = (ti) (Object) qb.field_a.a((byte) 109, (long)var2.hashCode());
            L4: while (true) {
              if (var3_ref != null) {
                L5: {
                  var7 = (CharSequence) (Object) var3_ref.field_db;
                  var4 = ua.a(param1 ^ 346, var7);
                  if (var4 == null) {
                    var4 = var3_ref.field_db;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (ti) (Object) qb.field_a.c((byte) -97);
                  continue L4;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        se var2 = null;
        if (param0 >= -65) {
          return;
        } else {
          var2 = uk.field_b;
          var2.i(param1, 108);
          var2.a(1, -92);
          var2.a(2, -71);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_a = 118L;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "EXCLUSIVE";
        field_b = new int[256];
    }
}
