/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TableRowSubmission extends IntrusiveNode {
    int resultWordFour;
    static int field_l;
    int resultWordTwo;
    long rowId;
    static String field_s;
    int requestId;
    int tableWord;
    int resultWordOne;
    int resultWordThree;
    int[] values;
    int tableId;

    public static void a(int param0) {
        field_s = null;
        if (param0 != -241) {
          field_l = -95;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param7 != -1) {
            TableRowSubmission.a(-117);
          }
          for (var12 = -param4; var12 < 0; var12++) {
            for (var13 = -param6; var13 < 0; var13++) {
              incrementValue$0 = param3;
              param3++;
              param2 = param9[incrementValue$0] & 255;
              if (param2 != 0 &&
                param2 <= 240) {
                var11 = 255 & param2;
                var10_int = param0[param8];
                incrementValue$1 = param8;
                param8++;
                param0[incrementValue$1] = LevelSelectScreen.d(ik.a(var11 * ik.a(var10_int, 65280) >> 8, 65280), LevelSelectScreen.d(ik.a(-16777216, var10_int), ik.a(16711935, ik.a(var10_int, 16711935) * var11 >> 8)));
              } else {
                param8++;
              }
            }
            param3 = param3 + param5;
            param8 = param8 + param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_16_0 = var10;
          stackIn_16_1 = new StringBuilder().append("sp.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    TableRowSubmission(int tableId, int tableWord, int resultWordOne, int resultWordTwo, int resultWordThree, int resultWordFour, int[] values) {
        int fieldTemp$0 = 0;
        try {
          this.tableId = tableId;
          this.resultWordTwo = resultWordTwo;
          this.resultWordThree = resultWordThree;
          this.resultWordFour = resultWordFour;
          this.resultWordOne = resultWordOne;
          this.tableWord = tableWord;
          this.values = values;
          fieldTemp$0 = qf.tableSubmissionSequence;
          qf.tableSubmissionSequence = qf.tableSubmissionSequence + 1;
          this.requestId = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sp.<init>(" + tableId + ',' + tableWord + ',' + resultWordOne + ',' + resultWordTwo + ',' + resultWordThree + ',' + resultWordFour + ',' + (values != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
        field_s = "Off";
    }
}
