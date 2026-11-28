/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends uc implements WidgetActivationListener {
    private boolean field_qb;
    private boolean field_ub;
    static boolean field_tb;
    private AccountRegistrationPanel field_rb;
    static DiskCacheWorker field_pb;
    static int field_sb;

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        var2 = 0;
        var3 = mc.field_k;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
        } else {
          if (105 > var3) {
            var2 = (-40960 + var3 * 16384) / 220;
            var4 = 1;
            var5 = 0;
            if (param0 == 1) {
              var5 = 1;
            }
            if (param0 == 3) {
              var4 = -1;
            }
            if (param0 == 4) {
              var5 = 1;
              var4 = 1;
            }
            if (param0 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param0 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (param0 == 8) {
                var4 = -1;
                var5 = -1;
              }
            }
            if (param0 == 11) {
              var4 = -1;
            }
            if (param0 == 12) {
              var5 = -1;
              var4 = -1;
            }
            if (param1 > -110) {
              return;
            }
            if (param0 == 13) {
              var5 = -1;
              var4 = 1;
            }
            if (14 == param0) {
              var4 = -1;
              var5 = 1;
            }
            if (param0 == 15) {
              var5 = 1;
              var4 = 1;
            }
            oj.field_l = ad.a(false, var4 * var2, var2 * var5);
            return;
          }
          if (120 > var3) {
            var3 = 120 - var3;
            var2 = -(8192 * (var3 * var3) / 3300) + 8192;
          }
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param0 == 1) {
          var5Lifetime1 = 1;
        }
        if (param0 == 3) {
          var4Lifetime1 = -1;
        }
        if (param0 == 4) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        if (param0 == 5) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 6) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 == 7) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        } else {
          if (param0 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime1 = -1;
        }
        if (param0 == 12) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        }
        if (param1 > -110) {
          return;
        }
        if (param0 == 13) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (14 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 15) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        oj.field_l = ad.a(false, var4Lifetime1 * var2, var2 * var5Lifetime1);
    }

    final boolean advanceDialogAnimation(byte param0) {
        if (!this.field_D) {
          if (param0 <= -21) {
            return super.advanceDialogAnimation((byte) -45);
          }
          AccountCreationResultPanel.l((byte) -108);
          return super.advanceDialogAnimation((byte) -45);
        }
        if (this.field_ub) {
          if (param0 > -21) {
            AccountCreationResultPanel.l((byte) -108);
            return super.advanceDialogAnimation((byte) -45);
          }
          return super.advanceDialogAnimation((byte) -45);
        }
        AccountServiceResult var2 = ConfirmedEmailAvailabilityValidator.pollAccountCreationResult(false);
        if (var2 != null) {
          this.showAccountCreationResult(false, (byte) 33, var2);
          if (param0 <= -21) {
            return super.advanceDialogAnimation((byte) -45);
          }
          AccountCreationResultPanel.l((byte) -108);
          return super.advanceDialogAnimation((byte) -45);
        }
        if (param0 <= -21) {
          return super.advanceDialogAnimation((byte) -45);
        }
        AccountCreationResultPanel.l((byte) -108);
        return super.advanceDialogAnimation((byte) -45);
    }

    public static void j(byte param0) {
        if (param0 > -36) {
          AccountCreationResultPanel.j(88);
          field_pb = null;
          return;
        }
        field_pb = null;
    }

    private final void showAccountCreationResult(boolean param0, byte param1, AccountServiceResult param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vc var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_ub = true;
          if (param2.success) {
            var4 = vc.field_G;
          } else {
            if (null == param2.suggestions) {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (param0) {
                  this.field_qb = true;
                  var4 = he.field_b;
                } else {
                  me.c((byte) -58);
                  this.field_qb = true;
                  var4 = he.field_b;
                }
              }
            } else {
              var4 = nh.field_b;
              if (null != this.field_rb) {
                this.field_rb.onNameSuggestionsRefreshRequested((byte) -12);
              }
            }
          }
          var5 = new vc((uc) (this), FullscreenFocusCanvas.field_c, var4);
          var6 = -123 % ((-72 - param1) / 44);
          if (param2.success) {
            if (param2.field_b) {
              this.b(127, new kg(this));
              return;
            }
            var5.a(-1, n.field_h, (WidgetEventListener) (this));
          } else {
            if (this.field_qb) {
              var5.a(-1, n.field_h, (WidgetEventListener) (this));
            } else {
              if (param2.statusCode == 5) {
                var5.a(md.field_B, 11, 120);
                var5.a(jd.field_d, 17, 125);
              } else {
                var5.a(a.field_e, -1, 114);
              }
            }
            if (param2.statusCode == 3) {
              var5.a(pa.field_b, 7, -35);
            } else {
              if (6 != param2.statusCode) {
                this.b(127, var5);
                return;
              }
              var5.a(lb.field_b, 9, 118);
            }
          }
          this.b(127, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("u.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void h(boolean param0) {
        if (!DualLinkNode.field_k) {
          throw new IllegalStateException();
        }
        if (jj.field_a != null) {
          jj.field_a.g(!param0 ? true : false);
        }
        String var1 = ni.a(param0);
        eb.field_b = new LoginPanel(var1, (String) null, true, false, false);
        ug.field_A.showDialog(-14579, di.field_x);
        di.field_x.b(126, eb.field_b);
        di.field_x.f(!param0 ? true : false);
    }

    final static void l(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        mc var4 = null;
        int var4_int = 0;
        int var5 = 0;
        wa var5_ref_wa = null;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var10 = ig.field_a;
          var2 = var10.readUnsignedByte(true);
          if (param0 >= -79) {
            return;
          }
          var3 = var10.readUnsignedByte(true);
          if (var2 == 0) {
            var4 = (mc) (vh.field_a.beginForward(true));
            if (var4 == null) {
              ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-72);
              return;
            }
            var5 = -var10.position + a.field_c;
            var12 = var4.field_h;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(true) << (vg.a(var7, 3) << 8));
            }
            var4.unlink((byte) -122);
            return;
          }
          if (1 == var2) {
            var4_int = var10.readSignedSmart((byte) -10);
            var5_ref_wa = (wa) (AccountRequestState.field_b.beginForward(true));
            while (var5_ref_wa != null) {
              if (var3 != var5_ref_wa.field_o ||
                var5_ref_wa.field_h != var4_int) {
                var5_ref_wa = (wa) (AccountRequestState.field_b.nextForward(2));
                continue;
              }
              break;
            }
            if (var5_ref_wa != null) {
              var5_ref_wa.unlink((byte) -127);
              return;
            }
            ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-95);
            return;
          }
          uj.a("LR1: " + qj.h(-93), (Throwable) null, 1);
          ProxyAuthenticationRequiredException.$cfr$intArgs$b$e683eeaaf5b5(-42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.wrapClientException((Throwable) ((Object) var1), "u.Q(" + param0 + ')');
        }
    }

    final void k(byte param0) {
        int var2 = 88 % ((param0 + 27) / 57);
        this.showAccountCreationResult(true, (byte) -120, wi.createAccountErrorResult(248, (byte) -113, he.field_b));
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, FullscreenFocusCanvas.field_c, m.field_b, false, false);
        try {
          this.field_rb = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var1 = AccountNameAvailabilityValidator.field_l;
          synchronized (var1) {
            FrameTimer.field_b = FrameTimer.field_b + 1;
            TextFieldValidator.field_h = ResourceArchive.field_f;
            if (vg.field_b < 0) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                wa.field_j[var5] = false;
                var5++;
              }
              vg.field_b = ud.field_a;
            } else {
              while (vg.field_b != ud.field_a) {
                var2 = IterableNodeHashTable.field_e[ud.field_a];
                ud.field_a = 1 + ud.field_a & 127;
                if (var2 >= 0) {
                  wa.field_j[var2] = true;
                  continue;
                }
                wa.field_j[~var2] = false;
              }
            }
            if (param0 != -7) {
              field_tb = true;
            }
            ResourceArchive.field_f = Lexicominos.field_G;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ld.wrapClientException((Throwable) ((Object) var1_ref), "u.S(" + param0 + ')');
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        if (this.field_qb) {
          jd.a(false, true, 37);
          return;
        }
        try {
          DelegatingCanvas.a((byte) 108);
          this.g(true);
          if (param2 != 215535458) {
            InteractiveWidget var7 = (InteractiveWidget) null;
            this.onWidgetActivated(123, -100, -20, 115, (InteractiveWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "u.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
