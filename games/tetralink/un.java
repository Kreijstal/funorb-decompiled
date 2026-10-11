/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class un implements Runnable {
    private vl field_i;
    private ie field_a;
    static int[] field_j;
    private vl field_b;
    private DataInputStream field_d;
    private vl field_h;
    private java.net.URL field_e;
    static long field_f;
    private bh field_g;
    private int field_c;

    final synchronized boolean b(byte param0) {
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        var2 = 21 / ((59 - param0) / 58);
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == 0) {
          if (null == this.field_h) {
            this.field_h = this.field_a.a(false, this.field_e);
          }
          if (0 == this.field_h.field_d) {
            return false;
          }
          if (this.field_h.field_d != 1) {
            this.field_c = this.field_c + 1;
            this.field_h = null;
            return false;
          }
        }
        if (this.field_c == 1) {
          if (this.field_i == null) {
            this.field_i = this.field_a.a(443, this.field_e.getHost(), (byte) 112);
          }
          if (0 == this.field_i.field_d) {
            return false;
          }
          if (this.field_i.field_d != 1) {
            this.field_c = this.field_c + 1;
            this.field_i = null;
            return false;
          }
        }
        if (null == this.field_d) {
          try {
            if (this.field_c == 0) {
              this.field_d = (DataInputStream) (this.field_h.field_f);
            }
            if (this.field_c == 1) {
              var5 = (java.net.Socket) (this.field_i.field_f);
              var5.setSoTimeout(10000);
              var4 = var5.getOutputStream();
              var4.write(17);
              var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_e.getFile() + "\n\n"));
              var4.write(q.a(-125, var6));
              this.field_d = new DataInputStream(var5.getInputStream());
            }
            this.field_g.field_t = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
          }
        }
        if (this.field_b == null) {
          this.field_b = this.field_a.a((Runnable) (this), -106, 5);
        }
        if (this.field_b.field_d == 0) {
          return false;
        }
        if (1 == this.field_b.field_d) {
          return false;
        }
        this.finalize();
        this.field_c = this.field_c + 1;
        return false;
    }

    public static void a(int param0) {
        if (param0 != -2) {
          field_j = (int[]) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    final bh a(byte param0) {
        if (this.field_c == 3) {
          return this.field_g;
        }
        if (param0 != 79) {
          this.a((byte) -122);
          return null;
        }
        return null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = TetraLink.field_J;
          try {
            while (this.field_g.field_u.length > this.field_g.field_t) {
              var1_int = this.field_d.read(this.field_g.field_u, this.field_g.field_t, this.field_g.field_u.length - this.field_g.field_t);
              if (var1_int >= 0) {
                this.field_g.field_t = this.field_g.field_t + var1_int;
                continue;
              }
              break;
            }
            if (this.field_g.field_t == this.field_g.field_u.length) {
              throw un.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_u.length + " " + this.field_e));
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

    un(ie param0, java.net.URL param1, int param2) {
        try {
          this.field_e = param1;
          this.field_a = param0;
          this.field_g = new bh(param2);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "un.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static ig a(int param0, ah param1, int param2, int param3, ah param4) {
        RuntimeException var5 = null;
        ig stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ig stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -29082) {
            stackIn_2_0 = (ig) null;
            return stackIn_2_0;
          }
          if (ia.a(param3, param4, param2, -58)) {
            stackIn_7_0 = fa.a(param0 + 28748, param1.a(param0 + 28976, param3, param2));
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ig) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("un.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    protected final void finalize() {
        if (null != this.field_h) {
          if (null != this.field_h.field_f) {
            try {
              ((DataInputStream) (this.field_h.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (null != this.field_i) {
          if (this.field_i.field_f != null) {
            try {
              ((java.net.Socket) (this.field_i.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (this.field_d != null) {
          try {
            this.field_d.close();
          } catch (Exception exception) {
          }
          this.field_d = null;
        }
        this.field_b = null;
    }

    static {
        field_j = new int[5];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
