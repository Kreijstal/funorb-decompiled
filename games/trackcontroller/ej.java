/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private be field_g;
    static String[] field_f;
    private java.net.URL field_l;
    private ce field_h;
    static mk field_e;
    private ce field_i;
    static String field_b;
    private uf field_c;
    private int field_j;
    private ce field_k;
    private DataInputStream field_a;
    static qj field_d;

    final be a(int param0) {
        if (param0 != -5) {
          return (be) null;
        }
        if (this.field_j == 3) {
          return this.field_g;
        }
        return null;
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = mb.a(55, param1, 10, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ej.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_j >= 2) {
          return true;
        }
        if (this.field_j == 0) {
          if (null == this.field_i) {
            this.field_i = this.field_c.a(false, this.field_l);
          }
          if (this.field_i.field_f == 0) {
            return false;
          }
          if (this.field_i.field_f != 1) {
            this.field_j = this.field_j + 1;
            this.field_i = null;
            return false;
          }
        }
        if (this.field_j == 1) {
          if (null == this.field_h) {
            this.field_h = this.field_c.a(55, 443, this.field_l.getHost());
          }
          if (this.field_h.field_f == 0) {
            return false;
          }
          if (this.field_h.field_f != 1) {
            this.field_j = this.field_j + 1;
            this.field_h = null;
            return false;
          }
        }
        if (this.field_a != null) {
          if (null == this.field_k) {
            this.field_k = this.field_c.a(5, (Runnable) (this), 72);
          }
          if (this.field_k.field_f == 0) {
            return false;
          }
          if (param0 < 72) {
            this.finalize();
          }
          if (this.field_k.field_f == 1) {
            return false;
          }
          this.finalize();
          this.field_j = this.field_j + 1;
          return false;
        }
        try {
          if (0 == this.field_j) {
            this.field_a = (DataInputStream) (this.field_i.field_e);
          }
          if (1 == this.field_j) {
            var4 = (java.net.Socket) (this.field_h.field_e);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_l.getFile() + "\n\n"));
            var3.write(bc.a((byte) -6, var5));
            this.field_a = new DataInputStream(var4.getInputStream());
          }
          this.field_g.field_k = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_j = this.field_j + 1;
          if (null == this.field_k) {
            this.field_k = this.field_c.a(5, (Runnable) (this), 72);
          }
          if (this.field_k.field_f == 0) {
            return false;
          }
          if (param0 >= 72) {
            if (this.field_k.field_f == 1) {
              return false;
            }
            this.finalize();
            this.field_j = this.field_j + 1;
            return false;
          }
          this.finalize();
          if (this.field_k.field_f == 1) {
            return false;
          }
          this.finalize();
          this.field_j = this.field_j + 1;
          return false;
        }
        if (null == this.field_k) {
          this.field_k = this.field_c.a(5, (Runnable) (this), 72);
        }
        if (this.field_k.field_f == 0) {
          return false;
        }
        if (param0 < 72) {
          this.finalize();
        }
        if (this.field_k.field_f != 1) {
          this.finalize();
          this.field_j = this.field_j + 1;
        }
        return false;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        ob.field_u = null;
        w.field_V = null;
        rf.field_c = 0;
        var2 = ga.field_e;
        ga.field_e = fj.field_T;
        fj.field_T = var2;
        if (param0 > 8) {
          rj.field_d.field_e = rj.field_d.field_e + 1;
          if (param1 == 51) {
            rj.field_d.field_b = 2;
          } else {
            if (param1 != 50) {
              rj.field_d.field_b = 1;
            } else {
              rj.field_d.field_b = 5;
            }
          }
          if (rj.field_d.field_e >= 2 &&
            param1 == 51) {
            return 2;
          }
          if (rj.field_d.field_e >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (rj.field_d.field_e < 4) {
            return -1;
          }
          return 1;
        }
        field_b = (String) null;
        rj.field_d.field_e = rj.field_d.field_e + 1;
        if (param1 == 51) {
          rj.field_d.field_b = 2;
          if (rj.field_d.field_e >= 2) {
            if (param1 == 51) {
              return 2;
            }
            if (rj.field_d.field_e >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (rj.field_d.field_e < 4) {
              return -1;
            }
            return 1;
          }
          if (rj.field_d.field_e < 2) {
            if (rj.field_d.field_e < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 50) {
            return 5;
          }
        } else {
          if (param1 != 50) {
            rj.field_d.field_b = 1;
          } else {
            rj.field_d.field_b = 5;
          }
          if (rj.field_d.field_e >= 2 &&
            param1 == 51) {
            return 2;
          }
          if (rj.field_d.field_e >= 2 &&
            param1 == 50) {
            return 5;
          }
        }
        if (rj.field_d.field_e >= 4) {
          return 1;
        }
        return -1;
    }

    final static int a(int param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -55 % ((-73 - param1) / 38);
          stackIn_1_0 = rd.a(8058, true, param2, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ej.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
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
          var4 = TrackController.field_F ? 1 : 0;
          try {
            while (this.field_g.field_k < this.field_g.field_j.length) {
              var1_int = this.field_a.read(this.field_g.field_j, this.field_g.field_k, -this.field_g.field_k + this.field_g.field_j.length);
              if (var1_int >= 0) {
                this.field_g.field_k = this.field_g.field_k + var1_int;
                continue;
              }
              break;
            }
            if (this.field_g.field_j.length == this.field_g.field_k) {
              throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_j.length + " " + this.field_l));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_j = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_j = this.field_j + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (null != this.field_i) {
          if (this.field_i.field_e != null) {
            try {
              ((DataInputStream) (this.field_i.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (null != this.field_h) {
          if (null != this.field_h.field_e) {
            try {
              ((java.net.Socket) (this.field_h.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (this.field_a != null) {
          try {
            this.field_a.close();
          } catch (Exception exception) {
          }
          this.field_a = null;
        }
        this.field_k = null;
    }

    public static void b(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 != 17) {
          field_e = (mk) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    ej(uf param0, java.net.URL param1, int param2) {
        try {
          this.field_l = param1;
          this.field_c = param0;
          this.field_g = new be(param2);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Use the arrow keys or mouse to move.";
        field_e = new mk();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
