/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb implements Runnable {
    private int field_p;
    static String field_g;
    private boolean field_d;
    private byte[] field_c;
    private int field_l;
    private int field_h;
    static im field_b;
    static fh field_a;
    private eb field_f;
    private OutputStream field_i;
    private InputStream field_m;
    static int field_j;
    private be field_k;
    static int field_e;
    private boolean field_o;
    private java.net.Socket field_n;

    final void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          int var4 = 0;
          java.awt.Component var5 = null;
          var4 = OrbDefence.field_D ? 1 : 0;
          if (this.field_d) {
            return;
          }
          var2 = this;
          synchronized (var2) {
            this.field_d = true;
            this.notifyAll();
          }
          if (null != this.field_f) {
            while (this.field_f.field_a == 0) {
              hb.a(1L, param0 + 120);
            }
            if (this.field_f.field_a == 1) {
              try {
                ((Thread) (this.field_f.field_g)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_f = null;
                if (param0 == 1) {
                  return;
                }
                var5 = (java.awt.Component) null;
                cb.a(-74, (java.awt.Component) null);
                return;
              }
            }
          }
          this.field_f = null;
          if (param0 == 1) {
            return;
          }
          var5 = (java.awt.Component) null;
          cb.a(-74, (java.awt.Component) null);
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != 5000) {
          return;
        }
        try {
          param1.removeMouseListener(nk.field_q);
          param1.removeMouseMotionListener(nk.field_q);
          param1.removeFocusListener(nk.field_q);
          db.field_f = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "cb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var3 = null;
          int var6 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          String var7 = null;
          var6 = OrbDefence.field_D ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_h == this.field_l) {
                  if (this.field_d) {
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
                  if (this.field_h <= this.field_l) {
                    var1_int = -this.field_h + this.field_l;
                  } else {
                    var1_int = this.field_p - this.field_h;
                  }
                  var2 = this.field_h;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_m) {
                    this.field_m.close();
                  }
                  if (null != this.field_i) {
                    this.field_i.close();
                  }
                  if (this.field_n != null) {
                    this.field_n.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_c = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_i.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_o = true;
              }
              this.field_h = (var1_int + this.field_h) % this.field_p;
              try {
                if (this.field_l == this.field_h) {
                  this.field_i.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_o = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            pe.a((byte) -13, (Throwable) ((Object) var1_ref), (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 < -66) {
          field_a = null;
          field_b = null;
          field_g = null;
          return;
        }
        cb.a((byte) -75);
        field_a = null;
        field_b = null;
        field_g = null;
    }

    cb(java.net.Socket param0, be param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_d) {
            return;
          }
          if (this.field_o) {
            this.field_o = false;
            throw new IOException();
          }
          if (null == this.field_c) {
            this.field_c = new byte[this.field_p];
          }
          var5 = this;
          synchronized (var5) {
            if (param0 != 30) {
              this.field_m = (InputStream) null;
            }
            for (var6 = 0; param3 > var6; var6++) {
              this.field_c[this.field_l] = param1[param2 + var6];
              this.field_l = (1 + this.field_l) % this.field_p;
              if ((-100 + this.field_h + this.field_p) % this.field_p == this.field_l) {
                throw new IOException();
              }
            }
            if (this.field_f == null) {
              this.field_f = this.field_k.a(314572800, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(byte param0) throws IOException {
        if (this.field_d) {
          return 0;
        }
        if (param0 == 101) {
          return this.field_m.available();
        }
        java.awt.Component var3 = (java.awt.Component) null;
        cb.a(45, (java.awt.Component) null);
        return this.field_m.available();
    }

    final void b(int param0) throws IOException {
        if (param0 >= -54) {
          this.a(62);
          if (this.field_d) {
            return;
          }
          if (!this.field_o) {
            return;
          }
          this.field_o = false;
          throw new IOException();
        }
        if (this.field_d) {
          return;
        }
        if (!this.field_o) {
          return;
        }
        this.field_o = false;
        throw new IOException();
    }

    final int a(boolean param0) throws IOException {
        if (!param0) {
          this.field_h = 44;
          if (!this.field_d) {
            return this.field_m.read();
          }
          return 0;
        }
        if (!this.field_d) {
          return this.field_m.read();
        }
        return 0;
    }

    protected final void finalize() {
        this.a(1);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_d) {
            return;
          }
          var5_int = -79 / ((23 - param2) / 35);
          while (param1 > 0) {
            var6 = this.field_m.read(param3, param0, param1);
            if (var6 <= 0) {
              throw new EOFException();
            }
            param1 = param1 - var6;
            param0 = param0 + var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("cb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private cb(java.net.Socket param0, be param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_l = 0;
        this.field_o = false;
        this.field_d = false;
        try {
          this.field_k = param1;
          this.field_n = param0;
          this.field_n.setSoTimeout(30000);
          this.field_n.setTcpNoDelay(true);
          this.field_m = this.field_n.getInputStream();
          this.field_i = this.field_n.getOutputStream();
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Achieved";
        field_b = new im();
    }
}
