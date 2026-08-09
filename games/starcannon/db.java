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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (!param2) {
              if (param0 != this.field_A) {
                if (param0 == this.field_y) {
                  pb.b(73);
                  return;
                } else {
                  if (this.field_z != param0) {
                    decompiledRegionSelector0 = 1;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("db.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public db() {
        super(0, 0, 476, 225, (de) null);
        this.field_y = new dk(qj.field_V, (qg) null);
        this.field_A = new dk(fk.field_v, (qg) null);
        this.field_z = new dk(rg.field_E, (qg) null);
        gb var1 = new gb();
        this.field_y.field_o = (de) ((Object) var1);
        this.field_A.field_o = (de) ((Object) var1);
        this.field_z.field_o = (de) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 2048693697;
        this.field_A.a(this.field_i + -var3 >> -1911336351, var4, (byte) 123, 30, -var2 + this.field_f + -48);
        this.field_z.a(var4 + ((this.field_i + -var3 >> -1999196127) - -var2), var4, (byte) 116, 30, -48 + this.field_f + -var2);
        this.field_y.a(this.field_i - var3 >> 1862558561, var3, (byte) 127, 30, -(2 * var2) + -78 + this.field_f);
        this.field_A.field_g = (qg) (this);
        this.field_y.field_g = (qg) (this);
        this.field_z.field_g = (qg) (this);
        this.field_y.field_p = wj.field_f;
        this.field_z.field_p = ej.field_t;
        this.a(true, this.field_A);
        this.a(true, this.field_y);
        this.a(true, this.field_z);
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if ((param3 ^ -1) != -99) {
                if (param3 == 99) {
                  stackIn_9_0 = this.a((byte) -103, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.b(-10, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("db.EA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + this.field_s;
        int var6 = this.field_j - -param3;
        nb.field_c.a(ec.field_c, 20 + var5, var6 - -20, -40 + this.field_i, this.field_f - 50, 16777215, -1, 1, 0, nb.field_c.field_p);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_B = null;
        if (param0 >= -91) {
            field_B = (String) null;
        }
    }

    static {
        field_B = "Change display name";
    }
}
