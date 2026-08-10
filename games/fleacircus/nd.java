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
        rg.field_o.a(this.field_eb, param1 + (this.field_u >> 1611750049), 103 + param0, 16777215, -1);
        if (!(this.field_bb == null)) {
            gb.b(20 + param1, 120 + param0 - 7, 260, 8421504);
            rg.field_o.a(this.field_bb, param1 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, rg.field_o.field_H);
        }
    }

    final static hf[] a(boolean param0, ce param1) {
        hf[] stackIn_3_0 = null;
        hf[] stackIn_12_0 = null;
        hf[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        hf[] var4 = null;
        int var5 = 0;
        hf var6 = null;
        int var7 = 0;
        ce var8 = null;
        od var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1.a(125)) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  var8 = (ce) null;
                  nd.a(false, (ce) null);
                  break L1;
                }
              }
              var9 = param1.b((byte) 122);
              L2: while (true) {
                if (0 != var9.field_b) {
                  if (2 == var9.field_b) {
                    stackIn_12_0 = new hf[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var11 = (int[]) (var9.field_e);
                    var10 = var11;
                    var3 = var10;
                    var4 = new hf[var11.length >> 1990360290];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackIn_17_0 = (hf[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
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
            } else {
              stackIn_3_0 = new hf[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("nd.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_db) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param2 ? 1 : 0)) {
                L3: {
                  stackIn_7_0 = this;

                  if (!param2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((nd) (this)).field_db = stackIn_8_1 != 0;
                if (this.field_db) {
                  this.field_ab.a((byte) 108, 4210752, 8405024);
                  this.field_ab.field_H = true;
                  break L2;
                } else {
                  this.field_ab.a((byte) 79, 4210752, 2113632);
                  if (!this.field_cb) {
                    break L2;
                  } else {
                    this.field_ab.field_H = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            this.field_eb = param0;
            this.field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
            if (param3 < -112) {
              break L0;
            } else {
              this.field_cb = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("nd.AA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void n(int param0) {
        if (param0 != 100) {
          this.b(-71, 115, -86);
          this.field_cb = true;
          this.field_ab.field_H = false;
          return;
        } else {
          this.field_cb = true;
          this.field_ab.field_H = false;
          return;
        }
    }

    nd(f param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_bb = param1;
            if (null != this.field_bb) {
                var3_int = rg.field_o.b(this.field_bb, 260, rg.field_o.field_H);
                this.a(150 + var3_int, (byte) -128, 300);
            }
            this.field_ab = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_cb = false;
            this.field_db = false;
            this.field_ab.field_H = true;
            this.a((qa) (this.field_ab), (byte) -63);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
