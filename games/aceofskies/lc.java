/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class lc implements Iterable {
    static hd field_g;
    private int field_d;
    int field_c;
    private IntrusiveNode field_e;
    private IntrusiveNode field_f;
    IntrusiveNode[] field_a;
    static ej field_b;

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var5 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        IntrusiveNode var4 = this.field_a[(int)((long)(this.field_c - 1) & param0)];
        this.field_f = var4.next;
        while (this.field_f != var4) {
          if (this.field_f.key == param0) {
            var5 = this.field_f;
            this.field_f = this.field_f.next;
            return var5;
          }
          this.field_f = this.field_f.next;
        }
        this.field_f = null;
        if (param1 > 87) {
          return null;
        }
        this.field_c = -4;
        return null;
    }

    final static double a(Vector2 param0, boolean param1, Vector2 param2) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = 0.9309241594003604;
            return stackIn_2_0;
          }
          var3_double = -param0.x + param2.x;
          var5 = -param0.y + param2.y;
          stackIn_4_0 = var3_double * var3_double + var5 * var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          lc.a(false);
        }
        field_b = null;
    }

    final static gu a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        gu[] var3 = null;
        gu var5 = null;
        int var6 = 0;
        gu stackIn_3_0 = null;
        gu stackIn_6_0 = null;
        gu stackIn_12_0 = null;
        gu stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2 = bg.a(param1, "jagex-last-login-method", (byte) -18);
          if (var2 == null) {
            stackIn_3_0 = NetworkGameClient.field_t;
            return stackIn_3_0;
          }
          var3 = ci.d((byte) 106);
          if (param0 != 17123) {
            stackIn_6_0 = (gu) null;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(param0 ^ 17127, var2)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = NetworkGameClient.field_t;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("lc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        this.field_d = param0;
        return this.a(-71);
    }

    final static ResourceArchive a(boolean param0, boolean param1, boolean param2, byte param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          fg var8 = null;
          ResourceArchive stackIn_4_0 = null;
          ResourceArchive stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (cs.field_d.field_n != null) {
              eq.field_e = new gh(cs.field_d.field_n, 5200, 0);
              cs.field_d.field_n = null;
              var6 = new bl(255, eq.field_e, new gh(cs.field_d.field_a, 12000, 0), 2097152);
            }
            if (param3 != -65) {
              stackIn_4_0 = (ResourceArchive) null;
              return stackIn_4_0;
            }
            if (eq.field_e != null) {
              if (wb.field_i == null) {
                wb.field_i = new gh[cs.field_d.field_r.length];
              }
              if (wb.field_i[param5] == null) {
                wb.field_i[param5] = new gh(cs.field_d.field_r[param5], 12000, 0);
                cs.field_d.field_r[param5] = null;
              }
              var7 = new bl(param5, eq.field_e, wb.field_i[param5], 2097152);
            }
            var8 = om.field_c.a((byte) -122, (bl) (var6), (bl) (var7), param2, param5);
            if (param1) {
              var8.c(param3 + 63);
            }
            stackIn_15_0 = new ResourceArchive(var8, param0, param4);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new pe(this));
    }

    final IntrusiveNode a(int param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2_ref_wf;
        int var2;
        IntrusiveNode var3;
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_d > 0 &&
          this.field_e != this.field_a[this.field_d - 1]) {
          var2_ref_wf = this.field_e;
          this.field_e = var2_ref_wf.next;
          return var2_ref_wf;
        }
        var2 = 35 / ((param0 - 55) / 60);
        do {
          if (this.field_d >= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var3 = this.field_a[fieldTemp$0].next;
        } while (var3 == this.field_a[-1 + this.field_d]);
        this.field_e = var3.next;
        return var3;
    }

    final void a(int param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(-125);
          }
          var5 = this.field_a[(int)(param2 & (long)(param0 + this.field_c))];
          param1.next = var5;
          param1.previous = var5.previous;
          param1.previous.next = param1;
          param1.next.previous = param1;
          param1.key = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "lc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    lc(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_d = 0;
        this.field_a = new IntrusiveNode[param0];
        this.field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_g = new hd(4);
        field_b = new ej(14, 0, 4, 1);
    }
}
