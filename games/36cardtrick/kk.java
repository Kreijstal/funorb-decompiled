/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;
    static volatile int field_b;

    final static int a(int param0, int param1, int param2) {
        int var4 = Main.field_T;
        if (param1 < 113) {
            Object var5 = null;
            ef discarded$0 = kk.a((wb[]) null, (byte[]) null, -29, 88, 105);
        }
        int var3 = 0;
        while (-1 > (param2 ^ -1)) {
            var3 = var3 << 887824321 | param0 & 1;
            param2--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    final static ef a(wb[] param0, byte[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        ef var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        byte[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        var28 = Main.field_T;
        if (param3 == param0.length) {
          var46 = new int[256];
          var41 = var46;
          var36 = var41;
          var31 = var36;
          var5 = var31;
          var47 = new int[256];
          var42 = var47;
          var37 = var42;
          var32 = var37;
          var6 = var32;
          var45 = new int[256];
          var40 = var45;
          var35 = var40;
          var30 = var35;
          var7 = var30;
          var44 = new int[256];
          var39 = var44;
          var34 = var39;
          var29 = var34;
          var8 = var29;
          var9 = new int[]{0, param4, param2};
          var48 = new byte[256][];
          var43 = var48;
          var38 = var43;
          var33 = var38;
          var10 = var33;
          var11_int = 0;
          L0: while (true) {
            if ((var11_int ^ -1) <= -257) {
              var11 = new ef(param1, var46, var47, var45, var44, var9, var48);
              var11.field_s = var11.field_s - 1;
              var11.field_x = var11.field_x - 1;
              var11.field_q = var11.field_q - 1;
              return var11;
            } else {
              var5[var11_int] = -1 + param0[var11_int].field_h;
              var6[var11_int] = param0[var11_int].field_c + -1;
              var7[var11_int] = param0[var11_int].field_g - -2;
              var8[var11_int] = param0[var11_int].field_b - -2;
              var10[var11_int] = new byte[var44[var11_int] * var45[var11_int]];
              var12 = new byte[var44[var11_int] * var45[var11_int]];
              var13 = param0[var11_int].field_i;
              var14 = param0[var11_int].field_g;
              var15 = param0[var11_int].field_b;
              var16 = var45[var11_int];
              var17 = -var14 + var16;
              var18 = 0;
              var19 = var45[var11_int] - -1;
              var20 = 0;
              L1: while (true) {
                if (var20 >= var15) {
                  var19 = 1 + var45[var11_int];
                  var18 = 0;
                  var20 = 0;
                  L2: while (true) {
                    if (var15 > var20) {
                      var21 = 0;
                      L3: while (true) {
                        if (var21 >= var14) {
                          var19 = var19 + var17;
                          var20++;
                          continue L2;
                        } else {
                          int incrementValue$153 = var18;
                          var18++;
                          if (-1 == (var13[incrementValue$153] ^ -1)) {
                            var19++;
                            var21++;
                            continue L3;
                          } else {
                            int incrementValue$154 = var19;
                            var19++;
                            var12[incrementValue$154] = (byte) 1;
                            var21++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      var11_int++;
                      continue L0;
                    }
                  }
                } else {
                  var21 = 0;
                  L4: while (true) {
                    if (var14 <= var21) {
                      var19 = var19 + var17;
                      var20++;
                      continue L1;
                    } else {
                      int incrementValue$155 = var18;
                      var18++;
                      if (0 != var13[incrementValue$155]) {
                        var22 = var12;
                        var23 = -var16 + var19;
                        var24 = var12;
                        var25 = var19 - 1;
                        var26 = var12;
                        var12[var16 + var19] = (byte)2;
                        var27 = 1 + var19;
                        var26[var27] = (byte) 2;
                        var24[var25] = (byte) 2;
                        var22[var23] = (byte) 2;
                        var19++;
                        var21++;
                        continue L4;
                      } else {
                        var19++;
                        var21++;
                        continue L4;
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

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, qk param1) {
        int var3 = 0;
        int var4 = 0;
        mg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        w var8 = null;
        int var9 = 0;
        w var10 = null;
        var7 = Main.field_T;
        var8 = new w(param1.a((byte) 7, "", "logo.fo3d"));
        var10 = var8;
        var3 = var10.f(param0 ^ -16903);
        var10.f(true);
        ga.field_b = hk.a(param0 + 17076, var10);
        il.field_a = new mg[var3];
        sk.field_b = new int[var3][];
        var4 = 0;
        if (param0 == -16998) {
          L0: while (true) {
            if (var3 <= var4) {
              var10.g(8);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var5 = il.field_a[var9];
                  var5.a(6, 6, param0 + 10328, 1, 6);
                  var5.a((byte) 124);
                  var6 = new int[]{var5.field_f + var5.field_e >> 837186561, var5.field_u + var5.field_s >> 1164429537, var5.field_i + var5.field_z >> -808614751};
                  sk.field_b[var9] = var6;
                  var5.a(false, -var6[0], -var6[1], -var6[2]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              il.field_a[var4] = nb.a((byte) 119, var8);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = 0;
    }
}
