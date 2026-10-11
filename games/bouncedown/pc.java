/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc implements Runnable {
    static String field_c;
    static String field_i;
    static int[] field_j;
    static String field_p;
    private mk field_f;
    private si field_e;
    private java.net.Socket field_n;
    private int field_g;
    private boolean field_b;
    private int field_h;
    static tg field_o;
    private InputStream field_m;
    private boolean field_l;
    private OutputStream field_k;
    private int field_a;
    private byte[] field_d;

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
          var6 = Bounce.field_N;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a == this.field_h) {
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
                  if (this.field_a <= this.field_h) {
                    var1_int = this.field_h - this.field_a;
                  } else {
                    var1_int = -this.field_a + this.field_g;
                  }
                  var2 = this.field_a;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_m != null) {
                    this.field_m.close();
                  }
                  if (null != this.field_k) {
                    this.field_k.close();
                  }
                  if (null != this.field_n) {
                    this.field_n.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_d = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_k.write(this.field_d, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_b = true;
              }
              this.field_a = (var1_int + this.field_a) % this.field_g;
              try {
                if (this.field_a == this.field_h) {
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
            ti.a((Throwable) ((Object) var1_ref), (byte) 100, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Bounce.field_N;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_b) {
            this.field_b = false;
            throw new IOException();
          }
          if (this.field_d == null) {
            this.field_d = new byte[this.field_g];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = param3; var6 < param0; var6++) {
              this.field_d[this.field_h] = param1[var6 + param2];
              this.field_h = (1 + this.field_h) % this.field_g;
              if (this.field_h == (-100 + (this.field_g + this.field_a)) % this.field_g) {
                throw new IOException();
              }
            }
            if (null == this.field_f) {
              this.field_f = this.field_e.a(3, (byte) -113, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("pc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Bounce.field_N;
        try {
          if (this.field_l) {
            return;
          }
          if (!param1) {
            return;
          }
          while (param2 > 0) {
            var5_int = this.field_m.read(param0, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 + var5_int;
            param2 = param2 - var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pc.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 0) {
          this.finalize();
        }
        return this.field_m.read();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            if (param0 != 8272) {
              return true;
            }
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param1))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param3) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param3;
                if (var6 != var10 / param3) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("pc.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          int var4 = 0;
          var4 = Bounce.field_N;
          if (this.field_l) {
            return;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (param0 != -70) {
            return;
          }
          if (null != this.field_f) {
            while (0 == this.field_f.field_f) {
              wh.a(1L, 19406);
            }
            if (1 == this.field_f.field_f) {
              try {
                ((Thread) (this.field_f.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_f = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Bounce.field_N;
        if (oa.field_a < 0) {
          return;
        }
        var3 = param2 - 135;
        var4 = -35 + param0;
        var5 = 256;
        if (oa.field_a < 75) {
          var5 = (oa.field_a << 8) / 75;
        }
        if (200 < oa.field_a) {
          var5 = (-oa.field_a + 250 << 8) / 50;
        }
        kh.a(bi.field_j, 1);
        qk.c();
        na.a();
        jf.c(0);
        if (var5 < 256) {
          na.a(0, 0, na.field_e, na.field_k, 0, 256 - var5);
        }
        ve.a(-121);
        if (oa.field_a < 150) {
          bi.field_j.c(var3, var4);
        } else {
          jl.field_c.d(15 + var3, 10 + var4, var5);
        }
        var6 = -125 + oa.field_a;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 >= 20) {
            if (30 <= var6) {
              var7 = (-(var6 * 256) + 12800) / 20;
              Bounce.field_G.a(var3, var4, var7);
            } else {
              Bounce.field_G.a(var3, var4, 256);
            }
          } else {
            var7 = 256 * var6 / 20;
            Bounce.field_G.a(var3, var4, var7);
          }
        }
        var6Lifetime1 = -140 + oa.field_a;
        if (param1 > -44) {
          field_o = (tg) null;
        }
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          bf.field_o.d(15 + var3, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    public static void c(int param0) {
        field_c = null;
        field_j = null;
        field_p = null;
        field_i = null;
        if (param0 != -14582) {
          return;
        }
        field_o = null;
    }

    final void a(int param0) throws IOException {
        if (this.field_l) {
          return;
        }
        int var2 = -51 % ((param0 + 67) / 34);
        if (this.field_b) {
          this.field_b = false;
          throw new IOException();
        }
    }

    final int d(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 0) {
          this.field_a = -27;
        }
        return this.field_m.available();
    }

    protected final void finalize() {
        this.a((byte) -70);
    }

    pc(java.net.Socket param0, si param1) throws IOException {
        this(param0, param1, 5000);
    }

    private pc(java.net.Socket param0, si param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_l = false;
        this.field_a = 0;
        this.field_b = false;
        try {
          this.field_e = param1;
          this.field_n = param0;
          this.field_n.setSoTimeout(30000);
          this.field_n.setTcpNoDelay(true);
          this.field_m = this.field_n.getInputStream();
          this.field_k = this.field_n.getOutputStream();
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = new int[8192];
        field_i = "Continue";
        field_c = "Type your email address again to make sure it's correct";
    }
}
