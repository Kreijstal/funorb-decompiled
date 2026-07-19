/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg implements fc {
    private int field_b;
    private tj field_d;
    static String field_f;
    static String[] field_a;
    private int field_i;
    static int field_j;
    static String field_l;
    private int field_c;
    private int field_k;
    private int field_e;
    static String field_g;
    private int field_h;

    final static bl a(boolean param0, int param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        ii var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ii var8 = null;
        ne var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_24_0 = null;
        Object stackOut_23_0 = null;
        L0: {
          var7 = Bounce.field_N;
          if (param1 == 3904) {
            break L0;
          } else {
            vg.a((byte) 2);
            break L0;
          }
        }
        L1: {
          var8 = jc.field_g;
          var2 = var8;
          var3 = var8.d((byte) -90);
          if ((128 & var3) == 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          ba.field_I = stackIn_5_0 != 0;
          eg.field_o = 127 & var3;
          de.field_c = var8.d((byte) -65);
          ek.field_f = var8.f((byte) -121);
          if (2 != eg.field_o) {
            ib.field_n = 0;
            ka.field_n = 0;
            break L2;
          } else {
            ib.field_n = var8.a(-1640531527);
            ka.field_n = var8.b((byte) -83);
            break L2;
          }
        }
        L3: {
          if (1 != var8.d((byte) -76)) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          qc.field_b = var8.b(true);
          if (var4 != 0) {
            g.field_i = var8.b(true);
            break L4;
          } else {
            g.field_i = qc.field_b;
            break L4;
          }
        }
        L5: {
          if (eg.field_o == 1) {
            discarded$4 = var8.a(-1640531527);
            discarded$5 = var8.b(true);
            break L5;
          } else {
            if (-5 != (eg.field_o ^ -1)) {
              break L5;
            } else {
              discarded$6 = var8.a(-1640531527);
              discarded$7 = var8.b(true);
              break L5;
            }
          }
        }
        if (param0) {
          var5 = var8.a(-1640531527);
          try {
            L6: {
              L7: {
                var9 = ag.field_a.a(var5, (byte) -127);
                jg.field_D = var9.e(99);
                if (!g.field_i.equals(ja.field_b)) {
                  stackOut_24_0 = var9.field_s;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = null;
                  stackIn_25_0 = (int[]) ((Object) stackOut_23_0);
                  break L7;
                }
              }
              uf.field_c = stackIn_25_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ti.a((Throwable) ((Object) var6), (byte) 100, "CC1");
            jg.field_D = null;
            uf.field_c = null;
            return new bl(param0);
          }
          return new bl(param0);
        } else {
          jg.field_D = mf.a(80, -2808, var8);
          uf.field_c = null;
          return new bl(param0);
        }
    }

    final static void a(byte param0) {
        int fieldTemp$5 = 0;
        ii var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var1 = hh.field_p;
              if (param0 == -17) {
                break L1;
              } else {
                vg.a((byte) -35);
                break L1;
              }
            }
            L2: while (true) {
              if (!fb.e((byte) 102)) {
                break L0;
              } else {
                var1.a(true, 8);
                fieldTemp$5 = var1.field_h + 1;
                var1.field_h = var1.field_h + 1;
                var2 = fieldTemp$5;
                sa.a((byte) -97, var1);
                hh.field_p.b(-var2 + var1.field_h, true);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "vg.C(" + param0 + ')');
        }
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        d var13 = null;
        lk stackIn_4_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        lk stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof d)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (lk) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = (lk) (param1);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (d) ((Object) stackIn_4_0);
              na.e(param1.field_r + param4, param1.field_i + param0, param1.field_k, param1.field_m, this.field_b);
              if (var13 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = -(var13.field_C * 2) + param1.field_k;
            var8 = var13.field_C + (param4 - -param1.field_r);
            var9 = param0 - -param1.field_i + var13.field_G;
            na.a(var8, var9, var7 + var8, var9, this.field_i);
            var10 = 8 / ((-60 - param2) / 56);
            var11 = -1 + var13.d((byte) -116);
            L3: while (true) {
              if ((var11 ^ -1) > -1) {
                if (this.field_d != null) {
                  this.field_d.a(var13.field_h, var8 - -(var7 / 2), this.field_d.field_p + (var9 + var13.field_G), this.field_k, this.field_e);
                  break L0;
                } else {
                  return;
                }
              } else {
                na.b(var8 + var13.b(87, var11) * var7 / var13.a(false), var9, this.field_h, this.field_c);
                var11--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("vg.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 8) {
          vg.a((byte) -58);
          field_l = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_l = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    vg(tj param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_e = param2;
            this.field_b = param4;
            this.field_k = param1;
            this.field_c = param6;
            this.field_d = param0;
            this.field_i = param3;
            this.field_h = param5;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_g = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = "Create";
    }
}
