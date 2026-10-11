/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends mc {
    private boolean[] field_n;
    int field_o;
    int[][] field_q;
    int[] field_s;
    static String field_t;
    int field_r;
    int[] field_p;

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (q.a(false, param1)) {
            return false;
          }
          if (ha.a(param1, -63)) {
            return false;
          }
          if (pi.a(param1, 17510)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (jd.a(param1, -6270, param2)) {
            return false;
          }
          if (param0 != -41) {
            oe.a(true);
          }
          if (mf.a((byte) 29, param2, param1)) {
            return false;
          }
          if (!qa.a(param0 ^ -16757, param1, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("oe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
          oe.a(false);
        }
    }

    oe(int param0, byte[] param1) {
        int[] array$0 = null;
        int var5 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        bh var7 = null;
        bh var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.field_o = param0;
          var7 = new bh(param1);
          var8 = var7;
          this.field_r = var8.d((byte) -99);
          this.field_p = new int[this.field_r];
          this.field_s = new int[this.field_r];
          this.field_q = new int[this.field_r][];
          this.field_n = new boolean[this.field_r];
          for (var4 = 0; var4 < this.field_r; var4++) {
            this.field_p[var4] = var7.d((byte) -99);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_r; var4Lifetime1++) {
            stackIn_8_0 = this.field_n;
            stackIn_8_1 = var4Lifetime1;
            stackIn_9_2 = (var8.d((byte) -99) == 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_r; var4Lifetime2++) {
            this.field_s[var4Lifetime2] = var7.e(127);
          }
          for (var4Lifetime3 = 0; this.field_r > var4Lifetime3; var4Lifetime3++) {
            array$0 = new int[var7.d((byte) -99)];
            this.field_q[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; this.field_r > var4Lifetime4; var4Lifetime4++) {
            for (var5 = 0; this.field_q[var4Lifetime4].length > var5; var5++) {
              this.field_q[var4Lifetime4][var5] = var7.d((byte) -99);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("oe.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_t = "Connecting to<br>friend server...";
    }
}
