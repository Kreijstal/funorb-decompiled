/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mm implements Runnable {
    static int field_g;
    static int field_d;
    private fj field_i;
    private rc field_f;
    private DataInputStream field_c;
    private rc field_a;
    private vh field_j;
    private int field_e;
    private rc field_b;
    private java.net.URL field_k;
    static boolean field_h;

    final fj a(boolean param0) {
        if (this.field_e == 3) {
          return this.field_i;
        }
        if (param0) {
          return null;
        }
        this.finalize();
        return null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = Torquing.field_u;
          try {
            while (this.field_i.field_j.length > this.field_i.field_n) {
              var1_int = this.field_c.read(this.field_i.field_j, this.field_i.field_n, this.field_i.field_j.length - this.field_i.field_n);
              if (var1_int >= 0) {
                this.field_i.field_n = this.field_i.field_n + var1_int;
                continue;
              }
              break;
            }
            if (this.field_i.field_j.length == this.field_i.field_n) {
              throw mm.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_j.length + " " + this.field_k));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_e = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_e = this.field_e + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (param0 != 60) {
          return;
        }
        qi.field_c = false;
        kj.field_d.i((byte) -101);
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_e >= 2) {
          return true;
        }
        if (this.field_e == 0) {
          if (this.field_f == null) {
            this.field_f = this.field_j.a(param0 ^ 3, this.field_k);
          }
          if (this.field_f.field_a == 0) {
            return false;
          }
          if (1 != this.field_f.field_a) {
            this.field_e = this.field_e + 1;
            this.field_f = null;
            return false;
          }
        }
        if (this.field_e == 1) {
          if (null == this.field_b) {
            this.field_b = this.field_j.a(this.field_k.getHost(), 443, -60);
          }
          if (this.field_b.field_a == 0) {
            return false;
          }
          if (this.field_b.field_a != 1) {
            this.field_e = this.field_e + 1;
            this.field_b = null;
            return false;
          }
        }
        if (null == this.field_c) {
          try {
            if (this.field_e == 0) {
              this.field_c = (DataInputStream) (this.field_f.field_d);
            }
            if (1 == this.field_e) {
              var4 = (java.net.Socket) (this.field_b.field_d);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_k.getFile() + "\n\n"));
              var3.write(vg.a(var5, (byte) -126));
              this.field_c = new DataInputStream(var4.getInputStream());
            }
            this.field_i.field_n = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_e = this.field_e + 1;
          }
        }
        if (param0 != 3) {
          return true;
        }
        if (this.field_a == null) {
          this.field_a = this.field_j.a((byte) -102, 5, (Runnable) (this));
        }
        if (this.field_a.field_a == 0) {
          return false;
        }
        if (this.field_a.field_a == 1) {
          return false;
        }
        this.finalize();
        this.field_e = this.field_e + 1;
        return false;
    }

    final static long a(CharSequence param0, byte param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + var6 - 65);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (48 <= var6 &&
                57 >= var6) {
                var2_long = var2_long + (long)(27 - (-var6 + 48));
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          if (param1 < 86) {
            field_h = false;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    protected final void finalize() {
        if (this.field_f != null) {
          if (null != this.field_f.field_d) {
            try {
              ((DataInputStream) (this.field_f.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_b) {
          if (this.field_b.field_d != null) {
            try {
              ((java.net.Socket) (this.field_b.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_b = null;
        }
        if (this.field_c != null) {
          try {
            this.field_c.close();
          } catch (Exception exception) {
          }
          this.field_c = null;
        }
        this.field_a = null;
    }

    mm(vh param0, java.net.URL param1, int param2) {
        try {
          this.field_j = param0;
          this.field_k = param1;
          this.field_i = new fj(param2);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = -1;
        field_h = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
