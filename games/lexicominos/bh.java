/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    private java.nio.ByteBuffer field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cg var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -95 % ((25 - param0) / 50);
                        var3 = (cg) ((Object) ca.field_n.a(true));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        Lexicominos.a(-17800, var3, param1);
                        var3 = (cg) ((Object) ca.field_n.f(2));
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var2), "bh.E(" + param0 + ',' + param1 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1) {
        CharSequence var3;
        if (param0 != 0) {
          var3 = (CharSequence) null;
          bh.a(true, (CharSequence) null, -76);
          tg.a(param1, true, 114);
          return;
        } else {
          tg.a(param1, true, 114);
          return;
        }
    }

    final void a(byte[] param0, boolean param1) {
        try {
            if (!param1) {
                this.field_d = (java.nio.ByteBuffer) null;
            }
            this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_d.position(0);
            this.field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
                        if (param0 == 83) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2_int >= pf.field_o) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ff.field_a[var2_int - -param1] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o - -param1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 < pf.field_o) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        pf.field_o = param1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var2), "bh.C(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 <= -68) {
              if (!bb.a(param1, param0, -1)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (param1.length() <= var3_int) {
                        break L3;
                      } else {
                        stackOut_10_0 = ee.a(-125, param1.charAt(var3_int));
                        stackIn_17_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (!stackIn_11_0) {
                            stackIn_14_0 = 0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            var3_int++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackIn_17_0 = 1;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("bh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final byte[] a(byte param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_d.capacity()];
        var2 = var3;
        if (param0 != -121) {
          return (byte[]) null;
        } else {
          this.field_d.position(0);
          this.field_d.get(var3);
          return var3;
        }
    }

    bh() {
    }

    static {
    }
}
