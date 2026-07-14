/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ng {
    static byte[] field_b;
    static String field_c;
    static ok field_g;
    static int field_e;
    static String field_a;
    static String field_f;
    static int field_d;

    final static so a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        so var9_ref = null;
        so var9 = (so) (Object) fk.field_n.g(75);
        if (!(var9 != null)) {
            var9_ref = new so();
        }
        var9_ref.a(param3, param4, param5, param7, param6, param8, param0, false, param2);
        int var10 = -109 % ((-78 - param1) / 44);
        return var9_ref;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param3 < 2) {
            break L0;
          } else {
            if (param3 <= 36) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              if (param0 == -49) {
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (var8 == 0) {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        } else {
                          var4 = 1;
                          var8++;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 > 57) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 > 122) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      return false;
                    }
                    if (param3 > var9) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var9 + param3 * var6;
                      if (var10 / param3 != var6) {
                        return false;
                      } else {
                        var5 = 1;
                        var6 = var10;
                        var8++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.b(param1, param3, param2 + param0, 10000536);
        oo.b(param1, param4 + param3, 1 + param2, 12105912);
        int var5 = 1;
        if (var5 + param3 < oo.field_e) {
            var5 = oo.field_e + -param3;
        }
        int var6 = param4;
        if (!(oo.field_d >= param3 - -var6)) {
            var6 = -param3 + oo.field_d;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = var7 * 48 / param4 + 152;
            var9 = var8 | (var8 << 555333552 | var8 << 764982632);
            oo.field_i[oo.field_b * (param3 + var7) - -param1] = var9;
            oo.field_i[(param3 + var7) * oo.field_b - (-param1 + -param2)] = var9;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (param0 != 816) {
            field_f = null;
        }
    }

    abstract be a(byte param0);

    final static String a(String param0, String param1, int param2, int param3) {
        CharSequence var8 = (CharSequence) (Object) param0;
        if (!(em.a(var8, (byte) -38))) {
            return u.field_f;
        }
        if (!((ge.field_zb ^ -1) == -3)) {
            return id.field_A;
        }
        ml var7 = md.a((byte) 90, param1);
        if (!(var7 != null)) {
            return vl.a(mf.field_a, new String[1], 2);
        }
        var7.a(true);
        var7.a(-4564);
        fn.field_d = fn.field_d - 1;
        if (param2 > -21) {
            ng.a(-125);
        }
        ga var5 = ma.field_a;
        var5.b((byte) -35, param3);
        var5.field_j = var5.field_j + 1;
        int var6 = var5.field_j;
        var5.a(113, 3);
        var5.a(param0, (byte) 105);
        var5.e(89, -var6 + var5.field_j);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
        field_e = 320;
        field_c = "Prepare to run...";
    }
}
