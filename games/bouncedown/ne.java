/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ug {
    private String[] field_p;
    private int[] field_t;
    static int field_w;
    static tj field_v;
    static bc field_r;
    private int[][] field_o;
    int[] field_s;
    static int[] field_m;
    static int field_u;
    static String field_q;
    static int field_n;

    final static short[] a(int param0, int param1, short[] param2, ii param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Bounce.field_N;
        try {
          var4_int = param3.f(7, param1);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new short[var4_int];
          }
          var5 = param3.f(param0 + 7, 4);
          var6 = (short)param3.f(param0 ^ 7, 16);
          if (var5 <= param0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)(param3.f(7, var5) + var6);
            }
          }
          stackIn_16_0 = (short[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ne.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final String e(int param0) {
        int var4 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var5 = Bounce.field_N;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        int var3 = -44 / ((-51 - param0) / 41);
        if (this.field_p == null) {
          return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_p[0]);
        for (var4 = 1; this.field_p.length > var4; var4++) {
          discarded$1 = var2.append("...");
          discarded$2 = var6.append(this.field_p[var4]);
        }
        return var2.toString();
    }

    final static tg a(boolean param0) {
        int var4_int = 0;
        int var5 = Bounce.field_N;
        int var1 = ih.field_V[0] * qh.field_i[0];
        byte[] var2 = ph.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = he.field_k[da.b(255, (int) var2[var4_int])];
        }
        tg var4 = new tg(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], var3);
        vb.a((byte) 122);
        if (!param0) {
          ne.f(-101);
        }
        return var4;
    }

    final void a(int param0, wi param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Bounce.field_N;
        try {
          var3_int = -46 % ((-75 - param0) / 37);
          while (true) {
            var4 = param1.d((byte) -104);
            if (var4 == 0) {
              return;
            }
            this.a((byte) 18, param1, var4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ne.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        if (null != this.field_s) {
          for (var2 = 0; var2 < this.field_s.length; var2++) {
            this.field_s[var2] = ge.a(this.field_s[var2], 32768);
          }
        }
        if (param0 != 31680) {
          field_w = 9;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 <= var3_int &&
            12 >= var3_int) {
            var4 = ce.a(param0, param2 ^ -33);
            if (var4 != null &&
              var4.length() >= 1) {
              if (param2 != -33) {
                field_v = (tj) null;
              }
              if (!f.a(var4.charAt(0), false) &&
                !f.a(var4.charAt(-1 + var4.length()), false)) {
                var5 = 0;
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (f.a((char) var7, false)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param1) {
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
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("ne.G(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ve f(int param0) {
        if (param0 != 32768) {
          field_r = (bc) null;
        }
        return new ve(bb.a(param0 - 32880), ck.g((byte) 112));
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 < 90) {
          CharSequence var2 = (CharSequence) null;
          ne.a((CharSequence) null, false, (byte) 104);
        }
        field_v = null;
        field_m = null;
        field_r = null;
    }

    private final void a(byte param0, wi param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        eh var7 = null;
        int var9 = 0;
        var9 = Bounce.field_N;
        try {
          if (param0 != 18) {
            return;
          }
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param1.d((byte) -83);
              this.field_s = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_s[var5] = param1.a(-1640531527);
              }
            } else if (3 == param2) {
              var4_int = param1.d((byte) -69);
              this.field_t = new int[var4_int];
              this.field_o = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param1.a(-1640531527);
                var7 = jd.a(param0 + 21296, var6);
                if (var7 != null) {
                  this.field_t[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_o[var5] = array$0;
                  for (var8 = 0; var7.field_c > var8; var8++) {
                    this.field_o[var5][var8] = param1.a(-1640531527);
                  }
                }
              }
            } else {
              if (param2 == 4) {
                return;
              }
            }
          } else {
            this.field_p = di.a(-121, '<', param1.b(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ne.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    ne() {
    }

    static {
        field_w = 0;
        field_m = new int[8192];
        field_r = new bc();
        field_q = "Name is available";
    }
}
