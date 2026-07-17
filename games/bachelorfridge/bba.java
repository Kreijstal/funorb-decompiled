/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba {
    int field_d;
    int field_c;
    boolean field_e;
    private boolean field_b;
    private hs field_a;

    final void a(byte param0) {
        ((bba) this).field_d = ((bba) this).field_a.field_b - 2;
        if (param0 >= -62) {
            ((bba) this).field_e = false;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 10) {
          if (null != ((bba) this).field_a) {
            if (((bba) this).field_b) {
              if (0 < ((bba) this).field_d) {
                ((bba) this).field_d = ((bba) this).field_d - ((bba) this).field_c;
                return;
              } else {
                return;
              }
            } else {
              if (((bba) this).field_a.field_d != 6) {
                if (((bba) this).field_a.field_d != 5) {
                  if (10 == ((bba) this).field_a.field_d) {
                    if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                      if (((bba) this).field_a.field_d != 6) {
                        if (((bba) this).field_b) {
                          ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                          return;
                        } else {
                          ((bba) this).field_e = true;
                          ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                          return;
                        }
                      } else {
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      }
                    } else {
                      ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                      return;
                    }
                  } else {
                    if (-2 + ((bba) this).field_a.field_b <= ((bba) this).field_d) {
                      ((bba) this).field_d = 0;
                      return;
                    } else {
                      ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                      return;
                    }
                  }
                } else {
                  if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                    if (((bba) this).field_a.field_d != 6) {
                      if (((bba) this).field_b) {
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      } else {
                        ((bba) this).field_e = true;
                        ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                        return;
                      }
                    } else {
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    }
                  } else {
                    ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                    return;
                  }
                }
              } else {
                if (((bba) this).field_d >= ((bba) this).field_a.field_b - 2) {
                  if (((bba) this).field_a.field_d != 6) {
                    if (((bba) this).field_b) {
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    } else {
                      ((bba) this).field_e = true;
                      ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                      return;
                    }
                  } else {
                    ((bba) this).field_d = ((bba) this).field_a.field_b + -2;
                    return;
                  }
                } else {
                  ((bba) this).field_d = ((bba) this).field_d + ((bba) this).field_c;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final nla a(int param0) {
        if (((bba) this).field_a != null) {
          if (param0 >= -94) {
            ((bba) this).field_b = true;
            return ((bba) this).field_a.a(((bba) this).field_d, (byte) 107);
          } else {
            return ((bba) this).field_a.a(((bba) this).field_d, (byte) 107);
          }
        } else {
          return null;
        }
    }

    bba(hs param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((bba) this).field_c = 1;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((bba) this).field_b = stackIn_4_1 != 0;
            ((bba) this).field_a = param0;
            if (((bba) this).field_b) {
              ((bba) this).a((byte) -115);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bba.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    static {
    }
}
