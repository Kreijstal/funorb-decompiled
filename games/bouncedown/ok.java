/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ok {
    static int field_a;
    private RandomAccessFile field_d;
    private long field_b;
    private long field_e;
    static int[] field_c;

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.b(1337);
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 < 73) {
          ok.d(83);
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 20663) {
          return;
        }
        this.field_d.seek(param0);
        this.field_b = param0;
    }

    final long a(int param0) throws IOException {
        if (param0 < 87) {
          this.field_b = -16L;
          return this.field_d.length();
        }
        return this.field_d.length();
    }

    final void b(int param0) throws IOException {
        if (param0 != 1337) {
          return;
        }
        if (this.field_d != null) {
          this.field_d.close();
          this.field_d = null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (this.field_e < ((long)param2 + this.field_b)) {
          this.field_d.seek(this.field_e);
          this.field_d.write(1);
          throw new EOFException();
        }
        this.field_d.write(param3, param1, param2);
        if (param0 != 1) {
          return;
        }
        try {
          this.field_b = this.field_b + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ok.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int d(int param0) {
        if (param0 != 1) {
          return 83;
        }
        return cg.field_a;
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ma.a((byte) -22, var3) != 0L) {
              if (param1 >= -37) {
                ok.a(62, 7, 10, -75, 30);
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ok.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.read(param0, param2, param1);
          if (param3 > ~var5_int) {
            this.field_b = this.field_b + (long)var5_int;
          }
          stackIn_3_0 = var5_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ok.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ok(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_b = 0L;
          this.field_e = param2;
          var5_int = this.field_d.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 == 18938) {
          return jk.a(param1, 1, param3, -7139, param4, 1, 3, param2, 1);
        }
        ok.a(false, 11);
        return jk.a(param1, 1, param3, -7139, param4, 1, 3, param2, 1);
    }

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          ii var4 = null;
          ii var5 = null;
          int stackIn_13_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == ec.field_P) {
            ec.field_P = pj.field_c.a(gk.field_h, td.field_b, 0);
          }
          if (ec.field_P.field_f == 0) {
            return false;
          }
          dupTemp$1 = fa.a(73);
          wa.field_e = dupTemp$1;
          qe.field_k = dupTemp$1;
          if (ec.field_P.field_f == 1) {
            try {
              dh.field_a = new pc((java.net.Socket) (ec.field_P.field_e), pj.field_c);
              var4 = jc.field_g;
              var5 = var4;
              hh.field_p.field_h = 0;
              stackIn_13_0 = (!param0) ? -1 : -2;
              ak.field_z = stackIn_13_0;
              i.field_f = stackIn_13_0;
              ck.field_b = stackIn_13_0;
              pj.field_a = ga.field_c;
              var5.field_h = 0;
              fj.a(fi.field_b, 6, cf.field_a, hh.field_p, of.field_c);
              jj.a(-1, true);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              pj.field_a = ri.field_C;
              ec.field_P = null;
              if (param1 > 117) {
                return true;
              }
              ok.d(70);
              return true;
            }
            ec.field_P = null;
            if (param1 <= 117) {
              ok.d(70);
            }
            return true;
          }
          pj.field_a = ri.field_C;
          ec.field_P = null;
          if (param1 > 117) {
            return true;
          }
          ok.d(70);
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
