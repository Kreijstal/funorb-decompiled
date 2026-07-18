/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends nv {
    private int field_r;
    static int field_o;
    private int field_s;
    private int field_p;
    private boolean field_q;
    private String[] field_n;
    private int field_u;
    private int field_t;

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, ((oh) this).field_t >> 16, 10);
            param1.a((byte) -126, ((oh) this).field_p / 50, 6);
            param1.a((byte) 1, ((oh) this).field_s / 50, 6);
            param1.a((byte) 105, !((oh) this).field_q ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, fna[] param1) {
        dea var7 = null;
        fna[] var3 = null;
        int var4 = 0;
        fna var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            var7 = param1[0].field_c;
            dea var2 = var7;
            var3 = param1;
            for (var4 = 0; var3.length > var4; var4++) {
                var5 = var3[var4];
                var5.field_c = var7;
                var5.field_a = true;
            }
            param1[0].field_a = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oh.L(" + -91 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -29;
        }
        return 23;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            ((oh) this).field_n = fda.field_a;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oh.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            ((oh) this).field_p = 75;
            return param0;
        }
        return param0;
    }

    final static jea b() {
        return bsa.field_j.field_tb;
    }

    oh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((oh) this).field_r = 0;
        ((oh) this).field_p = 50;
        ((oh) this).field_u = 0;
        ((oh) this).field_s = 50;
        ((oh) this).field_q = true;
        ((oh) this).field_t = 8388608;
        try {
            ((oh) this).field_t = param1.b((byte) 44, 10) << 16;
            ((oh) this).field_p = param1.b((byte) 44, 6) * 50;
            ((oh) this).field_s = param1.b((byte) 44, 6) * 50;
            ((oh) this).field_q = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hca var9 = null;
        hr var10 = null;
        hca var11 = null;
        hr var12 = null;
        hr var13 = null;
        hr var14 = null;
        hca var15 = null;
        hr var16 = null;
        hr var18 = null;
        hr var20 = null;
        hca var21 = null;
        hr var22 = null;
        hr var23 = null;
        hr var24 = null;
        L0: {
          if (null == ((oh) this).field_n) {
            break L0;
          } else {
            if (0 != ((oh) this).field_n.length) {
              if (0 < ((oh) this).field_p) {
                if (((oh) this).field_r <= 0) {
                  var2 = ((oh) this).field_t >> 16;
                  if (param0 == 5418) {
                    var2 = var2 * var2;
                    var21 = ((oh) this).m((byte) 19);
                    var4 = ((oh) this).field_g.d(3) + -var21.d(param0 ^ 5417) >> 16;
                    var5 = ((oh) this).field_g.e(9648) + -var21.e(9648) >> 16;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 > var6) {
                      if (!((oh) this).field_q) {
                        var7 = ((oh) this).field_u;
                        ((oh) this).field_u = ((oh) this).field_u + 1;
                        if (((oh) this).field_n.length > ((oh) this).field_u) {
                          var23 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                          var23.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                          var23.a(0, 16777215, ((oh) this).field_n[var7]);
                          var23.a(65536, 0, -101, 0);
                          ((oh) this).field_r = ((oh) this).field_p;
                          return;
                        } else {
                          ((oh) this).field_u = 0;
                          var24 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                          var24.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                          var24.a(0, 16777215, ((oh) this).field_n[var7]);
                          var24.a(65536, 0, -101, 0);
                          ((oh) this).field_r = ((oh) this).field_p;
                          return;
                        }
                      } else {
                        var7 = ((oh) this).o((byte) 46).a(((oh) this).field_n.length, 0);
                        var22 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                        var22.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                        var22.a(0, 16777215, ((oh) this).field_n[var7]);
                        var22.a(65536, 0, -101, 0);
                        ((oh) this).field_r = ((oh) this).field_p;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    int discarded$4 = ((oh) this).a(-91, 115);
                    var2 = var2 * var2;
                    var15 = ((oh) this).m((byte) 19);
                    var4 = ((oh) this).field_g.d(3) + -var15.d(param0 ^ 5417) >> 16;
                    var5 = ((oh) this).field_g.e(9648) + -var15.e(9648) >> 16;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 > var6) {
                      if (!((oh) this).field_q) {
                        var7 = ((oh) this).field_u;
                        ((oh) this).field_u = ((oh) this).field_u + 1;
                        if (((oh) this).field_n.length > ((oh) this).field_u) {
                          var18 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                          var18.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                          var18.a(0, 16777215, ((oh) this).field_n[var7]);
                          var18.a(65536, 0, -101, 0);
                          ((oh) this).field_r = ((oh) this).field_p;
                          return;
                        } else {
                          ((oh) this).field_u = 0;
                          var20 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                          var20.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                          var20.a(0, 16777215, ((oh) this).field_n[var7]);
                          var20.a(65536, 0, -101, 0);
                          ((oh) this).field_r = ((oh) this).field_p;
                          return;
                        }
                      } else {
                        var7 = ((oh) this).o((byte) 46).a(((oh) this).field_n.length, 0);
                        var16 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                        var16.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                        var16.a(0, 16777215, ((oh) this).field_n[var7]);
                        var16.a(65536, 0, -101, 0);
                        ((oh) this).field_r = ((oh) this).field_p;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  ((oh) this).field_r = ((oh) this).field_r - 1;
                  return;
                }
              } else {
                var2 = ((oh) this).field_t >> 16;
                if (param0 == 5418) {
                  var2 = var2 * var2;
                  var11 = ((oh) this).m((byte) 19);
                  var4 = ((oh) this).field_g.d(3) + -var11.d(param0 ^ 5417) >> 16;
                  var5 = ((oh) this).field_g.e(9648) + -var11.e(9648) >> 16;
                  var6 = var4 * var4 - -(var5 * var5);
                  if (var2 > var6) {
                    if (!((oh) this).field_q) {
                      var7 = ((oh) this).field_u;
                      ((oh) this).field_u = ((oh) this).field_u + 1;
                      if (((oh) this).field_n.length > ((oh) this).field_u) {
                        var13 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                        var13.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                        var13.a(0, 16777215, ((oh) this).field_n[var7]);
                        var13.a(65536, 0, -101, 0);
                        ((oh) this).field_r = ((oh) this).field_p;
                        return;
                      } else {
                        ((oh) this).field_u = 0;
                        var14 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                        var14.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                        var14.a(0, 16777215, ((oh) this).field_n[var7]);
                        var14.a(65536, 0, -101, 0);
                        ((oh) this).field_r = ((oh) this).field_p;
                        return;
                      }
                    } else {
                      var7 = ((oh) this).o((byte) 46).a(((oh) this).field_n.length, 0);
                      var12 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                      var12.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                      var12.a(0, 16777215, ((oh) this).field_n[var7]);
                      var12.a(65536, 0, -101, 0);
                      ((oh) this).field_r = ((oh) this).field_p;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L1: {
                    int discarded$5 = ((oh) this).a(-91, 115);
                    var2 = var2 * var2;
                    var9 = ((oh) this).m((byte) 19);
                    var4 = ((oh) this).field_g.d(3) + -var9.d(param0 ^ 5417) >> 16;
                    var5 = ((oh) this).field_g.e(9648) + -var9.e(9648) >> 16;
                    var6 = var4 * var4 - -(var5 * var5);
                    if (var2 <= var6) {
                      break L1;
                    } else {
                      L2: {
                        if (!((oh) this).field_q) {
                          var7 = ((oh) this).field_u;
                          ((oh) this).field_u = ((oh) this).field_u + 1;
                          if (((oh) this).field_n.length <= ((oh) this).field_u) {
                            ((oh) this).field_u = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var7 = ((oh) this).o((byte) 46).a(((oh) this).field_n.length, 0);
                          break L2;
                        }
                      }
                      var10 = ((oh) this).b(true).a(((oh) this).field_g.d(3), ((oh) this).field_g.e(param0 ^ 12442), (byte) 100, ((oh) this).field_g.P(0));
                      var10.a(false, 8388608, 0, 8388608, ((oh) this).field_s);
                      var10.a(0, 16777215, ((oh) this).field_n[var7]);
                      var10.a(65536, 0, -101, 0);
                      ((oh) this).field_r = ((oh) this).field_p;
                      break L1;
                    }
                  }
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
