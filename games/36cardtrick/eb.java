/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private java.math.BigInteger field_a;
    private gj field_j;
    private na field_k;
    static de field_l;
    private ch field_b;
    static int field_f;
    private pb field_e;
    private uc[] field_h;
    private java.math.BigInteger field_g;
    static int[] field_i;
    static int field_d;
    static ef field_c;

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        pb var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Main.field_T;
        if (null != ((eb) this).field_e) {
          return true;
        } else {
          L0: {
            if (((eb) this).field_k == null) {
              if (!((eb) this).field_b.a(false)) {
                ((eb) this).field_k = ((eb) this).field_b.a(true, -1640279264, 255, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (((eb) this).field_k.field_n) {
            return false;
          } else {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                ((eb) this).field_j = (gj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = new pb(((eb) this).field_k.b(true));
                var10.field_i = 5;
                var3 = var10.f(56);
                ((pb) var10).field_i = ((pb) var10).field_i + var3 * 72;
                var16 = new byte[-((pb) var10).field_i + ((pb) var10).field_g.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(57, var4, 0, var16.length);
                if (((eb) this).field_a == null) {
                  break L3;
                } else {
                  if (((eb) this).field_g == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((eb) this).field_a, ((eb) this).field_g);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var17 = ti.a(5, ((pb) var10).field_g, ((pb) var10).field_i + -var16.length + -5, 0);
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((eb) this).field_h = new uc[var3];
                  ((eb) this).field_e = (pb) var10;
                  return true;
                } else {
                  if (var5[1 + var7] == var17[var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          }
        }
    }

    final uc a(int param0, int param1, boolean param2, hc param3, hc param4) {
        if (null == ((eb) this).field_e) {
            throw new RuntimeException();
        }
        if (param0 >= 0) {
            // if_icmpge L32
        } else {
            throw new RuntimeException();
        }
        if (!(null == ((eb) this).field_h[param0])) {
            return ((eb) this).field_h[param0];
        }
        ((eb) this).field_e.field_i = param1 * param0 - -6;
        int var6 = ((eb) this).field_e.e((byte) 127);
        int var7 = ((eb) this).field_e.e((byte) 125);
        byte[] var11 = new byte[64];
        ((eb) this).field_e.a(63, var11, 0, 64);
        uc var9 = new uc(param0, param4, param3, ((eb) this).field_b, ((eb) this).field_j, var6, var11, var7, param2);
        ((eb) this).field_h[param0] = var9;
        return var9;
    }

    final static nc a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Main.field_T;
        int var2 = param1.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param0 != -3124) {
            eb.a(false);
        }
        return ij.field_i;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Main.field_T;
        if (param0 <= -1) {
          if (null == ((eb) this).field_h) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (var2 >= ((eb) this).field_h.length) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= ((eb) this).field_h.length) {
                    return;
                  } else {
                    if (null != ((eb) this).field_h[var2]) {
                      ((eb) this).field_h[var2].c(-3028);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != ((eb) this).field_h[var2]) {
                  ((eb) this).field_h[var2].c((byte) 118);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
        if (!param0) {
            field_i = (int[]) null;
        }
        field_c = null;
    }

    final static void a(le param0, int param1, int param2, String param3, int param4, byte param5, int param6, int param7, int param8) {
        cc.field_c = param4;
        al.field_c = param3;
        eh.field_l = param2;
        bi.field_b = param0;
        oj.field_d = param1;
        ak.field_O = param8;
        pf.field_h = param6;
        ej.field_kb = param7;
        if (param5 > -52) {
            eb.a(true);
        }
        dg.field_H = (ch) (Object) new a();
        sc.field_b = new gj(param0);
        ja.field_b = new eb(dg.field_H, sc.field_b);
    }

    private eb(ch param0, gj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private eb(ch param0, gj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((eb) this).field_a = param2;
        ((eb) this).field_b = param0;
        ((eb) this).field_g = param3;
        ((eb) this).field_j = param1;
        if (!((eb) this).field_b.a(false)) {
            ((eb) this).field_k = ((eb) this).field_b.a(true, -1640279264, 255, (byte) 0, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{1, 1, 2, 3, 5, 2, 3, 5, 1, 2, 3, 5, 2, 2, 3};
        field_l = new de(1, 2, 2, 0);
    }
}
