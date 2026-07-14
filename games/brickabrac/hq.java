/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends km {
    static String field_r;
    private String field_v;
    static mf field_t;
    static String field_w;
    static qh field_z;
    static String field_x;
    static String[] field_u;
    static jp[] field_s;
    static String field_y;

    final void b(boolean param0) {
        if (!param0) {
            field_x = null;
            ((hq) this).e(2);
            return;
        }
        ((hq) this).e(2);
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            return 100;
        }
        return ((hq) this).field_p;
    }

    final void b(byte param0) {
        super.b((byte) -39);
        im.a(550, 5, 243, 5, 140, (byte) -81, 45);
        if (param0 > -14) {
          return;
        } else {
          int discarded$2 = nn.field_g.a(((hq) this).field_v, 54, 149, 532, 225, 2, -1, 1, 1, 22);
          ((hq) this).a(0);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        pi var4 = null;
        int var5 = 0;
        if (!og.h(-26090)) {
          var4 = k.field_h;
          var4.e(-13413, 16);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(-126, 0);
          var4.b((byte) 120, param0);
          var4.a(113, param1);
          if (param2 != 532) {
            field_s = null;
            var4.b((byte) 127, param3);
            var4.d((byte) 121, -var5 + var4.field_l);
            return;
          } else {
            var4.b((byte) 127, param3);
            var4.d((byte) 121, -var5 + var4.field_l);
            return;
          }
        } else {
          return;
        }
    }

    final static og a(int[] param0, mh param1, mh param2, mh param3, byte param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        og[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        wd var11 = null;
        int var12 = 0;
        Object var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = BrickABrac.field_J ? 1 : 0;
                    if (param4 == -78) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var13 = null;
                    og discarded$2 = hq.a((int[]) null, (mh) null, (mh) null, (mh) null, (byte) -45);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = param0.length;
                    var6 = new String[var5];
                    var15 = new char[var5];
                    var14 = var15;
                    var7 = var14;
                    var8 = new og[var5];
                    var9 = 49;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var10_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = nh.field_c.a(param0[var10_int], true);
                        var6[var10_int] = var11.h(-3);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new og(0L, param1, param2, param3, var8, param0, var6, var15);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(fa param0, int param1, int param2) {
        pi var3 = null;
        var3 = k.field_h;
        var3.e(-13413, param1);
        var3.a(85, param0.field_i);
        var3.b((byte) 122, param0.field_k);
        if (param2 != 49) {
          field_r = null;
          return;
        } else {
          return;
        }
    }

    hq() {
        super(10, 180, 460, 402, 35, new int[2]);
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0;
        int stackOut_2_0;
        var4 = ib.a(pl.field_b, -1) ? 1 : 0;
        if (param2 < 96) {
          return;
        } else {
          L0: {
            if (null == fj.field_Ub) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var5 = stackIn_4_0;
          ((hq) this).field_v = oq.field_w + " " + wj.a(-1, rd.a(af.a(var4 != 0, var5 != 0, false, 126), new String[1], (byte) 103), '#', "<br><br>");
          return;
        }
    }

    final static void b(boolean param0, boolean param1, int param2) {
        nj var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        wp.a(param1, (byte) -51);
        if (param0) {
          var3 = (nj) (Object) ob.field_E.d(-58);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              var3.a(-1196049244, param2 << 1747251460);
              var3 = (nj) (Object) ob.field_E.a((byte) 116);
              continue L0;
            }
          }
        } else {
          field_y = null;
          var3 = (nj) (Object) ob.field_E.d(-58);
          L1: while (true) {
            if (var3 == null) {
              return;
            } else {
              var3.a(-1196049244, param2 << 1747251460);
              var3 = (nj) (Object) ob.field_E.a((byte) 116);
              continue L1;
            }
          }
        }
    }

    final void c(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            hq.a((fa) null, -66, -20);
        }
    }

    public static void f(int param0) {
        field_z = null;
        field_u = null;
        field_x = null;
        field_y = null;
        if (param0 != 550) {
          field_w = null;
          field_s = null;
          field_r = null;
          field_t = null;
          field_w = null;
          return;
        } else {
          field_s = null;
          field_r = null;
          field_t = null;
          field_w = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Respect";
        field_x = "To <%0>: ";
        field_u = new String[]{"Do battle with Ninja!", "Amazing scores!", "Fiendish levels!", "Adventures on the high seas!", "Charged multiplayer action!"};
        field_w = "You must play 1 more rated game before playing with the current options.";
        field_z = new qh();
        field_y = "Press <img=1><img=0> or <img=4><img=3> to move the paddle left or right.<br><br>Press <img=2> or <img=5> to launch the ball.";
    }
}
