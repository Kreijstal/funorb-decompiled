/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends rh {
    int field_P;
    static int field_N;
    static byte[][] field_M;
    private qh field_J;
    static String field_O;
    private int field_L;
    static String field_K;
    int field_I;

    final static String b(boolean param0) {
        if (param0) {
            wj discarded$7 = qk.j(125);
            if (!(oe.field_b != fd.field_h)) {
                return bf.field_f;
            }
            return lf.field_T;
        }
        if (!(oe.field_b != fd.field_h)) {
            return bf.field_f;
        }
        return lf.field_T;
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_23_0 = new String(var10);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (var5 > 90) {
                        break L4;
                      } else {
                        var3[var4] = (char)(var5 + 32);
                        var4++;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (57 < var5) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("qk.W(").append(-128).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static Object a(byte[] param0, boolean param1, byte param2) {
        pi var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        pi stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
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
            if (param0 != null) {
              if (param0.length > 136) {
                var3 = new pi();
                ((fh) (Object) var3).a(param0, 13673);
                stackOut_5_0 = (pi) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                var3_int = 97 / ((72 - param2) / 37);
                if (param1) {
                  stackOut_10_0 = qd.a(param0, (byte) 58);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = (byte[]) param0;
                  stackIn_9_0 = stackOut_8_0;
                  return (Object) (Object) stackIn_9_0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("qk.Q(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (Object) (Object) stackIn_11_0;
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              L1: {
                var8_int = param2 + -param5 + -((qk) this).field_I;
                var9 = ((qk) this).field_x + -(2 * ((qk) this).field_I);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((qk) this).field_L / var9;
                if (1 != param3) {
                  if (2 != param3) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((qk) this).field_J.b(-1) <= var12) {
                        if (var11 >= 0) {
                          ((qk) this).field_J.a(var11, -12759);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          var13 = ((qk) this).field_J.c((byte) -82, var12) - var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            var12++;
                            break L5;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            var12++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((qk) this).field_J.a((byte) -120, var8_int);
                  break L3;
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("qk.R(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final int a(int param0, int param1) {
        if (param0 == -1) {
          if (param1 >= 0) {
            if (((qk) this).field_J.b(param0) <= param1) {
              return -1;
            } else {
              return ((qk) this).field_J.c((byte) 70, param1);
            }
          } else {
            return -1;
          }
        } else {
          int discarded$7 = ((qk) this).a(-40, 98);
          if (param1 >= 0) {
            if (((qk) this).field_J.b(param0) <= param1) {
              return -1;
            } else {
              return ((qk) this).field_J.c((byte) 70, param1);
            }
          } else {
            return -1;
          }
        }
    }

    final static wj j(int param0) {
        if (param0 != -17514) {
            field_O = null;
            return (wj) (Object) new eb();
        }
        return (wj) (Object) new eb();
    }

    final int c(boolean param0) {
        if (!param0) {
            String discarded$0 = qk.b(true);
            return ((qk) this).field_J.b(-1);
        }
        return ((qk) this).field_J.b(-1);
    }

    final int k(int param0) {
        if (param0 != 26856) {
            Object var3 = null;
            Object discarded$0 = qk.a((byte[]) null, true, (byte) 68);
            return ((qk) this).field_L;
        }
        return ((qk) this).field_L;
    }

    public static void a() {
        field_M = null;
        field_K = null;
        field_O = null;
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_N = 20;
        field_K = "Name is available";
    }
}
