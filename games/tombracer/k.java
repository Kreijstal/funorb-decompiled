/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends qr {
    static String field_z;
    private static String[] field_y;
    static int field_A;

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        vp var7 = null;
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
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = ava.field_f;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(param5, param3, 17, param2, param4)) {
                  break L1;
                } else {
                  L2: {
                    if (!(this.field_h instanceof kja)) {
                      break L2;
                    } else {
                      ((kja) ((Object) this.field_h)).a(var7, (byte) 59, (k) (this));
                      ava.field_f = null;
                      if (!TombRacer.field_G) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var7.field_h instanceof kja) {
                    ((kja) ((Object) var7.field_h)).a(var7, (byte) 59, (k) (this));
                    ava.field_f = null;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("k.Q(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private k(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_x = param6;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "k.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, gqa param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gqa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null != param1.field_f) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (-1 != (param1.field_c ^ -1)) {
                        break L4;
                      } else {
                        if (param1.field_o != 0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 0;
                    L5: while (true) {
                      if (ara.field_xb <= var2_int) {
                        break L3;
                      } else {
                        var3 = wea.field_d[var2_int];
                        var6 = var3.field_d;
                        var5 = 2;
                        if (var4 != 0) {
                          if (var5 >= var6) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L6: {
                            if (var5 != var6) {
                              break L6;
                            } else {
                              if (param1.field_c != var3.field_c) {
                                break L6;
                              } else {
                                if (param1.field_o != var3.field_o) {
                                  break L6;
                                } else {
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (null == param1.field_h) {
                      break L7;
                    } else {
                      tba.field_g = param1.field_j;
                      fp.field_d = param1.field_h;
                      uba.field_f = param1.field_d;
                      bla.field_I = param1.field_i;
                      break L7;
                    }
                  }
                  if (param0 >= 103) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
              tna.a(16599, param1);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("k.KA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void e(int param0) {
        field_z = null;
        if (param0 != 0) {
            gqa var2 = (gqa) null;
            k.a((byte) -103, (gqa) null);
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        field_z = "Match by...";
        field_y = new String[5];
        field_y[0] = "Simple";
        field_y[3] = "Falling";
        field_y[2] = "Kit";
        field_y[4] = "Maze";
        field_y[1] = "Portal";
    }
}
