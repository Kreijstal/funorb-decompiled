/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk implements Iterable {
    static String field_b;
    static String field_f;
    private pg field_e;
    int field_d;
    pg[] field_c;
    static ll[] field_a;
    static String field_g;

    final static qb[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        qb[] var1 = new qb[h.field_J];
        if (param0 >= -106) {
          field_f = (String) null;
        }
        for (var2 = 0; var2 < h.field_J; var2++) {
          var3 = jg.field_p[var2] * ho.field_i[var2];
          var4 = ln.field_I[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = ph.field_c[dg.a((int) var4[var6], 255)];
          }
          var1[var2] = new qb(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], var5);
        }
        dk.a(-18229);
        return var1;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new jf(this));
    }

    final void a(byte param0, pg param1, long param2) {
        pg var5 = null;
        try {
          if (param1.field_a != null) {
            param1.a(true);
          }
          if (param0 > -17) {
            pk.a(75);
          }
          var5 = this.field_c[(int)(param2 & (long)(-1 + this.field_d))];
          param1.field_a = var5.field_a;
          param1.field_b = var5;
          param1.field_a.field_b = param1;
          param1.field_b.field_a = param1;
          param1.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 != -14987) {
          field_a = (ll[]) null;
        }
        field_b = null;
    }

    final pg a(byte param0, long param1) {
        pg var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = -25 / ((param0 - 51) / 52);
        pg var4 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
        this.field_e = var4.field_b;
        while (this.field_e != var4) {
          if (~param1 == ~this.field_e.field_e) {
            var6 = this.field_e;
            this.field_e = this.field_e.field_b;
            return var6;
          }
          this.field_e = this.field_e.field_b;
        }
        this.field_e = null;
        return null;
    }

    pk(int param0) {
        int var2 = 0;
        pg dupTemp$0 = null;
        pg var3 = null;
        this.field_c = new pg[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new pg();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.field_a = var3;
          var3.field_b = var3;
        }
    }

    final static ll[] a(String param0, int param1, String param2, eg param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.c(param0, -91);
          if (param1 != 0) {
            field_b = (String) null;
          }
          var5 = param3.a(param2, (byte) 96, var4_int);
          stackIn_3_0 = ko.a(var4_int, (byte) 126, var5, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pk.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_f = "From <%0>: ";
        field_b = "Makes you and your minions extra bouncy and able to freeze the sea";
        field_g = "Underdark spells focus on stealing health and turning minions into zombies.";
    }
}
