/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends ln {
    static int field_i;
    static String field_h;
    static int field_g;

    final int a(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (this.field_c <= 1) {
          return 0;
        }
        if (this.field_b > 0) {
          int var3 = 105 / ((55 - param1) / 50);
          var4 = 0;
          for (var5 = 0; 2 > var5; var5++) {
            var4 = var4 + q.field_a[param0].field_e[var5];
          }
          return var4 != this.field_b ? 0 : 1;
        }
        return 0;
    }

    final static void a(byte param0, String param1) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        try {
          if (param0 != -47) {
            field_g = -56;
          }
          if (pe.field_i == -1 &&
            ce.field_gb == -1) {
            ce.field_gb = bm.field_h;
            pe.field_i = qh.field_i;
          }
          boolean decompiledFrameRemainder0 = true;
          cl.field_o = cl.field_o + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(kf.field_f));
          } else {
            decompiledFrameRemainder0 = (kf.field_f == null);
          }
          if (decompiledFrameRemainder0) {
            if (!co.field_F) {
              if (cl.field_o >= ih.field_a) {
                stackIn_20_0 = (cl.field_o < ih.field_a + u.field_a) ? 1 : 0;
              } else {
                stackIn_20_0 = 0;
              }
            } else {
              stackIn_20_0 = 0;
            }
            var2_int = stackIn_20_0;
            if (param1 == null) {
              cl.field_o = 0;
            } else {
              if (co.field_F) {
                cl.field_o = ih.field_a;
              } else {
                if (var2_int != 0) {
                  cl.field_o = ih.field_a;
                } else {
                  cl.field_o = 0;
                }
              }
            }
            if (param1 != null) {
              co.field_F = false;
            } else {
              if (var2_int != 0) {
                co.field_F = true;
              }
            }
            rf.field_G = ce.field_gb;
            ni.field_b = pe.field_i;
          }
          kf.field_f = param1;
          if (!co.field_F &&
            cl.field_o < ih.field_a &&
            ij.field_h) {
            rf.field_G = ce.field_gb;
            ni.field_b = pe.field_i;
            cl.field_o = 0;
          }
          pe.field_i = -1;
          if (co.field_F &&
            cl.field_o == lc.field_e) {
            cl.field_o = 0;
            co.field_F = false;
          }
          ce.field_gb = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_46_0 = var2;
          stackIn_46_1 = new StringBuilder().append("ia.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (0 > param1) {
          param1 = 0;
          if (param0 == -658435066) {
            fq.field_x.e(-20562, param1 * lc.field_d >> 6);
            qd.field_r = param1;
            return;
          }
          return;
        }
        if (param1 > 64) {
          param1 = 64;
        }
        if (param0 == -658435066) {
          fq.field_x.e(-20562, param1 * lc.field_d >> 6);
          qd.field_r = param1;
          return;
        }
    }

    ia(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          String var2 = (String) null;
          ia.a((byte) -77, (String) null);
        }
    }

    static {
        field_h = "Try again";
    }
}
