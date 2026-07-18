/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fb extends mf {
    boolean field_I;
    private boolean field_J;
    static String field_F;
    private boolean field_E;
    static String field_D;
    static jc field_L;
    boolean field_H;
    static String field_G;
    static int field_K;

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
            if (null != ((fb) this).field_p) {
                if (((fb) this).field_p instanceof te) {
                    ((te) (Object) ((fb) this).field_p).a((fb) this, param0, param5, 8563, param3, param2);
                }
            }
            ((fb) this).field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "fb.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -91, param2, param3);
              if (((fb) this).field_q == 0) {
                break L1;
              } else {
                if (~wh.field_f == ~((fb) this).field_q) {
                  break L1;
                } else {
                  L2: {
                    if (!((fb) this).a(rf.field_b, param3, param0, (byte) -117, hn.field_k)) {
                      break L2;
                    } else {
                      if (wh.field_f != 0) {
                        break L2;
                      } else {
                        ((fb) this).a(-param3 + rf.field_b, false, ((fb) this).field_q, -param0 + hn.field_k);
                        break L2;
                      }
                    }
                  }
                  ((fb) this).a(rf.field_b, param2, param0, hn.field_k, 0, param3);
                  break L1;
                }
              }
            }
            if (param1 < -6) {
              break L0;
            } else {
              ((fb) this).field_H = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("fb.G(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!((fb) this).d((byte) -67)) {
                break L1;
              } else {
                L2: {
                  if (84 == param1) {
                    break L2;
                  } else {
                    if (param1 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((fb) this).a(-1, false, 1, -1);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            }
            if (param2 == -1) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fb.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void h(int param0) {
        field_F = null;
        field_L = null;
        field_D = null;
        field_G = null;
        if (param0 != -1) {
            fb.h(-5);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                field_K = 55;
                break L1;
              }
            }
            L2: {
              if (((fb) this).a(param1, param0, param2, -119)) {
                L3: {
                  ((fb) this).a(param0, param2, param1, false);
                  if (((fb) this).field_I) {
                    StringBuilder discarded$4 = param2.append(" active");
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (((fb) this).field_H) {
                  break L2;
                } else {
                  StringBuilder discarded$5 = param2.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_9_0 = (StringBuilder) param2;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fb.WA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
            field_G = null;
            return ((fb) this).field_J;
        }
        return ((fb) this).field_J;
    }

    final void d(int param0) {
        int var2 = 0;
        if (((fb) this).field_J) {
          ((fb) this).field_J = false;
          if (null != ((fb) this).field_p) {
            if (((fb) this).field_p instanceof sd) {
              ((sd) (Object) ((fb) this).field_p).a((mf) this, ((fb) this).field_J, (byte) 34);
              var2 = 42 % ((34 - param0) / 57);
              return;
            } else {
              var2 = 42 % ((34 - param0) / 57);
              return;
            }
          } else {
            var2 = 42 % ((34 - param0) / 57);
            return;
          }
        } else {
          var2 = 42 % ((34 - param0) / 57);
          return;
        }
    }

    fb(String param0, rg param1) {
        this(param0, a.field_a.field_a, param1);
    }

    fb(String param0, jm param1, rg param2) {
        super(param0, param1, param2);
        ((fb) this).field_J = false;
        ((fb) this).field_H = true;
        ((fb) this).field_E = true;
    }

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
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
            L1: {
              if (param3 == 88) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$4 = ((fb) this).a(-48, (mf) null);
                break L1;
              }
            }
            L2: {
              if (!((fb) this).field_H) {
                break L2;
              } else {
                if (!((fb) this).a(param2, param5, param6, (byte) -117, param1)) {
                  break L2;
                } else {
                  L3: {
                    boolean discarded$5 = ((fb) this).a(0, param4);
                    ((fb) this).field_q = param0;
                    if (null == ((fb) this).field_p) {
                      break L3;
                    } else {
                      if (((fb) this).field_p instanceof te) {
                        ((te) (Object) ((fb) this).field_p).a(param0, param2, param5, (byte) -79, param6, (fb) this, param1);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("fb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              if (!((fb) this).field_H) {
                break L1;
              } else {
                if (!((fb) this).field_E) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 0) {
                      break L2;
                    } else {
                      field_D = null;
                      break L2;
                    }
                  }
                  L3: {
                    param1.d(param0 + 91);
                    ((fb) this).field_J = true;
                    if (((fb) this).field_p == null) {
                      break L3;
                    } else {
                      if (!(((fb) this).field_p instanceof sd)) {
                        break L3;
                      } else {
                        ((sd) (Object) ((fb) this).field_p).a((mf) this, ((fb) this).field_J, (byte) 34);
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("fb.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    void a(int param0, boolean param1, int param2, int param3) {
        L0: {
          if (null == ((fb) this).field_p) {
            break L0;
          } else {
            if (((fb) this).field_p instanceof mj) {
              ((mj) (Object) ((fb) this).field_p).a((fb) this, param2, param0, param3, -24221);
              break L0;
            } else {
              if (!param1) {
                return;
              } else {
                ((fb) this).d(-101);
                return;
              }
            }
          }
        }
        if (param1) {
          ((fb) this).d(-101);
          return;
        } else {
          return;
        }
    }

    protected fb() {
        ((fb) this).field_J = false;
        ((fb) this).field_H = true;
        ((fb) this).field_E = true;
        ((fb) this).field_n = a.field_a.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "<%0>'s game";
        field_F = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_G = "Seriously offensive language";
        field_L = new jc();
        field_K = 0;
    }
}
