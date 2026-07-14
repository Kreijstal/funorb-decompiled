/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    private ai field_d;
    private java.math.BigInteger field_e;
    static ri field_c;
    private qb field_i;
    static int field_g;
    private tn field_h;
    private k field_b;
    private cn[] field_f;
    private java.math.BigInteger field_a;

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) um.field_c);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) um.field_c);
        qf.field_f = -1;
        int var2 = -120 % ((param1 - 66) / 53);
    }

    eq(qb param0, ai param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final cn a(int param0, bq param1, int param2, bq param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        Object var10 = null;
        cn var18 = null;
        cn var20 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        if (param2 == -15893) {
          if (null == ((eq) this).field_b) {
            throw new RuntimeException();
          } else {
            if ((param0 ^ -1) <= -1) {
              if (((eq) this).field_f.length > param0) {
                if (null != ((eq) this).field_f[param0]) {
                  return ((eq) this).field_f[param0];
                } else {
                  ((eq) this).field_b.field_j = 6 + 72 * param0;
                  var6 = ((eq) this).field_b.i(-1478490344);
                  var7 = ((eq) this).field_b.i(param2 + -1478474451);
                  var24 = new byte[64];
                  ((eq) this).field_b.a(0, param2 ^ 9946, 64, var24);
                  var20 = new cn(param0, param3, param1, ((eq) this).field_i, ((eq) this).field_d, var6, var24, var7, param4);
                  ((eq) this).field_f[param0] = var20;
                  return var20;
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          var10 = null;
          String discarded$12 = eq.a((CharSequence[]) null, 8, 88, 1);
          if (null == ((eq) this).field_b) {
            throw new RuntimeException();
          } else {
            if ((param0 ^ -1) <= -1) {
              if (((eq) this).field_f.length > param0) {
                if (null != ((eq) this).field_f[param0]) {
                  return ((eq) this).field_f[param0];
                } else {
                  ((eq) this).field_b.field_j = 6 + 72 * param0;
                  var6 = ((eq) this).field_b.i(-1478490344);
                  var7 = ((eq) this).field_b.i(param2 + -1478474451);
                  var23 = new byte[64];
                  ((eq) this).field_b.a(0, param2 ^ 9946, 64, var23);
                  var18 = new cn(param0, param3, param1, ((eq) this).field_i, ((eq) this).field_d, var6, var23, var7, param4);
                  ((eq) this).field_f[param0] = var18;
                  return var18;
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param3 != 0) {
          if (-2 == (param3 ^ -1)) {
            var10 = param0[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 - -param1;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var4 <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  var7 = param1;
                  if (var4 <= var7) {
                    break L1;
                  } else {
                    L2: {
                      var8 = param0[var7];
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var7++;
                        break L2;
                      } else {
                        StringBuilder discarded$3 = var6.append(var8);
                        var7++;
                        break L2;
                      }
                    }
                    var7++;
                    var7++;
                    break L1;
                  }
                }
                if (param2 != 4) {
                  return null;
                } else {
                  return var6.toString();
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            eq.a(-117);
        }
    }

    private eq(qb param0, ai param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((eq) this).field_d = param1;
        ((eq) this).field_i = param0;
        ((eq) this).field_e = param3;
        ((eq) this).field_a = param2;
        if (!((eq) this).field_i.e(82)) {
            ((eq) this).field_h = ((eq) this).field_i.a(487989472, 255, true, 255, (byte) 0);
        }
    }

    final boolean c(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        k var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var19 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((eq) this).field_b) {
          return true;
        } else {
          L0: {
            if (null == ((eq) this).field_h) {
              if (!((eq) this).field_i.e(54)) {
                ((eq) this).field_h = ((eq) this).field_i.a(487989472, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (((eq) this).field_h.field_t) {
            return false;
          } else {
            var10 = new k(((eq) this).field_h.e(0));
            var10.field_j = 5;
            var3 = var10.g(31365);
            var10.field_j = var10.field_j + var3 * 72;
            var21 = new byte[var10.field_m.length - var10.field_j];
            var14 = var21;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(0, -6351, var21.length, var21);
            if (null != ((eq) this).field_a) {
              if (null != ((eq) this).field_e) {
                var12 = new java.math.BigInteger(var21);
                var7_ref = var12.modPow(((eq) this).field_a, ((eq) this).field_e);
                var26 = var7_ref.toByteArray();
                var19 = var26;
                var5 = var19;
                if (var26.length != 65) {
                  throw new RuntimeException();
                } else {
                  var27 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                  var7 = 0;
                  L1: while (true) {
                    if (64 <= var7) {
                      if (param0 > -113) {
                        ((eq) this).field_h = null;
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      } else {
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      }
                    } else {
                      if (var27[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L1;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
              } else {
                var24 = var4;
                var17 = var24;
                var5 = var17;
                if (var24.length != 65) {
                  throw new RuntimeException();
                } else {
                  var25 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                  var7 = 0;
                  L2: while (true) {
                    if (64 <= var7) {
                      if (param0 > -113) {
                        ((eq) this).field_h = null;
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      } else {
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      }
                    } else {
                      if (var25[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L2;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
              }
            } else {
              var22 = var4;
              var15 = var22;
              var5 = var15;
              if (var22.length != 65) {
                throw new RuntimeException();
              } else {
                var23 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                var7 = 0;
                L3: while (true) {
                  if (64 <= var7) {
                    if (param0 > -113) {
                      ((eq) this).field_h = null;
                      ((eq) this).field_b = var10;
                      ((eq) this).field_f = new cn[var3];
                      return true;
                    } else {
                      ((eq) this).field_b = var10;
                      ((eq) this).field_f = new cn[var3];
                      return true;
                    }
                  } else {
                    if (var23[var7] == var5[var7 - -1]) {
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
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((eq) this).field_f == null) {
          return;
        } else {
          var2 = param0;
          L0: while (true) {
            if (((eq) this).field_f.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((eq) this).field_f.length <= var4) {
                  return;
                } else {
                  if (((eq) this).field_f[var4] == null) {
                    var4++;
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    ((eq) this).field_f[var4].b(-2);
                    var4++;
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((eq) this).field_f[var2] != null) {
                ((eq) this).field_f[var2].c(90);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 9;
    }
}
