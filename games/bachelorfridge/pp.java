/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp extends bw {
    static String[] field_g;
    int field_f;
    nq field_h;

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        jba.field_A.field_sb = jba.field_A.field_sb + ts.field_r.field_sb;
        if (param1 != 5) {
          pp.c((byte) 17);
          jba.field_A.field_Z = param2;
          jba.field_A.field_gb = param0;
          jba.field_A.field_pb = param4;
          ts.field_r.field_kb = ts.field_r.field_kb + ts.field_r.field_sb;
          ts.field_r.field_sb = param3;
          jba.field_A.field_sb = jba.field_A.field_sb - ts.field_r.field_sb;
          ts.field_r.field_kb = ts.field_r.field_kb - ts.field_r.field_sb;
          return;
        } else {
          jba.field_A.field_Z = param2;
          jba.field_A.field_gb = param0;
          jba.field_A.field_pb = param4;
          ts.field_r.field_kb = ts.field_r.field_kb + ts.field_r.field_sb;
          ts.field_r.field_sb = param3;
          jba.field_A.field_sb = jba.field_A.field_sb - ts.field_r.field_sb;
          ts.field_r.field_kb = ts.field_r.field_kb - ts.field_r.field_sb;
          return;
        }
    }

    final static void a(String param0, int param1, kv param2) {
        Object var4 = null;
        rr.field_r = param0;
        if (param1 > -81) {
          var4 = null;
          pp.a(-97, -115, (String) null, -107, (String) null);
          vh.field_x = param2;
          return;
        } else {
          vh.field_x = param2;
          return;
        }
    }

    abstract void a(aga param0, op param1, int param2);

    void a(lu param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var3 = -43 / ((param1 - 34) / 58);
        if (!(this instanceof iv)) {
          if (!(this instanceof cn)) {
            if (!(this instanceof bj)) {
              if (!(this instanceof sl)) {
                if (!(this instanceof o)) {
                  if (!(this instanceof rla)) {
                    if (!(this instanceof ela)) {
                      if (!(this instanceof eba)) {
                        if (!(this instanceof dh)) {
                          if (!(this instanceof fda)) {
                            if (!(this instanceof ic)) {
                              if (!(this instanceof ro)) {
                                if (!(this instanceof tfa)) {
                                  if (!(this instanceof kq)) {
                                    if (!(this instanceof bm)) {
                                      if (this instanceof pea) {
                                        param0.d(16, 0);
                                        return;
                                      } else {
                                        throw new RuntimeException("CreatureEffect type not found");
                                      }
                                    } else {
                                      param0.d(15, 0);
                                      return;
                                    }
                                  } else {
                                    param0.d(14, 0);
                                    return;
                                  }
                                } else {
                                  param0.d(13, 0);
                                  return;
                                }
                              } else {
                                param0.d(12, 0);
                                return;
                              }
                            } else {
                              param0.d(11, 0);
                              return;
                            }
                          } else {
                            param0.d(10, 0);
                            return;
                          }
                        } else {
                          param0.d(9, 0);
                          return;
                        }
                      } else {
                        param0.d(8, 0);
                        return;
                      }
                    } else {
                      param0.d(7, 0);
                      return;
                    }
                  } else {
                    param0.d(6, 0);
                    return;
                  }
                } else {
                  param0.d(5, 0);
                  return;
                }
              } else {
                param0.d(4, 0);
                return;
              }
            } else {
              param0.d(3, 0);
              return;
            }
          } else {
            param0.d(2, 0);
            return;
          }
        } else {
          param0.d(1, 0);
          return;
        }
    }

    pp() {
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 != -75) {
            Object var2 = null;
            pp.a(-77, 19, (String) null, 41, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Livin' in the Fridge", "A Fridge Too Far", "Use Your Loaf", "10-second Rule", "Mighty Meaty", "Who Dairies Wins", "Green Machine", "Don't Put That In Your Mouth", "Do You Have Any...?", "Pick-up or Delivery?", "You Drink, You Fight, You Spill", "A Bit Fishy", "Om Nom Nom", "Full English", "Clerical Error", "Just Desserts", "Cowabunga", "I Love the Smell of Curry in the Morning", "Coup de Grease", "The Spices Must Flow", "Don't Play With Your Food", "Leftovers", "Lord of the Flies", "Exterminate, Annihilate", "Maggots to Go", "Superfly", "Tough as Old Boots", "Happy Maggot Appreciation Society", "Omnivore", "Play With Your Food", "Splort, Eater of Worlds", "The Devastator", "Not the Face!", "The Creature With the Lamp", "Medic!", "Generalist", "Monstrous Regiment", "The Devourer", "Sandpit Lord", "Specialist", "Frequent Flier", "To Live is to Fly", "Gross Points", "La Reine Maggot", "Pigs Might Fly", "Multiple Personalities", "Mass Effect", "You're in a Bit of a State", "Only Thing That Can Kill a Vindaloony", "Order of the Golden Sporx"};
    }
}
