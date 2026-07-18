/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    boolean field_b;
    boolean field_e;
    int field_g;
    String field_d;
    String[] field_c;
    static int[] field_a;
    static String[] field_f;

    final static ff a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        jl stackIn_8_0 = null;
        rb stackIn_13_0 = null;
        mi stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        jl stackOut_7_0 = null;
        rb stackOut_12_0 = null;
        mi stackOut_14_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param0 < -78) {
              L1: {
                if (param2 != 0L) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    stackOut_7_0 = new jl(param3, param4);
                    stackIn_8_0 = stackOut_7_0;
                    return (ff) (Object) stackIn_8_0;
                  }
                }
              }
              if (param1) {
                stackOut_12_0 = new rb(param2, param4);
                stackIn_13_0 = stackOut_12_0;
                return (ff) (Object) stackIn_13_0;
              } else {
                stackOut_14_0 = new mi(param2, param4);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ff) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("nk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return (ff) (Object) stackIn_15_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                nk.a(47);
                break L1;
              }
            }
            field_f = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "nk.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              r.field_p = false;
              cg.field_f = false;
              if (pc.field_a == null) {
                break L1;
              } else {
                if (pc.field_a.field_E) {
                  L2: {
                    if (param0 != 8) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (ei.field_e) {
                            break L4;
                          } else {
                            param2 = jh.field_d;
                            if (Main.field_T == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param2 = rl.field_t;
                        break L3;
                      }
                      param0 = 2;
                      i.field_a.a(ng.field_y, -95);
                      break L2;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if (param0 != 10) {
                      break L5;
                    } else {
                      var3_int = 0;
                      di.b(param1 ^ -10);
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (cg.field_f) {
                          param2 = re.a(lk.field_p, new String[1], (byte) -50);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (ij.field_g) {
                          param2 = ph.field_a;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      pc.field_a.a(param2, (byte) -109, param0);
                      break L6;
                    }
                  }
                  if (param0 == 256) {
                    break L1;
                  } else {
                    if (param0 == 10) {
                      break L1;
                    } else {
                      if (!ei.field_e) {
                        i.field_a.l(-31940);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L9: {
              if (param1 == -9) {
                break L9;
              } else {
                nk.a(40);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ')');
        }
    }

    nk(boolean param0) {
        try {
            ((nk) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nk.<init>(" + param0 + ')');
        }
    }

    final static lb a(boolean param0, String param1) {
        RuntimeException var2 = null;
        lb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_3_0 = new lb(param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
