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
        this.field_O = true;
        int var2 = 105 / ((param0 - -39) / 32);
        this.field_L.field_u = false;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        try {
            if ((param0 ? 1 : 0) == (!this.field_P ? 1 : 0)) {
                this.field_P = param0 ? true : false;
                if (this.field_P) {
                    this.field_L.a(4210752, 8405024, (byte) 54);
                    this.field_L.field_u = true;
                } else {
                    this.field_L.a(4210752, 2113632, (byte) 71);
                    if (this.field_O) {
                        this.field_L.field_u = false;
                    }
                }
            }
            if (param1 >= -80) {
                this.field_O = false;
            }
            this.field_K = param2;
            this.field_L.field_z = (int)(param3 / 100.0f * 65536.0f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ng.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ng(lt param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_M = param1;
            if (this.field_M != null) {
                var3_int = b.field_c.a(this.field_M, 260, b.field_c.field_I);
                this.a(300, (byte) 29, var3_int + 150);
            }
            this.field_L = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_P = false;
            this.field_L.field_u = true;
            this.field_O = false;
            this.a(this.field_L, 1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(hc param0, String param1, co param2, int param3, byte param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == 30) {
                break L1;
              } else {
                field_J = (String[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (var7 >= param1.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param1.charAt(var7);
                  if (60 != var8) {
                    break L3;
                  } else {
                    var6 = (var5_int >> -50427512) + param2.field_h[0] + param0.a(param1.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (0 != (var6 ^ -1)) {
                    param2.field_h[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param3;
                        break L5;
                      }
                    }
                    param2.field_h[var7] = param2.field_h[0] + (var5_int >> 719042120) + (param0.a(param1.substring(0, 1 + var7)) + -param0.a((char) var8));
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ng.V(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void j(int param0) {
        field_J = null;
        if (param0 != 11617) {
            co var2 = (co) null;
            ng.a((hc) null, (String) null, (co) null, 27, (byte) -23);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, param2);
        b.field_c.c(this.field_K, (this.field_q >> 1128664705) + param1, 103 + param2, 16777215, -1);
        if (null != this.field_M) {
            vp.b(20 + param1, 120 + param2 - 7, 260, 8421504);
            b.field_c.a(this.field_M, 20 + param1, 128 + param2, 260, 100, 16777215, -1, 1, 0, b.field_c.field_I);
        }
    }

    static {
        field_J = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
