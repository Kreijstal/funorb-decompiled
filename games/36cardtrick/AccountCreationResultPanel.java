/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends af implements qh {
    private boolean field_sb;
    static int field_rb;
    static PcmStreamMixer field_tb;
    private AccountRegistrationPanel field_vb;
    private boolean field_ub;

    final void f(byte param0) {
        this.showAccountCreationResult(nc.createAccountErrorResult(248, 0, pa.field_N), true, (byte) 117);
        if (param0 != -42) {
          java.awt.Canvas var3 = (java.awt.Canvas) null;
          AccountCreationResultPanel.a((java.awt.Canvas) null, (byte) 92);
        }
    }

    final static String a(byte param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -70 / ((-65 - param0) / 59);
          stackIn_1_0 = rl.a(param1, 0, param1.length, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("bg.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        if (this.field_ub) {
          nf.a(false, (byte) -2, true);
          return;
        }
        try {
          int var6_int = -69 / ((param1 + 62) / 32);
          SecondaryNodeDequeIterator.a((byte) 120);
          this.s(116);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "bg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void showAccountCreationResult(AccountServiceResult param0, boolean param1, byte param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ui var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          this.field_sb = true;
          if (param0.success) {
            var4 = IntrusiveDeque.field_e;
          } else {
            if (null == param0.suggestions) {
              var4 = param0.message;
              if (param0.statusCode == 248) {
                if (param1) {
                  this.field_ub = true;
                  var4 = pa.field_N;
                } else {
                  IntrusiveNode.a((byte) 18);
                  this.field_ub = true;
                  var4 = pa.field_N;
                }
              }
            } else {
              var4 = ui.field_K;
              if (null != this.field_vb) {
                this.field_vb.a(true);
              }
            }
          }
          var5 = new ui((af) (this), vd.field_p, var4);
          if (param2 != 117) {
            field_tb = (PcmStreamMixer) null;
          }
          if (param0.success) {
            if (param0.field_e) {
              this.c(new qe(this), (byte) 33);
              return;
            }
            var5.a((pl) (this), true, bj.field_b);
          } else {
            if (!this.field_ub) {
              if (param0.statusCode != 5) {
                var5.a(uc.field_r, -1, param2 ^ -121);
              } else {
                var5.a(NetworkArchiveRequest.field_p, 11, -14);
                var5.a(pg.field_f, 17, -14);
              }
            } else {
              var5.a((pl) (this), true, bj.field_b);
            }
            if (3 != param0.statusCode) {
              if (param0.statusCode == 6) {
                var5.a(jh.field_a, 9, -14);
              }
            } else {
              var5.a(sk.field_a, 7, -14);
            }
          }
          this.c(var5, (byte) 92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("bg.LB(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    AccountCreationResultPanel(j param0, AccountRegistrationPanel param1) {
        super(param0, vd.field_p, jc.field_R, false, false);
        try {
          this.field_vb = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void resetStaticState(int param0) {
        if (param0 != -2113) {
          field_rb = -75;
          field_tb = null;
          return;
        }
        field_tb = null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        pk.a((byte) -107, (java.awt.Component) ((Object) param0));
        d.a((java.awt.Component) ((Object) param0), 0);
        if (param1 >= -52) {
          return;
        }
        try {
          if (Main.field_V != null) {
            Main.field_V.detach((java.awt.Component) ((Object) param0), true);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "bg.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0) {
        AccountServiceResult var2 = null;
        AccountServiceResult var2Lifetime1;
        if (!param0) {
          this.field_ub = true;
          if (!this.field_E) {
            return super.a(true);
          }
          if (this.field_sb) {
            return super.a(true);
          }
          var2 = qd.pollAccountCreationResult(-86);
          if (var2 != null) {
            this.showAccountCreationResult(var2, false, (byte) 117);
            return super.a(true);
          }
          return super.a(true);
        }
        if (!this.field_E) {
          return super.a(true);
        }
        if (this.field_sb) {
          return super.a(true);
        }
        var2Lifetime1 = qd.pollAccountCreationResult(-86);
        if (var2Lifetime1 != null) {
          this.showAccountCreationResult(var2Lifetime1, false, (byte) 117);
          return super.a(true);
        }
        return super.a(true);
    }

    final static de[] v(int param0) {
        int var1 = 5 / ((param0 - 40) / 58);
        return new de[]{uh.field_n, eb.field_l, c.field_k, kg.field_b, qe.field_H, qe.field_J, nf.field_d, qi.field_A, rc.field_g, lh.field_a, ra.field_a, vk.field_e, dg.field_G, jl.field_g};
    }

    final static int a(int param0, int param1, IsaacRandom param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ng.a(param0, (byte) -128)) {
            stackIn_6_0 = (int)((long)param0 * ((long)param2.nextInt(-1427) & 4294967295L) >> 32);
            return stackIn_6_0;
          }
          var3_int = -(int)(4294967296L % (long)param0) + param1;
          do {
            var4 = param2.nextInt(-1427);
          } while (var4 >= var3_int);
          stackIn_11_0 = sk.a(124, param0, var4);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bg.MB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_rb = 0;
    }
}
