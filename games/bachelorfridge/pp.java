/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp extends bw {
    static String[] field_g;
    int field_f;
    nq field_h;

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        try {
            jba.field_A.field_sb = jba.field_A.field_sb + ts.field_r.field_sb;
            if (param1 != 5) {
                pp.c((byte) 17);
            }
            jba.field_A.field_Z = param2;
            jba.field_A.field_gb = param0;
            jba.field_A.field_pb = param4;
            ts.field_r.field_kb = ts.field_r.field_kb + ts.field_r.field_sb;
            ts.field_r.field_sb = param3;
            jba.field_A.field_sb = jba.field_A.field_sb - ts.field_r.field_sb;
            ts.field_r.field_kb = ts.field_r.field_kb - ts.field_r.field_sb;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pp.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(String param0, int param1, kv param2) {
        try {
            rr.field_r = param0;
            if (param1 > -81) {
                Object var4 = null;
                pp.a(-97, -115, (String) null, -107, (String) null);
            }
            vh.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pp.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void a(aga param0, op param1, int param2);

    void a(lu param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          var3_int = -43 / ((param1 - 34) / 58);
          if (this instanceof iv) {
            param0.d(1, 0);
            return;
          } else {
            if (this instanceof cn) {
              param0.d(2, 0);
              return;
            } else {
              if (this instanceof bj) {
                param0.d(3, 0);
                return;
              } else {
                if (!(this instanceof sl)) {
                  if (!(this instanceof o)) {
                    if (!(this instanceof rla)) {
                      if (this instanceof ela) {
                        param0.d(7, 0);
                        return;
                      } else {
                        if (this instanceof eba) {
                          param0.d(8, 0);
                          return;
                        } else {
                          if (!(this instanceof dh)) {
                            if (this instanceof fda) {
                              param0.d(10, 0);
                              return;
                            } else {
                              if (this instanceof ic) {
                                param0.d(11, 0);
                                return;
                              } else {
                                if (!(this instanceof ro)) {
                                  if (this instanceof tfa) {
                                    param0.d(13, 0);
                                    return;
                                  } else {
                                    if (this instanceof kq) {
                                      param0.d(14, 0);
                                      return;
                                    } else {
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
                                    }
                                  }
                                } else {
                                  param0.d(12, 0);
                                  return;
                                }
                              }
                            }
                          } else {
                            param0.d(9, 0);
                            return;
                          }
                        }
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("pp.A(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L0;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param1 + 41);
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
