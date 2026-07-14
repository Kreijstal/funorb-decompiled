/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    private og field_e;
    private java.math.BigInteger field_b;
    static String[] field_a;
    static jk field_h;
    private java.math.BigInteger field_c;
    private sh field_i;
    private om[] field_g;
    static String field_j;
    private de field_d;
    private pc field_f;

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -16785) {
            bp.a(23);
        }
        field_a = null;
    }

    final om a(na param0, byte param1, boolean param2, int param3, na param4) {
        if (!(((bp) this).field_d != null)) {
            throw new RuntimeException();
        }
        if ((param3 ^ -1) <= -1) {
            // if_icmple L39
        } else {
            throw new RuntimeException();
        }
        if (!(((bp) this).field_g[param3] == null)) {
            return ((bp) this).field_g[param3];
        }
        ((bp) this).field_d.field_j = 72 * param3 - -6;
        if (param1 >= -99) {
            ((bp) this).field_b = null;
        }
        int var6 = ((bp) this).field_d.c(89);
        int var7 = ((bp) this).field_d.c(-95);
        byte[] var11 = new byte[64];
        ((bp) this).field_d.a(64, 0, var11, 11240);
        om var9 = new om(param3, param0, param4, ((bp) this).field_f, ((bp) this).field_i, var6, var11, var7, param2);
        ((bp) this).field_g[param3] = var9;
        return var9;
    }

    bp(pc param0, sh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        de var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = ZombieDawn.field_J;
        if (((bp) this).field_d != null) {
          return true;
        } else {
          L0: {
            if (null == ((bp) this).field_e) {
              if (!((bp) this).field_f.b(107)) {
                ((bp) this).field_e = ((bp) this).field_f.a((byte) 0, true, 255, (byte) -102, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((bp) this).field_e.field_q) {
            L1: {
              L2: {
                var10 = new de(((bp) this).field_e.d(0));
                var10.field_j = 5;
                var3 = var10.d((byte) -118);
                var10.field_j = var10.field_j + 72 * var3;
                var16 = new byte[var10.field_h.length + -var10.field_j];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, 0, var16, 11240);
                if (null == ((bp) this).field_b) {
                  break L2;
                } else {
                  if (((bp) this).field_c != null) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((bp) this).field_b, ((bp) this).field_c);
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
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = nl.a(5, -5 + (var10.field_j - var16.length), -117, var10.field_h);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  L4: {
                    if (param0 == 0) {
                      break L4;
                    } else {
                      field_j = null;
                      break L4;
                    }
                  }
                  ((bp) this).field_g = new om[var3];
                  ((bp) this).field_d = var10;
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
            }
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ZombieDawn.field_J;
        if (((bp) this).field_g == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((bp) this).field_g.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((bp) this).field_g.length <= var4) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      bp.a(79);
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (((bp) this).field_g[var4] != null) {
                    ((bp) this).field_g[var4].a(84);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((bp) this).field_g[var2]) {
                ((bp) this).field_g[var2].b(0);
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

    private bp(pc param0, sh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((bp) this).field_f = param0;
        ((bp) this).field_c = param3;
        ((bp) this).field_i = param1;
        ((bp) this).field_b = param2;
        if (!((bp) this).field_f.b(105)) {
            ((bp) this).field_e = ((bp) this).field_f.a((byte) 0, true, 255, (byte) 50, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Age:";
    }
}
