/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dt implements Runnable {
    static ri field_n;
    private byte[] field_e;
    static jr field_p;
    private int field_c;
    private int field_j;
    private boolean field_b;
    private boolean field_l;
    private OutputStream field_k;
    static String[] field_i;
    static String field_h;
    private wi field_g;
    private int field_a;
    static boolean field_f;
    private java.net.Socket field_m;
    private jr field_o;
    private InputStream field_d;

    final int a(int param0) throws IOException {
        if (param0 >= -84) {
          this.field_e = (byte[]) null;
        }
        if (this.field_l) {
          return 0;
        }
        return this.field_d.read();
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
          var6 = Sumoblitz.field_L ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a == this.field_c) {
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
                  if (this.field_c > this.field_a) {
                    var1_int = -this.field_c + this.field_j;
                  } else {
                    var1_int = -this.field_c + this.field_a;
                  }
                  var2 = this.field_c;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                  if (null != this.field_k) {
                    this.field_k.close();
                  }
                  if (this.field_m != null) {
                    this.field_m.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_e = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_k.write(this.field_e, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_b = true;
              }
              this.field_c = (this.field_c + var1_int) % this.field_j;
              try {
                if (this.field_a == this.field_c) {
                  this.field_k.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_b = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            ms.a((String) null, (Throwable) ((Object) var1_ref), 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) throws IOException {
        if (this.field_l) {
          return;
        }
        int var2 = -72 / ((36 - param0) / 42);
        if (this.field_b) {
          this.field_b = false;
          throw new IOException();
        }
    }

    protected final void finalize() {
        this.a((byte) -97);
    }

    final void a(byte param0) {
        try {
          int var4 = 0;
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (this.field_l) {
            return;
          }
          if (param0 >= -36) {
            this.field_g = (wi) null;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (this.field_o != null) {
            while (this.field_o.field_c == 0) {
              tg.a(1L, (byte) 113);
            }
            if (this.field_o.field_c == 1) {
              try {
                ((Thread) (this.field_o.field_d)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_o = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) throws IOException {
        if (param0 >= -22) {
          return 73;
        }
        if (this.field_l) {
          return 0;
        }
        return this.field_d.available();
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_b) {
            this.field_b = false;
            throw new IOException();
          }
          if (null == this.field_e) {
            this.field_e = new byte[this.field_j];
          }
          var5 = this;
          synchronized (var5) {
            if (param1 != -2) {
              this.field_m = (java.net.Socket) null;
            }
            for (var6 = 0; var6 < param3; var6++) {
              this.field_e[this.field_a] = param2[var6 + param0];
              this.field_a = (this.field_a + 1) % this.field_j;
              if (this.field_a == (-100 + this.field_c + this.field_j) % this.field_j) {
                throw new IOException();
              }
            }
            if (this.field_o == null) {
              this.field_o = this.field_g.a(true, (Runnable) (this), 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("dt.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    dt(java.net.Socket param0, wi param1) throws IOException {
        this(param0, param1, 5000);
    }

    private dt(java.net.Socket param0, wi param1, int param2) throws IOException {
        this.field_c = 0;
        this.field_l = false;
        this.field_b = false;
        this.field_a = 0;
        try {
          this.field_m = param0;
          this.field_g = param1;
          this.field_m.setSoTimeout(30000);
          this.field_m.setTcpNoDelay(true);
          this.field_d = this.field_m.getInputStream();
          this.field_k = this.field_m.getOutputStream();
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "dt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 19) {
          dt.d(-53);
        }
        field_i = null;
        field_h = null;
        field_p = null;
        field_n = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          while (0 < param2) {
            var5_int = this.field_d.read(param3, param1, param2);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param1 = param1 + var5_int;
            param2 = param2 - var5_int;
          }
          if (param0 > -12) {
            this.field_b = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("dt.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_h = "More suggestions";
        field_f = true;
    }
}
