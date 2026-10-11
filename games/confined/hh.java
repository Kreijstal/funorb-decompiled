/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static df field_c;
    static jb field_d;
    static String field_a;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -13613) {
          field_d = (jb) null;
        }
        return rk.field_f;
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = param0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (bg.a(175, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (bg.a(param0 + 175, param1.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (vb.a((byte) -37, (char) var7)) {
              var8 = i.a((char) var7, (byte) -98);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("hh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(oc param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var4 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var6 = Confined.field_J ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            jj.field_lb[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; en.field_a > var2_intLifetime1; var2_intLifetime1++) {
            if (~param0.field_a == ~kl.field_R[var2_intLifetime1].field_a) {
              dupTemp$3 = kl.field_R[var2_intLifetime1].a(-79);
              jj.field_lb[dupTemp$3] = jj.field_lb[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(80);
          jj.field_lb[dupTemp$0] = jj.field_lb[dupTemp$0] + 1;
          var3 = -16 / ((4 - param1) / 48);
          var2_intLifetime2 = 0;
          for (var4 = 0; var4 < en.field_a; var4++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_a == kl.field_R[var4].field_a) {
              var5 = kl.field_R[var4].a(-97);
              if (um.field_b < jj.field_lb[var5]) {
                jj.field_lb[var5] = jj.field_lb[var5] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              kl.field_R[incrementValue$2] = kl.field_R[var4];
            }
          }
          en.field_a = var2_intLifetime2;
          fieldTemp$1 = en.field_a;
          en.field_a = en.field_a + 1;
          kl.field_R[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("hh.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 > -77) {
          field_d = (jb) null;
        }
    }

    final static tl[] a(df param0, int param1) {
        int var5 = 0;
        tl[] stackIn_4_0 = null;
        tl[] stackIn_13_0 = null;
        tl[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        tl[] var4 = null;
        tl var6 = null;
        int var7 = 0;
        bc var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (!param0.c(-123)) {
            stackIn_4_0 = new tl[]{};
            return stackIn_4_0;
          }
          if (param1 <= 65) {
            hh.a((byte) -108);
          }
          var8 = param0.a(5);
          while (var8.field_g == 0) {
            jd.a(1, 10L);
          }
          if (var8.field_g == 2) {
            stackIn_13_0 = new tl[]{};
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          var4 = new tl[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new tl();
            var4[var5] = var6;
            var6.field_j = var3[var5 << 2];
            var6.field_c = var3[1 + (var5 << 2)];
            var6.field_h = var3[(var5 << 2) + 2];
            var6.field_k = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("hh.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Orb points: ";
        field_b = "Achievements";
    }
}
