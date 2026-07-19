/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_b;
    static int field_e;
    volatile boolean field_a;
    java.awt.Frame field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        qc var4 = null;
        sd var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (qc) ((Object) sb.field_c.a((byte) 51));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    ah.a(false, param0, var4);
                    var4 = (qc) ((Object) sb.field_c.b(-121));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 < -25) {
                  break L2;
                } else {
                  field_e = -52;
                  break L2;
                }
              }
              var5 = (sd) ((Object) r.field_b.a((byte) 51));
              L4: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  fi.a(var5, param0, -24045);
                  var5 = (sd) ((Object) r.field_b.b(-119));
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "jg.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, dl param1) {
        if (param0 != -3680) {
            return;
        }
        try {
            de.a(param1, this.field_c, (byte) 126);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rl param0, int param1, boolean param2) {
        try {
            int var3_int = -44 / ((param1 - 35) / 40);
            uf.a(param2, 123, 256, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String a(CharSequence param0, int param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_27_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_26_0 = false;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = ck.a(param0.charAt(var2_int), true);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = var2_int;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (stackIn_13_0 >= var3) {
                        break L6;
                      } else {
                        stackOut_14_0 = ck.a(param0.charAt(var3 - 1), true);
                        stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (!stackIn_15_0) {
                            break L6;
                          } else {
                            var3--;
                            stackOut_12_0 = var2_int;
                            stackIn_13_0 = stackOut_12_0;
                            continue L4;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var3 - var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    break L5;
                  }
                  var4 = stackIn_19_0;
                  if ((var4 ^ -1) <= param1) {
                    if (-13 <= (var4 ^ -1)) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L7: while (true) {
                        L8: {
                          if (var3 <= var6) {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            break L8;
                          } else {
                            var7 = param0.charAt(var6);
                            stackOut_26_0 = c.a(param1 + 2, (char) var7);
                            stackIn_34_0 = stackOut_26_0 ? 1 : 0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var9 != 0) {
                              break L8;
                            } else {
                              L9: {
                                L10: {
                                  if (stackIn_27_0) {
                                    break L10;
                                  } else {
                                    if (var9 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var8 = we.a(2, (char) var7);
                                if (var8 == 0) {
                                  break L9;
                                } else {
                                  discarded$1 = var5.append((char) var8);
                                  break L9;
                                }
                              }
                              var6++;
                              continue L7;
                            }
                          }
                        }
                        if (stackIn_34_0 != var5.length()) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("jg.B(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_23_0);
    }

    final static void a(byte param0) {
        fb.a(param0 + 174);
        if (param0 == 81) {
            return;
        }
        field_d = false;
    }

    jg() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_b = 0;
        field_e = -1;
        field_d = false;
    }
}
