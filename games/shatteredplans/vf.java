/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf extends hb {
    static String field_f;
    private wb field_g;

    final static void a(int param0, int param1, int param2, boolean param3, ln[] param4, Random param5, ln[] param6) {
        ln[][] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        pf var10 = null;
        ln[] var11 = null;
        int var12 = 0;
        int var21 = 0;
        int var22 = 0;
        ln var23 = null;
        int[] var24 = null;
        ln[][] var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        var25 = new ln[param1][];
        var7 = var25;
        var29 = new int[param1];
        var28 = var29;
        var27 = var28;
        var24 = var27;
        var8 = var24;
        if (param3) {
          var9 = 0;
          L0: while (true) {
            L1: {
              if (var9 >= param1) {
                break L1;
              } else {
                var10 = new pf();
                var11 = param4;
                var12 = 0;
                L2: while (true) {
                  L3: {
                    if (var11.length <= var12) {
                      var25 = var7;
                      var29 = var28;
                      var7[var9] = new ln[var29[var9]];
                      int discarded$2 = var10.a((byte) 112, (oh[]) (Object) var25[var9]);
                      var9++;
                      break L3;
                    } else {
                      var23 = var11[var12];
                      var10.a((byte) -113, (oh) (Object) var23);
                      var8[var9] = var8[var9] + 1;
                      var12++;
                      if (0 == 0) {
                        continue L2;
                      } else {
                        var25 = var7;
                        var29 = var28;
                        var7[var9] = new ln[var29[var9]];
                        int discarded$3 = var10.a((byte) 112, (oh[]) (Object) var25[var9]);
                        var9++;
                        break L3;
                      }
                    }
                  }
                  var25 = var7;
                  var29 = var28;
                  if (0 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var25 = var7;
            var29 = var28;
            var25 = var7;
            var29 = var28;
            var22 = 0;
            var9 = var22;
            if (param1 <= var22) {
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void d(byte param0) {
        int var2 = 0;
        ld var3_ref_ld = null;
        int var3 = 0;
        fk var4 = null;
        int var4_int = 0;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        sl var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        ld var14 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = sa.field_a;
        if (param0 == -117) {
          var2 = var8.j(-121);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var8.a(16711680);
              var4 = (fk) (Object) tr.field_vb.d(param0 + 117);
              L0: while (true) {
                if (var4 != null) {
                  if (var4.field_j != var3) {
                    var4 = (fk) (Object) tr.field_vb.a((byte) -71);
                    continue L0;
                  } else {
                    if (var4 == null) {
                      q.g(-118);
                      return;
                    } else {
                      var4.b((byte) -122);
                      return;
                    }
                  }
                } else {
                  if (var4 == null) {
                    q.g(-118);
                    return;
                  } else {
                    var4.b((byte) -122);
                    return;
                  }
                }
              }
            } else {
              jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
              q.g(-108);
              return;
            }
          } else {
            var14 = (ld) (Object) ua.field_d.d(0);
            if (var14 == null) {
              q.g(-96);
              return;
            } else {
              L1: {
                var4_int = var8.j(param0 + -2);
                if (var4_int != 0) {
                  var12 = new byte[var4_int];
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var7 = var9;
                  var5 = var7;
                  var8.a(var4_int, 0, 17469032, var12);
                  break L1;
                } else {
                  var5 = null;
                  break L1;
                }
              }
              var8.field_j = var8.field_j + 4;
              if (!var8.f((byte) 104)) {
                q.g(param0 + 17);
                return;
              } else {
                var14.field_l = true;
                var14.field_o = var5;
                var14.b((byte) -100);
                return;
              }
            }
          }
        } else {
          field_f = null;
          var2 = var8.j(-121);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var8.a(16711680);
              var4 = (fk) (Object) tr.field_vb.d(param0 + 117);
              L2: while (true) {
                if (var4 != null) {
                  if (var4.field_j != var3) {
                    var4 = (fk) (Object) tr.field_vb.a((byte) -71);
                    continue L2;
                  } else {
                    if (var4 == null) {
                      q.g(-118);
                      return;
                    } else {
                      var4.b((byte) -122);
                      return;
                    }
                  }
                } else {
                  if (var4 == null) {
                    q.g(-118);
                    return;
                  } else {
                    var4.b((byte) -122);
                    return;
                  }
                }
              }
            } else {
              jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
              q.g(-108);
              return;
            }
          } else {
            var3_ref_ld = (ld) (Object) ua.field_d.d(0);
            if (var3_ref_ld == null) {
              q.g(-96);
              return;
            } else {
              L3: {
                var4_int = var8.j(param0 + -2);
                if (var4_int != 0) {
                  var12 = new byte[var4_int];
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var7 = var9;
                  var5 = var7;
                  var8.a(var4_int, 0, 17469032, var12);
                  break L3;
                } else {
                  var5 = null;
                  break L3;
                }
              }
              var8.field_j = var8.field_j + 4;
              if (!var8.f((byte) 104)) {
                q.g(param0 + 17);
                return;
              } else {
                var3_ref_ld.field_l = true;
                var3_ref_ld.field_o = var5;
                var3_ref_ld.b((byte) -100);
                return;
              }
            }
          }
        }
    }

    final oh a(boolean param0) {
        if (param0) {
            vf.d((byte) 82);
            return (oh) (Object) ((vf) this).field_g.d(-115);
        }
        return (oh) (Object) ((vf) this).field_g.d(-115);
    }

    final static void a(int param0, sd param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 119) {
          return;
        } else {
          var6 = new int[4];
          var2 = var6;
          sn.a(var6, (byte) -76, param1);
          var4 = var6[0];
          var3 = 1;
          L0: while (true) {
            if (-5 >= (var3 ^ -1)) {
              L1: {
                if ((var4 ^ -1) > -1) {
                  var4 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              param1.field_x = var4;
              return;
            } else {
              if (var6[var3] < var4) {
                var4 = var6[var3];
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final oh a(byte param0) {
        if (param0 < 99) {
            return null;
        }
        return (oh) (Object) ((vf) this).field_g.e(-31364);
    }

    final int b(byte param0) {
        if (param0 != -61) {
            ((vf) this).field_g = null;
            return ((vf) this).field_g.c(-7432);
        }
        return ((vf) this).field_g.c(-7432);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        eo.field_cb.field_j = 0;
        eo.field_cb.c(12, (byte) -128);
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.c(param3, (byte) -85);
        eo.field_cb.c(param1, (byte) -123);
        eo.field_cb.d(param0, 255);
        eo.field_cb.a(jl.field_V, hr.field_a, (byte) -56);
        js.field_f.h(18, param2 + 251);
        js.field_f.field_j = js.field_f.field_j + 1;
        var4 = js.field_f.field_j + 1;
        js.field_f.a(0, eo.field_cb.field_j, eo.field_cb.field_h, 22186);
        if (param2 != 4) {
          return;
        } else {
          js.field_f.b(-var4 + js.field_f.field_j, (byte) 118);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 17593) {
            Object var2 = null;
            vf.a(-89, (sd) null);
            field_f = null;
            return;
        }
        field_f = null;
    }

    vf(wb param0) {
        ((vf) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Add name";
    }
}
