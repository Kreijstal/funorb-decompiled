/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        w stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        try {
          if (!(param3 instanceof kf)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (w) (param3);
          }
          var10 = (kf) (stackIn_3_0);
          ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
          if (var10 != null) {
            param2 = param2 & var10.field_D;
          }
          var7 = this.field_v[0];
          this.field_t.a(param4 + 3389);
          var7.a(param1, this.field_t, (byte) 76, param0, this, param3);
          if (var10 != null) {
            if (var10.field_C) {
              var11 = this.field_v[1];
              if (var11 != null) {
                var11.a(param1, this.field_t, (byte) 76, param0, this, param3);
              }
            }
            if (var10.field_m) {
              var12 = this.field_v[3];
              if (0 != var10.field_h &&
                var12 != null) {
                var12.a(param1, this.field_t, (byte) 76, param0, this, param3);
              } else {
                var9 = this.field_v[2];
                if (var9 != null) {
                  var9.a(param1, this.field_t, (byte) 76, param0, this, param3);
                }
              }
            }
          }
          if (param3.a(18337)) {
            var13 = this.field_v[5];
            if (var13 != null) {
              var13.a(param1, this.field_t, (byte) 76, param0, this, param3);
            }
          }
          if (!param2) {
            var14 = this.field_v[4];
            if (var14 != null) {
              var14.a(param1, this.field_t, (byte) 76, param0, this, param3);
            }
          }
          if (param4 != -3284) {
            this.field_v = (n[]) null;
          }
          this.field_t.a(this, param3, param1, param4 ^ 3254, param0);
          pd.a(param4 - 19665);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("lh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    public lh() {
        this.field_v = new n[6];
        this.field_t = new n();
        n dupTemp$0 = new n();
        this.field_v[0] = dupTemp$0;
        n var1 = dupTemp$0;
        var1.a(109);
    }

    private final void a(boolean param0, lh param1, int param2) {
        int var4_int = 0;
        n dupTemp$0 = null;
        n stackIn_8_0 = null;
        n stackIn_9_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          super.a(param1, false);
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_v[var4_int];
              if (var5 != null) {
                var6 = param1.field_v[var4_int];
                stackIn_8_0 = var5;
                if (var6 != null) {
                  stackIn_9_1 = var6;
                } else {
                  dupTemp$0 = new n();
                  param1.field_v[var4_int] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                }
                ((n) (Object) stackIn_8_0).a(stackIn_9_1, param2 ^ -25688);
              } else {
                param1.field_v[var4_int] = null;
              }
            }
          } else {
            o.a(this.field_v, 0, param1.field_v, 0, 6);
          }
          if (param2 != 6) {
            field_u = 31;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("lh.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(db[] param0, byte param1) {
        int var4 = 0;
        n[] var3 = null;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1 != -112) {
            return;
          }
          var7 = this.field_v;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_f = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("lh.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    lh(lh param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, 6);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -24921) {
          field_w = false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (wf.field_i >= 20 &&
          ha.a(126) && (!(be.field_l > 0) ||
          ca.d(true))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final void a(int param0, db param1) {
        n[] var7 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var7 = this.field_v;
          n[] var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
            }
          }
          int var3_int = 45 / ((param0 + 58) / 39);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "lh.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
          return (n) null;
        }
        n dupTemp$0 = new n();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param2;
          if (this.field_v[var4_int] == null) {
            this.field_v[var4_int] = new n();
          }
          if (param1) {
            this.field_v = (n[]) null;
          }
          this.field_v[param2].field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "lh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(wf param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ki.field_g = param0.b(-1698573656) << 5;
          var2_int = param0.d(true);
          ki.field_g = ki.field_g + (var2_int >> 3);
          sg.field_a = 1835008 & var2_int << 18;
          sg.field_a = sg.field_a + (param0.b(-1698573656) << 2);
          var2_intLifetime1 = param0.d(true);
          hh.field_I = (63 & var2_intLifetime1) << 15;
          sg.field_a = sg.field_a + (var2_intLifetime1 >> 6);
          hh.field_I = hh.field_I + (param0.d(true) << 7);
          if (param1 != -95) {
            wf var3 = (wf) null;
            lh.a((wf) null, 6);
          }
          var2_intLifetime2 = param0.d(true);
          hh.field_I = hh.field_I + (var2_intLifetime2 >> 1);
          th.field_s = var2_intLifetime2 << 16 & 65536;
          th.field_s = th.field_s + param0.b(-1698573656);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "lh.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_u = 0;
        field_w = false;
    }
}
