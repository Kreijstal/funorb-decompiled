/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mo implements Runnable {
    static int field_k;
    static String field_i;
    private OutputStream field_j;
    private ei field_m;
    private cb field_e;
    private int field_n;
    private int field_l;
    private boolean field_a;
    private byte[] field_d;
    static String field_b;
    private java.net.Socket field_h;
    private InputStream field_f;
    private boolean field_g;
    private int field_c;

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
          var6 = Pixelate.field_H ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_n == this.field_c) {
                  if (this.field_a) {
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
                  var2 = this.field_n;
                  if (this.field_n > this.field_c) {
                    var1_int = -this.field_n + this.field_l;
                  } else {
                    var1_int = -this.field_n + this.field_c;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_f) {
                    this.field_f.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_h != null) {
                    this.field_h.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_d = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_j.write(this.field_d, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_g = true;
              }
              this.field_n = (this.field_n + var1_int) % this.field_l;
              try {
                if (this.field_c == this.field_n) {
                  this.field_j.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_g = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            jo.a(1, (String) null, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    mo(java.net.Socket param0, cb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int c(byte param0) throws IOException {
        if (param0 != -81) {
          this.field_g = false;
        }
        if (this.field_a) {
          return 0;
        }
        return this.field_f.read();
    }

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = Pixelate.field_H ? 1 : 0;
          if (this.field_a) {
            return;
          }
          synchronized (this) {
            this.field_a = true;
            this.notifyAll();
          }
          if (param0 != -1) {
            return;
          }
          if (null != this.field_m) {
            while (this.field_m.field_b == 0) {
              vg.a(1L, (byte) 23);
            }
            if (this.field_m.field_b == 1) {
              try {
                ((Thread) (this.field_m.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_m = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_a) {
            return;
          }
          if (this.field_g) {
            this.field_g = false;
            throw new IOException();
          }
          if (null == this.field_d) {
            this.field_d = new byte[this.field_l];
          }
          var5 = this;
          synchronized (var5) {
            if (param1 >= -72) {
              return;
            }
            for (var6 = 0; var6 < param0; var6++) {
              this.field_d[this.field_c] = param3[param2 + var6];
              this.field_c = (this.field_c + 1) % this.field_l;
              if ((this.field_l + this.field_n - 100) % this.field_l == this.field_c) {
                throw new IOException();
              }
            }
            if (null == this.field_m) {
              this.field_m = this.field_e.a(3, (Runnable) (this), (byte) -123);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("mo.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int a(int param0) throws IOException {
        if (param0 >= -68) {
          field_b = (String) null;
        }
        if (this.field_a) {
          return 0;
        }
        return this.field_f.available();
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != 119) {
            this.finalize();
          }
          if (this.field_a) {
            return;
          }
          while (param3 > 0) {
            var5_int = this.field_f.read(param0, param1, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param3 = param3 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mo.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) throws IOException {
        int var2 = -74 % ((36 - param0) / 56);
        if (this.field_a) {
          return;
        }
        if (this.field_g) {
          this.field_g = false;
          throw new IOException();
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        if (param0 > -55) {
          mo.a((byte) 57);
        }
    }

    protected final void finalize() {
        this.b(-1);
    }

    private mo(java.net.Socket param0, cb param1, int param2) throws IOException {
        this.field_n = 0;
        this.field_a = false;
        this.field_c = 0;
        this.field_g = false;
        try {
          this.field_h = param0;
          this.field_e = param1;
          this.field_h.setSoTimeout(30000);
          this.field_h.setTcpNoDelay(true);
          this.field_f = this.field_h.getInputStream();
          this.field_j = this.field_h.getOutputStream();
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "<%0> is already on your friend list.";
        field_i = "Player Name: ";
    }
}
