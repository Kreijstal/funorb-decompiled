/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc extends kf {
    private String[] field_G;
    private wl field_I;
    static String field_J;
    static String[] field_E;
    private ng field_K;
    static fi field_H;
    static String[] field_L;
    static dg field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wl var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = -((bc) this).field_t + param3;
        var6 = param1 - ((bc) this).field_o;
        var7 = this.a(var6, false, var5);
        if (var7 != null) {
          if (((bc) this).field_r != null) {
            ((ue) (Object) ((bc) this).field_r).a(123, (bc) this, var7.field_o, param2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        int var2 = 0;
        ub var3 = null;
        ve var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        rj var12 = null;
        int var13 = 0;
        int var14 = 0;
        wl var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var16 = Lexicominos.field_L ? 1 : 0;
        ((bc) this).field_K = new ng();
        var2 = 0;
        var3 = (ub) (Object) ((bc) this).field_i;
        var4 = var3.a((w) this, (byte) -111);
        L0: while (true) {
          var5 = ((bc) this).field_u.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((bc) this).field_u.indexOf(">", var5);
            var6 = ((bc) this).field_u.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((bc) this).field_u.indexOf("</hotspot>", var5);
            var8 = var4.a(28276, var5);
            var9 = var4.a(28276, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_c[var11];
                  if (var11 != var8) {
                    stackOut_7_0 = var12.field_a[0];
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var4.a((byte) -113, var5);
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var12.field_a[var12.field_a.length + -1];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var4.a((byte) -127, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new wl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c + -var12.field_d));
                  if (var10 != null) {
                    ((wl) var10).field_p = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((bc) this).field_K.b(114, (kd) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L1;
              }
            }
          } else {
            if (param0) {
              return;
            } else {
              wl discarded$1 = this.a(68, true, 35);
              return;
            }
          }
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
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
              ((bc) this).field_I = null;
              if (!((bc) this).field_m) {
                break L1;
              } else {
                var5_int = -((bc) this).field_t + -param3 + bk.field_b;
                var6 = -((bc) this).field_o + sh.field_e - param2;
                ((bc) this).field_I = this.a(var6, false, var5_int);
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
            stackOut_3_1 = new StringBuilder().append("bc.FA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -27371) {
                break L1;
              } else {
                wl discarded$2 = this.a(-40, false, -28);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((bc) this).field_G == null) {
                  break L3;
                } else {
                  if (param1 < ((bc) this).field_G.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (null != ((bc) this).field_G) {
                  var5 = 0;
                  L5: while (true) {
                    if (((bc) this).field_G.length <= var5) {
                      break L4;
                    } else {
                      var7[var5] = ((bc) this).field_G[var5];
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((bc) this).field_G = var8;
              break L2;
            }
            ((bc) this).field_G[param1] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("bc.S(");
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
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl var4 = null;
        wl var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = (wl) (Object) ((bc) this).field_K.a(true);
        if (!param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (wl) (Object) ((bc) this).field_K.f(2);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_j > param2) {
                      break L2;
                    } else {
                      if (var5.field_k > param0) {
                        break L2;
                      } else {
                        if (var5.field_l + var5.field_j <= param2) {
                          break L2;
                        } else {
                          if (var5.field_k + var5.field_h < param0) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_p;
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

    public static void e(boolean param0) {
        field_L = null;
        if (param0) {
          bc.e(true);
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        } else {
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        }
    }

    String b(int param0) {
        if (null != ((bc) this).field_I) {
          if (((bc) this).field_G != null) {
            if (param0 >= 121) {
              if (((bc) this).field_G.length <= ((bc) this).field_I.field_o) {
                return null;
              } else {
                return ((bc) this).field_G[((bc) this).field_I.field_o];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 1;
            stackOut_0_0 = rk.a(10, true, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bc.T(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            if (param0 == 44) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = null;
              boolean discarded$2 = bc.a(false, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bc.LA(").append(param0).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -2) {
          String discarded$2 = ((bc) this).b(35);
          ((bc) this).a(((ub) (Object) ((bc) this).field_i).a(-13293, (w) this), param3, true, param1, param0);
          return;
        } else {
          ((bc) this).a(((ub) (Object) ((bc) this).field_i).a(-13293, (w) this), param3, true, param1, param0);
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        wl var6 = null;
        int var7 = 0;
        int var8 = 0;
        ub var9 = null;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var9 = (ub) (Object) ((bc) this).field_i;
          var6 = ((bc) this).field_I;
          if (var6 == null) {
            return;
          } else {
            var7 = var9.b((w) this, 102, param2);
            var8 = var9.a((w) this, 20340, param1);
            L0: while (true) {
              pk.a(var6.field_h + 2, -2 + (var8 + var6.field_k), var7 - -var6.field_j - 2, param0 ^ -116, var6.field_l + 2);
              var6 = var6.field_p;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    bc(String param0, rd param1) {
        super(param0, (vd) null);
        ((bc) this).field_I = null;
        try {
            ((bc) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "bc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        ((bc) this).f(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
