/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class r implements Runnable {
    private ob field_k;
    private qb field_l;
    static String field_f;
    static int field_c;
    private pb field_b;
    static int[] field_j;
    private DataInputStream field_g;
    private int field_h;
    private java.net.URL field_e;
    private pb field_a;
    static boolean field_d;
    private pb field_i;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        gr var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        sl var15 = null;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var15 = sa.field_a;
          var2 = var15.j(-102);
          var3 = (gr) (qa.field_r.d(0));
          while (var3 != null) {
            if (~var3.field_k != ~var2) {
              var3 = (gr) (qa.field_r.a((byte) -71));
              continue;
            }
            break;
          }
          if (var3 == null) {
            q.g(-119);
            return;
          }
          var4 = -122 % ((14 - param0) / 34);
          var5 = var15.j(-87);
          if (var5 != 0) {
            var6 = var3.field_j;
            wb.field_a[0] = ln.field_o;
            for (var7_int = 1; var5 > var7_int; var7_int++) {
              wb.field_a[var7_int] = var15.e(-1);
            }
            vd.a(var6, var5, (byte) 18);
            for (var7_intLifetime1 = 0; var5 > var7_intLifetime1; var7_intLifetime1++) {
              qg.a(var15, false);
              if (var7_intLifetime1 != 0) {
                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_intLifetime1, ig.field_d);
              } else {
                var3.field_i = np.field_j;
                var3.field_l = na.field_L;
                var3.field_h = ig.field_d;
                var3.field_r = gp.field_c;
                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_intLifetime1, ig.field_d);
              }
            }
            bh.a(var6, (byte) -111);
            dupTemp$0 = new String[2][var6];
            var3.field_n = dupTemp$0;
            var7 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var6];
            var3.field_m = dupTemp$1;
            var8 = dupTemp$1;
            var9 = wm.field_c;
            var10 = 0;
            var11 = 0;
            while (var9 > var10) {
              var12 = lg.field_d[var10];
              var7[0][var11] = wb.field_a[var12];
              var8[0][4 * var11] = kf.field_f[var12];
              var8[0][var11 * 4 + 1] = fb.field_zb[var12];
              var8[0][2 + var11 * 4] = aj.field_d[var12];
              var8[0][var11 * 4 + 3] = f.field_y[var12];
              if (jp.a(wb.field_a[var12], (byte) -105) &&
                f.field_y[var12] + aj.field_d[var12] + fb.field_zb[var12] == 0) {
                var7[0][var11] = null;
                var11--;
              }
              var11++;
              var10++;
            }
            var10Lifetime1 = 0;
            var14 = 0;
            var11Lifetime1 = var14;
            while (var9 > var10Lifetime1) {
              var12Lifetime1 = lg.field_d[var10Lifetime1 + var6];
              var7[1][var14] = wb.field_a[var12Lifetime1];
              var8[1][4 * var14] = kf.field_f[var12Lifetime1];
              var8[1][4 * var14 + 1] = fb.field_zb[var12Lifetime1];
              var8[1][var14 * 4 + 2] = aj.field_d[var12Lifetime1];
              var8[1][var14 * 4 + 3] = f.field_y[var12Lifetime1];
              if (jp.a(wb.field_a[var12Lifetime1], (byte) -105) &&
                0 == fb.field_zb[var12Lifetime1] + aj.field_d[var12Lifetime1] + f.field_y[var12Lifetime1]) {
                var7[1][var14] = null;
                var14--;
              }
              var10Lifetime1++;
              var14++;
            }
          }
          var3.field_q = true;
          var3.b((byte) -106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "r.E(" + param0 + ')');
        }
    }

    protected final void finalize() {
        if (null != this.field_b) {
          if (null != this.field_b.field_e) {
            try {
              ((DataInputStream) (this.field_b.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_b = null;
        }
        if (this.field_i != null) {
          if (null != this.field_i.field_e) {
            try {
              ((java.net.Socket) (this.field_i.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (this.field_g != null) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_a = null;
    }

    final static void b(byte param0) {
        bi var1 = null;
        bi var2 = null;
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = new bi(540, 140);
          aq.a((byte) 117, var1);
          wn.c();
          gf.b();
          js.field_j = 0;
          gq.e(-65);
          var2 = var1.g();
          int var4 = 11 / ((31 - param0) / 62);
          for (var3 = 0; 15 > var3; var3++) {
            var2.e(-2, -2, 16777215);
            gf.b(4, 4, 0, 0, 540, 140);
          }
          rf.field_h.e();
          var1.d(0, 0);
          ln.f((byte) -70);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "r.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (null != lg.field_e) {
          lg.field_e.b(param1, 125);
          if (param0 > -81) {
            field_j = (int[]) null;
            return;
          }
          return;
        }
        if (param0 <= -81) {
          return;
        }
        field_j = (int[]) null;
    }

    final static fk a(byte[] param0, byte param1, int param2) {
        fk var3 = null;
        RuntimeException var3_ref = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -9) {
            r.a((byte) 30, false);
          }
          var3 = new fk(param0);
          tr.field_vb.a((byte) -113, var3);
          dn.a(param2, var3, (byte) 13);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("r.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            while (this.field_k.field_h.length > this.field_k.field_j) {
              var1_int = this.field_g.read(this.field_k.field_h, this.field_k.field_j, this.field_k.field_h.length - this.field_k.field_j);
              if (var1_int >= 0) {
                this.field_k.field_j = this.field_k.field_j + var1_int;
                continue;
              }
              break;
            }
            if (this.field_k.field_j == this.field_k.field_h.length) {
              throw r.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_k.field_h.length + " " + this.field_e));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_h = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_h = this.field_h + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ob a(boolean param0) {
        if (3 == this.field_h) {
          return this.field_k;
        }
        if (param0) {
          return null;
        }
        return (ob) null;
    }

    final synchronized boolean b(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_h >= 2) {
          return true;
        }
        if (this.field_h == 0) {
          if (null == this.field_b) {
            this.field_b = this.field_l.a(this.field_e, false);
          }
          if (this.field_b.field_d == 0) {
            return false;
          }
          if (this.field_b.field_d != 1) {
            this.field_h = this.field_h + 1;
            this.field_b = null;
            return false;
          }
        }
        if (param0 != 10000) {
          this.field_h = 77;
        }
        if (this.field_h == 1) {
          if (this.field_i == null) {
            this.field_i = this.field_l.a(65535, 443, this.field_e.getHost());
          }
          if (this.field_i.field_d == 0) {
            return false;
          }
          if (this.field_i.field_d != 1) {
            this.field_h = this.field_h + 1;
            this.field_i = null;
            return false;
          }
        }
        if (this.field_g == null) {
          try {
            if (this.field_h == 0) {
              this.field_g = (DataInputStream) (this.field_b.field_e);
            }
            if (1 == this.field_h) {
              var4 = (java.net.Socket) (this.field_i.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_e.getFile() + "\n\n"));
              var3.write(se.a((byte) 80, var5));
              this.field_g = new DataInputStream(var4.getInputStream());
            }
            this.field_k.field_j = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_h = this.field_h + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_a) {
              this.field_a = this.field_l.a(true, 5, (Runnable) (this));
            }
            if (this.field_a.field_d == 0) {
              return false;
            }
            if (1 == this.field_a.field_d) {
              return false;
            }
            this.finalize();
            this.field_h = this.field_h + 1;
            return false;
          }
        }
        if (null == this.field_a) {
          this.field_a = this.field_l.a(true, 5, (Runnable) (this));
        }
        if (this.field_a.field_d == 0) {
          return false;
        }
        if (1 != this.field_a.field_d) {
          this.finalize();
          this.field_h = this.field_h + 1;
        }
        return false;
    }

    final static rg a(Throwable param0, String param1) {
        rg var2 = null;
        if (param0 instanceof rg) {
          var2 = (rg) ((Object) param0);
          var2.field_b = var2.field_b + ' ' + param1;
        } else {
          var2 = new rg(param0, param1);
        }
        return var2;
    }

    r(qb param0, java.net.URL param1, int param2) {
        try {
          this.field_e = param1;
          this.field_l = param0;
          this.field_k = new ob(param2);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_f = null;
        if (param0 != 0) {
          r.a((byte) 121, false);
        }
    }

    static {
        field_j = new int[]{-65536, -65536, -65536, 0, -65536};
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_d = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
