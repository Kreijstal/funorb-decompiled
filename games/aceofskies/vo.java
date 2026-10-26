/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo extends li implements dr {
    static int[] field_d;
    private bm field_c;

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
        ag.writeHighscoreQuery(opcode, 5, newQuery);
        return newQuery;
    }

    public final boolean a(int param0) {
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

    public final void b(bm param0, int param1) {
        try {
          if (param1 != -40) {
            bm var4 = (bm) null;
            this.a((bm) null, -56);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vo.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(bm param0, int param1) {
        try {
          this.a((byte) 97);
          if (param1 != -6525) {
            bm var4 = (bm) null;
            this.b((bm) null, -98);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vo.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        if (param0 == 8192) {
          return this.a(this.field_c.field_f, (byte) 72);
        }
        String var3 = (String) null;
        this.a((String) null, (byte) -68);
        return this.a(this.field_c.field_f, (byte) 72);
    }

    abstract String a(String param0, byte param1);

    final pt c(int param0) {
        if (param0 == 0) {
          return this.a(this.field_c.field_f, param0 + 8192);
        }
        this.a(83);
        return this.a(this.field_c.field_f, param0 + 8192);
    }

    abstract pt a(String param0, int param1);

    vo(bm param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void d(int param0) {
        if (param0 != 14695) {
          vo.d(89);
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_d = new int[8192];
    }
}
