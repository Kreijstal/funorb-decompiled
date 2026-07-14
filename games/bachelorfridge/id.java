/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id extends pn {
    static String field_g;
    static kv field_h;
    static String field_j;
    static js field_i;

    id(vr param0) {
        ((id) this).field_b = bla.a(29611, "basic", "tiles_pizza", param0);
        this.a(128);
    }

    final static void e(int param0, int param1) {
        cq discarded$12 = ol.a(pja.field_a[param1][kla.a(3, m.field_a, -2147483648)], true);
        if (param0 != 49) {
            id.e(68, -5);
        }
    }

    final static void a(int param0, cq param1) {
        int var2 = -125 % ((-18 - param0) / 55);
        saa.field_a.b((tda) (Object) param1.field_i);
    }

    private final void a(int param0) {
        ((id) this).field_a = new kv[4];
        kv var6 = new kv(384, 192);
        kv var2 = var6;
        var6.b();
        ((id) this).field_b[48].a(64, 32);
        ((id) this).field_b[49].a(0, 64);
        ((id) this).field_b[0].a(128, 64);
        ((id) this).field_b[8].a(64, 96);
        ((id) this).field_b[1].a(192, 96);
        ((id) this).field_a[0] = var6;
        kv var3 = new kv(384, 192);
        var3.b();
        ((id) this).field_b[49].a(128, 0);
        ((id) this).field_b[49].a(64, 32);
        ((id) this).field_b[13].a(192, 32);
        ((id) this).field_b[50].a(0, 64);
        ((id) this).field_b[14].a(128, 64);
        ((id) this).field_b[40].a(64, 96);
        ((id) this).field_b[24].a(192, 96);
        ((id) this).field_b[41].a(128, param0);
        ((id) this).field_a[1] = var3;
        kv var4 = new kv(384, 192);
        var4.b();
        ((id) this).field_b[6].a(64, 32);
        ((id) this).field_b[7].a(128, 64);
        ((id) this).field_b[16].a(64, 96);
        ((id) this).field_b[32].a(192, 96);
        ((id) this).field_b[33].a(128, 128);
        ((id) this).field_a[3] = var4;
        kv var5 = new kv(384, 192);
        var5.b();
        ((id) this).field_b[29].a(64, 32);
        ((id) this).field_b[21].a(192, 32);
        ((id) this).field_b[42].a(0, 64);
        ((id) this).field_b[22].a(128, 64);
        ((id) this).field_b[34].a(256, 64);
        ((id) this).field_b[42].a(64, 96);
        ((id) this).field_b[34].a(192, 96);
        ((id) this).field_b[35].a(128, 128);
        ((id) this).field_a[2] = var5;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 35) {
            field_i = null;
        }
        field_h = null;
        field_j = null;
    }

    final static void a(vr param0, int param1) {
        dv.b(param0.a((byte) 123, "", "headers.packvorbis"));
        if (param1 != 64) {
            id.b(-45);
        }
        dv var2 = dv.a(param0, "jagex logo2.packvorbis", "");
        be discarded$0 = var2.b();
    }

    final void b(jo param0, int param1) {
        aj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var13 = null;
        aj var14 = null;
        aj var15 = null;
        var6 = BachelorFridge.field_y;
        var3 = new aj(0, 0);
        var4 = -1;
        L0: while (true) {
          if (var4 >= param0.field_a - 1) {
            var4 = -1;
            L1: while (true) {
              if (-1 + param0.field_z <= var4) {
                L2: {
                  if (param1 == -13319) {
                    break L2;
                  } else {
                    id.b(-37);
                    break L2;
                  }
                }
                var4 = -3;
                L3: while (true) {
                  if ((var4 ^ -1) >= 7) {
                    var12 = param0.a(0, (byte) -90, 0);
                    ((id) this).field_a[0].e(var12.field_c + -128, -128 + var12.field_a);
                    var13 = param0.a(0, (byte) 98, param0.field_a);
                    ((id) this).field_a[3].e(var13.field_c + -64, -128 + (var13.field_a + 32));
                    var14 = param0.a(param0.field_z, (byte) 35, param0.field_a);
                    ((id) this).field_a[2].e(-128 + var14.field_c, -64 + var14.field_a);
                    var15 = param0.a(param0.field_z, (byte) -98, 0);
                    ((id) this).field_a[1].e(-192 + var15.field_c, 32 + (-128 + var15.field_a));
                    return;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (1 + param0.field_z <= var5) {
                        var4--;
                        continue L3;
                      } else {
                        L5: {
                          var11 = param0.a(var5, (byte) 72, var4);
                          if (0 != var5) {
                            break L5;
                          } else {
                            ((id) this).field_b[48].a(var11.field_c - -64, -32 + var11.field_a);
                            break L5;
                          }
                        }
                        L6: {
                          if (var5 != param0.field_z) {
                            break L6;
                          } else {
                            ((id) this).field_b[50].a(var11.field_c + -64, 32 + var11.field_a);
                            break L6;
                          }
                        }
                        ((id) this).field_b[49].a(var11.field_c, var11.field_a);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  var9 = param0.a(var4, (byte) -104, 0);
                  if (param0.field_z - 2 > var4) {
                    ((id) this).field_b[9 - -(var4 % 3) + 1].a(var9.field_c - 128, var9.field_a);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-1 < (var4 ^ -1)) {
                    break L8;
                  } else {
                    ((id) this).field_b[49].a(-128 + var9.field_c, -64 + var9.field_a);
                    break L8;
                  }
                }
                L9: {
                  var10 = param0.a(var4, (byte) 47, param0.field_a);
                  if ((var4 ^ -1) >= -1) {
                    break L9;
                  } else {
                    ((id) this).field_b[var4 % 3 + 17].a(var10.field_c, var10.field_a);
                    break L9;
                  }
                }
                if (var4 >= 0) {
                  ((id) this).field_b[34].a(var10.field_c, var10.field_a + 64);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            L10: {
              var7 = param0.a(0, (byte) 70, var4);
              ((id) this).field_b[2 - -(var4 % 3)].a(var7.field_c - -128, var7.field_a);
              var8 = param0.a(param0.field_z, (byte) -128, var4);
              if (-1 > (var4 ^ -1)) {
                ((id) this).field_b[25 + var4 % 2].a(var8.field_c, var8.field_a);
                break L10;
              } else {
                break L10;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              ((id) this).field_b[42].a(var8.field_c, 64 + var8.field_a);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<col=ff0000>Failed!</col>";
        field_j = "Eating. Try dropping foods into your fridge.";
    }
}
