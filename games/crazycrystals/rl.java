/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rl extends oh {
    static String field_f;
    static db field_i;
    static String field_g;
    static int field_h;

    rl() {
    }

    final static void d(int param0) {
        md var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = CrazyCrystals.field_B;
        try {
          var1 = tp.field_f;
          L0: while (true) {
            if (!cn.b(114)) {
              field_g = null;
              return;
            } else {
              var1.d(8, 8);
              int fieldTemp$2 = var1.field_f + 1;
              var1.field_f = var1.field_f + 1;
              var2 = fieldTemp$2;
              ke.a(var1, -9129);
              tp.field_f.c((byte) 47, var1.field_f - var2);
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1_ref, "rl.K(" + 0 + 41);
        }
    }

    final int a(byte param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -53) {
          L0: {
            int discarded$13 = ((rl) this).a((byte) 90, false);
            if (!param1) {
              stackOut_7_0 = 4;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 16;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (!param1) {
              stackOut_3_0 = 4;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 16;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void e(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        int var1 = -1 % ((57 - param0) / 63);
    }

    final static nd c(int param0) {
        if (null == p.field_i) {
          p.field_i = new nd();
          p.field_i.a(ai.field_h, false);
          p.field_i.field_l = 6;
          p.field_i.field_g = 5;
          p.field_i.field_c = 7697781;
          p.field_i.field_j = 4;
          p.field_i.field_f = 14;
          p.field_i.field_d = 0;
          p.field_i.field_h = 2763306;
          p.field_i.field_m = ba.field_i;
          return p.field_i;
        } else {
          return p.field_i;
        }
    }

    final static int c(byte param0) {
        if (param0 < 58) {
            rl.e(-15);
            return gp.field_a;
        }
        return gp.field_a;
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
          int discarded$2 = rl.b(117, (byte) -122);
          return q.field_a[ma.field_n[param1]].field_e[0];
        } else {
          return q.field_a[ma.field_n[param1]].field_e[0];
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          pc.field_y = 0;
          lo.field_b = null;
          rc.field_a = ol.field_z[param1];
          jo.field_o = param1;
          if (param1 == 0) {
            vh.field_a = true;
            break L0;
          } else {
            break L0;
          }
        }
        uo.field_o = param2;
        dk.field_h = param2;
        mb.field_g = 25;
        ob.field_l = 10;
        wd.field_j = 60;
        fn.field_j = 8;
        if (param0 != 26) {
          return;
        } else {
          je.field_j = qk.field_F;
          we.field_h = sm.field_f;
          b.field_a = ka.field_n;
          fp.field_a = ei.field_F;
          var3 = param2;
          mb.field_g = mb.field_g + var3;
          sa.n(-26);
          a.field_b = null;
          qn.field_n = 0;
          gh.field_C = 0;
          return;
        }
    }

    final static int b(int param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        param0 = param0 & 8191;
        if (param1 == -23) {
          if (param0 < 4096) {
            L0: {
              if (param0 < 2048) {
                stackOut_9_0 = fe.field_h[param0];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = fe.field_h[-param0 + 4096];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackOut_5_0 = -fe.field_h[param0 - 4096];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -fe.field_h[-param0 + 8192];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 95;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Email is valid";
        field_g = "This is a rock.<br><br>You can push rocks.<br><br>Rocks fall if they are<br>unsupported. They also<br>roll off curved edges<br>and round objects.<br><br>Occasionally, you may need to push a rock while it is falling. Move out of the way to let it fall, and then push it. You must be quick!";
    }
}
