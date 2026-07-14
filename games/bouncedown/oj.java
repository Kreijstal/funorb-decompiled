/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    private ce[] field_h;
    private java.math.BigInteger field_e;
    private v field_d;
    private wi field_f;
    static double field_c;
    private vi field_a;
    private lf field_g;
    private java.math.BigInteger field_b;

    final ce a(boolean param0, vh param1, vh param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        ce var9 = null;
        byte[] var11 = null;
        if (((oj) this).field_f == null) {
          throw new RuntimeException();
        } else {
          L0: {
            if (0 > param3) {
              break L0;
            } else {
              if (((oj) this).field_h.length <= param3) {
                break L0;
              } else {
                if (null != ((oj) this).field_h[param3]) {
                  return ((oj) this).field_h[param3];
                } else {
                  L1: {
                    if (param4 == -18023) {
                      break L1;
                    } else {
                      ((oj) this).field_d = null;
                      break L1;
                    }
                  }
                  ((oj) this).field_f.field_h = 6 + 72 * param3;
                  var6 = ((oj) this).field_f.j(-3);
                  var7 = ((oj) this).field_f.j(-3);
                  var11 = new byte[64];
                  ((oj) this).field_f.a((byte) 125, 64, var11, 0);
                  var9 = new ce(param3, param1, param2, ((oj) this).field_d, ((oj) this).field_a, var6, var11, var7, param0);
                  ((oj) this).field_h[param3] = var9;
                  return var9;
                }
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (((oj) this).field_h != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((oj) this).field_h.length) {
              L1: {
                if (param0 == -16840) {
                  break L1;
                } else {
                  ((oj) this).field_b = null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= ((oj) this).field_h.length) {
                  return;
                } else {
                  if (null != ((oj) this).field_h[var2]) {
                    ((oj) this).field_h[var2].c(98);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((oj) this).field_h[var2]) {
                ((oj) this).field_h[var2].d(param0 + 19188);
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

    oj(v param0, vi param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(int param0) {
        int var2 = 0;
        wi var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        java.math.BigInteger var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var9 = Bounce.field_N;
        var2 = 67 / ((-16 - param0) / 55);
        if (null == ((oj) this).field_f) {
          L0: {
            if (((oj) this).field_g != null) {
              break L0;
            } else {
              if (!((oj) this).field_d.b(false)) {
                ((oj) this).field_g = ((oj) this).field_d.a(255, (byte) 0, -93, true, 255);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((oj) this).field_g.field_n) {
            L1: {
              L2: {
                var3 = new wi(((oj) this).field_g.d((byte) -116));
                var3.field_h = 5;
                var4 = var3.d((byte) -119);
                var3.field_h = var3.field_h + 72 * var4;
                var16 = new byte[var3.field_i.length + -var3.field_h];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var5 = var11;
                var3.a((byte) 126, var16.length, var16, 0);
                if (null == ((oj) this).field_e) {
                  break L2;
                } else {
                  if (null == ((oj) this).field_b) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var8_ref = var12.modPow(((oj) this).field_e, ((oj) this).field_b);
                    var6 = var8_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var6 = var5;
              break L1;
            }
            if (var6.length == 65) {
              var17 = jd.a(var3.field_i, 5, -5 + (var3.field_h - var16.length), 0);
              var8 = 0;
              L3: while (true) {
                if (var8 >= 64) {
                  ((oj) this).field_h = new ce[var4];
                  ((oj) this).field_f = var3;
                  return true;
                } else {
                  if (var17[var8] == var6[var8 - -1]) {
                    var8++;
                    continue L3;
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

    final static int a(kk param0, int param1, boolean param2) {
        int var3 = 15 % ((param1 - -69) / 48);
        return param0.a(-1, param2);
    }

    private oj(v param0, vi param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((oj) this).field_a = param1;
        ((oj) this).field_d = param0;
        ((oj) this).field_e = param2;
        ((oj) this).field_b = param3;
        if (!((oj) this).field_d.b(false)) {
            ((oj) this).field_g = ((oj) this).field_d.a(255, (byte) 0, 112, true, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0.0;
    }
}
