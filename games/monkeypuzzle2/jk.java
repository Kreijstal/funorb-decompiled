/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        if (this.field_v != null) {
            var3 = this.field_v.a((byte) 54);
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
                this.e(109);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (!this.field_v.a(param0, param1)) {
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
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("jk.AA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    we a(int param0) {
        we var2 = this.field_v;
        if (var2 != null) {
            if (var2.b((byte) 72)) {
                return var2;
            }
        }
        if (param0 == -1) {
            return null;
        }
        field_x = (a) null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            field_C = (li[]) null;
        }
        return null != this.a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
            field_u = 112;
        }
        if (this.field_v != null) {
            this.field_v.g(-1);
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
                field_C = (li[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 74)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("jk.G(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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
              if (!this.a(param2, (byte) -122, param3, param1)) {
                break L1;
              } else {
                this.a(param2, param3, param1, -37);
                this.b(param2, -25844, param1, param3);
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
            stackOut_4_0 = (StringBuilder) (param1);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("jk.T(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, we param1) {
        RuntimeException var3 = null;
        we var4 = null;
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
              if (param0 < -11) {
                break L1;
              } else {
                var4 = (we) null;
                this.a(-19, -80, (we) null, 5, 102, 80);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 79)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
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
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.a(this.field_e + param0, param1, param2, -1625, param4, param5, param6 - -this.field_r)) {
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
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("jk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1)) {
            if (null != this.field_h) {
                this.field_h.a(true, (we) (this), param2, param3, 20);
            }
        }
        if (param0 != 30) {
            return;
        }
        if (this.field_v != null) {
            this.field_v.a(30, param1, this.field_e + param2, this.field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$14 = param2.append('\n');
              if (param1 == -25844) {
                break L1;
              } else {
                field_A = 50;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if ((var5_int ^ -1) < (param3 ^ -1)) {
                      break L5;
                    } else {
                      discarded$15 = param2.append(' ');
                      var5_int++;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (null == this.field_v) {
                    break L4;
                  } else {
                    discarded$16 = this.field_v.a(false, param2, param0, param3 + 1);
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                discarded$17 = param2.append("null");
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("jk.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 != 77) {
            return;
        }
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        we discarded$3 = null;
        RuntimeException var5 = null;
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
              super.a(param0, param1, param2, (byte) -14);
              if (param3 <= -13) {
                break L1;
              } else {
                discarded$3 = this.a(24);
                break L1;
              }
            }
            L2: {
              if (this.field_v != null) {
                this.field_v.a(param0, param1 - -this.field_e, this.field_r + param2, (byte) -86);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("jk.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -59;
        }
        return this.field_v == null ? 0 : this.field_v.f(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
            this.a(49, -102, 107, 123);
        }
        if (null != this.field_v) {
            this.field_v.e(param0 ^ 0);
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
        int decompiledRegionSelector0 = 0;
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
              if (this.field_v == null) {
                break L1;
              } else {
                if (!this.field_v.b((byte) 126)) {
                  break L1;
                } else {
                  if (this.field_v.a(param0, param1, param2, 124)) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5_int = 9 % ((37 - param3) / 50);
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("jk.V(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        boolean discarded$2 = false;
        RuntimeException var7 = null;
        we var8 = null;
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
              if (null == this.field_v) {
                break L1;
              } else {
                this.field_v.a(param0 + this.field_e, param1, param2, param3, 0, this.field_r + param5);
                break L1;
              }
            }
            L2: {
              if (param4 == 0) {
                break L2;
              } else {
                var8 = (we) null;
                discarded$2 = this.a((byte) -34, (we) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7);
            stackOut_5_1 = new StringBuilder().append("jk.I(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        boolean stackIn_79_0 = false;
        int stackIn_85_0 = 0;
        boolean stackIn_91_0 = false;
        int stackIn_97_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        String[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        String[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        String[] stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        String[] stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        String stackIn_118_2 = null;
        String[] stackIn_122_0 = null;
        String[] stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        String[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        String[] stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        String[] stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        String stackIn_126_2 = null;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_133_0 = 0;
        String stackIn_133_1 = null;
        int stackIn_134_0 = 0;
        String stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        String[] stackIn_157_0 = null;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_172_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_78_0 = false;
        int stackOut_84_0 = 0;
        boolean stackOut_90_0 = false;
        int stackOut_96_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        String[] stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        String[] stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        String[] stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        String stackOut_125_2 = null;
        String[] stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        String stackOut_124_2 = null;
        String[] stackOut_121_0 = null;
        String[] stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        int stackOut_122_3 = 0;
        String[] stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        String[] stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        String stackOut_117_2 = null;
        String[] stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        String stackOut_116_2 = null;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        String[] stackOut_156_0 = null;
        int stackOut_130_0 = 0;
        int stackOut_131_0 = 0;
        String stackOut_131_1 = null;
        int stackOut_133_0 = 0;
        String stackOut_133_1 = null;
        int stackOut_133_2 = 0;
        int stackOut_132_0 = 0;
        String stackOut_132_1 = null;
        int stackOut_132_2 = 0;
        int stackOut_137_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_171_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    wd.field_g = true;
                    ud.field_b = param2;
                    if (0 != ud.field_b) {
                      break L4;
                    } else {
                      var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                      var4 = 3 - -var3_int;
                      gh.field_a = new int[var4];
                      pl.field_k = new String[var4];
                      var5 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var4 <= var5) {
                              break L7;
                            } else {
                              gh.field_a[var5] = -1;
                              var5++;
                              if (var9 != 0) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          bi.field_B = new int[2];
                          break L6;
                        }
                        var5 = 0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var5 >= var3_int) {
                                break L10;
                              } else {
                                pl.field_k[var5] = vi.field_b[var5];
                                var5++;
                                if (var9 != 0) {
                                  break L9;
                                } else {
                                  if (var9 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            pl.field_k[-3 + var4] = "";
                            pl.field_k[var4 - 2] = qd.field_d;
                            gh.field_a[-2 + var4] = 0;
                            bi.field_B[0] = 4;
                            pl.field_k[-1 + var4] = db.field_e;
                            gh.field_a[-1 + var4] = 1;
                            bi.field_B[1] = 5;
                            break L9;
                          }
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    if (-2 != (ud.field_b ^ -1)) {
                      break L11;
                    } else {
                      var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                      var4 = var3_int + 2;
                      pl.field_k = new String[var4];
                      gh.field_a = new int[var4];
                      var5 = 0;
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (var4 <= var5) {
                              break L14;
                            } else {
                              gh.field_a[var5] = -1;
                              var5++;
                              if (var9 != 0) {
                                break L13;
                              } else {
                                if (var9 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          bi.field_B = new int[1];
                          break L13;
                        }
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            L17: {
                              if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                break L17;
                              } else {
                                pl.field_k[var5] = vi.field_b[var5];
                                var5++;
                                if (var9 != 0) {
                                  break L16;
                                } else {
                                  if (var9 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            pl.field_k[-2 + var4] = "";
                            pl.field_k[-1 + var4] = db.field_e;
                            gh.field_a[var4 + -1] = 0;
                            bi.field_B[0] = 5;
                            break L16;
                          }
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  L18: {
                    if ((ud.field_b ^ -1) == -3) {
                      break L18;
                    } else {
                      L19: {
                        if (ud.field_b != 3) {
                          break L19;
                        } else {
                          L20: {
                            L21: {
                              if (rc.field_k.field_q) {
                                break L21;
                              } else {
                                var3_int = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
                                if (var9 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var3_int = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
                            break L20;
                          }
                          var4 = 2 - -var3_int;
                          gh.field_a = new int[var4];
                          pl.field_k = new String[var4];
                          var5 = 0;
                          L22: while (true) {
                            L23: {
                              L24: {
                                if (var5 >= var4) {
                                  break L24;
                                } else {
                                  gh.field_a[var5] = -1;
                                  var5++;
                                  if (var9 != 0) {
                                    break L23;
                                  } else {
                                    if (var9 == 0) {
                                      continue L22;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                              bi.field_B = new int[1];
                              break L23;
                            }
                            var5 = 0;
                            L25: while (true) {
                              L26: {
                                L27: {
                                  if ((var3_int ^ -1) >= (var5 ^ -1)) {
                                    break L27;
                                  } else {
                                    pl.field_k[var5] = vi.field_b[var5];
                                    var5++;
                                    if (var9 != 0) {
                                      break L26;
                                    } else {
                                      if (var9 == 0) {
                                        continue L25;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                                pl.field_k[var4 + -2] = "";
                                pl.field_k[var4 + -1] = db.field_e;
                                gh.field_a[-1 + var4] = 0;
                                bi.field_B[0] = 5;
                                break L26;
                              }
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      L28: {
                        if ((ud.field_b ^ -1) != -5) {
                          break L28;
                        } else {
                          var3_int = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
                          var4 = var3_int + 2;
                          pl.field_k = new String[var4];
                          gh.field_a = new int[var4];
                          var5 = 0;
                          L29: while (true) {
                            L30: {
                              L31: {
                                if ((var4 ^ -1) >= (var5 ^ -1)) {
                                  break L31;
                                } else {
                                  gh.field_a[var5] = -1;
                                  var5++;
                                  if (var9 != 0) {
                                    break L30;
                                  } else {
                                    if (var9 == 0) {
                                      continue L29;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              bi.field_B = new int[1];
                              break L30;
                            }
                            var5 = 0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if (var3_int <= var5) {
                                    break L34;
                                  } else {
                                    pl.field_k[var5] = vi.field_b[var5];
                                    var5++;
                                    if (var9 != 0) {
                                      break L33;
                                    } else {
                                      if (var9 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                pl.field_k[-2 + var4] = "";
                                pl.field_k[-1 + var4] = db.field_e;
                                gh.field_a[-1 + var4] = 0;
                                bi.field_B[0] = 5;
                                break L33;
                              }
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                      }
                      if (ud.field_b == 5) {
                        var3_int = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
                        var4 = 3 + var3_int;
                        gh.field_a = new int[var4];
                        pl.field_k = new String[var4];
                        var5 = 0;
                        L35: while (true) {
                          L36: {
                            L37: {
                              if (var4 <= var5) {
                                break L37;
                              } else {
                                gh.field_a[var5] = -1;
                                var5++;
                                if (var9 != 0) {
                                  break L36;
                                } else {
                                  if (var9 == 0) {
                                    continue L35;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                            }
                            bi.field_B = new int[2];
                            break L36;
                          }
                          var5 = 0;
                          L38: while (true) {
                            L39: {
                              L40: {
                                if (var5 >= var3_int) {
                                  break L40;
                                } else {
                                  pl.field_k[var5] = vi.field_b[var5];
                                  var5++;
                                  if (var9 != 0) {
                                    break L39;
                                  } else {
                                    if (var9 == 0) {
                                      continue L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                              pl.field_k[var4 - 3] = "";
                              pl.field_k[var4 + -2] = j.field_b;
                              gh.field_a[var4 + -2] = 0;
                              bi.field_B[0] = 3;
                              pl.field_k[var4 - 1] = db.field_e;
                              gh.field_a[-1 + var4] = 1;
                              bi.field_B[1] = 5;
                              break L39;
                            }
                            if (var9 == 0) {
                              break L3;
                            } else {
                              break L18;
                            }
                          }
                        }
                      } else {
                        throw new IllegalArgumentException();
                      }
                    }
                  }
                  var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, pd.field_h, true), true, vi.field_b);
                  var4 = -1;
                  var5 = 0;
                  L41: while (true) {
                    L42: {
                      L43: {
                        if ((var5 ^ -1) <= (var3_int ^ -1)) {
                          break L43;
                        } else {
                          stackOut_78_0 = "<%0>".equals(vi.field_b[var5]);
                          stackIn_85_0 = stackOut_78_0 ? 1 : 0;
                          stackIn_79_0 = stackOut_78_0;
                          if (var9 != 0) {
                            break L42;
                          } else {
                            L44: {
                              if (stackIn_79_0) {
                                var4 = var5;
                                if (var9 == 0) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              } else {
                                break L44;
                              }
                            }
                            var5++;
                            if (var9 == 0) {
                              continue L41;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      stackOut_84_0 = var4 ^ -1;
                      stackIn_85_0 = stackOut_84_0;
                      break L42;
                    }
                    if (stackIn_85_0 == 0) {
                      throw new IllegalStateException();
                    } else {
                      wi.field_b = new String[var4];
                      gl.a(vi.field_b, 0, wi.field_b, 0, var4);
                      ud.field_e = new String[-1 + var3_int + -var4];
                      gl.a(vi.field_b, 1 + var4, ud.field_e, 0, var3_int + -var4 - 1);
                      var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, wa.field_d, true), true, vi.field_b);
                      var4 = -1;
                      var5 = 0;
                      L45: while (true) {
                        L46: {
                          L47: {
                            if (var3_int <= var5) {
                              break L47;
                            } else {
                              stackOut_90_0 = "<%0>".equals(vi.field_b[var5]);
                              stackIn_97_0 = stackOut_90_0 ? 1 : 0;
                              stackIn_91_0 = stackOut_90_0;
                              if (var9 != 0) {
                                break L46;
                              } else {
                                L48: {
                                  if (stackIn_91_0) {
                                    var4 = var5;
                                    if (var9 == 0) {
                                      break L47;
                                    } else {
                                      break L48;
                                    }
                                  } else {
                                    break L48;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          stackOut_96_0 = 0;
                          stackIn_97_0 = stackOut_96_0;
                          break L46;
                        }
                        if (stackIn_97_0 == (var4 ^ -1)) {
                          throw new IllegalStateException();
                        } else {
                          L49: {
                            uj.field_c = new String[var4];
                            gl.a(vi.field_b, 0, uj.field_c, 0, var4);
                            re.field_a = new String[var3_int - (var4 - -1)];
                            gl.a(vi.field_b, 1 + var4, re.field_a, 0, -1 + var3_int + -var4);
                            if (uj.field_c.length > wi.field_b.length) {
                              stackOut_102_0 = uj.field_c.length;
                              stackIn_103_0 = stackOut_102_0;
                              break L49;
                            } else {
                              stackOut_101_0 = wi.field_b.length;
                              stackIn_103_0 = stackOut_101_0;
                              break L49;
                            }
                          }
                          L50: {
                            var5 = stackIn_103_0;
                            if ((ud.field_e.length ^ -1) <= (re.field_a.length ^ -1)) {
                              stackOut_105_0 = ud.field_e.length;
                              stackIn_106_0 = stackOut_105_0;
                              break L50;
                            } else {
                              stackOut_104_0 = re.field_a.length;
                              stackIn_106_0 = stackOut_104_0;
                              break L50;
                            }
                          }
                          var6 = stackIn_106_0;
                          var7 = var6 + (var5 + 7);
                          gh.field_a = new int[var7];
                          pl.field_k = new String[var7];
                          var8 = 0;
                          L51: while (true) {
                            L52: {
                              L53: {
                                if (var8 >= var7) {
                                  break L53;
                                } else {
                                  gh.field_a[var8] = -1;
                                  var8++;
                                  if (var9 != 0) {
                                    break L52;
                                  } else {
                                    if (var9 == 0) {
                                      continue L51;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
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
                              break L52;
                            }
                            var8 = 0;
                            L54: while (true) {
                              L55: {
                                L56: {
                                  L57: {
                                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                                      break L57;
                                    } else {
                                      stackOut_114_0 = pl.field_k;
                                      stackOut_114_1 = var8 + 6;
                                      stackOut_114_2 = 0;
                                      stackOut_114_3 = -var5 + var8 + uj.field_c.length;
                                      stackIn_123_0 = stackOut_114_0;
                                      stackIn_123_1 = stackOut_114_1;
                                      stackIn_123_2 = stackOut_114_2;
                                      stackIn_123_3 = stackOut_114_3;
                                      stackIn_115_0 = stackOut_114_0;
                                      stackIn_115_1 = stackOut_114_1;
                                      stackIn_115_2 = stackOut_114_2;
                                      stackIn_115_3 = stackOut_114_3;
                                      if (var9 != 0) {
                                        L58: while (true) {
                                          L59: {
                                            stackOut_123_0 = (String[]) ((Object) stackIn_123_0);
                                            stackOut_123_1 = stackIn_123_1;
                                            stackIn_125_0 = stackOut_123_0;
                                            stackIn_125_1 = stackOut_123_1;
                                            stackIn_124_0 = stackOut_123_0;
                                            stackIn_124_1 = stackOut_123_1;
                                            if (stackIn_123_2 <= stackIn_123_3) {
                                              stackOut_125_0 = (String[]) ((Object) stackIn_125_0);
                                              stackOut_125_1 = stackIn_125_1;
                                              stackOut_125_2 = "";
                                              stackIn_126_0 = stackOut_125_0;
                                              stackIn_126_1 = stackOut_125_1;
                                              stackIn_126_2 = stackOut_125_2;
                                              break L59;
                                            } else {
                                              stackOut_124_0 = (String[]) ((Object) stackIn_124_0);
                                              stackOut_124_1 = stackIn_124_1;
                                              stackOut_124_2 = re.field_a[var8];
                                              stackIn_126_0 = stackOut_124_0;
                                              stackIn_126_1 = stackOut_124_1;
                                              stackIn_126_2 = stackOut_124_2;
                                              break L59;
                                            }
                                          }
                                          stackIn_126_0[stackIn_126_1] = stackIn_126_2;
                                          var8++;
                                          if (var9 == 0) {
                                            if ((var6 ^ -1) >= (var8 ^ -1)) {
                                              break L55;
                                            } else {
                                              stackOut_121_0 = pl.field_k;
                                              stackIn_157_0 = stackOut_121_0;
                                              stackIn_122_0 = stackOut_121_0;
                                              if (var9 != 0) {
                                                break L56;
                                              } else {
                                                stackOut_122_0 = (String[]) ((Object) stackIn_122_0);
                                                stackOut_122_1 = var8 + 7 + var5;
                                                stackOut_122_2 = re.field_a.length;
                                                stackOut_122_3 = var8;
                                                stackIn_123_0 = stackOut_122_0;
                                                stackIn_123_1 = stackOut_122_1;
                                                stackIn_123_2 = stackOut_122_2;
                                                stackIn_123_3 = stackOut_122_3;
                                                continue L58;
                                              }
                                            }
                                          } else {
                                            break L55;
                                          }
                                        }
                                      } else {
                                        L60: {
                                          stackOut_115_0 = (String[]) ((Object) stackIn_115_0);
                                          stackOut_115_1 = stackIn_115_1;
                                          stackIn_117_0 = stackOut_115_0;
                                          stackIn_117_1 = stackOut_115_1;
                                          stackIn_116_0 = stackOut_115_0;
                                          stackIn_116_1 = stackOut_115_1;
                                          if (stackIn_115_2 <= stackIn_115_3) {
                                            stackOut_117_0 = (String[]) ((Object) stackIn_117_0);
                                            stackOut_117_1 = stackIn_117_1;
                                            stackOut_117_2 = uj.field_c[uj.field_c.length + var8 - var5];
                                            stackIn_118_0 = stackOut_117_0;
                                            stackIn_118_1 = stackOut_117_1;
                                            stackIn_118_2 = stackOut_117_2;
                                            break L60;
                                          } else {
                                            stackOut_116_0 = (String[]) ((Object) stackIn_116_0);
                                            stackOut_116_1 = stackIn_116_1;
                                            stackOut_116_2 = "";
                                            stackIn_118_0 = stackOut_116_0;
                                            stackIn_118_1 = stackOut_116_1;
                                            stackIn_118_2 = stackOut_116_2;
                                            break L60;
                                          }
                                        }
                                        stackIn_118_0[stackIn_118_1] = stackIn_118_2;
                                        var8++;
                                        if (var9 == 0) {
                                          continue L54;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                  }
                                  pl.field_k[6 - -var5] = null;
                                  gh.field_a[var5 + 6] = -2;
                                  var8 = 0;
                                  L61: while (true) {
                                    if ((var6 ^ -1) >= (var8 ^ -1)) {
                                      break L55;
                                    } else {
                                      stackOut_121_0 = pl.field_k;
                                      stackIn_157_0 = stackOut_121_0;
                                      stackIn_122_0 = stackOut_121_0;
                                      if (var9 != 0) {
                                        break L56;
                                      } else {
                                        stackOut_122_0 = (String[]) ((Object) stackIn_122_0);
                                        stackOut_122_1 = var8 + 7 + var5;
                                        stackOut_122_2 = re.field_a.length;
                                        stackOut_122_3 = var8;
                                        stackIn_123_0 = stackOut_122_0;
                                        stackIn_123_1 = stackOut_122_1;
                                        stackIn_123_2 = stackOut_122_2;
                                        stackIn_123_3 = stackOut_122_3;
                                        L62: {
                                          stackOut_123_0 = (String[]) ((Object) stackIn_123_0);
                                          stackOut_123_1 = stackIn_123_1;
                                          stackIn_125_0 = stackOut_123_0;
                                          stackIn_125_1 = stackOut_123_1;
                                          stackIn_124_0 = stackOut_123_0;
                                          stackIn_124_1 = stackOut_123_1;
                                          if (stackIn_123_2 <= stackIn_123_3) {
                                            stackOut_125_0 = (String[]) ((Object) stackIn_125_0);
                                            stackOut_125_1 = stackIn_125_1;
                                            stackOut_125_2 = "";
                                            stackIn_126_0 = stackOut_125_0;
                                            stackIn_126_1 = stackOut_125_1;
                                            stackIn_126_2 = stackOut_125_2;
                                            break L62;
                                          } else {
                                            stackOut_124_0 = (String[]) ((Object) stackIn_124_0);
                                            stackOut_124_1 = stackIn_124_1;
                                            stackOut_124_2 = re.field_a[var8];
                                            stackIn_126_0 = stackOut_124_0;
                                            stackIn_126_1 = stackOut_124_1;
                                            stackIn_126_2 = stackOut_124_2;
                                            break L62;
                                          }
                                        }
                                        stackIn_126_0[stackIn_126_1] = stackIn_126_2;
                                        var8++;
                                        if (var9 == 0) {
                                          continue L61;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                  }
                                }
                                L63: while (true) {
                                  if (stackIn_157_0.length <= var4) {
                                    break L2;
                                  } else {
                                    stackOut_158_0 = fd.field_s;
                                    stackOut_158_1 = gh.field_a[var4] ^ -1;
                                    stackIn_164_0 = stackOut_158_0;
                                    stackIn_164_1 = stackOut_158_1;
                                    stackIn_159_0 = stackOut_158_0;
                                    stackIn_159_1 = stackOut_158_1;
                                    if (var9 != 0) {
                                      break L1;
                                    } else {
                                      L64: {
                                        stackOut_159_0 = stackIn_159_0;
                                        stackIn_161_0 = stackOut_159_0;
                                        stackIn_160_0 = stackOut_159_0;
                                        if (stackIn_159_1 <= -1) {
                                          stackOut_161_0 = stackIn_161_0;
                                          stackOut_161_1 = hb.field_n;
                                          stackIn_162_0 = stackOut_161_0;
                                          stackIn_162_1 = stackOut_161_1;
                                          break L64;
                                        } else {
                                          stackOut_160_0 = stackIn_160_0;
                                          stackOut_160_1 = gi.field_a;
                                          stackIn_162_0 = stackOut_160_0;
                                          stackIn_162_1 = stackOut_160_1;
                                          break L64;
                                        }
                                      }
                                      fd.field_s = stackIn_162_0 + stackIn_162_1;
                                      var4++;
                                      if (var9 == 0) {
                                        stackOut_156_0 = pl.field_k;
                                        stackIn_157_0 = stackOut_156_0;
                                        continue L63;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                              fb.field_n = pf.a(0);
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                sj.field_f.field_i = bi.field_B.length;
                var3_int = 0;
                var4 = 0;
                L65: while (true) {
                  L66: {
                    L67: {
                      if ((var4 ^ -1) <= (pl.field_k.length ^ -1)) {
                        break L67;
                      } else {
                        stackOut_130_0 = -108;
                        stackIn_138_0 = stackOut_130_0;
                        stackIn_131_0 = stackOut_130_0;
                        if (var9 != 0) {
                          break L66;
                        } else {
                          L68: {
                            stackOut_131_0 = stackIn_131_0;
                            stackOut_131_1 = pl.field_k[var4];
                            stackIn_133_0 = stackOut_131_0;
                            stackIn_133_1 = stackOut_131_1;
                            stackIn_132_0 = stackOut_131_0;
                            stackIn_132_1 = stackOut_131_1;
                            if (gh.field_a[var4] < 0) {
                              stackOut_133_0 = stackIn_133_0;
                              stackOut_133_1 = (String) ((Object) stackIn_133_1);
                              stackOut_133_2 = 0;
                              stackIn_134_0 = stackOut_133_0;
                              stackIn_134_1 = stackOut_133_1;
                              stackIn_134_2 = stackOut_133_2;
                              break L68;
                            } else {
                              stackOut_132_0 = stackIn_132_0;
                              stackOut_132_1 = (String) ((Object) stackIn_132_1);
                              stackOut_132_2 = 1;
                              stackIn_134_0 = stackOut_132_0;
                              stackIn_134_1 = stackOut_132_1;
                              stackIn_134_2 = stackOut_132_2;
                              break L68;
                            }
                          }
                          L69: {
                            var5 = hh.a((byte) stackIn_134_0, stackIn_134_1, stackIn_134_2 != 0);
                            if (var3_int >= var5) {
                              break L69;
                            } else {
                              var3_int = var5;
                              break L69;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L65;
                          } else {
                            break L67;
                          }
                        }
                      }
                    }
                    stackOut_137_0 = ud.field_b ^ -1;
                    stackIn_138_0 = stackOut_137_0;
                    break L66;
                  }
                  L70: {
                    L71: {
                      if (stackIn_138_0 != -3) {
                        break L71;
                      } else {
                        var10 = wi.field_b;
                        var4_ref_String__ = var10;
                        var5 = 0;
                        L72: while (true) {
                          L73: {
                            if (var10.length <= var5) {
                              break L73;
                            } else {
                              var11 = var10[var5];
                              var7 = hh.a((byte) -109, var11, false);
                              stackOut_141_0 = var7 ^ -1;
                              stackOut_141_1 = var3_int ^ -1;
                              stackIn_147_0 = stackOut_141_0;
                              stackIn_147_1 = stackOut_141_1;
                              stackIn_142_0 = stackOut_141_0;
                              stackIn_142_1 = stackOut_141_1;
                              if (var9 != 0) {
                                L74: while (true) {
                                  if (stackIn_147_0 <= stackIn_147_1) {
                                    break L71;
                                  } else {
                                    var12 = var4_ref_String__[var5];
                                    var7 = hh.a((byte) -126, var12, false);
                                    stackOut_148_0 = var3_int ^ -1;
                                    stackOut_148_1 = var7 ^ -1;
                                    stackIn_153_0 = stackOut_148_0;
                                    stackIn_153_1 = stackOut_148_1;
                                    stackIn_149_0 = stackOut_148_0;
                                    stackIn_149_1 = stackOut_148_1;
                                    if (var9 != 0) {
                                      break L70;
                                    } else {
                                      L75: {
                                        if (stackIn_149_0 <= stackIn_149_1) {
                                          break L75;
                                        } else {
                                          var3_int = var7;
                                          break L75;
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        stackOut_146_0 = var5 ^ -1;
                                        stackOut_146_1 = var4_ref_String__.length ^ -1;
                                        stackIn_147_0 = stackOut_146_0;
                                        stackIn_147_1 = stackOut_146_1;
                                        continue L74;
                                      } else {
                                        break L71;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L76: {
                                  if (stackIn_142_0 >= stackIn_142_1) {
                                    break L76;
                                  } else {
                                    var3_int = var7;
                                    break L76;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L72;
                                } else {
                                  break L73;
                                }
                              }
                            }
                          }
                          var4_ref_String__ = ud.field_e;
                          var5 = 0;
                          L77: while (true) {
                            stackOut_146_0 = var5 ^ -1;
                            stackOut_146_1 = var4_ref_String__.length ^ -1;
                            stackIn_147_0 = stackOut_146_0;
                            stackIn_147_1 = stackOut_146_1;
                            if (stackIn_147_0 <= stackIn_147_1) {
                              break L71;
                            } else {
                              var12 = var4_ref_String__[var5];
                              var7 = hh.a((byte) -126, var12, false);
                              stackOut_148_0 = var3_int ^ -1;
                              stackOut_148_1 = var7 ^ -1;
                              stackIn_153_0 = stackOut_148_0;
                              stackIn_153_1 = stackOut_148_1;
                              stackIn_149_0 = stackOut_148_0;
                              stackIn_149_1 = stackOut_148_1;
                              if (var9 != 0) {
                                break L70;
                              } else {
                                L78: {
                                  if (stackIn_149_0 <= stackIn_149_1) {
                                    break L78;
                                  } else {
                                    var3_int = var7;
                                    break L78;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L77;
                                } else {
                                  break L71;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    h.field_b = -(var3_int >> 47297697) + (jc.field_b - -var3_int);
                    sc.field_g = jc.field_b + -(var3_int >> -1788205887);
                    fd.field_s = (ud.field_a + vf.field_b << -144221503) * sj.field_f.field_i;
                    stackOut_152_0 = param0;
                    stackOut_152_1 = -92;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    break L70;
                  }
                  if (stackIn_153_0 < stackIn_153_1) {
                    var4 = 0;
                    L79: while (true) {
                      stackOut_156_0 = pl.field_k;
                      stackIn_157_0 = stackOut_156_0;
                      if (stackIn_157_0.length <= var4) {
                        break L2;
                      } else {
                        stackOut_158_0 = fd.field_s;
                        stackOut_158_1 = gh.field_a[var4] ^ -1;
                        stackIn_164_0 = stackOut_158_0;
                        stackIn_164_1 = stackOut_158_1;
                        stackIn_159_0 = stackOut_158_0;
                        stackIn_159_1 = stackOut_158_1;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L80: {
                            stackOut_159_0 = stackIn_159_0;
                            stackIn_161_0 = stackOut_159_0;
                            stackIn_160_0 = stackOut_159_0;
                            if (stackIn_159_1 <= -1) {
                              stackOut_161_0 = stackIn_161_0;
                              stackOut_161_1 = hb.field_n;
                              stackIn_162_0 = stackOut_161_0;
                              stackIn_162_1 = stackOut_161_1;
                              break L80;
                            } else {
                              stackOut_160_0 = stackIn_160_0;
                              stackOut_160_1 = gi.field_a;
                              stackIn_162_0 = stackOut_160_0;
                              stackIn_162_1 = stackOut_160_1;
                              break L80;
                            }
                          }
                          fd.field_s = stackIn_162_0 + stackIn_162_1;
                          var4++;
                          if (var9 == 0) {
                            continue L79;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              stackOut_163_0 = -(fd.field_s >> 1811966177);
              stackOut_163_1 = fl.field_b;
              stackIn_164_0 = stackOut_163_0;
              stackIn_164_1 = stackOut_163_1;
              break L1;
            }
            fb.field_k = stackIn_164_0 + stackIn_164_1;
            ja.field_A = new int[pl.field_k.length][];
            var4 = 0;
            var5 = fb.field_k;
            L81: while (true) {
              L82: {
                L83: {
                  if (pl.field_k.length <= var4) {
                    break L83;
                  } else {
                    var6 = gh.field_a[var4];
                    stackOut_166_0 = var6;
                    stackIn_172_0 = stackOut_166_0;
                    stackIn_167_0 = stackOut_166_0;
                    if (var9 != 0) {
                      break L82;
                    } else {
                      L84: {
                        L85: {
                          if (stackIn_167_0 < 0) {
                            break L85;
                          } else {
                            var7 = hh.a((byte) -115, pl.field_k[var4], true);
                            var8 = jc.field_b - (var7 >> 1881197345);
                            var5 = var5 + ud.field_a;
                            ja.field_A[var4] = new int[4];
                            ja.field_A[var4][0] = -pl.field_h + var8;
                            ja.field_A[var4][1] = var5;
                            ja.field_A[var4][2] = (pl.field_h << 387895873) + var7;
                            var5 = var5 + ((vf.field_b << 369803937) + (ud.field_a + hb.field_n));
                            ja.field_A[var4][3] = hb.field_n - -(vf.field_b << 1498607393);
                            if (var9 == 0) {
                              break L84;
                            } else {
                              break L85;
                            }
                          }
                        }
                        var5 = var5 + gi.field_a;
                        break L84;
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L81;
                      } else {
                        break L83;
                      }
                    }
                  }
                }
                stackOut_171_0 = ud.field_b ^ -1;
                stackIn_172_0 = stackOut_171_0;
                break L82;
              }
              L86: {
                L87: {
                  if (stackIn_172_0 == -3) {
                    break L87;
                  } else {
                    sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
                    if (var9 == 0) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                sj.field_f.a(-1, -1, 0, param1);
                break L86;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "jk.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$2 = false;
        RuntimeException var8 = null;
        we var9 = null;
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
                var9 = (we) null;
                discarded$2 = this.a((byte) -23, (we) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.b((byte) 43)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param0, param1, param2, param3, param4, param5, -127)) {
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
            stackOut_8_0 = (RuntimeException) (var8);
            stackOut_8_1 = new StringBuilder().append("jk.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
