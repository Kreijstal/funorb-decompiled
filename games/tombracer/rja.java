/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends loa {
    static String field_c;
    static String field_b;
    static int field_e;
    private vna field_d;

    private final void a(hj param0, int param1, int param2, int param3) {
        oda var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        this.a(param3, param0, param2, param1);
        L0: while (true) {
          if (((rja) this).field_d.d((byte) 14)) {
            return;
          } else {
            var6 = ((rja) this).field_a.a(((rja) this).field_d.a((byte) -16), 0);
            var7 = 0;
            var5 = (oda) (Object) ((rja) this).field_d.f(-80);
            L1: while (true) {
              if (var6 == var7) {
                var19 = ((rja) this).a(4, param3 + -2354);
                var9 = var5.field_g;
                var10 = var5.field_f;
                var11 = 0;
                var12 = 0;
                L2: while (true) {
                  if (var11 != 0) {
                    continue L0;
                  } else {
                    if ((var12 ^ -1) <= -5) {
                      continue L0;
                    } else {
                      var13 = 2 * dma.field_k[var19[var12]][0] + var9;
                      var14 = var10 - -(dma.field_k[var19[var12]][1] * 2);
                      if (param0.a(var13, var14, (byte) -128)) {
                        if (0 == param0.b((byte) -5, var14, var13)) {
                          ((rja) this).a(var10, (byte) -42, param0, var9, var14, var13);
                          this.a(param3 + 0, param0, var9, var10);
                          var5.p(param3 ^ 30);
                          var11 = 1;
                          var12++;
                          continue L2;
                        } else {
                          var12++;
                          var12++;
                          continue L2;
                        }
                      } else {
                        var12++;
                        var12++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var5 = (oda) (Object) ((rja) this).field_d.e(param3 ^ 126);
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, hj param2, byte param3) {
        L0: {
          if (!param2.a(param0, param1, (byte) -128)) {
            break L0;
          } else {
            if (0 < param2.b((byte) -5, param1, param0)) {
              param2.a(param1, -1, 0, param0);
              ((rja) this).field_d.b((byte) -76, (vg) (Object) new oda(param0, param1));
              break L0;
            } else {
              if (param3 >= 93) {
                return;
              } else {
                field_b = null;
                return;
              }
            }
          }
        }
        if (param3 < 93) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    rja(qea param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != -21755) {
            rja.a(96);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    private final void a(int param0, hj param1, int param2, int param3) {
        param1.a(param3, 0, 0, param2);
        this.a(param2, param3 - 2, param1, (byte) 119);
        this.a(param2, param3 + 2, param1, (byte) 126);
        this.a(param2 + -2, param3, param1, (byte) 109);
        this.a(param2 + param0, param3, param1, (byte) 95);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        ((rja) this).field_d = new vna();
        if (param1 < 73) {
            return;
        }
        this.a(param2, param0, param3, 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Total";
        field_b = "Room: ";
    }
}
