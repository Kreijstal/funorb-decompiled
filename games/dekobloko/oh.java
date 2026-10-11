/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oh implements Runnable {
    static int field_n;
    static w field_d;
    private java.net.URL field_j;
    private mh field_h;
    private DataInputStream field_g;
    private int field_k;
    private wl field_a;
    static char[] field_f;
    private fd field_m;
    static boolean field_b;
    private mh field_l;
    static ck field_e;
    static w field_i;
    static int[] field_c;
    private mh field_o;

    final wl a(boolean param0) {
        if (3 == this.field_k) {
          return this.field_a;
        }
        if (!param0) {
          return null;
        }
        this.field_k = -68;
        return null;
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_k) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_k == 0) {
          if (null == this.field_o) {
            this.field_o = this.field_m.a(this.field_j, (byte) 66);
          }
          if (this.field_o.field_c == 0) {
            return false;
          }
          if (this.field_o.field_c != 1) {
            this.field_o = null;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_k == 1) {
            if (this.field_h == null) {
              this.field_h = this.field_m.a(100, this.field_j.getHost(), 443);
            }
            if (this.field_h.field_c == 0) {
              return false;
            }
            if (1 != this.field_h.field_c) {
              this.field_k = this.field_k + 1;
              this.field_h = null;
              return false;
            }
          }
          if (null == this.field_g) {
            try {
              if (0 == this.field_k) {
                this.field_g = (DataInputStream) (this.field_o.field_b);
              }
              if (this.field_k == 1) {
                var4 = (java.net.Socket) (this.field_h.field_b);
                var4.setSoTimeout(10000);
                var3 = var4.getOutputStream();
                var3.write(17);
                var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
                var3.write(km.a(6216, var5));
                this.field_g = new DataInputStream(var4.getInputStream());
              }
              this.field_a.field_n = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_k = this.field_k + 1;
            }
          }
          if (param0 >= -89) {
            this.a(true);
          }
          if (null == this.field_l) {
            this.field_l = this.field_m.a((byte) 121, 5, (Runnable) (this));
          }
          if (0 == this.field_l.field_c) {
            return false;
          }
          if (this.field_l.field_c == 1) {
            return false;
          }
          this.finalize();
        }
        this.field_k = this.field_k + 1;
        return false;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -15192) {
            var3 = (String) null;
            oh.a((ji) null, -55, (String) null, (pl) null, (String) null);
          }
          stackIn_3_0 = lc.field_h.a(0, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
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
          var4 = client.field_A ? 1 : 0;
          try {
            while (this.field_a.field_n < this.field_a.field_r.length) {
              var1_int = this.field_g.read(this.field_a.field_r, this.field_a.field_n, -this.field_a.field_n + this.field_a.field_r.length);
              if (var1_int >= 0) {
                this.field_a.field_n = this.field_a.field_n + var1_int;
                continue;
              }
              break;
            }
            if (this.field_a.field_r.length == this.field_a.field_n) {
              throw oh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_r.length + " " + this.field_j));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_k = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_k = this.field_k + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
          return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(byte param0) {
        if (param0 != 13) {
          String var2 = (String) null;
          oh.a((String) null, -97);
        }
    }

    protected final void finalize() {
        if (null != this.field_o) {
          if (this.field_o.field_b != null) {
            try {
              ((DataInputStream) (this.field_o.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_o = null;
        }
        if (this.field_h != null) {
          if (this.field_h.field_b != null) {
            try {
              ((java.net.Socket) (this.field_h.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_h = null;
        }
        if (this.field_g != null) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_l = null;
    }

    final static ui a(ji param0, int param1, String param2, pl param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ui stackIn_2_0 = null;
        ui stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 91) {
            stackIn_2_0 = (ui) null;
            return stackIn_2_0;
          }
          var5_int = param0.b(param1 - 92, param2);
          var6 = param0.a(var5_int, param1 + 12939, param4);
          stackIn_4_0 = jg.a(true, param3, var6, var5_int, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oh.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    oh(fd param0, java.net.URL param1, int param2) {
        try {
          this.field_j = param1;
          this.field_m = param0;
          this.field_a = new wl(param2);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_n = 64;
        field_b = false;
        field_f = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
