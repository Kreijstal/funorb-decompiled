/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    private vg field_b;
    private vg field_c;
    private vg[] field_f;
    private int field_e;
    private long field_h;
    static jea field_g;
    private int field_a;
    static String field_d;

    public static void f() {
        field_g = null;
        field_d = null;
    }

    final vg b(int param0) {
        vg var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (((ji) this).field_b == null) {
            return null;
        }
        vg var2 = ((ji) this).field_f[(int)(((ji) this).field_h & (long)(-1 + ((ji) this).field_a))];
        if (param0 > -93) {
            ((ji) this).field_a = 32;
        }
        while (((ji) this).field_b != var2) {
            if (!(~((ji) this).field_h != ~((ji) this).field_b.field_d)) {
                var3 = ((ji) this).field_b;
                ((ji) this).field_b = ((ji) this).field_b.field_a;
                return var3;
            }
            ((ji) this).field_b = ((ji) this).field_b.field_a;
        }
        ((ji) this).field_b = null;
        return null;
    }

    final vg d(int param0) {
        ((ji) this).field_e = param0;
        return ((ji) this).c(20806);
    }

    final void e(int param0) {
        int var2 = 0;
        vg var3_ref_vg = null;
        vg var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < ((ji) this).field_a; var2++) {
            var3_ref_vg = ((ji) this).field_f[var2];
            while (true) {
                var4 = var3_ref_vg.field_a;
                if (var4 == var3_ref_vg) {
                    break;
                }
                var4.p(113);
            }
        }
        int var3 = -17 % ((35 - param0) / 42);
        ((ji) this).field_c = null;
        ((ji) this).field_b = null;
    }

    final vg c(int param0) {
        vg var2 = null;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 == 20806) {
            break L0;
          } else {
            vg discarded$4 = ((ji) this).c(17);
            break L0;
          }
        }
        L1: {
          if (((ji) this).field_e <= 0) {
            break L1;
          } else {
            if (((ji) this).field_f[((ji) this).field_e - 1] == ((ji) this).field_c) {
              break L1;
            } else {
              var2 = ((ji) this).field_c;
              ((ji) this).field_c = var2.field_a;
              return var2;
            }
          }
        }
        L2: while (true) {
          if (((ji) this).field_a > ((ji) this).field_e) {
            int fieldTemp$5 = ((ji) this).field_e;
            ((ji) this).field_e = ((ji) this).field_e + 1;
            var2 = ((ji) this).field_f[fieldTemp$5].field_a;
            if (((ji) this).field_f[((ji) this).field_e + -1] != var2) {
              ((ji) this).field_c = var2.field_a;
              return var2;
            } else {
              continue L2;
            }
          } else {
            return null;
          }
        }
    }

    final void a(long param0, int param1, vg param2) {
        vg var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param2.field_e) {
                param2.p(48);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((ji) this).field_f[(int)(param0 & (long)(((ji) this).field_a + -1))];
              param2.field_a = var5;
              param2.field_e = var5.field_e;
              param2.field_e.field_a = param2;
              param2.field_a.field_e = param2;
              param2.field_d = param0;
              if (param1 >= 100) {
                break L2;
              } else {
                ((ji) this).field_e = -124;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("ji.E(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    ji(int param0) {
        int var2 = 0;
        vg var3 = null;
        ((ji) this).field_e = 0;
        ((ji) this).field_a = param0;
        ((ji) this).field_f = new vg[param0];
        for (var2 = 0; var2 < param0; var2++) {
            vg dupTemp$0 = new vg();
            var3 = dupTemp$0;
            ((ji) this).field_f[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_e = var3;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 82) {
            field_d = null;
        }
        return param0 << -param2 + 16;
    }

    final vg a(byte param0, long param1) {
        vg var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -78) {
            field_g = null;
        }
        ((ji) this).field_h = param1;
        vg var4 = ((ji) this).field_f[(int)(param1 & (long)(((ji) this).field_a - 1))];
        ((ji) this).field_b = var4.field_a;
        while (var4 != ((ji) this).field_b) {
            if (!(param1 != ((ji) this).field_b.field_d)) {
                var5 = ((ji) this).field_b;
                ((ji) this).field_b = ((ji) this).field_b.field_a;
                return var5;
            }
            ((ji) this).field_b = ((ji) this).field_b.field_a;
        }
        ((ji) this).field_b = null;
        return null;
    }

    final static void a() {
        int var1 = (-640 + ob.field_i) / 2;
        int var2 = pna.field_q * pna.field_q;
        int var3 = -(mla.field_a * mla.field_a) + var2;
        nra.field_a.a(199, -214 + bea.field_a, -23776, 90, -(199 * var3 / var2) + var1);
        cka.field_fd.a(438, -4 + (-120 + bea.field_a), -23776, 0, 202 + var1 - -(438 * var3 / var2));
    }

    static {
    }
}
