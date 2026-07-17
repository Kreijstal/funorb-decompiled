/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends lj {
    static sa field_A;
    private String[] field_D;
    private nj field_B;
    private qj field_E;
    static qj field_C;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        ((le) this).j(-91);
        int var6 = 112 / ((param0 - -29) / 53);
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
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((le) this).field_D == null) {
                  break L2;
                } else {
                  if (param2 >= ((le) this).field_D.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param2];
                var8 = var7;
                var4 = var8;
                if (((le) this).field_D != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((le) this).field_D.length) {
                      break L3;
                    } else {
                      var7[var5] = ((le) this).field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((le) this).field_D = var8;
              break L1;
            }
            L5: {
              if (param1 == 0) {
                break L5;
              } else {
                ((le) this).j(48);
                break L5;
              }
            }
            ((le) this).field_D[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("le.W(");
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean a(qg param0, int param1) {
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
            if (param1 <= -11) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_A = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("le.M(");
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
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void j(int param0) {
        int var2 = 0;
        m var3 = null;
        ue var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ol var12 = null;
        int var13 = 0;
        int var14 = 0;
        nj var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = Transmogrify.field_A ? 1 : 0;
        ((le) this).field_E = new qj();
        if (param0 <= -39) {
          var2 = 0;
          var3 = (m) (Object) ((le) this).field_q;
          var4 = var3.a((qg) this, -2);
          L0: while (true) {
            var5 = ((le) this).field_k.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            } else {
              var7 = ((le) this).field_k.indexOf(">", var5);
              var6 = ((le) this).field_k.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((le) this).field_k.indexOf("</hotspot>", var5);
              var8 = var4.b(-1, var5);
              var9 = var4.b(-1, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var11 > var9) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var11 != var8) {
                      stackOut_8_0 = var12.field_g[0];
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var4.c(0, var5);
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var12.field_g[var12.field_g.length + -1];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.c(0, var2);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new nj(var7, var13, var12.field_a, var14 - var13, Math.max(var3.a(true), -var12.field_a + var12.field_f));
                    if (var10 != null) {
                      ((nj) var10).field_s = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((le) this).field_E.a((wf) (Object) var15, -105);
                  var10 = (Object) (Object) var15;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -127, param1, param2, param3);
        int var5 = -((le) this).field_p + param3;
        int var6 = param1 + -((le) this).field_n;
        int var7 = -35 / ((50 - param0) / 45);
        nj var8 = this.a(var6, (byte) -5, var5);
        if (var8 != null) {
            if (!(null == ((le) this).field_m)) {
                ((hl) (Object) ((le) this).field_m).a(param2, 2818, var8.field_n, (le) this);
            }
        }
    }

    private final nj a(int param0, byte param1, int param2) {
        nj var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        nj var4 = (nj) (Object) ((le) this).field_E.a((byte) -95);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (param2 >= var5.field_i) {
                    if (param0 >= var5.field_h) {
                        if (var5.field_q + var5.field_i > param2) {
                            if (var5.field_h - -var5.field_o >= param0) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_s;
            }
            var4 = (nj) (Object) ((le) this).field_E.a(true);
        }
        if (param1 == -5) {
            return null;
        }
        return null;
    }

    final static Boolean d(boolean param0) {
        Boolean var1 = ch.field_f;
        ch.field_f = null;
        return var1;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
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
              ((le) this).field_B = null;
              if (!((le) this).field_g) {
                break L1;
              } else {
                var5_int = -((le) this).field_p + oa.field_j - param3;
                var6 = -((le) this).field_n + (bk.field_a + -param0);
                ((le) this).field_B = this.a(var6, (byte) -5, var5_int);
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
            stackOut_3_1 = new StringBuilder().append("le.B(").append(param0).append(44).append(param1).append(44);
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

    String f(int param0) {
        if (((le) this).field_B == null) {
            return null;
        }
        if (null == ((le) this).field_D) {
            return null;
        }
        if (((le) this).field_B.field_n >= ((le) this).field_D.length) {
            return null;
        }
        if (param0 != 4) {
            ((le) this).a(-19, 125, -68, (byte) 31);
        }
        return ((le) this).field_D[((le) this).field_B.field_n];
    }

    final static String h(int param0) {
        if (rh.field_v == of.field_d) {
            return hf.field_g;
        }
        if (!(dl.field_l.b(-26753))) {
            return dl.field_l.a((byte) 85);
        }
        if (db.field_a == of.field_d) {
            return dl.field_l.a((byte) -85);
        }
        int var1 = 25 % ((-59 - param0) / 35);
        return ob.field_F;
    }

    public static void i(int param0) {
        field_A = null;
        if (param0 != -1) {
            field_C = null;
        }
        field_C = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((le) this).a(26, param3, param0, param1, ((m) (Object) ((le) this).field_q).b((qg) this, 228));
        if (param2 != -1) {
            field_C = null;
        }
    }

    le(String param0, ui param1) {
        super(param0, (ma) null);
        ((le) this).field_B = null;
        try {
            ((le) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "le.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, param1, param2, (byte) -31);
        if (!(param2 == 0)) {
            return;
        }
        int var6 = 13 % ((param3 - 77) / 34);
        m var10 = (m) (Object) ((le) this).field_q;
        nj var7 = ((le) this).field_B;
        if (var7 != null) {
            var8 = var10.a(9112, (qg) this, param0);
            var9 = var10.a((qg) this, 62, param1);
            do {
                ri.a(2 + var7.field_q, var7.field_i + (var8 - 2), -2 + var9 + var7.field_h, (byte) -120, var7.field_o - -2);
                var7 = var7.field_s;
            } while (var7 != null);
        }
    }

    static {
    }
}
