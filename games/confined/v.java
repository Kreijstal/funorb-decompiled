/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends dh implements el {
    static mi field_Bb;
    private boolean field_Fb;
    private ke field_Hb;
    private boolean field_Gb;
    static String field_Cb;
    static int field_Eb;
    static pb field_Db;

    private final void a(byte param0, boolean param1, in param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        jn var5 = null;
        int var6 = 0;
        rg var7 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          this.field_Fb = true;
          if (param2.field_a) {
            var4 = gd.field_r;
          } else {
            if (null == param2.field_c) {
              var4 = param2.field_f;
              if (param2.field_g == 248) {
                if (!param1) {
                  om.b(true);
                }
                var4 = ec.field_a;
                this.field_Gb = true;
              }
            } else {
              var4 = fh.field_c;
              if (this.field_Hb != null) {
                this.field_Hb.a((byte) -120);
              }
            }
          }
          var5 = new jn((dh) (this), fd.field_k, var4);
          if (!param2.field_a) {
            if (!this.field_Gb) {
              if (param2.field_g != 5) {
                var5.a(0, te.field_i, -1);
              } else {
                var5.a(0, ei.field_nb, 11);
                var5.a(param0 + 96, al.field_c, 17);
              }
            } else {
              var5.a(gi.field_fb, (uk) (this), false);
            }
            if (param2.field_g == 3) {
              var5.a(0, ui.field_d, 7);
            } else {
              if (6 == param2.field_g) {
                var5.a(0, tn.field_y, 9);
              }
            }
          } else {
            if (param2.field_i) {
              this.a((fj) (new pi(this)), (byte) -72);
              return;
            }
            var5.a(gi.field_fb, (uk) (this), false);
          }
          this.a((fj) (var5), (byte) -72);
          if (param0 == -96) {
            return;
          }
          var7 = (rg) null;
          this.a(106, -28, -124, (rg) null, -89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("v.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        if (param0 < 68) {
          this.field_Fb = false;
        }
        if (this.field_Gb) {
          wl.a(-66, false, true);
          return;
        }
        try {
          la.j(31);
          this.n(10);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "v.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean l(int param0) {
        in var2;
        rg var3;
        in var2Lifetime1;
        if (param0 == -6) {
          if (!this.field_H) {
            return super.l(-6);
          }
          if (this.field_Fb) {
            return super.l(-6);
          }
          var2 = lc.b((byte) -100);
          if (var2 == null) {
            return super.l(-6);
          }
          this.a((byte) -96, false, var2);
          return super.l(-6);
        }
        var3 = (rg) null;
        this.a(-51, -9, 28, (rg) null, -54);
        if (!this.field_H) {
          return super.l(-6);
        }
        if (this.field_Fb) {
          return super.l(-6);
        }
        var2Lifetime1 = lc.b((byte) -100);
        if (var2Lifetime1 != null) {
          this.a((byte) -96, false, var2Lifetime1);
        }
        return super.l(-6);
    }

    final void o(int param0) {
        this.a((byte) -96, true, gd.a(4, ec.field_a, 248));
        if (param0 < 107) {
          v.j((byte) -117);
        }
    }

    v(sh param0, ke param1) {
        super(param0, fd.field_k, un.field_d, false, false);
        try {
          this.field_Hb = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(byte param0) {
        field_Db = null;
        field_Bb = null;
        if (param0 != -39) {
          return;
        }
        field_Cb = null;
    }

    static {
        field_Cb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
