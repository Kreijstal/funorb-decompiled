/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends ck {
    boolean field_q;
    static boolean field_v;
    static ul field_w;
    boolean field_p;
    int field_A;
    static int field_o;
    int field_x;
    int field_s;
    int field_B;
    int field_u;
    int field_y;
    int field_r;
    boolean field_z;
    static int field_t;

    public static void a(byte param0) {
        try {
            field_w = null;
            if (param0 >= -102) {
                u discarded$0 = je.a(-111, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "je.A(" + param0 + ')');
        }
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        u stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (u) (Object) stackIn_4_0;
            } else {
              if (param0 >= 57) {
                var2 = new u(param1, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
                uh.a(9324);
                stackOut_8_0 = (u) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (u) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("je.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    je(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((je) this).field_x = param2;
              ((je) this).field_s = param0;
              ((je) this).field_q = false;
              ((je) this).field_A = param1;
              ((je) this).field_p = false;
              var4_int = 50;
              ((je) this).field_z = false;
              if (((je) this).field_s != 6) {
                break L1;
              } else {
                var4_int = 5;
                break L1;
              }
            }
            L2: {
              if (((je) this).field_s != 5) {
                break L2;
              } else {
                ((je) this).field_z = true;
                var4_int = 125;
                break L2;
              }
            }
            L3: {
              if (((je) this).field_s == 12) {
                ((je) this).field_z = false;
                var4_int = 5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((je) this).field_s == 3) {
                ((je) this).field_z = true;
                var4_int = 100;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 == ((je) this).field_s) {
                L6: {
                  var4_int = 10;
                  if (((je) this).field_A == 0) {
                    var4_int = 25;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (1 == ((je) this).field_A) {
                    var4_int = 20;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (((je) this).field_A != 2) {
                    break L8;
                  } else {
                    var4_int = 35;
                    break L8;
                  }
                }
                L9: {
                  if (3 == ((je) this).field_A) {
                    var4_int = 50;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (6 != ((je) this).field_A) {
                    break L10;
                  } else {
                    var4_int = 40;
                    ((je) this).field_z = true;
                    break L10;
                  }
                }
                L11: {
                  if (((je) this).field_A != 7) {
                    break L11;
                  } else {
                    var4_int = 50;
                    ((je) this).field_z = true;
                    break L11;
                  }
                }
                L12: {
                  if (8 == ((je) this).field_A) {
                    var4_int = 100;
                    ((je) this).field_z = true;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (((je) this).field_A != 9) {
                    break L13;
                  } else {
                    var4_int = 30;
                    ((je) this).field_z = true;
                    break L13;
                  }
                }
                L14: {
                  if (((je) this).field_A == 10) {
                    var4_int = 20;
                    ((je) this).field_z = true;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (((je) this).field_A != 4) {
                    break L15;
                  } else {
                    var4_int = 75;
                    break L15;
                  }
                }
                if (5 == ((je) this).field_A) {
                  var4_int = 75;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L16: {
              if (((je) this).field_s == 7) {
                ((je) this).field_z = true;
                var4_int = 25;
                if (3 == ((je) this).field_A) {
                  var4_int = 100;
                  break L16;
                } else {
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L17: {
              if (((je) this).field_s != 8) {
                break L17;
              } else {
                var4_int = 25;
                ((je) this).field_z = true;
                break L17;
              }
            }
            L18: {
              if (((je) this).field_s != 9) {
                break L18;
              } else {
                ((je) this).field_z = true;
                var4_int = 25;
                break L18;
              }
            }
            L19: {
              if (11 == ((je) this).field_s) {
                var4_int = 25;
                ((je) this).field_z = false;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (((je) this).field_s != 10) {
                break L20;
              } else {
                var4_int = 1;
                break L20;
              }
            }
            ((je) this).field_r = var4_int + ((je) this).field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "je.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_o = 0;
        field_w = new ul();
    }
}
