/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ue extends hc {
    private cn field_D;
    private String[] field_F;
    private bl field_E;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 + -((ue) this).field_k;
        int var6 = param1 + -((ue) this).field_j;
        bl var7 = this.a(var6, (byte) -110, var5);
        if (var7 != null) {
            if (null != ((ue) this).field_q) {
                ((sg) (Object) ((ue) this).field_q).a(param0 ^ 18321, (ue) this, var7.field_m, param3);
            }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) 87, param2, param3);
        if (param1 <= 85) {
            ((ue) this).field_D = null;
        }
        if (param2 != 0) {
            return;
        }
        ao var9 = (ao) (Object) ((ue) this).field_s;
        bl var6 = ((ue) this).field_E;
        if (var6 == null) {
        } else {
            var7 = var9.a((byte) -113, (hm) this, param3);
            var8 = var9.a((hm) this, param0, -16956);
            do {
                ic.a(false, 2 + var6.field_j, var6.field_i + var7 - 2, var6.field_n - -2, -2 + var8 - -var6.field_g);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final void a(String param0, byte param1, int param2) {
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
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (((ue) this).field_F == null) {
                  break L2;
                } else {
                  if (param2 >= ((ue) this).field_F.length) {
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
                if (((ue) this).field_F != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (((ue) this).field_F.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = ((ue) this).field_F[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((ue) this).field_F = var8;
              break L1;
            }
            L5: {
              if (param1 >= 51) {
                break L5;
              } else {
                ue.b(-38, (byte) -110);
                break L5;
              }
            }
            ((ue) this).field_F[param2] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ue.I(");
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
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void k(int param0) {
        int var2 = 0;
        ao var3 = null;
        pg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        vl var12 = null;
        int var13 = 0;
        int var14 = 0;
        bl var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = EscapeVector.field_A;
        ((ue) this).field_D = new cn();
        var2 = param0;
        var3 = (ao) (Object) ((ue) this).field_s;
        var4 = var3.b((hm) this, 90);
        L0: while (true) {
          var5 = ((ue) this).field_l.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((ue) this).field_l.indexOf(">", var5);
            var6 = ((ue) this).field_l.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ue) this).field_l.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, 0);
            var9 = var4.a(var2, 0);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_a[var11];
                  if (var8 == var11) {
                    stackOut_6_0 = var4.a((byte) 122, var5);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var12.field_b[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 == var9) {
                    stackOut_11_0 = var4.a((byte) 125, var2);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var12 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new bl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(109), var12.field_a - var12.field_d));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((bl) var10).field_k = var15;
                    break L4;
                  }
                }
                ((ue) this).field_D.a(-12328, (hg) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
            ue.b(-85, (byte) -78);
        }
        super.a(param0, param1, param2, param3, param4);
        ((ue) this).k(0);
    }

    ue(String param0, db param1) {
        super(param0, (wn) null);
        ((ue) this).field_E = null;
        try {
            ((ue) this).field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ue.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final bl a(int param0, byte param1, int param2) {
        bl var4 = null;
        bl var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var4 = (bl) (Object) ((ue) this).field_D.a(false);
        if (param1 <= -83) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (bl) (Object) ((ue) this).field_D.b((byte) 70);
                  continue L0;
                } else {
                  L2: {
                    if (param2 < var5.field_i) {
                      break L2;
                    } else {
                      if (var5.field_g > param0) {
                        break L2;
                      } else {
                        if (var5.field_i - -var5.field_j <= param2) {
                          break L2;
                        } else {
                          if (var5.field_g + var5.field_n >= param0) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_k;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0, byte param1) {
        try {
            try {
                Object discarded$0 = sd.a((byte) 106, oc.d((byte) -62), new Object[1], "resizing");
            } catch (Throwable throwable) {
            }
            if (param1 <= 93) {
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ue) this).a(param2, param3, param1, true, ((ao) (Object) ((ue) this).field_s).a(-106, (hm) this));
        if (param0 != 2463) {
            ((ue) this).field_F = null;
        }
    }

    boolean a(int param0, hm param1) {
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
            if (param0 == -4659) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((ue) this).field_E = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ue.M(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, hm param3) {
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
              ((ue) this).field_E = null;
              if (!((ue) this).field_u) {
                break L1;
              } else {
                var5_int = -param2 + (dh.field_d + -((ue) this).field_k);
                var6 = -param1 + bj.field_y - ((ue) this).field_j;
                ((ue) this).field_E = this.a(var6, (byte) -111, var5_int);
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
            stackOut_3_1 = new StringBuilder().append("ue.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    String d(int param0) {
        if (((ue) this).field_E == null) {
            return null;
        }
        if (((ue) this).field_F == null) {
            return null;
        }
        if (param0 != 1) {
            return null;
        }
        if (((ue) this).field_E.field_m >= ((ue) this).field_F.length) {
            return null;
        }
        return ((ue) this).field_F[((ue) this).field_E.field_m];
    }

    static {
    }
}
