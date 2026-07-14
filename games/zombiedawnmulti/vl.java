/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends br {
    int field_g;
    static ja field_k;
    int field_i;
    static String[] field_j;
    static int field_h;
    static ri field_f;

    final static String a(String param0, String[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (var6_int >= 0) {
            var5 = var6_int + 2;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!vh.a(param0.charAt(var5), (byte) 85)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (ti.a((byte) 87, (CharSequence) (Object) var7_ref)) {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = md.a((CharSequence) (Object) var7_ref, -9159);
                    var4 = var4 + (var6_int - (var5 - param1[var8].length()));
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            if (param2 == 2) {
              L3: while (true) {
                var8 = param0.indexOf("<%", var5);
                if (var8 < 0) {
                  StringBuilder discarded$3 = var6.append(param0.substring(var7));
                  return var6.toString();
                } else {
                  var5 = var8 + 2;
                  L4: while (true) {
                    L5: {
                      if (var3 <= var5) {
                        break L5;
                      } else {
                        if (!vh.a(param0.charAt(var5), (byte) 85)) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param0.substring(var8 + 2, var5);
                    if (!ti.a((byte) 74, (CharSequence) (Object) var9)) {
                      continue L3;
                    } else {
                      if (var5 >= var3) {
                        continue L3;
                      } else {
                        if (param0.charAt(var5) != 62) {
                          continue L3;
                        } else {
                          var5++;
                          var10 = md.a((CharSequence) (Object) var9, param2 ^ -9157);
                          StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$5 = var6.append(param1[var10]);
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(pd param0, pd param1, int param2, int param3, int param4, int param5) {
        wk.field_G = param4;
        no.field_Gb = param3;
        al.field_bb = param5;
        mc.field_a = param0;
        en.field_d = param1;
        if (param2 <= 43) {
            Object var7 = null;
            vl.a((pd) null, (pd) null, -67, -110, -57, -56);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = null;
        }
        field_j = null;
        field_k = null;
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -103) {
            field_h = -19;
        }
        int var2 = param0 >>> 821628865;
        var2 = var2 | var2 >>> 1488112865;
        var2 = var2 | var2 >>> -631341566;
        var2 = var2 | var2 >>> 1232304548;
        var2 = var2 | var2 >>> -1195661720;
        var2 = var2 | var2 >>> 2078424912;
        return param0 & (var2 ^ -1);
    }

    private vl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"By rating", "By win percentage"};
    }
}
