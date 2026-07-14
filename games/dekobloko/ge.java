/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static s field_f;
    static String field_d;
    static boolean field_j;
    static ck field_h;
    static ij field_g;
    static int field_b;
    static volatile int field_a;
    static volatile boolean field_i;
    static boolean field_c;

    final static int a(lk param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = client.field_A ? 1 : 0;
        if (param0 != null) {
          L0: {
            var2 = 0;
            var3 = 10000 / param0.field_O;
            if (param1 > 14) {
              break L0;
            } else {
              var7 = null;
              int discarded$2 = ge.a((lk) null, 96);
              break L0;
            }
          }
          var4 = param0.field_z;
          L1: while (true) {
            if (param0.field_a <= var4) {
              L2: {
                var2 = var2 + var3 * param0.field_O;
                var4 = 0;
                if (-5001 < var2) {
                  break L2;
                } else {
                  var4 = 1;
                  break L2;
                }
              }
              L3: {
                if (-20001 > var2) {
                  break L3;
                } else {
                  var4 = 2;
                  break L3;
                }
              }
              return var4;
            } else {
              var5 = 0;
              L4: while (true) {
                if (param0.field_O <= var5) {
                  var3 = var3 * 3 / 4;
                  var4++;
                  continue L1;
                } else {
                  if (-1 != (param0.field_P[var4 * param0.field_O - -var5] ^ -1)) {
                    var2 = var2 + var3;
                    var5++;
                    continue L4;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static jg b(byte param0) {
        String var1 = aa.a(param0 + 35);
        if (var1 != null) {
            if (-1 >= (var1.indexOf('@') ^ -1)) {
                var1 = "";
            }
        }
        if (param0 != -89) {
            field_b = 0;
        }
        return new jg(aa.a(-65), uk.c((byte) -17));
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final static ni a(byte param0, int param1, int param2, pi[] param3, byte[] param4, int param5) {
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        byte[][] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var17_int = 0;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        byte[][] var41 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        byte[][] var55 = null;
        int[] var56 = null;
        var28 = client.field_A ? 1 : 0;
        if (256 == param3.length) {
          var53 = new int[256];
          var46 = var53;
          var39 = var46;
          var32 = var39;
          var6 = var32;
          var54 = new int[256];
          var47 = var54;
          var40 = var47;
          var33 = var40;
          var7 = var33;
          var51 = new int[256];
          var44 = var51;
          var37 = var44;
          var30 = var37;
          var8 = var30;
          var52 = new int[256];
          var45 = var52;
          var38 = var45;
          var31 = var38;
          var9 = var31;
          var11 = -2 / ((48 - param0) / 43);
          var10 = new int[]{0, param1, param5};
          var55 = new byte[256][];
          var48 = var55;
          var41 = var48;
          var34 = var41;
          var12 = var34;
          var56 = hk.field_l;
          var14 = hk.field_j;
          var15 = hk.field_i;
          var50 = new int[4];
          hk.b(var50);
          var17_int = 0;
          L0: while (true) {
            if (-257 >= (var17_int ^ -1)) {
              var17 = new ni(param4, var53, var54, var51, var52, var10, var55);
              var17.field_C = var17.field_C - param2;
              var17.field_K = var17.field_K - param2;
              var17.field_R = var17.field_R - param2;
              hk.a(var56, var14, var15);
              hk.a(var50);
              return var17;
            } else {
              var6[var17_int] = param3[var17_int].field_d + -param2;
              var7[var17_int] = param3[var17_int].field_c + -param2;
              var8[var17_int] = (param2 << 435946913) + param3[var17_int].field_b;
              var9[var17_int] = param3[var17_int].field_i + (param2 << -894393727);
              var12[var17_int] = new byte[var51[var17_int] * var52[var17_int]];
              var18 = new byte[var51[var17_int] * var52[var17_int]];
              var19 = param3[var17_int].field_k;
              var20 = param3[var17_int].field_b;
              var21 = param3[var17_int].field_i;
              var22 = var51[var17_int];
              var23 = var22 + -var20;
              hk.a(new int[var52[var17_int] * var51[var17_int]], var51[var17_int], var52[var17_int]);
              var24 = 0;
              var25 = 0;
              L1: while (true) {
                if (var25 >= var21) {
                  var24 = 0;
                  var25 = 0;
                  L2: while (true) {
                    if (var18.length <= var25) {
                      var25 = (1 + var51[var17_int]) * param2;
                      var26 = 0;
                      L3: while (true) {
                        if (var26 >= var21) {
                          var17_int++;
                          continue L0;
                        } else {
                          var27 = 0;
                          L4: while (true) {
                            if (var20 <= var27) {
                              var25 = var25 + var23;
                              var26++;
                              continue L3;
                            } else {
                              int incrementValue$143 = var24;
                              var24++;
                              if (var19[incrementValue$143] != 0) {
                                int incrementValue$144 = var25;
                                var25++;
                                var18[incrementValue$144] = (byte) 1;
                                var27++;
                                continue L4;
                              } else {
                                var25++;
                                var27++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var18[var25] = (byte)hk.field_l[var25];
                      var25++;
                      continue L2;
                    }
                  }
                } else {
                  var26 = 0;
                  L5: while (true) {
                    if (var20 <= var26) {
                      var25++;
                      continue L1;
                    } else {
                      int incrementValue$145 = var24;
                      var24++;
                      if (0 != var19[incrementValue$145]) {
                        hk.a(var26, var25, (param2 << 1731923329) + 1, (param2 << -1375208415) + 1, 2);
                        var26++;
                        continue L5;
                      } else {
                        var26++;
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

    final static void a(int param0, int param1, byte param2, ud param3) {
        ai.a(80, 0, param3, param0, param1);
        if (param2 != 127) {
            ge.a((byte) 73);
        }
    }

    final static void a(byte param0) {
        pn.field_bb = new String[qb.field_u];
        pn.field_bb[18] = gg.field_E;
        pn.field_bb[17] = ue.field_d;
        pn.field_bb[5] = cc.field_b;
        pn.field_bb[4] = im.field_d;
        pn.field_bb[9] = gb.field_Tb;
        pn.field_bb[15] = ml.field_d;
        pn.field_bb[21] = cb.field_d;
        pn.field_bb[11] = km.field_y;
        pn.field_bb[7] = gh.field_d;
        pn.field_bb[20] = hd.field_v;
        pn.field_bb[19] = wk.field_k;
        pn.field_bb[6] = jd.field_Zb;
        pn.field_bb[13] = vh.field_c;
        if (param0 != 123) {
            field_e = 114;
        }
        pn.field_bb[16] = uj.field_e;
    }

    final static void a(byte param0, jk param1) {
        if (param0 > -65) {
            Object var3 = null;
            ni discarded$0 = ge.a((byte) -116, -89, -66, (pi[]) null, (byte[]) null, 119);
        }
        me.field_z = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_d = "Invalid name";
        field_g = new ij("usename");
        field_a = 0;
        field_i = true;
    }
}
