/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends td implements a, m {
    static int field_D;
    static String[] field_J;
    private rh field_H;
    private lf field_K;
    static String field_G;
    static oh field_E;
    nd field_I;
    private rh field_F;

    final void a(int param0, int param1, byte param2, al param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_F.field_B = this.l(19);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "bk.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, al param3, int param4, String param5, String param6) {
        RuntimeException var8 = null;
        mi var9 = null;
        sa var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = new sa(20, param2, param1 + 120, 25, param3, false, 120, 3, gk.field_c, 16777215, param6);
              this.a(false, var10);
              if (param4 == 19753) {
                break L1;
              } else {
                bk.j(-14);
                break L1;
              }
            }
            var9 = new mi(((wk) ((Object) param3)).a((byte) -100), param5, 126, param2 - -var10.field_u, param1 - -25, param0);
            var9.field_l = (tg) (this);
            this.a(false, var9);
            stackIn_3_0 = var9.field_u + var10.field_u;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("bk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(boolean param0, String param1) {
        boolean discarded$0 = false;
        lf var3 = null;
        String var4 = null;
        try {
            if (!param0) {
                wk var5 = (wk) null;
                discarded$0 = this.a((wk) null, (byte) -89);
            }
            var3 = this.field_K;
            var4 = param1;
            ((lb) ((Object) var3)).a(false, var4, -124);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "bk.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_H != param0) {
                if (param0 != this.field_F) {
                  break L1;
                } else {
                  this.m(-62);
                  break L1;
                }
              } else {
                vl.m(param4 ^ -27321);
                break L1;
              }
            }
            if (param4 == -27322) {
              break L0;
            } else {
              this.field_K = (lf) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("bk.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean l(int param0) {
        int var2 = -4 / ((param0 - -34) / 51);
        if (!this.a((wk) (this.field_K), (byte) -93)) {
            return false;
        }
        return true;
    }

    public bk() {
        super(0, 0, 496, 0, (t) null);
        this.field_K = new lf("", (tg) null, 12);
        ic var1 = new ic(fk.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, gk.field_c.field_G, -1, 2147483647, true);
        al var2 = new al(qd.field_a, var1, (tg) null);
        this.field_F = new rh(hb.field_a, (tg) null);
        this.field_H = new rh(ta.field_a, (tg) null);
        this.field_K.field_n = ak.field_c;
        this.field_K.a(1, new af(this.field_K));
        this.field_F.field_B = false;
        this.field_F.field_y = (t) ((Object) new dc());
        this.field_H.field_y = (t) ((Object) new ne());
        this.field_K.field_y = (t) ((Object) new dd(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, -3050, var3, 270, 20);
        int var5 = 200;
        var3 += 50;
        this.a(false, var2);
        var3 = var3 + (5 + this.a(this.field_K, rg.field_a, 170, (byte) -13, var3, pb.field_b));
        this.field_F.a(40, -3050, var3, var5, -var5 + 496 >> -668064799);
        this.field_H.a(40, -3050, var3 + 15, 60, var4 - -3);
        this.field_H.field_l = (tg) (this);
        this.field_F.field_l = (tg) (this);
        this.a(false, this.field_F);
        this.a(false, this.field_H);
        this.field_I = new nd((a) (this));
        this.field_I.a(150, -3050, 20, -60 + -this.field_K.field_p + this.field_x - this.field_K.field_x, 60 + (this.field_K.field_p + this.field_K.field_x));
        this.a(false, this.field_I);
        this.a(55 + var3 + var4, -3050, 0, 496, 0);
    }

    private final int a(al param0, String param1, int param2, byte param3, int param4, String param5) {
        int discarded$1 = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -13) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a(-122, 46, 116, (al) null, 107, (String) null, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(35, param2, param4, param0, 19753, param1, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("bk.LA(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void m(int param0) {
        if (!this.l(47)) {
          return;
        } else {
          if (param0 >= -12) {
            field_G = (String) null;
            qi.a(this.field_K.field_s, 0);
            return;
          } else {
            qi.a(this.field_K.field_s, 0);
            return;
          }
        }
    }

    private final boolean a(wk param0, byte param1) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        ud var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a((byte) -121);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -84) {
                  break L1;
                } else {
                  field_J = (String[]) null;
                  break L1;
                }
              }
              L2: {
                var4 = var3.a((byte) -8);
                if (var4 != TrackController.field_G) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("bk.KA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public final void a(byte param0) {
        ((af) ((Object) this.field_K.a((byte) -97))).a(false);
        if (param0 <= 117) {
            al var3 = (al) null;
            this.a((byte) -3, 'o', (al) null, 53);
        }
    }

    final static void j(int param0) {
        ue.field_a = ne.field_a.g(param0 + param0);
        CharSequence var2 = (CharSequence) ((Object) ue.field_a);
        dd.field_p = r.a(var2, param0 + -11133);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
            if (!super.a((byte) -106, param1, param2, param3)) {
              var5_int = 101 / ((param0 - 17) / 51);
              if (param3 == 98) {
                stackIn_6_0 = this.a(param2, -46);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param3 != 99) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param2, true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
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
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("bk.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
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

    public static void k(int param0) {
        field_E = null;
        if (param0 >= -71) {
            return;
        }
        field_G = null;
        field_J = null;
    }

    static {
        field_G = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
