/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends wf {
    int field_h;
    private int field_g;
    private int[] field_j;
    private static int[] field_f;
    boolean field_e;
    int field_i;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          L2: {
            if (field_f == null) {
              break L2;
            } else {
              if (field_f.length == ((ui) this).field_j.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          field_f = new int[((ui) this).field_j.length];
          break L1;
        }
        var3 = ((ui) this).field_j.length;
        var4 = param0;
        var5 = ((ui) this).field_g - 1;
        var6 = ((ui) this).field_g * param1;
        var7 = var3 - 1;
        var8_int = 0;
        L3: while (true) {
          if (var8_int >= var3) {
            var8 = ((ui) this).field_j;
            ((ui) this).field_j = field_f;
            field_f = var8;
            return;
          } else {
            var9 = var8_int + var6 & var7;
            var10 = 0;
            L4: while (true) {
              if (var10 >= ((ui) this).field_g) {
                var8_int = var8_int + ((ui) this).field_g;
                continue L3;
              } else {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_f[var11] = ((ui) this).field_j[var12];
                var10++;
                continue L4;
              }
            }
          }
        }
    }

    public static void a() {
        field_f = null;
    }

    private ui() throws Throwable {
        throw new Error();
    }
}
