/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends bj implements sg, qb {
    static ed field_H;
    static String field_M;
    static int field_J;
    static String field_K;
    static String field_O;
    private hc field_N;
    private qc field_G;
    static String[] field_I;
    private ue field_L;

    public static void j(int param0) {
        field_K = null;
        field_H = null;
        field_I = null;
        field_O = null;
        if (param0 != 1) {
          jf.l(51);
          field_M = null;
          return;
        } else {
          field_M = null;
          return;
        }
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
            hc var3 = (hc) null;
            this.a((hc) null, -9, -71, 98, 16);
            return "</col></u>";
        }
        return "</col></u>";
    }

    jf(qc param0) {
        super(0, 0, 288, 0, (db) null);
        String var7 = null;
        int var3 = 0;
        k var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_G = param0;
            this.field_N = new hc(bm.field_d, (wn) null);
            this.field_N.field_s = (db) ((Object) new ck());
            var7 = r.a(mh.field_c, -63, new String[]{this.k(-102), this.a((byte) 126)});
            var3 = 20;
            var4 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, sb.field_a.field_r, -1, 2147483647, true);
            this.field_L = new ue(var7, var4);
            this.field_L.field_i = "";
            this.field_L.a(ah.field_m, (byte) 102, 0);
            this.field_L.a(ah.field_m, (byte) 104, 1);
            this.field_L.field_q = (wn) (this);
            this.field_L.field_g = this.field_g - 40;
            this.field_L.b(2463, 26, -40 + this.field_g, var3);
            var3 = var3 + (15 + this.field_L.field_x);
            this.b(this.field_L, false);
            var5 = 4;
            var6 = 200;
            this.field_N.a(var6, var3, -var6 + 300 >> 1896692001, true, 40);
            this.field_N.field_q = (wn) (this);
            this.b(this.field_N, false);
            this.a(300, 0, 0, true, var5 + (var3 + 55));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 3) {
          L0: {
            field_M = (String) null;
            if (kb.field_d <= 250) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (kb.field_d <= 250) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                if (1 != param2) {
                  if (param2 == 2) {
                    qd.a(12, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  qd.a(12, "privacy.ws");
                  break L1;
                }
              } else {
                qd.a(param0 ^ -2849, "terms.ws");
                break L1;
              }
            }
            if (param0 == -2861) {
              break L0;
            } else {
              field_H = (ed) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("jf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 18)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 > 0) {
                if (98 != param2) {
                  if (-100 == (param2 ^ -1)) {
                    stackIn_13_0 = this.a(param0, true);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackIn_9_0 = this.a((byte) 22, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("jf.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final String k(int param0) {
        if (param0 >= -90) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        ue var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                var7 = (ue) null;
                this.a(-113, (ue) null, -113, -16);
                break L1;
              }
            }
            if (param0 == this.field_N) {
              sm.b((byte) -125);
              this.field_G.o(-18861);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("jf.K(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = "Level will restart shortly.";
        field_K = "Level: ";
        field_O = "Create a free account to store your progress.";
    }
}
