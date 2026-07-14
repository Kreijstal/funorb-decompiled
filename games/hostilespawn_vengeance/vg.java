/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static bd field_d;
    static String field_f;
    static String field_g;
    static ji field_h;
    static pg field_c;
    static int[] field_a;
    static String field_b;
    static v[] field_e;

    final static boolean a(boolean param0, String param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() < eb.field_a) {
              break L0;
            } else {
              if (param1.length() <= vd.field_D) {
                if (param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 2) {
            Object var2 = null;
            String discarded$0 = vg.a((String[]) null, 105, (String) null);
        }
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_h = null;
        field_d = null;
    }

    final static String a(String[] args, int param1, String param2) {
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
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          var3 = param2.length();
          if (param1 > 12) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        var4 = var3;
        var5 = 0;
        L1: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if (0 <= var6_int) {
            var5 = var6_int + 2;
            L2: while (true) {
              L3: {
                if (var5 >= var3) {
                  break L3;
                } else {
                  if (!qh.a(param2.charAt(var5), -49)) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              var7_ref = param2.substring(2 + var6_int, var5);
              if (!sf.a((byte) 95, (CharSequence) (Object) var7_ref)) {
                continue L1;
              } else {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (62 != param2.charAt(var5)) {
                    continue L1;
                  } else {
                    var5++;
                    var8 = hi.a(-110, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (var6_int + -var5 + args[var8].length());
                    continue L1;
                  }
                }
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L4: while (true) {
              var8 = param2.indexOf("<%", var5);
              if (var8 >= 0) {
                var5 = var8 + 2;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!qh.a(param2.charAt(var5), -49)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param2.substring(var8 + 2, var5);
                  if (sf.a((byte) 80, (CharSequence) (Object) var9)) {
                    if (var3 <= var5) {
                      continue L4;
                    } else {
                      if (62 != param2.charAt(var5)) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = hi.a(-29, (CharSequence) (Object) var9);
                        StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$4 = var6.append(args[var10]);
                        continue L4;
                      }
                    }
                  } else {
                    continue L4;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param2.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Player";
        field_b = "Head to the bridge to download the mission data disc.";
        field_f = "Player names can be up to 12 letters, numbers and underscores";
    }
}
