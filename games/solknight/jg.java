/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int field_b;
    static int field_e;
    volatile boolean field_a;
    java.awt.Frame field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_a = true;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        qc var4 = null;
        sd var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          var4 = (qc) (sb.field_c.a((byte) 51));
          while (var4 != null) {
            ah.a(false, param0, var4);
            var4 = (qc) (sb.field_c.b(-121));
          }
          if (param1 >= -25) {
            field_e = -52;
          }
          var5 = (sd) (r.field_b.a((byte) 51));
          while (var5 != null) {
            fi.a(var5, param0, -24045);
            var5 = (sd) (r.field_b.b(-119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "jg.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, dl param1) {
        if (param0 != -3680) {
          return;
        }
        try {
          de.a(param1, this.field_c, (byte) 126);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rl param0, int param1, boolean param2) {
        try {
          int var3_int = -44 / ((param1 - 35) / 40);
          uf.a(param2, 123, 256, param0);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (ck.a(param0.charAt(var2_int), true)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ck.a(param0.charAt(var3 - 1), true)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (~var4 > param1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (c.a(param1 + 2, (char) var7)) {
              var8 = we.a(2, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (0 != var5.length()) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("jg.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        fb.a(param0 + 174);
        if (param0 != 81) {
          field_d = false;
        }
    }

    jg() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_b = 0;
        field_e = -1;
        field_d = false;
    }
}
