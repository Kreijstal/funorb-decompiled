/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip extends m implements jo {
    static String field_j;
    static int[] field_l;
    static String field_i;
    private rm field_h;
    static String field_k;

    abstract od a(String param0, int param1);

    final static ab a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ab stackIn_3_0 = null;
        ab stackIn_6_0 = null;
        ab stackIn_16_0 = null;
        ab stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int <= 63) {
                var3 = param0;
                L1: while (true) {
                  if (var2_int > var3) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var3 != var2_int - 1) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_16_0 = np.field_E;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((qj.field_b.indexOf(var4) ^ -1) == 0) {
                          stackIn_20_0 = np.field_E;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = ta.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = ri.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ip.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_l = null;
        field_j = null;
        field_k = null;
        if (param0 != 19) {
            String var2 = (String) null;
            ip.a(-122, (String) null);
        }
    }

    public final void a(rm param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -117) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ip.L(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0) {
        int var2;
        int stackIn_3_0 = 0;
        var2 = -78 % ((param0 - 8) / 40);
        if (null != this.field_h.field_w) {
          if (this.field_h.field_w.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackIn_3_0 = 1;
          return stackIn_3_0 != 0;
        }
    }

    abstract String a(byte param0, String param1);

    final od b(boolean param0) {
        if (param0) {
          this.b(true);
          return this.a(this.field_h.field_w, -92);
        } else {
          return this.a(this.field_h.field_w, -92);
        }
    }

    final String c(int param0) {
        if (param0 != 63) {
          field_j = (String) null;
          return this.a((byte) 48, this.field_h.field_w);
        } else {
          return this.a((byte) 48, this.field_h.field_w);
        }
    }

    ip(rm param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(2899);
              if (param1 == 10000536) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ip.R(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_i = "To Customer Support";
        field_k = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";
    }
}
