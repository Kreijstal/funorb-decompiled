/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm implements Iterator {
    private int field_e;
    private bh field_c;
    private bh field_j;
    private si field_k;
    static int[] field_a;
    static int[] field_h;
    static int[] field_g;
    static int[] field_b;
    static String field_i;
    static String field_d;
    static ie field_f;

    public final Object next() {
        int fieldTemp$0 = 0;
        bh var1;
        int var2;
        var2 = client.field_A ? 1 : 0;
        if (this.field_c != this.field_k.field_h[this.field_e - 1]) {
          var1 = this.field_c;
          this.field_c = var1.field_b;
          this.field_j = var1;
          return var1;
        }
        do {
          if (this.field_k.field_a <= this.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var1 = this.field_k.field_h[fieldTemp$0].field_b;
        } while (var1 == this.field_k.field_h[-1 + this.field_e]);
        this.field_c = var1.field_b;
        this.field_j = var1;
        return var1;
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sb var4_ref_sb = null;
        ff var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        uf var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var9 = de.field_V;
          if (param0 != 53) {
            cm.a(20);
          }
          var2 = var9.d((byte) -44);
          var3 = var9.d((byte) -117);
          if (var2 == 0) {
            var4_ref_sb = (sb) (ef.field_S.c((byte) -68));
            if (var4_ref_sb == null) {
              si.a(78);
              return;
            }
            var5_int = sm.field_e - var9.field_n;
            var11 = var4_ref_sb.field_q;
            var10 = var11;
            var6 = var10;
            if (var11.length << 2 < var5_int) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -108) << (lb.a(3, var7) << 8));
            }
            var4_ref_sb.field_s = true;
            var4_ref_sb.b((byte) 118);
            return;
          }
          if (var2 == 1) {
            var4 = var9.e((byte) -2);
            var5 = (ff) (cd.field_c.c((byte) -124));
            while (var5 != null) {
              if (var3 != var5.field_q ||
                var4 != var5.field_r) {
                var5 = (ff) (cd.field_c.d(true));
                continue;
              }
              break;
            }
            if (var5 == null) {
              si.a(71);
              return;
            }
            var5.b((byte) 124);
            return;
          }
          qb.a((Throwable) null, 16408, "LR1: " + qk.d((byte) 74));
          si.a(100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "cm.A(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 4 / ((-61 - param0) / 36);
        this.field_e = 1;
        this.field_j = null;
        this.field_c = this.field_k.field_h[0].field_b;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = client.field_A ? 1 : 0;
        if (this.field_c != this.field_k.field_h[-1 + this.field_e]) {
          return true;
        }
        while (true) {
          if (this.field_e >= this.field_k.field_a) {
            return false;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          if (this.field_k.field_h[fieldTemp$0].field_b == this.field_k.field_h[this.field_e - 1]) {
            this.field_c = this.field_k.field_h[this.field_e - 1];
            continue;
          }
          break;
        }
        this.field_c = this.field_k.field_h[-1 + this.field_e].field_b;
        return true;
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        if (param0 != 1714134600) {
          field_a = (int[]) null;
        }
    }

    public final void remove() {
        if (this.field_j == null) {
          throw new IllegalStateException();
        }
        this.field_j.b((byte) 112);
        this.field_j = null;
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = client.field_A ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (fl.a(param1.charAt(var5), (byte) 23)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!be.a((byte) 98, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = cb.a((byte) -72, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (var6_int - (var5 - param2[var8].length()));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          if (param0 <= 80) {
            cm.a((byte) -121);
          }
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (fl.a(param1.charAt(var5Lifetime1), (byte) 23)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!be.a((byte) 98, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = cb.a((byte) 100, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param2[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("cm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    cm(si param0) {
        this.field_j = null;
        try {
          this.field_k = param0;
          this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        int[] var1Lifetime1;
        int var0Lifetime1;
        int var2Lifetime1;
        field_a = b.h(-126);
        field_h = b.h(80);
        field_g = b.h(-125);
        field_b = b.h(86);
        for (var0 = 0; var0 < 15; var0++) {
          var1 = field_a;
          var2 = var0;
          var1[var2 >> 5] = de.b(var1[var2 >> 5], 1 << lb.a(var2, 31));
        }
        for (var0Lifetime1 = 15; 31 > var0Lifetime1; var0Lifetime1++) {
          var1Lifetime1 = field_h;
          var2Lifetime1 = var0Lifetime1;
          var1Lifetime1[var2Lifetime1 >> 5] = de.b(var1Lifetime1[var2Lifetime1 >> 5], 1 << lb.a(31, var2Lifetime1));
        }
        int[] var3 = field_g;
        var3[0] = de.b(var3[0], 8);
        int[] var4 = field_g;
        var4[0] = de.b(var4[0], 128);
        int[] var5 = field_g;
        var5[0] = de.b(var5[0], 4194304);
        int[] var6 = field_b;
        var6[0] = de.b(var6[0], 1);
        int[] var7 = field_b;
        var7[0] = de.b(var7[0], 2048);
        field_i = "Creating your account";
        field_d = "Connection lost. <%0>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$53ce4ab4c593(int param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = client.field_A ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (fl.a(param1.charAt(var5), (byte) 23)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!be.a((byte) 98, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = cb.a((byte) -72, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (var6_int - (var5 - param2[var8].length()));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          if (param0 <= 80) {
            cm.a((byte) -121);
          }
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (fl.a(param1.charAt(var5Lifetime1), (byte) 23)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!be.a((byte) 98, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = cb.a((byte) 100, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param2[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("cm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }
}
