/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private int field_a;
    private int[] field_e;
    static boolean field_b;
    static hr[] field_j;
    private int[] field_c;
    static int field_k;
    static hr[] field_f;
    private int field_g;
    private int field_h;
    static ri[] field_d;
    private int field_i;

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        var3 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var7 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -5) {
            if (param0 == -34) {
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) <= -257) {
                  var2 = 0;
                  L2: while (true) {
                    if (256 <= var2) {
                      this.a((byte) 87);
                      ((ok) this).field_g = 256;
                      return;
                    } else {
                      var4 = var4 + ((ok) this).field_e[var2 - -1];
                      var9 = var9 + ((ok) this).field_e[6 + var2];
                      var3 = var3 + ((ok) this).field_e[var2];
                      var5 = var5 + ((ok) this).field_e[2 + var2];
                      var6 = var6 + ((ok) this).field_e[var2 - -3];
                      var7 = var7 + ((ok) this).field_e[4 + var2];
                      var8 = var8 + ((ok) this).field_e[var2 + 5];
                      var10 = var10 + ((ok) this).field_e[7 + var2];
                      var3 = var3 ^ var4 << -473847637;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> 446935170;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -749239064;
                      var8 = var8 + var5;
                      var6 = var6 + var7;
                      var6 = var6 ^ var7 >>> 743673136;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -545628886;
                      var10 = var10 + var7;
                      var8 = var8 + var9;
                      var8 = var8 ^ var9 >>> 528468420;
                      var3 = var3 + var8;
                      var9 = var9 + var10;
                      var9 = var9 ^ var10 << -1998193720;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> -696768343;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      ((ok) this).field_e[var2] = var3;
                      ((ok) this).field_e[var2 - -1] = var4;
                      ((ok) this).field_e[2 + var2] = var5;
                      ((ok) this).field_e[3 + var2] = var6;
                      ((ok) this).field_e[var2 - -4] = var7;
                      ((ok) this).field_e[var2 + 5] = var8;
                      ((ok) this).field_e[6 + var2] = var9;
                      ((ok) this).field_e[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var10 = var10 + ((ok) this).field_c[7 + var2];
                  var9 = var9 + ((ok) this).field_c[6 + var2];
                  var5 = var5 + ((ok) this).field_c[var2 - -2];
                  var3 = var3 + ((ok) this).field_c[var2];
                  var8 = var8 + ((ok) this).field_c[var2 - -5];
                  var6 = var6 + ((ok) this).field_c[var2 - -3];
                  var7 = var7 + ((ok) this).field_c[var2 + 4];
                  var4 = var4 + ((ok) this).field_c[var2 + 1];
                  var3 = var3 ^ var4 << -1370058901;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -1724460478;
                  var5 = var5 + var6;
                  var7 = var7 + var4;
                  var5 = var5 ^ var6 << 288187176;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 428664624;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << -850029974;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -1827942780;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << -213057272;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> -1996027735;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  ((ok) this).field_e[var2] = var3;
                  ((ok) this).field_e[1 + var2] = var4;
                  ((ok) this).field_e[var2 + 2] = var5;
                  ((ok) this).field_e[3 + var2] = var6;
                  ((ok) this).field_e[var2 - -4] = var7;
                  ((ok) this).field_e[5 + var2] = var8;
                  ((ok) this).field_e[var2 - -6] = var9;
                  ((ok) this).field_e[var2 - -7] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            var3 = var3 ^ var4 << 1620079211;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1284820354;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 2146230568;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 7164592;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1204422826;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 1940018756;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1386676568;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1376008201;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        if (param0 != 256) {
            this.c((byte) -25);
        }
        if (!(-1 != (((ok) this).field_g ^ -1))) {
            this.a((byte) -45);
            ((ok) this).field_g = 256;
        }
        ((ok) this).field_g = ((ok) this).field_g - 1;
        return ((ok) this).field_c[((ok) this).field_g - 1];
    }

    public static void b(byte param0) {
        field_j = null;
        field_d = null;
        if (param0 > -110) {
            field_b = false;
        }
        field_f = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = 71 % ((param0 - 17) / 37);
        ((ok) this).field_a = ((ok) this).field_a + 1;
        ((ok) this).field_h = ((ok) this).field_h + (((ok) this).field_a + 1);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var4 = ((ok) this).field_e[var2];
              if (0 != (var2 & 2)) {
                if (0 == (1 & var2)) {
                  ((ok) this).field_i = ((ok) this).field_i ^ ((ok) this).field_i << -1992104414;
                  break L1;
                } else {
                  ((ok) this).field_i = ((ok) this).field_i ^ ((ok) this).field_i >>> 809640560;
                  break L1;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((ok) this).field_i = ((ok) this).field_i ^ ((ok) this).field_i >>> -2050135962;
                  break L1;
                } else {
                  ((ok) this).field_i = ((ok) this).field_i ^ ((ok) this).field_i << 1230149325;
                  break L1;
                }
              }
            }
            ((ok) this).field_i = ((ok) this).field_i + ((ok) this).field_e[var2 - -128 & 255];
            var5 = ((ok) this).field_i + ((ok) this).field_e[eb.a(1020, var4) >> 408673442] - -((ok) this).field_h;
            ((ok) this).field_e[var2] = ((ok) this).field_i + ((ok) this).field_e[eb.a(1020, var4) >> 408673442] - -((ok) this).field_h;
            ((ok) this).field_h = var4 + ((ok) this).field_e[eb.a(255, var5 >> 1802644232 >> -1933610206)];
            ((ok) this).field_c[var2] = var4 + ((ok) this).field_e[eb.a(255, var5 >> 1802644232 >> -1933610206)];
            var2++;
            continue L0;
          }
        }
    }

    final static l[] a(int param0, pl param1) {
        int var2 = 0;
        int var3 = 0;
        l[] var4 = null;
        int var5 = 0;
        l var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = param1.b(8, (byte) -97);
        if (var2 <= 0) {
          L0: {
            var3 = param1.b(12, (byte) -115);
            var4 = new l[var3];
            var5 = 0;
            if (param0 <= -74) {
              break L0;
            } else {
              field_k = 85;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (!kh.a(param1, false)) {
                var6 = param1.b(si.c(-1 + var5, 1), (byte) -123);
                var4[var5] = var4[var6];
                var5++;
                continue L1;
              } else {
                var6_ref = new l();
                int discarded$156 = param1.b(24, (byte) -89);
                int discarded$157 = param1.b(24, (byte) -117);
                var6_ref.field_b = param1.b(24, (byte) -119);
                int discarded$158 = param1.b(9, (byte) -119);
                int discarded$159 = param1.b(12, (byte) -101);
                int discarded$160 = param1.b(12, (byte) -125);
                int discarded$161 = param1.b(12, (byte) -93);
                var4[var5] = var6_ref;
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        gk var4_ref_gk = null;
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
        gk var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        pn.field_k = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = mr.field_b.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              var3 = pn.field_k[9] >> 1569026248;
              var4 = pn.field_k[10] >> -1918756472;
              var5 = pn.field_k[11] >> -859604472;
              var6 = td.field_u << -1012459644;
              var7 = 0;
              var8 = ic.b(var6, -431) >> -2131437624;
              var9 = cn.c(param0 + -256, var6) >> -2059849112;
              if (ko.field_p == -1) {
                break L1;
              } else {
                if ((pi.field_e ^ -1) != 0) {
                  var9 = -128;
                  var7 = ko.field_p + -320;
                  var8 = -pi.field_e + 240;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var10 = (double)param0 / Math.sqrt((double)(var9 * var9 + (var7 * var7 + var8 * var8)));
            var7 = (int)((double)var7 * var10);
            var8 = (int)((double)var8 * var10);
            var9 = (int)((double)var9 * var10);
            var12 = -var3 + var7;
            var13 = -var4 + var8;
            var14 = var9 - var5;
            var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L2: while (true) {
              if (var15 >= mr.field_b.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L3: while (true) {
                  if (mr.field_b.length <= var17_int) {
                    var23[var16] = -2147483648;
                    var17 = mr.field_b[var16];
                    cb.a((byte) 79, var16);
                    var18 = 0;
                    L4: while (true) {
                      if (3 <= var18) {
                        up.a(pn.field_k, uc.field_b, false, false, var17, true, -1622738130);
                        qu.a(var7, var17, var14, var12, var9, var13, (byte) -9, var8);
                        var15++;
                        continue L2;
                      } else {
                        uc.field_b[var18] = uc.field_b[var18] + kh.field_c[var15][var18];
                        var18++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L3;
                    } else {
                      var17_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_gk = mr.field_b[var3];
            var4_ref_gk.a(false);
            cb.a((byte) 79, var3);
            var5 = var4_ref_gk.field_T - -var4_ref_gk.field_t >> 1711988353;
            var6 = var4_ref_gk.field_j + var4_ref_gk.field_f >> 391965089;
            var7 = var4_ref_gk.field_P + var4_ref_gk.field_S >> -842464895;
            var8 = pn.field_k[9] >> 1580014146;
            var9 = pn.field_k[10] >> -1150545406;
            var10_int = pn.field_k[11] >> 23789186;
            var11 = var9 * uc.field_b[4] + uc.field_b[3] * var8 + uc.field_b[5] * var10_int >> -251536114;
            var12 = var10_int * uc.field_b[8] + uc.field_b[7] * var9 + var8 * uc.field_b[6] >> -716730706;
            var13 = uc.field_b[11] * var10_int + (uc.field_b[9] * var8 - -(uc.field_b[10] * var9)) >> 847025198;
            var2[var3] = var13 * var7 + var11 * var5 - -(var12 * var6) >> -782169744;
            var3++;
            continue L0;
          }
        }
    }

    ok(int[] param0) {
        int var2 = 0;
        ((ok) this).field_c = new int[256];
        ((ok) this).field_e = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((ok) this).field_c[var2] = param0[var2];
        }
        this.c((byte) -34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
