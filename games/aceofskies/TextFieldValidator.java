/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static int[] field_d;
    private EditableTextField field_c;

    final static HighscoreQuery requestHighscores(byte obfuscationGuard, int opcode, int entryLimit, int valuesPerEntry, int queryId) {
        HighscoreQuery existingQuery;
        Object var5 = null;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        if (obfuscationGuard >= 120) {
          existingQuery = (HighscoreQuery) (nh.pendingHighscoreQueries.first(268435455));
          while (existingQuery != null) {
            if (~queryId == ~existingQuery.queryId) {
              return existingQuery;
            }
            existingQuery = (HighscoreQuery) (nh.pendingHighscoreQueries.next((byte) 103));
          }
        } else {
          field_d = (int[]) null;
          existingQuery = (HighscoreQuery) (nh.pendingHighscoreQueries.first(268435455));
          while (existingQuery != null) {
            if (~queryId == ~existingQuery.queryId) {
              return existingQuery;
            }
            existingQuery = (HighscoreQuery) (nh.pendingHighscoreQueries.next((byte) 103));
          }
        }
        HighscoreQuery newQuery = new HighscoreQuery();
        newQuery.queryId = queryId;
        newQuery.entryLimit = entryLimit;
        newQuery.valuesPerEntry = valuesPerEntry;
        nh.pendingHighscoreQueries.addLast(81, newQuery);
        ArchiveRequest.writeHighscoreQuery(opcode, 5, newQuery);
        return newQuery;
    }

    public final boolean hasMissingInput(int param0) {
        if (param0 != 26921) {
          field_d = (int[]) null;
          if (null != this.field_c.field_f) {
            return this.field_c.field_f.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_c.field_f) {
          return true;
        }
        if (this.field_c.field_f.length() != 0) {
          return false;
        }
        return true;
    }

    public final void onTextSubmitted(EditableTextField param0, int param1) {
        try {
          if (param1 != -40) {
            EditableTextField var4 = (EditableTextField) null;
            this.onTextChanged((EditableTextField) null, -56);
          }
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "vo.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        try {
          this.recordInputChange((byte) 97);
          if (param1 != -6525) {
            EditableTextField var4 = (EditableTextField) null;
            this.onTextSubmitted((EditableTextField) null, -98);
          }
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "vo.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 == 8192) {
          return this.getValidationMessage(this.field_c.field_f, (byte) 72);
        }
        String var3 = (String) null;
        this.getValidationMessage((String) null, (byte) -68);
        return this.getValidationMessage(this.field_c.field_f, (byte) 72);
    }

    abstract String getValidationMessage(String param0, byte param1);

    final pt evaluateValidationStatus(int param0) {
        if (param0 == 0) {
          return this.getValidationStatus(this.field_c.field_f, param0 + 8192);
        }
        this.hasMissingInput(83);
        return this.getValidationStatus(this.field_c.field_f, param0 + 8192);
    }

    abstract pt getValidationStatus(String param0, int param1);

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static int bitwiseOr(int param0, int param1) {
        return param0 | param1;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 14695) {
          TextFieldValidator.clearStaticReferences(89);
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = new int[8192];
    }
}
