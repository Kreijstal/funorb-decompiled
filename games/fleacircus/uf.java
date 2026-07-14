/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    private cg[] field_g;
    private af field_a;
    private java.math.BigInteger field_i;
    static dd field_f;
    static int[] field_b;
    static int[] field_e;
    private java.math.BigInteger field_d;
    private w field_m;
    static String field_l;
    private ni field_c;
    static int field_k;
    static int field_h;
    private fk field_j;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (((uf) this).field_g == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((uf) this).field_g.length) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((uf) this).field_g.length <= var4) {
                  L2: {
                    if (param0 == -23608) {
                      break L2;
                    } else {
                      ((uf) this).field_c = null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (((uf) this).field_g[var4] != null) {
                    ((uf) this).field_g[var4].b((byte) 123);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((uf) this).field_g[var2] != null) {
                ((uf) this).field_g[var2].a(false);
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

    final static StringBuilder a(int param0, StringBuilder param1, char param2, int param3) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var4 = param1.length();
        param1.setLength(param0);
        if (param3 >= -117) {
            return null;
        }
        for (var5 = var4; var5 < param0; var5++) {
            param1.setCharAt(var5, param2);
        }
        return param1;
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ni var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = fleas.field_A ? 1 : 0;
        if (((uf) this).field_c != null) {
          return true;
        } else {
          L0: {
            if (null != ((uf) this).field_j) {
              break L0;
            } else {
              if (!((uf) this).field_m.a(-110)) {
                ((uf) this).field_j = ((uf) this).field_m.a(127, true, 255, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((uf) this).field_j.field_q) {
            return false;
          } else {
            L1: {
              var10 = new ni(((uf) this).field_j.g(100));
              var10.field_i = 5;
              if (param0 < -127) {
                break L1;
              } else {
                field_k = 85;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = var10.e(false);
                var10.field_i = var10.field_i + 72 * var3;
                var16 = new byte[var10.field_k.length + -var10.field_i];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.b(var4, 0, -65, var16.length);
                if (null == ((uf) this).field_d) {
                  break L3;
                } else {
                  if (null == ((uf) this).field_i) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((uf) this).field_d, ((uf) this).field_i);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if ((var5.length ^ -1) == -66) {
              var17 = kb.a(var10.field_k, -5 + var10.field_i + -var16.length, (byte) 122, 5);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((uf) this).field_c = var10;
                  ((uf) this).field_g = new cg[var3];
                  return true;
                } else {
                  if (var5[var7 + 1] != var17[var7]) {
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
          }
        }
    }

    final cg a(int param0, boolean param1, ah param2, ah param3, int param4) {
        if (((uf) this).field_c == null) {
            throw new RuntimeException();
        }
        if (param4 >= 0) {
            // if_icmple L33
        } else {
            throw new RuntimeException();
        }
        if (!(null == ((uf) this).field_g[param4])) {
            return ((uf) this).field_g[param4];
        }
        ((uf) this).field_c.field_i = 72 * param4 - -6;
        int var6 = ((uf) this).field_c.c((byte) 127);
        int var7 = ((uf) this).field_c.c((byte) -28);
        byte[] var11 = new byte[64];
        if (param0 != 28742) {
            return null;
        }
        ((uf) this).field_c.b(var11, 0, -64, 64);
        cg var9 = new cg(param4, param2, param3, ((uf) this).field_m, ((uf) this).field_a, var6, var11, var7, param1);
        ((uf) this).field_g[param4] = var9;
        return var9;
    }

    uf(w param0, af param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
            field_k = -71;
        }
        field_e = null;
        field_b = null;
        field_f = null;
    }

    private uf(w param0, af param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((uf) this).field_i = param3;
        ((uf) this).field_a = param1;
        ((uf) this).field_d = param2;
        ((uf) this).field_m = param0;
        if (!((uf) this).field_m.a(86)) {
            ((uf) this).field_j = ((uf) this).field_m.a(127, true, 255, 255, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[150];
        field_b = new int[10];
        field_l = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
