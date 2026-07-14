/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gd {
    static int field_S;
    static int field_T;
    static String field_Q;
    static int[][] field_R;
    int field_O;
    static String field_P;

    final static void a(String param0, byte param1) {
        jj.field_d = param0;
        sn.a(93, 12);
        if (param1 == 58) {
            return;
        }
        lk.f(87);
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 8187) {
            return;
        }
        int var4 = param0 + ((lk) this).field_t;
        int var5 = ((lk) this).field_i - -param2;
        wd.field_l[((lk) this).field_O].a(20 + var5, 30 + var4, true, 30);
        super.b(param0, param1 ^ 0, param2);
    }

    lk(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, 0);
        ((lk) this).field_O = param4;
        ((lk) this).g(255);
    }

    public static void h(int param0) {
        field_Q = null;
        field_R = null;
        if (param0 != 25161) {
            Object var2 = null;
            lk.a((String) null, (byte) -122);
        }
        field_P = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        L0: {
          var2 = gm.field_d.field_J[((lk) this).field_O];
          var3 = gm.field_d.field_F[((lk) this).field_O];
          var4 = null;
          if (var2 == 0) {
            if (var3 == 0) {
              break L0;
            } else {
              var4 = jk.a(new String[1], to.field_a, 30496);
              break L0;
            }
          } else {
            L1: {
              var9 = jk.a(new String[1], nh.field_i, 30496);
              var4 = var9;
              var4 = var9;
              if (var3 == 0) {
                break L1;
              } else {
                var4 = var9 + ", " + jk.a(new String[1], to.field_a, 30496);
                break L1;
              }
            }
            if (!ve.a(false)) {
              break L0;
            } else {
              if (!hm.field_m[((lk) this).field_O]) {
                break L0;
              } else {
                if (var2 >= 5) {
                  var4 = var4 + ", " + qh.field_j;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          var5 = li.field_b[((lk) this).field_O];
          var6 = db.field_v.b(var5);
          var7 = db.field_v.field_H - -la.field_b.field_E;
          if (var4 == null) {
            break L2;
          } else {
            L3: {
              var8 = db.field_v.b(var4);
              if (var8 <= var6) {
                break L3;
              } else {
                var6 = var8;
                break L3;
              }
            }
            var7 = var7 + db.field_v.field_H;
            break L2;
          }
        }
        L4: {
          ((lk) this).field_K = new cn(var6, var7);
          ((lk) this).field_H = new cn(var6, var7);
          ((lk) this).field_z = new cn(var6, var7);
          jh.c();
          ((lk) this).field_K.e();
          db.field_v.b(var5, 0, la.field_b.field_H, 12632256, -1);
          if (var4 == null) {
            break L4;
          } else {
            db.field_v.b(var4, 0, la.field_b.field_H * 2, 8421504, -1);
            break L4;
          }
        }
        ((lk) this).field_H.e();
        gf.a();
        ((lk) this).field_K.e(0, 0, 16744448);
        ((lk) this).field_z.e();
        gf.a();
        ((lk) this).field_K.e(0, 0, 12690143);
        jh.b();
        ((lk) this).field_K.field_A = ((lk) this).field_x + -var7 >> 225208833;
        ((lk) this).field_K.field_w = 60;
        ((lk) this).field_H.field_w = 60;
        ((lk) this).field_H.field_A = ((lk) this).field_x + -var7 >> 1702697793;
        ((lk) this).field_z.field_w = 60;
        ((lk) this).field_z.field_A = ((lk) this).field_x + -var7 >> 1482279457;
        ((lk) this).field_I = rb.a(16, ((lk) this).field_z, param0, (byte) -33);
        ((lk) this).field_N = rb.a(16, ((lk) this).field_H, 16711680, (byte) -18);
    }

    final static String a(String param0, nh param1, String param2, byte param3) {
        if (param1.a(-14354)) {
          if (param3 > -119) {
            return null;
          } else {
            return param0 + " - " + param1.b(100) + "%";
          }
        } else {
          return param2;
        }
    }

    final static void f(int param0) {
        ia.field_K = null;
        sg.field_b = null;
        ga.field_o = null;
        ro.field_B = false;
        if (param0 != 16) {
            field_S = 2;
        }
        System.gc();
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var4 = ((lk) this).field_t + param0;
        var5 = param1 + ((lk) this).field_i;
        var7 = 63 / ((param2 - 41) / 61);
        var6 = 0;
        L0: while (true) {
          if (10 > var6) {
            gf.g(30 + var4, 20 + var5, 20 - -var6, 0, 16);
            var6++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "CONFIRM";
        field_S = 0;
        field_Q = "Your email address is used to identify this account";
    }
}
