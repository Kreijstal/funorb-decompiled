/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ab extends ea implements vm {
    kp field_s;
    static String field_r;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        an var8 = null;
        RuntimeException var8_ref = null;
        ea var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new an(((ab) this).field_s);
              if (param0 == 34) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            var9 = (ea) (Object) var8.c(-1372);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) 106)) {
                    break L3;
                  } else {
                    if (!var9.a(34, param1 + ((ab) this).field_p, param2, param3, ((ab) this).field_h + param4, param5, param6)) {
                      var9 = (ea) (Object) var8.a(126);
                      continue L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("ab.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final String c(byte param0) {
        String var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) (Object) var2.c(-1372);
        while (var3 != null) {
            var4 = var3.c((byte) -112);
            if (var4 != null) {
                return var4;
            }
            var3 = (ea) (Object) var2.a(-12);
        }
        if (param0 < -41) {
            return null;
        }
        Object var6 = null;
        this.a((byte) -28, 3, (Hashtable) null, (StringBuilder) null);
        return null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param1 == 0) {
            if (!(((ab) this).field_e == null)) {
                ((ab) this).field_e.a(true, -7592, param3, (ea) this, param2);
            }
        }
        an var5 = new an(((ab) this).field_s);
        if (param0 < 64) {
            return;
        }
        ea var6 = (ea) (Object) var5.b(true);
        while (var6 != null) {
            var6.a((byte) 100, param1, param2 + ((ab) this).field_h, param3 + ((ab) this).field_p);
            var6 = (ea) (Object) var5.a((byte) 120);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        RuntimeException var8 = null;
        ea var9 = null;
        int var10 = 0;
        Object var11 = null;
        an var12 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var12 = new an(((ab) this).field_s);
            var9 = (ea) (Object) var12.c(-1372);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b((byte) 85)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.e(28660)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, param5, false)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (ea) (Object) var12.a(-121);
                    continue L1;
                  }
                }
              }
              if (!param6) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var11 = null;
                StringBuilder discarded$2 = ((ab) this).a((StringBuilder) null, -90, 100, (Hashtable) null);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("ab.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(ea param0, int param1) {
        try {
            if (param1 != 1) {
                field_r = null;
            }
            ((ab) this).field_s.a(87, (wf) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ab.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, ea param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        ea var4 = null;
        an var5 = null;
        ea var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 80) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            if (!((ab) this).field_s.a(true)) {
              var3 = new an(((ab) this).field_s);
              var4 = (ea) (Object) var3.c(-1372);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (var4.e(28660)) {
                      var5 = new an(((ab) this).field_s);
                      wf discarded$2 = var5.a(46, (wf) (Object) var4);
                      var6 = (ea) (Object) var5.a(23);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param1, (byte) -42)) {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            var6 = (ea) (Object) var5.a(-126);
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ea) (Object) var3.a(-123);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("ab.FB(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0;
        an var3 = new an(((ab) this).field_s);
        ea var4 = (ea) (Object) var3.c(param0 ^ -1372);
        while (var4 != null) {
            var5 = var4.f(param0);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ea) (Object) var3.a(-119);
        }
        return var2;
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        an var5 = null;
        RuntimeException var5_ref = null;
        ea var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            var5 = new an(((ab) this).field_s);
            var6 = (ea) (Object) var5.c(-1372);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param0 == 115) {
                    break L2;
                  } else {
                    ((ab) this).field_s = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                StringBuilder discarded$6 = param3.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param1) {
                    StringBuilder discarded$7 = var6.a(param3, 32462, 1 + param1, param2);
                    var6 = (ea) (Object) var5.a(param0 + -232);
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = param3.append(' ');
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
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("ab.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    ab(int param0, int param1, int param2, int param3, ir param4) {
        super(param0, param1, param2, param3, param4, (no) null);
        ((ab) this).field_s = new kp();
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!((ab) this).a(param0, param2, false, param3)) {
                break L1;
              } else {
                ((ab) this).a(param0, param1 ^ 32462, param3, param2);
                this.a((byte) 115, param2, param3, param0);
                break L1;
              }
            }
            L2: {
              if (param1 == 32462) {
                break L2;
              } else {
                ((ab) this).a((byte) 77, -41, -88, 96);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ab.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final void d(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        if (param0 != 7398) {
            return;
        }
        ea var3 = (ea) (Object) var2.c(-1372);
        while (var3 != null) {
            var3.d(7398);
            var3 = (ea) (Object) var2.a(param0 + -7523);
        }
    }

    public static void c() {
        field_r = null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, (byte) 126);
        if (param4 <= 122) {
            Object var7 = null;
            ((ab) this).a((byte) -120, (ea) null, 59, 121);
        }
        int discarded$0 = 0;
        this.b();
    }

    void a(byte param0, ea param1, int param2, int param3) {
        an var5 = null;
        RuntimeException var5_ref = null;
        ea var6 = null;
        Object var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            super.a((byte) 94, param1, param2, param3);
            var5 = new an(((ab) this).field_s);
            var6 = (ea) (Object) var5.c(-1372);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b((byte) 119)) {
                    break L2;
                  } else {
                    var6.a((byte) 108, param1, param2 - -((ab) this).field_h, ((ab) this).field_p + param3);
                    var6 = (ea) (Object) var5.a(-125);
                    continue L1;
                  }
                }
              }
              L3: {
                if (param0 > 13) {
                  break L3;
                } else {
                  var7 = null;
                  StringBuilder discarded$2 = ((ab) this).a((StringBuilder) null, -85, 34, (Hashtable) null);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5_ref;
            stackOut_7_1 = new StringBuilder().append("ab.S(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea var9 = null;
        an var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var10 = new an(((ab) this).field_s);
            var6 = -95 / ((param0 - -53) / 33);
            var9 = (ea) (Object) var10.c(-1372);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b((byte) 95)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.e(28660)) {
                        break L3;
                      } else {
                        if (var9.a(-94, param1, param2, param3)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (ea) (Object) var10.a(69);
                    continue L1;
                  }
                }
              }
              var7 = param1;
              if (80 == var7) {
                L4: {
                  if (lp.field_a[81]) {
                    stackOut_14_0 = ((ab) this).b(param3, -107);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = ((ab) this).a(80, param3);
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ab.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        an var7 = null;
        RuntimeException var7_ref = null;
        ea var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new an(((ab) this).field_s);
            if (param5 == 91) {
              var8 = (ea) (Object) var7.c(-1372);
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b((byte) 115)) {
                      break L2;
                    } else {
                      var8.a(param0 + ((ab) this).field_p, param1 + ((ab) this).field_h, param2, param3, param4, (byte) 91);
                      var8 = (ea) (Object) var7.a(3);
                      continue L1;
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
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("ab.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param5 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
            field_r = null;
        }
        return ((ab) this).a(0) != null ? true : false;
    }

    ea a(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) (Object) var2.c(-1372);
        while (var3 != null) {
            if (var3.e(28660)) {
                return var3;
            }
            var3 = (ea) (Object) var2.a(-119);
        }
        if (param0 == 0) {
            return null;
        }
        ((ab) this).field_s = null;
        return null;
    }

    final boolean b(ea param0, int param1) {
        RuntimeException var3 = null;
        ea var4 = null;
        an var5 = null;
        ea var6 = null;
        int var7 = 0;
        Object var8 = null;
        an var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (((ab) this).field_s.a(true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var9 = new an(((ab) this).field_s);
                if (param1 < -20) {
                  break L1;
                } else {
                  var8 = null;
                  ((ab) this).a((ea) null, -61);
                  break L1;
                }
              }
              var4 = (ea) (Object) var9.b(true);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.e(28660)) {
                      break L3;
                    } else {
                      var5 = new an(((ab) this).field_s);
                      wf discarded$2 = var5.a((wf) (Object) var4, 0);
                      var6 = (ea) (Object) var5.a((byte) 120);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, (byte) -42)) {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            var6 = (ea) (Object) var5.a((byte) 120);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ea) (Object) var9.a((byte) 120);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ab.EB(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final boolean a(ea param0, byte param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        ea var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3 = new an(((ab) this).field_s);
              if (param1 == -42) {
                break L1;
              } else {
                ((ab) this).a((byte) 13, -25, 110, -87);
                break L1;
              }
            }
            var4 = (ea) (Object) var3.c(-1372);
            L2: while (true) {
              if (var4 == null) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (!var4.a(param0, (byte) -42)) {
                  var4 = (ea) (Object) var3.a(param1 ^ -31);
                  continue L2;
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ab.U(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final void b() {
        an var2 = new an(((ab) this).field_s);
        ea var3 = (ea) (Object) var2.c(-1372);
        while (var3 != null) {
            var3.a(false);
            var3 = (ea) (Object) var2.a(-124);
        }
    }

    final static el a(wl param0, int param1, boolean param2, int[] param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        Object stackIn_2_0 = null;
        el stackIn_8_0 = null;
        el stackIn_11_0 = null;
        el stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_12_0 = null;
        el stackOut_10_0 = null;
        el stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              L1: {
                if (param0.field_Cc) {
                  break L1;
                } else {
                  L2: {
                    if (!mg.a(param6, (byte) -72)) {
                      break L2;
                    } else {
                      if (!mg.a(param7, (byte) -39)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (param0.field_u) {
                    stackOut_12_0 = new el(param0, 34037, param6, param7, false, param3, param5, param4);
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = new el(param0, param6, param7, fk.a(param6, 61), fk.a(param7, 115), param3);
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
              stackOut_7_0 = new el(param0, 3553, param6, param7, false, param3, param5, param4);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (el) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("ab.JB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(false).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Arcade Mode Unlocked!";
    }
}
