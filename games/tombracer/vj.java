/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vj {
    static String field_c;
    private od field_e;
    static String[] field_d;
    static int[] field_a;
    private od field_b;

    final void a(int param0, od param1) {
        try {
            if (!(null == param1.field_f)) {
                param1.c(-7975);
            }
            int var3_int = 69 % ((6 - param0) / 57);
            param1.field_f = ((vj) this).field_e;
            param1.field_g = ((vj) this).field_e.field_g;
            param1.field_f.field_g = param1;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        od var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = ((vj) this).field_e.field_g;
        L0: while (true) {
          if (((vj) this).field_e == var3) {
            if (param0 >= -23) {
              ((vj) this).field_e = null;
              return var2;
            } else {
              return var2;
            }
          } else {
            var2++;
            var3 = var3.field_g;
            continue L0;
          }
        }
    }

    final od b(byte param0) {
        if (param0 != 38) {
            return null;
        }
        od var2 = ((vj) this).field_e.field_g;
        if (!(((vj) this).field_e != var2)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_g;
        return var2;
    }

    final od c(byte param0) {
        od var2 = null;
        if (param0 > 110) {
          var2 = ((vj) this).field_e.field_g;
          if (((vj) this).field_e == var2) {
            return null;
          } else {
            var2.c(-7975);
            return var2;
          }
        } else {
          field_d = null;
          var2 = ((vj) this).field_e.field_g;
          if (((vj) this).field_e == var2) {
            return null;
          } else {
            var2.c(-7975);
            return var2;
          }
        }
    }

    final od b(int param0) {
        od var2 = null;
        var2 = ((vj) this).field_e.field_f;
        if (((vj) this).field_e != var2) {
          if (param0 > -111) {
            field_a = null;
            var2.c(-7975);
            return var2;
          } else {
            var2.c(-7975);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(od param0, byte param1) {
        try {
            if (param0.field_f != null) {
                param0.c(-7975);
            }
            param0.field_g = ((vj) this).field_e;
            param0.field_f = ((vj) this).field_e.field_f;
            param0.field_f.field_g = param0;
            if (param1 >= -74) {
                Object var4 = null;
                ((vj) this).a(116, (od) null);
            }
            param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(File param0) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_0_0 = gja.a((int)param0.length(), param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vj.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -86 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(String param0, int param1) {
        try {
            if (param1 >= -69) {
                vj.a(10);
            }
            hl.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        if (param0 >= -1) {
          var2 = null;
          vj.a((String) null, 47);
          field_d = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          return;
        }
    }

    public vj() {
        ((vj) this).field_e = new od();
        ((vj) this).field_e.field_f = ((vj) this).field_e;
        ((vj) this).field_e.field_g = ((vj) this).field_e;
    }

    final od c(int param0) {
        od var2 = null;
        if (param0 != 28) {
            vj.a(76);
            var2 = ((vj) this).field_b;
            if (!(((vj) this).field_e != var2)) {
                ((vj) this).field_b = null;
                return null;
            }
            ((vj) this).field_b = var2.field_g;
            return var2;
        }
        var2 = ((vj) this).field_b;
        if (!(((vj) this).field_e != var2)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_g;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Report <%0> for abuse";
        field_a = new int[]{0, 28};
        field_d = new String[]{"Ziggurat of Zest", "Serpent's Sepulchre", "Abyss of Peril", "Brimstone Catacomb", "Path of Penitence", "Common Pyramid", "Cadaver Caves", "Beacon of Beams", "Crypt of Conclusion"};
    }
}
