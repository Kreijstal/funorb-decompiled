/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_j;
    static c field_i;
    int field_o;
    kg field_r;
    static int field_u;
    int field_g;
    kg field_x;
    private int field_h;
    int field_f;
    static String field_l;
    int field_d;
    kg field_t;
    int field_v;
    jb field_k;
    int field_p;
    kg field_e;
    static float field_s;
    private boolean field_m;
    kg field_n;
    static volatile long field_w;
    static int[] field_b;
    int field_q;
    static String field_a;
    static volatile int field_c;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ra.d(param1, param3, param5, param0, param4);
        if (param2 > -62) {
            String var8 = (String) null;
            this.a(16, (String) null, -52, 95);
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_k.b(param3);
            var6 = this.field_k.field_u + this.field_k.field_K;
            var7 = param2;
            if (var5_int + var7 + 6 > ra.field_f) {
                var7 = -6 + ra.field_f - var5_int;
            }
            var8 = param0 + -this.field_k.field_u + param1;
            if (!(var6 + (var8 - -6) <= ra.field_e)) {
                var8 = -6 + (ra.field_e + -var6);
            }
            ra.b(var7, var8, 6 + var5_int, 6 + var6, this.field_h);
            ra.c(var7 + 1, var8 - -1, 4 + var5_int, var6 + 4, this.field_g);
            this.field_k.b(param3, var7 - -3, var8 + 3 - -this.field_k.field_u, this.field_h, -1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "wk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            wk.a(-113, true, -82, -66);
        }
        field_b = null;
        field_i = null;
        field_l = null;
        field_j = null;
        field_a = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        pf var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        ud var3 = ae.a(param1, param0, -13047);
        int var4 = -99 / ((param2 - 58) / 54);
        if (var3 != null) {
            hd.field_s.a(19, false);
            var5 = hd.field_s;
            var6_ref_String = re.field_S;
            var5.field_j.a(var6_ref_String, 1, 5);
            var5 = hd.field_s;
            var6 = ci.field_B;
            var7 = li.field_o;
            var5.field_j.a(0, var7, -18, 0, var6);
        }
        ko.a(param0, param1, (byte) -64);
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 15658734) {
            return 0;
        }
        return bh.h((byte) -47);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var5_int = this.field_q + this.field_v;
              var6 = this.field_o + this.field_f;
              var7 = this.field_p;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = this.field_k.field_N - -this.field_k.field_K;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = ra.field_f >> -1679435038;
                var9 = this.field_k.b(param1);
                var10 = this.field_k.field_N + this.field_k.field_K;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (0 != (param1.indexOf("<br>") ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (db.field_g != null) {
                  break L4;
                } else {
                  db.field_g = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((-1 + (var9 % var8 - -var13)) / var13) + var8;
                  break L5;
                }
              }
              var11 = this.field_k.a(param1, new int[]{var12}, db.field_g);
              var9 = 0;
              var10 = var10 + var7 * (-1 + var11);
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_k.b(db.field_g[var13]);
                    if (var14 > var9) {
                      var9 = var14;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param3;
              if (ra.field_f < var5_int + var9 + var12) {
                var12 = -var9 + ra.field_f + -var5_int;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + -this.field_k.field_u + param2;
              if (ra.field_e < var13 - -var10 - -var6) {
                var13 = -var6 + param2 - var10;
                break L9;
              } else {
                break L9;
              }
            }
            ra.b(var12, var13, var5_int + var9, var6 + var10, this.field_d);
            ra.c(1 + var12, var13 + 1, var5_int + (var9 - param0), -2 + (var10 - -var6), this.field_g);
            this.field_k.a(param1, this.field_v + var12, var13 + this.field_f, var9, var10, this.field_h, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("wk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ra.d(param6, param0, param1, param4, param3, param5);
        if (param2 != 13421772) {
            field_s = -0.8290913105010986f;
        }
    }

    final static void b(int param0) {
        rm.field_a = new ho();
        mm.field_u.e(rm.field_a, -27667);
        int var1 = 75 / ((-8 - param0) / 51);
    }

    final void a(int param0, jb param1) {
        al var18 = null;
        qn var4 = null;
        oh[] var5 = null;
        ue var16 = null;
        ue var17 = null;
        int var7_int = 0;
        qn var6 = null;
        qn var7 = null;
        cc discarded$0 = null;
        dc discarded$1 = null;
        qn var8 = null;
        oh[] var9 = null;
        oh[] var10 = null;
        oh dupTemp$2 = null;
        qn var11 = null;
        qn var12 = null;
        oh var13 = null;
        qn var14 = null;
        qn var19 = null;
        int var15 = TetraLink.field_J;
        try {
            var18 = new al(param1, 2, 2, 2236962, 1, 1, 1, param1.field_K + (param1.field_N + 2));
            this.field_e = (kg) ((Object) var18);
            var18.field_a = 16777215;
            var4 = new qn();
            var18.a(param0 + -15658734, var4);
            this.field_q = 3;
            this.field_v = 3;
            this.field_g = 5592405;
            this.field_p = -1;
            this.field_d = param0;
            this.field_f = 3;
            this.field_h = 15658734;
            this.field_o = 3;
            this.field_k = param1;
            var4.field_n = 11711154;
            var4.field_o = 15658734;
            var4.a((byte) -41, 0).a(2, 15658734).a(wm.a(false, 7829367, 10066329, 8947848), true);
            var4.a((byte) -41, 1).a(wm.a(false, 13421772, 10066329, 11184810), true);
            var4.a((byte) -41, 3).a(wm.a(false, 10066329, 7829367, 8947848), true).a((byte) -128, 1).a(1, (byte) 12);
            var5 = new oh[9];
            var16 = new ue(32, 32);
            var17 = var16;
            for (var7_int = 0; var7_int < var17.field_C.length; var7_int++) {
                var16.field_C[var7_int] = 1077952576;
            }
            var5[4] = (oh) ((Object) var17);
            var4.a((byte) -41, 4).a((byte) -77, true).a(var5, true);
            var4.a((byte) -41, 5).a(kk.a(65793, 0, 0, 0, (byte) -97), true).a((byte) -77, true).a(param0 ^ 15658732, -1);
            this.field_n = (kg) ((Object) var4);
            var6 = new qn(var4, true);
            var6.field_k = 0;
            var7 = new qn(var4, true);
            var7.field_k = 0;
            var7.a(qj.a(-5300, 8947848), param0 + -15658837);
            var7.a((byte) -41, 1).a(qj.a(-5300, 11184810), true).a(param0 ^ 15658732, 2236962);
            this.field_x = (kg) ((Object) new og(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new cc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new dc(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new qn();
            var18.a(0, var8);
            var8.a((byte) -41, 0).a(wm.a(false, 10066329, 7829367, 15658734), true).a(2, 1118481).b(-1, param0 ^ 15658732);
            var8.a((byte) -41, 4).a((byte) -77, true).a(var5, true);
            this.field_r = (kg) ((Object) var8);
            var9 = new oh[9];
            var10 = new oh[9];
            var9[4] = new oh(2, 1);
            var10[4] = new oh(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_C = new int[]{6710886, 7829367};
            var10[4].field_C = new int[]{6710886, 7829367};
            var11 = new qn();
            var12 = new qn();
            var11.a(0, -1664329560, var9);
            var12.a(0, -1664329560, var10);
            var13 = new oh(7, 4);
            var13.field_C = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new qn(var4, true);
            var14.a(var13.d(), (byte) 71);
            var13.b();
            var14 = new qn(var4, true);
            var14.a(var13.d(), (byte) 71);
            var13.b();
            var14 = new qn(var4, true);
            var14.a(var13.d(), (byte) 71);
            var13.b();
            var19 = new qn(var4, true);
            var19.a(var13, (byte) 71);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "wk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_m) {
                this.a(32, param1, param2, param0);
                break L1;
              } else {
                this.a(2, param0, param1, param2);
                break L1;
              }
            }
            L2: {
              if (param3 <= -59) {
                break L2;
              } else {
                field_b = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("wk.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 122) {
            break L0;
          } else {
            wk.a(-125, false, (byte) -115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ug.o(-102)) {
              break L2;
            } else {
              if (mb.field_C > 0) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public wk() {
        this.field_m = true;
    }

    static {
        field_l = "Service unavailable";
        field_w = 0L;
        field_c = 0;
        field_a = "Cancel unrated rematch";
        field_j = "Remove <%0> from friend list";
    }
}
