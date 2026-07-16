/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wj extends fd implements jp {
    static int[] field_x;
    tf field_y;
    static String[] field_w;
    static boolean field_z;
    static int field_A;
    static vn[][] field_v;

    fd a(boolean param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        int var4 = 0;
        fd stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(((wj) this).field_y);
              if (!param0) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var3 = (fd) (Object) var2.a((byte) 77);
            L2: while (true) {
              L3: {
                if (null == var3) {
                  break L3;
                } else {
                  if (!var3.b(42)) {
                    var3 = (fd) (Object) var2.a(0);
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    stackOut_7_0 = (fd) var3;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "wj.Q(" + param0 + 41);
        }
        return (fd) (Object) stackIn_11_0;
    }

    public static void i(int param0) {
        if (param0 != -336184828) {
            return;
        }
        try {
            field_v = null;
            field_w = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wj.RA(" + param0 + 41);
        }
    }

    wj(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
        ((wj) this).field_y = new tf();
    }

    final boolean b(fd param0, byte param1) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        fd var4 = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
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
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 122) {
                break L1;
              } else {
                boolean discarded$7 = ((wj) this).b(-52);
                break L1;
              }
            }
            if (((wj) this).field_y.a((byte) -4)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              var3 = new nw(((wj) this).field_y);
              var4 = (fd) (Object) var3.a((byte) 73);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      stackOut_11_0 = var4.b(24);
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
                          var5 = new nw(((wj) this).field_y);
                          gn discarded$8 = var5.a(395869153, (gn) (Object) var4);
                          var6 = (fd) (Object) var5.a(0);
                          L7: while (true) {
                            if (var6 == null) {
                              break L5;
                            } else {
                              stackOut_20_0 = var6.a(param0, 0);
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
                                  var6 = (fd) (Object) var5.a(0);
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
                        var4 = (fd) (Object) var3.a(0);
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
            stackOut_31_1 = new StringBuilder().append("wj.O(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
        }
        return stackIn_30_0 != 0;
    }

    final boolean a(fd param0, int param1) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        fd var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == 0) {
              var3 = new nw(((wj) this).field_y);
              var4 = (fd) (Object) var3.a((byte) -97);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.a(param0, 0);
                      stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          var4 = (fd) (Object) var3.a(0);
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("wj.HA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final void a(int param0, fd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((wj) this).field_y.a((gn) (Object) param1, 3);
              if (param0 < -15) {
                break L1;
              } else {
                ((wj) this).field_y = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wj.N(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        nw var8 = null;
        RuntimeException var8_ref = null;
        fd var9 = null;
        int var10 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var8 = new nw(((wj) this).field_y);
              var9 = (fd) (Object) var8.a((byte) 111);
              if (param0) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var9.e((byte) -113);
                    stackIn_16_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1 - -((wj) this).field_g, param2, param3, param4, param5 - -((wj) this).field_t, param6)) {
                          var9 = (fd) (Object) var8.a(0);
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8_ref;
            stackOut_17_1 = new StringBuilder().append("wj.EA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        fd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(((wj) this).field_y);
              if (param0 == 84) {
                break L1;
              } else {
                boolean discarded$2 = ((wj) this).a((fd) null, -46);
                break L1;
              }
            }
            var3 = (fd) (Object) var2.a((byte) -99);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var3.g(param0 ^ 0);
                    var3 = (fd) (Object) var2.a(0);
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
          throw nb.a((Throwable) (Object) runtimeException, "wj.FA(" + param0 + 41);
        }
    }

    final int f(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nw var3 = null;
        fd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = new nw(((wj) this).field_y);
            var4 = (fd) (Object) var3.a((byte) -80);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var5 = var4.f((byte) 118);
                    stackOut_3_0 = var2_int;
                    stackOut_3_1 = var5;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 < stackIn_4_1) {
                          var2_int = var5;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4 = (fd) (Object) var3.a(0);
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = param0;
                stackOut_10_1 = 118;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              L5: {
                if (stackIn_11_0 == stackIn_11_1) {
                  break L5;
                } else {
                  field_w = null;
                  break L5;
                }
              }
              stackOut_14_0 = var2_int;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wj.NA(" + param0 + 41);
        }
        return stackIn_15_0;
    }

    final boolean a(fd param0, byte param1) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        fd var4 = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (((wj) this).field_y.a((byte) -106)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var3 = new nw(((wj) this).field_y);
                var4 = (fd) (Object) var3.b(0);
                if (param1 == -100) {
                  break L1;
                } else {
                  ((wj) this).a(-56, (fd) null);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var4) {
                      break L4;
                    } else {
                      stackOut_10_0 = var4.b(82);
                      stackIn_29_0 = stackOut_10_0 ? 1 : 0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_11_0) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var5 = new nw(((wj) this).field_y);
                          gn discarded$6 = var5.a((byte) 104, (gn) (Object) var4);
                          var6 = (fd) (Object) var5.b((byte) 46);
                          L7: while (true) {
                            if (var6 == null) {
                              break L5;
                            } else {
                              stackOut_19_0 = var6.a(param0, 0);
                              stackIn_29_0 = stackOut_19_0 ? 1 : 0;
                              stackIn_20_0 = stackOut_19_0;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (stackIn_20_0) {
                                  stackOut_24_0 = 1;
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0 != 0;
                                } else {
                                  var6 = (fd) (Object) var5.b((byte) 46);
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
                        var4 = (fd) (Object) var3.b((byte) 46);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
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
            stackOut_30_0 = (RuntimeException) var3_ref;
            stackOut_30_1 = new StringBuilder().append("wj.U(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 41);
        }
        return stackIn_29_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        nw var5 = null;
        RuntimeException var5_ref = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == 65) {
              L1: {
                if (-1 != (param0 ^ -1)) {
                  break L1;
                } else {
                  if (((wj) this).field_r == null) {
                    break L1;
                  } else {
                    ((wj) this).field_r.a(-103, true, param3, (fd) this, param2);
                    break L1;
                  }
                }
              }
              var5 = new nw(((wj) this).field_y);
              var6 = (fd) (Object) var5.b(0);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      var6.a(param0, 65, ((wj) this).field_t + param2, ((wj) this).field_g + param3);
                      var6 = (fd) (Object) var5.b((byte) 46);
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
          var5_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5_ref, "wj.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var6_int = -127 % ((param5 - 63) / 51);
              pt.a(160 + param3, -22914, param3, param4 - -21, param4);
              on.i(param3, param4, 160, 42, 10, 65793);
              ta.e(123);
              if (param2 != null) {
                un.field_d.d(param2, 80 + param3, 17 + param4, 16777215, -1);
                break L1;
              } else {
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((param1 ^ -1) >= (var7 ^ -1)) {
                    break L4;
                  } else {
                    var8 = 65793;
                    var9 = 128;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if ((param0 ^ -1) == (var7 ^ -1)) {
                          var8 = 16777215;
                          var9 = 50;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      on.a(param3, param4 - -((var7 - -1) * 23), 160, 21, var8, var9);
                      var7++;
                      if (var10 == 0) {
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
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("wj.TA(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, kk param1, int param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_41_0 = 0;
        byte stackOut_50_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var19 = Kickabout.field_G;
        try {
          L0: {
            var5_int = cm.a(true, 3 * (-param2 + param3));
            var6 = param2 * 3;
            var7 = -10 + var5_int;
            if (param0 == -336184828) {
              L1: {
                wa.b((byte) -105);
                if ((param1.field_u ^ -1) >= -1) {
                  break L1;
                } else {
                  if (param1.field_G == null) {
                    break L1;
                  } else {
                    qr.a(82);
                    break L1;
                  }
                }
              }
              sp.field_Ob = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var8 ^ -1) <= (param1.field_g ^ -1)) {
                      break L4;
                    } else {
                      var9 = param1.field_n[var8];
                      var10 = param1.field_z[var8];
                      var11 = param1.field_T[var8];
                      stackOut_11_0 = param4;
                      stackIn_51_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!stackIn_12_0) {
                              break L6;
                            } else {
                              var12 = fb.field_M[var9];
                              var13 = fk.field_k[var9];
                              var14 = -var12 + fb.field_M[var10];
                              var15 = fb.field_M[var11] - var12;
                              var16 = fk.field_k[var10] + -var13;
                              var17 = fk.field_k[var11] + -var13;
                              if ((var17 * var14 + -(var15 * var16) ^ -1) > -1) {
                                break L6;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12 = ld.field_e[var9];
                          if (var12 == -2147483648) {
                            break L5;
                          } else {
                            L7: {
                              var13 = ld.field_e[var10];
                              if (2147483647 != (var13 ^ -1)) {
                                break L7;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var14 = ld.field_e[var11];
                              if (-2147483648 != var14) {
                                break L8;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              var15 = var14 + var12 - (-var13 + var6);
                              stackOut_28_0 = -1;
                              stackOut_28_1 = qe.field_b.length;
                              stackIn_31_0 = stackOut_28_0;
                              stackIn_31_1 = stackOut_28_1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if ((var7 ^ -1) > -1) {
                                stackOut_31_0 = stackIn_31_0;
                                stackOut_31_1 = stackIn_31_1;
                                stackOut_31_2 = var15 << -var7;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                stackIn_32_2 = stackOut_31_2;
                                break L9;
                              } else {
                                stackOut_29_0 = stackIn_29_0;
                                stackOut_29_1 = stackIn_29_1;
                                stackOut_29_2 = var15 >> var7;
                                stackIn_32_0 = stackOut_29_0;
                                stackIn_32_1 = stackOut_29_1;
                                stackIn_32_2 = stackOut_29_2;
                                break L9;
                              }
                            }
                            var16 = stackIn_32_0 + (stackIn_32_1 - stackIn_32_2);
                            var17 = qe.field_b[var16];
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var17 >> -988548572 == 0) {
                                    break L12;
                                  } else {
                                    var16--;
                                    stackOut_34_0 = var16;
                                    stackIn_42_0 = stackOut_34_0;
                                    stackIn_35_0 = stackOut_34_0;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_35_0 < 0) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var17 = qe.field_b[var16];
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_41_0 = (var16 << -336184828) + var17;
                                stackIn_42_0 = stackOut_41_0;
                                break L11;
                              }
                              L14: {
                                var18 = stackIn_42_0;
                                nb.field_e[var18] = var8;
                                qe.field_b[var16] = 1 + var17;
                                if (-1 <= (param1.field_u ^ -1)) {
                                  break L14;
                                } else {
                                  if (param1.field_G == null) {
                                    break L14;
                                  } else {
                                    vu.field_zb[param1.field_G[var8]] = vu.field_zb[param1.field_G[var8]] + 1;
                                    break L14;
                                  }
                                }
                              }
                              sp.field_Ob = sp.field_Ob + 1;
                              break L5;
                            }
                          }
                        }
                        var8++;
                        if (var19 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_50_0 = param1.field_u;
                  stackIn_51_0 = stackOut_50_0;
                  break L3;
                }
                L15: {
                  L16: {
                    if (stackIn_51_0 <= 0) {
                      break L16;
                    } else {
                      if (param1.field_G == null) {
                        break L16;
                      } else {
                        var8 = 0;
                        var9 = 0;
                        L17: while (true) {
                          if ((var9 ^ -1) <= (vu.field_zb.length ^ -1)) {
                            break L16;
                          } else {
                            var10 = vu.field_zb[var9];
                            vu.field_zb[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L15;
                            } else {
                              if (var19 == 0) {
                                continue L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L15;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("wj.UA(").append(param0).append(44);
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L18;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L18;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 10) {
                break L1;
              } else {
                ((wj) this).field_y = null;
                break L1;
              }
            }
            L2: {
              if (null == ((wj) this).a(false)) {
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
          throw nb.a((Throwable) (Object) var2, "wj.KA(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param1.length();
            if (-1 == (var5 ^ -1)) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L1: {
                var7 = var4_int;
                var8 = var6 - var5;
                if (var8 == 0) {
                  break L1;
                } else {
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        var9_int = param3.indexOf(param0, var9_int);
                        if (var9_int >= 0) {
                          break L4;
                        } else {
                          if (var12 != 0) {
                            break L3;
                          } else {
                            if (var12 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      break L3;
                    }
                    if (var12 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      var11 = param3.indexOf(param0, var10);
                      if (0 <= var11) {
                        break L8;
                      } else {
                        if (var12 != 0) {
                          break L7;
                        } else {
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    StringBuilder discarded$3 = var9.append(param3.substring(var10, var11));
                    StringBuilder discarded$4 = var9.append(param1);
                    var10 = var5 + var11;
                    break L7;
                  }
                  if (var12 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
                L9: {
                  StringBuilder discarded$5 = var9.append(param3.substring(var10));
                  if (param2) {
                    break L9;
                  } else {
                    field_A = 15;
                    break L9;
                  }
                }
                stackOut_25_0 = var9.toString();
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("wj.S(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
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
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44).append(param2).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L12;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_26_0;
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        nw var7 = null;
        RuntimeException var7_ref = null;
        fd var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param4 == -1) {
                break L1;
              } else {
                wj.a(104, (kk) null, 40, 112, false);
                break L1;
              }
            }
            var7 = new nw(((wj) this).field_y);
            var8 = (fd) (Object) var7.a((byte) -93);
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.e((byte) -113)) {
                    break L3;
                  } else {
                    var8.a(param0 + ((wj) this).field_g, param1, param2, param3, -1, ((wj) this).field_t + param5);
                    var8 = (fd) (Object) var7.a(0);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("wj.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var5 = new nw(((wj) this).field_y);
            if (param3 == 24745) {
              var6 = (fd) (Object) var5.a((byte) 63);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var6) {
                      break L3;
                    } else {
                      StringBuilder discarded$9 = param0.append(10);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        var7 = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if ((param2 ^ -1) > (var7 ^ -1)) {
                                break L6;
                              } else {
                                StringBuilder discarded$10 = param0.append(32);
                                var7++;
                                if (var8 != 0) {
                                  break L5;
                                } else {
                                  if (var8 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            StringBuilder discarded$11 = var6.a(param3 ^ 9586, 1 + param2, param1, param0);
                            var6 = (fd) (Object) var5.a(0);
                            break L5;
                          }
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("wj.SA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        try {
            super.a(param0, param1, param2, param3, param4);
            this.j(5);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wj.W(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    String f(int param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_2_0 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2 = new nw(((wj) this).field_y);
            var3 = (fd) (Object) var2.a((byte) -56);
            if (param0 == -1) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var3) {
                      break L3;
                    } else {
                      var4 = var3.f(-1);
                      stackOut_5_0 = null;
                      stackIn_15_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 != (Object) (Object) var4) {
                          stackOut_11_0 = (String) var4;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
                        } else {
                          var3 = (fd) (Object) var2.a(0);
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_14_0 = null;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "wj.MA(" + param0 + 41);
        }
        return (String) (Object) stackIn_15_0;
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
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
              if (param0 == 17883) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              if (((wj) this).a(1, param3, param2, param1)) {
                ((wj) this).b(param1, param3, param2, param0 + -36451);
                this.a(param3, param2, param1, 24745);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param3;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("wj.GA(").append(param0).append(44).append(param1).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_8_0;
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        nw var5 = null;
        RuntimeException var5_ref = null;
        fd var6_ref_fd = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_26_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                field_A = 114;
                break L1;
              }
            }
            var5 = new nw(((wj) this).field_y);
            var6_ref_fd = (fd) (Object) var5.a((byte) -108);
            L2: while (true) {
              L3: {
                L4: {
                  if (var6_ref_fd == null) {
                    break L4;
                  } else {
                    stackOut_6_0 = var6_ref_fd.e((byte) -113);
                    stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var6_ref_fd.b(52)) {
                            break L5;
                          } else {
                            if (!var6_ref_fd.a(param0, (byte) -76, param2, param3)) {
                              break L5;
                            } else {
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            }
                          }
                        }
                        var6_ref_fd = (fd) (Object) var5.a(0);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = param3;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              }
              var6 = stackIn_20_0;
              if (-81 == (var6 ^ -1)) {
                L6: {
                  if (!ne.field_G[81]) {
                    stackOut_26_0 = ((wj) this).b(param2, (byte) 123);
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_24_0 = ((wj) this).a(param2, (byte) -100);
                    stackIn_27_0 = stackOut_24_0;
                    break L6;
                  }
                }
                return stackIn_27_0;
              } else {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5_ref;
            stackOut_30_1 = new StringBuilder().append("wj.E(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 41);
        }
        return stackIn_29_0 != 0;
    }

    void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new nw(((wj) this).field_y);
            var6 = (fd) (Object) var5.a((byte) -34);
            L1: while (true) {
              L2: {
                if (null == var6) {
                  break L2;
                } else {
                  if (!var6.e((byte) -113)) {
                    break L2;
                  } else {
                    var6.a((byte) 12, param1, ((wj) this).field_t + param2, param3 + ((wj) this).field_g);
                    var6 = (fd) (Object) var5.a(0);
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("wj.P(").append(param0).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void j(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        fd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(((wj) this).field_y);
              if (param0 == 5) {
                break L1;
              } else {
                wj.i(-127);
                break L1;
              }
            }
            var3 = (fd) (Object) var2.a((byte) 106);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    var3.e(-1947);
                    var3 = (fd) (Object) var2.a(0);
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
          throw nb.a((Throwable) (Object) runtimeException, "wj.R(" + param0 + 41);
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        nw var8 = null;
        RuntimeException var8_ref = null;
        fd var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var8 = new nw(((wj) this).field_y);
            var9 = (fd) (Object) var8.a((byte) 54);
            var10 = -61 % ((63 - param6) / 56);
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.e((byte) -113);
                    stackIn_19_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.b(82)) {
                            break L4;
                          } else {
                            if (var9.a(param0, param1, param2, param3, param4, param5, -10)) {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9 = (fd) (Object) var8.a(0);
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8_ref;
            stackOut_20_1 = new StringBuilder().append("wj.BA(").append(param0).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = true;
        field_A = 0;
        field_v = new vn[5][5];
    }
}
