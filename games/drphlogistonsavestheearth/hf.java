/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends vg {
    private boolean field_F;
    static nh field_D;
    static int[] field_H;
    boolean field_E;
    private boolean field_B;
    static nh field_z;
    static int field_C;
    boolean field_A;
    static int[] field_G;

    final static String g(int param0) {
        if (param0 != -1) {
            field_D = null;
            if (em.field_c) {
                return null;
            }
            if (dd.field_l < qe.field_c) {
                return null;
            }
            if (!(dd.field_l >= je.field_j + qe.field_c)) {
                return ie.field_C;
            }
            return null;
        }
        if (em.field_c) {
            return null;
        }
        if (dd.field_l < qe.field_c) {
            return null;
        }
        if (!(dd.field_l >= je.field_j + qe.field_c)) {
            return ie.field_C;
        }
        return null;
    }

    hf(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
    }

    final void c(byte param0) {
        int var2 = 0;
        var2 = 71 % ((param0 - -10) / 51);
        if (((hf) this).field_F) {
          ((hf) this).field_F = false;
          if (null != ((hf) this).field_u) {
            if (((hf) this).field_u instanceof pl) {
              ((pl) (Object) ((hf) this).field_u).a((vg) this, ((hf) this).field_F, false);
              return;
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

    public static void f(int param0) {
        if (param0 != 7966) {
            return;
        }
        field_D = null;
        field_G = null;
        field_H = null;
        field_z = null;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              super.a(param0, param1, param2, (byte) -128);
              if (((hf) this).field_y == 0) {
                break L1;
              } else {
                if (db.field_a == ((hf) this).field_y) {
                  break L1;
                } else {
                  L2: {
                    if (!((hf) this).a(param2, param1, false, ck.field_c, ob.field_g)) {
                      break L2;
                    } else {
                      if (db.field_a != 0) {
                        break L2;
                      } else {
                        ((hf) this).a(((hf) this).field_y, 26982, -param2 + ob.field_g, ck.field_c - param1);
                        break L2;
                      }
                    }
                  }
                  ((hf) this).a(param1, param2, ob.field_g, param0, ck.field_c, false);
                  break L1;
                }
              }
            }
            if (param3 < -127) {
              break L0;
            } else {
              var6 = null;
              ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("hf.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hf(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        ((hf) this).field_E = true;
        ((hf) this).field_B = true;
        ((hf) this).field_F = false;
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        if (param5) {
            return;
        }
        try {
            if (null != ((hf) this).field_u) {
                if (((hf) this).field_u instanceof se) {
                    ((se) (Object) ((hf) this).field_u).a(param2, param4, param0, 17437, (hf) this, param1);
                }
            }
            ((hf) this).field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "hf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            if (!((hf) this).field_E) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((hf) this).field_B) {
                L1: {
                  param1.c((byte) 122);
                  if (!param0) {
                    break L1;
                  } else {
                    ((hf) this).a(5, -103, -59, -102);
                    break L1;
                  }
                }
                L2: {
                  ((hf) this).field_F = true;
                  if (null == ((hf) this).field_u) {
                    break L2;
                  } else {
                    if (((hf) this).field_u instanceof pl) {
                      ((pl) (Object) ((hf) this).field_u).a((vg) this, ((hf) this).field_F, false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("hf.M(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        L0: {
          if (null == ((hf) this).field_u) {
            break L0;
          } else {
            if (((hf) this).field_u instanceof ke) {
              ((ke) (Object) ((hf) this).field_u).a(param2, param3, true, (hf) this, param0);
              break L0;
            } else {
              if (param1 == 26982) {
                return;
              } else {
                var6 = null;
                ((hf) this).a((vg) null, -40, 15, (byte) 63);
                return;
              }
            }
          }
        }
        if (param1 != 26982) {
          var6 = null;
          ((hf) this).a((vg) null, -40, 15, (byte) 63);
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            hf.f(-19);
            return ((hf) this).field_F;
        }
        return ((hf) this).field_F;
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
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
              if (!((hf) this).a(true)) {
                break L1;
              } else {
                L2: {
                  if (param0 == 84) {
                    break L2;
                  } else {
                    if (param0 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((hf) this).a(1, 26982, -1, -1);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            }
            if (param3 >= 63) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              String discarded$2 = hf.g(37);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("hf.BA(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
              if (!((hf) this).field_E) {
                break L1;
              } else {
                if (!((hf) this).a(param6, param5, false, param4, param0)) {
                  break L1;
                } else {
                  L2: {
                    boolean discarded$2 = ((hf) this).a(false, param1);
                    ((hf) this).field_y = param2;
                    if (((hf) this).field_u == null) {
                      break L2;
                    } else {
                      if (((hf) this).field_u instanceof se) {
                        ((se) (Object) ((hf) this).field_u).a(param0, param6, 5708, param2, param5, param4, (hf) this);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
            L3: {
              if (param3 >= 113) {
                break L3;
              } else {
                field_H = null;
                break L3;
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
            stackOut_12_1 = new StringBuilder().append("hf.JA(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    protected hf() {
        ((hf) this).field_E = true;
        ((hf) this).field_B = true;
        ((hf) this).field_F = false;
        ((hf) this).field_l = ja.field_Q.field_a;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
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
        Object stackOut_1_0 = null;
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
            if (param3 == -10612) {
              L1: {
                if (!((hf) this).a(param1, param2, param0, 101)) {
                  break L1;
                } else {
                  L2: {
                    ((hf) this).a(param2, (byte) 89, param0, param1);
                    if (!((hf) this).field_A) {
                      break L2;
                    } else {
                      StringBuilder discarded$4 = param2.append(" active");
                      break L2;
                    }
                  }
                  if (((hf) this).field_E) {
                    break L1;
                  } else {
                    StringBuilder discarded$5 = param2.append(" disabled");
                    break L1;
                  }
                }
              }
              stackOut_8_0 = (StringBuilder) param2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("hf.WA(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
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
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{0, 50, 50, 50, 50, 50, 150, 30, 50, 140, 70, -1, 50, 50};
        field_G = new int[8192];
    }
}
