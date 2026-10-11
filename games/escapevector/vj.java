/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj {
    static cn field_d;
    static String[] field_c;
    static volatile int field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 > -99) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = EscapeVector.field_A;
        try {
          if (param6 >= param2) {
            return;
          }
          if (param1 <= param6 + 1) {
            return;
          }
          if (param1 > param6 + 5 &&
            param3 != param5) {
            var7_int = (param3 >> 1) + (param5 >> 1) + (1 & (param5 & param3));
            var8 = param6;
            var9 = param3;
            var10 = param5;
            if (param0 >= -87) {
              return;
            }
            for (var11 = param6; var11 < param1; var11++) {
              var12 = cd.field_q[var11];
              if (param4) {
                stackIn_25_0 = fl.field_k[var12];
              } else {
                stackIn_25_0 = th.field_v[var12];
              }
              var13 = stackIn_25_0;
              if (var7_int < var13) {
                cd.field_q[var11] = cd.field_q[var8];
                if (var9 > var13) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                cd.field_q[incrementValue$0] = var12;
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            vj.a((byte) -109, var8, param2, param3, param4, var9, param6);
            vj.a((byte) -96, param1, param2, var10, param4, param5, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param1; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = cd.field_q[var8Lifetime1];
              var10Lifetime1 = cd.field_q[var8Lifetime1 + 1];
              if (ke.a(var9Lifetime1, 2, var10Lifetime1, param4)) {
                cd.field_q[var8Lifetime1] = var10Lifetime1;
                cd.field_q[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var7), "vj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 < 82) {
          return;
        }
        if (bk.field_r != null) {
          bk.field_r.a((byte) -121);
        }
    }

    abstract void a(n param0, byte param1);

    abstract fk a(byte param0);

    static {
        field_d = new cn();
        field_b = 0;
        field_c = new String[]{"An explosive new campaign, with a compelling storyline", "Destroy the aliens' military infrastructure", "Challenge your piloting skills in Simulator mode"};
        field_a = 0;
    }
}
