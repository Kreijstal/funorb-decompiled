/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ns implements bp {
    private boolean field_Eb;
    static String field_Bb;
    static String field_Ib;
    static pb field_Gb;
    static int[] field_Cb;
    static qr field_zb;
    static mp field_Fb;
    private aa field_Db;
    private boolean field_Hb;
    static String field_Ab;

    final static void a(int param0, bc param1) {
        int var3 = 0;
        int var4 = 0;
        sr var5 = null;
        int[] var6 = null;
        int var7 = 0;
        sl var8 = null;
        int var9 = 0;
        sl var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8 = new sl(param1.a(true, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.j(-108);
          var10.m(-84);
          wc.field_a = ip.a(24243, var10);
          vc.field_d = new sr[var3];
          fa.field_Z = new int[var3][];
          if (param0 <= 82) {
            return;
          }
          for (var4 = 0; var3 > var4; var4++) {
            vc.field_d[var4] = ec.a(var8, (byte) 6);
          }
          var10.i((byte) -47);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = vc.field_d[var9];
            var5.a(6, -226, 6, 6, 1);
            var5.a(true);
            var6 = new int[]{var5.field_O + var5.field_k >> 1, var5.field_j + var5.field_t >> 1, var5.field_E + var5.field_r >> 1};
            fa.field_Z[var9] = var6;
            var5.a(-var6[2], -var6[0], -var6[1], 32767);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("oj.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void q(int param0) {
        field_Cb = null;
        field_zb = null;
        field_Ib = null;
        field_Gb = null;
        field_Ab = null;
        if (param0 == -17682) {
          field_Fb = null;
          field_Bb = null;
          return;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        if (this.field_Eb) {
          wa.a((byte) -40, false, true);
          return;
        }
        try {
          rm.b(param1 ^ -49);
          this.i((byte) -104);
          if (param1 != 6) {
            field_Fb = (mp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "oj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          hp.a((byte) 28, param1, "");
          hr.a(param1, (byte) -127);
          if (param0 != 0) {
            oj.q(13);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "oj.KB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (!this.field_E) {
          var2 = -50 / ((param0 + 23) / 52);
          return super.a((byte) 30);
        }
        if (this.field_Hb) {
          var2Lifetime1 = -50 / ((param0 + 23) / 52);
          return super.a((byte) 30);
        }
        kj var2_ref_kj = br.a(65536);
        if (var2_ref_kj != null) {
          this.a(17, false, var2_ref_kj);
          var2Lifetime2 = -50 / ((param0 + 23) / 52);
          return super.a((byte) 30);
        }
        var2Lifetime3 = -50 / ((param0 + 23) / 52);
        return super.a((byte) 30);
    }

    oj(tc param0, aa param1) {
        super(param0, sl.field_p, mp.field_a, false, false);
        try {
          this.field_Db = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, kj param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        cf var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_Hb = true;
          if (!param2.field_h) {
            if (param2.field_d == null) {
              var4 = param2.field_g;
              if (param2.field_c == 248) {
                if (!param1) {
                  kp.c(-1);
                }
                var4 = sg.field_xb;
                this.field_Eb = true;
              }
            } else {
              var4 = lr.field_d;
              if (this.field_Db != null) {
                this.field_Db.a(2147483647);
              }
            }
          } else {
            var4 = ck.field_b;
          }
          if (param0 != 17) {
            return;
          }
          var5 = new cf((ns) (this), sl.field_p, var4);
          if (!param2.field_h) {
            if (!this.field_Eb) {
              if (param2.field_c == 5) {
                var5.a(gg.field_b, (byte) 100, 11);
                var5.a(em.field_g, (byte) 100, 17);
              } else {
                var5.a(ss.field_e, (byte) 106, -1);
              }
            } else {
              var5.a((ko) (this), param0 ^ 108, gq.field_b);
            }
            if (param2.field_c == 3) {
              var5.a(rs.field_yb, (byte) 103, 7);
            } else {
              if (param2.field_c == 6) {
                var5.a(bf.field_d, (byte) 112, 9);
              }
            }
          } else {
            if (param2.field_b) {
              this.b(new pe(this), -51);
              return;
            }
            var5.a((ko) (this), param0 ^ 107, gq.field_b);
          }
          this.b(var5, 126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("oj.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void f(boolean param0) {
        this.a(17, true, ck.a(sg.field_xb, 248, -110));
        if (param0) {
          this.f(false);
        }
    }

    static {
        field_Bb = "Click to end turn.";
        field_Cb = new int[4];
        field_Ab = "Create a free Account";
        field_Fb = new mp();
    }
}
