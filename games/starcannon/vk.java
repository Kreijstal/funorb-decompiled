/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vk extends uj implements ch {
    static String field_x;
    static String field_w;
    static String field_t;
    static String field_v;
    rk field_u;

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var2 = new ba(((vk) this).field_u);
              if (param0 < -72) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            var3 = (uj) (Object) var2.a(0);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var3.b((byte) -127);
                    var3 = (uj) (Object) var2.b(106);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) (Object) runtimeException, "vk.NA(" + param0 + 41);
        }
    }

    final boolean d(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                vk.e((byte) 0);
                break L1;
              }
            }
            L2: {
              if (null == ((vk) this).h(1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "vk.UA(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                if (null == ((vk) this).field_o) {
                  break L1;
                } else {
                  ((vk) this).field_o.a(param1, true, 71, param3, (uj) this);
                  break L1;
                }
              }
            }
            var5 = new ba(((vk) this).field_u);
            var6 = (uj) (Object) var5.a(false);
            if (param2 == 49) {
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var6) {
                      break L4;
                    } else {
                      var6.a(param0, ((vk) this).field_s + param1, (byte) 49, param3 + ((vk) this).field_j);
                      var6 = (uj) (Object) var5.a((byte) -34);
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) (Object) runtimeException, "vk.MA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        ia var1_ref = null;
        int var2 = 0;
        int[] var3 = null;
        hb var3_ref = null;
        rj var3_ref2 = null;
        int[] var4 = null;
        rj var4_ref = null;
        ia var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = se.field_p;
                var2 = var1_ref.j(7909);
                if (var2 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      L4: {
                        if (2 == var2) {
                          break L4;
                        } else {
                          hc.a((Throwable) null, "A1: " + oe.a(87), (byte) 72);
                          ec.a((byte) 27);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3_ref2 = (rj) (Object) sd.field_d.c(-3905);
                      if (var3_ref2 != null) {
                        var3_ref2.field_g = wa.a((byte) -109);
                        var3_ref2.field_k = var3_ref2.field_g[0];
                        var3_ref2.field_n = true;
                        var3_ref2.b(4);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        ec.a((byte) 27);
                        return;
                      }
                    }
                  }
                  var3_ref = (hb) (Object) hi.field_f.c(-3905);
                  if (var3_ref == null) {
                    ec.a((byte) 27);
                    return;
                  } else {
                    var3_ref.b(4);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var3 = wa.a((byte) -77);
              var4 = var3;
              var5 = var1_ref;
              var6 = ((rb) (Object) var5).j(7909);
              var7 = 0;
              L5: while (true) {
                L6: {
                  if (var7 >= var6) {
                    break L6;
                  } else {
                    var4[var7] = ((rb) (Object) var5).f((byte) -125);
                    var7++;
                    if (var8 != 0) {
                      break L1;
                    } else {
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var4_ref = (rj) (Object) sd.field_d.c(-3905);
                if (var4_ref != null) {
                  var4_ref.field_n = true;
                  var4_ref.field_k = var3[0];
                  var4_ref.field_g = var3;
                  var4_ref.b(4);
                  break L1;
                } else {
                  ec.a((byte) 27);
                  return;
                }
              }
            }
            L7: {
              if (param0 < -25) {
                break L7;
              } else {
                hl discarded$1 = vk.a((String) null, -7, (String) null, (ue) null);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "vk.SB(" + param0 + 41);
        }
    }

    final static hl a(String param0, int param1, String param2, ue param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hl stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param3.a(param0, false);
              var5 = param3.a(param2, true, var4_int);
              if (param1 > 9) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            stackOut_3_0 = di.a(130, var5, param3, var4_int);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("vk.EB(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        ba var5 = null;
        RuntimeException var5_ref = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var5 = new ba(((vk) this).field_u);
              if (param0 == -36) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            var6 = (uj) (Object) var5.a(param0 + 36);
            L2: while (true) {
              if (null == var6) {
                break L0;
              } else {
                StringBuilder discarded$93 = param2.append(10);
                var7 = 0;
                L3: while (true) {
                  if (~param3 > ~var7) {
                    StringBuilder discarded$94 = var6.a(param1, param2, (byte) 39, 1 + param3);
                    var6 = (uj) (Object) var5.b(param0 + 149);
                    continue L2;
                  } else {
                    StringBuilder discarded$95 = param2.append(32);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("vk.WB(").append(param0).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0, uj param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        uj var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var3 = new ba(((vk) this).field_u);
            var4 = (uj) (Object) var3.a(param0);
            L1: while (true) {
              if (var4 == null) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (!var4.a(0, param1)) {
                  var4 = (uj) (Object) var3.b(95);
                  continue L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("vk.PA(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new ba(((vk) this).field_u);
              if (param0 == 27807) {
                break L1;
              } else {
                StringBuilder discarded$2 = ((vk) this).a((Hashtable) null, (StringBuilder) null, (byte) -115, -49);
                break L1;
              }
            }
            var3 = (uj) (Object) var2.a(0);
            L2: while (true) {
              if (null == var3) {
                break L0;
              } else {
                var3.d((byte) -30);
                var3 = (uj) (Object) var2.b(95);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) (Object) runtimeException, "vk.TB(" + param0 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            var8 = new ba(((vk) this).field_u);
            var9 = (uj) (Object) var8.a(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.a((byte) -110);
                    stackIn_17_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.d(true)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, param2, param3, param4, param5, -81)) {
                              break L4;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_14_0 = stackOut_13_0;
                              return stackIn_14_0 != 0;
                            }
                          }
                        }
                        var9 = (uj) (Object) var8.b(param6 ^ -46);
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = param6;
                stackIn_17_0 = stackOut_16_0;
                break L2;
              }
              L5: {
                if (stackIn_17_0 == -81) {
                  break L5;
                } else {
                  field_w = null;
                  break L5;
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8_ref;
            stackOut_22_1 = new StringBuilder().append("vk.AB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((vk) this).a(param0, 0, param1, param3)) {
                ((vk) this).a(param0, param1, param3, 19103);
                this.a((byte) -36, param0, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 39) {
                break L2;
              } else {
                this.g(89);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("vk.SA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_8_0;
    }

    final static void b(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == 32) {
                    break L3;
                  } else {
                    field_w = null;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("vk.AC(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sk a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sk stackIn_3_0 = null;
        sk stackIn_6_0 = null;
        sk stackIn_12_0 = null;
        int stackIn_22_0 = 0;
        sk stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        sk stackIn_53_0 = null;
        sk stackIn_61_0 = null;
        Object stackIn_65_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        sk stackOut_29_0 = null;
        Object stackOut_33_0 = null;
        sk stackOut_11_0 = null;
        sk stackOut_52_0 = null;
        sk stackOut_60_0 = null;
        Object stackOut_64_0 = null;
        Object stackOut_36_0 = null;
        sk stackOut_5_0 = null;
        sk stackOut_2_0 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param1.length();
            if (0 != var2_int) {
              if (var2_int <= 64) {
                if (34 == param1.charAt(0)) {
                  if (34 == param1.charAt(-1 + var2_int)) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      L2: {
                        if (-1 + var2_int <= var4) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = param1.charAt(var4);
                              if (92 == var5) {
                                L5: {
                                  if (var3 != 0) {
                                    stackOut_21_0 = 0;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L5;
                                  } else {
                                    stackOut_19_0 = 1;
                                    stackIn_22_0 = stackOut_19_0;
                                    break L5;
                                  }
                                }
                                var3 = stackIn_22_0;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (var5 != 34) {
                                break L6;
                              } else {
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  stackOut_29_0 = ra.field_t;
                                  stackIn_30_0 = stackOut_29_0;
                                  return stackIn_30_0;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      return (sk) (Object) stackIn_34_0;
                    }
                  } else {
                    stackOut_11_0 = ra.field_t;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  var3 = 0;
                  if (param0 == 63) {
                    var4 = 0;
                    L7: while (true) {
                      L8: {
                        if (var2_int <= var4) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var5 = param1.charAt(var4);
                              if (var5 != 46) {
                                break L10;
                              } else {
                                L11: {
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    if (-1 + var2_int == var4) {
                                      break L11;
                                    } else {
                                      if (var3 != 0) {
                                        break L11;
                                      } else {
                                        var3 = 1;
                                        if (var6 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_52_0 = ra.field_t;
                                stackIn_53_0 = stackOut_52_0;
                                return stackIn_53_0;
                              }
                            }
                            if (-1 == oj.field_k.indexOf(var5)) {
                              stackOut_60_0 = ra.field_t;
                              stackIn_61_0 = stackOut_60_0;
                              return stackIn_61_0;
                            } else {
                              var3 = 0;
                              break L9;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackOut_64_0 = null;
                      stackIn_65_0 = stackOut_64_0;
                      break L0;
                    }
                  } else {
                    stackOut_36_0 = null;
                    stackIn_37_0 = stackOut_36_0;
                    return (sk) (Object) stackIn_37_0;
                  }
                }
              } else {
                stackOut_5_0 = ai.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = qb.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var2;
            stackOut_66_1 = new StringBuilder().append("vk.UB(").append(param0).append(44);
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L12;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L12;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 41);
        }
        return (sk) (Object) stackIn_65_0;
    }

    final static void e(int param0) {
        try {
            fd.a(4, 0);
            if (param0 >= -18) {
                vk.b((java.applet.Applet) null, 53);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "vk.CB(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, (byte) 118, param3, param4);
              if (param2 >= 115) {
                break L1;
              } else {
                ((vk) this).field_u = null;
                break L1;
              }
            }
            this.g(27807);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var6, "vk.DB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(byte param0, uj param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        uj var4 = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_20_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (((vk) this).field_u.a(true)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param0 == -103) {
                  break L1;
                } else {
                  field_x = null;
                  break L1;
                }
              }
              var3 = new ba(((vk) this).field_u);
              var4 = (uj) (Object) var3.a(param0 ^ -103);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var4) {
                      break L4;
                    } else {
                      stackOut_11_0 = var4.d(true);
                      stackIn_30_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_12_0) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var5 = new ba(((vk) this).field_u);
                          rf discarded$6 = var5.a((rf) (Object) var4, param0 + 103);
                          var6 = (uj) (Object) var5.b(95);
                          L7: while (true) {
                            if (null == var6) {
                              break L5;
                            } else {
                              stackOut_20_0 = var6.a(0, param1);
                              stackIn_30_0 = stackOut_20_0 ? 1 : 0;
                              stackIn_21_0 = stackOut_20_0;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (stackIn_21_0) {
                                  stackOut_25_0 = 1;
                                  stackIn_26_0 = stackOut_25_0;
                                  return stackIn_26_0 != 0;
                                } else {
                                  var6 = (uj) (Object) var5.b(101);
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (uj) (Object) var3.b(102);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3_ref;
            stackOut_31_1 = new StringBuilder().append("vk.VB(").append(param0).append(44);
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_30_0 != 0;
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (param0 > 27) {
              super.a(120, param1, param2, param3);
              var5 = new ba(((vk) this).field_u);
              var6 = (uj) (Object) var5.a(0);
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.a((byte) -125)) {
                      break L2;
                    } else {
                      var6.a(119, param1 + ((vk) this).field_s, param2, ((vk) this).field_j + param3);
                      var6 = (uj) (Object) var5.b(69);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("vk.U(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_t = null;
        field_w = null;
        if (param0 != 73) {
            return;
        }
        try {
            field_v = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "vk.BB(" + param0 + 41);
        }
    }

    final String d(int param0) {
        ba var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var2 = new ba(((vk) this).field_u);
              var3 = (uj) (Object) var2.a(0);
              if (param0 == 12606) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var4 = var3.d(12606);
                    stackOut_5_0 = null;
                    stackIn_15_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 != (Object) (Object) var4) {
                        stackOut_11_0 = (String) var4;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      } else {
                        var3 = (uj) (Object) var2.b(param0 + -12496);
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "vk.T(" + param0 + 41);
        }
        return (String) (Object) stackIn_15_0;
    }

    uj h(int param0) {
        ba var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        uj stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        uj stackOut_5_0 = null;
        try {
          L0: {
            var2 = new ba(((vk) this).field_u);
            var3 = (uj) (Object) var2.a(param0 ^ param0);
            L1: while (true) {
              if (null == var3) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (!var3.d(true)) {
                  var3 = (uj) (Object) var2.b(114);
                  continue L1;
                } else {
                  stackOut_5_0 = (uj) var3;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "vk.IA(" + param0 + 41);
        }
        return (uj) (Object) stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        ba var7 = null;
        uj var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_8_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var7 = new ba(((vk) this).field_u);
            var8 = (uj) (Object) var7.a(param4 ^ -22);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var8) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.a((byte) 24);
                    stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a(param0, param1 + ((vk) this).field_j, param2 + ((vk) this).field_s, param3, (byte) -22, param5);
                        var8 = (uj) (Object) var7.b(param4 + 142);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_8_0 = param4;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              L4: {
                if (stackIn_9_0 == -22) {
                  break L4;
                } else {
                  field_v = null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("vk.OA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean b(int param0, uj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ba var4 = null;
        uj var5 = null;
        ba var6 = null;
        uj var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var3_int = 96 / ((param0 - -61) / 35);
            if (((vk) this).field_u.a(true)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var4 = new ba(((vk) this).field_u);
              var5 = (uj) (Object) var4.a(false);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      stackOut_8_0 = var5.d(true);
                      stackIn_24_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_9_0) {
                            break L4;
                          } else {
                            var6 = new ba(((vk) this).field_u);
                            rf discarded$5 = var6.a(0, (rf) (Object) var5);
                            var7 = (uj) (Object) var6.a((byte) -34);
                            L5: while (true) {
                              if (var7 == null) {
                                break L4;
                              } else {
                                stackOut_14_0 = var7.a(0, param1);
                                stackIn_24_0 = stackOut_14_0 ? 1 : 0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var8 != 0) {
                                  break L2;
                                } else {
                                  if (stackIn_15_0) {
                                    stackOut_19_0 = 1;
                                    stackIn_20_0 = stackOut_19_0;
                                    return stackIn_20_0 != 0;
                                  } else {
                                    var7 = (uj) (Object) var6.a((byte) -34);
                                    if (var8 == 0) {
                                      continue L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var5 = (uj) (Object) var4.a((byte) -34);
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("vk.FB(").append(param0).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    final int c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ba var3 = null;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var2_int = 0;
            var3 = new ba(((vk) this).field_u);
            var4 = (uj) (Object) var3.a(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var5 = var4.c(false);
                    stackOut_3_0 = ~var2_int;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= ~var5) {
                          break L4;
                        } else {
                          var2_int = var5;
                          break L4;
                        }
                      }
                      var4 = (uj) (Object) var3.b(80);
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = param0;
                stackIn_10_0 = stackOut_9_0 ? 1 : 0;
                break L2;
              }
              L5: {
                if (stackIn_10_0 == 0) {
                  break L5;
                } else {
                  field_v = null;
                  break L5;
                }
              }
              stackOut_13_0 = var2_int;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "vk.HB(" + param0 + 41);
        }
        return stackIn_14_0;
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var8 = new ba(((vk) this).field_u);
              if (param4 == -11) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var9 = (uj) (Object) var8.a(param4 ^ -11);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var9) {
                    break L4;
                  } else {
                    stackOut_6_0 = var9.a((byte) 120);
                    stackIn_17_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2 - -((vk) this).field_s, param3 - -((vk) this).field_j, (byte) -11, param5, param6)) {
                          var9 = (uj) (Object) var8.b(68);
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8_ref;
            stackOut_18_1 = new StringBuilder().append("vk.G(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        ba var5 = null;
        RuntimeException var5_ref = null;
        uj var6_ref_uj = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_28_0 = false;
        boolean stackOut_26_0 = false;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5 = new ba(((vk) this).field_u);
              if (param2 == -90) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            var6_ref_uj = (uj) (Object) var5.a(param2 + 90);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var6_ref_uj) {
                    break L4;
                  } else {
                    stackOut_6_0 = var6_ref_uj.a((byte) 64);
                    stackIn_22_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var6_ref_uj.d(true)) {
                            break L5;
                          } else {
                            if (var6_ref_uj.a(param0, param1, (byte) -90, param3)) {
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6_ref_uj = (uj) (Object) var5.b(97);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = param3;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              }
              var6 = stackIn_22_0;
              if (var6 == 80) {
                L6: {
                  if (!wc.field_c[81]) {
                    stackOut_28_0 = ((vk) this).a((byte) -103, param0);
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_26_0 = ((vk) this).b(-110, param0);
                    stackIn_29_0 = stackOut_26_0;
                    break L6;
                  }
                }
                return stackIn_29_0;
              } else {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5_ref;
            stackOut_32_1 = new StringBuilder().append("vk.EA(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_31_0 != 0;
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        ia var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ld var6 = null;
        String var6_ref = null;
        String var7 = null;
        ld var7_ref = null;
        String var8 = null;
        ld var8_ref = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var1_ref = se.field_p;
            var3 = 82 / ((-41 - param0) / 54);
            var2 = var1_ref.j(7909);
            if (var2 == 0) {
              L1: {
                if (td.field_o != null) {
                  break L1;
                } else {
                  td.field_o = new ai(128);
                  hi.field_b = 0;
                  break L1;
                }
              }
              L2: {
                if (1 != var1_ref.j(7909)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var4_int = stackIn_11_0;
                var5_ref_String = var1_ref.a(-120);
                if (var4_int != 0) {
                  String discarded$3 = var1_ref.a(-71);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var6 = wk.a(var5_ref_String, 92);
                var7 = var1_ref.a(-79);
                var8 = ni.a(126, (CharSequence) (Object) var5_ref_String);
                if (var8 != null) {
                  break L4;
                } else {
                  var8 = var5_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var6 == null) {
                  var6 = wk.a(var7, 89);
                  if (var6 == null) {
                    break L5;
                  } else {
                    td.field_o.a(2, (long)var8.hashCode(), (uh) (Object) var6);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (null == var6) {
                  var6 = new ld();
                  td.field_o.a(2, (long)var8.hashCode(), (uh) (Object) var6);
                  int fieldTemp$4 = hi.field_b;
                  hi.field_b = hi.field_b + 1;
                  var6.field_hb = fieldTemp$4;
                  ma.field_c.b(122, (rf) (Object) var6);
                  break L6;
                } else {
                  break L6;
                }
              }
              var6.field_kb = var5_ref_String;
              return;
            } else {
              if (var2 != 1) {
                if (2 == var2) {
                  L7: {
                    if (1 == bd.field_f) {
                      bd.field_f = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                } else {
                  if (3 == var2) {
                    L8: {
                      if (bd.field_f == 2) {
                        bd.field_f = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      bd.field_f = 1;
                      var4 = var1_ref.a(-72);
                      wg.field_a = var4.intern();
                      var5 = var1_ref.j(7909);
                      ej.b(true, var5);
                      return;
                    } else {
                      hc.a((Throwable) null, "F1: " + oe.a(73), (byte) 106);
                      ec.a((byte) 27);
                      break L0;
                    }
                  }
                }
              } else {
                L9: {
                  if (m.field_d == null) {
                    m.field_d = new ai(128);
                    ec.field_b = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var4 = var1_ref.a(-42);
                  if (!var4.equals((Object) (Object) "")) {
                    break L10;
                  } else {
                    var4 = null;
                    break L10;
                  }
                }
                L11: {
                  var5_ref_String = var1_ref.a(-39);
                  var6_ref = var1_ref.a(-107);
                  var7_ref = hg.a(120, var5_ref_String);
                  if (var7_ref != null) {
                    break L11;
                  } else {
                    var7_ref = hg.a(120, var6_ref);
                    if (null != var7_ref) {
                      m.field_d.a(2, (long)ni.a(107, (CharSequence) (Object) var5_ref_String).hashCode(), (uh) (Object) var7_ref);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (null == var7_ref) {
                    var7_ref = new ld();
                    m.field_d.a(2, (long)ni.a(113, (CharSequence) (Object) var5_ref_String).hashCode(), (uh) (Object) var7_ref);
                    int fieldTemp$5 = ec.field_b;
                    ec.field_b = ec.field_b + 1;
                    var7_ref.field_hb = fieldTemp$5;
                    ti.field_a.b(121, (rf) (Object) var7_ref);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null == var4) {
                    break L13;
                  } else {
                    var4 = var4.intern();
                    break L13;
                  }
                }
                var7_ref.field_gb = var4;
                var7_ref.field_kb = var5_ref_String;
                var7_ref.b(4);
                var8_ref = (ld) (Object) ti.field_a.c(-3905);
                L14: while (true) {
                  L15: {
                    if (var8_ref == null) {
                      break L15;
                    } else {
                      if (!ff.a(80, var7_ref, var8_ref)) {
                        break L15;
                      } else {
                        var8_ref = (ld) (Object) ti.field_a.a(-16913);
                        if (var9 == 0) {
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if (null != var8_ref) {
                        break L17;
                      } else {
                        ti.field_a.b(66, (rf) (Object) var7_ref);
                        if (var9 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    fe.a((rf) (Object) var8_ref, (rf) (Object) var7_ref, false);
                    break L16;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "vk.GB(" + param0 + 41);
        }
    }

    final void a(boolean param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            ((vk) this).field_u.b(91, (rf) (Object) param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vk.WA(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    vk(int param0, int param1, int param2, int param3, de param4) {
        super(param0, param1, param2, param3, param4, (qg) null);
        ((vk) this).field_u = new rk();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Unfortunately we are unable to create an account for you at this time.";
        field_t = "OVER <%0>";
        field_w = "LIVES:";
    }
}
