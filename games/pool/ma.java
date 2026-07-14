/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma {
    static String field_f;
    static String field_j;
    static int field_g;
    ma field_k;
    static bl[][][] field_b;
    long field_c;
    static vh field_e;
    static int[] field_h;
    static jg field_a;
    static ko field_i;
    ma field_d;

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 56) {
          ma.b((byte) -106);
          field_b = null;
          field_a = null;
          field_h = null;
          field_j = null;
          field_i = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_h = null;
          field_j = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        if (((ma) this).field_k != null) {
          ((ma) this).field_k.field_d = ((ma) this).field_d;
          ((ma) this).field_d.field_k = ((ma) this).field_k;
          ((ma) this).field_d = null;
          if (param0 != -117) {
            var3 = null;
            ma.a(97, (int[]) null, (int[]) null);
            ((ma) this).field_k = null;
            return;
          } else {
            ((ma) this).field_k = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int[] param1, int[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        L0: {
          var3 = -param2[0] + param1[0];
          var4 = param1[1] + -param2[1];
          var5 = param1[2] + -param2[param0];
          var6 = var5 * param2[5] + param2[4] * var4 + var3 * param2[3] >> -1504745840;
          var7 = var4 * param2[7] + var3 * param2[6] - -(param2[8] * var5) >> 1109184304;
          var8 = var5 * param2[11] + var3 * param2[9] - -(param2[10] * var4) >> 320678896;
          var9 = rf.a(var7 * var7 + var8 * var8 >> -247526416, -125);
          if (var9 < 0) {
            var9 = -var9;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          br.field_I = 128 + (tj.c(var9, var6, param0 ^ 4098) >> -897266236);
          var10 = bm.a(-112, (long)var7 * (long)var7 + ((long)var6 * (long)var6 + (long)var8 * (long)var8) >> 1426161424);
          if ((var10 ^ -1L) < ((long)re.field_a ^ -1L)) {
            mn.field_g = (int)((long)(256 * ue.field_e) / ((long)ue.field_e + ((long)ap.field_G * (var10 + -(long)re.field_a) >> 238097352)));
            break L1;
          } else {
            mn.field_g = 256;
            break L1;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 <= -106) {
          if (((ma) this).field_k == null) {
            return false;
          } else {
            return true;
          }
        } else {
          ((ma) this).field_c = -125L;
          if (((ma) this).field_k == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Inviting <%0>";
    }
}
