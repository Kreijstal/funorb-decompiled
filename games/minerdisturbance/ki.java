/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pi {
    static int field_n;
    int[] field_p;
    boolean field_o;

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ld var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ld var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        ki var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        ki var21_ref = null;
        ld var22 = null;
        Object var23 = null;
        Object var24 = null;
        ki var24_ref = null;
        Object var25 = null;
        ki var25_ref = null;
        sl var26 = null;
        sl var27 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var23 = null;
        var24 = null;
        var25 = null;
        var8 = MinerDisturbance.field_ab;
        if (param0 == -15003) {
          var22 = kj.field_a;
          var2 = var22.d((byte) -54);
          if (0 == var2) {
            var10 = hk.b(0);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var22;
            var6 = ((sb) (Object) var5).d((byte) -54);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var25_ref = (ki) (Object) on.field_v.b(110);
                if (var25_ref == null) {
                  si.a(param0 + 14967);
                  return;
                } else {
                  var25_ref.field_p = var3;
                  var25_ref.field_o = true;
                  var25_ref.b(34);
                  return;
                }
              } else {
                var9[var7] = ((sb) (Object) var5).b((byte) 118);
                var7++;
                continue L0;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              if (-3 == (var2 ^ -1)) {
                var24_ref = (ki) (Object) on.field_v.b(64);
                if (var24_ref == null) {
                  si.a(-79);
                  return;
                } else {
                  var24_ref.field_p = hk.b(param0 + 15003);
                  var24_ref.field_o = true;
                  var24_ref.b(34);
                  return;
                }
              } else {
                di.a((Throwable) null, param0 ^ -15004, "A1: " + hj.a((byte) 116));
                si.a(-110);
                return;
              }
            } else {
              var27 = (sl) (Object) tc.field_v.b(101);
              if (var27 == null) {
                si.a(param0 + 14908);
                return;
              } else {
                var27.b(param0 + 15037);
                return;
              }
            }
          }
        } else {
          field_n = -89;
          var15 = kj.field_a;
          var2 = var15.d((byte) -54);
          if (0 == var2) {
            var10 = hk.b(0);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var15;
            var6 = ((sb) (Object) var5).d((byte) -54);
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                var21_ref = (ki) (Object) on.field_v.b(110);
                if (var21_ref == null) {
                  si.a(param0 + 14967);
                  return;
                } else {
                  var21_ref.field_p = var3;
                  var21_ref.field_o = true;
                  var21_ref.b(34);
                  return;
                }
              } else {
                var9[var7] = ((sb) (Object) var5).b((byte) 118);
                var7++;
                continue L1;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              if (-3 == (var2 ^ -1)) {
                var19_ref = (ki) (Object) on.field_v.b(64);
                if (var19_ref == null) {
                  si.a(-79);
                  return;
                } else {
                  var19_ref.field_p = hk.b(param0 + 15003);
                  var19_ref.field_o = true;
                  var19_ref.b(34);
                  return;
                }
              } else {
                di.a((Throwable) null, param0 ^ -15004, "A1: " + hj.a((byte) 116));
                si.a(-110);
                return;
              }
            } else {
              var26 = (sl) (Object) tc.field_v.b(101);
              if (var26 == null) {
                si.a(param0 + 14908);
                return;
              } else {
                var26.b(param0 + 15037);
                return;
              }
            }
          }
        }
    }

    final static ea[] a(int param0, bj param1, int param2, byte param3) {
        Object var5 = null;
        if (cn.a(param0, param3 ^ -261, param2, param1)) {
          if (param3 != -7) {
            var5 = null;
            ea[] discarded$2 = ki.a(-56, (bj) null, -11, (byte) 16);
            return wc.a(-29);
          } else {
            return wc.a(-29);
          }
        } else {
          return null;
        }
    }

    ki() {
        ((ki) this).field_o = false;
    }

    static {
    }
}
