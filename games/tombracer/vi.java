/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private vna field_b;
    static int field_a;

    final void a(int param0) {
        tt var3;
        if (param0 != 0) {
          var3 = (tt) null;
          this.a((byte) 62, (tt) null);
          this.field_b.d(param0 ^ 8);
          return;
        } else {
          this.field_b.d(param0 ^ 8);
          return;
        }
    }

    final tt a(boolean param0) {
        if (param0) {
          if (this.field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) ((Object) this.field_b.c(-113));
          }
        } else {
          this.field_b = (vna) null;
          if (this.field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) ((Object) this.field_b.c(-113));
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0, tt param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_b.b((byte) -110, param1);
            if (param0 > 9) {
              stackIn_3_0 = 1;
              break L0;
            } else {
              field_a = 94;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return this.field_b.a((byte) -16);
    }

    final int a(byte param0, int param1) {
        int var3;
        tt var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 >= 21) {
          var4 = (tt) ((Object) this.field_b.f(-80));
          L0: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L1: {
                if (!var4.a(false, param1)) {
                  break L1;
                } else {
                  var3++;
                  break L1;
                }
              }
              var4 = (tt) ((Object) this.field_b.e(107));
              continue L0;
            }
          }
        } else {
          this.a((byte) 71, -82);
          var4 = (tt) ((Object) this.field_b.f(-80));
          L2: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L3: {
                if (!var4.a(false, param1)) {
                  break L3;
                } else {
                  var3++;
                  break L3;
                }
              }
              var4 = (tt) ((Object) this.field_b.e(107));
              continue L2;
            }
          }
        }
    }

    vi() {
        this.field_b = new vna();
    }

    static {
    }
}
