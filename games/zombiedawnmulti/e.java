/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e implements Iterable {
    static String field_f;
    qa field_d;
    static int field_a;
    static nm field_e;
    static String field_b;
    static fm field_c;

    final static void a(ul param0, byte[] param1, int param2, String[] param3, int[] param4, int param5, ja[][] param6, String[] param7, boolean param8, String[][] param9, int param10, String[][] param11, ul param12, byte[] param13, int[] param14, ri[] param15, ja[][] param16, ul param17, boolean param18) {
        if (!param8) {
            field_e = null;
        }
        Object var20 = null;
        vb.a(param10, param11, (String[]) null, param3, param18, param9, param4, param7, param1, param17, param14, 1, param6, param5, param0, false, param16, param12, param13, param15);
    }

    final void a(qa param0, byte param1) {
        if (!(param0.field_p == null)) {
            param0.a(-4564);
        }
        if (param1 < 72) {
            return;
        }
        param0.field_k = ((e) this).field_d;
        param0.field_p = ((e) this).field_d.field_p;
        param0.field_p.field_k = param0;
        param0.field_k.field_p = param0;
    }

    final static void a(byte param0, ri param1) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 != (3 & (param1.field_h | (param1.field_b | param1.field_e | param1.field_j)) ^ -1)) {
          var2 = param1.field_e - -(param1.field_j & 3);
          var2 = 4 + (-(var2 & 3) + var2);
          var3 = (param1.field_h & 3) + param1.field_b;
          var3 = 4 - (3 & var3) + var3;
          var4 = new byte[var3 * var2];
          var5 = 0;
          var6 = var2 * (param1.field_h & 3) + (3 & param1.field_j);
          if (param0 == 48) {
            var7 = 0;
            L0: while (true) {
              if (var7 >= param1.field_b) {
                param1.field_e = var2;
                param1.field_j = param1.field_j & -4;
                param1.field_h = param1.field_h & -4;
                param1.field_b = var3;
                param1.field_m = var4;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (param1.field_e <= var8) {
                    var6 = var6 + (-param1.field_e + var2);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_m[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final qa a(boolean param0) {
        qa var2 = ((e) this).field_d.field_k;
        if (var2 == ((e) this).field_d) {
            return null;
        }
        var2.a(-4564);
        if (param0) {
            return null;
        }
        return var2;
    }

    public static void a(int param0) {
        int var1 = -114 / ((63 - param0) / 51);
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ln((e) this);
    }

    e() {
        ((e) this).field_d = new qa();
        ((e) this).field_d.field_p = ((e) this).field_d;
        ((e) this).field_d.field_k = ((e) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Blow them to smithereens.";
        field_b = "Return to Main Menu";
    }
}
