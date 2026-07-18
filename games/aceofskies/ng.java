/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends rg {
    private String field_K;
    private boolean field_O;
    static String[] field_J;
    private ss field_L;
    private boolean field_P;
    private String field_M;

    final void k(int param0) {
        ((ng) this).field_O = true;
        int var2 = 105 / ((param0 - -39) / 32);
        ((ng) this).field_L.field_u = false;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        try {
            if ((param0 ? 1 : 0) == (!((ng) this).field_P ? 1 : 0)) {
                ((ng) this).field_P = param0 ? true : false;
                if (((ng) this).field_P) {
                    ((ng) this).field_L.a(4210752, 8405024, (byte) 54);
                    ((ng) this).field_L.field_u = true;
                } else {
                    ((ng) this).field_L.a(4210752, 2113632, (byte) 71);
                    if (((ng) this).field_O) {
                        ((ng) this).field_L.field_u = false;
                    }
                }
            }
            if (param1 >= -80) {
                ((ng) this).field_O = false;
            }
            ((ng) this).field_K = param2;
            ((ng) this).field_L.field_z = (int)(param3 / 100.0f * 65536.0f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ng.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ng(lt param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((ng) this).field_M = param1;
            if (((ng) this).field_M != null) {
                var3_int = b.field_c.a(((ng) this).field_M, 260, b.field_c.field_I);
                ((ng) this).a(300, (byte) 29, var3_int + 150);
            }
            ((ng) this).field_L = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ng) this).field_P = false;
            ((ng) this).field_L.field_u = true;
            ((ng) this).field_O = false;
            ((ng) this).a((ea) (Object) ((ng) this).field_L, 1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(hc param0, String param1, co param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (var7 >= param1.length()) {
                break L0;
              } else {
                L2: {
                  var8 = param1.charAt(var7);
                  if (60 != var8) {
                    break L2;
                  } else {
                    var6 = (var5_int >> 8) + param2.field_h[0] + param0.a(param1.substring(0, var7));
                    break L2;
                  }
                }
                L3: {
                  if (var6 != -1) {
                    param2.field_h[var7] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (var8 != 32) {
                        break L4;
                      } else {
                        var5_int = var5_int + param3;
                        break L4;
                      }
                    }
                    param2.field_h[var7] = param2.field_h[0] + (var5_int >> 8) + (param0.a(param1.substring(0, 1 + var7)) + -param0.a((char) var8));
                    break L3;
                  }
                }
                L5: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ng.V(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ',' + 30 + ')');
        }
    }

    public static void j(int param0) {
        field_J = null;
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, param2);
        b.field_c.c(((ng) this).field_K, (((ng) this).field_q >> 1) + param1, 103 + param2, 16777215, -1);
        if (null != ((ng) this).field_M) {
            vp.b(20 + param1, 120 + param2 - 7, 260, 8421504);
            int discarded$0 = b.field_c.a(((ng) this).field_M, 20 + param1, 128 + param2, 260, 100, 16777215, -1, 1, 0, b.field_c.field_I);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
