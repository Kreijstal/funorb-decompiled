/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hna extends aba {
    private hb field_j;
    static ee field_h;
    private String field_g;
    static int field_k;
    private boolean field_i;

    hna(lka param0, lka param1) {
        super(param0);
        this.field_g = "";
        this.field_i = false;
        try {
          this.field_j = new hb(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 28) {
          hna.a(-7, 97);
          field_h = null;
          return;
        }
        field_h = null;
    }

    final jg a(String param0, boolean param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_j.a(param0, param1) == jt.field_f) {
            stackIn_3_0 = jt.field_f;
            return stackIn_3_0;
          }
          if (param1) {
            var4 = (String) null;
            this.a((String) null, false);
          }
          if (!param0.equals(this.field_g)) {
            var3 = cca.b(-26869, param0);
            if (!var3.a(false)) {
              stackIn_10_0 = ji.field_f;
              return stackIn_10_0;
            }
            this.field_g = param0;
            this.field_i = var3.a(-7750);
          }
          if (!this.field_i) {
            stackIn_15_0 = jt.field_f;
          } else {
            stackIn_15_0 = cm.field_u;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("hna.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -92 / ((param0 + 8) / 45);
          if (this.field_j.a(param1, false) == jt.field_f) {
            stackIn_3_0 = this.field_j.a((byte) 66, param1);
            return stackIn_3_0;
          }
          if (this.a(param1, false) != jt.field_f) {
            stackIn_8_0 = bv.field_j;
            return stackIn_8_0;
          }
          stackIn_6_0 = ija.field_p;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hna.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (param1 < 61) {
            field_h = (ee) null;
          }
          if (dma.field_b != null && (param0 < 0 ||
            eia.field_a == uca.field_a)) {
            if (0 == sja.field_fb.field_g &&
              f.b((byte) 73) > (vla.field_v + 10000L)) {
              sja.field_fb.c(param0, (byte) 99);
            }
            if (sja.field_fb.field_g > 0) {
              try {
                dma.field_b.a(0, sja.field_fb.field_h, false, sja.field_fb.field_g);
                vla.field_v = f.b((byte) 73);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                vc.a((byte) -118);
              }
              sja.field_fb.field_g = 0;
            }
            return;
          }
          sja.field_fb.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
