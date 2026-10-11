/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static nd field_a;
    private long field_c;
    private RandomAccessFile field_i;
    static nd field_h;
    private long field_f;
    static fk field_b;
    static bd field_g;
    static bd[] field_d;
    static int field_e;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
          ee.b(121);
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
          return 95;
        }
        if (ln.field_a.field_o[param1] >= 0) {
          return sa.a((byte) -118, param1) >> 1;
        }
        return sa.a((byte) -115, param1);
    }

    final void c(int param0) throws IOException {
        if (param0 != -1) {
          String var3 = (String) null;
          ee.a(true, 30, true, -25, (String) null, (String) null);
        }
        if (this.field_i != null) {
          this.field_i.close();
          this.field_i = null;
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_i != null) {
          System.out.println("");
          this.c(-1);
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_i.seek(param1);
        if (param0 != -18127) {
          ee.b(35);
        }
        this.field_f = param1;
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_b = (fk) null;
          }
          var5_int = this.field_i.read(param0, param3, param2);
          if (var5_int > 0) {
            this.field_f = this.field_f + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ee.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 != 0) {
          return;
        }
        try {
          if (this.field_c < (long)param3 + this.field_f) {
            this.field_i.seek(this.field_c);
            this.field_i.write(1);
            throw new EOFException();
          }
          this.field_i.write(param1, param2, param3);
          this.field_f = this.field_f + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ee.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(boolean param0, int param1, boolean param2, int param3, String param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_33_0 = 0;
          boolean stackIn_47_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_97_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = HostileSpawn.field_I ? 1 : 0;
          try {
            if (null == ag.field_t &&
              !me.a(param0, 107)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (param3 > -85) {
              var10 = (String) null;
              ee.a(true, 46, false, -119, (String) null, (String) null);
            }
            if (rc.field_a == sa.field_c) {
              if (!param0) {
                t.field_i = mk.a(false, param5, 113, param4);
              } else {
                var11 = (String) null;
                t.field_i = ul.a(false, (String) null, ib.field_d, param5, 112);
              }
              s.field_b.field_i = 0;
              s.field_b.d(94, 14);
              s.field_b.d(89, t.field_i.a(false).field_a);
              mb.d(-1, -22370);
              rc.field_a = ci.field_h;
            }
            if (rc.field_a == ci.field_h &&
              re.c((byte) 33, 1)) {
              var6_int = sc.field_g.l(32270);
              if (var6_int != 0) {
                jd.field_q = -1;
                wa.field_k = var6_int;
                rc.field_a = bi.field_a;
              } else {
                rc.field_a = dc.field_e;
              }
              sc.field_g.field_i = 0;
            }
            if (dc.field_e == rc.field_a &&
              re.c((byte) 33, 8)) {
              d.field_y = sc.field_g.c(10818);
              sc.field_g.field_i = 0;
              ln.a(t.field_i, (byte) -73, param1, param0, param2);
              rc.field_a = ej.field_q;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ej.field_q == rc.field_a &&
              re.c((byte) 33, 1)) {
              var6_intLifetime1 = sc.field_g.l(32270);
              wa.field_k = var6_intLifetime1;
              sc.field_g.field_i = 0;
              fl.field_b = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  jd.field_q = -1;
                  rc.field_a = bi.field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  le.c((byte) 67);
                  jn.field_C = false;
                  stackIn_33_0 = var6_intLifetime1;
                  return stackIn_33_0;
                }
              }
              if (decompiledFrameRemainder0) {
                rc.field_a = wj.field_N;
                jd.field_q = -1;
              }
            }
            if (rc.field_a == wj.field_N &&
              eb.a(13372)) {
              ib.field_d = sc.field_g.c(10818);
              li.field_q = sc.field_g.l(32270);
              sc.field_g.l(32270);
              wb.field_S = sc.field_g.e(8);
              var12 = sc.field_g.a((byte) 28);
              var7 = sc.field_g.l(32270);
              if ((1 & var7) != 0) {
                rd.a(-6);
              }
              if (!param0) {
                stackIn_47_0 = ((4 & var7) != 0);
                wg.field_ub = stackIn_47_0;
                stackIn_50_0 = ((8 & var7) != 0);
                ei.field_t = stackIn_50_0;
                if (!ei.field_t) {
                }
              }
              if (sd.field_u) {
                sc.field_g.l(32270);
                sc.field_g.l(32270);
                sc.field_g.d(8195);
                l.field_a = sc.field_g.e(8);
                qj.field_h = new byte[l.field_a];
                for (var8 = 0; l.field_a > var8; var8++) {
                  qj.field_h[var8] = sc.field_g.j(0);
                }
              }
              qg.field_r = sc.field_g.o(32);
              var13 = (CharSequence) ((Object) qg.field_r);
              se.field_c = mf.a(false, var13);
              ca.field_a = sc.field_g.l(32270);
              rc.field_a = ci.field_d;
              if (t.field_i.a(false) == uk.field_a) {
                ub.field_b.a((byte) -126, bn.c(-1));
              } else {
                if (t.field_i.a(false) == ln.field_l) {
                  wh.field_c.a((byte) -109, bn.c(-1));
                }
              }
              jn.field_C = false;
              if (var12 != null) {
                gb.a((byte) 62, bn.c(-1), var12);
              }
              if (0 >= wb.field_S &&
                !wg.field_ub) {
                try {
                  a.a("unzap", bn.c(-1), -124);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  a.a(bn.c(-1), new Object[]{pm.a(ib.field_d, (byte) 100)}, "zap", -13730);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (wb.field_S > 0) {
                wc.field_g = true;
              }
              s.field_b.a(he.field_s, 8);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                he.field_s[var8Lifetime1] = he.field_s[var8Lifetime1] + 50;
              }
              sc.field_g.a(he.field_s, 8);
              stackIn_79_0 = wa.field_k;
              return stackIn_79_0;
            }
            if (bi.field_a == rc.field_a &&
              eb.a(13372)) {
              le.c((byte) 83);
              if (wa.field_k == 7 &&
                !jn.field_C) {
                jn.field_C = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (7 == wa.field_k) {
                wa.field_k = 3;
              }
              km.field_x = sc.field_g.o(32);
              jn.field_C = false;
              stackIn_90_0 = wa.field_k;
              return stackIn_90_0;
            }
            if (ag.field_t == null) {
              if (jn.field_C) {
                if (m.a(true) <= 30000L) {
                  km.field_x = fl.field_d;
                } else {
                  km.field_x = od.field_H;
                }
                jn.field_C = false;
                stackIn_97_0 = 3;
                return stackIn_97_0;
              }
              var6_intLifetime2 = cb.field_c;
              cb.field_c = fh.field_b;
              fh.field_b = var6_intLifetime2;
              jn.field_C = true;
            }
            stackIn_100_0 = -1;
            return stackIn_100_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6;
            stackIn_103_1 = new StringBuilder().append("ee.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
            if (param5 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
          return -92L;
        }
        return this.field_i.length();
    }

    ee(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_i = new RandomAccessFile(param0, param1);
          this.field_f = 0L;
          this.field_c = param2;
          var5_int = this.field_i.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_i.seek(0L);
            this.field_i.write(var5_int);
          }
          this.field_i.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new nd(15, 0, 1, 0);
        field_h = new nd(8, 0, 4, 1);
        field_b = new fk();
        field_e = 0;
    }
}
