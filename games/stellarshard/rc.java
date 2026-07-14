/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends ci {
    static int field_h;
    private long field_g;
    static String[] field_e;
    static String field_f;
    private int field_l;
    private int field_i;
    private long field_j;
    private long[] field_o;
    static int[] field_k;
    static int field_m;
    private long field_n;

    private final long b(byte param0) {
        int var8 = 0;
        int var9 = stellarshard.field_B;
        long var2 = System.nanoTime();
        long var4 = var2 + -((rc) this).field_j;
        ((rc) this).field_j = var2;
        if (-5000000000L < var4) {
            if (!((var4 ^ -1L) <= -5000000001L)) {
                ((rc) this).field_o[((rc) this).field_l] = var4;
                if (((rc) this).field_i < 1) {
                    ((rc) this).field_i = ((rc) this).field_i + 1;
                }
                ((rc) this).field_l = (1 + ((rc) this).field_l) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((rc) this).field_i; var8++) {
            var6 = var6 + ((rc) this).field_o[(10 + ((rc) this).field_l + -var8) % 10];
        }
        if (param0 != 51) {
            int discarded$0 = ((rc) this).a(false, 51L);
        }
        return var6 / (long)((rc) this).field_i;
    }

    public static void d(int param0) {
        field_k = null;
        field_f = null;
        field_e = null;
        if (param0 != 23805) {
            Object var2 = null;
            String discarded$0 = rc.a(true, 103, (CharSequence) null);
        }
    }

    final int a(boolean param0, long param1) {
        int var5 = stellarshard.field_B;
        if (!param0) {
            return -54;
        }
        if ((((rc) this).field_g ^ -1L) < (((rc) this).field_n ^ -1L)) {
            ((rc) this).field_j = ((rc) this).field_j + (((rc) this).field_g + -((rc) this).field_n);
            ((rc) this).field_n = ((rc) this).field_n + (-((rc) this).field_n + ((rc) this).field_g);
            ((rc) this).field_g = ((rc) this).field_g + param1;
            return 1;
        }
        int var4 = 0;
        do {
            ((rc) this).field_g = ((rc) this).field_g + param1;
            var4++;
            // if_icmpge L118
        } while (((rc) this).field_n > ((rc) this).field_g);
        if (!(((rc) this).field_n <= ((rc) this).field_g)) {
            ((rc) this).field_g = ((rc) this).field_n;
        }
        return var4;
    }

    final static int a(byte param0, int param1) {
        if (!((param1 ^ -1) != -16711936)) {
            return 0;
        }
        if (param0 != -61) {
            Object var3 = null;
            rc.a((String) null, (String) null, false);
        }
        return (15 & param1 >> 614291140) + ((param1 & 61440) >> 802981352);
    }

    final long b(int param0) {
        ((rc) this).field_n = ((rc) this).field_n + this.b((byte) 51);
        if (param0 != 30393) {
            Object var3 = null;
            rc.a((String) null, (String) null, true);
        }
        if (!((((rc) this).field_g ^ -1L) >= (((rc) this).field_n ^ -1L))) {
            return (-((rc) this).field_n + ((rc) this).field_g) / 1000000L;
        }
        return 0L;
    }

    final void a(byte param0) {
        if ((((rc) this).field_n ^ -1L) > (((rc) this).field_g ^ -1L)) {
            ((rc) this).field_n = ((rc) this).field_n + (((rc) this).field_g - ((rc) this).field_n);
        }
        ((rc) this).field_j = 0L;
        int var2 = -109 / ((-36 - param0) / 63);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (param1 == 10) {
          var3 = s.a(param2, param0, (byte) 3);
          if (var3 != null) {
            return var3;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (!b.a(param2.charAt(var4), (byte) -123)) {
                  return ob.field_d;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, String param1, boolean param2) {
        bk.a(12, param0, false, param1);
        if (!param2) {
            field_k = null;
        }
    }

    rc() {
        ((rc) this).field_g = 0L;
        ((rc) this).field_i = 1;
        ((rc) this).field_j = 0L;
        ((rc) this).field_o = new long[10];
        ((rc) this).field_l = 0;
        ((rc) this).field_n = 0L;
        ((rc) this).field_n = System.nanoTime();
        ((rc) this).field_g = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Music Off";
        field_e = new String[]{"Super Gunner", "Fireball", "Plasma Gunner", "Golden Beamer", "Fusion Gunner", "Master of Arms", "Crazy Pilot", "Insane Pilot", "Shard Destroyer", "Shard Obliterator", "Shard Annihilator", "Shard Fighter", "Shard Warrior", "High Spirits"};
        field_m = 4;
    }
}
