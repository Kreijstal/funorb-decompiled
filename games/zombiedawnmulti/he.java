/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he implements nl {
    static String[] field_b;
    private int field_j;
    static String field_c;
    private int field_h;
    static cj field_i;
    static boolean field_a;
    static th field_k;
    private fm field_g;
    static ul field_f;
    static long field_e;
    static String[][] field_d;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param2 != -15112) {
            field_k = (th) null;
          }
          if (!param4.field_l &&
            !param4.c(param2 ^ -15226)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_g.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_j + "</u>", param3 + param4.field_y, param4.field_i + param1, param4.field_n, param4.field_w, var6_int, -1, this.field_j, this.field_h, this.field_g.field_r + this.field_g.field_C);
          if (param4.c(127)) {
            var7 = this.field_g.a(param4.field_j);
            var8 = this.field_g.field_r + this.field_g.field_C;
            var9 = param4.field_y + param3;
            if (this.field_j != 2) {
              if (1 == this.field_j) {
                var9 = var9 + (-var7 + param4.field_n >> 1);
              }
            } else {
              var9 = var9 + (-var7 + param4.field_n);
            }
            var10 = param1 + param4.field_i;
            if (this.field_h == 2) {
              var10 = var10 + (-var8 + param4.field_w);
            } else {
              if (this.field_h == 1) {
                var10 = var10 + (param4.field_w - var8 >> 1);
              }
            }
            hl.a(var10 + 2, -2 + var9, (byte) 97, 4 + var7, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("he.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        n var4_ref_n = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        cr var9 = null;
        ga var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -9355) {
            he.a(-53);
          }
          var10 = s.field_e;
          var2 = var10.g(31365);
          if (var2 == 0) {
            var9 = (cr) (dc.field_Gb.c(param0 + 9430));
            if (var9 == null) {
              ak.a((byte) -128);
              return;
            }
            var4 = var10.g(param0 + 40720);
            if (var4 != 0) {
              var12 = new byte[var4];
              var11 = var12;
              var8 = var11;
              var5 = var8;
              var10.a(0, -6351, var4, var12);
            } else {
              var5 = null;
            }
            var10.field_j = var10.field_j + 4;
            if (!var10.c(false)) {
              ak.a((byte) -113);
              return;
            }
            var9.field_f = (byte[]) (var5);
            var9.field_h = true;
            var9.a(true);
          } else {
            if (var2 == 1) {
              var3 = var10.i(-1478490344);
              var4_ref_n = (n) (nq.field_s.c(param0 ^ -9398));
              while (var4_ref_n != null) {
                if (var4_ref_n.field_h != var3) {
                  var4_ref_n = (n) (nq.field_s.b(param0 + 9361));
                  continue;
                }
                break;
              }
              if (var4_ref_n == null) {
                ak.a((byte) -114);
                return;
              }
              var4_ref_n.a(true);
              return;
            }
            bd.a("A1: " + ci.a(0), (Throwable) null, false);
            ak.a((byte) -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "he.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -3) {
          he.a((byte) 77);
        }
        field_c = null;
        field_f = null;
        field_i = null;
        field_d = (String[][]) null;
        field_k = null;
    }

    public he() {
        this.field_g = ke.field_h;
        this.field_j = 1;
        this.field_h = 1;
    }

    he(fm param0, int param1, int param2) {
        try {
          this.field_g = param0;
          this.field_h = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static long b(byte param0) {
        if (param0 != -22) {
          field_e = 45L;
        }
        return -mo.field_Gb + bl.a((byte) 56);
    }

    static {
        field_b = new String[]{"Graaah, Mondays!", "At least it's not Monday.", "Yes, master...", "*groan*", "I obey...", "Your will be done.", "Braaaaains...", "Yesss...", "Kill meeee...", "Why...?", "Let us rest...", "Spleen-did idea...", "I'm huuuungry...", "Fright away, master!", "I just started a diet...", "They're close...", "Can't...keep...up...", "Not so fast!", "They taste grrrrreat!", "Tender...juicy...hoomans...", "My feet are killing me.", "jooooiiiNNNNNUUUUUUUssssss...", "Are we there yet?", "I only want a nibble", "I don't feel so good.", "'Til death do us part...", "Why me...?", "Beer...", "*mumble*", "Thrilling.", "Seems right for dead.", "I'm grateful.", "I need a hug.", "I just want a hug!", "Come baaaaaaaack!", "Who wants to die forever?", "Sire commands us...", "At least I'm not playing Arcanists.", "No heal spheres, please.", "They promised us cake...", "Cookieeees...", "ROFD.", "To zombify is painless.", "You smell of cheese.", "Humans are fattening.", "I hate fast food.", "I got worms in my head.", "Brains, milk, bread.", "I'm glad they're out of bullets!", "We're just recycling, really.", "Don't try this at home.", "...", "Work, work."};
        field_c = "Bring the guilt of their past deeds upon them...";
        field_a = false;
        field_d = new String[][]{new String[]{"Let's go shopping for brains.", "Energise your zombies.", "I bet they're out of ammo!", "It's big. It's white. It's yours.", "Take your chances!"}, new String[]{}};
    }
}
