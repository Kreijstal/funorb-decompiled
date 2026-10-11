/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ae {
    private int field_p;
    private boolean field_i;
    private int field_l;
    private int field_o;
    static int field_m;
    private int field_j;
    int field_q;
    static String field_k;
    private int field_s;
    static int field_t;
    static String field_r;
    static String field_n;

    final static void a(int param0, int param1, int param2) {
        em.field_O[param0] = cr.b(em.field_O[param0], 1 << -32 + param1);
        if (param2 != -1) {
          field_k = (String) null;
        }
    }

    final static void a(int param0) {
        if (param0 == 6835) {
          lo.field_g = new cj(0L, (cj) null);
          if (tb.field_u) {
            lo.field_g.a((byte) 50, ql.field_b);
          }
          lo.field_g.a((byte) 50, pd.field_b);
          de.field_b = new qh(ne.field_vb, lo.field_g);
          qe.field_k = new cj(0L, (cj) null);
          qe.field_k.a((byte) 50, de.field_b.field_c);
          qe.field_k.a((byte) 50, kj.field_u);
          wn.a((byte) 3);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        oo.d(-24 + (this.field_p >> 16) - param2, -24 - param0 + (this.field_s >> 16), 1 + (-param3 + this.field_f) / 5, 16711680, 128);
        if (!param1) {
          qd var6 = (qd) null;
          this.a(106, (qd) null);
        }
    }

    final static int a(hf param0, hf param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 32475) {
            field_t = 10;
          }
          var4 = (String) null;
          stackIn_3_0 = mg.a(false, param0, 0, param1, (String) null, 0, (byte) -92);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wf.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, qd param1) {
        wb stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        qd stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        qd stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        id var3 = null;
        RuntimeException var3_ref = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_i) {
            var3_int = this.field_q;
            if (var3_int == 9) {
              nm.b(-126, 81);
            } else {
              switch (var3_int) {
                case 10:
                  nm.b(-126, 83);
                  break;
                case 4:
                  nm.b(-127, 46);
                  break;
                case 8:
                  nm.b(-127, 35);
                  break;
                case 18:
                  nm.b(-128, 46);
                  break;
                case 15:
                  nm.b(param0 ^ -127, 80);
                  break;
                case 5:
                  nm.b(-126, 17);
                  break;
                case 2:
                  nm.b(-127, 46);
                  break;
                case 1:
                  nm.b(-127, 67);
                  break;
                case 11:
                  nm.b(param0 ^ -126, 86);
                  break;
                case 13:
                  nm.b(-128, 85);
                  break;
                case 14:
                  nm.b(param0 - 128, 92);
                  break;
                case 3:
                  nm.b(param0 - 128, 46);
                  break;
                case 7:
                  nm.b(-127, 46);
                  break;
                case 17:
                  nm.b(param0 - 127, 75);
                  break;
                case 16:
                  nm.b(param0 ^ -128, 84);
                  break;
                default:
                  break;
              }
            }
            var6 = this.field_q;
            switch (var6) {
              case 13:
                stackIn_80_0 = (qd) (param1);
                stackIn_81_1 = (this.field_o == 36);
                ((qd) (Object) stackIn_80_0).b(stackIn_81_1, 0, this.field_s, this.field_p);
                break;
              case 15:
              case 17:
              default:
                if (var6 != 9 &&
                  10 != var6) {
                  if (var6 != 15) {
                    if (17 != var6) {
                      break;
                    }
                    if (this.field_s == -1) {
                      param1.c(this.field_p, 68);
                      break;
                    }
                    param1.b(this.field_p, -106, this.field_s, this.field_j);
                    break;
                  }
                  stackIn_85_0 = (qd) (param1);
                  stackIn_85_1 = this.field_p;
                  stackIn_86_2 = (32 == this.field_o);
                  ((qd) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_86_2, this.field_s, (byte) -40, this.field_j);
                  break;
                }
                var5 = op.field_m.a((byte) 32, this.field_j, 1000);
                param1.a((byte) -111, this.field_s, this.field_q, var5, this.field_p);
                break;
              case 4:
                var4 = op.field_m.a(this.field_l, false);
                stackIn_76_0 = var4;
                stackIn_77_1 = (this.field_o == 34);
                stackIn_76_0.field_Hb = stackIn_77_1;
                break;
              case 7:
                var3 = op.field_m.a(this.field_l, (byte) 33);
                if (var3 instanceof wb &&
                  37 == this.field_o) {
                  var8 = (wb) (var3);
                  var8.field_ib = this.field_j;
                }
                break;
              case 12:
                param1.b(this.field_j, 0, op.field_m.a((byte) 32, this.field_j, 750));
                break;
              case 11:
                param1.c(this.field_j, op.field_m.a((byte) 32, this.field_j, 500), -2);
                break;
            }
          } else {
            if (this.field_s == -1 &&
              this.field_p == -1) {
              param1.b(this.field_q, param1.field_k.a(320, param0 + 2), this.field_j, param1.field_k.a(true, 240), -99);
            } else {
              if (this.field_s != -1) {
                param1.b(this.field_q, this.field_p, this.field_j, this.field_s, -46);
              } else {
                param1.a(50, this.field_j, this.field_l, this.field_q);
              }
            }
            this.field_f = this.field_f + 50;
            this.field_i = true;
            param1.a(false, (ae) (this));
            nm.b(-127, 67);
          }
          if (param0 != 0) {
            wf.a(11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_95_0 = var3_ref;
          stackIn_95_1 = new StringBuilder().append("wf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(')').toString());
        }
    }

    wf() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super.a(param2 + 32, param1);
        if (param6 != 255) {
        }
        this.field_j = param7;
        this.field_p = param4;
        this.field_i = false;
        this.field_o = param3;
        this.field_q = param6;
        if (param2 != -32) {
          this.field_o = 121;
        }
        this.field_l = param5;
        this.field_s = param0;
        if (this.field_l == 65535) {
          this.field_l = -1;
        }
        if (this.field_p == 65535) {
          this.field_p = -1;
        }
        if (this.field_s == 65535) {
          this.field_s = -1;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_r = null;
        if (param0 != 17) {
          field_k = (String) null;
        }
        field_n = null;
    }

    final void a(byte param0) {
        super.a((byte) -86);
        dg.field_K.a((br) (this), false);
        if (param0 > -47) {
          qd var3 = (qd) null;
          this.a(96, (qd) null);
        }
    }

    static {
        field_k = "Yes";
        field_t = 1;
        field_r = "Please remove <%0> from your ignore list first.";
        field_n = "Log in / Create account";
    }
}
