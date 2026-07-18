/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    String field_i;
    private int field_b;
    float field_g;
    static String field_a;
    static kh field_e;
    static String[] field_h;
    private int field_f;
    private t[] field_c;

    private final void a(t param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
          var4_float = (float)(1 + ((gf) this).field_f) + (float)param1 / 100.0f;
          ((gf) this).field_g = var4_float * (float)((gf) this).field_b / (float)(1 + ((gf) this).field_d);
          if (0 == param1) {
            ((gf) this).field_i = param0.field_g;
            return;
          } else {
            ((gf) this).field_i = param0.field_a + " - " + param1 + "%";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("gf.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + 73 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        int var1 = 0;
    }

    final boolean a(int param0) {
        t var2 = null;
        int var2_int = 0;
        int var3 = 0;
        t var4 = null;
        var3 = Main.field_T;
        L0: while (true) {
          if (((gf) this).field_f < ((gf) this).field_d) {
            var4 = ((gf) this).field_c[((gf) this).field_f];
            var2 = var4;
            if (!var4.field_d.b(4)) {
              this.a(var4, 0, (byte) 73);
              return false;
            } else {
              L1: {
                if (var4.field_c < 0) {
                  break L1;
                } else {
                  if (var4.field_d.a(var4.field_c, 70)) {
                    break L1;
                  } else {
                    this.a(var2, var4.field_d.a((byte) 60, var4.field_c), (byte) 73);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_b) {
                  break L2;
                } else {
                  if (!var4.field_d.b(4, var4.field_b)) {
                    this.a(var2, var4.field_d.a(var4.field_b, 0), (byte) 73);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_c >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_b) {
                    break L3;
                  } else {
                    if (null == var4.field_a) {
                      break L3;
                    } else {
                      if (!var4.field_d.a((byte) 29)) {
                        this.a(var2, var4.field_d.a(2), (byte) 73);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((gf) this).field_f = ((gf) this).field_f + 1;
              continue L0;
            }
          } else {
            var2_int = -46 / ((59 - param0) / 39);
            return true;
          }
        }
    }

    final static md[] a(int param0, le param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        md[] var4 = null;
        int var5 = 0;
        md var6 = null;
        int var7 = 0;
        vi var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        md[] stackIn_3_0 = null;
        md[] stackIn_11_0 = null;
        md[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        md[] stackOut_10_0 = null;
        md[] stackOut_15_0 = null;
        md[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            if (param1.b((byte) -117)) {
              var8 = param1.a((byte) 104);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a == 2) {
                    stackOut_10_0 = new md[]{};
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new md[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_15_0 = (md[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new md();
                        var4[var5] = var6;
                        var6.field_b = var3[var5 << 2];
                        var6.field_a = var3[1 + (var5 << 2)];
                        var6.field_d = var3[(var5 << 2) - -2];
                        var6.field_c = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  wk.a((byte) -117, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new md[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("gf.A(").append(-2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
