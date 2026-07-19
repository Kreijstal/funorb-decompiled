/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private ed field_a;
    private int field_c;
    private gb field_h;
    private int field_e;
    static String field_i;
    private gb field_j;
    static om field_g;
    private gb field_k;
    static ed field_d;
    private int field_b;
    static ed field_f;

    final void a(int param0) {
        boolean discarded$2 = false;
        if (param0 != 256) {
          discarded$2 = ea.c((byte) -28);
          this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
          return;
        } else {
          this.field_a.d(this.field_j.field_a, this.field_j.field_c, this.field_c);
          return;
        }
    }

    final static ab a(byte[] param0, int param1) {
        ab var2 = null;
        RuntimeException var2_ref = null;
        ab stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_f = (ed) null;
                break L1;
              }
            }
            if (param0 != null) {
              var2 = new ab(param0, gn.field_k, gi.field_e, qh.field_k, bc.field_a, qk.field_f, qe.field_a);
              of.a(false);
              stackOut_5_0 = (ab) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ea.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        field_d = null;
        if (param0 <= 114) {
            field_f = (ed) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static int d(byte param0) {
        if (param0 > -95) {
            ea.b((byte) -6);
            return mh.field_f;
        }
        return mh.field_f;
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -7) {
          L0: {
            field_i = (String) null;
            if (this.field_b < this.field_e) {
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
            if (this.field_b < this.field_e) {
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

    final void a(byte param0) {
        this.field_b = this.field_b + 1;
        if (param0 <= 36) {
          L0: {
            this.field_c = -19;
            if (this.e((byte) -7)) {
              this.field_b = this.field_e;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_c = dc.a(256, this.field_e, 0, this.field_b, 64);
          this.field_j.field_a = dc.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
          this.field_j.field_c = dc.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
          return;
        } else {
          L1: {
            if (this.e((byte) -7)) {
              this.field_b = this.field_e;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_c = dc.a(256, this.field_e, 0, this.field_b, 64);
          this.field_j.field_a = dc.a(this.field_h.field_a, this.field_e, this.field_k.field_a, this.field_b, 64);
          this.field_j.field_c = dc.a(this.field_h.field_c, this.field_e, this.field_k.field_c, this.field_b, 64);
          return;
        }
    }

    final static boolean c(byte param0) {
        mn var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        mn var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var4 = (mn) ((Object) je.field_a.a(false));
            var1 = var4;
            if (var1 != null) {
              if (param0 <= -47) {
                var2 = 0;
                L1: while (true) {
                  if (var1.field_i <= var2) {
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L2: {
                      if (var4.field_r[var2] == null) {
                        break L2;
                      } else {
                        if (0 != var4.field_r[var2].field_f) {
                          break L2;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      if (null == var4.field_p[var2]) {
                        break L3;
                      } else {
                        if (var4.field_p[var2].field_f == 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ea.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    ea(gb param0, gb param1, ed param2, int param3) {
        this.field_c = 0;
        this.field_b = 0;
        try {
            this.field_h = param1;
            this.field_a = param2;
            this.field_k = param0;
            this.field_e = param3;
            this.field_j = this.field_k.a(10);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_i = "M";
        field_g = new om(9, 0, 4, 1);
        field_d = new ed(270, 70);
    }
}
