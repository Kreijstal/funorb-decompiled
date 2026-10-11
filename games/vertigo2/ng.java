/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_c;
    static String field_b;
    static boolean field_a;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 16952) {
          mi var2 = (mi) null;
          ng.a((byte) 5, (mi) null);
        }
    }

    final static void a(int param0) {
        mi.k(-32460, 2);
        if (param0 != -10236) {
          field_a = false;
        }
    }

    final static uq[] a(byte param0, mi param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uq[] var4 = null;
        int var6_int = 0;
        uq var6 = null;
        int var7 = 0;
        uq[] stackIn_6_0 = null;
        uq[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param1.c((byte) -107, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.c((byte) -96, 12);
          if (param0 > -96) {
            stackIn_6_0 = (uq[]) null;
            return stackIn_6_0;
          }
          var4 = new uq[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (id.a(param1, -31980)) {
              var6 = new uq();
              param1.c((byte) -124, 24);
              param1.c((byte) -121, 24);
              var6.field_e = param1.c((byte) -120, 24);
              param1.c((byte) -115, 9);
              param1.c((byte) -105, 12);
              param1.c((byte) -119, 12);
              param1.c((byte) -106, 12);
              var4[var5] = var6;
            } else {
              var6_int = param1.c((byte) -128, ee.a(-1 + var5, 96));
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ng.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        int var7;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (ap.field_e <= param1 &&
          param3 <= ib.field_a &&
          param6 >= ua.field_e &&
          param2 <= cj.field_D) {
          if (param4 != 1) {
            nb.a(param6, param3, param0, (byte) -92, param4, param2, param1);
          } else {
            f.a(param3, param1, param0, param6, (byte) -8, param2);
          }
        } else {
          if (param4 == 1) {
            dm.a(0, param1, param6, param3, param0, param2);
          } else {
            bs.a(param4, param3, param0, param2, param1, param6, 0);
          }
        }
        var7 = 116 / ((25 - param5) / 35);
    }

    static {
        field_b = "Only show game chat from my friends";
    }
}
