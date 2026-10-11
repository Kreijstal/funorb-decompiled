/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tca implements Runnable {
    static int field_f;
    static String field_b;
    private ht field_d;
    private lu field_h;
    private java.net.URL field_i;
    static sna field_c;
    private eh field_g;
    private DataInputStream field_l;
    static vr field_m;
    static String field_a;
    private eh field_j;
    private int field_e;
    private eh field_k;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = BachelorFridge.field_y;
          try {
            while (this.field_h.field_h.length > this.field_h.field_g) {
              var1_int = this.field_l.read(this.field_h.field_h, this.field_h.field_g, -this.field_h.field_g + this.field_h.field_h.length);
              if (var1_int >= 0) {
                this.field_h.field_g = this.field_h.field_g + var1_int;
                continue;
              }
              break;
            }
            if (this.field_h.field_g == this.field_h.field_h.length) {
              throw tca.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_h.length + " " + this.field_i));
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

    protected final void finalize() {
        if (this.field_j != null) {
          if (this.field_j.field_e != null) {
            try {
              ((DataInputStream) (this.field_j.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (null != this.field_g) {
          if (this.field_g.field_e != null) {
            try {
              ((java.net.Socket) (this.field_g.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (null != this.field_l) {
          try {
            this.field_l.close();
          } catch (Exception exception) {
          }
          this.field_l = null;
        }
        this.field_k = null;
    }

    final synchronized boolean b(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_e >= 2) {
          return true;
        }
        if (this.field_e == 0) {
          if (this.field_j == null) {
            this.field_j = this.field_d.a(this.field_i, 97);
          }
          if (this.field_j.field_f == 0) {
            return false;
          }
          if (this.field_j.field_f != 1) {
            this.field_e = this.field_e + 1;
            this.field_j = null;
            return false;
          }
        }
        if (this.field_e == 1) {
          if (this.field_g == null) {
            this.field_g = this.field_d.a((byte) 122, this.field_i.getHost(), 443);
          }
          if (this.field_g.field_f == 0) {
            return false;
          }
          if (this.field_g.field_f != 1) {
            this.field_e = this.field_e + 1;
            this.field_g = null;
            return false;
          }
        }
        if (null == this.field_l) {
          try {
            if (this.field_e == 0) {
              this.field_l = (DataInputStream) (this.field_j.field_e);
            }
            if (this.field_e == 1) {
              var4 = (java.net.Socket) (this.field_g.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"));
              var3.write(bv.a(18019, var5));
              this.field_l = new DataInputStream(var4.getInputStream());
            }
            this.field_h.field_g = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_e = this.field_e + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (this.field_k == null) {
              this.field_k = this.field_d.a((Runnable) (this), 2, 5);
            }
            if (param0 <= 119) {
              return true;
            }
            if (0 == this.field_k.field_f) {
              return false;
            }
            if (this.field_k.field_f == 1) {
              return false;
            }
            this.finalize();
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (this.field_k == null) {
          this.field_k = this.field_d.a((Runnable) (this), 2, 5);
        }
        if (param0 <= 119) {
          return true;
        }
        if (0 == this.field_k.field_f) {
          return false;
        }
        if (this.field_k.field_f != 1) {
          this.finalize();
          this.field_e = this.field_e + 1;
        }
        return false;
    }

    final lu a(int param0) {
        if (param0 != -11514) {
          tca.a((byte) 18);
          if (this.field_e == 3) {
            return this.field_h;
          }
          return null;
        }
        if (this.field_e == 3) {
          return this.field_h;
        }
        return null;
    }

    public static void a(byte param0) {
        if (param0 != -84) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_m = null;
    }

    tca(ht param0, java.net.URL param1, int param2) {
        try {
          this.field_i = param1;
          this.field_d = param0;
          this.field_h = new lu(param2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(gea param0, int param1, int param2) {
        pf var5 = sja.field_fb;
        var5.c(param2, (byte) 102);
        var5.field_g = var5.field_g + 1;
        int var4 = var5.field_g;
        var5.d(1, 0);
        var5.d(param0.field_i, 0);
        var5.c((byte) 110, param0.field_m);
        var5.e(param0.field_o, -1615464796);
        var5.e(param0.field_j, param1 - 1615464801);
        var5.e(param0.field_k, -1615464796);
        if (param1 != 5) {
          return;
        }
        try {
          var5.e(param0.field_h, -1615464796);
          var5.a(var4, 19);
          var5.b((byte) 124, -var4 + var5.field_g);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tca.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Day";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
