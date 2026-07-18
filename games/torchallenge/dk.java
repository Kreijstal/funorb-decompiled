/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    j field_l;
    int field_k;
    eg field_t;
    j field_i;
    static pa field_s;
    private int field_b;
    static String field_d;
    int field_e;
    j field_f;
    static int field_a;
    j field_q;
    int field_n;
    int field_h;
    int field_r;
    static String field_g;
    private boolean field_j;
    static ka[][] field_c;
    int field_p;
    int field_o;
    j field_m;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != 4) {
          ((dk) this).a(121, -123, (byte) 22, 3, -114, 122);
          qg.a(param5, param4, param1, param3, param2, param6);
          return;
        } else {
          qg.a(param5, param4, param1, param3, param2, param6);
          return;
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((dk) this).field_r + ((dk) this).field_k;
              var6 = ((dk) this).field_h + ((dk) this).field_o;
              var7 = ((dk) this).field_n;
              if (var7 == -1) {
                var7 = ((dk) this).field_t.field_K + ((dk) this).field_t.field_x;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = qg.field_g >> 2;
                var9 = ((dk) this).field_t.a(param0);
                var10 = ((dk) this).field_t.field_K + ((dk) this).field_t.field_x;
                var11 = param3;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (param0.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 - -((var9 % var8 + (var13 - 1)) / var13 * 2);
                  break L4;
                }
              }
              L5: {
                if (bh.field_m != null) {
                  break L5;
                } else {
                  bh.field_m = new String[16];
                  break L5;
                }
              }
              var11 = ((dk) this).field_t.a(param0, new int[1], bh.field_m);
              var10 = var10 + (var11 + -1) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((dk) this).field_t.a(bh.field_m[var13]);
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
              var12 = param1;
              if (var5_int + var12 - -var9 > qg.field_g) {
                var12 = -var5_int + (-var9 + qg.field_g);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + (param2 + -((dk) this).field_t.field_t);
              if (var6 + (var13 - -var10) <= qg.field_f) {
                break L9;
              } else {
                var13 = -var6 + (-var10 + param2);
                break L9;
              }
            }
            qg.b(var12, var13, var9 + var5_int, var6 + var10, ((dk) this).field_e);
            qg.f(var12 - -1, var13 - -1, -2 + var9 - -var5_int, var6 + var10 + -2, ((dk) this).field_p);
            int discarded$1 = ((dk) this).field_t.a(param0, ((dk) this).field_k + var12, ((dk) this).field_h + var13, var9, var10, ((dk) this).field_b, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("dk.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_s = null;
        field_c = null;
        field_d = null;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        Object var8 = null;
        if (param2 >= -85) {
          var8 = null;
          this.a((String) null, 29, 47, -117);
          qg.d(param3, param1, param0, param5, param4);
          return;
        } else {
          qg.d(param3, param1, param0, param5, param4);
          return;
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var5_int = -1 % ((16 - param3) / 48);
          if (((dk) this).field_j) {
            this.a(param1, param2, param0, 1);
            return;
          } else {
            int discarded$2 = -103;
            this.b(param2, param1, param0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("dk.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(eg param0, int param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        ka[] var5 = null;
        ga var6 = null;
        int var7_int = 0;
        ga var7 = null;
        ga var8 = null;
        ka[] var9 = null;
        ka[] var10 = null;
        ga var11 = null;
        ga var12 = null;
        ka var13 = null;
        ga var14 = null;
        int var15 = 0;
        Object var16 = null;
        el var17 = null;
        bc var18 = null;
        el var19 = null;
        ga var20 = null;
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
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -22373) {
                break L1;
              } else {
                var16 = null;
                ((dk) this).a((eg) null, 22);
                break L1;
              }
            }
            var18 = new bc(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_K + param0.field_x);
            ((dk) this).field_q = (j) (Object) var18;
            var18.field_k = 16777215;
            var4 = new ga();
            var18.a(param1 + 22255, (bc) (Object) var4);
            ((dk) this).field_n = -1;
            ((dk) this).field_r = 3;
            ((dk) this).field_k = 3;
            var4.field_q = 11711154;
            ((dk) this).field_p = 5592405;
            ((dk) this).field_b = 15658734;
            var4.field_c = 15658734;
            ((dk) this).field_h = 3;
            ((dk) this).field_e = 15658734;
            ((dk) this).field_t = param0;
            ((dk) this).field_o = 3;
            gj discarded$10 = var4.a(0, -27140).b(-764, 15658734).a((byte) -104, v.a(7829367, param1 + 22489, 8947848, 10066329));
            gj discarded$11 = var4.a(1, -27140).a((byte) -27, v.a(13421772, 67, 11184810, 10066329));
            gj discarded$12 = var4.a(3, param1 ^ 15719).a((byte) -62, v.a(10066329, param1 + 22463, 8947848, 7829367)).a(1, (byte) 118).a(1, param1 + 22373);
            var5 = new ka[9];
            var17 = new el(32, 32);
            var19 = var17;
            var7_int = 0;
            L2: while (true) {
              if (var19.field_y.length <= var7_int) {
                var5[4] = (ka) (Object) var19;
                gj discarded$13 = var4.a(4, -27140).a(true, -1).a((byte) -120, var5);
                gj discarded$14 = var4.a(5, param1 ^ 15719).a((byte) -124, bf.a(65793, (byte) 50, 0, 0, 0)).a(true, param1 + 22372).b(-764, -1);
                ((dk) this).field_f = (j) (Object) var4;
                var6 = new ga(var4, true);
                var6.field_e = 0;
                var7 = new ga(var4, true);
                var7.field_e = 0;
                var7.a((byte) 107, rj.a(39, 8947848));
                gj discarded$15 = var7.a(1, -27140).a((byte) -76, rj.a(54, 11184810)).b(-764, 2236962);
                ((dk) this).field_l = (j) (Object) new mc(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                g discarded$16 = new g(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                ph discarded$17 = new ph(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new ga();
                var18.a(param1 + 22245, (bc) (Object) var8);
                gj discarded$18 = var8.a(0, -27140).a((byte) -57, v.a(10066329, 82, 15658734, 7829367)).b(-764, 1118481).b(-1, (byte) -113);
                gj discarded$19 = var8.a(4, -27140).a(true, -1).a((byte) -74, var5);
                ((dk) this).field_m = (j) (Object) var8;
                var9 = new ka[9];
                var10 = new ka[9];
                var9[4] = new ka(2, 1);
                var10[4] = new ka(1, 2);
                var9[4].field_y = new int[]{6710886, 7829367};
                var10[4].field_y = new int[]{6710886, 7829367};
                var11 = new ga();
                var12 = new ga();
                var11.a(var9, 0, 109);
                var12.a(var10, 0, 102);
                var13 = new ka(7, 4);
                var13.field_y = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new ga(var4, true);
                var14.a((byte) -42, var13.c());
                var13.f();
                var14 = new ga(var4, true);
                var14.a((byte) -127, var13.c());
                var13.f();
                var14 = new ga(var4, true);
                var14.a((byte) -121, var13.c());
                var13.f();
                var20 = new ga(var4, true);
                var20.a((byte) -123, var13);
                break L0;
              } else {
                var17.field_y[var7_int] = 1077952576;
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
            stackOut_8_1 = new StringBuilder().append("dk.F(");
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static oe a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            oe var5 = null;
            dd var5_ref = null;
            int var6 = 0;
            oe stackIn_1_0 = null;
            dd stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            oe stackOut_0_0 = null;
            dd stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var6 = 0;
                var4 = Class.forName("ke");
                var5 = (oe) var4.newInstance();
                var5.a(param3, param1, param0, -23435);
                stackOut_0_0 = (oe) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new dd();
                ((oe) (Object) var5_ref).a(param3, param1, param0, -23435);
                stackOut_2_0 = (dd) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (oe) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -124 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, String param1, int param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
              var6 = -40;
              var5_int = ((dk) this).field_t.a(param1);
              var7 = ((dk) this).field_t.field_t - -((dk) this).field_t.field_K;
              var8 = param0;
              if (6 + var8 + var5_int <= qg.field_g) {
                break L1;
              } else {
                var8 = -6 + -var5_int + qg.field_g;
                break L1;
              }
            }
            L2: {
              var9 = -((dk) this).field_t.field_t + (param2 + 32);
              if (6 + (var9 + var7) > qg.field_f) {
                var9 = -6 + (qg.field_f + -var7);
                break L2;
              } else {
                break L2;
              }
            }
            qg.b(var8, var9, var5_int - -6, var7 - -6, ((dk) this).field_b);
            qg.f(1 + var8, 1 + var9, var5_int - -4, 4 + var7, ((dk) this).field_p);
            ((dk) this).field_t.c(param1, var8 + 3, 3 + (var9 - -((dk) this).field_t.field_t), ((dk) this).field_b, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("dk.H(").append(param0).append(',');
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
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + -103 + ')');
        }
    }

    public dk() {
        ((dk) this).field_j = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_a = 0;
        field_g = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
