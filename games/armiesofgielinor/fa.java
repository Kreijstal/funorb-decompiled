/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa implements Runnable {
    static String field_d;
    private java.net.URL field_b;
    private wo field_l;
    private wo field_a;
    private PacketBuffer field_o;
    private int field_n;
    static int[] field_k;
    static String field_c;
    static int field_j;
    static String field_g;
    private hd field_h;
    static String field_f;
    static String field_e;
    private wo field_i;
    private DataInputStream field_m;

    protected final void finalize() {
        if (this.field_a != null) {
          if (this.field_a.field_f != null) {
            try {
              ((DataInputStream) (this.field_a.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (null != this.field_i) {
          if (null != this.field_i.field_f) {
            try {
              ((java.net.Socket) (this.field_i.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (null != this.field_m) {
          try {
            this.field_m.close();
          } catch (Exception exception) {
          }
          this.field_m = null;
        }
        this.field_l = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_n >= 2) {
          return true;
        }
        if (this.field_n == 0) {
          if (this.field_a == null) {
            this.field_a = this.field_h.a(this.field_b, false);
          }
          if (0 == this.field_a.field_g) {
            return false;
          }
          if (this.field_a.field_g != 1) {
            this.field_n = this.field_n + 1;
            this.field_a = null;
            return false;
          }
        }
        if (this.field_n == 1) {
          if (null == this.field_i) {
            this.field_i = this.field_h.a(443, (byte) 124, this.field_b.getHost());
          }
          if (this.field_i.field_g == 0) {
            return false;
          }
          if (1 != this.field_i.field_g) {
            this.field_i = null;
            this.field_n = this.field_n + 1;
            return false;
          }
        }
        if (null != this.field_m) {
          if (this.field_l == null) {
            this.field_l = this.field_h.a(5, 0, (Runnable) (this));
          }
          if (param0 == this.field_l.field_g) {
            return false;
          }
          if (this.field_l.field_g == 1) {
            return false;
          }
          this.finalize();
          this.field_n = this.field_n + 1;
          return false;
        }
        try {
          if (this.field_n == 0) {
            this.field_m = (DataInputStream) (this.field_a.field_f);
          }
          if (1 == this.field_n) {
            var4 = (java.net.Socket) (this.field_i.field_f);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
            var3.write(nr.a(var5, false));
            this.field_m = new DataInputStream(var4.getInputStream());
          }
          this.field_o.position = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_n = this.field_n + 1;
          if (this.field_l != null) {
            if (param0 == this.field_l.field_g) {
              return false;
            }
            if (this.field_l.field_g == 1) {
              return false;
            }
            this.finalize();
            this.field_n = this.field_n + 1;
            return false;
          }
          this.field_l = this.field_h.a(5, 0, (Runnable) (this));
          if (param0 == this.field_l.field_g) {
            return false;
          }
          if (this.field_l.field_g == 1) {
            return false;
          }
          this.finalize();
          this.field_n = this.field_n + 1;
          return false;
        }
        if (this.field_l == null) {
          this.field_l = this.field_h.a(5, 0, (Runnable) (this));
        }
        if (param0 == this.field_l.field_g) {
          return false;
        }
        if (this.field_l.field_g != 1) {
          this.finalize();
          this.field_n = this.field_n + 1;
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
          var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            while (this.field_o.payload.length > this.field_o.position) {
              var1_int = this.field_m.read(this.field_o.payload, this.field_o.position, -this.field_o.position + this.field_o.payload.length);
              if (0 <= var1_int) {
                this.field_o.position = this.field_o.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_o.position == this.field_o.payload.length) {
              throw fa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_o.payload.length + " " + this.field_b));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_n = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_n = this.field_n + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PacketBuffer a(int param0) {
        if (param0 != this.field_n) {
          return null;
        }
        return this.field_o;
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 < 48) {
          return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    fa(hd param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param0;
          this.field_b = param1;
          this.field_o = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Name is available";
        field_k = new int[8192];
        field_j = -1;
        field_g = "Escort all allied leaders to the map exit.";
        field_c = "Hide game chat";
        field_e = "Offer unrated rematch";
        field_f = "(Guard)";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
