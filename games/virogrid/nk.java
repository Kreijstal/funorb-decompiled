/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends tg {
    private String[] field_F;
    static String field_M;
    static km field_H;
    static km field_I;
    private p field_G;
    static String field_J;
    private pb field_L;
    static double[] field_K;

    public static void a(int param0) {
        if (param0 < 20) {
            nk.a(-69);
        }
        field_M = null;
        field_K = null;
        field_H = null;
        field_I = null;
        field_J = null;
    }

    nk(String param0, ol param1) {
        super(param0, (cd) null);
        ((nk) this).field_L = null;
        try {
            ((nk) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
            return;
        }
        gm var5 = (gm) (Object) ((nk) this).field_w;
        pb var6 = ((nk) this).field_L;
        if (var6 != null) {
            var7 = var5.a(param1, (fi) this, param0 ^ -7537);
            var8 = var5.b(param0 + -587719076, (fi) this, param2);
            do {
                b.a(-2 + (var8 - -var6.field_g), (byte) 69, -2 + var6.field_r + var7, var6.field_j + 2, 2 + var6.field_s);
                var6 = var6.field_q;
            } while (var6 != null);
        }
    }

    private final pb a(int param0, byte param1, int param2) {
        pb var4 = null;
        pb var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var4 = (pb) (Object) ((nk) this).field_G.a((byte) -98);
        L0: while (true) {
          if (var4 == null) {
            return null;
          } else {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (pb) (Object) ((nk) this).field_G.a(16213);
                continue L0;
              } else {
                L2: {
                  if (var5.field_r > param2) {
                    break L2;
                  } else {
                    if (param0 < var5.field_g) {
                      break L2;
                    } else {
                      if (param2 >= var5.field_r + var5.field_j) {
                        break L2;
                      } else {
                        if (var5.field_s + var5.field_g >= param0) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_q;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ((nk) this).a(((gm) (Object) ((nk) this).field_w).a((fi) this, param3 ^ -12), true, param1, param2, param0);
        if (param3 != -125) {
            ((nk) this).b((byte) -28, -103, -84, -16);
        }
    }

    final void e(int param0) {
        int var2 = 0;
        gm var3 = null;
        ie var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ri var12 = null;
        int var13 = 0;
        int var14 = 0;
        pb var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = Virogrid.field_F ? 1 : 0;
          ((nk) this).field_G = new p();
          if (param0 <= -108) {
            break L0;
          } else {
            var17 = null;
            ((nk) this).a((String) null, (byte) -61, 38);
            break L0;
          }
        }
        var2 = 0;
        var3 = (gm) (Object) ((nk) this).field_w;
        var4 = var3.a((fi) this, (byte) -122);
        L1: while (true) {
          var5 = ((nk) this).field_n.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((nk) this).field_n.indexOf(">", var5);
            var6 = ((nk) this).field_n.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((nk) this).field_n.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, 0);
            var9 = var4.b(var2, 0);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_d[var11];
                  if (var11 != var8) {
                    stackOut_8_0 = var12.field_d[0];
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var4.a(var5, -1);
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 != var9) {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_d[var12.field_d.length - 1];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a(var2, -1);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new pb(var7, var13, var12.field_c, -var13 + var14, Math.max(var3.a(0), var12.field_b + -var12.field_c));
                  if (var10 != null) {
                    ((pb) var10).field_q = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((nk) this).field_G.a((l) (Object) var15, (byte) -91);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((nk) this).e(-121);
    }

    void a(int param0, int param1, fi param2, int param3) {
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
              super.a(param0, 115, param2, param3);
              ((nk) this).field_L = null;
              if (((nk) this).field_p) {
                var5_int = -((nk) this).field_l + (-param0 + nl.field_u);
                var6 = -((nk) this).field_u + -param3 + hk.field_Jb;
                ((nk) this).field_L = this.a(var6, (byte) -53, var5_int);
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("nk.E(").append(param0).append(44).append(114).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5 = -19 / ((-33 - param0) / 42);
        super.b((byte) -102, param1, param2, param3);
        int var6 = param3 - ((nk) this).field_l;
        int var7 = -((nk) this).field_u + param2;
        pb var8 = this.a(var7, (byte) -53, var6);
        if (var8 != null) {
            if (!(((nk) this).field_o == null)) {
                ((im) (Object) ((nk) this).field_o).a(var8.field_o, param1, true, (nk) this);
            }
        }
    }

    boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == -8515) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("nk.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    String d(int param0) {
        if (null == ((nk) this).field_L) {
            return null;
        }
        if (null == ((nk) this).field_F) {
            return null;
        }
        if (param0 < 35) {
            ((nk) this).field_F = null;
        }
        if (((nk) this).field_F.length <= ((nk) this).field_L.field_o) {
            return null;
        }
        return ((nk) this).field_F[((nk) this).field_L.field_o];
    }

    final void a(String param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 < -58) {
              L1: {
                L2: {
                  if (((nk) this).field_F == null) {
                    break L2;
                  } else {
                    if (param2 >= ((nk) this).field_F.length) {
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
                  if (((nk) this).field_F == null) {
                    break L3;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((nk) this).field_F.length) {
                        break L3;
                      } else {
                        var7[var5] = ((nk) this).field_F[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                ((nk) this).field_F = var8;
                break L1;
              }
              ((nk) this).field_F[param2] = param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("nk.K(");
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
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Set up new unrated game";
        field_J = "Confirm Email:";
    }
}
