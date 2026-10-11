/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends rg {
    static int field_y;
    char[] field_w;
    static String field_z;
    static eg field_E;
    int[] field_D;
    char[] field_A;
    boolean field_C;
    static String field_x;
    static wc field_B;
    int[] field_F;
    String field_G;

    public static void e(int param0) {
        field_E = null;
        field_z = null;
        field_x = null;
        if (param0 > -73) {
          field_E = (eg) null;
        }
        field_B = null;
    }

    private final void a(int param0, ge param1, int param2) {
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param1.g(-90);
              this.field_w = new char[var4_int];
              this.field_F = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_F[var5] = param1.d(-1034);
                var6 = param1.e((byte) 105);
                stackIn_17_0 = this.field_w;
                stackIn_17_1 = var5;
                if (var6 != 0) {
                  stackIn_18_2 = s.a((byte) var6, 8);
                } else {
                  stackIn_18_2 = 0;
                }
                stackIn_17_0[stackIn_17_1] = (char) stackIn_18_2;
              }
            } else {
              if (param2 == 3) {
                var4_int = param1.g(-106);
                this.field_A = new char[var4_int];
                this.field_D = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  this.field_D[var5] = param1.d(-1034);
                  var6 = param1.e((byte) 105);
                  stackIn_11_0 = this.field_A;
                  stackIn_11_1 = var5;
                  if (var6 != 0) {
                    stackIn_12_2 = s.a((byte) var6, 8);
                  } else {
                    stackIn_12_2 = 0;
                  }
                  stackIn_11_0[stackIn_11_1] = (char) stackIn_12_2;
                }
              } else {
                if (param2 == 4) {
                  this.field_C = true;
                }
              }
            }
          } else {
            this.field_G = param1.j(-119);
          }
          if (param0 >= -109) {
            field_x = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("sf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void f(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = Pool.field_O;
        int var2Lifetime1;
        if (this.field_D != null) {
          for (var2 = 0; var2 < this.field_D.length; var2++) {
            this.field_D[var2] = md.a(this.field_D[var2], 32768);
          }
        }
        if (null != this.field_F) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (this.field_F.length > var5) {
            this.field_F[var5] = md.a(this.field_F[var5], 32768);
            var5++;
          }
        }
        if (param0 != 0) {
          ge var4 = (ge) null;
          this.a((byte) -86, (ge) null);
        }
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          while (true) {
            var3_int = param1.g(param0 ^ 1);
            if (var3_int != 0) {
              this.a(-121, param1, var3_int);
              continue;
            }
            break;
          }
          if (param0 != -123) {
            this.field_w = (char[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(byte param0, ge param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          wi.field_a = param1.d(-1034) << 5;
          var2_int = param1.g(-74);
          jj.field_F = (var2_int & 7) << 18;
          wi.field_a = wi.field_a + (var2_int >> 3);
          jj.field_F = jj.field_F + (param1.d(-1034) << 2);
          var2_intLifetime1 = param1.g(-115);
          vd.field_n = (63 & var2_intLifetime1) << 15;
          jj.field_F = jj.field_F + (var2_intLifetime1 >> 6);
          if (param0 <= 112) {
            field_x = (String) null;
          }
          vd.field_n = vd.field_n + (param1.g(-75) << 7);
          var2_intLifetime2 = param1.g(-61);
          vd.field_n = vd.field_n + (var2_intLifetime2 >> 1);
          vb.field_f = (var2_intLifetime2 & 1) << 16;
          vb.field_f = vb.field_f + param1.d(-1034);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sf() {
        this.field_C = false;
    }

    static {
        field_x = "The '<%0>' setting needs to be changed.";
        field_z = "<img=0> Click on the cue ball to take your shot.";
    }
}
