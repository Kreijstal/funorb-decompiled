/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pma extends k {
    private int field_l;
    static boolean field_k;
    private int field_n;
    private int field_m;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              var4_int = param2;
              if (0 == var4_int) {
                this.a(param1.a(3), true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                ((pma) this).field_n = 29;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("pma.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, boolean param1) {
        ((pma) this).field_n = 4080 & param0 >> 4;
        ((pma) this).field_l = 4080 & param0 >> 12;
        ((pma) this).field_m = 4080 & param0 << 4;
    }

    private pma(int param0) {
        super(0, false);
        this.a(param0, true);
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        int[][] var9 = ((pma) this).field_h.a(param1, -858);
        int[][] var3 = var9;
        if (!(!((pma) this).field_h.field_b)) {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            for (var7 = 0; var7 < hh.field_d; var7++) {
                var4[var7] = ((pma) this).field_l;
                var5[var7] = ((pma) this).field_n;
                var6[var7] = ((pma) this).field_m;
            }
        }
        if (param0) {
            ((pma) this).field_m = 48;
        }
        return var3;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        L0: {
          mla.b((byte) 5);
          if (param0 == 122) {
            break L0;
          } else {
            pma.a((byte) 49, false);
            break L0;
          }
        }
        L1: {
          if (pw.field_w != null) {
            if (hfa.a(pw.field_w.field_Rb, param0 + -120)) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var2 = stackIn_8_0;
            if (vs.field_d) {
              break L3;
            } else {
              if (!gja.field_n) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L2;
        }
        L4: {
          stackOut_13_0 = stackIn_13_0;
          stackOut_13_1 = 14;
          stackOut_13_2 = 13;
          stackOut_13_3 = 15;
          stackOut_13_4 = var2;
          stackOut_13_5 = vc.field_a;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_15_2 = stackOut_13_2;
          stackIn_15_3 = stackOut_13_3;
          stackIn_15_4 = stackOut_13_4;
          stackIn_15_5 = stackOut_13_5;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          stackIn_14_2 = stackOut_13_2;
          stackIn_14_3 = stackOut_13_3;
          stackIn_14_4 = stackOut_13_4;
          stackIn_14_5 = stackOut_13_5;
          if (md.field_l <= 50) {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = stackIn_15_1;
            stackOut_15_2 = stackIn_15_2;
            stackOut_15_3 = stackIn_15_3;
            stackOut_15_4 = stackIn_15_4;
            stackOut_15_5 = stackIn_15_5;
            stackOut_15_6 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            stackIn_16_3 = stackOut_15_3;
            stackIn_16_4 = stackOut_15_4;
            stackIn_16_5 = stackOut_15_5;
            stackIn_16_6 = stackOut_15_6;
            break L4;
          } else {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = stackIn_14_2;
            stackOut_14_3 = stackIn_14_3;
            stackOut_14_4 = stackIn_14_4;
            stackOut_14_5 = stackIn_14_5;
            stackOut_14_6 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            stackIn_16_4 = stackOut_14_4;
            stackIn_16_5 = stackOut_14_5;
            stackIn_16_6 = stackOut_14_6;
            break L4;
          }
        }
        L5: {
          gfa.a(stackIn_16_0 != 0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4 != 0, stackIn_16_5, stackIn_16_6 != 0, param1, 0, true, 109, 11);
          if (aba.field_f) {
            sja.field_fb.c(57, (byte) 100);
            aba.field_f = false;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!efa.field_p) {
            break L6;
          } else {
            sja.field_fb.c(10, (byte) 97);
            efa.field_p = false;
            break L6;
          }
        }
    }

    final static void b(int param0, int param1) {
        L0: {
          bf.field_h = new lw[11];
          bf.field_h[0] = (lw) (Object) new wa();
          bf.field_h[1] = (lw) (Object) new wb();
          bf.field_h[2] = (lw) (Object) new li();
          bf.field_h[3] = (lw) (Object) new dp();
          bf.field_h[4] = (lw) (Object) new nia();
          bf.field_h[5] = (lw) (Object) new cha();
          bf.field_h[6] = (lw) (Object) new bda();
          bf.field_h[7] = (lw) (Object) new dea();
          bf.field_h[8] = (lw) (Object) new iq();
          bf.field_h[9] = (lw) (Object) new ih();
          bf.field_h[10] = (lw) (Object) new sc();
          if (param1 == 20208) {
            break L0;
          } else {
            pma.b(121, -115);
            break L0;
          }
        }
        L1: {
          wca.field_n = param0;
          if (8 < wca.field_n) {
            break L1;
          } else {
            iaa.field_a = false;
            break L1;
          }
        }
        L2: {
          if (wca.field_n > 3) {
            break L2;
          } else {
            sh.field_I = false;
            break L2;
          }
        }
        L3: {
          if (8 > wca.field_n) {
            pka.field_f = false;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (wca.field_n > 3) {
            break L4;
          } else {
            ku.field_q = false;
            break L4;
          }
        }
        L5: {
          if (wca.field_n <= 5) {
            gi.field_a = false;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (wca.field_n > 8) {
            break L6;
          } else {
            cm.field_v = false;
            break L6;
          }
        }
        L7: {
          if (wca.field_n > 2) {
            break L7;
          } else {
            hp.field_a = false;
            break L7;
          }
        }
        L8: {
          if (wca.field_n > 7) {
            break L8;
          } else {
            wf.field_x = false;
            break L8;
          }
        }
        L9: {
          if (wca.field_n <= 5) {
            gla.field_k = false;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (wca.field_n < 8) {
            mka.field_j = false;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (wca.field_n <= 5) {
            bfa.field_a = false;
            break L11;
          } else {
            break L11;
          }
        }
        if (o.d((byte) 54)) {
          af.field_a = false;
          return;
        } else {
          bf.field_h[wca.field_n].a(108);
          ua.field_b = true;
          af.field_a = true;
          aga.d(false);
          return;
        }
    }

    public pma() {
        this(0);
    }

    static {
    }
}
