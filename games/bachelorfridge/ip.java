/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends kj {
    static kv[] field_f;
    private int field_g;

    ip(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = this.field_g * (int)((double)param0 / 30.0);
        if (param1 != 0) {
          field_f = (kv[]) null;
          il.field_a.a((-this.field_g + 30 << 2054408705) + param2, var4, 128 + -(30 - this.field_g << 1085892737), 64);
          return;
        } else {
          il.field_a.a((-this.field_g + 30 << 2054408705) + param2, var4, 128 + -(30 - this.field_g << 1085892737), 64);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.a(-90, true, -97);
        }
    }

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            if (!wc.a(0, var6)) {
              stackOut_2_0 = mk.field_f;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!wb.a((byte) 52, param0)) {
                if (2 == um.field_c) {
                  if (!bna.a((byte) 5, param0)) {
                    if (100 > bda.field_l) {
                      if (!gl.a(3, param0)) {
                        L1: {
                          if (param1 == -80) {
                            break L1;
                          } else {
                            ip.c((byte) 108);
                            break L1;
                          }
                        }
                        var5 = sja.field_fb;
                        var5.c(param2, (byte) 107);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.d(2, 0);
                        var5.a((byte) -50, param0);
                        var5.b((byte) 105, var5.field_g - var4);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackOut_17_0 = lga.a(true, new String[]{param0}, fja.field_b);
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_14_0 = c.field_i;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_11_0 = lga.a(true, new String[]{param0}, nu.field_d);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = bt.field_q;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = cea.field_a;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("ip.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    return (String) ((Object) stackIn_22_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != -36) {
            field_f = (kv[]) null;
        }
    }

    final boolean b(int param0) {
        L0: {
          if (0 == this.field_g) {
            wf.a(69, (byte) -91);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$2 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (30 > fieldTemp$2) {
          if (param0 <= 21) {
            this.a(-86, -98, -122);
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 22) {
          var2 = param1;
          if (var2 != 0) {
            if (-13 != (var2 ^ -1)) {
              if (-3 != var2) {
                if ((var2 ^ -1) == 1) {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                } else {
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          } else {
            ala.a(26219, wc.field_p);
            return;
          }
        } else {
          ip.a((byte) 109, 122);
          var2 = param1;
          if (var2 != 0) {
            if (-13 != (var2 ^ -1)) {
              if (-3 != var2) {
                if ((var2 ^ -1) != 1) {
                  return;
                } else {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          } else {
            ala.a(26219, wc.field_p);
            return;
          }
        }
    }

    static {
    }
}
