/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends ij {
    static dl[] field_n;
    static String field_l;
    static volatile long field_m;

    final static void a(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              uo.field_o = uo.field_o + 1;
              var2_int = rc.field_a.size();
              if (jo.field_o != 1) {
                break L1;
              } else {
                L2: {
                  if (mo.field_l != 0) {
                    break L2;
                  } else {
                    var2_int = 15;
                    if (CrazyCrystals.field_B == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = ke.field_b[jo.field_o] + 1;
                if (var2_int > var3) {
                  var2_int = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (var2_int > uo.field_o) {
              fl.field_g = fp.field_a;
              sb.field_F = b.field_a;
              sm.field_e = we.field_h;
              nh.field_F = je.field_j;
              ll.a(-105, true, param1);
              ue.field_c = true;
              return;
            } else {
              uh.field_n = true;
              if (param0 == 35) {
                go.field_i = true;
                uo.field_o = uo.field_o - 1;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "bd.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 7279) {
                break L1;
              } else {
                int discarded$2 = bd.a(102, (byte) -53);
                break L1;
              }
            }
            field_n = null;
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "bd.C(" + param0 + ')');
        }
    }

    final static void a(db param0, byte[] param1, wj[] param2, int param3) {
        RuntimeException var4 = null;
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
              ga.field_L = param0;
              io.field_I[16] = mh.field_j;
              if (param3 == 8) {
                break L1;
              } else {
                bd.a((byte) -64, false);
                break L1;
              }
            }
            io.field_I[17] = ti.field_j;
            cc.a(8438015, (java.applet.Applet) (Object) fe.field_g, (byte) -121, 2121856, io.field_I, 192);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("bd.A(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 != 0) {
              if (0 < param0) {
                L1: {
                  var2_int = 1;
                  if (param0 <= 65535) {
                    break L1;
                  } else {
                    var2_int += 16;
                    param0 = param0 >> 16;
                    break L1;
                  }
                }
                L2: {
                  if (param0 <= 255) {
                    break L2;
                  } else {
                    var2_int += 8;
                    param0 = param0 >> 8;
                    break L2;
                  }
                }
                L3: {
                  if (param0 <= 15) {
                    break L3;
                  } else {
                    param0 = param0 >> 4;
                    var2_int += 4;
                    break L3;
                  }
                }
                L4: {
                  if (param0 <= 3) {
                    break L4;
                  } else {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L4;
                  }
                }
                L5: {
                  if (param0 > 1) {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_18_0 = var2_int;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0;
              } else {
                if (param1 == 62) {
                  L6: {
                    var2_int = 2;
                    if (param0 >= -65536) {
                      break L6;
                    } else {
                      var2_int += 16;
                      param0 = param0 >> 16;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0 >= -256) {
                      break L7;
                    } else {
                      var2_int += 8;
                      param0 = param0 >> 8;
                      break L7;
                    }
                  }
                  L8: {
                    if (-16 <= param0) {
                      break L8;
                    } else {
                      var2_int += 4;
                      param0 = param0 >> 4;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0 < -4) {
                      var2_int += 2;
                      param0 = param0 >> 2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-2 > param0) {
                      param0 = param0 >> 1;
                      var2_int++;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  stackOut_37_0 = var2_int;
                  stackIn_38_0 = stackOut_37_0;
                  break L0;
                } else {
                  stackOut_21_0 = 93;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "bd.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_38_0;
    }

    bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This is a bomb.<br><br>Bombs blow up when<br><br>- you drop them;<br>- they get crushed;<br>- another bomb explodes<br>  nearby.<br><br>Use them to clear the<br>way. Stand back!";
        field_m = 0L;
    }
}
