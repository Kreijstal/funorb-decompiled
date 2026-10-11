/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends gn {
    static int field_e;
    byte[] field_k;
    static ut[] field_i;
    static int field_h;
    int field_j;
    long field_f;
    static ot field_g;

    final static og a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          og var5 = null;
          dh var5_ref = null;
          og stackIn_3_0 = null;
          dh stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 < 49) {
                jm.a(93, true, 85);
              }
              var4 = Class.forName("pm");
              var5 = (og) (var4.newInstance());
              var5.a(30, param1, param2, param3);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dh();
              ((og) ((Object) var5_ref)).a(30, param1, param2, param3);
              stackIn_5_0 = var5_ref;
              return (og) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("jm.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 <= 25) {
          jm.a(111);
          pc.field_c = nj.a(82);
          cv.field_d = 0;
          return;
        }
        pc.field_c = nj.a(82);
        cv.field_d = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hn var7 = null;
        tf var8 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (null != ra.field_G) {
            cv.a((byte) 78);
          }
          if (cq.field_h.field_c == param0) {
            return;
          }
          if (cq.field_h instanceof ta &&
            nb.a(param2 + 66)) {
            og.a(false);
            return;
          }
          if (cq.field_h instanceof ap &&
            null != um.field_e &&
            um.field_e.d((byte) 95)) {
            var8 = um.field_e.e((byte) -123);
            if (var8 != null &&
              var8.a(false) > 0) {
              or.field_d.b(81, (byte) 127);
              or.field_d.field_n = or.field_d.field_n + 2;
              var4 = or.field_d.field_n;
              or.field_d.a(param2 ^ -106, var8.a(false));
              var7 = (hn) (var8.g(24009));
              while (var7 != null) {
                var7.a(1, or.field_d);
                var7 = (hn) (var8.c(param2 ^ -33));
              }
              or.field_d.d(-var4 + or.field_d.field_n, 62);
            }
          }
          ra.field_G = lg.a(param0, 24939);
          if (26 == cq.field_h.field_c &&
            !(ra.field_G instanceof ap) &&
            !la.a(param2 ^ -102)) {
            or.field_d.b(91, (byte) 114);
          }
          boolean decompiledFrameRemainder0 = true;
          if (cq.field_h.field_c == 12) {
            if (sk.a((byte) 97) == tu.field_E.field_p &&
              gn.b((byte) -110) == tu.field_E.field_F) {
              stackIn_31_0 = (tu.field_E.field_A) ? 0 : 1;
              if (stackIn_31_0 != (ei.field_n ? 1 : 0)) {
                stackIn_35_0 = (tu.field_E.field_d) ? 0 : 1;
                if (pf.field_c) {
                  stackIn_38_1 = 0;
                } else {
                  stackIn_38_1 = 1;
                }
                if ((stackIn_35_0 == stackIn_38_1 && (tb.field_v != 1 ||
                  tu.field_E.field_L)) &&
                  (decompiledFrameRemainder0 = (tb.field_v == 0))) {
                  decompiledFrameRemainder0 = !(!tu.field_E.field_L);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var3_int = 0;
              if (ei.field_n) {
                var3_int = var3_int | 1;
              }
              if (tb.field_v == 1) {
                var3_int = var3_int | 2;
              }
              if (pf.field_c) {
                var3_int = var3_int | 4;
              }
              var4Lifetime1 = gn.b((byte) -65);
              if (255 < var4Lifetime1) {
                var4Lifetime1 = 255;
              }
              var5 = sk.a((byte) 97);
              if (var5 > 255) {
                var5 = 255;
              }
              if (!la.a(100)) {
                or.field_d.b(65, (byte) 119);
                or.field_d.a(103, var5);
                or.field_d.a(param2 ^ -113, var4Lifetime1);
                or.field_d.a(param2 + 119, var3_int);
              }
              tu.field_E.field_p = sk.a((byte) 97);
              tu.field_E.field_F = gn.b((byte) -95);
              tu.field_E.field_d = pf.field_c;
              tu.field_E.field_A = ei.field_n;
            }
          }
          if (param2 != -2) {
            field_e = -71;
          }
          if (!(cq.field_h instanceof qt)) {
            ra.field_G.field_b = cq.field_h.field_c;
          } else {
            if (!(ra.field_G instanceof qt)) {
              ra.field_G.field_b = cq.field_h.field_c;
            } else {
              if (!((qt) (ra.field_G)).a((qt) (cq.field_h), -4319)) {
                ra.field_G.field_b = cq.field_h.field_c;
              }
            }
          }
          if (cq.field_h instanceof qt &&
            ra.field_G instanceof qt) {
            stackIn_74_0 = (!((qt) (ra.field_G)).a((qt) (cq.field_h), -4319)) ? 55 : 56;
            var3_intLifetime1 = stackIn_74_0;
            sp.c(var3_intLifetime1, -119);
          } else if (!(ra.field_G instanceof qt) &&
            cq.field_h instanceof qt) {
            sp.c(55, 22);
          } else {
            if (!(cq.field_h instanceof qt) &&
              ra.field_G instanceof qt) {
              sp.c(56, 49);
            }
          }
          ce.field_I = 0;
          if (ra.field_G instanceof bd) {
            ((qt) (ra.field_G)).a(0, -1, param1);
            eq.a(1, param1);
            return;
          }
          if (!(ra.field_G instanceof qt)) {
            return;
          }
          ((qt) (ra.field_G)).a(param2 + 2, 0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "jm.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var8 = 0;
        long var3 = nj.a(-127);
        int var8Lifetime1;
        if (var3 < up.field_b) {
          return;
        }
        up.field_b = var3 + 25L;
        float var5 = (float)param2 / (float)param0;
        int var6 = vr.a(-2, rl.field_r);
        int var7 = vr.a(-2, 1 + rl.field_r);
        if (param1 == 9863) {
          var8 = var7 - var6;
          ga.field_R = (float)var6 + (float)var8 * var5;
          mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
          nm.field_g.b((byte) 63);
          return;
        }
        field_h = -66;
        var8Lifetime1 = var7 - var6;
        ga.field_R = (float)var6 + (float)var8Lifetime1 * var5;
        mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
        nm.field_g.b((byte) 63);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        int var1 = 43 / ((32 - param0) / 58);
    }

    jm(long param0, int param1, byte[] param2) {
        try {
          this.field_f = param0;
          this.field_j = param1;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jm.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
