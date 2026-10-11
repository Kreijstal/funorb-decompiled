/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ha implements Runnable {
    private wi field_a;
    private int field_e;
    private si field_i;
    private java.net.URL field_d;
    private mk field_f;
    private DataInputStream field_c;
    static String field_j;
    private mk field_h;
    static vf field_l;
    static String field_g;
    static String field_k;
    private mk field_n;
    static int field_b;
    static String field_m;

    final static void a(int param0, boolean param1) {
        of.a(true, param1, (byte) 95);
        int var2 = -40 / ((param0 - 64) / 51);
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = Bounce.field_N;
          try {
            while (this.field_a.field_i.length > this.field_a.field_h) {
              var1_int = this.field_c.read(this.field_a.field_i, this.field_a.field_h, -this.field_a.field_h + this.field_a.field_i.length);
              if (var1_int >= 0) {
                this.field_a.field_h = this.field_a.field_h + var1_int;
                continue;
              }
              break;
            }
            if (this.field_a.field_h == this.field_a.field_i.length) {
              throw ha.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_i.length + " " + this.field_d));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_e = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_e = this.field_e + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final wi a(int param0) {
        if (this.field_e == 3) {
          return this.field_a;
        }
        if (param0 == 11951) {
          return null;
        }
        return (wi) null;
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_e >= 2) {
          return true;
        }
        if (this.field_e == 0) {
          if (this.field_n == null) {
            this.field_n = this.field_i.a(this.field_d, false);
          }
          if (this.field_n.field_f == 0) {
            return false;
          }
          if (1 != this.field_n.field_f) {
            this.field_n = null;
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (this.field_e == 1) {
          if (this.field_f == null) {
            this.field_f = this.field_i.a(this.field_d.getHost(), 443, 0);
          }
          if (this.field_f.field_f == 0) {
            return false;
          }
          if (this.field_f.field_f != 1) {
            this.field_f = null;
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (null != this.field_c) {
          if (this.field_h == null) {
            this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
          }
          if (this.field_h.field_f == 0) {
            return false;
          }
          if (1 != this.field_h.field_f) {
            this.finalize();
            this.field_e = this.field_e + 1;
          }
          if (param0 < -46) {
            return false;
          }
          this.field_a = (wi) null;
          return false;
        }
        try {
          if (this.field_e == 0) {
            this.field_c = (DataInputStream) (this.field_n.field_e);
          }
          if (1 == this.field_e) {
            var4 = (java.net.Socket) (this.field_f.field_e);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
            var3.write(wi.a(var5, true));
            this.field_c = new DataInputStream(var4.getInputStream());
          }
          this.field_a.field_h = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_e = this.field_e + 1;
          if (this.field_h == null) {
            this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
          }
          if (this.field_h.field_f == 0) {
            return false;
          }
          if (1 == this.field_h.field_f) {
            if (param0 < -46) {
              return false;
            }
            this.field_a = (wi) null;
            return false;
          }
          this.finalize();
          this.field_e = this.field_e + 1;
          if (param0 < -46) {
            return false;
          }
          this.field_a = (wi) null;
          return false;
        }
        if (this.field_h == null) {
          this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
        }
        if (this.field_h.field_f == 0) {
          return false;
        }
        if (1 != this.field_h.field_f) {
          this.finalize();
          this.field_e = this.field_e + 1;
        }
        if (param0 >= -46) {
          this.field_a = (wi) null;
        }
        return false;
    }

    final static void a(int param0, sa param1, int param2) {
        ii var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = hh.field_p;
          var3.a(true, param2);
          var3.a(5, (byte) 98);
          var3.a(0, (byte) 65);
          var3.e(param0 ^ 750670611, param1.field_n);
          var3.a(param1.field_g, (byte) 63);
          var3.a(param1.field_m, (byte) 98);
          if (param0 == -17765) {
            return;
          }
          ha.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("ha.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0) {
          ha.a(true);
          field_m = null;
          return;
        }
        field_m = null;
    }

    ha(si param0, java.net.URL param1, int param2) {
        try {
          this.field_i = param0;
          this.field_d = param1;
          this.field_a = new wi(param2);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() {
        if (null != this.field_n) {
          if (this.field_n.field_e != null) {
            try {
              ((DataInputStream) (this.field_n.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_n = null;
        }
        if (this.field_f != null) {
          if (this.field_f.field_e != null) {
            try {
              ((java.net.Socket) (this.field_f.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_c) {
          try {
            this.field_c.close();
          } catch (Exception exception) {
          }
          this.field_c = null;
        }
        this.field_h = null;
    }

    static {
        field_g = "Email is valid";
        field_j = "Email: ";
        field_k = "Account created successfully!";
        field_m = "Orb coins: <%0>";
        field_b = -1;
        field_l = new vf();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
