/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends RuntimeException {
    String field_a;
    Throwable field_b;
    static String field_c;

    final static void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            byte[] var4 = null;
            Object[] var5 = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                if (param0 == 7400) {
                  break L0;
                } else {
                  var4 = (byte[]) null;
                  ac.a(-53, (byte[]) null);
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var5 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    v.field_Q = (int)(var3.longValue() / 1048576L) - -1;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        pb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          L0: {
            L1: {
              var9 = new pb(param1);
              if (param0 <= -54) {
                break L1;
              } else {
                ac.a((byte) -15);
                break L1;
              }
            }
            L2: {
              var3 = var9.f(-124);
              var4 = var9.e((byte) 126);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (0 == rl.field_u) {
                    break L3;
                  } else {
                    if (rl.field_u >= var4) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(97, var13, 0, var4);
                  stackIn_23_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.e((byte) 126);
                    if (-1 < (var5_int ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (rl.field_u == 0) {
                          break L5;
                        } else {
                          if (rl.field_u < var5_int) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if ((var3 ^ -1) != -2) {
                          var7 = cc.field_f;
                          synchronized (var7) {
                            L7: {
                              cc.field_f.a(var9, 2, var12);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          dc.a(var12, var5_int, param1, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ac.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -118) {
            field_c = (String) null;
        }
    }

    ac(Throwable param0, String param1) {
        this.field_b = param0;
        this.field_a = param1;
    }

    static {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
