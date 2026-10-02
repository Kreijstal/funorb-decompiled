/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends hk {
    private dg field_F;
    static od field_I;
    private int field_G;
    static boolean field_H;
    static int field_E;

    final static int a(int param0, byte param1) {
        int var2;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
          var2 += 16;
          param0 = param0 >> 16;
        }
        if (param0 < -256) {
          param0 = param0 >> 8;
          var2 += 8;
        }
        if (param1 != 66) {
          field_H = true;
        }
        if (-16 > param0) {
          param0 = param0 >> 4;
          var2 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2 += 2;
        }
        if (-2 > param0) {
          var2++;
          param0 = param0 >> 1;
        }
        return var2;
    }

    public static void f(int param0) {
        if (param0 > -114) {
            StringBuilder var2 = (StringBuilder) null;
            td.a((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        field_I = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        lh var9;
        int var10;
        int var11;
        int var12;
        dm var13;
        dm var14;
        dm var15;
        var12 = Geoblox.field_C;
        super.a(param0, param1, (byte) -86, param3);
        if (0 != param3) {
          return;
        }
        L0: {
          var5 = (this.field_r >> 1) + (this.field_v + param0);
          var7 = -74 % ((param2 - 1) / 43);
          var6 = param1 - (-this.field_m - (this.field_h >> 1));
          var9 = this.field_F.a((byte) -105);
          if (var9 != bf.field_g) {
            if (si.field_n != var9) {
              if (si.field_m == var9) {
                var14 = oa.field_e[2];
                var14.c(-(var14.field_r >> 1) + var5, var6 - (var14.field_m >> 1), 256);
                break L0;
              }
              if (var9 != kk.field_w) {
                break L0;
              }
              {
                var15 = oa.field_e[1];
                var15.c(-(var15.field_r >> 1) + var5, var6 - (var15.field_m >> 1), 256);
                break L0;
              }
            }
          }
          L2: {
            var13 = oa.field_e[0];
            var10 = var13.field_s << 1;
            var11 = var13.field_o << 1;
            if (null != da.field_b) {
              if (var10 <= da.field_b.field_r) {
                if (var11 <= da.field_b.field_m) {
                  Geoblox.a(1, da.field_b);
                  vb.c();
                  break L2;
                }
              }
            }
            da.field_b = new dm(var10, var11);
            Geoblox.a(1, da.field_b);
          }
          var13.a(112, 144, var13.field_s << 4, var13.field_o << 4, -this.field_G << 10, 4096);
          id.a(true);
          da.field_b.c(-var13.field_s + var5, var6 - var13.field_o, 256);
        }
    }

    final static void a(int param0, gd param1) {
        try {
            if (param0 != -348) {
                gd var3 = (gd) null;
                td.a(-67, (gd) null);
            }
            ja.a(false, kl.a(param1, 100, 96));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(CharSequence param0, StringBuilder param1, int param2, int param3) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        gd var9 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          if (param3 <= 23) {
            var9 = (gd) null;
            td.a(-80, (gd) null);
          }
          var4_int = param1.length();
          if (param2 >= 0) {
            if (var4_int >= param2) {
              var5 = param0.length();
              if (var5 == 0) {
                stackIn_9_0 = (StringBuilder) (param1);
                return stackIn_9_0;
              }
              var6 = param2 + var5;
              if (var4_int < var6) {
                param1.setLength(var6);
              }
              for (var7 = 0; var7 < var5; var7++) {
                incrementValue$1 = param2;
                param2++;
                param1.setCharAt(incrementValue$1, param0.charAt(var7));
              }
              stackIn_17_0 = (StringBuilder) (param1);
              return stackIn_17_0;
            }
          }
          throw new StringIndexOutOfBoundsException("length=" + var4_int + " startPos=" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var4);

          stackIn_20_1 = new StringBuilder().append("td.J(");

          if (param0 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "{...}";
          }


          stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

          if (param1 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            this.field_G = this.field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void g(byte param0) {
        int var1 = -28 % ((param0 - 36) / 43);
        if (gb.field_f != -uf.field_a + 0 && 250 - uf.field_a == gb.field_f) {
        }
        gb.field_f = gb.field_f + 1;
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -30) {
            this.a(89, -88, (byte) -40, -90);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);

          stackIn_6_1 = new StringBuilder().append("td.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        md.field_a.a(ue.field_f, (byte) -70);
    }

    td(dg param0) {
        try {
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        if (param0 != 69) {
            return (String) null;
        }
        if (!(!this.field_l)) {
            return this.field_F.c(-21666);
        }
        return null;
    }

    static {
        field_I = new od("");
    }
}
