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
        L0: {
          var15 = TorChallenge.field_F ? 1 : 0;
          var5 = ((dk) this).field_r + ((dk) this).field_k;
          var6 = ((dk) this).field_h + ((dk) this).field_o;
          var7 = ((dk) this).field_n;
          if ((var7 ^ -1) == 0) {
            var7 = ((dk) this).field_t.field_K + ((dk) this).field_t.field_x;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = qg.field_g >> -1243168894;
        var9 = ((dk) this).field_t.a(param0);
        var10 = ((dk) this).field_t.field_K + ((dk) this).field_t.field_x;
        var11 = param3;
        if (var8 < var9) {
          L1: {
            if (var9 <= var8) {
              var12 = var8;
              break L1;
            } else {
              var13 = var9 / var8;
              var12 = var8 - -((var9 % var8 + (var13 - 1)) / var13 * 2);
              break L1;
            }
          }
          if (bh.field_m != null) {
            L2: {
              var11 = ((dk) this).field_t.a(param0, new int[1], bh.field_m);
              var10 = var10 + (var11 + -1) * var7;
              var9 = 0;
              var13 = 0;
              if (var11 <= var13) {
                break L2;
              } else {
                L3: {
                  var14 = ((dk) this).field_t.a(bh.field_m[var13]);
                  if (var14 <= var9) {
                    var13++;
                    break L3;
                  } else {
                    var9 = var14;
                    break L3;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L2;
              }
            }
            L4: {
              var12 = param1;
              if (var5 + var12 - -var9 > qg.field_g) {
                var12 = -var5 + (-var9 + qg.field_g);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var13 = 32 + (param2 + -((dk) this).field_t.field_t);
              if (var6 + (var13 - -var10) <= qg.field_f) {
                break L5;
              } else {
                var13 = -var6 + (-var10 + param2);
                break L5;
              }
            }
            qg.b(var12, var13, var9 + var5, var6 + var10, ((dk) this).field_e);
            qg.f(var12 - -1, var13 - -1, -2 + var9 - -var5, var6 + var10 + -2, ((dk) this).field_p);
            int discarded$4 = ((dk) this).field_t.a(param0, ((dk) this).field_k + var12, ((dk) this).field_h + var13, var9, var10, ((dk) this).field_b, -1, 0, 0, var7);
            return;
          } else {
            bh.field_m = new String[16];
            var11 = ((dk) this).field_t.a(param0, new int[1], bh.field_m);
            var10 = var10 + (var11 + -1) * var7;
            var9 = 0;
            var13 = 0;
            L6: while (true) {
              if (var11 <= var13) {
                L7: {
                  var12 = param1;
                  if (var5 + var12 - -var9 > qg.field_g) {
                    var12 = -var5 + (-var9 + qg.field_g);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var13 = 32 + (param2 + -((dk) this).field_t.field_t);
                  if (var6 + (var13 - -var10) <= qg.field_f) {
                    break L8;
                  } else {
                    var13 = -var6 + (-var10 + param2);
                    break L8;
                  }
                }
                qg.b(var12, var13, var9 + var5, var6 + var10, ((dk) this).field_e);
                qg.f(var12 - -1, var13 - -1, -2 + var9 - -var5, var6 + var10 + -2, ((dk) this).field_p);
                int discarded$5 = ((dk) this).field_t.a(param0, ((dk) this).field_k + var12, ((dk) this).field_h + var13, var9, var10, ((dk) this).field_b, -1, 0, 0, var7);
                return;
              } else {
                var14 = ((dk) this).field_t.a(bh.field_m[var13]);
                if (var14 > var9) {
                  var9 = var14;
                  var13++;
                  continue L6;
                } else {
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } else {
          if (param0.indexOf("<br>") == -1) {
            L9: {
              var12 = param1;
              if (var5 + var12 - -var9 > qg.field_g) {
                var12 = -var5 + (-var9 + qg.field_g);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var13 = 32 + (param2 + -((dk) this).field_t.field_t);
              if (var6 + (var13 - -var10) <= qg.field_f) {
                break L10;
              } else {
                var13 = -var6 + (-var10 + param2);
                break L10;
              }
            }
            qg.b(var12, var13, var9 + var5, var6 + var10, ((dk) this).field_e);
            qg.f(var12 - -1, var13 - -1, -2 + var9 - -var5, var6 + var10 + -2, ((dk) this).field_p);
            int discarded$6 = ((dk) this).field_t.a(param0, ((dk) this).field_k + var12, ((dk) this).field_h + var13, var9, var10, ((dk) this).field_b, -1, 0, 0, var7);
            return;
          } else {
            L11: {
              if (var9 <= var8) {
                var12 = var8;
                break L11;
              } else {
                var13 = var9 / var8;
                var12 = var8 - -((var9 % var8 + (var13 - 1)) / var13 * 2);
                break L11;
              }
            }
            L12: {
              if (bh.field_m != null) {
                var11 = ((dk) this).field_t.a(param0, new int[1], bh.field_m);
                var10 = var10 + (var11 + -1) * var7;
                var9 = 0;
                var13 = 0;
                break L12;
              } else {
                bh.field_m = new String[16];
                var11 = ((dk) this).field_t.a(param0, new int[1], bh.field_m);
                var10 = var10 + (var11 + -1) * var7;
                var9 = 0;
                var13 = 0;
                break L12;
              }
            }
            L13: {
              if (var11 <= var13) {
                break L13;
              } else {
                L14: {
                  var14 = ((dk) this).field_t.a(bh.field_m[var13]);
                  if (var14 <= var9) {
                    var13++;
                    break L14;
                  } else {
                    var9 = var14;
                    break L14;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L13;
              }
            }
            L15: {
              var12 = param1;
              if (var5 + var12 - -var9 > qg.field_g) {
                var12 = -var5 + (-var9 + qg.field_g);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var13 = 32 + (param2 + -((dk) this).field_t.field_t);
              if (var6 + (var13 - -var10) <= qg.field_f) {
                break L16;
              } else {
                var13 = -var6 + (-var10 + param2);
                break L16;
              }
            }
            qg.b(var12, var13, var9 + var5, var6 + var10, ((dk) this).field_e);
            qg.f(var12 - -1, var13 - -1, -2 + var9 - -var5, var6 + var10 + -2, ((dk) this).field_p);
            int discarded$7 = ((dk) this).field_t.a(param0, ((dk) this).field_k + var12, ((dk) this).field_h + var13, var9, var10, ((dk) this).field_b, -1, 0, 0, var7);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_s = null;
        field_c = null;
        field_d = null;
        if (param0 != 23592) {
            Object var2 = null;
            oe discarded$0 = dk.a(16, (java.awt.Component) null, -10, -28);
        }
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
        int var5 = 0;
        var5 = -1 % ((16 - param3) / 48);
        if (!((dk) this).field_j) {
          this.b(param2, param1, param0, -103);
          return;
        } else {
          this.a(param1, param2, param0, 1);
          return;
        }
    }

    final void a(eg param0, int param1) {
        int var7_int = 0;
        int var15 = TorChallenge.field_F ? 1 : 0;
        if (param1 != -22373) {
            Object var16 = null;
            ((dk) this).a((eg) null, 22);
        }
        bc var18 = new bc(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_K + param0.field_x);
        ((dk) this).field_q = (j) (Object) var18;
        var18.field_k = 16777215;
        ga var4 = new ga();
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
        gj discarded$0 = var4.a(0, -27140).b(-764, 15658734).a((byte) -104, v.a(7829367, param1 + 22489, 8947848, 10066329));
        gj discarded$1 = var4.a(1, -27140).a((byte) -27, v.a(13421772, 67, 11184810, 10066329));
        gj discarded$2 = var4.a(3, param1 ^ 15719).a((byte) -62, v.a(10066329, param1 + 22463, 8947848, 7829367)).a(1, (byte) 118).a(1, param1 + 22373);
        ka[] var5 = new ka[9];
        el var17 = new el(32, 32);
        el var19 = var17;
        for (var7_int = 0; var19.field_y.length > var7_int; var7_int++) {
            var17.field_y[var7_int] = 1077952576;
        }
        var5[4] = (ka) (Object) var19;
        gj discarded$3 = var4.a(4, -27140).a(true, -1).a((byte) -120, var5);
        gj discarded$4 = var4.a(5, param1 ^ 15719).a((byte) -124, bf.a(65793, (byte) 50, 0, 0, 0)).a(true, param1 + 22372).b(-764, -1);
        ((dk) this).field_f = (j) (Object) var4;
        ga var6 = new ga(var4, true);
        var6.field_e = 0;
        ga var7 = new ga(var4, true);
        var7.field_e = 0;
        var7.a((byte) 107, rj.a(39, 8947848));
        gj discarded$5 = var7.a(1, -27140).a((byte) -76, rj.a(54, 11184810)).b(-764, 2236962);
        ((dk) this).field_l = (j) (Object) new mc(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        g discarded$6 = new g(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        ph discarded$7 = new ph(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ga var8 = new ga();
        var18.a(param1 + 22245, (bc) (Object) var8);
        gj discarded$8 = var8.a(0, -27140).a((byte) -57, v.a(10066329, 82, 15658734, 7829367)).b(-764, 1118481).b(-1, (byte) -113);
        gj discarded$9 = var8.a(4, -27140).a(true, -1).a((byte) -74, var5);
        ((dk) this).field_m = (j) (Object) var8;
        ka[] var9 = new ka[9];
        ka[] var10 = new ka[9];
        var9[4] = new ka(2, 1);
        var10[4] = new ka(1, 2);
        var9[4].field_y = new int[]{6710886, 7829367};
        var10[4].field_y = new int[]{6710886, 7829367};
        ga var11 = new ga();
        ga var12 = new ga();
        var11.a(var9, 0, 109);
        var12.a(var10, 0, 102);
        ka var13 = new ka(7, 4);
        var13.field_y = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ga var14 = new ga(var4, true);
        var14.a((byte) -42, var13.c());
        var13.f();
        var14 = new ga(var4, true);
        var14.a((byte) -127, var13.c());
        var13.f();
        var14 = new ga(var4, true);
        var14.a((byte) -121, var13.c());
        var13.f();
        ga var20 = new ga(var4, true);
        var20.a((byte) -123, var13);
    }

    final static oe a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            oe var5 = null;
            dd var5_ref = null;
            int var6 = 0;
            oe stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            oe stackOut_0_0 = null;
            try {
              var6 = -74 % ((param2 - -69) / 51);
              var4 = Class.forName("ke");
              var5 = (oe) var4.newInstance();
              var5.a(param3, param1, param0, -23435);
              stackOut_0_0 = (oe) var5;
              stackIn_1_0 = stackOut_0_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_1_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private final void b(int param0, String param1, int param2, int param3) {
        int var6 = -40 / ((-33 - param3) / 42);
        int var5 = ((dk) this).field_t.a(param1);
        int var7 = ((dk) this).field_t.field_t - -((dk) this).field_t.field_K;
        int var8 = param0;
        if (6 + var8 + var5 > qg.field_g) {
            var8 = -6 + -var5 + qg.field_g;
        }
        int var9 = -((dk) this).field_t.field_t + (param2 + 32);
        if (!(6 + (var9 + var7) <= qg.field_f)) {
            var9 = -6 + (qg.field_f + -var7);
        }
        qg.b(var8, var9, var5 - -6, var7 - -6, ((dk) this).field_b);
        qg.f(1 + var8, 1 + var9, var5 - -4, 4 + var7, ((dk) this).field_p);
        ((dk) this).field_t.c(param1, var8 + 3, 3 + (var9 - -((dk) this).field_t.field_t), ((dk) this).field_b, -1);
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
