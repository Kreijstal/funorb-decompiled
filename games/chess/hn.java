/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hn implements Runnable {
    private nl field_f;
    private int field_q;
    private boolean field_l;
    static ci field_d;
    private int field_r;
    static int field_k;
    static String field_n;
    static int field_p;
    static int field_t;
    static String field_b;
    private int field_h;
    static int field_s;
    static int[] field_e;
    private byte[] field_g;
    private jk field_a;
    private java.net.Socket field_i;
    static int field_m;
    static s field_u;
    private OutputStream field_o;
    private InputStream field_j;
    private boolean field_c;

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Chess.field_G;
        try {
          if (this.field_c) {
            return;
          }
          if (param2 != -87) {
            var7 = (int[]) null;
            hn.a((int[]) null, 27, -70, (int[]) null, -84);
          }
          while (0 < param1) {
            var5_int = this.field_j.read(param0, param3, param1);
            if (0 >= var5_int) {
              throw new EOFException();
            }
            param1 = param1 - var5_int;
            param3 = param3 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hn.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var3 = null;
          int var6 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          String var7 = null;
          var6 = Chess.field_G;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_q == this.field_h) {
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
                  if (this.field_h >= this.field_q) {
                    var1_int = this.field_h - this.field_q;
                  } else {
                    var1_int = this.field_r - this.field_q;
                  }
                  var2 = this.field_q;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_j) {
                    this.field_j.close();
                  }
                  if (this.field_o != null) {
                    this.field_o.close();
                  }
                  if (this.field_i != null) {
                    this.field_i.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_g = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_o.write(this.field_g, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
              this.field_q = (var1_int + this.field_q) % this.field_r;
              try {
                if (this.field_q == this.field_h) {
                  this.field_o.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            fg.a((Throwable) ((Object) var1_ref), (byte) -77, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_n = null;
        if (param0) {
          return;
        }
        field_d = null;
        field_u = null;
        field_e = null;
    }

    final int b(byte param0) throws IOException {
        if (this.field_c) {
          return 0;
        }
        int var2 = 91 % ((param0 + 30) / 48);
        return this.field_j.read();
    }

    final int c(int param0) throws IOException {
        if (this.field_c) {
          return 0;
        }
        if (param0 != 0) {
          hn.a((String) null, 112, (byte) -30, -125, -34L);
        }
        return this.field_j.available();
    }

    protected final void finalize() {
        this.a(-1);
    }

    final void a(int param0) {
        try {
          int var4 = 0;
          var4 = Chess.field_G;
          if (this.field_c) {
            return;
          }
          synchronized (this) {
            this.field_c = true;
            this.notifyAll();
            if (param0 != -1) {
              field_u = (s) null;
            }
          }
          if (null != this.field_f) {
            while (this.field_f.field_f == 0) {
              bc.a(1L, (byte) 60);
            }
            if (this.field_f.field_f == 1) {
              try {
                ((Thread) (this.field_f.field_b)).join();
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

    final static void a(int param0, um param1, um param2, um param3) {
        rk[] var14 = null;
        int var11_int = 0;
        km var15 = null;
        km var18 = null;
        km var11 = null;
        km var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Chess.field_G;
        int var8Lifetime1;
        int var9Lifetime1;
        jc.field_d = ao.a(param3, "frame_top", 2993, "commonui");
        ej.field_e = ao.a(param3, "frame_bottom", 2993, "commonui");
        vk.field_a = wk.a(param3, 1, "jagex_logo_grey", "commonui");
        bj.field_db = ao.a(param3, "button", 2993, "commonui");
        uh.field_p = ol.a(param3, "validation", "commonui", (byte) -117);
        rc.field_a = (lh) ((Object) rc.a("commonui", 19131, "arezzo12", param3, param1));
        rb.field_b = (lh) ((Object) rc.a("commonui", 19131, "arezzo14", param3, param1));
        tk.field_a = (lh) ((Object) rc.a("commonui", 19131, "arezzo14bold", param3, param1));
        km var17 = new km(param2.a("button.gif", 30045, ""), (java.awt.Component) ((Object) ja.field_h));
        jn.a("dropdown", 8221, "commonui", param3);
        rk[] var5 = qm.a(1, "commonui", "screen_options", param3);
        mf.field_s = new rk[4];
        ia.field_e = new rk[4];
        dn.field_g = new rk[4];
        rk[][] var6 = new rk[][]{dn.field_g, mf.field_s, ia.field_e};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_o;
        if (param0 < 65) {
          return;
        }
        try {
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_p[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            rk[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = ch.a(true, var19[var11_int], var5[var9]);
            }
          }
          var9Lifetime1 = var17.field_t;
          r.k(3029);
          var17.e();
          wb.d(0, 0, wb.field_h, wb.field_c);
          var15 = new km(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.e();
          var17.d(0, 0);
          var11 = new km(var9Lifetime1, var9Lifetime1);
          var11.e();
          var17.d(-var17.field_w + var9Lifetime1, 0);
          var12 = new km(var17.field_w - var9Lifetime1 * 2, var9Lifetime1);
          var12.e();
          var17.d(-var9Lifetime1, 0);
          fd.a(28773);
          bj.field_db = new km[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) throws IOException {
        if (this.field_c) {
          return;
        }
        if (param0 != -41) {
          this.field_q = -44;
        }
        if (this.field_l) {
          this.field_l = false;
          throw new IOException();
        }
    }

    final static void a(String param0, int param1, byte param2, int param3, long param4) {
        try {
          if (param2 != -54) {
            hn.b(50);
          }
          dc.field_m = true;
          ja.field_i = param3;
          vg.field_f = param1;
          tj.field_m = param4;
          hd.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(int param0) {
        int var1 = -2 / ((-19 - param0) / 49);
        if (Chess.field_E != ph.field_j.field_i) {
          cb.field_a = cb.field_a + (-Chess.field_E + ph.field_j.field_i);
          Chess.field_E = ph.field_j.field_i;
        }
        if (da.field_F > 0) {
          da.field_F = da.field_F - 1;
        }
        if (da.field_F > 0) {
          jb.a((byte) -89);
        }
    }

    hn(java.net.Socket param0, jk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Chess.field_G;
        try {
          if (this.field_c) {
            return;
          }
          if (this.field_l) {
            this.field_l = false;
            throw new IOException();
          }
          if (null == this.field_g) {
            this.field_g = new byte[this.field_r];
          }
          var5 = this;
          synchronized (var5) {
            if (param2 != -92) {
              field_s = 18;
            }
            for (var6 = 0; var6 < param1; var6++) {
              this.field_g[this.field_h] = param3[param0 + var6];
              this.field_h = (this.field_h + 1) % this.field_r;
              if (this.field_h == (-100 + this.field_q + this.field_r) % this.field_r) {
                throw new IOException();
              }
            }
            if (this.field_f == null) {
              this.field_f = this.field_a.a(3, true, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("hn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        var13 = Chess.field_G;
        try {
          if (param1 < param4) {
            var5_int = (param4 + param1) / 2;
            var6 = param1;
            var7 = param0[var5_int];
            param0[var5_int] = param0[param4];
            param0[param4] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var8;
            stackIn_5_0 = (2147483647 == var7) ? 0 : 1;
            var9 = stackIn_5_0;
            for (var10 = param1; var10 < param4; var10++) {
              if (var7 - (var10 & var9) < param0[var10]) {
                var11 = param0[var10];
                param0[var10] = param0[var6];
                param0[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param0[param4] = param0[var6];
            param0[var6] = var7;
            param3[param4] = param3[var6];
            param3[var6] = var8;
            hn.a(param0, param1, 0, param3, var6 - 1);
            hn.a(param0, var6 + 1, 0, param3, param4);
          }
          if (param2 != 0) {
            var14 = (int[]) null;
            hn.a((int[]) null, 112, -123, (int[]) null, 20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("hn.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    private hn(java.net.Socket param0, jk param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_q = 0;
        this.field_l = false;
        this.field_c = false;
        try {
          this.field_a = param1;
          this.field_i = param0;
          this.field_i.setSoTimeout(30000);
          this.field_i.setTcpNoDelay(true);
          this.field_j = this.field_i.getInputStream();
          this.field_o = this.field_i.getOutputStream();
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_p = 0;
        field_n = "Quick Chat lobby";
        field_t = 0;
        field_k = 0;
        field_b = "All players have left <%0>'s game.";
    }
}
