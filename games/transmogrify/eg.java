/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        jl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        oi var4 = null;
        jl stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        qj stackIn_12_0 = null;
        qj stackIn_13_0 = null;
        qj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException decompiledCaughtException = null;
        jl stackOut_3_0 = null;
        wf stackOut_5_0 = null;
        qj stackOut_11_0 = null;
        qj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        qj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2 = (jl) ((Object) ll.field_T.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    sj.a(-7812, param1, var2);
                    stackOut_3_0 = (jl) ((Object) ll.field_T.a(true));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = qd.field_d.a((byte) -95);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              L4: {
                var4 = (oi) ((Object) stackIn_6_0);
                if (!param0) {
                  break L4;
                } else {
                  eg.a((byte) 21);
                  break L4;
                }
              }
              L5: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  de.a(var4, param1, 2);
                  if (var3 == 0) {
                    L6: {
                      stackOut_11_0 = qd.field_d;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param0) {
                        stackOut_13_0 = (qj) ((Object) stackIn_13_0);
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L6;
                      } else {
                        stackOut_12_0 = (qj) ((Object) stackIn_12_0);
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L6;
                      }
                    }
                    var4 = (oi) ((Object) ((qj) (Object) stackIn_14_0).a(stackIn_14_1 != 0));
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "eg.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        String discarded$0 = null;
        if (param0 <= 47) {
            byte[] var2 = (byte[]) null;
            discarded$0 = eg.a(-121, (byte[]) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        vi.field_e = wh.a((byte) -122);
        ci.field_f = new da();
        wl.a(true, true, 170);
        if (param0 >= 54) {
            return;
        }
        eg.a((byte) -57);
    }

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != (rd.field_f ^ -1)) {
                break L1;
              } else {
                if ((el.field_d ^ -1) != 0) {
                  break L1;
                } else {
                  el.field_d = bk.field_a;
                  rd.field_f = oa.field_j;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                da.field_y = da.field_y + 1;
                if (param0 != null) {
                  if (param0.equals(tj.field_v)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (tj.field_v != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!lk.field_c) {
                  if (da.field_y >= bk.field_d) {
                    if (bk.field_d - -ek.field_g > da.field_y) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_16_0;
                  if (param0 == null) {
                    break L6;
                  } else {
                    if (lk.field_c) {
                      da.field_y = bk.field_d;
                      break L5;
                    } else {
                      if (var2_int != 0) {
                        da.field_y = bk.field_d;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                da.field_y = 0;
                if (var3 == 0) {
                  break L5;
                } else {
                  da.field_y = bk.field_d;
                  break L5;
                }
              }
              L7: {
                if (param0 != null) {
                  lk.field_c = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    lk.field_c = true;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      lk.field_c = false;
                      break L7;
                    }
                  }
                }
              }
              qi.field_d = rd.field_f;
              og.field_e = el.field_d;
              break L2;
            }
            L8: {
              tj.field_v = param0;
              if (param1 > 121) {
                break L8;
              } else {
                field_b = -62;
                break L8;
              }
            }
            L9: {
              if (lk.field_c) {
                break L9;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L9;
                } else {
                  if (!tl.field_a) {
                    break L9;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L9;
                  }
                }
              }
            }
            L10: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L10;
              } else {
                if (pi.field_j == da.field_y) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            el.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var2);
            stackOut_44_1 = new StringBuilder().append("eg.B(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 82) {
                break L1;
              } else {
                eg.a((byte) -117);
                break L1;
              }
            }
            stackOut_2_0 = cc.a(0, 15923, param1.length, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("eg.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
