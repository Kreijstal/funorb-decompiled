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
            field_x = (String) null;
            this.e(2);
            return;
        }
        this.e(2);
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            return 100;
        }
        return this.field_p;
    }

    final void b(byte param0) {
        super.b((byte) -39);
        im.a(550, 5, 243, 5, 140, (byte) -81, 45);
        if (param0 > -14) {
          return;
        } else {
          nn.field_g.a(this.field_v, 54, 149, 532, 225, 2, -1, 1, 1, 22);
          this.a(0);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        pi var4;
        int var5;
        if (!og.h(-26090)) {
          var4 = k.field_h;
          var4.e(-13413, 16);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(-126, 0);
          var4.b((byte) 120, param0);
          var4.a(113, param1);
          if (param2 != 532) {
            field_s = (jp[]) null;
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
        Object stackIn_9_0 = null;
        og stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        og[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        wd var11 = null;
        int var12 = 0;
        mh var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -78) {
                break L1;
              } else {
                var13 = (mh) null;
                hq.a((int[]) null, (mh) null, (mh) null, (mh) null, (byte) -45);
                break L1;
              }
            }
            var5_int = param0.length;
            var6 = new String[var5_int];
            var15 = new char[var5_int];
            var14 = var15;
            var7 = var14;
            var8 = new og[var5_int];
            var9 = 49;
            try {
              L2: {
                var10_int = 0;
                L3: while (true) {
                  if (var5_int <= var10_int) {
                    break L2;
                  } else {
                    var11 = nh.field_c.a(param0[var10_int], true);
                    var6[var10_int] = var11.h(-3);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L3;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackIn_9_0 = null;
              return (og) ((Object) stackIn_9_0);
            }
            stackIn_11_0 = new og(0L, param1, param2, param3, var8, param0, var6, var15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("hq.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ',' + param4 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(fa param0, int param1, int param2) {
        pi var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = k.field_h;
            var3.e(-13413, param1);
            var3.a(85, param0.field_i);
            var3.b((byte) 122, param0.field_k);
            if (param2 == 49) {
              break L0;
            } else {
              field_r = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("hq.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    hq() {
        super(10, 180, 460, 402, 35, new int[]{23, 24});
    }

    final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_4_0 = 0;
        var4 = ib.a(pl.field_b, -1) ? 1 : 0;
        if (param2 < 96) {
          return;
        } else {
          L0: {
            if (null == fj.field_Ub) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          var5 = stackIn_4_0;
          this.field_v = oq.field_w + " " + wj.a(-1, rd.a(af.a(var4 != 0, var5 != 0, false, 126), new String[]{gi.field_r}, (byte) 103), '#', "<br><br>");
          return;
        }
    }

    final static void b(boolean param0, boolean param1, int param2) {
        nj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              wp.a(param1, (byte) -51);
              if (param0) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            var3 = (nj) ((Object) ob.field_E.d(-58));
            L2: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.a(-1196049244, param2 << 1747251460);
                var3 = (nj) ((Object) ob.field_E.a((byte) 116));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3_ref), "hq.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -1) {
            fa var3 = (fa) null;
            hq.a((fa) null, -66, -20);
        }
    }

    public static void f(int param0) {
        field_z = null;
        field_u = null;
        field_x = null;
        field_y = null;
        if (param0 != 550) {
          field_w = (String) null;
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
        field_r = "Respect";
        field_x = "To <%0>: ";
        field_u = new String[]{"Do battle with Ninja!", "Amazing scores!", "Fiendish levels!", "Adventures on the high seas!", "Charged multiplayer action!"};
        field_w = "You must play 1 more rated game before playing with the current options.";
        field_z = new qh();
        field_y = "Press <img=1><img=0> or <img=4><img=3> to move the paddle left or right.<br><br>Press <img=2> or <img=5> to launch the ball.";
    }
}
