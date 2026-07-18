/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rg extends vk implements si, ga {
    private boolean field_A;
    private dk field_C;
    static String field_E;
    private boolean field_H;
    static String field_K;
    private String field_J;
    private dk field_F;
    private fe field_I;
    static int field_D;
    static int field_B;
    private fe field_G;
    private dk field_y;
    private boolean field_z;

    final static hl[] i() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = StarCannon.field_A;
        hl[] var1 = new hl[bj.field_b];
        for (var2 = 0; bj.field_b > var2; var2++) {
            var3 = gh.field_C[var2] * gg.field_d[var2];
            var4 = og.field_c[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = of.field_g[w.a(255, (int) var4[var6])];
            }
            var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var5);
        }
        var2 = -57;
        rc.b((byte) -82);
        return var1;
    }

    final String j(int param0) {
        if (!(((rg) this).field_I.field_k != null)) {
            return "";
        }
        if (param0 != 190) {
            field_E = null;
        }
        return ((rg) this).field_I.field_k;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((rg) this).field_J == null)) {
            int discarded$0 = nb.field_c.a(((rg) this).field_J, 20 + param1 + ((rg) this).field_s, 15 + (param3 - -((rg) this).field_j), ((rg) this).field_i + -40, ((rg) this).field_f, 16777215, -1, 1, 0, nb.field_c.field_p);
        }
        if (((rg) this).field_y != null) {
            ki.b(10 + param1, param3 + 134, -20 + ((rg) this).field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void k() {
        field_K = null;
        field_E = null;
    }

    public final void a(int param0, fe param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -4312) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((rg) this).a((uj) null, 'ﾠ', (byte) 81, -62);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rg.V(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    rg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (de) null);
        RuntimeException var6 = null;
        gb var6_ref = null;
        qe var7 = null;
        String var8 = null;
        mj var9 = null;
        ad var11 = null;
        ad var12 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        dk stackIn_16_1 = null;
        dk stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        dk stackIn_17_1 = null;
        dk stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        dk stackIn_18_1 = null;
        dk stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        dk stackOut_15_1 = null;
        dk stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        dk stackOut_17_1 = null;
        dk stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        dk stackOut_16_1 = null;
        dk stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((rg) this).field_H = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((rg) this).field_z = stackIn_7_1 != 0;
              ((rg) this).field_J = param1;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((rg) this).field_A = stackIn_10_1 != 0;
              if (!((rg) this).field_z) {
                break L4;
              } else {
                L5: {
                  if (((rg) this).field_H) {
                    break L5;
                  } else {
                    if (!((rg) this).field_A) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((rg) this).field_I = (fe) (Object) new ng(param0, (qg) this, 100);
              ((rg) this).field_G = (fe) (Object) new ng("", (qg) this, 20);
              if (((rg) this).field_z) {
                ((rg) this).field_C = new dk(ma.field_g, (qg) null);
                ((rg) this).field_F = new dk(bg.field_b, (qg) null);
                ((rg) this).field_I.field_u = false;
                break L6;
              } else {
                L7: {
                  ((rg) this).field_C = new dk(s.field_l, (qg) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (((rg) this).field_A) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = (String) field_E;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = dk.field_t;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((rg) this).field_F = new dk(stackIn_18_3, (qg) null);
                if (!((rg) this).field_H) {
                  break L6;
                } else {
                  ((rg) this).field_y = new dk(qj.field_V, (qg) this);
                  break L6;
                }
              }
            }
            L8: {
              ((rg) this).field_I.field_o = (de) (Object) new fh(10000536);
              ((rg) this).field_G.field_o = (de) (Object) new sh(10000536);
              var6_ref = new gb();
              ((rg) this).field_C.field_o = (de) (Object) var6_ref;
              if (((rg) this).field_F == null) {
                break L8;
              } else {
                ((rg) this).field_F.field_o = (de) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((rg) this).field_I.field_p = ne.field_a;
              if (null == ((rg) this).field_y) {
                break L9;
              } else {
                ((rg) this).field_y.field_o = (de) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((rg) this).field_y) {
                break L10;
              } else {
                ((rg) this).field_y.field_p = wj.field_f;
                break L10;
              }
            }
            L11: {
              if (((rg) this).field_z) {
                ((rg) this).field_F.field_p = qd.field_B;
                break L11;
              } else {
                if (!((rg) this).field_A) {
                  ((rg) this).field_F.field_o = (de) (Object) new wa();
                  break L11;
                } else {
                  ((rg) this).field_F.field_p = ej.field_t;
                  ((rg) this).field_F.field_o = (de) (Object) new wa();
                  break L11;
                }
              }
            }
            L12: {
              ((rg) this).field_j = 15;
              var7 = nb.field_c;
              if (null == ((rg) this).field_J) {
                break L12;
              } else {
                ((rg) this).field_j = ((rg) this).field_j + (var7.a(((rg) this).field_J, -40 + ((rg) this).field_i, var7.field_p) - -5);
                break L12;
              }
            }
            L13: {
              var8 = pf.field_b;
              var9 = kl.a(ll.b(95), (byte) 84);
              if (var9 != p.field_a) {
                if (bh.field_b != var9) {
                  break L13;
                } else {
                  var8 = rc.field_c;
                  break L13;
                }
              } else {
                var8 = v.field_a;
                break L13;
              }
            }
            L14: {
              ad dupTemp$2 = new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_I, false, 80, 3, var7, 16777215, var8);
              var11 = dupTemp$2;
              ((rg) this).a(true, (uj) (Object) dupTemp$2);
              ((rg) this).field_j = ((rg) this).field_j + (((uj) (Object) var11).field_f + 5);
              ad dupTemp$3 = new ad(10, ((rg) this).field_j, -20 + ((rg) this).field_i, 25, (uj) (Object) ((rg) this).field_G, false, 80, 3, var7, 16777215, tj.field_y);
              var12 = dupTemp$3;
              ((rg) this).a(true, (uj) (Object) dupTemp$3);
              ((rg) this).field_C.field_g = (qg) this;
              ((rg) this).field_j = ((rg) this).field_j + (5 + ((uj) (Object) var12).field_f);
              if (null == ((rg) this).field_y) {
                break L14;
              } else {
                ((rg) this).field_y.field_g = (qg) this;
                break L14;
              }
            }
            L15: {
              if (null == ((rg) this).field_F) {
                break L15;
              } else {
                ((rg) this).field_F.field_g = (qg) this;
                break L15;
              }
            }
            L16: {
              if (((rg) this).field_y != null) {
                ((rg) this).field_C.a(85, ((rg) this).field_i - 95, (byte) 121, 30, ((rg) this).field_j);
                ((rg) this).field_j = ((rg) this).field_j + 60;
                break L16;
              } else {
                ((rg) this).field_C.a(8, -10 + ((rg) this).field_i - 6, (byte) 118, 30, ((rg) this).field_j);
                ((rg) this).field_j = ((rg) this).field_j + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((rg) this).field_y) {
                break L17;
              } else {
                ((rg) this).field_y.a(8, ((rg) this).field_i - 16, (byte) 117, 30, ((rg) this).field_j);
                ((rg) this).field_j = ((rg) this).field_j + 35;
                break L17;
              }
            }
            L18: {
              if (((rg) this).field_F == null) {
                break L18;
              } else {
                L19: {
                  if (((rg) this).field_z) {
                    break L19;
                  } else {
                    if (((rg) this).field_A) {
                      break L19;
                    } else {
                      ((rg) this).field_F.a(8, 40, (byte) 120, 20, ((rg) this).field_j);
                      ((rg) this).field_j = ((rg) this).field_j + 25;
                      break L18;
                    }
                  }
                }
                ((rg) this).field_F.a(8, -6 + ((rg) this).field_i + -10, (byte) 127, 30, ((rg) this).field_j);
                ((rg) this).field_j = ((rg) this).field_j + 35;
                break L18;
              }
            }
            L20: {
              ((rg) this).a(0, ((rg) this).field_i, (byte) 120, 3 + ((rg) this).field_j, 0);
              ((rg) this).a(true, (uj) (Object) ((rg) this).field_C);
              if (null == ((rg) this).field_y) {
                break L20;
              } else {
                ((rg) this).a(true, (uj) (Object) ((rg) this).field_y);
                break L20;
              }
            }
            L21: {
              if (((rg) this).field_F == null) {
                break L21;
              } else {
                ((rg) this).a(true, (uj) (Object) ((rg) this).field_F);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("rg.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        ((rg) this).field_I.i(19293);
        ((rg) this).field_G.i(19293);
        if (param0) {
            Object var3 = null;
            ((rg) this).a(false, (fe) null);
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 == 98) {
                stackOut_6_0 = ((rg) this).b(-112, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param3 == 99) {
                  stackOut_10_0 = ((rg) this).a((byte) -103, param0);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("rg.EA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    public final void a(boolean param0, fe param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == ((rg) this).field_I) {
                boolean discarded$4 = ((rg) this).field_G.a(0, (uj) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((rg) this).field_G == param1) {
                int discarded$5 = -100;
                this.a();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var4 = null;
                ((rg) this).b((byte) -93, (String) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("rg.AA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void a() {
        L0: {
          L1: {
            int discarded$6 = 125;
            if (se.d()) {
              break L1;
            } else {
              if (-1 <= ((rg) this).field_I.field_k.length()) {
                break L0;
              } else {
                if (-1 >= ((rg) this).field_G.field_k.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          int discarded$7 = 0;
          ia.a(((rg) this).field_I.field_k, ((rg) this).field_G.field_k);
          break L0;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            ug.a(param1, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rg.B(").append(10).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            L2: {
              if (param0 != ((rg) this).field_C) {
                if (param0 != ((rg) this).field_y) {
                  if (((rg) this).field_F != param0) {
                    break L2;
                  } else {
                    if (!((rg) this).field_z) {
                      if (((rg) this).field_A) {
                        int discarded$8 = 11;
                        ob.b();
                        break L2;
                      } else {
                        vk.e(-59);
                        break L2;
                      }
                    } else {
                      int discarded$9 = 17;
                      ik.g();
                      break L2;
                    }
                  }
                } else {
                  pb.b(106);
                  break L2;
                }
              } else {
                int discarded$10 = -100;
                this.a();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("rg.E(");
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0, String param1) {
        fe var3 = null;
        String var4 = null;
        try {
            var3 = ((rg) this).field_I;
            var4 = param1;
            var3.a((byte) -91, false, var4);
            if (param0 != -79) {
                ((rg) this).field_I = null;
            }
            ((rg) this).field_G.i(19293);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "rg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = bf.a(param1.length, 0, 4, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rg.C(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "This password contains repeated characters, and would be easy to guess";
        field_B = 0;
        field_E = "Just play";
    }
}
