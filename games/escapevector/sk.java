/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    private java.math.BigInteger field_c;
    static la field_d;
    private hk[] field_e;
    private n field_b;
    private s field_h;
    private kk field_a;
    private sb field_f;
    private java.math.BigInteger field_g;

    public static void b(boolean param0) {
        if (!param0) {
            field_d = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = EscapeVector.field_A;
        if (((sk) this).field_e != null) {
          var2 = 0;
          L0: while (true) {
            if (((sk) this).field_e.length <= var2) {
              L1: {
                var4 = 0;
                var2 = var4;
                if (((sk) this).field_e.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    if (((sk) this).field_e[var4] != null) {
                      ((sk) this).field_e[var4].c(-26);
                      break L2;
                    } else {
                      var4++;
                      break L2;
                    }
                  }
                  var4++;
                  var4++;
                  var4++;
                  break L1;
                }
              }
              if (param0 == 12) {
                return;
              } else {
                boolean discarded$1 = ((sk) this).a(false);
                return;
              }
            } else {
              if (null == ((sk) this).field_e[var2]) {
                var2++;
                var2++;
                continue L0;
              } else {
                ((sk) this).field_e[var2].d(param0 + -13);
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final hk a(boolean param0, int param1, jg param2, int param3, jg param4) {
        int var6 = 0;
        int var7 = 0;
        hk var9 = null;
        byte[] var13 = null;
        if (((sk) this).field_b != null) {
          if (0 <= param3) {
            if (param3 < ((sk) this).field_e.length) {
              if (((sk) this).field_e[param3] == null) {
                ((sk) this).field_b.field_m = 6 + param3 * 72;
                var6 = ((sk) this).field_b.g(param1 ^ -4932);
                var7 = ((sk) this).field_b.g(-5053);
                var13 = new byte[64];
                ((sk) this).field_b.a(var13, (byte) -96, 0, 64);
                var9 = new hk(param3, param4, param2, ((sk) this).field_f, ((sk) this).field_a, var6, var13, var7, param0);
                if (param1 != 255) {
                  return null;
                } else {
                  ((sk) this).field_e[param3] = var9;
                  return var9;
                }
              } else {
                return ((sk) this).field_e[param3];
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    sk(sb param0, kk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        n var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var8 = EscapeVector.field_A;
        if (null != ((sk) this).field_b) {
          return true;
        } else {
          L0: {
            if (null == ((sk) this).field_h) {
              if (((sk) this).field_f.c(20)) {
                return false;
              } else {
                ((sk) this).field_h = ((sk) this).field_f.a(255, true, (byte) 0, 255, (byte) 0);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!((sk) this).field_h.field_u) {
            L1: {
              var10 = new n(((sk) this).field_h.a(true));
              var10.field_m = 5;
              var3 = var10.e(0);
              var10.field_m = var10.field_m + 72 * var3;
              var18 = new byte[var10.field_g.length - var10.field_m];
              var14 = var18;
              var13 = var14;
              var11 = var13;
              var4 = var11;
              var10.a(var4, (byte) -96, 0, var18.length);
              if (((sk) this).field_g == null) {
                var5 = var4;
                break L1;
              } else {
                if (null != ((sk) this).field_c) {
                  var12 = new java.math.BigInteger(var18);
                  var7_ref = var12.modPow(((sk) this).field_g, ((sk) this).field_c);
                  var5 = var7_ref.toByteArray();
                  break L1;
                } else {
                  var19 = var4;
                  var15 = var19;
                  var5 = var15;
                  if (65 == var19.length) {
                    if (!param0) {
                      var20 = vn.a(var10.field_g, 5, -5 + (-var18.length + var10.field_m), 0);
                      var7 = 0;
                      L2: while (true) {
                        if (-65 < (var7 ^ -1)) {
                          if (var5[1 + var7] == var20[var7]) {
                            var7++;
                            continue L2;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          ((sk) this).field_e = new hk[var3];
                          ((sk) this).field_b = var10;
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            if (65 == var5.length) {
              if (!param0) {
                var21 = vn.a(var10.field_g, 5, -5 + (-var18.length + var10.field_m), 0);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var5[1 + var7] == var21[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    ((sk) this).field_e = new hk[var3];
                    ((sk) this).field_b = var10;
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        }
    }

    private sk(sb param0, kk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((sk) this).field_a = param1;
        ((sk) this).field_f = param0;
        ((sk) this).field_c = param3;
        ((sk) this).field_g = param2;
        if (!((sk) this).field_f.c(20)) {
            ((sk) this).field_h = ((sk) this).field_f.a(255, true, (byte) 0, 255, (byte) 0);
        }
    }

    static {
    }
}
