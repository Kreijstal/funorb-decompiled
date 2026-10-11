/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    static kv[] field_a;

    public static void b(int param0) {
        if (param0 != 12653) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gr.B(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        String stackIn_58_0 = null;
        Object stackIn_100_0 = null;
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
        var10 = BachelorFridge.field_y;
        try {
          var1 = null;
          var2 = null;
          if (gk.field_d == 0 &&
            null != rv.field_n) {
            var2 = iu.field_l;
          }
          if (param0 != 2) {
            field_a = (kv[]) null;
          }
          if (gk.field_d == 2 &&
            !hv.a(-19229)) {
            if (!gl.a(3, df.field_s)) {
              var2 = lga.a(true, new String[]{bd.field_k}, ja.field_r);
              if (var10 != 0) {
                var2 = lga.a(true, new String[]{bd.field_k}, uma.field_O);
              }
            } else {
              var2 = lga.a(true, new String[]{bd.field_k}, uma.field_O);
            }
            if (gm.field_k) {
              vf.a((String) null, 0, param0 + 115, (String) null, (String) (var2), 2);
              lc.b(-1);
            }
          }
          if (null == var2 &&
            !qh.field_l &&
            null == bi.field_h) {
            var2 = cd.field_l;
          }
          if (var2 != null) {
            pp.a(vq.field_w, param0 + 3, (String) (var2), 0, (String) null);
          } else {
            var3 = cha.field_l;
            var3 = kba.a(-123, var3);
            var4 = "";
            var5 = "|";
            var6 = gk.field_d;
            var7 = 0;
            if (var6 == 2) {
              var4 = lga.a(true, new String[]{bd.field_k}, iia.field_q);
              var8 = lga.a(true, new String[]{var3}, wla.field_n);
              var7 = -485 + (ts.field_r.field_sb + jba.field_A.field_sb + dc.field_r.a(var8) - dc.field_r.a(var4));
              if (var7 < 0) {
                var7 = 0;
              }
            } else {
              if (var6 == 0) {
                if (pw.field_w == null &&
                  am.field_O) {
                  var4 = "[" + cja.field_r + "] ";
                }
                if (null != pw.field_w) {
                  var6 = 1;
                  if (!ada.field_k ||
                    null == jc.field_n) {
                    var4 = "[" + lga.a(true, new String[]{pw.field_w.field_Jb}, fq.field_r) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + jc.field_n + "] ";
                    }
                  } else {
                    var4 = "[" + jc.field_n + "] ";
                  }
                }
              }
              if (ak.e(param0 ^ -1373)) {
                stackIn_58_0 = ": ";
              } else {
                stackIn_58_0 = "<img=3>: ";
              }
              var8 = stackIn_58_0;
              var4 = var4 + var3 + var8;
              if (!hl.field_I) {
                if (sea.field_j) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + qca.field_m + "</col>";
                  if (var10 != 0) {
                    var5 = "";
                    var4 = "<col=999999>" + var4 + kna.field_h + "</col>";
                  }
                }
              } else {
                var5 = "";
                var4 = "<col=999999>" + var4 + kna.field_h + "</col>";
              }
              var9 = dc.field_r.a(var4);
              if (!ak.e(param0 - 1377)) {
                if (jba.field_A.field_T &&
                  -jba.field_A.field_D + mk.field_p < var9) {
                  if (hl.field_I) {
                    var1 = "Broken!";
                  } else {
                    var1 = qca.field_m;
                  }
                }
                if (0 != jba.field_A.field_R &&
                  var9 > jba.field_A.field_nb &&
                  !hl.field_I) {
                  fk.d(param0 ^ 127);
                }
              }
            }
            pp.a(jaa.field_u[var6], 5, var4 + po.c(jm.field_g.toString()), var7, var5);
            if (!lna.field_q) {
              ts.field_r.field_T = false;
            }
            if (ts.field_r.field_T) {
              var1 = lga.a(true, new String[]{var3, bd.field_k}, nl.field_a);
            }
          }
          stackIn_100_0 = var1;
          return (String) (stackIn_100_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (var1), "gr.A(" + param0 + ')');
        }
    }

    static {
    }
}
