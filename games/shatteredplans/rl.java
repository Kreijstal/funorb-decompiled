/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static bi field_c;
    static boolean[] field_b;
    static String field_d;
    private oq field_a;
    static bc field_f;
    private rl field_g;

    final void a(String param0, int param1, String param2) {
        oq var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = ((rl) this).field_a;
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 27275) {
              bc discarded$2 = rl.a(45, true, 103, -126, true);
              ((rl) this).field_a = new oq(param2, param0, ((rl) this).field_a);
              return;
            } else {
              ((rl) this).field_a = new oq(param2, param0, ((rl) this).field_a);
              return;
            }
          } else {
            if (!param2.equals((Object) (Object) var4.field_d)) {
              var4 = var4.field_f;
              continue L0;
            } else {
              var4.field_h = param0;
              return;
            }
          }
        }
    }

    final String a(int param0, String param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        String var27 = null;
        String var28 = null;
        String var35 = null;
        String var36 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var10 = new StringBuilder(param1.length());
        var4 = 0;
        if (param0 == 5607) {
          var5 = param1.length();
          L0: while (true) {
            if (var4 < var5) {
              var6 = param1.indexOf("<%", var4);
              if ((var6 ^ -1) > -1) {
                StringBuilder discarded$8 = var10.append(param1.substring(var4, var5));
                return var10.toString();
              } else {
                StringBuilder discarded$9 = var10.append(param1.substring(var4, var6));
                var4 = var6;
                var6 = param1.indexOf(">", var4 - -2);
                if (-1 < (var6 ^ -1)) {
                  StringBuilder discarded$10 = var10.append(param1.substring(var4, var5));
                  return var10.toString();
                } else {
                  L1: {
                    var27 = param1.substring(var4 + 2, var6);
                    var28 = this.b(88, var27);
                    if (var28 == null) {
                      break L1;
                    } else {
                      StringBuilder discarded$11 = var10.append(var28);
                      break L1;
                    }
                  }
                  var4 = 1 + var6;
                  continue L0;
                }
              }
            } else {
              return var10.toString();
            }
          }
        } else {
          field_e = null;
          var5 = param1.length();
          L2: while (true) {
            if (var4 < var5) {
              var6 = param1.indexOf("<%", var4);
              if ((var6 ^ -1) > -1) {
                StringBuilder discarded$12 = var10.append(param1.substring(var4, var5));
                return var10.toString();
              } else {
                StringBuilder discarded$13 = var10.append(param1.substring(var4, var6));
                var4 = var6;
                var6 = param1.indexOf(">", var4 - -2);
                if (-1 < (var6 ^ -1)) {
                  StringBuilder discarded$14 = var10.append(param1.substring(var4, var5));
                  return var10.toString();
                } else {
                  L3: {
                    var35 = param1.substring(var4 + 2, var6);
                    var36 = this.b(88, var35);
                    if (var36 == null) {
                      break L3;
                    } else {
                      StringBuilder discarded$15 = var10.append(var36);
                      break L3;
                    }
                  }
                  var4 = 1 + var6;
                  continue L2;
                }
              }
            } else {
              return var10.toString();
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_d = null;
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 != -1) {
            return null;
        }
        return cc.a(param2, false, param3, param0 + 12001, param1, param4);
    }

    private final String b(int param0, String param1) {
        oq var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ((rl) this).field_a;
        var4 = 27 % ((param0 - -76) / 35);
        L0: while (true) {
          if (var3 == null) {
            if (null == ((rl) this).field_g) {
              return null;
            } else {
              return ((rl) this).field_g.b(-112, param1);
            }
          } else {
            if (param1.equals((Object) (Object) var3.field_d)) {
              return var3.field_h;
            } else {
              var3 = var3.field_f;
              continue L0;
            }
          }
        }
    }

    public rl() {
    }

    rl(rl param0) {
        ((rl) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Quit";
        field_e = "you lost <%0> fleets in the attack";
    }
}
