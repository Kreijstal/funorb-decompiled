/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class b extends ae implements tpa {
    static String field_v;
    vna field_u;

    final boolean a(ae param0, byte param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
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
        boolean stackOut_11_0 = false;
        boolean stackOut_20_0 = false;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((b) this).field_u.d((byte) 14)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var3 = new uja(((b) this).field_u);
                if (param1 == -9) {
                  break L1;
                } else {
                  boolean discarded$4 = ((b) this).b((ae) null, (byte) 90);
                  break L1;
                }
              }
              var4 = (ae) (Object) var3.a(true);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var4) {
                      break L4;
                    } else {
                      stackOut_11_0 = var4.b((byte) -34);
                      stackIn_29_0 = stackOut_11_0 ? 1 : 0;
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
                          var5 = new uja(((b) this).field_u);
                          vg discarded$5 = var5.a(0, (vg) (Object) var4);
                          var6 = (ae) (Object) var5.a(-1);
                          L7: while (true) {
                            if (null == var6) {
                              break L5;
                            } else {
                              stackOut_20_0 = var6.a(param0, false);
                              stackIn_29_0 = stackOut_20_0 ? 1 : 0;
                              stackIn_21_0 = stackOut_20_0;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (!stackIn_21_0) {
                                  var6 = (ae) (Object) var5.a(param1 ^ 8);
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  stackOut_24_0 = 1;
                                  stackIn_25_0 = stackOut_24_0;
                                  return stackIn_25_0 != 0;
                                }
                              }
                            }
                          }
                        }
                        var4 = (ae) (Object) var3.a(-1);
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
            stackOut_30_1 = new StringBuilder().append("b.VA(");
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
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_29_0 != 0;
    }

    void f(byte param0) {
        RuntimeException runtimeException = null;
        uja var2 = null;
        ae var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new uja(((b) this).field_u);
            var4 = -96 % ((param0 - -38) / 60);
            var3 = (ae) (Object) var2.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.f((byte) -115);
                    var3 = (ae) (Object) var2.a(-1);
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "b.K(" + param0 + ')');
        }
    }

    final boolean b(ae param0, byte param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((b) this).field_u.d((byte) 14)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param1 <= -45) {
                  break L1;
                } else {
                  ((b) this).a((byte) 112, (ae) null, 60, 11, -7, -44);
                  break L1;
                }
              }
              var3 = new uja(((b) this).field_u);
              var4 = (ae) (Object) var3.a((byte) 99);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var4) {
                      break L4;
                    } else {
                      stackOut_11_0 = var4.b((byte) -34);
                      stackIn_27_0 = stackOut_11_0 ? 1 : 0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (!stackIn_12_0) {
                            break L5;
                          } else {
                            var5 = new uja(((b) this).field_u);
                            vg discarded$6 = var5.a((vg) (Object) var4, (byte) -11);
                            var6 = (ae) (Object) var5.c(60);
                            L6: while (true) {
                              if (var6 == null) {
                                break L5;
                              } else {
                                stackOut_17_0 = var6.a(param0, false);
                                stackIn_27_0 = stackOut_17_0 ? 1 : 0;
                                stackIn_18_0 = stackOut_17_0;
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  if (stackIn_18_0) {
                                    stackOut_22_0 = 1;
                                    stackIn_23_0 = stackOut_22_0;
                                    return stackIn_23_0 != 0;
                                  } else {
                                    var6 = (ae) (Object) var5.c(33);
                                    if (var7 == 0) {
                                      continue L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (ae) (Object) var3.c(62);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3_ref;
            stackOut_28_1 = new StringBuilder().append("b.AB(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ')');
        }
        return stackIn_27_0 != 0;
    }

    public static void h(byte param0) {
        try {
            field_v = null;
            int var1_int = -18 / ((param0 - 38) / 48);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "b.WA(" + param0 + ')');
        }
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new byte[param0];
            lua.a(param3, param2, var4, param1, param0);
            stackOut_0_0 = (byte[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("b.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
        return stackIn_1_0;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (((b) this).a((byte) -115, param0, param1, param2)) {
                ((b) this).a(1, param2, param1, param0);
                this.b(param0, param1, param2, 23241);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                field_v = null;
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param2;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("b.R(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                break L1;
              } else {
                if (null == ((b) this).field_r) {
                  break L1;
                } else {
                  ((b) this).field_r.a((ae) this, param0, param2 + 16777215, param1, true);
                  break L1;
                }
              }
            }
            var5 = new uja(((b) this).field_u);
            if (param2 == 0) {
              var6 = (ae) (Object) var5.a((byte) 120);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var6) {
                      break L4;
                    } else {
                      var6.a(param0 - -((b) this).field_i, ((b) this).field_n + param1, 0, param3);
                      var6 = (ae) (Object) var5.c(param2 ^ 46);
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
          throw tba.a((Throwable) (Object) runtimeException, "b.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static lu a(String param0, int param1, String param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        hda stackIn_10_0 = null;
        wc stackIn_12_0 = null;
        tc stackIn_14_0 = null;
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
        wc stackOut_11_0 = null;
        hda stackOut_9_0 = null;
        tc stackOut_13_0 = null;
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
        try {
          L0: {
            L1: {
              if (param4 != (long)param1) {
                break L1;
              } else {
                if (param2 != null) {
                  stackOut_11_0 = new wc(param2, param0);
                  stackIn_12_0 = stackOut_11_0;
                  return (lu) (Object) stackIn_12_0;
                } else {
                  break L1;
                }
              }
            }
            if (param3) {
              stackOut_9_0 = new hda(param4, param0);
              stackIn_10_0 = stackOut_9_0;
              return (lu) (Object) stackIn_10_0;
            } else {
              stackOut_13_0 = new tc(param4, param0);
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("b.DB(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
        return (lu) (Object) stackIn_14_0;
    }

    String d(byte param0) {
        uja var2 = null;
        RuntimeException var2_ref = null;
        ae var3_ref_ae = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new uja(((b) this).field_u);
            var3_ref_ae = (ae) (Object) var2.a(true);
            L1: while (true) {
              L2: {
                if (var3_ref_ae == null) {
                  break L2;
                } else {
                  var4 = var3_ref_ae.d((byte) 127);
                  if (var4 != null) {
                    stackOut_6_0 = (String) var4;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    var3_ref_ae = (ae) (Object) var2.a(-1);
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var3 = 127 % ((param0 - -58) / 60);
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "b.B(" + param0 + ')');
        }
        return (String) (Object) stackIn_10_0;
    }

    final int a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        uja var3 = null;
        ae var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (!param0) {
                break L1;
              } else {
                ((b) this).a((ae) null, -99);
                break L1;
              }
            }
            var3 = new uja(((b) this).field_u);
            var4 = (ae) (Object) var3.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    var5 = var4.a(false);
                    stackOut_6_0 = ~var5;
                    stackIn_15_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0 < ~var2_int) {
                          var2_int = var5;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4 = (ae) (Object) var3.a(-1);
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_14_0 = var2_int;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "b.W(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        uja var8 = null;
        RuntimeException var8_ref = null;
        ae var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = new uja(((b) this).field_u);
            if (param0 > 70) {
              var9 = (ae) (Object) var8.a(true);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var9.l((byte) -114);
                      stackIn_17_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          if (!var9.a(121, param1 + ((b) this).field_i, ((b) this).field_n + param2, param3, param4, param5, param6)) {
                            var9 = (ae) (Object) var8.a(-1);
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L3;
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
            var8_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8_ref;
            stackOut_18_1 = new StringBuilder().append("b.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -34) {
              L1: {
                if (((b) this).g((byte) 52) == null) {
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
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "b.G(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ae g(byte param0) {
        uja var2 = null;
        RuntimeException var2_ref = null;
        ae var3 = null;
        int var4 = 0;
        ae stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_9_0 = null;
        Object stackOut_12_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = new uja(((b) this).field_u);
              if (param0 == 52) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var3 = (ae) (Object) var2.a(true);
            L2: while (true) {
              L3: {
                if (null == var3) {
                  break L3;
                } else {
                  if (var3.b((byte) -34)) {
                    stackOut_9_0 = (ae) var3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var3 = (ae) (Object) var2.a(-1);
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "b.FB(" + param0 + ')');
        }
        return (ae) (Object) stackIn_13_0;
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        uja var7 = null;
        ae var8 = null;
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
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new uja(((b) this).field_u);
            var8 = (ae) (Object) var7.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.l((byte) -107);
                    stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a((byte) 59, param1, param2, ((b) this).field_i + param3, param4 - -((b) this).field_n, param5);
                        var8 = (ae) (Object) var7.a(-1);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_8_0 = param0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              L4: {
                if (stackIn_9_0 == 59) {
                  break L4;
                } else {
                  ae discarded$3 = ((b) this).g((byte) 119);
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
            stackOut_13_1 = new StringBuilder().append("b.Q(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(ae param0, boolean param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        ae var4 = null;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = new uja(((b) this).field_u);
            if (!param1) {
              var4 = (ae) (Object) var3.a(true);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.a(param0, false);
                      stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          var4 = (ae) (Object) var3.a(-1);
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
            stackOut_15_1 = new StringBuilder().append("b.S(");
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
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = param0 >>> -184107711;
            var2_int = var2_int | var2_int >>> 1181399777;
            var2_int = var2_int | var2_int >>> 494055650;
            var2_int = var2_int | var2_int >>> 1899775908;
            var2_int = var2_int | var2_int >>> -1703889496;
            var3 = 126 / ((param1 - -24) / 60);
            var2_int = var2_int | var2_int >>> 1516036816;
            stackOut_0_0 = ~var2_int & param0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "b.BB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    b(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
        ((b) this).field_u = new vna();
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        uja var8 = null;
        RuntimeException var8_ref = null;
        ae var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new uja(((b) this).field_u);
              if (param6 == -1) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var9 = (ae) (Object) var8.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_6_0 = var9.l((byte) 30);
                    stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var9.b((byte) -34)) {
                            break L5;
                          } else {
                            if (!var9.a(param0, param1, param2, param3, param4, param5, -1)) {
                              break L5;
                            } else {
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0 != 0;
                            }
                          }
                        }
                        var9 = (ae) (Object) var8.a(-1);
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var8_ref;
            stackOut_21_1 = new StringBuilder().append("b.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_20_0 != 0;
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        uja var5 = null;
        RuntimeException var5_ref = null;
        ae var6_ref_ae = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_28_0 = 0;
        boolean stackOut_26_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = new uja(((b) this).field_u);
            if (param3) {
              var6_ref_ae = (ae) (Object) var5.a(param3);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_ref_ae == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var6_ref_ae.l((byte) 35);
                      stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          L4: {
                            if (!var6_ref_ae.b((byte) -34)) {
                              break L4;
                            } else {
                              if (!var6_ref_ae.a(param0, param1, param2, true)) {
                                break L4;
                              } else {
                                stackOut_16_0 = 1;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0 != 0;
                              }
                            }
                          }
                          var6_ref_ae = (ae) (Object) var5.a(-1);
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_19_0 = param2;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                var6 = stackIn_20_0;
                if (var6 != 80) {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L0;
                } else {
                  L5: {
                    if (oj.field_tb[81]) {
                      stackOut_26_0 = ((b) this).b(param1, (byte) -124);
                      stackIn_27_0 = stackOut_26_0;
                      break L5;
                    } else {
                      stackOut_24_0 = ((b) this).a(param1, (byte) -9);
                      stackIn_27_0 = stackOut_24_0;
                      break L5;
                    }
                  }
                  return stackIn_27_0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5_ref;
            stackOut_30_1 = new StringBuilder().append("b.P(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_29_0 != 0;
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        uja var2 = null;
        ae var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new uja(((b) this).field_u);
            var3 = (ae) (Object) var2.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    var3.c((byte) -121);
                    var3 = (ae) (Object) var2.a(-1);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 > 110) {
                  break L2;
                } else {
                  field_v = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "b.GB(" + param0 + ')');
        }
    }

    final void a(ae param0, int param1) {
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
              ((b) this).field_u.b((byte) -67, (vg) (Object) param0);
              if (param1 == -1) {
                break L1;
              } else {
                this.b(64);
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
            stackOut_3_1 = new StringBuilder().append("b.UA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        try {
            super.a(param0, param1, param2, param3, param4);
            this.b(param0 ^ -112);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "b.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException runtimeException = null;
        uja var5 = null;
        ae var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = new uja(((b) this).field_u);
              if (param3 == 23241) {
                break L1;
              } else {
                ((b) this).field_u = null;
                break L1;
              }
            }
            var6 = (ae) (Object) var5.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    StringBuilder discarded$9 = param2.append('\n');
                    if (var8 != 0) {
                      break L3;
                    } else {
                      var7 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (param0 < var7) {
                              break L7;
                            } else {
                              StringBuilder discarded$10 = param2.append(' ');
                              var7++;
                              if (var8 != 0) {
                                break L6;
                              } else {
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          StringBuilder discarded$11 = var6.a(param0 + 1, param1, param2, 0);
                          var6 = (ae) (Object) var5.a(-1);
                          break L6;
                        }
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
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
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("b.EB(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException runtimeException = null;
        uja var5 = null;
        ae var6 = null;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new uja(((b) this).field_u);
            var6 = (ae) (Object) var5.a(true);
            L1: while (true) {
              L2: {
                if (null == var6) {
                  break L2;
                } else {
                  if (!var6.l((byte) 70)) {
                    break L2;
                  } else {
                    var6.a(((b) this).field_i + param0, 2097152, param2, param3 + ((b) this).field_n);
                    var6 = (ae) (Object) var5.a(-1);
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
            stackOut_6_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Rankings";
    }
}
