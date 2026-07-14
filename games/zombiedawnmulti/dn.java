/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String field_b;
    static int[] field_a;

    final static byte[] a(ga param0, byte[] param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = param0.h(param3, 14862);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            if (param2 < -4) {
              break L2;
            } else {
              dn.a(-49);
              break L2;
            }
          }
          L3: {
            var5 = param0.h(3, 14862);
            var6 = (byte)param0.h(8, 14862);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (byte)(var6 + param0.h(var5, 14862));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final static ml a(String param0, boolean param1) {
        String var2 = null;
        ml var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ol.field_o != null) {
          if (param0 != null) {
            if (0 != param0.length()) {
              var6 = (CharSequence) (Object) param0;
              var2 = tg.a(var6, param1);
              if (var2 != null) {
                var3 = (ml) (Object) ol.field_o.a((long)var2.hashCode(), -22877);
                L0: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_Hb;
                    var4 = tg.a(var7, false);
                    if (!var4.equals((Object) (Object) var2)) {
                      var3 = (ml) (Object) ol.field_o.b((byte) 68);
                      continue L0;
                    } else {
                      return var3;
                    }
                  } else {
                    return null;
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
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16130) {
            Object var2 = null;
            ml discarded$0 = dn.a((String) null, false);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unpacking sound effects";
    }
}
