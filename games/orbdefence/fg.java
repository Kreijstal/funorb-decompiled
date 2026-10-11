/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class fg extends jc {
    static int field_u;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        try {
          if (param4) {
            tl.a(param2.field_r, param2.field_n + param0, param2.field_s + param1, param2.field_m, param3 ^ 4459);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$0 = 0L;
          int stackIn_13_0 = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          se var4 = null;
          se var5 = null;
          if (null == ia.field_f) {
            ia.field_f = ef.field_i.a(eg.field_v, 0, jl.field_e);
          }
          if (ia.field_f.field_a == 0) {
            return false;
          }
          dupTemp$0 = ji.b(-85);
          p.field_a = dupTemp$0;
          of.field_L = dupTemp$0;
          if (ia.field_f.field_a != 1) {
            dh.field_bb = ug.field_p;
          } else {
            try {
              p.field_d = new cb((java.net.Socket) (ia.field_f.field_g), ef.field_i);
              var4 = cd.field_t;
              var5 = var4;
              uk.field_b.field_i = 0;
              stackIn_13_0 = (param0) ? -2 : -1;
              lh.field_c = stackIn_13_0;
              fe.field_b = stackIn_13_0;
              ce.field_d = stackIn_13_0;
              dh.field_bb = sk.field_E;
              var5.field_i = 0;
              nl.a(20994, gi.field_a, ti.field_eb, uk.field_b, dk.field_a);
              bh.a(-1, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              dh.field_bb = ug.field_p;
              if (param1 > -14) {
                return true;
              }
              ia.field_f = null;
              return true;
            }
          }
          if (param1 > -14) {
            return true;
          }
          ia.field_f = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, java.awt.Component param3, be param4, boolean param5, lj param6, boolean param7) {
        try {
          la.a(param2, param7, 10);
          cd.field_w = la.a(param4, param3, 0, param0);
          wf.field_b = la.a(param4, param3, 1, param1);
          vb.field_f = new v();
          h.field_H = param1 * 1000 / param2;
          wf.field_b.a(vb.field_f);
          ml.field_c = param6;
          ml.field_c.b(ij.field_g, 106);
          if (!param5) {
            field_u = -24;
          }
          cd.field_w.a(ml.field_c);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "fg.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(ad.field_b);
          param1.removeFocusListener(ad.field_b);
          wg.field_p = -1;
          if (param0 != 51) {
            lj var3 = (lj) null;
            fg.a(127, -79, -7, (java.awt.Component) null, (be) null, false, (lj) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "fg.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          sd.field_g = sd.field_g + 1;
          if (kf.field_e == -1 &&
            lm.field_a == -1) {
            kf.field_e = ua.field_a;
            lm.field_a = vl.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(ce.field_c));
          } else {
            decompiledFrameRemainder0 = (ce.field_c == null);
          }
          if (decompiledFrameRemainder0) {
            if (!bm.field_e) {
              if (sd.field_g >= gk.field_b) {
                stackIn_17_0 = (gk.field_b + df.field_i > sd.field_g) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              sd.field_g = 0;
            } else {
              if (bm.field_e) {
                sd.field_g = gk.field_b;
              } else {
                if (var2_int == 0) {
                  sd.field_g = 0;
                } else {
                  sd.field_g = gk.field_b;
                }
              }
            }
            uk.field_c = kf.field_e;
            if (param1 == null) {
              if (var2_int != 0) {
                bm.field_e = true;
              }
            } else {
              bm.field_e = false;
            }
            sl.field_ab = lm.field_a;
          }
          if (!bm.field_e &&
            gk.field_b > sd.field_g &&
            kd.field_d) {
            sd.field_g = 0;
            sl.field_ab = lm.field_a;
            uk.field_c = kf.field_e;
          }
          ce.field_c = param1;
          lm.field_a = -1;
          kf.field_e = -1;
          if (bm.field_e &&
            jf.field_H == sd.field_g) {
            sd.field_g = 0;
            bm.field_e = false;
          }
          if (param0 > 53) {
            return;
          }
          field_u = -91;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("fg.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        t.a(param1, true, true);
        if (param0 < 58) {
          field_u = -67;
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var1_int = vf.field_a[0];
          if (param0 != 88) {
            return;
          }
          for (var2 = 1; vf.field_a.length > var2; var2++) {
            var3 = vf.field_a[var2];
            mk.a(dm.field_g, var2 << 4, dm.field_g, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "fg.DA(" + param0 + ')');
        }
    }

    fg(int param0) {
        this(lm.field_f, param0);
    }

    fg(kc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    static {
        field_u = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        t.a(param1, true, true);
        if (param0 < 58) {
          field_u = -67;
        }
    }
}
