/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class el implements Runnable {
    static boolean field_k;
    static String field_i;
    private boolean field_l;
    private InputStream field_e;
    private OutputStream field_j;
    private un field_n;
    static String field_g;
    private java.net.Socket field_q;
    static String field_b;
    private boolean field_p;
    static String field_a;
    private int field_c;
    private byte[] field_v;
    static eh field_d;
    private int field_m;
    static int field_r;
    static int[] field_w;
    static int[] field_h;
    static cj[] field_s;
    static String field_f;
    private int field_u;
    static int field_t;
    private pd field_o;

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != -1) {
            el.a(false);
          }
          if (this.field_l) {
            return;
          }
          while (param0 > 0) {
            var5_int = this.field_e.read(param1, param3, param0);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 - var5_int;
            param3 = param3 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("el.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static cj a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hg var8 = null;
        th var9 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        var8 = sh.field_qb;
        var3 = var8.g(11132);
        td.field_h = 127 & var3;
        stackIn_3_0 = (param1 != (128 & var3));
        ea.field_b = stackIn_3_0;
        va.field_b = var8.g(11132);
        hk.field_Kb = var8.e((byte) -60);
        if (td.field_h != 2) {
          eb.field_d = 0;
          pl.field_b = 0;
        } else {
          eb.field_d = var8.c((byte) -54);
          pl.field_b = var8.a(-25842);
        }
        stackIn_9_0 = (1 != var8.g(11132)) ? 0 : 1;
        var4 = stackIn_9_0;
        vc.field_hb = var8.h(-118);
        if (var4 == 0) {
          vl.field_k = vc.field_hb;
        } else {
          vl.field_k = var8.h(-118);
        }
        if (td.field_h != 1 &&
          4 != td.field_h) {
          pb.field_l = null;
          ef.field_b = 0;
        } else {
          ef.field_b = var8.c((byte) 49);
          pb.field_l = var8.h(-127);
        }
        if (param0) {
          var5 = var8.c((byte) -77);
          try {
            var9 = cj.field_s.a((byte) 125, var5);
            aa.field_f = var9.d(124);
            if (vl.field_k.equals(mi.field_d)) {
              stackIn_23_0 = null;
            } else {
              stackIn_23_0 = var9.field_u;
            }
            ne.field_e = stackIn_23_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            en.a("CC1", (Throwable) ((Object) var6), 1);
            ne.field_e = null;
            aa.field_f = null;
          }
        } else {
          aa.field_f = hc.a(128, 80, var8);
          ne.field_e = null;
        }
        return new cj(param0);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = 8 - (param1 & 7);
        }
        int var4 = 112 % ((46 - param0) / 59);
        int var3 = var2 + param1;
        return var3;
    }

    final void c(int param0) throws IOException {
        if (param0 > -62) {
          this.field_l = true;
        }
        if (this.field_l) {
          return;
        }
        if (this.field_p) {
          this.field_p = false;
          throw new IOException();
        }
    }

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = Virogrid.field_F ? 1 : 0;
          if (this.field_l) {
            return;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (null != this.field_n) {
            while (this.field_n.field_a == 0) {
              mm.a(-64, 1L);
            }
            if (this.field_n.field_a == 1) {
              try {
                ((Thread) (this.field_n.field_f)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          if (param0 != 4155) {
            field_f = (String) null;
          }
          this.field_n = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void e(int param0) {
        if (param0 != -2) {
          return;
        }
        la var1 = (la) (vi.field_h.a((byte) -34));
        if (var1 == null) {
          tn.a(false);
          return;
        }
        hg var2 = sh.field_qb;
        var2.d((byte) 118);
        var2.d((byte) 102);
        var2.d((byte) 99);
        var2.d((byte) 102);
        var1.a(false);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_p) {
            this.field_p = false;
            throw new IOException();
          }
          if (this.field_v == null) {
            this.field_v = new byte[this.field_m];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = param1; var6 < param3; var6++) {
              this.field_v[this.field_c] = param0[var6 + param2];
              this.field_c = (this.field_c + 1) % this.field_m;
              if (this.field_c == (this.field_m + this.field_u - 100) % this.field_m) {
                throw new IOException();
              }
            }
            if (null == this.field_n) {
              this.field_n = this.field_o.a(3, (Runnable) (this), param1 ^ 255);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("el.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        ib.b(-94);
        nf.a(td.field_j, j.field_k[0].field_u, pg.field_e, oc.field_k, -27, qi.field_d);
    }

    protected final void finalize() {
        this.b(4155);
    }

    public static void d(int param0) {
        if (param0 > -124) {
          return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
        field_s = null;
        field_w = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_b = null;
    }

    final int f(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 31479) {
          return 69;
        }
        return this.field_e.available();
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int stackIn_16_0 = 0;
        ad.field_g[2] = 0.0;
        ad.field_g[0] = 1.0;
        el.a(false, (byte) -106);
        mj.field_D = 262144;
        ao.field_Hb = 52.5f;
        we.field_k = 50.0f;
        co.field_h = 0;
        var2 = param1 ? 1 : 0;
        var3 = bd.field_e;
        if (hm.field_c == 0 ||
          2 == i.field_y ||
          i.field_y == 3 ||
          4 == hm.field_c ||
          hm.field_c == 5) {
          var3 = hm.field_c;
        }
        gb.a(-2, var3, var2 != 0, 0);
        if (param0 != 12229) {
          field_h = (int[]) null;
        }
        if (mj.field_E != 0 && (!(mj.field_E >= 10) ||
          !(mj.field_E < 20))) {
          stackIn_16_0 = (mj.field_E < 15) ? 2 : 3;
          bc.field_c = stackIn_16_0;
          co.field_l = stackIn_16_0;
          ka.a(true, (byte) 87);
        }
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = Virogrid.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_u == this.field_c) {
                  if (this.field_l) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_u <= this.field_c) {
                    var1_int = this.field_c - this.field_u;
                  } else {
                    var1_int = this.field_m - this.field_u;
                  }
                  var2 = this.field_u;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_e) {
                    this.field_e.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_q != null) {
                    this.field_q.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_v = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_j.write(this.field_v, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
              this.field_u = (this.field_u + var1_int) % this.field_m;
              try {
                if (this.field_u == this.field_c) {
                  this.field_j.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            en.a((String) null, (Throwable) ((Object) var1_ref), 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    el(java.net.Socket param0, pd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(boolean param0, byte param1) {
        ec.field_z = sj.field_o;
        jk.field_c = 2;
        if (param0) {
          kg.field_a = sg.field_i;
          ai.field_c = sj.field_o;
        }
        if (param1 != -106) {
          return;
        }
        em.field_c = sg.field_i;
    }

    final int a(int param0) throws IOException {
        if (param0 != -1) {
          this.field_l = false;
        }
        if (this.field_l) {
          return 0;
        }
        return this.field_e.read();
    }

    private el(java.net.Socket param0, pd param1, int param2) throws IOException {
        this.field_l = false;
        this.field_p = false;
        this.field_c = 0;
        this.field_u = 0;
        try {
          this.field_q = param0;
          this.field_o = param1;
          this.field_q.setSoTimeout(30000);
          this.field_q.setTcpNoDelay(true);
          this.field_e = this.field_q.getInputStream();
          this.field_j = this.field_q.getOutputStream();
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = "Full";
        field_r = -1;
        field_g = "Only show lobby chat from my friends";
        field_f = "Seriously offensive language";
        field_t = 2;
        field_h = new int[]{8};
        field_a = "This game option has not yet been unlocked for use.";
    }
}
