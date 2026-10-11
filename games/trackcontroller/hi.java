/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends tk {
    byte field_B;
    int field_z;
    static int field_y;
    static int[] field_A;
    be field_x;

    final static void b(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = TrackController.field_F ? 1 : 0;
        if (0 > fb.field_a) {
          return;
        }
        var3 = -135 + param0;
        var4 = param2 - 35;
        var5 = 256;
        if (75 > fb.field_a) {
          var5 = (fb.field_a << 8) / 75;
        }
        if (fb.field_a > 200) {
          var5 = (250 - fb.field_a << 8) / 50;
        }
        mb.a((byte) -35, kj.field_l);
        ig.a();
        ll.a();
        be.a((byte) -78);
        if (256 > var5) {
          ll.c(0, 0, ll.field_d, ll.field_k, 0, -var5 + 256);
          ch.m(119);
          if (150 <= fb.field_a) {
            ej.field_d.d(var3 + 15, 10 + var4, var5);
          } else {
            kj.field_l.d(var3, var4);
          }
        } else {
          ch.m(119);
          if (150 <= fb.field_a) {
            ej.field_d.d(var3 + 15, 10 + var4, var5);
            var6 = fb.field_a - 125;
            var7 = 43 / ((param1 + 18) / 54);
            if (var6 <= 0) {
              var6 = fb.field_a - 140;
              if (var6 > 0) {
                var8 = 256;
                if (var6 < 20) {
                  var8 = 256 * var6 / 20;
                }
                jd.field_g.d(15 + var3, var4 + 10, var8 * var5 >> 8);
              }
            } else {
              if (var6 >= 50) {
                var6 = fb.field_a - 140;
                if (var6 > 0) {
                  var8 = 256;
                  if (var6 < 20) {
                    var8 = 256 * var6 / 20;
                  }
                  jd.field_g.d(15 + var3, var4 + 10, var8 * var5 >> 8);
                }
              } else {
                if (var6 < 20) {
                  var8 = 256 * var6 / 20;
                  ha.field_E.a(var3, var4, var8);
                  var6 = fb.field_a - 140;
                  if (var6 > 0) {
                    var8 = 256;
                    if (var6 < 20) {
                      var8 = 256 * var6 / 20;
                    }
                    jd.field_g.d(15 + var3, var4 + 10, var8 * var5 >> 8);
                  }
                } else {
                  if (30 > var6) {
                    ha.field_E.a(var3, var4, 256);
                    var6 = fb.field_a - 140;
                    if (var6 > 0) {
                      var8 = 256;
                      if (var6 < 20) {
                        var8 = 256 * var6 / 20;
                      }
                      jd.field_g.d(15 + var3, var4 + 10, var8 * var5 >> 8);
                    }
                  } else {
                    var8 = (-(256 * var6) + 12800) / 20;
                    ha.field_E.a(var3, var4, var8);
                    var6 = fb.field_a - 140;
                    if (var6 > 0) {
                      var8 = 256;
                      if (var6 < 20) {
                        var8 = 256 * var6 / 20;
                      }
                      jd.field_g.d(15 + var3, var4 + 10, var8 * var5 >> 8);
                    }
                  }
                }
              }
            }
            return;
          }
          kj.field_l.d(var3, var4);
        }
        var6Lifetime1 = fb.field_a - 125;
        var7Lifetime1 = 43 / ((param1 + 18) / 54);
        if (var6Lifetime1 > 0 &&
          var6Lifetime1 < 50) {
          if (var6Lifetime1 < 20) {
            var8Lifetime1 = 256 * var6Lifetime1 / 20;
            ha.field_E.a(var3, var4, var8Lifetime1);
          } else {
            if (30 > var6Lifetime1) {
              ha.field_E.a(var3, var4, 256);
            } else {
              var8Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
              ha.field_E.a(var3, var4, var8Lifetime1);
            }
          }
        }
        var6Lifetime2 = fb.field_a - 140;
        if (var6Lifetime2 > 0) {
          var8Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var8Lifetime2 = 256 * var6Lifetime2 / 20;
          }
          jd.field_g.d(15 + var3, var4 + 10, var8Lifetime2 * var5 >> 8);
        }
        return;
    }

    public static void c(byte param0) {
        field_A = null;
        if (param0 != -81) {
          field_A = (int[]) null;
        }
    }

    final int a(byte param0) {
        if (null == this.field_x) {
          return 0;
        }
        if (param0 == 43) {
          return this.field_x.field_k * 100 / (this.field_x.field_j.length - this.field_B);
        }
        field_y = -41;
        return this.field_x.field_k * 100 / (this.field_x.field_j.length - this.field_B);
    }

    final byte[] g(int param0) {
        if (param0 != 512) {
          return (byte[]) null;
        }
        if (this.field_w) {
          throw new RuntimeException();
        }
        if (-this.field_B + this.field_x.field_j.length <= this.field_x.field_k) {
          return this.field_x.field_j;
        }
        throw new RuntimeException();
    }

    hi() {
    }

    static {
    }
}
