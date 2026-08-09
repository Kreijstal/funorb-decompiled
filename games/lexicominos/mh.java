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

    public static void a(byte param0) {
        field_H = null;
        field_D = null;
        int var1 = 81 % ((param0 - 59) / 60);
        field_B = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_t;
        int var6 = this.field_o - -param1;
        ql.field_Q.a(vb.field_k, 20 + var5, var6 - -20, this.field_j - 40, -50 + this.field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        super.a(param0, param1, param2, param3);
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, (byte) -124)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 98) {
                stackIn_7_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_11_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -32 % ((param3 - -13) / 55);
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("mh.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public mh() {
        super(0, 0, 476, 225, (rd) null);
        this.field_E = new kf(ri.field_d, (vd) null);
        this.field_G = new kf(ch.field_g, (vd) null);
        this.field_C = new kf(a.field_f, (vd) null);
        v var1 = new v();
        this.field_E.field_i = (rd) ((Object) var1);
        this.field_G.field_i = (rd) ((Object) var1);
        this.field_C.field_i = (rd) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1076550271;
        this.field_G.a(30, var4, true, -var2 + (this.field_v + -48), -var3 + this.field_j >> -1169847167);
        this.field_C.a(30, var4, true, -var2 + -48 + this.field_v, var4 + (-var3 + this.field_j >> 393635457) - -var2);
        this.field_E.a(30, var3, true, -(2 * var2) + -78 + this.field_v, -var3 + this.field_j >> 705547201);
        this.field_G.field_r = (vd) (this);
        this.field_E.field_r = (vd) (this);
        this.field_C.field_r = (vd) (this);
        this.field_E.field_q = hi.field_a;
        this.field_C.field_q = il.field_a;
        this.b((byte) -107, this.field_G);
        this.b((byte) 72, this.field_E);
        this.b((byte) 94, this.field_C);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4 != this.field_G) {
                  break L2;
                } else {
                  dc.c(255);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param4 == this.field_E) {
                  break L3;
                } else {
                  if (param4 == this.field_C) {
                    ui.d(param2 ^ 215535462);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              bg.a(false);
              break L1;
            }
            if (param2 == 215535458) {
              break L0;
            } else {
              this.field_C = (kf) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("mh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_H = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_B = new m("usename");
        field_D = "Name is available";
    }
}
