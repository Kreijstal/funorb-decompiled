/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla extends pn {
    static long field_g;

    private final void b(byte param0) {
        this.field_a = new kv[4];
        kv var6 = new kv(384, 192);
        kv var2 = var6;
        var6.b();
        this.field_b[0].a(128, 64);
        this.field_b[1].a(192, 96);
        this.field_b[12].a(64, 96);
        this.field_a[0] = var6;
        kv var3 = new kv(384, 192);
        var3.b();
        this.field_b[13].a(128, 64);
        this.field_b[8].a(192, 32);
        this.field_b[24].a(192, 96);
        this.field_b[40].a(128, 128);
        this.field_a[1] = var3;
        kv var4 = new kv(384, 192);
        var4.b();
        if (param0 >= -51) {
            return;
        }
        this.field_b[6].a(128, 64);
        this.field_b[5].a(64, 32);
        this.field_b[16].a(64, 96);
        this.field_b[32].a(128, 128);
        this.field_a[3] = var4;
        kv var5 = new kv(384, 192);
        var5.b();
        this.field_b[19].a(128, 64);
        this.field_b[26].a(64, 32);
        this.field_b[18].a(192, 32);
        this.field_b[42].a(0, 64);
        this.field_b[34].a(256, 64);
        this.field_b[42].a(64, 96);
        this.field_b[34].a(192, 96);
        this.field_b[35].a(128, 128);
        this.field_a[2] = var5;
    }

    final void b(jo param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        aj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3 = new aj(0, 0);
            var4 = 0;
            L1: while (true) {
              if (var4 >= param0.field_a + -1) {
                var4 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (param0.field_z + -1 <= var4) {
                        var10 = param0.a(0, (byte) -104, 0);
                        this.field_a[0].e(-128 + var10.field_c, var10.field_a + -128);
                        var11 = param0.a(0, (byte) 91, param0.field_a);
                        this.field_a[3].e(var11.field_c - 64, var11.field_a + -128 + 32);
                        var3 = param0.a(param0.field_z, (byte) 66, param0.field_a);
                        if (param1 == -13319) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        var8 = param0.a(var4, (byte) 108, 0);
                        var3 = var8;
                        stackIn_16_0 = var4;

                        stackIn_16_1 = param0.field_z + -2;

                        L5: {
                          if (stackIn_16_0 < stackIn_16_1) {
                            this.field_b[var4 % 3 + 8 + 1].a(-128 + var8.field_c, var8.field_a);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          var9 = param0.a(var4, (byte) 64, param0.field_a);
                          if ((var4 ^ -1) >= -1) {
                            break L6;
                          } else {
                            this.field_b[17].a(var9.field_c, var9.field_a);
                            break L6;
                          }
                        }
                        L7: {
                          if (var4 < 1) {
                            this.field_b[33].a(var9.field_c, var9.field_a + 64);
                            break L7;
                          } else {
                            this.field_b[34].a(var9.field_c, 64 + var9.field_a);
                            break L7;
                          }
                        }
                        var4++;
                        continue L2;
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                  this.field_a[2].e(-128 + var3.field_c, var3.field_a + -64);
                  var12 = param0.a(param0.field_z, (byte) 122, 0);
                  this.field_a[1].e(var12.field_c + -192, 32 + var12.field_a + -128);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L8: {
                  var6 = param0.a(0, (byte) -103, var4);
                  this.field_b[2 + (var4 % 3 + 1)].a(var6.field_c - -128, var6.field_a);
                  var7 = param0.a(param0.field_z, (byte) 121, var4);
                  if (-1 <= (var4 ^ -1)) {
                    break L8;
                  } else {
                    this.field_b[25].a(var7.field_c, var7.field_a);
                    break L8;
                  }
                }
                L9: {
                  if ((var4 ^ -1) <= -2) {
                    this.field_b[42].a(var7.field_c, var7.field_a + 64);
                    break L9;
                  } else {
                    this.field_b[41].a(var7.field_c, var7.field_a + 64);
                    break L9;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3_ref);

            stackIn_31_1 = new StringBuilder().append("pla.B(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pla(vr param0) {
        try {
            this.field_b = bla.a(29611, "basic", "tiles_dessert", param0);
            this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
