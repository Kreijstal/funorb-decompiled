/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends h {
    private ab field_p;
    private ab[] field_o;

    final static void a(boolean param0, int param1) {
        hj var2 = ff.field_D;
        var2.a(false, 6);
        var2.f(6389, 1);
        var2.f(6389, 0);
    }

    final static boolean b(boolean param0) {
        return si.field_l > 250;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        ab var7 = null;
        int var8 = 0;
        lj var10 = null;
        ab var11 = null;
        ab var12 = null;
        ab var13 = null;
        ab var14 = null;
        ab var15 = null;
        qg stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof lj)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qg) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (qg) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (lj) (Object) stackIn_3_0;
              c.a(param4.field_p + (param0 - -param4.field_l), param4.field_p + param0, (byte) -50, param4.field_n + (param1 - -param4.field_h), param4.field_n + param1);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_t;
                break L2;
              }
            }
            L3: {
              var7 = ((ki) this).field_o[0];
              ((ki) this).field_p.a(313);
              var7.a((ki) this, (byte) -70, param0, param1, ((ki) this).field_p, param4);
              if (var10 != null) {
                L4: {
                  if (var10.field_y) {
                    var11 = ((ki) this).field_o[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a((ki) this, (byte) -95, param0, param1, ((ki) this).field_p, param4);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_g) {
                  L5: {
                    var13 = ((ki) this).field_o[3];
                    if (var10.field_s == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a((ki) this, (byte) -45, param0, param1, ((ki) this).field_p, param4);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = ((ki) this).field_o[2];
                  if (var12 == null) {
                    break L3;
                  } else {
                    var12.a((ki) this, (byte) -55, param0, param1, ((ki) this).field_p, param4);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (!param4.b((byte) -111)) {
                break L6;
              } else {
                var14 = ((ki) this).field_o[5];
                if (var14 != null) {
                  var14.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              var8 = 127 % ((param3 - 51) / 47);
              if (param2) {
                break L7;
              } else {
                var15 = ((ki) this).field_o[4];
                if (var15 != null) {
                  var15.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
            fi.c(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final ab a(byte param0, int param1) {
        Object var4 = null;
        if (param0 != -21) {
          var4 = null;
          ki.a((byte) -43, (java.applet.Applet) null);
          ab dupTemp$4 = new ab();
          ((ki) this).field_o[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          ab dupTemp$5 = new ab();
          ((ki) this).field_o[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    ki(ki param0, boolean param1) {
        this();
        try {
            param0.a(param1, (ki) this, false);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, ki param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ab var5 = null;
        ab var6 = null;
        int var7 = 0;
        ab stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ab stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ab stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ab stackIn_10_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ab stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ab stackOut_9_2 = null;
        ab stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ab stackOut_8_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            super.a((byte) -106, (h) (Object) param1);
            if (!param0) {
              ji.a((Object[]) (Object) ((ki) this).field_o, 0, (Object[]) (Object) param1.field_o, 0, 6);
              return;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= 6) {
                  break L0;
                } else {
                  L2: {
                    var5 = ((ki) this).field_o[var4_int];
                    if (var5 == null) {
                      param1.field_o[var4_int] = null;
                      var4_int++;
                      break L2;
                    } else {
                      L3: {
                        var6 = param1.field_o[var4_int];
                        stackOut_7_0 = (ab) var5;
                        stackOut_7_1 = 72;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var6 == null) {
                          ab dupTemp$49 = new ab();
                          param1.field_o[var4_int] = dupTemp$49;
                          stackOut_9_0 = (ab) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = (ab) dupTemp$49;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          break L3;
                        } else {
                          stackOut_8_0 = (ab) (Object) stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = (ab) var6;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          break L3;
                        }
                      }
                      ((ab) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2);
                      var4_int++;
                      var4_int++;
                      break L2;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ki.J(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + false + ')');
        }
    }

    final void a(ti[] param0, int param1) {
        ab[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ab var6 = null;
        int var7 = 0;
        ab[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = -26 / ((-58 - param1) / 38);
            var8 = ((ki) this).field_o;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 != null) {
                    var6.field_i = param0;
                    var5++;
                    break L2;
                  } else {
                    var5++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ki.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, ti[] param2) {
        int var4_int = 0;
        if (param1 != -19106) {
            return;
        }
        try {
            var4_int = param0;
            if (!(((ki) this).field_o[var4_int] != null)) {
                ((ki) this).field_o[var4_int] = new ab();
            }
            ((ki) this).field_o[param0].field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ki.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ti param0, int param1) {
        ab[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ab var5 = null;
        int var6 = 0;
        ab[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var7 = ((ki) this).field_o;
            var3 = var7;
            if (param1 == 1) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_d = param0;
                      var4++;
                      break L2;
                    } else {
                      var4++;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ki.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    public ki() {
        ((ki) this).field_o = new ab[6];
        ((ki) this).field_p = new ab();
        ab dupTemp$0 = new ab();
        ((ki) this).field_o[0] = dupTemp$0;
        ab var1 = dupTemp$0;
        var1.a(313);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        gb.a(param1, (byte) 83, "");
        if (param0 != 3) {
            return;
        }
        try {
            ol.a(param1, 30194);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ki.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
