/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private ib field_d;
    static long field_k;
    private oa field_h;
    private DataInputStream field_g;
    private ib field_e;
    private ib field_j;
    private int field_c;
    static String[] field_f;
    static String field_a;
    private fe field_i;
    private java.net.URL field_b;

    protected final void finalize() {
        if (this.field_j != null) {
          if (null != this.field_j.field_g) {
            try {
              ((DataInputStream) (this.field_j.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (this.field_d != null) {
          if (this.field_d.field_g != null) {
            try {
              ((java.net.Socket) (this.field_d.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (this.field_g != null) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_e = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != -62) {
          field_k = -124L;
        }
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == param0) {
          if (null == this.field_j) {
            this.field_j = this.field_i.a(-21377, this.field_b);
          }
          if (this.field_j.field_c == 0) {
            return false;
          }
          if (this.field_j.field_c != 1) {
            this.field_j = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (this.field_c == 1) {
          if (null == this.field_d) {
            this.field_d = this.field_i.a(88, this.field_b.getHost(), 443);
          }
          if (this.field_d.field_c == 0) {
            return false;
          }
          if (this.field_d.field_c != 1) {
            this.field_d = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (this.field_g != null) {
          if (null == this.field_e) {
            this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
          }
          if (0 == this.field_e.field_c) {
            return false;
          }
          if (this.field_e.field_c == 1) {
            return false;
          }
          this.finalize();
          this.field_c = this.field_c + 1;
          return false;
        }
        try {
          if (this.field_c == 0) {
            this.field_g = (DataInputStream) (this.field_j.field_g);
          }
          if (this.field_c == 1) {
            var4 = (java.net.Socket) (this.field_d.field_g);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
            var3.write(uk.a(14122, var5));
            this.field_g = new DataInputStream(var4.getInputStream());
          }
          this.field_h.field_h = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_c = this.field_c + 1;
          if (null != this.field_e) {
            if (0 == this.field_e.field_c) {
              return false;
            }
            if (this.field_e.field_c == 1) {
              return false;
            }
            this.finalize();
            this.field_c = this.field_c + 1;
            return false;
          }
          this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
          if (0 == this.field_e.field_c) {
            return false;
          }
          if (this.field_e.field_c == 1) {
            return false;
          }
          this.finalize();
          this.field_c = this.field_c + 1;
          return false;
        }
        if (null == this.field_e) {
          this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
        }
        if (0 == this.field_e.field_c) {
          return false;
        }
        if (this.field_e.field_c != 1) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
        return false;
    }

    final oa b(int param0) {
        int var2 = 68 / ((param0 - 56) / 56);
        if (this.field_c == 3) {
          return this.field_h;
        }
        return null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = Transmogrify.field_A ? 1 : 0;
          try {
            while (this.field_h.field_h < this.field_h.field_g.length) {
              var1_int = this.field_g.read(this.field_h.field_g, this.field_h.field_h, this.field_h.field_g.length - this.field_h.field_h);
              if (var1_int >= 0) {
                this.field_h.field_h = this.field_h.field_h + var1_int;
                continue;
              }
              break;
            }
            if (this.field_h.field_g.length == this.field_h.field_h) {
              throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_g.length + " " + this.field_b));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_c = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_c = this.field_c + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qb(fe param0, java.net.URL param1, int param2) {
        try {
          this.field_b = param1;
          this.field_i = param0;
          this.field_h = new oa(param2);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, oa param2, int param3, int param4) {
        try {
          param2.f(6389, 12);
          param2.c(17, -159688920);
          param2.c(param4, -159688920);
          param2.c(param1, -159688920);
          param2.f(6389, param3);
          if (param0 < 112) {
            field_k = -61L;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
