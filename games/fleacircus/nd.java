/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends jj {
    private lk field_ab;
    private String field_bb;
    private boolean field_db;
    private boolean field_cb;
    private String field_eb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        rg.field_o.a(((nd) this).field_eb, param1 + (((nd) this).field_u >> 1), 103 + param0, 16777215, -1);
        if (!(((nd) this).field_bb == null)) {
            gb.b(20 + param1, 120 + param0 - 7, 260, 8421504);
            int discarded$0 = rg.field_o.a(((nd) this).field_bb, param1 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, rg.field_o.field_H);
        }
    }

    final static hf[] a(boolean param0, ce param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        hf[] var4 = null;
        int var5 = 0;
        hf var6 = null;
        int var7 = 0;
        Object var8 = null;
        od var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        hf[] stackIn_3_0 = null;
        hf[] stackIn_12_0 = null;
        hf[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf[] stackOut_11_0 = null;
        hf[] stackOut_16_0 = null;
        hf[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1.a(125)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  var8 = null;
                  hf[] discarded$1 = nd.a(false, (ce) null);
                  break L1;
                }
              }
              var9 = param1.b((byte) 122);
              L2: while (true) {
                if (0 != var9.field_b) {
                  if (2 == var9.field_b) {
                    stackOut_11_0 = new hf[]{};
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var13 = (int[]) var9.field_e;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    var4 = new hf[var13.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (hf[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new hf();
                        var4[var5] = var6;
                        var6.field_c = var3[var5 << 2];
                        var6.field_a = var3[(var5 << 2) + 1];
                        var6.field_i = var3[2 + (var5 << 2)];
                        var6.field_j = var3[3 + (var5 << 2)];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  vh.a(10L, 38);
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = new hf[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("nd.BA(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (((nd) this).field_db) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param2 ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param2) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((nd) this).field_db = stackIn_8_1 != 0;
                if (((nd) this).field_db) {
                  ((nd) this).field_ab.a((byte) 108, 4210752, 8405024);
                  ((nd) this).field_ab.field_H = true;
                  break L2;
                } else {
                  ((nd) this).field_ab.a((byte) 79, 4210752, 2113632);
                  if (!((nd) this).field_cb) {
                    break L2;
                  } else {
                    ((nd) this).field_ab.field_H = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            ((nd) this).field_eb = param0;
            ((nd) this).field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
            if (param3 < -112) {
              break L0;
            } else {
              ((nd) this).field_cb = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("nd.AA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void n(int param0) {
        if (param0 != 100) {
          ((nd) this).b(-71, 115, -86);
          ((nd) this).field_cb = true;
          ((nd) this).field_ab.field_H = false;
          return;
        } else {
          ((nd) this).field_cb = true;
          ((nd) this).field_ab.field_H = false;
          return;
        }
    }

    nd(f param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((nd) this).field_bb = param1;
            if (null != ((nd) this).field_bb) {
                var3_int = rg.field_o.b(((nd) this).field_bb, 260, rg.field_o.field_H);
                ((nd) this).a(150 + var3_int, (byte) -128, 300);
            }
            ((nd) this).field_ab = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
            ((nd) this).field_cb = false;
            ((nd) this).field_db = false;
            ((nd) this).field_ab.field_H = true;
            ((nd) this).a((qa) (Object) ((nd) this).field_ab, (byte) -63);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
