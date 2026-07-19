/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tma extends ana {
    private l field_y;
    static lo field_x;
    static ws field_w;
    static int field_v;

    private final void b(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.c((byte) 26);
        }
    }

    tma(gj param0, l param1) {
        super(param0, param1);
        try {
            this.field_y = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_y.field_l.a(116, this.field_q.field_h);
        if (!(!var2.i(105))) {
            return;
        }
        ad discarded$0 = this.field_q.a(21915, this.field_q.b(var2, -23990));
        pp var3 = (pp) ((Object) this.field_y.field_o.b((byte) 90));
        oha discarded$1 = al.a(88, this.field_y.field_k);
        int var4 = 96 / ((param0 - -68) / 50);
        while (var3 != null) {
            var3.a(var2, this.field_q.field_h, 12);
            var3 = (pp) ((Object) this.field_y.field_o.c(0));
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        if (param0) {
            field_v = -47;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final boolean c(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        if (!this.field_y.field_p) {
          fieldTemp$2 = this.field_l - 1;
          this.field_l = this.field_l - 1;
          if (0 <= fieldTemp$2) {
            if (-26 != (this.field_l ^ -1)) {
              return false;
            } else {
              jja.a(256, -1, 70);
              this.d(-18);
              return false;
            }
          } else {
            var2 = 97 / ((param0 - 71) / 47);
            this.b(false);
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int[][] param0, int param1) {
        try {
            if (param1 != -5) {
                field_x = (lo) null;
            }
            tj.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tma.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static cj a(lu param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cj stackIn_6_0 = null;
        cj stackIn_10_0 = null;
        cj stackIn_14_0 = null;
        cj stackIn_17_0 = null;
        cj stackIn_20_0 = null;
        cj stackIn_23_0 = null;
        cj stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_5_0 = null;
        cj stackOut_9_0 = null;
        cj stackOut_13_0 = null;
        cj stackOut_25_0 = null;
        cj stackOut_22_0 = null;
        cj stackOut_19_0 = null;
        cj stackOut_16_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var2_int = param0.b(16711935);
            if (255 != var2_int) {
              if ((var2_int ^ -1) == -3) {
                stackOut_5_0 = ih.a(param0, param1 ^ -276);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (var2_int == 1) {
                  stackOut_9_0 = ig.a(param0, 104);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (-5 == (var2_int ^ -1)) {
                    stackOut_13_0 = ba.a(param0, (byte) 119);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (param1 == -50) {
                      if (-6 != (var2_int ^ -1)) {
                        if ((var2_int ^ -1) != -7) {
                          if ((var2_int ^ -1) != -8) {
                            throw new IllegalStateException("Invalid move category");
                          } else {
                            stackOut_25_0 = gla.a(param0, (byte) -19);
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        } else {
                          stackOut_22_0 = hj.a((byte) -121, param0);
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      } else {
                        stackOut_19_0 = rfa.a(29428, param0);
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = (cj) null;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("tma.F(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return stackIn_26_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_x = new lo();
        field_w = new ws();
    }
}
