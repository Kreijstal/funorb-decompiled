/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tg extends fi {
    boolean field_z;
    static wg field_D;
    static int[] field_A;
    private boolean field_E;
    static String field_y;
    private boolean field_B;
    static int field_x;
    boolean field_C;

    tg(String param0, ol param1, cd param2) {
        super(param0, param1, param2);
        ((tg) this).field_E = false;
        ((tg) this).field_B = true;
        ((tg) this).field_C = true;
    }

    final void c(int param0) {
        if (param0 == -1) {
          if (((tg) this).field_E) {
            ((tg) this).field_E = false;
            if (((tg) this).field_o != null) {
              if (!(((tg) this).field_o instanceof t)) {
                return;
              } else {
                ((t) (Object) ((tg) this).field_o).a(((tg) this).field_E, (fi) this, 97);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 125, param2, param3);
              if (param1 > 113) {
                break L1;
              } else {
                ((tg) this).c(-62);
                break L1;
              }
            }
            L2: {
              if (((tg) this).field_i == 0) {
                break L2;
              } else {
                if (((tg) this).field_i != j.field_e) {
                  L3: {
                    if (!((tg) this).a(param3, nl.field_u, hk.field_Jb, (byte) 79, param0)) {
                      break L3;
                    } else {
                      if (j.field_e != 0) {
                        break L3;
                      } else {
                        ((tg) this).b((byte) 48, ((tg) this).field_i, -param3 + hk.field_Jb, nl.field_u + -param0);
                        break L3;
                      }
                    }
                  }
                  ((tg) this).a(hk.field_Jb, nl.field_u, param0, param2, param3, 99);
                  break L2;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("tg.E(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
    }

    void b(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (null != ((tg) this).field_o) {
          if (!(((tg) this).field_o instanceof ta)) {
            var5 = 61 / ((param0 - -33) / 42);
            return;
          } else {
            ((ta) (Object) ((tg) this).field_o).a(12085, (tg) this, param1, param2, param3);
            var5 = 61 / ((param0 - -33) / 42);
            return;
          }
        } else {
          var5 = 61 / ((param0 - -33) / 42);
          return;
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            tg.a((byte) 76);
            return ((tg) this).field_E;
        }
        return ((tg) this).field_E;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null == ((tg) this).field_o) {
                break L1;
              } else {
                if (!(((tg) this).field_o instanceof pk)) {
                  break L1;
                } else {
                  ((pk) (Object) ((tg) this).field_o).a(param0, param1, param4, -20637, (tg) this, param2);
                  break L1;
                }
              }
            }
            ((tg) this).field_i = 0;
            if (param5 >= 73) {
              break L0;
            } else {
              var8 = null;
              StringBuilder discarded$2 = ((tg) this).a((Hashtable) null, (byte) 73, -4, (StringBuilder) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("tg.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
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
            if (!((tg) this).field_C) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((tg) this).field_B) {
                param0.c(-1);
                if (param1 == -8515) {
                  L1: {
                    ((tg) this).field_E = true;
                    if (((tg) this).field_o == null) {
                      break L1;
                    } else {
                      if (((tg) this).field_o instanceof t) {
                        ((t) (Object) ((tg) this).field_o).a(((tg) this).field_E, (fi) this, 91);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("tg.G(");
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
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
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
        StringBuilder stackOut_8_0 = null;
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
        try {
          L0: {
            L1: {
              if (((tg) this).a(param0, param2, 34, param3)) {
                L2: {
                  ((tg) this).a(param2, param0, (byte) 126, param3);
                  if (!((tg) this).field_z) {
                    break L2;
                  } else {
                    StringBuilder discarded$4 = param3.append(" active");
                    break L2;
                  }
                }
                if (((tg) this).field_C) {
                  break L1;
                } else {
                  StringBuilder discarded$5 = param3.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 >= 118) {
                break L3;
              } else {
                ((tg) this).field_z = true;
                break L3;
              }
            }
            stackOut_8_0 = (StringBuilder) param3;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("tg.MA(");
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
            return;
        }
        field_y = null;
        field_A = null;
        field_D = null;
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!((tg) this).field_C) {
                break L1;
              } else {
                if (((tg) this).a(param5, param6, param4, (byte) 58, param3)) {
                  L2: {
                    boolean discarded$2 = ((tg) this).a(param0, -8515);
                    ((tg) this).field_i = param1;
                    if (((tg) this).field_o == null) {
                      break L2;
                    } else {
                      if (((tg) this).field_o instanceof pk) {
                        ((pk) (Object) ((tg) this).field_o).a(param1, (tg) this, param6, param4, (byte) 111, param5, param3);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (!param2) {
                break L3;
              } else {
                field_y = null;
                break L3;
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("tg.NA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    tg(String param0, cd param1) {
        this(param0, vi.field_g.field_l, param1);
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
              var5_int = -117 % ((-75 - param3) / 36);
              if (!((tg) this).f(true)) {
                break L1;
              } else {
                L2: {
                  if (84 == param2) {
                    break L2;
                  } else {
                    if (83 != param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((tg) this).b((byte) -97, 1, -1, -1);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("tg.AA(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0 != 0;
    }

    protected tg() {
        ((tg) this).field_E = false;
        ((tg) this).field_B = true;
        ((tg) this).field_C = true;
        ((tg) this).field_w = vi.field_g.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0;
        field_y = "Withdraw request to join <%0>'s game";
    }
}
