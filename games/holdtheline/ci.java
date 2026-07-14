/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private java.math.BigInteger field_e;
    private qb field_m;
    static int field_n;
    static int field_b;
    static boolean field_o;
    static boolean field_h;
    static int field_d;
    private th field_a;
    private rb[] field_i;
    private java.math.BigInteger field_f;
    private wj field_g;
    static go field_l;
    static uf field_k;
    private cc field_c;
    static int field_j;

    final rb a(int param0, boolean param1, int param2, sk param3, sk param4) {
        int var6 = 0;
        int var7 = 0;
        rb var9 = null;
        byte[] var11 = null;
        if (((ci) this).field_a == null) {
          throw new RuntimeException();
        } else {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (((ci) this).field_i.length > param0) {
                if (((ci) this).field_i[param0] == null) {
                  L1: {
                    ((ci) this).field_a.field_l = param0 * 72 + 6;
                    var6 = ((ci) this).field_a.a(-101);
                    if (param2 >= 102) {
                      break L1;
                    } else {
                      field_l = null;
                      break L1;
                    }
                  }
                  var7 = ((ci) this).field_a.a(-73);
                  var11 = new byte[64];
                  ((ci) this).field_a.a(64, 0, (byte) 68, var11);
                  var9 = new rb(param0, param4, param3, ((ci) this).field_g, ((ci) this).field_m, var6, var11, var7, param1);
                  ((ci) this).field_i[param0] = var9;
                  return var9;
                } else {
                  return ((ci) this).field_i[param0];
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = HoldTheLine.field_D;
        if (param0) {
          if (null == ((ci) this).field_i) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (((ci) this).field_i.length <= var2) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((ci) this).field_i.length) {
                    return;
                  } else {
                    if (((ci) this).field_i[var4] != null) {
                      ((ci) this).field_i[var4].b(2);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != ((ci) this).field_i[var2]) {
                  ((ci) this).field_i[var2].c(2);
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

    public static void a(byte param0) {
        field_l = null;
        if (param0 != 100) {
            return;
        }
        field_k = null;
    }

    final static om a(int param0, byte param1) {
        if (param1 != 17) {
            field_k = null;
        }
        return mc.field_a[param0];
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 49) {
            ci.b((byte) 95);
        }
        if (ik.field_i != param2) {
            return;
        }
        if (!((param3 ^ -1) <= 0)) {
            throw new RuntimeException();
        }
        if (ra.field_ab == param3) {
            // if_icmpne L56
        } else {
            qj.field_I = -1;
        }
        ld.field_b = param0;
        ra.field_ab = param3;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        da var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ih var11 = null;
        da var12 = null;
        ma var13 = null;
        int[] var14 = null;
        ma var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = HoldTheLine.field_D;
          if (param0 <= -121) {
            break L0;
          } else {
            field_n = -46;
            break L0;
          }
        }
        L1: {
          var12 = rd.field_e;
          var2 = var12.f((byte) -84);
          if (0 == var2) {
            var10 = vd.c(1023);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((th) (Object) var5).f((byte) -31);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var15 = (ma) (Object) sg.field_v.b((byte) 106);
                if (var15 != null) {
                  var15.field_j = var3;
                  var15.field_i = true;
                  var15.field_m = var18[0];
                  var15.d(0);
                  break L1;
                } else {
                  r.a(-28036);
                  return;
                }
              } else {
                var9[var7] = ((th) (Object) var5).a(-67);
                var7++;
                continue L2;
              }
            }
          } else {
            if (var2 == 1) {
              var11 = (ih) (Object) io.field_c.b((byte) 116);
              if (var11 == null) {
                r.a(-28036);
                return;
              } else {
                var11.d(0);
                break L1;
              }
            } else {
              if (var2 == 2) {
                var13 = (ma) (Object) sg.field_v.b((byte) 112);
                if (var13 == null) {
                  r.a(-28036);
                  return;
                } else {
                  var13.field_j = vd.c(1023);
                  var13.field_m = var13.field_j[0];
                  var13.field_i = true;
                  var13.d(0);
                  break L1;
                }
              } else {
                bl.a((Throwable) null, (byte) -52, "A1: " + em.b(false));
                r.a(-28036);
                break L1;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        th var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = HoldTheLine.field_D;
        if (((ci) this).field_a != null) {
          return true;
        } else {
          L0: {
            if (null != ((ci) this).field_c) {
              break L0;
            } else {
              if (((ci) this).field_g.c(115)) {
                return false;
              } else {
                ((ci) this).field_c = ((ci) this).field_g.a(255, true, (byte) 0, (byte) -60, 255);
                break L0;
              }
            }
          }
          if (((ci) this).field_c.field_u) {
            return false;
          } else {
            L1: {
              var10 = new th(((ci) this).field_c.i(-20324));
              var10.field_l = 5;
              var3 = var10.f((byte) -40);
              var10.field_l = var10.field_l + var3 * 72;
              if (param0 <= -31) {
                break L1;
              } else {
                ci.a((byte) -98);
                break L1;
              }
            }
            L2: {
              L3: {
                var16 = new byte[-var10.field_l + var10.field_i.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, 0, (byte) 71, var16);
                if (null == ((ci) this).field_e) {
                  break L3;
                } else {
                  if (null != ((ci) this).field_f) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((ci) this).field_e, ((ci) this).field_f);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (-66 != (var5.length ^ -1)) {
              throw new RuntimeException();
            } else {
              var17 = wc.a(var10.field_i, -6408, 5, -5 + (var10.field_l - var16.length));
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((ci) this).field_a = var10;
                  ((ci) this).field_i = new rb[var3];
                  return true;
                } else {
                  if (var5[var7 + 1] == var17[var7]) {
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

    private ci(wj param0, qb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ci) this).field_m = param1;
        ((ci) this).field_f = param3;
        ((ci) this).field_g = param0;
        ((ci) this).field_e = param2;
        if (!((ci) this).field_g.c(78)) {
            ((ci) this).field_c = ((ci) this).field_g.a(255, true, (byte) 0, (byte) -60, 255);
        }
    }

    ci(wj param0, qb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 5;
        field_h = true;
    }
}
