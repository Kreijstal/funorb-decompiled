/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends js {
    static hd field_i;
    static int field_j;
    static int field_g;
    static String field_k;
    private int field_h;
    static hd[] field_m;
    static int field_l;

    final void a(int param0, boolean param1, int param2, js param3) {
        ((kt) this).field_h = param1 ? param0 : -param0 + 256;
        if (param2 >= -28) {
            field_g = 88;
        }
    }

    final static void b(byte param0) {
        cd.a((byte) -128, g.field_a.field_J, 15);
        if (param0 != -85) {
            field_j = 82;
        }
    }

    final static int a(CharSequence param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Kickabout.field_G;
          if (param3 < 2) {
            break L0;
          } else {
            if ((param3 ^ -1) < -37) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var8 = 37 % ((param2 - 73) / 47);
              var7 = param0.length();
              var9 = 0;
              L1: while (true) {
                if (var9 >= var7) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L2: {
                    var10 = param0.charAt(var9);
                    if (-1 == (var9 ^ -1)) {
                      if (var10 == 45) {
                        var4 = 1;
                        var9++;
                        continue L1;
                      } else {
                        if (var10 != 43) {
                          break L2;
                        } else {
                          if (!param1) {
                            break L2;
                          } else {
                            var9++;
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
                      if (var10 < 48) {
                        break L4;
                      } else {
                        if (57 < var10) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (90 < var10) {
                          break L5;
                        } else {
                          var10 -= 55;
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (var10 < 97) {
                        break L6;
                      } else {
                        if (var10 <= 122) {
                          var10 -= 87;
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var10 < param3) {
                    L7: {
                      if (var4 != 0) {
                        var10 = -var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = var10 + param3 * var6;
                    if (var6 != var11 / param3) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var11;
                      var5 = 1;
                      var9++;
                      continue L1;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final static kw a(boolean param0, String param1) {
        if (lc.field_e.a((byte) -80)) {
            if (!(param1.equals((Object) (Object) lc.field_e.a(3)))) {
                lc.field_e = su.a(-3505, param1);
            }
        }
        if (param0) {
            field_i = null;
        }
        return lc.field_e;
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 >= -5) {
            return false;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 <= 123) {
            Object var2 = null;
            String discarded$0 = kt.a((byte[]) null, false);
        }
        field_k = null;
        field_m = null;
        field_i = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 124 / ((38 - param0) / 60);
    }

    final void a(int param0, boolean param1) {
        if (-257 != (((kt) this).field_h ^ -1)) {
            on.a(0, 0, 640, 480, 0, ((kt) this).field_h);
        } else {
            on.b();
        }
        if (param0 != -5) {
            field_m = null;
        }
    }

    final static String a(byte[] param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return hf.a((byte) -127, param0.length, 0, param0);
    }

    kt() {
        super(-3);
        ((kt) this).field_h = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
        field_k = "You must play 1 more rated game before playing with the current options.";
    }
}
