/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pk implements Runnable {
    private bc field_i;
    private java.net.URL field_g;
    private DataInputStream field_h;
    private bc field_b;
    private df field_j;
    static String field_f;
    private kg field_d;
    private bc field_a;
    static int field_c;
    private int field_e;

    final kg a(int param0) {
        if (~this.field_e != param0) {
          return null;
        }
        return this.field_d;
    }

    public static void c(int param0) {
        if (param0 != -13541) {
          pk.c(46);
          field_f = null;
          return;
        }
        field_f = null;
    }

    protected final void finalize() {
        if (null != this.field_b) {
          if (null != this.field_b.field_f) {
            try {
              ((DataInputStream) (this.field_b.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_b = null;
        }
        if (this.field_i != null) {
          if (null != this.field_i.field_f) {
            try {
              ((java.net.Socket) (this.field_i.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (this.field_h != null) {
          try {
            this.field_h.close();
          } catch (Exception exception) {
          }
          this.field_h = null;
        }
        this.field_a = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_e >= 2) {
          return true;
        }
        if (0 == this.field_e) {
          if (null == this.field_b) {
            this.field_b = this.field_j.a(param0 ^ 1, this.field_g);
          }
          if (this.field_b.field_g == 0) {
            return false;
          }
          if (this.field_b.field_g != 1) {
            this.field_b = null;
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (this.field_e == 1) {
          if (this.field_i == null) {
            this.field_i = this.field_j.a(443, param0 - 125, this.field_g.getHost());
          }
          if (this.field_i.field_g == 0) {
            return false;
          }
          if (this.field_i.field_g != 1) {
            this.field_e = this.field_e + 1;
            this.field_i = null;
            return false;
          }
        }
        if (this.field_h != null) {
          if (this.field_a == null) {
            this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
          }
          if (0 == this.field_a.field_g) {
            return false;
          }
          if (this.field_a.field_g == param0) {
            return false;
          }
          this.finalize();
          this.field_e = this.field_e + 1;
          return false;
        }
        try {
          if (this.field_e == 0) {
            this.field_h = (DataInputStream) (this.field_b.field_f);
          }
          if (this.field_e == 1) {
            var4 = (java.net.Socket) (this.field_i.field_f);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_g.getFile() + "\n\n"));
            var3.write(ta.a((byte) -126, var5));
            this.field_h = new DataInputStream(var4.getInputStream());
          }
          this.field_d.field_n = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_e = this.field_e + 1;
          if (this.field_a != null) {
            if (0 == this.field_a.field_g) {
              return false;
            }
            if (this.field_a.field_g == param0) {
              return false;
            }
            this.finalize();
            this.field_e = this.field_e + 1;
            return false;
          }
          this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
          if (0 == this.field_a.field_g) {
            return false;
          }
          if (this.field_a.field_g == param0) {
            return false;
          }
          this.finalize();
          this.field_e = this.field_e + 1;
          return false;
        }
        if (this.field_a == null) {
          this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
        }
        if (0 == this.field_a.field_g) {
          return false;
        }
        if (this.field_a.field_g != param0) {
          this.finalize();
          this.field_e = this.field_e + 1;
        }
        return false;
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
          int var4_int = 0;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (df.field_f.startsWith("win") &&
              ik.a(param1, -1)) {
              return;
            }
            try {
              var4_int = -70 / ((param3 + 9) / 51);
              param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              mb.a("MGR1: " + param1, true, (Throwable) null);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          var4 = Confined.field_J ? 1 : 0;
          try {
            while (this.field_d.field_m.length > this.field_d.field_n) {
              var1_int = this.field_h.read(this.field_d.field_m, this.field_d.field_n, this.field_d.field_m.length - this.field_d.field_n);
              if (var1_int >= 0) {
                this.field_d.field_n = this.field_d.field_n + var1_int;
                continue;
              }
              break;
            }
            if (this.field_d.field_n == this.field_d.field_m.length) {
              throw pk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_m.length + " " + this.field_g));
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

    pk(df param0, java.net.URL param1, int param2) {
        try {
          this.field_g = param1;
          this.field_j = param0;
          this.field_d = new kg(param2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        if (param0 < 10) {
          return;
        }
        try {
          if (!ie.field_a) {
            hc.field_u = param1;
            bg.field_f = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = -1;
        field_f = "<col=FFFFFF>Disruption cannon:</col> operated similarly to the charge cannon but with <col=FFFFFF><%0></col>, this weapon fires a light-bending vortex that sucks things in and blows them up. It also gets bigger as it gets further away!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
