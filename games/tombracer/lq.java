/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq extends ela {
    static String[] field_p;
    static int[] field_o;

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                lq.f(10);
                break L1;
              }
            }
            mn.h(30001);
            stackIn_3_0 = new bfa("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lq.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void f(int param0) {
        if (param0 != 29706) {
            lq.f(-18);
            field_p = null;
            field_o = null;
            return;
        }
        field_p = null;
        field_o = null;
    }

    lq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = new String[]{"CUDDLY TOY!", "Nice to see you, nice!", "Diamond Studded Snail", "Careful Steps", "That Belongs in a Museum", "Tomb Racer", "Tomb Easy", "Grave Robber", "Running Forever", "Glint in the Eye", "Etruscan Vase", "Ruby Eye", "Jade Idol", "Crystal Skull", "Axis Gold!", "Old Bones", "Crypt of the Dead", "Crypt of Doom", "Crypt of Despair", "Necrophobia", "Victorious Collector", "No, the Other Left!", "Around the World", "And Back Again", "It's a Small World", "Don't Call Me Junior", "We Named The Dog Oklahoma", "Devices of Lethal Cunning", "Silver Watch", "Silver Grail", "Gold Watch", "Golden Grail", "Powers You Can't Possibly Comprehend", "Perfection", "Leap of Faith", "Lucky Clover", "I Hate Snakes", "I Can Fly!", "Playing With Matches", "Split Personality", "Flatmate", "He Chose Poorly"};
        field_o = new int[8192];
    }
}
