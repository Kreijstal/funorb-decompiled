/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3) {
            field_a = 42;
        }
    }

    final static void b(int param0) {
        if ((p.field_b ^ -1) != param0) {
            // ifeq L20
        } else {
            tb.d(7);
            p.field_b = 11;
        }
        dd.field_a = true;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((param3 ^ -1) > -3) {
            break L0;
          } else {
            if ((param3 ^ -1) >= -37) {
              L1: {
                var4 = 0;
                if (param1 <= -38) {
                  break L1;
                } else {
                  er.b(-89);
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (0 == var8) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param0) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param3) {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var9 + param3 * var6;
                    if (var10 / param3 != var6) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final static void a(byte param0) {
        int var1 = -52 % ((param0 - -85) / 37);
        if (!(null == rl.field_C)) {
            rl.field_C.k(0);
        }
        if (pq.field_a != null) {
            pq.field_a.i((byte) 2);
        }
        qh.a((byte) 124);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
