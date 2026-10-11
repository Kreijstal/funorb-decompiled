/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi implements Runnable {
    private int field_b;
    private jh field_e;
    private byte[] field_i;
    private boolean field_g;
    private java.net.Socket field_o;
    static int field_c;
    private int field_n;
    private OutputStream field_h;
    static boolean[] field_p;
    private InputStream field_m;
    private boolean field_f;
    private int field_d;
    private vh field_j;
    static rc field_l;
    static long field_k;
    static int field_a;

    final int a(byte param0) throws IOException {
        if (param0 != 19) {
          return 111;
        }
        if (this.field_g) {
          return 0;
        }
        return this.field_m.read();
    }

    hi(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          if (this.field_g) {
            return;
          }
          if (this.field_f) {
            this.field_f = false;
            throw new IOException();
          }
          if (null == this.field_i) {
            this.field_i = new byte[this.field_n];
          }
          if (param2 != 1) {
            this.b((byte) 47);
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_i[this.field_b] = param1[var6 + param3];
              this.field_b = (1 + this.field_b) % this.field_n;
              if (this.field_b == (-100 + (this.field_n + this.field_d)) % this.field_n) {
                throw new IOException();
              }
            }
            if (null == this.field_e) {
              this.field_e = this.field_j.a((byte) -118, (Runnable) (this), 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("hi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_g) {
          return;
        }
        if (param0 != 0) {
          this.field_e = (jh) null;
          if (!this.field_f) {
            return;
          }
          this.field_f = false;
          throw new IOException();
        }
        if (!this.field_f) {
          return;
        }
        this.field_f = false;
        throw new IOException();
    }

    final static java.awt.Canvas d(byte param0) {
        if (param0 > 66) {
          return null == ki.field_E ? wizardrun.field_G : (java.awt.Canvas) ((Object) ki.field_E);
        }
        field_c = 115;
        return null == ki.field_E ? wizardrun.field_G : (java.awt.Canvas) ((Object) ki.field_E);
    }

    final void b(byte param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = wizardrun.field_H;
          if (this.field_g) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            if (param0 != 76) {
              hi.d((byte) 8);
            }
            this.field_g = true;
            this.notifyAll();
          }
          if (null != this.field_e) {
            while (this.field_e.field_a == 0) {
              tg.a(1L, false);
            }
            if (1 == this.field_e.field_a) {
              try {
                ((Thread) (this.field_e.field_e)).join();
                decompiledRegionSelector0 = 0;
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 != 0) {
              }
            }
          }
          this.field_e = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 89) {
          this.field_g = true;
          if (this.field_g) {
            return 0;
          }
          return this.field_m.available();
        }
        if (this.field_g) {
          return 0;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.b((byte) 76);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = wizardrun.field_H;
        try {
          var5_int = -119 % ((-63 - param1) / 40);
          if (this.field_g) {
            return;
          }
          while (param2 > 0) {
            var6 = this.field_m.read(param0, param3, param2);
            if (var6 <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var6;
            param3 = param3 + var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("hi.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -30534) {
          field_k = 39L;
          field_l = null;
          field_p = null;
          return;
        }
        field_l = null;
        field_p = null;
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
          var6 = wizardrun.field_H;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_b == this.field_d) {
                  if (this.field_g) {
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
                  if (this.field_d > this.field_b) {
                    var1_int = -this.field_d + this.field_n;
                  } else {
                    var1_int = this.field_b - this.field_d;
                  }
                  var2 = this.field_d;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_m != null) {
                    this.field_m.close();
                  }
                  if (null != this.field_h) {
                    this.field_h.close();
                  }
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_i = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_h.write(this.field_i, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_f = true;
              }
              this.field_d = (this.field_d + var1_int) % this.field_n;
              try {
                if (this.field_b == this.field_d) {
                  this.field_h.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_f = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            rg.a((Throwable) ((Object) var1_ref), (String) null, -562);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hi(java.net.Socket param0, vh param1, int param2) throws IOException {
        this.field_g = false;
        this.field_b = 0;
        this.field_f = false;
        this.field_d = 0;
        try {
          this.field_j = param1;
          this.field_o = param0;
          this.field_o.setSoTimeout(30000);
          this.field_o.setTcpNoDelay(true);
          this.field_m = this.field_o.getInputStream();
          this.field_h = this.field_o.getOutputStream();
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_p = new boolean[112];
        field_l = new rc();
        field_a = -480;
    }
}
