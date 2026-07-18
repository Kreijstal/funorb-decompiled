/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv {
    static qla field_a;
    static jea field_b;
    static String[] field_c;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param2 = dfa.a('_', "", param2, 0);
              if (param0 >= 17) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              L3: {
                int discarded$2 = 0;
                var3 = hua.a(param1);
                if (-1 != param2.indexOf(param1)) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("kv.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        jg.field_a.field_h = 0;
        jg.field_a.i(12, 0);
        jg.field_a.a(lpa.field_p.nextInt(), (byte) -108);
        jg.field_a.a(lpa.field_p.nextInt(), (byte) 111);
        jg.field_a.i(param1, 0);
        jg.field_a.i(param0, 0);
        jg.field_a.f(-1477662136, param3);
        jg.field_a.a(126, c.field_f, oca.field_a);
        ql.field_k.k(18, -2988);
        int fieldTemp$0 = ql.field_k.field_h + 1;
        ql.field_k.field_h = ql.field_k.field_h + 1;
        int var4 = fieldTemp$0;
        ql.field_k.a(0, jg.field_a.field_g, jg.field_a.field_h, 53);
        ql.field_k.d(ql.field_k.field_h + -var4, (byte) -19);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Win a round after choosing the cuddly toy as a reward", "Win a round using Bruce or Johnsson in a rated match", "Win a round even after reaching the finish line last in a rated match", "Win a game requiring 3 rounds to win and 6 rooms per course without dying in a rated match", "Win a round where all players ended up with the same amount of treasure in a rated match", "In a rated match reach the finish so quickly, no opponents manage it", "Win a rated game by winning every round", "Win a rated game", "Win a rated game after it dragged on for the longest possible number of rounds", "Get a 5 game winning streak", "Collect 1000 treasure ever", "Collect 5000 treasure ever", "Collect 25000 treasure ever", "Collect 100000 treasure ever", "Collect 500000 treasure ever", "Kill 5 skeletons", "Kill 25 skeletons", "Kill 125 skeletons", "Kill 500 skeletons", "Kill 2500 skeletons", "Collect 500 treasure in a rated game and win", "Break another player's 5 game winning streak in a rated race", "Win with every character in a rated race", "Win against every character in a rated race", "Unlock 5 characters", "Unlock 10 characters", "Unlock all characters", "Finish the Solo Adventure", "Achieve silver times in 4 tombs in the Solo Adventure", "Achieve silver times in all the tombs in the Solo Adventure", "Achieve gold times in 4 tombs in the Solo Adventure", "Achieve gold times in all the tombs in the Solo Adventure", "Finish any tomb in the Solo Adventure without dying", "Collect all treasure from every room in the game during a race", "Don't hesitate", "Blind faith", "Die 100 times from snakes", "Fall down holes 100 times", "Die from fire 100 times", "Die from blades 100 times", "Die from being crushed 100 times ", "Die within 2 seconds of collecting an idol"};
    }
}
