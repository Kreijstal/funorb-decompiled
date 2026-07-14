/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends pn {
    static int field_h;
    static kv field_g;

    final static ee[] a(int param0, vr param1, int param2, int param3) {
        if (!g.a(param3, param2, param0 + -23018, param1)) {
            return null;
        }
        if (param0 != -7726) {
            jc discarded$0 = kn.a(-95);
        }
        return hca.b(200);
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
        var4 = -1;
        L0: while (true) {
          if (var4 >= param0.field_a + -1) {
            var4 = -1;
            L1: while (true) {
              if (var4 >= -1 + param0.field_z) {
                L2: {
                  var10 = param0.a(0, (byte) 107, 0);
                  ((kn) this).field_a[0].e(-128 + var10.field_c, -128 + var10.field_a);
                  var11 = param0.a(0, (byte) 77, param0.field_a);
                  if (param1 == -13319) {
                    break L2;
                  } else {
                    kn.b(-107);
                    break L2;
                  }
                }
                ((kn) this).field_a[3].e(var11.field_c + -64, 32 + var11.field_a + -128);
                var12 = param0.a(param0.field_z, (byte) 118, param0.field_a);
                ((kn) this).field_a[2].e(-128 + var12.field_c, var12.field_a + -64);
                var13 = param0.a(param0.field_z, (byte) 43, 0);
                ((kn) this).field_a[1].e(-128 + (var13.field_c + -64), 32 + (var13.field_a + -128));
                return;
              } else {
                L3: {
                  var8 = param0.a(var4, (byte) -103, 0);
                  if (param0.field_z - 2 > var4) {
                    ((kn) this).field_b[1 + var4 % 3 + 24].a(-128 + var8.field_c, var8.field_a);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 >= (var4 ^ -1)) {
                    ((kn) this).field_b[9 + var4 % 3 + 1].a(var8.field_c + -128, var8.field_a + -64);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var9 = param0.a(var4, (byte) 119, param0.field_a);
                  if (0 >= var4) {
                    break L5;
                  } else {
                    ((kn) this).field_b[34 + var4 % 3].a(var9.field_c, var9.field_a);
                    break L5;
                  }
                }
                if (var4 >= 0) {
                  ((kn) this).field_b[49].a(var9.field_c, var9.field_a - -64);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            L6: {
              var6 = param0.a(0, (byte) 100, var4);
              ((kn) this).field_b[18 + var4 % 3].a(var6.field_c - -128, var6.field_a);
              ((kn) this).field_b[2 - -(var4 % 3)].a(var6.field_c - -128, -64 + var6.field_a);
              var7 = param0.a(param0.field_z, (byte) -96, var4);
              if ((var4 ^ -1) >= -1) {
                break L6;
              } else {
                ((kn) this).field_b[var4 % 2 + 42].a(var7.field_c, var7.field_a);
                break L6;
              }
            }
            if (0 <= var4) {
              ((kn) this).field_b[57].a(var7.field_c, 64 + var7.field_a);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0) {
        kv var2 = null;
        kv var3 = null;
        kv var4 = null;
        kv var5 = null;
        kv var6 = null;
        ((kn) this).field_a = new kv[4];
        if (param0 == -5) {
          var6 = new kv(384, 192);
          var2 = var6;
          var6.b();
          ((kn) this).field_b[0].a(128, 0);
          ((kn) this).field_b[8].a(64, 32);
          ((kn) this).field_b[1].a(192, 32);
          ((kn) this).field_b[16].a(128, 64);
          ((kn) this).field_a[0] = var6;
          var3 = new kv(384, 192);
          var3.b();
          ((kn) this).field_b[13].a(128, 0);
          ((kn) this).field_b[14].a(64, 32);
          ((kn) this).field_b[28].a(192, 32);
          ((kn) this).field_b[40].a(128, 64);
          ((kn) this).field_b[41].a(192, 96);
          ((kn) this).field_b[56].a(128, 128);
          ((kn) this).field_a[1] = var3;
          var4 = new kv(384, 192);
          var4.b();
          ((kn) this).field_b[6].a(128, 0);
          ((kn) this).field_b[21].a(64, 32);
          ((kn) this).field_b[7].a(192, 32);
          ((kn) this).field_b[32].a(128, 64);
          ((kn) this).field_b[33].a(64, 96);
          ((kn) this).field_b[48].a(128, 128);
          ((kn) this).field_a[3] = var4;
          var5 = new kv(384, 192);
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
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 50) {
            jc discarded$0 = kn.a(42);
        }
    }

    kn(vr param0) {
        ((kn) this).field_b = bla.a(29611, "basic", "tiles_curry", param0);
        this.b((byte) -5);
    }

    final static jc a(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        jc var2 = null;
        jc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        jc stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 128) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = bga.field_l.a((byte) -108, var1_int);
                        if (var2.field_w) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (jc) var2;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (jc) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1 = (IllegalArgumentException) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
