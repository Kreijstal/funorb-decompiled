/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private String field_g;
    static boolean field_k;
    static mg[][] field_d;
    static int[] field_c;
    static int field_e;
    static int[] field_j;
    static dl field_a;
    static String field_h;
    static String field_b;
    hj[] field_i;
    static String field_f;

    final static ma a(byte param0, int param1) {
        if (param0 >= -96) {
            da var3 = (da) null;
            va.a(81, (da) null);
        }
        ma var2 = new ma();
        sg.field_v.a((byte) -126, var2);
        hh.a(param1, (byte) -23);
        return var2;
    }

    final hj[] a(int param0) {
        if (!(null == this.field_i)) {
            return this.field_i;
        }
        if (param0 != 180) {
            return (hj[]) null;
        }
        hj[] dupTemp$0 = le.a(this.field_g, 74);
        this.field_i = dupTemp$0;
        return dupTemp$0;
    }

    final boolean a(byte param0) {
        if (param0 <= 124) {
            this.a((byte) 31);
        }
        return null != this.field_i ? true : false;
    }

    final hj a(int param0, int param1, int param2, int param3) {
        if (null != this.a(180)) {
            return this.field_i[param1];
        }
        if (param2 != 9) {
            field_a = (dl) null;
        }
        return hi.a(param3, (byte) -108, param0);
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 >= -48) {
            va.b((byte) 38);
        }
        field_h = null;
        field_f = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_d = (mg[][]) null;
    }

    final static uj[] a(int param0, da param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uj[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        uj var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        uj[] stackIn_6_0 = null;
        uj[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param1.h(8, 7);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param1.h(12, param0 ^ 11661);
              var4 = new uj[var3];
              var5 = 0;
              if (param0 == 11658) {
                L1: while (true) {
                  if (var5 >= var3) {
                    stackIn_13_0 = (uj[]) (var4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (gl.a(param1, (byte) -37)) {
                        var6 = new uj();
                        param1.h(24, 7);
                        param1.h(24, 7);
                        var6.field_g = param1.h(24, 7);
                        param1.h(9, 7);
                        param1.h(12, 7);
                        param1.h(12, 7);
                        param1.h(12, 7);
                        var4[var5] = var6;
                        break L2;
                      } else {
                        var6_int = param1.h(ld.a((byte) -68, var5 - 1), 7);
                        var4[var5] = var4[var6_int];
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (uj[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("va.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uj[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    va(String param0) {
        try {
            this.field_i = null;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[]{125, 180, 180};
        field_b = "achievements to collect";
        field_k = false;
        field_h = "Standings";
        field_f = "1 retry attempt remaining";
    }
}
