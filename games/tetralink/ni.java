/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_c;
    private java.math.BigInteger field_j;
    private java.math.BigInteger field_e;
    private bh field_d;
    private th field_a;
    static db field_h;
    private bo[] field_f;
    private rh field_g;
    static String field_i;
    private ke field_b;

    final bo a(int param0, int param1, sk param2, sk param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        bo var9 = null;
        byte[] var11 = null;
        if (null != ((ni) this).field_d) {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (param0 >= ((ni) this).field_f.length) {
                break L0;
              } else {
                if (((ni) this).field_f[param0] != null) {
                  return ((ni) this).field_f[param0];
                } else {
                  L1: {
                    ((ni) this).field_d.field_t = param0 * 72 - -6;
                    var6 = ((ni) this).field_d.f(12);
                    var7 = ((ni) this).field_d.f(126);
                    var11 = new byte[64];
                    if (param1 >= 10) {
                      break L1;
                    } else {
                      ((ni) this).field_g = null;
                      break L1;
                    }
                  }
                  ((ni) this).field_d.b(64, 0, var11, -54);
                  var9 = new bo(param0, param2, param3, ((ni) this).field_a, ((ni) this).field_b, var6, var11, var7, param4);
                  ((ni) this).field_f[param0] = var9;
                  return var9;
                }
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    ni(th param0, ke param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        bh var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = TetraLink.field_J;
        if (null != ((ni) this).field_d) {
          return true;
        } else {
          L0: {
            if (null == ((ni) this).field_g) {
              if (!((ni) this).field_a.b((byte) 119)) {
                ((ni) this).field_g = ((ni) this).field_a.a(false, 255, (byte) 0, 255, true);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((ni) this).field_g.field_v) {
            L1: {
              var10 = new bh(((ni) this).field_g.c(true));
              var10.field_t = 5;
              var3 = var10.d((byte) -99);
              if (param0 == 9) {
                break L1;
              } else {
                ni.c((byte) 110);
                break L1;
              }
            }
            L2: {
              L3: {
                var10.field_t = var10.field_t + var3 * 72;
                var16 = new byte[-var10.field_t + var10.field_u.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.b(var16.length, 0, var16, -26);
                if (((ni) this).field_e == null) {
                  break L3;
                } else {
                  if (((ni) this).field_j == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((ni) this).field_e, ((ni) this).field_j);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = qb.a(var10.field_u, (byte) -89, -var16.length + (var10.field_t - 5), 5);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  ((ni) this).field_f = new bo[var3];
                  ((ni) this).field_d = var10;
                  return true;
                } else {
                  if (var5[var7 - -1] == var17[var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void d(byte param0) {
        int var1 = 78 % ((param0 - 60) / 52);
        rf.a(0);
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 10) {
            return true;
        }
        return nl.a(param0, 10, true, true);
    }

    final static void a(ah param0, fg param1, int param2, byte param3) {
        cn.field_f = va.a(param3 ^ 4) * param2 / 1000;
        ug.a(param3 ^ -126, param0);
        ji.a(param0, 1);
        kj.a(3, param0);
        gg.b(120);
        af.b(param3 ^ -18425);
        if (param3 != -5) {
            field_c = -68;
        }
        en.field_K = -cn.field_f + 0;
    }

    public static void c(byte param0) {
        field_i = null;
        if (param0 <= 4) {
            field_c = 88;
        }
        field_h = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        id var4_ref_id = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        id var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = TetraLink.field_J;
        ec.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = wa.field_f.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = ec.field_e[9] >> -1939891800;
              var4 = ec.field_e[10] >> 589380296;
              var5 = ec.field_e[11] >> -1514381816;
              var6 = en.field_K << 1506850276;
              var7 = 0;
              var8 = le.d(var6, -28583) >> -1375733720;
              var9 = ua.a(78, var6) >> -2039064;
              if ((aa.field_Nb ^ -1) == 0) {
                break L1;
              } else {
                if (-1 == a.field_a) {
                  break L1;
                } else {
                  var7 = -320 + aa.field_Nb;
                  var9 = -128;
                  var8 = 240 - a.field_a;
                  break L1;
                }
              }
            }
            L2: {
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var9 = (int)((double)var9 * var10);
              var12 = var7 + -var3;
              var13 = -var4 + var8;
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var12 * var12 + (var13 * var13 - -(var14 * var14))));
              var12 = (int)((double)var12 * var10);
              var13 = (int)((double)var13 * var10);
              if (param0 == 71) {
                break L2;
              } else {
                field_h = null;
                break L2;
              }
            }
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L3: while (true) {
              if (wa.field_f.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (wa.field_f.length <= var17_int) {
                    var2[var16] = -2147483648;
                    var17 = wa.field_f[var16];
                    na.a(var16, false);
                    var18 = 0;
                    L5: while (true) {
                      if ((var18 ^ -1) <= -4) {
                        na.a(ec.field_e, true, bk.field_k, 9, false, false, var17);
                        bf.a(65793, var7, var17, var12, var13, var8, var9, var14);
                        var15++;
                        continue L3;
                      } else {
                        bk.field_k[var18] = bk.field_k[var18] + da.field_b[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_id = wa.field_f[var3];
            var4_ref_id.b(false);
            na.a(var3, false);
            var5 = var4_ref_id.field_a - -var4_ref_id.field_j >> -1302363711;
            var6 = var4_ref_id.field_L - -var4_ref_id.field_f >> 1587546113;
            var7 = var4_ref_id.field_m + var4_ref_id.field_P >> 441647585;
            var8 = ec.field_e[9] >> 981653346;
            var9 = ec.field_e[10] >> -1599256990;
            var10_int = ec.field_e[11] >> 1966914754;
            var11 = bk.field_k[4] * var9 + bk.field_k[3] * var8 - -(var10_int * bk.field_k[5]) >> 1172391182;
            var12 = bk.field_k[8] * var10_int + var8 * bk.field_k[6] - -(var9 * bk.field_k[7]) >> 1303698670;
            var13 = bk.field_k[11] * var10_int + var9 * bk.field_k[10] + bk.field_k[9] * var8 >> 1111431150;
            var2[var3] = var13 * var7 + (var6 * var12 + var11 * var5) >> -1053607216;
            var3++;
            continue L0;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = TetraLink.field_J;
        if (null == ((ni) this).field_f) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ni) this).field_f.length) {
              var3 = 88 / ((51 - param0) / 55);
              var5 = 0;
              var2 = var5;
              L1: while (true) {
                if (var5 >= ((ni) this).field_f.length) {
                  return;
                } else {
                  if (((ni) this).field_f[var5] != null) {
                    ((ni) this).field_f[var5].e(2);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != ((ni) this).field_f[var2]) {
                ((ni) this).field_f[var2].b((byte) 110);
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

    private ni(th param0, ke param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ni) this).field_a = param0;
        ((ni) this).field_j = param3;
        ((ni) this).field_b = param1;
        ((ni) this).field_e = param2;
        if (!((ni) this).field_a.b((byte) 119)) {
            ((ni) this).field_g = ((ni) this).field_a.a(false, 255, (byte) 0, 255, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Searching for an opponent";
        field_h = new db(4, 1, 1, 1);
    }
}
