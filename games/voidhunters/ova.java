/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ova {
    private int field_a;
    private byte[] field_c;
    private int field_e;
    private int field_d;
    private int field_b;
    private int field_f;

    final boolean a(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = null;
            ((ova) this).a((byte[]) null, 29);
            if (((ova) this).field_c != null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ova) this).field_c != null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte[] param0, int param1) {
        try {
            ((ova) this).field_c = param0;
            ((ova) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ova.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(faa param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (null == ((ova) this).field_c) {
              return;
            } else {
              int fieldTemp$1 = ((ova) this).field_a - 1;
              ((ova) this).field_a = ((ova) this).field_a - 1;
              if (fieldTemp$1 <= 0) {
                L1: {
                  ((ova) this).field_a = ((ova) this).field_a + ((ova) this).field_f;
                  if (!param1) {
                    break L1;
                  } else {
                    System.out.println("updating datasender, total " + ((ova) this).field_c.length);
                    break L1;
                  }
                }
                L2: {
                  var4_int = param0.field_h.length - param0.field_e;
                  if (param2 > 121) {
                    break L2;
                  } else {
                    ((ova) this).field_e = 8;
                    break L2;
                  }
                }
                L3: {
                  var5 = -((ova) this).field_d + var4_int;
                  if (!param1) {
                    break L3;
                  } else {
                    System.out.println("sendable_now " + var5);
                    break L3;
                  }
                }
                if (var5 > 0) {
                  L4: {
                    param0.h(24335, ((ova) this).field_e);
                    param0.field_e = param0.field_e + 2;
                    var6 = param0.field_e;
                    param0.d(((ova) this).field_c.length, 332614536);
                    param0.d(((ova) this).field_b, 332614536);
                    if (var5 <= ((ova) this).field_c.length + -((ova) this).field_b) {
                      break L4;
                    } else {
                      var5 = -((ova) this).field_b + ((ova) this).field_c.length;
                      break L4;
                    }
                  }
                  L5: {
                    param0.a(var5, true);
                    param0.a(((ova) this).field_b, ((ova) this).field_c, -1, var5);
                    param0.a(param0.field_e + -var6, -124);
                    ((ova) this).field_b = ((ova) this).field_b + var5;
                    if (((ova) this).field_b < ((ova) this).field_c.length) {
                      break L5;
                    } else {
                      ((ova) this).field_c = null;
                      if (param1) {
                        System.out.println("done sending this data.");
                        break L5;
                      } else {
                        return;
                      }
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ova.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    ova(int param0) {
        ((ova) this).field_d = 1024;
        ((ova) this).field_f = 8;
        ((ova) this).field_a = 0;
        ((ova) this).field_e = param0;
    }

    static {
    }
}
