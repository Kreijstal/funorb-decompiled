/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    private ki field_d;
    static boolean field_b;
    private sd field_f;
    private ki field_e;
    static jn field_c;
    static boolean field_a;

    final static void b(int param0) {
        lf.a(256, (byte) -58);
        if (param0 <= 56) {
            field_b = false;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_a = true;
            if (-1 == (param1 & 33 ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param1 & 33 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final oq a(int param0, int param1) {
        oq var3 = null;
        byte[] var4 = null;
        var3 = (oq) (this.field_f.a((long)param0, 123));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if ((param0 ^ -1) > -32769) {
                break L1;
              } else {
                var4 = this.field_d.a((byte) 115, param0 & 32767, 1);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_e.a((byte) 109, param0, 1);
            break L0;
          }
          L2: {
            var3 = new oq();
            if (var4 != null) {
              var3.a(new fs(var4), true);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param1 >= (param0 ^ -1)) {
              var3.e(param1 ^ 32885);
              break L3;
            } else {
              break L3;
            }
          }
          this.field_f.a((long)param0, var3, (byte) 19);
          return var3;
        }
    }

    final static void a(int param0) {
        cn discarded$2 = null;
        String var2 = null;
        if (param0 < 27) {
          var2 = (String) null;
          discarded$2 = is.a((byte) 10, (String) null);
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, new dd(pu.field_e));
          return;
        } else {
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, new dd(pu.field_e));
          return;
        }
    }

    final static cn a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        cn var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        cn stackIn_6_0 = null;
        cn stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_17_0 = null;
        Object stackOut_20_0 = null;
        cn stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (io.field_b != null) {
              var6 = (CharSequence) ((Object) param1);
              var2 = uk.a(-1, var6);
              if (param0 >= 89) {
                L1: {
                  if (var2 == null) {
                    var2 = param1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (cn) ((Object) io.field_b.a((long)var2.hashCode(), -45));
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) ((Object) var3.field_jb);
                      var4 = uk.a(-1, var7);
                      if (var4 != null) {
                        break L3;
                      } else {
                        var4 = var3.field_jb;
                        break L3;
                      }
                    }
                    if (var4.equals(var2)) {
                      stackOut_17_0 = (cn) (var3);
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3 = (cn) ((Object) io.field_b.a(-109));
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        stackOut_20_0 = null;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_5_0 = (cn) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref);
            stackOut_22_1 = new StringBuilder().append("is.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cn) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return (cn) ((Object) stackIn_21_0);
            }
          }
        }
    }

    private is() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        cn discarded$0 = null;
        field_c = null;
        if (param0) {
            String var2 = (String) null;
            discarded$0 = is.a((byte) 3, (String) null);
        }
    }

    static {
        field_b = false;
    }
}
