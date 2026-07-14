/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    private String field_d;
    private boolean field_b;
    private boolean field_c;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            Object var2 = null;
            String discarded$0 = fo.a(70, (String) null, (String[]) null);
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            field_a = null;
        }
        return ((fo) this).field_d;
    }

    final boolean a(int param0) {
        if (param0 <= 8) {
            fo.a(true);
        }
        return ((fo) this).field_c;
    }

    final static String a(int param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!mu.a(28799, param1.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param1.substring(2 + var6_int, var5);
              if (vv.a(param0 ^ -4846, (CharSequence) (Object) var7_ref)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param1.charAt(var5) == 62) {
                    var5++;
                    var8 = dq.a(param0 ^ 4761, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param2[var8].length() - (var5 + -var6_int));
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
            L3: {
              var6 = new StringBuilder(var4);
              var5 = 0;
              if (param0 == 4800) {
                break L3;
              } else {
                field_a = null;
                break L3;
              }
            }
            var7 = 0;
            L4: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (-1 < (var8 ^ -1)) {
                StringBuilder discarded$3 = var6.append(param1.substring(var7));
                return var6.toString();
              } else {
                var5 = 2 + var8;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!mu.a(param0 ^ 25279, param1.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param1.substring(var8 - -2, var5);
                  if (!vv.a(-110, (CharSequence) (Object) var9)) {
                    continue L4;
                  } else {
                    if (var3 <= var5) {
                      continue L4;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = dq.a(90, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        ((fo) this).field_b = param1 ? true : false;
        ((fo) this).field_c = param0 ? true : false;
    }

    final boolean a(byte param0) {
        int var2 = 91 / ((param0 - 67) / 48);
        return ((fo) this).field_b;
    }

    fo(String param0) {
        ((fo) this).field_c = false;
        ((fo) this).field_b = false;
        ((fo) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Can't reach";
    }
}
