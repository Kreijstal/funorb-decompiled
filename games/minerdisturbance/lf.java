/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf implements Runnable {
    private java.net.URL field_h;
    static hb field_b;
    private ia field_d;
    private ia field_j;
    static String[][] field_i;
    private vf field_f;
    private ia field_e;
    private int field_c;
    private DataInputStream field_a;
    private sb field_g;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = MinerDisturbance.field_ab;
          try {
            while (this.field_g.field_o < this.field_g.field_u.length) {
              var1_int = this.field_a.read(this.field_g.field_u, this.field_g.field_o, this.field_g.field_u.length - this.field_g.field_o);
              if (var1_int >= 0) {
                this.field_g.field_o = this.field_g.field_o + var1_int;
                continue;
              }
              break;
            }
            if (this.field_g.field_u.length == this.field_g.field_o) {
              throw lf.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_u.length + " " + this.field_h));
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

    protected final void finalize() {
        if (this.field_d != null) {
          if (null != this.field_d.field_a) {
            try {
              ((DataInputStream) (this.field_d.field_a)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (this.field_e != null) {
          if (null != this.field_e.field_a) {
            try {
              ((java.net.Socket) (this.field_e.field_a)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_a != null) {
          try {
            this.field_a.close();
          } catch (Exception exception) {
          }
          this.field_a = null;
        }
        this.field_j = null;
    }

    final synchronized boolean a(byte param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (param0 < 47) {
          field_i = (String[][]) null;
        }
        if (this.field_c >= 2) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_c == 0) {
          if (null == this.field_d) {
            this.field_d = this.field_f.a((byte) -83, this.field_h);
          }
          if (this.field_d.field_c == 0) {
            return false;
          }
          if (this.field_d.field_c != 1) {
            this.field_d = null;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (1 == this.field_c) {
            if (null == this.field_e) {
              this.field_e = this.field_f.a(this.field_h.getHost(), 443, (byte) 15);
            }
            if (0 == this.field_e.field_c) {
              return false;
            }
            if (this.field_e.field_c != 1) {
              this.field_c = this.field_c + 1;
              this.field_e = null;
              return false;
            }
          }
          if (null == this.field_a) {
            try {
              if (this.field_c == 0) {
                this.field_a = (DataInputStream) (this.field_d.field_a);
              }
              if (this.field_c == 1) {
                var4 = (java.net.Socket) (this.field_e.field_a);
                var4.setSoTimeout(10000);
                var3 = var4.getOutputStream();
                var3.write(17);
                var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
                var3.write(ic.a(false, var5));
                this.field_a = new DataInputStream(var4.getInputStream());
              }
              this.field_g.field_o = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_c = this.field_c + 1;
            }
          }
          if (this.field_j == null) {
            this.field_j = this.field_f.a((Runnable) (this), (byte) 1, 5);
          }
          if (this.field_j.field_c == 0) {
            return false;
          }
          if (1 == this.field_j.field_c) {
            return false;
          }
          this.finalize();
        }
        this.field_c = this.field_c + 1;
        return false;
    }

    final sb a(int param0) {
        if (param0 != 0) {
          this.a(23);
          if (this.field_c == 3) {
            return this.field_g;
          }
          return null;
        }
        if (this.field_c == 3) {
          return this.field_g;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_i = (String[][]) null;
        field_b = null;
        if (param0) {
          lf.a(false);
        }
    }

    final static void a(int param0, we param1) {
        try {
          if (param0 != -673) {
            field_b = (hb) null;
          }
          wi.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "lf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lf(vf param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param1;
          this.field_f = param0;
          this.field_g = new sb(param2);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = new String[][]{new String[]{"See the ore stuck in the boulder? The quickest way to obtain it would be to plant an explosive next to the boulder. Press <img=19> to drop explosives or <img=21> to fire the rock blaster."}};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
