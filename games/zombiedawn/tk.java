/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    private boolean field_h;
    static String[] field_e;
    private String field_f;
    static sd field_a;
    static float[] field_g;
    static float[] field_d;
    private boolean field_c;
    static String field_b;

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        int var1 = 8 / ((64 - param0) / 35);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = 44 / ((param1 - 43) / 55);
        if (14 != param0) {
          if (param0 != 12) {
            if ((param0 ^ -1) != -6) {
              if (8 != param0) {
                if (param0 != 7) {
                  if (6 == param0) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 1;
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          return 1;
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 >= -24) {
          L0: {
            this.c(96);
            stackIn_7_0 = this;

            if (!param0) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((tk) (this)).field_h = stackIn_8_1 != 0;
          this.field_c = true;
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((tk) (this)).field_h = stackIn_4_1 != 0;
          this.field_c = true;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            String var3 = (String) null;
            tk.a((String) null, false, true);
            return this.field_h;
        }
        return this.field_h;
    }

    final String c(int param0) {
        if (param0 != 0) {
            field_d = (float[]) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (param2) {
                stackIn_7_0 = q.field_H.b(param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ZombieDawn.field_K.b(param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 44;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("tk.H(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 122 % ((-46 - param0) / 63);
        return this.field_c;
    }

    tk(String param0) {
        this.field_h = false;
        this.field_c = false;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < ek.field_J) {
                  break L1;
                } else {
                  if (param1.length() <= lg.field_s) {
                    L2: {
                      if (param0 == 84) {
                        break L2;
                      } else {
                        field_a = (sd) null;
                        break L2;
                      }
                    }
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("tk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        int var2 = 0;
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = "SPEED";
        field_g = new float[75];
        field_d = new float[75];
        double var0 = 0.08377580409572781;
        for (var2 = 0; -76 < (var2 ^ -1); var2++) {
            field_d[var2] = (float)Math.cos((double)var2 * var0);
            field_g[var2] = (float)Math.sin(var0 * (double)var2);
        }
    }
}
