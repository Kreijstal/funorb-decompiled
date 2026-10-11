/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    private boolean field_d;
    private int field_g;
    private int field_l;
    static String field_a;
    static int[] field_f;
    private int field_j;
    static volatile boolean field_h;
    static String field_k;
    private int field_c;
    private int field_e;
    static String field_b;
    static ri field_i;

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_l + 1;
        this.field_l = this.field_l + 1;
        if (this.field_c >= fieldTemp$0) {
          if (!param0) {
            return;
          }
          this.field_e = 11;
          return;
        }
        if (!this.field_d) {
          if (this.field_d) {
            this.field_l = 0;
            if (!param0) {
              return;
            }
            this.field_e = 11;
            return;
          }
          fieldTemp$1 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          if (fieldTemp$1 < this.field_j) {
            this.field_g = this.field_e;
          }
          this.field_l = 0;
          if (!param0) {
            return;
          }
          this.field_e = 11;
          return;
        }
        fieldTemp$2 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$2 > this.field_j) {
          this.field_g = this.field_e;
          this.field_l = 0;
          if (!param0) {
            return;
          }
          this.field_e = 11;
          return;
        }
        if (this.field_d) {
          this.field_l = 0;
          if (!param0) {
            return;
          }
          this.field_e = 11;
          return;
        }
        fieldTemp$3 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (fieldTemp$3 < this.field_j) {
          this.field_g = this.field_e;
        }
        this.field_l = 0;
        if (!param0) {
          return;
        }
        this.field_e = 11;
        return;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_k = null;
        field_b = null;
        field_f = null;
        field_i = null;
        field_a = null;
    }

    hn(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param2;
        this.field_e = param1;
        this.field_c = param3;
        this.field_d = this.field_j > this.field_e ? true : false;
        this.field_g = this.field_e;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var4 = (String) null;
            hn.a(-104, (String) null, false);
          }
          if (param2) {
            stackIn_6_0 = m.field_C.a(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = uq.field_f.a(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ii a(byte param0) {
        if (param0 > -60) {
          field_f = (int[]) null;
          return (ii) ((Object) new aa());
        }
        return (ii) ((Object) new aa());
    }

    static {
        field_a = "Names cannot contain consecutive spaces";
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_h = false;
        field_b = "For those who know it all.";
    }
}
