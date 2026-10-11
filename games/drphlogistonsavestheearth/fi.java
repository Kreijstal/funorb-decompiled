/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fi implements Runnable {
    private il field_c;
    private bl field_i;
    private DataInputStream field_a;
    private int field_g;
    static int[] field_h;
    private od field_j;
    private il field_f;
    private java.net.URL field_d;
    private il field_b;
    static he[] field_e;

    final static String a(int param0, byte param1, int param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (0 == param0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param0 == 1) {
            var10 = param3[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          if (param1 > -16) {
            stackIn_12_0 = (String) null;
            return stackIn_12_0;
          }
          var4_int = param2 + param0;
          var5 = 0;
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param3[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final od a(byte param0) {
        if (param0 < 121) {
          this.field_c = (il) null;
        }
        if (3 != this.field_g) {
          return null;
        }
        return this.field_j;
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 <= 100) {
          field_h = (int[]) null;
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            while (this.field_j.field_j < this.field_j.field_h.length) {
              var1_int = this.field_a.read(this.field_j.field_h, this.field_j.field_j, -this.field_j.field_j + this.field_j.field_h.length);
              if (var1_int >= 0) {
                this.field_j.field_j = this.field_j.field_j + var1_int;
                continue;
              }
              break;
            }
            if (this.field_j.field_j == this.field_j.field_h.length) {
              throw fi.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_h.length + " " + this.field_d));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_g = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_g = this.field_g + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_g) {
          return true;
        }
        if (0 == this.field_g) {
          if (null == this.field_c) {
            this.field_c = this.field_i.a(98, this.field_d);
          }
          if (this.field_c.field_b == 0) {
            return false;
          }
          if (1 != this.field_c.field_b) {
            this.field_g = this.field_g + 1;
            this.field_c = null;
            return false;
          }
        }
        if (param0 == this.field_g) {
          if (null == this.field_f) {
            this.field_f = this.field_i.a(this.field_d.getHost(), 443, 44);
          }
          if (this.field_f.field_b == 0) {
            return false;
          }
          if (this.field_f.field_b != 1) {
            this.field_g = this.field_g + 1;
            this.field_f = null;
            return false;
          }
        }
        if (null == this.field_a) {
          try {
            if (0 == this.field_g) {
              this.field_a = (DataInputStream) (this.field_c.field_g);
            }
            if (1 == this.field_g) {
              var4 = (java.net.Socket) (this.field_f.field_g);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
              var3.write(b.a((byte) -120, var5));
              this.field_a = new DataInputStream(var4.getInputStream());
            }
            this.field_j.field_j = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_g = this.field_g + 1;
          }
        }
        if (null == this.field_b) {
          this.field_b = this.field_i.a((Runnable) (this), 5, (byte) 28);
        }
        if (this.field_b.field_b == 0) {
          return false;
        }
        if (this.field_b.field_b == 1) {
          return false;
        }
        this.finalize();
        this.field_g = this.field_g + 1;
        return false;
    }

    protected final void finalize() {
        if (this.field_c != null) {
          if (null != this.field_c.field_g) {
            try {
              ((DataInputStream) (this.field_c.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_c = null;
        }
        if (this.field_f != null) {
          if (null != this.field_f.field_g) {
            try {
              ((java.net.Socket) (this.field_f.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_a) {
          try {
            this.field_a.close();
          } catch (Exception exception) {
          }
          this.field_a = null;
        }
        this.field_b = null;
    }

    fi(bl param0, java.net.URL param1, int param2) {
        try {
          this.field_i = param0;
          this.field_d = param1;
          this.field_j = new od(param2);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
