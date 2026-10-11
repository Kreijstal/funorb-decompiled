/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static int field_f;
    static String field_d;
    static boolean[] field_a;
    static String field_e;
    private String field_c;
    static ko field_g;
    private boolean field_b;

    rh(String param0) {
        this(param0, false);
    }

    final String a(byte param0) {
        if (param0 != -108) {
          field_a = (boolean[]) null;
        }
        return this.field_c;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 15157) {
          return;
        }
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final boolean a(int param0) {
        if (param0 >= -101) {
          field_a = (boolean[]) null;
        }
        return this.field_b;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(uf.field_c);
          param1.removeFocusListener(uf.field_c);
          bo.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "rh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        dl var1 = null;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dl var6 = null;
        dl var7 = null;
        dl var8 = null;
        int var3Lifetime1;
        var4 = CrazyCrystals.field_B;
        try {
          kh.c(243, 197, 369, 143, 16777215);
          kh.f(244, 198, 367, 141, 0);
          if (null == nl.field_f) {
            if (null != rn.field_k) {
              rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = nl.field_f[ue.field_a];
          var1 = var6;
          if (var6 != null) {
            var6.a(245, 199);
          } else {
            if (null != rn.field_k) {
              rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (param0) {
            field_f = -64;
          }
          if (h.field_b > mb.field_f) {
            var7 = nl.field_f[rd.field_f];
            if (var7 != null) {
              var2_int = mb.field_f * (var7.field_n + 60) / h.field_b;
              var3 = var2_int - 30;
              if (!ve.field_t) {
                pc.a(199, 617553576, 256 * (-var3 + var7.field_n) / 30, var7, -256 * var3 / 30, 245);
              } else {
                pc.a(199, 617553576, var3 * -256 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
              }
            }
          }
          if (rn.field_k != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < nl.field_f.length) {
              var8 = nl.field_f[var5];
              if (var8 != null && (var8.field_n != 365 ||
                var8.field_o != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            rn.field_k.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "rh.F(" + param0 + ')');
        }
    }

    final static rh b(int param0) {
        if (param0 != 365) {
          field_e = (String) null;
        }
        String var1 = vg.b((byte) -29);
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        return new rh(vg.b((byte) -29), lk.b(param0 - 359));
    }

    rh(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          stackIn_4_1 = (param1);
          this.field_b = stackIn_4_1;
          if (null == this.field_c) {
            this.field_c = "";
          }
          if (this.field_c.length() == 0) {
            this.field_b = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("rh.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "One-Player Puzzles";
        field_e = "Loading levels";
    }
}
