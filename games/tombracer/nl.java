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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 5) {
              stackIn_4_0 = this.field_a.equals(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("nl.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
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
              L3: {
                if (hc.field_h < param2) {
                  break L3;
                } else {
                  if (gca.field_d <= param3) {
                    L4: {
                      if (param1 < pka.field_b) {
                        param1 = pka.field_b;
                        var6_int = 0;
                        break L4;
                      } else {
                        if (param1 <= ss.field_c) {
                          var6_int = 1;
                          break L4;
                        } else {
                          var6_int = 0;
                          param1 = ss.field_c;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (pka.field_b > param4) {
                        param4 = pka.field_b;
                        var7 = 0;
                        break L5;
                      } else {
                        if (ss.field_c >= param4) {
                          var7 = 1;
                          break L5;
                        } else {
                          param4 = ss.field_c;
                          var7 = 0;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (param2 < gca.field_d) {
                        param2 = gca.field_d;
                        break L6;
                      } else {
                        incrementValue$0 = param2;
                        param2++;
                        nra.a((byte) -55, param0, param4, vaa.field_a[incrementValue$0], param1);
                        break L6;
                      }
                    }
                    L7: {
                      if (hc.field_h >= param3) {
                        incrementValue$1 = param3;
                        param3--;
                        nra.a((byte) -55, param0, param4, vaa.field_a[incrementValue$1], param1);
                        break L7;
                      } else {
                        param3 = hc.field_h;
                        break L7;
                      }
                    }
                    L8: {
                      if (var6_int == 0) {
                        break L8;
                      } else {
                        if (var7 != 0) {
                          var8 = param2;
                          L9: while (true) {
                            if (var8 > param3) {
                              break L3;
                            } else {
                              var12 = vaa.field_a[var8];
                              var11 = var12;
                              var9 = var11;
                              var12[param4] = param0;
                              var9[param1] = param0;
                              var8++;
                              continue L9;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var6_int == 0) {
                      if (var7 == 0) {
                        break L3;
                      } else {
                        var8 = param2;
                        L10: while (true) {
                          if (var8 > param3) {
                            break L3;
                          } else {
                            vaa.field_a[var8][param4] = param0;
                            var8++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      var8 = param2;
                      L11: while (true) {
                        if (param3 < var8) {
                          break L3;
                        } else {
                          vaa.field_a[var8][param1] = param0;
                          var8++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
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
        try {
            lha.a(this.field_a, "jagex-last-login-method", (byte) 121, 31536000L, param0);
            if (param1 != 5) {
                String var4 = (String) null;
                this.a((String) null, -66);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -35) {
            nl.a(55, 84, -11, -72, -118, -51);
        }
        field_c = null;
        field_e = null;
        field_f = null;
    }

    final static pha a(boolean param0, long param1) {
        if (!param0) {
            nl.a(false, 56L);
        }
        return (pha) ((Object) fua.field_a.a(-126, param1));
    }

    static {
        field_d = 5;
        field_c = "Loading...";
        field_f = new vna();
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = false;
    }
}
