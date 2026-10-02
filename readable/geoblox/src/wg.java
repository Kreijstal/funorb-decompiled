/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    private java.net.URL field_h;
    static int field_e;
    private PlatformTaskDispatcher field_b;
    private int field_l;
    static int field_j;
    private qc field_n;
    static ji field_i;
    static int field_m;
    static ck field_d;
    private DataInputStream field_c;
    private PlatformTask field_k;
    private PlatformTask field_f;
    private PlatformTask field_g;
    static int field_a;

    final qc b(byte param0) {
        int var2 = 62 / ((param0 - 9) / 53);
        if (!(this.field_l != 3)) {
            return this.field_n;
        }
        return null;
    }

    protected final void finalize() {
        if (null != this.field_f) {
            if (!(this.field_f.result == null)) {
                try {
                    ((DataInputStream) (this.field_f.result)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (this.field_k != null) {
            if (null != this.field_k.result) {
                try {
                    ((java.net.Socket) (this.field_k.result)).close();
                } catch (Exception exception) {
                }
            }
            this.field_k = null;
        }
        if (!(null == this.field_c)) {
            try {
                this.field_c.close();
            } catch (Exception exception) {
            }
            this.field_c = null;
        }
        this.field_g = null;
    }

    public static void c(byte param0) {
        int var1 = 26 / ((param0 - 45) / 32);
        field_i = null;
        field_d = null;
    }

    final synchronized boolean a(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_l) {
          return true;
        }
        if (this.field_l == 0) {
          if (null == this.field_f) {
            this.field_f = this.field_b.a(-14, this.field_h);
          }
          if (0 == this.field_f.status) {
            return false;
          }
          if (1 != this.field_f.status) {
            this.field_l = this.field_l + 1;
            this.field_f = null;
            return false;
          }
        }
        if (this.field_l == 1) {
          if (this.field_k == null) {
            this.field_k = this.field_b.a(443, this.field_h.getHost(), false);
          }
          if (this.field_k.status == 0) {
            return false;
          }
          if (1 != this.field_k.status) {
            this.field_k = null;
            this.field_l = this.field_l + 1;
            return false;
          }
        }
        if (null == this.field_c) {
          try {
            if (this.field_l == 0) {
              this.field_c = (DataInputStream) (this.field_f.result);
            }
            if (this.field_l == 1) {
              var4 = (java.net.Socket) (this.field_k.result);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
              var3.write(jf.a(var5, (byte) 127));
              this.field_c = new DataInputStream(var4.getInputStream());
            }
            this.field_n.field_f = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_l = this.field_l + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_g) {
              this.field_g = this.field_b.startThread((Runnable) (this), 0, 5);
            }
            if (0 == this.field_g.status) {
              return false;
            }
            if (param0 != 45) {
              return false;
            }
            if (this.field_g.status == 1) {
              return false;
            }
            this.finalize();
            this.field_l = this.field_l + 1;
            return false;
          }
        }
        if (null == this.field_g) {
          this.field_g = this.field_b.startThread((Runnable) (this), 0, 5);
        }
        if (0 == this.field_g.status) {
          return false;
        }
        if (param0 != 45) {
          return false;
        }
        if (this.field_g.status != 1) {
          this.finalize();
          this.field_l = this.field_l + 1;
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
            var4 = Geoblox.field_C;
            try {
              L0: while (this.field_n.field_f < this.field_n.field_j.length) {
                var1_int = this.field_c.read(this.field_n.field_j, this.field_n.field_f, -this.field_n.field_f + this.field_n.field_j.length);
                if (0 <= var1_int) {
                  this.field_n.field_f = this.field_n.field_f + var1_int;
                  continue L0;
                }
                break;
              }
              if (this.field_n.field_j.length == this.field_n.field_f) {
                throw wg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_n.field_j.length + " " + this.field_h));
              }
              var1 = this;
              synchronized (var1) {
                this.finalize();
                this.field_l = 3;
              }
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                this.finalize();
                this.field_l = this.field_l + 1;
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        oc.field_c = param1;
        uh.field_y.b((int)((float)(64 * param1 / 80) * 1.399999976158142f), (byte) 22);
        if (param0 != -15346) {
            wg.a(-15, 68);
        }
    }

    wg(PlatformTaskDispatcher param0, java.net.URL param1, int param2) {
        try {
            this.field_b = param0;
            this.field_h = param1;
            this.field_n = new qc(param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = 5;
        field_j = 0;
        field_e = 50;
        field_d = new ck(4, 1, 1, 1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
