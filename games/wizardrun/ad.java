/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private java.math.BigInteger field_e;
    static String field_c;
    private java.math.BigInteger field_g;
    private cd field_b;
    private fh[] field_i;
    private va field_h;
    private na field_a;
    private fi field_f;
    static java.math.BigInteger field_d;

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 72) {
            return -89;
        }
        return tf.a(-20232);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = wizardrun.field_H;
        if (((ad) this).field_i == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ad) this).field_i.length) {
              L1: {
                var4 = 0;
                var2 = var4;
                if (param0 == -84) {
                  break L1;
                } else {
                  int discarded$1 = ad.a(-2, -101, true, -78);
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 >= ((ad) this).field_i.length) {
                  return;
                } else {
                  if (((ad) this).field_i[var4] != null) {
                    ((ad) this).field_i[var4].c((byte) 25);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((ad) this).field_i[var2]) {
                ((ad) this).field_i[var2].a(param0 + 81);
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

    final boolean b(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        va var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = wizardrun.field_H;
        if (((ad) this).field_h == null) {
          L0: {
            if (((ad) this).field_f != null) {
              break L0;
            } else {
              if (!((ad) this).field_a.a(param0 + 3490)) {
                ((ad) this).field_f = ((ad) this).field_a.a(255, 255, (byte) -94, (byte) 0, true);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((ad) this).field_f.field_s) {
            L1: {
              L2: {
                var10 = new va(((ad) this).field_f.d(95));
                var10.field_m = 5;
                var3 = var10.f(255);
                var10.field_m = var10.field_m + 72 * var3;
                var16 = new byte[var10.field_k.length - var10.field_m];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(true, var16.length, var16, 0);
                if (((ad) this).field_g == null) {
                  break L2;
                } else {
                  if (((ad) this).field_e == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((ad) this).field_g, ((ad) this).field_e);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (-66 == (var5.length ^ -1)) {
              L3: {
                var17 = id.a(var10.field_k, 0, -5 + (-var16.length + var10.field_m), 5);
                if (param0 == -17) {
                  break L3;
                } else {
                  ad.a(-98);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((ad) this).field_i = new fh[var3];
                  ((ad) this).field_h = var10;
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

    final fh a(boolean param0, int param1, sg param2, int param3, sg param4) {
        if (((ad) this).field_h == null) {
            throw new RuntimeException();
        }
        if ((param3 ^ -1) <= -1) {
            // if_icmpge L36
        } else {
            throw new RuntimeException();
        }
        if (null != ((ad) this).field_i[param3]) {
            return ((ad) this).field_i[param3];
        }
        ((ad) this).field_h.field_m = param1 * param3 + 6;
        int var6 = ((ad) this).field_h.i(255);
        int var7 = ((ad) this).field_h.i(param1 + 183);
        byte[] var11 = new byte[64];
        ((ad) this).field_h.a(true, 64, var11, 0);
        fh var9 = new fh(param3, param2, param4, ((ad) this).field_a, ((ad) this).field_b, var6, var11, var7, param0);
        ((ad) this).field_i[param3] = var9;
        return var9;
    }

    final static sf a(String param0, int param1) {
        if (we.field_c.a(true)) {
            if (!param0.equals((Object) (Object) we.field_c.b((byte) 8))) {
                we.field_c = ql.a(param0, false);
            }
        }
        if (param1 != 6) {
            return null;
        }
        return we.field_c;
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = -94 % ((param0 - -39) / 58);
        field_c = null;
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 <= 104) {
            return true;
        }
        return mi.a(param0, false, 0);
    }

    ad(na param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ad(na param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ad) this).field_b = param1;
        ((ad) this).field_g = param2;
        ((ad) this).field_e = param3;
        ((ad) this).field_a = param0;
        if (!((ad) this).field_a.a(3473)) {
            ((ad) this).field_f = ((ad) this).field_a.a(255, 255, (byte) -88, (byte) 0, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
