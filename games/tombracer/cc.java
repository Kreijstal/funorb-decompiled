/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends vg {
    int field_i;
    int field_g;
    static String field_l;
    private int field_f;
    private int field_h;
    int field_k;
    int field_j;

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!this.a(false)) {
              return;
            } else {
              L1: {
                stackOut_3_0 = param1;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!((cc) this).b(true)) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = jw.field_z[((cc) this).field_g];
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = ((cc) this).field_j;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                var4_int = stackIn_7_0 - -stackIn_7_1;
                if (((cc) this).b(true)) {
                  stackOut_10_0 = ((cc) this).field_k;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = hq.field_b[((cc) this).field_g];
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var5 = stackIn_11_0 + param2;
                this.a(((cc) this).field_h, param2 + hq.field_b[((cc) this).field_i], var4_int, var5, jw.field_z[((cc) this).field_i] + param1, (byte) 35);
                if (param0 == 99) {
                  break L3;
                } else {
                  field_l = null;
                  break L3;
                }
              }
              L4: {
                if (((cc) this).b(true)) {
                  this.a(((cc) this).field_f, var5, param1 - -jw.field_z[((cc) this).field_g], hq.field_b[((cc) this).field_g] + param2, var4_int, (byte) 35);
                  uda.field_r.a(((cc) this).field_j + param1 + uda.field_r.a(), param2 + (((cc) this).field_k + uda.field_r.c()));
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "cc.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = param2 + -param4 << 1158868720;
                var8 = -param1 + param3 << -1419409680;
                var9 = var7_int / (param0 + 1);
                var10 = var8 / (1 + param0);
                var11 = 1;
                if (!bma.d(107, ((cc) this).field_i)) {
                  break L2;
                } else {
                  if (bma.d(-121, ((cc) this).field_g)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var11 = 0;
              break L1;
            }
            L3: {
              var12 = 0;
              if (param5 == 35) {
                break L3;
              } else {
                ((cc) this).field_g = -113;
                break L3;
              }
            }
            L4: while (true) {
              L5: {
                L6: {
                  if (~var12 <= ~param0) {
                    break L6;
                  } else {
                    uda.field_r.a((var9 * (1 + var12) >> 39471760) + (param4 - -uda.field_r.a()), param1 + (var10 * (var12 - -1) >> -1779826736) + uda.field_r.c(), var11, -1695485712, 1);
                    var12++;
                    if (var13 != 0) {
                      break L5;
                    } else {
                      if (var13 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "cc.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                if (-1 == ((cc) this).field_j) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "cc.A(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(pfa param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_19_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        try {
          L0: {
            if (!this.a((byte) -95, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                L2: {
                  var4_int = param0.field_j >> -645428560;
                  var5 = param0.field_e >> -1233826000;
                  if (((cc) this).b(true)) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (~var4_int != ~jw.field_z[((cc) this).field_i]) {
                          break L4;
                        } else {
                          if (~hq.field_b[((cc) this).field_i] != ~var5) {
                            break L4;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_15_0 = stackOut_12_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L3;
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      stackOut_15_0 = jw.field_z;
                      stackIn_18_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var8 == 0) {
                        stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                        stackOut_18_1 = ((cc) this).field_i;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L5;
                      } else {
                        stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                        stackOut_16_1 = ((cc) this).field_g;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        break L5;
                      }
                    }
                    L6: {
                      var6 = stackIn_19_0[stackIn_19_1];
                      stackOut_19_0 = hq.field_b;
                      stackIn_22_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var8 != 0) {
                        stackOut_22_0 = (int[]) (Object) stackIn_22_0;
                        stackOut_22_1 = ((cc) this).field_g;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L6;
                      } else {
                        stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                        stackOut_20_1 = ((cc) this).field_i;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        break L6;
                      }
                    }
                    var7 = stackIn_23_0[stackIn_23_1];
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = ((cc) this).field_k;
                var6 = ((cc) this).field_j;
                break L1;
              }
              var8 = var6 + -var4_int;
              var9 = -var5 + var7;
              if (param2 == 116) {
                if (~(var8 * var8) < ~(var9 * var9)) {
                  L7: {
                    L8: {
                      L9: {
                        if (kda.field_hd == param1) {
                          break L9;
                        } else {
                          if (param1 != 96) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var8 < 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                    L10: {
                      L11: {
                        if (~param1 == ~mf.field_a) {
                          break L11;
                        } else {
                          if (param1 != 97) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (var8 > 0) {
                        break L7;
                      } else {
                        break L10;
                      }
                    }
                    stackOut_71_0 = 0;
                    stackIn_72_0 = stackOut_71_0;
                    return stackIn_72_0 != 0;
                  }
                  stackOut_69_0 = 1;
                  stackIn_70_0 = stackOut_69_0;
                  return stackIn_70_0 != 0;
                } else {
                  L12: {
                    L13: {
                      L14: {
                        if (mi.field_k == param1) {
                          break L14;
                        } else {
                          if (param1 != 98) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (0 > var9) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                    L15: {
                      L16: {
                        if (~fp.field_a == ~param1) {
                          break L16;
                        } else {
                          if (99 != param1) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (var9 > 0) {
                        break L12;
                      } else {
                        break L15;
                      }
                    }
                    stackOut_73_0 = 0;
                    stackIn_74_0 = stackOut_73_0;
                    break L0;
                  }
                  stackOut_49_0 = 1;
                  stackIn_50_0 = stackOut_49_0;
                  return stackIn_50_0 != 0;
                }
              } else {
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var4;
            stackOut_75_1 = new StringBuilder().append("cc.C(");
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L17;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_74_0 != 0;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              L0: {
                aia.field_j = param2;
                try {
                  L1: {
                    L2: {
                      var3 = param1.getParameter("cookieprefix");
                      if (param0 > 1) {
                        break L2;
                      } else {
                        cc.a(-59, (java.applet.Applet) null, (String) null);
                        break L2;
                      }
                    }
                    L3: {
                      var4 = param1.getParameter("cookiehost");
                      var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                      if (0 == param2.length()) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    throwable = decompiledCaughtException;
                    break L4;
                  }
                }
                v.a((byte) 64, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("cc.B(").append(param0).append(',');
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                stackIn_20_0 = stackOut_17_0;
                stackIn_20_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                cc.a(62);
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "cc.H(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, pfa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param0 <= -92) {
              L1: {
                L2: {
                  L3: {
                    var3_int = param1.field_j >> -368605424;
                    var4 = param1.field_e >> 1910987216;
                    if (~var3_int != ~jw.field_z[((cc) this).field_i]) {
                      break L3;
                    } else {
                      if (~hq.field_b[((cc) this).field_i] == ~var4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (jw.field_z[((cc) this).field_g] != var3_int) {
                      break L4;
                    } else {
                      if (var4 != hq.field_b[((cc) this).field_g]) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                }
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("cc.G(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                cc.a(42, (java.applet.Applet) null, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!mca.a((byte) 6, ((cc) this).field_i)) {
                  break L3;
                } else {
                  if (!mca.a((byte) 6, ((cc) this).field_g)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "cc.I(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    cc(int param0, int param1, int param2) {
        this(param0, param1, -1, -1, param2, 0);
    }

    final static nl a(byte param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        nl stackIn_5_0 = null;
        nl stackIn_9_0 = null;
        nl stackIn_13_0 = null;
        nl stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_4_0 = null;
        nl stackOut_8_0 = null;
        nl stackOut_12_0 = null;
        nl stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = -61 / ((param0 - 61) / 57);
            var3 = og.a(param1, "jagex-last-login-method", (byte) 86);
            if (var3 == null) {
              stackOut_4_0 = npa.field_f;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var4 = aga.a(-1025);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 >= var4.length) {
                      break L3;
                    } else {
                      var6 = var4[var5];
                      stackOut_8_0 = (nl) var6;
                      stackIn_16_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (!((nl) (Object) stackIn_9_0).a(var3, 5)) {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_12_0 = (nl) var6;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = npa.field_f;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("cc.F(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ((cc) this).field_i = param0;
            ((cc) this).field_j = param2;
            ((cc) this).field_f = param5;
            ((cc) this).field_h = param4;
            ((cc) this).field_g = param1;
            ((cc) this).field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Finish Time:";
    }
}
