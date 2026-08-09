/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int field_a;

    final static void a(vh param0, byte param1, Object param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (null != param0.field_a) {
              L1: {
                if (param1 <= -41) {
                  break L1;
                } else {
                  var5 = (byte[]) null;
                  bi.a((byte[]) null, -74, -99);
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L3;
                  } else {
                    if (param0.field_a.peekEvent() == null) {
                      break L3;
                    } else {
                      tg.a(1L, false);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param2 != null) {
                        param0.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("bi.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0, int param1, byte[] param2, boolean param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        byte[] var10 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            var13 = new char[param1];
            var12 = var13;
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param1) {
                L2: {
                  if (!param3) {
                    break L2;
                  } else {
                    stackIn_15_0 = 11;
                    stackIn_15_1 = 78;
                    var10 = (byte[]) null;
                    bi.a(stackIn_15_0, stackIn_15_1, (byte[]) null, true);
                    break L2;
                  }
                }
                stackIn_17_0 = new String(var13, 0, var5);
                break L0;
              } else {
                var7 = 255 & param2[var6 + param0];
                if (0 != var7) {
                  L3: {
                    if (-129 < (var7 ^ -1)) {
                      break L3;
                    } else {
                      if (-161 < (var7 ^ -1)) {
                        L4: {
                          var8 = ki.field_G[var7 + -128];
                          if (var8 == 0) {
                            var8 = 63;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var7 = var8;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  incrementValue$0 = var5;
                  var5++;
                  var11[incrementValue$0] = (char)var7;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 10510) {
              stackIn_4_0 = gh.a(param0, 113, 0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bi.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
