/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_b;
    static String field_a;

    final static void a(int param0, int param1, se param2) {
        pk var6 = null;
        int var4 = 0;
        try {
            var6 = fj.field_q;
            var6.a(param0, (byte) -63);
            var6.field_f = var6.field_f + 1;
            if (param1 != 86) {
                Object var5 = null;
                tj.a(-12, 107, (se) null);
            }
            var4 = var6.field_f;
            var6.d((byte) 127, 1);
            var6.d((byte) 124, param2.field_g);
            var6.c(param2.field_j, param1 + -6048);
            var6.c((byte) 95, param2.field_k);
            var6.c((byte) 95, param2.field_h);
            var6.c((byte) 95, param2.field_l);
            var6.c((byte) 95, param2.field_f);
            int discarded$0 = var6.d(104, var4);
            var6.f(11700, -var4 + var6.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "tj.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b() {
        String var1 = null;
        if (cf.field_i) {
          if (Geoblox.field_y != null) {
            Geoblox.field_y.h((byte) -104);
            var1 = ml.c(7789);
            ml.field_t = new pf(var1, (String) null, true, false, false);
            kd.field_e.a(false, (el) (Object) hk.field_C);
            hk.field_C.b((el) (Object) ml.field_t, -85);
            hk.field_C.b(true);
            return;
          } else {
            var1 = ml.c(7789);
            ml.field_t = new pf(var1, (String) null, true, false, false);
            kd.field_e.a(false, (el) (Object) hk.field_C);
            hk.field_C.b((el) (Object) ml.field_t, -85);
            hk.field_C.b(true);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void a(int param0) {
        if (param0 < 1) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void c() {
        ff.field_a = null;
        int var1 = 1;
        hh.field_a = null;
    }

    final static int a() {
        if (mi.field_C < 2) {
          return 0;
        } else {
          if (va.field_a != 0) {
            if (dd.field_J != null) {
              if (!dd.field_J.a(0)) {
                return 14;
              } else {
                if (dd.field_J.b((byte) -115, "")) {
                  if (dd.field_J.a("", (byte) -124)) {
                    if (l.field_h.a(0)) {
                      if (!l.field_h.a("commonui", (byte) -125)) {
                        return 57;
                      } else {
                        if (!dc.field_c.a(0)) {
                          return 71;
                        } else {
                          if (!dc.field_c.a("commonui", (byte) -128)) {
                            return 80;
                          } else {
                            if (hb.field_n.a(0)) {
                              if (!hb.field_n.b(true)) {
                                return 86;
                              } else {
                                return 100;
                              }
                            } else {
                              return 82;
                            }
                          }
                        }
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 29;
                }
              }
            } else {
              if (l.field_h.a(0)) {
                if (!l.field_h.a("commonui", (byte) -125)) {
                  return 57;
                } else {
                  if (!dc.field_c.a(0)) {
                    return 71;
                  } else {
                    if (!dc.field_c.a("commonui", (byte) -128)) {
                      return 80;
                    } else {
                      if (hb.field_n.a(0)) {
                        if (!hb.field_n.b(true)) {
                          return 86;
                        } else {
                          return 100;
                        }
                      } else {
                        return 82;
                      }
                    }
                  }
                }
              } else {
                return 43;
              }
            }
          } else {
            if (l.field_h.a(0)) {
              if (l.field_h.a("commonui", (byte) -127)) {
                if (!dc.field_c.a(0)) {
                  return 50;
                } else {
                  if (!dc.field_c.a("commonui", (byte) -127)) {
                    return 60;
                  } else {
                    if (!hb.field_n.a(0)) {
                      return 70;
                    } else {
                      if (hb.field_n.b(true)) {
                        return 100;
                      } else {
                        return 80;
                      }
                    }
                  }
                }
              } else {
                return 40;
              }
            } else {
              return 20;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Level's<br>last geoblox";
    }
}
