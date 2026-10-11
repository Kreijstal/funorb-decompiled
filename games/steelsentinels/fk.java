/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fk implements Runnable {
    private wj field_g;
    static String field_f;
    private DataInputStream field_r;
    static SceneWidget field_q;
    private PacketBuffer field_b;
    private wj field_s;
    static String field_p;
    static GameplayController field_i;
    private int field_j;
    static fh field_d;
    static String field_n;
    private java.net.URL field_k;
    private pn field_m;
    private wj field_o;
    static boolean field_h;
    static boolean field_c;
    static String field_l;
    static String field_a;
    static int field_e;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = SteelSentinels.obfuscationControl;
          try {
            while (this.field_b.payload.length > this.field_b.position) {
              var1_int = this.field_r.read(this.field_b.payload, this.field_b.position, -this.field_b.position + this.field_b.payload.length);
              if (0 <= var1_int) {
                this.field_b.position = this.field_b.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_b.position == this.field_b.payload.length) {
              throw fk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_b.payload.length + " " + this.field_k));
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

    final PacketBuffer b(int param0) {
        if (this.field_j == param0) {
          return this.field_b;
        }
        return null;
    }

    final static boolean a(int param0) {
        if (param0 == 0) {
          return null != kc.field_y ? true : false;
        }
        fk.a(-111);
        return null != kc.field_y ? true : false;
    }

    public static void a(byte param0) {
        field_p = null;
        field_a = null;
        if (param0 == -64) {
          field_q = null;
          field_d = null;
          field_i = null;
          field_f = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    fk(pn param0, java.net.URL param1, int param2) {
        try {
          this.field_m = param0;
          this.field_k = param1;
          this.field_b = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static SceneWidget b(byte param0) {
        if (param0 < 13) {
          return (SceneWidget) null;
        }
        return mj.field_Sb.field_Ub;
    }

    final synchronized boolean c(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_j >= 2) {
          return true;
        }
        if (0 == this.field_j) {
          if (null == this.field_o) {
            this.field_o = this.field_m.a(this.field_k, 112);
          }
          if (0 == this.field_o.field_a) {
            return false;
          }
          if (1 != this.field_o.field_a) {
            this.field_o = null;
            this.field_j = this.field_j + 1;
            return false;
          }
        }
        if (1 == this.field_j) {
          if (null == this.field_g) {
            this.field_g = this.field_m.a(this.field_k.getHost(), 443, param0 + 376255346);
          }
          if (this.field_g.field_a == 0) {
            return false;
          }
          if (this.field_g.field_a != 1) {
            this.field_g = null;
            this.field_j = this.field_j + 1;
            return false;
          }
        }
        if (this.field_r != null) {
          if (null == this.field_s) {
            this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
          }
          if (0 == this.field_s.field_a) {
            return false;
          }
          if (param0 == ~this.field_s.field_a) {
            return false;
          }
          this.finalize();
          this.field_j = this.field_j + 1;
          return false;
        }
        try {
          if (0 == this.field_j) {
            this.field_r = (DataInputStream) (this.field_o.field_c);
          }
          if (this.field_j == 1) {
            var4 = (java.net.Socket) (this.field_g.field_c);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_k.getFile() + "\n\n"));
            var3.write(km.a(param0 - 88, var5));
            this.field_r = new DataInputStream(var4.getInputStream());
          }
          this.field_b.position = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_j = this.field_j + 1;
          if (null == this.field_s) {
            this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
          }
          if (0 == this.field_s.field_a) {
            return false;
          }
          if (param0 == ~this.field_s.field_a) {
            return false;
          }
          this.finalize();
          this.field_j = this.field_j + 1;
          return false;
        }
        if (null == this.field_s) {
          this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
        }
        if (0 == this.field_s.field_a) {
          return false;
        }
        if (param0 != ~this.field_s.field_a) {
          this.finalize();
          this.field_j = this.field_j + 1;
        }
        return false;
    }

    protected final void finalize() {
        if (null != this.field_o) {
          if (null != this.field_o.field_c) {
            try {
              ((DataInputStream) (this.field_o.field_c)).close();
            } catch (Exception exception) {
            }
          }
          this.field_o = null;
        }
        if (null != this.field_g) {
          if (this.field_g.field_c != null) {
            try {
              ((java.net.Socket) (this.field_g.field_c)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (this.field_r != null) {
          try {
            this.field_r.close();
          } catch (Exception exception) {
          }
          this.field_r = null;
        }
        this.field_s = null;
    }

    static {
        field_f = "Campaigns";
        field_n = "Remove <%0> from ignore list";
        field_p = "<%0> has left the lobby.";
        field_c = false;
        field_l = "MELEE";
        field_e = 0;
        field_a = "This is <%0>'s RuneScape clan if they have one.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
