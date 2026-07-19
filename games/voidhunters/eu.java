/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends ev {
    private int field_j;
    private int field_g;
    private int field_k;
    static lpb field_h;
    static fcb field_i;
    private int field_f;

    final void a(int param0, byte param1, int param2) {
        if (param1 != 110) {
            this.field_k = -72;
        }
    }

    final static boolean a(boolean param0) {
        boolean discarded$5 = false;
        if (param0) {
          if (qmb.field_q >= 10) {
            if (-14 < (ef.field_z ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$5 = eu.a(true);
          if (qmb.field_q >= 10) {
            if (-14 < (ef.field_z ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 > 36) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (2048 <= param0) {
                stackOut_9_0 = kra.field_a[-param0 + 4096];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = kra.field_a[param0];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (6144 > param0) {
                stackOut_5_0 = -kra.field_a[param0 + -4096];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -kra.field_a[8192 + -param0];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 103;
        }
    }

    public static void b(int param0) {
        if (param0 != 30826) {
            field_h = (lpb) null;
            field_i = null;
            field_h = null;
            return;
        }
        field_i = null;
        field_h = null;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -112) {
            this.field_g = 94;
        }
    }

    eu(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_k = param1;
        this.field_f = param3;
        this.field_j = param2;
        this.field_g = param0;
    }

    final static void a(eab param0, byte param1, asb param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            oea.field_p = "";
            tba.field_q = param2;
            nwa.field_c = param0;
            if (fjb.field_b.startsWith("win")) {
              oea.field_p = oea.field_p + "windows/";
              break L0;
            } else {
              if (fjb.field_b.startsWith("linux")) {
                oea.field_p = oea.field_p + "linux/";
                break L0;
              } else {
                if (fjb.field_b.startsWith("mac")) {
                  oea.field_p = oea.field_p + "macos/";
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var3_int = -92 % ((param1 - 67) / 49);
          if (!nwa.field_c.field_j) {
            L1: {
              if (fjb.field_a.startsWith("amd64")) {
                break L1;
              } else {
                if (fjb.field_a.startsWith("x86_64")) {
                  break L1;
                } else {
                  L2: {
                    if (fjb.field_a.startsWith("i386")) {
                      break L2;
                    } else {
                      if (fjb.field_a.startsWith("i486")) {
                        break L2;
                      } else {
                        if (fjb.field_a.startsWith("i586")) {
                          break L2;
                        } else {
                          if (!fjb.field_a.startsWith("x86")) {
                            if (fjb.field_a.startsWith("ppc")) {
                              oea.field_p = oea.field_p + "ppc/";
                              return;
                            } else {
                              oea.field_p = oea.field_p + "universal/";
                              return;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  oea.field_p = oea.field_p + "x86/";
                  return;
                }
              }
            }
            oea.field_p = oea.field_p + "x86_64/";
            return;
          } else {
            oea.field_p = oea.field_p + "msjava/";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("eu.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          L4: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * this.field_g >> -253875988;
        int var5 = this.field_j * param2 >> 1372049132;
        int var6 = param1 * this.field_k >> -1279175316;
        int var7 = param1 * this.field_f >> -2049760308;
        ew.a(var6, var5, (byte) 84, var4, var7, this.field_d);
        int var8 = -73 / ((param0 - -48) / 40);
    }

    static {
    }
}
