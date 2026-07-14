/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends ci {
    static String field_m;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var3 = ((nia) this).field_i.a((byte) 23, param1);
          if (((nia) this).field_i.field_d) {
            var15 = ((nia) this).c(0, -39, param1);
            var14 = ((nia) this).c(1, -74, param1);
            var13 = ((nia) this).c(2, -7, param1);
            var7 = 0;
            L1: while (true) {
              if (ns.field_g <= var7) {
                break L0;
              } else {
                var8 = var13[var7];
                if (-4097 == (var8 ^ -1)) {
                  var3[var7] = var15[var7];
                  var7++;
                  continue L1;
                } else {
                  if (var8 == 0) {
                    var3[var7] = var14[var7];
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var14[var7] * (4096 - var8) + var8 * var15[var7] >> -996530996;
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          return var3;
        } else {
          return null;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            nia.d(86);
            break L0;
          }
        }
        L1: {
          var51 = ((nia) this).field_h.a(param0, (byte) 113);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!((nia) this).field_h.field_f) {
            break L1;
          } else {
            var54 = ((nia) this).c(2, -104, param0);
            var52 = ((nia) this).a(param0, 0, -1);
            var53 = ((nia) this).a(param0, 1, param1 + 0);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var56 = var52[1];
            var57 = var52[2];
            var58 = var53[0];
            var59 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L2: while (true) {
              if (var16 >= ns.field_g) {
                break L1;
              } else {
                var17 = var54[var16];
                if (4096 != var17) {
                  var58 = var53[0];
                  if (0 == var17) {
                    var58 = var53[0];
                    var7[var16] = var58[var16];
                    var8[var16] = var59[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L2;
                  } else {
                    var18 = 4096 + -var17;
                    var7[var16] = var17 * var55[var16] - -(var58[var16] * var18) >> 1744457964;
                    var8[var16] = var18 * var59[var16] + var17 * var56[var16] >> 1406100780;
                    var9[var16] = var18 * var60[var16] + var57[var16] * var17 >> -1506313140;
                    var16++;
                    continue L2;
                  }
                } else {
                  var7[var16] = var55[var16];
                  var8[var16] = var56[var16];
                  var9[var16] = var57[var16];
                  var16++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    final static iu a(cn param0, String param1, String param2, int param3) {
        int var4 = param0.b(param1, -7768);
        int var6 = 88 / ((-9 - param3) / 60);
        int var5 = param0.a(true, param2, var4);
        return ot.a(var4, var5, param0, true);
    }

    public nia() {
        super(3, false);
    }

    final static void d(int param0) {
        tga.field_a = baa.field_d.field_i.field_d;
        tga.field_a.b(8192);
        iga.field_o = uja.a((byte) 65, tga.field_a);
        sw.k((byte) 94);
        hm.h((byte) 45);
        if (param0 != -25405) {
            Object var2 = null;
            iu discarded$0 = nia.a((cn) null, (String) null, (String) null, 78);
        }
        rka.a(false);
        ina.a(tga.field_a, 0);
        ob.a(tga.field_a, 17186);
        wpa.a(tga.field_a, -90);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param3 == 255) {
            break L0;
          } else {
            var10 = null;
            String discarded$2 = nia.a((byte[]) null, -10, 68, 102);
            break L0;
          }
        }
        var12 = new char[param2];
        var11 = var12;
        var4 = var11;
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (param2 <= var6) {
            return new String(var12, 0, var5);
          } else {
            var7 = 255 & param0[var6 + param1];
            if (var7 != -1) {
              L2: {
                if (-129 > var7) {
                  break L2;
                } else {
                  if (var7 >= 160) {
                    break L2;
                  } else {
                    L3: {
                      var8 = gha.field_a[var7 - 128];
                      if (0 != var8) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        if (param2 == 0) {
            ((nia) this).field_g = (param1.h(255) ^ -1) == -2 ? true : false;
        }
        if (param0 != 107) {
            field_m = null;
        }
    }

    public static void c(int param0) {
        if (param0 > -118) {
            field_m = null;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Invalid date";
    }
}
