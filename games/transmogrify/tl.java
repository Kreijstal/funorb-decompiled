/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_a;
    static int field_c;
    private wf field_b;
    private qj field_e;
    static int field_d;

    final wf a(wf param0, boolean param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        wf stackIn_9_0 = null;
        wf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_e.field_d.field_f;
          }
          if (this.field_e.field_d == var3) {
            this.field_b = null;
            stackIn_6_0 = null;
            return (wf) (stackIn_6_0);
          }
          this.field_b = var3.field_f;
          if (param1) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = (wf) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tl.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final wf a(byte param0) {
        wf var2 = this.field_e.field_d.field_f;
        if (var2 == this.field_e.field_d) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_f;
        if (param0 != 62) {
          field_d = 49;
        }
        return var2;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = 0;
          var4 = qa.field_u;
          if (param0 != 196077633) {
            tl.a(-62, -114L);
          }
          while (var3_int < qb.field_f.length) {
            var5 = ce.field_a[var3_int];
            if (var5 < 0) {
              var4 = var4 + fi.field_x;
            } else {
              var6 = uc.a(qb.field_f[var3_int], false, true);
              var7 = -(var6 >> 1) + wd.field_j;
              var4 = var4 + ee.field_D;
              if (q.a(param2, (byte) 12, var4, (jl.field_o << 1) + hi.field_c, param1, var7 - vh.field_m, var6 + (vh.field_m << 1))) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (ee.field_D + ((jl.field_o << 1) + hi.field_c));
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "tl.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final wf c(int param0) {
        wf var2 = this.field_e.field_d.field_b;
        if (var2 == this.field_e.field_d) {
          this.field_b = null;
          return null;
        }
        if (param0 >= -86) {
          this.b(116);
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_6_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_e.field_d.field_b;
          }
          if (var3 == this.field_e.field_d) {
            this.field_b = null;
            stackIn_6_0 = null;
            return (wf) (stackIn_6_0);
          }
          this.field_b = var3.field_b;
          if (param1 != 95) {
            var4 = (String) null;
            tl.a((String) null, 56);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("tl.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, long param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (param1 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param1;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = cc.field_g[(int)(-(param1 * 37L) + var7)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        if (param0 != 11468) {
          field_d = 39;
        }
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        q var5 = null;
        q stackIn_4_0 = null;
        q stackIn_8_0 = null;
        q stackIn_11_0 = null;
        q stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = ai.field_a;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = lb.a(var3, 5507);
            if (param1 != 2993) {
              stackIn_11_0 = (q) null;
              return stackIn_11_0;
            }
            if (var5 == null) {
              return mh.a(var4, 46);
            }
            stackIn_15_0 = var5;
            return stackIn_15_0;
          }
          stackIn_4_0 = cj.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("tl.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static am a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        am var9 = null;
        RuntimeException var9_ref = null;
        am stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new am(param7, param6, param8, param0, param4, param5, param2);
          ec.field_b.a(var9, -104);
          ei.a(true, param3, var9);
          if (param1 <= 31) {
            field_a = true;
          }
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("tl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final wf a(int param0) {
        wf var2 = this.field_b;
        if (this.field_e.field_d == var2) {
          this.field_b = null;
          return null;
        }
        if (param0 != 405142401) {
          this.field_e = (qj) null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final wf b(int param0) {
        if (param0 != -29339) {
          return (wf) null;
        }
        wf var2 = this.field_b;
        if (var2 == this.field_e.field_d) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_f;
        return var2;
    }

    tl(qj param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = false;
    }
}
