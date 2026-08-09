/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb implements ci {
    private int field_f;
    static sg field_b;
    static int[] field_h;
    private int field_a;
    static String field_e;
    private int field_j;
    private ee field_g;
    static int field_d;
    private int field_i;
    static java.awt.Canvas field_c;
    private int field_l;
    private int field_k;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        lk stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        h var12 = null;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 instanceof h) {
                stackIn_4_0 = (lk) (param1);
                break L1;
              } else {
                stackIn_4_0 = null;
                break L1;
              }
            }
            L2: {
              var12 = (h) ((Object) stackIn_4_0);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == 11447) {
              vj.c(param0 + param1.field_o, param1.field_i + param3, param1.field_h, param1.field_q, this.field_f);
              var7 = -(2 * var12.field_K) + param1.field_h;
              var8 = param1.field_o + (param0 - -var12.field_K);
              var9 = var12.field_J + param3 - -param1.field_i;
              vj.e(var8, var9, var8 + var7, var9, this.field_l);
              var10 = var12.a(true) + -1;
              L3: while (true) {
                if (0 > var10) {
                  if (this.field_g == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_g.a(var12.field_r, var7 / 2 + var8, this.field_g.field_E + var9 + var12.field_J, this.field_k, this.field_i);
                    return;
                  }
                } else {
                  vj.b(var8 - -(var12.a((byte) -63, var10) * var7 / var12.f((byte) -40)), var9, this.field_j, this.field_a);
                  var10--;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("tb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        qb var2 = null;
        int var3 = 0;
        int var4 = 0;
        dh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Main.field_T;
        try {
          L0: {
            var5 = (dh) ((Object) vb.field_c.a((byte) 74));
            L1: while (true) {
              if (var5 == null) {
                var2 = ue.field_b.a((byte) 74);
                var3 = -54 / ((param1 - -65) / 51);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    fl.b(1, param0);
                    var2 = ue.field_b.b((byte) -104);
                    continue L2;
                  }
                }
              } else {
                ke.a(var5, param0, 21719);
                var5 = (dh) ((Object) vb.field_c.b((byte) -104));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "tb.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static ff a(String param0, String param1, byte param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ff stackIn_2_0 = null;
        ff stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_long = 0L;
            if (param2 == -18) {
              L1: {
                var6 = null;
                if ((param1.indexOf('@') ^ -1) == 0) {
                  var7 = (CharSequence) ((Object) param1);
                  var4_long = fe.a(var7, 109);
                  break L1;
                } else {
                  var6 = param1;
                  break L1;
                }
              }
              stackIn_7_0 = nk.a(-116, param3, var4_long, (String) (var6), param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ff) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("tb.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        String var2;
        if (param0 != 128) {
          var2 = (String) null;
          tb.a((String) null, (String) null, (byte) -86, false);
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    tb(ee param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_i = param2;
            this.field_l = param3;
            this.field_a = param6;
            this.field_j = param5;
            this.field_k = param1;
            this.field_f = param4;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_b = new sg();
        field_e = "Waiting for extra data";
        field_h = new int[128];
    }
}
