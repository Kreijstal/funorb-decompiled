/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lpb implements Runnable {
    private int field_i;
    private eab field_e;
    private int field_k;
    private boolean field_f;
    private mob field_g;
    private OutputStream field_j;
    private boolean field_c;
    private byte[] field_a;
    private java.net.Socket field_h;
    private InputStream field_b;
    private int field_d;

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = VoidHunters.field_G;
          if (this.field_c) {
            return;
          }
          if (param0 != 1) {
            return;
          }
          synchronized (this) {
            this.field_c = true;
            this.notifyAll();
          }
          if (this.field_g != null) {
            while (this.field_g.field_f == 0) {
              gdb.b(-94, 1L);
            }
            if (this.field_g.field_f == 1) {
              try {
                ((Thread) (this.field_g.field_d)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 >= -121) {
            this.field_k = 66;
          }
          if (this.field_c) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.field_b.read(param3, param1, param2);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param2 = param2 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("lpb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
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
          var6 = VoidHunters.field_G;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_d) {
                  if (this.field_c) {
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
                  var2 = this.field_d;
                  if (this.field_i >= this.field_d) {
                    var1_int = -this.field_d + this.field_i;
                  } else {
                    var1_int = this.field_k - this.field_d;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                  if (null != this.field_j) {
                    this.field_j.close();
                  }
                  if (this.field_h != null) {
                    this.field_h.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_a = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_j.write(this.field_a, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_f = true;
              }
              this.field_d = (var1_int + this.field_d) % this.field_k;
              try {
                if (this.field_i == this.field_d) {
                  this.field_j.flush();
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
            gna.a((Throwable) ((Object) var1_ref), (String) null, 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) throws IOException {
        if (param0 >= -34) {
          byte[] var3 = (byte[]) null;
          lpb.a((byte) -34, (byte[]) null);
        }
        if (this.field_c) {
          return 0;
        }
        return this.field_b.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (this.field_c) {
            return;
          }
          if (this.field_f) {
            this.field_f = false;
            throw new IOException();
          }
          if (this.field_a == null) {
            this.field_a = new byte[this.field_k];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = param0; var6 < param2; var6++) {
              this.field_a[this.field_i] = param1[var6 + param3];
              this.field_i = (this.field_i + 1) % this.field_k;
              if (this.field_i == (-100 + (this.field_k + this.field_d)) % this.field_k) {
                throw new IOException();
              }
            }
            if (null == this.field_g) {
              this.field_g = this.field_e.a(0, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("lpb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ngb a(byte param0, byte[] param1) {
        ngb var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        ngb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 != 19) {
            var3 = (byte[]) null;
            lpb.a((byte) -54, (byte[]) null);
          }
          var2 = new ngb(param1, iib.field_e, so.field_f, nhb.field_o, hla.field_a, rlb.field_d, sh.field_a);
          qqb.a(39);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("lpb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int c(int param0) throws IOException {
        if (this.field_c) {
          return 0;
        }
        if (param0 != 0) {
          return 45;
        }
        return this.field_b.available();
    }

    final void a(byte param0) throws IOException {
        if (this.field_c) {
          return;
        }
        if (this.field_f) {
          this.field_f = false;
          throw new IOException();
        }
        if (param0 <= 101) {
          this.finalize();
        }
    }

    protected final void finalize() {
        this.b(1);
    }

    lpb(java.net.Socket param0, eab param1) throws IOException {
        this(param0, param1, 5000);
    }

    private lpb(java.net.Socket param0, eab param1, int param2) throws IOException {
        this.field_f = false;
        this.field_c = false;
        this.field_i = 0;
        this.field_d = 0;
        try {
          this.field_e = param1;
          this.field_h = param0;
          this.field_h.setSoTimeout(30000);
          this.field_h.setTcpNoDelay(true);
          this.field_b = this.field_h.getInputStream();
          this.field_j = this.field_h.getOutputStream();
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lpb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
