/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nga extends vo {
    private int field_h;
    static String field_j;
    static int[] field_g;
    private int field_l;
    static int[] field_i;
    private int field_m;
    private int field_k;

    final void b(int param0, int param1, int param2) {
        int var4 = -54 % ((14 - param1) / 62);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -70) {
            field_j = (String) null;
        }
    }

    final static int a(int param0, int param1, byte param2, int param3) {
        if (param1 + (param3 + param0) <= dg.field_c) {
          return param3 + param1;
        } else {
          if (param2 >= 95) {
            if (0 <= param1 + -param0) {
              return param1 + -param0;
            } else {
              return -param0 + dg.field_c;
            }
          } else {
            return 24;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_k * param0 >> 516311724;
        int var5 = this.field_l * param0 >> 1787356268;
        int var6 = param2 * this.field_h >> 2023069004;
        int var7 = param2 * this.field_m >> -1096410612;
        pna.a(var7, this.field_f, param1 ^ param1, var5, var4, var6);
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        field_i = null;
        field_j = null;
        if (param0 != -20804) {
          discarded$2 = nga.a(56, 107, (byte) -3, 87);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    nga(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_m = param3;
        this.field_l = param2;
        this.field_k = param0;
        this.field_h = param1;
    }

    final static void b(byte param0) {
        fda.field_i = lia.a(5);
        if (param0 != 113) {
            return;
        }
        gja.field_m = new rp();
        nw.a(true, true, (byte) -107);
    }

    static {
        field_j = "You are not currently logged in to the game.";
        field_i = vv.a((byte) 109);
    }
}
