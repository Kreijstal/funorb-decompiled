/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    private int field_d;
    static bs field_e;
    static fs field_c;
    private boolean field_f;
    private int field_b;
    static int field_a;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = -114 % ((-29 - param1) / 39);
            var3 = qv.a(param2, 97, param0);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (var5 < param0.length()) {
                  if (!jl.a((byte) 110, param0.charAt(var5))) {
                    stackIn_11_0 = fu.field_F;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("qc.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void a(ha param0, int param1) {
        String var10 = null;
        String var11 = null;
        int var7 = 0;
        int var8 = 0;
        wo.a(hf.field_H, 160, 140, -16777216, 3, param0, 360, 170, 1, true);
        if (!(Sumoblitz.field_J.length <= this.field_d)) {
            wo.a(up.field_c, Sumoblitz.field_J[this.field_d].a() + 6, 167, -16777216, 3, param0, Sumoblitz.field_J[this.field_d].c() + 6, 187, 1, true);
            Sumoblitz.field_J[this.field_d].a(170, 190);
        }
        int var3_int = Sumoblitz.field_J.length > this.field_d ? 380 : 320;
        int var4 = 200;
        int var5 = 160;
        String var9 = sr.field_j[this.field_d * 2];
        qv.field_k.a(var9, -11753985, -1, var4, var3_int, 0);
        uq.field_a.a(var9, -1, -1, var4, var3_int, 0);
        if (param1 != -4475) {
            return;
        }
        try {
            var10 = sr.field_j[2 * this.field_d - -1];
            var3_int -= 10;
            gt.field_db.a(480, -11753985, 0, 20 + var5, -(var5 / 2) + var3_int, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, param1 + -4312, var10, (aa) null, 1, 0);
            bq.field_c.a(480, -1, 0, var5 + 20, -(var5 / 2) + var3_int, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, -8787, var10, (aa) null, 1, 0);
            if (this.field_b <= 0) {
                var4 += 115;
                var3_int -= 50;
                var11 = ge.field_l;
                var7 = -this.field_b << -666450237;
                var8 = var7 % 510 <= 255 ? var7 % 255 : 510 + -(var7 % 255);
                qv.field_k.a(var11, 5023231 | var8 << 704582776, -1, var4, var3_int, 0);
                uq.field_a.a(var11, -1, -1, var4, var3_int, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (hk.field_c == 1 || hw.field_b[83]) {
            if (this.field_b <= 0) {
                this.a(-127);
            }
        }
        if (param0 != 0) {
            field_a = -33;
        }
        this.field_b = this.field_b - 1;
    }

    final boolean a(byte param0) {
        if (param0 != 91) {
            this.a((byte) -1);
        }
        return this.field_f;
    }

    private final void b(int param0, int param1) {
        if (param1 > -11) {
            field_e = (bs) null;
        }
        this.field_d = param0;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (!vs.b((byte) 9)) {
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
        if (!param1) {
            return;
        }
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
        this.field_f = false;
    }

    final static ha a(int param0, int param1, int param2, java.awt.Canvas param3, d param4) {
        RuntimeException var5 = null;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new oa(param3, param4, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("qc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return (ha) ((Object) stackIn_3_0);
    }

    qc() {
        this.field_b = 200;
    }

    final void a(int param0, int param1) {
        this.field_f = true;
        this.b(param1, -119);
        this.field_b = 200;
        if (param0 != -3388) {
            qc.b((byte) 117);
        }
    }

    static {
    }
}
