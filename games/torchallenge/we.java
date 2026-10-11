/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we implements Runnable {
    private mi field_k;
    static bf[] field_i;
    static ka[] field_m;
    private mi field_g;
    private mi field_n;
    static ge[] field_o;
    static int field_f;
    static ka[][] field_e;
    private uj field_b;
    private java.net.URL field_h;
    static String[][] field_c;
    private uf field_d;
    private DataInputStream field_a;
    static int[] field_l;
    private int field_p;
    static int field_j;

    protected final void finalize() {
        if (this.field_k != null) {
          if (null != this.field_k.field_g) {
            try {
              ((DataInputStream) (this.field_k.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_k = null;
        }
        if (null != this.field_g) {
          if (null != this.field_g.field_g) {
            try {
              ((java.net.Socket) (this.field_g.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (this.field_a != null) {
          try {
            this.field_a.close();
          } catch (Exception exception) {
          }
          this.field_a = null;
        }
        this.field_n = null;
    }

    final static e a(nc param0, int param1) {
        e var2 = null;
        RuntimeException var2_ref = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new e(param0, param0);
          tj.field_e.a(var2, param1 - 6300);
          if (param1 != 6222) {
            we.b(false);
          }
          mj.field_a.a(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("we.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_p >= 2) {
          return true;
        }
        if (0 == this.field_p) {
          if (null == this.field_k) {
            this.field_k = this.field_b.a(this.field_h, -125);
          }
          if (this.field_k.field_d == 0) {
            return false;
          }
          if (this.field_k.field_d != 1) {
            this.field_k = null;
            this.field_p = this.field_p + 1;
            return false;
          }
        }
        if (this.field_p == 1) {
          if (this.field_g == null) {
            this.field_g = this.field_b.a(443, this.field_h.getHost(), 431890200);
          }
          if (0 == this.field_g.field_d) {
            return false;
          }
          if (this.field_g.field_d != 1) {
            this.field_p = this.field_p + 1;
            this.field_g = null;
            return false;
          }
        }
        if (null == this.field_a) {
          try {
            if (this.field_p == 0) {
              this.field_a = (DataInputStream) (this.field_k.field_g);
            }
            if (this.field_p == 1) {
              var4 = (java.net.Socket) (this.field_g.field_g);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
              var3.write(pi.a(var5, 353));
              this.field_a = new DataInputStream(var4.getInputStream());
            }
            this.field_d.field_q = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_p = this.field_p + 1;
          }
        }
        if (null == this.field_n) {
          this.field_n = this.field_b.a((Runnable) (this), true, 5);
        }
        if (this.field_n.field_d == 0) {
          return false;
        }
        if (this.field_n.field_d != 1) {
          this.finalize();
          this.field_p = this.field_p + 1;
        }
        if (!param0) {
          return true;
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
          var4 = TorChallenge.field_F ? 1 : 0;
          try {
            while (this.field_d.field_q < this.field_d.field_m.length) {
              var1_int = this.field_a.read(this.field_d.field_m, this.field_d.field_q, -this.field_d.field_q + this.field_d.field_m.length);
              if (var1_int >= 0) {
                this.field_d.field_q = this.field_d.field_q + var1_int;
                continue;
              }
              break;
            }
            if (this.field_d.field_q == this.field_d.field_m.length) {
              throw we.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_m.length + " " + this.field_h));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_p = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_p = this.field_p + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          we.b(false);
          if (TorChallenge.field_H == null) {
            return false;
          }
          if (TorChallenge.field_H.f((byte) 123) != null) {
            return true;
          }
          return false;
        }
        if (TorChallenge.field_H == null) {
          return false;
        }
        if (TorChallenge.field_H.f((byte) 123) != null) {
          return true;
        }
        return false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -60 % ((-25 - param2) / 38);
        int var4 = 0;
        var4 = (-((param0 + 1) * param0) + param1 * (1 + param1)) / (2 * param0);
        return var4;
    }

    we(uj param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param1;
          this.field_b = param0;
          this.field_d = new uf(param2);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final uf b(int param0) {
        if (3 == this.field_p) {
          return this.field_d;
        }
        int var2 = -78 % ((param0 - 79) / 33);
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        field_m = null;
        if (param0 == 25910) {
          field_e = (ka[][]) null;
          field_i = null;
          field_c = (String[][]) null;
          field_o = null;
          return;
        }
        we.b(true);
        field_e = (ka[][]) null;
        field_i = null;
        field_c = (String[][]) null;
        field_o = null;
    }

    static {
        field_e = new ka[6][2];
        field_l = new int[]{0, 1, 4, 1, 1, 1, 1, 1};
        field_f = 0;
        field_j = -1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
