/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    private h field_i;
    private nh field_d;
    private tb[] field_c;
    private java.math.BigInteger field_e;
    static boolean field_b;
    private java.math.BigInteger field_g;
    static boolean field_f;
    private dh field_h;
    private wh field_a;

    qi(h param0, wh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (((qi) this).field_c != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((qi) this).field_c.length) {
              var2 = param0;
              L1: while (true) {
                if (var2 >= ((qi) this).field_c.length) {
                  return;
                } else {
                  if (null != ((qi) this).field_c[var2]) {
                    ((qi) this).field_c[var2].e((byte) -51);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((qi) this).field_c[var2]) {
                ((qi) this).field_c[var2].d((byte) -21);
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

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        dh var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Terraphoenix.field_V;
        if (((qi) this).field_h != null) {
          return true;
        } else {
          L0: {
            if (null != ((qi) this).field_d) {
              break L0;
            } else {
              if (!((qi) this).field_i.d(-21)) {
                ((qi) this).field_d = ((qi) this).field_i.a(255, true, 255, (byte) 102, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((qi) this).field_d.field_A) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new dh(((qi) this).field_d.b(param0));
                var10.field_k = 5;
                var3 = var10.a(-16384);
                var10.field_k = var10.field_k + var3 * 72;
                var16 = new byte[var10.field_i.length - var10.field_k];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, 0, 90, var16);
                if (((qi) this).field_g == null) {
                  break L2;
                } else {
                  if (null == ((qi) this).field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((qi) this).field_g, ((qi) this).field_e);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (-66 != (var5.length ^ -1)) {
              throw new RuntimeException();
            } else {
              var17 = tg.a(var10.field_i, var10.field_k - var16.length - 5, 5, 8);
              var7 = 0;
              L3: while (true) {
                if ((var7 ^ -1) <= -65) {
                  ((qi) this).field_c = new tb[var3];
                  ((qi) this).field_h = var10;
                  return true;
                } else {
                  if (var5[1 + var7] != var17[var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    private qi(h param0, wh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((qi) this).field_i = param0;
        ((qi) this).field_g = param2;
        ((qi) this).field_e = param3;
        ((qi) this).field_a = param1;
        if (!((qi) this).field_i.d(-21)) {
            ((qi) this).field_d = ((qi) this).field_i.a(255, true, 255, (byte) 84, (byte) 0);
        }
    }

    final tb a(boolean param0, int param1, ua param2, ua param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        tb var9 = null;
        byte[] var11 = null;
        if (((qi) this).field_h != null) {
          L0: {
            if (-1 < (param1 ^ -1)) {
              break L0;
            } else {
              if (((qi) this).field_c.length > param1) {
                if (null != ((qi) this).field_c[param1]) {
                  return ((qi) this).field_c[param1];
                } else {
                  L1: {
                    ((qi) this).field_h.field_k = param1 * 72 - -6;
                    var6 = ((qi) this).field_h.f((byte) -107);
                    var7 = ((qi) this).field_h.f((byte) -107);
                    var11 = new byte[64];
                    if (param4 >= 89) {
                      break L1;
                    } else {
                      ((qi) this).field_g = null;
                      break L1;
                    }
                  }
                  ((qi) this).field_h.a(64, 0, 91, var11);
                  var9 = new tb(param1, param3, param2, ((qi) this).field_i, ((qi) this).field_a, var6, var11, var7, param0);
                  ((qi) this).field_c[param1] = var9;
                  return var9;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
    }
}
