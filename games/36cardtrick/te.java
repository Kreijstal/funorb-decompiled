/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    static String field_b;
    static int field_a;

    final static kc a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Main.field_T;
        kc var6 = new kc(param0, param0);
        kc var3 = var6;
        if (param1 >= -123) {
            return null;
        }
        for (var4 = 0; var4 < var3.field_r.length; var4++) {
            var6.field_r[var4] = param2;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 87) {
            kc discarded$0 = te.a(64, 51, -77);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0, String param1) {
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = te.a(false, (String) null);
        }
        if (param1 != null) {
            if (param1.length() >= lg.field_k) {
                if (param1.length() <= jd.field_g) {
                    return false;
                }
            }
        }
        return true;
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Main.field_T;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if ((param0 ^ -1) < -37) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (param1 > 62) {
                    return var5 != 0;
                  } else {
                    return true;
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L2;
                        } else {
                          if (!param3) {
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
                    }
                  }
                  L3: {
                    L4: {
                      if (48 > var9) {
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
                    if (97 > var9) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 < param0) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = var9 + var6 * param0;
                    if (var10 / param0 != var6) {
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
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your email address again to make sure it's correct";
    }
}
