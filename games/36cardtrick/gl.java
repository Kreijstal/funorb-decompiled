/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends hl {
    private int field_E;
    private ba field_F;
    static String[] field_G;

    public static void a(int param0) {
        if (param0 != 1) {
          return;
        }
        field_G = null;
    }

    final String b(byte param0) {
        if (this.field_j) {
          return this.field_F.b(26766);
        }
        if (param0 == -79) {
          return null;
        }
        field_G = (String[]) null;
        return null;
    }

    final static boolean b(boolean param0) {
        int var2 = 0;
        fd var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        fd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Main.field_T;
        try {
          if (!param0) {
            field_G = (String[]) null;
          }
          var4 = (fd) (vb.field_e.a((byte) 74));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_o > var2; var2++) {
            if (null != var4.field_p[var2] &&
              0 == var4.field_p[var2].field_a) {
              return false;
            }
            if (null != var4.field_r[var2] &&
              var4.field_r[var2].field_a == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "gl.I(" + param0 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          try {
            if (param1 != 873140897) {
              return true;
            }
            if (!le.field_m.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("gl.H(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
          this.field_E = this.field_E + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static kc[] a(String param0, qk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        kc[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(18659, param2);
          var5 = param1.a(var4_int, param0, (byte) 7);
          if (param3 != -13244) {
            var6 = (String) null;
            gl.a((String) null, 104);
          }
          stackIn_3_0 = hl.a(param1, 117, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("gl.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        kc var15 = null;
        kc var16 = null;
        kc var13 = null;
        kc var12 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Main.field_T;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, -1, param3);
        if (param2 != ~param3) {
          return;
        }
        int var5 = this.field_o + param0 + (this.field_h >> 1);
        int var6 = (this.field_q >> 1) + this.field_i + param1;
        sg var8 = this.field_F.a(true);
        if (tb.field_b == var8) {
          var15 = gh.field_n[0];
          var9 = var15.field_l << 1;
          var10 = var15.field_k << 1;
          if (null == hb.field_c) {
            hb.field_c = new kc(var9, var10);
            dl.a(97, hb.field_c);
            var15.a(112, 144, var15.field_l << 4, var15.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
            return;
          }
          if (var9 > hb.field_c.field_p) {
            hb.field_c = new kc(var9, var10);
            dl.a(97, hb.field_c);
            var15.a(112, 144, var15.field_l << 4, var15.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
            return;
          }
          if (var10 <= hb.field_c.field_o) {
            dl.a(param2 + 96, hb.field_c);
            vj.d();
            var15.a(112, 144, var15.field_l << 4, var15.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
            return;
          }
          hb.field_c = new kc(var9, var10);
          dl.a(97, hb.field_c);
          var15.a(112, 144, var15.field_l << 4, var15.field_k << 4, -this.field_E << 10, 4096);
          gg.a(14756);
          hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
          return;
        }
        if (a.field_n == var8) {
          var16 = gh.field_n[0];
          var9Lifetime1 = var16.field_l << 1;
          var10Lifetime1 = var16.field_k << 1;
          if (null == hb.field_c) {
            hb.field_c = new kc(var9Lifetime1, var10Lifetime1);
            dl.a(97, hb.field_c);
            var16.a(112, 144, var16.field_l << 4, var16.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
            return;
          }
          if (var9Lifetime1 > hb.field_c.field_p) {
            hb.field_c = new kc(var9Lifetime1, var10Lifetime1);
            dl.a(97, hb.field_c);
            var16.a(112, 144, var16.field_l << 4, var16.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
            return;
          }
          if (var10Lifetime1 <= hb.field_c.field_o) {
            dl.a(param2 + 96, hb.field_c);
            vj.d();
            var16.a(112, 144, var16.field_l << 4, var16.field_k << 4, -this.field_E << 10, 4096);
            gg.a(14756);
            hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
            return;
          }
          hb.field_c = new kc(var9Lifetime1, var10Lifetime1);
          dl.a(97, hb.field_c);
          var16.a(112, 144, var16.field_l << 4, var16.field_k << 4, -this.field_E << 10, 4096);
          gg.a(14756);
          hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
          return;
        }
        if (pe.field_b == var8) {
          var13 = gh.field_n[2];
          var13.b(var5 - (var13.field_p >> 1), -(var13.field_o >> 1) + var6, 256);
          return;
        }
        if (ii.field_e == var8) {
          var12 = gh.field_n[1];
          var12.b(-(var12.field_p >> 1) + var5, var6 - (var12.field_o >> 1), 256);
          return;
        }
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 71) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        if (al.field_a == -1) {
          if (!r.a(1, (byte) 123)) {
            return false;
          }
          al.field_a = rd.field_j.f(-97);
          rd.field_j.field_i = 0;
        }
        if (al.field_a == -2) {
          if (!r.a(2, (byte) 127)) {
            return false;
          }
          al.field_a = rd.field_j.d((byte) 72);
          rd.field_j.field_i = 0;
        }
        if (!param0) {
          return r.a(al.field_a, (byte) 123);
        }
        String var2 = (String) null;
        gl.a((String) null, 98);
        return r.a(al.field_a, (byte) 123);
    }

    final static void a(int param0, ib param1, int param2, int param3) {
        li var4 = null;
        jg var5 = null;
        if (param3 != 804) {
          return;
        }
        try {
          var4 = li.a(param1, 100, param2);
          var5 = ug.a(var4, param3 - 803, param0);
          aj.field_s.a(new gi(var4, var5), 27362);
          bg.field_tb.b(var5);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    gl(ba param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
