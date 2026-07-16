/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends RuntimeException {
    String field_a;
    Throwable field_b;
    static String field_c;

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (param0 == 7400) {
                  break L0;
                } else {
                  var4 = null;
                  byte[] discarded$1 = ac.a(-53, (byte[]) null);
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  L1: {
                    var2_ref = Runtime.getRuntime();
                    var5 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    v.field_Q = (int)(var3.longValue() / 1048576L) - -1;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
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
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        pb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = new pb(param1);
          if (param0 <= -54) {
            break L0;
          } else {
            ac.a((byte) -15);
            break L0;
          }
        }
        L1: {
          var3 = var9.f(-124);
          var4 = var9.e((byte) 126);
          if (0 > var4) {
            break L1;
          } else {
            L2: {
              if (0 == rl.field_u) {
                break L2;
              } else {
                if ((rl.field_u ^ -1) <= (var4 ^ -1)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (-1 == (var3 ^ -1)) {
              var17 = new byte[var4];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var5 = var11;
              var9.a(97, var17, 0, var4);
              return var5;
            } else {
              L3: {
                var5_int = var9.e((byte) 126);
                if (-1 < (var5_int ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (rl.field_u == 0) {
                      break L4;
                    } else {
                      if ((rl.field_u ^ -1) > (var5_int ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var16 = new byte[var5_int];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var6 = var10;
                  if ((var3 ^ -1) != -2) {
                    var7 = (Object) (Object) cc.field_f;
                    synchronized (var7) {
                      L5: {
                        cc.field_f.a(var9, 2, var16);
                        break L5;
                      }
                    }
                    return var6;
                  } else {
                    int discarded$3 = dc.a(var16, var5_int, param1, var4, 9);
                    return var6;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -118) {
            field_c = null;
        }
    }

    ac(Throwable param0, String param1) {
        ((ac) this).field_b = param0;
        ((ac) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
