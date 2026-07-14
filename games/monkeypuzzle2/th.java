/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wj {
    static int[] field_o;
    static String[] field_n;

    th(rj param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        if (((th) this).a(param1, 3917) == ol.field_h) {
          return mh.field_H;
        } else {
          if (param0 == 1) {
            return null;
          } else {
            field_n = null;
            return null;
          }
        }
    }

    final static boolean a(boolean param0, char param1) {
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
        if (!param0) {
          if (48 > param1) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
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
            if (param1 > 57) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
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
          th.f((byte) 42);
          if (48 <= param1) {
            if (param1 > 57) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
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
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (param1 > 122) {
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

    final na a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (!ra.a(var4, (byte) -128)) {
          return ol.field_h;
        } else {
          var5 = (CharSequence) (Object) param0;
          var3 = vi.a(90, var5);
          if ((var3 ^ -1) < -1) {
            if (130 >= var3) {
              if (param1 != 3917) {
                th.f((byte) 97);
                return wj.field_i;
              } else {
                return wj.field_i;
              }
            } else {
              return ol.field_h;
            }
          } else {
            return ol.field_h;
          }
        }
    }

    public static void f(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != -107) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[5];
        field_n = new String[]{"Welcome! To complete this level, clear all the monkeys before the glowing line touches anything! <br><br>Clear nuts and monkeys by matching their colours. When<br>three monkeys or nuts of the same colour touch, they'll fall off the vines.<br><br>There is a bonus for completing the level quickly.<br><br>Use the <img=0> and <img=1> arrow keys to aim and <img=3> fire. Press <img=4> to pause the game.<br><br>", "Silver nuts are very heavy. They will drag anything they connect to downwards, so you need to be careful. Silver nuts cannot be cleared. To get rid of them, clear the colours they are attached to.<br><br>", "Spiderwebs are sticky - only nuts of the same colour as the spider do not get stuck in them. Spiders can be cleared in the same way monkeys can. When you clear the spider it will take its web with it.<br><br>", "Blocks are solid and cannot be removed. You will need to clear all the monkeys before the glowing line reaches a block, or you will lose the level. Nuts will bounce off blocks, so use this to reach monkeys in difficult areas.<br><br>", "Crumbly blocks will break if a nut hits them, so you can destroy them before the glowing line reaches them. You can still use them to deflect one nut.<br><br>"};
    }
}
