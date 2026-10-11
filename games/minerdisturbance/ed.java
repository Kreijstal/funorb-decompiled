/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ed {
    boolean field_i;
    static String[][] field_b;
    static int[][] field_a;
    String[] field_d;
    static ea[] field_g;
    static String field_f;
    boolean field_c;
    int field_e;
    String field_h;

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (mn.field_x == -kc.field_d + 0) {
          var1 = 122 % ((43 - param0) / 55);
          mn.field_x = mn.field_x + 1;
          return;
        }
        if (250 - kc.field_d != mn.field_x) {
          var1Lifetime1 = 122 % ((43 - param0) / 55);
          mn.field_x = mn.field_x + 1;
          return;
        }
        var1Lifetime2 = 122 % ((43 - param0) / 55);
        mn.field_x = mn.field_x + 1;
    }

    final static void a(byte param0, boolean param1) {
        ie.a(param1, false, 81);
        if (param0 > -100) {
          ed.a(false);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        sl var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          var3 = (sl) (vb.field_c.b(88));
          while (var3 != null) {
            qd.a(4, (byte) -90, var3);
            var3 = (sl) (vb.field_c.b((byte) 56));
          }
          if (param0 == 4) {
            return;
          }
          field_b = (String[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ed.E(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 == -20613) {
          field_b = (String[][]) null;
          field_a = (int[][]) null;
          field_g = null;
          return;
        }
        ed.a(false, (byte) -8);
        field_b = (String[][]) null;
        field_a = (int[][]) null;
        field_g = null;
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sj.field_h != null) {
            sj.field_h.s(2121792);
          }
          di.field_D = new cl(param1, param0, false, true, true);
          de.field_a.a((byte) -126, (fe) (di.field_D));
          if (param2 == -1) {
            return;
          }
          field_g = (ea[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ed.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          long dupTemp$1 = 0L;
          int var2 = 0;
          IOException var3 = null;
          ld var4 = null;
          int stackIn_9_0 = 0;
          Throwable decompiledCaughtException = null;
          if (dk.field_b == null) {
            dk.field_b = mm.field_b.a(wf.field_U, jc.field_E, (byte) 73);
          }
          var2 = -97 % ((-24 - param1) / 56);
          if (dk.field_b.field_c == 0) {
            return false;
          }
          dupTemp$1 = sf.a((byte) -121);
          ck.field_d = dupTemp$1;
          sk.field_c = dupTemp$1;
          if (dk.field_b.field_c != 1) {
            qd.field_Q = dk.field_c;
          } else {
            try {
              ci.field_i = new ll((java.net.Socket) (dk.field_b.field_a), mm.field_b);
              var4 = kj.field_a;
              sn.field_c.field_o = 0;
              var4.field_o = 0;
              stackIn_9_0 = (!param0) ? -1 : -2;
              lc.field_s = stackIn_9_0;
              rd.field_a = stackIn_9_0;
              ud.field_a = stackIn_9_0;
              qd.field_Q = cm.field_p;
              le.a(cm.field_q, sn.field_c, sj.field_c, ii.field_a, -80);
              bk.a((byte) 124, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              qd.field_Q = dk.field_c;
              dk.field_b = null;
              return true;
            }
          }
          dk.field_b = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ed(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    final static void a(boolean param0) {
        if (!qc.field_b) {
          throw new IllegalStateException();
        }
        jb.field_q = param0;
        ed.a((byte) -122, true);
        fh.field_b = 0;
    }

    static {
        field_b = new String[][]{new String[]{"That monster there is your lesser, or common, Myth. Of course they don't exist, but that doesn't stop them eating you. You can avoid Myths, but they can dig through rock to get at you. Dynamite can kill them and cave-ins can crush them."}};
        field_f = "Close";
    }
}
