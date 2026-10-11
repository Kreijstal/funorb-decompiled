/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na implements Runnable {
    private gb field_g;
    private nj field_a;
    private dl field_h;
    private nj field_f;
    private int field_c;
    static boolean field_b;
    private java.net.URL field_e;
    private nj field_i;
    private DataInputStream field_d;
    static String[] field_j;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = SolKnight.field_L ? 1 : 0;
          try {
            while (this.field_g.field_m < this.field_g.field_l.length) {
              var1_int = this.field_d.read(this.field_g.field_l, this.field_g.field_m, this.field_g.field_l.length - this.field_g.field_m);
              if (var1_int >= 0) {
                this.field_g.field_m = this.field_g.field_m + var1_int;
                continue;
              }
              break;
            }
            if (this.field_g.field_l.length == this.field_g.field_m) {
              throw na.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_l.length + " " + this.field_e));
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

    final gb a(boolean param0) {
        if (this.field_c == 3) {
          return this.field_g;
        }
        if (param0) {
          return null;
        }
        na.a(110);
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          fk.a(param1, 0, var3, 0, var2_int);
          var4 = -87 / ((66 - param0) / 49);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("na.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13357) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          na.a((String) null, (java.applet.Applet) null, -92);
        }
    }

    protected final void finalize() {
        if (null != this.field_i) {
          if (null != this.field_i.field_e) {
            try {
              ((DataInputStream) (this.field_i.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (null != this.field_a) {
          if (this.field_a.field_e != null) {
            try {
              ((java.net.Socket) (this.field_a.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
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

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = SolKnight.field_L ? 1 : 0;
          try {
            if (param2 != -32574) {
              field_j = (String[]) null;
            }
            try {
              var3 = (String) (fd.a(param1, "getcookies", (byte) 100));
              var4 = b.$cfr$intArgs$a$25ae83805f84(var3, 59, true);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("na.A(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(dl param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param0;
          this.field_e = param1;
          this.field_g = new gb(param2);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_c) {
          return true;
        }
        if (this.field_c == 0) {
          if (null == this.field_i) {
            this.field_i = this.field_h.a(this.field_e, (byte) 68);
          }
          if (this.field_i.field_c == 0) {
            return false;
          }
          if (this.field_i.field_c != 1) {
            this.field_i = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (this.field_c == 1) {
          if (null == this.field_a) {
            this.field_a = this.field_h.a(this.field_e.getHost(), 443, -28148);
          }
          if (this.field_a.field_c == 0) {
            return false;
          }
          if (1 != this.field_a.field_c) {
            this.field_c = this.field_c + 1;
            this.field_a = null;
            return false;
          }
        }
        if (null == this.field_d) {
          try {
            if (this.field_c == 0) {
              this.field_d = (DataInputStream) (this.field_i.field_e);
            }
            if (this.field_c == 1) {
              var4 = (java.net.Socket) (this.field_a.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_e.getFile() + "\n\n"));
              var3.write(wb.a(65, var5));
              this.field_d = new DataInputStream(var4.getInputStream());
            }
            this.field_g.field_m = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
          }
        }
        if (null == this.field_f) {
          this.field_f = this.field_h.a(5, -90, (Runnable) (this));
        }
        if (this.field_f.field_c == 0) {
          return false;
        }
        if (this.field_f.field_c != 1) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
        if (param0 <= -57) {
          return false;
        }
        this.field_d = (DataInputStream) null;
        return false;
    }

    static {
        field_j = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
