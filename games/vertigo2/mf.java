/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static cc field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 9000) {
            mf.b(-34);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static er a(r param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        er stackIn_5_0 = null;
        er stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hq.a(124, param3, param1, param0)) {
              if (param2 <= -72) {
                stackIn_7_0 = td.a(4205);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (er) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("mf.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (er) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static boolean b(int param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -6390) {
          var1 = gk.a(param0 ^ -6287);
          var3 = -id.field_a + var1;
          if (var3 <= 30000L) {
            var5 = 3000;
            if (-8 >= (nj.field_d ^ -1)) {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              } else {
                return false;
              }
            } else {
              if (-6 >= (nj.field_d ^ -1)) {
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
            if (-8 >= (nj.field_d ^ -1)) {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              } else {
                return false;
              }
            } else {
              if (-6 >= (nj.field_d ^ -1)) {
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
        field_b = 2;
        field_a = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
