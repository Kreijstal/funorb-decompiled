/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nn implements Runnable {
    private int field_l;
    private boolean field_h;
    private java.net.Socket field_e;
    private int field_m;
    private byte[] field_j;
    private int field_c;
    static String[] field_g;
    private OutputStream field_d;
    private boolean field_a;
    private af field_k;
    private ib field_b;
    private InputStream field_i;
    static char[] field_f;

    final void d(int param0) {
        try {
          int var4 = 0;
          var4 = HoldTheLine.field_D;
          if (this.field_h) {
            return;
          }
          if (param0 != 21135) {
            field_g = (String[]) null;
          }
          synchronized (this) {
            this.field_h = true;
            this.notifyAll();
          }
          if (this.field_k != null) {
            while (this.field_k.field_d == 0) {
              qe.a(1L, (byte) 45);
            }
            if (this.field_k.field_d == 1) {
              try {
                ((Thread) (this.field_k.field_b)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_k = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        qn var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        da var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = HoldTheLine.field_D;
        try {
          var14 = rd.field_e;
          if (param0 >= -124) {
            nn.b(25);
          }
          var2 = var14.f((byte) -85);
          var3 = (qn) (cf.field_z.b((byte) 97));
          while (var3 != null) {
            if (var2 != var3.field_j) {
              var3 = (qn) (cf.field_z.c((byte) 93));
              continue;
            }
            break;
          }
          if (var3 == null) {
            r.a(-28036);
            return;
          }
          var4 = var14.f((byte) -31);
          if (var4 != 0) {
            wd.field_v[0] = ng.field_e;
            var5 = var3.field_i;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              wd.field_v[var6_int] = var14.j(-1231);
            }
            cc.a(var4, false, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              im.a(76, var14);
              if (var6_intLifetime1 == 0) {
                rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 106, var6_intLifetime1, si.field_jb);
              } else {
                rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 108, var6_intLifetime1, si.field_jb);
              }
            }
            uf.a(0, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = in.field_h;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = im.field_h[var9];
              var6[0][var10] = wd.field_v[var11];
              var18[0][var10 * 4] = va.field_j[var11];
              var18[0][1 + var10 * 4] = da.field_u[var11];
              var18[0][2 + var10 * 4] = ua.field_c[var11];
              var18[0][4 * var10 + 3] = fj.field_q[var11];
              if (ra.a(wd.field_v[var11], false) &&
                fj.field_q[var11] + (da.field_u[var11] + ua.field_c[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = im.field_h[var5 + var9Lifetime1];
              var6[1][var13] = wd.field_v[var11Lifetime1];
              var18[1][4 * var13] = va.field_j[var11Lifetime1];
              var18[1][var13 * 4 + 1] = da.field_u[var11Lifetime1];
              var18[1][4 * var13 + 2] = ua.field_c[var11Lifetime1];
              var18[1][var13 * 4 + 3] = fj.field_q[var11Lifetime1];
              if (ra.a(wd.field_v[var11Lifetime1], false) &&
                fj.field_q[var11Lifetime1] + da.field_u[var11Lifetime1] + ua.field_c[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
            var3.d(0);
            return;
          }
          var3.d(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "nn.A(" + param0 + ')');
        }
    }

    final int c(int param0) throws IOException {
        if (param0 != -27418) {
          return -14;
        }
        if (this.field_h) {
          return 0;
        }
        return this.field_i.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (this.field_h) {
            return;
          }
          if (this.field_a) {
            this.field_a = false;
            throw new IOException();
          }
          if (null == this.field_j) {
            this.field_j = new byte[this.field_m];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param0 > var6; var6++) {
              this.field_j[this.field_c] = param1[var6 + param2];
              this.field_c = (1 + this.field_c) % this.field_m;
              if (this.field_c == (-100 + this.field_m + this.field_l) % this.field_m) {
                throw new IOException();
              }
            }
            if (param3 != 1) {
              this.run();
            }
            if (null == this.field_k) {
              this.field_k = this.field_b.a((byte) -28, 3, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("nn.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    nn(java.net.Socket param0, ib param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = HoldTheLine.field_D;
        try {
          var5_int = 90 % ((param3 - 89) / 35);
          if (this.field_h) {
            return;
          }
          while (param1 > 0) {
            var6 = this.field_i.read(param0, param2, param1);
            if (0 >= var6) {
              throw new EOFException();
            }
            param2 = param2 + var6;
            param1 = param1 - var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("nn.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          nn.a(false);
        }
    }

    protected final void finalize() {
        this.d(21135);
    }

    final void c(boolean param0) throws IOException {
        if (!param0) {
          this.field_m = 101;
        }
        if (this.field_h) {
          return;
        }
        if (this.field_a) {
          this.field_a = false;
          throw new IOException();
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
          var6 = HoldTheLine.field_D;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_l == this.field_c) {
                  if (this.field_h) {
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
                  var2 = this.field_l;
                  if (this.field_l <= this.field_c) {
                    var1_int = -this.field_l + this.field_c;
                  } else {
                    var1_int = this.field_m - this.field_l;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_i) {
                    this.field_i.close();
                  }
                  if (null != this.field_d) {
                    this.field_d.close();
                  }
                  if (this.field_e != null) {
                    this.field_e.close();
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
                this.field_d.write(this.field_j, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
              this.field_l = (var1_int + this.field_l) % this.field_m;
              try {
                if (this.field_c == this.field_l) {
                  this.field_d.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_a = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            bl.a((Throwable) ((Object) var1_ref), (byte) 94, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 >= -126) {
          nn.a(-24);
        }
        boolean decompiledFrameRemainder0 = true;
        if (pf.field_d >= 20 &&
          jn.a((byte) -30) && (!(q.field_c > 0) ||
          ai.a(-118))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 15281) {
          field_g = (String[]) null;
        }
    }

    final int b(boolean param0) throws IOException {
        if (param0) {
          return -52;
        }
        if (this.field_h) {
          return 0;
        }
        return this.field_i.available();
    }

    final static boolean a(int param0) {
        if (hk.field_a != null &&
          null != ho.field_j) {
          return true;
        }
        if (param0 > -3) {
          field_f = (char[]) null;
        }
        if (!fb.field_i.b("font24", 118)) {
          return false;
        }
        if (!fb.field_i.b("overlayfont", -118)) {
          return false;
        }
        hk.field_a = ko.a(false);
        ho.field_j = om.a("font24", ef.field_c, "", 8192, fb.field_i);
        return true;
    }

    private nn(java.net.Socket param0, ib param1, int param2) throws IOException {
        this.field_l = 0;
        this.field_h = false;
        this.field_c = 0;
        this.field_a = false;
        try {
          this.field_e = param0;
          this.field_b = param1;
          this.field_e.setSoTimeout(30000);
          this.field_e.setTcpNoDelay(true);
          this.field_i = this.field_e.getInputStream();
          this.field_d = this.field_e.getOutputStream();
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "nn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = new char[]{(char)91, (char)93, (char)35};
    }
}
