/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends ob {
    static jea field_o;

    final static void c(byte param0) {
        int var1 = -20 % ((64 - param0) / 44);
        vaa.field_b = bva.b((byte) -107);
        gp.field_h = 0;
    }

    final void a(byte param0, float param1) {
        ((jq) this).field_j = param1;
        if (param0 <= 77) {
            field_o = null;
        }
    }

    final void a(byte param0, int param1) {
        ((jq) this).field_h = param1;
        if (param0 != 62) {
            field_o = null;
        }
    }

    final static void a(int param0, byte param1) {
        kh var2 = ql.field_k;
        var2.k(param0, -2988);
        var2.field_h = var2.field_h + 1;
        int var3 = var2.field_h;
        var2.i(2, 0);
        var2.a(0, vk.field_b, vk.field_b.length, 71);
        int var4 = -104 % ((param1 - 22) / 36);
        var2.i(aja.field_H, 0);
        var2.i(mua.field_b, 0);
        var2.a(0, tqa.field_e, tqa.field_e.length, 119);
        var2.d(var2.field_h - var3, (byte) -102);
    }

    final static qk a(byte[] param0, int param1, byte param2, int param3, cka param4, int param5, boolean param6, int param7) {
        Object var9 = null;
        if (param2 > 52) {
          if (!param4.field_Gb) {
            if (!cla.a(9181, param5)) {
              if (!param4.field_Cc) {
                return new qk(param4, param3, param5, param7, lla.a(false, param5), lla.a(false, param7), param0, param1);
              } else {
                return new qk(param4, 34037, param3, param5, param7, param6, param0, param1);
              }
            } else {
              if (!cla.a(9181, param7)) {
                if (!param4.field_Cc) {
                  return new qk(param4, param3, param5, param7, lla.a(false, param5), lla.a(false, param7), param0, param1);
                } else {
                  return new qk(param4, 34037, param3, param5, param7, param6, param0, param1);
                }
              } else {
                return new qk(param4, 3553, param3, param5, param7, param6, param0, param1);
              }
            }
          } else {
            return new qk(param4, 3553, param3, param5, param7, param6, param0, param1);
          }
        } else {
          var9 = null;
          qk discarded$1 = jq.a((byte[]) null, 99, (byte) 8, -3, (cka) null, -12, false, 23);
          if (!param4.field_Gb) {
            if (cla.a(9181, param5)) {
              if (!cla.a(9181, param7)) {
                if (!param4.field_Cc) {
                  return new qk(param4, param3, param5, param7, lla.a(false, param5), lla.a(false, param7), param0, param1);
                } else {
                  return new qk(param4, 34037, param3, param5, param7, param6, param0, param1);
                }
              } else {
                return new qk(param4, 3553, param3, param5, param7, param6, param0, param1);
              }
            } else {
              if (!param4.field_Cc) {
                return new qk(param4, param3, param5, param7, lla.a(false, param5), lla.a(false, param7), param0, param1);
              } else {
                return new qk(param4, 34037, param3, param5, param7, param6, param0, param1);
              }
            }
          } else {
            return new qk(param4, 3553, param3, param5, param7, param6, param0, param1);
          }
        }
    }

    final void a(int param0, int param1) {
        ((jq) this).field_g = param1;
        if (param0 != 255) {
            field_o = null;
        }
    }

    jq(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void d(byte param0) {
        if (param0 != -112) {
            return;
        }
        field_o = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((jq) this).field_k = param1;
        int var5 = 97 % ((param2 - -55) / 58);
        ((jq) this).field_m = param0;
        ((jq) this).field_l = param3;
    }

    static {
    }
}
