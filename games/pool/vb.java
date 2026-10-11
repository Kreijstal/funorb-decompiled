/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb implements Runnable {
    private InputStream field_l;
    private int field_i;
    static String field_c;
    static int field_f;
    private java.net.Socket field_n;
    private le field_d;
    private int field_a;
    private boolean field_e;
    static of field_m;
    private int field_k;
    private byte[] field_j;
    private boolean field_h;
    static nb field_b;
    private OutputStream field_g;
    private sj field_o;
    static int[] field_p;

    vb(java.net.Socket param0, sj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h) {
            return;
          }
          while (0 < param0) {
            var5_int = this.field_l.read(param3, param2, param0);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param0 = param0 - var5_int;
            param2 = param2 + var5_int;
          }
          if (param1 == 0) {
            return;
          }
          this.field_n = (java.net.Socket) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("vb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_p = null;
        field_m = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_f = 57;
    }

    final int a(int param0) throws IOException {
        if (this.field_h) {
          return 0;
        }
        if (param0 != 14528) {
          vb.a(false);
          return this.field_l.read();
        }
        return this.field_l.read();
    }

    final void e(int param0) throws IOException {
        if (this.field_h) {
          return;
        }
        if (param0 != 0) {
          this.c(-107);
          if (this.field_e) {
            this.field_e = false;
            throw new IOException();
          }
          return;
        }
        if (this.field_e) {
          this.field_e = false;
          throw new IOException();
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
          var6 = Pool.field_O;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a == this.field_i) {
                  if (this.field_h) {
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
                  var2 = this.field_a;
                  if (this.field_a > this.field_i) {
                    var1_int = this.field_k - this.field_a;
                  } else {
                    var1_int = this.field_i - this.field_a;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_l != null) {
                    this.field_l.close();
                  }
                  if (this.field_g != null) {
                    this.field_g.close();
                  }
                  if (null != this.field_n) {
                    this.field_n.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_j = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_g.write(this.field_j, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_e = true;
              }
              this.field_a = (var1_int + this.field_a) % this.field_k;
              try {
                if (this.field_a == this.field_i) {
                  this.field_g.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_e = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            tc.a((Throwable) ((Object) var1_ref), (String) null, -8555);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, String param1, byte param2, nf param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        fq var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wd.field_Lb != aa.field_c) {
            return false;
          }
          var9 = new fq(wd.field_Ub, param3);
          var8 = 91 / ((48 - param2) / 53);
          wd.field_Ub.b(var9, 30000);
          if (sq.k(0)) {
            var9.p((byte) -52);
            return true;
          }
          qi.field_c = param0;
          j.field_b = param4;
          re.field_d = param5;
          vq.field_Xb = param6;
          wd.field_Lb = ra.field_e;
          sf.field_B = null;
          eo.field_Rb = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("vb.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final int d(int param0) throws IOException {
        if (this.field_h) {
          return 0;
        }
        if (param0 > 68) {
          return this.field_l.available();
        }
        this.field_i = -51;
        return this.field_l.available();
    }

    final static ai b(int param0) {
        int var1 = 52 / ((param0 - 41) / 41);
        return qf.field_d;
    }

    final void c(int param0) {
        try {
          InterruptedException var2 = null;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          if (this.field_h) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            if (param0 >= -82) {
              this.field_e = false;
            }
            this.field_h = true;
            this.notifyAll();
          }
          if (null != this.field_d) {
            while (0 == this.field_d.field_f) {
              cf.a(-126, 1L);
            }
            if (this.field_d.field_f == 1) {
              try {
                ((Thread) (this.field_d.field_e)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                this.field_d = null;
                return;
              }
            }
          }
          this.field_d = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.c(-119);
    }

    final static or a(int param0, pq param1) {
        or dupTemp$1 = null;
        RuntimeException var2 = null;
        String var3 = null;
        or stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -6584) {
            var3 = (String) null;
            vb.a(false, (String) null, (byte) 126, (nf) null, -39, (String) null, (String) null);
          }
          dupTemp$1 = new or(0, (or) null);
          param1.field_q = dupTemp$1;
          stackIn_3_0 = dupTemp$1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        try {
          if (this.field_h) {
            return;
          }
          var5_int = 17 / ((param1 + 12) / 58);
          if (this.field_e) {
            this.field_e = false;
            throw new IOException();
          }
          if (this.field_j == null) {
            this.field_j = new byte[this.field_k];
          }
          var6 = this;
          synchronized (var6) {
            for (var7 = 0; param2 > var7; var7++) {
              this.field_j[this.field_i] = param0[param3 + var7];
              this.field_i = (this.field_i + 1) % this.field_k;
              if ((this.field_k + (this.field_a - 100)) % this.field_k == this.field_i) {
                throw new IOException();
              }
            }
            if (null == this.field_d) {
              this.field_d = this.field_o.a(33, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("vb.I(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private vb(java.net.Socket param0, sj param1, int param2) throws IOException {
        this.field_e = false;
        this.field_i = 0;
        this.field_a = 0;
        this.field_h = false;
        try {
          this.field_n = param0;
          this.field_o = param1;
          this.field_n.setSoTimeout(30000);
          this.field_n.setTcpNoDelay(true);
          this.field_l = this.field_n.getInputStream();
          this.field_g = this.field_n.getOutputStream();
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "to over <%0> great games";
    }
}
