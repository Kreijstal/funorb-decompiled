/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_b;
    static hl field_a;
    static int field_e;
    static String field_d;
    static boolean field_c;

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return nl.a((byte) 127, qj.field_a, vj.field_o);
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((7 & param1) == 0) {
            break L0;
          } else {
            var2 = 8 + -(7 & param1);
            break L0;
          }
        }
        if (param0) {
          int discarded$2 = k.a(true, -38);
          var3 = var2 + param1;
          return var3;
        } else {
          var3 = var2 + param1;
          return var3;
        }
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var9_ref_StringBuilder = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        var4 = param3.length();
        var5 = param2.length();
        var6 = param0.length();
        if (0 == var5) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          var7 = var4;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9 = 0;
            L0: while (true) {
              var9 = param3.indexOf(param2, var9);
              if (var9 >= 0) {
                var7 = var7 + var8;
                var9 = var9 + var5;
                continue L0;
              } else {
                var9_ref_StringBuilder = new StringBuilder(var7);
                if (param1) {
                  field_d = null;
                  var10 = 0;
                  L1: while (true) {
                    var11 = param3.indexOf(param2, var10);
                    if ((var11 ^ -1) > -1) {
                      StringBuilder discarded$12 = var9_ref_StringBuilder.append(param3.substring(var10));
                      return var9_ref_StringBuilder.toString();
                    } else {
                      StringBuilder discarded$13 = var9_ref_StringBuilder.append(param3.substring(var10, var11));
                      StringBuilder discarded$14 = var9_ref_StringBuilder.append(param0);
                      var10 = var11 - -var5;
                      continue L1;
                    }
                  }
                } else {
                  var10 = 0;
                  L2: while (true) {
                    var11 = param3.indexOf(param2, var10);
                    if ((var11 ^ -1) > -1) {
                      StringBuilder discarded$15 = var9_ref_StringBuilder.append(param3.substring(var10));
                      return var9_ref_StringBuilder.toString();
                    } else {
                      StringBuilder discarded$16 = var9_ref_StringBuilder.append(param3.substring(var10, var11));
                      StringBuilder discarded$17 = var9_ref_StringBuilder.append(param0);
                      var10 = var11 - -var5;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var9_ref_StringBuilder = new StringBuilder(var7);
            if (param1) {
              field_d = null;
              var10 = 0;
              L3: while (true) {
                var11 = param3.indexOf(param2, var10);
                if ((var11 ^ -1) > -1) {
                  StringBuilder discarded$18 = var9_ref_StringBuilder.append(param3.substring(var10));
                  return var9_ref_StringBuilder.toString();
                } else {
                  StringBuilder discarded$19 = var9_ref_StringBuilder.append(param3.substring(var10, var11));
                  StringBuilder discarded$20 = var9_ref_StringBuilder.append(param0);
                  var10 = var11 - -var5;
                  continue L3;
                }
              }
            } else {
              var10 = 0;
              L4: while (true) {
                var11 = param3.indexOf(param2, var10);
                if ((var11 ^ -1) > -1) {
                  StringBuilder discarded$21 = var9_ref_StringBuilder.append(param3.substring(var10));
                  return var9_ref_StringBuilder.toString();
                } else {
                  StringBuilder discarded$22 = var9_ref_StringBuilder.append(param3.substring(var10, var11));
                  StringBuilder discarded$23 = var9_ref_StringBuilder.append(param0);
                  var10 = var11 - -var5;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 != 0) {
          return -61L;
        } else {
          L0: {
            var1 = System.currentTimeMillis();
            if (var1 < af.field_f) {
              wd.field_f = wd.field_f + (af.field_f + -var1);
              break L0;
            } else {
              break L0;
            }
          }
          af.field_f = var1;
          return var1 - -wd.field_f;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_d = null;
        field_b = null;
        if (param0 != -14243) {
          var2 = null;
          String discarded$2 = k.a((String) null, false, (String) null, (String) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
