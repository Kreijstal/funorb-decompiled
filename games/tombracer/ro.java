/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends wda {
    private int field_v;
    static String field_q;
    private int field_w;
    private boolean field_s;
    private gea field_t;
    private boolean field_o;
    private boolean field_u;
    private int field_r;
    static int field_p;

    final int c(int param0) {
        if (param0 != 1) {
            return 10;
        }
        return 5;
    }

    final void a(boolean param0, int param1) {
        ((ro) this).field_o = param0 ? true : false;
        if (param1 != -606738686) {
            ((ro) this).b((byte) -25);
        }
    }

    ro(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ro) this).field_s = false;
        ((ro) this).field_t = new gea(param0.field_E, param1);
        if (7 >= param0.field_E) {
            ((ro) this).field_r = param1.b((byte) 44, 4) << 542358128;
        } else {
            ((ro) this).field_r = ((ro) this).a(param1.b((byte) 44, 8), false);
        }
        if ((param0.field_E ^ -1) > -12) {
            ((ro) this).field_t.a(1 == param1.b((byte) 44, 1) ? true : false, 1);
        }
        if ((param0.field_E ^ -1) > -13) {
        }
        ((ro) this).field_o = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        if (!((ro) this).field_o) {
        }
        ((ro) this).field_u = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        ((ro) this).field_v = param1.b((byte) 44, 12);
    }

    final void b(int param0, boolean param1) {
        if (param0 != 4) {
            return;
        }
        ((ro) this).field_u = param1 ? true : false;
    }

    final void b(byte param0) {
        int[][] var2 = null;
        int var3 = 0;
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
        int[][] var15 = null;
        int[][] var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        if (!((ro) this).field_t.a(-4075)) {
          var19 = ((ro) this).field_t.c(-2);
          var18 = var19;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var2 = var15;
          var3 = 45 / ((-69 - param0) / 42);
          if (var19.length <= ((ro) this).field_w) {
            ((ro) this).field_w = 0;
            if (!((ro) this).field_t.a((byte) 21)) {
              var4 = var15[((ro) this).field_w][0] - -((ro) this).d((byte) -70);
              var5 = var15[((ro) this).field_w][1] - -((ro) this).a(false);
              var6 = -((ro) this).field_n.s(25745) + var4;
              var7 = var5 + -((ro) this).field_n.e(false);
              var8 = ((ro) this).field_r >> 209416848;
              var8 = var8 * var8;
              var9 = (var6 >> 173037776) * (var6 >> 2067083696) - -((var7 >> 865888368) * (var7 >> -1579119088));
              if (var9 > var8) {
                var10 = qva.a((byte) -99, var7, var6);
                if (((ro) this).field_o) {
                  if (((ro) this).field_s) {
                    var11 = cf.a(8192, -16390, var10, ((ro) this).field_n.g(-25787));
                    var12 = ua.a(var11, 39);
                    if (-1 != (((ro) this).field_v ^ -1)) {
                      if (var12 > ((ro) this).field_v) {
                        ((ro) this).field_n.c(false, -lw.a(var11, (byte) -76) * ((ro) this).field_v);
                        if (!((ro) this).field_u) {
                          var11 = hua.a((byte) 126, var10 >> -906254206);
                          var12 = bua.a(0, var10 >> -606738686);
                          var13 = doa.a(2, ((ro) this).field_r, var11);
                          var14 = doa.a(2, ((ro) this).field_r, var12);
                          ((ro) this).field_n.a((byte) -77, var13, var14);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((ro) this).field_n.c(false, -var11);
                        ((ro) this).field_s = false;
                        var11 = hua.a((byte) 126, var10 >> -906254206);
                        var12 = bua.a(0, var10 >> -606738686);
                        var13 = doa.a(2, ((ro) this).field_r, var11);
                        var14 = doa.a(2, ((ro) this).field_r, var12);
                        ((ro) this).field_n.a((byte) -77, var13, var14);
                        return;
                      }
                    } else {
                      ((ro) this).field_n.c(false, -var11);
                      ((ro) this).field_s = false;
                      var11 = hua.a((byte) 126, var10 >> -906254206);
                      var12 = bua.a(0, var10 >> -606738686);
                      var13 = doa.a(2, ((ro) this).field_r, var11);
                      var14 = doa.a(2, ((ro) this).field_r, var12);
                      ((ro) this).field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    var11 = hua.a((byte) 126, var10 >> -906254206);
                    var12 = bua.a(0, var10 >> -606738686);
                    var13 = doa.a(2, ((ro) this).field_r, var11);
                    var14 = doa.a(2, ((ro) this).field_r, var12);
                    ((ro) this).field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> -906254206);
                  var12 = bua.a(0, var10 >> -606738686);
                  var13 = doa.a(2, ((ro) this).field_r, var11);
                  var14 = doa.a(2, ((ro) this).field_r, var12);
                  ((ro) this).field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                ((ro) this).field_n.a((byte) -112, var6, var7);
                ((ro) this).field_s = true;
                ((ro) this).field_w = ((ro) this).field_w + 1;
                return;
              }
            } else {
              ((ro) this).field_j = true;
              return;
            }
          } else {
            var4 = var15[((ro) this).field_w][0] - -((ro) this).d((byte) -70);
            var5 = var15[((ro) this).field_w][1] - -((ro) this).a(false);
            var6 = -((ro) this).field_n.s(25745) + var4;
            var7 = var5 + -((ro) this).field_n.e(false);
            var8 = ((ro) this).field_r >> 209416848;
            var8 = var8 * var8;
            var9 = (var6 >> 173037776) * (var6 >> 2067083696) - -((var7 >> 865888368) * (var7 >> -1579119088));
            if (var9 > var8) {
              var10 = qva.a((byte) -99, var7, var6);
              if (((ro) this).field_o) {
                if (((ro) this).field_s) {
                  var11 = cf.a(8192, -16390, var10, ((ro) this).field_n.g(-25787));
                  var12 = ua.a(var11, 39);
                  if (-1 != (((ro) this).field_v ^ -1)) {
                    if (var12 > ((ro) this).field_v) {
                      ((ro) this).field_n.c(false, -lw.a(var11, (byte) -76) * ((ro) this).field_v);
                      if (!((ro) this).field_u) {
                        var11 = hua.a((byte) 126, var10 >> -906254206);
                        var12 = bua.a(0, var10 >> -606738686);
                        var13 = doa.a(2, ((ro) this).field_r, var11);
                        var14 = doa.a(2, ((ro) this).field_r, var12);
                        ((ro) this).field_n.a((byte) -77, var13, var14);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ro) this).field_n.c(false, -var11);
                      ((ro) this).field_s = false;
                      var11 = hua.a((byte) 126, var10 >> -906254206);
                      var12 = bua.a(0, var10 >> -606738686);
                      var13 = doa.a(2, ((ro) this).field_r, var11);
                      var14 = doa.a(2, ((ro) this).field_r, var12);
                      ((ro) this).field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    ((ro) this).field_n.c(false, -var11);
                    ((ro) this).field_s = false;
                    var11 = hua.a((byte) 126, var10 >> -906254206);
                    var12 = bua.a(0, var10 >> -606738686);
                    var13 = doa.a(2, ((ro) this).field_r, var11);
                    var14 = doa.a(2, ((ro) this).field_r, var12);
                    ((ro) this).field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> -906254206);
                  var12 = bua.a(0, var10 >> -606738686);
                  var13 = doa.a(2, ((ro) this).field_r, var11);
                  var14 = doa.a(2, ((ro) this).field_r, var12);
                  ((ro) this).field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                var11 = hua.a((byte) 126, var10 >> -906254206);
                var12 = bua.a(0, var10 >> -606738686);
                var13 = doa.a(2, ((ro) this).field_r, var11);
                var14 = doa.a(2, ((ro) this).field_r, var12);
                ((ro) this).field_n.a((byte) -77, var13, var14);
                return;
              }
            } else {
              ((ro) this).field_n.a((byte) -112, var6, var7);
              ((ro) this).field_s = true;
              ((ro) this).field_w = ((ro) this).field_w + 1;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        ((ro) this).field_v = param0;
        int var3 = 18 % ((37 - param1) / 55);
    }

    final void b(int param0) {
        if (param0 != 1) {
            int discarded$0 = ((ro) this).e(91);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 98, param1, ((ro) this).field_r);
        param1 = fs.a((byte) 26, param1, ((ro) this).field_w);
        if (param0 != 0) {
          field_q = null;
          return param1;
        } else {
          return param1;
        }
    }

    final void a(kh param0, byte param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        kh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        kh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        kh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        super.a(param0, (byte) -91);
        if (param1 >= -78) {
          L0: {
            ((ro) this).field_o = true;
            ((ro) this).field_t.a(param0, 0);
            param0.a((byte) 54, ((ro) this).b(0, ((ro) this).field_r), 8);
            stackOut_10_0 = (kh) param0;
            stackOut_10_1 = -127;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (((ro) this).field_o) {
              stackOut_12_0 = (kh) (Object) stackIn_12_0;
              stackOut_12_1 = stackIn_12_1;
              stackOut_12_2 = 1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L0;
            } else {
              stackOut_11_0 = (kh) (Object) stackIn_11_0;
              stackOut_11_1 = stackIn_11_1;
              stackOut_11_2 = 0;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L0;
            }
          }
          L1: {
            ((kh) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, 1);
            if (!((ro) this).field_o) {
              break L1;
            } else {
              L2: {
                stackOut_14_0 = (kh) param0;
                stackOut_14_1 = -126;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (!((ro) this).field_u) {
                  stackOut_16_0 = (kh) (Object) stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L2;
                } else {
                  stackOut_15_0 = (kh) (Object) stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L2;
                }
              }
              ((kh) (Object) stackIn_17_0).a((byte) stackIn_17_1, stackIn_17_2, 1);
              param0.a((byte) -128, ((ro) this).field_v, 12);
              break L1;
            }
          }
          return;
        } else {
          L3: {
            ((ro) this).field_t.a(param0, 0);
            param0.a((byte) 54, ((ro) this).b(0, ((ro) this).field_r), 8);
            stackOut_1_0 = (kh) param0;
            stackOut_1_1 = -127;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (((ro) this).field_o) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L3;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L3;
            }
          }
          L4: {
            ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
            if (!((ro) this).field_o) {
              break L4;
            } else {
              L5: {
                stackOut_5_0 = (kh) param0;
                stackOut_5_1 = -126;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (!((ro) this).field_u) {
                  stackOut_7_0 = (kh) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L5;
                } else {
                  stackOut_6_0 = (kh) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L5;
                }
              }
              ((kh) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, 1);
              param0.a((byte) -128, ((ro) this).field_v, 12);
              break L4;
            }
          }
          return;
        }
    }

    final void a(int param0, gea param1) {
        ((ro) this).field_t = param1;
        if (param0 < 6) {
            field_q = null;
        }
    }

    ro(la param0, boolean param1) {
        super(param0, param1);
        ((ro) this).field_s = false;
        ((ro) this).field_t = new gea();
        ((ro) this).field_r = 131072;
    }

    final static int a(byte param0, String param1, boolean param2) {
        if (param0 != -116) {
            return 51;
        }
        if (!param2) {
            return bfa.field_c.b(param1);
        }
        return qt.field_a.b(param1);
    }

    final int e(int param0) {
        if (param0 < 2) {
            field_q = null;
            return ((ro) this).field_r;
        }
        return ((ro) this).field_r;
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 > -101) {
            Object var2 = null;
            int discarded$0 = ro.a((byte) -4, (String) null, false);
        }
    }

    final void c(byte param0) {
        if (param0 > -116) {
          ((ro) this).field_w = -124;
          super.c((byte) -119);
          ((ro) this).field_t.a(true);
          return;
        } else {
          super.c((byte) -119);
          ((ro) this).field_t.a(true);
          return;
        }
    }

    final void a(byte param0, int param1) {
        ((ro) this).field_r = param1;
        int var3 = 84 % ((-37 - param0) / 46);
    }

    final int d(boolean param0) {
        if (param0) {
            ((ro) this).field_r = -121;
            return ((ro) this).field_w;
        }
        return ((ro) this).field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Enter name of friend to delete from list";
    }
}
