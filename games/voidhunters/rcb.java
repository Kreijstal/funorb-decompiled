/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rcb extends dqa implements oo {
    private htb[] field_v;
    private jpb field_x;
    private String[] field_w;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 96, param3);
        if (param2 < 47) {
            htb var6 = (htb) null;
            this.a(47, 33, 22, (htb) null, 15);
        }
        if (!(param1 == 0)) {
            return;
        }
        no var5 = loa.field_o;
        if (!(null == this.field_w)) {
            var5.a(lrb.field_a, this.field_g + param0, this.field_r + param3, this.field_h, 20, 16777215, -1, 0, 0, var5.field_k - -var5.field_A);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 11) {
              var6_int = 0;
              L1: while (true) {
                if (this.field_w.length <= var6_int) {
                  L2: {
                    if (param3 != this.field_v[this.field_w.length]) {
                      break L2;
                    } else {
                      this.field_x.a(1546);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (this.field_v[var6_int] != param3) {
                      break L3;
                    } else {
                      this.field_x.a((byte) 41, this.field_w[var6_int]);
                      break L3;
                    }
                  }
                  var6_int++;
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
          L4: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("rcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        meb var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_t.e(101);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != 0) {
                  var3_int = param0.length;
                  this.field_w = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new meb(loa.field_o, param1, 1);
                      this.field_v = new htb[1 + var3_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          this.field_v[var3_int] = new htb(wpa.field_o, (sba) (this));
                          this.field_v[var3_int].field_q = (wwa) ((Object) var4);
                          this.field_v[var3_int].a(0, 100, 15, 1, 16 - -(var3_int * 16) + 20);
                          this.b(-18756, this.field_v[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_v[var5] = new htb(this.field_w[var5], (sba) (this));
                          this.field_v[var5].field_q = (wwa) ((Object) var4);
                          this.field_v[var5].field_p = nv.field_p;
                          this.field_v[var5].a(0, 80, 15, 1, var5 * 16 + 20);
                          this.b(-18756, this.field_v[var5]);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_w[var4_int] = joa.a((CharSequence) ((Object) param0[var4_int]), false).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_w = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("rcb.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rcb(jpb param0) {
        super(0, 0, 0, 0, (wwa) null);
        try {
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rcb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param1) {
                if (99 == param1) {
                  stackIn_9_0 = this.a(true, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.a(param2, param0 + 15834);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("rcb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    static {
    }
}
