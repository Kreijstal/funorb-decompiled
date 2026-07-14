/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends qm {
    private ml field_P;
    private int field_Q;
    static bb field_O;
    static String field_N;

    final void a(int param0, int param1, int param2, ng param3) {
        ((vc) this).field_Q = ((vc) this).field_Q + 1;
        if (param0 != 40) {
          field_N = null;
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        } else {
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        }
    }

    final String b(byte param0) {
        if (((vc) this).field_D) {
            return ((vc) this).field_P.b((byte) -7);
        }
        if (param0 > 16) {
            return null;
        }
        field_N = null;
        return null;
    }

    final boolean a(ng param0, int param1) {
        if (param1 != 27) {
            ((vc) this).field_P = null;
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, sb param3, int param4, sb param5, int param6, int param7, int param8, jl param9, int param10, int param11, int param12, sb param13, int param14, jl param15, byte param16, int param17, int param18, int param19, int param20) {
        dj.a((byte) -109, param15, param9, param6);
        jj.a(param17, false, param0, param7, param18);
        op.b(param8, param20, true);
        lg.a(param5, param2, -118, param3, param4, param1);
        pb.a(param12, param13, 16, param10);
        ll.a((byte) -113, param19, param11, param14);
        int var21 = -33 / ((param16 - 20) / 57);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tf var14 = null;
        tf var15 = null;
        tf var16 = null;
        tf var17 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, (byte) 125);
        if (param1 == 0) {
          var6 = -40 / ((param3 - 70) / 49);
          var5 = (((vc) this).field_E >> 317851265) + param2 + ((vc) this).field_z;
          var7 = (((vc) this).field_C >> -2008650559) + (((vc) this).field_p + param0);
          var9 = ((vc) this).field_P.a((byte) 110);
          if (uo.field_b == var9) {
            var17 = ha.field_g[0];
            var10 = var17.field_A << -1110954975;
            var11 = var17.field_B << -918288095;
            if (null != u.field_k) {
              if (var10 <= u.field_k.field_F) {
                if (u.field_k.field_E >= var11) {
                  h.a(-71, u.field_k);
                  t.d();
                  var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                ia.a((byte) 92);
                u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                return;
              }
            } else {
              u.field_k = new tf(var10, var11);
              h.a(-83, u.field_k);
              var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
              ia.a((byte) 92);
              u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
              return;
            }
          } else {
            if (var9 != tg.field_j) {
              if (var9 != sk.field_a) {
                if (qk.field_g != var9) {
                  return;
                } else {
                  var15 = ha.field_g[1];
                  var15.b(-(var15.field_F >> 606297409) + var5, var7 - (var15.field_E >> 1826444161), 256);
                  return;
                }
              } else {
                var14 = ha.field_g[2];
                var14.b(var5 + -(var14.field_F >> -249940383), -(var14.field_E >> 1066855265) + var7, 256);
                return;
              }
            } else {
              var16 = ha.field_g[0];
              var10 = var16.field_A << -1110954975;
              var11 = var16.field_B << -918288095;
              if (null != u.field_k) {
                if (var10 <= u.field_k.field_F) {
                  if (u.field_k.field_E >= var11) {
                    h.a(-71, u.field_k);
                    t.d();
                    var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                    ia.a((byte) 92);
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  } else {
                    u.field_k = new tf(var10, var11);
                    h.a(-83, u.field_k);
                    var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                    ia.a((byte) 92);
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  }
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -((vc) this).field_Q << 1685817834, 4096);
                ia.a((byte) 92);
                u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 > -84) {
          var2 = null;
          vc.a(16, 19, 82, (sb) null, 15, (sb) null, -91, -16, 3, (jl) null, 119, -31, -67, (sb) null, -69, (jl) null, (byte) 15, -5, 94, -75, -69);
          field_N = null;
          field_O = null;
          return;
        } else {
          field_N = null;
          field_O = null;
          return;
        }
    }

    vc(ml param0) {
        ((vc) this).field_P = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new bb();
        field_N = "Connection timed out. Please try using a different server.";
    }
}
