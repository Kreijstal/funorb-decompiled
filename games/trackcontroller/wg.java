/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static int field_e;
    private be field_i;
    private sd field_f;
    private gd[] field_g;
    private ae field_a;
    static String field_h;
    private java.math.BigInteger field_b;
    private hi field_c;
    private java.math.BigInteger field_d;

    final static void b(int param0) {
        if (param0 <= 113) {
            field_h = null;
        }
        Object var2 = null;
        rg.a((wb) null, 14915);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (null != ((wg) this).field_g) {
          var2 = 0;
          L0: while (true) {
            if (((wg) this).field_g.length <= var2) {
              L1: {
                if (param0 == 95) {
                  break L1;
                } else {
                  ((wg) this).a((byte) -54);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((wg) this).field_g.length) {
                  return;
                } else {
                  if (((wg) this).field_g[var4] != null) {
                    ((wg) this).field_g[var4].b(false);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((wg) this).field_g[var2] != null) {
                ((wg) this).field_g[var2].a((byte) -41);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    wg(ae param0, sd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1) {
        nk.a(false, 40, param1);
        if (param0 >= -99) {
            wg.a(-69, false);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        be var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = TrackController.field_F ? 1 : 0;
        if (null == ((wg) this).field_i) {
          L0: {
            if (null == ((wg) this).field_c) {
              if (!((wg) this).field_a.d(-18316)) {
                ((wg) this).field_c = ((wg) this).field_a.a(255, true, false, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (((wg) this).field_c.field_w) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new be(((wg) this).field_c.g(512));
                var10.field_k = 5;
                var3 = var10.h(16383);
                var10.field_k = var10.field_k + 72 * var3;
                var16 = new byte[-var10.field_k + var10.field_j.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(122, var4, 0, var16.length);
                if (((wg) this).field_d == null) {
                  break L2;
                } else {
                  if (((wg) this).field_b == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((wg) this).field_d, ((wg) this).field_b);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (65 == var5.length) {
              L3: {
                var17 = cf.a(5, var10.field_j, -5 + var10.field_k - var16.length, -6196);
                if (param0 <= -62) {
                  break L3;
                } else {
                  ((wg) this).a((byte) -115);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((wg) this).field_i = var10;
                  ((wg) this).field_g = new gd[var3];
                  return true;
                } else {
                  if (var17[var7] == var5[var7 - -1]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return true;
        }
    }

    public static void c(int param0) {
        if (param0 != 6883) {
            wg.b(-95);
        }
        field_h = null;
    }

    final static nj a(byte param0, int param1, String param2) {
        nj var3 = new nj(false);
        var3.field_b = param1;
        int var4 = 109 / ((param0 - -54) / 61);
        var3.field_c = param2;
        return var3;
    }

    private wg(ae param0, sd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((wg) this).field_f = param1;
        ((wg) this).field_b = param3;
        ((wg) this).field_a = param0;
        ((wg) this).field_d = param2;
        if (!((wg) this).field_a.d(-18316)) {
            ((wg) this).field_c = ((wg) this).field_a.a(255, true, false, 255, (byte) 0);
        }
    }

    final gd a(int param0, int param1, hf param2, boolean param3, hf param4) {
        int var6 = 0;
        int var7 = 0;
        gd var9 = null;
        byte[] var11 = null;
        if (null != ((wg) this).field_i) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (param1 >= ((wg) this).field_g.length) {
                break L0;
              } else {
                if (((wg) this).field_g[param1] == null) {
                  L1: {
                    ((wg) this).field_i.field_k = param1 * 72 + 6;
                    var6 = ((wg) this).field_i.e((byte) 113);
                    if (param0 >= 67) {
                      break L1;
                    } else {
                      field_h = null;
                      break L1;
                    }
                  }
                  var7 = ((wg) this).field_i.e((byte) 113);
                  var11 = new byte[64];
                  ((wg) this).field_i.a(102, var11, 0, 64);
                  var9 = new gd(param1, param4, param2, ((wg) this).field_a, ((wg) this).field_f, var6, var11, var7, param3);
                  ((wg) this).field_g[param1] = var9;
                  return var9;
                } else {
                  return ((wg) this).field_g[param1];
                }
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = "Play free version";
    }
}
