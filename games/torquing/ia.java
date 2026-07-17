/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends af {
    static t field_f;
    private int field_h;
    int field_c;
    static double field_d;
    private int field_e;
    private int field_g;
    static int field_i;

    final static void d() {
        if (of.field_m < 140) {
            ea.b(-36, of.field_m - -20);
        } else {
            ea.b(-108, 160);
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 <= 16) {
            ia.c(23);
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 == -1) {
            return true;
        }
        return 0 != (1 << param1 & oh.field_c) ? true : false;
    }

    final void b(int param0) {
        if (param0 != 6) {
            ((ia) this).field_e = -123;
        }
        ((ia) this).a((byte) 75, 0, 0);
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var22 = Torquing.field_u;
          var4 = param1 + ((ia) this).field_h;
          var6 = 120 / ((25 - param0) / 44);
          var5 = ((ia) this).field_c + param2;
          if (wp.field_v[3] != null) {
            stackOut_2_0 = wp.field_v[3].field_w;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (null == wp.field_v[5]) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = wp.field_v[5].field_w;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (null != wp.field_v[1]) {
            stackOut_8_0 = wp.field_v[1].field_u;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 0;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (wp.field_v[7] == null) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = wp.field_v[7].field_u;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          var11 = ((ia) this).field_g + var4;
          var12 = ((ia) this).field_e + var5;
          var13 = var4 - -var7;
          var14 = var11 - var8;
          var15 = var9 + var5;
          var16 = var12 + -var10;
          var17 = var13;
          var18 = var14;
          if (var17 > var18) {
            var18 = var4 - -(((ia) this).field_g * var7 / (var7 + var8));
            var17 = var4 - -(((ia) this).field_g * var7 / (var7 + var8));
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var19 = var15;
          var20 = var16;
          if (var19 > var20) {
            var20 = ((ia) this).field_e * var9 / (var10 + var9) + var5;
            var19 = ((ia) this).field_e * var9 / (var10 + var9) + var5;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          rh.a(var4, ((ia) this).field_e, (byte) 71, var5, ((ia) this).field_g, ao.field_a);
          ph.d(var17, var19, var18 - var17, var20 - var19, bo.field_d);
          ph.b(tj.field_m);
          if (null != wp.field_v[0]) {
            ph.f(var4, var5, var17, var19);
            hm.a((byte) 101, var5, var4, wp.field_v[0]);
            ph.a(tj.field_m);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (wp.field_v[2] == null) {
            break L7;
          } else {
            ph.f(var18, var5, var11, var19);
            hm.a((byte) 60, var5, var14, wp.field_v[2]);
            ph.a(tj.field_m);
            break L7;
          }
        }
        L8: {
          if (null == wp.field_v[6]) {
            break L8;
          } else {
            ph.f(var4, var20, var17, var12);
            hm.a((byte) 95, var16, var4, wp.field_v[6]);
            ph.a(tj.field_m);
            break L8;
          }
        }
        L9: {
          if (null != wp.field_v[8]) {
            ph.f(var18, var20, var11, var12);
            hm.a((byte) 58, var16, var14, wp.field_v[8]);
            ph.a(tj.field_m);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (wp.field_v[1] == null) {
            break L10;
          } else {
            if (0 != wp.field_v[1].field_w) {
              ph.f(var17, var5, var18, var19);
              var21 = var13;
              L11: while (true) {
                if (var21 >= var14) {
                  ph.a(tj.field_m);
                  break L10;
                } else {
                  hm.a((byte) 66, var5, var21, wp.field_v[1]);
                  var21 = var21 + wp.field_v[1].field_w;
                  continue L11;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (null == wp.field_v[7]) {
            break L12;
          } else {
            if (wp.field_v[7].field_w == 0) {
              break L12;
            } else {
              ph.f(var17, var20, var18, var12);
              var21 = var13;
              L13: while (true) {
                if (var21 >= var14) {
                  ph.a(tj.field_m);
                  break L12;
                } else {
                  hm.a((byte) 70, var16, var21, wp.field_v[7]);
                  var21 = var21 + wp.field_v[7].field_w;
                  continue L13;
                }
              }
            }
          }
        }
        L14: {
          if (wp.field_v[3] == null) {
            break L14;
          } else {
            if (wp.field_v[3].field_u == 0) {
              break L14;
            } else {
              ph.f(var4, var19, var17, var20);
              var21 = var15;
              L15: while (true) {
                if (var21 >= var16) {
                  ph.a(tj.field_m);
                  break L14;
                } else {
                  hm.a((byte) 63, var21, var4, wp.field_v[3]);
                  var21 = var21 + wp.field_v[3].field_u;
                  continue L15;
                }
              }
            }
          }
        }
        L16: {
          if (wp.field_v[5] == null) {
            break L16;
          } else {
            if (wp.field_v[5].field_u == 0) {
              break L16;
            } else {
              ph.f(var18, var19, var11, var20);
              var21 = var15;
              L17: while (true) {
                if (var21 >= var16) {
                  ph.a(tj.field_m);
                  break L16;
                } else {
                  hm.a((byte) 88, var21, var14, wp.field_v[5]);
                  var21 = var21 + wp.field_v[5].field_u;
                  continue L17;
                }
              }
            }
          }
        }
    }

    ia(int param0, int param1, int param2, int param3) {
        ((ia) this).field_e = param3;
        ((ia) this).field_c = param1;
        ((ia) this).field_h = param0;
        ((ia) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
    }
}
