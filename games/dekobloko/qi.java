/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qi extends ek {
    private pk field_P;
    static String field_L;
    private String[] field_K;
    private vj field_O;
    static vj field_Q;
    static vj field_S;
    static String field_N;
    static String field_T;
    static ck field_R;
    static boolean field_M;

    String c(byte param0) {
        if (null == ((qi) this).field_P) {
            return null;
        }
        if (null == ((qi) this).field_K) {
            return null;
        }
        if (((qi) this).field_K.length <= ((qi) this).field_P.field_p) {
            return null;
        }
        if (param0 != 113) {
            return null;
        }
        return ((qi) this).field_K[((qi) this).field_P.field_p];
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = -125 % ((-61 - param0) / 43);
        ((qi) this).b(((nl) (Object) ((qi) this).field_p).a((ce) this, -125), param3, param1, param2, -16555);
    }

    final static void a(boolean param0, byte param1) {
        if (lk.field_F) {
            h.field_d = uh.a(j.field_d, param0, !gk.field_Ib ? 1 : 2, -104);
            return;
        }
        if (!(!mg.field_Zb)) {
            cl.field_B = qj.a(-21, param0);
            return;
        }
        if (!(!fm.field_e)) {
            am.field_a = ib.a((byte) -108, param0);
            return;
        }
        if (!(!he.field_db)) {
            jm.a(0, param0);
            he.field_db = false;
            return;
        }
        if (!(!ob.field_k)) {
            tj.a(param0, 111);
            gi.field_b = true;
            ob.field_k = false;
            return;
        }
        kf.field_G.c(-1, param0);
        if (param1 >= -99) {
            qi.h(-32);
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, 48, param2, param3);
              ((qi) this).field_P = null;
              if (((qi) this).field_q) {
                var5_int = -((qi) this).field_u + (bh.field_g + -param3);
                var6 = pm.field_f - (param2 - -((qi) this).field_D);
                ((qi) this).field_P = this.a(1, var6, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 38) {
                break L2;
              } else {
                ((qi) this).field_K = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("qi.A(");
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
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == 1) {
              L1: {
                L2: {
                  if (null == ((qi) this).field_K) {
                    break L2;
                  } else {
                    if (param1 >= ((qi) this).field_K.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var7 = new String[param1 + 1];
                  var8 = var7;
                  var4 = var8;
                  if (null != ((qi) this).field_K) {
                    var5 = 0;
                    L4: while (true) {
                      if (((qi) this).field_K.length <= var5) {
                        break L3;
                      } else {
                        var7[var5] = ((qi) this).field_K[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                ((qi) this).field_K = var8;
                break L1;
              }
              ((qi) this).field_K[param1] = param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("qi.J(");
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
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, -128, param2, param3);
        if (param1 >= -103) {
            ((qi) this).a(112);
        }
        if (param2 != 0) {
            return;
        }
        nl var9 = (nl) (Object) ((qi) this).field_p;
        pk var6 = ((qi) this).field_P;
        if (var6 == null) {
        } else {
            var7 = var9.a((byte) 24, (ce) this, param0);
            var8 = var9.a(param3, 0, (ce) this);
            do {
                kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s - -2);
                var6 = var6.field_o;
            } while (var6 != null);
        }
    }

    final static w e(byte param0) {
        int var1 = -48;
        return qa.d(5);
    }

    final static void a(float param0, int param1, String param2) {
        try {
            cg.field_d = param0;
            he.field_hb = param2;
            int var3_int = 79 / ((-18 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qi.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final pk a(int param0, int param1, int param2) {
        pk var4 = null;
        pk var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var4 = (pk) (Object) ((qi) this).field_O.c((byte) 49);
          if (param0 == 1) {
            break L0;
          } else {
            var7 = null;
            ((qi) this).a((ce) null, 8, -16, -10);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (pk) (Object) ((qi) this).field_O.d(true);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_t) {
                    break L3;
                  } else {
                    if (var5.field_u > param1) {
                      break L3;
                    } else {
                      if (param2 >= var5.field_n + var5.field_t) {
                        break L3;
                      } else {
                        if (var5.field_u - -var5.field_s >= param1) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_o;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void f(byte param0) {
        field_R = null;
        field_S = null;
        field_L = null;
        int var1 = 0;
        field_T = null;
        field_N = null;
        field_Q = null;
    }

    boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_N = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qi.EC(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void h(int param0) {
        hm.a(param0, (byte) -104);
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -((qi) this).field_u + param0;
        int var6 = param1 + -((qi) this).field_D;
        pk var7 = this.a(1, var6, var5);
        if (var7 != null) {
            if (null != ((qi) this).field_v) {
                ((rl) (Object) ((qi) this).field_v).a((qi) this, param2, -118, var7.field_p);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((qi) this).a(2874);
    }

    final void a(int param0) {
        int var2 = 0;
        nl var3 = null;
        cf var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        nf var12 = null;
        int var13 = 0;
        int var14 = 0;
        pk var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = client.field_A ? 1 : 0;
          ((qi) this).field_O = new vj();
          var2 = 0;
          if (param0 == 2874) {
            break L0;
          } else {
            field_S = null;
            break L0;
          }
        }
        var3 = (nl) (Object) ((qi) this).field_p;
        var4 = var3.a((ce) this, (byte) 117);
        L1: while (true) {
          var5 = ((qi) this).field_E.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((qi) this).field_E.indexOf(">", var5);
            var6 = ((qi) this).field_E.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((qi) this).field_E.indexOf("</hotspot>", var5);
            var8 = var4.a(false, var5);
            var9 = var4.a(false, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_a[var11];
                  if (var11 != var8) {
                    stackOut_8_0 = var12.field_a[0];
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var4.a((byte) -94, var5);
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_a[var12.field_a.length + -1];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a((byte) -94, var2);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new pk(var7, var13, var12.field_c, var14 - var13, Math.max(var3.a((byte) -120), -var12.field_c + var12.field_i));
                  if (var10 != null) {
                    ((pk) var10).field_o = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((qi) this).field_O.a((bh) (Object) var15, 2777);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    qi(String param0, gl param1) {
        super(param0, (kg) null);
        ((qi) this).field_P = null;
        try {
            ((qi) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "qi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "to over <%0> great games";
        field_L = "Fast Drop Bonus: ";
        field_T = "Checking";
        field_Q = new vj();
        field_R = new ck(270, 70);
    }
}
