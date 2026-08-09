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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0 instanceof byte[]) {
                var3 = (byte[]) (param0);
                if (param1) {
                  stackIn_9_0 = vq.a(70, var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (param0 instanceof pf) {
                  var4 = (pf) (param0);
                  stackIn_13_0 = var4.a(2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 == 18828) {
                    throw new IllegalArgumentException();
                  } else {
                    stackIn_16_0 = (byte[]) null;
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
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("lg.W(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L1;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 79) {
                break L1;
              } else {
                var3 = (Object) null;
                lg.a((Object) null, true, -58);
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
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("lg.T(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
