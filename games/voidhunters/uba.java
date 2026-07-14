/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends rqa {
    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (0 > nd.field_r) {
          return;
        } else {
          L0: {
            var3 = -135 + param1;
            var4 = param2 + -35;
            var5 = 256;
            if (nd.field_r <= -76) {
              break L0;
            } else {
              var5 = (nd.field_r << -198386520) / 75;
              break L0;
            }
          }
          L1: {
            if (-201 < nd.field_r) {
              var5 = (250 + -nd.field_r << 1149450280) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0 == 82) {
              break L2;
            } else {
              uba.a((byte) -71, -110, -57);
              break L2;
            }
          }
          L3: {
            de.a(74, ata.field_K);
            bfb.e();
            dma.a();
            pw.a((byte) 74);
            if (-257 >= (var5 ^ -1)) {
              break L3;
            } else {
              dma.e(0, 0, dma.field_g, dma.field_j, 0, -var5 + 256);
              break L3;
            }
          }
          L4: {
            bia.a((byte) 124);
            if (nd.field_r < 150) {
              ata.field_K.d(var3, var4);
              break L4;
            } else {
              cg.field_o.d(var3 + 15, 10 + var4, var5);
              break L4;
            }
          }
          L5: {
            var6 = nd.field_r - 125;
            if (0 >= var6) {
              break L5;
            } else {
              if (-51 >= (var6 ^ -1)) {
                break L5;
              } else {
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                  db.field_p.c(var3, var4, var7);
                  break L5;
                } else {
                  if (30 <= var6) {
                    var7 = (12800 - 256 * var6) / 20;
                    db.field_p.c(var3, var4, var7);
                    break L5;
                  } else {
                    db.field_p.c(var3, var4, 256);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + nd.field_r;
            if (0 < var6) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              reb.field_a.d(15 + var3, var4 + 10, var5 * var7 >> 98987848);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        gnb.field_a = param0[0].a(30);
        if (param1 >= -119) {
            Object var4 = null;
            nc discarded$0 = ((uba) this).a((nc[]) null, -7);
        }
        return new nc((Object) (Object) "void");
    }

    final static void a(byte param0, int param1, Object param2) {
        int var3_int = 0;
        qsa var4 = null;
        int var5 = VoidHunters.field_G;
        for (var3_int = 0; var3_int < hcb.field_p; var3_int++) {
            var4 = bjb.field_p[var3_int];
            if (param2 == var4.field_c) {
                if (1 == var4.field_a) {
                    var4.field_a = param1;
                }
                return;
            }
        }
        if (param0 != -100) {
            return;
        }
        qsa var3 = lua.a((byte) -86);
        if (var3 != null) {
            var3.field_c = param2;
            var3.field_a = param1;
        }
    }

    uba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
