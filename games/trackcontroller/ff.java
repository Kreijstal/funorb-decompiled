/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static kk field_b;
    static String[] field_c;
    private int[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1) {
          ff.a(-90);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        cf.field_p = null;
        ka.field_f = null;
        qe.field_z = null;
        vb.field_a = null;
        if (param0 >= 21) {
          qk.field_M = (byte[][]) null;
          j.field_f = null;
          return;
        }
        field_b = (kk) null;
        qk.field_M = (byte[][]) null;
        j.field_f = null;
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param4 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = param3;
          param4 = param4 + param2;
          var8 = param1;
          L2: while (true) {
            var9 = param0[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$0 = this.field_a[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$2 = this.field_a[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_a[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param2;
              param2++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (16 & var9)) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_a[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$8 = this.field_a[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (4 & var9)) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_a[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 2) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_a[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 <= param2) {
                return 1 + (var8 - param1);
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_a[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_64_0 = 1 + (var8 - param1);
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ff.B(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
