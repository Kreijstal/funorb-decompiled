/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    volatile boolean field_e;
    volatile md[] field_c;
    jk field_b;
    volatile boolean field_f;
    static int field_d;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 != -3) {
            boolean discarded$0 = vi.a(68);
            return ad.field_b;
        }
        return ad.field_b;
    }

    final static boolean a(um param0, int param1, um param2, um param3) {
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 > 44) {
          L0: {
            if (!param0.c((byte) 127)) {
              break L0;
            } else {
              if (!param0.b("commonui", 100)) {
                break L0;
              } else {
                if (param2.c((byte) 121)) {
                  if (!param2.b("commonui", 100)) {
                    return false;
                  } else {
                    L1: {
                      L2: {
                        if (!param3.c((byte) 126)) {
                          break L2;
                        } else {
                          if (!param3.b("button.gif", 100)) {
                            break L2;
                          } else {
                            stackOut_24_0 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L1;
                    }
                    return stackIn_26_0 != 0;
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        } else {
          field_d = -26;
          if (param0.c((byte) 127)) {
            if (param0.b("commonui", 100)) {
              if (param2.c((byte) 121)) {
                if (!param2.b("commonui", 100)) {
                  return false;
                } else {
                  L3: {
                    L4: {
                      if (!param3.c((byte) 126)) {
                        break L4;
                      } else {
                        if (!param3.b("button.gif", 100)) {
                          break L4;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  }
                  return stackIn_12_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 5 % ((param0 - 65) / 51);
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        md var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = Chess.field_G;
        ((vi) this).field_e = true;
        try {
          L0: while (true) {
            if (((vi) this).field_f) {
              ((vi) this).field_e = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (-3 >= (var1_int ^ -1)) {
                  bc.a(10L, (byte) -121);
                  var5 = null;
                  ak.a(((vi) this).field_b, (byte) -37, (Object) null);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((vi) this).field_c[var1_int];
                    if (var2 != null) {
                      var2.b();
                      break L2;
                    } else {
                      var1_int++;
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
          var6 = null;
          fg.a((Throwable) (Object) var1, (byte) -77, (String) null);
          ((vi) this).field_e = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((vi) this).field_e = false;
          throw vi.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    vi() {
        ((vi) this).field_c = new md[2];
        ((vi) this).field_f = false;
        ((vi) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
