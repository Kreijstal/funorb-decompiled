/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends sp implements ai {
    private wp field_C;
    private wp field_A;
    private wp field_B;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param2 <= -35) {
          var5 = this.field_r + param0;
          var6 = param1 + this.field_v;
          kw.field_b.a(qn.field_h, 20 + var5, var6 + 20, this.field_q - 40, -50 + this.field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.a(param0, param1, (byte) -96, param3);
          return;
        }
        this.field_B = (wp) null;
        var5Lifetime1 = this.field_r + param0;
        var6Lifetime1 = param1 + this.field_v;
        kw.field_b.a(qn.field_h, 20 + var5Lifetime1, var6Lifetime1 + 20, this.field_q - 40, -50 + this.field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
        super.a(param0, param1, (byte) -96, param3);
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 == this.field_A) {
            mu.e(0);
          } else {
            if (param2 != this.field_B) {
              if (this.field_C == param2) {
                vi.e(4);
              }
            } else {
              rv.a((byte) 114);
            }
          }
          if (param1 == 710) {
            return;
          }
          this.field_A = (wp) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("fo.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public fo() {
        super(0, 0, 476, 225, (mh) null);
        this.field_B = new wp(ms.field_i, (qm) null);
        this.field_A = new wp(jc.field_e, (qm) null);
        this.field_C = new wp(tm.field_b, (qm) null);
        ue var1 = new ue();
        this.field_B.field_w = (mh) ((Object) var1);
        this.field_A.field_w = (mh) ((Object) var1);
        this.field_C.field_w = (mh) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_A.a(97, this.field_q - var3 >> 1, -var2 + (-48 + this.field_p), 30, var4);
        this.field_C.a(-86, (this.field_q - var3 >> 1) + var4 + var2, -48 + this.field_p - var2, 30, var4);
        this.field_B.a(-112, -var3 + this.field_q >> 1, -(var2 * 2) + this.field_p - 78, 30, var3);
        this.field_A.field_o = (qm) (this);
        this.field_B.field_o = (qm) (this);
        this.field_B.field_t = aj.field_x;
        this.field_C.field_o = (qm) (this);
        this.field_C.field_t = hg.field_t;
        this.a(this.field_A, 120);
        this.a(this.field_B, 70);
        this.a(this.field_C, 83);
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            this.a(-128, -68, (byte) -69, -31);
          }
          if (super.a(param0, param1, (byte) 20, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_8_0 = this.a((byte) 123, param0);
            return stackIn_8_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param0, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("fo.KA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
