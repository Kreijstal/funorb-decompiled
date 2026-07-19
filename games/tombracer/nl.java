/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static vna field_f;
    static String field_c;
    private String field_a;
    static int field_d;
    static String[] field_e;
    static boolean field_b;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
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
            if (param1 == 5) {
              stackOut_3_0 = this.field_a.equals(param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("nl.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 14375) {
                break L1;
              } else {
                nl.a(-36, -84, -86, 3, 107, 83);
                break L1;
              }
            }
            L2: {
              if (hc.field_h < param2) {
                break L2;
              } else {
                if (gca.field_d <= param3) {
                  L3: {
                    L4: {
                      if (param1 < pka.field_b) {
                        break L4;
                      } else {
                        L5: {
                          if (param1 <= ss.field_c) {
                            break L5;
                          } else {
                            var6_int = 0;
                            param1 = ss.field_c;
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6_int = 1;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param1 = pka.field_b;
                    var6_int = 0;
                    break L3;
                  }
                  L6: {
                    L7: {
                      if (pka.field_b > param4) {
                        break L7;
                      } else {
                        L8: {
                          if (ss.field_c >= param4) {
                            break L8;
                          } else {
                            param4 = ss.field_c;
                            var7 = 0;
                            if (var10 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var7 = 1;
                        if (var10 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    param4 = pka.field_b;
                    var7 = 0;
                    break L6;
                  }
                  L9: {
                    L10: {
                      if (param2 < gca.field_d) {
                        break L10;
                      } else {
                        incrementValue$2 = param2;
                        param2++;
                        nra.a((byte) -55, param0, param4, vaa.field_a[incrementValue$2], param1);
                        if (var10 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param2 = gca.field_d;
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (hc.field_h >= param3) {
                        break L12;
                      } else {
                        param3 = hc.field_h;
                        if (var10 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    incrementValue$3 = param3;
                    param3--;
                    nra.a((byte) -55, param0, param4, vaa.field_a[incrementValue$3], param1);
                    break L11;
                  }
                  L13: {
                    L14: {
                      if (var6_int == 0) {
                        break L14;
                      } else {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var6_int == 0) {
                        break L15;
                      } else {
                        var8 = param2;
                        L16: while (true) {
                          if (param3 < var8) {
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L15;
                            }
                          } else {
                            vaa.field_a[var8][param1] = param0;
                            var8++;
                            if (var10 != 0) {
                              break L2;
                            } else {
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L2;
                    } else {
                      var8 = param2;
                      L17: while (true) {
                        if (var8 > param3) {
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L13;
                          }
                        } else {
                          vaa.field_a[var8][param4] = param0;
                          var8++;
                          if (var10 != 0) {
                            break L2;
                          } else {
                            continue L17;
                          }
                        }
                      }
                    }
                  }
                  var8 = param2;
                  L18: while (true) {
                    if (var8 > param3) {
                      break L2;
                    } else {
                      var12 = vaa.field_a[var8];
                      var11 = var12;
                      var9 = var11;
                      var12[param4] = param0;
                      var9[param1] = param0;
                      var8++;
                      if (var10 == 0) {
                        continue L18;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "nl.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static wv a(int param0, byte param1) {
        if (param1 != 50) {
            field_f = (vna) null;
            return uw.field_g[param0];
        }
        return uw.field_g[param0];
    }

    nl(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        String var4 = null;
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
              lha.a(this.field_a, "jagex-last-login-method", (byte) 121, 31536000L, param0);
              if (param1 == 5) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = this.a((String) null, -66);
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
            stackOut_3_1 = new StringBuilder().append("nl.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -35) {
          nl.a(55, 84, -11, -72, -118, -51);
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static pha a(boolean param0, long param1) {
        pha discarded$2 = null;
        if (!param0) {
          discarded$2 = nl.a(false, 56L);
          return (pha) ((Object) fua.field_a.a(-126, param1));
        } else {
          return (pha) ((Object) fua.field_a.a(-126, param1));
        }
    }

    static {
        field_d = 5;
        field_c = "Loading...";
        field_f = new vna();
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = false;
    }
}
