/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    private rb field_b;
    private gp field_h;
    static eg field_e;
    private java.math.BigInteger field_c;
    private un field_a;
    private java.math.BigInteger field_f;
    private fg[] field_g;
    static String field_i;
    private dk field_d;

    public static void b(int param0) {
        if (param0 != -14991) {
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static el a(wl param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte[] param7) {
        if (param6 != 9980) {
            field_i = (String) null;
        }
        if (!((wl) param0).field_Cc) {
            if (mg.a(param1, (byte) -26)) {
                // ifne L108
            }
            if (!((wl) param0).field_u) {
                return new el(param0, param4, param1, param2, fk.a(param1, 87), fk.a(param2, 61), param7, param5);
            }
            return new el(param0, 34037, param4, param1, param2, param3, param7, param5);
        }
        return new el(param0, 3553, param4, param1, param2, param3, param7, param5);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (null == ((wq) this).field_g) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((wq) this).field_g.length <= var2) {
              L1: {
                if (param0 >= 65) {
                  break L1;
                } else {
                  ((wq) this).field_g = (fg[]) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= ((wq) this).field_g.length) {
                  return;
                } else {
                  if (null != ((wq) this).field_g[var2]) {
                    ((wq) this).field_g[var2].a((byte) 89);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((wq) this).field_g[var2]) {
                ((wq) this).field_g[var2].b(-20254);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    wq(un param0, dk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final fg a(byte param0, bl param1, bl param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fg var10 = null;
        byte[] var12 = null;
        if (((wq) this).field_b != null) {
          L0: {
            var6 = -115 % ((param0 - 8) / 42);
            if ((param4 ^ -1) > -1) {
              break L0;
            } else {
              if (((wq) this).field_g.length > param4) {
                if (((wq) this).field_g[param4] == null) {
                  ((wq) this).field_b.field_g = 6 + param4 * 72;
                  var7 = ((wq) this).field_b.a((byte) 122);
                  var8 = ((wq) this).field_b.a((byte) 125);
                  var12 = new byte[64];
                  ((wq) this).field_b.a(0, 7186, 64, var12);
                  var10 = new fg(param4, param2, param1, ((wq) this).field_a, ((wq) this).field_d, var7, var12, var8, param3);
                  ((wq) this).field_g[param4] = var10;
                  return var10;
                } else {
                  return ((wq) this).field_g[param4];
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        rb var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (null == ((wq) this).field_b) {
          L0: {
            if (((wq) this).field_h == null) {
              if (!((wq) this).field_a.a(false)) {
                ((wq) this).field_h = ((wq) this).field_a.a(255, 255, -21, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((wq) this).field_h.field_p) {
            L1: {
              var10 = new rb(((wq) this).field_h.a(true));
              var10.field_g = 5;
              if (param0 > 2) {
                break L1;
              } else {
                boolean discarded$1 = ((wq) this).a(115);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = var10.g(-52);
                ((rb) var10).field_g = ((rb) var10).field_g + 72 * var3;
                var16 = new byte[((rb) var10).field_f.length - ((rb) var10).field_g];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, 7186, var16.length, var16);
                if (null == ((wq) this).field_f) {
                  break L3;
                } else {
                  if (null == ((wq) this).field_c) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((wq) this).field_f, ((wq) this).field_c);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if ((var5.length ^ -1) == -66) {
              var17 = qm.a(0, ((rb) var10).field_g + -var16.length + -5, ((rb) var10).field_f, 5);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  ((wq) this).field_g = new fg[var3];
                  ((wq) this).field_b = (rb) var10;
                  return true;
                } else {
                  if (var17[var7] == var5[var7 + 1]) {
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private wq(un param0, dk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((wq) this).field_d = param1;
        ((wq) this).field_a = param0;
        ((wq) this).field_f = param2;
        ((wq) this).field_c = param3;
        if (!((wq) this).field_a.a(false)) {
            ((wq) this).field_h = ((wq) this).field_a.a(255, 255, -21, true, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "arcade";
        field_e = new eg();
    }
}
