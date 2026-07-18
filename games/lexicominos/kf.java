/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends w {
    boolean field_D;
    private boolean field_B;
    static be field_y;
    static db[] field_A;
    private boolean field_x;
    boolean field_C;
    static dg field_z;

    boolean a(byte param0, w param1) {
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
              if (!((kf) this).field_D) {
                break L1;
              } else {
                if (!((kf) this).field_x) {
                  break L1;
                } else {
                  L2: {
                    param1.c((byte) -122);
                    if (param0 == 44) {
                      break L2;
                    } else {
                      ((kf) this).field_x = true;
                      break L2;
                    }
                  }
                  L3: {
                    ((kf) this).field_B = true;
                    if (null == ((kf) this).field_r) {
                      break L3;
                    } else {
                      if (!(((kf) this).field_r instanceof ml)) {
                        break L3;
                      } else {
                        ((ml) (Object) ((kf) this).field_r).a(false, ((kf) this).field_B, (w) this);
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
            stackOut_12_1 = new StringBuilder().append("kf.LA(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    kf(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
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
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
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
              if (param0 == -4808) {
                break L1;
              } else {
                ((kf) this).field_B = false;
                break L1;
              }
            }
            if (!((kf) this).field_D) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              if (((kf) this).a(param3, param6, param5, param4, (byte) -93)) {
                L2: {
                  boolean discarded$2 = ((kf) this).a((byte) 44, param2);
                  ((kf) this).field_h = param1;
                  if (((kf) this).field_r == null) {
                    break L2;
                  } else {
                    if (!(((kf) this).field_r instanceof j)) {
                      break L2;
                    } else {
                      ((j) (Object) ((kf) this).field_r).a(param3, param1, param6, (byte) -14, param5, param4, (kf) this);
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("kf.VA(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (((kf) this).field_r == null) {
            break L0;
          } else {
            if (((kf) this).field_r instanceof jk) {
              ((jk) (Object) ((kf) this).field_r).a(param2, param1, 215535458, param3, (kf) this);
              break L0;
            } else {
              if (param0 == -23287) {
                return;
              } else {
                ((kf) this).field_B = true;
                return;
              }
            }
          }
        }
        if (param0 != -23287) {
          ((kf) this).field_B = true;
          return;
        } else {
          return;
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (((kf) this).field_h != 0) {
                if (~((kf) this).field_h != ~ul.field_o) {
                    if (((kf) this).a(sh.field_e, bk.field_b, param3, param2, (byte) -115)) {
                        if (!(ul.field_o != 0)) {
                            ((kf) this).a(-23287, -param2 + sh.field_e, ((kf) this).field_h, bk.field_b + -param3);
                        }
                    }
                    ((kf) this).a(param1, bk.field_b, param2, 0, param3, sh.field_e);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "kf.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_A = null;
        field_y = null;
    }

    final static boolean d(boolean param0) {
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        pd var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (pd) (Object) al.field_C.a(true);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var1.field_p <= var2) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    if (var4.field_k[var2] != null) {
                      if (var4.field_k[var2].field_b != 0) {
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_i[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_i[var2].field_b == 0) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1_ref, "kf.HA(" + true + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            if (((kf) this).field_r != null) {
                if (!(!(((kf) this).field_r instanceof j))) {
                    ((j) (Object) ((kf) this).field_r).a(-121, param4, param5, param2, param1, (kf) this);
                }
            }
            ((kf) this).field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "kf.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
            return false;
        }
        return ((kf) this).field_B;
    }

    final static void f(int param0) {
        nb.field_z = hh.a((byte) 115);
        ug.field_A = new eg();
        jd.a(true, true, 37);
    }

    final static int g(int param0) {
        return uk.field_V;
    }

    final static void h(int param0) {
        og.field_c = ig.field_a.c(false);
        CharSequence var2 = (CharSequence) (Object) og.field_c;
        cb.field_t = ck.a(var2, (byte) -48);
    }

    kf(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        ((kf) this).field_D = true;
        ((kf) this).field_B = false;
        ((kf) this).field_x = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (param3 == -15992) {
                break L1;
              } else {
                var6 = null;
                ((kf) this).a((byte) 35, (w) null, 75, 35);
                break L1;
              }
            }
            L2: {
              if (((kf) this).a(7373, param2, param1, param0)) {
                L3: {
                  ((kf) this).a(param2, 0, param0, param1);
                  if (!((kf) this).field_C) {
                    break L3;
                  } else {
                    StringBuilder discarded$4 = param2.append(" active");
                    break L3;
                  }
                }
                if (((kf) this).field_D) {
                  break L2;
                } else {
                  StringBuilder discarded$5 = param2.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_8_0 = (StringBuilder) param2;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static int a(byte param0, int param1) {
        int var2 = 35;
        int var3 = 0;
        if ((param1 & 7) != 0) {
            var3 = -(7 & param1) + 8;
        }
        int var4 = param1 + var3;
        return var4;
    }

    protected kf() {
        ((kf) this).field_D = true;
        ((kf) this).field_B = false;
        ((kf) this).field_x = true;
        ((kf) this).field_i = nb.field_z.field_j;
    }

    final void c(byte param0) {
        Object var3 = null;
        if (((kf) this).field_B) {
          ((kf) this).field_B = false;
          if (null != ((kf) this).field_r) {
            if (!(((kf) this).field_r instanceof ml)) {
              if (param0 > -35) {
                var3 = null;
                boolean discarded$4 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            } else {
              ((ml) (Object) ((kf) this).field_r).a(false, ((kf) this).field_B, (w) this);
              if (param0 > -35) {
                var3 = null;
                boolean discarded$5 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > -35) {
              var3 = null;
              boolean discarded$6 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= -35) {
            return;
          } else {
            var3 = null;
            boolean discarded$7 = ((kf) this).a(-41, -60, (w) null, 127, 58, -109, 47);
            return;
          }
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
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
              var5_int = -98 / ((-13 - param3) / 55);
              if (!((kf) this).a(18337)) {
                break L1;
              } else {
                L2: {
                  if (param1 == 84) {
                    break L2;
                  } else {
                    if (param1 != 83) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((kf) this).a(-23287, -1, 1, -1);
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
            stackOut_8_1 = new StringBuilder().append("kf.P(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new dg();
    }
}
