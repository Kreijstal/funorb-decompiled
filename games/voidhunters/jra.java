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
        String var5 = null;
        Object var6 = null;
        CharSequence var11 = null;
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
                      var5 = var4;
                      var5 = var4;
                      break L0;
                    } else {
                      var11 = (CharSequence) (Object) ola.field_p.field_R;
                      var4 = jwa.a(false, var11);
                      break L0;
                    }
                  }
                  L1: {
                    var5 = null;
                    if (0 == rc.field_b) {
                      var5 = ukb.a(var4, param0, param2 + -10115);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if ((rc.field_b ^ -1) != -2) {
                      break L2;
                    } else {
                      var5 = npa.a((byte) 90, var4, param0);
                      break L2;
                    }
                  }
                  L3: {
                    if (2 != rc.field_b) {
                      break L3;
                    } else {
                      var5 = tba.a(2, var4, param0);
                      break L3;
                    }
                  }
                  L4: {
                    if (rc.field_b != 3) {
                      break L4;
                    } else {
                      var5 = iab.a(param0, var4, var4, (byte) -76);
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
                    var6 = null;
                    lh.a((byte) -86, 0, (String) null, var4, var5, 2);
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

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 89 / ((-64 - param0) / 54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = 100;
    }
}
