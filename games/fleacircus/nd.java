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
        rg.field_o.a(((nd) this).field_eb, param1 + (((nd) this).field_u >> 1611750049), 103 + param0, 16777215, -1);
        if (!(((nd) this).field_bb == null)) {
            gb.b(20 + param1, 120 + param0 - 7, 260, 8421504);
            int discarded$0 = rg.field_o.a(((nd) this).field_bb, param1 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, rg.field_o.field_H);
        }
    }

    final static hf[] a(boolean param0, ce param1) {
        int[] var3 = null;
        hf[] var4 = null;
        int var5 = 0;
        hf var6 = null;
        int var7 = 0;
        Object var8 = null;
        od var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        od var12 = null;
        int[] var13 = null;
        hf[] var14 = null;
        od var15 = null;
        int[] var16 = null;
        hf[] var17 = null;
        int[] var20 = null;
        int[] var21 = null;
        var7 = fleas.field_A ? 1 : 0;
        if (param1.a(125)) {
          if (param0) {
            var12 = param1.b((byte) 122);
            L0: while (true) {
              if (0 != var12.field_b) {
                if (2 == var12.field_b) {
                  return new hf[]{};
                } else {
                  var20 = (int[]) var12.field_e;
                  var13 = var20;
                  var11 = var13;
                  var10 = var11;
                  var3 = var10;
                  var14 = new hf[var20.length >> 1990360290];
                  var4 = var14;
                  var5 = 0;
                  L1: while (true) {
                    if (var14.length <= var5) {
                      return var4;
                    } else {
                      var6 = new hf();
                      var4[var5] = var6;
                      var6.field_c = var3[var5 << -2115893758];
                      var6.field_a = var3[(var5 << -171063742) + 1];
                      var6.field_i = var3[2 + (var5 << -605150654)];
                      var6.field_j = var3[3 + (var5 << -1561869950)];
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                vh.a(10L, 38);
                continue L0;
              }
            }
          } else {
            var8 = null;
            hf[] discarded$2 = nd.a(false, (ce) null);
            var15 = param1.b((byte) 122);
            var9 = var15;
            L2: while (true) {
              if (0 != var15.field_b) {
                if (2 == var15.field_b) {
                  return new hf[]{};
                } else {
                  var21 = (int[]) var15.field_e;
                  var16 = var21;
                  var11 = var16;
                  var10 = var11;
                  var3 = var10;
                  var17 = new hf[var21.length >> 1990360290];
                  var4 = var17;
                  var5 = 0;
                  L3: while (true) {
                    if (var17.length <= var5) {
                      return var4;
                    } else {
                      var6 = new hf();
                      var4[var5] = var6;
                      var6.field_c = var3[var5 << -2115893758];
                      var6.field_a = var3[(var5 << -171063742) + 1];
                      var6.field_i = var3[2 + (var5 << -605150654)];
                      var6.field_j = var3[3 + (var5 << -1561869950)];
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
          }
        } else {
          return new hf[]{};
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (((nd) this).field_db) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (param2 ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param2) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((nd) this).field_db = stackIn_11_1 != 0;
          if (((nd) this).field_db) {
            ((nd) this).field_ab.a((byte) 108, 4210752, 8405024);
            ((nd) this).field_ab.field_H = true;
            ((nd) this).field_eb = param0;
            ((nd) this).field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
            if (param3 >= -112) {
              ((nd) this).field_cb = false;
              return;
            } else {
              return;
            }
          } else {
            ((nd) this).field_ab.a((byte) 79, 4210752, 2113632);
            if (!((nd) this).field_cb) {
              ((nd) this).field_eb = param0;
              ((nd) this).field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
              if (param3 >= -112) {
                ((nd) this).field_cb = false;
                return;
              } else {
                return;
              }
            } else {
              ((nd) this).field_ab.field_H = false;
              ((nd) this).field_eb = param0;
              ((nd) this).field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
              if (param3 < -112) {
                return;
              } else {
                ((nd) this).field_cb = false;
                return;
              }
            }
          }
        } else {
          ((nd) this).field_eb = param0;
          ((nd) this).field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
          if (param3 < -112) {
            return;
          } else {
            ((nd) this).field_cb = false;
            return;
          }
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
        int var3 = 0;
        ((nd) this).field_bb = param1;
        if (null != ((nd) this).field_bb) {
            var3 = rg.field_o.b(((nd) this).field_bb, 260, rg.field_o.field_H);
            ((nd) this).a(150 + var3, (byte) -128, 300);
        }
        ((nd) this).field_ab = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
        ((nd) this).field_cb = false;
        ((nd) this).field_db = false;
        ((nd) this).field_ab.field_H = true;
        ((nd) this).a((qa) (Object) ((nd) this).field_ab, (byte) -63);
    }

    static {
    }
}
