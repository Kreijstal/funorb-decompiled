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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!gq.a(param2, param1, -4)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (param2.length() <= var3_int) {
              var4 = 36 % ((param0 - 44) / 46);
              return true;
            }
            if (ce.a(param2.charAt(var3_int), (byte) 127)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        field_a = null;
        field_e = null;
        if (param0 != 14077) {
          return;
        }
        field_d = null;
    }

    final static void a(int param0, fm param1) {
        try {
          ak.field_v = param1;
          if (param0 != 1) {
            fm var3 = (fm) null;
            jd.a(-29, (fm) null);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jd(ln param0, ln param1, ln param2, int param3, int param4, int param5) {
        try {
          this.field_g = 1;
          this.field_b = param5;
          this.field_c = param3;
          this.field_f = param4;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_e = "Private";
        field_d = new String[]{"Maximum AI players", "Turn Time (seconds)", "Game Type", "Galaxy Size", "Ruleset", "Movement Range"};
        field_h = "Project is complete and has been deployed. Click to cancel and deploy elsewhere.";
        field_a = "<%glossary>PRODUCTION</col> - Each <%glossary>system</col> has a <%glossary>resource</col> output. Most systems produce low levels of one or two types of resources and only a very few systems are rich in all types. Construction of a fleet requires one unit of each resource.<br><br><%glossary>HOMEWORLD</col> - A <%glossary>resource</col>-rich system. A homeworld is either the starting system for one of the galaxy's colonies (indicated by <%highlight>three circles</col> orbiting the system's current <%glossary>garrison</col> figure) or a <%glossary>neutral</col> homeworld (<%highlight>two circles</col>).<br><br><%glossary>NON-AGGRESSION PACT (NAP)</col> - A temporary alliance between two colonies. After both parties agree to an alliance, they <%highlight>cannot attack</col> each other for <%highlight>three turns</col>. Once created, a <%glossary>NAP</col> can <%highlight>neither be broken or extended</col>.<br><br><%glossary>GARRISON</col> - Each <%glossary>system</col> requires one fleet stationed in it, to maintain order. If you leave a system empty at the end of the turn, you will lose control of it. Systems expected to fall in this way are overlaid with <%highlight>red crosshatching</col>. Systems that could fall due to attack have <%highlight>yellow crosshatching</col>.";
    }
}
