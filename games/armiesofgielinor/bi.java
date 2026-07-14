/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static kl field_f;
    static String field_d;
    java.awt.Image field_h;
    static String field_c;
    int[] field_b;
    int field_a;
    static String field_e;
    int field_g;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static og a(byte param0, mt param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1.field_c = param1.field_c - 1;
        var2 = param1.field_c - 1;
        var3 = new StringBuilder();
        L0: while (true) {
          if (param1.a((byte) 16)) {
            if (param0 < -106) {
              var9 = var3.toString();
              if (!var9.equals((Object) (Object) "true")) {
                if (!var9.equals((Object) (Object) "false")) {
                  if (var9.charAt(0) != 45) {
                    if (Character.isDigit(var9.charAt(0))) {
                      var4 = gg.field_G;
                      return new og(var4, var2, var9);
                    } else {
                      var4 = rn.field_c;
                      return new og(var4, var2, var9);
                    }
                  } else {
                    var4 = gg.field_G;
                    return new og(var4, var2, var9);
                  }
                } else {
                  var4 = gb.field_z;
                  return new og(var4, var2, var9);
                }
              } else {
                var4 = gb.field_z;
                return new og(var4, var2, var9);
              }
            } else {
              field_c = null;
              var8 = var3.toString();
              var5 = var8;
              if (!var8.equals((Object) (Object) "true")) {
                if (!var8.equals((Object) (Object) "false")) {
                  if (var8.charAt(0) != 45) {
                    if (Character.isDigit(var8.charAt(0))) {
                      var4 = gg.field_G;
                      return new og(var4, var2, var8);
                    } else {
                      var4 = rn.field_c;
                      return new og(var4, var2, var8);
                    }
                  } else {
                    var4 = gg.field_G;
                    return new og(var4, var2, var8);
                  }
                } else {
                  var4 = gb.field_z;
                  return new og(var4, var2, var8);
                }
              } else {
                var4 = gb.field_z;
                return new og(var4, var2, var8);
              }
            }
          } else {
            L1: {
              var4 = param1.b(-1);
              if (Character.isWhitespace((char) var4)) {
                break L1;
              } else {
                if (var4 == 44) {
                  break L1;
                } else {
                  if (var4 == 40) {
                    break L1;
                  } else {
                    if (var4 != 41) {
                      StringBuilder discarded$1 = var3.append(var4);
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              param1.field_c = param1.field_c - 1;
              if (param0 < -106) {
                break L2;
              } else {
                field_c = null;
                break L2;
              }
            }
            L3: {
              L4: {
                var7 = var3.toString();
                if (var7.equals((Object) (Object) "true")) {
                  break L4;
                } else {
                  if (var7.equals((Object) (Object) "false")) {
                    break L4;
                  } else {
                    L5: {
                      if (var7.charAt(0) == 45) {
                        break L5;
                      } else {
                        if (!Character.isDigit(var7.charAt(0))) {
                          var4 = rn.field_c;
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var4 = gg.field_G;
                    break L3;
                  }
                }
              }
              var4 = gb.field_z;
              break L3;
            }
            return new og(var4, var2, var7);
          }
        }
    }

    final void a(int param0) {
        if (param0 != 5605) {
          field_f = null;
          qn.a(((bi) this).field_b, ((bi) this).field_a, ((bi) this).field_g);
          return;
        } else {
          qn.a(((bi) this).field_b, ((bi) this).field_a, ((bi) this).field_g);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == -31000) {
          if (param0 < 48) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_e = null;
          if (param0 >= 48) {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!param0) {
          if (0 <= param4) {
            if (0 <= param5) {
              if (ks.field_y > param4) {
                if (ef.field_c <= param5) {
                  return;
                } else {
                  var6 = param4 + param5 * ks.field_y;
                  var7 = a.a(16711680, param5, var6, param4);
                  var8 = 255 - (var7 >>> -636800136 & 220487423);
                  var7 = var7 & 16777215;
                  mq.a(param2, var7, var6, param4, param1, var8, -116, param5);
                  pk.a(param1, param5, param4, var6, var7, -29403, var8, param2);
                  if (param3 <= 71) {
                    return;
                  } else {
                    L0: {
                      if (!jd.field_L) {
                        break L0;
                      } else {
                        oh.field_I.g(param2, param1);
                        break L0;
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Playing";
        field_c = "Armies of Gielinor Members' Expansion";
        field_e = "To play through the single-player campaigns, please log in or create a free account.";
    }
}
