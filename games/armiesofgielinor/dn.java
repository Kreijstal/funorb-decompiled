/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends je {
    static String field_Ob;
    static boolean field_Qb;
    static String field_Lb;
    je field_Jb;
    static String[] field_Pb;
    je field_Nb;
    static String field_Kb;
    static String field_Mb;
    ll field_Ib;

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        ((dn) this).field_gb = param2;
        ((dn) this).field_ob = param6;
        ((dn) this).field_S = param0;
        ((dn) this).field_ab = param5;
        this.a(param4, param1, param3);
    }

    private final void a(int param0, boolean param1, int param2) {
        ((dn) this).field_Nb.field_ob = ((dn) this).field_ob;
        if (param1) {
          boolean discarded$1 = dn.l(-122);
          ((dn) this).field_Jb.field_S = 0;
          ((dn) this).field_Nb.field_gb = -param0 + (((dn) this).field_gb + -param2);
          ((dn) this).field_Jb.field_gb = -param2 + -param0 + ((dn) this).field_gb;
          ((dn) this).field_Ib.a(201, param0, ((dn) this).field_ob, 0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -param0 + ((dn) this).field_gb, -((dn) this).field_Jb.field_ab);
          return;
        } else {
          ((dn) this).field_Jb.field_S = 0;
          ((dn) this).field_Nb.field_gb = -param0 + (((dn) this).field_gb + -param2);
          ((dn) this).field_Jb.field_gb = -param2 + -param0 + ((dn) this).field_gb;
          ((dn) this).field_Ib.a(201, param0, ((dn) this).field_ob, 0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -param0 + ((dn) this).field_gb, -((dn) this).field_Jb.field_ab);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, boolean param3) {
        if (param3) {
          field_Lb = null;
          this.a(0, param0, param1, param2, ((dn) this).field_Nb.field_ob);
          return;
        } else {
          this.a(0, param0, param1, param2, ((dn) this).field_Nb.field_ob);
          return;
        }
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        if (param4 != 0) {
            return true;
        }
        return this.a(param0, param1, ((dn) this).field_Nb.field_ob, param2, 0, param5, param3);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
            dn.k(118);
            return null != tb.field_e ? true : false;
        }
        return null != tb.field_e ? true : false;
    }

    public static void k(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = dn.l(-24);
            field_Mb = null;
            field_Pb = null;
            field_Kb = null;
            field_Ob = null;
            field_Lb = null;
            return;
        }
        field_Mb = null;
        field_Pb = null;
        field_Kb = null;
        field_Ob = null;
        field_Lb = null;
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        L0: {
          if (((dn) this).field_Ib.m(-70)) {
            ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db + param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (!((dn) this).field_Ib.n(57)) {
          L1: {
            if (((dn) this).field_Ib.o(-46)) {
              ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db + param4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((dn) this).field_Ib.l(28809)) {
              ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db - param4;
              break L2;
            } else {
              break L2;
            }
          }
          if (!((dn) this).field_eb) {
            if (param2) {
              L3: {
                if (-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) < 0) {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-((dn) this).field_Nb.field_ob + ((dn) this).field_Jb.field_ob + ((dn) this).field_Jb.field_nb < -(((dn) this).field_Jb.field_db + ((dn) this).field_Jb.field_ab)) {
                L4: {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab + -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_nb + ((dn) this).field_Jb.field_ob));
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              } else {
                L5: {
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              }
            } else {
              L6: {
                if (-(((dn) this).field_Jb.field_ab + ((dn) this).field_Jb.field_db) > ((dn) this).field_Jb.field_ob - (-((dn) this).field_Jb.field_nb - -((dn) this).field_Nb.field_ob)) {
                  ((dn) this).field_Jb.field_db = -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_ob - -((dn) this).field_Jb.field_nb)) - ((dn) this).field_Jb.field_ab;
                  break L6;
                } else {
                  break L6;
                }
              }
              if ((-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) ^ -1) > -1) {
                L7: {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              } else {
                L8: {
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              }
            }
          } else {
            ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db - param3;
            if (param2) {
              L9: {
                if (-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) < 0) {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (-((dn) this).field_Nb.field_ob + ((dn) this).field_Jb.field_ob + ((dn) this).field_Jb.field_nb < -(((dn) this).field_Jb.field_db + ((dn) this).field_Jb.field_ab)) {
                L10: {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab + -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_nb + ((dn) this).field_Jb.field_ob));
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              } else {
                L11: {
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              }
            } else {
              L12: {
                if (-(((dn) this).field_Jb.field_ab + ((dn) this).field_Jb.field_db) > ((dn) this).field_Jb.field_ob - (-((dn) this).field_Jb.field_nb - -((dn) this).field_Nb.field_ob)) {
                  ((dn) this).field_Jb.field_db = -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_ob - -((dn) this).field_Jb.field_nb)) - ((dn) this).field_Jb.field_ab;
                  break L12;
                } else {
                  break L12;
                }
              }
              if ((-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) ^ -1) > -1) {
                L13: {
                  ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              } else {
                L14: {
                  if (((dn) this).field_Ib.a(false)) {
                    ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                    ((dn) this).field_Jb.field_db = 0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
                return;
              }
            }
          }
        } else {
          L15: {
            ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db - param1;
            if (((dn) this).field_Ib.o(-46)) {
              ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db + param4;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (((dn) this).field_Ib.l(28809)) {
              ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db - param4;
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            if (!((dn) this).field_eb) {
              break L17;
            } else {
              ((dn) this).field_Jb.field_db = ((dn) this).field_Jb.field_db - param3;
              break L17;
            }
          }
          if (param2) {
            L18: {
              if (-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) < 0) {
                ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                break L18;
              } else {
                break L18;
              }
            }
            if (-((dn) this).field_Nb.field_ob + ((dn) this).field_Jb.field_ob + ((dn) this).field_Jb.field_nb >= -(((dn) this).field_Jb.field_db + ((dn) this).field_Jb.field_ab)) {
              L19: {
                if (((dn) this).field_Ib.a(false)) {
                  ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                  ((dn) this).field_Jb.field_db = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
              return;
            } else {
              L20: {
                ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab + -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_nb + ((dn) this).field_Jb.field_ob));
                if (((dn) this).field_Ib.a(false)) {
                  ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                  ((dn) this).field_Jb.field_db = 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
              return;
            }
          } else {
            L21: {
              if (-(((dn) this).field_Jb.field_ab + ((dn) this).field_Jb.field_db) > ((dn) this).field_Jb.field_ob - (-((dn) this).field_Jb.field_nb - -((dn) this).field_Nb.field_ob)) {
                ((dn) this).field_Jb.field_db = -(-((dn) this).field_Nb.field_ob + (((dn) this).field_Jb.field_ob - -((dn) this).field_Jb.field_nb)) - ((dn) this).field_Jb.field_ab;
                break L21;
              } else {
                break L21;
              }
            }
            if ((-(((dn) this).field_Jb.field_ab - -((dn) this).field_Jb.field_db) ^ -1) <= -1) {
              L22: {
                if (((dn) this).field_Ib.a(false)) {
                  ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                  ((dn) this).field_Jb.field_db = 0;
                  break L22;
                } else {
                  break L22;
                }
              }
              ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
              return;
            } else {
              L23: {
                ((dn) this).field_Jb.field_db = -((dn) this).field_Jb.field_ab;
                if (((dn) this).field_Ib.a(false)) {
                  ((dn) this).field_Jb.field_ab = -((dn) this).field_Ib.a(((dn) this).field_Nb.field_ob, param2, ((dn) this).field_Jb.field_ob, 112);
                  ((dn) this).field_Jb.field_db = 0;
                  break L23;
                } else {
                  break L23;
                }
              }
              ((dn) this).field_Ib.a(param0 + param0, ((dn) this).field_Jb.field_ob, ((dn) this).field_Nb.field_ob, -((dn) this).field_Jb.field_ab);
              return;
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        if (!param6) {
          if (((dn) this).field_eb) {
            if (param0) {
              var8 = 0;
              ((dn) this).field_Jb.a(var8 != 0, ((dn) this).field_Nb.field_ob, param5, -1379);
              this.a(param4, param3, false, param1, param2);
              return var8 != 0;
            } else {
              var8 = 1;
              ((dn) this).field_Jb.a(var8 != 0, ((dn) this).field_Nb.field_ob, param5, -1379);
              this.a(param4, param3, false, param1, param2);
              return var8 != 0;
            }
          } else {
            var8 = 0;
            ((dn) this).field_Jb.a(var8 != 0, ((dn) this).field_Nb.field_ob, param5, -1379);
            this.a(param4, param3, false, param1, param2);
            return var8 != 0;
          }
        } else {
          var8 = 1;
          ((dn) this).field_Jb.a(var8 != 0, ((dn) this).field_Nb.field_ob, param5, -1379);
          this.a(param4, param3, false, param1, param2);
          return var8 != 0;
        }
    }

    dn(long param0, je param1, je param2, ll param3) {
        super(param0, (je) null);
        ((dn) this).field_Nb = new je(0L, param2);
        ((dn) this).field_Ib = new ll(0L, param3);
        ((dn) this).a(((dn) this).field_Nb, 53);
        ((dn) this).a((je) (Object) ((dn) this).field_Ib, 39);
        ((dn) this).field_Jb = param1;
        ((dn) this).field_Nb.a(param1, 54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Armour";
        field_Pb = new String[]{"Barbarian", "Aviansie", "Gorilla", "Barbarian spearwoman", "Red dragon", "TzHaar-Ket", "Dagannoth", "Portal mage", "Paladin", "Saradomin owl", "Monk", "Saradomin mage", "White Knight", "Unicorn", "Centaur", "Lion", "Saradomin ranger", "Priest", "Icyene", "Werewolf", "Skeleton", "Necromancer", "Zamorak mage", "Black Knight", "Greater demon", "Zamorak ranger", "Hellhound", "Sea slug", "Gargoyle", "Pyrelord", "Mounted terrorbird", "Wolf", "Druid", "Black Guard dwarf", "Dwarf cannon", "Moss giant", "Void Knight", "Battle tortoise", "Gnomecopter", "Jade vine", "Ent", "Falcon", "Black bear", "Elf songstress", "Elf shieldmaiden", "Grenwall", "Dire wolf", "Elven pikemen", "Elven archer", "Elf lord", "Elf lady", "Crystalline shape-shifter", "Goblin", "Goblin priest", "Ogre", "Jogre", "Mogre", "Hobgoblin", "Ogre shaman", "Cyclops", "Ork", "Ogress", "Ourg", "Kalphite Queen", "Jackal", "Mummy", "Locust", "Bedabin nomad", "Menaphite thug", "Warrior of Icthlarin", "Crocodile", "Scabarite mage", "Sphinx", "Elemental of Elidinis", "King Black Dragon", "", "", "", "", "", "", "Blue Dragon", "Ahrim", "Dharok", "Guthan", "Karil", "Torag", "Verac", "Zemouregal"};
        field_Ob = "Player names can be up to 12 letters, numbers and underscores";
        field_Mb = "On";
        field_Kb = "Most summons";
    }
}
