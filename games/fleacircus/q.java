/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_d;
    static bi field_c;
    static int[] field_a;
    static String[] field_b;

    final static String a(CharSequence param0, boolean param1) {
        if (!param1) {
            q.a(false);
            return e.a(param0, false, 0);
        }
        return e.a(param0, false, 0);
    }

    final static rh a(int param0, int param1) {
        if (param0 != 8192) {
            return null;
        }
        return ag.a(false, param1, false, 1, true, param0 + -8191);
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4_ref = null;
        int var4 = 0;
        oa var4_ref_oa = null;
        Object var5 = null;
        int var6 = 0;
        kf var9 = null;
        ih var10 = null;
        Object var19 = null;
        kf var19_ref = null;
        Object var21 = null;
        kf var21_ref = null;
        byte[] var24 = null;
        byte[] var25 = null;
        var4_ref = null;
        var19 = null;
        var21 = null;
        var6 = fleas.field_A ? 1 : 0;
        var10 = ae.field_a;
        if (param0) {
          var2 = var10.e(false);
          if (-1 == (var2 ^ -1)) {
            var21_ref = (kf) (Object) hd.field_a.c((byte) 47);
            if (var21_ref != null) {
              L0: {
                var4 = var10.e(false);
                if (var4 != 0) {
                  var25 = new byte[var4];
                  var10.b(var25, 0, -88, var4);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              var10.field_i = var10.field_i + 4;
              if (!var10.g(-124)) {
                k.c(-28354);
                return;
              } else {
                var21_ref.c(-1);
                return;
              }
            } else {
              k.c(-28354);
              return;
            }
          } else {
            if (1 == var2) {
              var3 = var10.c((byte) 122);
              var4_ref_oa = (oa) (Object) cf.field_d.c((byte) 47);
              L1: while (true) {
                if (var4_ref_oa == null) {
                  if (var4_ref_oa == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var4_ref_oa.c(-1);
                    return;
                  }
                } else {
                  if (var3 != var4_ref_oa.field_i) {
                    var4_ref_oa = (oa) (Object) cf.field_d.b((byte) -105);
                    continue L1;
                  } else {
                    if (var4_ref_oa == null) {
                      k.c(-28354);
                      return;
                    } else {
                      var4_ref_oa.c(-1);
                      return;
                    }
                  }
                }
              }
            } else {
              ud.a("A1: " + ak.a(true), (Throwable) null, 0);
              k.c(-28354);
              return;
            }
          }
        } else {
          field_c = null;
          var2 = var10.e(false);
          if (-1 == (var2 ^ -1)) {
            var19_ref = (kf) (Object) hd.field_a.c((byte) 47);
            var9 = var19_ref;
            if (var19_ref != null) {
              L2: {
                var4 = var10.e(false);
                if (var4 != 0) {
                  var24 = new byte[var4];
                  var10.b(var24, 0, -88, var4);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var10.field_i = var10.field_i + 4;
              if (!var10.g(-124)) {
                k.c(-28354);
                return;
              } else {
                var19_ref.c(-1);
                return;
              }
            } else {
              k.c(-28354);
              return;
            }
          } else {
            if (1 == var2) {
              var3 = var10.c((byte) 122);
              var4_ref_oa = (oa) (Object) cf.field_d.c((byte) 47);
              L3: while (true) {
                if (var4_ref_oa != null) {
                  if (var3 != var4_ref_oa.field_i) {
                    var4_ref_oa = (oa) (Object) cf.field_d.b((byte) -105);
                    continue L3;
                  } else {
                    if (var4_ref_oa == null) {
                      k.c(-28354);
                      return;
                    } else {
                      var4_ref_oa.c(-1);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_oa == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var4_ref_oa.c(-1);
                    return;
                  }
                }
              }
            } else {
              ud.a("A1: " + ak.a(true), (Throwable) null, 0);
              k.c(-28354);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -127) {
            rh discarded$0 = q.a(30, 25);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
