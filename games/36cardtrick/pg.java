/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    private SecondaryNodeDeque field_g;
    private int field_d;
    static Random field_a;
    private IterableNodeHashTable field_c;
    private int field_e;
    static String field_f;
    static String field_b;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        ad var4 = null;
        uh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Main.field_T;
        try {
          if (!param0) {
            pg.a(false, 127);
          }
          var4 = (ad) (od.field_b.beginForward((byte) 74));
          while (var4 != null) {
            aa.a(var4, 3298, param1);
            var4 = (ad) (od.field_b.nextForward((byte) -103));
          }
          var5 = (uh) (SocketConnector.field_a.beginForward((byte) 74));
          while (var5 != null) {
            DirectByteArrayStore.a(-64, var5, param1);
            var5 = (uh) (SocketConnector.field_a.nextForward((byte) -113));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "pg.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, Object param1, long param2) {
        try {
          this.a(param2, 1, 10, param1);
          if (param0 <= 118) {
            field_a = (Random) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_f = null;
        if (param0 != -85) {
          pg.clearStaticReferences((byte) -89);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    private final void a(long param0, int param1, int param2, Object param3) {
        pd var8 = null;
        tf var6 = null;
        int var7 = Main.field_T;
        if (param2 != 10) {
          return;
        }
        try {
          if (param1 > this.field_d) {
            throw new IllegalStateException();
          }
          this.a(param0, (byte) 124);
          this.field_e = this.field_e - param1;
          while (this.field_e < 0) {
            var8 = (pd) (this.field_g.removeFirst(false));
            this.a((byte) 107, var8);
          }
          var6 = new tf(param3, param1);
          this.field_c.put(-102, param0, var6);
          this.field_g.addLast(param2 - 112, var6);
          ((pd) ((Object) var6)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pg.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, pd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.unlink(109);
            param1.unlinkSecondary(param0 ^ 103);
            this.field_e = this.field_e + param1.field_k;
          }
          if (param0 == 107) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = MouseWheelInput.isValidRadixInteger(10, 117, param1, true);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final Object a(long param0, int param1) {
        pd var7 = (pd) (this.field_c.get((byte) 120, param0));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.e(param1);
        if (var5 == null) {
          var7.unlink(100);
          var7.unlinkSecondary(12);
          this.field_e = this.field_e + var7.field_k;
          return null;
        }
        if (!var7.f(param1 ^ 0)) {
          this.field_g.addLast(-91, var7);
          var7.field_j = 0L;
          return var5;
        }
        tf var6 = new tf(var5, var7.field_k);
        this.field_c.put(-96, var7.key, var6);
        this.field_g.addLast(-82, var6);
        ((pd) ((Object) var6)).field_j = 0L;
        var7.unlink(105);
        var7.unlinkSecondary(12);
        return var5;
    }

    private pg() throws Throwable {
        throw new Error();
    }

    private final void a(long param0, byte param1) {
        if (param1 != 124) {
          return;
        }
        pd var4 = (pd) (this.field_c.get((byte) 83, param0));
        this.a((byte) 107, var4);
    }

    static {
        field_a = new Random();
        field_f = "Quit to website";
        field_b = "Fullscreen";
    }
}
