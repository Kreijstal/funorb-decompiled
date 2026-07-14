/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static q field_l;
    static vj field_a;
    static int field_h;
    private de[] field_e;
    static he[] field_f;
    static boolean field_o;
    static he[] field_k;
    private n field_d;
    private od field_c;
    private java.math.BigInteger field_n;
    private cm field_i;
    private gb field_j;
    static vj field_m;
    private java.math.BigInteger field_g;
    static String field_b;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == ((df) this).field_e) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((df) this).field_e.length <= var2) {
              L1: {
                if (param0 == 64) {
                  break L1;
                } else {
                  ((df) this).field_n = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (((df) this).field_e.length <= var4) {
                  return;
                } else {
                  if (((df) this).field_e[var4] != null) {
                    ((df) this).field_e[var4].c(97);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((df) this).field_e[var2]) {
                ((df) this).field_e[var2].a(false);
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

    final de a(int param0, boolean param1, ik param2, ik param3, byte param4) {
        if (!(null != ((df) this).field_c)) {
            throw new RuntimeException();
        }
        if (param0 >= 0) {
            // if_icmpge L35
        } else {
            throw new RuntimeException();
        }
        if (!(((df) this).field_e[param0] == null)) {
            return ((df) this).field_e[param0];
        }
        ((df) this).field_c.field_j = param0 * 72 - -6;
        if (param4 < 64) {
            return null;
        }
        int var6 = ((df) this).field_c.h(-97);
        int var7 = ((df) this).field_c.h(9);
        byte[] var11 = new byte[64];
        ((df) this).field_c.b(0, 64, 128, var11);
        de var9 = new de(param0, param3, param2, ((df) this).field_j, ((df) this).field_d, var6, var11, var7, param1);
        ((df) this).field_e[param0] = var9;
        return var9;
    }

    df(gb param0, n param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0) {
        p.field_a.field_c = 0;
        p.field_a.field_h = 0;
        int var1 = 19 % ((54 - param0) / 39);
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        od var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((df) this).field_c != null) {
          return true;
        } else {
          L0: {
            if (((df) this).field_i != null) {
              break L0;
            } else {
              if (((df) this).field_j.a(true)) {
                return false;
              } else {
                ((df) this).field_i = ((df) this).field_j.a(255, 11259, (byte) 0, 255, true);
                break L0;
              }
            }
          }
          if (!((df) this).field_i.field_u) {
            L1: {
              L2: {
                var10 = new od(((df) this).field_i.i(13095));
                var10.field_j = 5;
                var3 = var10.l(31760);
                var10.field_j = var10.field_j + var3 * 72;
                var16 = new byte[-var10.field_j + var10.field_h.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.b(0, var16.length, 128, var16);
                if (null == ((df) this).field_n) {
                  break L2;
                } else {
                  if (((df) this).field_g != null) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((df) this).field_n, ((df) this).field_g);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            L3: {
              if (param0 == 64) {
                break L3;
              } else {
                field_f = null;
                break L3;
              }
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = b.a(5, 51, var10.field_h, -5 + var10.field_j + -var16.length);
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((df) this).field_e = new de[var3];
                  ((df) this).field_c = var10;
                  return true;
                } else {
                  if (var17[var7] != var5[1 + var7]) {
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

    public static void c(int param0) {
        field_a = null;
        field_k = null;
        int var1 = -124 % ((param0 - -2) / 60);
        field_b = null;
        field_l = null;
        field_f = null;
        field_m = null;
    }

    private df(gb param0, n param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((df) this).field_j = param0;
        ((df) this).field_d = param1;
        ((df) this).field_g = param3;
        ((df) this).field_n = param2;
        if (!((df) this).field_j.a(true)) {
            ((df) this).field_i = ((df) this).field_j.a(255, 11259, (byte) 0, 255, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
    }
}
