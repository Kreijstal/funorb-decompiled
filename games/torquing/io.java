/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends ig {
    static int[] field_s;

    final static void b(byte param0) {
        int var4 = Torquing.field_u;
        if (param0 != 78) {
            return;
        }
        int[] var5 = a.field_f;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final String c(byte param0, gm param1) {
        if (param0 != 65) {
            return null;
        }
        return ff.a(param1.field_m.length(), '*', true);
    }

    public static void a(byte param0) {
        field_s = null;
        if (param0 != -113) {
            io.b((byte) 20);
        }
    }

    private io(uc param0, int param1) {
        super(param0, param1);
    }

    io(int param0) {
        this(dg.field_e, param0);
    }

    final static vn a(sm[] param0, int param1, byte[] param2) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8_int = 0;
        vn var8 = null;
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
        var25 = Torquing.field_u;
        if (param0.length != 256) {
          throw new IllegalArgumentException();
        } else {
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
            var41 = new int[256];
            var36 = var41;
            var31 = var36;
            var26 = var31;
            var5 = var26;
            if (param1 == -1) {
              break L0;
            } else {
              field_s = null;
              break L0;
            }
          }
          var42 = new int[256];
          var37 = var42;
          var32 = var37;
          var27 = var32;
          var6 = var27;
          var45 = new byte[256][];
          var40 = var45;
          var35 = var40;
          var30 = var35;
          var7 = var30;
          var8_int = 0;
          L1: while (true) {
            if (var8_int >= 256) {
              var8 = new vn(param2, var43, var44, var41, var42, var45);
              var8.field_x = var8.field_x - 1;
              var8.field_s = var8.field_s - 1;
              var8.field_t = var8.field_t - 1;
              return var8;
            } else {
              var3[var8_int] = param0[var8_int].field_a - 1;
              var4[var8_int] = -1 + param0[var8_int].field_g;
              var5[var8_int] = param0[var8_int].field_c - -2;
              var6[var8_int] = 2 + param0[var8_int].field_d;
              var7[var8_int] = new byte[var41[var8_int] * var42[var8_int]];
              var9 = new byte[var41[var8_int] * var42[var8_int]];
              var10 = param0[var8_int].field_l;
              var11 = param0[var8_int].field_c;
              var12 = param0[var8_int].field_d;
              var13 = var41[var8_int];
              var14 = -var11 + var13;
              var15 = 0;
              var16 = var41[var8_int] - -1;
              var17 = 0;
              L2: while (true) {
                if (var17 >= var12) {
                  var15 = 0;
                  var16 = var41[var8_int] - -1;
                  var17 = 0;
                  L3: while (true) {
                    if (var17 >= var12) {
                      var8_int++;
                      continue L1;
                    } else {
                      var18 = 0;
                      L4: while (true) {
                        if (var18 >= var11) {
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
                      if (-1 != (var10[var15] ^ -1)) {
                        var19 = var9;
                        var20 = var16 - var13;
                        var21 = var9;
                        var22 = var16 + -1;
                        var23 = var9;
                        var9[var13 + var16] = (byte) 1;
                        var24 = 1 + var16;
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
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[8192];
    }
}
