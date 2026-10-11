/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static int[] field_b;
    static j field_c;
    static qk field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8, int param9) {
        int var12 = 0;
        int var12Lifetime1;
        if (param3 <= 0) {
          param3 = 0;
        }
        if (param8 <= param3) {
          return;
        }
        param5 = param5 - param3;
        param9 = param9 - param3;
        int var10 = -param3 + param8;
        if (param9 < vj.field_h) {
          param1 = param1 - (-param9 + vj.field_h);
          param9 = vj.field_h;
        }
        if (vj.field_f > param5) {
          param4 = param4 - (-param5 + vj.field_f);
          param5 = vj.field_f;
        }
        int var11 = 124 / ((-52 - param6) / 58);
        if (!(param9 + param1 <= vj.field_b)) {
          param1 = -param9 + vj.field_b;
        }
        if (!(vj.field_a >= param5 + param4)) {
          param4 = -param5 + vj.field_a;
        }
        if (param4 <= 0) {
          return;
        }
        if (param1 > 0) {
          if (var10 <= param5 % param8) {
            var12 = -(param5 % param8) + param8;
            param5 = param5 + var12;
            param4 = param4 - var12;
          }
          if (var10 <= param9 % param8) {
            var12Lifetime1 = param8 - param9 % param8;
            param9 = param9 + var12Lifetime1;
            param1 = param1 - var12Lifetime1;
          }
          if (var10 <= (param4 + (param5 - 1)) % param8) {
            param4 = param4 - (1 + (-1 + param4 + param5) % param8 - var10);
          }
          if (var10 <= (param1 + param9 - 1) % param8) {
            param1 = param1 - (-var10 + 1 + (-1 + (param1 + param9)) % param8);
          }
          ke.a(param1, vj.field_l - param4, param5 % param8, param0, -84, param2, vj.field_l * param9 + param5, param4, vj.field_j, param9 % param8, var10, param7, param3);
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 21) {
          field_a = (qk) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = new int[8192];
    }
}
