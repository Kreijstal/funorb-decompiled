/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_g;
    static qb[] field_i;
    static String field_f;
    static int field_h;
    static ll[] field_c;
    static String field_e;
    static String field_d;
    static String field_a;
    static String field_b;

    final static String a(int param0, String param1, eg param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.c(param0 - 28076)) {
            stackIn_2_0 = (String) (param3);
            return stackIn_2_0;
          }
          if (param0 != 17153) {
            field_b = (String) null;
          }
          stackIn_6_0 = param1 + " - " + param2.b(param4, 119) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("nm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (vm.field_b != null &&
            !vm.field_b.equals(param0.getParameter("settings"))) {
            var3 = vm.field_b;
            var4 = var3;
            var4 = var3;
          }
          if (so.field_g != null &&
            !so.field_g.equals(param0.getParameter("session"))) {
            var4 = so.field_g;
          }
          if (param2 == -31843) {
            stackIn_11_0 = si.a((byte) 115, (String) (var3), (String) (var4), -1, param1);
            return stackIn_11_0;
          }
          stackIn_9_0 = (java.net.URL) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nm.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 == -1) {
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_b = null;
          field_d = null;
          field_i = null;
          return;
        }
        field_e = (String) null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_i = null;
    }

    static {
        field_g = "<%0> must play 1 more rated game before playing with the current options.";
        field_f = "There are no valid types of game that match your preferences.";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = "In Rated games, it is important to remember that, as long as your team wins and you haven't resigned, you will gain rating. You will only lose your rating if you resign or your team loses. So, don't quit just because you have died: stay, give advice and cheer on your allies!";
        field_e = "Unable to add friend - system busy";
    }
}
