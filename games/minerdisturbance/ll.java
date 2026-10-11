/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll implements Runnable {
    private InputStream field_i;
    private int field_g;
    private int field_m;
    static int field_h;
    private OutputStream field_o;
    private ia field_b;
    private byte[] field_c;
    static String field_e;
    private boolean field_l;
    private java.net.Socket field_j;
    private vf field_n;
    static hm field_a;
    private boolean field_f;
    static int field_d;
    private int field_k;

    protected final void finalize() {
        this.b(120);
    }

    ll(java.net.Socket param0, vf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_f) {
            this.field_f = false;
            throw new IOException();
          }
          if (param0 < 92) {
            return;
          }
          if (null == this.field_c) {
            this.field_c = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param2 > var6; var6++) {
              this.field_c[this.field_m] = param1[var6 + param3];
              this.field_m = (this.field_m + 1) % this.field_g;
              if (this.field_m == (this.field_k + this.field_g - 100) % this.field_g) {
                throw new IOException();
              }
            }
            if (null == this.field_b) {
              this.field_b = this.field_n.a((Runnable) (this), (byte) 44, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("ll.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = MinerDisturbance.field_ab;
          if (this.field_l) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.field_l = true;
            if (param0 < 84) {
              ll.a((byte) 104, -28);
            }
            this.notifyAll();
          }
          if (this.field_b != null) {
            while (this.field_b.field_c == 0) {
              gf.a(1L, -10309);
            }
            if (this.field_b.field_c == 1) {
              try {
                ((Thread) (this.field_b.field_a)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
                this.field_b = null;
                return;
              }
            }
          }
          this.field_b = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          var6 = MinerDisturbance.field_ab;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_m == this.field_k) {
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
                  if (this.field_m < this.field_k) {
                    var1_int = -this.field_k + this.field_g;
                  } else {
                    var1_int = this.field_m - this.field_k;
                  }
                  var2 = this.field_k;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_i) {
                    this.field_i.close();
                  }
                  if (null != this.field_o) {
                    this.field_o.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
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
                this.field_o.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_f = true;
              }
              this.field_k = (this.field_k + var1_int) % this.field_g;
              try {
                if (this.field_m == this.field_k) {
                  this.field_o.flush();
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
            di.a((Throwable) ((Object) var1_ref), 1, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -73) {
          ll.a((byte) -58, -86);
          return ke.a(param1, -21937, sb.field_t);
        }
        return ke.a(param1, -21937, sb.field_t);
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 > -46) {
          field_a = (hm) null;
        }
        if (null == lb.field_y) {
          return;
        }
        var1 = lb.field_y;
        synchronized (var1) {
          lb.field_y = null;
        }
        return;
    }

    final int c(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 0) {
          return -37;
        }
        return this.field_i.available();
    }

    public static void b(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 == -121) {
          return;
        }
        ll.a(-77);
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if (this.field_l) {
            return;
          }
          while (param3 > 0) {
            var5_int = this.field_i.read(param1, param2, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 + var5_int;
            param3 = param3 - var5_int;
          }
          if (!param0) {
            return;
          }
          field_a = (hm) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ll.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) throws IOException {
        if (param0) {
          this.field_k = -72;
          if (!this.field_l) {
            return this.field_i.read();
          }
          return 0;
        }
        if (!this.field_l) {
          return this.field_i.read();
        }
        return 0;
    }

    final void a(byte param0) throws IOException {
        if (this.field_l) {
          return;
        }
        int var2 = -54 / ((param0 - 65) / 38);
        if (!this.field_f) {
          return;
        }
        this.field_f = false;
        throw new IOException();
    }

    private ll(java.net.Socket param0, vf param1, int param2) throws IOException {
        this.field_l = false;
        this.field_f = false;
        this.field_m = 0;
        this.field_k = 0;
        try {
          this.field_j = param0;
          this.field_n = param1;
          this.field_j.setSoTimeout(30000);
          this.field_j.setTcpNoDelay(true);
          this.field_i = this.field_j.getInputStream();
          this.field_o = this.field_j.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ll.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
        field_e = "Loading...";
    }
}
