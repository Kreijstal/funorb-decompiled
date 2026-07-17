/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi extends qg implements pb {
    static int field_x;
    static sh field_w;
    qg field_v;
    static int[] field_t;
    static rc field_u;

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
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
              if (param4 == -30386) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$2 = ((fi) this).b(113, -82, (qg) null, -14, -67, 9, 85);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((fi) this).field_v == null) {
                  break L3;
                } else {
                  if (!((fi) this).field_v.b(param0, param1, param2, param3 + ((fi) this).field_p, -30386, param5, ((fi) this).field_n + param6)) {
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
            stackOut_7_1 = new StringBuilder().append("fi.O(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    fi(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0) {
        int var2 = 91 % ((74 - param0) / 49);
        if (((fi) this).field_v == null) {
            return;
        }
        ((fi) this).field_v.c((byte) 85);
    }

    private final boolean b(qg param0) {
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
                if (((fi) this).field_v == null) {
                  break L2;
                } else {
                  if (((fi) this).field_v.b((byte) 102)) {
                    break L2;
                  } else {
                    if (!((fi) this).field_v.a(param0, -108)) {
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
            stackOut_6_1 = new StringBuilder().append("fi.AA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 32 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final int g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -41) {
          L0: {
            field_w = null;
            if (((fi) this).field_v == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((fi) this).field_v.g(-116);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((fi) this).field_v == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((fi) this).field_v.g(-116);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (param1 < -20) {
              L1: {
                if (((fi) this).a((byte) -93, param3, param2, param0)) {
                  ((fi) this).a(param2, 69, param0, param3);
                  ((fi) this).a(param2, param0, param3, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (StringBuilder) param2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("fi.Q(").append(param0).append(44).append(param1).append(44);
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-126, param1, param2, param3, param4);
        ((fi) this).a((byte) 126);
        int var6 = 67 % ((-29 - param0) / 53);
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param5 == -17) {
              L1: {
                L2: {
                  if (null == ((fi) this).field_v) {
                    break L2;
                  } else {
                    if (!((fi) this).field_v.b((byte) 53)) {
                      break L2;
                    } else {
                      if (!((fi) this).field_v.a(param0, param1, param2, param3, param4, param5, param6)) {
                        break L2;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("fi.R(").append(param0).append(44).append(param1).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final static void c(boolean param0) {
        ia var1_ref = null;
        Object var1 = null;
        if (!param0) {
            fi.c(false);
            var1_ref = (ia) (Object) uj.field_c.a(-9424);
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            sb.a(var1_ref.field_o, var1_ref.field_h, var1_ref.field_n);
            sb.a(var1_ref.field_k, var1_ref.field_g, var1_ref.field_p, var1_ref.field_m);
            var1_ref.field_o = null;
            kk.field_f.a((wf) (Object) var1_ref, -128);
            return;
        }
        var1_ref = (ia) (Object) uj.field_c.a(-9424);
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        sb.a(var1_ref.field_o, var1_ref.field_h, var1_ref.field_n);
        sb.a(var1_ref.field_k, var1_ref.field_g, var1_ref.field_p, var1_ref.field_m);
        var1_ref.field_o = null;
        kk.field_f.a((wf) (Object) var1_ref, -128);
    }

    public static void h(int param0) {
        if (param0 != 30381) {
          fi.h(-100);
          field_w = null;
          field_u = null;
          field_t = null;
          return;
        } else {
          field_w = null;
          field_u = null;
          field_t = null;
          return;
        }
    }

    String f(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.f(param0);
        if (((fi) this).field_v != null) {
          var3 = ((fi) this).field_v.f(4);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    final void e(int param0) {
        Object var3 = null;
        if (param0 == -29113) {
          if (((fi) this).field_v == null) {
            return;
          } else {
            ((fi) this).field_v.e(-29113);
            return;
          }
        } else {
          var3 = null;
          ((fi) this).a(101, (byte) 111, (qg) null, 40);
          if (((fi) this).field_v == null) {
            return;
          } else {
            ((fi) this).field_v.e(-29113);
            return;
          }
        }
    }

    final boolean a(qg param0, int param1) {
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
              if (param1 < -11) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((fi) this).field_v == null) {
                  break L3;
                } else {
                  if (!((fi) this).field_v.a(param0, -119)) {
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
            stackOut_7_1 = new StringBuilder().append("fi.M(");
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
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static uk b(String param0) {
        Object var2 = null;
        uk var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        uk stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        uk stackOut_13_0 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null != rb.field_b) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) hj.a((byte) -126, var6);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var6;
                break L0;
              }
            }
            var3 = (uk) (Object) rb.field_b.a((long)((String) var2).hashCode(), (byte) -50);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_eb;
                  var4 = hj.a((byte) -126, var7);
                  if (var4 == null) {
                    var4 = var3.field_eb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals(var2)) {
                  var3 = (uk) (Object) rb.field_b.a(93);
                  continue L1;
                } else {
                  stackOut_13_0 = (uk) var3;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_17_0 = var2;
            stackOut_17_1 = new StringBuilder().append("fi.J(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 51 + 41);
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
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
        boolean stackOut_9_0 = false;
        boolean stackOut_8_0 = false;
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
              if (null == ((fi) this).field_v) {
                break L1;
              } else {
                if (!((fi) this).field_v.b((byte) -114)) {
                  break L1;
                } else {
                  if (!((fi) this).field_v.a(param0, param1, (byte) 122, param3)) {
                    break L1;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0 != 0;
                  }
                }
              }
            }
            var5_int = param0;
            if (80 == var5_int) {
              L2: {
                if (!ve.field_B[81]) {
                  int discarded$5 = -128;
                  stackOut_9_0 = this.a(param1);
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  int discarded$6 = 32;
                  stackOut_8_0 = this.b(param1);
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0;
            } else {
              var5_int = 55 % ((65 - param2) / 55);
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("fi.K(").append(param0).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            StringBuilder discarded$8 = param0.append(10);
            var5_int = 0;
            if (!param3) {
              L1: while (true) {
                if (param1 < var5_int) {
                  if (null == ((fi) this).field_v) {
                    StringBuilder discarded$9 = param0.append("null");
                    break L0;
                  } else {
                    StringBuilder discarded$10 = ((fi) this).field_v.a(param1 + 1, -74, param0, param2);
                    return;
                  }
                } else {
                  StringBuilder discarded$11 = param0.append(32);
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("fi.W(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    final boolean b(byte param0) {
        int var2 = 50 % ((param0 - -57) / 46);
        return ((fi) this).d((byte) 104) != null ? true : false;
    }

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
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
              if (param3 == -1) {
                break L1;
              } else {
                ((fi) this).a(-91, -31, -117, -62, -38);
                break L1;
              }
            }
            if (null == ((fi) this).field_v) {
              break L0;
            } else {
              ((fi) this).field_v.a(((fi) this).field_n + param0, param1, param2, -1, param4, ((fi) this).field_p + param5);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("fi.BA(").append(param0).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        nc.field_t = nc.field_t + param1;
        ud.field_b = ud.field_b + (param2 + -255);
        if (!mg.field_d) {
          var3 = 1 << param2;
          if (0 != (var3 & rh.field_n)) {
            return false;
          } else {
            L0: {
              rh.field_n = rh.field_n | var3;
              hc.field_u = hc.field_u | var3;
              oj.field_u.a((wf) (Object) new pi(param2), -99);
              if (qj.b((byte) 78)) {
                rh.field_n = rh.field_n | var3;
                break L0;
              } else {
                break L0;
              }
            }
            if (!dk.field_b) {
              if (qj.b((byte) 74)) {
                mc.field_c.a((wf) (Object) new gd(param2, param1, nc.field_t, ud.field_b, jk.field_B, gh.field_l), -94);
                return true;
              } else {
                int discarded$3 = 75;
                int discarded$4 = 4;
                gd discarded$5 = nh.a(jk.field_B, ud.field_b, param1, nc.field_t, param2, gh.field_l);
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (null == ((fi) this).field_v) {
                break L1;
              } else {
                ((fi) this).field_v.a(((fi) this).field_n + param0, (byte) -12, param2, param3 + ((fi) this).field_p);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fi.B(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    private final boolean a(qg param0) {
        int var3_int = 0;
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
                var3_int = 0;
                if (null == ((fi) this).field_v) {
                  break L2;
                } else {
                  if (((fi) this).field_v.b((byte) -117)) {
                    break L2;
                  } else {
                    if (!((fi) this).field_v.a(param0, -77)) {
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
            stackOut_6_1 = new StringBuilder().append("fi.U(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -128 + 41);
        }
        return stackIn_5_0 != 0;
    }

    qg d(byte param0) {
        int var2 = 47 / ((51 - param0) / 48);
        qg var3 = ((fi) this).field_v;
        if (var3 == null) {
            return null;
        }
        if (!(!var3.b((byte) 36))) {
            return var3;
        }
        return null;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        if (0 == param2) {
          if (null == ((fi) this).field_q) {
            L0: {
              if (null != ((fi) this).field_v) {
                ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
                break L0;
              } else {
                break L0;
              }
            }
            var5 = 1;
            return;
          } else {
            L1: {
              ((fi) this).field_q.a(param0, param1, true, (byte) 99, (qg) this);
              if (null != ((fi) this).field_v) {
                ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = 1;
            return;
          }
        } else {
          L2: {
            if (null != ((fi) this).field_v) {
              ((fi) this).field_v.a(((fi) this).field_p + param0, param1 - -((fi) this).field_n, param2, (byte) 112);
              break L2;
            } else {
              break L2;
            }
          }
          var5 = 1;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[4];
        field_w = new sh();
        field_u = new rc();
    }
}
