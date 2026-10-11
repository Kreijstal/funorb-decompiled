/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk implements Runnable {
    volatile vn[] field_g;
    static hd field_b;
    static String[] field_f;
    static String field_c;
    static ph field_e;
    qg field_h;
    volatile boolean field_d;
    volatile boolean field_a;

    public static void a(boolean param0) {
        if (param0) {
          bk.b(89);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    final static String b(int param0) {
        if (param0 != 1) {
          field_e = (ph) null;
        }
        if (ti.field_f) {
          return null;
        }
        if (no.field_a < lp.field_z) {
          return null;
        }
        if (!(lp.field_z + ga.field_p <= no.field_a)) {
          return vj.field_c;
        }
        return null;
    }

    final static int a(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          ec var2 = null;
          if (4 <= hb.field_a.field_h) {
            if (hb.field_a.field_c == -1) {
              return 3;
            }
            if (hb.field_a.field_c == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (ba.field_f == 0) {
              qi.field_e = kn.field_f.a(param0 ^ -119, lk.field_T, of.field_d);
              ba.field_f = ba.field_f + 1;
            }
            if (ba.field_f == 1) {
              if (qi.field_e.field_c == 2) {
                stackIn_14_0 = dl.a(-5, -1);
                return stackIn_14_0;
              }
              if (qi.field_e.field_c == 1) {
                ba.field_f = ba.field_f + 1;
              }
            }
            if (ba.field_f == 2) {
              pe.field_l = new rk((java.net.Socket) (qi.field_e.field_f), kn.field_f);
              var2 = new ec(13);
              rg.a(ri.field_b, var2, pj.field_a, param0 + 127, j.field_J);
              var2.a(6, 15);
              var2.a((byte) 63, ng.field_I);
              pe.field_l.b(var2.field_m, false, 0, 13);
              ba.field_f = ba.field_f + 1;
              ce.field_s = kd.c(param0 - 2456) + 30000L;
            }
            if (ba.field_f == 3) {
              if (0 >= pe.field_l.a(0)) {
                if (kd.c(-2456) > ce.field_s) {
                  stackIn_29_0 = dl.a(param0 - 5, -2);
                  return stackIn_29_0;
                }
              } else {
                var1_int = pe.field_l.a((byte) -108);
                if (0 != var1_int) {
                  stackIn_24_0 = dl.a(-5, var1_int);
                  return stackIn_24_0;
                }
                ba.field_f = ba.field_f + 1;
              }
            }
            if (param0 != 0) {
              field_f = (String[]) null;
            }
            if (ba.field_f != 4) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            hb.field_a.a(pe.field_l, kn.field_c, (byte) 118);
            pe.field_l = null;
            ba.field_f = 0;
            qi.field_e = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return dl.a(-5, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3 = nl.field_d;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            }
          }
        }
        var4 = 1;
        var5 = 0;
        if (param1 == 1) {
          var5 = 1;
        }
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 4) {
          var4 = 1;
          var5 = 1;
        }
        if (5 == param1) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == param0 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (12 == param1) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var5 = 1;
          var4 = 1;
        }
        pj.field_e = vf.a(var5 * var2, var2 * var4, (byte) 84);
    }

    public final void run() {
        int var1_int = 0;
        vn var2 = null;
        int var4 = DungeonAssault.field_K;
        this.field_d = true;
        try {
          while (!this.field_a) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_g[var1_int];
              if (var2 == null) {
              } else {
                var2.a();
              }
            }
            pj.a(0, 10L);
            Object var5 = (Object) null;
            ho.a(this.field_h, (Object) null, (byte) -32);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          sm.a((Throwable) ((Object) exception), 1, (String) null);
        } finally {
          this.field_d = false;
        }
    }

    final static void a(qk param0, byte param1, int param2, int param3, int param4, qk param5) {
        try {
          ci.field_j = param4;
          oh.field_t = param3;
          om.field_d = param5;
          gd.field_G = param0;
          h.field_q = param2;
          if (param1 != -40) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    bk() {
        this.field_g = new vn[2];
        this.field_a = false;
        this.field_d = false;
    }

    static {
        field_c = "Type your email address again to make sure it's correct";
        field_f = new String[]{null, "<%guardians> require a raider either to <%dodge> (testing against the room's <%snare>), or, more commonly, <%sneak> (against the room's <%detect>)"};
    }
}
