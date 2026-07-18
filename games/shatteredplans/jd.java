/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    int field_g;
    static String field_e;
    static bi[] field_j;
    int field_f;
    int field_b;
    int field_c;
    static String field_a;
    static String field_h;
    static String[] field_d;
    static int field_i;

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            int discarded$6 = -4;
            if (gq.a(param2, false)) {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  var4 = 0;
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (ce.a(param2.charAt(var3_int), (byte) 127)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("jd.A(").append(116).append(',').append(false).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void a() {
        field_h = null;
        field_j = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, fm param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ak.field_v = param1;
              if (param0 == 1) {
                break L1;
              } else {
                var3 = null;
                jd.a(-29, (fm) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jd.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    jd(ln param0, ln param1, ln param2, int param3, int param4, int param5) {
        try {
            ((jd) this).field_g = 1;
            ((jd) this).field_b = param5;
            ((jd) this).field_c = param3;
            ((jd) this).field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Private";
        field_d = new String[]{"Maximum AI players", "Turn Time (seconds)", "Game Type", "Galaxy Size", "Ruleset", "Movement Range"};
        field_h = "Project is complete and has been deployed. Click to cancel and deploy elsewhere.";
        field_a = "<%glossary>PRODUCTION</col> - Each <%glossary>system</col> has a <%glossary>resource</col> output. Most systems produce low levels of one or two types of resources and only a very few systems are rich in all types. Construction of a fleet requires one unit of each resource.<br><br><%glossary>HOMEWORLD</col> - A <%glossary>resource</col>-rich system. A homeworld is either the starting system for one of the galaxy's colonies (indicated by <%highlight>three circles</col> orbiting the system's current <%glossary>garrison</col> figure) or a <%glossary>neutral</col> homeworld (<%highlight>two circles</col>).<br><br><%glossary>NON-AGGRESSION PACT (NAP)</col> - A temporary alliance between two colonies. After both parties agree to an alliance, they <%highlight>cannot attack</col> each other for <%highlight>three turns</col>. Once created, a <%glossary>NAP</col> can <%highlight>neither be broken or extended</col>.<br><br><%glossary>GARRISON</col> - Each <%glossary>system</col> requires one fleet stationed in it, to maintain order. If you leave a system empty at the end of the turn, you will lose control of it. Systems expected to fall in this way are overlaid with <%highlight>red crosshatching</col>. Systems that could fall due to attack have <%highlight>yellow crosshatching</col>.";
    }
}
