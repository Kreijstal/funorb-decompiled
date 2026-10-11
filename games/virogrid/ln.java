/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    private l field_d;
    static String field_c;
    static String field_a;
    private l field_e;
    static km[] field_i;
    private l[] field_b;
    private int field_h;
    static int field_g;
    private int field_f;

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param1 != 104) {
          jc var5 = (jc) null;
          ln.a(68, -61, (pd) null, (jc) null);
        }
        if (null != md.field_e &&
          md.field_e.b(param1 ^ 21)) {
          ch.a(true);
          return true;
        }
        if (km.field_yb != null &&
          km.field_yb.d(false)) {
          km.field_yb = null;
          ch.a(true);
          return true;
        }
        if (s.b((byte) -109)) {
          return true;
        }
        if (cb.a(-13079, param2, param3, param0)) {
          return true;
        }
        return false;
    }

    final l a(byte param0) {
        this.field_h = 0;
        if (param0 != 19) {
          return (l) null;
        }
        return this.a(110);
    }

    final static boolean a(byte param0, eh param1, eh param2, eh param3) {
        RuntimeException var4 = null;
        cj var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.c(0) &&
            param2.a((byte) -102, "commonui")) {
            if (param0 != 127) {
              var5 = (cj) null;
              ln.a((cj) null, -22);
            }
            if (!param1.c(0)) {
              return false;
            }
            if (!param1.a((byte) -102, "commonui")) {
              return false;
            }
            if (param3.c(param0 ^ 127) &&
              param3.a((byte) -102, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ln.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final l a(long param0, int param1) {
        l var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        l var4 = this.field_b[(int)(param0 & (long)(this.field_f - 1))];
        this.field_d = var4.field_f;
        while (var4 != this.field_d) {
          if (param0 == this.field_d.field_d) {
            var5 = this.field_d;
            this.field_d = this.field_d.field_f;
            return var5;
          }
          this.field_d = this.field_d.field_f;
        }
        this.field_d = null;
        if (param1 == -14905) {
          return null;
        }
        return (l) null;
    }

    final static void a(cj param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            hf.field_D[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < qh.field_K; var2_intLifetime1++) {
            if (param0.field_n == el.field_s[var2_intLifetime1].field_n) {
              dupTemp$3 = el.field_s[var2_intLifetime1].b(-6761);
              hf.field_D[dupTemp$3] = hf.field_D[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.b(-6761);
          hf.field_D[dupTemp$0] = hf.field_D[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < qh.field_K; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_n == el.field_s[var3].field_n) {
              var4 = el.field_s[var3].b(-6761);
              if (nb.field_s < hf.field_D[var4]) {
                hf.field_D[var4] = hf.field_D[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              el.field_s[incrementValue$2] = el.field_s[var3];
            }
          }
          if (param1 <= 88) {
            field_a = (String) null;
          }
          qh.field_K = var2_intLifetime2;
          fieldTemp$1 = qh.field_K;
          qh.field_K = qh.field_K + 1;
          el.field_s[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ln.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, pd param2, jc param3) {
        try {
          int var6 = 0;
          int var12_int = 0;
          int var13_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          SecurityException var7_ref = null;
          NullPointerException var7_ref2 = null;
          Exception var7_ref3 = null;
          Throwable var7_ref4 = null;
          String var8 = null;
          String var9 = null;
          int var10 = 0;
          String[] var11 = null;
          byte[][] var12 = null;
          Class[] var13 = null;
          int var14 = 0;
          int var15 = 0;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          bf var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          String var22 = null;
          byte[][] var23 = null;
          int var14Lifetime1;
          var15 = Virogrid.field_F ? 1 : 0;
          try {
            var19 = new bf();
            var19.field_n = param3.g(11132);
            var19.field_h = param3.d((byte) 112);
            var19.field_g = new int[var19.field_n];
            var19.field_l = new int[var19.field_n];
            var19.field_j = new byte[var19.field_n][][];
            var19.field_r = new un[var19.field_n];
            var19.field_q = new un[var19.field_n];
            var19.field_u = new int[var19.field_n];
            var5 = 42 / ((-62 - param0) / 56);
            for (var6 = 0; var6 < var19.field_n; var6++) {
              try {
                var7_int = param3.g(11132);
                if (0 != var7_int &&
                  var7_int != 1 &&
                  var7_int != 2) {
                  if (var7_int == 3 ||
                    var7_int == 4) {
                    var21 = param3.h(-117);
                    var22 = param3.h(-117);
                    var10 = param3.g(11132);
                    var11 = new String[var10];
                    for (var12_int = 0; var12_int < var10; var12_int++) {
                      var11[var12_int] = param3.h(-117);
                    }
                    var23 = new byte[var10][];
                    var20 = var23;
                    var12 = var20;
                    if (var7_int == 3) {
                      for (var13_int = 0; var10 > var13_int; var13_int++) {
                        var14 = param3.d((byte) 124);
                        array$0 = new byte[var14];
                        var12[var13_int] = array$0;
                        param3.a(0, var14, true, var23[var13_int]);
                      }
                    }
                    var19.field_g[var6] = var7_int;
                    var13 = new Class[var10];
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (var18 < var10) {
                      var13[var18] = cj.a(-99, var11[var18]);
                      var18++;
                    }
                    var19.field_r[var6] = param2.a(cj.a(-109, var21), var13, true, var22);
                    var19.field_j[var6] = var23;
                  }
                } else {
                  var16 = param3.h(-122);
                  var8 = var16;
                  var17 = param3.h(-118);
                  var9 = var17;
                  var10 = 0;
                  if (1 == var7_int) {
                    var10 = param3.d((byte) 95);
                  }
                  var19.field_g[var6] = var7_int;
                  var19.field_u[var6] = var10;
                  var19.field_q[var6] = param2.a(cj.a(71, var16), var17, true);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_l[var6] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var7_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_l[var6] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_l[var6] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var7_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_l[var6] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var7_ref4 = decompiledCaughtException;
                var19.field_l[var6] = -5;
              }
            }
            l.field_c.a(var19, (byte) -84);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("ln.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
            if (param3 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final l a(int param0) {
        int fieldTemp$0 = 0;
        l var2_ref_l;
        int var2;
        int var3;
        l var4;
        var3 = Virogrid.field_F ? 1 : 0;
        if (0 < this.field_h &&
          this.field_e != this.field_b[this.field_h - 1]) {
          var2_ref_l = this.field_e;
          this.field_e = var2_ref_l.field_f;
          return var2_ref_l;
        }
        do {
          if (this.field_h >= this.field_f) {
            var2 = 49 / ((-32 - param0) / 46);
            return null;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_b[fieldTemp$0].field_f;
          var2_ref_l = var4;
        } while (var4 == this.field_b[-1 + this.field_h]);
        this.field_e = var2_ref_l.field_f;
        return var2_ref_l;
    }

    public static void a(boolean param0) {
        if (!param0) {
          ln.a(false);
        }
        field_i = null;
        field_a = null;
        field_c = null;
    }

    final void a(l param0, byte param1, long param2) {
        l var5 = null;
        try {
          if (param0.field_a != null) {
            param0.a(false);
          }
          var5 = this.field_b[(int)((long)(-1 + this.field_f) & param2)];
          param0.field_f = var5;
          param0.field_a = var5.field_a;
          if (param1 < 0) {
            jc var6 = (jc) null;
            ln.a(-57, -4, (pd) null, (jc) null);
          }
          param0.field_a.field_f = param0;
          param0.field_d = param2;
          param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ln.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ln(int param0) {
        int var2 = 0;
        l dupTemp$0 = null;
        l var3 = null;
        this.field_h = 0;
        this.field_b = new l[param0];
        this.field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new l();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.field_a = var3;
          var3.field_f = var3;
        }
    }

    final static boolean b(int param0) {
        int var1 = -31 / ((param0 - 7) / 57);
        return null != ul.field_a ? true : false;
    }

    static {
        field_c = "<%0> must play <%1> more rated games before playing with the current options.";
        field_a = "Offline";
    }
}
