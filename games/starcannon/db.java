/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vk implements ga {
    private dk field_y;
    private dk field_A;
    static long field_C;
    private dk field_z;
    static String field_B;

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (!param2) {
              if (param0 != ((db) this).field_A) {
                if (param0 == ((db) this).field_y) {
                  pb.b(73);
                  return;
                } else {
                  if (((db) this).field_z != param0) {
                    break L0;
                  } else {
                    pk.a((byte) -64);
                    return;
                  }
                }
              } else {
                ag.k(-1108);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("db.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public db() {
        super(0, 0, 476, 225, (de) null);
        ((db) this).field_y = new dk(qj.field_V, (qg) null);
        ((db) this).field_A = new dk(fk.field_v, (qg) null);
        ((db) this).field_z = new dk(rg.field_E, (qg) null);
        gb var1 = new gb();
        ((db) this).field_y.field_o = (de) (Object) var1;
        ((db) this).field_A.field_o = (de) (Object) var1;
        ((db) this).field_z.field_o = (de) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((db) this).field_A.a(((db) this).field_i + -var3 >> 1, var4, (byte) 123, 30, -var2 + ((db) this).field_f + -48);
        ((db) this).field_z.a(var4 + ((((db) this).field_i + -var3 >> 1) - -var2), var4, (byte) 116, 30, -48 + ((db) this).field_f + -var2);
        ((db) this).field_y.a(((db) this).field_i - var3 >> 1, var3, (byte) 127, 30, -(2 * var2) + -78 + ((db) this).field_f);
        ((db) this).field_A.field_g = (qg) this;
        ((db) this).field_y.field_g = (qg) this;
        ((db) this).field_z.field_g = (qg) this;
        ((db) this).field_y.field_p = wj.field_f;
        ((db) this).field_z.field_p = ej.field_t;
        ((db) this).a(true, (uj) (Object) ((db) this).field_A);
        ((db) this).a(true, (uj) (Object) ((db) this).field_y);
        ((db) this).a(true, (uj) (Object) ((db) this).field_z);
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param3 != 98) {
                if (param3 == 99) {
                  stackOut_8_0 = ((db) this).a((byte) -103, param0);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((db) this).b(-10, param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("db.EA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + ((db) this).field_s;
        int var6 = ((db) this).field_j - -param3;
        int discarded$0 = nb.field_c.a(ec.field_c, 20 + var5, var6 - -20, -40 + ((db) this).field_i, ((db) this).field_f - 50, 16777215, -1, 1, 0, nb.field_c.field_p);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_B = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Change display name";
    }
}
