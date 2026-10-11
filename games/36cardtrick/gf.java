/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    String field_i;
    private int field_b;
    float field_g;
    static String field_a;
    static kh field_e;
    static String[] field_h;
    private int field_f;
    private t[] field_c;

    private final void a(t param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(1 + this.field_f) + (float)param1 / 100.0f;
          if (param2 != 73) {
            return;
          }
          this.field_g = var4_float * (float)this.field_b / (float)(1 + this.field_d);
          if (0 == param1) {
            this.field_i = param0.field_g;
            return;
          }
          this.field_i = param0.field_a + " - " + param1 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gf.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        int var1 = -48 % ((41 - param0) / 57);
    }

    final boolean a(int param0) {
        t var2;
        int var2_int;
        int var3;
        t var4;
        var3 = Main.field_T;
        while (this.field_f < this.field_d) {
          var4 = this.field_c[this.field_f];
          var2 = var4;
          if (!var4.field_d.b(4)) {
            this.a(var4, 0, (byte) 73);
            return false;
          }
          if (var4.field_c >= 0 &&
            !var4.field_d.a(var4.field_c, 70)) {
            this.a(var2, var4.field_d.a((byte) 60, var4.field_c), (byte) 73);
            return false;
          }
          if (null != var4.field_b &&
            !var4.field_d.b(4, var4.field_b)) {
            this.a(var2, var4.field_d.a(var4.field_b, 0), (byte) 73);
            return false;
          }
          if (var4.field_c < 0 &&
            null == var4.field_b &&
            null != var4.field_a &&
            !var4.field_d.a((byte) 29)) {
            this.a(var2, var4.field_d.a(2), (byte) 73);
            return false;
          }
          this.field_f = this.field_f + 1;
        }
        var2_int = -46 / ((59 - param0) / 39);
        return true;
    }

    final static md[] a(int param0, le param1) {
        int var5 = 0;
        md[] stackIn_3_0 = null;
        md[] stackIn_6_0 = null;
        md[] stackIn_13_0 = null;
        md[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        md[] var4 = null;
        md var6 = null;
        int var7 = 0;
        vi var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Main.field_T;
        try {
          if (!param1.b((byte) -117)) {
            stackIn_3_0 = new md[]{};
            return stackIn_3_0;
          }
          if (param0 != -2) {
            stackIn_6_0 = (md[]) null;
            return stackIn_6_0;
          }
          var8 = param1.a((byte) 104);
          while (var8.field_a == 0) {
            wk.a((byte) -117, 10L);
          }
          if (var8.field_a == 2) {
            stackIn_13_0 = new md[]{};
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new md[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new md();
            var4[var5] = var6;
            var6.field_b = var3[var5 << 2];
            var6.field_a = var3[1 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 2];
            var6.field_c = var3[3 + (var5 << 2)];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Cancel";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
