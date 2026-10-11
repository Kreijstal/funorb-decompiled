/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj {
    float field_a;
    static Calendar field_k;
    String field_g;
    private int field_e;
    private vc[] field_d;
    private int field_c;
    private int field_h;
    static rd field_i;
    static java.math.BigInteger field_l;
    static bd field_f;
    static int[] field_b;
    static long field_j;

    private final void a(int param0, vc param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 72 % ((6 - param2) / 39);
          var5 = (float)(1 + this.field_h) + (float)param0 / 100.0f;
          this.field_a = var5 * (float)this.field_e / (float)(this.field_c + 1);
          if (param0 != 0) {
            this.field_g = param1.field_c + " - " + param0 + "%";
            return;
          }
          this.field_g = param1.field_d;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        int var3;
        vc var4;
        var3 = stellarshard.field_B;
        while (this.field_c > this.field_h) {
          var4 = this.field_d[this.field_h];
          if (!var4.field_e.a((byte) -36)) {
            this.a(0, var4, (byte) -68);
            return false;
          }
          if (0 <= var4.field_i &&
            !var4.field_e.a(var4.field_i, (byte) 123)) {
            this.a(var4.field_e.a(var4.field_i, 0), var4, (byte) -106);
            return false;
          }
          if (var4.field_j != null &&
            !var4.field_e.a(var4.field_j, (byte) -109)) {
            this.a(var4.field_e.b(0, var4.field_j), var4, (byte) 60);
            return false;
          }
          if (var4.field_i < 0 &&
            var4.field_j == null &&
            null != var4.field_c &&
            !var4.field_e.c((byte) -111)) {
            this.a(var4.field_e.b((byte) 1), var4, (byte) 68);
            return false;
          }
          this.field_h = this.field_h + 1;
        }
        if (param0) {
          return true;
        }
        this.a(false);
        return true;
    }

    public static void a(byte param0) {
        field_b = null;
        field_l = null;
        field_i = null;
        field_f = null;
        if (param0 > 47) {
          field_k = null;
          return;
        }
        fj.a((byte) -58);
        field_k = null;
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        field_k = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = new rd();
        field_l = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
