/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    private java.math.BigInteger field_g;
    static String field_d;
    static String[] field_f;
    private java.math.BigInteger field_i;
    private jq[] field_k;
    private wq field_b;
    static String field_e;
    private ih field_a;
    private da field_c;
    private kg field_h;
    static mb field_j;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (null == ((co) this).field_k) {
          return;
        } else {
          L0: {
            if (param0 > 42) {
              break L0;
            } else {
              ((co) this).field_i = null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (((co) this).field_k.length <= var2) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= ((co) this).field_k.length) {
                  return;
                } else {
                  if (null != ((co) this).field_k[var2]) {
                    ((co) this).field_k[var2].c(1);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((co) this).field_k[var2]) {
                ((co) this).field_k[var2].b(20312);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    co(ih param0, kg param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        wq var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (null == ((co) this).field_b) {
          L0: {
            if (null != ((co) this).field_c) {
              break L0;
            } else {
              if (((co) this).field_a.a(2)) {
                return false;
              } else {
                ((co) this).field_c = ((co) this).field_a.a(-952050528, 255, (byte) 0, 255, true);
                break L0;
              }
            }
          }
          if (((co) this).field_c.field_u) {
            return false;
          } else {
            L1: {
              L2: {
                var11 = new wq(((co) this).field_c.c((byte) 56));
                var11.field_l = 5;
                var3 = var11.l(255);
                var11.field_l = var11.field_l + 72 * var3;
                var17 = new byte[var11.field_k.length + -var11.field_l];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(0, var4, 127, var17.length);
                if (null == ((co) this).field_i) {
                  break L2;
                } else {
                  if (null != ((co) this).field_g) {
                    var13 = new java.math.BigInteger(var17);
                    var7_ref = var13.modPow(((co) this).field_i, ((co) this).field_g);
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
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var18 = jd.a(var11.field_k, 5, -14970, var11.field_l + -var17.length + -5);
              var7 = 0;
              L3: while (true) {
                if (64 <= var7) {
                  L4: {
                    ((co) this).field_b = var11;
                    if (!param0) {
                      break L4;
                    } else {
                      var9 = null;
                      jq discarded$1 = ((co) this).a(34, true, (ve) null, -60, (ve) null);
                      break L4;
                    }
                  }
                  ((co) this).field_k = new jq[var3];
                  return true;
                } else {
                  if (var18[var7] != var5[var7 - -1]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = (-640 + kp.field_a) / 2;
        int var3 = hj.field_Yb * hj.field_Yb;
        int var4 = -(param0 * param0) + var3;
        qa.field_w.a(lb.field_d + -120 - 4 - 90, 90, var2 - var4 * 199 / var3, 199, (byte) 64);
        ak.field_d.a(-4 + (lb.field_d + -120), 0, 438 * var4 / var3 + (202 + var2), 438, (byte) 64);
        if (param1) {
            field_e = null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -35 % ((param0 - 34) / 39);
        field_j = null;
        field_d = null;
        field_f = null;
    }

    final jq a(int param0, boolean param1, ve param2, int param3, ve param4) {
        if (null == ((co) this).field_b) {
            throw new RuntimeException();
        }
        if ((param3 ^ -1) <= -1) {
            // if_icmpge L37
        } else {
            throw new RuntimeException();
        }
        if (!(null == ((co) this).field_k[param3])) {
            return ((co) this).field_k[param3];
        }
        ((co) this).field_b.field_l = param3 * 72 - -6;
        int var6 = -124 / ((param0 - -71) / 38);
        int var7 = ((co) this).field_b.e(255);
        int var8 = ((co) this).field_b.e(255);
        byte[] var12 = new byte[64];
        ((co) this).field_b.a(0, var12, 122, 64);
        jq var10 = new jq(param3, param4, param2, ((co) this).field_a, ((co) this).field_h, var7, var12, var8, param1);
        ((co) this).field_k[param3] = var10;
        return var10;
    }

    private co(ih param0, kg param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((co) this).field_g = param3;
        ((co) this).field_i = param2;
        ((co) this).field_h = param1;
        ((co) this).field_a = param0;
        if (!((co) this).field_a.a(2)) {
            ((co) this).field_c = ((co) this).field_a.a(-952050528, 255, (byte) 0, 255, true);
        }
    }

    final static void a(byte param0, vm param1) {
        fo.a(param1, 0);
        if (param0 >= -74) {
            field_d = null;
        }
    }

    final static int a(byte param0) {
        if (param0 != -53) {
            field_j = null;
        }
        return lk.field_p + -nc.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Hide lobby chat";
        field_d = "Hide players in <%0>'s game";
    }
}
