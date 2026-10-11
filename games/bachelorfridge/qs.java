/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends pu {
    static int field_o;
    static kv[][] field_l;
    static sna field_m;
    static int field_n;

    final static String[][] a(boolean param0, lu param1) {
        int var5 = 0;
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[][] var4 = null;
        int var7 = 0;
        String[][] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param0) {
            field_l = (kv[][]) null;
          }
          var2_int = param1.e((byte) 117);
          var3 = param1.e((byte) 95);
          var4 = new String[var2_int][var3];
          for (var5 = 0; var5 < var2_int; var5++) {
            for (var6 = 0; var6 < var3; var6++) {
              var4[var5][var6] = param1.h((byte) 120);
            }
          }
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("qs.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          i.field_h = new js(16);
          var1_int = 0;
          if (param0) {
            field_l = (kv[][]) null;
          }
          while (nm.field_C.length > var1_int) {
            i.field_h.a((long)nm.field_C[var1_int].toLowerCase().hashCode(), (byte) 127, new ji(var1_int));
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qs.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -5232) {
          return;
        }
        field_m = null;
        field_l = (kv[][]) null;
    }

    final static void c(int param0) {
        int var2 = BachelorFridge.field_y;
        if (lfa.field_q > 0) {
          lfa.field_q = lfa.field_q - 1;
        } else {
          if (ld.field_p > 0) {
            ld.field_p = ld.field_p - 1;
          } else {
            if (!(dja.field_m <= 0)) {
              dja.field_m = dja.field_m - 1;
            }
          }
        }
        if (lfa.field_q > 0) {
          pm.f(param0 + 11100);
        }
        if (ld.field_p > 0) {
          dna.c(ld.field_p, false);
        }
        if (!(dja.field_m <= 0)) {
          dna.c(dja.field_m, false);
        }
        if (param0 != -10901) {
          lu var3 = (lu) null;
          qs.a(false, (lu) null);
        }
    }

    static {
    }
}
