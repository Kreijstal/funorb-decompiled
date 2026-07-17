/*
 * Decompiled by CFR-JS 0.4.0.
 */
class el extends rh {
    static String field_J;
    private String[] field_M;
    static String[] field_O;
    static String field_K;
    private ja field_I;
    static kk field_L;
    private fi field_N;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (param1 != -3050) {
            field_O = null;
        }
        ((el) this).b(true);
    }

    public static void c(boolean param0) {
        field_L = null;
        field_O = null;
        field_J = null;
        field_K = null;
    }

    final static Boolean j(int param0) {
        Boolean var1 = qi.field_c;
        qi.field_c = null;
        if (param0 != 2) {
            field_J = null;
        }
        return var1;
    }

    final void b(boolean param0) {
        int var2 = 0;
        dl var3 = null;
        rb var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        va var12 = null;
        int var13 = 0;
        int var14 = 0;
        fi var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var16 = TrackController.field_F ? 1 : 0;
        ((el) this).field_I = new ja();
        var2 = 0;
        var3 = (dl) (Object) ((el) this).field_y;
        if (param0) {
          var4 = var3.a((byte) 96, (al) this);
          L0: while (true) {
            var5 = ((el) this).field_s.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = ((el) this).field_s.indexOf(">", var5);
              var6 = ((el) this).field_s.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((el) this).field_s.indexOf("</hotspot>", var5);
              var8 = var4.a(var5, (byte) -36);
              var9 = var4.a(var2, (byte) -36);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_b[var11];
                    if (var8 == var11) {
                      stackOut_9_0 = var4.a((byte) 111, var5);
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_8_0 = var12.field_b[0];
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_10_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var12.field_b[var12.field_b.length + -1];
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    } else {
                      stackOut_11_0 = var4.a((byte) 111, var2);
                      stackIn_15_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_15_0;
                    var15 = new fi(var7, var13, var12.field_c, var14 + -var13, Math.max(var3.a((byte) 46), var12.field_f + -var12.field_c));
                    if (var10 != null) {
                      ((fi) var10).field_j = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((el) this).field_I.a((byte) -121, (fc) (Object) var15);
                  var10 = (Object) (Object) var15;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    String e(int param0) {
        if (null == ((el) this).field_N) {
            return null;
        }
        if (null == ((el) this).field_M) {
            return null;
        }
        if (param0 != 0) {
            ((el) this).a(-54, (byte) 36, -103, -82);
        }
        if (((el) this).field_N.field_q >= ((el) this).field_M.length) {
            return null;
        }
        return ((el) this).field_M[((el) this).field_N.field_q];
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2 + param2, param3);
        int var5 = param1 - ((el) this).field_p;
        int var6 = param0 + -((el) this).field_m;
        fi var7 = this.b(var5, var6, 9);
        if (var7 != null) {
            if (!(((el) this).field_l == null)) {
                ((jg) (Object) ((el) this).field_l).a((el) this, var7.field_q, param3, 1);
            }
        }
    }

    el(String param0, t param1) {
        super(param0, (tg) null);
        ((el) this).field_N = null;
        try {
            ((el) this).field_y = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "el.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final fi b(int param0, int param1, int param2) {
        fi var4 = null;
        fi var5 = null;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (param2 == 9) {
            break L0;
          } else {
            field_O = null;
            break L0;
          }
        }
        var4 = (fi) (Object) ((el) this).field_I.b(param2 ^ 11);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (fi) (Object) ((el) this).field_I.a(10);
                continue L1;
              } else {
                L3: {
                  if (var5.field_n > param0) {
                    break L3;
                  } else {
                    if (var5.field_r > param1) {
                      break L3;
                    } else {
                      if (param0 >= var5.field_k + var5.field_n) {
                        break L3;
                      } else {
                        if (var5.field_r - -var5.field_m >= param1) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        dl var5 = (dl) (Object) ((el) this).field_y;
        fi var6 = ((el) this).field_N;
        if (var6 != null) {
            var7 = var5.a(param1, (al) this, 0);
            var8 = var5.a((al) this, -62, param2);
            do {
                bc.a(var6.field_m - -2, -28846, 2 + var6.field_k, var8 - (-var6.field_r + 2), -2 + (var7 - -var6.field_n));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != -44) {
            return;
        }
        ((el) this).a(((dl) (Object) ((el) this).field_y).a(103, (al) this), -3050, param0, param2, param3);
    }

    boolean a(byte param0, al param1) {
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
            if (param0 <= -104) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((el) this).field_I = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("el.QA(").append(param0).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, byte param2, al param3) {
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
              ((el) this).field_N = null;
              if (!((el) this).field_q) {
                break L1;
              } else {
                var5_int = kf.field_b - (param1 - -((el) this).field_p);
                var6 = -((el) this).field_m + (fg.field_a - param0);
                ((el) this).field_N = this.b(var5_int, var6, param2 + 133);
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
            stackOut_3_1 = new StringBuilder().append("el.EA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(byte param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 118 % ((param0 - -2) / 52);
                if (null == ((el) this).field_M) {
                  break L2;
                } else {
                  if (((el) this).field_M.length > param2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var5 = new String[1 + param2];
                if (null == ((el) this).field_M) {
                  break L3;
                } else {
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= ((el) this).field_M.length) {
                      break L3;
                    } else {
                      var5[var6] = ((el) this).field_M[var6];
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
              ((el) this).field_M = var5;
              break L1;
            }
            ((el) this).field_M[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("el.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Unable to connect to the data server. Please check any firewall you are using.";
        field_K = "Suggested names: ";
    }
}
