/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb extends dh {
    private java.nio.ByteBuffer field_i;
    static cr field_j;
    static boolean field_g;
    static int field_h;

    public static void b(byte param0) {
        field_j = null;
        if (param0 >= -40) {
          field_g = false;
        }
    }

    final static String c(int param0) {
        if (param0 != -15381) {
          field_g = false;
          if (qe.field_V == null) {
            return "";
          }
          return qe.field_V;
        }
        if (qe.field_V == null) {
          return "";
        }
        return qe.field_V;
    }

    final static void d(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = Vertigo2.field_L ? 1 : 0;
          try {
            if (param0 <= 34) {
              field_h = 5;
            }
            if (kb.field_e != null) {
              kb.field_e.b((byte) 9);
            }
            if (null != ap.field_a) {
              ap.field_a.a(-82);
            }
            if (null != ad.field_g) {
              try {
                ad.field_g.b(-22473);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != rg.field_g) {
              for (var1_int = 0; rg.field_g.length > var1_int; var1_int++) {
                if (rg.field_g[var1_int] != null) {
                  try {
                    rg.field_g[var1_int].b(-22473);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw wn.a((Throwable) ((Object) var1_ref), "vb.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] b(int param0) {
        byte[] var4 = new byte[this.field_i.capacity()];
        byte[] var2 = var4;
        this.field_i.position(0);
        this.field_i.get(var4);
        int var3 = 8 / ((param0 - 13) / 58);
        return var4;
    }

    final void a(byte[] param0, boolean param1) {
        try {
          this.field_i = java.nio.ByteBuffer.allocateDirect(param0.length);
          if (!param1) {
            field_j = (cr) null;
          }
          this.field_i.position(0);
          this.field_i.put(param0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "vb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    vb() {
    }

    static {
        field_g = true;
        field_h = 5;
    }
}
