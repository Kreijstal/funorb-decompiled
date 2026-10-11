/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends wv implements vh {
    static hd field_lb;
    static ut field_qb;
    private boolean field_nb;
    private boolean field_pb;
    static int field_ob;
    static r field_rb;
    static int field_kb;
    private ae field_mb;

    public static void s(int param0) {
        field_lb = null;
        field_rb = null;
        if (param0 != 248) {
          jn.s(-37);
          field_qb = null;
          return;
        }
        field_qb = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var7 = Kickabout.field_G;
          try {
            if (lb.field_F) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (mm.a(30858, "getcookies", param1));
              var4 = wr.a(var3, 2, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
              if (param0 != 17) {
                var8 = (java.applet.Applet) null;
                jn.a(100, (java.applet.Applet) null);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            stackIn_20_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2_ref;
            stackIn_23_1 = new StringBuilder().append("jn.BB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    jn(se param0, ae param1) {
        super(param0, fj.field_b, kk.field_L, false, false);
        try {
          this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void t(int param0) {
        this.a(true, wb.a(param0 ^ -105, nb.field_g, 248), (byte) -71);
        if (param0 != 17) {
          field_qb = (ut) null;
        }
    }

    final boolean k(int param0) {
        wn var2 = null;
        wn var2Lifetime1;
        if (param0 != -1) {
          jn.s(-114);
          if (!this.field_C) {
            return super.k(-1);
          }
          if (this.field_pb) {
            return super.k(-1);
          }
          var2 = uf.a(param0 - 1459);
          if (var2 == null) {
            return super.k(-1);
          }
          this.a(false, var2, (byte) -71);
          return super.k(-1);
        }
        if (!this.field_C) {
          return super.k(-1);
        }
        if (this.field_pb) {
          return super.k(-1);
        }
        var2Lifetime1 = uf.a(param0 - 1459);
        if (var2Lifetime1 == null) {
          return super.k(-1);
        }
        this.a(false, var2Lifetime1, (byte) -71);
        return super.k(-1);
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (this.field_nb) {
          bl.a(false, true, (byte) -121);
          return;
        }
        try {
          oh.a(-87);
          this.q(-96);
          if (param3 <= 64) {
            field_rb = (r) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, wn param1, byte param2) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        qp var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          this.field_pb = true;
          if (!param1.field_g) {
            if (param1.field_f != null) {
              var4 = se.field_B;
              if (null != this.field_mb) {
                this.field_mb.a(-1);
              }
            } else {
              var4 = param1.field_d;
              if (param1.field_e == 248) {
                if (param0) {
                  var4 = nb.field_g;
                  this.field_nb = true;
                } else {
                  pc.a(536870912);
                  var4 = nb.field_g;
                  this.field_nb = true;
                }
              }
            }
          } else {
            var4 = cb.field_e;
          }
          if (param2 != -71) {
            return;
          }
          var5 = new qp((wv) (this), fj.field_b, var4);
          if (param1.field_g) {
            if (param1.field_c) {
              this.a((byte) -126, (fd) (new ai(this)));
              return;
            }
            var5.a(es.field_g, (jv) (this), (byte) 79);
          } else {
            if (!this.field_nb) {
              if (param1.field_e != 5) {
                var5.a((byte) 55, -1, is.field_f);
              } else {
                var5.a((byte) 75, 11, ql.field_d);
                var5.a((byte) 66, 17, bv.field_o);
              }
            } else {
              var5.a(es.field_g, (jv) (this), (byte) 79);
            }
            if (param1.field_e != 3) {
              if (param1.field_e != 6) {
                this.a((byte) -122, (fd) (var5));
                return;
              }
              var5.a((byte) 114, 9, bv.field_p);
            } else {
              var5.a((byte) 94, 7, ha.field_J);
            }
          }
          this.a((byte) -122, (fd) (var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_35_0 = var4_ref;
          stackIn_35_1 = new StringBuilder().append("jn.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_rb = new r();
    }
}
