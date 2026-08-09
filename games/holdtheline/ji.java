/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    String field_l;
    cg[] field_e;
    private int field_k;
    int field_b;
    ul field_g;
    ok[] field_p;
    String field_h;
    int field_c;
    private int field_m;
    String field_f;
    static ah field_a;
    static oa field_i;
    ul field_j;
    static String field_n;
    static double field_d;
    static int field_o;

    final void a(ok param0, byte param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        ok[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        cg var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (this.field_b + 1 <= this.field_m) {
                break L1;
              } else {
                L2: {
                  if (0 == this.field_m) {
                    stackIn_5_0 = 2;
                    break L2;
                  } else {
                    stackIn_5_0 = 2 * this.field_m;
                    break L2;
                  }
                }
                var3_int = stackIn_5_0;
                var4 = new ok[var3_int];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= this.field_b) {
                    this.field_m = var3_int;
                    this.field_p = var4;
                    break L1;
                  } else {
                    var4[var5] = this.field_p[var5];
                    var5++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              this.field_p[fieldTemp$1] = param0;
              if (param1 == 7) {
                break L4;
              } else {
                var7 = (cg) null;
                this.a((cg) null, -26);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ji.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        ka.field_b.a(false);
        if (be.field_l == null) {
            be.field_l = new ra(ka.field_b, nl.field_c);
        }
        ka.field_b.a(be.field_l, false);
        if (param0 > -80) {
            field_i = (oa) null;
        }
    }

    final static go a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        go stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 11 / ((param1 - 8) / 60);
            stackIn_1_0 = new go(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("ji.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_a = null;
        if (!param0) {
            field_a = (ah) null;
        }
        field_i = null;
    }

    final void a(cg param0, int param1) {
        int var3_int = 0;
        cg[] var4 = null;
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var6 = HoldTheLine.field_D;
        try {
            if (!(1 + this.field_c <= this.field_k)) {
                var3_int = 0 == this.field_k ? 2 : this.field_k * 2;
                var4 = new cg[var3_int];
                for (var5 = 0; this.field_c > var5; var5++) {
                    var4[var5] = this.field_e[var5];
                }
                this.field_k = var3_int;
                this.field_e = var4;
            }
            if (param1 != 0) {
                this.field_m = 100;
            }
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_e[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ji.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ji(String param0) {
        try {
            this.field_k = 0;
            this.field_f = "";
            this.field_g = null;
            this.field_j = null;
            this.field_m = 0;
            this.field_b = 0;
            this.field_h = param0;
            this.field_p = null;
            this.field_e = null;
            this.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new ah();
        field_d = 0.0;
        field_n = "Two players can play simultaneously on the same machine. Select a two-player (<col=1>2P</col>) game type at the course menu.";
        field_o = -1;
    }
}
