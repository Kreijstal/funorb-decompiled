/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends pu {
    static String field_l;

    final static void a(int param0, int param1, int param2, int param3, int param4, kv[] param5, int param6, int param7, po param8, int param9, int param10, kv[] param11, int param12, kv[] param13, po param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        tha.a(new lda(param5), param14, param7, new lda(param13), param9, param16, param6, param15, true, param2, param1, param8, new lda(param11), param18, param12, param10, param20, param3, param4, param19, param0);
        if (param17 != 256) {
            Object var22 = null;
            ll.a(-16, -38, -63, 72, 88, (kv[]) null, -28, -64, (po) null, 105, -128, (kv[]) null, 110, (kv[]) null, (po) null, -76, 31, -87, 88, -62, 81);
        }
    }

    final static fea a(byte[] param0, int param1, ee[] param2) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8_int = 0;
        fea var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        byte[] var19 = null;
        int var20 = 0;
        byte[] var21 = null;
        int var22 = 0;
        byte[] var23 = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        byte[][] var45 = null;
        var25 = BachelorFridge.field_y;
        if (-257 == (param2.length ^ -1)) {
          L0: {
            var43 = new int[256];
            var38 = var43;
            var33 = var38;
            var28 = var33;
            var3 = var28;
            var44 = new int[256];
            var39 = var44;
            var34 = var39;
            var29 = var34;
            var4 = var29;
            if (param1 == -8659) {
              break L0;
            } else {
              ll.d((byte) 123);
              break L0;
            }
          }
          var42 = new int[256];
          var37 = var42;
          var32 = var37;
          var27 = var32;
          var5 = var27;
          var41 = new int[256];
          var36 = var41;
          var31 = var36;
          var26 = var31;
          var6 = var26;
          var45 = new byte[256][];
          var40 = var45;
          var35 = var40;
          var30 = var35;
          var7 = var30;
          var8_int = 0;
          L1: while (true) {
            if (-257 >= (var8_int ^ -1)) {
              var8 = new fea(param0, var43, var44, var42, var41, var45);
              var8.field_v = var8.field_v - 1;
              var8.field_B = var8.field_B - 1;
              var8.field_u = var8.field_u - 1;
              return var8;
            } else {
              var3[var8_int] = param2[var8_int].field_f + -1;
              var4[var8_int] = param2[var8_int].field_c - 1;
              var5[var8_int] = 2 + param2[var8_int].field_d;
              var6[var8_int] = param2[var8_int].field_e - -2;
              var7[var8_int] = new byte[var41[var8_int] * var42[var8_int]];
              var9 = new byte[var41[var8_int] * var42[var8_int]];
              var10 = param2[var8_int].field_g;
              var11 = param2[var8_int].field_d;
              var12 = param2[var8_int].field_e;
              var13 = var42[var8_int];
              var14 = var13 + -var11;
              var15 = 0;
              var16 = var42[var8_int] + 1;
              var17 = 0;
              L2: while (true) {
                if (var17 >= var12) {
                  var16 = var42[var8_int] + 1;
                  var15 = 0;
                  var17 = 0;
                  L3: while (true) {
                    if (var17 >= var12) {
                      var8_int++;
                      continue L1;
                    } else {
                      var18 = 0;
                      L4: while (true) {
                        if (var11 <= var18) {
                          var16 = var16 + var14;
                          var17++;
                          continue L3;
                        } else {
                          var15++;
                          if (var10[var15] != 0) {
                            var16++;
                            var9[var16] = (byte) 0;
                            var18++;
                            continue L4;
                          } else {
                            var16++;
                            var18++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var18 = 0;
                  L5: while (true) {
                    if (var11 <= var18) {
                      var16 = var16 + var14;
                      var17++;
                      continue L2;
                    } else {
                      var15++;
                      if (0 != var10[var15]) {
                        var19 = var9;
                        var20 = -var13 + var16;
                        var21 = var9;
                        var22 = -1 + var16;
                        var23 = var9;
                        var24 = 1 + var16;
                        var9[var13 + var16] = (byte) 1;
                        var23[var24] = (byte) 1;
                        var21[var22] = (byte) 1;
                        var19[var20] = (byte) 1;
                        var16++;
                        var18++;
                        continue L5;
                      } else {
                        var16++;
                        var18++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    public static void d(byte param0) {
        field_l = null;
        if (param0 != 63) {
            Object var2 = null;
            ll.a(52, 15, 22, -43, 103, (kv[]) null, -109, 112, (po) null, 123, 80, (kv[]) null, 125, (kv[]) null, (po) null, 89, -55, 32, -96, 61, 68);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Instructions";
    }
}
