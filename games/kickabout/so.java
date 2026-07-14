/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static int field_e;
    static ut[] field_d;
    static int[][] field_f;
    static int field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (param2) {
          if (param1) {
            if (2 != param0) {
              if (-4 == (param0 ^ -1)) {
                if (!param3) {
                  gu.b(2, (byte) 60, vc.field_E[5]);
                  return;
                } else {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!param3) {
                gu.b(2, (byte) 60, vc.field_E[5]);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ui.a(2, 5, vc.field_E[4], 2147483647);
                if (-4 == (param0 ^ -1)) {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          so.a(44, true, true, false);
          if (param1) {
            if (2 == param0) {
              if (!param3) {
                gu.b(2, (byte) 60, vc.field_E[5]);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ui.a(2, 5, vc.field_E[4], 2147483647);
                if (-4 == (param0 ^ -1)) {
                  if (param3) {
                    ui.a(2, 7, vc.field_E[4], 2147483647);
                    return;
                  } else {
                    gu.b(2, (byte) 60, vc.field_E[5]);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (-4 == (param0 ^ -1)) {
                if (param3) {
                  ui.a(2, 7, vc.field_E[4], 2147483647);
                  return;
                } else {
                  gu.b(2, (byte) 60, vc.field_E[5]);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(sj param0, boolean param1, sj param2, sj param3) {
        Object var5 = null;
        if (param0.d(-38)) {
          if (param0.a(false, "commonui")) {
            if (!param2.d(-57)) {
              return false;
            } else {
              if (param2.a(false, "commonui")) {
                L0: {
                  if (!param3.d(-124)) {
                    break L0;
                  } else {
                    if (!param3.a(false, "button.gif")) {
                      break L0;
                    } else {
                      if (param1) {
                        return true;
                      } else {
                        var5 = null;
                        boolean discarded$1 = so.a((sj) null, true, (sj) null, (sj) null);
                        return true;
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
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -113) {
          var2 = null;
          boolean discarded$2 = so.a((sj) null, false, (sj) null, (sj) null);
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static java.applet.Applet a(int param0) {
        if (!(null == qs.field_M)) {
            return qs.field_M;
        }
        int var1 = -80 / ((-28 - param0) / 43);
        return (java.applet.Applet) (Object) ap.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_c = "Create your own free Jagex account";
        field_a = "Spend";
    }
}
