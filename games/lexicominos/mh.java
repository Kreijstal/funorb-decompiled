/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends nb implements jk {
    private kf field_E;
    private kf field_C;
    static String field_H;
    static m field_B;
    static String field_D;
    private kf field_G;

    final static void b(int param0, int param1) {
        if (!(oc.field_e >= 0)) {
            return;
        }
        wj.field_j.a(kc.field_m[param0], param1, oc.field_e * 128 / 256);
    }

    public static void a() {
        field_H = null;
        field_D = null;
        int var1 = 0;
        field_B = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param2 + ((mh) this).field_t;
        int var6 = ((mh) this).field_o - -param1;
        int discarded$0 = ql.field_Q.a(vb.field_k, 20 + var5, var6 - -20, ((mh) this).field_j - 40, -50 + ((mh) this).field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        super.a(param0, param1, param2, param3);
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, (byte) -124)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((mh) this).a(0, param2);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 == 99) {
                  stackOut_10_0 = ((mh) this).c((byte) 119, param2);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5_int = -32 % ((param3 - -13) / 55);
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("mh.P(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public mh() {
        super(0, 0, 476, 225, (rd) null);
        ((mh) this).field_E = new kf(ri.field_d, (vd) null);
        ((mh) this).field_G = new kf(ch.field_g, (vd) null);
        ((mh) this).field_C = new kf(a.field_f, (vd) null);
        v var1 = new v();
        ((mh) this).field_E.field_i = (rd) (Object) var1;
        ((mh) this).field_G.field_i = (rd) (Object) var1;
        ((mh) this).field_C.field_i = (rd) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((mh) this).field_G.a(30, var4, true, -var2 + (((mh) this).field_v + -48), -var3 + ((mh) this).field_j >> 1);
        ((mh) this).field_C.a(30, var4, true, -var2 + -48 + ((mh) this).field_v, var4 + (-var3 + ((mh) this).field_j >> 1) - -var2);
        ((mh) this).field_E.a(30, var3, true, -(2 * var2) + -78 + ((mh) this).field_v, -var3 + ((mh) this).field_j >> 1);
        ((mh) this).field_G.field_r = (vd) this;
        ((mh) this).field_E.field_r = (vd) this;
        ((mh) this).field_C.field_r = (vd) this;
        ((mh) this).field_E.field_q = hi.field_a;
        ((mh) this).field_C.field_q = il.field_a;
        ((mh) this).b((byte) -107, (w) (Object) ((mh) this).field_G);
        ((mh) this).b((byte) 72, (w) (Object) ((mh) this).field_E);
        ((mh) this).b((byte) 94, (w) (Object) ((mh) this).field_C);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != ((mh) this).field_G) {
                if (param4 == ((mh) this).field_E) {
                  bg.a(false);
                  break L1;
                } else {
                  if (param4 == ((mh) this).field_C) {
                    ui.d(param2 ^ 215535462);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                int discarded$10 = 255;
                dc.c();
                break L1;
              }
            }
            if (param2 == 215535458) {
              break L0;
            } else {
              ((mh) this).field_C = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("mh.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_B = new m("usename");
        field_D = "Name is available";
    }
}
