/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends an {
    static String field_E;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static int[] field_G;

    fm(String param0, sk param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_x = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private fm(String param0, sk param1) {
        this(param0, se.field_j.field_a, param1);
        try {
          this.field_h = se.field_j.field_g;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private fm(String param0, io param1, sk param2) {
        super(param0, param1, param2);
        try {
          this.field_h = se.field_j.field_g;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        am var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        bo var11 = null;
        b var12 = null;
        am var13 = null;
        b var14 = null;
        var8 = ZombieDawn.field_J;
        try {
          var13 = fj.field_g;
          var2 = var13.d((byte) -116);
          if (!param0) {
            field_G = (int[]) null;
          }
          if (var2 == 0) {
            var10 = ae.a(14821);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((de) ((Object) var5)).d((byte) -124);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((de) ((Object) var5)).c(-90);
            }
            var12 = (b) (qi.field_J.b((byte) 26));
            if (var12 == null) {
              p.a(1);
              return;
            }
            var12.field_o = true;
            var12.field_k = var3;
            var12.b(-27598);
            return;
          }
          if (var2 != 1) {
            if (2 != var2) {
              ae.a((Throwable) null, 10331, "A1: " + cb.f(3));
              p.a(1);
            } else {
              var14 = (b) (qi.field_J.b((byte) 26));
              if (var14 == null) {
                p.a(1);
                return;
              }
              var14.field_k = ae.a(14821);
              var14.field_o = true;
              var14.b(-27598);
            }
          } else {
            var11 = (bo) (mp.field_g.b((byte) 26));
            if (var11 == null) {
              p.a(1);
              return;
            }
            var11.b(-27598);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "fm.F(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_x = !this.field_x ? true : false;
        int var5 = -35 / ((-12 - param1) / 56);
        super.b(param0, -73, param2, param3);
    }

    public static void a(int param0) {
        field_H = null;
        field_G = null;
        field_I = null;
        field_E = null;
        if (param0 != 12959) {
          field_G = (int[]) null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (vi.a(31153, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (vi.a(31153, param0.charAt(-1 + var3))) {
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
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param1 >= -34) {
            fm.b(true);
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (bh.a((char) var7, false)) {
              var8 = qj.a(-122, (char) var7);
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
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("fm.G(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = "Unfortunately you are not eligible to create an account.";
        field_I = "The living have defeated your shambling advance.";
        field_F = true;
        field_H = "Level Selection";
        field_G = new int[8192];
    }
}
