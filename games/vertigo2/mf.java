/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static cc field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static er a(r param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        er stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        er stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (hq.a(124, param3, param1, param0)) {
              if (param2 <= -72) {
                stackOut_6_0 = td.a(4205);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (er) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (er) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("mf.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
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
            if (nj.field_d >= 7) {
              var5 = 12000;
              if (~(long)var5 <= ~var3) {
                return false;
              } else {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              }
            } else {
              if (nj.field_d >= 5) {
                var5 = 9000;
                if (~(long)var5 <= ~var3) {
                  return false;
                } else {
                  id.field_a = var1;
                  nj.field_d = nj.field_d + 1;
                  return true;
                }
              } else {
                if (nj.field_d >= 3) {
                  var5 = 6000;
                  if (~(long)var5 <= ~var3) {
                    return false;
                  } else {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  }
                } else {
                  if (~(long)var5 <= ~var3) {
                    return false;
                  } else {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
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
            if (nj.field_d >= 7) {
              var5 = 12000;
              if (~(long)var5 <= ~var3) {
                return false;
              } else {
                id.field_a = var1;
                nj.field_d = nj.field_d + 1;
                return true;
              }
            } else {
              if (nj.field_d >= 5) {
                var5 = 9000;
                if (~(long)var5 <= ~var3) {
                  return false;
                } else {
                  id.field_a = var1;
                  nj.field_d = nj.field_d + 1;
                  return true;
                }
              } else {
                if (nj.field_d >= 3) {
                  var5 = 6000;
                  if (~(long)var5 <= ~var3) {
                    return false;
                  } else {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
                  }
                } else {
                  if (~(long)var5 <= ~var3) {
                    return false;
                  } else {
                    id.field_a = var1;
                    nj.field_d = nj.field_d + 1;
                    return true;
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
        return (param1 & mb.field_s) != 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 2;
        field_a = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
