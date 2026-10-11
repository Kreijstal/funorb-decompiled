/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sdb extends rqa {
    static String field_o;
    static llb field_p;

    final static String a(int param0) {
        String stackIn_56_0 = null;
        Object stackIn_94_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (param0 != -8037) {
            sdb.e((byte) -1);
          }
          var1 = null;
          var2 = null;
          if (ow.field_b == 0 &&
            null != ohb.field_o) {
            var2 = ldb.field_p;
          }
          if (ow.field_b == 2 &&
            !ws.a(0)) {
            if (uaa.a(nkb.field_o, (byte) -47)) {
              var2 = isa.a(cc.field_d, new String[]{waa.field_x}, 78);
              if (var10 != 0) {
                var2 = isa.a(fab.field_b, new String[]{waa.field_x}, 114);
              }
            } else {
              var2 = isa.a(fab.field_b, new String[]{waa.field_x}, 114);
            }
            if (uga.field_d) {
              lh.a((byte) -112, 0, (String) null, (String) null, (String) (var2), 2);
              fj.b(param0 ^ -22377);
            }
          }
          if (null == var2 &&
            !lf.field_o &&
            qw.field_l == null) {
            var2 = tta.field_o;
          }
          if (var2 != null) {
            flb.a(19204, (String) (var2), 0, (String) null, kmb.field_a);
          } else {
            var3 = kca.field_a;
            var3 = gfb.a(1, var3);
            var4 = "";
            var5 = "|";
            var6 = ow.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = isa.a(tia.field_G, new String[]{waa.field_x}, 91);
              var8 = isa.a(ejb.field_o, new String[]{var3}, 79);
              var7 = fgb.field_l.field_hb + (bpa.field_c.field_hb - 485 + ej.field_c.b(var8)) - ej.field_c.b(var4);
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (0 == var6) {
                if (null == lqa.field_o &&
                  cqb.field_e) {
                  var4 = "[" + bib.field_e + "] ";
                }
                if (null != lqa.field_o) {
                  var6 = 1;
                  boolean decompiledSharedTail0 = (!(nv.field_n) ||
                    vla.field_E == null);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + vla.field_E + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, param0 + 8147) + "] ";
                  }
                }
              }
              if (tob.g(0)) {
                stackIn_56_0 = ": ";
              } else {
                stackIn_56_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_56_0;
              var4 = var4 + var3 + var8Lifetime1;
              if (!erb.field_p) {
                if (hb.field_c) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + vq.field_y + "</col>";
                  if (var10 != 0) {
                    var4 = "<col=999999>" + var4 + ocb.field_g + "</col>";
                    var5 = "";
                  }
                }
              } else {
                var4 = "<col=999999>" + var4 + ocb.field_g + "</col>";
                var5 = "";
              }
              var9 = ej.field_c.b(var4);
              if (!tob.g(0)) {
                if (bpa.field_c.field_O &&
                  -bpa.field_c.field_M + kc.field_b < var9) {
                  if (!erb.field_p) {
                    var1 = vq.field_y;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (bpa.field_c.field_o != 0 &&
                  var9 > bpa.field_c.field_r &&
                  !erb.field_p) {
                  or.a(param0 + 8037);
                }
              }
            }
            flb.a(19204, var4 + no.c(awa.field_p.toString()), var7, var5, rqa.field_m[var6]);
            if (!fva.field_p) {
              fgb.field_l.field_O = false;
            }
            if (fgb.field_l.field_O) {
              var1 = isa.a(rc.field_a, new String[]{var3, waa.field_x}, 100);
            }
          }
          stackIn_94_0 = var1;
          return (String) (stackIn_94_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (var1), "sdb.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = (String) null;
          }
          stackIn_4_0 = new nc(frb.a(48, 117));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sdb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    sdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        try {
          field_o = null;
          field_p = null;
          int var1_int = -99 % ((-65 - param0) / 39);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sdb.C(" + param0 + ')');
        }
    }

    static {
        field_o = "Scale up map zone";
    }
}
