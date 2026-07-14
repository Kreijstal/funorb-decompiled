/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends jq {
    private int field_j;
    private int field_q;
    static String[] field_l;
    private int field_k;
    static sq field_m;
    private int field_o;
    static String field_i;
    static String field_n;
    static ba field_r;
    static java.applet.Applet field_h;
    static String field_p;

    final static boolean a(String param0, byte param1) {
        Object var3 = null;
        if (param0 != null) {
          if (param0.length() >= vb.field_h) {
            if (param0.length() <= fg.field_Y) {
              if (param1 != -113) {
                var3 = null;
                boolean discarded$2 = nh.a((String) null, (byte) 14);
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    nh(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        ((nh) this).field_q = param2;
        ((nh) this).field_j = param0;
        ((nh) this).field_o = param3;
        ((nh) this).field_k = param1;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_m = null;
        field_i = null;
        field_n = null;
        field_l = null;
        if (param0) {
          field_n = null;
          field_r = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_p = null;
          return;
        }
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 < 26) {
            field_i = null;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 >= -31) {
            ((nh) this).field_k = 41;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param2 != 45) {
          return;
        } else {
          var4 = param1 * ((nh) this).field_j >> 1364542028;
          var5 = ((nh) this).field_q * param1 >> -1604299572;
          var6 = param0 * ((nh) this).field_k >> 1654680684;
          var7 = param0 * ((nh) this).field_o >> -812871380;
          eh.a(var7, var5, (byte) -4, var6, ((nh) this).field_a, var4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = new sq();
        field_i = "2 players compete to paint as much of the map as possible in their own colour - either purple or blue. In this mode you can only pick up your own colour of paint and any paint you pick up is immediately replaced. Also note that you can't paint the blocks that the paint pots are on. When the time limit is reached, the player with the most blocks of their colour is victorious.";
        field_n = "<%0> is already on your friend list.";
        field_r = new ba();
        field_p = "Unpacking graphics";
    }
}
