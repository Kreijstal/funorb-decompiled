/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ma implements ke {
    static vj field_Jb;
    static String field_Fb;
    static String field_Db;
    static java.awt.Frame field_Gb;
    private boolean field_Hb;
    static he[] field_Cb;
    private v field_Ib;
    private boolean field_Eb;

    public static void o(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Cb = null;
        field_Db = null;
        if (param0 != 9791) {
          return;
        }
        field_Jb = null;
    }

    qd(k param0, v param1) {
        super(param0, wi.field_e, mk.field_d, false, false);
        try {
          this.field_Ib = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 111) {
            var4 = (byte[]) null;
            qd.a((byte) 94, (byte[]) null);
          }
          var2_int = param1.length;
          var3 = new byte[var2_int];
          kg.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void p(int param0) {
        this.a((byte) -92, kj.a(param0, 4, ig.field_i), true);
    }

    private final void a(byte param0, og param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        dj var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          this.field_Eb = true;
          if (param1.field_b) {
            var4 = oa.field_c;
          } else {
            if (null == param1.field_h) {
              var4 = param1.field_g;
              if (248 == param1.field_a) {
                if (param2) {
                  this.field_Hb = true;
                  var4 = ig.field_i;
                } else {
                  bg.a(false);
                  this.field_Hb = true;
                  var4 = ig.field_i;
                }
              }
            } else {
              var4 = q.field_g;
              if (this.field_Ib != null) {
                this.field_Ib.a((byte) -82);
              }
            }
          }
          if (param0 != -92) {
            this.k(33);
          }
          var5 = new dj((ma) (this), wi.field_e, var4);
          if (!param1.field_b) {
            if (this.field_Hb) {
              var5.a(cd.field_a, false, (fd) (this));
            } else {
              if (5 == param1.field_a) {
                var5.a(false, jf.field_fb, 11);
                var5.a(false, qk.field_d, 17);
              } else {
                var5.a(false, f.field_m, -1);
              }
            }
            if (param1.field_a == 3) {
              var5.a(false, nl.field_o, 7);
            } else {
              if (param1.field_a != 6) {
                this.a(33, var5);
                return;
              }
              var5.a(false, bb.field_d, 9);
            }
          } else {
            if (param1.field_d) {
              this.a(33, new ih(this));
              return;
            }
            var5.a(cd.field_a, false, (fd) (this));
          }
          this.a(33, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (this.field_Hb) {
          q.a((byte) -115, false, true);
          return;
        }
        try {
          lk.b(1);
          this.d(param2);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "qd.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean k(int param0) {
        if (!this.field_Q) {
          if (param0 == 2968) {
            return super.k(param0 + 0);
          }
          this.field_Ib = (v) null;
          return super.k(param0 + 0);
        }
        if (this.field_Eb) {
          if (param0 == 2968) {
            return super.k(param0 + 0);
          }
          this.field_Ib = (v) null;
          return super.k(param0 + 0);
        }
        og var2 = qg.l(19860);
        if (var2 == null) {
          if (param0 == 2968) {
            return super.k(param0 + 0);
          }
          this.field_Ib = (v) null;
          return super.k(param0 + 0);
        }
        this.a((byte) -92, var2, false);
        if (param0 == 2968) {
          return super.k(param0 + 0);
        }
        this.field_Ib = (v) null;
        return super.k(param0 + 0);
    }

    static {
        field_Fb = "Waiting for music";
        field_Db = "Log in / Create account";
    }
}
