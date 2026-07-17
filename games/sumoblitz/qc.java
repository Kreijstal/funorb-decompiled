/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc {
    private int field_d;
    static bs field_e;
    static fs field_c;
    private boolean field_f;
    private int field_b;
    static int field_a;

    final static String a(CharSequence param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = 0;
          var3 = qv.a(false, 97, param0);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var5 = 0;
            L0: while (true) {
              if (var5 < param0.length()) {
                if (!jl.a((byte) 110, param0.charAt(var5))) {
                  stackOut_10_0 = fu.field_F;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("qc.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 38 + 44 + 0 + 41);
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
            L1: {
              wo.a(hf.field_H, 160, 140, -16777216, 3, param0, 360, 170, 1, true);
              if (Sumoblitz.field_J.length > ((qc) this).field_d) {
                wo.a(up.field_c, Sumoblitz.field_J[((qc) this).field_d].a() + 6, 167, -16777216, 3, param0, Sumoblitz.field_J[((qc) this).field_d].c() + 6, 187, 1, true);
                Sumoblitz.field_J[((qc) this).field_d].a(170, 190);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (Sumoblitz.field_J.length <= ((qc) this).field_d) {
                stackOut_5_0 = 320;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 380;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var3_int = stackIn_6_0;
            var4 = 200;
            var5 = 160;
            var9 = sr.field_j[((qc) this).field_d * 2];
            qv.field_k.a(var9, -11753985, -1, var4, var3_int, 0);
            uq.field_a.a(var9, -1, -1, var4, var3_int, 0);
            if (param1 == -4475) {
              L3: {
                var10 = sr.field_j[2 * ((qc) this).field_d - -1];
                var3_int -= 10;
                int discarded$2 = gt.field_db.a(480, -11753985, 0, 20 + var5, -(var5 / 2) + var3_int, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, param1 + -4312, var10, (aa) null, 1, 0);
                int discarded$3 = bq.field_c.a(480, -1, 0, var5 + 20, -(var5 / 2) + var3_int, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, -8787, var10, (aa) null, 1, 0);
                if (((qc) this).field_b > 0) {
                  break L3;
                } else {
                  L4: {
                    var4 += 115;
                    var3_int -= 50;
                    var11 = ge.field_l;
                    var7 = -((qc) this).field_b << 3;
                    if (var7 % 510 > 255) {
                      stackOut_11_0 = 510 + -(var7 % 255);
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = var7 % 255;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                  var8 = stackIn_12_0;
                  qv.field_k.a(var11, 5023231 | var8 << 24, -1, var4, var3_int, 0);
                  uq.field_a.a(var11, -1, -1, var4, var3_int, 0);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qc.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    final void b(int param0) {
        L0: {
          L1: {
            if (hk.field_c == 1) {
              break L1;
            } else {
              if (!hw.field_b[83]) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((qc) this).field_b > 0) {
            break L0;
          } else {
            ((qc) this).a(-127);
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            field_a = -33;
            break L2;
          }
        }
        ((qc) this).field_b = ((qc) this).field_b - 1;
    }

    final boolean a(byte param0) {
        if (param0 != 91) {
            boolean discarded$0 = ((qc) this).a((byte) -1);
        }
        return ((qc) this).field_f;
    }

    private final void b(int param0, int param1) {
        ((qc) this).field_d = param0;
    }

    final static void a(boolean param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int discarded$4 = 9;
        if (!vs.b()) {
            ph.field_b.e(-113);
            mr.field_f = null;
        } else {
            if (0 < te.field_c) {
                av.a(-7753, param0, 6);
            } else {
                av.a(-7753, param0, 0);
            }
        }
        dr.o(250);
        ph.field_b.a(66);
        ld.field_N.b((byte) -128);
        ut.field_j = 0;
    }

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = 85 / ((param0 - 13) / 43);
    }

    final void a(int param0) {
        if (param0 > -41) {
            return;
        }
        ((qc) this).field_f = false;
    }

    final static ha a(int param0, int param1, int param2, java.awt.Canvas param3, d param4) {
        RuntimeException var5 = null;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                qc.b((byte) 64);
                break L1;
              }
            }
            stackOut_2_0 = new oa(param3, param4, param1, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("qc.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return (ha) (Object) stackIn_3_0;
    }

    qc() {
        ((qc) this).field_b = 200;
    }

    final void a(int param0, int param1) {
        ((qc) this).field_f = true;
        this.b(param1, -119);
        ((qc) this).field_b = 200;
        if (param0 != -3388) {
            qc.b((byte) 117);
        }
    }

    static {
    }
}
