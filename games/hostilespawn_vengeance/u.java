/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static je field_d;
    static String field_c;
    int field_i;
    static String field_g;
    static int field_e;
    static String field_a;
    static String field_j;
    static String[] field_f;
    static bd field_h;
    static String field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_g = null;
        field_c = null;
        field_d = null;
        if (param0) {
          field_b = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    final static void a(oc param0, oc param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!q.field_g.a((byte) -117)) {
            qj.a(-114, param2, param0, param1);
            t.c(param3 - 19706);
            if (null != vi.field_p[0] &&
              8 == vi.field_p[0].field_i &&
              vi.field_p[0].field_I > 0) {
              if (!vi.field_p[0].field_n) {
                nl.field_b = 180;
              } else {
                nl.field_b = 256;
              }
            }
          }
          if (param3 == 0) {
            return;
          }
          u.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("u.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, oc param1, boolean param2, int param3, og param4, int param5) {
        int var8 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = 256 / param3;
          var7 = (int)((double)var6_int * Math.random());
          for (var8 = 0; var8 < 256; var8 = var8 + var6_int) {
            jn.field_F[ib.field_c].field_c = (double)(var7 + var8);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
            jn.field_F[ib.field_c].field_l.a(param4, -28860);
            jn.field_F[ib.field_c].field_l.b(12.0, (double)var8, 118);
            jn.field_F[ib.field_c].b((byte) 117);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = param5;
            ib.field_c = ib.field_c + 1;
            jn.field_F[ib.field_c].field_c = (double)(var8 + var7);
            jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
            jn.field_F[ib.field_c].field_l.a(param4, -28860);
            jn.field_F[ib.field_c].field_l.b(12.0, (double)var8, 126);
            jn.field_F[ib.field_c].b((byte) 117);
            jn.field_F[ib.field_c].field_e = 0;
            jn.field_F[ib.field_c].field_h = 0;
            jn.field_F[ib.field_c].field_i = param0;
            ib.field_c = ib.field_c + 1;
          }
          if (param2) {
            return;
          }
          u.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("u.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_c = "Opens the pause console, which also provides you with a map.";
        field_d = new je();
        field_g = "Enter the name you'd prefer. This is the name displayed to other players.";
        bd discarded$0 = new bd(640, 480);
        field_a = "Create a free account to start using this feature";
        field_e = 0;
        field_b = "More eggs. I might have to do something about these.";
    }
}
