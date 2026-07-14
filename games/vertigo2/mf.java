/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static cc field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 9000) {
            boolean discarded$0 = mf.b(-34);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static er a(r param0, int param1, byte param2, int param3) {
        if (!hq.a(124, param3, param1, param0)) {
            return null;
        }
        if (param2 > -72) {
            return null;
        }
        return td.a(4205);
    }

    final static boolean b(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -6390) {
          var1 = gk.a(param0 ^ -6287);
          var3 = -id.field_a + var1;
          if (var3 <= 30000L) {
            var5 = 3000;
            if (-8 >= nj.field_d) {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              } else {
                return false;
              }
            } else {
              if (-6 <= nj.field_d) {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  id.field_a = var1;
                  nj.field_d = nj.field_d + 1;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (nj.field_d >= 3) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            nj.field_d = 0;
            id.field_a = var1;
            return true;
          }
        } else {
          field_b = -111;
          var1 = gk.a(param0 ^ -6287);
          var3 = -id.field_a + var1;
          if (var3 <= 30000L) {
            var5 = 3000;
            if (-8 >= nj.field_d) {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              } else {
                return false;
              }
            } else {
              if (-6 <= nj.field_d) {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  id.field_a = var1;
                  nj.field_d = nj.field_d + 1;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (nj.field_d >= 3) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            nj.field_d = 0;
            id.field_a = var1;
            return true;
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != 126) {
            return false;
        }
        return -1 != (param1 & mb.field_s ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 2;
        field_a = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
