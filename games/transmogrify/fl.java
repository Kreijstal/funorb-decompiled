/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private int field_d;
    private int field_f;
    private wf[] field_e;
    private wf field_b;
    private wf field_a;
    static boolean field_c;

    final wf a(int param0) {
        int var2 = 0;
        int var3 = 0;
        wf var4 = null;
        wf var5 = null;
        wf var8 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (((fl) this).field_f > 0) {
          if (((fl) this).field_a == ((fl) this).field_e[((fl) this).field_f - 1]) {
            L0: while (true) {
              if (((fl) this).field_d > ((fl) this).field_f) {
                int fieldTemp$2 = ((fl) this).field_f;
                ((fl) this).field_f = ((fl) this).field_f + 1;
                var5 = ((fl) this).field_e[fieldTemp$2].field_b;
                if (((fl) this).field_e[((fl) this).field_f + -1] != var5) {
                  ((fl) this).field_a = var5.field_b;
                  return var5;
                } else {
                  continue L0;
                }
              } else {
                var2 = 6 % ((-26 - param0) / 58);
                return null;
              }
            }
          } else {
            var8 = ((fl) this).field_a;
            ((fl) this).field_a = var8.field_b;
            return var8;
          }
        } else {
          L1: while (true) {
            if (((fl) this).field_d > ((fl) this).field_f) {
              int fieldTemp$3 = ((fl) this).field_f;
              ((fl) this).field_f = ((fl) this).field_f + 1;
              var4 = ((fl) this).field_e[fieldTemp$3].field_b;
              if (((fl) this).field_e[((fl) this).field_f + -1] != var4) {
                ((fl) this).field_a = var4.field_b;
                return var4;
              } else {
                continue L1;
              }
            } else {
              var2 = 6 % ((-26 - param0) / 58);
              return null;
            }
          }
        }
    }

    final wf a(long param0, int param1) {
        wf var4 = null;
        wf var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = ((fl) this).field_e[(int)((long)(-1 + ((fl) this).field_d) & param0)];
        ((fl) this).field_b = var4.field_b;
        L0: while (true) {
          if (((fl) this).field_b == var4) {
            ((fl) this).field_b = null;
            if (param1 == 0) {
              return null;
            } else {
              var7 = null;
              ((fl) this).a(28L, (byte) 9, (wf) null);
              return null;
            }
          } else {
            if (~((fl) this).field_b.field_c != ~param0) {
              ((fl) this).field_b = ((fl) this).field_b.field_b;
              continue L0;
            } else {
              var5 = ((fl) this).field_b;
              ((fl) this).field_b = ((fl) this).field_b.field_b;
              return var5;
            }
          }
        }
    }

    final wf b(int param0) {
        Object var3 = null;
        if (param0 != 1000) {
          var3 = null;
          nd discarded$2 = fl.a((ag) null, 122, -2);
          ((fl) this).field_f = 0;
          return ((fl) this).a(71);
        } else {
          ((fl) this).field_f = 0;
          return ((fl) this).a(71);
        }
    }

    final void a(long param0, byte param1, wf param2) {
        wf var5 = null;
        try {
            if (!(null == param2.field_f)) {
                param2.c(5);
            }
            var5 = ((fl) this).field_e[(int)(param0 & (long)(-1 + ((fl) this).field_d))];
            param2.field_b = var5;
            int var6 = 70 / ((3 - param1) / 58);
            param2.field_f = var5.field_f;
            param2.field_f.field_b = param2;
            param2.field_b.field_f = param2;
            param2.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fl.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static nd a(ag param0, int param1, int param2) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -11039) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            stackOut_2_0 = new nd(param0, param2 * qh.field_p / 1000);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("fl.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    fl(int param0) {
        int var2 = 0;
        wf var3 = null;
        ((fl) this).field_f = 0;
        ((fl) this).field_e = new wf[param0];
        ((fl) this).field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            wf dupTemp$2 = new wf();
            var3 = dupTemp$2;
            ((fl) this).field_e[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_f = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
