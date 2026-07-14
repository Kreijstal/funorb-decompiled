/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static vj field_a;

    final static void a(int param0, int param1) {
        int discarded$4 = wi.b(-1);
        if (param1 != 1) {
            Object var3 = null;
            ui.a((ec) null, (byte) 78, 8, (vj) null);
        }
    }

    public static void a(int param0) {
        if (param0 != -19662) {
            return;
        }
        field_a = null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != null) {
          if (param2 == -3) {
            var3 = param1.length();
            if (1 <= var3) {
              if (var3 <= 12) {
                var10 = rh.a(param2 + -111, param1);
                if (var10 != null) {
                  if (1 <= var10.length()) {
                    if (!je.a(var10.charAt(0), param2 + 116)) {
                      if (!je.a(var10.charAt(-1 + var10.length()), param2 + 103)) {
                        var5 = 0;
                        var6 = 0;
                        L0: while (true) {
                          if (param1.length() <= var6) {
                            if ((var5 ^ -1) < -1) {
                              return vd.field_a;
                            } else {
                              return null;
                            }
                          } else {
                            L1: {
                              var7 = param1.charAt(var6);
                              if (!je.a((char) var7, param2 ^ -126)) {
                                var5 = 0;
                                break L1;
                              } else {
                                var5++;
                                break L1;
                              }
                            }
                            if (-3 < (var5 ^ -1)) {
                              var6++;
                              var6++;
                              continue L0;
                            } else {
                              if (!param0) {
                                return pi.field_R;
                              } else {
                                var6++;
                                continue L0;
                              }
                            }
                          }
                        }
                      } else {
                        return vd.field_a;
                      }
                    } else {
                      return vd.field_a;
                    }
                  } else {
                    return p.field_b;
                  }
                } else {
                  return p.field_b;
                }
              } else {
                return p.field_b;
              }
            } else {
              return p.field_b;
            }
          } else {
            ui.a(116, 53);
            var3 = param1.length();
            if (1 <= var3) {
              if (var3 <= 12) {
                var9 = rh.a(param2 + -111, param1);
                if (var9 != null) {
                  if (1 <= var9.length()) {
                    if (!je.a(var9.charAt(0), param2 + 116)) {
                      if (!je.a(var9.charAt(-1 + var9.length()), param2 + 103)) {
                        var5 = 0;
                        var6 = 0;
                        L2: while (true) {
                          if (param1.length() <= var6) {
                            if ((var5 ^ -1) < -1) {
                              return vd.field_a;
                            } else {
                              return null;
                            }
                          } else {
                            L3: {
                              var7 = param1.charAt(var6);
                              if (!je.a((char) var7, param2 ^ -126)) {
                                var5 = 0;
                                break L3;
                              } else {
                                var5++;
                                break L3;
                              }
                            }
                            if (-3 < (var5 ^ -1)) {
                              var6++;
                              var6++;
                              continue L2;
                            } else {
                              if (!param0) {
                                return pi.field_R;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      } else {
                        return vd.field_a;
                      }
                    } else {
                      return vd.field_a;
                    }
                  } else {
                    return p.field_b;
                  }
                } else {
                  return p.field_b;
                }
              } else {
                return p.field_b;
              }
            } else {
              return p.field_b;
            }
          }
        } else {
          return p.field_b;
        }
    }

    final static void a(ec param0, byte param1, int param2, vj param3) {
        wk.field_i = pk.d((byte) 9) * param2 / 1000;
        c.a(false, param3);
        int var4 = 17 / ((28 - param1) / 32);
        vg.a(param3, false);
        ea.a(0, param3);
        cf.a(false);
        s.b((byte) 104);
        vb.field_n = -wk.field_i + 0;
    }

    static {
    }
}
