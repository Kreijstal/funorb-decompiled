/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ng field_b;
    static byte[][] field_c;
    static dg field_d;
    static String field_e;
    static int field_a;

    final static void a(byte param0, String param1) {
        try {
            sa.a((byte) 68, param1);
            int var2_int = 17;
            m.a(ca.field_o, -127, false);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "rb.E(" + 112 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static db[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        db[] var10 = null;
        db[] var11_ref_db__ = null;
        int var11 = 0;
        int var12 = 0;
        db var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Lexicominos.field_L ? 1 : 0;
        var9 = 3;
        var10 = new db[]{new db(var9, var9), new db(3, var9), new db(var9, var9), new db(var9, 3), new db(64, 64), new db(var9, 3), new db(var9, var9), new db(3, var9), new db(var9, var9)};
        var11_ref_db__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_db__.length) {
            var11 = 0;
            L1: while (true) {
              if (1 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (3 <= var11) {
                        var11 = 0;
                        L4: while (true) {
                          if (1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (1 <= var12) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_y[var11 + 3 * (var9 + (-var12 - 1))] = 65793;
                                var10[3].field_y[-var12 + (var9 - (1 - var11 * var9))] = 65793;
                                var10[7].field_y[var11 + var12 * 3] = 65793;
                                var10[5].field_y[var11 * var9 + var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_y[var11 + (-1 + -var12 + var9) * 3] = 0;
                            var10[5].field_y[-var12 - 1 - -var9 + var9 * var11] = 0;
                            var10[1].field_y[var11 + var12 * 3] = 0;
                            var10[3].field_y[var12 + var11 * var9] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_y[var12 - -(var9 * var11)] = 0;
                        var10[0].field_y[var11 + var9 * var12] = 0;
                        if (var12 < -var11 + var9) {
                          var10[2].field_y[var9 * var11 + var12] = 0;
                          var10[6].field_y[var12 * var9 + var11] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_y[var9 * (-var11 + (var9 - 1)) - -var12] = 0;
                    var10[8].field_y[var9 * (-1 + var9 - var11) - -var12] = 0;
                    var10[2].field_y[-var11 - (1 + -var9 - var9 * var12)] = 0;
                    var10[8].field_y[var9 - 1 - var11 + var12 * var9] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_db__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_y.length) {
                var12++;
                continue L0;
              } else {
                var13.field_y[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        cg var1 = (cg) (Object) ca.field_n.a(true);
        if (!(var1 != null)) {
            ck.b((byte) -120);
            return;
        }
        th var2 = ig.field_a;
        int discarded$0 = var2.d((byte) 19);
        int discarded$1 = var2.d((byte) 19);
        int discarded$2 = var2.d((byte) 19);
        int discarded$3 = var2.d((byte) 19);
        var1.b((byte) -121);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        wj.c(param3 ^ -8662);
        if (param3 != 14635) {
            return;
        }
        try {
            ug.field_A.h(0);
            eb.field_b = new ti(dd.field_d, (String) null, ca.field_k, param2, param1);
            di.field_x = new qj(ug.field_A, (w) (Object) eb.field_b);
            ug.field_A.a(-14579, (w) (Object) di.field_x);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "rb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[250][];
        field_b = new ng();
        field_d = new dg();
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
