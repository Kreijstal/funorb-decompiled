/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    private ld field_e;
    private ee[] field_a;
    private java.math.BigInteger field_h;
    private ng field_i;
    static String field_f;
    private ni field_d;
    private java.math.BigInteger field_g;
    static int field_c;
    private ob field_b;

    public static void b(int param0) {
        int var1 = -69 / ((46 - param0) / 43);
        field_f = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (((pk) this).field_a == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((pk) this).field_a.length) {
              var2 = 0;
              L1: while (true) {
                if (((pk) this).field_a.length <= var2) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      ((pk) this).field_d = null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (null != ((pk) this).field_a[var2]) {
                    ((pk) this).field_a[var2].e(26);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((pk) this).field_a[var2]) {
                ((pk) this).field_a[var2].c(117);
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

    final ee a(int param0, sp param1, boolean param2, int param3, sp param4) {
        if (((pk) this).field_i == null) {
            throw new RuntimeException();
        }
        if ((param3 ^ -1) <= -1) {
            // if_icmpge L36
        } else {
            throw new RuntimeException();
        }
        if (!(((pk) this).field_a[param3] == null)) {
            return ((pk) this).field_a[param3];
        }
        ((pk) this).field_i.field_f = 72 * param3 + 6;
        int var6 = ((pk) this).field_i.b((byte) 127);
        int var7 = ((pk) this).field_i.b((byte) 126);
        byte[] var11 = new byte[param0];
        ((pk) this).field_i.a(64, var11, (byte) 94, 0);
        ee var9 = new ee(param3, param4, param1, ((pk) this).field_b, ((pk) this).field_d, var6, var11, var7, param2);
        ((pk) this).field_a[param3] = var9;
        return var9;
    }

    final static boolean a(byte param0) {
        if (param0 != -56) {
            field_f = null;
        }
        return ch.field_d.b(true);
    }

    pk(ob param0, ni param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, pp param1, byte param2) {
        md var3 = tp.field_f;
        var3.d(8, param0);
        var3.a(true, 2);
        var3.a(true, 0);
        var3.a(true, param1.field_f);
        if (param2 != 113) {
            field_f = null;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        qp var4_ref_qp = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        w var8 = null;
        md var9 = null;
        byte[] var13 = null;
        var6 = CrazyCrystals.field_B;
        if (param0 < -97) {
          L0: {
            var9 = kd.field_n;
            var2 = var9.h(255);
            if (-1 == var2) {
              var8 = (w) (Object) je.field_a.g(32073);
              if (var8 != null) {
                L1: {
                  var4 = var9.h(255);
                  if (0 != var4) {
                    var13 = new byte[var4];
                    var9.a(var4, var13, (byte) -120, 0);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var9.field_f = var9.field_f + 4;
                if (var9.g(-99)) {
                  var8.a(false);
                  break L0;
                } else {
                  jj.a(4);
                  return;
                }
              } else {
                jj.a(4);
                return;
              }
            } else {
              if (-2 == var2) {
                var3 = var9.b((byte) -114);
                var4_ref_qp = (qp) (Object) oi.field_a.g(32073);
                L2: while (true) {
                  L3: {
                    if (var4_ref_qp == null) {
                      break L3;
                    } else {
                      if (var3 == var4_ref_qp.field_h) {
                        break L3;
                      } else {
                        var4_ref_qp = (qp) (Object) oi.field_a.a(false);
                        continue L2;
                      }
                    }
                  }
                  if (var4_ref_qp == null) {
                    jj.a(4);
                    return;
                  } else {
                    var4_ref_qp.a(false);
                    break L0;
                  }
                }
              } else {
                wp.a((Throwable) null, "A1: " + ug.a(-1815), 21862);
                jj.a(4);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean b(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ng var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = CrazyCrystals.field_B;
        if (((pk) this).field_i != null) {
          return true;
        } else {
          L0: {
            if (null == ((pk) this).field_e) {
              if (!((pk) this).field_b.c((byte) -64)) {
                ((pk) this).field_e = ((pk) this).field_b.a(true, 18303, 255, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((pk) this).field_e.field_n) {
            L1: {
              L2: {
                var10 = new ng(((pk) this).field_e.e(113));
                var10.field_f = 5;
                var3 = var10.h(255);
                var10.field_f = var10.field_f + var3 * 72;
                var16 = new byte[-var10.field_f + var10.field_h.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, var16, (byte) 87, 0);
                if (((pk) this).field_g == null) {
                  break L2;
                } else {
                  if (null == ((pk) this).field_h) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((pk) this).field_g, ((pk) this).field_h);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              if (param0) {
                var17 = ac.a(var10.field_h, 5, -5 + (-var16.length + var10.field_f), (byte) -127);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    ((pk) this).field_a = new ee[var3];
                    ((pk) this).field_i = var10;
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
                return false;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        }
    }

    private pk(ob param0, ni param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((pk) this).field_g = param2;
        ((pk) this).field_h = param3;
        ((pk) this).field_d = param1;
        ((pk) this).field_b = param0;
        if (!((pk) this).field_b.c((byte) -69)) {
            ((pk) this).field_e = ((pk) this).field_b.a(true, 18303, 255, 255, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_c = 480;
    }
}
