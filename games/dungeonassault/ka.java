/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    private static int[] field_a;
    static int field_c;
    static String[] field_b;
    static String[] field_d;

    final static void a(int param0) {
        nf.field_y = -1;
        of.field_k = true;
        ed var4 = eh.field_o;
        ed var5 = var4;
        eh.field_o.field_N = false;
        var5.field_w = false;
        og.field_e.field_N = true;
        ed var2 = og.field_e;
        var2.field_w = true;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        field_a = new int[98304];
        var0 = 92682;
        L0: while (true) {
          if (var0 < 46341) {
            field_d = new String[]{null, "When a raider encounters a trap, one of several things may happen. The raider may be able to <%highlight>disarm</col> the trap without triggering it - (if your raider's <%sneak> roll beats that of the room's <%detect>).<br><br>If they are unable to <%highlight>disarm</col> it, the trap will be triggered, but an agile <%raider> (that wins a <%dodge> roll against the <%trap>'s <%snare>) may be able to avoid injury. Otherwise, it will be subject to the effects of the trap.<br><br><%command>Click the shield icon (at the bottom-right) to attempt to disarm this trap.</command>"};
            field_c = 0;
            field_b = new String[]{"6M Crew Member", "Victorius Ultima", "Crystal Monarch", "Starship Commando", "Relentless 2", "Mega Champion", "Insane Pilot", "Master of Magic", "Arch Mage", "Stench of Corruption"};
            return;
          } else {
            L1: {
              var6 = (long)(1 + (var0 << 1));
              var4 = (long)((var0 << 1) + -1);
              var2 = (int)(-32768L + (var4 * var4 >> 18));
              var3 = (int)(-32768L + (var6 * var6 >> 18));
              if (var3 < field_a.length) {
                break L1;
              } else {
                var3 = -1 + field_a.length;
                break L1;
              }
            }
            L2: {
              if (var2 >= 0) {
                stackOut_6_0 = var2;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var1 = stackIn_7_0;
            L3: while (true) {
              if (var1 > var3) {
                var0--;
                continue L0;
              } else {
                field_a[var1] = var0;
                var1++;
                continue L3;
              }
            }
          }
        }
    }
}
