/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static th field_c;
    static String field_a;
    static int field_d;
    static int field_e;
    static int field_f;
    static cj field_b;

    final static String a(byte param0) {
        String stackIn_67_0 = null;
        Object stackIn_104_0 = null;
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -104) {
            field_d = 67;
          }
          var1 = null;
          var2 = null;
          if (va.field_a == 0 &&
            ej.field_n != null) {
            var2 = bc.field_d;
          }
          if (va.field_a == 2 &&
            !tl.d((byte) -20)) {
            if (!kj.a((byte) -94, ql.field_a)) {
              var2 = vl.a(ta.field_jb, new String[]{qf.field_g}, 2);
              if (var10 != 0) {
                var2 = vl.a(hn.field_k, new String[]{qf.field_g}, 2);
              }
            } else {
              var2 = vl.a(hn.field_k, new String[]{qf.field_g}, 2);
            }
            if (ee.field_b) {
              vm.a((String) null, 0, (String) null, (String) (var2), 2, 0);
              ub.n(33423425);
            }
          }
          if (var2 == null &&
            !sp.field_h &&
            null == lj.field_v) {
            var2 = ch.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2 != null) {
            wh.a(6, wj.field_g, 0, (String) (var2), (String) null);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = ta.field_lb;
            var3 = nh.a(2, var3);
            var4 = "";
            var5 = "|";
            var6 = va.field_a;
            var7 = 0;
            if (var6 == 2) {
              var4 = vl.a(v.field_c, new String[]{qf.field_g}, 2);
              var8 = vl.a(lc.field_n, new String[]{var3}, param0 + 106);
              var7 = -485 + ua.field_E.field_zb + (ec.field_b.field_zb - (-w.field_A.a(var8) + w.field_A.a(var4)));
              if (var7 < 0) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (mh.field_c == null &&
                  sn.field_Hb) {
                  var4 = "[" + ne.field_vb + "] ";
                }
                if (null != mh.field_c) {
                  var6 = 1;
                  boolean decompiledSharedTail1 = (!(wa.field_k) ||
                    null == bp.field_t);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + bp.field_t + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                  }
                }
              }
              if (!lq.b(param0 + 104)) {
                stackIn_67_0 = "<img=3>: ";
              } else {
                stackIn_67_0 = ": ";
              }
              var8Lifetime1 = stackIn_67_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(nh.field_m);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + t.field_a + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (sh.field_L)) {
                var4 = "<col=999999>" + var4 + cf.field_v + "</col>";
                var5 = "";
              }
              var9 = w.field_A.a(var4);
              if (!lq.b(0)) {
                if (ec.field_b.field_L &&
                  var9 > (-ec.field_b.field_w + bd.field_g)) {
                  if (nh.field_m) {
                    var1 = "Broken!";
                  } else {
                    var1 = cf.field_v;
                  }
                }
                if (ec.field_b.field_T != 0 &&
                  ec.field_b.field_U < var9 &&
                  !nh.field_m) {
                  q.a(13151);
                }
              }
            }
            wh.a(6, pq.field_m[var6], var7, var4 + fm.c(rm.field_a.toString()), var5);
            if (!sq.field_N) {
              ua.field_E.field_L = false;
            }
            if (ua.field_E.field_L) {
              var1 = vl.a(jg.field_b, new String[]{var3, qf.field_g}, param0 + 106);
            }
          }
          stackIn_104_0 = var1;
          return (String) (stackIn_104_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (var1), "jp.B(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
          field_a = null;
          int var1_int = 80 % ((56 - param0) / 61);
          field_b = null;
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "jp.A(" + param0 + ')');
        }
    }

    static {
        field_c = new th();
        field_a = "Best";
        field_e = -1;
    }
}
