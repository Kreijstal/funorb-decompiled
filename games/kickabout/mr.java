/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends ga implements cw {
    static String field_F;
    static se field_Z;
    static String field_bb;
    static String[] field_X;
    static int[] field_Y;
    private l field_V;
    private int field_ab;
    static hd[] field_W;

    final void m(byte param0) {
        super.m((byte) -97);
        if (param0 >= -57) {
            mr.a(true, 93);
        }
        if (this.field_V != null) {
            this.field_V.a(113);
        }
    }

    mr(String param0, jv param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1) {
        vb.field_j = 0;
        pj.field_C = new int[3];
        if (param0) {
            ob var3 = (ob) null;
            mr.a((ob) null, true);
        }
        at.field_Hb = param1;
        fu.field_b = new tv[param1 * 15];
    }

    public static void n(byte param0) {
        field_Z = null;
        if (param0 <= 40) {
            field_Y = (int[]) null;
        }
        field_F = null;
        field_Y = null;
        field_bb = null;
        field_X = null;
        field_W = null;
    }

    public final l a(byte param0) {
        if (param0 > -107) {
            mr.a((byte) -36, 39);
        }
        return this.field_V;
    }

    final static ak a(ob param0, boolean param1) {
        ak var2 = null;
        RuntimeException var2_ref = null;
        ak stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                mr.n((byte) -2);
                break L1;
              }
            }
            var2 = new ak(2);
            var2.field_h = param0;
            stackIn_3_0 = (ak) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("mr.WA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_ab = -param2 + el.field_A + -this.field_t;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mr.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        hn var2 = null;
        int var3 = Kickabout.field_G;
        try {
            var2 = (hn) ((Object) da.field_h.g(24009));
            while (var2 != null) {
                if (6 == var2.field_i) {
                    var2.c((byte) -109);
                }
                var2 = (hn) ((Object) da.field_h.c(33));
            }
            var2 = new hn(6, new int[]{param1});
            if (param0 < 16) {
                mr.n((byte) 103);
            }
            ii.a(var2, 71);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mr.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, l param1) {
        try {
            this.field_V = param1;
            if (param0 != 6) {
                field_F = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mr.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String f(int param0) {
        if (!this.field_m) {
            return null;
        }
        if (this.field_u == null) {
            return null;
        }
        if (param0 != -1) {
            this.f(54);
        }
        nq.b(n.field_m, 0, this.field_n + -this.field_ab + el.field_A);
        return this.field_u;
    }

    final static ld a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        ld stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 == 6) {
              var3 = 0;
              L1: while (true) {
                if (var3 >= var2_int) {
                  stackIn_13_0 = lm.field_F;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = param1.charAt(var3);
                  if (var4 >= 48) {
                    if (var4 <= 57) {
                      var3++;
                      continue L1;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (ld) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("mr.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ld) ((Object) stackIn_10_0);
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_F = "<%0> has left the game.";
        field_bb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
