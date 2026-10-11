/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private java.net.URL field_g;
    private DataInputStream field_k;
    static sd field_d;
    private wk field_c;
    private jj field_i;
    private wk field_h;
    private int field_e;
    private ed field_j;
    static int[] field_b;
    private wk field_a;
    static lg[] field_f;

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -68 % ((param1 - 30) / 50);
          stackIn_1_0 = tn.a(10, true, param0, -128);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("qb.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 10000) {
          CharSequence var5 = (CharSequence) null;
          qb.a((CharSequence) null, -15);
          return pk.a(1);
        }
        return pk.a(1);
    }

    protected final void finalize() {
        if (null != this.field_a) {
          if (this.field_a.field_d != null) {
            try {
              ((DataInputStream) (this.field_a.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (null != this.field_h) {
          if (this.field_h.field_d != null) {
            try {
              ((java.net.Socket) (this.field_h.field_d)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (null != this.field_k) {
          try {
            this.field_k.close();
          } catch (Exception exception) {
          }
          this.field_k = null;
        }
        this.field_c = null;
    }

    final ed a(int param0) {
        if (~this.field_e != param0) {
          return null;
        }
        return this.field_j;
    }

    final synchronized boolean b(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_e >= 2) {
          return true;
        }
        if (~this.field_e == param0) {
          if (this.field_a == null) {
            this.field_a = this.field_i.a(-90, this.field_g);
          }
          if (this.field_a.field_b == 0) {
            return false;
          }
          if (this.field_a.field_b != 1) {
            this.field_a = null;
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (this.field_e == 1) {
          if (null == this.field_h) {
            this.field_h = this.field_i.a(-82, 443, this.field_g.getHost());
          }
          if (this.field_h.field_b == 0) {
            return false;
          }
          if (this.field_h.field_b != 1) {
            this.field_e = this.field_e + 1;
            this.field_h = null;
            return false;
          }
        }
        if (null == this.field_k) {
          try {
            if (this.field_e == 0) {
              this.field_k = (DataInputStream) (this.field_a.field_d);
            }
            if (1 == this.field_e) {
              var4 = (java.net.Socket) (this.field_h.field_d);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_g.getFile() + "\n\n"));
              var3.write(bo.a(var5, -711));
              this.field_k = new DataInputStream(var4.getInputStream());
            }
            this.field_j.field_u = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_e = this.field_e + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_c) {
              this.field_c = this.field_i.a(5, (Runnable) (this), ~param0);
            }
            if (0 == this.field_c.field_b) {
              return false;
            }
            if (this.field_c.field_b == 1) {
              return false;
            }
            this.finalize();
            this.field_e = this.field_e + 1;
            return false;
          }
        }
        if (null == this.field_c) {
          this.field_c = this.field_i.a(5, (Runnable) (this), ~param0);
        }
        if (0 == this.field_c.field_b) {
          return false;
        }
        if (this.field_c.field_b != 1) {
          this.finalize();
          this.field_e = this.field_e + 1;
        }
        return false;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 == -3) {
          field_d = null;
          field_f = null;
          return;
        }
        qb.a(73, 2, true, 112);
        field_d = null;
        field_f = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          fj.a(cq.field_i, 811497217, param0, q.field_x, ug.field_b, 0, true);
          if (param1 != 2) {
            field_f = (lg[]) null;
          }
          for (var2_int = 0; cq.field_i > var2_int; var2_int++) {
            ac.field_I[var2_int + param0] = var2_int;
          }
          fj.a(cq.field_i + param0, 811497217, param0 + param0, f.field_y, id.field_d, param0, false);
          if (cq.field_i <= param0) {
            return;
          }
          cq.field_i = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "qb.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = Vertigo2.field_L ? 1 : 0;
          try {
            while (this.field_j.field_p.length > this.field_j.field_u) {
              var1_int = this.field_k.read(this.field_j.field_p, this.field_j.field_u, this.field_j.field_p.length - this.field_j.field_u);
              if (0 <= var1_int) {
                this.field_j.field_u = this.field_j.field_u + var1_int;
                continue;
              }
              break;
            }
            if (this.field_j.field_u == this.field_j.field_p.length) {
              throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_p.length + " " + this.field_g));
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

    qb(jj param0, java.net.URL param1, int param2) {
        try {
          this.field_i = param0;
          this.field_g = param1;
          this.field_j = new ed(param2);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = new lg[2];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
