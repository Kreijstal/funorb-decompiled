/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl implements Iterable {
    static le field_d;
    o[] field_e;
    private o field_c;
    static String field_b;
    static volatile int field_g;
    static String field_a;
    int field_f;

    final o a(long param0, byte param1) {
        o var4;
        int var5_int;
        o var5;
        int var6;
        var6 = Chess.field_G;
        var4 = this.field_e[(int)((long)(this.field_f - 1) & param0)];
        this.field_c = var4.field_h;
        while (true) {
          if (var4 == this.field_c) {
            var5_int = 80 / ((3 - param1) / 34);
            this.field_c = null;
            return null;
          }
          if (~this.field_c.field_e != ~param0) {
            this.field_c = this.field_c.field_h;
            continue;
          }
          break;
        }
        var5 = this.field_c;
        this.field_c = this.field_c.field_h;
        return var5;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_b = (String) null;
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ik(this));
    }

    final static wn a(int param0, int param1, String param2) {
        mn var3 = null;
        RuntimeException var3_ref = null;
        mn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new mn();
          if (param0 != 0) {
            bl.a(-105);
          }
          ((wn) ((Object) var3)).field_c = param1;
          ((wn) ((Object) var3)).field_a = param2;
          stackIn_3_0 = var3;
          return (wn) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("bl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    bl(int param0) {
        int var2 = 0;
        o dupTemp$0 = null;
        o var3 = null;
        this.field_e = new o[param0];
        this.field_f = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new o();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_c = var3;
          var3.field_h = var3;
        }
    }

    final static void a(String[] args, int param1, byte param2, int param3, int[] param4, um param5, byte[] param6, km[][] param7, int[] param8, boolean param9, rk[] param10, int param11, String[][] param12, km[][] param13, String[][] param14, String[] param15, um param16, String[] param17, um param18, byte[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          bb.a(param16, param10, param18, (byte) -105, param4);
          ja.a(param16, 1);
          wm.a(args, param11, 0, param6, param17, param16, param3, param14, param15, param19, param12, param1, param7, param8, param13);
          ij.a(param5, param9, param16, (byte) 91);
          if (param2 != 31) {
            return;
          }
          vn.l(param2 - 25);
          tj.b((byte) -108);
          th.c(106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("bl.C(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param13 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param14 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param15 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param16 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final void a(o param0, long param1, int param2) {
        o var5 = null;
        try {
          if (null != param0.field_c) {
            param0.c(-2193);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_f - 1))];
          param0.field_c = var5.field_c;
          param0.field_h = var5;
          param0.field_c.field_h = param0;
          param0.field_h.field_c = param0;
          if (param2 != 31313) {
            bl.a(-20);
          }
          param0.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "bl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Visit the Account Management section on the main site to view.";
        field_b = "<%0> has left the lobby.";
        field_g = 0;
    }
}
