/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

abstract class jk extends we implements ga {
    static int field_B;
    static int field_A;
    static gk field_z;
    static li[] field_C;
    static a field_x;
    static String[] field_y;
    static int field_u;
    we field_v;
    static int field_w;

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a(param0);
        if (((jk) this).field_v != null) {
            var3 = ((jk) this).field_v.a((byte) 54);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((jk) this).e(109);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((jk) this).field_v == null) {
                  break L3;
                } else {
                  if (!((jk) this).field_v.a(param0, param1)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jk.AA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    we a(int param0) {
        we var2 = ((jk) this).field_v;
        if (var2 != null) {
            if (var2.b((byte) 72)) {
                return var2;
            }
        }
        if (param0 == -1) {
            return null;
        }
        field_x = null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            field_C = null;
        }
        return null != ((jk) this).a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
            field_u = 112;
        }
        if (((jk) this).field_v != null) {
            ((jk) this).field_v.g(-1);
        }
    }

    private final boolean a(byte param0, we param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -18) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((jk) this).field_v == null) {
                  break L3;
                } else {
                  if (((jk) this).field_v.b((byte) 74)) {
                    break L3;
                  } else {
                    if (!((jk) this).field_v.a(param1, false)) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jk.G(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if (!((jk) this).a(param2, (byte) -122, param3, param1)) {
                break L1;
              } else {
                ((jk) this).a(param2, param3, param1, -37);
                ((jk) this).b(param2, -25844, param1, param3);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                jk.a(44, true, 113);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jk.T(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, we param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((jk) this).field_v) {
                  break L2;
                } else {
                  if (((jk) this).field_v.b((byte) 79)) {
                    break L2;
                  } else {
                    if (!((jk) this).field_v.a(param1, false)) {
                      break L2;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jk.K(").append(-12).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    jk(int param0, int param1, int param2, int param3, ml param4, of param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -1625) {
                break L1;
              } else {
                field_B = -20;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((jk) this).field_v) {
                  break L3;
                } else {
                  if (!((jk) this).field_v.a(((jk) this).field_e + param0, param1, param2, -1625, param4, param5, param6 - -((jk) this).field_r)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("jk.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == 0) {
            if (null != ((jk) this).field_h) {
                ((jk) this).field_h.a(true, (we) this, param2, param3, 20);
            }
        }
        if (param0 != 30) {
            return;
        }
        if (((jk) this).field_v != null) {
            ((jk) this).field_v.a(30, param1, ((jk) this).field_e + param2, ((jk) this).field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$26 = param2.append(10);
              if (param1 == -25844) {
                break L1;
              } else {
                field_A = 50;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int > param3) {
                L3: {
                  if (null == ((jk) this).field_v) {
                    StringBuilder discarded$27 = param2.append("null");
                    break L3;
                  } else {
                    StringBuilder discarded$28 = ((jk) this).field_v.a(false, param2, param0, param3 + 1);
                    break L3;
                  }
                }
                break L0;
              } else {
                StringBuilder discarded$29 = param2.append(32);
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("jk.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
    }

    public static void c() {
        field_y = null;
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -14);
              if (((jk) this).field_v != null) {
                ((jk) this).field_v.a(param0, param1 - -((jk) this).field_e, ((jk) this).field_r + param2, (byte) -86);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("jk.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + -40 + 41);
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -59;
        }
        return ((jk) this).field_v == null ? 0 : ((jk) this).field_v.f(param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((jk) this).i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
            ((jk) this).a(49, -102, 107, 123);
        }
        if (null != ((jk) this).field_v) {
            ((jk) this).field_v.e(param0);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_12_0 = 0;
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
              if (((jk) this).field_v == null) {
                break L1;
              } else {
                if (!((jk) this).field_v.b((byte) 126)) {
                  break L1;
                } else {
                  if (((jk) this).field_v.a(param0, param1, param2, 124)) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param2;
            if (80 == var5_int) {
              L2: {
                if (dl.field_c[81]) {
                  stackOut_10_0 = this.a((byte) -94, param0);
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = this.a(-12, param0);
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0;
            } else {
              var5_int = 9 % ((37 - param3) / 50);
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("jk.V(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_13_0 != 0;
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((jk) this).field_v) {
                break L1;
              } else {
                ((jk) this).field_v.a(param0 + ((jk) this).field_e, param1, param2, param3, 0, ((jk) this).field_r + param5);
                break L1;
              }
            }
            L2: {
              if (param4 == 0) {
                break L2;
              } else {
                var8 = null;
                boolean discarded$2 = this.a((byte) -34, (we) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("jk.I(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        String stackIn_83_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        String stackOut_82_2 = null;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        String stackOut_76_2 = null;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String stackOut_75_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_89_0 = 0;
        String stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          wd.field_g = true;
          ud.field_b = param2;
          if (0 != ud.field_b) {
            if (ud.field_b != 1) {
              if (ud.field_b == 2) {
                var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[1], pd.field_h, true), true, vi.field_b);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3_int) {
                      break L2;
                    } else {
                      if ("<%0>".equals((Object) (Object) vi.field_b[var5])) {
                        var4 = var5;
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    wi.field_b = new String[var4];
                    gl.a((Object[]) (Object) vi.field_b, 0, (Object[]) (Object) wi.field_b, 0, var4);
                    ud.field_e = new String[-1 + var3_int + -var4];
                    gl.a((Object[]) (Object) vi.field_b, 1 + var4, (Object[]) (Object) ud.field_e, 0, var3_int + -var4 - 1);
                    var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[1], wa.field_d, true), true, vi.field_b);
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) vi.field_b[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          uj.field_c = new String[var4];
                          gl.a((Object[]) (Object) vi.field_b, 0, (Object[]) (Object) uj.field_c, 0, var4);
                          re.field_a = new String[var3_int - (var4 - -1)];
                          gl.a((Object[]) (Object) vi.field_b, 1 + var4, (Object[]) (Object) re.field_a, 0, -1 + var3_int + -var4);
                          if (uj.field_c.length > wi.field_b.length) {
                            stackOut_65_0 = uj.field_c.length;
                            stackIn_66_0 = stackOut_65_0;
                            break L5;
                          } else {
                            stackOut_64_0 = wi.field_b.length;
                            stackIn_66_0 = stackOut_64_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_66_0;
                          if (ud.field_e.length >= re.field_a.length) {
                            stackOut_68_0 = ud.field_e.length;
                            stackIn_69_0 = stackOut_68_0;
                            break L6;
                          } else {
                            stackOut_67_0 = re.field_a.length;
                            stackIn_69_0 = stackOut_67_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_69_0;
                        var7 = var6 + (var5 + 7);
                        gh.field_a = new int[var7];
                        pl.field_k = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            bi.field_B = new int[2];
                            pl.field_k[0] = qb.field_d;
                            gh.field_a[1] = 0;
                            pl.field_k[1] = jf.field_p;
                            gh.field_a[3] = 1;
                            pl.field_k[4] = sk.field_F;
                            bi.field_B[1] = 2;
                            pl.field_k[2] = ua.field_y;
                            bi.field_B[0] = 5;
                            pl.field_k[3] = uf.field_c;
                            pl.field_k[5] = "";
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                pl.field_k[6 - -var5] = null;
                                gh.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var6 <= var8) {
                                    fb.field_n = pf.a(0);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_80_0 = pl.field_k;
                                      stackOut_80_1 = var8 + 7 + var5;
                                      stackIn_82_0 = stackOut_80_0;
                                      stackIn_82_1 = stackOut_80_1;
                                      stackIn_81_0 = stackOut_80_0;
                                      stackIn_81_1 = stackOut_80_1;
                                      if (re.field_a.length <= var8) {
                                        stackOut_82_0 = (String[]) (Object) stackIn_82_0;
                                        stackOut_82_1 = stackIn_82_1;
                                        stackOut_82_2 = "";
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        stackIn_83_2 = stackOut_82_2;
                                        break L10;
                                      } else {
                                        stackOut_81_0 = (String[]) (Object) stackIn_81_0;
                                        stackOut_81_1 = stackIn_81_1;
                                        stackOut_81_2 = re.field_a[var8];
                                        stackIn_83_0 = stackOut_81_0;
                                        stackIn_83_1 = stackOut_81_1;
                                        stackIn_83_2 = stackOut_81_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_83_0[stackIn_83_1] = stackIn_83_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_74_0 = pl.field_k;
                                  stackOut_74_1 = var8 + 6;
                                  stackIn_76_0 = stackOut_74_0;
                                  stackIn_76_1 = stackOut_74_1;
                                  stackIn_75_0 = stackOut_74_0;
                                  stackIn_75_1 = stackOut_74_1;
                                  if (0 <= -var5 + var8 + uj.field_c.length) {
                                    stackOut_76_0 = (String[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = uj.field_c[uj.field_c.length + var8 - var5];
                                    stackIn_77_0 = stackOut_76_0;
                                    stackIn_77_1 = stackOut_76_1;
                                    stackIn_77_2 = stackOut_76_2;
                                    break L11;
                                  } else {
                                    stackOut_75_0 = (String[]) (Object) stackIn_75_0;
                                    stackOut_75_1 = stackIn_75_1;
                                    stackOut_75_2 = "";
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_77_2 = stackOut_75_2;
                                    break L11;
                                  }
                                }
                                stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            gh.field_a[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (ud.field_b != 3) {
                  if (ud.field_b != 4) {
                    if (ud.field_b == 5) {
                      var3_int = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
                      var4 = 3 + var3_int;
                      gh.field_a = new int[var4];
                      pl.field_k = new String[var4];
                      var5 = 0;
                      L12: while (true) {
                        if (var4 <= var5) {
                          bi.field_B = new int[2];
                          var5 = 0;
                          L13: while (true) {
                            if (var5 >= var3_int) {
                              pl.field_k[var4 - 3] = "";
                              pl.field_k[var4 + -2] = j.field_b;
                              gh.field_a[var4 + -2] = 0;
                              bi.field_B[0] = 3;
                              pl.field_k[var4 - 1] = db.field_e;
                              gh.field_a[-1 + var4] = 1;
                              bi.field_B[1] = 5;
                              break L0;
                            } else {
                              pl.field_k[var5] = vi.field_b[var5];
                              var5++;
                              continue L13;
                            }
                          }
                        } else {
                          gh.field_a[var5] = -1;
                          var5++;
                          continue L12;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var3_int = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
                    var4 = var3_int + 2;
                    pl.field_k = new String[var4];
                    gh.field_a = new int[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var4 <= var5) {
                        bi.field_B = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var3_int <= var5) {
                            pl.field_k[-2 + var4] = "";
                            pl.field_k[-1 + var4] = db.field_e;
                            gh.field_a[-1 + var4] = 0;
                            bi.field_B[0] = 5;
                            break L0;
                          } else {
                            pl.field_k[var5] = vi.field_b[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        gh.field_a[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  L16: {
                    if (rc.field_k.field_q) {
                      var3_int = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
                      break L16;
                    } else {
                      var3_int = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
                      break L16;
                    }
                  }
                  var4 = 2 - -var3_int;
                  gh.field_a = new int[var4];
                  pl.field_k = new String[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (var5 >= var4) {
                      bi.field_B = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var3_int <= var5) {
                          pl.field_k[var4 + -2] = "";
                          pl.field_k[var4 + -1] = db.field_e;
                          gh.field_a[-1 + var4] = 0;
                          bi.field_B[0] = 5;
                          break L0;
                        } else {
                          pl.field_k[var5] = vi.field_b[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      gh.field_a[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
              var4 = var3_int + 2;
              pl.field_k = new String[var4];
              gh.field_a = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  bi.field_B = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3_int) {
                      pl.field_k[-2 + var4] = "";
                      pl.field_k[-1 + var4] = db.field_e;
                      gh.field_a[var4 + -1] = 0;
                      bi.field_B[0] = 5;
                      break L0;
                    } else {
                      pl.field_k[var5] = vi.field_b[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  gh.field_a[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
            var4 = 3 - -var3_int;
            gh.field_a = new int[var4];
            pl.field_k = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                bi.field_B = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3_int) {
                    pl.field_k[-3 + var4] = "";
                    pl.field_k[var4 - 2] = qd.field_d;
                    gh.field_a[-2 + var4] = 0;
                    bi.field_B[0] = 4;
                    pl.field_k[-1 + var4] = db.field_e;
                    gh.field_a[-1 + var4] = 1;
                    bi.field_B[1] = 5;
                    break L0;
                  } else {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                gh.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        sj.field_f.field_i = bi.field_B.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= pl.field_k.length) {
            L24: {
              if (ud.field_b != 2) {
                break L24;
              } else {
                var10 = wi.field_b;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = ud.field_e;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = hh.a((byte) -126, var13, false);
                          if (var3_int >= var7) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = hh.a((byte) -109, var12, false);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            h.field_b = -(var3_int >> 1) + (jc.field_b - -var3_int);
            sc.field_g = jc.field_b + -(var3_int >> 1);
            fd.field_s = (ud.field_a + vf.field_b << 1) * sj.field_f.field_i;
            if (param0 < -92) {
              var4 = 0;
              L29: while (true) {
                if (pl.field_k.length <= var4) {
                  fb.field_k = -(fd.field_s >> 1) + fl.field_b;
                  ja.field_A = new int[pl.field_k.length][];
                  var4 = 0;
                  var5 = fb.field_k;
                  L30: while (true) {
                    if (pl.field_k.length <= var4) {
                      L31: {
                        if (ud.field_b == 2) {
                          sj.field_f.a(-1, -1, 0, param1);
                          break L31;
                        } else {
                          sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = gh.field_a[var4];
                        if (var6 < 0) {
                          var5 = var5 + gi.field_a;
                          break L32;
                        } else {
                          var7 = hh.a((byte) -115, pl.field_k[var4], true);
                          var8 = jc.field_b - (var7 >> 1);
                          var5 = var5 + ud.field_a;
                          ja.field_A[var4] = new int[4];
                          ja.field_A[var4][0] = -pl.field_h + var8;
                          ja.field_A[var4][1] = var5;
                          ja.field_A[var4][2] = (pl.field_h << 1) + var7;
                          var5 = var5 + ((vf.field_b << 1) + (ud.field_a + hb.field_n));
                          ja.field_A[var4][3] = hb.field_n - -(vf.field_b << 1);
                          break L32;
                        }
                      }
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  L33: {
                    stackOut_105_0 = fd.field_s;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if (gh.field_a[var4] >= 0) {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = hb.field_n;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      break L33;
                    } else {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = gi.field_a;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      break L33;
                    }
                  }
                  fd.field_s = stackIn_108_0 + stackIn_108_1;
                  var4++;
                  continue L29;
                }
              }
            } else {
              return;
            }
          } else {
            L34: {
              stackOut_87_0 = -108;
              stackOut_87_1 = pl.field_k[var4];
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              if (gh.field_a[var4] < 0) {
                stackOut_89_0 = stackIn_89_0;
                stackOut_89_1 = (String) (Object) stackIn_89_1;
                stackOut_89_2 = 0;
                stackIn_90_0 = stackOut_89_0;
                stackIn_90_1 = stackOut_89_1;
                stackIn_90_2 = stackOut_89_2;
                break L34;
              } else {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = (String) (Object) stackIn_88_1;
                stackOut_88_2 = 1;
                stackIn_90_0 = stackOut_88_0;
                stackIn_90_1 = stackOut_88_1;
                stackIn_90_2 = stackOut_88_2;
                break L34;
              }
            }
            L35: {
              var5 = hh.a((byte) stackIn_90_0, stackIn_90_1, stackIn_90_2 != 0);
              if (var3_int >= var5) {
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param6 < -109) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$2 = this.a((byte) -23, (we) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((jk) this).field_v) {
                  break L3;
                } else {
                  if (!((jk) this).field_v.b((byte) 43)) {
                    break L3;
                  } else {
                    if (!((jk) this).field_v.a(param0, param1, param2, param3, param4, param5, -127)) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("jk.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
