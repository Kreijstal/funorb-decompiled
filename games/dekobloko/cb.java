/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_k;
    private pb[] field_f;
    static boolean[][] field_e;
    static String field_d;
    private int field_b;
    String field_a;
    static String field_h;
    float field_l;
    private int field_j;
    static String field_i;
    private int field_g;
    static int field_c;

    private final void a(String param0, int param1, String param2, String param3, int param4, ji param5) {
        pb[] var9 = null;
        pb var8 = null;
        pb var10 = null;
        int fieldTemp$0 = 0;
        try {
          if (this.field_g >= this.field_f.length) {
            var9 = new pb[2 * this.field_g];
            pb[] var7 = var9;
            an.a(this.field_f, 0, var9, 0, this.field_g);
            this.field_f = var9;
          }
          var8 = new pb();
          var10 = var8;
          pb var7_ref = var10;
          var10.field_j = param3;
          if (param1 != 2) {
            this.field_a = (String) null;
          }
          var10.field_a = param2;
          var10.field_b = param0;
          var10.field_h = param4;
          var10.field_g = param5;
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "cb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = (boolean[][]) null;
        if (param0 != 12623) {
          return;
        }
        field_k = null;
        field_h = null;
        field_i = null;
        field_d = null;
    }

    final boolean a(int param0) {
        pb var2;
        int var3;
        pb var4;
        var3 = client.field_A ? 1 : 0;
        if (param0 > -48) {
          this.a(88);
        }
        while (this.field_j < this.field_g) {
          var4 = this.field_f[this.field_j];
          var2 = var4;
          if (!var4.field_g.a((byte) 121)) {
            this.a(var4, 30993, 0);
            return false;
          }
          if (var4.field_h >= 0 &&
            !var4.field_g.b(var4.field_h, (byte) -106)) {
            this.a(var2, 30993, var4.field_g.a((byte) 34, var4.field_h));
            return false;
          }
          if (null != var4.field_b &&
            !var4.field_g.a(var4.field_b, (byte) -103)) {
            this.a(var2, 30993, var4.field_g.a(20, var4.field_b));
            return false;
          }
          if (var4.field_h < 0 &&
            var4.field_b == null &&
            null != var4.field_a &&
            !var4.field_g.a(false)) {
            this.a(var2, 30993, var4.field_g.b((byte) -100));
            return false;
          }
          this.field_j = this.field_j + 1;
        }
        return true;
    }

    final static boolean a(byte param0) {
        if (param0 != -128) {
          CharSequence var2 = (CharSequence) null;
          cb.a((byte) 49, (CharSequence) null);
          if (!cd.a(8192)) {
            return false;
          }
          if ((8 & uf.field_A) == 0) {
            return true;
          }
          return false;
        }
        if (!cd.a(8192)) {
          return false;
        }
        if ((8 & uf.field_A) == 0) {
          return true;
        }
        return false;
    }

    private final void a(pb param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 30993) {
            return;
          }
          var4_float = (float)(this.field_j + 1) + (float)param2 / 100.0f;
          this.field_l = var4_float * (float)this.field_b / (float)(this.field_g + 1);
          if (param2 != 0) {
            this.field_a = param0.field_a + " - " + param2 + "%";
            return;
          }
          this.field_a = param0.field_j;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cb.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(String param0, ji param1, String param2, byte param3, String param4) {
        try {
          int var6_int = -19 / ((param3 - 43) / 42);
          this.a(param0, 2, param2, param4, -1, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "cb.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(hl param0, boolean param1) {
        String stackIn_2_0;
        Object stackIn_2_1;
        int stackIn_2_2;
        Object stackIn_2_3;
        w stackIn_2_4;
        String stackIn_2_5;
        long stackIn_2_6;
        int stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        String var6 = null;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        try {
          stackIn_2_0 = param0.field_o;
          stackIn_2_1 = null;
          stackIn_2_2 = 100;
          stackIn_2_3 = null;
          stackIn_2_4 = param0.field_f;
          stackIn_2_5 = param0.field_p;
          stackIn_2_6 = param0.field_r;
          stackIn_2_7 = param0.field_m;
          if (param0.field_m == 1) {
            stackIn_3_8 = param0.field_k;
          } else {
            stackIn_3_8 = 0;
          }
          sl.$cfr$intArgs$a$2862dfd4c01c(stackIn_2_0, (int[]) (stackIn_2_1), stackIn_2_2, (nm) (stackIn_2_3), stackIn_2_4, stackIn_2_5, stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (0 == param0.field_m &&
            !ne.b(-18163) &&
            cd.field_m == null &&
            null == g.field_N) {
            if (!wl.field_p) {
              var5 = w.field_H;
              var6 = wk.field_p;
              var5.field_h.a(var6, 14, -61);
            }
            var7 = w.field_H;
            var8 = re.field_t;
            var7.field_h.a(var8, 20, 91);
          }
          if (param0.field_m == 1 &&
            !ne.b(-18163) &&
            null != cd.field_m &&
            param0.field_k == cd.field_m.e(125)) {
            if (!wl.field_p) {
              var9 = w.field_H;
              var10 = ob.field_l;
              var9.field_h.a(var10, 14, 121);
            }
            var11 = w.field_H;
            var12 = eb.field_r;
            var11.field_h.a(var12, 20, -57);
          }
          w.field_H.b(-92);
          w.field_H.a(param1, 29072);
          w.field_H.a(param0.field_m, (byte) -43, param0.field_q);
          w.field_H.a(17);
          w.field_H.a((byte) -51, param0);
          var13 = w.field_H;
          var3 = he.field_S;
          var4 = nf.field_h;
          var13.field_h.b(var4, var3, 121, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("cb.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, byte param1, ji param2, String param3) {
        try {
          this.a((String) null, 2, param3, param0, -1, param2);
          int var5_int = 73 / ((6 - param1) / 37);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          if (param2 != 4564) {
            field_c = 77;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = kf.a(param1, (byte) 2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ug.a(var4.charAt(0), 32) &&
                !ug.a(var4.charAt(var4.length() - 1), 32)) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (!ug.a((char) var7, 32)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    return false;
                  }
                }
                if (var5 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("cb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    cb(int param0) {
        this.field_f = new pb[16];
        this.field_b = param0;
    }

    final static void b(byte param0) {
        int var2;
        hl var3;
        hl var3Lifetime1;
        hl var3Lifetime2;
        hl var3Lifetime3;
        var2 = client.field_A ? 1 : 0;
        if (gi.field_c < 0) {
          bf.field_o = bf.field_o - (gi.field_c >> 1);
        } else {
          bf.field_o = bf.field_o + (-gi.field_c >> 1);
        }
        gi.field_c = gi.field_c + bf.field_o;
        if (0 > gi.field_c) {
          gi.field_c = gi.field_c - (gi.field_c >> 4);
          if (0 <= nf.field_e) {
            wg.field_d = wg.field_d + (-nf.field_e >> 1);
          } else {
            wg.field_d = wg.field_d - (nf.field_e >> 1);
          }
          nf.field_e = nf.field_e + wg.field_d;
          if (nf.field_e < 0) {
            nf.field_e = nf.field_e - (nf.field_e >> 4);
          } else {
            nf.field_e = nf.field_e + (-nf.field_e >> 4);
          }
          if (param0 != 71) {
            var3 = (hl) null;
            cb.a((hl) null, false);
          }
          if (nf.field_e > 0) {
            if (wg.field_d > 0) {
              wg.field_d = -wg.field_d;
            }
            nf.field_e = 0;
          }
          return;
        }
        gi.field_c = gi.field_c + (-gi.field_c >> 4);
        if (0 > nf.field_e) {
          wg.field_d = wg.field_d - (nf.field_e >> 1);
          nf.field_e = nf.field_e + wg.field_d;
          if (nf.field_e < 0) {
            nf.field_e = nf.field_e - (nf.field_e >> 4);
          } else {
            nf.field_e = nf.field_e + (-nf.field_e >> 4);
          }
          if (param0 != 71) {
            var3Lifetime1 = (hl) null;
            cb.a((hl) null, false);
          }
          if (nf.field_e > 0) {
            if (wg.field_d > 0) {
              wg.field_d = -wg.field_d;
            }
            nf.field_e = 0;
          }
          return;
        }
        wg.field_d = wg.field_d + (-nf.field_e >> 1);
        nf.field_e = nf.field_e + wg.field_d;
        if (nf.field_e >= 0) {
          nf.field_e = nf.field_e + (-nf.field_e >> 4);
          if (param0 != 71) {
            var3Lifetime2 = (hl) null;
            cb.a((hl) null, false);
          }
          if (nf.field_e > 0) {
            if (wg.field_d > 0) {
              wg.field_d = -wg.field_d;
            }
            nf.field_e = 0;
          }
          return;
        }
        nf.field_e = nf.field_e - (nf.field_e >> 4);
        if (param0 == 71) {
          if (nf.field_e > 0) {
            if (wg.field_d > 0) {
              wg.field_d = -wg.field_d;
            }
            nf.field_e = 0;
          }
          return;
        }
        var3Lifetime3 = (hl) null;
        cb.a((hl) null, false);
        if (nf.field_e > 0) {
          if (wg.field_d > 0) {
            wg.field_d = -wg.field_d;
          }
          nf.field_e = 0;
        }
        return;
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 96 % ((3 - param0) / 35);
          stackIn_1_0 = s.a(true, 4, 10, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("cb.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_d = "Breaking real-world laws";
        field_k = "Game full";
        field_h = "Name";
        field_i = "OH NO!";
    }
}
