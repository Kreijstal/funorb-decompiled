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
          L0: {
            var4_float = (float)(1 + this.field_f) + (float)param1 / 100.0f;
            if (param2 == 73) {
              this.field_g = var4_float * (float)this.field_b / (float)(1 + this.field_d);
              if (0 == param1) {
                this.field_i = param0.field_g;
                return;
              } else {
                this.field_i = param0.field_a + " - " + param1 + "%";
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("gf.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        int var1 = -48 % ((41 - param0) / 57);
    }

    final boolean a(int param0) {
        t var2 = null;
        int var2_int = 0;
        int var3 = 0;
        t var4 = null;
        var3 = Main.field_T;
        L0: while (true) {
          if (this.field_f < this.field_d) {
            var4 = this.field_c[this.field_f];
            var2 = var4;
            if (!var4.field_d.b(4)) {
              this.a(var4, 0, (byte) 73);
              return false;
            } else {
              L1: {
                if ((var4.field_c ^ -1) > -1) {
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
              this.field_f = this.field_f + 1;
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
        md[] stackIn_3_0 = null;
        md[] stackIn_6_0 = null;
        md[] stackIn_13_0 = null;
        md[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        md[] stackOut_12_0 = null;
        md[] stackOut_17_0 = null;
        md[] stackOut_5_0 = null;
        md[] stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            if (param1.b((byte) -117)) {
              if (param0 == -2) {
                var8 = param1.a((byte) 104);
                L1: while (true) {
                  if (var8.field_a != 0) {
                    if ((var8.field_a ^ -1) == -3) {
                      stackOut_12_0 = new md[]{};
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var10 = (int[]) (var8.field_e);
                      var9 = var10;
                      var3 = var9;
                      var4 = new md[var10.length >> 1506736002];
                      var5 = 0;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          stackOut_17_0 = (md[]) (var4);
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new md();
                          var4[var5] = var6;
                          var6.field_b = var3[var5 << -338692862];
                          var6.field_a = var3[1 + (var5 << -1008314494)];
                          var6.field_d = var3[(var5 << -1555115902) - -2];
                          var6.field_c = var3[3 + (var5 << 157481794)];
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
                stackOut_5_0 = (md[]) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = new md[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Cancel";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
