/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    int field_a;
    int field_l;
    ur field_p;
    int field_b;
    int field_r;
    int field_d;
    ur field_g;
    private int field_j;
    int field_o;
    static nj field_i;
    int field_m;
    static String field_f;
    cc field_n;
    ur field_c;
    static int field_e;
    private boolean field_k;
    ur field_h;
    ur field_q;

    private final void a(String param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((mc) this).field_l + ((mc) this).field_m;
              var6 = ((mc) this).field_r + ((mc) this).field_a;
              var7 = ((mc) this).field_o;
              if (var7 == -1) {
                var7 = ((mc) this).field_n.field_z + ((mc) this).field_n.field_M;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = -33 / ((-35 - param2) / 50);
                var8 = bi.field_e >> 2;
                var9 = ((mc) this).field_n.c(param0);
                var11 = ((mc) this).field_n.field_M + ((mc) this).field_n.field_z;
                var12 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param0.indexOf("<br>") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (null != vo.field_u) {
                  break L4;
                } else {
                  vo.field_u = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var9 > var8) {
                  var14 = var9 / var8;
                  var13 = (-1 + var9 % var8 - -var14) / var14 * 2 + var8;
                  break L5;
                } else {
                  var13 = var8;
                  break L5;
                }
              }
              var12 = ((mc) this).field_n.a(param0, new int[1], vo.field_u);
              var11 = var11 + var7 * (-1 + var12);
              var9 = 0;
              var14 = 0;
              L6: while (true) {
                if (var14 >= var12) {
                  break L2;
                } else {
                  L7: {
                    var15 = ((mc) this).field_n.c(vo.field_u[var14]);
                    if (var9 < var15) {
                      var9 = var15;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var14++;
                  continue L6;
                }
              }
            }
            L8: {
              var13 = param1;
              if (var9 + var13 + var5_int <= bi.field_e) {
                break L8;
              } else {
                var13 = bi.field_e + -var9 - var5_int;
                break L8;
              }
            }
            L9: {
              var14 = 32 + (param3 + -((mc) this).field_n.field_t);
              if (var14 + (var11 + var6) > bi.field_j) {
                var14 = -var6 + -var11 + param3;
                break L9;
              } else {
                break L9;
              }
            }
            bi.e(var13, var14, var9 + var5_int, var11 + var6, ((mc) this).field_b);
            bi.b(1 + var13, 1 + var14, -2 + (var5_int + var9), var11 - (-var6 - -2), ((mc) this).field_d);
            int discarded$1 = ((mc) this).field_n.a(param0, ((mc) this).field_m + var13, ((mc) this).field_r + var14, var9, var11, ((mc) this).field_j, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("mc.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, String param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((mc) this).field_n.c(param1);
              var6 = ((mc) this).field_n.field_M + ((mc) this).field_n.field_t;
              var7 = param0;
              if (bi.field_e >= var7 + (var5_int + 6)) {
                break L1;
              } else {
                var7 = -var5_int + (bi.field_e - 6);
                break L1;
              }
            }
            L2: {
              var8 = -((mc) this).field_n.field_t + param2 - -32;
              if (6 + var6 + var8 > bi.field_j) {
                var8 = -var6 + (bi.field_j + -6);
                break L2;
              } else {
                break L2;
              }
            }
            bi.e(var7, var8, 6 + var5_int, var6 - -6, ((mc) this).field_j);
            bi.b(var7 - -1, 1 + var8, 4 + var5_int, var6 - -4, ((mc) this).field_d);
            ((mc) this).field_n.b(param1, var7 - -3, ((mc) this).field_n.field_t + var8 + 3, ((mc) this).field_j, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("mc.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + 116 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
    }

    final void a(cc param0, int param1) {
        RuntimeException var3 = null;
        mq var4 = null;
        er[] var5 = null;
        mq var6 = null;
        int var7_int = 0;
        mq var7 = null;
        mq var8 = null;
        er[] var9 = null;
        er[] var10 = null;
        mq var11 = null;
        mq var12 = null;
        er var13 = null;
        mq var14 = null;
        int var15 = 0;
        fe var16 = null;
        va var17 = null;
        fe var18 = null;
        mq var19 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new va(param0, 2, 2, 2236962, 1, 1, 1, param0.field_M + (param0.field_z + 2));
              ((mc) this).field_h = (ur) (Object) var17;
              var17.field_e = 16777215;
              var4 = new mq();
              if (param1 == -2) {
                break L1;
              } else {
                ((mc) this).field_b = -17;
                break L1;
              }
            }
            var17.a(16777215, (va) (Object) var4);
            ((mc) this).field_d = 5592405;
            ((mc) this).field_o = -1;
            ((mc) this).field_j = 15658734;
            ((mc) this).field_r = 3;
            var4.field_a = 11711154;
            var4.field_p = 15658734;
            ((mc) this).field_b = 15658734;
            ((mc) this).field_m = 3;
            ((mc) this).field_n = param0;
            ((mc) this).field_l = 3;
            ((mc) this).field_a = 3;
            e discarded$10 = var4.a(0, 6216).a((byte) -59, 15658734).a(-115, wp.a(10066329, (byte) 75, 7829367, 8947848));
            e discarded$11 = var4.a(1, 6216).a(param1 + -115, wp.a(10066329, (byte) 120, 13421772, 11184810));
            e discarded$12 = var4.a(3, 6216).a(-121, wp.a(7829367, (byte) 77, 10066329, 8947848)).c(param1 ^ 32350, 1).a(97, 1);
            var5 = new er[9];
            var16 = new fe(32, 32);
            var18 = var16;
            var7_int = 0;
            L2: while (true) {
              if (var7_int >= var18.field_F.length) {
                var5[4] = (er) (Object) var18;
                e discarded$13 = var4.a(4, 6216).a(true, -107).a(param1 ^ 127, var5);
                e discarded$14 = var4.a(5, 6216).a(-114, gb.a(0, 65793, 0, param1 ^ -28292, 0)).a(true, param1 ^ 90).a((byte) -68, -1);
                ((mc) this).field_p = (ur) (Object) var4;
                var6 = new mq(var4, true);
                var6.field_m = 0;
                var7 = new mq(var4, true);
                var7.field_m = 0;
                var7.a(an.a(-105, 8947848), (byte) 62);
                e discarded$15 = var7.a(1, 6216).a(-124, an.a(-115, 11184810)).a((byte) -105, 2236962);
                ((mc) this).field_g = (ur) (Object) new kn(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                td discarded$16 = new td(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                jo discarded$17 = new jo(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new mq();
                var17.a(16777215, (va) (Object) var8);
                e discarded$18 = var8.a(0, param1 + 6218).a(param1 + -119, wp.a(7829367, (byte) 118, 10066329, 15658734)).a((byte) -57, 1118481).b(-1, -101);
                e discarded$19 = var8.a(4, 6216).a(true, param1 + -91).a(-117, var5);
                ((mc) this).field_c = (ur) (Object) var8;
                var9 = new er[9];
                var10 = new er[9];
                var9[4] = new er(2, 1);
                var10[4] = new er(1, 2);
                var9[4].field_F = new int[]{6710886, 7829367};
                var10[4].field_F = new int[]{6710886, 7829367};
                var11 = new mq();
                var12 = new mq();
                var11.a(0, var9, false);
                var12.a(0, var10, false);
                var13 = new er(7, 4);
                var13.field_F = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new mq(var4, true);
                var14.a((byte) 73, var13.c());
                var13.b();
                var14 = new mq(var4, true);
                var14.a((byte) -90, var13.c());
                var13.b();
                var14 = new mq(var4, true);
                var14.a((byte) -87, var13.c());
                var13.b();
                var19 = new mq(var4, true);
                var19.a((byte) 44, var13);
                break L0;
              } else {
                var16.field_F[var7_int] = 1077952576;
                var7_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("mc.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > -68) {
            ((mc) this).a(-70, 47, -40, -101, 33, 6);
        }
        bi.b(param5, param2, param6, param0, param3, param4);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        bi.a(param3, param4, param0, param1, param2);
        if (param5 < 79) {
            u discarded$0 = mc.a((byte) -78);
        }
    }

    final static u a(byte param0) {
        u var1 = new u(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], se.field_y[0], in.field_c);
        if (param0 != 9) {
            return null;
        }
        la.a((byte) 116);
        return var1;
    }

    final void a(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((mc) this).field_k) {
                this.a(param2, param0, param3, (byte) 116);
                break L1;
              } else {
                this.a(param0, param2, (byte) 100, param3);
                break L1;
              }
            }
            L2: {
              if (param1 < -1) {
                break L2;
              } else {
                ((mc) this).field_n = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("mc.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public mc() {
        ((mc) this).field_k = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<col=DE9200>time:</col> <%0>";
        field_i = new nj();
    }
}
