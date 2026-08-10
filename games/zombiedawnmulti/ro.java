/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kb {
    static th field_M;
    static cj field_O;
    static boolean field_L;
    static String field_N;

    ro(String[] param0, fc param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_N = null;
        field_M = null;
        if (param0 <= 37) {
            field_L = false;
            field_O = null;
            return;
        }
        field_O = null;
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -118) {
              var3_int = 0;
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  stackIn_11_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param1 != param2.charAt(var5)) {
                      break L2;
                    } else {
                      var3_int++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 101;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final void a(k param0, byte param1) {
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        k stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ek var3 = null;
        ce var3_ref = null;
        RuntimeException var3_ref2 = null;
        bf var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a(-110, this.field_r);
              param0.a(this.field_H, (byte) -96);
              stackIn_3_0 = (k) (param0);

              stackIn_3_1 = 109;

              if (this.field_i) {
                stackIn_4_0 = (k) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              } else {
                stackIn_4_0 = (k) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              }
            }
            ((k) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
            param0.a(this.field_C, (byte) -121);
            param0.a(this.field_I, (byte) -55);
            param0.a(this.field_g, (byte) -54);
            param0.a(-73, this.field_l);
            var3_int = 0;
            L2: while (true) {
              if (this.field_t <= var3_int) {
                var3 = (ek) ((Object) this.field_K.c(40));
                L3: while (true) {
                  if (var3 == null) {
                    var3_ref = (ce) ((Object) this.field_s.c(102));
                    L4: while (true) {
                      if (var3_ref == null) {
                        var3_int = 11 + 16 * this.field_t - -((this.field_K.a(0) - -this.field_s.a(0) + this.field_A.a(0)) * 8);
                        if ((57 + var3_int ^ -1) < -2001) {
                          param0.a(117, 0);
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var4 = (bf) ((Object) this.field_A.c(59));
                          if (param1 < -107) {
                            L5: while (true) {
                              if (var4 == null) {
                                param0.a(-106, 0);
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                param0.a(-94, 4);
                                param0.a(-36, 0);
                                param0.a(var4.field_i, (byte) -104);
                                param0.a(var4.field_l, (byte) -107);
                                var5 = 0;
                                var5 = var5 | var4.field_o << 97582558;
                                param0.a(var5, (byte) -105);
                                var4 = (bf) ((Object) this.field_A.b(6));
                                continue L5;
                              }
                            }
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      } else {
                        param0.a(-64, 5);
                        param0.a(112, var3_ref.field_q);
                        param0.a((var3_ref.field_m + ip.field_f) * 24, (byte) -69);
                        param0.a((ip.field_f + var3_ref.field_t) * 24, (byte) -54);
                        param0.a(var3_ref.field_s, (byte) -103);
                        var3_ref = (ce) ((Object) this.field_s.b(6));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      L7: {
                        if (var3 instanceof pa) {
                          var7 = (pa) ((Object) var3);
                          if ((var7.field_Q ^ -1) == -22) {
                            break L6;
                          } else {
                            if (!var7.field_Z) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        param0.a(108, this.a(var3, (byte) -105));
                        param0.a(110, var3.field_x);
                        param0.a(var3.e((byte) -112), (byte) -67);
                        param0.a(var3.g(1829947600), (byte) -95);
                        var4_int = var3.field_D;
                        if (var3 instanceof ge) {
                          var9 = (ge) ((Object) var3);
                          var4_int = var4_int | var9.field_gb << 654099486;
                          break L8;
                        } else {
                          if (var3 instanceof og) {
                            var8 = (og) ((Object) var3);
                            if (var8.field_Q) {
                              var4_int = var4_int | 536870912;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      var4_int = var4_int & 255 | (-16777216 & var4_int) >> 473582544;
                      param0.a(var4_int, (byte) -104);
                      break L6;
                    }
                    var3 = (ek) ((Object) this.field_K.b(6));
                    continue L3;
                  }
                }
              } else {
                param0.a(110, this.field_y[var3_int]);
                param0.d(this.field_D[var3_int][0], -8593);
                param0.d(this.field_D[var3_int][1], -8593);
                param0.a(this.field_d[var3_int], (byte) -84);
                param0.d((int)(this.field_e[var3_int] >>> -399687704), -8593);
                param0.a(this.field_a[var3_int], (byte) -85);
                param0.a(this.field_z[var3_int], (byte) -78);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref2 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3_ref2);

            stackIn_39_1 = new StringBuilder().append("ro.E(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L9;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int a(ek param0, byte param1) {
        RuntimeException var3 = null;
        k var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -80) {
                break L1;
              } else {
                var4 = (k) null;
                this.a((k) null, (byte) 11);
                break L1;
              }
            }
            if (param0 instanceof ge) {
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (!(param0 instanceof lm)) {
                if (!(param0 instanceof og)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = 3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = 2;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ro.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static int c(byte param0) {
        if (param0 < 116) {
            return 69;
        }
        return (li.field_C << 437096900) + ((qe.field_g << -1670987742) - -ba.field_q);
    }

    static {
        field_N = "? ? ?";
    }
}
