/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends IntrusiveNode {
    int[] field_p;
    static uv field_n;
    int field_k;
    private boolean[] field_q;
    static String field_m;
    int[][] field_l;
    static ru field_t;
    static String field_r;
    int[] field_s;
    int field_o;

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        field_t = null;
        field_r = null;
        if (param0 < 1) {
          field_m = (String) null;
        }
    }

    final static g a(Throwable param0, String param1) {
        g var2 = null;
        if (param0 instanceof g) {
          var2 = (g) ((Object) param0);
          var2.field_g = var2.field_g + ' ' + param1;
        } else {
          var2 = new g(param0, param1);
        }
        return var2;
    }

    ig(int param0, byte[] param1) {
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
        PacketBuffer var7 = null;
        PacketBuffer var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.field_k = param0;
          var7 = new PacketBuffer(param1);
          var8 = var7;
          this.field_o = var8.readUnsignedByte(0);
          this.field_l = new int[this.field_o][];
          this.field_q = new boolean[this.field_o];
          this.field_p = new int[this.field_o];
          this.field_s = new int[this.field_o];
          for (var4 = 0; var4 < this.field_o; var4++) {
            this.field_p[var4] = var7.readUnsignedByte(0);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_o; var4Lifetime1++) {
            stackIn_8_0 = this.field_q;
            stackIn_8_1 = var4Lifetime1;
            stackIn_9_2 = (var8.readUnsignedByte(0) == 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (var4Lifetime2 = 0; this.field_o > var4Lifetime2; var4Lifetime2++) {
            this.field_s[var4Lifetime2] = var7.readUnsignedShort((byte) -104);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < this.field_o; var4Lifetime3++) {
            array$0 = new int[var7.readUnsignedByte(0)];
            this.field_l[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; this.field_o > var4Lifetime4; var4Lifetime4++) {
            for (var5 = 0; var5 < this.field_l[var4Lifetime4].length; var5++) {
              this.field_l[var4Lifetime4][var5] = var7.readUnsignedByte(0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -8327) {
          String var2 = (String) null;
          ig.a((Throwable) null, (String) null);
        }
        return da.a(23660, CombatEvent.d((byte) 16));
    }

    static {
        field_m = "Tutorial";
        field_r = "Scamming";
    }
}
