/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bh {
    static String field_t;
    int field_r;
    static ui[][] field_u;
    static int[] field_o;
    boolean field_s;
    int[] field_q;
    static String field_n;
    static String field_p;

    public static void a(int param0) {
        field_u = (ui[][]) null;
        field_p = null;
        field_t = null;
        field_o = null;
        field_n = null;
        if (param0 != 13820388) {
          field_u = (ui[][]) null;
        }
    }

    final static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        tj var1 = null;
        ve var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        String var5 = null;
        tj var1Lifetime1;
        var2 = client.field_A ? 1 : 0;
        try {
          var1 = (tj) (i.field_b.c((byte) -53));
          while (var1 != null) {
            if (var1.field_Qb > 0) {
              var1.field_Qb = var1.field_Qb - 1;
              if (var1.field_Qb == 0) {
                var1.field_hc = 0;
                if (var1.g((byte) 111)) {
                  var1.b((byte) 112);
                }
              }
            }
            var1 = (tj) (i.field_b.d(true));
          }
          var1_ref = (ve) (h.field_b.c((byte) 26));
          while (var1_ref != null) {
            if (var1_ref.field_Rb > 0) {
              var1_ref.field_Rb = var1_ref.field_Rb - 1;
              if (var1_ref.field_Rb == 0) {
                var1_ref.field_oc = 0;
                if (var1_ref.i((byte) 115)) {
                  var1_ref.b((byte) 113);
                }
              }
            }
            var1_ref = (ve) (h.field_b.d(true));
          }
          var1Lifetime1 = (tj) (oc.field_b.c((byte) 50));
          while (var1Lifetime1 != null) {
            if (0 < var1Lifetime1.field_Qb) {
              var1Lifetime1.field_Qb = var1Lifetime1.field_Qb - 1;
              if (var1Lifetime1.field_Qb == 0) {
                var1Lifetime1.field_hc = 0;
                if (var1Lifetime1.g((byte) 59)) {
                  var1Lifetime1.b((byte) 101);
                }
              }
            }
            var1Lifetime1 = (tj) (oc.field_b.d(true));
          }
          if (param0 == 123) {
            return;
          }
          var5 = (String) null;
          sb.a(-113L, (String) null, false, (String) null, 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref2), "sb.B(" + param0 + ')');
        }
    }

    final static fm a(long param0, String param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        qa stackIn_5_0 = null;
        ob stackIn_7_0 = null;
        wk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((long)param4 == param0 &&
            param3 != null) {
            stackIn_7_0 = new ob(param3, param1);
            return (fm) ((Object) stackIn_7_0);
          }
          if (!param2) {
            stackIn_9_0 = new wk(param0, param1);
            return (fm) ((Object) stackIn_9_0);
          }
          stackIn_5_0 = new qa(param0, param1);
          return (fm) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("sb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    sb() {
    }

    static {
        field_t = "Secret achievement";
        field_o = new int[]{10076391, 4944180, 14961707, 16178128, 13820388};
        field_u = new ui[8][4];
        field_n = "Players: <%0>/<%1>";
        field_p = "Show players in <%0>'s game";
    }
}
