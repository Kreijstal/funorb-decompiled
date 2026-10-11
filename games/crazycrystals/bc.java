/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    int[] field_c;
    int field_e;
    java.awt.Image field_b;
    static am field_a;
    static jh field_f;
    int field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var6Lifetime4;
        int var7Lifetime8;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime4Lifetime1;
        int var7Lifetime9;
        var8 = CrazyCrystals.field_B;
        if (param1 < 116) {
          field_f = (jh) null;
          if (sn.field_c < 0) {
            return;
          }
          var3 = param2 - 135;
          var4 = param0 - 35;
          var5 = 256;
          if (75 > sn.field_c) {
            var5 = (sn.field_c << 8) / 75;
          }
          if (sn.field_c > 200) {
            var5 = (-sn.field_c + 250 << 8) / 50;
          }
          em.a((byte) 38, rk.field_a);
          nb.b();
          kh.a();
          ja.d((byte) -67);
          if (var5 < 256) {
            kh.d(0, 0, kh.field_l, kh.field_d, 0, 256 - var5);
          }
          lg.a(1);
          if (sn.field_c < 150) {
            rk.field_a.b(var3, var4);
          } else {
            kn.field_p.f(15 + var3, 10 + var4, var5);
          }
          var6 = sn.field_c - 125;
          if (var6 > 0) {
            if (var6 >= 50) {
              var6 = sn.field_c - 140;
              if (0 < var6) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                ne.field_e.f(var3 + 15, var4 + 10, var5 * var7 >> 8);
              }
              return;
            }
            if (20 <= var6) {
              if (var6 < 30) {
                eq.field_k.d(var3, var4, 256);
              } else {
                var7Lifetime9 = 256 * (-var6 + 50) / 20;
                eq.field_k.d(var3, var4, var7Lifetime9);
              }
            } else {
              var7Lifetime9 = 256 * var6 / 20;
              eq.field_k.d(var3, var4, var7Lifetime9);
            }
          }
          var6Lifetime4 = sn.field_c - 140;
          if (0 < var6Lifetime4) {
            var7Lifetime8 = 256;
            if (var6Lifetime4 < 20) {
              var7Lifetime8 = 256 * var6Lifetime4 / 20;
            }
            ne.field_e.f(var3 + 15, var4 + 10, var5 * var7Lifetime8 >> 8);
          }
          return;
        }
        if (sn.field_c < 0) {
          return;
        }
        var3Lifetime1 = param2 - 135;
        var4Lifetime1 = param0 - 35;
        var5Lifetime1 = 256;
        if (75 > sn.field_c) {
          var5Lifetime1 = (sn.field_c << 8) / 75;
        }
        if (sn.field_c > 200) {
          var5Lifetime1 = (-sn.field_c + 250 << 8) / 50;
        }
        em.a((byte) 38, rk.field_a);
        nb.b();
        kh.a();
        ja.d((byte) -67);
        if (var5Lifetime1 < 256) {
          kh.d(0, 0, kh.field_l, kh.field_d, 0, 256 - var5Lifetime1);
        }
        lg.a(1);
        if (sn.field_c >= 150) {
          kn.field_p.f(15 + var3Lifetime1, 10 + var4Lifetime1, var5Lifetime1);
          var6Lifetime1 = sn.field_c - 125;
          if (var6Lifetime1 > 0 &&
            var6Lifetime1 < 50) {
            if (20 <= var6Lifetime1) {
              if (var6Lifetime1 < 30) {
                eq.field_k.d(var3Lifetime1, var4Lifetime1, 256);
              } else {
                var7Lifetime1 = 256 * (-var6Lifetime1 + 50) / 20;
                eq.field_k.d(var3Lifetime1, var4Lifetime1, var7Lifetime1);
              }
            } else {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
              eq.field_k.d(var3Lifetime1, var4Lifetime1, var7Lifetime1);
            }
          }
          var6Lifetime1Lifetime1 = sn.field_c - 140;
          if (0 < var6Lifetime1Lifetime1) {
            var7Lifetime1Lifetime1 = 256;
            if (var6Lifetime1Lifetime1 < 20) {
              var7Lifetime1Lifetime1 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime1Lifetime1 >> 8);
          }
          return;
        }
        rk.field_a.b(var3Lifetime1, var4Lifetime1);
        var6Lifetime2 = sn.field_c - 125;
        if (var6Lifetime2 <= 0) {
          var6Lifetime2 = sn.field_c - 140;
          if (0 < var6Lifetime2) {
            var7Lifetime2 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime2 = 256 * var6Lifetime2 / 20;
            }
            ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (var6Lifetime2 >= 50) {
          var6Lifetime2 = sn.field_c - 140;
          if (0 < var6Lifetime2) {
            var7Lifetime3 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime3 = 256 * var6Lifetime2 / 20;
            }
            ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime3 >> 8);
          }
          return;
        }
        if (20 > var6Lifetime2) {
          var7Lifetime4 = 256 * var6Lifetime2 / 20;
          eq.field_k.d(var3Lifetime1, var4Lifetime1, var7Lifetime4);
          var6Lifetime2 = sn.field_c - 140;
          if (0 < var6Lifetime2) {
            var7Lifetime4Lifetime1 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime4Lifetime1 = 256 * var6Lifetime2 / 20;
            }
            ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime4Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 30) {
          eq.field_k.d(var3Lifetime1, var4Lifetime1, 256);
          var6Lifetime2 = sn.field_c - 140;
          if (0 < var6Lifetime2) {
            var7Lifetime5 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime5 = 256 * var6Lifetime2 / 20;
            }
            ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime5 >> 8);
          }
          return;
        }
        var7Lifetime6 = 256 * (-var6Lifetime2 + 50) / 20;
        eq.field_k.d(var3Lifetime1, var4Lifetime1, var7Lifetime6);
        var6Lifetime3 = sn.field_c - 140;
        if (0 < var6Lifetime3) {
          var7Lifetime7 = 256;
          if (var6Lifetime3 < 20) {
            var7Lifetime7 = 256 * var6Lifetime3 / 20;
          }
          ne.field_e.f(var3Lifetime1 + 15, var4Lifetime1 + 10, var5Lifetime1 * var7Lifetime7 >> 8);
        }
        return;
    }

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final void a(int param0) {
        kh.a(this.field_c, this.field_d, this.field_e);
        if (param0 != 6945) {
          java.awt.Component var3 = (java.awt.Component) null;
          this.a(-44, -26, (java.awt.Component) null, 65);
        }
    }

    public static void b(int param0) {
        if (param0 != -26389) {
          field_f = (jh) null;
          field_a = null;
          field_f = null;
          return;
        }
        field_a = null;
        field_f = null;
    }

    abstract void a(java.awt.Graphics param0, int param1, byte param2, int param3);

    static {
    }
}
