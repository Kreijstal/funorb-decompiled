/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static he field_c;
    static String field_b;
    private static t field_a;

    final static void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Torquing.field_u;
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
        int var7Lifetime9;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        int var7Lifetime1Lifetime4;
        int var7Lifetime1Lifetime5;
        int var7Lifetime4Lifetime1;
        if (!(jh.field_z >= 0)) {
          return;
        }
        int var3 = param1 - 135;
        int var4 = param2 - 35;
        int var5 = 256;
        if (!(jh.field_z >= 75)) {
          var5 = (jh.field_z << 8) / 75;
        }
        if (jh.field_z > 200) {
          var5 = (-jh.field_z + 250 << 8) / 50;
        }
        tm.a((byte) -106, field_a);
        be.a();
        ph.b();
        so.b(122);
        if (var5 < 256) {
          ph.b(0, 0, ph.field_j, ph.field_d, 0, -var5 + 256);
        }
        r.a(125);
        if (param0 != 540) {
          field_b = (String) null;
          if (150 > jh.field_z) {
            field_a.c(var3, var4);
          } else {
            cl.field_a.e(15 + var3, 10 + var4, var5);
          }
          var6 = jh.field_z - 125;
          if (var6 <= 0) {
            var6 = -140 + jh.field_z;
            if (var6 > 0) {
              var7 = 256;
              if (20 > var6) {
                var7 = 256 * var6 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7 >> 8);
            }
            return;
          }
          if (50 > var6) {
            if (var6 < 20) {
              var7Lifetime8 = 256 * var6 / 20;
              ff.field_c.a(var3, var4, var7Lifetime8);
            } else {
              if (var6 >= 30) {
                var7Lifetime8 = (12800 - 256 * var6) / 20;
                ff.field_c.a(var3, var4, var7Lifetime8);
              } else {
                ff.field_c.a(var3, var4, 256);
              }
            }
            var6 = -140 + jh.field_z;
            if (var6 > 0) {
              var7Lifetime8 = 256;
              if (20 > var6) {
                var7Lifetime8 = 256 * var6 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime8 >> 8);
            }
            return;
          }
          var6Lifetime4 = -140 + jh.field_z;
          if (var6Lifetime4 > 0) {
            var7Lifetime9 = 256;
            if (20 > var6Lifetime4) {
              var7Lifetime9 = 256 * var6Lifetime4 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime9 >> 8);
          }
          return;
        }
        if (150 > jh.field_z) {
          field_a.c(var3, var4);
          var6Lifetime1 = jh.field_z - 125;
          if (var6Lifetime1 <= 0) {
            var6Lifetime1 = -140 + jh.field_z;
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = 256;
              if (20 > var6Lifetime1) {
                var7Lifetime1 = 256 * var6Lifetime1 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime1 >> 8);
            }
            return;
          }
          if (50 <= var6Lifetime1) {
            var6Lifetime1 = -140 + jh.field_z;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime1 = 256;
              if (20 > var6Lifetime1) {
                var7Lifetime1Lifetime1 = 256 * var6Lifetime1 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime1Lifetime1 >> 8);
            }
            return;
          }
          if (var6Lifetime1 < 20) {
            var7Lifetime1Lifetime2 = 256 * var6Lifetime1 / 20;
            ff.field_c.a(var3, var4, var7Lifetime1Lifetime2);
            var6Lifetime1 = -140 + jh.field_z;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime2 = 256;
              if (20 > var6Lifetime1) {
                var7Lifetime1Lifetime2 = 256 * var6Lifetime1 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime1Lifetime2 >> 8);
            }
            return;
          }
          if (var6Lifetime1 < 30) {
            ff.field_c.a(var3, var4, 256);
            var6Lifetime1 = -140 + jh.field_z;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime3 = 256;
              if (20 > var6Lifetime1) {
                var7Lifetime1Lifetime3 = 256 * var6Lifetime1 / 20;
              }
              de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime1Lifetime3 >> 8);
            }
            return;
          }
          var7Lifetime1Lifetime4 = (12800 - 256 * var6Lifetime1) / 20;
          ff.field_c.a(var3, var4, var7Lifetime1Lifetime4);
          var6Lifetime1Lifetime1 = -140 + jh.field_z;
          if (var6Lifetime1Lifetime1 > 0) {
            var7Lifetime1Lifetime5 = 256;
            if (20 > var6Lifetime1Lifetime1) {
              var7Lifetime1Lifetime5 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime1Lifetime5 >> 8);
          }
          return;
        }
        cl.field_a.e(15 + var3, 10 + var4, var5);
        var6Lifetime2 = jh.field_z - 125;
        if (var6Lifetime2 <= 0) {
          var6Lifetime2 = -140 + jh.field_z;
          if (var6Lifetime2 > 0) {
            var7Lifetime2 = 256;
            if (20 > var6Lifetime2) {
              var7Lifetime2 = 256 * var6Lifetime2 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (50 <= var6Lifetime2) {
          var6Lifetime2 = -140 + jh.field_z;
          if (var6Lifetime2 > 0) {
            var7Lifetime3 = 256;
            if (20 > var6Lifetime2) {
              var7Lifetime3 = 256 * var6Lifetime2 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime3 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 20) {
          var7Lifetime4 = 256 * var6Lifetime2 / 20;
          ff.field_c.a(var3, var4, var7Lifetime4);
          var6Lifetime2 = -140 + jh.field_z;
          if (var6Lifetime2 > 0) {
            var7Lifetime4Lifetime1 = 256;
            if (20 > var6Lifetime2) {
              var7Lifetime4Lifetime1 = 256 * var6Lifetime2 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime4Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 30) {
          ff.field_c.a(var3, var4, 256);
          var6Lifetime2 = -140 + jh.field_z;
          if (var6Lifetime2 > 0) {
            var7Lifetime5 = 256;
            if (20 > var6Lifetime2) {
              var7Lifetime5 = 256 * var6Lifetime2 / 20;
            }
            de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime5 >> 8);
          }
          return;
        }
        var7Lifetime6 = (12800 - 256 * var6Lifetime2) / 20;
        ff.field_c.a(var3, var4, var7Lifetime6);
        var6Lifetime3 = -140 + jh.field_z;
        if (var6Lifetime3 > 0) {
          var7Lifetime7 = 256;
          if (20 > var6Lifetime3) {
            var7Lifetime7 = 256 * var6Lifetime3 / 20;
          }
          de.field_a.e(15 + var3, var4 + 10, var5 * var7Lifetime7 >> 8);
        }
    }

    public static void a(int param0) {
        if (param0 < 34) {
          return;
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_c = new he("");
        field_b = "More suggestions";
        field_a = new t(540, 140);
    }
}
