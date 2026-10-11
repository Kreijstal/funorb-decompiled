/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends aha {
    static volatile boolean field_K;
    static kv[] field_P;
    private int field_Q;
    private kv field_N;
    static boolean field_M;
    private qu field_L;
    private String field_O;

    public static void d(byte param0) {
        if (param0 > -110) {
          nf.d((byte) 95);
          field_P = null;
          return;
        }
        field_P = null;
    }

    final boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -78) {
            return false;
          }
          this.c((byte) 91);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nf.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
          this.field_Q = this.field_Q + 1;
          super.a(param0, param1, param2, param3 ^ 0);
          if (param3 != 20) {
            field_K = false;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nf.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5;
        jg var6;
        int var14;
        int var7;
        qka var9;
        int var10;
        int var11;
        int var12;
        int var13;
        kv var16;
        kv var17;
        kv var18;
        kv var19;
        int var12Lifetime1;
        int var13Lifetime1;
        jg var6Lifetime1;
        L0: {
          L1: {
            L2: {
              var14 = BachelorFridge.field_y;
              var6 = this.field_L.b(-19704);
              if (cq.field_g != var6 &&
                var6 != ji.field_f) {
                var5 = this.field_L.a((byte) 110);
                if (var5 == null) {
                  var5 = this.field_O;
                  break L2;
                }
                if (!var5.equals(this.field_w)) {
                  break L1;
                }
                break L0;
              }
              var5 = mr.field_h;
            }
            if (var5.equals(this.field_w)) {
              break L0;
            }
          }
          this.field_w = var5;
          this.a(21646);
        }
        var7 = -39 / ((param0 + 20) / 54);
        super.a((byte) 86, param1, param2, param3);
        var6Lifetime1 = this.field_L.b(-19704);
        var9 = (qka) ((Object) this.field_f);
        var10 = param3 + this.field_s;
        var11 = var9.a((wj) (this), param1, (byte) -54) + (var9.b((wj) (this), false).a(false) >> 1);
        if (var6Lifetime1 == cq.field_g) {
          var19 = fr.field_q[0];
          var12 = var19.field_n << 1;
          var13 = var19.field_o << 1;
          if (null == this.field_N) {
            this.field_N = new kv(var12, var13);
            bu.a(0, this.field_N);
          } else {
            if (this.field_N.field_q < var12) {
              this.field_N = new kv(var12, var13);
              bu.a(0, this.field_N);
            } else {
              if (var13 > this.field_N.field_p) {
                this.field_N = new kv(var12, var13);
                bu.a(0, this.field_N);
              } else {
                bu.a(0, this.field_N);
                dg.d();
              }
            }
          }
          var19.b(112, 144, var19.field_n << 4, var19.field_o << 4, -this.field_Q << 10, 4096);
          db.b(120);
          this.field_N.d(-(var19.field_n >> 1) + var10, -var19.field_o + var11, 256);
          return;
        }
        if (var6Lifetime1 != ji.field_f) {
          if (jt.field_f == var6Lifetime1) {
            var16 = fr.field_q[2];
            var16.d(var10, var11 - (var16.field_p >> 1), 256);
            return;
          }
          if (var6Lifetime1 == cm.field_u) {
            var17 = fr.field_q[1];
            var17.d(var10, -(var17.field_p >> 1) + var11, 256);
          }
          return;
        }
        var18 = fr.field_q[0];
        var12Lifetime1 = var18.field_n << 1;
        var13Lifetime1 = var18.field_o << 1;
        if (null == this.field_N) {
          this.field_N = new kv(var12Lifetime1, var13Lifetime1);
          bu.a(0, this.field_N);
        } else {
          if (this.field_N.field_q < var12Lifetime1) {
            this.field_N = new kv(var12Lifetime1, var13Lifetime1);
            bu.a(0, this.field_N);
          } else {
            if (var13Lifetime1 > this.field_N.field_p) {
              this.field_N = new kv(var12Lifetime1, var13Lifetime1);
              bu.a(0, this.field_N);
            } else {
              bu.a(0, this.field_N);
              dg.d();
            }
          }
        }
        var18.b(112, 144, var18.field_n << 4, var18.field_o << 4, -this.field_Q << 10, 4096);
        db.b(120);
        this.field_N.d(-(var18.field_n >> 1) + var10, -var18.field_o + var11, 256);
        return;
    }

    final String c(byte param0) {
        if (param0 == 16) {
          return null;
        }
        return (String) null;
    }

    nf(qu param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, om.b(false));
        try {
          this.field_L = param0;
          this.field_O = param1;
          this.a(param2, param5, (byte) 59, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_K = true;
    }
}
