/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends ana {
    static kv field_v;
    static wba field_x;
    private lca field_A;
    static kv field_y;
    static sna field_z;
    static int field_w;

    final boolean c(byte param0) {
        int var2;
        int fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (-1 >= (fieldTemp$1 ^ -1)) {
          if (this.field_l == 25) {
            this.e((byte) -86);
            return false;
          } else {
            return false;
          }
        } else {
          var2 = -58 / ((71 - param0) / 47);
          this.f((byte) -85);
          return true;
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 11 % ((param0 - 66) / 32);
        field_y = null;
    }

    bna(gj param0, lca param1) {
        super(param0, param1);
        try {
            this.field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static nea b(int param0, String param1) {
        String var2 = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        nea stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (null != wja.field_m) {
              if (param1 != null) {
                if (param1.length() != 0) {
                  var7 = (CharSequence) ((Object) param1);
                  var2 = fq.a(0, var7);
                  if (var2 != null) {
                    L1: {
                      if (param0 <= -19) {
                        break L1;
                      } else {
                        var6 = (String) null;
                        bna.a((byte) -52, (String) null);
                        break L1;
                      }
                    }
                    var3 = (nea) ((Object) wja.field_m.a((long)var2.hashCode(), (byte) -87));
                    L2: while (true) {
                      if (var3 != null) {
                        var8 = (CharSequence) ((Object) var3.field_xb);
                        var4 = fq.a(0, var8);
                        if (var4.equals(var2)) {
                          stackIn_19_0 = (nea) (var3);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3 = (nea) ((Object) wja.field_m.a((byte) -31));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("bna.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nea) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (nea) ((Object) stackIn_10_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final void e(byte param0) {
        if (param0 >= -69) {
          field_v = (kv) null;
          dha.a(-108, this.field_A, this.field_q);
          return;
        } else {
          dha.a(-108, this.field_A, this.field_q);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = -50 / ((13 - param0) / 40);
    }

    final static kv[] a(int param0, vr param1, int param2, int param3) {
        RuntimeException var4 = null;
        kv[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (g.a(param0, param3, -30744, param1)) {
              L1: {
                if (param2 < -20) {
                  break L1;
                } else {
                  field_x = (wba) null;
                  break L1;
                }
              }
              stackIn_6_0 = vma.c(22);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("bna.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var3 = (String) null;
                bna.b(65, (String) null);
                break L1;
              }
            }
            L2: {
              if (null == di.a(param1, -125)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("bna.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_x = new wba(2);
    }
}
