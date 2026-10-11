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
          if (null != param1.field_f) {
            param1.c(-7975);
          }
          int var3_int = 69 % ((6 - param0) / 57);
          param1.field_f = this.field_e;
          param1.field_g = this.field_e.field_g;
          param1.field_f.field_g = param1;
          param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        od var3 = this.field_e.field_g;
        while (this.field_e != var3) {
          var2++;
          var3 = var3.field_g;
        }
        if (param0 < -23) {
          return var2;
        }
        this.field_e = (od) null;
        return var2;
    }

    final od b(byte param0) {
        if (param0 != 38) {
          return (od) null;
        }
        od var2 = this.field_e.field_g;
        if (this.field_e == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_g;
        return var2;
    }

    final od c(byte param0) {
        od var2 = null;
        od var2Lifetime1;
        if (param0 <= 110) {
          field_d = (String[]) null;
          var2 = this.field_e.field_g;
          if (this.field_e != var2) {
            var2.c(-7975);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_e.field_g;
        if (this.field_e != var2Lifetime1) {
          var2Lifetime1.c(-7975);
          return var2Lifetime1;
        }
        return null;
    }

    final od b(int param0) {
        od var2 = this.field_e.field_f;
        if (this.field_e == var2) {
          return null;
        }
        if (param0 <= -111) {
          var2.c(-7975);
          return var2;
        }
        field_a = (int[]) null;
        var2.c(-7975);
        return var2;
    }

    final void a(od param0, byte param1) {
        try {
          if (param0.field_f != null) {
            param0.c(-7975);
          }
          param0.field_g = this.field_e;
          param0.field_f = this.field_e.field_f;
          param0.field_f.field_g = param0;
          if (param1 >= -74) {
            od var4 = (od) null;
            this.a(116, (od) null);
          }
          param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(File param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -85) {
            field_c = (String) null;
          }
          stackIn_3_0 = gja.a((int)param0.length(), param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 >= -69) {
            vj.a(10);
          }
          hl.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < -1) {
          field_d = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        vj.a((String) null, 47);
        field_d = null;
        field_a = null;
    }

    public vj() {
        this.field_e = new od();
        this.field_e.field_f = this.field_e;
        this.field_e.field_g = this.field_e;
    }

    final od c(int param0) {
        od var2 = null;
        od var2Lifetime1;
        if (param0 != 28) {
          vj.a(76);
          var2 = this.field_b;
          if (this.field_e == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_g;
          return var2;
        }
        var2Lifetime1 = this.field_b;
        if (this.field_e == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_g;
        return var2Lifetime1;
    }

    static {
        field_c = "Report <%0> for abuse";
        field_a = new int[]{0, 28};
        field_d = new String[]{"Ziggurat of Zest", "Serpent's Sepulchre", "Abyss of Peril", "Brimstone Catacomb", "Path of Penitence", "Common Pyramid", "Cadaver Caves", "Beacon of Beams", "Crypt of Conclusion"};
    }
}
