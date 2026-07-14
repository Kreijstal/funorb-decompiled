/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fc {
    int field_a;
    static ql field_e;
    static String field_c;
    int field_h;
    int field_b;
    int field_g;
    int field_d;
    int field_f;

    final static void a(int param0, jp param1) {
        jf.d(-99);
        lb.a(param1.field_G, param1.field_x, param1.field_z);
        if (param0 > -46) {
            Object var3 = null;
            bi discarded$0 = fc.a(79, (byte[]) null, 74, (tp[]) null, -94, -115);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 31797) {
            field_c = null;
        }
    }

    final static String a(int param0) {
        if (param0 <= 6) {
            return null;
        }
        if (!(ik.field_g != jm.field_f)) {
            return am.field_cc;
        }
        if (!(ma.field_I.b(96))) {
            return ma.field_I.a(0);
        }
        if (ka.field_l == jm.field_f) {
            return ma.field_I.a(0);
        }
        return gf.field_d;
    }

    final static bi a(int param0, byte[] param1, int param2, tp[] param3, int param4, int param5) {
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var16_int = 0;
        bi var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int[] var55 = null;
        var27 = BrickABrac.field_J ? 1 : 0;
        if (param3.length == 256) {
          var52 = new int[256];
          var45 = var52;
          var38 = var45;
          var31 = var38;
          var6 = var31;
          var53 = new int[256];
          var46 = var53;
          var39 = var46;
          var32 = var39;
          var7 = var32;
          var50 = new int[256];
          var43 = var50;
          var36 = var43;
          var29 = var36;
          var8 = var29;
          var51 = new int[256];
          var44 = var51;
          var37 = var44;
          var30 = var37;
          var9 = var30;
          var10 = new int[]{0, param2, param4};
          var54 = new byte[256][];
          var47 = var54;
          var40 = var47;
          var33 = var40;
          var11 = var33;
          var55 = lb.field_l;
          var13 = lb.field_c;
          var14 = lb.field_d;
          var49 = new int[4];
          lb.a(var49);
          var16_int = 0;
          L0: while (true) {
            if (var16_int >= 256) {
              var16 = new bi(param1, var52, var53, var50, var51, var10, var54);
              var16.field_B = var16.field_B - param0;
              var16.field_P = var16.field_P - param0;
              var16.field_F = var16.field_F - param0;
              if (param5 == 1) {
                var16.field_L = var16.field_L - param0;
                lb.a(var55, var13, var14);
                lb.b(var49);
                return var16;
              } else {
                return null;
              }
            } else {
              var6[var16_int] = -param0 + param3[var16_int].field_b;
              var7[var16_int] = -param0 + param3[var16_int].field_g;
              var8[var16_int] = param3[var16_int].field_d - -(param0 << -823040031);
              var9[var16_int] = (param0 << 1461966817) + param3[var16_int].field_a;
              var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
              var17 = new byte[var50[var16_int] * var51[var16_int]];
              var18 = param3[var16_int].field_i;
              var19 = param3[var16_int].field_d;
              var20 = param3[var16_int].field_a;
              var21 = var50[var16_int];
              var22 = -var19 + var21;
              lb.a(new int[var50[var16_int] * var51[var16_int]], var50[var16_int], var51[var16_int]);
              var23 = 0;
              var24 = 0;
              L1: while (true) {
                if (var20 <= var24) {
                  var24 = 0;
                  L2: while (true) {
                    if (var24 >= var17.length) {
                      var23 = 0;
                      var24 = (1 + var50[var16_int]) * param0;
                      var25 = 0;
                      L3: while (true) {
                        if (var20 <= var25) {
                          var16_int++;
                          continue L0;
                        } else {
                          var26 = 0;
                          L4: while (true) {
                            if (var19 <= var26) {
                              var24 = var24 + var22;
                              var25++;
                              continue L3;
                            } else {
                              var23++;
                              if (-1 == (var18[var23] ^ -1)) {
                                var24++;
                                var26++;
                                continue L4;
                              } else {
                                var24++;
                                var17[var24] = (byte) 1;
                                var26++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var17[var24] = (byte)lb.field_l[var24];
                      var24++;
                      continue L2;
                    }
                  }
                } else {
                  var25 = 0;
                  L5: while (true) {
                    if (var19 <= var25) {
                      var24++;
                      continue L1;
                    } else {
                      var23++;
                      if (0 != var18[var23]) {
                        lb.f(var25 - -param0, param0 + var24, param0, 2);
                        var25++;
                        continue L5;
                      } else {
                        var25++;
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

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Username: ";
    }
}
