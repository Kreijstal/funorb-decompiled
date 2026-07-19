/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpa implements fo {
    int field_i;
    boolean field_g;
    kva field_e;
    dpa field_b;
    int field_j;
    int field_a;
    int field_h;
    int field_f;
    int field_d;
    static String field_c;

    public final int e(byte param0) {
        if (param0 > -86) {
          dpa.a(-37);
          return this.field_e.e((byte) -99) + -(this.field_h << -1850429168);
        } else {
          return this.field_e.e((byte) -99) + -(this.field_h << -1850429168);
        }
    }

    public final int b(byte param0) {
        int var2 = 36 / ((-23 - param0) / 53);
        return this.field_e.b((byte) 95) - -this.field_i;
    }

    public final boolean d(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 48) {
            discarded$0 = this.d((byte) -51);
            return this.field_e.d((byte) 48);
        }
        return this.field_e.d((byte) 48);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return 115;
        }
        return this.field_e.c((byte) 125) + this.field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            dpa.a(92);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        gr var3 = null;
        ka var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_e.c(-85);
              if (var3 == null) {
                break L1;
              } else {
                if (var3.a(-102)) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 > 103) {
              L2: {
                L3: {
                  if (-1 == (this.field_h ^ -1)) {
                    break L3;
                  } else {
                    var4 = this.field_e.a(107, (dpa) (this));
                    if (!TombRacer.field_G) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4 = this.field_e.a((dpa) (this), 44);
                break L2;
              }
              var5 = dfa.a(this.field_f, 2048, -54);
              var6 = this.b((byte) -95);
              var7 = this.c((byte) 117);
              var8 = this.e((byte) -106);
              gqa.a(var5, -83584144, var7, var6, var4, var8);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("dpa.DB(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            dpa.a(103);
        }
    }

    final dpa b(int param0) {
        dpa var2 = null;
        var2 = new dpa();
        var2.field_h = this.field_h;
        var2.field_f = this.field_f;
        if (param0 < 8) {
          return (dpa) null;
        } else {
          var2.field_j = this.field_j;
          var2.field_e = this.field_e;
          var2.field_d = this.field_d;
          var2.field_i = this.field_i;
          var2.field_a = this.field_a;
          return var2;
        }
    }

    static {
        field_c = "Spectator";
    }
}
