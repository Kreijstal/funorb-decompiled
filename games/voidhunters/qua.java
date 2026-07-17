/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qua {
    static dpb field_a;
    lu field_e;
    static float field_b;
    ml[] field_c;
    static kb field_d;

    final void a(byte param0, ml param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 1;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (((qua) this).field_c.length <= var4) {
                  break L2;
                } else {
                  L3: {
                    if (((qua) this).field_c[var4] == param1) {
                      break L3;
                    } else {
                      if (((qua) this).field_c[var4].a(16, param1)) {
                        break L3;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  }
                  var3_int = 0;
                  break L2;
                }
              }
              L4: {
                if (var3_int != 0) {
                  var4 = 0;
                  L5: while (true) {
                    if (var4 >= ((qua) this).field_c.length) {
                      ((qua) this).field_c = (ml[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((qua) this).field_c, 0, ii.field_d);
                      break L4;
                    } else {
                      L6: {
                        if (param1.a(16, ((qua) this).field_c[var4])) {
                          ((qua) this).field_c = (ml[]) (Object) dt.a(ii.field_d, var4, 15667, (Object[]) (Object) ((qua) this).field_c);
                          var4--;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var4++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                if (param0 == 108) {
                  break L7;
                } else {
                  var6 = null;
                  tpa discarded$2 = qua.a(false, (String) null);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("qua.A(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        long stackIn_7_0 = 0L;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0L;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = (var3 << 5) - (var3 + -(long)param0.charAt(var5));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("qua.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 1 + 41);
        }
        return stackIn_7_0;
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        L0: {
          var5 = param3 >> 31;
          param3 = var5 ^ var5 + param3;
          var5 = param2 >> 31;
          param2 = var5 ^ var5 + param2;
          if (param1 == 119) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = param0 >> 31;
            param0 = param0 - -var5 ^ var5;
            var4 = 0;
            if (~param2 >= ~param3) {
              break L2;
            } else {
              if (~param0 <= ~param2) {
                break L2;
              } else {
                var5 = param3;
                param3 = param2;
                param2 = var5;
                break L1;
              }
            }
          }
          if (~param0 < ~param3) {
            var5 = param3;
            param3 = param0;
            param0 = var5;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (16384 > param3) {
            break L3;
          } else {
            L4: {
              if (param3 < 536870912) {
                break L4;
              } else {
                var4 += 16;
                param2 = param2 >> 16;
                param0 = param0 >> 16;
                param3 = param3 >> 16;
                break L4;
              }
            }
            L5: {
              if (2097152 <= param3) {
                param2 = param2 >> 8;
                param0 = param0 >> 8;
                param3 = param3 >> 8;
                var4 += 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param3 >= 131072) {
                param3 = param3 >> 4;
                param0 = param0 >> 4;
                param2 = param2 >> 4;
                var4 += 4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param3 < 32768) {
                break L7;
              } else {
                param3 = param3 >> 2;
                param2 = param2 >> 2;
                var4 += 2;
                param0 = param0 >> 2;
                break L7;
              }
            }
            if (16384 <= param3) {
              param2 = param2 >> 1;
              var4++;
              param0 = param0 >> 1;
              param3 = param3 >> 1;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L8: {
          if (param3 <= param2 << 5) {
            break L8;
          } else {
            if (param0 << 5 < param3) {
              return param3 << var4;
            } else {
              break L8;
            }
          }
        }
        param3 = param0 * param0 + param2 * param2 + param3 * param3;
        if (param3 >= 65536) {
          if (param3 >= 16777216) {
            if (param3 < 268435456) {
              if (param3 >= 67108864) {
                L9: {
                  if (var4 < 2) {
                    stackOut_60_0 = eo.field_o[param3 >> 20] >> 2 - var4;
                    stackIn_61_0 = stackOut_60_0;
                    break L9;
                  } else {
                    stackOut_59_0 = eo.field_o[param3 >> 20] << var4 + -2;
                    stackIn_61_0 = stackOut_59_0;
                    break L9;
                  }
                }
                return stackIn_61_0;
              } else {
                L10: {
                  if (3 <= var4) {
                    stackOut_56_0 = eo.field_o[param3 >> 18] << -3 + var4;
                    stackIn_57_0 = stackOut_56_0;
                    break L10;
                  } else {
                    stackOut_55_0 = eo.field_o[param3 >> 18] >> 3 - var4;
                    stackIn_57_0 = stackOut_55_0;
                    break L10;
                  }
                }
                return stackIn_57_0;
              }
            } else {
              if (1073741824 > param3) {
                L11: {
                  if (var4 < 1) {
                    stackOut_51_0 = eo.field_o[param3 >> 22] >> -var4 + 1;
                    stackIn_52_0 = stackOut_51_0;
                    break L11;
                  } else {
                    stackOut_50_0 = eo.field_o[param3 >> 22] << -1 + var4;
                    stackIn_52_0 = stackOut_50_0;
                    break L11;
                  }
                }
                return stackIn_52_0;
              } else {
                return eo.field_o[param3 >> 24] << var4;
              }
            }
          } else {
            if (param3 < 1048576) {
              if (param3 < 262144) {
                return eo.field_o[param3 >> 10] >> 7;
              } else {
                return eo.field_o[param3 >> 12] >> 6;
              }
            } else {
              if (4194304 > param3) {
                return eo.field_o[param3 >> 14] >> 5;
              } else {
                return eo.field_o[param3 >> 16] >> 4;
              }
            }
          }
        } else {
          if (param3 >= 256) {
            if (param3 < 4096) {
              if (param3 < 1024) {
                return eo.field_o[param3 >> 2] >> 11;
              } else {
                return eo.field_o[param3 >> 4] >> 10;
              }
            } else {
              if (param3 >= 16384) {
                return eo.field_o[param3 >> 8] >> 8;
              } else {
                return eo.field_o[param3 >> 6] >> 9;
              }
            }
          } else {
            if (param3 >= 0) {
              return eo.field_o[param3] >> 12;
            } else {
              return -1;
            }
          }
        }
    }

    final static int a(dj param0, boolean param1, dj param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var4 = null;
            stackOut_2_0 = cnb.a(0, param2, param0, 0, 0, (String) null, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qua.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    qua(lu param0) {
        try {
            ((qua) this).field_e = param0;
            ((qua) this).field_c = new ml[]{};
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qua.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static tpa a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        Object stackIn_9_0 = null;
        tpa stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        tpa stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (dw.field_c != lrb.field_b) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var3 = null;
                  break L1;
                }
              }
              L2: {
                if (gka.field_o != lrb.field_b) {
                  break L2;
                } else {
                  if (param1.equals((Object) (Object) vsa.field_q)) {
                    lrb.field_b = kla.field_d;
                    stackOut_10_0 = jra.field_a;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              lrb.field_b = dw.field_c;
              jra.field_a = null;
              vsa.field_q = param1;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (tpa) (Object) stackIn_9_0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("qua.E(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dpb();
        field_b = 0.4000000059604645f;
        field_d = new kb(4);
    }
}
