/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ClientUiComponent {
    static String field_Ob;
    static boolean field_Qb;
    static String field_Lb;
    ClientUiComponent field_Jb;
    static String[] unitDisplayNames;
    ClientUiComponent field_Nb;
    static String field_Kb;
    static String field_Mb;
    ll field_Ib;

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        this.width = param2;
        this.height = param6;
        this.x = param0;
        this.y = param5;
        this.a(param4, param1, param3);
    }

    private final void a(int param0, boolean param1, int param2) {
        this.field_Nb.height = this.height;
        if (!param1) {
          this.field_Jb.x = 0;
          this.field_Nb.width = -param0 + (this.width - param2);
          this.field_Jb.width = -param2 - param0 + this.width;
          this.field_Ib.a(201, param0, this.height, 0, this.field_Jb.height, this.field_Nb.height, -param0 + this.width, -this.field_Jb.y);
          return;
        }
        dn.l(-122);
        this.field_Jb.x = 0;
        this.field_Nb.width = -param0 + (this.width - param2);
        this.field_Jb.width = -param2 - param0 + this.width;
        this.field_Ib.a(201, param0, this.height, 0, this.field_Jb.height, this.field_Nb.height, -param0 + this.width, -this.field_Jb.y);
    }

    final void a(int param0, boolean param1, int param2, boolean param3) {
        if (!param3) {
          this.a(0, param0, param1, param2, this.field_Nb.height);
          return;
        }
        field_Lb = (String) null;
        this.a(0, param0, param1, param2, this.field_Nb.height);
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        if (param4 != 0) {
          return true;
        }
        return this.a(param0, param1, this.field_Nb.height, param2, 0, param5, param3);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
          dn.k(118);
          return null != EffectPresentation.field_e ? true : false;
        }
        return null != EffectPresentation.field_e ? true : false;
    }

    public static void k(int param0) {
        if (param0 != 0) {
          dn.l(-24);
          field_Mb = null;
          unitDisplayNames = null;
          field_Kb = null;
          field_Ob = null;
          field_Lb = null;
          return;
        }
        field_Mb = null;
        unitDisplayNames = null;
        field_Kb = null;
        field_Ob = null;
        field_Lb = null;
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (this.field_Ib.m(-70)) {
          this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta + param1;
        }
        if (this.field_Ib.n(57)) {
          this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta - param1;
          if (this.field_Ib.o(-46)) {
            this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta + param4;
          }
          if (this.field_Ib.l(28809)) {
            this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta - param4;
          }
          if (this.heldButtonMatches) {
            this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta - param3;
          }
          if (!param2) {
            if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) <= this.field_Jb.height - (-this.field_Jb.pendingHeightDelta + this.field_Nb.height))) {
              this.field_Jb.pendingYDelta = -(-this.field_Nb.height + (this.field_Jb.height + this.field_Jb.pendingHeightDelta)) - this.field_Jb.y;
            }
            if (-(this.field_Jb.y + this.field_Jb.pendingYDelta) < 0) {
              this.field_Jb.pendingYDelta = -this.field_Jb.y;
              if (this.field_Ib.a(false)) {
                this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
                this.field_Jb.pendingYDelta = 0;
              }
              this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
              return;
            }
            if (this.field_Ib.a(false)) {
              this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
              this.field_Jb.pendingYDelta = 0;
            }
            this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
            return;
          }
          if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) >= 0)) {
            this.field_Jb.pendingYDelta = -this.field_Jb.y;
          }
          if (-this.field_Nb.height + this.field_Jb.height + this.field_Jb.pendingHeightDelta < -(this.field_Jb.pendingYDelta + this.field_Jb.y)) {
            this.field_Jb.pendingYDelta = -this.field_Jb.y - (-this.field_Nb.height + (this.field_Jb.pendingHeightDelta + this.field_Jb.height));
            if (this.field_Ib.a(false)) {
              this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
              this.field_Jb.pendingYDelta = 0;
            }
            this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
            return;
          }
          if (this.field_Ib.a(false)) {
            this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
            this.field_Jb.pendingYDelta = 0;
          }
          this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
          return;
        }
        if (this.field_Ib.o(-46)) {
          this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta + param4;
        }
        if (this.field_Ib.l(28809)) {
          this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta - param4;
        }
        if (this.heldButtonMatches) {
          this.field_Jb.pendingYDelta = this.field_Jb.pendingYDelta - param3;
          if (!param2) {
            if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) <= this.field_Jb.height - (-this.field_Jb.pendingHeightDelta + this.field_Nb.height))) {
              this.field_Jb.pendingYDelta = -(-this.field_Nb.height + (this.field_Jb.height + this.field_Jb.pendingHeightDelta)) - this.field_Jb.y;
            }
            if (-(this.field_Jb.y + this.field_Jb.pendingYDelta) >= 0) {
              if (this.field_Ib.a(false)) {
                this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
                this.field_Jb.pendingYDelta = 0;
              }
              this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
              return;
            }
            this.field_Jb.pendingYDelta = -this.field_Jb.y;
            if (this.field_Ib.a(false)) {
              this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
              this.field_Jb.pendingYDelta = 0;
            }
            this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
            return;
          }
          if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) >= 0)) {
            this.field_Jb.pendingYDelta = -this.field_Jb.y;
          }
          if (-this.field_Nb.height + this.field_Jb.height + this.field_Jb.pendingHeightDelta >= -(this.field_Jb.pendingYDelta + this.field_Jb.y)) {
            if (this.field_Ib.a(false)) {
              this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
              this.field_Jb.pendingYDelta = 0;
            }
            this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
            return;
          }
          this.field_Jb.pendingYDelta = -this.field_Jb.y - (-this.field_Nb.height + (this.field_Jb.pendingHeightDelta + this.field_Jb.height));
          if (this.field_Ib.a(false)) {
            this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
            this.field_Jb.pendingYDelta = 0;
          }
          this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
          return;
        }
        if (!param2) {
          if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) <= this.field_Jb.height - (-this.field_Jb.pendingHeightDelta + this.field_Nb.height))) {
            this.field_Jb.pendingYDelta = -(-this.field_Nb.height + (this.field_Jb.height + this.field_Jb.pendingHeightDelta)) - this.field_Jb.y;
          }
          if (-(this.field_Jb.y + this.field_Jb.pendingYDelta) >= 0) {
            if (this.field_Ib.a(false)) {
              this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
              this.field_Jb.pendingYDelta = 0;
            }
            this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
            return;
          }
          this.field_Jb.pendingYDelta = -this.field_Jb.y;
          if (this.field_Ib.a(false)) {
            this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
            this.field_Jb.pendingYDelta = 0;
          }
          this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
          return;
        }
        if (!(-(this.field_Jb.y + this.field_Jb.pendingYDelta) >= 0)) {
          this.field_Jb.pendingYDelta = -this.field_Jb.y;
        }
        if (-this.field_Nb.height + this.field_Jb.height + this.field_Jb.pendingHeightDelta >= -(this.field_Jb.pendingYDelta + this.field_Jb.y)) {
          if (this.field_Ib.a(false)) {
            this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
            this.field_Jb.pendingYDelta = 0;
          }
          this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
          return;
        }
        this.field_Jb.pendingYDelta = -this.field_Jb.y - (-this.field_Nb.height + (this.field_Jb.pendingHeightDelta + this.field_Jb.height));
        if (this.field_Ib.a(false)) {
          this.field_Jb.y = -this.field_Ib.a(this.field_Nb.height, param2, this.field_Jb.height, 112);
          this.field_Jb.pendingYDelta = 0;
        }
        this.field_Ib.a(param0 + param0, this.field_Jb.height, this.field_Nb.height, -this.field_Jb.y);
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (param6) {
          var8 = 1;
          this.field_Jb.a(var8 != 0, this.field_Nb.height, param5, -1379);
          this.a(param4, param3, false, param1, param2);
          return var8 != 0;
        }
        if (!this.heldButtonMatches) {
          var8Lifetime1 = 0;
          this.field_Jb.a(var8Lifetime1 != 0, this.field_Nb.height, param5, -1379);
          this.a(param4, param3, false, param1, param2);
          return var8Lifetime1 != 0;
        }
        if (!param0) {
          var8Lifetime2 = 1;
          this.field_Jb.a(var8Lifetime2 != 0, this.field_Nb.height, param5, -1379);
          this.a(param4, param3, false, param1, param2);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.field_Jb.a(var8Lifetime3 != 0, this.field_Nb.height, param5, -1379);
        this.a(param4, param3, false, param1, param2);
        return var8Lifetime3 != 0;
    }

    dn(long param0, ClientUiComponent param1, ClientUiComponent param2, ll param3) {
        super(param0, (ClientUiComponent) null);
        try {
          this.field_Nb = new ClientUiComponent(0L, param2);
          this.field_Ib = new ll(0L, param3);
          this.addChild(this.field_Nb, 53);
          this.addChild(this.field_Ib, 39);
          this.field_Jb = param1;
          this.field_Nb.addChild(param1, 54);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Lb = "Armour";
        unitDisplayNames = new String[]{"Barbarian", "Aviansie", "Gorilla", "Barbarian spearwoman", "Red dragon", "TzHaar-Ket", "Dagannoth", "Portal mage", "Paladin", "Saradomin owl", "Monk", "Saradomin mage", "White Knight", "Unicorn", "Centaur", "Lion", "Saradomin ranger", "Priest", "Icyene", "Werewolf", "Skeleton", "Necromancer", "Zamorak mage", "Black Knight", "Greater demon", "Zamorak ranger", "Hellhound", "Sea slug", "Gargoyle", "Pyrelord", "Mounted terrorbird", "Wolf", "Druid", "Black Guard dwarf", "Dwarf cannon", "Moss giant", "Void Knight", "Battle tortoise", "Gnomecopter", "Jade vine", "Ent", "Falcon", "Black bear", "Elf songstress", "Elf shieldmaiden", "Grenwall", "Dire wolf", "Elven pikemen", "Elven archer", "Elf lord", "Elf lady", "Crystalline shape-shifter", "Goblin", "Goblin priest", "Ogre", "Jogre", "Mogre", "Hobgoblin", "Ogre shaman", "Cyclops", "Ork", "Ogress", "Ourg", "Kalphite Queen", "Jackal", "Mummy", "Locust", "Bedabin nomad", "Menaphite thug", "Warrior of Icthlarin", "Crocodile", "Scabarite mage", "Sphinx", "Elemental of Elidinis", "King Black Dragon", "", "", "", "", "", "", "Blue Dragon", "Ahrim", "Dharok", "Guthan", "Karil", "Torag", "Verac", "Zemouregal"};
        field_Ob = "Player names can be up to 12 letters, numbers and underscores";
        field_Mb = "On";
        field_Kb = "Most summons";
    }
}
