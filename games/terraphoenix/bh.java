/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bh implements Runnable {
    private int field_c;
    private dh field_i;
    private DataInputStream field_m;
    private java.net.URL field_l;
    static boolean field_f;
    private mf field_n;
    private mf field_g;
    static String field_j;
    static boolean[] field_e;
    private mf field_k;
    private he field_o;
    static int field_a;
    static String field_h;
    static String field_b;
    static String field_d;

    final dh a(int param0) {
        int var2 = 31 % ((param0 - 15) / 56);
        if (this.field_c == 3) {
          return this.field_i;
        }
        return null;
    }

    final static void b(int param0) {
        fh.field_g = false;
        if (param0 >= -22) {
          return;
        }
        mk.field_j.a(-16384);
    }

    protected final void finalize() {
        if (null != this.field_n) {
          if (null != this.field_n.field_e) {
            try {
              ((DataInputStream) (this.field_n.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_n = null;
        }
        if (null != this.field_g) {
          if (null != this.field_g.field_e) {
            try {
              ((java.net.Socket) (this.field_g.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (null != this.field_m) {
          try {
            this.field_m.close();
          } catch (Exception exception) {
          }
          this.field_m = null;
        }
        this.field_k = null;
    }

    bh(he param0, java.net.URL param1, int param2) {
        try {
          this.field_o = param0;
          this.field_l = param1;
          this.field_i = new dh(param2);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (param0 <= 22) {
          field_j = (String) null;
        }
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == 0) {
          if (null == this.field_n) {
            this.field_n = this.field_o.a(this.field_l, 111);
          }
          if (this.field_n.field_d == 0) {
            return false;
          }
          if (this.field_n.field_d != 1) {
            this.field_c = this.field_c + 1;
            this.field_n = null;
            return false;
          }
        }
        if (this.field_c == 1) {
          if (null == this.field_g) {
            this.field_g = this.field_o.a(443, this.field_l.getHost(), (byte) 60);
          }
          if (0 == this.field_g.field_d) {
            return false;
          }
          if (this.field_g.field_d != 1) {
            this.field_g = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (null == this.field_m) {
          try {
            if (this.field_c == 0) {
              this.field_m = (DataInputStream) (this.field_n.field_e);
            }
            if (this.field_c == 1) {
              var4 = (java.net.Socket) (this.field_g.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_l.getFile() + "\n\n"));
              var3.write(ma.a(-32396, var5));
              this.field_m = new DataInputStream(var4.getInputStream());
            }
            this.field_i.field_k = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (this.field_k == null) {
              this.field_k = this.field_o.a((Runnable) (this), (byte) -21, 5);
            }
            if (this.field_k.field_d == 0) {
              return false;
            }
            if (this.field_k.field_d == 1) {
              return false;
            }
            this.finalize();
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (this.field_k == null) {
          this.field_k = this.field_o.a((Runnable) (this), (byte) -21, 5);
        }
        if (this.field_k.field_d == 0) {
          return false;
        }
        if (this.field_k.field_d != 1) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
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
          var4 = Terraphoenix.field_V;
          try {
            while (this.field_i.field_i.length > this.field_i.field_k) {
              var1_int = this.field_m.read(this.field_i.field_i, this.field_i.field_k, this.field_i.field_i.length - this.field_i.field_k);
              if (var1_int >= 0) {
                this.field_i.field_k = this.field_i.field_k + var1_int;
                continue;
              }
              break;
            }
            if (this.field_i.field_i.length == this.field_i.field_k) {
              throw bh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_i.length + " " + this.field_l));
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

    public static void b(byte param0) {
        if (param0 >= 29) {
          field_d = null;
          field_e = null;
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        }
        bh.b(115);
        field_d = null;
        field_e = null;
        field_b = null;
        field_j = null;
        field_h = null;
    }

    static {
        field_a = 3;
        field_e = new boolean[112];
        field_j = "Out of stock";
        field_b = "ACT II: ";
        field_f = false;
        field_h = "Confirm Email:";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
