/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fwa {
    private pfa field_i;
    static llb field_a;
    static coa field_g;
    private java.math.BigInteger field_e;
    static int field_h;
    private ga[] field_f;
    private java.math.BigInteger field_b;
    private ona field_j;
    private km field_d;
    private ds field_c;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 5) {
            Object var2 = null;
            boolean discarded$0 = fwa.a(69, -75, (int[]) null);
        }
        field_g = null;
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ds var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = VoidHunters.field_G;
        if (null == ((fwa) this).field_c) {
          L0: {
            if (null != ((fwa) this).field_d) {
              break L0;
            } else {
              if (((fwa) this).field_j.d(74)) {
                return false;
              } else {
                ((fwa) this).field_d = ((fwa) this).field_j.a(true, -21, 255, (byte) 0, 255);
                break L0;
              }
            }
          }
          if (((fwa) this).field_d.field_n) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new ds(((fwa) this).field_d.a(-94));
                var10.field_e = 5;
                var3 = var10.e((byte) -108);
                var10.field_e = var10.field_e + 72 * var3;
                var16 = new byte[var10.field_h.length + -var10.field_e];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, var4, (byte) -59, var16.length);
                if (null == ((fwa) this).field_b) {
                  break L2;
                } else {
                  if (null == ((fwa) this).field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((fwa) this).field_b, ((fwa) this).field_e);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var17 = fqb.a((byte) 25, -var16.length + (var10.field_e - 5), var10.field_h, 5);
              if (param0) {
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    ((fwa) this).field_c = var10;
                    ((fwa) this).field_f = new ga[var3];
                    return true;
                  } else {
                    if (var17[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = VoidHunters.field_G;
        if (((fwa) this).field_f != null) {
          var2 = param0;
          L0: while (true) {
            if (((fwa) this).field_f.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (var4 >= ((fwa) this).field_f.length) {
                  return;
                } else {
                  if (((fwa) this).field_f[var4] != null) {
                    ((fwa) this).field_f[var4].b(-83);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((fwa) this).field_f[var2]) {
                ((fwa) this).field_f[var2].c(param0 + 0);
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

    final ga a(int param0, int param1, fo param2, fo param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        ga var9 = null;
        byte[] var11 = null;
        if (((fwa) this).field_c != null) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (((fwa) this).field_f.length > param0) {
                if (null == ((fwa) this).field_f[param0]) {
                  L1: {
                    ((fwa) this).field_c.field_e = 6 + 72 * param0;
                    var6 = ((fwa) this).field_c.h(param1 ^ 20);
                    var7 = ((fwa) this).field_c.h(47);
                    var11 = new byte[64];
                    ((fwa) this).field_c.a(0, var11, (byte) -59, 64);
                    var9 = new ga(param0, param3, param2, ((fwa) this).field_j, ((fwa) this).field_i, var6, var11, var7, param4);
                    if (param1 == 5) {
                      break L1;
                    } else {
                      boolean discarded$2 = ((fwa) this).a(false);
                      break L1;
                    }
                  }
                  ((fwa) this).field_f[param0] = var9;
                  return var9;
                } else {
                  return ((fwa) this).field_f[param0];
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

    final static boolean a(int param0, int param1, int[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = VoidHunters.field_G;
        if (param2 == null) {
          return false;
        } else {
          if (-1 != (param2.length ^ -1)) {
            var3 = -1;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (param2.length <= var4) {
                  break L1;
                } else {
                  if (param0 == param2[var4]) {
                    var3 = var4;
                    break L1;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
              if (-1 == var3) {
                return false;
              } else {
                var6 = var3 + param1;
                var4 = var6;
                L2: while (true) {
                  if (param2.length <= var6) {
                    param2[param2.length - 1] = param0;
                    return true;
                  } else {
                    param2[-1 + var6] = param2[var6];
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    fwa(ona param0, pfa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fwa(ona param0, pfa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((fwa) this).field_e = param3;
        ((fwa) this).field_b = param2;
        ((fwa) this).field_i = param1;
        ((fwa) this).field_j = param0;
        if (!((fwa) this).field_j.d(52)) {
            ((fwa) this).field_d = ((fwa) this).field_j.a(true, -21, 255, (byte) 0, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 6;
    }
}
