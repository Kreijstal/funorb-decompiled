/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    int field_v;
    static sk field_x;
    SectorCacheStore field_t;
    static int field_y;
    static String field_w;
    byte[] field_u;

    final byte[] getData(int param0) {
        if (this.field_r) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_u;
        }
        this.field_t = (SectorCacheStore) null;
        return this.field_u;
    }

    final static ma d(byte param0) {
        if (param0 == 10) {
          return new ma(we.a(29084), IterableNodeHashTable.a(-86));
        }
        field_x = (sk) null;
        return new ma(we.a(29084), IterableNodeHashTable.a(-86));
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_x = null;
        field_w = null;
        int var1 = 34 % ((-11 - param0) / 38);
    }

    final int getProgressPercent(int param0) {
        if (param0 != -29144) {
          this.getProgressPercent(69);
          if (!this.field_r) {
            return 100;
          }
          return 0;
        }
        if (!this.field_r) {
          return 100;
        }
        return 0;
    }

    final static AccountServiceResult pollAccountNameCheck(int param0, String param1) {
        RuntimeException var2 = null;
        AccountServiceResult stackIn_5_0 = null;
        AccountServiceResult stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (jl.field_a == AlphaWidgetContainer.field_x) {
            return null;
          }
          if (param0 > -27) {
            stackIn_5_0 = (AccountServiceResult) null;
            return stackIn_5_0;
          }
          if (AlphaWidgetContainer.field_x == s.field_f &&
            param1.equals(te.field_a)) {
            AlphaWidgetContainer.field_x = cl.field_k;
            stackIn_9_0 = mf.field_a;
            return stackIn_9_0;
          }
          mf.field_a = null;
          AlphaWidgetContainer.field_x = jl.field_a;
          te.field_a = param1;
          stackIn_11_0 = null;
          return (AccountServiceResult) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    DiskArchiveRequest() {
    }

    static {
        field_x = new sk();
        field_w = "Player names can be up to 12 letters, numbers and underscores";
    }
}
