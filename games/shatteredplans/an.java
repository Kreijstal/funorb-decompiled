/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static aa field_b;
    static int field_c;
    static qr field_d;
    static String field_a;

    final static void a(boolean param0) {
        df var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        jo.field_d = null;
        r.field_c = 0;
        oi.field_e = 0;
        if (!param0) {
          return;
        } else {
          vd.field_j.a(0);
          fp.field_b.a(0);
          var1 = eg.field_q.c((byte) -86);
          L0: while (true) {
            if (var1 == null) {
              var1 = sl.field_m.c((byte) -70);
              L1: while (true) {
                if (var1 == null) {
                  po.field_b = 0;
                  return;
                } else {
                  var1.a(16);
                  var1 = sl.field_m.b((byte) -107);
                  continue L1;
                }
              }
            } else {
              var1.a(16);
              var1 = eg.field_q.b((byte) -107);
              continue L0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static lp a(byte param0, boolean param1, sd param2) {
        String var4 = null;
        kb var5 = null;
        int var6_int = 0;
        b var6 = null;
        int var7 = 0;
        ff var7_ref = null;
        int var8_int = 0;
        qk var8 = null;
        ff var9 = null;
        int var10 = 0;
        qk var11 = null;
        String var12 = null;
        lp var13 = null;
        kb var14 = null;
        kb var15 = null;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          var13 = new lp(0, 0, 209, 50);
          var13.field_h = (Object) (Object) param2;
          var12 = param2.field_q.field_I;
          var4 = var12;
          var4 = var12;
          if (!param1) {
            break L0;
          } else {
            var4 = var12 + " (" + param2.field_o.field_t + ")";
            break L0;
          }
        }
        if (param0 == -76) {
          var14 = new kb(0, 0, 209, param2.field_o.field_k, var4, 16777215, false);
          var13.a((vd) (Object) var14, 8);
          var6_int = 0;
          L1: while (true) {
            if (4 <= var6_int) {
              L2: {
                var6 = new b(k.field_d.field_z / 2 + (fs.field_a[0].field_z - -5) * 4 + 40, 6 + var14.field_i, k.field_d.field_z * 2, -2 + k.field_d.field_w, 2, 534312);
                var13.a((vd) (Object) var6, param0 ^ -68);
                var7 = param2.field_r;
                if ((var7 ^ -1) <= -1) {
                  break L2;
                } else {
                  var7 = 0;
                  break L2;
                }
              }
              var8 = new qk(k.field_d.field_z + 4 * (5 + fs.field_a[0].field_z) + 40, var14.field_i + (7 + fs.field_a[0].field_w / 8), 3 * k.field_d.field_z / 2, k.field_d.field_w, Integer.toString(var7));
              var13.a((vd) (Object) var8, 8);
              var9 = new ff(40 + 4 * (fs.field_a[0].field_z + 5), 5 + var14.field_i, k.field_d);
              var13.a((vd) (Object) var9, 8);
              var9.field_o = si.field_w;
              var8.field_o = si.field_w;
              var6.field_o = si.field_w;
              return var13;
            } else {
              L3: {
                var7_ref = new ff(40 + var6_int * (5 + fs.field_a[var6_int].field_z), var14.field_i - -7, fs.field_a[var6_int]);
                var13.a((vd) (Object) var7_ref, param0 ^ -68);
                var8_int = param2.field_r + param2.field_u[var6_int];
                if (var8_int >= 0) {
                  break L3;
                } else {
                  var8_int = 0;
                  break L3;
                }
              }
              var11 = new qk(40 - -(var6_int * (fs.field_a[var6_int].field_z - -5)), 7 + var14.field_i + fs.field_a[var6_int].field_w / 8, fs.field_a[var6_int].field_z, fs.field_a[var6_int].field_w, Integer.toString(var8_int));
              var9 = (ff) (Object) var11;
              var13.a((vd) (Object) var9, param0 ^ -68);
              var11.field_o = ne.field_m[var6_int];
              var7_ref.field_o = ne.field_m[var6_int];
              var6_int++;
              continue L1;
            }
          }
        } else {
          an.b(true);
          var15 = new kb(0, 0, 209, param2.field_o.field_k, var4, 16777215, false);
          var5 = var15;
          var13.a((vd) (Object) var15, 8);
          var6_int = 0;
          L4: while (true) {
            if (4 <= var6_int) {
              L5: {
                var6 = new b(k.field_d.field_z / 2 + (fs.field_a[0].field_z - -5) * 4 + 40, 6 + var15.field_i, k.field_d.field_z * 2, -2 + k.field_d.field_w, 2, 534312);
                var13.a((vd) (Object) var6, param0 ^ -68);
                var7 = param2.field_r;
                if ((var7 ^ -1) <= -1) {
                  break L5;
                } else {
                  var7 = 0;
                  break L5;
                }
              }
              var8 = new qk(k.field_d.field_z + 4 * (5 + fs.field_a[0].field_z) + 40, var15.field_i + (7 + fs.field_a[0].field_w / 8), 3 * k.field_d.field_z / 2, k.field_d.field_w, Integer.toString(var7));
              var13.a((vd) (Object) var8, 8);
              var9 = new ff(40 + 4 * (fs.field_a[0].field_z + 5), 5 + var15.field_i, k.field_d);
              var13.a((vd) (Object) var9, 8);
              var9.field_o = si.field_w;
              var8.field_o = si.field_w;
              var6.field_o = si.field_w;
              return var13;
            } else {
              L6: {
                var7_ref = new ff(40 + var6_int * (5 + fs.field_a[var6_int].field_z), var15.field_i - -7, fs.field_a[var6_int]);
                var13.a((vd) (Object) var7_ref, param0 ^ -68);
                var8_int = param2.field_r + param2.field_u[var6_int];
                if (var8_int >= 0) {
                  break L6;
                } else {
                  var8_int = 0;
                  break L6;
                }
              }
              var11 = new qk(40 - -(var6_int * (fs.field_a[var6_int].field_z - -5)), 7 + var15.field_i + fs.field_a[var6_int].field_w / 8, fs.field_a[var6_int].field_z, fs.field_a[var6_int].field_w, Integer.toString(var8_int));
              var9 = (ff) (Object) var11;
              var13.a((vd) (Object) var9, param0 ^ -68);
              var11.field_o = ne.field_m[var6_int];
              var7_ref.field_o = ne.field_m[var6_int];
              var6_int++;
              continue L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Warring Worlds";
    }
}
