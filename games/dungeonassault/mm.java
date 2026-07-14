/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ne {
    int field_r;
    static int field_t;
    static int field_q;
    int field_i;
    static String field_s;
    int field_n;
    static String field_m;
    int field_l;
    int field_o;
    static boolean field_k;
    static String field_j;
    int field_p;

    final static di a(ec param0, boolean param1) {
        di var2 = null;
        Object var3 = null;
        var2 = new di();
        if (param1) {
          var3 = null;
          di discarded$2 = mm.a((ec) null, false);
          var2.a(param0, -1);
          return var2;
        } else {
          var2.a(param0, -1);
          return var2;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 <= 110) {
          var2 = null;
          di discarded$2 = mm.a((ec) null, false);
          field_m = null;
          field_j = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_j = null;
          field_s = null;
          return;
        }
    }

    private mm() throws Throwable {
        throw new Error();
    }

    final static int a(CharSequence param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = DungeonAssault.field_K;
        if (-3 >= param2) {
          if (-37 >= param2) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            if (param3 == 3703) {
              var8 = 0;
              L0: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L1: {
                    var9 = param0.charAt(var8);
                    if (var8 != 0) {
                      break L1;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param1) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L0;
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (var9 > 57) {
                          break L3;
                        } else {
                          var9 -= 48;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (122 < var9) {
                          break L5;
                        } else {
                          var9 -= 87;
                          break L2;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param2) {
                    throw new NumberFormatException();
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var9 + var6 * param2;
                    if (var10 / param2 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            } else {
              var12 = null;
              di discarded$1 = mm.a((ec) null, false);
              var8 = 0;
              L7: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L8: {
                    var9 = param0.charAt(var8);
                    if (var8 != 0) {
                      break L8;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param1) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L7;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (var9 > 57) {
                          break L10;
                        } else {
                          var9 -= 48;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (122 < var9) {
                          break L12;
                        } else {
                          var9 -= 87;
                          break L9;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param2) {
                    throw new NumberFormatException();
                  } else {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var9 + var6 * param2;
                    if (var10 / param2 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param2);
          }
        } else {
          throw new IllegalArgumentException("" + param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.";
        field_s = "PLAN: ";
        field_j = "Highest: <col=DB0100><%0></col>";
        field_q = -1;
    }
}
