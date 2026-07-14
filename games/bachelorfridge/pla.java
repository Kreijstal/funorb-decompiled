/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla extends pn {
    static long field_g;

    private final void b(byte param0) {
        kv var2 = null;
        kv var3 = null;
        kv var4 = null;
        kv var5 = null;
        kv var6 = null;
        ((pla) this).field_a = new kv[4];
        var6 = new kv(384, 192);
        var2 = var6;
        var6.b();
        ((pla) this).field_b[0].a(128, 64);
        ((pla) this).field_b[1].a(192, 96);
        ((pla) this).field_b[12].a(64, 96);
        ((pla) this).field_a[0] = var6;
        var3 = new kv(384, 192);
        var3.b();
        ((pla) this).field_b[13].a(128, 64);
        ((pla) this).field_b[8].a(192, 32);
        ((pla) this).field_b[24].a(192, 96);
        ((pla) this).field_b[40].a(128, 128);
        ((pla) this).field_a[1] = var3;
        var4 = new kv(384, 192);
        var4.b();
        if (param0 < -51) {
          ((pla) this).field_b[6].a(128, 64);
          ((pla) this).field_b[5].a(64, 32);
          ((pla) this).field_b[16].a(64, 96);
          ((pla) this).field_b[32].a(128, 128);
          ((pla) this).field_a[3] = var4;
          var5 = new kv(384, 192);
          var5.b();
          ((pla) this).field_b[19].a(128, 64);
          ((pla) this).field_b[26].a(64, 32);
          ((pla) this).field_b[18].a(192, 32);
          ((pla) this).field_b[42].a(0, 64);
          ((pla) this).field_b[34].a(256, 64);
          ((pla) this).field_b[42].a(64, 96);
          ((pla) this).field_b[34].a(192, 96);
          ((pla) this).field_b[35].a(128, 128);
          ((pla) this).field_a[2] = var5;
          return;
        } else {
          return;
        }
    }

    final void b(jo param0, int param1) {
        aj var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var13 = null;
        var5 = BachelorFridge.field_y;
        var3 = new aj(0, 0);
        var4 = 0;
        L0: while (true) {
          if (var4 >= param0.field_a + -1) {
            var4 = 0;
            L1: while (true) {
              if (param0.field_z + -1 <= var4) {
                var10 = param0.a(0, (byte) -104, 0);
                ((pla) this).field_a[0].e(-128 + var10.field_c, var10.field_a + -128);
                var11 = param0.a(0, (byte) 91, param0.field_a);
                ((pla) this).field_a[3].e(var11.field_c - 64, var11.field_a + -128 + 32);
                var12 = param0.a(param0.field_z, (byte) 66, param0.field_a);
                if (param1 == -13319) {
                  ((pla) this).field_a[2].e(-128 + var12.field_c, var12.field_a + -64);
                  var13 = param0.a(param0.field_z, (byte) 122, 0);
                  ((pla) this).field_a[1].e(var13.field_c + -192, 32 + var13.field_a + -128);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  var8 = param0.a(var4, (byte) 108, 0);
                  if (var4 < param0.field_z + -2) {
                    ((pla) this).field_b[var4 % 3 + 8 + 1].a(-128 + var8.field_c, var8.field_a);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var9 = param0.a(var4, (byte) 64, param0.field_a);
                  if ((var4 ^ -1) >= -1) {
                    break L3;
                  } else {
                    ((pla) this).field_b[17].a(var9.field_c, var9.field_a);
                    break L3;
                  }
                }
                if (var4 < 1) {
                  ((pla) this).field_b[33].a(var9.field_c, var9.field_a + 64);
                  var4++;
                  continue L1;
                } else {
                  ((pla) this).field_b[34].a(var9.field_c, 64 + var9.field_a);
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            L4: {
              var6 = param0.a(0, (byte) -103, var4);
              ((pla) this).field_b[2 + (var4 % 3 + 1)].a(var6.field_c - -128, var6.field_a);
              var7 = param0.a(param0.field_z, (byte) 121, var4);
              if (-1 <= (var4 ^ -1)) {
                break L4;
              } else {
                ((pla) this).field_b[25].a(var7.field_c, var7.field_a);
                break L4;
              }
            }
            if ((var4 ^ -1) <= -2) {
              ((pla) this).field_b[42].a(var7.field_c, var7.field_a + 64);
              var4++;
              continue L0;
            } else {
              ((pla) this).field_b[41].a(var7.field_c, var7.field_a + 64);
              var4++;
              continue L0;
            }
          }
        }
    }

    pla(vr param0) {
        ((pla) this).field_b = bla.a(29611, "basic", "tiles_dessert", param0);
        this.b((byte) -117);
    }

    static {
    }
}
