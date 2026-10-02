/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba implements Runnable {
    private int field_k;
    static int[] field_h;
    private cb field_m;
    private int field_e;
    private int field_b;
    private byte[] field_d;
    static int field_c;
    private InputStream field_g;
    private boolean field_f;
    private OutputStream field_a;
    private java.net.Socket field_j;
    private d field_l;
    private boolean field_i;

    protected final void finalize() {
        this.b(-124);
    }

    final void b(int param0) {
        try {
            InterruptedException var2 = null;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            if (param0 >= -117) {
              this.run();
            }
            if (this.field_f) {
              return;
            }
            {
              var2_ref = this;
              synchronized (var2_ref) {
                this.field_f = true;
                this.notifyAll();
              }
              if (this.field_m != null) {
                L2: while (0 == this.field_m.field_a) {
                  bc.a(0, 1L);
                }
                if (1 == this.field_m.field_a) {
                  try {
                    ((Thread) (this.field_m.field_b)).join();
                  } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                  }
                }
              }
              this.field_m = null;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) throws IOException {
        if (!(!this.field_f)) {
            return;
        }
        if (param0 >= -79) {
            return;
        }
        if (!this.field_i) {
            return;
        }
        this.field_i = false;
        throw new IOException();
    }

    final int a(byte param0) throws IOException {
        if (param0 <= 71) {
            this.field_g = (InputStream) null;
            if (!this.field_f) {
                return this.field_g.available();
            }
            return 0;
        }
        if (!this.field_f) {
            return this.field_g.available();
        }
        return 0;
    }

    final static cj a(int param0) {
        if (param0 != 5000) {
            ba.e(-113);
            return (cj) ((Object) new cm());
        }
        return (cj) ((Object) new cm());
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != -97) {
            return;
          }
          if (this.field_f) {
            return;
          }
          L0: while (param3 > 0) {
            var5_int = this.field_g.read(param0, param2, param3);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param3 = param3 - var5_int;
            param2 = param2 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("ba.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
        try {
          if (this.field_f) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          {
            if (null == this.field_d) {
              this.field_d = new byte[this.field_b];
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                for (var6 = 0; param2 > var6; var6++) {
                  this.field_d[this.field_e] = param3[param1 + var6];
                  this.field_e = (this.field_e + 1) % this.field_b;
                  if (this.field_e == (this.field_b + (this.field_k - 100)) % this.field_b) {
                    throw new IOException();
                  }
                }
                if (param0 != 100) {
                  this.field_a = (OutputStream) null;
                }
                if (null == this.field_m) {
                  this.field_m = this.field_l.a((Runnable) (this), 0, 3);
                }
                this.notifyAll();
                break L1;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = (RuntimeException) (var5_ref);
          stackIn_26_1 = new StringBuilder().append("ba.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int c(int param0) throws IOException {
        if (!(!this.field_f)) {
            return 0;
        }
        if (param0 != -17422) {
            return -104;
        }
        return this.field_g.read();
    }

    public static void e(int param0) {
        if (param0 != 21888) {
            return;
        }
        field_h = null;
    }

    ba(java.net.Socket param0, d param1) throws IOException {
        this(param0, param1, 5000);
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var3 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            String var6 = null;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      if (this.field_k == this.field_e) {
                        if (this.field_f) {
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                        try {
                          this.wait();
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var4 = (InterruptedException) (Object) decompiledCaughtException;
                        }
                      }
                      var2 = this.field_k;
                      if (this.field_e < this.field_k) {
                        var1_int = this.field_b - this.field_k;
                      } else {
                        var1_int = this.field_e - this.field_k;
                      }
                      decompiledRegionSelector0 = 1;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      if (this.field_g != null) {
                        this.field_g.close();
                      }
                      if (this.field_a != null) {
                        this.field_a.close();
                      }
                      if (this.field_j != null) {
                        this.field_j.close();
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var1 = (IOException) (Object) decompiledCaughtException;
                    }
                    this.field_d = null;
                    break L0;
                  }
                  if (var1_int <= 0) {
                    continue L1;
                  }
                  try {
                    this.field_a.write(this.field_d, var2, var1_int);
                  } catch (java.io.IOException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                    this.field_i = true;
                  }
                  this.field_k = (var1_int + this.field_k) % this.field_b;
                  try {
                    if (this.field_e == this.field_k) {
                      this.field_a.flush();
                    }
                  } catch (java.io.IOException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                    this.field_i = true;
                  }
                  continue L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              gi.a((Throwable) ((Object) var1_ref), (String) null, (byte) 125);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            if (param0 != 116) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                ba.a((byte) 45, (java.applet.Applet) null);
            }
            va.a("", param1, -1);
            h.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ba.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ba(java.net.Socket param0, d param1, int param2) throws IOException {
        this.field_f = false;
        this.field_e = 0;
        this.field_k = 0;
        this.field_i = false;
        try {
            this.field_l = param1;
            this.field_j = param0;
            this.field_j.setSoTimeout(30000);
            this.field_j.setTcpNoDelay(true);
            this.field_g = this.field_j.getInputStream();
            this.field_a = this.field_j.getOutputStream();
            this.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_h = new int[8192];
        field_c = 0;
    }
}
