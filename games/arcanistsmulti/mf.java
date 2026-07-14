/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_g;
    static int[] field_b;
    static kc field_d;
    static int field_c;
    static String field_f;
    static String field_e;
    static int field_a;
    static String field_h;

    final static wa a(int param0, String param1) {
        String var2 = null;
        Object var3 = null;
        wa var3_ref = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var3 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (uc.field_c != null) {
          L0: {
            var8 = (CharSequence) (Object) param1;
            var2 = gk.a(var8, -13);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var8;
              break L0;
            }
          }
          if (param0 == -1) {
            var3_ref = (wa) (Object) uc.field_c.a((long)var2.hashCode(), (byte) -64);
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var9 = (CharSequence) (Object) var3_ref.field_Cb;
                  var4 = gk.a(var9, param0 + -12);
                  if (var4 == null) {
                    var4 = var3_ref.field_Cb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (wa) (Object) uc.field_c.d(param0 ^ 82);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            var6 = null;
            wa discarded$1 = mf.a(-34, (String) null);
            var3_ref = (wa) (Object) uc.field_c.a((long)var2.hashCode(), (byte) -64);
            L3: while (true) {
              if (var3_ref != null) {
                L4: {
                  var10 = (CharSequence) (Object) var3_ref.field_Cb;
                  var4 = gk.a(var10, param0 + -12);
                  if (var4 == null) {
                    var4 = var3_ref.field_Cb;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3_ref;
                } else {
                  var3_ref = (wa) (Object) uc.field_c.d(param0 ^ 82);
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        fk var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        si.field_l = param0;
        var2 = (fk) (Object) qn.field_mb.b(12623);
        L0: while (true) {
          if (var2 == null) {
            if (param1 == 21298) {
              if (null == he.field_f) {
                return;
              } else {
                var2 = (fk) (Object) he.field_f.b(12623);
                L1: while (true) {
                  if (var2 == null) {
                    return;
                  } else {
                    L2: {
                      if (!var2.field_n.b((byte) -36)) {
                        var2.a(true);
                        break L2;
                      } else {
                        var2.field_m.c(var2.field_l * si.field_l - -128 >> 931454088);
                        break L2;
                      }
                    }
                    var2 = (fk) (Object) he.field_f.a(0);
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L3: {
              if (var2.field_n.b((byte) -119)) {
                var2.field_m.c(si.field_l * var2.field_l - -128 >> -1530393656);
                break L3;
              } else {
                var2.a(true);
                break L3;
              }
            }
            var2 = (fk) (Object) qn.field_mb.a(0);
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = null;
        if (param0 != -1) {
          mf.a(25);
          field_b = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_e = "Increases your allocated movement time each turn";
        field_f = "You have declined the invitation.";
        field_h = "Inviting <%0>";
        field_c = 480;
        field_a = -1;
    }
}
