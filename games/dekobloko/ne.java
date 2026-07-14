/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private le[] field_h;
    private wl field_a;
    static byte[] field_c;
    private im field_f;
    static String field_b;
    static String field_d;
    private pj field_j;
    private dd field_i;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_e;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param0 != 255) {
            return -17;
        }
        return qm.a((byte) 57);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        wl var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = client.field_A ? 1 : 0;
        if (null != ((ne) this).field_a) {
          return true;
        } else {
          L0: {
            if (null == ((ne) this).field_j) {
              if (!((ne) this).field_i.a(true)) {
                ((ne) this).field_j = ((ne) this).field_i.a(true, (byte) 0, param0, 255, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((ne) this).field_j.field_z) {
            var10 = new wl(((ne) this).field_j.g((byte) 113));
            var10.field_n = 5;
            var3 = var10.d((byte) -69);
            var10.field_n = var10.field_n + var3 * 72;
            var16 = new byte[-var10.field_n + var10.field_r.length];
            var14 = var16;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(var4, 0, (byte) 125, var16.length);
            if (param0) {
              L1: {
                L2: {
                  if (((ne) this).field_e == null) {
                    break L2;
                  } else {
                    if (null != ((ne) this).field_g) {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((ne) this).field_e, ((ne) this).field_g);
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
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var17 = um.a(0, var10.field_r, 5, var10.field_n - (var16.length - -5));
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    ((ne) this).field_h = new le[var3];
                    ((ne) this).field_a = var10;
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
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final le a(byte param0, int param1, kh param2, kh param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        le var10 = null;
        byte[] var12 = null;
        if (((ne) this).field_a != null) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (((ne) this).field_h.length > param1) {
                if (((ne) this).field_h[param1] != null) {
                  return ((ne) this).field_h[param1];
                } else {
                  ((ne) this).field_a.field_n = param1 * 72 + 6;
                  var7 = 10 / ((-41 - param0) / 42);
                  var6 = ((ne) this).field_a.i(7553);
                  var8 = ((ne) this).field_a.i(7553);
                  var12 = new byte[64];
                  ((ne) this).field_a.a(var12, 0, (byte) 127, 64);
                  var10 = new le(param1, param2, param3, ((ne) this).field_i, ((ne) this).field_f, var6, var12, var8, param4);
                  ((ne) this).field_h[param1] = var10;
                  return var10;
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

    final static void e(int param0) {
        wj.q(114);
        if (param0 != -5) {
            field_c = null;
        }
        vb.field_Z = true;
        tj.field_Vb = true;
        ah.field_c.c(true);
        wi.a(false, param0 ^ 49, ak.field_g);
    }

    final static java.awt.Canvas d(int param0) {
        if (param0 > -25) {
            ne.a((byte) 18);
        }
        return (java.awt.Canvas) (null != cl.field_v ? cl.field_v : jh.field_b);
    }

    ne(dd param0, im param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static boolean b(int param0) {
        if (param0 != -18163) {
            return true;
        }
        if (!(jg.field_i)) {
            return false;
        }
        if (0 != pk.field_r) {
            return false;
        }
        return true;
    }

    final static int b(byte param0) {
        if (param0 != -40) {
            boolean discarded$0 = ne.b(-2);
        }
        return pf.field_g;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = client.field_A ? 1 : 0;
        if (((ne) this).field_h == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ne) this).field_h.length) {
              var4 = 0;
              var2 = var4;
              if (param0 <= -106) {
                L1: while (true) {
                  if (var4 >= ((ne) this).field_h.length) {
                    return;
                  } else {
                    if (null != ((ne) this).field_h[var4]) {
                      ((ne) this).field_h[var4].c(true);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (((ne) this).field_h[var2] != null) {
                ((ne) this).field_h[var2].b(16322);
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

    final static void c(int param0) {
        wc.field_n = false;
        wl.field_p = 0 == de.field_V.d((byte) -96) ? true : false;
        if (param0 != 27721) {
            ne.a((byte) 94);
        }
    }

    private ne(dd param0, im param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ne) this).field_f = param1;
        ((ne) this).field_e = param2;
        ((ne) this).field_g = param3;
        ((ne) this).field_i = param0;
        if (!((ne) this).field_i.a(true)) {
            ((ne) this).field_j = ((ne) this).field_i.a(true, (byte) 0, true, 255, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
        field_b = "Achieved";
    }
}
