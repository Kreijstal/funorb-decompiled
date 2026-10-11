/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends ei {
    static String field_r;
    static nh field_t;
    static ok field_q;
    static String field_p;
    private kl field_u;
    private kl field_w;
    static he[] field_v;
    static he[] field_s;

    final static boolean a(vj param0, byte param1, vj param2, vj param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.a(0) &&
            param3.a(255, "commonui")) {
            if (param1 > -53) {
              field_v = (he[]) null;
            }
            if (param2.a(0) &&
              param2.a(255, "commonui")) {
              if (!param0.a(0)) {
                return false;
              }
              if (!param0.a(255, "button.gif")) {
                return false;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ad.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    ad(kl param0, kl param1, kl param2) {
        super(param0);
        try {
          this.field_u = param1;
          this.field_w = param2;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_u.field_p.toLowerCase();
          if (param0 <= 47) {
            field_q = (ok) null;
          }
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (kj.a(var5, (byte) 59)) {
            stackIn_7_0 = nj.field_e;
            return stackIn_7_0;
          }
          if (oi.a(8975, var5)) {
            stackIn_11_0 = (String) (field_p);
            return stackIn_11_0;
          }
          if (g.b((byte) 111, var5)) {
            stackIn_15_0 = rg.field_b;
            return stackIn_15_0;
          }
          if (this.b(-113, param1)) {
            stackIn_18_0 = rd.field_E;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_33_0 = ae.field_jb;
            return stackIn_33_0;
          }
          if (rb.a(var6, var5, -1)) {
            stackIn_22_0 = nj.field_c;
            return stackIn_22_0;
          }
          if (gk.a(-1, var6, var5)) {
            stackIn_26_0 = vg.field_x;
            return stackIn_26_0;
          }
          if (!pc.a((byte) -115, var6, var5)) {
            stackIn_31_0 = nj.field_e;
            return stackIn_31_0;
          }
          stackIn_29_0 = nj.field_c;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static hg a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hg var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        hg stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (null == vg.field_j) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = rh.a(-115, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (hg) (vg.field_j.a((long)var2.hashCode(), -122));
          while (true) {
            if (var3 == null) {
              var4 = -26 / ((25 - param1) / 55);
              stackIn_15_0 = null;
              return (hg) (stackIn_15_0);
            }
            var7 = (CharSequence) ((Object) var3.field_V);
            var4_ref_String = rh.a(125, var7);
            if (var4_ref_String == null) {
              var4_ref_String = var3.field_V;
            }
            if (!var4_ref_String.equals(var2)) {
              var3 = (hg) (vg.field_j.b(-1));
              continue;
            }
            break;
          }
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("ad.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final vh a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vj var5 = null;
        vh stackIn_4_0 = null;
        vh stackIn_7_0 = null;
        vh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8192) {
            var5 = (vj) null;
            ad.a((vj) null, (byte) -70, (vj) null, (vj) null);
          }
          var3 = this.field_u.field_p.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_4_0 = u.field_b;
            return stackIn_4_0;
          }
          if (!u.a(var4, false, var3)) {
            stackIn_7_0 = u.field_b;
            return stackIn_7_0;
          }
          if (!this.b(116, param1)) {
            return ce.field_e;
          }
          stackIn_11_0 = u.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ad.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_w.field_p.toLowerCase();
          var4 = 88 % ((param0 - 35) / 57);
          var5 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var5.length() > 0) {
            var6 = var3.lastIndexOf("@");
            if (var6 >= 0 &&
              -1 + var3.length() > var6) {
              var7 = var3.substring(0, var6);
              var8 = var3.substring(1 + var6);
              if (0 <= var5.indexOf(var7)) {
                return true;
              }
              if (var5.indexOf(var8) < 0) {
                return false;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        field_q = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
          field_s = (he[]) null;
        }
    }

    static {
        field_r = "Type your email address again to make sure it's correct";
        field_t = null;
        field_p = "Passwords can only contain letters and numbers";
    }
}
