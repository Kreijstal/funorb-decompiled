/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg implements l {
    static ut field_a;
    static String field_c;
    private long field_b;

    abstract rv a(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        pf var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_15_0 = null;
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
            if (param0 != null) {
              if (param0 instanceof byte[]) {
                var3 = (byte[]) (param0);
                if (param1) {
                  stackOut_8_0 = vq.a(70, var3);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_6_0 = (byte[]) (var3);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (param0 instanceof pf) {
                  var4 = (pf) (param0);
                  stackOut_12_0 = var4.a(2);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 == 18828) {
                    throw new IllegalArgumentException();
                  } else {
                    stackOut_15_0 = (byte[]) null;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("lg.W(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    public final String b(int param0) {
        if (!this.a((byte) -28)) {
          if (param0 <= -23) {
            if ((nj.a(37) ^ -1L) > (350L + this.field_b ^ -1L)) {
              return null;
            } else {
              return this.e(-1);
            }
          } else {
            field_c = (String) null;
            if ((nj.a(37) ^ -1L) > (350L + this.field_b ^ -1L)) {
              return null;
            } else {
              return this.e(-1);
            }
          }
        } else {
          return null;
        }
    }

    public final rv c(int param0) {
        if (this.a((byte) -28)) {
          return os.field_l;
        } else {
          if (nj.a(-104) >= 350L + this.field_b) {
            if (param0 != -24407) {
              field_a = (ut) null;
              return this.a(false);
            } else {
              return this.a(false);
            }
          } else {
            return mn.field_c;
          }
        }
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        byte[] discarded$2 = null;
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 79) {
                break L1;
              } else {
                var3 = (Object) null;
                discarded$2 = lg.a((Object) null, true, -58);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < aq.field_c) {
                  break L2;
                } else {
                  if (param0.length() > ko.field_c) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("lg.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void a(int param0) {
        this.field_b = nj.a(-122);
        int var2 = 76 % ((42 - param0) / 58);
    }

    final static js a(int param0, int param1) {
        if (!((param0 ^ -1) != 0)) {
            return (js) ((Object) um.field_e);
        }
        if (!(param0 != -2)) {
            return (js) ((Object) sr.field_l);
        }
        if (param1 != 24939) {
            return (js) null;
        }
        if (!(2 != (param0 ^ -1))) {
            return (js) ((Object) new kt());
        }
        if (4 == (param0 ^ -1)) {
            return (js) ((Object) new e());
        }
        if (!(0 <= param0)) {
            throw new IllegalStateException();
        }
        return (js) ((Object) rn.a(-118, param0));
    }

    abstract String e(int param0);

    static {
        field_c = "Records";
        field_a = new ut(926, 1374);
    }
}
