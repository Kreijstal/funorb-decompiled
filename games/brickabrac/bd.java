/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd implements ub {
    static String field_a;
    static al field_b;

    final static void a(int param0, boolean param1) {
        if (!param1) {
            bd.a(-34, 70);
            ch.field_b = param0;
            return;
        }
        ch.field_b = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, sp param2) {
        tm.field_f.a((nm) (Object) param2, (byte) 3);
        if (param1 != 25) {
          bd.a(20, false);
          ke.a(param0, param2, param1 + 14964);
          return;
        } else {
          ke.a(param0, param2, param1 + 14964);
          return;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (param0 != null) {
          var3 = param0.length();
          if (var3 <= -2) {
            if (-13 >= var3) {
              L0: {
                var4 = gb.a(param0, 67);
                if (var4 == null) {
                  break L0;
                } else {
                  if (-2 < (var4.length() ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if (ik.a((byte) -9, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (ik.a((byte) -9, var4.charAt(var4.length() - 1))) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = param1;
                          L2: while (true) {
                            if (param0.length() <= var6) {
                              if ((var5 ^ -1) < -1) {
                                return false;
                              } else {
                                return true;
                              }
                            } else {
                              L3: {
                                var7 = param0.charAt(var6);
                                if (!ik.a((byte) -9, (char) var7)) {
                                  var5 = 0;
                                  break L3;
                                } else {
                                  var5++;
                                  break L3;
                                }
                              }
                              if (var5 < 2) {
                                var6++;
                                var6++;
                                continue L2;
                              } else {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              return false;
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

    final static jp[] a(String param0, String param1, mf param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(param0, false);
        if (param3 != -8) {
          return null;
        } else {
          var5 = param2.a(var4, -46, param1);
          return qa.a(var5, var4, param2, true);
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        jp var9 = null;
        jp var10 = null;
        var6 = param3.field_o + param2;
        var7 = param3.field_w + param4;
        if (param1 == -20618) {
          ig.b(param3.field_s, var6, param3.field_t, var7, -17634);
          var10 = df.field_a[1];
          if (param3 instanceof d) {
            if (!((d) (Object) param3).field_F) {
              L0: {
                if (param3.f(param1 ^ 20732)) {
                  hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.f((-var10.field_x + param3.field_t >> 796310721) + 1 + var6, (-var10.field_z + param3.field_s >> -857502239) + 1 + var7, 256);
                if (param3.f(param1 ^ 20732)) {
                  hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param3.f(param1 ^ 20732)) {
                hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_a = null;
          ig.b(param3.field_s, var6, param3.field_t, var7, -17634);
          var9 = df.field_a[1];
          if (param3 instanceof d) {
            if (!((d) (Object) param3).field_F) {
              L3: {
                if (param3.f(param1 ^ 20732)) {
                  hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var9.f((-var9.field_x + param3.field_t >> 796310721) + 1 + var6, (-var9.field_z + param3.field_s >> -857502239) + 1 + var7, 256);
                if (param3.f(param1 ^ 20732)) {
                  hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param3.f(param1 ^ 20732)) {
                hj.a(var7 - -2, var6 - -2, 124, -4 + param3.field_s, -4 + param3.field_t);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        pi var2 = null;
        var2 = k.field_h;
        var2.e(-13413, param0);
        var2.a(-119, 1);
        var2.a(-127, 0);
        if (param1 < 63) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create a free Account";
    }
}
