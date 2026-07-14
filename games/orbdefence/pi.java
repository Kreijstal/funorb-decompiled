/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static uh field_j;
    private cd field_i;
    private mg field_f;
    private ge field_h;
    private java.math.BigInteger field_a;
    private java.math.BigInteger field_e;
    static String field_g;
    static String field_c;
    private vl field_d;
    private ak[] field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (!param0) {
            pi.a(true);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        mg var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (null == ((pi) this).field_f) {
          L0: {
            if (((pi) this).field_i != null) {
              break L0;
            } else {
              if (!((pi) this).field_h.d(-114)) {
                ((pi) this).field_i = ((pi) this).field_h.a(15937, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((pi) this).field_i.field_l) {
            L1: {
              L2: {
                var10 = new mg(((pi) this).field_i.f(0));
                var10.field_i = 5;
                var3 = var10.b((byte) 90);
                var10.field_i = var10.field_i + var3 * 72;
                var16 = new byte[var10.field_j.length + -var10.field_i];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a((byte) 126, var4, 0, var16.length);
                if (((pi) this).field_e == null) {
                  break L2;
                } else {
                  if (((pi) this).field_a == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((pi) this).field_e, ((pi) this).field_a);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) == -66) {
              var17 = ee.a(-1, -var16.length + (var10.field_i + -5), 5, var10.field_j);
              var7 = param0;
              L3: while (true) {
                if (var7 >= 64) {
                  ((pi) this).field_f = var10;
                  ((pi) this).field_b = new ak[var3];
                  return true;
                } else {
                  if (var17[var7] == var5[var7 - -1]) {
                    var7++;
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

    pi(ge param0, vl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final ak a(boolean param0, int param1, boolean param2, eh param3, eh param4) {
        if (null == ((pi) this).field_f) {
            throw new RuntimeException();
        }
        if (-1 >= (param1 ^ -1)) {
            // if_icmpge L35
        } else {
            throw new RuntimeException();
        }
        if (null != ((pi) this).field_b[param1]) {
            return ((pi) this).field_b[param1];
        }
        ((pi) this).field_f.field_i = 6 + param1 * 72;
        int var6 = ((pi) this).field_f.l(0);
        int var7 = ((pi) this).field_f.l(0);
        if (param2) {
            ((pi) this).field_f = null;
        }
        byte[] var11 = new byte[64];
        ((pi) this).field_f.a((byte) 123, var11, 0, 64);
        ak var9 = new ak(param1, param4, param3, ((pi) this).field_h, ((pi) this).field_d, var6, var11, var7, param0);
        ((pi) this).field_b[param1] = var9;
        return var9;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null != ((pi) this).field_b) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((pi) this).field_b.length) {
              var4 = param0;
              var2 = var4;
              L1: while (true) {
                if (var4 >= ((pi) this).field_b.length) {
                  return;
                } else {
                  if (((pi) this).field_b[var4] != null) {
                    ((pi) this).field_b[var4].a(true);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((pi) this).field_b[var2]) {
                ((pi) this).field_b[var2].e((byte) 57);
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

    final static void a(int param0, int param1, int param2) {
        lc.field_r = 1;
        dm.field_a = param2;
        da.field_B = param0;
        if (param1 != 19741) {
            field_g = null;
        }
    }

    private pi(ge param0, vl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((pi) this).field_h = param0;
        ((pi) this).field_e = param2;
        ((pi) this).field_a = param3;
        ((pi) this).field_d = param1;
        if (!((pi) this).field_h.d(-92)) {
            ((pi) this).field_i = ((pi) this).field_h.a(15937, 255, true, 255, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Checking";
        field_c = "Age:";
    }
}
