/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static am field_c;
    static String field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static int field_a;
    static kc field_d;

    final static void a(boolean param0) {
        hi.a(-123, param0);
        ob.field_Y.b(480, 8110, 640);
        ob.field_Y.a((byte) -119, 1024, 1280);
        dh.a(rl.field_h, 9, 6);
        dh.a(me.field_H, 9, 8);
        if (!ArcanistsMulti.i((byte) -77)) {
            dh.a(gh.field_l, 9, 1);
            dh.a(ql.field_b, 9, 2);
            dh.a(eg.field_g, 9, 4);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ab var3 = null;
        var3 = he.field_e;
        var3.b((byte) -38, param2);
        if (param0) {
          field_e = 51;
          var3.f(3, (byte) -22);
          var3.f(9, (byte) -98);
          var3.c(param1, (byte) -60);
          return;
        } else {
          var3.f(3, (byte) -22);
          var3.f(9, (byte) -98);
          var3.c(param1, (byte) -60);
          return;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2 != null) {
          var3 = param2.length();
          if (-2 >= (var3 ^ -1)) {
            if (var3 <= 12) {
              if (param0 == 640) {
                var4 = gk.a(param2, param0 + -653);
                if (var4 == null) {
                  return false;
                } else {
                  if (-2 >= (var4.length() ^ -1)) {
                    L0: {
                      if (rk.a((byte) 127, var4.charAt(0))) {
                        break L0;
                      } else {
                        if (rk.a((byte) 121, var4.charAt(-1 + var4.length()))) {
                          break L0;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param2.length() <= var6) {
                              if (var5 <= 0) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L2: {
                                var7 = param2.charAt(var6);
                                if (!rk.a((byte) -63, (char) var7)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                field_c = null;
                var4 = gk.a(param2, param0 + -653);
                if (var4 == null) {
                  return false;
                } else {
                  if (-2 >= (var4.length() ^ -1)) {
                    L3: {
                      if (rk.a((byte) 127, var4.charAt(0))) {
                        break L3;
                      } else {
                        if (rk.a((byte) 121, var4.charAt(-1 + var4.length()))) {
                          break L3;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L4: while (true) {
                            if (param2.length() <= var6) {
                              if (var5 <= 0) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L5: {
                                var7 = param2.charAt(var6);
                                if (!rk.a((byte) -63, (char) var7)) {
                                  var5 = 0;
                                  break L5;
                                } else {
                                  var5++;
                                  break L5;
                                }
                              }
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                var6++;
                                continue L4;
                              } else {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
        int var1 = -113 / ((param0 - -9) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new am();
        field_e = 250;
        field_g = "<%0> has resigned and left.";
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_f = "Reject";
    }
}
