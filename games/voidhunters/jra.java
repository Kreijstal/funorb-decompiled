/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jra {
    static boolean[] field_d;
    static int field_c;
    static String field_b;
    static tpa field_a;

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        CharSequence var9 = null;
        if (ola.field_p == null) {
          if (param2 == 19717) {
            return;
          } else {
            jra.a(-70, false, 63);
            return;
          }
        } else {
          var3 = ola.field_p.a(0, param1);
          if (0 != var3) {
            if (var3 == 2) {
              if (ola.field_p.field_R == null) {
                rc.field_b = -1;
                ola.field_p = null;
                if (param2 == 19717) {
                  return;
                } else {
                  jra.a(-70, false, 63);
                  return;
                }
              } else {
                if (ola.field_p.field_R.equals((Object) (Object) "")) {
                  rc.field_b = -1;
                  ola.field_p = null;
                  if (param2 == 19717) {
                    return;
                  } else {
                    jra.a(-70, false, 63);
                    return;
                  }
                } else {
                  L0: {
                    if (91 == ola.field_p.field_R.charAt(0)) {
                      var4 = ola.field_p.field_R;
                      break L0;
                    } else {
                      var9 = (CharSequence) (Object) ola.field_p.field_R;
                      var4 = jwa.a(false, var9);
                      break L0;
                    }
                  }
                  L1: {
                    var5 = null;
                    if (0 == rc.field_b) {
                      var5 = (Object) (Object) ukb.a(var4, param0, param2 + -10115);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (rc.field_b != 1) {
                      break L2;
                    } else {
                      var5 = (Object) (Object) npa.a((byte) 90, var4, param0);
                      break L2;
                    }
                  }
                  L3: {
                    if (2 != rc.field_b) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) tba.a(2, var4, param0);
                      break L3;
                    }
                  }
                  L4: {
                    if (rc.field_b != 3) {
                      break L4;
                    } else {
                      int discarded$2 = -76;
                      var5 = (Object) (Object) iab.a(param0, var4, var4);
                      break L4;
                    }
                  }
                  if (var5 == null) {
                    rc.field_b = -1;
                    ola.field_p = null;
                    if (param2 == 19717) {
                      return;
                    } else {
                      jra.a(-70, false, 63);
                      return;
                    }
                  } else {
                    int discarded$3 = 2;
                    lh.a((byte) -86, 0, (String) null, var4, (String) var5);
                    rc.field_b = -1;
                    ola.field_p = null;
                    if (param2 == 19717) {
                      return;
                    } else {
                      jra.a(-70, false, 63);
                      return;
                    }
                  }
                }
              }
            } else {
              rc.field_b = -1;
              ola.field_p = null;
              if (param2 == 19717) {
                return;
              } else {
                jra.a(-70, false, 63);
                return;
              }
            }
          } else {
            if (param2 == 19717) {
              return;
            } else {
              jra.a(-70, false, 63);
              return;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 89;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = 100;
    }
}
