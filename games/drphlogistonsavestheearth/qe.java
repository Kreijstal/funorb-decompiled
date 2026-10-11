/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qe implements Runnable {
    private java.net.Socket field_j;
    static m field_e;
    private InputStream field_q;
    private il field_m;
    private int field_f;
    static int field_c;
    static he field_k;
    private boolean field_n;
    private OutputStream field_b;
    private boolean field_i;
    private bl field_h;
    private int field_d;
    private int field_p;
    private byte[] field_o;
    static java.awt.Color field_g;
    static int field_a;
    static int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_n) {
            return;
          }
          if (param0 != -14) {
            this.field_h = (bl) null;
          }
          while (param3 > 0) {
            var5_int = this.field_q.read(param1, param2, param3);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param2 = param2 + var5_int;
            param3 = param3 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qe.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) throws IOException {
        if (this.field_n) {
          return;
        }
        if (param0 != -13) {
          field_k = (he) null;
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          return;
        }
        if (this.field_i) {
          this.field_i = false;
          throw new IOException();
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_e = null;
        field_k = null;
        if (param0 == 0) {
          return;
        }
        qe.c(44);
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
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_f == this.field_p) {
                  if (this.field_n) {
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
                  if (this.field_p < this.field_f) {
                    var1_int = this.field_d - this.field_f;
                  } else {
                    var1_int = -this.field_f + this.field_p;
                  }
                  var2 = this.field_f;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_q) {
                    this.field_q.close();
                  }
                  if (this.field_b != null) {
                    this.field_b.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_o = null;
                break;
              }
              if (0 >= var1_int) {
                continue;
              }
              try {
                this.field_b.write(this.field_o, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
              this.field_f = (this.field_f + var1_int) % this.field_d;
              try {
                if (this.field_f == this.field_p) {
                  this.field_b.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            gb.a((Throwable) ((Object) var1_ref), (String) null, 10);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (this.field_n) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            this.field_n = true;
            this.notifyAll();
          }
          if (this.field_m != null) {
            while (this.field_m.field_b == 0) {
              kk.a(1L, true);
            }
            if (this.field_m.field_b == 1) {
              try {
                ((Thread) (this.field_m.field_g)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
              }
            }
          }
          this.field_m = null;
          if (param0 == 50) {
            return;
          }
          this.run();
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) throws IOException {
        int var2 = -86 / ((param0 + 63) / 49);
        if (this.field_n) {
          return 0;
        }
        return this.field_q.available();
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
        nh[] var9 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_n) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          if (this.field_o == null) {
            this.field_o = new byte[this.field_d];
          }
          if (param1 != -30537) {
            var9 = (nh[]) null;
            qe.a(-98, -28, (nh[]) null, (byte) 55);
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_o[this.field_p] = param2[param3 + var6];
              this.field_p = (this.field_p + 1) % this.field_d;
              if (this.field_p == (-100 + (this.field_d + this.field_f)) % this.field_d) {
                throw new IOException();
              }
            }
            if (this.field_m == null) {
              this.field_m = this.field_h.a((Runnable) (this), 3, (byte) -126);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("qe.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, nh[] param2, byte param3) {
        try {
          ia.field_a = new gk(param2);
          if (param3 > -65) {
            qe.c(-58);
          }
          ch.field_B = param1;
          lg.field_i = param0;
          h.a(true);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    qe(java.net.Socket param0, bl param1) throws IOException {
        this(param0, param1, 5000);
    }

    protected final void finalize() {
        this.b(50);
    }

    final int a(int param0) throws IOException {
        if (param0 >= -119) {
          this.b(18);
          if (!this.field_n) {
            return this.field_q.read();
          }
          return 0;
        }
        if (!this.field_n) {
          return this.field_q.read();
        }
        return 0;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 > param1) {
            var3_int = param1;
            param1 = param2;
            param2 = var3_int;
          }
          if (param0 != 26) {
            qe.c(-113);
          }
          while (0 != param2) {
            var3_intLifetime1 = param1 % param2;
            param1 = param2;
            param2 = var3_intLifetime1;
          }
          stackIn_8_0 = param1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "qe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private qe(java.net.Socket param0, bl param1, int param2) throws IOException {
        this.field_f = 0;
        this.field_n = false;
        this.field_i = false;
        this.field_p = 0;
        try {
          this.field_j = param0;
          this.field_h = param1;
          this.field_j.setSoTimeout(30000);
          this.field_j.setTcpNoDelay(true);
          this.field_q = this.field_j.getInputStream();
          this.field_b = this.field_j.getOutputStream();
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = 50;
        field_g = new java.awt.Color(10040319);
        field_l = 480;
        field_a = -150;
    }
}
