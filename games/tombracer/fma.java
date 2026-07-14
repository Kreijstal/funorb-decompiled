/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fma {
    private qqa field_b;
    private java.math.BigInteger field_a;
    static String field_d;
    private java.math.BigInteger field_e;
    static iw field_f;
    private ss field_c;
    private qda field_h;
    private uia field_g;
    private js[] field_i;

    public static void a(byte param0) {
        int var1 = 82 % ((-34 - param0) / 61);
        field_f = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        uia var10 = null;
        byte[] var11 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        java.math.BigInteger var17 = null;
        java.math.BigInteger var18 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        java.math.BigInteger var23 = null;
        java.math.BigInteger var24 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        byte[] var33 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((fma) this).field_g != null) {
          return true;
        } else {
          L0: {
            if (null != ((fma) this).field_b) {
              break L0;
            } else {
              if (!((fma) this).field_h.d(-21)) {
                ((fma) this).field_b = ((fma) this).field_h.a(255, true, 255, -21, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((fma) this).field_b.field_m) {
            return false;
          } else {
            var10 = new uia(((fma) this).field_b.b((byte) -126));
            if (!param0) {
              L1: {
                var10.field_h = 5;
                var3 = var10.h(255);
                var10.field_h = var10.field_h + 72 * var3;
                var30 = new byte[-var10.field_h + var10.field_g.length];
                var20 = var30;
                var13 = var20;
                var11 = var13;
                var4 = var11;
                var10.a(var4, 0, -116, var30.length);
                if (null == ((fma) this).field_e) {
                  var5 = var4;
                  break L1;
                } else {
                  if (((fma) this).field_a != null) {
                    var23 = new java.math.BigInteger(var30);
                    var24 = var23.modPow(((fma) this).field_e, ((fma) this).field_a);
                    var5 = var24.toByteArray();
                    break L1;
                  } else {
                    var31 = var4;
                    var21 = var31;
                    var5 = var21;
                    if (var31.length != 65) {
                      throw new RuntimeException();
                    } else {
                      var32 = fja.a(-5 + (var10.field_h - var30.length), var10.field_g, 5, 8);
                      var7 = 0;
                      L2: while (true) {
                        if (-65 < (var7 ^ -1)) {
                          if (var32[var7] != var5[var7 - -1]) {
                            throw new RuntimeException();
                          } else {
                            var7++;
                            continue L2;
                          }
                        } else {
                          ((fma) this).field_i = new js[var3];
                          ((fma) this).field_g = var10;
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var33 = fja.a(-5 + (var10.field_h - var30.length), var10.field_g, 5, 8);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var33[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    ((fma) this).field_i = new js[var3];
                    ((fma) this).field_g = var10;
                    return true;
                  }
                }
              }
            } else {
              ((fma) this).field_g = null;
              var10.field_h = 5;
              var3 = var10.h(255);
              var10.field_h = var10.field_h + 72 * var3;
              var26 = new byte[-var10.field_h + var10.field_g.length];
              var14 = var26;
              var13 = var14;
              var11 = var13;
              var4 = var11;
              var10.a(var4, 0, -116, var26.length);
              if (null != ((fma) this).field_e) {
                L4: {
                  if (((fma) this).field_a != null) {
                    var17 = new java.math.BigInteger(var26);
                    var18 = var17.modPow(((fma) this).field_e, ((fma) this).field_a);
                    var5 = var18.toByteArray();
                    break L4;
                  } else {
                    var5 = var4;
                    break L4;
                  }
                }
                if (var5.length != 65) {
                  throw new RuntimeException();
                } else {
                  var29 = fja.a(-5 + (var10.field_h - var26.length), var10.field_g, 5, 8);
                  var7 = 0;
                  L5: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var29[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L5;
                      }
                    } else {
                      ((fma) this).field_i = new js[var3];
                      ((fma) this).field_g = var10;
                      return true;
                    }
                  }
                }
              } else {
                var27 = var4;
                var15 = var27;
                var5 = var15;
                if (var27.length != 65) {
                  throw new RuntimeException();
                } else {
                  var28 = fja.a(-5 + (var10.field_h - var26.length), var10.field_g, 5, 8);
                  var16 = var28;
                  var9 = var16;
                  var7 = 0;
                  L6: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var28[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L6;
                      }
                    } else {
                      ((fma) this).field_i = new js[var3];
                      ((fma) this).field_g = var10;
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final js a(ppa param0, int param1, ppa param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        js var15 = null;
        js var17 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        if (((fma) this).field_g == null) {
          throw new RuntimeException();
        } else {
          if (param1 >= 0) {
            if (((fma) this).field_i.length > param1) {
              if (null != ((fma) this).field_i[param1]) {
                return ((fma) this).field_i[param1];
              } else {
                if (param4 <= 42) {
                  fma.a((byte) -48);
                  ((fma) this).field_g.field_h = param1 * 72 + 6;
                  var6 = ((fma) this).field_g.e(121);
                  var7 = ((fma) this).field_g.e(-88);
                  var19 = new byte[64];
                  ((fma) this).field_g.a(var19, 0, -107, 64);
                  var15 = new js(param1, param0, param2, ((fma) this).field_h, ((fma) this).field_c, var6, var19, var7, param3);
                  ((fma) this).field_i[param1] = var15;
                  return var15;
                } else {
                  ((fma) this).field_g.field_h = param1 * 72 + 6;
                  var6 = ((fma) this).field_g.e(121);
                  var7 = ((fma) this).field_g.e(-88);
                  var20 = new byte[64];
                  ((fma) this).field_g.a(var20, 0, -107, 64);
                  var17 = new js(param1, param0, param2, ((fma) this).field_h, ((fma) this).field_c, var6, var20, var7, param3);
                  ((fma) this).field_i[param1] = var17;
                  return var17;
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (((fma) this).field_i != null) {
          var2 = 0;
          L0: while (true) {
            if (((fma) this).field_i.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((fma) this).field_i.length <= var4) {
                  if (param0 < -106) {
                    return;
                  } else {
                    ((fma) this).field_h = null;
                    return;
                  }
                } else {
                  if (((fma) this).field_i[var4] == null) {
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    ((fma) this).field_i[var4].b(1000);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null == ((fma) this).field_i[var2]) {
                var2++;
                var2++;
                continue L0;
              } else {
                ((fma) this).field_i[var2].c(-28613);
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    fma(qda param0, ss param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fma(qda param0, ss param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((fma) this).field_e = param2;
        ((fma) this).field_h = param0;
        ((fma) this).field_a = param3;
        ((fma) this).field_c = param1;
        if (!((fma) this).field_h.d(-21)) {
            ((fma) this).field_b = ((fma) this).field_h.a(255, true, 255, -21, (byte) 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "1st";
        field_f = new iw();
    }
}
