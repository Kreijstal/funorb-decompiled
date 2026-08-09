/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qa {
    static String field_d;
    static ef field_c;
    static int[][] field_a;
    static String[] field_e;
    static String field_b;

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    final static q[] a(int param0, String param1, String param2, nh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        q[] stackIn_2_0 = null;
        q[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 15322) {
              var4_int = param3.a(param2, 1000);
              var5 = param3.a(0, param1, var4_int);
              stackIn_4_0 = rf.a(var5, (byte) -71, param3, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (q[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("qa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract tm a(int param0);

    public static void b(int param0) {
        field_d = null;
        field_a = (int[][]) null;
        if (param0 != -2544) {
          field_a = (int[][]) null;
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        field_d = "<col=8B8B2E>Flee</col>";
        field_c = new ef();
        field_b = "Visit the Account Management section on the main site to view.";
        field_e = new String[]{"Special Abilities", "Some raiders, such as <%raidertype> possess a <%col_useskill>special ability</col>. You can find out what they are by reviewing the raider's description. When the raider's portrait in the party display is surrounded by a <%highlight>blue glow</col>, the ability is ready to use.<br><br><%command>Click the blue star symbol</col> at the bottom-right of the screen to employ it. Most abilities can only be used at specific times, and most can only be used once per raid.</col>"};
    }
}
