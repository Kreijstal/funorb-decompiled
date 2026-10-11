/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wv extends mu implements vh {
    static int field_ib;
    private boolean field_db;
    private boolean field_cb;
    private boolean field_gb;
    private ou field_jb;
    private boolean field_hb;
    static r field_fb;
    private hu field_eb;
    static String field_bb;

    final static void a(byte param0, int param1, tf param2, java.awt.Point[] param3) {
        int var4_int = 0;
        java.awt.Point var5 = null;
        java.awt.Point var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Kickabout.field_G;
        try {
          for (var4_int = 0; var4_int < param3.length; var4_int++) {
            var5 = param3[var4_int];
            var6 = param3[(var4_int + 1) % param3.length];
            nm.a(var6.x, param1, var6.y, var5.y, var5.x, param2, (byte) -109);
          }
          if (param0 != -108) {
            field_bb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wv.TB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_bb = null;
        field_fb = null;
        int var1 = -48 % ((-50 - param0) / 51);
    }

    final void q(int param0) {
        if (!this.field_C) {
          return;
        }
        this.field_C = false;
        if (this.field_gb) {
          uj.b(true);
        } else {
          if (this.field_db) {
            vr.c(-3);
          }
        }
        if (param0 >= -75) {
          field_ib = -91;
        }
    }

    public void a(int param0, wi param1, int param2, byte param3, int param4) {
        wi var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 <= 64) {
            var7 = (wi) null;
            this.a(-123, (wi) null, 56, (byte) 64, 43);
          }
          if (!this.field_cb) {
            im.a(so.a(-79), 126, "tochangedisplayname.ws");
          } else {
            qd.b(38, 3);
            this.q(-97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("wv.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void r(int param0) {
        this.field_jb.a((byte) 21, 4210752, param0);
        qp var2 = new qp(this, this.field_eb, ii.field_m);
        var2.a((byte) 99, 15, ta.field_E);
        this.a((byte) -124, (fd) (var2));
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -60) {
            wv.j((byte) 84);
          }
          if (param3 != 13) {
            stackIn_7_0 = super.a(param0, (byte) -94, param2, param3);
            return stackIn_7_0;
          }
          this.q(-115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("wv.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_6_1 = false;
        qp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        String stackIn_11_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        qp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        java.awt.Point[] var6 = null;
        qp var7 = null;
        var5 = Kickabout.field_G;
        try {
          if (this.field_hb) {
            return;
          }
          stackIn_6_1 = (param0 == 256);
          this.field_cb = stackIn_6_1;
          this.field_hb = true;
          this.field_jb.a((byte) 21, 4210752, 8405024);
          var7 = new qp(this, this.field_eb, param2);
          var4 = var7;
          if (param0 == 5) {
            var7.a((byte) 72, 11, ql.field_d);
            var7.a((byte) 104, 17, bv.field_o);
          } else {
            if (param0 == 256) {
              var7.a(bt.field_d, (jv) (this), (byte) 79);
            } else {
              stackIn_10_0 = var7;
              stackIn_10_1 = 111;
              stackIn_10_2 = -1;
              if (this.field_gb) {
                stackIn_11_3 = bt.field_d;
              } else {
                stackIn_11_3 = is.field_f;
              }
              ((qp) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, stackIn_11_3);
            }
          }
          if (param0 != 3) {
            if (param0 == 4) {
              var7.a((byte) 96, 8, ra.field_O);
            } else {
              if (param0 == 6) {
                var7.a((byte) 92, 9, bv.field_p);
              } else {
                if (9 == param0) {
                  var7.a(ir.field_C, (jv) (this), (byte) 79);
                }
              }
            }
          } else {
            var7.a((byte) 54, 7, ha.field_J);
          }
          if (param1 < 96) {
            var6 = (java.awt.Point[]) null;
            wv.a((byte) -60, 109, (tf) null, (java.awt.Point[]) null);
          }
          this.a((byte) -120, (fd) (var7));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("wv.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    wv(se param0, hu param1, String param2, boolean param3, boolean param4) {
        super(param0, new qp((wv) null, param1, param2), 77, 10, 10);
        try {
          this.field_cb = false;
          this.field_eb = param1;
          this.field_hb = false;
          this.field_db = param4 ? true : false;
          this.field_gb = param3 ? true : false;
          this.field_jb = new ou(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_jb.field_w = true;
          this.a(-42, this.field_jb);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_bb = "This game option has not yet been unlocked for use.";
        field_fb = new r();
    }
}
