/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi implements Runnable {
    private mob field_f;
    private mob field_c;
    private ds field_h;
    static String field_g;
    private mob field_b;
    private java.net.URL field_i;
    private DataInputStream field_d;
    private eab field_e;
    private int field_a;

    public static void b(int param0) {
        if (param0 != -19766) {
          field_g = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final synchronized boolean c(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_a >= 2) {
          return true;
        }
        if (0 == this.field_a) {
          if (null == this.field_c) {
            this.field_c = this.field_e.a(this.field_i, 97);
          }
          if (this.field_c.field_f == 0) {
            return false;
          }
          if (this.field_c.field_f != 1) {
            this.field_a = this.field_a + 1;
            this.field_c = null;
            return false;
          }
        }
        if (this.field_a == 1) {
          if (this.field_b == null) {
            this.field_b = this.field_e.a(443, this.field_i.getHost(), 91);
          }
          if (this.field_b.field_f == 0) {
            return false;
          }
          if (1 != this.field_b.field_f) {
            this.field_b = null;
            this.field_a = this.field_a + 1;
            return false;
          }
        }
        if (null == this.field_d) {
          try {
            if (this.field_a == 0) {
              this.field_d = (DataInputStream) (this.field_c.field_d);
            }
            if (this.field_a == 1) {
              var4 = (java.net.Socket) (this.field_b.field_d);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"));
              var3.write(hi.a(var5, 126));
              this.field_d = new DataInputStream(var4.getInputStream());
            }
            this.field_h.field_e = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_a = this.field_a + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_f) {
              this.field_f = this.field_e.a(0, 5, (Runnable) (this));
            }
            if (0 == this.field_f.field_f) {
              return false;
            }
            if (param0 <= 38) {
              this.run();
            }
            if (this.field_f.field_f == 1) {
              return false;
            }
            this.finalize();
            this.field_a = this.field_a + 1;
            return false;
          }
        }
        if (null == this.field_f) {
          this.field_f = this.field_e.a(0, 5, (Runnable) (this));
        }
        if (0 == this.field_f.field_f) {
          return false;
        }
        if (param0 <= 38) {
          this.run();
        }
        if (this.field_f.field_f != 1) {
          this.finalize();
          this.field_a = this.field_a + 1;
        }
        return false;
    }

    protected final void finalize() {
        if (null != this.field_c) {
          if (null != this.field_c.field_d) {
            try {
              ((DataInputStream) (this.field_c.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_c = null;
        }
        if (null != this.field_b) {
          if (this.field_b.field_d != null) {
            try {
              ((java.net.Socket) (this.field_b.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_b = null;
        }
        if (this.field_d != null) {
          try {
            this.field_d.close();
          } catch (Exception exception) {
          }
          this.field_d = null;
        }
        this.field_f = null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = VoidHunters.field_G;
          try {
            while (this.field_h.field_h.length > this.field_h.field_e) {
              var1_int = this.field_d.read(this.field_h.field_h, this.field_h.field_e, this.field_h.field_h.length - this.field_h.field_e);
              if (var1_int >= 0) {
                this.field_h.field_e = this.field_h.field_e + var1_int;
                continue;
              }
              break;
            }
            if (this.field_h.field_e == this.field_h.field_h.length) {
              throw bi.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_h.length + " " + this.field_i));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_a = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_a = this.field_a + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ds a(int param0) {
        int var2 = 118 % ((param0 + 32) / 54);
        if (this.field_a == 3) {
          return this.field_h;
        }
        return null;
    }

    bi(eab param0, java.net.URL param1, int param2) {
        try {
          this.field_e = param0;
          this.field_i = param1;
          this.field_h = new ds(param2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Scale down map width";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
