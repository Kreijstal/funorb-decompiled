/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt extends nt {
    private int field_u;
    static int field_t;
    private int field_s;
    private int field_v;
    private int field_w;

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_v <= this.field_p) {
          if (param0 != -2567) {
            this.field_w = -90;
            return super.a(-2567);
          }
          return super.a(-2567);
        }
        this.field_o = this.field_o + this.field_s;
        this.field_k = this.field_k + this.field_w;
        this.field_s = this.field_s * 251 / 300;
        this.field_w = 251 * this.field_w / 300;
        if (this.field_w < 0) {
          this.field_w = this.field_w - 1;
          if (this.field_s < 0) {
            this.field_s = this.field_s - 1;
            if (param0 != -2567) {
              this.field_w = -90;
              return super.a(-2567);
            }
            return super.a(-2567);
          }
          this.field_s = this.field_s + 1;
          if (param0 != -2567) {
            this.field_w = -90;
            return super.a(-2567);
          }
          return super.a(-2567);
        }
        this.field_w = this.field_w + 1;
        if (this.field_s < 0) {
          this.field_s = this.field_s - 1;
          if (param0 == -2567) {
            return super.a(-2567);
          }
          this.field_w = -90;
          return super.a(-2567);
        }
        this.field_s = this.field_s + 1;
        if (param0 == -2567) {
          return super.a(-2567);
        }
        this.field_w = -90;
        return super.a(-2567);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var5 = -14 + rm.b(-117, param2 ^ param2 >> 31 | param3 ^ param3 >> 31 | param0 >> 31 ^ param0);
        if (var5 > 0) {
          param3 = param3 >> var5;
          param0 = param0 >> var5;
          param2 = param2 >> var5;
        }
        if (0 >= param3) {
          return -1;
        }
        var6 = -(param0 * (2 * param3)) + param2 * param2;
        if (param1 >= -100) {
          return 115;
        }
        if (var6 < 0) {
          return -1;
        }
        var7 = cb.b(-22415, var6);
        var8 = (var7 - param2 << param4) / param3;
        var9 = (-var7 - param2 << param4) / param3;
        if (var8 >= 0 &&
          var8 <= 1 << param4) {
          if (0 > var9) {
            return var8;
          }
          if (var8 <= var9) {
            return var8;
          }
          return var9;
        }
        if (var9 < 0) {
          return -1;
        }
        if (1 << param4 < var9) {
          return -1;
        }
        return var9;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -121) {
            this.a(84);
          }
          if (this.field_u != 0) {
            im.field_a.a(this.field_k >> 8, this.field_o >> 8, 0, (256 / this.field_v * this.field_p << 24) + this.field_q, 1);
            return;
          }
          uc.field_a.a((float)(this.field_k >> 8), (float)(this.field_o >> 8), 1024, 0, 3, 16777215 + (256 / this.field_v * this.field_p << 24), 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vt.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    vt(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        this.field_v = param0;
        this.field_s = param5;
        this.field_u = param6;
        this.field_w = param4;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          vt.a(false, false);
          rf.field_a.a(0, 0, false);
          return;
        }
        rf.field_a.a(0, 0, false);
    }

    static {
    }
}
