/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends vk implements ga {
    private qk field_A;
    static String field_D;
    static boolean field_E;
    static int field_C;
    private dk[] field_y;
    static bb field_B;
    private String[] field_z;

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        wa var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              this.field_u.b(23505);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  this.field_z = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      L3: {
                        var4 = new wa(nb.field_c, 0, 1);
                        this.field_y = new dk[1 + var3_int];
                        if (param0 == 1891) {
                          break L3;
                        } else {
                          field_C = -29;
                          break L3;
                        }
                      }
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_y[var3_int] = new dk(ci.field_d, (qg) (this));
                          this.field_y[var3_int].field_o = (de) ((Object) var4);
                          this.field_y[var3_int].a(0, 100, (byte) 118, 15, 20 + var3_int * 16 - -16);
                          this.a(true, this.field_y[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_y[var5] = new dk(this.field_z[var5], (qg) (this));
                          this.field_y[var5].field_o = (de) ((Object) var4);
                          this.field_y[var5].field_p = fb.field_d;
                          this.field_y[var5].a(0, 80, (byte) 119, 15, 20 + var5 * 16);
                          this.a(true, this.field_y[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_z[var4_int] = hf.a((CharSequence) ((Object) param1[var4_int]), false).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_z = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("kd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    kd(qk param0) {
        super(0, 0, 0, 0, (de) null);
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -16) {
            return;
        }
        field_D = null;
        field_B = null;
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param3) {
                if (param3 != 99) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a((byte) -103, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.b(36, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("kd.EA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_z.length) {
                L2: {
                  if (this.field_y[this.field_z.length] == param0) {
                    this.field_A.a(-12920);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    var8 = (String[]) null;
                    this.a(53, (String[]) null);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param0 != this.field_y[var6_int]) {
                    break L4;
                  } else {
                    this.field_A.a(this.field_z[var6_int], (byte) -125);
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("kd.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        qe var5 = nb.field_c;
        if (null != this.field_z) {
            var5.a(ca.field_X, this.field_s + param1, param3 + this.field_j, this.field_i, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_p);
        }
    }

    static {
        field_B = null;
        field_D = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_E = false;
    }
}
