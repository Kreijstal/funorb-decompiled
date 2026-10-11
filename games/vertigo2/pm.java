/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pm implements Runnable {
    static boolean field_a;
    private wk field_e;
    private java.net.Socket field_g;
    static boolean field_d;
    private int field_h;
    private int field_i;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_j;
    private boolean field_c;
    private boolean field_b;
    private InputStream field_m;
    private jj field_k;

    final int a(int param0) throws IOException {
        if (param0 != 15166) {
          this.field_h = -24;
        }
        if (this.field_c) {
          return 0;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.b(0);
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
          var6 = Vertigo2.field_L ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_l) {
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
                  if (this.field_i >= this.field_l) {
                    var1_int = this.field_i - this.field_l;
                  } else {
                    var1_int = -this.field_l + this.field_h;
                  }
                  var2 = this.field_l;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_m != null) {
                    this.field_m.close();
                  }
                  if (this.field_f != null) {
                    this.field_f.close();
                  }
                  if (this.field_g != null) {
                    this.field_g.close();
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
                this.field_f.write(this.field_j, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_b = true;
              }
              this.field_l = (this.field_l + var1_int) % this.field_h;
              try {
                if (this.field_i == this.field_l) {
                  this.field_f.flush();
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
            ke.a((Throwable) ((Object) var1_ref), (String) null, 0);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
          int var4 = 0;
          var4 = Vertigo2.field_L ? 1 : 0;
          if (this.field_c) {
            return;
          }
          if (param0 != 0) {
            pm.a(79, 67);
          }
          synchronized (this) {
            this.field_c = true;
            this.notifyAll();
          }
          if (this.field_e != null) {
            while (this.field_e.field_b == 0) {
              um.a(true, 1L);
            }
            if (this.field_e.field_b == 1) {
              try {
                ((Thread) (this.field_e.field_d)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_e = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_c) {
            return;
          }
          while (0 < param2) {
            var5_int = this.field_m.read(param0, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 + var5_int;
            param2 = param2 - var5_int;
          }
          if (param1) {
            this.field_k = (jj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pm.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0) throws IOException {
        if (param0 != -26206) {
          this.run();
        }
        if (this.field_c) {
          return;
        }
        if (this.field_b) {
          this.field_b = false;
          throw new IOException();
        }
    }

    final static void a(byte param0, boolean param1) {
        ak.a(false, param1, 3);
        if (param0 != 52) {
          pm.a(-23, -49);
        }
    }

    pm(java.net.Socket param0, jj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(byte param0) throws IOException {
        int var2 = 29 / ((42 - param0) / 42);
        if (this.field_c) {
          return 0;
        }
        return this.field_m.read();
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_c) {
            return;
          }
          if (this.field_b) {
            this.field_b = false;
            throw new IOException();
          }
          if (null == this.field_j) {
            this.field_j = new byte[this.field_h];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param1; var6++) {
              this.field_j[this.field_i] = param3[var6 + param0];
              this.field_i = (1 + this.field_i) % this.field_h;
              if ((this.field_h + this.field_l - 100) % this.field_h == this.field_i) {
                throw new IOException();
              }
            }
            var7 = -118 / ((param2 + 29) / 52);
            if (this.field_e == null) {
              this.field_e = this.field_k.a(3, (Runnable) (this), 0);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("pm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static r a(int param0, int param1) {
        if (param1 <= 122) {
          field_d = true;
        }
        return vo.a(false, 126, 1, param0, false, true);
    }

    private pm(java.net.Socket param0, jj param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_i = 0;
        this.field_c = false;
        this.field_b = false;
        try {
          this.field_k = param1;
          this.field_g = param0;
          this.field_g.setSoTimeout(30000);
          this.field_g.setTcpNoDelay(true);
          this.field_m = this.field_g.getInputStream();
          this.field_f = this.field_g.getOutputStream();
          this.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = false;
    }
}
