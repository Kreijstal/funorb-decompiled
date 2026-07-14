/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private vo field_b;
    private java.math.BigInteger field_h;
    static String field_g;
    static wk field_k;
    private bm[] field_i;
    private bp field_d;
    private jf field_c;
    private vh field_f;
    private java.math.BigInteger field_j;
    static boolean field_a;
    static int field_e;

    final bm a(boolean param0, bc param1, int param2, int param3, bc param4) {
        int var6 = 0;
        int var7 = 0;
        bm var9 = null;
        byte[] var11 = null;
        if (null != ((dd) this).field_f) {
          L0: {
            if ((param2 ^ -1) > -1) {
              break L0;
            } else {
              if (((dd) this).field_i.length > param2) {
                if (((dd) this).field_i[param2] == null) {
                  ((dd) this).field_f.field_q = 72 * param2 + 6;
                  var6 = ((dd) this).field_f.i(1);
                  var7 = ((dd) this).field_f.i(1);
                  var11 = new byte[64];
                  ((dd) this).field_f.a(param3, 64, 0, var11);
                  var9 = new bm(param2, param1, param4, ((dd) this).field_d, ((dd) this).field_b, var6, var11, var7, param0);
                  ((dd) this).field_i[param2] = var9;
                  return var9;
                } else {
                  return ((dd) this).field_i[param2];
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

    final static String a(int param0, int param1) {
        if (param1 != 82) {
            return null;
        }
        if (param0 < 10000) {
            return Integer.toString(param0);
        }
        if (param0 > -1000001) {
            return Integer.toString(param0 / 1000) + "K";
        }
        if (-1000000001 > param0) {
            return Integer.toString(param0 / 1000000) + "M";
        }
        return "A Billion";
    }

    final static int a(boolean param0) {
        if ((f.field_E ^ -1) <= -3) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              field_a = false;
              break L0;
            }
          }
          L1: {
            if (0 == og.field_m) {
              if (ps.field_u.a((byte) 82)) {
                if (ps.field_u.a(28979, "commonui")) {
                  if (!sk.field_M.a((byte) 82)) {
                    return 50;
                  } else {
                    if (!sk.field_M.a(28979, "commonui")) {
                      return 60;
                    } else {
                      if (h.field_g.a((byte) 82)) {
                        if (!h.field_g.d(-27927)) {
                          return 80;
                        } else {
                          break L1;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            } else {
              L2: {
                if (nf.field_Nb != null) {
                  if (nf.field_Nb.a((byte) 82)) {
                    if (nf.field_Nb.a((byte) -128, "")) {
                      if (nf.field_Nb.a(28979, "")) {
                        break L2;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
                }
              }
              if (ps.field_u.a((byte) 82)) {
                if (!ps.field_u.a(28979, "commonui")) {
                  return 57;
                } else {
                  if (!sk.field_M.a((byte) 82)) {
                    return 71;
                  } else {
                    if (sk.field_M.a(28979, "commonui")) {
                      if (!h.field_g.a((byte) 82)) {
                        return 82;
                      } else {
                        if (!h.field_g.d(-27927)) {
                          return 86;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((dd) this).field_i == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((dd) this).field_i.length <= var2) {
              L1: {
                if (param0 == 18199) {
                  break L1;
                } else {
                  dd.b(30);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((dd) this).field_i.length) {
                  return;
                } else {
                  if (((dd) this).field_i[var4] != null) {
                    ((dd) this).field_i[var4].b(-26132);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != ((dd) this).field_i[var2]) {
                ((dd) this).field_i[var2].d(-71);
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

    dd(bp param0, vo param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(int param0) {
        if (param0 > -9) {
            return;
        }
        field_k = null;
        field_g = null;
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        vh var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((dd) this).field_f) {
          L0: {
            if (null == ((dd) this).field_c) {
              if (((dd) this).field_d.d(param0 + 86)) {
                return false;
              } else {
                ((dd) this).field_c = ((dd) this).field_d.a(255, false, 255, (byte) 0, true);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (((dd) this).field_c.field_x) {
            return false;
          } else {
            var10 = new vh(((dd) this).field_c.d((byte) 43));
            if (param0 == 14) {
              L1: {
                L2: {
                  var10.field_q = 5;
                  var3 = var10.k(0);
                  var10.field_q = var10.field_q + var3 * 72;
                  var16 = new byte[var10.field_o.length - var10.field_q];
                  var14 = var16;
                  var13 = var14;
                  var11 = var13;
                  var4 = var11;
                  var10.a(0, var16.length, 0, var16);
                  if (null == ((dd) this).field_h) {
                    break L2;
                  } else {
                    if (null == ((dd) this).field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((dd) this).field_h, ((dd) this).field_j);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) == -66) {
                var17 = ua.a(-18423, -5 + (var10.field_q + -var16.length), var10.field_o, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    ((dd) this).field_i = new bm[var3];
                    ((dd) this).field_f = var10;
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
              } else {
                throw new RuntimeException();
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private dd(bp param0, vo param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((dd) this).field_d = param0;
        ((dd) this).field_b = param1;
        ((dd) this).field_h = param2;
        ((dd) this).field_j = param3;
        if (!((dd) this).field_d.d(119)) {
            ((dd) this).field_c = ((dd) this).field_d.a(255, false, 255, (byte) 0, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Equipment";
        field_e = 0;
    }
}
