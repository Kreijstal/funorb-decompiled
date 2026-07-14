/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends ms {
    int field_l;
    static lh field_o;
    int field_n;
    static long field_k;
    static String field_m;

    public static void a(int param0) {
        if (param0 != -11807) {
            java.awt.Container discarded$0 = km.c(false);
        }
        field_o = null;
        field_m = null;
    }

    final static void a(byte param0, int param1, id param2) {
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        pl var8 = as.field_v;
        pl var9 = var8;
        var9.g(param1, 8);
        var9.field_p = var9.field_p + 1;
        int var4 = var9.field_p;
        var9.b((byte) 55, 1);
        int var5 = 104 / ((30 - param0) / 34);
        var9.b(-77, param2.field_r);
        var9.b(-92, param2.field_l);
        var9.b(123, param2.field_t);
        var9.e(48, param2.field_n);
        var9.e(48, param2.field_o);
        var9.e(48, param2.field_p);
        var9.e(48, param2.field_k);
        var9.b((byte) 119, param2.field_q.length);
        for (var6 = 0; param2.field_q.length > var6; var6++) {
            var8.e(48, param2.field_q[var6]);
        }
        int discarded$0 = var9.a(var4, false);
        var9.c(var9.field_p + -var4, -13745);
    }

    final static void a(byte param0) {
        int var1 = 0;
        ah var2 = null;
        ah var3 = null;
        ah var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        ah var6_ref = null;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (null == aa.field_a) {
            break L0;
          } else {
            var1 = 0;
            L1: while (true) {
              if (var1 >= db.field_l) {
                break L0;
              } else {
                var2 = aa.field_a[var1];
                var3 = var2;
                var6 = var3;
                var3 = var2;
                if (var2 != null) {
                  if (-1 != (var1 ^ -1)) {
                    if (!var2.h(-1)) {
                      var3_ref = aa.field_a[0];
                      var6 = var3_ref;
                      var6 = var3_ref;
                      if (var3_ref != null) {
                        var4 = var2.field_a;
                        if (!gt.field_bb) {
                          if (wn.a(var3_ref.field_z, var4, -115, var2.field_C, var3_ref.field_C, var2.field_z)) {
                            if (var3_ref.f((byte) -63)) {
                              if (var3_ref.i((byte) 125)) {
                                var2.a(false, var3_ref.field_z, var3_ref.field_C);
                                var1++;
                                continue L1;
                              } else {
                                var1++;
                                continue L1;
                              }
                            } else {
                              var1++;
                              continue L1;
                            }
                          } else {
                            var1++;
                            continue L1;
                          }
                        } else {
                          L2: {
                            if (!wn.a(var3_ref.field_z, var4, -114, var2.field_C, var3_ref.field_C, var2.field_z)) {
                              break L2;
                            } else {
                              if (!var3_ref.f((byte) -63)) {
                                break L2;
                              } else {
                                if (!var3_ref.i((byte) 125)) {
                                  break L2;
                                } else {
                                  var2.a(false, var3_ref.field_z, var3_ref.field_C);
                                  var1++;
                                  continue L1;
                                }
                              }
                            }
                          }
                          var5 = 0;
                          L3: while (true) {
                            if (db.field_l > var5) {
                              var6_ref = aa.field_a[var5];
                              if (var5 != var1) {
                                if (var6_ref != null) {
                                  if (var6_ref.i((byte) 125)) {
                                    if (wn.a(var6_ref.field_z, var4, -114, var2.field_C, var6_ref.field_C, var2.field_z)) {
                                      if (var6_ref.f((byte) -63)) {
                                        var2.a(false, var3_ref.field_z, var3_ref.field_C);
                                        var1++;
                                        continue L1;
                                      } else {
                                        var5++;
                                        continue L3;
                                      }
                                    } else {
                                      var5++;
                                      continue L3;
                                    }
                                  } else {
                                    var5++;
                                    continue L3;
                                  }
                                } else {
                                  var5++;
                                  continue L3;
                                }
                              } else {
                                var5++;
                                continue L3;
                              }
                            } else {
                              var1++;
                              continue L1;
                            }
                          }
                        }
                      } else {
                        var1++;
                        continue L1;
                      }
                    } else {
                      var1++;
                      continue L1;
                    }
                  } else {
                    var1++;
                    continue L1;
                  }
                } else {
                  var1++;
                  continue L1;
                }
              }
            }
          }
        }
        var1 = -120 / ((-61 - param0) / 63);
    }

    final static java.awt.Container c(boolean param0) {
        if (param0) {
            field_o = null;
        }
        if (ck.field_c != null) {
            return (java.awt.Container) (Object) ck.field_c;
        }
        return (java.awt.Container) (Object) ra.c(2);
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
        field_m = "Accept";
    }
}
