/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends le {
    static ij field_j;
    private ev[] field_i;

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ik var4 = null;
        br var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            var4 = (ik) (Object) mhb.field_o.d(0);
            L1: while (true) {
              if (var4 == null) {
                var5 = (br) (Object) ca.field_p.d(0);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    eva.a(var5, -60, 5);
                    var5 = (br) (Object) ca.field_p.a((byte) 112);
                    continue L2;
                  }
                }
              } else {
                aeb.a(5, -21584, var4);
                var4 = (ik) (Object) mhb.field_o.a((byte) 8);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "md.D(" + 5 + ',' + 0 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = VoidHunters.field_G;
        int[][] var3 = ((md) this).field_d.a(param1, (byte) -92);
        if (((md) this).field_d.field_g) {
            var4 = hob.field_d;
            var5 = noa.field_o;
            var29 = new int[var5][var4];
            var30 = ((md) this).field_d.b(param0 + -134);
            this.a(true, var29);
            for (var8 = 0; noa.field_o > var8; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; var14 < hob.field_d; var14++) {
                    var15 = var32[var14];
                    var13[var14] = dla.a(255, var15) << 4;
                    var12[var14] = dla.a(var15, 65280) >> 4;
                    var11[var14] = dla.a(16711680, var15) >> 12;
                }
            }
        }
        if (param0 != 255) {
            return null;
        }
        return var3;
    }

    final int[] a(int param0, boolean param1) {
        if (!param1) {
            ((md) this).field_i = null;
        }
        int[] var4 = ((md) this).field_f.a((byte) 121, param0);
        int[] var3 = var4;
        if (((md) this).field_f.field_e) {
            this.a(param1, ((md) this).field_f.b(123));
        }
        return var4;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 <= -60) {
              L1: {
                if (param0 != 0) {
                  if (param0 == 1) {
                    L2: {
                      stackOut_19_0 = this;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (param2.e((byte) -115) != 1) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L2;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L2;
                      }
                    }
                    ((md) this).field_g = stackIn_22_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((md) this).field_i = new ev[param2.e((byte) -105)];
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= ((md) this).field_i.length) {
                      break L1;
                    } else {
                      L4: {
                        var5 = param2.e((byte) -104);
                        var6 = var5;
                        if (var6 == 0) {
                          ((md) this).field_i[var4_int] = (ev) (Object) frb.a(param2, (byte) 118);
                          break L4;
                        } else {
                          if (1 != var6) {
                            if (var6 == 2) {
                              ((md) this).field_i[var4_int] = (ev) (Object) ika.a(32, param2);
                              break L4;
                            } else {
                              if (3 == var6) {
                                ((md) this).field_i[var4_int] = (ev) (Object) uea.a(param2, -87);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            ((md) this).field_i[var4_int] = (ev) (Object) pmb.a(126, param2);
                            break L4;
                          }
                        }
                      }
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("md.F(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    public md() {
        super(0, true);
    }

    private final void a(boolean param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ev var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = hob.field_d;
              var4 = noa.field_o;
              tt.a(param1, -98);
              pk.a(wf.field_d, 0, param0, 0, gbb.field_q);
              if (((md) this).field_i == null) {
                break L1;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((md) this).field_i.length) {
                    break L1;
                  } else {
                    L3: {
                      var6 = ((md) this).field_i[var5];
                      var7 = var6.field_e;
                      var8 = var6.field_d;
                      if (0 <= var7) {
                        if (var8 < 0) {
                          var6.b((byte) -112, var3_int, var4);
                          break L3;
                        } else {
                          var6.a(var4, (byte) 110, var3_int);
                          break L3;
                        }
                      } else {
                        if (var8 >= 0) {
                          var6.a((byte) -99, var4, var3_int);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("md.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            md.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ij();
    }
}
