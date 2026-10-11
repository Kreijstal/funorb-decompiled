/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_d;
    static double[] field_c;
    static volatile int field_a;
    static jb field_b;

    final static nf[] a(int param0, nf[] param1) {
        nf dupTemp$0 = null;
        nf dupTemp$1 = null;
        nf dupTemp$2 = null;
        nf dupTemp$3 = null;
        nf dupTemp$4 = null;
        nf dupTemp$5 = null;
        nf dupTemp$6 = null;
        nf dupTemp$7 = null;
        nf dupTemp$8 = null;
        nf dupTemp$9 = null;
        nf dupTemp$10 = null;
        nf dupTemp$11 = null;
        nf dupTemp$12 = null;
        nf dupTemp$13 = null;
        nf dupTemp$14 = null;
        nf dupTemp$15 = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        nf[] stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        try {
          if (param1[2].field_u == 0) {
            param1[2].field_s = param1[2].field_t;
          }
          if (0 == param1[5].field_u) {
            param1[5].field_s = param1[5].field_t;
          }
          if (0 == param1[8].field_u) {
            param1[8].field_s = param1[8].field_t;
          }
          if (param1[6].field_w == 0) {
            param1[6].field_v = param1[6].field_x;
          }
          if (param1[7].field_w == 0) {
            param1[7].field_v = param1[7].field_x;
          }
          if (0 == param1[8].field_w) {
            param1[8].field_v = param1[8].field_x;
          }
          var3 = param1[3].field_s + param1[3].field_u;
          var2_int = param1[0].field_u + param1[0].field_s;
          var4 = param1[6].field_u + param1[6].field_s;
          stackIn_18_0 = (var3 < var2_int) ? var2_int : var3;
          var5 = stackIn_18_0;
          stackIn_21_0 = (var5 > var4) ? var5 : var4;
          var5Lifetime1 = stackIn_21_0;
          var2_intLifetime1 = param1[2].field_s;
          var3Lifetime1 = param1[5].field_s;
          var4Lifetime1 = param1[8].field_s;
          dupTemp$0 = param1[6];
          dupTemp$0.field_t = var5Lifetime1;
          dupTemp$1 = param1[3];
          dupTemp$1.field_t = var5Lifetime1;
          param1[0].field_t = var5Lifetime1;
          stackIn_24_0 = (var2_intLifetime1 < var3Lifetime1) ? var2_intLifetime1 : var3Lifetime1;
          var5Lifetime2 = stackIn_24_0;
          stackIn_27_0 = (var5Lifetime2 < var4Lifetime1) ? var5Lifetime2 : var4Lifetime1;
          var5Lifetime3 = stackIn_27_0;
          dupTemp$2 = param1[2];
          dupTemp$2.field_t = dupTemp$2.field_t - var5Lifetime3;
          dupTemp$3 = param1[2];
          dupTemp$3.field_s = dupTemp$3.field_s - var5Lifetime3;
          dupTemp$4 = param1[5];
          dupTemp$4.field_t = dupTemp$4.field_t - var5Lifetime3;
          dupTemp$5 = param1[5];
          dupTemp$5.field_s = dupTemp$5.field_s - var5Lifetime3;
          dupTemp$6 = param1[8];
          dupTemp$6.field_t = dupTemp$6.field_t - var5Lifetime3;
          var3Lifetime2 = param1[1].field_v + param1[1].field_w;
          var4Lifetime2 = param1[2].field_w + param1[2].field_v;
          dupTemp$7 = param1[8];
          dupTemp$7.field_s = dupTemp$7.field_s - var5Lifetime3;
          var2_intLifetime2 = param1[0].field_v + param1[0].field_w;
          stackIn_30_0 = (var3Lifetime2 >= var2_intLifetime2) ? var3Lifetime2 : var2_intLifetime2;
          var5Lifetime4 = stackIn_30_0;
          stackIn_33_0 = (var5Lifetime4 > var4Lifetime2) ? var5Lifetime4 : var4Lifetime2;
          var5Lifetime5 = stackIn_33_0;
          var2_intLifetime3 = param1[6].field_v;
          var3Lifetime3 = param1[7].field_v;
          var4Lifetime3 = param1[8].field_v;
          dupTemp$8 = param1[2];
          dupTemp$8.field_x = var5Lifetime5;
          dupTemp$9 = param1[1];
          dupTemp$9.field_x = var5Lifetime5;
          param1[0].field_x = var5Lifetime5;
          if (param0 <= 113) {
            field_a = 85;
          }
          stackIn_38_0 = (var3Lifetime3 <= var2_intLifetime3) ? var3Lifetime3 : var2_intLifetime3;
          var5Lifetime6 = stackIn_38_0;
          stackIn_41_0 = (var5Lifetime6 >= var4Lifetime3) ? var4Lifetime3 : var5Lifetime6;
          var5Lifetime7 = stackIn_41_0;
          dupTemp$10 = param1[6];
          dupTemp$10.field_v = dupTemp$10.field_v - var5Lifetime7;
          dupTemp$11 = param1[6];
          dupTemp$11.field_x = dupTemp$11.field_x - var5Lifetime7;
          dupTemp$12 = param1[7];
          dupTemp$12.field_v = dupTemp$12.field_v - var5Lifetime7;
          dupTemp$13 = param1[7];
          dupTemp$13.field_x = dupTemp$13.field_x - var5Lifetime7;
          dupTemp$14 = param1[8];
          dupTemp$14.field_v = dupTemp$14.field_v - var5Lifetime7;
          dupTemp$15 = param1[8];
          dupTemp$15.field_x = dupTemp$15.field_x - var5Lifetime7;
          stackIn_42_0 = (nf[]) (param1);
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("va.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        byte[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (byte[]) null;
            va.a(7, (byte[]) null);
          }
          stackIn_3_0 = kh.a(param1, param1.length, 0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("va.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -21 % ((-51 - param0) / 45);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static boolean b(int param0) {
        if (param0 != 8) {
          field_a = 74;
        }
        return hd.field_d;
    }

    static {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new double[]{0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.0, 0.0, -1.0, 0.2300718937365538, 0.4675654614646093, -0.8534925090226996};
        field_a = 0;
    }
}
