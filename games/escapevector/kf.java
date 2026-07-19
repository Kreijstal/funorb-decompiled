/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ah {
    static hh field_p;
    private boolean field_n;
    static ee field_q;
    private String field_s;
    static int[] field_o;
    static n field_r;

    kf(ul param0) {
        super(param0);
        this.field_n = false;
    }

    final void g(int param0) {
        String discarded$0 = null;
        this.field_s = null;
        if (param0 != 22186) {
            String var3 = (String) null;
            discarded$0 = this.a((byte) -126, (String) null);
        }
    }

    final rf a(int param0, String param1) {
        lm var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rf stackIn_3_0 = null;
        rf stackIn_12_0 = null;
        rf stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_2_0 = null;
        rf stackOut_11_0 = null;
        rf stackOut_16_0 = null;
        rf stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!tg.a(87, var4)) {
              stackOut_2_0 = ob.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_p = (hh) null;
                  break L1;
                }
              }
              L2: {
                if (!param1.equals(this.field_s)) {
                  L3: {
                    var3 = of.a(122, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_f) {
                        this.field_n = var3.field_a;
                        this.field_s = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_11_0 = ug.field_c;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_n) {
                  stackOut_16_0 = ob.field_a;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = df.field_h;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("kf.G(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (-1 == (param1 ^ -1)) {
          return param2;
        } else {
          if (param1 == 1) {
            return param2;
          } else {
            if ((param1 ^ -1) == -3) {
              return 100 * param2;
            } else {
              if (param0 > 5) {
                if (-4 == (param1 ^ -1)) {
                  return param2 * 100;
                } else {
                  return param2;
                }
              } else {
                return 107;
              }
            }
          }
        }
    }

    final static om a(byte param0, int param1) {
        om[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        om[] var6 = null;
        var5 = EscapeVector.field_A;
        var6 = vh.e(-91);
        var2 = var6;
        var3 = 2 % ((3 - param0) / 49);
        var4 = 0;
        L0: while (true) {
          if (var6.length > var4) {
            if (param1 != var6[var4].field_f) {
              var4++;
              continue L0;
            } else {
              return var6[var4];
            }
          } else {
            return null;
          }
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lm var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_14_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            var3 = ok.a(0, var6);
            var4 = 4 / ((param0 - 10) / 51);
            if (var3 == null) {
              L1: {
                if (!param1.equals(this.field_s)) {
                  var5 = of.a(122, param1);
                  if (var5 != null) {
                    if (var5.field_f == null) {
                      this.field_n = var5.field_a;
                      this.field_s = param1;
                      break L1;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_n) {
                stackOut_14_0 = fd.field_b;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_12_0 = vn.field_b;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (String) (var3);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("kf.L(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_r = null;
        if (param0 != 0) {
          field_q = (ee) null;
          field_p = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          return;
        }
    }

    static {
        field_o = new int[4];
        field_q = new ee("email");
    }
}
