/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    private byte[] field_a;
    static int[] field_c;
    private boolean field_d;
    private int field_b;

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (!((um) this).field_d) {
          if (param0 == -30223) {
            return null;
          } else {
            ((um) this).field_a = null;
            return null;
          }
        } else {
          var3 = ((um) this).field_a;
          var2 = var3;
          ((um) this).field_a = null;
          return var3;
        }
    }

    final void a(ds param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.h(90);
              if (!param2) {
                break L1;
              } else {
                System.out.println("data_len received: " + var4_int + " (hex " + Integer.toHexString(var4_int) + ")");
                break L1;
              }
            }
            L2: {
              L3: {
                if (((um) this).field_d) {
                  break L3;
                } else {
                  if (null == ((um) this).field_a) {
                    break L3;
                  } else {
                    if (((um) this).field_a.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (!param2) {
                  break L4;
                } else {
                  System.out.println("allocating new buffer");
                  break L4;
                }
              }
              ((um) this).field_b = 0;
              ((um) this).field_d = false;
              ((um) this).field_a = new byte[var4_int];
              break L2;
            }
            L5: {
              var5 = param0.h(90);
              if (param2) {
                System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param2) {
                break L6;
              } else {
                if (((um) this).field_b == var5) {
                  break L6;
                } else {
                  throw new IllegalStateException("had received " + ((um) this).field_b + ", got offset " + var5 + " total len: " + var4_int);
                }
              }
            }
            L7: {
              var6 = param0.e(1869);
              if (!param2) {
                break L7;
              } else {
                System.out.println("Receiving: " + var6);
                break L7;
              }
            }
            L8: {
              param0.a(var5, ((um) this).field_a, (byte) -59, var6);
              ((um) this).field_b = ((um) this).field_b + var6;
              if (((um) this).field_a.length > ((um) this).field_b) {
                break L8;
              } else {
                ((um) this).field_d = true;
                break L8;
              }
            }
            L9: {
              if (!param2) {
                break L9;
              } else {
                if (((um) this).field_d) {
                  System.out.println("Ready!");
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            if (param1 > 68) {
              break L0;
            } else {
              field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("um.C(");
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
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
    }

    final int c(int param0) {
        if (param0 == 0) {
          if (!((um) this).field_d) {
            if (null == ((um) this).field_a) {
              return 0;
            } else {
              return ((um) this).field_b * 100 / ((um) this).field_a.length;
            }
          } else {
            return 0;
          }
        } else {
          return -31;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
