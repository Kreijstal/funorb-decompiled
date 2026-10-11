/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends ee implements bn {
    static int field_o;
    static int[] field_h;
    static boolean[][] field_p;
    private rn field_k;
    static int field_m;
    static String field_i;
    static String field_n;
    static String field_j;
    static long[] field_l;

    public final boolean a(byte param0) {
        if (param0 >= -72) {
          return false;
        }
        if (this.field_k.field_g == null) {
          return true;
        }
        if (this.field_k.field_g.length() != 0) {
          return false;
        }
        return true;
    }

    public final void b(rn param0, int param1) {
        try {
          if (param1 <= 73) {
            field_o = 48;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return this.a(this.field_k.field_g, (byte) -120);
    }

    final static boolean d(boolean param0) {
        if (param0) {
          return 250 < gi.field_a ? true : false;
        }
        field_h = (int[]) null;
        return 250 < gi.field_a ? true : false;
    }

    public static void c(byte param0) {
        field_h = null;
        field_j = null;
        field_n = null;
        field_p = (boolean[][]) null;
        if (param0 <= -65) {
          field_i = null;
          field_l = null;
          return;
        }
        rl.d(true);
        field_i = null;
        field_l = null;
    }

    public final void a(rn param0, int param1) {
        try {
          this.b(-17444);
          if (param1 != -20626) {
            field_h = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract String a(String param0, byte param1);

    final static int a(int param0, int param1, int param2) {
        if (param2 > -70) {
          field_l = (long[]) null;
          return -1;
        }
        return -1;
    }

    rl(rn param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        var6 = new StringBuilder(var3);
        while (0L != param0) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = qa.field_h[(int)(var7 - param0 * 37L)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        if (param1 != 29424) {
          rl.c((byte) 46);
        }
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    abstract eh a(String param0, int param1);

    final eh b(byte param0) {
        if (param0 != -66) {
          return (eh) null;
        }
        return this.a(this.field_k.field_g, -108);
    }

    static {
        field_j = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_h = new int[]{17, 18, 8};
        field_i = "Play Rated games to win wands.<br>Wands can be used to buy more spells.";
        field_o = -1;
        field_m = -1;
        field_n = "<%0> wants to join";
        field_l = new long[32];
    }
}
