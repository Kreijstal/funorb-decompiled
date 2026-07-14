/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private java.math.BigInteger field_i;
    private wk field_d;
    private lk field_l;
    private java.math.BigInteger field_j;
    static java.awt.Frame field_c;
    private vk field_h;
    private tj[] field_b;
    static String[] field_f;
    private pa field_e;
    static kc field_g;
    static m field_k;
    static String field_a;

    final boolean b(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        wk var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (((gk) this).field_d == null) {
          L0: {
            if (((gk) this).field_h != null) {
              break L0;
            } else {
              if (((gk) this).field_l.c((byte) 96)) {
                return false;
              } else {
                ((gk) this).field_h = ((gk) this).field_l.a(255, true, 255, (byte) -80, (byte) 0);
                break L0;
              }
            }
          }
          if (!((gk) this).field_h.field_p) {
            L1: {
              L2: {
                var10 = new wk(((gk) this).field_h.c(-20));
                var10.field_g = 5;
                var3 = var10.e((byte) 103);
                var10.field_g = var10.field_g + var3 * 72;
                var16 = new byte[-var10.field_g + var10.field_j.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a((byte) 74, 0, var4, var16.length);
                if (null == ((gk) this).field_j) {
                  break L2;
                } else {
                  if (((gk) this).field_i == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((gk) this).field_j, ((gk) this).field_i);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            L3: {
              if (param0 == -52) {
                break L3;
              } else {
                ((gk) this).field_e = null;
                break L3;
              }
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = nn.a(var10.field_g - (var16.length - -5), (byte) -93, var10.field_j, 5);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((gk) this).field_b = new tj[var3];
                  ((gk) this).field_d = var10;
                  return true;
                } else {
                  if (var17[var7] != var5[1 + var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    gk(lk param0, pa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final tj a(be param0, boolean param1, int param2, be param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        tj var9 = null;
        byte[] var11 = null;
        if (((gk) this).field_d == null) {
          throw new RuntimeException();
        } else {
          L0: {
            if (0 > param4) {
              break L0;
            } else {
              if (((gk) this).field_b.length > param4) {
                if (((gk) this).field_b[param4] != null) {
                  return ((gk) this).field_b[param4];
                } else {
                  L1: {
                    ((gk) this).field_d.field_g = 6 + 72 * param4;
                    if (param2 <= -51) {
                      break L1;
                    } else {
                      field_g = null;
                      break L1;
                    }
                  }
                  var6 = ((gk) this).field_d.d(-10674);
                  var7 = ((gk) this).field_d.d(-10674);
                  var11 = new byte[64];
                  ((gk) this).field_d.a((byte) 92, 0, var11, 64);
                  var9 = new tj(param4, param3, param0, ((gk) this).field_l, ((gk) this).field_e, var6, var11, var7, param1);
                  ((gk) this).field_b[param4] = var9;
                  return var9;
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_g = null;
        if (param0 != -90) {
            field_a = null;
        }
        field_f = null;
        field_a = null;
    }

    private gk(lk param0, pa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((gk) this).field_e = param1;
        ((gk) this).field_i = param3;
        ((gk) this).field_j = param2;
        ((gk) this).field_l = param0;
        if (!((gk) this).field_l.c((byte) -91)) {
            ((gk) this).field_h = ((gk) this).field_l.a(255, true, 255, (byte) -80, (byte) 0);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (((gk) this).field_b == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((gk) this).field_b.length <= var2) {
              L1: {
                if (param0 == -8456) {
                  break L1;
                } else {
                  var4 = null;
                  String discarded$1 = gk.a((CharSequence) null, 112);
                  break L1;
                }
              }
              var5 = 0;
              var2 = var5;
              L2: while (true) {
                if (((gk) this).field_b.length <= var5) {
                  return;
                } else {
                  if (((gk) this).field_b[var5] != null) {
                    ((gk) this).field_b[var5].f((byte) 59);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((gk) this).field_b[var2] != null) {
                ((gk) this).field_b[var2].a(false);
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

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!rk.a((byte) 120, param0.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param1 == -13) {
                break L2;
              } else {
                field_g = null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (var2 >= var3) {
                  break L4;
                } else {
                  if (!rk.a((byte) -16, param0.charAt(-1 + var3))) {
                    break L4;
                  } else {
                    var3--;
                    continue L3;
                  }
                }
              }
              var4 = var3 + -var2;
              if ((var4 ^ -1) <= -2) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (qo.a((char) var7, param1 ^ -13)) {
                        var8 = af.a((char) var7, (byte) 22);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = "MOST BOUNCY - ";
    }
}
