/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends ik {
    static String field_k;
    static je field_f;
    static int field_h;
    static String field_n;
    static String field_i;
    static String[] field_l;
    static String field_j;
    static String field_e;
    static String field_m;
    static int field_g;

    final int a(int param0) {
        if (param0 != 25365) {
          field_j = (String) null;
          return 2;
        }
        return 2;
    }

    al(int param0) {
        super(param0);
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_h = -8;
          return ed.a(-111);
        }
        return ed.a(-111);
    }

    final void a(ha param0, int param1) {
        try {
          if (param1 != -1700635440) {
            field_m = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "al.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, vh param1) {
        try {
          param1.b(true, this.field_c);
          if (param0 != -11637) {
            this.a(-111);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "al.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_d[this.field_c][5] == 1) {
            param1.b(uc.field_d[this.field_c][6], param0, 1, (byte) 92);
          }
          if (uc.field_d[this.field_c][5] == 0) {
            param1.field_l.a((byte) -119, (tc) (new vp(4, uc.field_d[this.field_c][6], param0)));
          }
          if (uc.field_d[this.field_c][5] == 2) {
            param1.field_Bb = false;
          }
          if (param2 == 26123) {
            return;
          }
          al.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("al.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        cm.a(2000, param1);
        if (param0 >= -21) {
          al.a(-83, true);
          da.a(-10820, param1);
          return;
        }
        da.a(-10820, param1);
    }

    final void a(byte param0, ha param1) {
        try {
          if (param0 != -37) {
            ha var4 = (ha) null;
            this.a(-41, (ha) null, -67);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "al.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_e = null;
        field_l = null;
        field_n = null;
        field_m = null;
        field_j = null;
        if (param0 == 103) {
          field_k = null;
          field_f = null;
          return;
        }
        field_f = (je) null;
        field_k = null;
        field_f = null;
    }

    static {
        field_k = "This ground cannot be captured";
        field_h = 0;
        field_i = "This item can only be used on an ogre shaman.";
        field_e = "This structure belongs to you";
        field_j = "You must play <%1> more rated games before playing with the current options.";
        field_l = new String[]{"Neutral units are either godless or once followed other, now long-departed, gods, and can be commanded in the name of any god.", "Saradomin is the god of lawfulness and goodness in all its forms. His followers are the purest of creatures.", "Zamorak is the Mahjarrat-god of chaos, followed by all kinds of wicked, viscious men and beasts.", "Guthix is the nature god of balance, shaper of Gielinor. His followers are druids and the flora and fauna of the world.", "Seren is the crystalline goddess of elfkind and one of the first gods to bring her followers to Gielinor.", "Bandos is the god of war, leader of orks, goblins, ogres and the like. He likes to fight for the fun of it.", "The Menaphite pantheon consists of the gods Tumeken, Elidinis, Icthlarin, Amascut the Devourer, Het, Apmeken, Crondis and Scabaras."};
        field_m = "Close";
    }
}
