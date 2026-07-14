/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private ji field_g;
    private uf field_f;
    private sd field_h;
    private java.math.BigInteger field_e;
    private java.math.BigInteger field_c;
    private bj[] field_d;
    static String field_a;
    private qc field_b;

    final static boolean b(int param0) {
        if (param0 != 255) {
            return false;
        }
        if (null == vl.field_n) {
            return false;
        }
        nb.a(-2, (java.awt.Canvas) (Object) vl.field_n);
        vl.field_n.a(0, ka.field_i);
        vl.field_n = null;
        return true;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param1 == 97) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        if (param0 < 8) {
            return;
        }
        field_a = null;
    }

    em(ji param0, uf param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final bj a(int param0, byte param1, boolean param2, jh param3, jh param4) {
        int var6 = 0;
        int var7 = 0;
        bj var9 = null;
        byte[] var11 = null;
        if (((em) this).field_b == null) {
          throw new RuntimeException();
        } else {
          L0: {
            if ((param0 ^ -1) > -1) {
              break L0;
            } else {
              if (((em) this).field_d.length > param0) {
                if (null == ((em) this).field_d[param0]) {
                  L1: {
                    ((em) this).field_b.field_f = 6 + 72 * param0;
                    var6 = ((em) this).field_b.a((byte) -108);
                    var7 = ((em) this).field_b.a((byte) -55);
                    var11 = new byte[64];
                    if (param1 == -9) {
                      break L1;
                    } else {
                      ((em) this).field_h = null;
                      break L1;
                    }
                  }
                  ((em) this).field_b.b(29915, 64, var11, 0);
                  var9 = new bj(param0, param4, param3, ((em) this).field_g, ((em) this).field_f, var6, var11, var7, param2);
                  ((em) this).field_d[param0] = var9;
                  return var9;
                } else {
                  return ((em) this).field_d[param0];
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Geoblox.field_C;
        if (null == ((em) this).field_d) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((em) this).field_d.length <= var2) {
              L1: {
                if (param0 == -65) {
                  break L1;
                } else {
                  boolean discarded$1 = em.a('', 15);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((em) this).field_d.length) {
                  return;
                } else {
                  if (null != ((em) this).field_d[var4]) {
                    ((em) this).field_d[var4].b((byte) -38);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((em) this).field_d[var2] != null) {
                ((em) this).field_d[var2].a(6924);
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

    final boolean b(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        qc var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Geoblox.field_C;
        if (null != ((em) this).field_b) {
          return true;
        } else {
          L0: {
            if (((em) this).field_h == null) {
              if (((em) this).field_g.g(20)) {
                return false;
              } else {
                ((em) this).field_h = ((em) this).field_g.a((byte) 0, 255, -21, 255, true);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (param0 > 121) {
            if (((em) this).field_h.field_u) {
              return false;
            } else {
              L1: {
                L2: {
                  var10 = new qc(((em) this).field_h.e(397));
                  var10.field_f = 5;
                  var3 = var10.c((byte) 34);
                  var10.field_f = var10.field_f + var3 * 72;
                  var16 = new byte[var10.field_j.length + -var10.field_f];
                  var14 = var16;
                  var13 = var14;
                  var11 = var13;
                  var4 = var11;
                  var10.b(29915, var16.length, var16, 0);
                  if (((em) this).field_c == null) {
                    break L2;
                  } else {
                    if (((em) this).field_e != null) {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((em) this).field_c, ((em) this).field_e);
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
              if (-66 != (var5.length ^ -1)) {
                throw new RuntimeException();
              } else {
                var17 = wh.a(-var16.length + var10.field_f - 5, 5, var10.field_j, 8);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    ((em) this).field_b = var10;
                    ((em) this).field_d = new bj[var3];
                    return true;
                  } else {
                    if (var17[var7] != var5[1 + var7]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    private em(ji param0, uf param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((em) this).field_c = param2;
        ((em) this).field_e = param3;
        ((em) this).field_f = param1;
        ((em) this).field_g = param0;
        if (!((em) this).field_g.g(20)) {
            ((em) this).field_h = ((em) this).field_g.a((byte) 0, 255, -21, 255, true);
        }
    }

    final static boolean a(String param0, int param1) {
        L0: {
          if (param1 >= 53) {
            break L0;
          } else {
            em.a(26);
            break L0;
          }
        }
        L1: {
          if (param0 == null) {
            break L1;
          } else {
            if (param0.length() < wg.field_m) {
              break L1;
            } else {
              if (param0.length() <= bm.field_j) {
                return false;
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Replay tutorial";
    }
}
