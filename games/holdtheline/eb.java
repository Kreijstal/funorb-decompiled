/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends qm {
    boolean field_m;
    static String field_p;
    int field_l;
    static boolean[] field_j;
    static String[] field_n;
    static fb field_o;
    static String field_k;

    eb(eb param0) {
        super(param0.field_h, param0.field_f);
        try {
            this.field_m = false;
            this.field_l = param0.field_l;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static sd a(String param0, long param1, boolean param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        sd stackIn_2_0 = null;
        fh stackIn_6_0 = null;
        bn stackIn_10_0 = null;
        pd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4) {
              L1: {
                if (0L != param1) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    stackIn_6_0 = new fh(param0, param3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (param2) {
                stackIn_10_0 = new bn(param1, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = new pd(param1, param3);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (sd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("eb.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sd) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (sd) ((Object) stackIn_10_0);
            } else {
              return (sd) ((Object) stackIn_12_0);
            }
          }
        }
    }

    final static void b(int param0) {
        int fieldTemp$1 = 0;
        da var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            var1 = da.field_p;
            L1: while (true) {
              if (!ad.a(100)) {
                L2: {
                  if (param0 < -67) {
                    break L2;
                  } else {
                    var4 = (String) null;
                    eb.a((String) null, 111L, true, (String) null, true);
                    break L2;
                  }
                }
                break L0;
              } else {
                var1.c((byte) 33, 8);
                fieldTemp$1 = var1.field_l + 1;
                var1.field_l = var1.field_l + 1;
                var2 = fieldTemp$1;
                dl.a(0, var1);
                da.field_p.a(-268435456, var1.field_l + -var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "eb.G(" + param0 + ')');
        }
    }

    eb(qm param0, int param1) {
        super(param0.field_h, param0.field_f);
        try {
            this.field_l = param1;
            this.field_m = false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_k = null;
        field_n = null;
        field_j = null;
        if (param0 != 8) {
            return;
        }
        field_p = null;
    }

    final static void a(boolean param0, ah[] param1) {
        ah[] var2 = null;
        int var3 = 0;
        ah var4 = null;
        int var5 = 0;
        ah[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var6 = param1;
            var2 = var6;
            if (!param0) {
              var3 = 0;
              L1: while (true) {
                if (var3 >= var6.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = var6[var3];
                  ol.a(256, var4);
                  var3++;
                  continue L1;
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
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("eb.I(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_p = "Play Tutorial";
        field_n = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new boolean[64];
        field_k = "Accept";
    }
}
