/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static String field_h;
    static String field_a;
    static String field_c;
    static String field_i;
    static String field_d;
    static tp[] field_b;
    static int field_g;
    static tg field_e;
    static jp field_f;

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_a = null;
        if (param0 == -30593) {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 4252) {
          return;
        }
        ng.field_b = 0;
        di.a((byte) -114);
    }

    final static nc a(byte param0, mf param1, PacketBuffer param2, int param3, int param4, int param5, int param6) {
        int dupTemp$1 = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        wk var10 = null;
        int var11 = 0;
        nc var12 = null;
        nc var13 = null;
        nc stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9Lifetime1;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          var12 = new nc(param4, param6, param5);
          var13 = var12;
          dupTemp$1 = param2.readUnsignedShort(65280);
          var13.field_i = dupTemp$1;
          var8 = dupTemp$1;
          var13.field_j = new byte[var8][];
          var13.field_c = new wk[var8];
          for (var9 = 0; var8 > var9; var9++) {
            var10 = ai.a((byte) -12, param2);
            var12.field_c[var10.field_n] = var10;
            var13.field_j[var10.field_n] = param1.a(var10.field_q, param3, 4);
          }
          var9Lifetime1 = -74 % ((7 - param0) / 52);
          stackIn_5_0 = var13;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        int var1 = 25 % ((param0 - 55) / 54);
        return uo.a(uc.e((byte) -95), (byte) 14);
    }

    final static mh c(int param0) {
        if (param0 != 0) {
          return (mh) null;
        }
        return IsaacGenerator.field_b.field_Rb;
    }

    final static al a(byte param0, int param1) {
        al var2 = null;
        al var2Lifetime1;
        if (param0 > 37) {
          var2 = new al();
          ej.field_F.addLast(var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        }
        mq.a((byte) -67, -39);
        var2Lifetime1 = new al();
        ej.field_F.addLast(var2Lifetime1, (byte) 3);
        ma.b((byte) -112, param1);
        return var2Lifetime1;
    }

    static {
        field_h = "(<%0> players want to join)";
        field_a = "Please log in to access this feature.";
        field_i = "Tutorial";
        field_c = "Orb points: ";
        field_d = "End Game";
    }
}
