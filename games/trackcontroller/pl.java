/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static il field_b;
    static int[] field_c;
    static String field_d;
    static int[] field_a;

    private final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (!ka.a(param1, param2, -2)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (var3_int >= param1.length()) {
              if (param0 == -110) {
                return true;
              }
              field_c = (int[]) null;
              return true;
            }
            if (ue.a(-16490, param1.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("pl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (null != kb.field_a) {
          kb.field_a.t(20252);
        }
        ne.field_d = new bk();
        if (param0 != 0) {
          field_d = (String) null;
        }
        re.field_g.b(ne.field_d, -113);
    }

    final static void b(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ti var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        aj var6_ref_aj = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        la var27 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = TrackController.field_F ? 1 : 0;
        try {
          var27 = ne.field_a;
          var2 = var27.h(16383);
          if (var2 == 0) {
            var3 = var27.d((byte) -48);
            var4 = (ti) (ea.field_s.b(2));
            while (var4 != null) {
              if (var4.field_i != var3) {
                var4 = (ti) (ea.field_s.a(10));
                continue;
              }
              break;
            }
            if (var4 == null) {
              lj.a((byte) 115);
              return;
            }
            var5 = var27.h(16383);
            if (0 != var5) {
              var6 = var4.field_l;
              var7 = var4.field_k;
              cb.field_c[0].field_f = null;
              cb.field_c[0].field_h = ue.field_a;
              cb.field_c[0].field_i = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                cb.field_c[var8_int].field_h = var27.g(0);
                cb.field_c[var8_int].field_i = false;
                if (var27.h(param0 + 19953) == 1) {
                  cb.field_c[var8_int].field_f = var27.g(param0 ^ -3570);
                } else {
                  cb.field_c[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_q = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_n = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.h(param0 ^ -12815);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.h(16383);
                  var21 = cb.field_c[var20].field_h;
                  var22 = var27.f((byte) 38);
                  var24 = var27.field_k;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = cb.field_c[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.e((byte) 113);
                    }
                  }
                  if (var21 != null &&
                    rb.a(false, var21)) {
                    var8[1][var13] = ue.field_a;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var27.field_k = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.e((byte) 113);
                    }
                  }
                  if (var14 < var6 &&
                    !cb.field_c[var20].field_i) {
                    cb.field_c[var20].field_i = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = cb.field_c[var20].field_f;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_k = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.e((byte) 113);
                    }
                  }
                }
              }
            }
            var4.field_o = true;
            var4.a(-47);
          } else if (var2 == 1) {
            var3 = var27.d((byte) -127);
            var4_long = var27.f((byte) 108);
            var6_ref_aj = (aj) (ub.field_e.b(2));
            while (var6_ref_aj != null) {
              if (~var6_ref_aj.field_q != ~var3) {
                var6_ref_aj = (aj) (ub.field_e.a(param0 ^ -3580));
                continue;
              }
              break;
            }
            if (var6_ref_aj == null) {
              lj.a((byte) 114);
              return;
            }
            var6_ref_aj.field_j = var4_long;
            var6_ref_aj.a(-62);
          } else {
            hb.a((Throwable) null, param0 + 3570, "HS1: " + jc.b(116));
            lj.a((byte) 118);
          }
          if (param0 != -3570) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "pl.F(" + param0 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 != 1240830180) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (rf.field_a.length <= var5_int) {
              return;
            }
            param3 = rf.field_a[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param2 = gk.field_b[incrementValue$1];
              dupTemp$2 = param4[param2];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              gk.field_b[dupTemp$3] = param2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -30877) {
          field_b = (il) null;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        byte[] var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 37) {
            var3 = (byte[]) null;
            pl.a((int[]) null, -51, 81, -104, (byte[]) null);
          }
          stackIn_3_0 = pl.a((byte) -110, param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = "Updates will sent to the email address you've given";
        field_c = new int[8192];
        field_a = new int[4];
    }
}
