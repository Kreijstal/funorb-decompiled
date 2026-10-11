/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc implements Runnable {
    private vi field_m;
    private kk field_f;
    private java.net.URL field_o;
    static int field_c;
    private fd field_e;
    static String field_p;
    static String field_h;
    private DataInputStream field_d;
    static bd field_a;
    static String field_i;
    static String field_k;
    static bd field_l;
    static en field_g;
    private kk field_n;
    private int field_b;
    private kk field_j;

    protected final void finalize() {
        if (null != this.field_n) {
          if (null != this.field_n.field_c) {
            try {
              ((DataInputStream) (this.field_n.field_c)).close();
            } catch (Exception exception) {
            }
          }
          this.field_n = null;
        }
        if (this.field_j != null) {
          if (this.field_j.field_c != null) {
            try {
              ((java.net.Socket) (this.field_j.field_c)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (null != this.field_d) {
          try {
            this.field_d.close();
          } catch (Exception exception) {
          }
          this.field_d = null;
        }
        this.field_f = null;
    }

    final vi b(byte param0) {
        if (this.field_b == 3) {
          return this.field_m;
        }
        if (param0 >= 123) {
          return null;
        }
        return (vi) null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = HostileSpawn.field_I ? 1 : 0;
          try {
            while (this.field_m.field_n.length > this.field_m.field_i) {
              var1_int = this.field_d.read(this.field_m.field_n, this.field_m.field_i, this.field_m.field_n.length - this.field_m.field_i);
              if (var1_int >= 0) {
                this.field_m.field_i = this.field_m.field_i + var1_int;
                continue;
              }
              break;
            }
            if (this.field_m.field_n.length == this.field_m.field_i) {
              throw sc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_m.field_n.length + " " + this.field_o));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_b = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_b = this.field_b + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_h = null;
        int var1 = -6 / ((-27 - param0) / 46);
        field_g = null;
        field_k = null;
        field_l = null;
        field_p = null;
        field_a = null;
        field_i = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_b >= 2) {
          return true;
        }
        if (param0 != 24) {
          this.b(58);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_b == 0) {
          if (null == this.field_n) {
            this.field_n = this.field_e.a(30085, this.field_o);
          }
          if (this.field_n.field_f == 0) {
            return false;
          }
          if (this.field_n.field_f != 1) {
            this.field_n = null;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_b == 1) {
            if (this.field_j == null) {
              this.field_j = this.field_e.a(this.field_o.getHost(), 96, 443);
            }
            if (0 == this.field_j.field_f) {
              return false;
            }
            if (1 != this.field_j.field_f) {
              this.field_b = this.field_b + 1;
              this.field_j = null;
              return false;
            }
          }
          if (this.field_d == null) {
            try {
              if (this.field_b == 0) {
                this.field_d = (DataInputStream) (this.field_n.field_c);
              }
              if (this.field_b == 1) {
                var4 = (java.net.Socket) (this.field_j.field_c);
                var4.setSoTimeout(10000);
                var3 = var4.getOutputStream();
                var3.write(17);
                var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_o.getFile() + "\n\n"));
                var3.write(lf.a((byte) 113, var5));
                this.field_d = new DataInputStream(var4.getInputStream());
              }
              this.field_m.field_i = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_b = this.field_b + 1;
            }
          }
          if (this.field_f == null) {
            this.field_f = this.field_e.a(5, (Runnable) (this), -102);
          }
          if (this.field_f.field_f == 0) {
            return false;
          }
          if (1 == this.field_f.field_f) {
            return false;
          }
          this.finalize();
        }
        this.field_b = this.field_b + 1;
        return false;
    }

    final static void a(byte param0) {
        u.field_f = new String[34];
        u.field_f[4] = fh.field_e;
        u.field_f[16] = ch.field_d;
        u.field_f[1] = hn.field_d;
        u.field_f[14] = ob.field_E;
        u.field_f[12] = na.field_q;
        u.field_f[0] = lg.field_l;
        u.field_f[2] = lg.field_h;
        u.field_f[6] = ej.field_o;
        u.field_f[3] = il.field_d;
        u.field_f[7] = jh.field_bb;
        u.field_f[15] = ed.field_d;
        u.field_f[13] = wc.field_s;
        u.field_f[11] = mm.field_h;
        u.field_f[5] = ej.field_o;
        u.field_f[18] = field_p;
        u.field_f[28] = ia.field_k;
        u.field_f[29] = aj.field_g;
        u.field_f[23] = bl.field_e;
        if (param0 != 118) {
          sc.a(-47);
        }
        u.field_f[17] = ui.field_d;
        u.field_f[32] = f.field_c;
        u.field_f[22] = il.field_d;
        u.field_f[26] = jf.field_e;
        u.field_f[25] = em.field_b;
        u.field_f[33] = ln.field_h;
        u.field_f[24] = gn.field_l;
        u.field_f[10] = m.field_m[2];
        u.field_f[31] = og.field_e;
        u.field_f[21] = ed.field_d;
        u.field_f[9] = m.field_m[1];
        u.field_f[30] = c.field_b;
        u.field_f[8] = m.field_m[0];
    }

    sc(fd param0, java.net.URL param1, int param2) {
        try {
          this.field_o = param1;
          this.field_e = param0;
          this.field_m = new vi(param2);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, p param1, int[] param2, int param3) {
        int var6 = 0;
        int dupTemp$0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 0;
          while (0 == param1.field_e) {
            jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
            var4_int++;
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
            jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
            jn.field_F[ib.field_c].field_e = -var4_int;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = 6;
            ib.field_c = ib.field_c + 1;
            param1.field_l.a(5, (byte) 94, param1.field_c);
            param1.a(8573);
            param2[param0] = 0;
            if (2 == param2[param1.field_j.b(-4)]) {
              param1.field_e = 1;
              param1.field_l.a(15, (byte) 94, param1.field_c);
            }
            for (var6 = 1; rc.field_e > var6; var6++) {
              var7 = 0;
              var8 = 0;
              var9 = re.field_n[var6];
              var10 = var9.field_i;
              var8Lifetime1 = (int)(((double)var9.field_j.field_g + var9.field_l.field_a - (double)param1.field_j.field_g - param1.field_l.field_a) * 24.0);
              var7Lifetime1 = (int)(24.0 * ((double)var9.field_j.field_e + var9.field_l.field_f - (double)param1.field_j.field_e - param1.field_l.field_f));
              var11 = 24;
              if (-var11 <= var7Lifetime1 &&
                var7Lifetime1 <= var11 &&
                -var11 <= var8Lifetime1 &&
                var11 > var8Lifetime1 &&
                var9.field_I > 0 && (var10 < 12 ||
                var10 >= 18)) {
                jn.field_F[ib.field_c - 1].field_i = 1;
                stackIn_28_0 = (var9.field_I <= 0) ? 0 : 1;
                var12 = stackIn_28_0;
                if (var9.a(param1.field_i, -101)) {
                  if (param1.field_i != 5) {
                    var9.field_I = var9.field_I - 16;
                  } else {
                    var9.field_I = var9.field_I - 8;
                  }
                  if (var9.field_b &&
                    var9.field_I > 0) {
                    tk.a(8, jc.field_c, 1, true);
                  }
                }
                if ((var10 == 8 ||
                  var10 == 5 ||
                  var10 == 10 ||
                  var10 == 11 ||
                  var10 == 128 ||
                  var10 == 129 ||
                  var10 == 130 ||
                  var10 == 131 ||
                  132 == var10 ||
                  var10 == 133 ||
                  var10 == 20 ||
                  22 == var10 ||
                  var9.a((byte) 54)) &&
                  var9.a(param1.field_i, -119)) {
                  if (param1.field_i != 5) {
                    var9.field_I = var9.field_I - 192;
                  } else {
                    var9.field_I = var9.field_I - 48;
                    if (0 == bm.field_c &&
                      8 == var10) {
                      param1.field_e = 1;
                    }
                  }
                }
                var9.field_F = 255;
                jn.field_F[-1 + ib.field_c].field_e = 1;
                if (var9.field_I <= 0) {
                  var9.field_I = 0;
                  if (var9.field_b &&
                    var12 != 0 &&
                    var9.field_i != 27) {
                    dupTemp$0 = al.field_U[3] + 1;
                    al.field_U[3] = dupTemp$0;
                    if (dupTemp$0 == 30) {
                      ti.a(247, (byte) 67, 8);
                    }
                    var5++;
                    if (var5 == 5) {
                      ti.a(245, (byte) -6, 10);
                    }
                  }
                  jn.field_F[-1 + ib.field_c].field_i = 3;
                }
                nh.a(var9, -29966);
              }
            }
            param2[param0] = 3;
          }
          if (param3 != 1) {
            var14 = (int[]) null;
            sc.a(69, (p) null, (int[]) null, -89);
          }
          if (param1.field_e > 0) {
            param1.field_e = param1.field_e + 1;
          }
          if (param1.field_e > 32) {
            param1.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_83_0 = var4;
          stackIn_83_1 = new StringBuilder().append("sc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param2 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_p = "Next";
        field_h = "Before you start your mission you should check your systems.<br><br>Use <img=2> or <img=1> to move to the door.  The two sets of keys operate slightly differently, so choose the combination that feels most intuitive.<br>Press <img=5> to swap the keys' effects.";
        field_k = "Quit to website";
        field_i = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
