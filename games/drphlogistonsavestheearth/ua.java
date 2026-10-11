/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua extends java.awt.Canvas {
    static vj field_b;
    private java.awt.Component field_a;
    static nh field_c;

    final static int a(int param0, int param1, int param2) {
        if (uh.field_r == null) {
          return -1;
        }
        if (param2 >= ka.field_o &&
          param2 < ka.field_o + uh.field_r.field_y &&
          tb.field_c <= param0 &&
          uh.field_r.field_w + tb.field_c > param0) {
          return 0;
        }
        if (param2 >= ch.field_A &&
          param2 < ch.field_A + uh.field_r.field_y &&
          param0 >= v.field_N &&
          v.field_N + uh.field_r.field_w > param0) {
          return 1;
        }
        if (param1 != -13412) {
          return 39;
        }
        return -1;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ua.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 50) {
          field_c = (nh) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    ua(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ua.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3, int param4, bl param5, int param6, int param7, String param8, int param9, int param10, boolean param11, long param12, int param13) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          int var15_int = 0;
          RuntimeException var15 = null;
          IOException var16 = null;
          try {
            dh.field_N = new lh(param7);
            nj.field_p = new lh(param4);
            ci.field_W = param13;
            ei.field_o = param3;
            lb.field_v = param1;
            ia.field_c = param10;
            var15_int = 42 % ((param2 + 70) / 44);
            bd.field_N = param0;
            wg.field_d = param11;
            ml.field_n = param8;
            n.field_i = param12;
            nf.field_t = param9;
            dc.field_e = param6;
            pi.field_I = param5;
            if (null == pi.field_I.field_m) {
              return;
            }
            try {
              mi.field_f = new ge(pi.field_I.field_m, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var16 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var16.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var15;
            stackIn_14_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
