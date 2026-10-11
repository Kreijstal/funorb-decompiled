/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends vh {
    static String field_Mb;
    static String field_Lb;
    static String field_Ob;
    static String field_Nb;
    static String field_Qb;
    private vh field_Pb;

    final static boolean f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          if (param0 != -13164) {
            fn.f(89);
          }
          o.field_y = o.field_y + 1;
          if (pq.field_B.length <= o.field_y) {
            return false;
          }
          for (var1_int = 0; pc.field_a.length > var1_int; var1_int++) {
            pq.field_B[o.field_y][var1_int].a(pc.field_a[var1_int], (byte) -12);
          }
          pc.field_a = pq.field_B[o.field_y];
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "fn.G(" + param0 + ')');
        }
    }

    final static im b(long param0, int param1) {
        if (param1 == 0) {
          return (im) (im.field_Qb.a(param0, false));
        }
        String var4 = (String) null;
        fn.a((String) null, -19, (String) null, -83, true, (String) null, -49);
        return (im) (im.field_Qb.a(param0, false));
    }

    final boolean b(byte param0, boolean param1) {
        if (param0 != -52) {
          return true;
        }
        this.a(true, false);
        if (ne.field_s != 0) {
          if (this.field_R == 0) {
            return true;
          }
          return this.field_Pb.field_R != 0 ? true : false;
        }
        if (this.field_Pb.field_R == 0) {
          return false;
        }
        return true;
    }

    final static an a(byte param0, byte[] param1) {
        an var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        an stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (an) (stackIn_2_0);
          }
          var2 = new an(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, v.field_b);
          sh.h(-1);
          if (param0 < 119) {
            fn.f(-82);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(pn param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        pn var4 = null;
        int var2_intLifetime1;
        var3 = Pool.field_O;
        try {
          var2_int = mc.field_g;
          if (param0.field_p == 2) {
            if (param0.field_g) {
              var2_intLifetime1 = mc.field_g;
            } else {
              if (param0.field_m == 0 &&
                param0.field_e == 0) {
                var2_intLifetime1 = pq.field_F[param0.field_p];
              } else {
                var2_intLifetime1 = ng.field_A[param0.field_p];
              }
            }
          } else {
            if (param0.field_p != 4) {
              if (~ve.field_m == ~param0.field_b) {
                var2_intLifetime1 = pq.field_F[param0.field_p];
              } else {
                var2_intLifetime1 = ng.field_A[param0.field_p];
              }
            } else {
              var2_intLifetime1 = ng.field_A[param0.field_p];
            }
          }
          if (param1 > -30) {
            var4 = (pn) null;
            fn.a((pn) null, 64);
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("fn.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2 = ir.field_h * ir.field_h;
        int var3 = -(param1 * param1) + var2;
        ff.a(-24, qh.field_f - 120 + var3 * 120 / var2);
        if (param0 == 5938) {
          return;
        }
        field_Nb = (String) null;
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 <= 12) {
          String var2 = (String) null;
          fn.a((String) null, -57, (String) null, 61, false, (String) null, 44);
          field_Mb = null;
          field_Qb = null;
          field_Ob = null;
          field_Lb = null;
          return;
        }
        field_Mb = null;
        field_Qb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static int a(String param0, int param1, String param2, int param3, boolean param4, String param5, int param6) {
        ke var7 = null;
        RuntimeException var7_ref = null;
        ke var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 50) {
            field_Lb = (String) null;
          }
          var7 = new ke(param2);
          var8 = new ke(param0);
          stackIn_3_0 = ih.a(param5, (byte) 87, param1, param4, var7, var8, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("fn.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    fn(vh param0, vh param1, vh param2, vh param3, vh param4, vh param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        vh var8 = null;
        vh var9 = null;
        int var10 = 0;
        int var11 = 0;
        vh var13 = null;
        vh var14 = null;
        int var15 = 0;
        vh var16 = null;
        int var10Lifetime1;
        try {
          var16 = new vh(0L, param1, w.field_m.toUpperCase());
          var16.field_Fb = 1;
          this.field_Pb = new vh(0L, param2);
          var8 = new vh(0L, param3);
          var9 = new vh(0L, param3, jd.field_j);
          var9.field_Fb = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; bj.field_o.length > var12; var12++) {
            var13 = new vh(0L, param3, ck.field_T[var12]);
            var14 = new vh(0L, param3, bj.field_o[var12]);
            var15 = param3.field_I.b(bj.field_o[var12]);
            var13.b(var10, 2147483647, 20, 65, 15);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.b(var10, 2147483647, 90, 640, 15);
            var8.a(-126, var13);
            var10 += 30;
            var8.a(-98, var14);
          }
          var16.b(0, 2147483647, 0, 20 + var11 + 90, 24);
          var10 += 15;
          this.b(100, 2147483647, 100, var16.field_gb, var10 + var16.field_Db);
          this.field_Pb.b(5, 2147483647, -20 + var16.field_gb, 15, 15);
          var8.b(var16.field_Db, 2147483647, 0, this.field_gb, this.field_Db - var16.field_Db);
          var9.b(20, 2147483647, 0, this.field_gb, 15);
          var8.field_F = rp.a(32450, 3, 2105376, var8.field_Db, 11579568, 8421504);
          var16.a(-115, this.field_Pb);
          var8.a(-122, var9);
          this.a(-95, var16);
          this.a(-110, var8);
          this.field_qb = -(this.field_gb >> 1) + 320;
          var10Lifetime1 = 240 - (this.field_Db >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("fn.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_Mb = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_Lb = "Add <%0> to friend list";
        field_Ob = "To <u=ffffff>rotate</u> around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and move the mouse. Try it now to move on.";
        field_Nb = "Music: ";
        field_Qb = "You cannot add yourself!";
    }
}
