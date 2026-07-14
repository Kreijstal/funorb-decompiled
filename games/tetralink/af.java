/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static long field_f;
    static un field_g;
    static int field_h;
    static String field_b;
    static kc field_c;
    static int[] field_e;
    static String field_d;
    static int[] field_a;
    static String field_i;

    final static String a(byte param0, int param1, String param2) {
        if (1 != param1) {
          if (param1 != -3) {
            if (-4 != param1) {
              if (param1 != 4) {
                if (param1 == 5) {
                  return sk.a(new String[1], sn.field_f, 120);
                } else {
                  if (param1 != 6) {
                    if (-8 == param1) {
                      return sk.a(new String[1], hm.field_c, 119);
                    } else {
                      if (-9 == param1) {
                        return sk.a(new String[1], field_i, 121);
                      } else {
                        if (param0 >= 95) {
                          if (param1 == 11) {
                            return sk.a(new String[1], pm.field_d, 123);
                          } else {
                            if (param1 != 12) {
                              if (param1 == 13) {
                                return sk.a(new String[1], hb.field_e, 120);
                              } else {
                                return null;
                              }
                            } else {
                              return sk.a(new String[1], im.field_a, 126);
                            }
                          }
                        } else {
                          af.b(-15);
                          if (param1 == 11) {
                            return sk.a(new String[1], pm.field_d, 123);
                          } else {
                            if (param1 != 12) {
                              if (param1 == 13) {
                                return sk.a(new String[1], hb.field_e, 120);
                              } else {
                                return null;
                              }
                            } else {
                              return sk.a(new String[1], im.field_a, 126);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return sk.a(new String[1], eo.field_d, 124);
                  }
                }
              } else {
                return sk.a(new String[1], jg.field_d, 125);
              }
            } else {
              return sk.a(new String[1], hd.field_z, 124);
            }
          } else {
            return sk.a(new String[1], mi.field_Mb, 127);
          }
        } else {
          return sk.a(new String[1], kd.field_k, 121);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static v a(int param0, byte param1, int param2, int param3) {
        v var4 = null;
        v var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var4 = (v) (Object) tc.field_p.c(false);
        var5 = 90 / ((-53 - param1) / 40);
        L0: while (true) {
          if (var4 != null) {
            if (param0 != var4_ref.field_n) {
              var4 = (v) (Object) tc.field_p.a((byte) -70);
              continue L0;
            } else {
              return var4_ref;
            }
          } else {
            var4_ref = new v();
            var4_ref.field_n = param0;
            var4_ref.field_q = param3;
            tc.field_p.a((mc) (Object) var4_ref, false);
            fd.a(-68, param2, var4_ref);
            return var4_ref;
          }
        }
    }

    final static void b(int param0) {
        oh var1 = null;
        oh var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var1 = new oh(540, 140);
        sk.a((byte) 110, var1);
        vn.b();
        ra.a();
        en.field_K = 0;
        ni.a((byte) 71);
        var2 = var1.d();
        var3 = 0;
        L0: while (true) {
          if (-16 >= (var3 ^ -1)) {
            oi.field_e.c();
            var1.d(0, 0);
            if (param0 != 18428) {
              field_d = null;
              dh.a(-581);
              return;
            } else {
              dh.a(-581);
              return;
            }
          } else {
            var2.c(-2, -2, 16777215);
            ra.a(4, 4, 0, 0, 540, 140);
            var3++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_i = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_e = null;
        if (param0 > -70) {
            af.a(6);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Reject";
        field_i = "<%0> has declined the invitation.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_a = new int[]{1, 1, 1, 1, 2, 1, 1, 2};
        field_e = new int[128];
    }
}
