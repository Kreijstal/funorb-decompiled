/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends jj {
    private lk field_ab;
    private String field_bb;
    private boolean field_db;
    private boolean field_cb;
    private String field_eb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        rg.field_o.a(this.field_eb, param1 + (this.field_u >> 1), 103 + param0, 16777215, -1);
        if (this.field_bb != null) {
          gb.b(20 + param1, 120 + param0 - 7, 260, 8421504);
          rg.field_o.a(this.field_bb, param1 + 20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rg.field_o.field_H);
        }
    }

    final static hf[] a(boolean param0, ce param1) {
        int var5 = 0;
        hf[] stackIn_3_0 = null;
        hf[] stackIn_12_0 = null;
        hf[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        hf[] var4 = null;
        hf var6 = null;
        int var7 = 0;
        ce var8 = null;
        od var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (!param1.a(125)) {
            stackIn_3_0 = new hf[]{};
            return stackIn_3_0;
          }
          if (!param0) {
            var8 = (ce) null;
            nd.a(false, (ce) null);
          }
          var9 = param1.b((byte) 122);
          while (0 == var9.field_b) {
            vh.a(10L, 38);
          }
          if (2 == var9.field_b) {
            stackIn_12_0 = new hf[]{};
            return stackIn_12_0;
          }
          var11 = (int[]) (var9.field_e);
          var10 = var11;
          var3 = var10;
          var4 = new hf[var11.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new hf();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 2];
            var6.field_a = var3[(var5 << 2) + 1];
            var6.field_i = var3[2 + (var5 << 2)];
            var6.field_j = var3[3 + (var5 << 2)];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("nd.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.field_db) ? 0 : 1;
          if (stackIn_3_0 == (param2 ? 1 : 0)) {
            stackIn_8_1 = (param2);
            this.field_db = stackIn_8_1;
            if (this.field_db) {
              this.field_ab.a((byte) 108, 4210752, 8405024);
              this.field_ab.field_H = true;
            } else {
              this.field_ab.a((byte) 79, 4210752, 2113632);
              if (this.field_cb) {
                this.field_ab.field_H = false;
              }
            }
          }
          this.field_eb = param0;
          this.field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
          if (param3 < -112) {
            return;
          }
          this.field_cb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("nd.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void n(int param0) {
        if (param0 == 100) {
          this.field_cb = true;
          this.field_ab.field_H = false;
          return;
        }
        this.b(-71, 115, -86);
        this.field_cb = true;
        this.field_ab.field_H = false;
    }

    nd(f param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_bb = param1;
          if (null != this.field_bb) {
            var3_int = rg.field_o.b(this.field_bb, 260, rg.field_o.field_H);
            this.a(150 + var3_int, (byte) -128, 300);
          }
          this.field_ab = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_cb = false;
          this.field_db = false;
          this.field_ab.field_H = true;
          this.a((qa) (this.field_ab), (byte) -63);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
