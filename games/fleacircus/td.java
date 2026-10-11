/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td implements Runnable {
    private OutputStream field_d;
    static long[][] field_f;
    private InputStream field_n;
    private od field_q;
    private int field_r;
    private boolean field_a;
    static int field_i;
    private boolean field_l;
    private int field_b;
    static long[] field_c;
    private ce field_p;
    private byte[] field_h;
    private int field_e;
    static dd field_m;
    static ke field_g;
    static w field_k;
    static wk field_j;
    private java.net.Socket field_o;

    final static int a(boolean param0) {
        if (!param0) {
          return -33;
        }
        return lg.field_d;
    }

    final void c(int param0) throws IOException {
        if (param0 != 0) {
          this.finalize();
        }
        if (this.field_l) {
          return;
        }
        if (this.field_a) {
          this.field_a = false;
          throw new IOException();
        }
    }

    final static void b(int param0) {
        int var2;
        ql var3;
        boolean decompiledFrameRemainder0 = true;
        var2 = fleas.field_A ? 1 : 0;
        tj.field_a = tj.field_a + 1;
        if ((!(wc.field_q > 0) ||
          qh.c((byte) 68)) && (fleas.field_E == 0 &&
          tj.field_a >= 15)) {
          oa.a(9, true, 15);
          decompiledFrameRemainder0 = false;
        }
        else {
          if (ia.field_m[fleas.field_E].length <= tj.field_a) {
            if (hj.field_a[1] == -1 + pl.field_l[1] &&
              hj.field_a[0] == -1 + pl.field_l[0]) {
              hg.a(-25389, 3, 252, tj.field_a);
            }
            if ((pl.field_l[1] - 1 == hj.field_a[1] ||
              hj.field_a[0] == -1 + pl.field_l[0]) &&
              tg.field_g) {
              hg.a(-25389, 15, 240, tj.field_a);
            }
            oa.a(9, true, 37);
          } else {
            bc.field_V = -1;
            if (em.field_b > 0) {
              wi.field_p.a(-119, em.field_b);
              wi.field_p.a(false);
              em.field_b = 0;
            }
            if (tj.field_a == 12 &&
              fleas.field_E == 0 &&
              !c.field_U) {
              hg.a(-25389, 10, 245, tj.field_a);
            }
            if (tj.field_a >= ia.field_m[fleas.field_E].length) {
              oa.a(9, true, 41);
            } else {
              hj.field_a[fleas.field_E] = Math.max(tj.field_a, hj.field_a[fleas.field_E]);
              var3 = new ql(fleas.field_E, -1 + hj.field_a[fleas.field_E], 0, 0, 0, 0);
              if (!qh.c((byte) 38)) {
                rd.a(var3, 79, 5);
                ej.a((byte) -39);
              } else {
                mi.field_r.a(false, var3);
                ej.a((byte) -39);
              }
            }
          }
        }
        if (param0 <= 8) {
          field_m = (dd) null;
        }
    }

    public static void a(int param0) {
        field_f = (long[][]) null;
        field_j = null;
        field_g = null;
        field_k = null;
        field_c = null;
        field_m = null;
        if (param0 != 123167272) {
          field_f = (long[][]) null;
        }
    }

    final static void g(int param0) {
        cg.a((byte) -105, param0);
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
          var6 = fleas.field_A ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_e == this.field_b) {
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
                  if (this.field_e <= this.field_b) {
                    var1_int = -this.field_e + this.field_b;
                  } else {
                    var1_int = this.field_r - this.field_e;
                  }
                  var2 = this.field_e;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_n) {
                    this.field_n.close();
                  }
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_h = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_d.write(this.field_h, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
              this.field_e = (var1_int + this.field_e) % this.field_r;
              try {
                if (this.field_e == this.field_b) {
                  this.field_d.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            ud.a((String) null, (Throwable) ((Object) var1_ref), 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        try {
          int var4 = 0;
          var4 = fleas.field_A ? 1 : 0;
          if (this.field_l) {
            return;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (param0 != 0) {
            return;
          }
          if (null != this.field_q) {
            while (this.field_q.field_b == 0) {
              vh.a(1L, param0 + 104);
            }
            if (1 == this.field_q.field_b) {
              try {
                ((Thread) (this.field_q.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_q = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean d(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 >= -79) {
          field_j = (wk) null;
        }
        stackIn_9_0 = ((vc.field_b &&
          mf.field_a == null) ||
          qh.c((byte) 33));
        return stackIn_9_0;
    }

    protected final void finalize() {
        this.h(0);
    }

    final static void a(byte param0, ni param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          rf.field_l = param1.d((byte) 72) << 5;
          var2_int = param1.e(false);
          rf.field_l = rf.field_l + (var2_int >> 3);
          wd.field_c = var2_int << 18 & 1835008;
          wd.field_c = wd.field_c + (param1.d((byte) -112) << 2);
          var2_intLifetime1 = param1.e(false);
          wd.field_c = wd.field_c + (var2_intLifetime1 >> 6);
          dk.field_B = 2064384 & var2_intLifetime1 << 15;
          dk.field_B = dk.field_B + (param1.e(false) << 7);
          var2_intLifetime2 = param1.e(false);
          w.field_a = var2_intLifetime2 << 16 & 65536;
          dk.field_B = dk.field_B + (var2_intLifetime2 >> 1);
          w.field_a = w.field_a + param1.d((byte) -88);
          if (param0 != -107) {
            td.b(13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("td.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    td(java.net.Socket param0, ce param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param0 > -85) {
            return;
          }
          if (this.field_l) {
            return;
          }
          if (this.field_a) {
            this.field_a = false;
            throw new IOException();
          }
          if (this.field_h == null) {
            this.field_h = new byte[this.field_r];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param1; var6++) {
              this.field_h[this.field_b] = param3[param2 + var6];
              this.field_b = (1 + this.field_b) % this.field_r;
              if ((-100 + this.field_r + this.field_e) % this.field_r == this.field_b) {
                throw new IOException();
              }
            }
            if (null == this.field_q) {
              this.field_q = this.field_p.a(4532, (Runnable) (this), 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int f(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 1605772320) {
          this.field_a = false;
        }
        return this.field_n.read();
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          if (param3) {
            field_c = (long[]) null;
          }
          while (param0 > 0) {
            var5_int = this.field_n.read(param1, param2, param0);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 - var5_int;
            param2 = param2 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("td.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ql var4 = null;
        fi var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          var4 = (ql) (sd.field_d.c((byte) 47));
          while (var4 != null) {
            qb.a(param0, (byte) 90, var4);
            var4 = (ql) (sd.field_d.b((byte) -105));
          }
          var5 = (fi) (lk.field_O.c((byte) 47));
          if (param1 != -1115925337) {
            td.g(-22);
          }
          while (var5 != null) {
            rd.a(param0, var5, (byte) -118);
            var5 = (fi) (lk.field_O.b((byte) -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "td.C(" + param0 + ',' + param1 + ')');
        }
    }

    final int e(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        int var2 = 49 % ((param0 + 57) / 48);
        return this.field_n.available();
    }

    private td(java.net.Socket param0, ce param1, int param2) throws IOException {
        this.field_b = 0;
        this.field_e = 0;
        this.field_l = false;
        this.field_a = false;
        try {
          this.field_o = param0;
          this.field_p = param1;
          this.field_o.setSoTimeout(30000);
          this.field_o.setTcpNoDelay(true);
          this.field_n = this.field_o.getInputStream();
          this.field_d = this.field_o.getOutputStream();
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_f = new long[8][256];
        field_c = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(var1 & 255) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (!(256L > var10)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_f[0][var0] = cd.a(cd.a(var4 << 8, cd.a(cd.a(var10 << 24, cd.a(var2 << 32, cd.a(var6 << 40, cd.a(var2 << 56, var2 << 48)))), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_f[var14][var0] = cd.a(field_f[-1 + var14][var0] >>> 8, field_f[-1 + var14][var0] << 56);
            }
            var0++;
        }
        field_c[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = -8 + var15 * 8;
            field_c[var15] = ik.a(re.a(field_f[7][var1 + 7], 255L), ik.a(re.a(65280L, field_f[6][var1 + 6]), ik.a(ik.a(ik.a(re.a(field_f[3][var1 + 3], 1095216660480L), ik.a(ik.a(re.a(-72057594037927936L, field_f[0][var1]), re.a(71776119061217280L, field_f[1][var1 + 1])), re.a(field_f[2][2 + var1], 280375465082880L))), re.a(field_f[4][4 + var1], 4278190080L)), re.a(field_f[5][var1 + 5], 16711680L))));
            var15++;
        }
    }
}
