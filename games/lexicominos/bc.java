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
        var5 = -this.field_t + param3;
        var6 = param1 - this.field_o;
        var7 = this.a(var6, false, var5);
        if (var7 != null) {
          if (this.field_r != null) {
            ((ue) ((Object) this.field_r)).a(123, (bc) (this), var7.field_o, param2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        wl discarded$1 = null;
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
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var16 = Lexicominos.field_L ? 1 : 0;
        this.field_K = new ng();
        var2 = 0;
        var3 = (ub) ((Object) this.field_i);
        var4 = var3.a((w) (this), (byte) -111);
        L0: while (true) {
          var5 = this.field_u.indexOf("<hotspot=", var2);
          stackOut_1_0 = var5;
          stackOut_1_1 = -1;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 != stackIn_2_1) {
                  break L3;
                } else {
                  if (var16 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var7 = this.field_u.indexOf(">", var5);
              var6 = this.field_u.substring(9 + var5, var7);
              var7 = Integer.parseInt(var6);
              var2 = this.field_u.indexOf("</hotspot>", var5);
              var8 = var4.a(28276, var5);
              var9 = var4.a(28276, var2);
              var10 = null;
              var11 = var8;
              L4: while (true) {
                L5: {
                  if (var9 < var11) {
                    break L5;
                  } else {
                    var12 = var4.field_c[var11];
                    stackOut_6_0 = var11 ^ -1;
                    stackOut_6_1 = var8 ^ -1;
                    stackIn_2_0 = stackOut_6_0;
                    stackIn_2_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var16 != 0) {
                      continue L1;
                    } else {
                      L6: {
                        if (stackIn_7_0 != stackIn_7_1) {
                          stackOut_9_0 = var12.field_a[0];
                          stackIn_10_0 = stackOut_9_0;
                          break L6;
                        } else {
                          stackOut_8_0 = var4.a((byte) -113, var5);
                          stackIn_10_0 = stackOut_8_0;
                          break L6;
                        }
                      }
                      L7: {
                        var13 = stackIn_10_0;
                        if (var11 != var9) {
                          if (var12 == null) {
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            break L7;
                          } else {
                            stackOut_13_0 = var12.field_a[var12.field_a.length + -1];
                            stackIn_15_0 = stackOut_13_0;
                            break L7;
                          }
                        } else {
                          stackOut_11_0 = var4.a((byte) -127, var2);
                          stackIn_15_0 = stackOut_11_0;
                          break L7;
                        }
                      }
                      L8: {
                        var14 = stackIn_15_0;
                        var15 = new wl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c + -var12.field_d));
                        if (var10 != null) {
                          ((wl) (var10)).field_p = var15;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.field_K.b(114, var15);
                      var10 = var15;
                      var11++;
                      if (var16 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (var16 == 0) {
                  continue L0;
                } else {
                  break L2;
                }
              }
            }
            if (param0) {
              return;
            } else {
              discarded$1 = this.a(68, true, 35);
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
              this.field_I = null;
              if (!this.field_m) {
                break L1;
              } else {
                var5_int = -this.field_t + -param3 + bk.field_b;
                var6 = -this.field_o + sh.field_e - param2;
                this.field_I = this.a(var6, false, var5_int);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bc.FA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        wl discarded$2 = null;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -27371) {
                break L1;
              } else {
                discarded$2 = this.a(-40, false, -28);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (this.field_G == null) {
                    break L4;
                  } else {
                    if (param1 < this.field_G.length) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7 = new String[1 + param1];
                  var4 = var7;
                  if (null != this.field_G) {
                    var5 = 0;
                    L6: while (true) {
                      if (this.field_G.length <= var5) {
                        break L5;
                      } else {
                        var7[var5] = this.field_G[var5];
                        var5++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_G = var7;
                break L3;
              }
              this.field_G[param1] = param0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("bc.S(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl var4 = null;
        wl var5 = null;
        int var6 = 0;
        wl stackIn_7_0 = null;
        wl stackIn_14_0 = null;
        wl stackOut_6_0 = null;
        wl stackOut_13_0 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = (wl) ((Object) this.field_K.a(true));
        if (!param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = (wl) (var5);
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0.field_j > param2) {
                            break L4;
                          } else {
                            if (var5.field_k > param0) {
                              break L4;
                            } else {
                              if (var5.field_l + var5.field_j <= param2) {
                                break L4;
                              } else {
                                if (var5.field_k + var5.field_h < param0) {
                                  break L4;
                                } else {
                                  return var4;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_p;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = (wl) ((Object) this.field_K.f(2));
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                var4 = stackIn_14_0;
                if (var6 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (wl) null;
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
        if (null != this.field_I) {
          if (this.field_G != null) {
            if (param0 >= 121) {
              if (this.field_G.length <= this.field_I.field_o) {
                return null;
              } else {
                return this.field_G[this.field_I.field_o];
              }
            } else {
              return (String) null;
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
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        boolean stackOut_5_0 = false;
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
              if (!param0) {
                break L1;
              } else {
                bc.e(true);
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = 10;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param0) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            stackOut_5_0 = rk.a(stackIn_5_0, stackIn_5_1 != 0, param1, true);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("bc.T(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(byte param0, w param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
              var4 = (CharSequence) null;
              discarded$2 = bc.a(false, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("bc.LA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        String discarded$2 = null;
        if (param2 != -2) {
          discarded$2 = this.b(35);
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        } else {
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        wl var6 = null;
        int var7 = 0;
        int var8 = 0;
        ub var9 = null;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var9 = (ub) ((Object) this.field_i);
          var6 = this.field_I;
          if (var6 == null) {
            return;
          } else {
            var7 = var9.b((w) (this), 102, param2);
            var8 = var9.a((w) (this), 20340, param1);
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
        this.field_I = null;
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        this.f(param2);
    }

    static {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
