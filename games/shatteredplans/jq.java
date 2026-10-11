/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jq implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static bi field_b;
    static bi field_c;
    static pf field_a;
    static String field_d;
    static bi field_e;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (im.field_c != null) {
            of.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              ms.field_e.length > var2_int) {
              var2_int = ms.field_e[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= qn.field_c &&
              var2_int >= 0) {
              m.field_x[qn.field_c] = ~var2_int;
              qn.field_c = 1 + qn.field_c & 127;
              if (qn.field_c == hb.field_e) {
                qn.field_c = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("jq.keyReleased(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        try {
          if (null != im.field_c) {
            of.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < ms.field_e.length) {
              var2_int = ms.field_e[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (0 <= qn.field_c &&
              0 <= var2_int) {
              m.field_x[qn.field_c] = var2_int;
              qn.field_c = 1 + qn.field_c & 127;
              if (hb.field_e == qn.field_c) {
                qn.field_c = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = cg.field_I + 1 & 127;
              if (var3 != tc.field_B) {
                ng.field_a[cg.field_I] = var2_int;
                fb.field_yb[cg.field_I] = (char)0;
                cg.field_I = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0) {
              param0.consume();
              return;
            }
            if (85 == var2_int) {
              param0.consume();
              return;
            }
            if (10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_24_0 = runtimeException;
          stackIn_24_1 = new StringBuilder().append("jq.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != im.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              pg.a(28654, (char) var2_int)) {
              var3 = 1 + cg.field_I & 127;
              if (var3 != tc.field_B) {
                ng.field_a[cg.field_I] = -1;
                fb.field_yb[cg.field_I] = (char)var2_int;
                cg.field_I = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jq.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 <= -101) {
          field_d = null;
          field_a = null;
          return;
        }
        jq.a(115, 98, 0, 80, -77, 117, false, 103);
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 < -125) {
          ch.a(20, param1, param0, param2, param4, param3, 0, param6);
          return;
        }
        jq.a(-32, 98, 121, 31, -39, (byte) -98, 83);
        ch.a(20, param1, param0, param2, param4, param3, 0, param6);
    }

    final static void a(int param0, Throwable param1, String param2) {
        try {
          qb stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          pb var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = es.a(param1, (byte) -110);
            }
            if (param2 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            aj.a(var3, false);
            var7 = nf.a(":", var3, (byte) 103, "%3a");
            var8 = nf.a("@", var7, (byte) 121, "%40");
            var9 = nf.a("&", var8, (byte) 80, "%26");
            var10 = nf.a("#", var9, (byte) 112, "%23");
            if (null == ei.field_c) {
              return;
            }
            stackIn_13_0 = jl.field_S;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = ei.field_c.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(td.field_G).append("&u=");
            if (null == bj.field_E) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + co.field_o;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = bj.field_E;
            }
            var4 = ((qb) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(qb.field_r).append("&v2=").append(qb.field_i).append("&e=").append(var10).toString()), false);
            while (0 == var4.field_d) {
              jb.a((byte) -106, 1L);
            }
            if (var4.field_d == 1) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
            }
            if (param0 != -29901) {
              jq.a(-48, 12, 85, -13, -5, -119, true, 2);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (im.field_c == null) {
            return;
          }
          qn.field_c = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jq.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var9 = 7; param2 > var9; var9 += 16) {
            stackIn_6_0 = (!param6) ? 6 : 4;
            var8_int = stackIn_6_0;
            if (1 + (var9 + var8_int) >= param2) {
              var8_int = param2 - var9 - 1;
            }
            stackIn_12_0 = (param6) ? 1 : 0;
            gf.f(stackIn_12_0 + param4 + var9, param5 + 1, var8_int, param7, param0 * (param2 - var9 * var9 / param2) / param2);
          }
          if (param1 < 74) {
            field_c = (bi) null;
          }
          for (var9Lifetime1 = 4; var9Lifetime1 < param2; var9Lifetime1 += 16) {
            gf.g(param4 + var9Lifetime1, param5 + 6, param4 + var9Lifetime1 + 3, param5 + 1, param7, param0 * (param2 - var9Lifetime1 * var9Lifetime1 / param2) / param2);
            gf.g(3 + param4 + var9Lifetime1, 11 + param5, var9Lifetime1 + param4, 6 + param5, param7, (param3 + param0) * (-(var9Lifetime1 * var9Lifetime1 / param2) + param2) / 2 / param2);
          }
          for (var9Lifetime2 = 12; param2 > var9Lifetime2; var9Lifetime2 += 16) {
            gf.g(3 + (param4 + var9Lifetime2), 6 + param5, param4 + var9Lifetime2, 1 + param5, param7, param0 * (-(var9Lifetime2 * var9Lifetime2 / param2) + param2) / param2);
            gf.g(param4 + var9Lifetime2, param5 + 11, param4 + var9Lifetime2 + 3, param5 + 6, param7, (param0 + param3) * (-(var9Lifetime2 * var9Lifetime2 / param2) + param2) / 2 / param2);
          }
          gf.h(1 + param4, param5 + 6, param4 + 3, param5 + 6, param7, (param0 + param3) / 2);
          for (var9Lifetime3 = 16; var9Lifetime3 < param2; var9Lifetime3 += 16) {
            var8_intLifetime1 = 4;
            if (param2 <= 1 + var8_intLifetime1 + var9Lifetime3) {
              var8_intLifetime1 = -1 + (param2 - var9Lifetime3);
            }
            gf.f(var9Lifetime3 + param4, 6 + param5, var8_intLifetime1, param7, (param0 + param3) * (param2 - var9Lifetime3 * var9Lifetime3 / param2) / 2 / param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var8), "jq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, qb param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9, int param10, int param11, String param12, long param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            sa.field_a = new sl(param4);
            js.field_f = new sl(param2);
            ka.field_a = param6;
            ee.field_o = param7;
            of.field_f = param3;
            nr.field_l = param1;
            if (param0 != 0) {
              jq.a((byte) 38);
            }
            be.field_l = param13;
            bb.field_c = param5;
            mk.field_c = param12;
            db.field_b = param8;
            uk.field_a = param9;
            e.field_b = param10;
            sp.field_g = param11;
            if (nr.field_l.field_a == null) {
              return;
            }
            try {
              vc.field_a = new ej(nr.field_l.field_a, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("jq.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            if (param12 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = null;
        field_a = new pf();
    }
}
