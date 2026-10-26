/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    static String[] field_b;
    private PacketBuffer field_a;
    private java.net.URL field_j;
    private DataInputStream field_g;
    static int field_i;
    private rk field_d;
    private en field_h;
    private en field_e;
    private en field_f;
    private int field_c;

    protected final void finalize() {
        if (null != this.field_f) {
          if (this.field_f.field_f != null) {
            try {
              ((DataInputStream) (this.field_f.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_e) {
          if (this.field_e.field_f != null) {
            try {
              ((java.net.Socket) (this.field_e.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_g != null) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_h = null;
    }

    final PacketBuffer a(boolean param0) {
        if (!param0) {
          return (PacketBuffer) null;
        }
        if (3 != this.field_c) {
          return null;
        }
        return this.field_a;
    }

    final synchronized boolean a(byte param0) {
        if (this.field_c >= 2) {
          return true;
        }
        if (0 == this.field_c) {
          if (null == this.field_f) {
            this.field_f = this.field_d.a((byte) 71, this.field_j);
          }
          if (this.field_f.field_a == 0) {
            return false;
          }
          if (this.field_f.field_a != 1) {
            this.field_f = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        int var2 = -109 % ((11 - param0) / 36);
        if (this.field_c == 1) {
          if (this.field_e == null) {
            this.field_e = this.field_d.a(2, this.field_j.getHost(), 443);
          }
          if (this.field_e.field_a == 0) {
            return false;
          }
          if (this.field_e.field_a != 1) {
            this.field_c = this.field_c + 1;
            this.field_e = null;
            return false;
          }
        }
        if (null != this.field_g) {
          if (null == this.field_h) {
            this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
          }
          if (this.field_h.field_a == 0) {
            return false;
          }
          if (this.field_h.field_a == 1) {
            return false;
          }
          this.finalize();
          this.field_c = this.field_c + 1;
          return false;
        }
        try {
          if (this.field_c == 0) {
            this.field_g = (DataInputStream) (this.field_f.field_f);
          }
          if (this.field_c == 1) {
            java.net.Socket var5 = (java.net.Socket) (this.field_e.field_f);
            var5.setSoTimeout(10000);
            OutputStream var4 = var5.getOutputStream();
            var4.write(17);
            CharSequence var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
            var4.write(fa.a(var6, 8482));
            this.field_g = new DataInputStream(var5.getInputStream());
          }
          this.field_a.position = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          IOException var3 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_c = this.field_c + 1;
          if (null == this.field_h) {
            this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
          }
          if (this.field_h.field_a == 0) {
            return false;
          }
          if (this.field_h.field_a != 1) {
            this.finalize();
            this.field_c = this.field_c + 1;
          }
          return false;
        }
        if (null == this.field_h) {
          this.field_h = this.field_d.a(5, 1048576, (Runnable) (this));
        }
        if (this.field_h.field_a == 0) {
          return false;
        }
        if (this.field_h.field_a != 1) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 != -2) {
          cc.a(-19);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void run() {
        try {
          Object var1 = null;
          Throwable var3 = null;
          int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            while (this.field_a.position < this.field_a.payload.length) {
              int var1_int = this.field_g.read(this.field_a.payload, this.field_a.position, -this.field_a.position + this.field_a.payload.length);
              if (0 <= var1_int) {
                this.field_a.position = this.field_a.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_a.position == this.field_a.payload.length) {
              throw cc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.payload.length + " " + this.field_j));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_c = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            Object var2 = this;
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

    cc(rk param0, java.net.URL param1, int param2) {
        try {
          this.field_d = param0;
          this.field_j = param1;
          this.field_a = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
