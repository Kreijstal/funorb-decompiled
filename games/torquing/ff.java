/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static t field_c;
    static boolean field_a;
    static int field_b;

    final static String a(String[] args, int param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        var3 = param2.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  break L2;
                } else {
                  if (!ui.a(-112, param2.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!ip.a((byte) -109, (CharSequence) (Object) var7_ref_String)) {
                continue L0;
              } else {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param2.charAt(var5) == 62) {
                    var5++;
                    var8 = kc.a((byte) -94, (CharSequence) (Object) var7_ref_String);
                    var4 = var4 + (-var5 - -var6_int + args[var8].length());
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = param1;
            var5 = 0;
            L3: while (true) {
              var8 = param2.indexOf("<%", var5);
              if ((var8 ^ -1) > -1) {
                StringBuilder discarded$3 = var6.append(param2.substring(var7));
                return var6.toString();
              } else {
                var5 = 2 + var8;
                L4: while (true) {
                  L5: {
                    if (var5 >= var3) {
                      break L5;
                    } else {
                      if (!ui.a(57, param2.charAt(var5))) {
                        break L5;
                      } else {
                        var5++;
                        continue L4;
                      }
                    }
                  }
                  var9 = param2.substring(2 + var8, var5);
                  if (ip.a((byte) -101, (CharSequence) (Object) var9)) {
                    if (var3 <= var5) {
                      continue L3;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L3;
                      } else {
                        var5++;
                        var10 = kc.a((byte) -67, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param2.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(args[var10]);
                        var7 = var5;
                        continue L3;
                      }
                    }
                  } else {
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, char param1, boolean param2) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (!param2) {
            return null;
        }
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -44) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new t(270, 70);
    }
}
