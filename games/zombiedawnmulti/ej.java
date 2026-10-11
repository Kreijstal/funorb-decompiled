/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    static String field_o;
    static ja field_g;
    static jh field_n;
    static int field_e;
    private go field_s;
    private di field_c;
    private int field_m;
    private int field_h;
    static ja field_j;
    private boolean field_i;
    static int field_q;
    private InputStream field_d;
    private OutputStream field_l;
    private java.net.Socket field_f;
    private boolean field_r;
    private int field_a;
    private byte[] field_b;
    static String field_k;
    static int[] field_p;

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        field_j = null;
        field_k = null;
        if (param0 <= 10) {
          field_q = -107;
        }
        field_o = null;
        field_p = null;
    }

    final void b(int param0) throws IOException {
        if (this.field_r) {
          return;
        }
        if (this.field_i) {
          this.field_i = false;
          throw new IOException();
        }
        if (param0 != -26844) {
          this.c(-17);
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
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a == this.field_h) {
                  if (this.field_r) {
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
                  if (this.field_a < this.field_h) {
                    var1_int = -this.field_h + this.field_m;
                  } else {
                    var1_int = -this.field_h + this.field_a;
                  }
                  var2 = this.field_h;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                  if (null != this.field_l) {
                    this.field_l.close();
                  }
                  if (this.field_f != null) {
                    this.field_f.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_b = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_l.write(this.field_b, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
              this.field_h = (this.field_h + var1_int) % this.field_m;
              try {
                if (this.field_h == this.field_a) {
                  this.field_l.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            bd.a((String) null, (Throwable) ((Object) var1_ref), false);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cr a(byte param0, int param1) {
        if (param0 >= -32) {
          ej.b((byte) 24);
        }
        cr var2 = new cr();
        dc.field_Gb.a(var2, false);
        mi.b(1, param1);
        return var2;
    }

    protected final void finalize() {
        this.c(92);
    }

    final static void a(ja param0, byte param1, ja param2) {
        jj.field_F = new ja[7];
        rb.field_e = new ja[7];
        eg.field_D = new ja(300, 200);
        rb.field_e[0] = param2;
        jj.field_F[0] = new ja(param2.field_x + 20, param2.field_w + 10);
        rb.field_e[1] = param0;
        jj.field_F[1] = new ja(param0.field_x + 10, 10 + param0.field_w);
        rb.field_e[2] = new ja(150, 100);
        jj.field_F[2] = new ja(150, 100);
        rb.field_e[3] = new ja(120, 50);
        jj.field_F[3] = new ja(120, 50);
        rb.field_e[4] = new ja(300, 50);
        jj.field_F[4] = new ja(300, 50);
        rb.field_e[5] = new ja(200, 90);
        jj.field_F[5] = new ja(200, 90);
        rb.field_e[6] = new ja(200, 50);
        if (param1 >= -4) {
          return;
        }
        try {
          jj.field_F[6] = new ja(200, 50);
          g.c();
          jj.field_F[0].a();
          rb.field_e[0].f(5, 5, 16777215);
          jm.d((byte) -18);
          rb.field_e[0].f(5, 5, 0);
          jj.field_F[1].a();
          rb.field_e[1].f(-35, 5, 16777215);
          g.a(16777215);
          jm.d((byte) -18);
          rb.field_e[1].f(-35, 5, 0);
          g.b();
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ej.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ej(java.net.Socket param0, go param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(int param0) throws IOException {
        if (this.field_r) {
          return 0;
        }
        int var2 = -42 / ((param0 + 37) / 35);
        return this.field_d.available();
    }

    final static long a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        long var1_long = 0L;
        RuntimeException var1 = null;
        int var3 = 0;
        int var6 = 0;
        long stackIn_11_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1_long = 0L;
          var3 = -15 / ((35 - param0) / 62);
          for (var4 = 0; var4 < em.field_Y.length; var4++) {
            for (var5 = 0; var5 < em.field_Y[var4][0].length; var5++) {
              if (em.field_Y[var4][0][var5] != 255) {
                var1_long = var1_long | 1L << em.field_Y[var4][0][var5];
              }
            }
          }
          stackIn_11_0 = var1_long;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ej.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_r) {
            return;
          }
          while (0 < param0) {
            var5_int = this.field_d.read(param2, param1, param0);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param0 = param0 - var5_int;
          }
          if (param3 <= 96) {
            ej.b((byte) 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0) {
        try {
          int var4 = 0;
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_r) {
            return;
          }
          synchronized (this) {
            this.field_r = true;
            this.notifyAll();
          }
          int var2 = 61 / ((param0 - 20) / 58);
          if (this.field_c != null) {
            while (this.field_c.field_f == 0) {
              vd.a(false, 1L);
            }
            if (this.field_c.field_f == 1) {
              try {
                ((Thread) (this.field_c.field_d)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        ja var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_r) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          if (null == this.field_b) {
            this.field_b = new byte[this.field_m];
          }
          var5 = this;
          synchronized (var5) {
            if (param1 != -100) {
              var9 = (ja) null;
              ej.a((ja) null, (byte) -16, (ja) null);
            }
            for (var6 = 0; param2 > var6; var6++) {
              this.field_b[this.field_a] = param3[param0 + var6];
              this.field_a = (this.field_a + 1) % this.field_m;
              if (this.field_a == (-100 + (this.field_m + this.field_h)) % this.field_m) {
                throw new IOException();
              }
            }
            if (null == this.field_c) {
              this.field_c = this.field_s.a(47, (Runnable) (this), 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("ej.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 59) {
          this.field_r = true;
        }
        if (this.field_r) {
          return 0;
        }
        return this.field_d.read();
    }

    private ej(java.net.Socket param0, go param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_r = false;
        this.field_a = 0;
        this.field_i = false;
        try {
          this.field_s = param1;
          this.field_f = param0;
          this.field_f.setSoTimeout(30000);
          this.field_f.setTcpNoDelay(true);
          this.field_d = this.field_f.getInputStream();
          this.field_l = this.field_f.getOutputStream();
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Please log in as a subscribing member to access this feature.";
        field_e = 0;
        field_k = "Select a human!";
    }
}
