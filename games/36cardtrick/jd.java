/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd implements Runnable {
    private vi field_d;
    private java.net.Socket field_k;
    private OutputStream field_e;
    private int field_i;
    static ib[] field_c;
    private InputStream field_l;
    private boolean field_f;
    private byte[] field_j;
    private le field_h;
    static int field_g;
    private boolean field_m;
    private int field_a;
    private int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 23) {
          field_g = -6;
        }
    }

    final void a(boolean param0) {
        try {
          int var4 = 0;
          var4 = Main.field_T;
          if (this.field_f) {
            return;
          }
          synchronized (this) {
            this.field_f = param0 ? true : false;
            this.notifyAll();
          }
          if (this.field_d != null) {
            while (this.field_d.field_a == 0) {
              wk.a((byte) -104, 1L);
            }
            if (this.field_d.field_a == 1) {
              try {
                ((Thread) (this.field_d.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Main.field_T;
        try {
          if (param1 != -89) {
            return;
          }
          if (this.field_f) {
            return;
          }
          if (this.field_m) {
            this.field_m = false;
            throw new IOException();
          }
          if (this.field_j == null) {
            this.field_j = new byte[this.field_a];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param2; var6++) {
              this.field_j[this.field_b] = param3[param0 + var6];
              this.field_b = (this.field_b + 1) % this.field_a;
              if (this.field_b == (this.field_a + this.field_i - 100) % this.field_a) {
                throw new IOException();
              }
            }
            if (this.field_d == null) {
              this.field_d = this.field_h.a(0, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("jd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
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
          var6 = Main.field_T;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_b == this.field_i) {
                  if (this.field_f) {
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
                  var2 = this.field_i;
                  if (this.field_i <= this.field_b) {
                    var1_int = -this.field_i + this.field_b;
                  } else {
                    var1_int = this.field_a - this.field_i;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_l) {
                    this.field_l.close();
                  }
                  if (this.field_e != null) {
                    this.field_e.close();
                  }
                  if (null != this.field_k) {
                    this.field_k.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_j = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_e.write(this.field_j, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_m = true;
              }
              this.field_i = (var1_int + this.field_i) % this.field_a;
              try {
                if (this.field_i == this.field_b) {
                  this.field_e.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_m = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            k.a((Throwable) ((Object) var1_ref), (byte) -103, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        this.a(true);
    }

    final void b(byte param0) throws IOException {
        if (this.field_f) {
          return;
        }
        if (this.field_m) {
          this.field_m = false;
          throw new IOException();
        }
        if (param0 != -44) {
          this.field_a = -32;
        }
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Main.field_T;
        try {
          if (param0 != 66) {
            this.finalize();
          }
          if (this.field_f) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.field_l.read(param1, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param3 = param3 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        if (param0 != 0) {
          return -63;
        }
        return this.field_l.read();
    }

    jd(java.net.Socket param0, le param1) throws IOException {
        this(param0, param1, 5000);
    }

    private jd(java.net.Socket param0, le param1, int param2) throws IOException {
        this.field_f = false;
        this.field_m = false;
        this.field_b = 0;
        this.field_i = 0;
        try {
          this.field_k = param0;
          this.field_h = param1;
          this.field_k.setSoTimeout(30000);
          this.field_k.setTcpNoDelay(true);
          this.field_l = this.field_k.getInputStream();
          this.field_e = this.field_k.getOutputStream();
          this.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0) throws IOException {
        if (this.field_f) {
          return 0;
        }
        int var2 = 59 / ((80 - param0) / 45);
        return this.field_l.available();
    }

    static {
        field_c = new ib[16];
        field_g = 20;
    }
}
