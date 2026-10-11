/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends be {
    static String[] field_E;
    boolean field_D;
    static int field_B;
    static int[] field_C;
    static long[] field_y;
    volatile boolean field_z;
    boolean field_A;

    abstract byte[] g(byte param0);

    final static String c(int param0) {
        String stackIn_58_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3_ref_String = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = client.field_A ? 1 : 0;
        try {
          var1 = null;
          var2 = null;
          if (pk.field_r == 0 &&
            g.field_N != null) {
            var2 = gh.field_f;
          }
          if (2 == pk.field_r &&
            !hl.a((byte) -53)) {
            if (!qe.a(cf.field_c, 3)) {
              var2 = cm.$cfr$intArgs$a$53ce4ab4c593(96, se.field_V, new String[]{ed.field_c});
              if (var10 != 0) {
                var2 = cm.$cfr$intArgs$a$53ce4ab4c593(87, dc.field_k, new String[]{ed.field_c});
              }
            } else {
              var2 = cm.$cfr$intArgs$a$53ce4ab4c593(87, dc.field_k, new String[]{ed.field_c});
            }
            if (jh.field_h) {
              ca.a((String) null, (String) null, (String) (var2), (byte) 125, 2, 0);
              qn.l(13);
            }
          }
          if (null == var2 &&
            !sc.field_m &&
            tf.field_gb == null) {
            var2 = bl.field_W;
          }
          if (null != var2) {
            cl.a((String) null, 0, ij.field_c, (String) (var2), -24503);
          } else {
            var3_ref_String = oa.field_f;
            var3_ref_String = b.a(107, var3_ref_String);
            var4 = "";
            var5 = "|";
            var6 = pk.field_r;
            var7 = 0;
            if (var6 == 2) {
              var4 = cm.$cfr$intArgs$a$53ce4ab4c593(81, oj.field_b, new String[]{ed.field_c});
              var8 = cm.$cfr$intArgs$a$53ce4ab4c593(125, im.field_j, new String[]{var3_ref_String});
              var7 = -485 + jb.field_f.field_mb + wj.field_Mb.field_mb - (-ff.field_o.a(var8) + ff.field_o.a(var4));
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (0 == var6) {
                if (cd.field_m == null &&
                  ii.field_q) {
                  var4 = "[" + uc.field_b + "] ";
                }
                if (null != cd.field_m) {
                  boolean decompiledSharedTail0 = (!(wh.field_b) ||
                    null == f.field_q);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + f.field_q + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + cm.$cfr$intArgs$a$53ce4ab4c593(115, hf.field_a, new String[]{cd.field_m.field_Vb}) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (rc.a(false)) {
                stackIn_58_0 = ": ";
              } else {
                stackIn_58_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_58_0;
              var4 = var4 + var3_ref_String + var8Lifetime1;
              if (!wc.field_n) {
                if (wl.field_p) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + ci.field_d + "</col>";
                  if (var10 != 0) {
                    var5 = "";
                    var4 = "<col=999999>" + var4 + vg.field_s + "</col>";
                  }
                }
              } else {
                var5 = "";
                var4 = "<col=999999>" + var4 + vg.field_s + "</col>";
              }
              var9 = ff.field_o.a(var4);
              if (!rc.a(false)) {
                if (wj.field_Mb.field_jb &&
                  (bh.field_g - wj.field_Mb.field_E) < var9) {
                  if (wc.field_n) {
                    var1 = "Broken!";
                  } else {
                    var1 = ci.field_d;
                  }
                }
                if (wj.field_Mb.field_ob != 0 &&
                  var9 > wj.field_Mb.field_xb &&
                  !wc.field_n) {
                  aj.a(-1045);
                }
              }
            }
            cl.a(var5, var7, tl.field_q[var6], var4 + mm.c(dj.field_ab.toString()), -24503);
            if (!jg.field_i) {
              jb.field_f.field_jb = false;
            }
            if (jb.field_f.field_jb) {
              var1 = cm.$cfr$intArgs$a$53ce4ab4c593(126, vf.field_d, new String[]{var3_ref_String, ed.field_c});
            }
          }
          var3 = 125 % ((30 - param0) / 41);
          stackIn_97_0 = var1;
          return (String) (stackIn_97_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (var1), "sf.C(" + param0 + ')');
        }
    }

    abstract int a(boolean param0);

    public static void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_y = null;
          field_E = null;
          if (param0 > -123) {
            field_B = -69;
          }
          field_C = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "sf.A(" + param0 + ')');
        }
    }

    sf() {
        this.field_z = true;
    }

    static {
        field_C = new int[8192];
        field_y = new long[32];
        field_B = 0;
        field_E = new String[]{"All scores", "My scores", "Best each"};
    }
}
