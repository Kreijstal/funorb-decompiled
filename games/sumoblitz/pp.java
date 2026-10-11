/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp implements Runnable {
    volatile du[] field_c;
    volatile boolean field_b;
    static String field_f;
    static String[] field_e;
    wi field_g;
    volatile boolean field_a;
    static gm field_d;
    static int field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param3 + param1;
          var6 = param0 + param4;
          if (lk.field_k < param3) {
            stackIn_4_0 = param3;
          } else {
            stackIn_4_0 = lk.field_k;
          }
          var7 = stackIn_4_0;
          if (lk.field_i >= param0) {
            stackIn_7_0 = lk.field_i;
          } else {
            stackIn_7_0 = param0;
          }
          var8 = stackIn_7_0;
          if (var5_int >= lk.field_j) {
            stackIn_10_0 = lk.field_j;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (lk.field_e <= var6) {
            stackIn_13_0 = lk.field_e;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (lk.field_k <= param3 &&
            lk.field_j > param3) {
            var11 = param3 + var8 * lk.field_b;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              lk.field_a[var11] = 16777215;
              var11 = var11 + lk.field_b * 2;
            }
          }
          if (param2 != -13181) {
            pp.a(5, 111, 100, -88, -57);
          }
          if (lk.field_i <= param0 &&
            var6 < lk.field_e) {
            var11Lifetime1 = param0 * lk.field_b + var7;
            var12Lifetime1 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              lk.field_a[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (lk.field_k <= var5_int &&
            var5_int < lk.field_j) {
            var11Lifetime2 = var5_int + lk.field_b * ((1 & var5_int - param3) + var8);
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              lk.field_a[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * lk.field_b;
            }
          }
          if (lk.field_i <= param0 &&
            lk.field_e > var6) {
            var11Lifetime3 = (1 & -param0 + var6) + (var7 + lk.field_b * var6);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              lk.field_a[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var5), "pp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
          pp.a(-25);
          field_f = null;
          field_e = null;
          return;
        }
        field_f = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        du var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_b = true;
        try {
          try {
            while (!this.field_a) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_c[var1_int];
                if (var2 != null) {
                  var2.b();
                }
              }
              tg.a(10L, (byte) 107);
              rd.a((Object) null, this.field_g, -11030);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            ms.a((String) null, (Throwable) ((Object) var1), 0);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw pp.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_b = false;
    }

    pp() {
        this.field_c = new du[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        field_f = "Members";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
