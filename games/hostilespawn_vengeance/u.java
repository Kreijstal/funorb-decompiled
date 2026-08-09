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
        if (!param0) {
          return;
        } else {
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (q.field_g.a((byte) -117)) {
                break L1;
              } else {
                qj.a(-114, param2, param0, param1);
                t.c(param3 + -19706);
                if (null == vi.field_p[0]) {
                  break L1;
                } else {
                  if (8 != vi.field_p[0].field_i) {
                    break L1;
                  } else {
                    if ((vi.field_p[0].field_I ^ -1) >= -1) {
                      break L1;
                    } else {
                      if (!vi.field_p[0].field_n) {
                        nl.field_b = 180;
                        break L1;
                      } else {
                        nl.field_b = 256;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            if (param3 == 0) {
              break L0;
            } else {
              u.a(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("u.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, oc param1, boolean param2, int param3, og param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = 256 / param3;
            var7 = (int)((double)var6_int * Math.random());
            var8 = 0;
            L1: while (true) {
              if (var8 >= 256) {
                if (param2) {
                  break L0;
                } else {
                  u.a(true);
                  return;
                }
              } else {
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
                var8 = var8 + var6_int;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("u.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param5 + ')');
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
