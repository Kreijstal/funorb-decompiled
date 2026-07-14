/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    private qfa field_d;
    static int field_h;
    private vm field_i;
    private fp[] field_a;
    private java.math.BigInteger field_f;
    private ea field_k;
    private java.math.BigInteger field_b;
    private lu field_c;
    static qia field_e;
    static int field_g;
    static int field_j;

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 26) {
            kb.a(-88);
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        lu var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = BachelorFridge.field_y;
        if (null != ((kb) this).field_c) {
          return true;
        } else {
          L0: {
            if (((kb) this).field_d == null) {
              if (!((kb) this).field_i.b(20)) {
                ((kb) this).field_d = ((kb) this).field_i.a(255, 255, 123, (byte) 0, true);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (((kb) this).field_d.field_n) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new lu(((kb) this).field_d.d((byte) -65));
                var10.field_g = 5;
                var3 = var10.b(param0 + 16711924);
                var10.field_g = var10.field_g + 72 * var3;
                var16 = new byte[-var10.field_g + var10.field_h.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var4, var16.length, 128, 0);
                if (null == ((kb) this).field_b) {
                  break L2;
                } else {
                  if (null == ((kb) this).field_f) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((kb) this).field_b, ((kb) this).field_f);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var17 = ln.a(-5 + (var10.field_g + -var16.length), var10.field_h, 5, 8);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  L4: {
                    ((kb) this).field_c = var10;
                    if (param0 == 11) {
                      break L4;
                    } else {
                      ((kb) this).b((byte) -34);
                      break L4;
                    }
                  }
                  ((kb) this).field_a = new fp[var3];
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
          }
        }
    }

    final fp a(boolean param0, int param1, ta param2, ta param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        fp var9 = null;
        byte[] var11 = null;
        if (null != ((kb) this).field_c) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if (param1 < ((kb) this).field_a.length) {
                if (null != ((kb) this).field_a[param1]) {
                  return ((kb) this).field_a[param1];
                } else {
                  ((kb) this).field_c.field_g = param1 * 72 - -6;
                  var6 = ((kb) this).field_c.f(81);
                  var7 = ((kb) this).field_c.f(-121);
                  var11 = new byte[param4];
                  ((kb) this).field_c.a(var11, 64, 128, 0);
                  var9 = new fp(param1, param2, param3, ((kb) this).field_i, ((kb) this).field_k, var6, var11, var7, param0);
                  ((kb) this).field_a[param1] = var9;
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

    private kb(vm param0, ea param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((kb) this).field_b = param2;
        ((kb) this).field_f = param3;
        ((kb) this).field_k = param1;
        ((kb) this).field_i = param0;
        if (!((kb) this).field_i.b(20)) {
            ((kb) this).field_d = ((kb) this).field_i.a(255, 255, 126, (byte) 0, true);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = BachelorFridge.field_y;
        if (((kb) this).field_a != null) {
          var3 = 14 % ((-16 - param0) / 51);
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((kb) this).field_a.length) {
              var5 = 0;
              var2 = var5;
              L1: while (true) {
                if (((kb) this).field_a.length <= var5) {
                  return;
                } else {
                  if (((kb) this).field_a[var5] != null) {
                    ((kb) this).field_a[var5].c(14075);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((kb) this).field_a[var2]) {
                ((kb) this).field_a[var2].e(62);
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

    kb(vm param0, ea param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new qia();
        field_g = 0;
    }
}
