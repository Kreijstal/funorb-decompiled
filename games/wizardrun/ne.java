/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String field_d;
    static int[] field_h;
    private boolean field_c;
    static ji field_b;
    static int field_g;
    static int[] field_e;
    private String field_f;
    static String field_a;

    final static int a(byte param0) {
        if (param0 != 28) {
            field_b = (ji) null;
            return h.field_p;
        }
        return h.field_p;
    }

    final static boolean b(int param0) {
        if (param0 != 22845) {
            return true;
        }
        if (jc.field_H == null) {
            return false;
        }
        if (!wh.field_j.a(0)) {
            return false;
        }
        return true;
    }

    final String a(int param0) {
        if (param0 != 160) {
            ne.a((byte) -6);
            return this.field_f;
        }
        return this.field_f;
    }

    ne(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != -1) {
            ne.a((byte) 40);
        }
    }

    final static String b(byte param0) {
        int var1;
        var1 = -110 / ((70 - param0) / 56);
        if (!ol.field_b) {
          if (jc.field_I <= gj.field_b) {
            if (jc.field_I + ll.field_o <= gj.field_b) {
              return null;
            } else {
              return vb.field_I;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (128 > param0) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = ki.field_G;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) == (var4 ^ -1)) {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            if (param1 == 160) {
              stackIn_23_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_21_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2_ref), "ne.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 < 118) {
            return true;
        }
        return this.field_c;
    }

    ne(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_f = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ne) (this)).field_c = stackIn_4_1 != 0;
              if (null != this.field_f) {
                break L2;
              } else {
                this.field_f = "";
                break L2;
              }
            }
            if (this.field_f.length() == 0) {
              this.field_c = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ne.<init>(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_e = new int[8192];
        field_a = "Menu";
    }
}
