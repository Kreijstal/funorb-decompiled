/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static iw field_b;
    static int[][] field_a;

    public static void a(byte param0) {
        field_a = (int[][]) null;
        if (param0 != 95) {
          field_b = (iw) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static ki a(byte param0, int param1) {
        int var2 = 39 % ((param0 + 45) / 59);
        if (sn.field_d != null) {
          return sn.field_d;
        }
        if (-1 != param1) {
          return ng.a(1, -101, true, param1, false, true);
        }
        return sn.field_d;
    }

    final static void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var6Lifetime3;
        int var7Lifetime7;
        int var7Lifetime8;
        int var7Lifetime9;
        int var7Lifetime10;
        int var7Lifetime11;
        int var7Lifetime3Lifetime1;
        if (!(0 <= td.field_u)) {
          return;
        }
        int var3 = -135 + param1;
        int var4 = -35 + param0;
        int var5 = param2;
        if (!(75 <= td.field_u)) {
          var5 = (td.field_u << 8) / 75;
        }
        if (td.field_u > 200) {
          var5 = (250 - td.field_u << 8) / 50;
        }
        jq.a(7161, sn.field_a);
        nk.b();
        lk.b();
        ok.b(param2 + 0);
        if (256 > var5) {
          lk.b(0, 0, lk.field_b, lk.field_c, 0, 256 - var5);
        }
        su.a((byte) -69);
        if (td.field_u >= 150) {
          kh.field_a.a(var3 + 15, 10 + var4, var5);
          var6 = td.field_u - 125;
          if (var6 <= 0) {
            var6 = td.field_u - 140;
            if (0 < var6) {
              var7 = 256;
              if (20 > var6) {
                var7 = var6 * 256 / 20;
              }
              mq.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
            }
            return;
          }
          if (var6 >= 50) {
            var6 = td.field_u - 140;
            if (0 < var6) {
              var7Lifetime7 = 256;
              if (20 > var6) {
                var7Lifetime7 = var6 * 256 / 20;
              }
              mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime7 >> 8);
            }
            return;
          }
          if (20 > var6) {
            var7Lifetime8 = var6 * 256 / 20;
            eh.field_b.d(var3, var4, var7Lifetime8);
            var6 = td.field_u - 140;
            if (0 < var6) {
              var7Lifetime8 = 256;
              if (20 > var6) {
                var7Lifetime8 = var6 * 256 / 20;
              }
              mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime8 >> 8);
            }
            return;
          }
          if (var6 < 30) {
            eh.field_b.d(var3, var4, 256);
            var6 = td.field_u - 140;
            if (0 < var6) {
              var7Lifetime9 = 256;
              if (20 > var6) {
                var7Lifetime9 = var6 * 256 / 20;
              }
              mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime9 >> 8);
            }
            return;
          }
          var7Lifetime10 = (12800 - 256 * var6) / 20;
          eh.field_b.d(var3, var4, var7Lifetime10);
          var6Lifetime3 = td.field_u - 140;
          if (0 < var6Lifetime3) {
            var7Lifetime11 = 256;
            if (20 > var6Lifetime3) {
              var7Lifetime11 = var6Lifetime3 * 256 / 20;
            }
            mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime11 >> 8);
          }
          return;
        }
        sn.field_a.b(var3, var4);
        var6Lifetime1 = td.field_u - 125;
        if (var6Lifetime1 <= 0) {
          var6Lifetime1 = td.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
            }
            mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime1 >= 50) {
          var6Lifetime1 = td.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime2 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime2 = var6Lifetime1 * 256 / 20;
            }
            mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (20 > var6Lifetime1) {
          var7Lifetime3 = var6Lifetime1 * 256 / 20;
          eh.field_b.d(var3, var4, var7Lifetime3);
          var6Lifetime1 = td.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime3Lifetime1 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime3Lifetime1 = var6Lifetime1 * 256 / 20;
            }
            mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime3Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime1 < 30) {
          eh.field_b.d(var3, var4, 256);
          var6Lifetime1 = td.field_u - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime4 = 256;
            if (20 > var6Lifetime1) {
              var7Lifetime4 = var6Lifetime1 * 256 / 20;
            }
            mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime4 >> 8);
          }
          return;
        }
        var7Lifetime5 = (12800 - 256 * var6Lifetime1) / 20;
        eh.field_b.d(var3, var4, var7Lifetime5);
        var6Lifetime2 = td.field_u - 140;
        if (0 < var6Lifetime2) {
          var7Lifetime6 = 256;
          if (20 > var6Lifetime2) {
            var7Lifetime6 = var6Lifetime2 * 256 / 20;
          }
          mq.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime6 >> 8);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 >= -78) {
          kd.a(-106, 83, -73);
          ut.field_o.a(120, param0);
          return;
        }
        ut.field_o.a(120, param0);
    }

    static {
        field_b = new iw(1);
        field_a = new int[13][];
    }
}
