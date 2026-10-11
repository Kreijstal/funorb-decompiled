/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends pu {
    static String field_l;

    final static void c(int param0) {
        int var1 = -52 % ((-35 - param0) / 52);
        if (null == ms.field_u) {
          bga.field_m = null;
          ms.field_u = null;
          return;
        }
        if (null != ms.field_u.field_g) {
          ms.field_u.field_g.field_t = false;
          bga.field_m = null;
          ms.field_u = null;
          return;
        }
        bga.field_m = null;
        ms.field_u = null;
    }

    final static nea a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        nea stackIn_13_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (fq.field_s == null) {
            stackIn_3_0 = null;
            return (nea) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = fq.a(0, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (nea) (fq.field_s.a((long)var2.hashCode(), (byte) -87));
          while (true) {
            if (var3 == null) {
              if (param1 < -110) {
                return null;
              }
              di.b(-9);
              stackIn_18_0 = null;
              return (nea) (stackIn_18_0);
            }
            var7 = (CharSequence) ((Object) var3.field_xb);
            var4 = fq.a(0, var7);
            if (var4 == null) {
              var4 = var3.field_xb;
            }
            if (!var4.equals(var2)) {
              var3 = (nea) (fq.field_s.a((byte) -31));
              continue;
            }
            break;
          }
          stackIn_13_0 = var3;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("di.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (qq.field_l != null) {
          return true;
        }
        if (vb.field_j.a("benefits", 20637)) {
          qq.field_l = hca.a("benefits", vb.field_j, param0 ^ -90, "members_benefits_borders");
          st.field_c = hca.a("benefits", vb.field_j, 101, "members_benefits_price");
          f.field_c = hca.a("benefits", vb.field_j, param0 - 167, "members_benefits_logo");
          ik.field_l = gw.a("benefits", "members_benefits_screenshots", vb.field_j, param0 - 143);
          pp.a(qk.field_k, -84, qq.field_l);
          gd.a(param0, -2400, 40, (byte) -85, st.field_c, 16744576, 80, 2, aha.field_D, 80, 15);
          oi.a(3, ik.field_l);
          kl.a((byte) 94, f.field_c);
          return true;
        }
        return false;
    }

    final static void a(boolean param0, int param1) {
        cq var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        cq var2Lifetime1;
        var3 = BachelorFridge.field_y;
        try {
          b.field_u = param1;
          if (!param0) {
            return;
          }
          var2 = (cq) (rma.field_d.b((byte) 90));
          while (var2 != null) {
            if (!var2.field_h.a((byte) -106)) {
              var2.a(false);
            } else {
              var2.field_i.f(var2.field_f * b.field_u + 128 >> 8);
            }
            var2 = (cq) (rma.field_d.c(0));
          }
          if (jha.field_i != null) {
            var2Lifetime1 = (cq) (jha.field_i.b((byte) 90));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_h.a((byte) -106);
              if (stackIn_14_0) {
                var2Lifetime1.field_i.f(var2Lifetime1.field_f * b.field_u + 128 >> 8);
              } else {
                var2Lifetime1.a(false);
              }
              var2Lifetime1 = (cq) (jha.field_i.c(0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "di.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != -53) {
          di.a(false, 44);
          field_l = null;
          return;
        }
        field_l = null;
    }

    static {
        field_l = "CONTINUE";
    }
}
