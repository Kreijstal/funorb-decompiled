/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends cg {
    private hf field_l;
    private hf field_j;
    static String field_k;

    mk(hf param0, hf param1, hf param2) {
        super(param0);
        try {
          this.field_j = param2;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static te c(byte param0) {
        try {
          Throwable var1 = null;
          te stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 100) {
            mk.h(-40);
          }
          try {
            stackIn_3_0 = (te) (Class.forName("bh").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        int var1 = -52 / ((param0 - 43) / 36);
        field_k = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_l.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (te.a(param1, var5)) {
            stackIn_6_0 = s.field_b;
            return stackIn_6_0;
          }
          if (hi.a(var5, 0)) {
            stackIn_10_0 = hl.field_C;
            return stackIn_10_0;
          }
          if (lc.a((byte) -33, var5)) {
            stackIn_13_0 = ta.field_fb;
            return stackIn_13_0;
          }
          if (this.b(param0, 0)) {
            stackIn_16_0 = bj.field_u;
            return stackIn_16_0;
          }
          if (param1) {
            this.field_l = (hf) null;
          }
          if (var6.length() <= 0) {
            stackIn_34_0 = ll.field_g;
            return stackIn_34_0;
          }
          if (gi.a(var5, -123, var6)) {
            stackIn_23_0 = qi.field_F;
            return stackIn_23_0;
          }
          if (la.a(var6, (byte) -115, var5)) {
            stackIn_27_0 = i.field_b;
            return stackIn_27_0;
          }
          if (!g.a(var6, var5, -1)) {
            stackIn_32_0 = s.field_b;
            return stackIn_32_0;
          }
          stackIn_30_0 = qi.field_F;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("mk.I(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.applet.Applet g(int param0) {
        if (uh.field_i != null) {
          return uh.field_i;
        }
        if (param0 >= -116) {
          mk.a(-119, false, true, false);
          return (java.applet.Applet) ((Object) jj.field_a);
        }
        return (java.applet.Applet) ((Object) jj.field_a);
    }

    final static int h(int param0) {
        if (param0 != -1) {
          mk.b((byte) -72);
          return mh.field_b;
        }
        return mh.field_b;
    }

    final sg a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sg stackIn_4_0 = null;
        sg stackIn_8_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -58) {
            this.field_l = (hf) null;
          }
          var3 = this.field_l.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = pe.field_b;
            return stackIn_4_0;
          }
          if (!f.a(var4, 125, var3)) {
            stackIn_8_0 = pe.field_b;
            return stackIn_8_0;
          }
          if (!this.b(param0, 0)) {
            stackIn_13_0 = ii.field_e;
            return stackIn_13_0;
          }
          stackIn_11_0 = pe.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mk.M(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_j = (hf) null;
          }
          var3 = this.field_j.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (0 <= var4.indexOf(var6)) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mk.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param0 >= 106) {
          var4 = 0;
          if (param2) {
            var4 += 4;
          }
          if (param1) {
            var4 += 2;
          }
          if (param3) {
            var4++;
          }
          return bf.field_d[var4];
        }
        mk.c((byte) -75);
        var4Lifetime1 = 0;
        if (param2) {
          var4Lifetime1 += 4;
        }
        if (param1) {
          var4Lifetime1 += 2;
        }
        if (param3) {
          var4Lifetime1++;
        }
        return bf.field_d[var4Lifetime1];
    }

    static {
    }
}
