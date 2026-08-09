/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv {
    static qla field_a;
    static jea field_b;
    static String[] field_c;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = dfa.a('_', "", param2, 0);
              if (param0 >= 17) {
                break L1;
              } else {
                field_c = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = hua.a(param1, 0);
                if (-1 != param2.indexOf(param1)) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("kv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != -31014) {
          field_a = (qla) null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var4;
        if (param2 != 95) {
          return;
        } else {
          jg.field_a.field_h = 0;
          jg.field_a.i(12, 0);
          jg.field_a.a(lpa.field_p.nextInt(), (byte) -108);
          jg.field_a.a(lpa.field_p.nextInt(), (byte) 111);
          jg.field_a.i(param1, 0);
          jg.field_a.i(param0, 0);
          jg.field_a.f(-1477662136, param3);
          jg.field_a.a(126, c.field_f, oca.field_a);
          ql.field_k.k(18, param2 + -3083);
          fieldTemp$1 = ql.field_k.field_h + 1;
          ql.field_k.field_h = ql.field_k.field_h + 1;
          var4 = fieldTemp$1;
          ql.field_k.a(0, jg.field_a.field_g, jg.field_a.field_h, param2 + -42);
          ql.field_k.d(ql.field_k.field_h + -var4, (byte) -19);
          return;
        }
    }

    static {
        field_c = new String[]{"Win a round after choosing the cuddly toy as a reward", "Win a round using Bruce or Johnsson in a rated match", "Win a round even after reaching the finish line last in a rated match", "Win a game requiring 3 rounds to win and 6 rooms per course without dying in a rated match", "Win a round where all players ended up with the same amount of treasure in a rated match", "In a rated match reach the finish so quickly, no opponents manage it", "Win a rated game by winning every round", "Win a rated game", "Win a rated game after it dragged on for the longest possible number of rounds", "Get a 5 game winning streak", "Collect 1000 treasure ever", "Collect 5000 treasure ever", "Collect 25000 treasure ever", "Collect 100000 treasure ever", "Collect 500000 treasure ever", "Kill 5 skeletons", "Kill 25 skeletons", "Kill 125 skeletons", "Kill 500 skeletons", "Kill 2500 skeletons", "Collect 500 treasure in a rated game and win", "Break another player's 5 game winning streak in a rated race", "Win with every character in a rated race", "Win against every character in a rated race", "Unlock 5 characters", "Unlock 10 characters", "Unlock all characters", "Finish the Solo Adventure", "Achieve silver times in 4 tombs in the Solo Adventure", "Achieve silver times in all the tombs in the Solo Adventure", "Achieve gold times in 4 tombs in the Solo Adventure", "Achieve gold times in all the tombs in the Solo Adventure", "Finish any tomb in the Solo Adventure without dying", "Collect all treasure from every room in the game during a race", "Don't hesitate", "Blind faith", "Die 100 times from snakes", "Fall down holes 100 times", "Die from fire 100 times", "Die from blades 100 times", "Die from being crushed 100 times ", "Die within 2 seconds of collecting an idol"};
    }
}
