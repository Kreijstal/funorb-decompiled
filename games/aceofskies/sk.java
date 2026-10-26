/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sk {
    static String field_d;
    bf field_b;
    static Hashtable field_e;
    static boolean field_c;
    static int field_a;

    abstract void a(boolean param0);

    abstract void a(boolean param0, boolean param1);

    void d(int param0) {
        if (param0 != 18580) {
          this.c(-55);
        }
    }

    void b(int param0) {
        if (param0 > -117) {
          field_e = (Hashtable) null;
        }
    }

    abstract boolean e(int param0);

    abstract void a(int param0, int param1, jj param2);

    public static void a(byte param0) {
        field_e = null;
        int var1 = -89 % ((0 - param0) / 52);
        field_d = null;
    }

    void c(int param0) {
        if (param0 != 404277666) {
          field_e = (Hashtable) null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0, byte param1);

    final static rm[] a(rk param0, int param1) {
        String stackIn_22_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param0.a((byte) 84)) {
            rm[] stackIn_3_0 = new rm[]{};
            return stackIn_3_0;
          }
          en var8 = param0.a(param1 ^ 1175069693);
          while (var8.field_a == 0) {
            IntrusiveNode.a(10L, false);
          }
          if (param1 != 1175069442) {
            rm[] stackIn_9_0 = (rm[]) null;
            return stackIn_9_0;
          }
          if (var8.field_a == 2) {
            rm[] stackIn_13_0 = new rm[]{};
            return stackIn_13_0;
          }
          int[] var10 = (int[]) (var8.field_f);
          int[] var9 = var10;
          int[] var3 = var9;
          rm[] var4 = new rm[var10.length >> 2];
          for (int var5 = 0; var5 < var4.length; var5++) {
            rm var6 = new rm();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 2];
            var6.field_b = var3[1 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 2];
            var6.field_a = var3[3 + (var5 << 2)];
          }
          rm[] stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var2;
          StringBuilder stackIn_21_1 = new StringBuilder().append("sk.M(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0) {
        if (param0 != 10) {
          field_a = -26;
        }
    }

    void b(byte param0) {
        if (param0 != -25) {
          jj var3 = (jj) null;
          this.a(98, 67, (jj) null);
        }
    }

    sk(bf param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Achieved";
        field_e = new Hashtable();
        field_c = false;
    }
}
