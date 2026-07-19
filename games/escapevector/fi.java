/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fi {
    int field_d;
    static String field_c;
    static mf field_j;
    int field_g;
    int field_h;
    static String field_b;
    static String field_e;
    int field_i;
    int field_a;
    int field_f;

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        field_e = null;
        if (param0 != -26317) {
            field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ia var4_ref_ia = null;
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
        ia var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            kh.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = fh.field_e.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = kh.field_a[9] >> -372641368;
                  var4 = kh.field_a[10] >> 1086133352;
                  var5 = kh.field_a[11] >> -297861944;
                  var6 = kb.field_d << -974480924;
                  var7 = 0;
                  var8 = fc.a(10758, var6) >> -850320536;
                  var9 = ul.a(-127, var6) >> -1912485944;
                  if (param0 < -107) {
                    break L2;
                  } else {
                    fi.a(56);
                    break L2;
                  }
                }
                L3: {
                  if (0 == (dh.field_d ^ -1)) {
                    break L3;
                  } else {
                    if (-1 == bj.field_y) {
                      break L3;
                    } else {
                      var7 = -320 + dh.field_d;
                      var8 = -bj.field_y + 240;
                      var9 = -128;
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 + -var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) - var14 * var14)));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L4: while (true) {
                  if (fh.field_e.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= fh.field_e.length) {
                        var21[var16] = -2147483648;
                        var17 = fh.field_e[var16];
                        ee.a(var16, 61);
                        var18 = 0;
                        L6: while (true) {
                          if (3 <= var18) {
                            cf.a(true, ka.field_c, false, kh.field_a, false, true, var17);
                            uk.a(var13, -16711760, var7, var12, var14, var17, var9, var8);
                            var15++;
                            continue L4;
                          } else {
                            ka.field_c[var18] = ka.field_c[var18] + jg.field_c[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        if (var21[var16] < var21[var17_int]) {
                          var16 = var17_int;
                          var17_int++;
                          continue L5;
                        } else {
                          var17_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_ia = fh.field_e[var3];
                var4_ref_ia.a((byte) 49);
                ee.a(var3, 103);
                var5 = var4_ref_ia.field_a + var4_ref_ia.field_b >> -555158143;
                var6 = var4_ref_ia.field_i + var4_ref_ia.field_R >> 1931744449;
                var7 = var4_ref_ia.field_g - -var4_ref_ia.field_O >> 1670066881;
                var8 = kh.field_a[9] >> 1456771778;
                var9 = kh.field_a[10] >> -147399710;
                var10_int = kh.field_a[11] >> -1419368254;
                var11 = var8 * ka.field_c[3] + (var9 * ka.field_c[4] + var10_int * ka.field_c[5]) >> -142556946;
                var12 = var10_int * ka.field_c[8] + ka.field_c[6] * var8 + ka.field_c[7] * var9 >> -1824041842;
                var13 = var8 * ka.field_c[9] + var9 * ka.field_c[10] - -(ka.field_c[11] * var10_int) >> -1380770610;
                var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> -1368475344;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "fi.F(" + param0 + ')');
        }
    }

    final static void a(dk[] param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        dk[] var5 = null;
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = new int[]{3170352, 8421504, 8421504};
              var3 = new int[]{6340704, 16777215, 16777215};
              var4 = new int[]{6340704, 16777215, 16777215};
              var5 = param0;
              var6 = param1;
              L1: while (true) {
                if (var6 >= var5.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var5[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(var3, var9, (byte) -122, var4);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("fi.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_b = "Name";
        field_c = "Invalid password.";
        field_e = "Player";
    }
}
