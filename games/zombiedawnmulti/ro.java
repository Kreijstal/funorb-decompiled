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
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -118) {
              var3_int = 0;
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var4 <= var5) {
                    stackOut_10_0 = var3_int;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_6_0 = param1 ^ -1;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (stackIn_7_0 != (param2.charAt(var5) ^ -1)) {
                          break L3;
                        } else {
                          var3_int++;
                          break L3;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 101;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
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
        RuntimeException var3 = null;
        int var3_int = 0;
        ek var3_ref = null;
        ce var3_ref2 = null;
        bf var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        k stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        k stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ek stackIn_12_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        k stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        k stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        k stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        ek stackOut_11_0 = null;
        br stackOut_28_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a(-110, this.field_r);
              param0.a(this.field_H, (byte) -96);
              stackOut_1_0 = (k) (param0);
              stackOut_1_1 = 109;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (this.field_i) {
                stackOut_3_0 = (k) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (k) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
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
              L3: {
                L4: {
                  if (this.field_t <= var3_int) {
                    break L4;
                  } else {
                    param0.a(110, this.field_y[var3_int]);
                    param0.d(this.field_D[var3_int][0], -8593);
                    param0.d(this.field_D[var3_int][1], -8593);
                    param0.a(this.field_d[var3_int], (byte) -84);
                    param0.d((int)(this.field_e[var3_int] >>> -399687704), -8593);
                    param0.a(this.field_a[var3_int], (byte) -85);
                    param0.a(this.field_z[var3_int], (byte) -78);
                    var3_int++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3_ref = (ek) ((Object) this.field_K.c(40));
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var3_ref == null) {
                        break L7;
                      } else {
                        stackOut_11_0 = (ek) (var3_ref);
                        stackIn_29_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var6 != 0) {
                          break L6;
                        } else {
                          L8: {
                            L9: {
                              if (stackIn_12_0 instanceof pa) {
                                var7 = (pa) ((Object) var3_ref);
                                if ((var7.field_Q ^ -1) == -22) {
                                  break L8;
                                } else {
                                  if (!var7.field_Z) {
                                    break L9;
                                  } else {
                                    if (var6 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              L11: {
                                param0.a(108, this.a(var3_ref, (byte) -105));
                                param0.a(110, var3_ref.field_x);
                                param0.a(var3_ref.e((byte) -112), (byte) -67);
                                param0.a(var3_ref.g(1829947600), (byte) -95);
                                var4_int = var3_ref.field_D;
                                if (var3_ref instanceof ge) {
                                  break L11;
                                } else {
                                  if (var3_ref instanceof og) {
                                    L12: {
                                      var8 = (og) ((Object) var3_ref);
                                      if (var8.field_Q) {
                                        var4_int = var4_int | 536870912;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    if (var6 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var9 = (ge) ((Object) var3_ref);
                              var4_int = var4_int | var9.field_gb << 654099486;
                              break L10;
                            }
                            var4_int = var4_int & 255 | (-16777216 & var4_int) >> 473582544;
                            param0.a(var4_int, (byte) -104);
                            break L8;
                          }
                          var3_ref = (ek) ((Object) this.field_K.b(6));
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = this.field_s.c(102);
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  }
                  var3_ref2 = (ce) ((Object) stackIn_29_0);
                  L13: while (true) {
                    L14: {
                      if (var3_ref2 == null) {
                        break L14;
                      } else {
                        param0.a(-64, 5);
                        param0.a(112, var3_ref2.field_q);
                        param0.a((var3_ref2.field_m + ip.field_f) * 24, (byte) -69);
                        param0.a((ip.field_f + var3_ref2.field_t) * 24, (byte) -54);
                        param0.a(var3_ref2.field_s, (byte) -103);
                        var3_ref2 = (ce) ((Object) this.field_s.b(6));
                        if (var6 == 0) {
                          continue L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = 11 + 16 * this.field_t - -((this.field_K.a(0) - -this.field_s.a(0) + this.field_A.a(0)) * 8);
                    break L3;
                  }
                }
              }
              if ((57 + var3_int ^ -1) < -2001) {
                param0.a(117, 0);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = (bf) ((Object) this.field_A.c(59));
                if (param1 < -107) {
                  L15: while (true) {
                    L16: {
                      if (var4 != null) {
                        param0.a(-94, 4);
                        param0.a(-36, 0);
                        param0.a(var4.field_i, (byte) -104);
                        param0.a(var4.field_l, (byte) -107);
                        var5 = 0;
                        var5 = var5 | var4.field_o << 97582558;
                        param0.a(var5, (byte) -105);
                        var4 = (bf) ((Object) this.field_A.b(6));
                        if (var6 != 0) {
                          break L16;
                        } else {
                          if (var6 == 0) {
                            continue L15;
                          } else {
                            param0.a(-106, 0);
                            break L16;
                          }
                        }
                      } else {
                        param0.a(-106, 0);
                        break L16;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var3);
            stackOut_46_1 = new StringBuilder().append("ro.E(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L17;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L17;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              stackOut_11_0 = 1;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (!(param0 instanceof lm)) {
                if (!(param0 instanceof og)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = 3;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_4_0 = 2;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ro.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
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
