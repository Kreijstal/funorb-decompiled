/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TableQuickChatHelpers {
    static int receivedChatChannel;
    static UiComponent field_b;
    static String field_d;
    static RgbSprite[] field_c;

    final static QuickChatCategoryDefinition findRootQuickChatCategory(int startingCategoryId) {
        int categoryId = 0;
        QuickChatCategoryDefinition definition = null;
        int unusedGameFlag = 0;
        QuickChatCategoryDefinition result = null;
        Throwable caughtFailure = null;
        IllegalArgumentException ignoredInvalidCategory = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          categoryId = startingCategoryId;
          while (true) {
            definition = DebouncedValidationSource.quickChatCategories.getDefinition(categoryId, (byte) -97);
            if (!definition.rootMarker) {
              categoryId++;
              continue;
            }
            break;
          }
          result = definition;
          return result;
        } catch (java.lang.IllegalArgumentException caughtParameter) {
          caughtFailure = caughtParameter;
          ignoredInvalidCategory = (IllegalArgumentException) (Object) caughtFailure;
          return null;
        }
    }

    final static int findTableRow(TableDataRequest table, TableRowSubmission submission, int obfuscationGuard, int partition) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (table != null &&
            table.values != null &&
            submission != null &&
            submission.tableId == table.tableId) {
            var4_int = submission.values.length;
            var5 = table.values[partition].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (submission.rowId == table.rowIds[partition][var6] &&
                SpaceBackground.isLocalPlayerName(table.names[partition][var6], -46)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (submission.values[var7] != table.values[partition][var7 + var4_int * var6]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            var6Lifetime1 = 127 / ((obfuscationGuard - 59) / 36);
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("gj.C(");
          if (table == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (submission == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(obfuscationGuard).append(',').append(partition).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -27956) {
          field_c = (RgbSprite[]) null;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_d = "Tutorial: <%0>";
    }
}
