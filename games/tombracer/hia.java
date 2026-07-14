/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hia extends wda {
    private boolean field_t;
    private int field_p;
    private boolean field_r;
    private ir field_o;
    static af field_s;
    private int field_q;

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hca var11 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = ((hia) this).field_n.H(-123);
        if (!var11.u(-25561)) {
          ((hia) this).field_o.field_f = var11.d(3);
          ((hia) this).field_o.field_d = var11.e(9648);
          var4 = 78 % ((-69 - param0) / 42);
          ((hia) this).field_n.a(((hia) this).field_o, 59);
          var3 = ((hia) this).field_o.field_f - ((hia) this).field_n.s(25745);
          var5 = ((hia) this).field_o.field_d + -((hia) this).field_n.e(false);
          var6 = 0;
          var7 = 0;
          var8 = ua.a(var3, -120);
          var9 = ua.a(var5, 4);
          if (((hia) this).field_t) {
            if (var8 > ((hia) this).field_p) {
              if (var3 >= 0) {
                var6 = ((hia) this).field_q;
                if (var6 > var3) {
                  var6 = var3;
                  ((hia) this).field_n.a((byte) -42, var6, var7);
                  return;
                } else {
                  ((hia) this).field_n.a((byte) -42, var6, var7);
                  return;
                }
              } else {
                var6 = -((hia) this).field_q;
                if (var6 < var3) {
                  var6 = var3;
                  ((hia) this).field_n.a((byte) -42, var6, var7);
                  return;
                } else {
                  ((hia) this).field_n.a((byte) -42, var6, var7);
                  return;
                }
              }
            } else {
              if (((hia) this).field_r) {
                if (var9 > ((hia) this).field_p) {
                  if (var5 < 0) {
                    var7 = -((hia) this).field_q;
                    if (var7 < var5) {
                      var7 = var5;
                      ((hia) this).field_n.a((byte) -42, var6, var7);
                      return;
                    } else {
                      ((hia) this).field_n.a((byte) -42, var6, var7);
                      return;
                    }
                  } else {
                    var7 = ((hia) this).field_q;
                    if (var7 > var5) {
                      var7 = var5;
                      ((hia) this).field_n.a((byte) -42, var6, var7);
                      return;
                    } else {
                      ((hia) this).field_n.a((byte) -42, var6, var7);
                      return;
                    }
                  }
                } else {
                  ((hia) this).field_n.a((byte) -42, var6, var7);
                  return;
                }
              } else {
                ((hia) this).field_n.a((byte) -42, var6, var7);
                return;
              }
            }
          } else {
            if (((hia) this).field_r) {
              if (var9 > ((hia) this).field_p) {
                if (var5 < 0) {
                  var7 = -((hia) this).field_q;
                  if (var7 < var5) {
                    var7 = var5;
                    ((hia) this).field_n.a((byte) -42, var6, var7);
                    return;
                  } else {
                    ((hia) this).field_n.a((byte) -42, var6, var7);
                    return;
                  }
                } else {
                  var7 = ((hia) this).field_q;
                  if (var7 > var5) {
                    var7 = var5;
                    ((hia) this).field_n.a((byte) -42, var6, var7);
                    return;
                  } else {
                    ((hia) this).field_n.a((byte) -42, var6, var7);
                    return;
                  }
                }
              } else {
                ((hia) this).field_n.a((byte) -42, var6, var7);
                return;
              }
            } else {
              ((hia) this).field_n.a((byte) -42, var6, var7);
              return;
            }
          }
        } else {
          return;
        }
    }

    hia(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((hia) this).field_t = true;
        ((hia) this).field_r = false;
        ((hia) this).field_q = 131072;
        ((hia) this).field_o = new ir();
        ((hia) this).field_t = 1 != param1.b((byte) 44, 1) ? false : true;
        ((hia) this).field_r = 1 == param1.b((byte) 44, 1) ? true : false;
        ((hia) this).field_q = ((hia) this).a(param1.b((byte) 44, 8), false);
        ((hia) this).field_p = param1.b((byte) 44, 10) << 100014256;
    }

    hia(la param0, boolean param1) {
        super(param0, param1);
        ((hia) this).field_t = true;
        ((hia) this).field_r = false;
        ((hia) this).field_q = 131072;
        ((hia) this).field_o = new ir();
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = jba.field_j;
        var3 = sta.field_B;
        var4 = kua.field_i.field_H.a(param1, 500);
        var5 = 6 + kua.field_i.field_H.c(param1, 500);
        var6 = di.field_a * var4 - -2;
        var7 = bt.a((byte) -8, var5, 12, var2);
        var8 = hsa.a(20, var6, var3, (byte) -107);
        bea.f(var7, var8, var5, var6, 0);
        bea.e(var7 - -1, 1 + var8, var5 - 2, -2 + var6, 16777088);
        if (param0 > -63) {
          field_s = null;
          int discarded$2 = kua.field_i.field_H.a(param1, var7 - -3, -kua.field_i.field_H.field_w + (hsa.field_a + 1) + var8, 500, 1000, 0, -1, 0, 0, di.field_a);
          return;
        } else {
          int discarded$3 = kua.field_i.field_H.a(param1, var7 - -3, -kua.field_i.field_H.field_w + (hsa.field_a + 1) + var8, 500, 1000, 0, -1, 0, 0, di.field_a);
          return;
        }
    }

    final void b(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 11050) {
          L0: {
            ((hia) this).field_o = null;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((hia) this).field_t = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((hia) this).field_t = stackIn_4_1 != 0;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (param0) {
            Object var4 = null;
            ((hia) this).a((kh) null, (byte) -118);
            ((hia) this).field_q = param1;
            return;
        }
        ((hia) this).field_q = param1;
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return -126;
        }
        return param1;
    }

    final void b(int param0) {
        if (param0 != 1) {
            ((hia) this).c(-53, false);
        }
    }

    final void a(kh param0, byte param1) {
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          super.a(param0, (byte) -108);
          stackOut_0_0 = (kh) param0;
          stackOut_0_1 = -127;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((hia) this).field_t) {
            stackOut_2_0 = (kh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (kh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
          stackOut_3_0 = (kh) param0;
          stackOut_3_1 = -126;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (((hia) this).field_r) {
            stackOut_5_0 = (kh) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (kh) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        ((kh) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2, 1);
        if (param1 > -78) {
          ((hia) this).b(-8, false);
          param0.a((byte) -125, ((hia) this).b(0, ((hia) this).field_q), 8);
          param0.a((byte) -128, ((hia) this).field_p >> -1664748336, 10);
          return;
        } else {
          param0.a((byte) -125, ((hia) this).b(0, ((hia) this).field_q), 8);
          param0.a((byte) -128, ((hia) this).field_p >> -1664748336, 10);
          return;
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -110;
        }
        return 14;
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 != 14) {
            field_s = null;
        }
    }

    final void c(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            ((hia) this).field_r = false;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((hia) this).field_r = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((hia) this).field_r = stackIn_4_1 != 0;
          return;
        }
    }

    static {
    }
}
