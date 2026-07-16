/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int field_j;
    static ff field_f;
    private va field_h;
    private ae field_l;
    private java.math.BigInteger field_e;
    static boolean field_d;
    private java.math.BigInteger field_c;
    private gb field_b;
    private ic field_m;
    static String field_g;
    static ng field_i;
    private lg[] field_k;
    static String field_a;

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 30731) {
            ne.b(-57);
        }
        field_i = null;
        field_a = null;
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gb var11 = null;
        byte[] var12 = null;
        java.math.BigInteger var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        if (((ne) this).field_b != null) {
          return true;
        } else {
          L0: {
            if (null != ((ne) this).field_m) {
              break L0;
            } else {
              if (((ne) this).field_h.b(-21)) {
                return false;
              } else {
                ((ne) this).field_m = ((ne) this).field_h.a(255, true, 255, 437409504, (byte) 0);
                break L0;
              }
            }
          }
          if (((ne) this).field_m.field_m) {
            return false;
          } else {
            L1: {
              L2: {
                var11 = new gb(((ne) this).field_m.f(0));
                var11.field_m = 5;
                var3 = var11.j(255);
                var11.field_m = var11.field_m + 72 * var3;
                var17 = new byte[var11.field_l.length - var11.field_m];
                var15 = var17;
                var14 = var15;
                var12 = var14;
                var4 = var12;
                var11.a(var17.length, 0, -118, var17);
                if (null == ((ne) this).field_c) {
                  break L2;
                } else {
                  if (((ne) this).field_e != null) {
                    var13 = new java.math.BigInteger(var17);
                    var7_ref_java_math_BigInteger = var13.modPow(((ne) this).field_c, ((ne) this).field_e);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var7 = -39 % ((11 - param0) / 35);
              var18 = q.a(-var17.length + (var11.field_m - 5), 5, 87, var11.field_l);
              var8 = 0;
              L3: while (true) {
                if ((var8 ^ -1) <= -65) {
                  ((ne) this).field_k = new lg[var3];
                  ((ne) this).field_b = var11;
                  return true;
                } else {
                  if (var18[var8] == var5[var8 - -1]) {
                    var8++;
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

    final lg a(int param0, bi param1, boolean param2, bi param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        lg var9 = null;
        byte[] var11 = null;
        if (((ne) this).field_b != null) {
          L0: {
            if (param4 < 0) {
              break L0;
            } else {
              if (param4 >= ((ne) this).field_k.length) {
                break L0;
              } else {
                if (param0 == -65) {
                  if (null == ((ne) this).field_k[param4]) {
                    ((ne) this).field_b.field_m = param4 * 72 + 6;
                    var6 = ((ne) this).field_b.e(true);
                    var7 = ((ne) this).field_b.e(true);
                    var11 = new byte[64];
                    ((ne) this).field_b.a(64, 0, -127, var11);
                    var9 = new lg(param4, param1, param3, ((ne) this).field_h, ((ne) this).field_l, var6, var11, var7, param2);
                    ((ne) this).field_k[param4] = var9;
                    return var9;
                  } else {
                    return ((ne) this).field_k[param4];
                  }
                } else {
                  return null;
                }
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (null != ((ne) this).field_k) {
          L0: {
            var2 = 0;
            if (param0 == 24561) {
              break L0;
            } else {
              var4 = null;
              boolean discarded$2 = ne.a((String) null, false, (String) null);
              break L0;
            }
          }
          L1: while (true) {
            if (var2 >= ((ne) this).field_k.length) {
              var5 = 0;
              var2 = var5;
              L2: while (true) {
                if (var5 >= ((ne) this).field_k.length) {
                  return;
                } else {
                  if (((ne) this).field_k[var5] != null) {
                    ((ne) this).field_k[var5].e(18055);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((ne) this).field_k[var2] != null) {
                ((ne) this).field_k[var2].d(-1);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = ji.a(21762, param2);
        if (!param1) {
          L0: {
            if (-1 != param0.indexOf(param2)) {
              break L0;
            } else {
              if (0 != (param0.indexOf(var3) ^ -1)) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param0.startsWith(param2)) {
                      break L2;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param0.endsWith(param2)) {
                          break L2;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
                return stackIn_13_0 != 0;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final static pc a(String param0, int param1) {
        int var6 = 0;
        String var7 = null;
        pc var8 = null;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
            return h.field_a;
        }
        if (!(255 >= var2)) {
            return el.field_o;
        }
        int var3 = 63 % ((param1 - 4) / 50);
        String[] var4 = b.a(param0, '.', true);
        if (var4.length < 2) {
            return h.field_a;
        }
        String[] var5 = var4;
        for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            var8 = rg.a((byte) 118, var7);
            if (!(var8 == null)) {
                return var8;
            }
        }
        return fh.a(var4[var4.length - 1], (byte) 97);
    }

    ne(va param0, ae param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ne(va param0, ae param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ne) this).field_h = param0;
        ((ne) this).field_l = param1;
        ((ne) this).field_e = param3;
        ((ne) this).field_c = param2;
        if (!((ne) this).field_h.b(-21)) {
            ((ne) this).field_m = ((ne) this).field_h.a(255, true, 255, 437409504, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_d = false;
        field_f = new ff(1, 2, 2, 0);
        field_a = "Destroyed";
        field_i = new ng();
    }
}
