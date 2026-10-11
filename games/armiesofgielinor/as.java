/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends oj {
    private int field_A;
    static je field_E;
    private boolean field_z;
    private boolean field_C;
    static boolean field_B;
    static String field_y;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        ic var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            var5 = (ic) null;
            this.a((at) null, (byte) -44, (ic) null);
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("as.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ta.field_N = 0;
        kd.field_R = null;
        jj.field_g = null;
        int var2 = gm.field_i;
        gm.field_i = er.field_a;
        ai.field_T.field_q = ai.field_T.field_q + 1;
        if (param1 != 101) {
          as.a(-88, (byte) -45);
          if (param0 == 51) {
            ai.field_T.field_p = 2;
            er.field_a = var2;
            if (2 > ai.field_T.field_q) {
              if (2 <= ai.field_T.field_q &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.field_q < 4) {
                return -1;
              }
              return 1;
            }
            if (51 == param0) {
              return 2;
            }
            if (2 > ai.field_T.field_q) {
              if (ai.field_T.field_q < 4) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (ai.field_T.field_q < 4) {
              return -1;
            }
            return 1;
          }
          if (param0 != 50) {
            ai.field_T.field_p = 1;
            er.field_a = var2;
            if (2 > ai.field_T.field_q) {
              if (2 <= ai.field_T.field_q &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.field_q < 4) {
                return -1;
              }
              return 1;
            }
            if (51 == param0) {
              return 2;
            }
            if (2 > ai.field_T.field_q) {
              if (ai.field_T.field_q < 4) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (ai.field_T.field_q < 4) {
              return -1;
            }
            return 1;
          }
          ai.field_T.field_p = 5;
          er.field_a = var2;
          if (2 > ai.field_T.field_q) {
            if (2 <= ai.field_T.field_q &&
              param0 == 50) {
              return 5;
            }
            if (ai.field_T.field_q >= 4) {
              return 1;
            }
            return -1;
          }
          if (51 == param0) {
            return 2;
          }
          if (2 > ai.field_T.field_q) {
            if (ai.field_T.field_q >= 4) {
              return 1;
            }
            return -1;
          }
          if (param0 == 50) {
            return 5;
          }
          if (ai.field_T.field_q >= 4) {
            return 1;
          }
          return -1;
        }
        if (param0 == 51) {
          ai.field_T.field_p = 2;
          er.field_a = var2;
          if (2 <= ai.field_T.field_q) {
            if (51 != param0) {
              if (2 > ai.field_T.field_q) {
                if (ai.field_T.field_q >= 4) {
                  return 1;
                }
                return -1;
              }
              if (param0 != 50) {
                if (ai.field_T.field_q >= 4) {
                  return 1;
                }
                return -1;
              }
              return 5;
            }
            return 2;
          }
          if (2 <= ai.field_T.field_q &&
            param0 == 50) {
            return 5;
          }
          if (ai.field_T.field_q >= 4) {
            return 1;
          }
          return -1;
        }
        if (param0 != 50) {
          ai.field_T.field_p = 1;
          er.field_a = var2;
          if (2 <= ai.field_T.field_q) {
            if (51 != param0) {
              if (2 <= ai.field_T.field_q &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.field_q >= 4) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (2 <= ai.field_T.field_q &&
            param0 == 50) {
            return 5;
          }
          if (ai.field_T.field_q >= 4) {
            return 1;
          }
          return -1;
        }
        ai.field_T.field_p = 5;
        er.field_a = var2;
        if (2 <= ai.field_T.field_q) {
          if (51 != param0) {
            if (2 <= ai.field_T.field_q &&
              param0 == 50) {
              return 5;
            }
            if (ai.field_T.field_q >= 4) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        if (2 <= ai.field_T.field_q &&
          param0 == 50) {
          return 5;
        }
        if (ai.field_T.field_q >= 4) {
          return 1;
        }
        return -1;
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          ev.field_a = ev.field_a + 1;
          if (me.field_e == -1 &&
            of.field_Ib == -1) {
            of.field_Ib = ko.field_b;
            me.field_e = sm.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (ts.field_a == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(ts.field_a));
          }
          if (decompiledFrameRemainder0) {
            if (!ei.field_b) {
              if (bb.field_c <= ev.field_a) {
                stackIn_17_0 = (bb.field_c + ps.field_E > ev.field_a) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              ev.field_a = 0;
            } else {
              if (ei.field_b) {
                ev.field_a = bb.field_c;
              } else {
                if (var2_int != 0) {
                  ev.field_a = bb.field_c;
                } else {
                  ev.field_a = 0;
                }
              }
            }
            cc.field_b = of.field_Ib;
            if (param1 != null) {
              ei.field_b = false;
            } else {
              if (var2_int != 0) {
                ei.field_b = true;
              }
            }
            lq.field_e = me.field_e;
          }
          if (!ei.field_b &&
            ev.field_a < bb.field_c &&
            lk.field_f) {
            cc.field_b = of.field_Ib;
            lq.field_e = me.field_e;
            ev.field_a = 0;
          }
          ts.field_a = param1;
          me.field_e = param0;
          of.field_Ib = -1;
          if (ei.field_b &&
            ce.field_J == ev.field_a) {
            ei.field_b = false;
            ev.field_a = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("as.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    as(jd param0, int param1, boolean param2) {
        try {
          this.field_z = param2 ? true : false;
          this.field_C = false;
          this.field_A = param1;
          this.field_m = 23;
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "as.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!param1) {
          var3 = "EventSwitch: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
          var4 = 1 / ((53 - param0) / 51);
          return var3;
        }
        System.out.println("Death event debug");
        System.out.println("Unit at " + this.field_w.field_J + "," + this.field_w.field_w);
        var3Lifetime1 = "EventSwitch: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
        var4Lifetime1 = 1 / ((53 - param0) / 51);
        return var3Lifetime1;
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 != -19269) {
          return;
        }
        field_y = null;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        ha var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C) {
            return;
          }
          this.field_C = true;
          this.field_w = this.field_w.b(this.field_A, -1);
          if (null != this.field_w &&
            this.field_w.e((byte) 123)) {
            stackIn_7_0 = (param0.field_sb == this.field_w.field_O);
            if (stackIn_7_0 & this.field_z) {
              param0.field_l.a(param1 + 27411, new qj(this.field_w.field_J, this.field_w.field_w));
            }
          }
          if (param1 == -26661) {
            return;
          }
          var4 = (ha) null;
          this.a((ha) null, 25);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("as.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_y = "Damage taken";
    }
}
