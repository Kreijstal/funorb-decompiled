/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends bw {
    int field_h;
    static int[] field_i;
    static String field_g;
    static jg field_f;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 < -87) {
                break L1;
              } else {
                ji.a(-69);
                break L1;
              }
            }
            L2: {
              if (ld.field_n != -1) {
                break L2;
              } else {
                if (hda.field_o != -1) {
                  break L2;
                } else {
                  ld.field_n = mk.field_p;
                  hda.field_o = gd.field_m;
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                df.field_o = df.field_o + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) ov.field_g)) {
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != ov.field_g) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!b.field_r) {
                  if (pv.field_i <= df.field_o) {
                    if (pv.field_i - -oha.field_i > df.field_o) {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_19_0 = stackOut_16_0;
                      break L5;
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_19_0 = stackOut_14_0;
                    break L5;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_19_0 = stackOut_12_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_19_0;
                if (param1 == null) {
                  df.field_o = 0;
                  break L6;
                } else {
                  if (b.field_r) {
                    df.field_o = pv.field_i;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      df.field_o = pv.field_i;
                      break L6;
                    } else {
                      df.field_o = 0;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                if (param1 != null) {
                  b.field_r = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    b.field_r = true;
                    break L7;
                  }
                }
              }
              jl.field_s = ld.field_n;
              eaa.field_b = hda.field_o;
              break L3;
            }
            L8: {
              ov.field_g = param1;
              if (b.field_r) {
                break L8;
              } else {
                if (pv.field_i <= df.field_o) {
                  break L8;
                } else {
                  if (dda.field_f) {
                    jl.field_s = ld.field_n;
                    df.field_o = 0;
                    eaa.field_b = hda.field_o;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              ld.field_n = -1;
              hda.field_o = -1;
              if (!b.field_r) {
                break L9;
              } else {
                if (df.field_o != lfa.field_o) {
                  break L9;
                } else {
                  df.field_o = 0;
                  b.field_r = false;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("ji.A(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
    }

    ji(int param0) {
        ((ji) this).field_h = param0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 40) {
          field_f = null;
          jna.a(true, param0);
          hda.a((byte) -91, param0);
          return;
        } else {
          jna.a(true, param0);
          hda.a((byte) -91, param0);
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 < 10) {
            ji.a(111);
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Username: ";
        field_i = new int[8192];
        field_f = new jg();
    }
}
