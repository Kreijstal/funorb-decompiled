/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends pn {
    static int field_h;
    static kv field_g;

    final static ee[] a(int param0, vr param1, int param2, int param3) {
        jc discarded$2 = null;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ee[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ee[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (g.a(param3, param2, param0 + -23018, param1)) {
              L1: {
                if (param0 == -7726) {
                  break L1;
                } else {
                  discarded$2 = kn.a(-95);
                  break L1;
                }
              }
              stackOut_5_0 = hca.b(200);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
                      this.field_a[0].e(-128 + var10.field_c, -128 + var10.field_a);
                      var11 = param0.a(0, (byte) 77, param0.field_a);
                      if (param1 == -13319) {
                        break L3;
                      } else {
                        kn.b(-107);
                        break L3;
                      }
                    }
                    this.field_a[3].e(var11.field_c + -64, 32 + var11.field_a + -128);
                    var12 = param0.a(param0.field_z, (byte) 118, param0.field_a);
                    this.field_a[2].e(-128 + var12.field_c, var12.field_a + -64);
                    var13 = param0.a(param0.field_z, (byte) 43, 0);
                    this.field_a[1].e(-128 + (var13.field_c + -64), 32 + (var13.field_a + -128));
                    break L0;
                  } else {
                    L4: {
                      var8 = param0.a(var4, (byte) -103, 0);
                      if (param0.field_z - 2 > var4) {
                        this.field_b[1 + var4 % 3 + 24].a(-128 + var8.field_c, var8.field_a);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 >= (var4 ^ -1)) {
                        this.field_b[9 + var4 % 3 + 1].a(var8.field_c + -128, var8.field_a + -64);
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
                        this.field_b[34 + var4 % 3].a(var9.field_c, var9.field_a);
                        break L6;
                      }
                    }
                    L7: {
                      if (var4 >= 0) {
                        this.field_b[49].a(var9.field_c, var9.field_a - -64);
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
                  this.field_b[18 + var4 % 3].a(var6.field_c - -128, var6.field_a);
                  this.field_b[2 - -(var4 % 3)].a(var6.field_c - -128, -64 + var6.field_a);
                  var7 = param0.a(param0.field_z, (byte) -96, var4);
                  if ((var4 ^ -1) >= -1) {
                    break L8;
                  } else {
                    this.field_b[var4 % 2 + 42].a(var7.field_c, var7.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (0 <= var4) {
                    this.field_b[57].a(var7.field_c, 64 + var7.field_a);
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
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("kn.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        kv var2 = null;
        kv var3 = null;
        kv var4 = null;
        kv var5 = null;
        kv var6 = null;
        this.field_a = new kv[4];
        if (param0 == -5) {
          var6 = new kv(384, 192);
          var2 = var6;
          var6.b();
          this.field_b[0].a(128, 0);
          this.field_b[8].a(64, 32);
          this.field_b[1].a(192, 32);
          this.field_b[16].a(128, 64);
          this.field_a[0] = var6;
          var3 = new kv(384, 192);
          var3.b();
          this.field_b[13].a(128, 0);
          this.field_b[14].a(64, 32);
          this.field_b[28].a(192, 32);
          this.field_b[40].a(128, 64);
          this.field_b[41].a(192, 96);
          this.field_b[56].a(128, 128);
          this.field_a[1] = var3;
          var4 = new kv(384, 192);
          var4.b();
          this.field_b[6].a(128, 0);
          this.field_b[21].a(64, 32);
          this.field_b[7].a(192, 32);
          this.field_b[32].a(128, 64);
          this.field_b[33].a(64, 96);
          this.field_b[48].a(128, 128);
          this.field_a[3] = var4;
          var5 = new kv(384, 192);
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
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        jc discarded$0 = null;
        field_g = null;
        if (param0 != 50) {
            discarded$0 = kn.a(42);
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
        IllegalArgumentException var1 = null;
        jc var2 = null;
        jc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        jc stackOut_5_0 = null;
        if (param0 == 128) {
          try {
            L0: {
              var1_int = 0;
              L1: while (true) {
                var2 = bga.field_l.a((byte) -108, var1_int);
                if (var2.field_w) {
                  stackOut_5_0 = (jc) (var2);
                  stackIn_6_0 = stackOut_5_0;
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
