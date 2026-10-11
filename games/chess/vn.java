/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vn extends bj implements mj {
    static jc field_vb;
    static String field_Eb;
    static int[] field_sb;
    private boolean field_zb;
    static String[] field_ub;
    static km field_rb;
    static km field_xb;
    static int[] field_Ab;
    private lh field_Fb;
    private boolean field_Cb;
    private rm field_wb;
    static km field_Bb;
    private boolean field_yb;
    static int field_Db;
    private boolean field_tb;

    final static void l(int param0) {
        mi.field_t = new String[re.field_j];
        mi.field_t[5] = sa.field_f;
        mi.field_t[11] = ii.field_N;
        mi.field_t[17] = fl.field_s;
        mi.field_t[6] = kn.field_E;
        mi.field_t[20] = mn.field_j;
        mi.field_t[9] = sj.field_f;
        mi.field_t[4] = ri.field_h;
        mi.field_t[19] = kn.field_K;
        mi.field_t[15] = va.field_e;
        if (param0 == 6) {
          mi.field_t[21] = le.field_b;
          mi.field_t[7] = hc.field_e;
          mi.field_t[18] = kn.field_J;
          mi.field_t[16] = fb.field_G;
          mi.field_t[13] = oa.field_c;
          return;
        }
        field_Eb = (String) null;
        mi.field_t[21] = le.field_b;
        mi.field_t[7] = hc.field_e;
        mi.field_t[18] = kn.field_J;
        mi.field_t[16] = fb.field_G;
        mi.field_t[13] = oa.field_c;
    }

    vn(fm param0, lh param1, String param2, boolean param3, boolean param4) {
        super(param0, new e((vn) null, param1, param2), 77, 10, 10);
        try {
          this.field_yb = false;
          this.field_zb = param3 ? true : false;
          this.field_Fb = param1;
          this.field_Cb = param4 ? true : false;
          this.field_tb = false;
          this.field_wb = new rm(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_wb.field_W = true;
          this.b(this.field_wb, 95);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (!this.field_P) {
          return;
        }
        this.field_P = false;
        if (this.field_zb) {
          vn.m(10);
          var2 = -90 % ((param0 + 67) / 41);
          return;
        }
        if (this.field_Cb) {
          ci.j(-73);
          var2Lifetime1 = -90 % ((param0 + 67) / 41);
          return;
        }
        var2Lifetime2 = -90 % ((param0 + 67) / 41);
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            this.field_zb = true;
          }
          if (13 != param1) {
            stackIn_7_0 = super.a(param0, param1, -1, param3);
            return stackIn_7_0;
          }
          this.k((byte) -115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void n(int param0) {
        this.field_wb.b(2121792, 15016, 4210752);
        e var2 = new e(this, this.field_Fb, gg.field_q);
        var2.a(15, 87, tc.field_y);
        if (param0 == 24528) {
          this.c(var2, 127);
          return;
        }
        field_sb = (int[]) null;
        this.c(var2, 127);
    }

    final void a(int param0, String param1, byte param2) {
        boolean stackIn_7_1 = false;
        e stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        String stackIn_16_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        e var6 = null;
        var5 = Chess.field_G;
        try {
          if (this.field_yb) {
            return;
          }
          stackIn_7_1 = (param0 == 256);
          this.field_tb = stackIn_7_1;
          this.field_yb = true;
          this.field_wb.b(8405024, 15016, 4210752);
          if (param2 <= 20) {
            return;
          }
          var6 = new e(this, this.field_Fb, param1);
          if (param0 != 5) {
            if (256 != param0) {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              stackIn_15_2 = 113;
              if (this.field_zb) {
                stackIn_16_3 = hl.field_f;
              } else {
                stackIn_16_3 = fa.field_k;
              }
              ((e) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_16_3);
            } else {
              var6.a((byte) -114, (rg) (this), hl.field_f);
            }
          } else {
            var6.a(11, 29, vi.field_a);
            var6.a(17, 62, sn.field_b);
          }
          if (param0 != 3) {
            if (param0 != 4) {
              if (param0 != 6) {
                if (param0 == 9) {
                  var6.a((byte) -114, (rg) (this), rn.field_c);
                }
              } else {
                var6.a(9, 31, gg.field_e);
              }
            } else {
              var6.a(8, 101, gd.field_f);
            }
          } else {
            var6.a(7, 81, ki.field_Q);
          }
          this.c(var6, 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("vn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    private final static void m(int param0) {
        String var3 = null;
        String var2 = null;
        String var5 = null;
        if (!dk.field_g) {
          throw new IllegalStateException();
        }
        if (param0 != 10) {
          vn.m(-26);
          if (null != ua.field_d) {
            ua.field_d.k((byte) -113);
            var3 = ec.e((byte) -64);
            um.field_b = new wf(var3, (String) null, true, false, false);
            jh.field_e.b(nj.field_w, (byte) -46);
            nj.field_w.c(um.field_b, 88);
            nj.field_w.i((byte) -126);
            return;
          }
          var2 = ec.e((byte) -64);
          um.field_b = new wf(var2, (String) null, true, false, false);
          jh.field_e.b(nj.field_w, (byte) -46);
          nj.field_w.c(um.field_b, 88);
          nj.field_w.i((byte) -126);
          return;
        }
        if (null == ua.field_d) {
          var5 = ec.e((byte) -64);
          um.field_b = new wf(var5, (String) null, true, false, false);
          jh.field_e.b(nj.field_w, (byte) -46);
          nj.field_w.c(um.field_b, 88);
          nj.field_w.i((byte) -126);
          return;
        }
        ua.field_d.k((byte) -113);
        String var4 = ec.e((byte) -64);
        um.field_b = new wf(var4, (String) null, true, false, false);
        jh.field_e.b(nj.field_w, (byte) -46);
        nj.field_w.c(um.field_b, 88);
        nj.field_w.i((byte) -126);
    }

    public void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_tb) {
            uk.a(false, 3);
            this.k((byte) -121);
          } else {
            sg.a(bh.i(param4 ^ -24270), (byte) 120, "tochangedisplayname.ws");
          }
          if (param4 == -24221) {
            return;
          }
          this.n(-96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("vn.DA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_sb = null;
        field_Ab = null;
        field_xb = null;
        if (param0 == 5) {
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        }
        vn.j((byte) 123);
        field_rb = null;
        field_ub = null;
        field_Bb = null;
        field_vb = null;
        field_Eb = null;
    }

    static {
        field_ub = new String[]{"Click on one of the highlighted pieces to select it", "Click on one of the highlighted squares to move your selected piece"};
        field_Eb = "This game option has not yet been unlocked for use.";
        field_sb = new int[]{682, 910};
        field_Db = -1;
        field_vb = new jc();
    }
}
