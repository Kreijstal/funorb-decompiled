/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws extends fw {
    static int field_O;
    static je field_P;
    int field_L;
    int field_Q;
    int field_N;
    int field_S;
    int field_R;
    int field_M;
    static String field_T;

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, 120, param4, param5, param6)) {
              if (param3 >= 103) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_O = 36;
                return false;
              }
            } else {
              L1: {
                var8_int = param0 + (-this.field_B + (-param1 + -this.field_S));
                var9 = param5 + -this.field_M + (-this.field_p + -param2);
                if (var8_int * var8_int + var9 * var9 >= this.field_Q * this.field_Q) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var10 = Math.atan2((double)var9, (double)var8_int) - lf.field_b;
                      if (0.0 <= var10) {
                        break L3;
                      } else {
                        var10 = var10 - 3.141592653589793 / (double)this.field_L;
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var10 > 0.0) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_L;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_R = (int)((double)this.field_L * var10 / 6.283185307179586);
                  L4: while (true) {
                    L5: {
                      if (this.field_R < this.field_L) {
                        break L5;
                      } else {
                        this.field_R = this.field_R - this.field_L;
                        if (var12 != 0) {
                          break L1;
                        } else {
                          if (var12 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (-1 >= (this.field_R ^ -1)) {
                        break L1;
                      } else {
                        this.field_R = this.field_R + this.field_L;
                        if (var12 == 0) {
                          continue L6;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("ws.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          L0: {
            field_P = (je) null;
            hw.a((byte) 52, wf.field_y, 6);
            hw.a((byte) 33, sh.field_r, 26);
            kr.field_D.a(kr.field_D.a(26, (byte) -107) - -30, 26, (byte) 126);
            hw.a((byte) 111, pu.field_B, 8);
            hw.a((byte) 67, sh.field_r, 27);
            kr.field_D.a(30 + kr.field_D.a(27, (byte) -126), 27, (byte) 125);
            hw.a((byte) 78, sh.field_r, 28);
            kr.field_D.a(kr.field_D.a(28, (byte) -122) + 30, 28, (byte) 120);
            hw.a((byte) 45, pu.field_B, 9);
            if (!rf.a(27875)) {
              hw.a((byte) 54, cg.field_b, 1);
              hw.a((byte) 91, oj.field_t, 24);
              hw.a((byte) 101, op.field_f, 17);
              hw.a((byte) 39, sa.field_i, 3);
              hw.a((byte) 78, wp.field_D, 4);
              il.field_t[40] = od.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            hw.a((byte) 52, wf.field_y, 6);
            hw.a((byte) 33, sh.field_r, 26);
            kr.field_D.a(kr.field_D.a(26, (byte) -107) - -30, 26, (byte) 126);
            hw.a((byte) 111, pu.field_B, 8);
            hw.a((byte) 67, sh.field_r, 27);
            kr.field_D.a(30 + kr.field_D.a(27, (byte) -126), 27, (byte) 125);
            hw.a((byte) 78, sh.field_r, 28);
            kr.field_D.a(kr.field_D.a(28, (byte) -122) + 30, 28, (byte) 120);
            hw.a((byte) 45, pu.field_B, 9);
            if (!rf.a(27875)) {
              hw.a((byte) 54, cg.field_b, 1);
              hw.a((byte) 91, oj.field_t, 24);
              hw.a((byte) 101, op.field_f, 17);
              hw.a((byte) 39, sa.field_i, 3);
              hw.a((byte) 78, wp.field_D, 4);
              il.field_t[40] = od.field_f;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            java.applet.Applet var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 <= -122) {
                      break L1;
                    } else {
                      var3 = (java.applet.Applet) null;
                      ws.a((java.applet.Applet) null, -54);
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                  param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("ws.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 < 124) {
            field_P = (je) null;
            field_T = null;
            return;
        }
        field_T = null;
    }

    private ws() throws Throwable {
        throw new Error();
    }

    static {
        field_O = 0;
        field_T = "Players: <%0>/<%1>";
    }
}
