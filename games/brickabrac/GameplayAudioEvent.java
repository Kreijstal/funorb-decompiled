/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GameplayAudioEvent extends IntrusiveNode {
    static jp[] field_l;
    static NodeDeque field_n;
    static volatile boolean field_i;
    static int field_o;
    int detailId;
    static mf field_k;
    int eventCode;

    final static oh a(String param0, int param1) {
        RuntimeException var2 = null;
        oh stackIn_5_0 = null;
        oh stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ka.field_l == jm.field_f) {
            return null;
          }
          if (param1 != 0) {
            stackIn_5_0 = (oh) null;
            return stackIn_5_0;
          }
          if (up.field_v == ka.field_l &&
            param0.equals(om.field_pc)) {
            ka.field_l = ej.field_P;
            stackIn_9_0 = he.field_H;
            return stackIn_9_0;
          }
          he.field_H = null;
          ka.field_l = jm.field_f;
          om.field_pc = param0;
          stackIn_11_0 = null;
          return (oh) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qc.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 0) {
          return;
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = BrickABrac.field_J ? 1 : 0;
          try {
            if (null != vd.field_f) {
              vd.field_f.b((byte) 30);
            }
            if (Brick.field_x != null) {
              Brick.field_x.a((byte) 68);
            }
            if (param0 != 14676) {
              return;
            }
            if (oc.field_k != null) {
              try {
                oc.field_k.a(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != v.field_g) {
              for (var1_int = 0; var1_int < v.field_g.length; var1_int++) {
                if (null != v.field_g[var1_int]) {
                  try {
                    v.field_g[var1_int].a(false);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw qb.a((Throwable) ((Object) var1), "qc.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!m.a(param0 ^ 27146)) {
            if (null != ua.field_d &&
              ua.field_d.field_e) {
              nc.b(109);
              wo.field_b.a(-80, new ek(wo.field_b, ch.field_a));
            }
            return;
          }
          wo.field_b.a(rj.field_b, fh.field_g, param0 - 27268, true);
          if (param0 != 27144) {
            return;
          }
          wo.field_b.i(82);
          while (jl.a((byte) 5)) {
            wo.field_b.a(go.field_b, dc.field_b, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "qc.D(" + param0 + ')');
        }
    }

    GameplayAudioEvent(int eventCode) {
        this(eventCode, -1);
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        if (0L >= param0) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param0 % 37L) {
          return null;
        }
        int var3 = 0;
        if (param1 != 3) {
          GameplayAudioEvent.c(21);
        }
        long var4 = param0;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = af.field_B[(int)(var7 - 37L * param0)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    GameplayAudioEvent(int eventCode, int detailId) {
        this.detailId = detailId;
        this.eventCode = eventCode;
    }

    static {
        field_i = true;
        field_n = new NodeDeque();
    }
}
