/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static km[] field_c;
    static String field_d;
    private l field_g;
    static boolean field_b;
    private l field_e;
    static int field_a;
    static dd[] field_f;

    final int c(int param0) {
        int var4 = Chess.field_G;
        int var2 = 0;
        l var3 = this.field_g.field_p;
        if (param0 != -19099) {
          field_f = (dd[]) null;
          while (var3 != this.field_g) {
            var2++;
            var3 = var3.field_p;
          }
          return var2;
        }
        while (var3 != this.field_g) {
          var2++;
          var3 = var3.field_p;
        }
        return var2;
    }

    final l a(byte param0) {
        l var2 = this.field_g.field_p;
        if (param0 != -75) {
          byte[] var3 = (byte[]) null;
          ad.a(74, (byte[]) null);
          if (this.field_g != var2) {
            var2.d(-1);
            return var2;
          }
          return null;
        }
        if (this.field_g != var2) {
          var2.d(-1);
          return var2;
        }
        return null;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -29410) {
            field_a = 13;
          }
          stackIn_3_0 = gh.a(param1, 0, param0 + 29249, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ad.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        int var1 = 51 % ((param0 + 16) / 59);
        field_d = null;
    }

    final static vj a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          vj var5 = null;
          si var5_ref = null;
          int var6 = 0;
          vj stackIn_1_0 = null;
          si stackIn_3_0 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("mb");
              var5 = (vj) (var4.newInstance());
              var6 = 99 % ((param1 - 68) / 40);
              var5.a(param0, 84, param2, param3);
              stackIn_1_0 = var5;
              return stackIn_1_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new si();
              ((vj) ((Object) var5_ref)).a(param0, 107, param2, param3);
              stackIn_3_0 = var5_ref;
              return (vj) ((Object) stackIn_3_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var4_ref2;
            stackIn_6_1 = new StringBuilder().append("ad.D(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, l param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_m != null) {
            param1.d(-1);
          }
          param1.field_m = this.field_g.field_m;
          param1.field_p = this.field_g;
          param1.field_m.field_p = param1;
          param1.field_p.field_m = param1;
          if (param0 == 0) {
            return;
          }
          this.b(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ad.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public ad() {
        this.field_g = new l();
        this.field_g.field_p = this.field_g;
        this.field_g.field_m = this.field_g;
    }

    final l b(int param0) {
        l var2 = this.field_g.field_p;
        if (var2 == this.field_g) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_p;
        if (param0 == -22585) {
          return var2;
        }
        field_b = false;
        return var2;
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Chess.field_G;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (cg.a(2, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (cg.a(2, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (~var4 > param1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (gm.a((char) var7, (byte) -84)) {
              var8 = uj.a((char) var7, (byte) 118);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ad.F(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final l b(byte param0) {
        l var2 = this.field_e;
        if (var2 == this.field_g) {
          this.field_e = null;
          return null;
        }
        if (param0 <= -64) {
          this.field_e = var2.field_p;
          return var2;
        }
        l var3 = (l) null;
        this.a(-31, (l) null);
        this.field_e = var2.field_p;
        return var2;
    }

    static {
        field_b = true;
        field_f = new dd[7];
    }
}
