/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        jl var4 = null;
        oi var5 = null;
        qj stackIn_9_0 = null;
        qj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (jl) ((Object) ll.field_T.a((byte) -95));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var5 = (oi) ((Object) qd.field_d.a((byte) -95));
                  if (!param0) {
                    break L2;
                  } else {
                    eg.a((byte) 21);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    L4: {
                      de.a(var5, param1, 2);
                      stackIn_9_0 = qd.field_d;

                      if (param0) {
                        stackIn_10_0 = (qj) ((Object) stackIn_9_0);
                        stackIn_10_1 = 0;
                        break L4;
                      } else {
                        stackIn_10_0 = (qj) ((Object) stackIn_9_0);
                        stackIn_10_1 = 1;
                        break L4;
                      }
                    }
                    var5 = (oi) ((Object) ((qj) (Object) stackIn_10_0).a(stackIn_10_1 != 0));
                    continue L3;
                  }
                }
              } else {
                sj.a(-7812, param1, var4);
                var4 = (jl) ((Object) ll.field_T.a(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "eg.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
            byte[] var2 = (byte[]) null;
            eg.a(-121, (byte[]) null);
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
        int stackIn_16_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  da.field_y = 0;
                  break L5;
                } else {
                  if (lk.field_c) {
                    da.field_y = bk.field_d;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      da.field_y = bk.field_d;
                      break L5;
                    } else {
                      da.field_y = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 != null) {
                  lk.field_c = false;
                  break L6;
                } else {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    lk.field_c = true;
                    break L6;
                  }
                }
              }
              qi.field_d = rd.field_f;
              og.field_e = el.field_d;
              break L2;
            }
            L7: {
              tj.field_v = param0;
              if (param1 > 121) {
                break L7;
              } else {
                field_b = -62;
                break L7;
              }
            }
            L8: {
              if (lk.field_c) {
                break L8;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L8;
                } else {
                  if (!tl.field_a) {
                    break L8;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L8;
                  }
                }
              }
            }
            L9: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L9;
              } else {
                if (pi.field_j == da.field_y) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            el.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("eg.B(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = cc.a(0, 15923, param1.length, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("eg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
