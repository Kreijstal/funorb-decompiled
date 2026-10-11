/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ll implements Runnable {
    private java.net.URL field_b;
    private int field_n;
    private ei field_j;
    static tg field_c;
    static String field_g;
    private ei field_e;
    static String field_k;
    static String field_p;
    static tf[] field_m;
    private cb field_h;
    private we field_l;
    static String field_f;
    private DataInputStream field_o;
    static String field_i;
    static int field_a;
    private ei field_d;

    final static void a(byte param0, int param1, int param2, int param3) {
        ce.field_b = param1;
        if (param0 > -112) {
          field_f = (String) null;
          sl.field_l = param2;
          qo.field_s = param3;
          return;
        }
        sl.field_l = param2;
        qo.field_s = param3;
    }

    final static uj a(long param0, int param1) {
        if (param1 != 14428) {
          return (uj) null;
        }
        return (uj) (eh.field_f.a(-11434, param0));
    }

    protected final void finalize() {
        if (this.field_e != null) {
          if (this.field_e.field_e != null) {
            try {
              ((DataInputStream) (this.field_e.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_d != null) {
          if (this.field_d.field_e != null) {
            try {
              ((java.net.Socket) (this.field_d.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (this.field_o != null) {
          try {
            this.field_o.close();
          } catch (Exception exception) {
          }
          this.field_o = null;
        }
        this.field_j = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_c = null;
        if (param0 == -57) {
          field_f = null;
          return;
        }
        field_p = (String) null;
        field_f = null;
    }

    final we a(int param0) {
        if (this.field_n != param0) {
          return null;
        }
        return this.field_l;
    }

    final synchronized boolean b(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_n) {
          return true;
        }
        if (this.field_n == 0) {
          if (this.field_e == null) {
            this.field_e = this.field_h.a((byte) -44, this.field_b);
          }
          if (this.field_e.field_b == 0) {
            return false;
          }
          if (1 != this.field_e.field_b) {
            this.field_n = this.field_n + 1;
            this.field_e = null;
            return false;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_n == 1) {
          if (null == this.field_d) {
            this.field_d = this.field_h.a(20278, this.field_b.getHost(), 443);
          }
          if (this.field_d.field_b == 0) {
            return false;
          }
          if (1 != this.field_d.field_b) {
            this.field_d = null;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_o == null) {
            try {
              if (0 == this.field_n) {
                this.field_o = (DataInputStream) (this.field_e.field_e);
              }
              if (1 == this.field_n) {
                var4 = (java.net.Socket) (this.field_d.field_e);
                var4.setSoTimeout(10000);
                var3 = var4.getOutputStream();
                var3.write(17);
                var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
                var3.write(gk.b(var5, 353));
                this.field_o = new DataInputStream(var4.getInputStream());
              }
              this.field_l.field_m = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_n = this.field_n + 1;
            }
          }
          if (param0 != -87) {
            return true;
          }
          if (this.field_j == null) {
            this.field_j = this.field_h.a(5, (Runnable) (this), (byte) -123);
          }
          if (this.field_j.field_b == 0) {
            return false;
          }
          if (this.field_j.field_b == 1) {
            return false;
          }
          this.finalize();
        }
        this.field_n = this.field_n + 1;
        return false;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = Pixelate.field_H ? 1 : 0;
          try {
            while (this.field_l.field_k.length > this.field_l.field_m) {
              var1_int = this.field_o.read(this.field_l.field_k, this.field_l.field_m, -this.field_l.field_m + this.field_l.field_k.length);
              if (var1_int >= 0) {
                this.field_l.field_m = this.field_l.field_m + var1_int;
                continue;
              }
              break;
            }
            if (this.field_l.field_m == this.field_l.field_k.length) {
              throw ll.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_l.field_k.length + " " + this.field_b));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_n = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_n = this.field_n + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ll(cb param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param0;
          this.field_b = param1;
          this.field_l = new we(param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ll.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = "You must be a member to play with the current options.";
        field_k = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_p = "<%0> has lost connection.";
        field_i = "Click or press F10 to open Quick Chat";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
