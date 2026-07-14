/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends en {
    private String field_d;
    private String field_g;
    static cn field_f;
    private String field_e;

    final static hl a(int param0, boolean param1, String param2, String param3) {
        CharSequence var7 = null;
        if (param0 <= 46) {
            field_f = null;
        }
        long var4 = 0L;
        String var6 = null;
        if ((param3.indexOf('@') ^ -1) != 0) {
            var6 = param3;
        } else {
            var7 = (CharSequence) (Object) param3;
            var4 = ci.a(var7, 2);
        }
        return l.a(param2, false, var4, param1, var6);
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = DungeonAssault.field_K;
          var2 = param0.length();
          if ((var2 ^ -1) < -21) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        if (param1 == -1) {
          L1: while (true) {
            if (var4 >= var2) {
              return new String(var8);
            } else {
              L2: {
                var5 = param0.charAt(var4);
                if (var5 < 65) {
                  break L2;
                } else {
                  if (90 < var5) {
                    break L2;
                  } else {
                    var3[var4] = (char)(-65 + (var5 + 97));
                    var4++;
                    continue L1;
                  }
                }
              }
              L3: {
                L4: {
                  if (var5 < 97) {
                    break L4;
                  } else {
                    if (var5 <= 122) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 48) {
                    break L5;
                  } else {
                    if (var5 > 57) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                continue L1;
              }
              var3[var4] = (char)var5;
              var4++;
              continue L1;
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != -21) {
            Object var2 = null;
            hl discarded$0 = qf.a(94, true, (String) null, (String) null);
        }
        field_f = null;
    }

    final cn b(byte param0) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        if (((qf) this).field_d == null) {
            return null;
        }
        jh.c();
        String[] var12 = jn.a(ck.field_H.a(((qf) this).field_d, (byte) -48), new int[1], -63, (se) (Object) db.field_v);
        String[] var2 = var12;
        int var3 = var12.length;
        int var4 = db.field_v.field_E + db.field_v.field_H * var3;
        int var5 = db.field_v.field_H;
        cn var6 = new cn(200, var4);
        int var7 = -48 / ((param0 - -58) / 35);
        var6.e();
        String[] var8 = var12;
        for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            db.field_v.c(var10, 100, var5, 16777215, -1);
            var5 = var5 + db.field_v.field_H;
        }
        jh.b();
        return var6;
    }

    qf(String param0, String param1, String param2) {
        ((qf) this).field_g = param1;
        ((qf) this).field_d = param2;
        ((qf) this).field_e = param0;
    }

    private final cn a(byte param0, int param1) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        jh.c();
        String[] var12 = jn.a(ck.field_H.a(((qf) this).field_g, (byte) -48), new int[1], -83, (se) (Object) la.field_b);
        String[] var3 = var12;
        int var4 = var12.length;
        int var5 = var4 * la.field_b.field_H + la.field_b.field_E;
        int var6 = la.field_b.field_H;
        if (((qf) this).field_e != null) {
            var5 = var5 + 2 * la.field_b.field_H;
        }
        cn var7 = new cn(param1, var5);
        if (param0 <= 22) {
            return null;
        }
        var7.e();
        if (!(null == ((qf) this).field_e)) {
            db.field_v.c(ck.field_H.a(((qf) this).field_e, (byte) -48), param1 >> -940601919, var6, 16777215, -1);
            var6 = var6 + la.field_b.field_H * 2;
        }
        String[] var8 = var12;
        for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            la.field_b.c(var10, param1 >> -133130303, var6, 16777215, -1);
            var6 = var6 + la.field_b.field_H;
        }
        jh.b();
        return var7;
    }

    qf(String param0, String param1) {
        this(param0, param1, param0);
    }

    final void a(int param0, sa param1) {
        if (param0 != 0) {
            cn discarded$0 = this.a((byte) -60, 34);
        }
        cn var3 = this.a((byte) 32, -40 + param1.field_b);
        param1.a(var3, var3.field_v + 8, false, 112, -la.field_b.field_H + param1.field_y >> 1009028737);
    }

    static {
    }
}
