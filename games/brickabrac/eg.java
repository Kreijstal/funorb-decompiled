/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends nm {
    long[][] field_r;
    boolean field_o;
    int[][] field_n;
    int field_l;
    static String field_j;
    static int field_m;
    static boolean field_k;
    int field_q;
    String[][] field_i;
    int field_p;

    final static void a(boolean param0, int param1) {
        uo.a(param0, false);
        cq.a(param0, (byte) -125);
        if (param1 < 10) {
            byte[] var3 = (byte[]) null;
            eg.a(38, (byte[]) null, true);
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        eo stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1.length > 136) {
                var3 = new eo();
                ((tl) ((Object) var3)).a(67, param1);
                stackIn_6_0 = (eo) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 < -103) {
                  if (!param2) {
                    stackIn_14_0 = (byte[]) (param1);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = ke.a(false, param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = (Object) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("eg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 136) {
            field_k = false;
        }
    }

    eg() {
    }

    static {
        field_j = "Enter name of friend to delete from list";
    }
}
