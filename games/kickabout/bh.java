/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_n;
    static String field_h;
    private byte[] field_r;
    private boolean field_c;
    static String field_q;
    static hd field_u;
    private boolean field_e;
    private java.net.Socket field_b;
    private int field_o;
    private int field_d;
    private wu field_p;
    private bu field_g;
    private OutputStream field_m;
    private InputStream field_a;
    static String field_t;
    static int[] field_f;
    static int field_s;
    static int field_k;
    static String[] field_i;
    static int field_j;
    static int field_l;

    final int a(byte param0) throws IOException {
        if (this.field_e) {
          return 0;
        }
        if (param0 != 63) {
          return 121;
        }
        return this.field_a.available();
    }

    protected final void finalize() {
        this.a(1);
    }

    final int b(int param0) throws IOException {
        if (this.field_e) {
          return 0;
        }
        if (param0 != 1) {
          bh.c(-10);
        }
        return this.field_a.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Kickabout.field_G;
        try {
          if (param3 != -4847) {
            this.finalize();
          }
          if (this.field_e) {
            return;
          }
          while (0 < param1) {
            var5_int = this.field_a.read(param0, param2, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 + var5_int;
            param1 = param1 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("bh.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        fj.a(-45);
        qd.b(38, 4);
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
          var6 = Kickabout.field_G;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_d == this.field_n) {
                  if (this.field_e) {
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
                  if (this.field_d <= this.field_n) {
                    var1_int = -this.field_d + this.field_n;
                  } else {
                    var1_int = -this.field_d + this.field_o;
                  }
                  var2 = this.field_d;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_a != null) {
                    this.field_a.close();
                  }
                  if (null != this.field_m) {
                    this.field_m.close();
                  }
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_r = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_m.write(this.field_r, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
              this.field_d = (this.field_d + var1_int) % this.field_o;
              try {
                if (this.field_n == this.field_d) {
                  this.field_m.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_c = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            bd.a((String) null, (Throwable) ((Object) var1_ref), 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        if (param0 > -41) {
          field_i = (String[]) null;
        }
        field_q = null;
        field_u = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_t = null;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          if (this.field_e) {
            return;
          }
          if (this.field_c) {
            this.field_c = false;
            throw new IOException();
          }
          if (null == this.field_r) {
            this.field_r = new byte[this.field_o];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param0; var6++) {
              this.field_r[this.field_n] = param3[param2 + var6];
              this.field_n = (1 + this.field_n) % this.field_o;
              if (this.field_n == (-100 + this.field_d + this.field_o) % this.field_o) {
                throw new IOException();
              }
            }
            if (null == this.field_p) {
              this.field_p = this.field_g.a(3, (byte) 127, (Runnable) (this));
            }
            if (param1 != -127) {
              return;
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    bh(java.net.Socket param0, bu param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(byte param0) throws IOException {
        int var2 = -42 / ((62 - param0) / 57);
        if (this.field_e) {
          return;
        }
        if (this.field_c) {
          this.field_c = false;
          throw new IOException();
        }
    }

    final void a(int param0) {
        try {
          int var4 = 0;
          var4 = Kickabout.field_G;
          if (this.field_e) {
            return;
          }
          synchronized (this) {
            this.field_e = true;
            this.notifyAll();
          }
          if (null != this.field_p) {
            while (this.field_p.field_a == 0) {
              aj.a(1L, 1);
            }
            if (this.field_p.field_a == 1) {
              try {
                ((Thread) (this.field_p.field_b)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          if (param0 != 1) {
            this.field_m = (OutputStream) null;
          }
          this.field_p = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private bh(java.net.Socket param0, bu param1, int param2) throws IOException {
        this.field_n = 0;
        this.field_d = 0;
        this.field_e = false;
        this.field_c = false;
        try {
          this.field_b = param0;
          this.field_g = param1;
          this.field_b.setSoTimeout(30000);
          this.field_b.setTcpNoDelay(true);
          this.field_a = this.field_b.getInputStream();
          this.field_m = this.field_b.getOutputStream();
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Loading graphics";
        field_t = "Your search returned no results.";
        field_f = st.c(-23091);
        field_k = -2;
    }
}
