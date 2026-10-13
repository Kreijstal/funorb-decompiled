/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int[] field_f;
    static int[] viewFacePointOneY;
    static String field_d;
    static boolean field_b;
    static int field_c;
    static UiComponent field_a;
    static String receivedChatSenderName;

    public static void a(byte param0) {
        receivedChatSenderName = null;
        field_a = null;
        if (param0 != 121) {
          return;
        }
        viewFacePointOneY = null;
        field_f = null;
        field_d = null;
    }

    final static dl a(int param0, int param1, String param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wi();
          if (param0 < 17) {
            var4 = (String) null;
            nd.a(19, -8, (String) null);
          }
          ((dl) ((Object) var3)).field_c = param1;
          ((dl) ((Object) var3)).field_a = param2;
          stackIn_3_0 = var3;
          return (dl) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (param3) {
          if (ec.field_N[param1] > ec.field_N[param2]) {
            return true;
          }
          if (ec.field_N[param2] > ec.field_N[param1]) {
            return false;
          }
          if (pj.field_b[param1] > pj.field_b[param2]) {
            return true;
          }
          if (pj.field_b[param2] > pj.field_b[param1]) {
            return false;
          }
          if (param0) {
            var4 = ib.field_D[param2] + (ObjectHistoryBuffer.field_p[param2] + RankingsScreen.field_r[param2]);
            var5 = ib.field_D[param1] + RankingsScreen.field_r[param1] + ObjectHistoryBuffer.field_p[param1];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(param1 <= param2);
          }
          field_c = -96;
          var4Lifetime3 = ib.field_D[param2] + (ObjectHistoryBuffer.field_p[param2] + RankingsScreen.field_r[param2]);
          var5Lifetime3 = ib.field_D[param1] + RankingsScreen.field_r[param1] + ObjectHistoryBuffer.field_p[param1];
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var5Lifetime3 < var4Lifetime3) {
            return false;
          }
          return !(param1 <= param2);
        }
        if (pj.field_b[param1] > pj.field_b[param2]) {
          return true;
        }
        if (pj.field_b[param1] < pj.field_b[param2]) {
          return false;
        }
        if (ec.field_N[param1] > ec.field_N[param2]) {
          return true;
        }
        if (ec.field_N[param2] > ec.field_N[param1]) {
          return false;
        }
        if (param0) {
          var4Lifetime1 = ib.field_D[param2] + (ObjectHistoryBuffer.field_p[param2] + RankingsScreen.field_r[param2]);
          var5Lifetime1 = ib.field_D[param1] + RankingsScreen.field_r[param1] + ObjectHistoryBuffer.field_p[param1];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param1 <= param2);
        }
        field_c = -96;
        var4Lifetime2 = ib.field_D[param2] + (ObjectHistoryBuffer.field_p[param2] + RankingsScreen.field_r[param2]);
        var5Lifetime2 = ib.field_D[param1] + RankingsScreen.field_r[param1] + ObjectHistoryBuffer.field_p[param1];
        if (var5Lifetime2 > var4Lifetime2) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime2) {
          return false;
        }
        if (param1 <= param2) {
          return false;
        }
        return true;
    }

    static {
        field_b = true;
        viewFacePointOneY = new int[8192];
        field_d = "Just play";
    }
}
