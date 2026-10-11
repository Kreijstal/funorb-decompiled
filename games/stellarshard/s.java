/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s implements Iterator {
    private ah field_d;
    static boolean field_i;
    private ah field_h;
    static int field_b;
    static li field_f;
    static bd field_c;
    static va field_e;
    private bg field_a;
    static String field_g;

    public final boolean hasNext() {
        return this.field_h != this.field_a.field_b;
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          if (param0 == null) {
            stackIn_4_0 = cg.field_b;
            return stackIn_4_0;
          }
          var3_int = param0.length();
          if (param2 != 3) {
            s.a(true);
          }
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = nh.a(param0, false);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!sk.a(var4.charAt(0), -122) &&
                !sk.a(var4.charAt(-1 + var4.length()), -105)) {
                var5 = 0;
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (sk.a((char) var7, -113)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_31_0 = t.field_c;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = jb.field_h;
                return stackIn_36_0;
              }
              stackIn_21_0 = jb.field_h;
              return stackIn_21_0;
            }
            stackIn_16_0 = cg.field_b;
            return stackIn_16_0;
          }
          stackIn_11_0 = cg.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("s.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var6 = stellarshard.field_B;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (od.a(param1, false)) {
            return true;
          }
          var10 = nh.field_e;
          var9 = var10;
          var7 = var9;
          var2 = var7;
          var3 = 0;
          while (var10.length > var3) {
            var4 = var10[var3];
            if (~param1 != ~var4) {
              var3++;
              continue;
            }
            return true;
          }
          var2Lifetime1 = fe.field_g;
          var3Lifetime1 = 9 % ((-57 - param0) / 61);
          var8 = 0;
          var4Lifetime1 = var8;
          while (var8 < var2Lifetime1.length) {
            var5 = var2Lifetime1[var8];
            if (param1 == var5) {
              return true;
            }
            var8++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "s.B(" + param0 + ',' + param1 + ')');
        }
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.c((byte) 36);
        this.field_d = null;
    }

    public final Object next() {
        Object var1 = this.field_h;
        if (this.field_a.field_b != var1) {
          this.field_h = ((ah) (var1)).field_m;
        } else {
          this.field_h = null;
          var1 = null;
        }
        this.field_d = (ah) (var1);
        return var1;
    }

    public static void a(boolean param0) {
        if (param0) {
          s.a(54, 'v');
        }
        field_e = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    s(bg param0) {
        this.field_d = null;
        try {
          this.field_a = param0;
          this.field_d = null;
          this.field_h = this.field_a.field_b.field_m;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new li(13, 0, 1, 0);
        field_g = "Please check if address is correct";
    }
}
