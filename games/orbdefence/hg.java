/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends sf {
    static int field_Z;
    static hj field_ab;

    public static void c(boolean param0) {
        field_ab = null;
        if (param0) {
          String var2 = (String) null;
          hg.a((String) null, (String) null, (String) null, (byte) 69);
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (String) null;
            hg.a((String) null, (byte) 106);
          }
          if (!param0) {
            stackIn_6_0 = jd.field_a.a(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = ck.field_g.a(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static mi a(String param0, byte param1) {
        RuntimeException var2 = null;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 113) {
            stackIn_4_0 = new mi(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (mi) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hg.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param3 < -2) {
          var4 = param0.indexOf(param2);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 == -1))) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(var4 + param2.length());
            stackIn_7_0 = (String) (param0);
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_7_0).indexOf(param2, param1.length() + var4);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_7_0 = (String) (param0);
          }
          return stackIn_7_0;
        }
        field_Z = -35;
        var4Lifetime1 = param0.indexOf(param2);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4Lifetime1 == -1))) {
          param0 = param0.substring(0, var4Lifetime1) + param1 + param0.substring(var4Lifetime1 + param2.length());
          stackIn_13_0 = (String) (param0);
          if (var5 == 0) {
            var4Lifetime1 = ((String) (Object) stackIn_13_0).indexOf(param2, param1.length() + var4Lifetime1);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = (String) (param0);
        }
        return stackIn_13_0;
    }

    private hg() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
    }
}
