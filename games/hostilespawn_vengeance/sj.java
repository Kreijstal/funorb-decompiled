/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj {
    static bd field_g;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static ub field_c;
    static bd field_b;
    static sg field_a;
    static bd field_e;

    public static void a(byte param0) {
        if (param0 == 58) {
          field_c = null;
          field_h = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_h = (int[]) null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    final static int a(boolean param0) {
        try {
          int stackIn_17_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          vi var2 = null;
          if (ig.field_N.field_k >= 4) {
            if (ig.field_N.field_e == -1) {
              return 3;
            }
            if (-2 != ig.field_N.field_e) {
              return 1;
            }
            return 4;
          }
          if (!param0) {
            field_b = (bd) null;
          }
          try {
            if (ce.field_e == 0) {
              db.field_o = jj.field_k.a(fk.field_a, 76, mb.field_p);
              ce.field_e = ce.field_e + 1;
            }
            if (ce.field_e == 1) {
              if (db.field_o.field_f == 2) {
                stackIn_17_0 = th.a((byte) 125, -1);
                return stackIn_17_0;
              }
              if (db.field_o.field_f == 1) {
                ce.field_e = ce.field_e + 1;
              }
            }
            if (ce.field_e == 2) {
              be.field_g = new td((java.net.Socket) (db.field_o.field_c), jj.field_k);
              var2 = new vi(13);
              hm.a(ab.field_c, mm.field_s, var2, nj.field_a, 4122);
              var2.d(87, 15);
              var2.b(ik.field_a, 25251);
              be.field_g.a(13, var2.field_n, (byte) -70, 0);
              ce.field_e = ce.field_e + 1;
              cb.field_e = hn.a((byte) 80) + 30000L;
            }
            if (3 == ce.field_e) {
              if (be.field_g.b((byte) 53) <= 0) {
                if (hn.a((byte) 80) > cb.field_e) {
                  stackIn_32_0 = th.a((byte) 127, -2);
                  return stackIn_32_0;
                }
              } else {
                var1_int = be.field_g.d((byte) 97);
                if (var1_int != 0) {
                  stackIn_27_0 = th.a((byte) 122, var1_int);
                  return stackIn_27_0;
                }
                ce.field_e = ce.field_e + 1;
              }
            }
            if (ce.field_e != 4) {
              return -1;
            }
            ig.field_N.a(kd.field_q, (byte) 75, be.field_g);
            ce.field_e = 0;
            db.field_o = null;
            be.field_g = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return th.a((byte) 127, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        int var3 = 0;
        ji var1 = null;
        ji var2 = null;
        int var4 = 0;
        ql stackIn_9_0 = null;
        kd stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1 = cl.field_o;
          var2 = bb.field_e;
          if (bm.field_c == 1) {
            var2 = ua.field_f;
            var1 = en.field_u;
          }
          if (ii.b((byte) 30)) {
            var1 = bb.field_b;
          }
          ha.field_w.field_F.a(param0, (byte) 123, var1);
          ha.field_w.field_C.a(true, (byte) 123, uk.field_d);
          ha.field_w.field_B = var2;
          ha.field_w.field_n.a(true, (byte) 12, var2);
          if (null == q.field_g) {
            stackIn_9_0 = ue.field_a;
          } else {
            stackIn_9_0 = q.field_g;
          }
          ni.field_e = ((ql) (Object) stackIn_9_0).a(mm.field_m[0].field_j, false, (byte) 109);
          stackIn_11_0 = ha.field_w;
          if (!ni.field_e) {
            stackIn_12_1 = 1048576;
          } else {
            stackIn_12_1 = -1048576;
          }
          stackIn_11_0.field_w = stackIn_12_1;
          ha.field_w.field_r = 128;
          ha.field_w.field_l = true;
          mb.field_s.a(256);
          for (var3 = 0; var3 < 16; var3++) {
            mb.field_s.field_n.a(0, var3, (byte) -95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "sj.D(" + param0 + ')');
        }
    }

    final static void a(int[] param0, oj param1, int param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param4 != 0) {
            sj.b(true);
          }
          if (param1.field_I > 0 &&
            ln.field_a.field_y[param3] == 82) {
            param0[param3 - param2] = 2;
            param0[param3] = 2;
            param0[param3 + param2] = 2;
            return;
          }
          if (param0[param3 - param2] == 2) {
            param0[param3 - param2] = 0;
          }
          if (2 == param0[param3]) {
            param0[param3] = 0;
          }
          if (param0[param2 + param3] == 2) {
            param0[param2 + param3] = 0;
          }
          ln.field_a.field_y[-param2 + param3] = 144;
          ln.field_a.field_y[param3] = 152;
          ln.field_a.field_y[param2 + param3] = 145;
          param1.field_i = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("sj.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = new int[8192];
        field_d = "There are unusual life signs on the ship, so be careful in your search. Proceed towards your objective.";
        field_h = new int[]{370, 370, 410};
        field_c = new ub();
    }
}
