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
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -95 % ((25 - param0) / 50);
            var3 = (cg) ((Object) ca.field_n.a(true));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                Lexicominos.a(-17800, var3, param1);
                var3 = (cg) ((Object) ca.field_n.f(2));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        boolean discarded$2 = false;
        CharSequence var3 = null;
        if (param0 != 0) {
          var3 = (CharSequence) null;
          discarded$2 = bh.a(true, (CharSequence) null, -76);
          tg.a(param1, true, 114);
          return;
        } else {
          tg.a(param1, true, 114);
          return;
        }
    }

    final void a(byte[] param0, boolean param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            if (!param1) {
                this.field_d = (java.nio.ByteBuffer) null;
            }
            this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            discarded$0 = this.field_d.position(0);
            discarded$1 = this.field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
            if (param0 == 83) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= pf.field_o) {
                      break L3;
                    } else {
                      ff.field_a[var2_int - -param1] = var2_int;
                      var2_int++;
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
                  nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o - -param1);
                  break L2;
                }
                if (param1 < pf.field_o) {
                  pf.field_o = param1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 <= -68) {
              if (!bb.a(param1, param0, -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
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
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
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
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("bh.B(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
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
        java.nio.Buffer discarded$4 = null;
        java.nio.ByteBuffer discarded$5 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_d.capacity()];
        var2 = var3;
        if (param0 != -121) {
          return (byte[]) null;
        } else {
          discarded$4 = this.field_d.position(0);
          discarded$5 = this.field_d.get(var3);
          return var3;
        }
    }

    bh() {
    }

    static {
    }
}
