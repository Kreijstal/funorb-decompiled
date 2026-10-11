/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends si implements n {
    static int field_wb;
    private boolean field_xb;
    static String field_ub;
    private boolean field_vb;
    static int field_sb;
    private pl field_tb;

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 9) {
            var3 = (CharSequence) null;
            tj.a((CharSequence) null, 66);
          }
          var2 = hi.a(qd.a(-113, param0), -12382);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("tj.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    tj(d param0, pl param1) {
        super(param0, be.field_x, mm.field_d, false, false);
        try {
          this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_ub = null;
        if (param0 <= 29) {
          CharSequence var2 = (CharSequence) null;
          tj.a((CharSequence) null, 112);
        }
    }

    final void q(int param0) {
        if (param0 >= 66) {
          this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
          return;
        }
        CharSequence var3 = (CharSequence) null;
        tj.a((CharSequence) null, -117);
        this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
    }

    private final void a(pd param0, byte param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        oi var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          this.field_vb = true;
          if (param0.field_i) {
            var4 = sh.field_q;
          } else {
            if (null == param0.field_d) {
              var4 = param0.field_b;
              if (248 == param0.field_c) {
                if (param2) {
                  var4 = ib.field_ab;
                  this.field_xb = true;
                } else {
                  dm.a((byte) -119);
                  var4 = ib.field_ab;
                  this.field_xb = true;
                }
              }
            } else {
              var4 = mg.field_m;
              if (null != this.field_tb) {
                this.field_tb.a(50);
              }
            }
          }
          var5 = new oi((si) (this), be.field_x, var4);
          if (param1 != -110) {
            this.q(102);
          }
          if (param0.field_i) {
            if (param0.field_a) {
              this.a(new cl(this), -86);
              return;
            }
            var5.a((byte) 23, (sc) (this), rj.field_e);
          } else {
            if (!this.field_xb) {
              if (param0.field_c == 5) {
                var5.a(11, hf.field_u, (byte) -65);
                var5.a(17, ed.field_c, (byte) 54);
              } else {
                var5.a(-1, gd.field_b, (byte) -120);
              }
            } else {
              var5.a((byte) 23, (sc) (this), rj.field_e);
            }
            if (3 == param0.field_c) {
              var5.a(7, mi.field_i, (byte) 118);
            } else {
              if (param0.field_c == 6) {
                var5.a(9, fc.field_b, (byte) -117);
              }
            }
          }
          this.a(var5, -31);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("tj.S(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        if (this.field_xb) {
          qc.a(false, true, 123);
          return;
        }
        try {
          jh.c((byte) 30);
          this.h((byte) -126);
          int var6_int = 75 / ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "tj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean f(byte param0) {
        pd var2 = null;
        if (this.field_J) {
          if (this.field_vb) {
            if (param0 != -121) {
              field_sb = 5;
              return super.f((byte) -121);
            }
            return super.f((byte) -121);
          }
          var2 = pd.a(-352);
          if (var2 == null) {
            if (param0 != -121) {
              field_sb = 5;
              return super.f((byte) -121);
            }
            return super.f((byte) -121);
          }
          this.a(var2, (byte) -110, false);
        }
        if (param0 == -121) {
          return super.f((byte) -121);
        }
        field_sb = 5;
        return super.f((byte) -121);
    }

    static {
        field_sb = 128;
        field_ub = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
