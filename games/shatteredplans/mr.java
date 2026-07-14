/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr implements fo {
    private ob field_m;
    private int field_l;
    static vm field_h;
    private int field_b;
    static bi field_g;
    static boolean field_f;
    static qr[] field_d;
    static bi[] field_i;
    private int field_k;
    static String field_c;
    static int field_a;
    private int field_e;
    private int field_j;

    public final l a(byte param0) throws jn {
        l var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln var11 = null;
        int var12 = 0;
        pc var13 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        ((mr) this).field_e = ((mr) this).field_e - 1;
        var13 = new pc(((mr) this).field_b, ((mr) this).field_j, ((mr) this).field_l, ((mr) this).field_e, ((mr) this).field_k);
        var3 = var13.a((byte) 77);
        var4 = var3.field_e;
        var5 = -23 % ((-67 - param0) / 44);
        var6 = 0;
        L0: while (true) {
          if (var4.length <= var6) {
            return var3;
          } else {
            var7 = var4[var6];
            var8 = ((mr) this).field_m.j(-110);
            var9 = 0;
            L1: while (true) {
              if (var9 >= var8) {
                var9 = 0;
                L2: while (true) {
                  L3: {
                    if ((var9 ^ -1) <= -5) {
                      break L3;
                    } else {
                      var10 = ((mr) this).field_m.j(-119);
                      var7.field_G[var9] = we.a(15, var10);
                      var9++;
                      if (-5 >= (var9 ^ -1)) {
                        break L3;
                      } else {
                        var7.field_G[var9] = we.a(var10, 240) >> -815356732;
                        var9++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    if (var7.field_L != 2) {
                      break L4;
                    } else {
                      var9 = 0;
                      L5: while (true) {
                        if (var9 >= 4) {
                          break L4;
                        } else {
                          var7.field_G[var9] = -var7.field_G[var9];
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                  L6: {
                    var7.field_x = ((mr) this).field_m.f(-20976);
                    if ((32768 & var7.field_x) == 0) {
                      break L6;
                    } else {
                      var7.field_x = var7.field_x & 32767;
                      var7.field_u = true;
                      break L6;
                    }
                  }
                  var7.field_B = ((mr) this).field_m.j(-128);
                  var7.field_L = var7.field_B >>> 2033295110;
                  var7.field_B = var7.field_B & 63;
                  var6++;
                  continue L0;
                }
              } else {
                var10 = ((mr) this).field_m.j(-75);
                var11 = var3.field_e[var10];
                if (!var7.b(var11, (byte) 10)) {
                  var7.a((byte) -76, var11);
                  var11.a((byte) -89, var7);
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_h = null;
        field_c = null;
        field_i = null;
    }

    final static bi a(int param0, int param1) {
        bi var3 = null;
        bi var2_ref = null;
        bi var2 = tr.field_sb[param0];
        if (var2 == null) {
            var3 = new bi(256, 256);
            var2_ref = var3;
            tr.field_sb[param0] = new bi(256, 256);
            bs.a(var3, 100);
            jd.field_j[param0].f(64, 64);
            gf.b(12, 12, 0, 0, 256, 256);
            cg.i(0);
        }
        if (param1 >= -28) {
            field_a = 123;
        }
        return var2_ref;
    }

    final static int a(int param0) {
        if (param0 != 0) {
            mr.a(false);
        }
        return ul.field_Hb + (sq.field_a << 1602041026) + (vm.field_Bb << 1341801956);
    }

    mr(ob param0, int param1, int param2, int param3, int param4, int param5) {
        ((mr) this).field_j = param3;
        ((mr) this).field_l = param1;
        ((mr) this).field_k = param5;
        ((mr) this).field_e = param4;
        ((mr) this).field_m = param0;
        ((mr) this).field_b = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Select a friendly system to commence terraforming, or right click to cancel this project.";
    }
}
