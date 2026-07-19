/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ms extends tc {
    static String field_m;
    ms field_l;
    static int field_t;
    static boolean field_o;
    long field_q;
    static je field_k;
    ms field_s;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean a(byte param0) {
        if (!(this.field_l != null)) {
            return false;
        }
        int var2 = 106 / ((10 - param0) / 60);
        return true;
    }

    final void c(byte param0) {
        if (this.field_l == null) {
          return;
        } else {
          this.field_l.field_s = this.field_s;
          this.field_s.field_l = this.field_l;
          if (param0 != -76) {
            this.a(true, -70L);
            this.field_s = null;
            this.field_l = null;
            return;
          } else {
            this.field_s = null;
            this.field_l = null;
            return;
          }
        }
    }

    final static int a(int param0, og[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (-1 + param1.length <= var3_int) {
                      break L4;
                    } else {
                      var6 = param1[1 + var3_int].field_s ^ -1;
                      var5 = param0 + -1 ^ -1;
                      if (var4 != 0) {
                        if (var5 < var6) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (var5 <= var6) {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_8_0 = var3_int;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  if (param2 < -81) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                stackOut_12_0 = -74;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
              stackOut_14_0 = -1 + param1.length;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ms.FA(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            return;
        }
        field_n = null;
        field_p = null;
        field_k = null;
        field_m = null;
    }

    final long a(int param0) {
        if (param0 < 101) {
            field_o = true;
            return this.field_q;
        }
        return this.field_q;
    }

    final void a(boolean param0, long param1) {
        if (this.field_l == null) {
          if (!param0) {
            this.field_l = (ms) null;
            this.field_q = param1;
            return;
          } else {
            this.field_q = param1;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 >= 111) {
            break L0;
          } else {
            ms.e(75);
            break L0;
          }
        }
        ac.field_n = false;
        aw.field_h = null;
        if (!fh.field_i) {
          var1 = vt.field_n;
          if (var1 > 0) {
            if (1 == var1) {
              aw.field_h = hh.field_a;
              if (var2 == 0) {
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                if (var2 != 0) {
                  qc.field_a.o(4259);
                  return;
                } else {
                  return;
                }
              } else {
                aw.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                if (var2 != 0) {
                  qc.field_a.o(4259);
                  return;
                } else {
                  return;
                }
              }
            } else {
              aw.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
              aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
              qc.field_a.b(true);
              qf.a(56);
              if (var2 != 0) {
                qc.field_a.o(4259);
                return;
              } else {
                return;
              }
            }
          } else {
            qc.field_a.b(true);
            qf.a(56);
            if (var2 != 0) {
              qc.field_a.o(4259);
              return;
            } else {
              return;
            }
          }
        } else {
          qc.field_a.o(4259);
          return;
        }
    }

    protected ms() {
    }

    static {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
