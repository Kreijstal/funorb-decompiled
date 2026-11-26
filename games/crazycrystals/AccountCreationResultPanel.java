/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends na implements vd {
    static RgbSprite[] field_qb;
    static lb field_lb;
    private boolean field_ob;
    static am field_mb;
    private dc field_pb;
    static String field_rb;
    static PcmSample field_nb;
    private boolean field_sb;

    final boolean g(byte param0) {
        AccountServiceResult var2 = null;
        if (this.field_C &&
          !this.field_sb) {
          var2 = jd.pollAccountCreationResult((byte) 93);
          if (var2 != null) {
            this.showAccountCreationResult(-1, false, var2);
          }
        }
        if (param0 != 8) {
          AccountServiceResult var3 = (AccountServiceResult) null;
          this.showAccountCreationResult(-88, true, (AccountServiceResult) null);
        }
        return super.g((byte) 8);
    }

    final void o(int param0) {
        if (param0 < 85) {
          pc var3 = (pc) null;
          this.a((byte) -11, -96, 75, -54, (pc) null);
        }
        this.showAccountCreationResult(-1, true, me.createAccountErrorResult(on.field_c, 20, 248));
    }

    public static void clearStaticReferences(boolean param0) {
        field_nb = null;
        field_qb = null;
        field_rb = null;
        field_lb = null;
        if (param0) {
          field_mb = (am) null;
        }
        field_mb = null;
    }

    final static void n(int param0) {
        int var1_int = 0;
        RawPcmStream var4 = null;
        RawPcmStream var5 = null;
        RawPcmStream var6 = null;
        RawPcmStream var7 = null;
        int var3 = CrazyCrystals.field_B;
        try {
          uh.field_n = false;
          r.field_m = true;
          go.field_i = false;
          q.field_a = new vh[3];
          for (var1_int = 0; var1_int < 3; var1_int++) {
            q.field_a[var1_int] = new vh();
          }
          var4 = RawPcmStream.a(wm.field_a, 100, 0);
          var4.f(-1);
          ck.field_db = new am(var4);
          var5 = RawPcmStream.a(fb.field_c, 100, 0);
          var5.f(-1);
          vk.field_N = new am(var5);
          var6 = RawPcmStream.a(pe.field_h, 100, 0);
          var6.f(-1);
          fp.field_c = new am(var6);
          var7 = RawPcmStream.a(nj.field_c, 100, 0);
          var7.f(-1);
          aa.field_a = new am(var7);
          nh.field_F = je.field_j;
          sb.field_F = b.field_a;
          fl.field_g = fp.field_a;
          int var2 = 110 % ((param0 - 27) / 50);
          sm.field_e = we.field_h;
          ll.a(-84, true, true);
          NetworkArchiveRequest.field_y = 0;
          ue.field_c = true;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "sa.T(" + param0 + ')');
        }
    }

    AccountCreationResultPanel(ol param0, dc param1) {
        super(param0, mo.field_m, vn.field_i, false, false);
        try {
          this.field_pb = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void showAccountCreationResult(int param0, boolean param1, AccountServiceResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        jd var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          this.field_sb = true;
          if (param2.success) {
            var4 = td.field_a;
          } else {
            if (null == param2.suggestions) {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (!param1) {
                  ge.a((byte) -62);
                }
                this.field_ob = true;
                var4 = on.field_c;
              }
            } else {
              var4 = db.field_f;
              if (this.field_pb != null) {
                this.field_pb.a(param0 ^ -21);
              }
            }
          }
          var5 = new jd((na) (this), mo.field_m, var4);
          if (param0 != -1) {
            return;
          }
          if (param2.success) {
            if (param2.field_f) {
              this.a((qm) (new ph(this)), (byte) -50);
              return;
            }
            var5.a(go.field_j, (bi) (this), 39);
          } else {
            if (this.field_ob) {
              var5.a(go.field_j, (bi) (this), 117);
            } else {
              if (param2.statusCode != 5) {
                var5.a(cf.field_h, (byte) -124, -1);
              } else {
                var5.a(PacketBuffer.field_i, (byte) -124, 11);
                var5.a(dn.field_c, (byte) -124, 17);
              }
            }
            if (param2.statusCode != 3) {
              if (6 != param2.statusCode) {
                this.a((qm) (var5), (byte) -50);
                return;
              }
              var5.a(sb.field_C, (byte) -124, 9);
            } else {
              var5.a(ik.field_f, (byte) -124, 7);
            }
          }
          this.a((qm) (var5), (byte) -50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("sa.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        if (this.field_ob) {
          vk.a(-40, true, false);
          return;
        }
        try {
          ro.g(108);
          this.i((byte) -121);
          int var6_int = 62 / ((param0 - 83) / 36);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "sa.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_rb = "Click";
    }
}
