/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends pn {
    static int field_h;
    static kv field_g;

    final static ee[] a(int param0, vr param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ee[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (g.a(param3, param2, param0 + -23018, param1)) {
              L1: {
                if (param0 == -7726) {
                  break L1;
                } else {
                  kn.a(-95);
                  break L1;
                }
              }
              stackIn_6_0 = hca.b(200);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("kn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ee[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void b(jo param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
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
            var4 = -1;
            L1: while (true) {
              if (var4 >= param0.field_a + -1) {
                var4 = -1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var4 >= -1 + param0.field_z) {
                        var10 = param0.a(0, (byte) 107, 0);
                        this.field_a[0].e(-128 + var10.field_c, -128 + var10.field_a);
                        var3 = param0.a(0, (byte) 77, param0.field_a);
                        if (param1 == -13319) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        var8 = param0.a(var4, (byte) -103, 0);
                        var3 = var8;
                        stackIn_16_0 = param0.field_z - 2 ^ -1;

                        stackIn_16_1 = var4 ^ -1;

                        L5: {
                          if (stackIn_16_0 < stackIn_16_1) {
                            this.field_b[1 + var4 % 3 + 24].a(-128 + var8.field_c, var8.field_a);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 >= (var4 ^ -1)) {
                            this.field_b[9 + var4 % 3 + 1].a(var8.field_c + -128, var8.field_a + -64);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var9 = param0.a(var4, (byte) 119, param0.field_a);
                          if (0 >= var4) {
                            break L7;
                          } else {
                            this.field_b[34 + var4 % 3].a(var9.field_c, var9.field_a);
                            break L7;
                          }
                        }
                        L8: {
                          if (var4 >= 0) {
                            this.field_b[49].a(var9.field_c, var9.field_a - -64);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var4++;
                        continue L2;
                      }
                    }
                    kn.b(-107);
                    break L3;
                  }
                  this.field_a[3].e(var3.field_c + -64, 32 + var3.field_a + -128);
                  var11 = param0.a(param0.field_z, (byte) 118, param0.field_a);
                  this.field_a[2].e(-128 + var11.field_c, var11.field_a + -64);
                  var12 = param0.a(param0.field_z, (byte) 43, 0);
                  this.field_a[1].e(-128 + (var12.field_c + -64), 32 + (var12.field_a + -128));
                  break L0;
                }
              } else {
                L9: {
                  var6 = param0.a(0, (byte) 100, var4);
                  this.field_b[18 + var4 % 3].a(var6.field_c - -128, var6.field_a);
                  this.field_b[2 - -(var4 % 3)].a(var6.field_c - -128, -64 + var6.field_a);
                  var7 = param0.a(param0.field_z, (byte) -96, var4);
                  if ((var4 ^ -1) >= -1) {
                    break L9;
                  } else {
                    this.field_b[var4 % 2 + 42].a(var7.field_c, var7.field_a);
                    break L9;
                  }
                }
                L10: {
                  if (0 <= var4) {
                    this.field_b[57].a(var7.field_c, 64 + var7.field_a);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3_ref);

            stackIn_34_1 = new StringBuilder().append("kn.B(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        this.field_a = new kv[4];
        if (param0 != -5) {
            return;
        }
        kv var6 = new kv(384, 192);
        kv var2 = var6;
        var6.b();
        this.field_b[0].a(128, 0);
        this.field_b[8].a(64, 32);
        this.field_b[1].a(192, 32);
        this.field_b[16].a(128, 64);
        this.field_a[0] = var6;
        kv var3 = new kv(384, 192);
        var3.b();
        this.field_b[13].a(128, 0);
        this.field_b[14].a(64, 32);
        this.field_b[28].a(192, 32);
        this.field_b[40].a(128, 64);
        this.field_b[41].a(192, 96);
        this.field_b[56].a(128, 128);
        this.field_a[1] = var3;
        kv var4 = new kv(384, 192);
        var4.b();
        this.field_b[6].a(128, 0);
        this.field_b[21].a(64, 32);
        this.field_b[7].a(192, 32);
        this.field_b[32].a(128, 64);
        this.field_b[33].a(64, 96);
        this.field_b[48].a(128, 128);
        this.field_a[3] = var4;
        kv var5 = new kv(384, 192);
        var5.b();
        this.field_b[38].a(128, 64);
        this.field_b[44].a(64, 32);
        this.field_b[37].a(192, 32);
        this.field_b[57].a(0, 64);
        this.field_b[49].a(256, 64);
        this.field_b[58].a(64, 96);
        this.field_b[50].a(192, 96);
        this.field_b[51].a(128, 128);
        this.field_a[2] = var5;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 50) {
            kn.a(42);
        }
    }

    kn(vr param0) {
        try {
            this.field_b = bla.a(29611, "basic", "tiles_curry", param0);
            this.b((byte) -5);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static jc a(int param0) {
        int var1_int = 0;
        jc var2 = null;
        jc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        if (param0 == 128) {
          try {
            L0: {
              var1_int = 0;
              L1: while (true) {
                var2 = bga.field_l.a((byte) -108, var1_int);
                if (var2.field_w) {
                  stackIn_6_0 = (jc) (var2);
                  break L0;
                } else {
                  var1_int++;
                  continue L1;
                }
              }
            }
          } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
            return null;
          }
          return stackIn_6_0;
        } else {
          return (jc) null;
        }
    }

    static {
    }
}
