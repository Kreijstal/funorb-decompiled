/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf implements Runnable {
    private vi field_k;
    private int field_i;
    private pb field_c;
    private vi field_j;
    private le field_f;
    static String field_e;
    static ph field_d;
    static String field_g;
    private vi field_b;
    private java.net.URL field_a;
    private DataInputStream field_h;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = Main.field_T;
          try {
            while (this.field_c.field_i < this.field_c.field_g.length) {
              var1_int = this.field_h.read(this.field_c.field_g, this.field_c.field_i, this.field_c.field_g.length - this.field_c.field_i);
              if (var1_int >= 0) {
                this.field_c.field_i = this.field_c.field_i + var1_int;
                continue;
              }
              break;
            }
            if (this.field_c.field_i == this.field_c.field_g.length) {
              throw rf.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_c.field_g.length + " " + this.field_a));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_i = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_i = this.field_i + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = wc.field_B;
        synchronized (var1) {
          qd.field_a = qd.field_a + 1;
          k.field_c = ge.field_a;
          eg.field_b = r.field_s;
          ij.field_e = vd.field_s;
          d.field_s = oa.field_d;
          if (param0 > -48) {
            rf.b(-41);
          }
          oa.field_d = false;
          dl.field_h = kk.field_b;
          ag.field_a = nl.field_d;
          jc.field_N = gk.field_b;
          kk.field_b = 0;
        }
    }

    final synchronized boolean a(boolean param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_i >= 2) {
          return true;
        }
        if (this.field_i == 0) {
          if (null == this.field_k) {
            this.field_k = this.field_f.a(this.field_a, param0);
          }
          if (0 == this.field_k.field_a) {
            return false;
          }
          if (this.field_k.field_a != 1) {
            this.field_i = this.field_i + 1;
            this.field_k = null;
            return false;
          }
        }
        if (1 == this.field_i) {
          if (this.field_j == null) {
            this.field_j = this.field_f.a(this.field_a.getHost(), (byte) -78, 443);
          }
          if (0 == this.field_j.field_a) {
            return false;
          }
          if (this.field_j.field_a != 1) {
            this.field_i = this.field_i + 1;
            this.field_j = null;
            return false;
          }
        }
        if (this.field_h == null) {
          try {
            if (0 == this.field_i) {
              this.field_h = (DataInputStream) (this.field_k.field_e);
            }
            if (1 == this.field_i) {
              var4 = (java.net.Socket) (this.field_j.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
              var3.write(dd.a(var5, (byte) -127));
              this.field_h = new DataInputStream(var4.getInputStream());
            }
            this.field_c.field_i = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_i = this.field_i + 1;
          }
        }
        if (this.field_b == null) {
          this.field_b = this.field_f.a(0, 5, (Runnable) (this));
        }
        if (!param0) {
          return false;
        }
        if (0 == this.field_b.field_a) {
          return false;
        }
        if (this.field_b.field_a == 1) {
          return false;
        }
        this.finalize();
        this.field_i = this.field_i + 1;
        return false;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Main.field_T;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (ph.a(param0, false)) {
            return true;
          }
          var6 = kh.field_f;
          var2 = var6;
          for (var3 = param1; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
              return true;
            }
          }
          var2Lifetime1 = ok.field_a;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "rf.C(" + param0 + ',' + param1 + ')');
        }
    }

    protected final void finalize() {
        if (null != this.field_k) {
          if (null != this.field_k.field_e) {
            try {
              ((DataInputStream) (this.field_k.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_k = null;
        }
        if (this.field_j != null) {
          if (null != this.field_j.field_e) {
            try {
              ((java.net.Socket) (this.field_j.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (null != this.field_h) {
          try {
            this.field_h.close();
          } catch (Exception exception) {
          }
          this.field_h = null;
        }
        this.field_b = null;
    }

    public static void b(int param0) {
        if (param0 != -19749) {
          return;
        }
        field_e = null;
        field_g = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Main.field_T;
        try {
          ai.a(bd.field_F, param1, ei.field_f, 0, true, fk.field_h, 8192);
          if (param0 != -23243) {
            rf.c(-100);
          }
          for (var2_int = 0; ei.field_f > var2_int; var2_int++) {
            re.field_c[param1 + var2_int] = var2_int;
          }
          ai.a(ah.field_d, param1 + param1, ei.field_f + param1, param1, false, mf.field_g, 8192);
          if (param1 < ei.field_f) {
            ei.field_f = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "rf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final pb a(int param0) {
        if (param0 >= -31) {
          return (pb) null;
        }
        if (this.field_i != 3) {
          return null;
        }
        return this.field_c;
    }

    rf(le param0, java.net.URL param1, int param2) {
        try {
          this.field_a = param1;
          this.field_f = param0;
          this.field_c = new pb(param2);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Difficulty: Easy";
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
