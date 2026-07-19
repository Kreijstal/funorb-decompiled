/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rm implements Iterable {
    static int field_e;
    static int[] field_h;
    static String field_c;
    static int field_b;
    static String field_i;
    static java.awt.Image field_a;
    private oh field_j;
    int field_d;
    static String[] field_g;
    oh[] field_f;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0 != -1215) {
            rm.b(57);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new fl((rm) (this)));
    }

    final static void b(int param0) {
        String discarded$0 = null;
        ai.a(true, -1, ae.field_g, aa.field_G);
        if (param0 > -28) {
            byte[] var2 = (byte[]) null;
            discarded$0 = rm.a((byte[]) null, -113);
            jh.field_D = true;
            return;
        }
        jh.field_D = true;
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 17746) {
                break L1;
              } else {
                field_a = (java.awt.Image) null;
                break L1;
              }
            }
            stackOut_2_0 = qi.a(param0, param0.length, 0, param1 + -17864);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("rm.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final oh a(int param0, long param1) {
        oh var4 = null;
        oh var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < -72) {
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param1)];
          this.field_j = var4.field_f;
          L0: while (true) {
            if (this.field_j == var4) {
              this.field_j = null;
              return null;
            } else {
              if ((this.field_j.field_b ^ -1L) != (param1 ^ -1L)) {
                this.field_j = this.field_j.field_f;
                continue L0;
              } else {
                var5 = this.field_j;
                this.field_j = this.field_j.field_f;
                return var5;
              }
            }
          }
        } else {
          this.a((oh) null, true, 61L);
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param1)];
          this.field_j = var4.field_f;
          L1: while (true) {
            if (this.field_j == var4) {
              this.field_j = null;
              return null;
            } else {
              if ((this.field_j.field_b ^ -1L) != (param1 ^ -1L)) {
                this.field_j = this.field_j.field_f;
                continue L1;
              } else {
                var5 = this.field_j;
                this.field_j = this.field_j.field_f;
                return var5;
              }
            }
          }
        }
    }

    final void a(oh param0, boolean param1, long param2) {
        oh var5 = null;
        try {
            if (!(param0.field_e == null)) {
                param0.b((byte) -58);
            }
            if (!param1) {
                this.field_f = (oh[]) null;
            }
            var5 = this.field_f[(int)((long)(-1 + this.field_d) & param2)];
            param0.field_f = var5;
            param0.field_e = var5.field_e;
            param0.field_e.field_f = param0;
            param0.field_f.field_e = param0;
            param0.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "rm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    rm(int param0) {
        int var2 = 0;
        oh dupTemp$0 = null;
        oh var3 = null;
        this.field_d = param0;
        this.field_f = new oh[param0];
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new oh();
            var3 = dupTemp$0;
            this.field_f[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_e = var3;
        }
    }

    final static bc a(int param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        if (!param3) {
            field_c = (String) null;
            return cc.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
        }
        return cc.a(!param2 ? 0 : 1, false, param0, 12000, param1, param4);
    }

    static {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = new int[]{2, 21, 22, 7, 6, 10};
        field_i = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = -1;
    }
}
