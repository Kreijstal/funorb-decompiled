/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gm implements Runnable {
    private OutputStream field_d;
    private int field_n;
    private int field_g;
    static int field_k;
    static dj field_h;
    private ec field_m;
    static String field_f;
    private byte[] field_e;
    private InputStream field_a;
    private boolean field_b;
    private op field_c;
    private boolean field_i;
    private int field_j;
    private java.net.Socket field_l;

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (this.field_b) {
            return;
          }
          if (this.field_i) {
            this.field_i = false;
            throw new IOException();
          }
          if (null == this.field_e) {
            this.field_e = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            var6 = 0;
            if (!param1) {
              return;
            }
            while (param0 > var6) {
              this.field_e[this.field_n] = param3[param2 + var6];
              this.field_n = (this.field_n + 1) % this.field_g;
              if (this.field_n == (this.field_g + this.field_j - 100) % this.field_g) {
                throw new IOException();
              }
              var6++;
            }
            if (null == this.field_c) {
              this.field_c = this.field_m.a(3, (Runnable) (this), true);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("gm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawn.field_J;
        try {
          if (param3 != 0) {
            this.field_c = (op) null;
          }
          if (this.field_b) {
            return;
          }
          while (param1 > 0) {
            var5_int = this.field_a.read(param2, param0, param1);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 + var5_int;
            param1 = param1 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("gm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(byte param0) throws IOException {
        if (param0 >= -2) {
          gm.b(6);
          if (!this.field_b) {
            return this.field_a.available();
          }
          return 0;
        }
        if (!this.field_b) {
          return this.field_a.available();
        }
        return 0;
    }

    public static void a(byte param0) {
        if (param0 >= 72) {
          field_f = null;
          field_h = null;
          return;
        }
        rc var2 = (rc) null;
        gm.a((rc) null, (byte) -84, 22);
        field_f = null;
        field_h = null;
    }

    final int a(boolean param0) throws IOException {
        if (this.field_b) {
          return 0;
        }
        if (!param0) {
          return this.field_a.read();
        }
        rc var3 = (rc) null;
        gm.a((rc) null, (byte) 8, -92);
        return this.field_a.read();
    }

    protected final void finalize() {
        this.a(-89);
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
          var6 = ZombieDawn.field_J;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_n == this.field_j) {
                  if (this.field_b) {
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
                  if (this.field_n < this.field_j) {
                    var1_int = -this.field_j + this.field_g;
                  } else {
                    var1_int = this.field_n - this.field_j;
                  }
                  var2 = this.field_j;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_a != null) {
                    this.field_a.close();
                  }
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                  if (this.field_l != null) {
                    this.field_l.close();
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
                this.field_d.write(this.field_e, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_i = true;
              }
              this.field_j = (var1_int + this.field_j) % this.field_g;
              try {
                if (this.field_n == this.field_j) {
                  this.field_d.flush();
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
            ae.a((Throwable) ((Object) var1_ref), 10331, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        hf.field_I = 0;
        if (param0 == -23148) {
          return;
        }
        field_k = -44;
    }

    final static void a(rc param0, byte param1, int param2) {
        if (param1 < 109) {
          return;
        }
        try {
          hk.field_F.a(0, param0);
          rm.a((byte) -92, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "gm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        try {
          int var2 = 0;
          InterruptedException var2_ref_InterruptedException = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref_Object = null;
          var4 = ZombieDawn.field_J;
          if (this.field_b) {
            return;
          }
          var2_ref_Object = this;
          synchronized (var2_ref_Object) {
            this.field_b = true;
            this.notifyAll();
          }
          if (this.field_c != null) {
            while (this.field_c.field_f == 0) {
              ld.a(1L, (byte) 89);
            }
            if (this.field_c.field_f == 1) {
              try {
                ((Thread) (this.field_c.field_d)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref_InterruptedException = (InterruptedException) (Object) decompiledCaughtException;
                this.field_c = null;
                var2 = 38 / ((-7 - param0) / 45);
                return;
              }
            }
          }
          this.field_c = null;
          var2 = 38 / ((-7 - param0) / 45);
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 != 85) {
          this.finalize();
          if (this.field_b) {
            return;
          }
          if (!this.field_i) {
            return;
          }
          this.field_i = false;
          throw new IOException();
        }
        if (this.field_b) {
          return;
        }
        if (!this.field_i) {
          return;
        }
        this.field_i = false;
        throw new IOException();
    }

    gm(java.net.Socket param0, ec param1) throws IOException {
        this(param0, param1, 5000);
    }

    private gm(java.net.Socket param0, ec param1, int param2) throws IOException {
        this.field_n = 0;
        this.field_b = false;
        this.field_j = 0;
        this.field_i = false;
        try {
          this.field_m = param1;
          this.field_l = param0;
          this.field_l.setSoTimeout(30000);
          this.field_l.setTcpNoDelay(true);
          this.field_a = this.field_l.getInputStream();
          this.field_d = this.field_l.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static on a(byte[] param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        on stackIn_3_0 = null;
        on stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var6 = ZombieDawn.field_J;
        try {
          if (param1 >= -3) {
            stackIn_3_0 = (on) null;
            return stackIn_3_0;
          }
          var2_int = 0;
          var8 = new byte[param0.length + 24];
          var7 = var8;
          var3 = var7;
          for (var2_intLifetime1 = 0; var2_intLifetime1 < 4; var2_intLifetime1++) {
            fb.a(var2_intLifetime1, var3, (byte) -81, md.a(var2_intLifetime1, param0, 70));
          }
          incrementValue$2 = var2_intLifetime1;
          var2_intLifetime1++;
          var4 = md.a(incrementValue$2, param0, 82);
          incrementValue$3 = var2_intLifetime1;
          var2_intLifetime1++;
          var5 = md.a(incrementValue$3, param0, 65);
          fb.a(4, var8, (byte) 69, var4);
          fb.a(5, var8, (byte) 61, var5);
          fb.a(6, var8, (byte) 79, var4);
          fb.a(7, var8, (byte) 80, var5);
          fb.a(8, var8, (byte) 56, var4);
          fb.a(9, var8, (byte) -64, var5);
          fb.a(10, var8, (byte) 66, var4);
          fb.a(11, var8, (byte) 74, var5);
          for (var2_intLifetime2 = 6; param0.length / 4 > var2_intLifetime2; var2_intLifetime2++) {
            fb.a(6 + var2_intLifetime2, var3, (byte) 42, md.a(var2_intLifetime2, param0, 93));
          }
          stackIn_11_0 = vk.a((byte) -83, var8);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gm.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = 65;
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
