/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends pn {
    static int field_h;
    static kv field_g;

    final static ee[] a(int param0, vr param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ee[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (g.a(param3, param2, -30744, param1)) {
              int discarded$2 = 200;
              stackOut_3_0 = hca.b();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ee[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kn.A(").append(-7726).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void b(jo param0, int param1) {
        RuntimeException var3 = null;
        aj var3_ref = null;
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3_ref = new aj(0, 0);
            var4 = -1;
            L1: while (true) {
              if (var4 >= param0.field_a + -1) {
                var4 = -1;
                L2: while (true) {
                  if (var4 >= -1 + param0.field_z) {
                    L3: {
                      var10 = param0.a(0, (byte) 107, 0);
                      ((kn) this).field_a[0].e(-128 + var10.field_c, -128 + var10.field_a);
                      var11 = param0.a(0, (byte) 77, param0.field_a);
                      if (param1 == -13319) {
                        break L3;
                      } else {
                        kn.b(-107);
                        break L3;
                      }
                    }
                    ((kn) this).field_a[3].e(var11.field_c + -64, 32 + var11.field_a + -128);
                    var12 = param0.a(param0.field_z, (byte) 118, param0.field_a);
                    ((kn) this).field_a[2].e(-128 + var12.field_c, var12.field_a + -64);
                    var13 = param0.a(param0.field_z, (byte) 43, 0);
                    ((kn) this).field_a[1].e(-128 + (var13.field_c + -64), 32 + (var13.field_a + -128));
                    break L0;
                  } else {
                    L4: {
                      var8 = param0.a(var4, (byte) -103, 0);
                      if (param0.field_z - 2 > var4) {
                        ((kn) this).field_b[1 + var4 % 3 + 24].a(-128 + var8.field_c, var8.field_a);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var4 >= 0) {
                        ((kn) this).field_b[9 + var4 % 3 + 1].a(var8.field_c + -128, var8.field_a + -64);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var9 = param0.a(var4, (byte) 119, param0.field_a);
                      if (0 >= var4) {
                        break L6;
                      } else {
                        ((kn) this).field_b[34 + var4 % 3].a(var9.field_c, var9.field_a);
                        break L6;
                      }
                    }
                    L7: {
                      if (var4 >= 0) {
                        ((kn) this).field_b[49].a(var9.field_c, var9.field_a - -64);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  var6 = param0.a(0, (byte) 100, var4);
                  ((kn) this).field_b[18 + var4 % 3].a(var6.field_c - -128, var6.field_a);
                  ((kn) this).field_b[2 - -(var4 % 3)].a(var6.field_c - -128, -64 + var6.field_a);
                  var7 = param0.a(param0.field_z, (byte) -96, var4);
                  if (var4 <= 0) {
                    break L8;
                  } else {
                    ((kn) this).field_b[var4 % 2 + 42].a(var7.field_c, var7.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (0 <= var4) {
                    ((kn) this).field_b[57].a(var7.field_c, 64 + var7.field_a);
                    break L9;
                  } else {
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
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("kn.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ')');
        }
    }

    private final void b() {
        ((kn) this).field_a = new kv[4];
        kv var6 = new kv(384, 192);
        kv var2 = var6;
        var6.b();
        ((kn) this).field_b[0].a(128, 0);
        ((kn) this).field_b[8].a(64, 32);
        ((kn) this).field_b[1].a(192, 32);
        ((kn) this).field_b[16].a(128, 64);
        ((kn) this).field_a[0] = var6;
        kv var3 = new kv(384, 192);
        var3.b();
        ((kn) this).field_b[13].a(128, 0);
        ((kn) this).field_b[14].a(64, 32);
        ((kn) this).field_b[28].a(192, 32);
        ((kn) this).field_b[40].a(128, 64);
        ((kn) this).field_b[41].a(192, 96);
        ((kn) this).field_b[56].a(128, 128);
        ((kn) this).field_a[1] = var3;
        kv var4 = new kv(384, 192);
        var4.b();
        ((kn) this).field_b[6].a(128, 0);
        ((kn) this).field_b[21].a(64, 32);
        ((kn) this).field_b[7].a(192, 32);
        ((kn) this).field_b[32].a(128, 64);
        ((kn) this).field_b[33].a(64, 96);
        ((kn) this).field_b[48].a(128, 128);
        ((kn) this).field_a[3] = var4;
        kv var5 = new kv(384, 192);
        var5.b();
        ((kn) this).field_b[38].a(128, 64);
        ((kn) this).field_b[44].a(64, 32);
        ((kn) this).field_b[37].a(192, 32);
        ((kn) this).field_b[57].a(0, 64);
        ((kn) this).field_b[49].a(256, 64);
        ((kn) this).field_b[58].a(64, 96);
        ((kn) this).field_b[50].a(192, 96);
        ((kn) this).field_b[51].a(128, 128);
        ((kn) this).field_a[2] = var5;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 50) {
            jc discarded$0 = kn.a(42);
        }
    }

    kn(vr param0) {
        try {
            ((kn) this).field_b = bla.a(29611, "basic", "tiles_curry", param0);
            int discarded$0 = -5;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static jc a(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        jc var2 = null;
        jc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        jc stackOut_5_0 = null;
        if (param0 == 128) {
          try {
            var1_int = 0;
            L0: while (true) {
              var2 = bga.field_l.a((byte) -108, var1_int);
              if (var2.field_w) {
                stackOut_5_0 = (jc) var2;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var1_int++;
                continue L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
            return null;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
