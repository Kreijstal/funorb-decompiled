/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static java.applet.Applet field_b;
    static char[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 117) {
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = HoldTheLine.field_D;
          if (param0 < 2) {
            break L0;
          } else {
            if (36 < param0) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              if (param3 == 106) {
                var6 = 0;
                var7 = param1.length();
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param1.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
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
                          if (90 >= var9) {
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
                    if (param0 > var9) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = param0 * var6 + var9;
                      if (var6 != var10 / param0) {
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
                return false;
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (!(ra.a(param0, false, param2))) {
            return false;
        }
        for (var3 = param1; var3 < param0.length(); var3++) {
            if (!vb.a(332243496, param0.charAt(var3))) {
                return false;
            }
        }
        return true;
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        ej var5 = null;
        if (param1 == null) {
            return null;
        }
        if (param0 != 90) {
            Object var4 = null;
            byte[] discarded$0 = ne.a(24, (Object) null, true);
        }
        if (!(!(param1 instanceof byte[]))) {
            var3 = (byte[]) param1;
            if (param2) {
                return sj.a(var3, (byte) -69);
            }
            return var3;
        }
        if (!(!(param1 instanceof ej))) {
            var5 = (ej) param1;
            return var5.a(62);
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
