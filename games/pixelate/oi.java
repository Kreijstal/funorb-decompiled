/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_b;
    static SceneWidget field_e;
    static volatile int field_c;
    static String field_a;
    static String field_d;

    final static boolean a(AccountRegistrationPanel param0, int param1, boolean param2, String param3, byte param4, String param5, String param6) {
        RuntimeException var7 = null;
        RegistrationRequestDialog var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wm.field_a != MarkerSlider.field_X) {
            return false;
          }
          var8 = new RegistrationRequestDialog(wa.field_c, param0);
          wa.field_c.b(-6183, var8);
          if (!og.a((byte) -96)) {
            MarkerSlider.field_X = Js5NetworkRequest.field_F;
            MouseWheelHandler.field_b = null;
            StripedProgressBar.field_J = param2;
            nk.field_b = param3;
            um.field_r = param1;
            Match.field_s = param5;
            VerticalScrollbar.field_Nb = param6;
          } else {
            var8.h((byte) -118);
          }
          if (param4 < -86) {
            return true;
          }
          field_d = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("oi.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, byte param2) {
        try {
          if (param2 != -33) {
            String var4 = (String) null;
            oi.a((AccountRegistrationPanel) null, -20, true, (String) null, (byte) -44, (String) null, (String) null);
          }
          ByteStorage.a(param1, false, 32, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "oi.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, LobbyPlayer param4, int param5, ScrollContainer param6) {
        ClientContextMenu var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          em.openContextMenu(param4.field_Fb, param4.field_Nb, param4.field_Ub, -1, param4, -163, param6, (int[]) null, -1);
          ProxySocketConnector.field_n.b(true, (byte) -98);
          ProxySocketConnector.field_n.a(0, (int[]) null, -3);
          int var7_int = -127 / ((param3 - 0) / 38);
          ProxySocketConnector.field_n.b(8893);
          var8 = ProxySocketConnector.field_n;
          var9 = param0;
          var10 = param2;
          var11 = param5;
          var12 = param1;
          var8.field_b.layoutPopup(var12, var9, 28, var10, var11);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "oi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_b = "Searching for an opponent";
        field_a = "Decline invitation to <%0>'s game";
        field_d = "Your rating is <%0>";
    }
}
