/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ll extends ne {
    static boolean field_k;
    static md field_i;
    static String[] field_j;
    static nh field_r;
    static String field_s;
    ll field_n;
    static String[] field_m;
    static vk field_p;
    static String field_u;
    ll field_l;
    long field_o;
    static cn field_q;
    static String[] field_t;

    final static void a(int param0, byte[] param1, boolean param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        var5 = 0;
        L0: while (true) {
          if (gg.field_a.length <= var5) {
            if (!param2) {
              field_j = null;
              return;
            } else {
              return;
            }
          } else {
            param0 = gg.field_a[var5];
            var6 = var5 << -893721212;
            L1: while (true) {
              param0--;
              if (param0 == 0) {
                var5++;
                var5++;
                continue L0;
              } else {
                var6++;
                param3 = hf.field_yb[var6];
                param4[param1[param3]] = param4[param1[param3]] + 1;
                hf.field_yb[param4[param1[param3]]] = param3;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        rf.field_K = new fm(ck.field_H);
        le.field_b = new gn[25][];
        le.field_b[0] = lc.a(-27711, new String[2][]);
        le.field_b[1] = lc.a(-27711, new String[2][]);
        int var1 = -50 % ((30 - param0) / 40);
        le.field_b[2] = lc.a(-27711, new String[4][]);
        le.field_b[3] = lc.a(-27711, new String[2][]);
        le.field_b[4] = lc.a(-27711, new String[4][]);
        le.field_b[5] = lc.a(-27711, new String[3][]);
        le.field_b[6] = lc.a(-27711, new String[3][]);
        le.field_b[7] = lc.a(-27711, new String[4][]);
        le.field_b[8] = lc.a(-27711, new String[2][]);
        le.field_b[9] = lc.a(-27711, new String[2][]);
        le.field_b[10] = lc.a(-27711, new String[1][]);
        le.field_b[11] = lc.a(-27711, new String[1][]);
        le.field_b[12] = lc.a(-27711, new String[1][]);
        le.field_b[13] = lc.a(-27711, new String[1][]);
        le.field_b[14] = lc.a(-27711, new String[1][]);
        le.field_b[15] = lc.a(-27711, new String[1][]);
        le.field_b[16] = lc.a(-27711, new String[1][]);
        le.field_b[17] = lc.a(-27711, new String[1][]);
        le.field_b[18] = lc.a(-27711, new String[2][]);
        le.field_b[19] = lc.a(-27711, new String[2][]);
        le.field_b[20] = lc.a(-27711, new String[3][]);
        le.field_b[21] = lc.a(-27711, new String[1][]);
        le.field_b[22] = lc.a(-27711, new String[1][]);
        le.field_b[23] = lc.a(-27711, new String[4][]);
        le.field_b[24] = lc.a(-27711, new String[1][]);
        if (!(kd.field_c <= 25)) {
            kd.field_c = 0;
        }
        uo.field_f = le.field_b[kd.field_c];
        if (!(fc.field_d <= uo.field_f.length)) {
            fc.field_d = 0;
        }
        og.a(false, 0, uo.field_f[fc.field_d]);
    }

    final void b(byte param0) {
        if (((ll) this).field_l == null) {
          return;
        } else {
          ((ll) this).field_l.field_n = ((ll) this).field_n;
          if (param0 != -2) {
            field_t = null;
            ((ll) this).field_n.field_l = ((ll) this).field_l;
            ((ll) this).field_l = null;
            ((ll) this).field_n = null;
            return;
          } else {
            ((ll) this).field_n.field_l = ((ll) this).field_l;
            ((ll) this).field_l = null;
            ((ll) this).field_n = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_i = null;
        field_t = null;
        field_p = null;
        field_r = null;
        field_j = null;
        if (param0 != 92) {
          var2 = null;
          bo discarded$2 = ll.a((String) null, (byte) 100);
          field_u = null;
          field_q = null;
          field_s = null;
          field_m = null;
          return;
        } else {
          field_u = null;
          field_q = null;
          field_s = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        gf.b(param1, param4, param2 + 1, 10000536);
        gf.b(param1, param3 + param4, 1 + param2, 12105912);
        var5 = 1;
        var6 = param3;
        if (param0 != 2) {
          L0: {
            field_s = null;
            if (gf.field_f <= var5 + param4) {
              break L0;
            } else {
              var5 = -param4 + gf.field_f;
              break L0;
            }
          }
          L1: {
            if (var6 + param4 > gf.field_e) {
              var6 = -param4 + gf.field_e;
              break L1;
            } else {
              break L1;
            }
          }
          var7 = var5;
          L2: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 + var7 * 48 / param3;
              var9 = var8 | (var8 << -2059452152 | var8 << 959047280);
              gf.field_b[param1 + (param4 - -var7) * gf.field_i] = var9;
              gf.field_b[(var7 + param4) * gf.field_i + (param1 + param2)] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          L3: {
            if (gf.field_f <= var5 + param4) {
              break L3;
            } else {
              var5 = -param4 + gf.field_f;
              break L3;
            }
          }
          L4: {
            if (var6 + param4 > gf.field_e) {
              var6 = -param4 + gf.field_e;
              break L4;
            } else {
              break L4;
            }
          }
          var7 = var5;
          L5: while (true) {
            if (var6 <= var7) {
              return;
            } else {
              var8 = 152 + var7 * 48 / param3;
              var9 = var8 | (var8 << -2059452152 | var8 << 959047280);
              gf.field_b[param1 + (param4 - -var7) * gf.field_i] = var9;
              gf.field_b[(var7 + param4) * gf.field_i + (param1 + param2)] = var9;
              var7++;
              continue L5;
            }
          }
        }
    }

    final static boolean a(byte param0, Random param1, int[] param2, int[] param3) {
        int var4 = 0;
        if (param0 != -110) {
          return true;
        } else {
          var4 = uj.a(param1, 37, param3.length);
          return mo.a(param2, param3[var4], param1, (byte) -74);
        }
    }

    final static bo a(String param0, byte param1) {
        String var2 = null;
        bo var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = DungeonAssault.field_K;
        if (fk.field_v != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) (Object) param0;
              var2 = jm.a((byte) 59, var6);
              if (var2 != null) {
                var3 = (bo) (Object) fk.field_v.a((byte) 125, (long)var2.hashCode());
                L0: while (true) {
                  if (var3 == null) {
                    if (param1 == -47) {
                      return null;
                    } else {
                      ll.a((byte) 52);
                      return null;
                    }
                  } else {
                    var7 = (CharSequence) (Object) var3.field_Hb;
                    var4 = jm.a((byte) 59, var7);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (bo) (Object) fk.field_v.c((byte) 5);
                      continue L0;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    protected ll() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Magical Guardian";
        field_u = "Crusher";
        field_j = new String[]{null, "Another option is to <%flee>. If the raider survives at least one combat round, they may be able to escape the room (if they win a <%dodge> roll against the room's <%snare>), allowing you to send a different raider in to face it, or to seek a different route entirely.<br><br><%command>Select one of these strategies now.</col>"};
        field_i = new md();
        field_t = new String[]{"Ferocity", "The <%0> is able to channel his fury into a violent flurry of blows; during the first round of each combat, his <%attack> is doubled."};
    }
}
