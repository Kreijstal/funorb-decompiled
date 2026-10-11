/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gg implements Runnable {
    private DataInputStream field_j;
    private bk field_k;
    private bk field_h;
    private ka field_l;
    static o field_i;
    private rb field_b;
    static hl[] field_f;
    static java.math.BigInteger field_e;
    static int[] field_d;
    private java.net.URL field_g;
    private int field_c;
    private bk field_a;

    protected final void finalize() {
        if (null != this.field_h) {
          if (this.field_h.field_f != null) {
            try {
              ((DataInputStream) (this.field_h.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (null != this.field_k) {
          if (this.field_k.field_f != null) {
            try {
              ((java.net.Socket) (this.field_k.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_k = null;
        }
        if (null != this.field_j) {
          try {
            this.field_j.close();
          } catch (Exception exception) {
          }
          this.field_j = null;
        }
        this.field_a = null;
    }

    final rb a(byte param0) {
        if (this.field_c == 3) {
          return this.field_b;
        }
        if (param0 <= 30) {
          this.c((byte) 115);
          return null;
        }
        return null;
    }

    final synchronized boolean c(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == 0) {
          if (null == this.field_h) {
            this.field_h = this.field_l.a((byte) -10, this.field_g);
          }
          if (this.field_h.field_b == 0) {
            return false;
          }
          if (this.field_h.field_b != 1) {
            this.field_c = this.field_c + 1;
            this.field_h = null;
            return false;
          }
        }
        if (param0 > -86) {
          this.field_l = (ka) null;
        }
        if (this.field_c == 1) {
          if (null == this.field_k) {
            this.field_k = this.field_l.a(443, -102, this.field_g.getHost());
          }
          if (0 == this.field_k.field_b) {
            return false;
          }
          if (1 != this.field_k.field_b) {
            this.field_k = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (null == this.field_j) {
          try {
            if (0 == this.field_c) {
              this.field_j = (DataInputStream) (this.field_h.field_f);
            }
            if (this.field_c == 1) {
              var4 = (java.net.Socket) (this.field_k.field_f);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_g.getFile() + "\n\n"));
              var3.write(ld.a((byte) -101, var5));
              this.field_j = new DataInputStream(var4.getInputStream());
            }
            this.field_b.field_g = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_a) {
              this.field_a = this.field_l.a(5, 104, (Runnable) (this));
            }
            if (this.field_a.field_b == 0) {
              return false;
            }
            if (this.field_a.field_b == 1) {
              return false;
            }
            this.finalize();
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (null == this.field_a) {
          this.field_a = this.field_l.a(5, 104, (Runnable) (this));
        }
        if (this.field_a.field_b == 0) {
          return false;
        }
        if (this.field_a.field_b != 1) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
        return false;
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 121) {
          return;
        }
        field_d = null;
        field_f = null;
        field_i = null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = StarCannon.field_A;
          try {
            while (this.field_b.field_f.length > this.field_b.field_g) {
              var1_int = this.field_j.read(this.field_b.field_f, this.field_b.field_g, -this.field_b.field_g + this.field_b.field_f.length);
              if (var1_int >= 0) {
                this.field_b.field_g = this.field_b.field_g + var1_int;
                continue;
              }
              break;
            }
            if (this.field_b.field_f.length == this.field_b.field_g) {
              throw gg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_b.field_f.length + " " + this.field_g));
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

    gg(ka param0, java.net.URL param1, int param2) {
        try {
          this.field_l = param0;
          this.field_g = param1;
          this.field_b = new rb(param2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = new o(14, 0, 4, 1);
        field_e = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
