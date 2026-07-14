/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private ac field_b;
    private jp field_g;
    private co field_c;
    private java.math.BigInteger field_a;
    private gl[] field_f;
    private java.math.BigInteger field_j;
    static int field_d;
    static uc field_e;
    static ei field_l;
    private fj field_h;
    static String field_i;
    static int field_k;

    public static void a(int param0) {
        if (param0 != 21384) {
            field_i = null;
        }
        field_i = null;
        field_e = null;
        field_l = null;
    }

    bo(jp param0, co param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Torquing.field_u;
        if (((bo) this).field_f != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((bo) this).field_f.length) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((bo) this).a(true);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((bo) this).field_f.length) {
                  return;
                } else {
                  if (((bo) this).field_f[var4] != null) {
                    ((bo) this).field_f[var4].b(-1);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((bo) this).field_f[var2]) {
                ((bo) this).field_f[var2].c((byte) -94);
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

    final gl a(pb param0, byte param1, int param2, pb param3, boolean param4) {
        if (null == ((bo) this).field_h) {
            throw new RuntimeException();
        }
        if (param2 >= 0) {
            // if_icmpge L32
        } else {
            throw new RuntimeException();
        }
        if (!(((bo) this).field_f[param2] == null)) {
            return ((bo) this).field_f[param2];
        }
        ((bo) this).field_h.field_n = param2 * 72 - -6;
        int var6 = ((bo) this).field_h.c((byte) -127);
        int var7 = ((bo) this).field_h.c((byte) -49);
        byte[] var11 = new byte[64];
        ((bo) this).field_h.a(48, 64, var11, 0);
        gl var9 = new gl(param2, param0, param3, ((bo) this).field_g, ((bo) this).field_c, var6, var11, var7, param4);
        ((bo) this).field_f[param2] = var9;
        if (param1 != 101) {
            field_k = -42;
        }
        return var9;
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        fj var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Torquing.field_u;
        if (null != ((bo) this).field_h) {
          return true;
        } else {
          L0: {
            if (null == ((bo) this).field_b) {
              if (((bo) this).field_g.a(20)) {
                return false;
              } else {
                ((bo) this).field_b = ((bo) this).field_g.a((byte) 0, 255, true, (byte) -51, 255);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!((bo) this).field_b.field_r) {
            L1: {
              var10 = new fj(((bo) this).field_b.c((byte) 119));
              if (param0 == -74) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var10.field_n = 5;
                var3 = var10.i((byte) -101);
                var10.field_n = var10.field_n + 72 * var3;
                var16 = new byte[-var10.field_n + var10.field_j.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(48, var16.length, var16, 0);
                if (null == ((bo) this).field_j) {
                  break L3;
                } else {
                  if (((bo) this).field_a == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((bo) this).field_j, ((bo) this).field_a);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = np.a(5, var10.field_j, -5 + (var10.field_n + -var16.length), -81);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((bo) this).field_f = new gl[var3];
                  ((bo) this).field_h = var10;
                  return true;
                } else {
                  if (var5[var7 - -1] != var17[var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    private bo(jp param0, co param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((bo) this).field_c = param1;
        ((bo) this).field_a = param3;
        ((bo) this).field_j = param2;
        ((bo) this).field_g = param0;
        if (!((bo) this).field_g.a(20)) {
            ((bo) this).field_b = ((bo) this).field_g.a((byte) 0, 255, true, (byte) -51, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for graphics";
        field_l = new ei();
    }
}
