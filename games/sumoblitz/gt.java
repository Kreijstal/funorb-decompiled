/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class gt extends ur implements ai {
    static jh field_gb;
    static int field_ab;
    private boolean field_cb;
    static da field_db;
    static String field_hb;
    static boolean field_bb;
    private pq field_ib;
    private boolean field_kb;
    private boolean field_fb;
    private vn field_jb;
    private boolean field_eb;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != -1540) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            gt.a(-115, (java.applet.Applet) null);
          }
          ie.a(-118, "", param1);
          of.a(param0 + 9732, param1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gt.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void n(int param0) {
        if (param0 != -7) {
          this.field_kb = true;
          if (!this.field_D) {
            return;
          }
          this.field_D = false;
          if (this.field_cb) {
            ag.a(0);
            return;
          }
          if (this.field_fb) {
            bv.a(-363927231);
            return;
          }
          return;
        }
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (this.field_cb) {
          ag.a(0);
          return;
        }
        if (this.field_fb) {
          bv.a(-363927231);
          return;
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_db = null;
        int var1 = 57 / ((param0 - 70) / 48);
        field_gb = null;
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -2) {
            stackIn_2_0 = -68;
            return stackIn_2_0;
          }
          if (!param2) {
            stackIn_7_0 = qq.field_R.a(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = ns.field_a.a(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gt.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = ji.a(param1, (byte) 66);
          if (param2 < 46) {
            field_hb = (String) null;
          }
          if (param0.indexOf(param1) != -1) {
            return true;
          }
          if (param0.indexOf(var3) != -1) {
            return true;
          }
          stackIn_14_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("gt.LA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final void e(boolean param0) {
        lc var2 = null;
        this.field_ib.b(2121792, 4210752, 55);
        if (!param0) {
          var2 = new lc(this, this.field_jb, fh.field_j);
          var2.a(id.field_m, 15, true);
          this.b((byte) -121, var2);
          return;
        }
    }

    public void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 710) {
            field_db = (da) null;
          }
          if (!this.field_eb) {
            cn.a("tochangedisplayname.ws", ra.c(param1 - 708), (byte) -103);
            return;
          }
          rd.a(3, -82);
          this.n(-7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gt.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param3) {
            this.n(-7);
            return true;
          }
          if (param2 < 9) {
            var6 = (String) null;
            gt.$cfr$intArgs$a$590e95718a07(20, (String) null, false);
          }
          stackIn_7_0 = super.a(param0, param1, (byte) 51, param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gt.KA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (qk.field_O != null && (0 > param1 ||
            ga.field_j == kw.field_c)) {
            if (as.field_v.field_p == 0 &&
              (rj.field_a + 10000L) < wq.a(param0 - 14)) {
              as.field_v.g(param1, 8);
            }
            if (as.field_v.field_p > param0) {
              try {
                qk.field_O.a(0, -2, as.field_v.field_n, as.field_v.field_p);
                rj.field_a = wq.a(-21);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                kk.a((byte) -115);
              }
              as.field_v.field_p = 0;
            }
            return;
          }
          as.field_v.field_p = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void m(int param0) {
        ib.d(1);
        if (qn.field_f != null) {
          wr.a(true, qn.field_f);
        }
        rq.a(false);
        jm.b(28679);
        if (param0 != 0) {
          field_gb = (jh) null;
        }
        fu.a(-1);
        if (pe.a((byte) -98)) {
          as.field_v.g(1, 8);
          gt.a(0, 0);
        }
        kk.a((byte) -127);
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_7_1 = false;
        lc stackIn_15_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_kb) {
            return;
          }
          this.field_kb = true;
          stackIn_7_1 = (param1 == 256);
          this.field_eb = stackIn_7_1;
          if (param2 != 21089) {
            return;
          }
          this.field_ib.b(8405024, 4210752, param2 ^ 20995);
          var6 = new lc(this, this.field_jb, param0);
          if (5 != param1) {
            if (param1 != 256) {
              stackIn_15_0 = var6;
              if (this.field_cb) {
                stackIn_16_1 = ii.field_b;
              } else {
                stackIn_16_1 = cq.field_c;
              }
              ((lc) (Object) stackIn_15_0).a(stackIn_16_1, -1, true);
            } else {
              var6.a(ii.field_b, (byte) -123, (qm) (this));
            }
          } else {
            var6.a(vf.field_e, 11, true);
            var6.a(of.field_k, 17, true);
          }
          if (param1 == 3) {
            var6.a(lq.field_c, 7, true);
          } else {
            if (param1 != 4) {
              if (param1 != 6) {
                if (param1 != 9) {
                  this.b((byte) -97, var6);
                  return;
                }
                var6.a(pl.field_s, (byte) -123, (qm) (this));
              } else {
                var6.a(eq.field_w, 9, true);
              }
            } else {
              var6.a(ch.field_e, 8, true);
            }
          }
          this.b((byte) -97, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("gt.BB(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    gt(dg param0, vn param1, String param2, boolean param3, boolean param4) {
        super(param0, new lc((gt) null, param1, param2), 77, 10, 10);
        try {
          this.field_fb = param4 ? true : false;
          this.field_eb = false;
          this.field_jb = param1;
          this.field_cb = param3 ? true : false;
          this.field_kb = false;
          this.field_ib = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ib.field_J = true;
          this.a(this.field_ib, 78);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_ab = 0;
        field_hb = "Loading music";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$590e95718a07(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -2) {
            stackIn_2_0 = -68;
            return stackIn_2_0;
          }
          if (!param2) {
            stackIn_7_0 = qq.field_R.a(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = ns.field_a.a(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gt.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }
}
