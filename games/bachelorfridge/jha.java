/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jha extends kj {
    private kv field_h;
    static fea field_g;
    private int field_k;
    static byte[] field_j;
    private int field_f;
    static eaa field_i;

    public static void c(byte param0) {
        if (param0 <= 95) {
            field_g = (fea) null;
        }
        field_g = null;
        field_j = null;
        field_i = null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)(128.0 * (1.0 - Math.cos(3.141592653589793 * (double)this.field_f / 32.0)));
        super.a(param0, param1 + param1, param2);
        this.field_h.a(param2, param0, var4);
    }

    jha(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        kv var5 = null;
        try {
            this.field_f = 64;
            this.field_k = param3;
            var5 = param0.field_s.field_p;
            this.field_h = new kv(var5.field_q, var5.field_p);
            bu.a(0, this.field_h);
            var5.e(0, 0, 16777215);
            db.b(73);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static kv a(vr param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        kv stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (g.a(param2, param3, param1 ^ -30740, param0)) {
              L1: {
                if (param1 == 4) {
                  break L1;
                } else {
                  field_j = (byte[]) null;
                  break L1;
                }
              }
              stackIn_6_0 = ws.a((byte) 98);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("jha.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static sna c(int param0) {
        if (param0 != -31068) {
            return (sna) null;
        }
        return mt.c(0);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_h = (kv) null;
        }
    }

    final boolean b(int param0) {
        int fieldTemp$1 = 0;
        int[][] var2;
        int var3;
        int[] var4;
        int var6;
        int[][] var7;
        int[][] var8;
        int[] var9;
        int[][] var10;
        int[] var11;
        int var5;
        var6 = BachelorFridge.field_y;
        if (param0 > 21) {
          fieldTemp$1 = this.field_f - 1;
          this.field_f = this.field_f - 1;
          if ((fieldTemp$1 ^ -1) >= -1) {
            return true;
          } else {
            if (32 == this.field_f) {
              var10 = this.field_e.field_h.field_i;
              var8 = var10;
              var7 = var8;
              var2 = var7;
              var3 = 0;
              L0: while (true) {
                if (var3 >= var10.length) {
                  return false;
                } else {
                  var11 = var10[var3];
                  var9 = var11;
                  var4 = var9;
                  if (this.field_d == var11[0]) {
                    if (var11[1] == this.field_c) {
                      L1: {
                        var5 = var11[2];
                        if (-1 != var5) {
                          this.field_e.field_T[var5] = this.field_e.field_T[var5] - 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      var4[2] = this.field_k;
                      this.field_e.field_T[this.field_k] = this.field_e.field_T[this.field_k] + 1;
                      var3++;
                      continue L0;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    static {
        field_j = new byte[]{(byte)5, (byte)3, (byte)4, (byte)3, (byte)4};
        field_i = null;
    }
}
