/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends na {
    private int field_Y;
    private nf field_eb;
    static ej field_ab;
    private String field_cb;
    private dm field_bb;
    static int field_X;
    static String field_db;
    static nf field_Z;

    final void a(int param0, int param1, byte param2, int param3) {
        String var5;
        fi var6;
        int var13;
        Object var17;
        Object var23;
        int var9;
        int var10;
        int var11;
        int var12;
        nf var16;
        nf var18;
        nf var19;
        nf var20;
        nf var21;
        nf var24;
        nf var25;
        nf var26;
        pj var27;
        pj var28;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        fi var6Lifetime1;
        fi var6Lifetime2;
        var17 = null;
        var23 = null;
        var13 = Confined.field_J ? 1 : 0;
        var6 = this.field_bb.a(-3621);
        if (ab.field_b != var6 &&
          qh.field_x != var6) {
          var5 = this.field_bb.a((byte) 75);
          if (var5 == null) {
            var5 = this.field_cb;
          }
        } else {
          var5 = lk.field_f;
        }
        if (!var5.equals(this.field_B)) {
          this.field_B = var5;
          this.b(false);
        }
        if (param2 >= 36) {
          super.a(param0, param1, (byte) 94, param3);
          var6Lifetime1 = this.field_bb.a(-3621);
          var28 = (pj) ((Object) this.field_n);
          var9 = this.field_q + param3;
          var10 = var28.a(param0, 2, (fj) (this)) + (var28.a((fj) (this), (byte) -88).b(23791) >> 1);
          if (ab.field_b != var6Lifetime1 &&
            var6Lifetime1 != qh.field_x) {
            if (var6Lifetime1 == fb.field_e) {
              var24 = gg.field_q[2];
              var24.c(var9, -(var24.field_w >> 1) + var10, 256);
              return;
            }
            if (nn.field_q != var6Lifetime1) {
              return;
            }
            var25 = gg.field_q[1];
            var25.c(var9, var10 - (var25.field_w >> 1), 256);
            return;
          }
          var26 = gg.field_q[0];
          var11 = var26.field_t << 1;
          var12 = var26.field_x << 1;
          if (null == this.field_eb) {
            this.field_eb = new nf(var11, var12);
            vm.a(this.field_eb, -8409);
          } else {
            if (var11 > this.field_eb.field_u) {
              this.field_eb = new nf(var11, var12);
              vm.a(this.field_eb, -8409);
            } else {
              if (this.field_eb.field_w < var12) {
                this.field_eb = new nf(var11, var12);
                vm.a(this.field_eb, -8409);
              } else {
                vm.a(this.field_eb, -8409);
                fn.d();
              }
            }
          }
          var26.a(112, 144, var26.field_t << 4, var26.field_x << 4, -this.field_Y << 10, 4096);
          ib.b(false);
          this.field_eb.c(var9 - (var26.field_t >> 1), var10 - var26.field_x, 256);
          return;
        }
        this.a(-64, 111, (byte) -111, 110);
        super.a(param0, param1, (byte) 94, param3);
        var6Lifetime2 = this.field_bb.a(-3621);
        var27 = (pj) ((Object) this.field_n);
        var9Lifetime1 = this.field_q + param3;
        var10Lifetime1 = var27.a(param0, 2, (fj) (this)) + (var27.a((fj) (this), (byte) -88).b(23791) >> 1);
        if (ab.field_b == var6Lifetime2) {
          var18 = gg.field_q[0];
          var11Lifetime1 = var18.field_t << 1;
          var12Lifetime1 = var18.field_x << 1;
          if (null != this.field_eb &&
            var11Lifetime1 <= this.field_eb.field_u &&
            this.field_eb.field_w >= var12Lifetime1) {
            vm.a(this.field_eb, -8409);
            fn.d();
          } else {
            this.field_eb = new nf(var11Lifetime1, var12Lifetime1);
            vm.a(this.field_eb, -8409);
          }
          var18.a(112, 144, var18.field_t << 4, var18.field_x << 4, -this.field_Y << 10, 4096);
          ib.b(false);
          this.field_eb.c(var9Lifetime1 - (var18.field_t >> 1), var10Lifetime1 - var18.field_x, 256);
          return;
        }
        if (var6Lifetime2 != qh.field_x) {
          if (var6Lifetime2 == fb.field_e) {
            var20 = gg.field_q[2];
            var20.c(var9Lifetime1, -(var20.field_w >> 1) + var10Lifetime1, 256);
            return;
          }
          if (nn.field_q != var6Lifetime2) {
            return;
          }
          var21 = gg.field_q[1];
          var21.c(var9Lifetime1, var10Lifetime1 - (var21.field_w >> 1), 256);
          return;
        }
        var19 = gg.field_q[0];
        var16 = var19;
        var11Lifetime2 = var19.field_t << 1;
        var12Lifetime2 = var19.field_x << 1;
        if (null != this.field_eb &&
          var11Lifetime2 <= this.field_eb.field_u &&
          this.field_eb.field_w >= var12Lifetime2) {
          vm.a(this.field_eb, -8409);
          fn.d();
        } else {
          this.field_eb = new nf(var11Lifetime2, var12Lifetime2);
          vm.a(this.field_eb, -8409);
        }
        var19.a(112, 144, var19.field_t << 4, var19.field_x << 4, -this.field_Y << 10, 4096);
        ib.b(false);
        this.field_eb.c(var9Lifetime1 - (var19.field_t >> 1), var10Lifetime1 - var19.field_x, 256);
        return;
    }

    public static void g(int param0) {
        field_Z = null;
        field_db = null;
        if (param0 != 8692) {
          rh.g(-116);
          field_ab = null;
          return;
        }
        field_ab = null;
    }

    final boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 418) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rh.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    rh(dm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kc.a((byte) 93));
        try {
          this.field_cb = param1;
          this.field_bb = param0;
          this.a(-123, param4, param3, param5, param2);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        try {
          this.field_Y = this.field_Y + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rh.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String f(byte param0) {
        if (param0 <= -82) {
          return null;
        }
        fj var3 = (fj) null;
        this.a((fj) null, -88);
        return null;
    }

    static {
        field_ab = new ej();
        field_X = 0;
        field_db = "You already have lasers";
    }
}
