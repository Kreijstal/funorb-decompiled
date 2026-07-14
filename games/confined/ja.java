/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    private pc field_c;
    private kg field_j;
    private java.math.BigInteger field_h;
    private tn field_i;
    private jf field_f;
    private tj[] field_a;
    private java.math.BigInteger field_e;
    static bi[] field_b;
    static int field_d;
    static String field_g;

    final static nf[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Confined.field_J ? 1 : 0;
        nf[] var1 = new nf[wc.field_hc];
        if (param0 > -65) {
            nf[] discarded$0 = ja.a(-63);
        }
        for (var2 = 0; wc.field_hc > var2; var2++) {
            var3 = sd.field_f[var2] * rg.field_I[var2];
            var4 = rj.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = an.field_p[va.a((int) var4[var6], 255)];
            }
            var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var5);
        }
        ql.a(false);
        return var1;
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        kg var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Confined.field_J ? 1 : 0;
        if (((ja) this).field_j == null) {
          L0: {
            if (((ja) this).field_i != null) {
              break L0;
            } else {
              if (!((ja) this).field_f.c(111)) {
                ((ja) this).field_i = ((ja) this).field_f.a(255, true, -1911606496, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((ja) this).field_i.field_v) {
            L1: {
              L2: {
                var10 = new kg(((ja) this).field_i.e((byte) 118));
                var10.field_n = 5;
                var3 = var10.c(32);
                var10.field_n = var10.field_n + 72 * var3;
                var16 = new byte[var10.field_m.length + -var10.field_n];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, (byte) 115, var16.length, var16);
                if (((ja) this).field_e == null) {
                  break L2;
                } else {
                  if (((ja) this).field_h == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((ja) this).field_e, ((ja) this).field_h);
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
                var17 = in.a(5, var10.field_m, -var16.length + var10.field_n + -5, -26879);
                if (!param0) {
                  break L3;
                } else {
                  boolean discarded$1 = ((ja) this).a(true);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((ja) this).field_j = var10;
                  ((ja) this).field_a = new tj[var3];
                  return true;
                } else {
                  if (var5[var7 - -1] == var17[var7]) {
                    var7++;
                    continue L4;
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

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        int var1 = 104 % ((43 - param0) / 52);
    }

    private ja(jf param0, pc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ja) this).field_c = param1;
        ((ja) this).field_e = param2;
        ((ja) this).field_h = param3;
        ((ja) this).field_f = param0;
        if (!((ja) this).field_f.c(-87)) {
            ((ja) this).field_i = ((ja) this).field_f.a(255, true, -1911606496, 255, (byte) 0);
        }
    }

    ja(jf param0, pc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 28) {
          if (null == ((ja) this).field_a) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (((ja) this).field_a.length <= var2) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((ja) this).field_a.length) {
                    return;
                  } else {
                    if (((ja) this).field_a[var4] != null) {
                      ((ja) this).field_a[var4].b((byte) 109);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (((ja) this).field_a[var2] != null) {
                  ((ja) this).field_a[var2].c((byte) -121);
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

    final static boolean c(byte param0) {
        if (param0 >= -53) {
            field_b = null;
            return true;
        }
        return true;
    }

    final tj a(ae param0, byte param1, boolean param2, int param3, ae param4) {
        int var6 = 0;
        int var7 = 0;
        tj var9 = null;
        byte[] var11 = null;
        if (null != ((ja) this).field_j) {
          L0: {
            if (param3 < 0) {
              break L0;
            } else {
              if (param3 < ((ja) this).field_a.length) {
                if (((ja) this).field_a[param3] == null) {
                  ((ja) this).field_j.field_n = 6 + 72 * param3;
                  var6 = ((ja) this).field_j.f((byte) 91);
                  if (param1 == -60) {
                    var7 = ((ja) this).field_j.f((byte) 115);
                    var11 = new byte[64];
                    ((ja) this).field_j.a(0, (byte) 86, 64, var11);
                    var9 = new tj(param3, param4, param0, ((ja) this).field_f, ((ja) this).field_c, var6, var11, var7, param2);
                    ((ja) this).field_a[param3] = var9;
                    return var9;
                  } else {
                    return null;
                  }
                } else {
                  return ((ja) this).field_a[param3];
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
        field_b = new bi[4];
        field_d = 48;
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
