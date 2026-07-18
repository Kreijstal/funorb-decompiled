/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static String field_n;
    private int field_a;
    fe field_u;
    static boolean field_o;
    static String field_q;
    private boolean field_b;
    fe field_m;
    fe field_w;
    int field_g;
    fe field_h;
    fe field_j;
    int field_c;
    int field_l;
    static String field_f;
    static int field_t;
    int field_p;
    ok field_i;
    static String field_r;
    static java.applet.Applet field_d;
    int field_s;
    int field_e;
    int field_v;
    static java.applet.Applet field_k;

    final static rm a(int param0, hb param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        rm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rm stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1.g(8, 0);
            if (var2_int <= 0) {
              L1: {
                var3 = sm.a(37, param1) ? 1 : 0;
                var4 = sm.a(-128, param1) ? 1 : 0;
                var5 = new rm();
                var5.field_b = (short)param1.g(16, 0);
                var5.field_x = bn.a(0, param1, var5.field_x, 16);
                var5.field_v = bn.a(0, param1, var5.field_v, 16);
                var5.field_F = bn.a(0, param1, var5.field_F, 16);
                var5.field_w = (short)param1.g(16, 0);
                var5.field_z = bn.a(0, param1, var5.field_z, 16);
                var5.field_m = bn.a(0, param1, var5.field_m, 16);
                var5.field_J = bn.a(0, param1, var5.field_J, 16);
                if (var3 != 0) {
                  var5.field_g = (short)param1.g(16, 0);
                  var5.field_E = bn.a(0, param1, var5.field_E, 16);
                  var5.field_y = bn.a(0, param1, var5.field_y, 16);
                  var5.field_r = bn.a(0, param1, var5.field_r, 16);
                  var5.field_j = bn.a(0, param1, var5.field_j, 16);
                  var5.field_l = bn.a(0, param1, var5.field_l, 16);
                  var5.field_o = bn.a(0, param1, var5.field_o, 16);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param1.g(16, 0);
                  var5.field_h = bn.a(0, param1, var5.field_h, 16);
                  var5.field_u = bn.a(0, param1, var5.field_u, 16);
                  var5.field_k = bn.a(0, param1, var5.field_k, 16);
                  var5.field_G = bn.a(0, param1, var5.field_G, 16);
                  var5.field_C = bn.a(0, param1, var5.field_C, 16);
                  break L2;
                }
              }
              L3: {
                if (sm.a(-127, param1)) {
                  var5.field_a = bn.a(0, param1, var5.field_a, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!sm.a(119, param1)) {
                  break L4;
                } else {
                  var5.field_P = pc.a(var5.field_P, (byte) -126, param1, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_P.length <= var7) {
                      if (var6 == 0) {
                        var5.field_P = null;
                        break L4;
                      } else {
                        var5.field_A = (byte)(1 + var6);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_P[var7] & 255) > var6) {
                          var6 = 255 & var5.field_P[var7];
                          var7++;
                          break L6;
                        } else {
                          var7++;
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_25_0 = (rm) var5;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("kc.H(").append(30035).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    final void a(boolean param0, ok param1) {
        RuntimeException var3 = null;
        qh var4 = null;
        nf[] var5 = null;
        qh var6 = null;
        int var7_int = 0;
        qh var7 = null;
        qh var8 = null;
        nf[] var9 = null;
        nf[] var10 = null;
        qh var11 = null;
        qh var12 = null;
        nf var13 = null;
        qh var14 = null;
        int var15 = 0;
        pd var16 = null;
        vf var17 = null;
        pd var18 = null;
        qh var19 = null;
        pn stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        pn stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        pn stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        pn stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        pn stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        pn stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        pn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pn stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        pn stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        pn stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        pn stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        pn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        pn stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        pn stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        pn stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        pn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        pn stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        pn stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new vf(param1, 2, 2, 2236962, 1, 1, 1, param1.field_C + param1.field_D + 2);
              ((kc) this).field_m = (fe) (Object) var17;
              var17.field_i = 16777215;
              var4 = new qh();
              var17.a(param0, (vf) (Object) var4);
              ((kc) this).field_v = 3;
              ((kc) this).field_a = 15658734;
              ((kc) this).field_e = 3;
              var4.field_m = 15658734;
              ((kc) this).field_i = param1;
              ((kc) this).field_p = 5592405;
              ((kc) this).field_l = 3;
              var4.field_g = 11711154;
              ((kc) this).field_g = 15658734;
              ((kc) this).field_c = -1;
              ((kc) this).field_s = 3;
              stackOut_1_0 = var4.b(0, -69).a(1918, 15658734);
              stackOut_1_1 = -1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param0) {
                stackOut_3_0 = (pn) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (pn) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              pn discarded$10 = ((pn) (Object) stackIn_4_0).a(stackIn_4_1, en.a(stackIn_4_2 != 0, 8947848, 7829367, 10066329));
              stackOut_4_0 = var4.b(1, -57);
              stackOut_4_1 = -1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (param0) {
                stackOut_6_0 = (pn) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (pn) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            pn discarded$11 = ((pn) (Object) stackIn_7_0).a(stackIn_7_1, en.a(stackIn_7_2 != 0, 11184810, 13421772, 10066329));
            pn discarded$12 = var4.b(3, -62).a(-1, en.a(true, 8947848, 10066329, 7829367)).b(1, -2147483648).d(1, -2);
            var5 = new nf[9];
            var16 = new pd(32, 32);
            var18 = var16;
            var7_int = 0;
            L3: while (true) {
              if (var18.field_z.length <= var7_int) {
                L4: {
                  var5[4] = (nf) (Object) var18;
                  pn discarded$13 = var4.b(4, -90).a(true, 0).a(-1, var5);
                  pn discarded$14 = var4.b(5, -97).a(-1, em.a(0, 0, 65793, (byte) 2, 0)).a(true, 0).a(1918, -1);
                  ((kc) this).field_h = (fe) (Object) var4;
                  var6 = new qh(var4, true);
                  var6.field_p = 0;
                  var7 = new qh(var4, true);
                  var7.field_p = 0;
                  var7.a((byte) -86, jf.a(8947848, (byte) 99));
                  pn discarded$15 = var7.b(1, -93).a(-1, jf.a(11184810, (byte) 86)).a(1918, 2236962);
                  ((kc) this).field_j = (fe) (Object) new b(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                  li discarded$16 = new li(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  rc discarded$17 = new rc(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new qh();
                  var17.a(false, (vf) (Object) var8);
                  stackOut_10_0 = var8.b(0, -69);
                  stackOut_10_1 = -1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param0) {
                    stackOut_12_0 = (pn) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L4;
                  } else {
                    stackOut_11_0 = (pn) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L4;
                  }
                }
                pn discarded$18 = ((pn) (Object) stackIn_13_0).a(stackIn_13_1, en.a(stackIn_13_2 != 0, 15658734, 10066329, 7829367)).a(1918, 1118481).c(-1, 97);
                pn discarded$19 = var8.b(4, -106).a(true, 0).a(-1, var5);
                ((kc) this).field_u = (fe) (Object) var8;
                var9 = new nf[9];
                var10 = new nf[9];
                var9[4] = new nf(2, 1);
                var10[4] = new nf(1, 2);
                var9[4].field_z = new int[]{6710886, 7829367};
                var10[4].field_z = new int[]{6710886, 7829367};
                var11 = new qh();
                var12 = new qh();
                var11.a((byte) -70, var9, 0);
                var12.a((byte) 69, var10, 0);
                var13 = new nf(7, 4);
                var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new qh(var4, true);
                var14.a(-92, var13.c());
                var13.a();
                var14 = new qh(var4, true);
                var14.a(94, var13.c());
                var13.a();
                var14 = new qh(var4, true);
                var14.a(-75, var13.c());
                var13.a();
                var19 = new qh(var4, true);
                var19.a(-69, var13);
                break L0;
              } else {
                var16.field_z[var7_int] = 1077952576;
                var7_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("kc.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static void a(int param0, int param1, ji param2, int param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ll.field_a = param3;
              kn.field_d = param2;
              g.field_n = param1;
              if (param0 == 13421772) {
                break L1;
              } else {
                var5 = null;
                kc.a(-114, -12, (ji) null, 16);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        field_f = null;
        field_q = null;
        field_r = null;
    }

    final static vf a(byte param0) {
        int var1 = 0;
        if (qh.field_y == null) {
          qh.field_y = new vf(fa.field_Q, 20, 0, 0, 0, 11579568, -1, 0, 0, fa.field_Q.field_C, -1, 2147483647, true);
          var1 = -9;
          return qh.field_y;
        } else {
          var1 = -9;
          return qh.field_y;
        }
    }

    private final void b(int param0, String param1, int param2, int param3) {
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var15 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((kc) this).field_s + ((kc) this).field_v;
              var6 = ((kc) this).field_l + ((kc) this).field_e;
              var7 = ((kc) this).field_c;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((kc) this).field_i.field_C + ((kc) this).field_i.field_D;
                break L1;
              }
            }
            var8 = fn.field_g >> 2;
            var9 = ((kc) this).field_i.c(param1);
            L2: {
              L3: {
                var10 = ((kc) this).field_i.field_C + ((kc) this).field_i.field_D;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param1.indexOf("<br>") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (lc.field_l != null) {
                  break L4;
                } else {
                  lc.field_l = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = (-1 + var9 % var8 + var13) / var13 * 2 + var8;
                  break L5;
                }
              }
              var11 = ((kc) this).field_i.a(param1, new int[1], lc.field_l);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((kc) this).field_i.c(lc.field_l[var13]);
                    if (var14 <= var9) {
                      var13++;
                      break L7;
                    } else {
                      var9 = var14;
                      var13++;
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param2;
              if (fn.field_g >= var5_int + var12 - -var9) {
                break L8;
              } else {
                var12 = fn.field_g + -var9 - var5_int;
                break L8;
              }
            }
            L9: {
              var13 = -((kc) this).field_i.field_y + (param0 + 32);
              if (fn.field_l < var6 + (var10 + var13)) {
                var13 = param0 + -var10 + -var6;
                break L9;
              } else {
                break L9;
              }
            }
            fn.b(var12, var13, var5_int + var9, var10 + var6, ((kc) this).field_g);
            fn.e(var12 - -1, 1 + var13, -2 + var5_int + var9, -2 + var10 + var6, ((kc) this).field_p);
            int discarded$1 = ((kc) this).field_i.a(param1, var12 - -((kc) this).field_v, var13 + ((kc) this).field_e, var9, var10, ((kc) this).field_a, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("kc.A(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ',' + -9645 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, int param3) {
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
          if (param1 > 0) {
            if (!((kc) this).field_b) {
              this.a(param3, param0, -6, param2);
              return;
            } else {
              this.b(param3, param0, param2, -9645);
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("kc.K(");
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
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        fn.b(param0, param1, param4, param5, param6, param2);
        if (param3 < 16) {
            ((kc) this).field_w = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 >= -42) {
          ((kc) this).field_h = null;
          fn.f(param3, param1, param0, param2, param5);
          return;
        } else {
          fn.f(param3, param1, param0, param2, param5);
          return;
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
              var5_int = ((kc) this).field_i.c(param1);
              var6 = ((kc) this).field_i.field_y - -((kc) this).field_i.field_D;
              var7 = param3;
              if (fn.field_g < 6 + var7 + var5_int) {
                var7 = -var5_int + (fn.field_g + -6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = -((kc) this).field_i.field_y + (param0 + 32);
              if (6 + var8 + var6 <= fn.field_l) {
                break L2;
              } else {
                var8 = -6 + (-var6 + fn.field_l);
                break L2;
              }
            }
            fn.b(var7, var8, var5_int - -6, var6 - -6, ((kc) this).field_a);
            fn.e(var7 - -1, 1 + var8, 4 + var5_int, 4 + var6, ((kc) this).field_p);
            ((kc) this).field_i.c(param1, 3 + var7, var8 + (3 - -((kc) this).field_i.field_y), ((kc) this).field_a, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + -6 + ',' + param3 + ')');
        }
    }

    public kc() {
        ((kc) this).field_b = true;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = (int)(uh.field_e[param2] * 48.0 + 0.5);
        var5 = -var4 + 48 >> 1;
        if ((1 << param2 & 50087) != 0) {
          m.field_i[param2].d(param3 - -var5, param1 - -var5, var4, var4, 256);
          pm.field_w[qn.field_r >> 1 & 15].d(param3, param1, 48, 48, 256);
          return;
        } else {
          m.field_i[param2].b(param3 + var5, param1 - -var5, var4, var4);
          pm.field_w[qn.field_r >> 1 & 15].d(param3, param1, 48, 48, 256);
          return;
        }
    }

    final static void a(String param0, pm param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        ce var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vg var8 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        ce var25 = null;
        ce stackIn_7_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_6_0 = null;
        ce stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var23 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              fb.field_d[um.field_a] = param0;
              if (param3) {
                ih.field_a = ih.field_a | 1 << um.field_a;
                break L1;
              } else {
                ih.field_a = ih.field_a & ~(1 << um.field_a);
                break L1;
              }
            }
            L2: {
              if (param3) {
                stackOut_6_0 = vg.field_I;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = pn.field_a;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var25 = stackIn_7_0;
              var4_ref = var25;
              if (!param3) {
                stackOut_9_0 = 16;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 32;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_10_0;
              if (!param3) {
                stackOut_12_0 = 12;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 24;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_13_0;
              var7 = var25.c(param0) >> 1;
              var8 = qn.field_v.field_m;
              var8.m(10959);
              var9 = -var8.field_T + param1.field_E;
              var11 = -var8.field_L + param1.field_t;
              var13 = param1.field_D - var8.field_O;
              if (param2 >= 115) {
                break L5;
              } else {
                var24 = null;
                kc.a((String) null, (pm) null, 53, false);
                break L5;
              }
            }
            L6: {
              var15 = var8.field_R * var9 + var8.field_ab * var11 + var8.field_M * var13;
              var17 = var9 * var8.field_V + var11 * var8.field_U + var13 * var8.field_F;
              var19 = var13 * var8.field_N + (var8.field_H * var11 + var8.field_P * var9);
              if (var19 >= 0.15) {
                L7: {
                  var21 = (int)(var15 / var19 * 640.0) + 320;
                  var22 = (int)(var17 / var19 * 640.0) + 188;
                  if (var21 < var7 + 4) {
                    var21 = 4 - -var7;
                    break L7;
                  } else {
                    if (-var7 + 636 < var21) {
                      var21 = 636 - var7;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var22 >= 4 + var5) {
                    if (var22 <= 372) {
                      break L8;
                    } else {
                      var22 = 372;
                      break L8;
                    }
                  } else {
                    var22 = var5 + 4;
                    break L8;
                  }
                }
                var21 = var21 - var7;
                sc.field_d[um.field_a] = var21;
                var22 = var22 - (var5 + -var6);
                uh.field_g[um.field_a] = var22 << 4;
                break L6;
              } else {
                sc.field_d[um.field_a] = 320;
                uh.field_g[um.field_a] = 3008;
                break L6;
              }
            }
            gb.field_a[um.field_a] = 0;
            um.field_a = (1 + um.field_a) % 10;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("kc.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "END";
        field_r = "X";
        field_t = 50;
    }
}
