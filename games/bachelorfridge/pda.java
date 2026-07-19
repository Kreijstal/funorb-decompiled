/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda extends eo {
    private String[] field_r;
    int[] field_s;
    private int[] field_o;
    static String field_q;
    private int[][] field_n;
    static int field_p;

    private final void a(lu param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        du var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_r = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (param2 != 1) {
                if (-3 != (param2 ^ -1)) {
                  if (-4 == (param2 ^ -1)) {
                    var4_int = param0.b(16711935);
                    this.field_o = new int[var4_int];
                    this.field_n = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L4: {
                          var6 = param0.e((byte) 57);
                          var7 = pga.a(false, var6);
                          if (var7 != null) {
                            this.field_o[var5] = var6;
                            array$1 = new int[var7.field_d];
                            this.field_n[var5] = array$1;
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_d) {
                                break L4;
                              } else {
                                this.field_n[var5][var8] = param0.e((byte) 85);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (4 != param2) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  var4_int = param0.b(16711935);
                  this.field_s = new int[var4_int];
                  var5 = 0;
                  L6: while (true) {
                    if (var4_int <= var5) {
                      break L2;
                    } else {
                      this.field_s[var5] = param0.e((byte) 97);
                      var5++;
                      continue L6;
                    }
                  }
                }
              } else {
                this.field_r = fda.a(param1 ^ -1, '<', param0.g(-125));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("pda.L(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
            return;
        }
        if (null != this.field_s) {
            for (var2 = 0; var2 < this.field_s.length; var2++) {
                this.field_s[var2] = mp.a(this.field_s[var2], 32768);
            }
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != -3) {
            field_p = 23;
        }
    }

    final void a(lu param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 >= 89) {
              L1: while (true) {
                var3_int = param0.b(16711935);
                if (var3_int != 0) {
                  this.a(param0, 0, var3_int);
                  continue L1;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("pda.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pda() {
    }

    final String d(byte param0) {
        String discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4 = BachelorFridge.field_y;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == this.field_r) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_r[0]);
        int var3 = 1;
        if (param0 <= 61) {
            discarded$1 = this.d((byte) 118);
        }
        while (var3 < this.field_r.length) {
            discarded$2 = var6.append("...");
            discarded$3 = var6.append(this.field_r[var3]);
            var3++;
        }
        return var6.toString();
    }

    static {
        field_q = "You need a rating of <%1> to play with the current options.";
        field_p = 480;
    }
}
