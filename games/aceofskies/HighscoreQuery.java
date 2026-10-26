/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreQuery extends IntrusiveNode {
    boolean completed;
    int[][] valuesByView;
    static qr field_l;
    int queryId;
    int entryLimit;
    static ll[] field_k;
    String[][] namesByView;
    static vd field_g;
    static RenderSprite[] field_o;
    int valuesPerEntry;
    long[][] submissionTokensByView;

    public static void a(byte param0) {
        field_o = null;
        field_g = null;
        field_k = null;
        field_l = null;
        if (param0 != 35) {
          field_g = (vd) null;
        }
    }

    final static CoverageBitmapFont a(int param0, ResourceArchive param1, int param2, ResourceArchive param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tn.a(param3, (byte) -127, param2, param4)) {
            stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          var5_int = -15 / ((param0 - 65) / 51);
          stackIn_4_0 = te.a(param1.a(param4, -10470, param2), -80);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("uc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(mg param0, int param1, int param2, int param3) {
        if (param1 != 25345) {
          return;
        }
        try {
          qg.field_d = param0;
          po.field_j = param2;
          ku.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "uc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    HighscoreQuery() {
    }

    static {
        field_l = new qr();
    }
}
