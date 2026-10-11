/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ch implements pe, tb {
    static ko field_U;
    private fe field_S;
    private fe field_W;
    private String field_T;
    private sl field_R;
    private boolean field_Y;
    private boolean field_O;
    private fe field_X;
    private boolean field_P;
    static String field_ab;
    static String field_N;
    private sl field_Q;
    static String field_Z;
    static int[] field_V;

    public final void a(sl param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_R) {
            this.field_Q.a((ei) (this), (byte) 115);
          }
          if (param0 == this.field_Q) {
            this.i(-1);
          }
          if (param1) {
            this.field_Q = (sl) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ui.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String h(int param0) {
        if (param0 >= -99) {
          field_ab = (String) null;
        }
        if (null == this.field_R.field_m) {
          return "";
        }
        return this.field_R.field_m;
    }

    final void a(int param0, String param1) {
        sl var3 = null;
        String var4 = null;
        try {
          var3 = this.field_R;
          var4 = param1;
          var3.a((byte) -124, false, var4);
          if (param0 != 8) {
            String var5 = (String) null;
            ui.a((byte) -7, (String) null, (String) null);
          }
          this.field_Q.f(88);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ui(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fp) null);
        n dupTemp$0 = null;
        n dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        fe stackIn_18_1 = null;
        fe stackIn_18_2 = null;
        fe stackIn_19_1 = null;
        fe stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var6 = null;
        RuntimeException var6_ref = null;
        lr var7 = null;
        String var8 = null;
        ml var9 = null;
        n var11 = null;
        n var12 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_P = stackIn_4_1;
          this.field_T = param1;
          stackIn_7_1 = (param4);
          this.field_O = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_Y = stackIn_10_1;
          if (this.field_P && (this.field_Y ||
            this.field_O)) {
            throw new IllegalStateException();
          }
          this.field_R = (sl) ((Object) new ga(param0, (cc) (this), 100));
          this.field_Q = (sl) ((Object) new ga("", (cc) (this), 20));
          if (!this.field_P) {
            this.field_S = new fe(sa.field_y, (cc) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_O) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = va.field_O;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = jk.field_a;
            }
            this.field_X = new fe(stackIn_19_3, (cc) null);
            if (this.field_Y) {
              this.field_W = new fe(ad.field_t, (cc) (this));
            }
          } else {
            this.field_S = new fe(ap.field_F, (cc) null);
            this.field_X = new fe(dj.field_e, (cc) null);
            this.field_R.field_I = false;
          }
          this.field_R.field_z = (fp) ((Object) new om(10000536));
          this.field_Q.field_z = (fp) ((Object) new sm(10000536));
          var6 = new ng();
          this.field_S.field_z = (fp) ((Object) var6);
          if (this.field_X != null) {
            this.field_X.field_z = (fp) ((Object) var6);
          }
          this.field_R.field_p = pn.field_a;
          if (null != this.field_W) {
            this.field_W.field_z = (fp) ((Object) var6);
          }
          if (this.field_W != null) {
            this.field_W.field_p = fc.field_d;
          }
          if (!this.field_P) {
            if (this.field_O) {
              this.field_X.field_p = lh.field_h;
              this.field_X.field_z = (fp) ((Object) new pd());
            } else {
              this.field_X.field_z = (fp) ((Object) new pd());
            }
          } else {
            this.field_X.field_p = wg.field_Ob;
          }
          this.field_D = 15;
          var7 = lc.field_O;
          if (this.field_T != null) {
            this.field_D = this.field_D + (5 + var7.b(this.field_T, -40 + this.field_l, var7.field_C));
          }
          var8 = vi.field_d;
          var9 = aj.a(hk.d(76), 5137);
          if (var9 == eo.field_Xb) {
            var8 = wm.field_Qb;
          } else {
            if (var9 == ug.field_v) {
              var8 = qp.field_Ob;
            }
          }
          dupTemp$0 = new n(10, this.field_D, -20 + this.field_l, 25, this.field_R, false, 80, 3, var7, 16777215, var8);
          var11 = dupTemp$0;
          this.a(true, dupTemp$0);
          this.field_D = this.field_D + (((ei) ((Object) var11)).field_y + 5);
          dupTemp$1 = new n(10, this.field_D, -20 + this.field_l, 25, this.field_Q, false, 80, 3, var7, 16777215, to.field_n);
          var12 = dupTemp$1;
          this.a(true, dupTemp$1);
          this.field_D = this.field_D + (5 + ((ei) ((Object) var12)).field_y);
          this.field_S.field_t = (cc) (this);
          if (this.field_W != null) {
            this.field_W.field_t = (cc) (this);
          }
          if (this.field_X != null) {
            this.field_X.field_t = (cc) (this);
          }
          if (this.field_W == null) {
            this.field_S.a(this.field_l - 6 - 10, 8, 30, false, this.field_D);
            this.field_D = this.field_D + 35;
          } else {
            this.field_S.a(this.field_l - 95, 85, 30, false, this.field_D);
            this.field_D = this.field_D + 60;
          }
          if (null != this.field_W) {
            this.field_W.a(-10 + this.field_l - 6, 8, 30, false, this.field_D);
            this.field_D = this.field_D + 35;
          }
          if (null != this.field_X) {
            if (!this.field_P &&
              !this.field_O) {
              this.field_X.a(40, 8, 20, false, this.field_D);
              this.field_D = this.field_D + 25;
            } else {
              this.field_X.a(-6 + this.field_l - 10, 8, 30, false, this.field_D);
              this.field_D = this.field_D + 35;
            }
          }
          this.a(this.field_l, 0, 3 + this.field_D, false, 0);
          this.a(true, this.field_S);
          if (this.field_W != null) {
            this.a(true, this.field_W);
          }
          if (null != this.field_X) {
            this.a(true, this.field_X);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ui.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.a(param3, 3);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_8_0 = this.b(param3, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ui.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void g(byte param0) {
        this.field_R.f(90);
        this.field_Q.f(100);
        if (param0 > -21) {
          this.field_T = (String) null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = -3 % ((param1 + 42) / 53);
        if (null != this.field_T) {
          lc.field_O.a(this.field_T, 20 + (this.field_C + param2), this.field_D + (param3 + 15), this.field_l - 40, this.field_y, 16777215, -1, 1, 0, lc.field_O.field_C);
        }
        if (null != this.field_W) {
          qh.f(10 + param2, 134 + param3, -20 + this.field_l, 4210752);
        }
        super.a(param0, (byte) 23, param2, param3);
    }

    public final void a(sl param0, int param1) {
        try {
          int var3_int = 100 / ((-43 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ui.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        ei var3;
        if (td.a(true) ||
          !(this.field_R.field_m.length() <= 0) &&
          !(this.field_Q.field_m.length() <= 0)) {
          ui.a((byte) 34, this.field_R.field_m, this.field_Q.field_m);
        }
        if (param0 != -1) {
          var3 = (ei) null;
          this.a('8', -107, true, (ei) null);
        }
    }

    private final static void a(byte param0, String param1, String param2) {
        try {
          if (param0 != 34) {
            String var4 = (String) null;
            ui.a((byte) -59, (String) null, (String) null);
          }
          qa.a(false, param1, -102, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ui.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 67) {
          return 14;
        }
        return jo.c(16, -54264319, param0);
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4) {
        aa var5 = null;
        lk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Pool.field_O;
        try {
          var5 = new aa(ne.field_r);
          var6 = (lk) (var5.b((byte) -92));
          while (true) {
            if (var6 == null) {
              n.a(8, param0, param1, param3, param4);
              if (param2 != -6) {
                field_ab = (String) null;
              }
              return;
            }
            if (var6.field_x != param0 &&
              !var6.field_x.equals(param0)) {
              var6 = (lk) (var5.b(-84));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("ui.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_ab = null;
        field_V = null;
        field_Z = null;
        field_U = null;
        if (param0 != -31360) {
          return;
        }
        field_N = null;
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          if (param3 != this.field_S) {
            if (this.field_W != param3) {
              if (this.field_X == param3) {
                if (this.field_P) {
                  ib.c(-119);
                } else {
                  if (!this.field_O) {
                    db.h(15158);
                  } else {
                    od.a(true);
                  }
                }
              }
            } else {
              br.f(35);
            }
          } else {
            this.i(-1);
          }
          if (!param0) {
            field_N = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ui.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
          java.net.URL var3 = null;
          java.applet.Applet var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = p.a((byte) -61, var3, param1);
              jc.a(-10553, param1, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            if (param2) {
              var4 = (java.applet.Applet) null;
              ui.a((String) null, (java.applet.Applet) null, true);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ui.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_U = new ko();
        field_ab = "Updates will sent to the email address you've given";
        field_N = "To win nine-ball pool, pot the 9 ball without fouling.";
        field_Z = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
