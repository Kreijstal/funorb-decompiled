/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_a;
    static boolean field_e;
    static ie field_d;
    static int field_b;
    static java.awt.Frame field_f;
    static String[][] field_c;

    final static boolean a(int param0, int param1) {
        if (param1 == 1) {
          if (sn.field_b[param0] != null) {
            if (sn.field_b[param0].field_t) {
              if (null != sn.field_b[param0].field_p) {
                if (null == sn.field_b[param0].field_p[1][0]) {
                  return false;
                } else {
                  return true;
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
        } else {
          return false;
        }
    }

    final static pe a(int param0, String param1) {
        String var2 = null;
        Object var3 = null;
        pe var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        var3 = null;
        var5 = MinerDisturbance.field_ab;
        if (ae.field_a != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var10 = (CharSequence) (Object) param1;
              var2 = cl.a(-95, var10);
              if (var2 != null) {
                if (param0 == 1) {
                  var3_ref = (pe) (Object) ae.field_a.a(-7895, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_ob;
                      var6 = cl.a(-95, var11);
                      if (var6.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (pe) (Object) ae.field_a.c(1);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  field_a = null;
                  var3_ref = (pe) (Object) ae.field_a.a(-7895, (long)var2.hashCode());
                  L1: while (true) {
                    if (var3_ref != null) {
                      var12 = (CharSequence) (Object) var3_ref.field_ob;
                      var7 = cl.a(-95, var12);
                      if (var7.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (pe) (Object) ae.field_a.c(1);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 < 17) {
            return;
        }
        field_c = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Munched and Crunched";
        field_d = new ie();
        field_b = 0;
        field_c = new String[][]{new String[1]};
    }
}
