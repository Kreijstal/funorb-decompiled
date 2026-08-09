/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends k {
    private int field_k;
    private int field_l;

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        var7 = BachelorFridge.field_y;
        var8 = this.field_j.a(param0, -1);
        var3 = var8;
        if (param1 == 0) {
          if (!this.field_j.field_m) {
            return var8;
          } else {
            var4 = this.a(0, param0, (byte) 114);
            var5 = 0;
            L0: while (true) {
              if (hh.field_d <= var5) {
                return var8;
              } else {
                L1: {
                  L2: {
                    var6 = var4[var5];
                    stackIn_19_0 = (int[]) (var8);

                    stackIn_19_1 = var5;

                    if (this.field_k > var6) {
                      break L2;
                    } else {




                      if (this.field_l >= var6) {
                        stackIn_21_0 = (int[]) ((Object) stackIn_19_0);
                        stackIn_21_1 = stackIn_19_1;
                        stackIn_21_2 = 4096;
                        break L1;
                      } else {
                        stackIn_19_0 = (int[]) ((Object) stackIn_19_0);

                        break L2;
                      }
                    }
                  }
                  stackIn_21_0 = (int[]) ((Object) stackIn_19_0);
                  stackIn_21_1 = stackIn_19_1;
                  stackIn_21_2 = 0;
                  break L1;
                }
                stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          this.field_k = -48;
          if (!this.field_j.field_m) {
            return var8;
          } else {
            var4 = this.a(0, param0, (byte) 114);
            var5 = 0;
            L3: while (true) {
              if (hh.field_d <= var5) {
                return var8;
              } else {
                L4: {
                  L5: {
                    var6 = var4[var5];
                    stackIn_7_0 = (int[]) (var8);

                    stackIn_7_1 = var5;

                    if (this.field_k > var6) {
                      break L5;
                    } else {




                      if (this.field_l >= var6) {
                        stackIn_9_0 = (int[]) ((Object) stackIn_7_0);
                        stackIn_9_1 = stackIn_7_1;
                        stackIn_9_2 = 4096;
                        break L4;
                      } else {
                        stackIn_7_0 = (int[]) ((Object) stackIn_7_0);

                        break L5;
                      }
                    }
                  }
                  stackIn_9_0 = (int[]) ((Object) stackIn_7_0);
                  stackIn_9_1 = stackIn_7_1;
                  stackIn_9_2 = 0;
                  break L4;
                }
                stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                var5++;
                continue L3;
              }
            }
          }
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -71) {
              break L0;
            } else {
              var5 = (String[]) null;
              wr.a((String[]) null, (byte) 3);
              break L0;
            }
          }
          var4_int = param2;
          if (0 == var4_int) {
            this.field_k = param1.e((byte) 54);
            return;
          } else {
            if (-2 == (var4_int ^ -1)) {
              this.field_l = param1.e((byte) 109);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("wr.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static void a(String[] args, byte param1) {
        RuntimeException var2 = null;
        String[] var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qi.field_b != null) {
                qi.field_b.field_J.a(args, (byte) -52);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (vk.field_q != null) {
                vk.field_q.field_E.a(args, (byte) -35);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 == -38) {
              break L0;
            } else {
              var3 = (String[]) null;
              wr.a((String[]) null, (byte) 34);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("wr.C(");

            if (args == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public wr() {
        super(1, true);
        this.field_k = 0;
        this.field_l = 4096;
    }

    static {
    }
}
