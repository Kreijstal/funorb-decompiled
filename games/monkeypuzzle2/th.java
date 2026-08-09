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
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, 3917) == ol.field_h) {
              stackIn_3_0 = mh.field_H;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 1) {
                field_n = (String[]) null;
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("th.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_7_0);
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
                stackIn_67_0 = 1;
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
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
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
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
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
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        na stackIn_3_0 = null;
        na stackIn_8_0 = null;
        na stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!ra.a(var4, (byte) -128)) {
              stackIn_3_0 = ol.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = vi.a(90, var5);
                if ((var3_int ^ -1) >= -1) {
                  break L1;
                } else {
                  if (130 >= var3_int) {
                    L2: {
                      if (param1 == 3917) {
                        break L2;
                      } else {
                        th.f((byte) 97);
                        break L2;
                      }
                    }
                    stackIn_12_0 = wj.field_i;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_8_0 = ol.field_h;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("th.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void f(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != -107) {
            field_o = (int[]) null;
        }
    }

    static {
        field_o = new int[5];
        field_n = new String[]{"Welcome! To complete this level, clear all the monkeys before the glowing line touches anything! <br><br>Clear nuts and monkeys by matching their colours. When<br>three monkeys or nuts of the same colour touch, they'll fall off the vines.<br><br>There is a bonus for completing the level quickly.<br><br>Use the <img=0> and <img=1> arrow keys to aim and <img=3> fire. Press <img=4> to pause the game.<br><br>", "Silver nuts are very heavy. They will drag anything they connect to downwards, so you need to be careful. Silver nuts cannot be cleared. To get rid of them, clear the colours they are attached to.<br><br>", "Spiderwebs are sticky - only nuts of the same colour as the spider do not get stuck in them. Spiders can be cleared in the same way monkeys can. When you clear the spider it will take its web with it.<br><br>", "Blocks are solid and cannot be removed. You will need to clear all the monkeys before the glowing line reaches a block, or you will lose the level. Nuts will bounce off blocks, so use this to reach monkeys in difficult areas.<br><br>", "Crumbly blocks will break if a nut hits them, so you can destroy them before the glowing line reaches them. You can still use them to deflect one nut.<br><br>"};
    }
}
