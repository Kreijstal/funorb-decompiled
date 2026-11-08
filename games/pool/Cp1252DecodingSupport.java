/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Cp1252DecodingSupport {
    static int field_d;
    static String muGamelistPlayers;
    private static int field_a;
    static String youCannotJoinInProgress;

    public static void releaseStatics(int param0) {
        muGamelistPlayers = null;
        youCannotJoinInProgress = null;
        if (param0 != 0) {
          MeshBuilder var2 = (MeshBuilder) null;
          Cp1252DecodingSupport.mirrorVertically(true, (MeshBuilder) null);
        }
    }

    final static MeshBuilder mirrorVertically(boolean param0, MeshBuilder param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        MeshBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          for (var2_int = 0; param1.vertexY.length > var2_int; var2_int++) {
            param1.vertexY[var2_int] = -param1.vertexY[var2_int];
          }
          if (!param0) {
            var4 = (String) null;
            Cp1252DecodingSupport.showLoadingProgress((String) null, false, false, -0.28095385432243347f);
          }
          ImageProducerRasterBuffer.reverseFaceWinding(param1, (byte) 38);
          param1.clearCaches();
          stackIn_7_0 = (MeshBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("a.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String decodeBytesToString(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -3 % ((69 - param1) / 54);
          stackIn_1_0 = RankingsScreen.decodeWindows1252(param0.length, -7510, param0, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("a.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void showLoadingProgress(String param0, boolean param1, boolean param2, float param3) {
        try {
          if (ScrollPane.field_Nb == null) {
            ScrollPane.field_Nb = new ProgressDialog(TabbedPane.field_Ub, ClientException.field_d);
            TabbedPane.field_Ub.showDialog(ScrollPane.field_Nb, 30000);
          }
          ScrollPane.field_Nb.updateProgress(param0, 2113632, param3, param2);
          SoftwareRasterizer.clear();
          PolarBallSkin.drawAccountInterfaceOverlays((byte) -118, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "a.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = 15;
        muGamelistPlayers = "Players";
        youCannotJoinInProgress = "You cannot join this game - it is in progress";
        field_d = 1 << field_a;
    }
}
