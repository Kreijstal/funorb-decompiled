/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends ae {
    static String field_l;
    static String field_o;
    private int field_p;
    static String field_n;
    private int field_q;
    static String field_k;
    static String field_j;
    static int field_i;
    static kb field_m;

    final void a(byte param0) {
        super.a((byte) -54);
        mi.field_Kb.a((br) (this), false);
        if (param0 > -47) {
            field_l = (String) null;
        }
    }

    final static void c(int param0) {
        boolean discarded$51 = false;
        boolean discarded$52 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            if (!op.a(120)) {
              L2: {
                if (rn.field_f == null) {
                  break L2;
                } else {
                  if (!rn.field_f.field_e) {
                    break L2;
                  } else {
                    rn.a(param0 ^ -79);
                    me.field_k.b(3016, new vm(me.field_k, hl.field_b));
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              discarded$51 = me.field_k.a(jk.field_g, (byte) -27, fg.field_j, true);
              me.field_k.h((byte) -109);
              L3: while (true) {
                if (!ba.c(-1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$52 = me.field_k.a(param0 + -2, pn.field_d, sj.field_p);
                  if (var2 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "op.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param2 != 4) {
          return (String) null;
        } else {
          L0: {
            if (param1) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param3) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return t.field_f[var4];
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            qd var6 = (qd) null;
            this.a(-70, (qd) null);
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          field_n = (String) null;
          super.a(0, param1);
          this.field_p = param2;
          this.field_q = param3;
          return;
        } else {
          super.a(0, param1);
          this.field_p = param2;
          this.field_q = param3;
          return;
        }
    }

    private final static boolean a(int param0) {
        int var1 = 0;
        var1 = -19 / ((70 - param0) / 45);
        if (me.field_k != null) {
          if (me.field_k.j((byte) -122) == null) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, qd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.b(this.field_p, (byte) 127, this.field_q);
              if (param0 == 0) {
                break L1;
              } else {
                this.field_p = -21;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("op.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(byte param0) {
        boolean discarded$2 = false;
        field_o = null;
        field_l = null;
        field_m = null;
        field_j = null;
        field_n = null;
        if (param0 != -9) {
          discarded$2 = op.a(-97);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    op() {
    }

    static {
        field_o = "Disruptive behaviour";
        field_k = "Options";
        field_j = "Melt a zombie into a puddle of goo that will slow down humans. Makes humans a lot easier to catch.";
        field_l = "Please wait...";
        field_n = "<%0> is not a member, and cannot play with the current options.";
        field_i = -1;
    }
}
