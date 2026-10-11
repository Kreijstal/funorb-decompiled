/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jqa implements Runnable {
    private boolean field_a;
    private int field_k;
    private int field_d;
    private java.net.Socket field_e;
    static jea field_b;
    private InputStream field_h;
    private fia field_i;
    private OutputStream field_l;
    private byte[] field_c;
    static int field_g;
    private boolean field_f;
    private naa field_j;
    private int field_m;

    protected final void finalize() {
        this.a((byte) 105);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -64) {
          field_g = 33;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_a) {
            return;
          }
          if (this.field_f) {
            this.field_f = false;
            throw new IOException();
          }
          if (this.field_c == null) {
            this.field_c = new byte[this.field_d];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; var6 < param2; var6++) {
              this.field_c[this.field_m] = param0[var6 + param1];
              this.field_m = (1 + this.field_m) % this.field_d;
              if (~this.field_m == ~((this.field_d + this.field_k - 100) % this.field_d)) {
                throw new IOException();
              }
            }
            if (this.field_j == null) {
              this.field_j = this.field_i.a((Runnable) (this), 425, 3);
            }
            this.notifyAll();
          }
          if (param3 < 99) {
            this.field_k = 121;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_29_0 = var5_ref;
          stackIn_29_1 = new StringBuilder().append("jqa.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(int param0) throws IOException {
        if (this.field_a) {
          return 0;
        }
        if (param0 != -2147483648) {
          Random var3 = (Random) null;
          jqa.a(-72, (Random) null, -100);
        }
        return this.field_h.read();
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (!pda.a(param9, param4, param6, 256, param7, param3, param0, param8, param2)) {
          return 0;
        }
        if (param1 != 1) {
          field_b = (jea) null;
        }
        int var10 = ova.a(param7, param8, true, param9, param6);
        int var11 = ova.a(param4, param3, true, param0, param2);
        if (param5 > 0) {
          var10 = var10 + (1 << param5 - 1);
          var11 = var11 + (1 << -1 + param5);
        }
        return (var10 >> param5) * (var11 >> param5);
    }

    jqa(java.net.Socket param0, fia param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void b(int param0) throws IOException {
        if (this.field_a) {
          return;
        }
        if (this.field_f) {
          this.field_f = false;
          throw new IOException();
        }
        if (param0 < 79) {
          this.a((byte) 122);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_a) {
            return;
          }
          if (param0 != 0) {
            return;
          }
          while (param3 > 0) {
            var5_int = this.field_h.read(param2, param1, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 - var5_int;
            param1 = param1 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jqa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0) throws IOException {
        if (this.field_a) {
          return 0;
        }
        if (param0 != 0) {
          this.a((byte) 47);
        }
        return this.field_h.available();
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
          var6 = TombRacer.field_G ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_m == this.field_k) {
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
                  var2 = this.field_k;
                  if (this.field_k > this.field_m) {
                    var1_int = this.field_d - this.field_k;
                  } else {
                    var1_int = -this.field_k + this.field_m;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_h) {
                    this.field_h.close();
                  }
                  if (this.field_l != null) {
                    this.field_l.close();
                  }
                  if (null != this.field_e) {
                    this.field_e.close();
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
                this.field_l.write(this.field_c, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_f = true;
              }
              this.field_k = (this.field_k + var1_int) % this.field_d;
              try {
                if (this.field_m == this.field_k) {
                  this.field_l.flush();
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
            ssa.a((String) null, (byte) 122, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          var3_int = -43 % ((param2 + 14) / 57);
          if (cla.a(9181, param0)) {
            stackIn_6_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param0 >> 32);
            return stackIn_6_0;
          }
          var4 = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var5 = param1.nextInt();
          } while (var4 <= var5);
          stackIn_11_0 = oea.a(var5, param0, -127);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("jqa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          int var4 = 0;
          var4 = TombRacer.field_G ? 1 : 0;
          if (this.field_a) {
            return;
          }
          synchronized (this) {
            this.field_a = true;
            this.notifyAll();
          }
          if (this.field_j != null) {
            while (this.field_j.field_b == 0) {
              vja.a(0, 1L);
            }
            if (1 == this.field_j.field_b) {
              try {
                ((Thread) (this.field_j.field_f)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          if (param0 != 105) {
            this.field_c = (byte[]) null;
          }
          this.field_j = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private jqa(java.net.Socket param0, fia param1, int param2) throws IOException {
        this.field_k = 0;
        this.field_a = false;
        this.field_f = false;
        this.field_m = 0;
        try {
          this.field_i = param1;
          this.field_e = param0;
          this.field_e.setSoTimeout(30000);
          this.field_e.setTcpNoDelay(true);
          this.field_h = this.field_e.getInputStream();
          this.field_l = this.field_e.getOutputStream();
          this.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
