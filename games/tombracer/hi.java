/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends nv {
    private int field_s;
    static String field_p;
    private int field_r;
    private int field_n;
    private int field_o;
    static int[] field_q;

    final void k(int param0) {
        ffa[] var3 = null;
        fsa var4 = null;
        int var5 = 0;
        ffa var6 = null;
        int var7 = 0;
        npa var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 5418) {
            break L0;
          } else {
            boolean discarded$3 = ((hi) this).p((byte) 4);
            break L0;
          }
        }
        this.b(0);
        var8 = ((hi) this).b(true).field_u;
        var3 = var8.a((byte) -26, (ffa) (Object) ((hi) this).field_g);
        var4 = ((hi) this).e(6);
        var5 = 0;
        L1: while (true) {
          if (var3.length <= var5) {
            return;
          } else {
            var6 = var3[var5];
            if (var6.a(-77)) {
              if ((Object) (Object) var6 != (Object) (Object) var4) {
                if (io.a(var6.c(param0 + -5435), ((hi) this).field_g.e(9648), (byte) -55, var6.a((byte) 55), ((hi) this).field_g.d(param0 + -5415), var6.e(9648), ((hi) this).field_g.a((byte) 55), ((hi) this).field_g.c(-21), var6.d(3))) {
                  boolean discarded$4 = var6.a(100, true, 1, ((hi) this).field_o, ((hi) this).field_n, 0);
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0) {
        int var2 = hua.a((byte) 111, ((hi) this).field_g.g(-25787) >> 2);
        int var3 = bua.a(0, ((hi) this).field_g.g(-25787) >> 2);
        ((hi) this).field_n = -gqa.a(((hi) this).field_r, (byte) 24, var2) - -gqa.a(((hi) this).field_s, (byte) 24, var3);
        ((hi) this).field_o = -gqa.a(((hi) this).field_s, (byte) 24, var2) + gqa.a(((hi) this).field_r, (byte) 24, var3);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            ((hi) this).field_o = -40;
        }
        return param0;
    }

    public static void c(int param0) {
        field_q = null;
        if (param0 != 6) {
            field_p = null;
        }
        field_p = null;
    }

    final int a(boolean param0) {
        if (param0) {
            return -20;
        }
        return 1;
    }

    final static iu[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        int var9 = 0;
        iu[] var10 = null;
        iu[] var11_ref_iu__ = null;
        int var11 = 0;
        int var12 = 0;
        iu var13 = null;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          var9 = param1 + (param5 - -param3);
          var10 = new iu[]{new iu(var9, var9), new iu(param6, var9), new iu(var9, var9), new iu(var9, param6), new iu(64, 64), new iu(var9, param6), new iu(var9, var9), new iu(param6, var9), new iu(var9, var9)};
          if (param7) {
            break L0;
          } else {
            hi.c(-100);
            break L0;
          }
        }
        var11_ref_iu__ = var10;
        var12 = 0;
        L1: while (true) {
          if (var11_ref_iu__.length <= var12) {
            var11 = 0;
            L2: while (true) {
              if (var11 >= param5) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param5) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param6) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param6 >> 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param1 <= var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_r[param6 * (-1 + -var12 + var9) + var11] = param0;
                                var10[3].field_r[var11 * var9 - (var12 + -var9 - -1)] = param0;
                                var10[7].field_r[param6 * var12 + var11] = param0;
                                var10[5].field_r[var9 * var11 - -var12] = param0;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param5 > var12) {
                            var10[7].field_r[param6 * (-var12 + (var9 + -1)) - -var11] = param8;
                            var10[5].field_r[-1 - -var9 - (var12 - var11 * var9)] = param8;
                            var10[1].field_r[param6 * var12 - -var11] = param4;
                            var10[3].field_r[var9 * var11 + var12] = param4;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_r[var9 * var11 + var12] = param4;
                        var10[0].field_r[var12 * var9 - -var11] = param4;
                        if (-var11 + var9 > var12) {
                          var10[2].field_r[var9 * var11 + var12] = param4;
                          var10[6].field_r[var9 * var12 - -var11] = param4;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_r[(-var11 + var9 - 1) * var9 + var12] = param8;
                    var10[8].field_r[var9 * (-1 + (-var11 + var9)) + var12] = param8;
                    var10[2].field_r[var12 * var9 + var9 + -1 - var11] = param8;
                    var10[8].field_r[var12 * var9 - -var9 + (-1 + -var11)] = param8;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_iu__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_r.length) {
                var12++;
                continue L1;
              } else {
                var13.field_r[var14] = param2;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final void h(int param0) {
        if (param0 != 28701) {
            return;
        }
        super.h(param0);
        ((hi) this).field_s = -((hi) this).field_s;
    }

    hi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((hi) this).field_s = bla.a(true, 4, param1.b((byte) 44, 4)) << 16;
            ((hi) this).field_r = bla.a(true, 4, param1.b((byte) 44, 4)) << 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            Object var3 = null;
            ((hi) this).a(false, (kh) null);
        }
        return true;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            param1.b((byte) 60, 3);
            this.b(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hi.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, dqa.a(true, ((hi) this).field_s >> 16, 4), 4);
            param1.a((byte) -127, dqa.a(true, ((hi) this).field_r >> 16, 4), 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hi.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[]{15, 35, 12, 18, 33};
    }
}
