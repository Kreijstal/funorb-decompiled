/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ata extends htb {
    int field_J;
    int field_B;
    int field_I;
    static phb field_K;
    int field_F;
    int field_E;
    static String field_L;
    int field_D;
    static int field_H;
    static String field_G;

    public static void a(int param0) {
        if (param0 == 6344) {
          field_G = null;
          field_L = null;
          field_K = null;
          return;
        }
        ata.e(-68);
        field_G = null;
        field_L = null;
        field_K = null;
    }

    final static boolean e(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = gha.field_q;
        synchronized (var1_ref) {
          if (nwa.field_a == bva.field_c) {
            return false;
          }
          pma.field_o = npa.field_a[bva.field_c];
          jl.field_r = gca.field_q[bva.field_c];
          bva.field_c = param0 & bva.field_c + 1;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param6 >= -17) {
            this.field_E = 45;
          }
          if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -99)) {
            return false;
          }
          var8_int = param0 + (-this.field_g + (-param1 - this.field_J));
          var9 = param2 + (-this.field_B - this.field_r - param5);
          if (this.field_F * this.field_F <= var9 * var9 + var8_int * var8_int) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - oea.field_q;
          if (!(var10 < 0.0)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_I;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_I;
          }
          this.field_D = (int)((double)this.field_I * var10 / 6.283185307179586);
          while (this.field_D >= this.field_I) {
            this.field_D = this.field_D - this.field_I;
          }
          while (this.field_D < 0) {
            this.field_D = this.field_D + this.field_I;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("ata.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private ata() throws Throwable {
        throw new Error();
    }

    static {
        field_L = "game_settings.dat";
        field_K = new phb(540, 140);
        field_G = "Hold the Component";
    }
}
