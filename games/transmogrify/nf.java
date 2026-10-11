/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    private ad field_f;
    String field_d;
    String field_h;
    static String field_q;
    mi field_c;
    boolean field_g;
    int[] field_p;
    static java.awt.Frame field_e;
    ti field_a;
    static tf field_m;
    static String field_i;
    String field_j;
    String field_n;
    int field_o;
    static hj field_l;
    String field_b;
    static int field_k;

    final char a(int param0, char param1) {
        if (param0 != 0) {
          this.a(89, '\f');
        }
        return Character.toUpperCase(param1);
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_q = null;
        field_l = null;
        field_m = null;
        if (param0 != -41) {
          nf.a((byte) -93);
        }
    }

    final boolean a(int param0, sj[] param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        char[] var4 = null;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 != -1) {
            field_l = (hj) null;
          }
          while (param1.length > var3_int) {
            if (null != param1[var3_int]) {
              var3_int++;
              continue;
            }
            break;
          }
          var4 = new char[var3_int];
          for (var5 = 0; var3_int > var5; var5++) {
            var4[var5] = param1[var5].field_i;
          }
          stackIn_10_0 = this.field_f.a((byte) 109, var4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(byte param0, char[] param1) {
        int dupTemp$0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != 92) {
            this.field_f = (ad) null;
          }
          L1: while (true) {
            this.field_f.a(param1, o.field_o, false, 3670);
            var3_int = 0;
            for (var4 = 0; 256 > var4; var4++) {
              ic.field_c[var4] = 0;
            }
            var7 = 0;
            var4Lifetime1 = var7;
            while (var7 < param1.length) {
              var5 = param1[var7] & 255;
              if (-1 < this.field_d.indexOf(var5)) {
                var3_int = 1;
              }
              dupTemp$0 = ic.field_c[var5] + 1;
              ic.field_c[var5] = dupTemp$0;
              if (dupTemp$0 == 4) {
                continue L1;
              }
              var7++;
            }
            if (var3_int != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("nf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    nf(ci param0, ci param1, ad param2) {
        int var12_int = 0;
        int var18 = 0;
        int stackIn_39_0 = 0;
        boolean stackIn_47_1 = false;
        mi stackIn_54_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        NumberFormatException var12 = null;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        NumberFormatException var17 = null;
        int var19 = 0;
        int var20 = 0;
        char[] var24 = null;
        Object var25 = null;
        Object var26 = null;
        CharSequence var27 = null;
        CharSequence var28 = null;
        var25 = null;
        var26 = null;
        this.field_p = new int[512];
        try {
          this.field_f = param2;
          this.field_o = param2.field_d;
          var4_int = 0;
          var5 = null;
          var6 = null;
          var7 = null;
          var8 = null;
          var9 = null;
          var10 = null;
          var11 = null;
          for (var12_int = 0; param2.field_c.length > var12_int; var12_int++) {
            var13 = param2.field_c[var12_int][0];
            var14 = param2.field_c[var12_int][1];
            if (!var13.startsWith("val")) {
              if (!"lang".equals(var13)) {
                if ("font".equals(var13)) {
                  var6 = var14;
                } else {
                  if ("fhei".equals(var13)) {
                    var7 = var14;
                  } else {
                    if (!"vowels".equals(var13)) {
                      if (!"tut1".equals(var13)) {
                        if ("tut2".equals(var13)) {
                          var10 = var14.toUpperCase();
                        } else {
                          if (!"hint1".equals(var13)) {
                            if ("disabled".equals(var13)) {
                              stackIn_39_0 = (!var14.equals("true")) ? 0 : 1;
                              var4_int = stackIn_39_0;
                            } else {
                              if (va.field_j >= 2) {
                                System.out.println("Unrecognised config option: " + var13);
                              }
                            }
                          } else {
                            var11 = var14;
                          }
                        }
                      } else {
                        var9 = var14.toUpperCase();
                      }
                    } else {
                      var8 = var14;
                    }
                  }
                }
              } else {
                var5 = var14;
              }
            } else {
              var16 = 0;
              try {
                var27 = (CharSequence) ((Object) var13.substring(3));
                var15 = aa.a(-104, var27);
                if (var15 > 0) {
                  var24 = var14.toCharArray();
                  for (var18 = 0; var24.length > var18; var18++) {
                    var19 = var24[var18];
                    if (2 <= va.field_j &&
                      0 != this.field_p[var19]) {
                      System.out.println("Multiple letter values found for" + (char) var19);
                    }
                    this.field_p[var19] = var15;
                    var20 = this.a(0, (char) var19);
                    if (va.field_j >= 2 &&
                      var20 != var19 &&
                      this.field_p[var20] != 0) {
                      System.out.println("Multiple letter values found for " + (char) var20);
                    }
                    this.field_p[var20] = var15;
                  }
                } else {
                  var16 = 1;
                }
              } catch (java.lang.NumberFormatException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var17 = (NumberFormatException) (Object) decompiledCaughtException;
                var16 = 1;
              }
              if (va.field_j >= 2 &&
                var16 != 0) {
                System.out.println("Unrecognised config option: " + var13);
              }
            }
          }
          stackIn_47_1 = (var4_int != 0);
          this.field_g = stackIn_47_1;
          if (var8 != null) {
            this.field_d = ((String) (var8)).toUpperCase();
          } else {
            this.field_d = "AEIOU";
            if (2 <= va.field_j) {
              System.out.println("Forced to use default vowels for " + (String) (var5));
            }
          }
          this.field_n = (String) (var10);
          this.field_b = (String) (var9);
          this.field_h = (String) (var11);
          this.field_j = (String) (var5);
          var28 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
          this.field_a = pc.a("", dj.a(var28, (byte) -123), param0, -124);
          if (var6 != null) {
            stackIn_54_1 = am.a(dj.a((CharSequence) (var6), (byte) -121), param0, (byte) 72, param1, "");
          } else {
            stackIn_54_1 = wf.field_d;
          }
          this.field_c = stackIn_54_1;
          if (var7 != null) {
            try {
              aa.a(89, (CharSequence) (var7));
              decompiledRegionSelector0 = 0;
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var12 = (NumberFormatException) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var4;
          stackIn_61_1 = new StringBuilder().append("nf.<init>(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
        }
    }

    static {
        field_q = "Player";
        field_m = new tf(0, 2, 2, 1);
        field_k = -1;
    }
}
