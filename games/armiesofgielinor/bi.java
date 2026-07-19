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
        int fieldTemp$4 = 0;
        StringBuilder discarded$5 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        og stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_13_0 = 0;
        og stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            fieldTemp$4 = param1.field_c - 1;
            param1.field_c = param1.field_c - 1;
            var2_int = fieldTemp$4;
            var3 = new StringBuilder();
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.a((byte) 16)) {
                    break L3;
                  } else {
                    var4 = param1.b(-1);
                    stackOut_3_0 = Character.isWhitespace((char) var4);
                    stackIn_14_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0) {
                            break L5;
                          } else {
                            if (var4 == 44) {
                              break L5;
                            } else {
                              if (var4 == 40) {
                                break L5;
                              } else {
                                if (var4 != 41) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        param1.field_c = param1.field_c - 1;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      discarded$5 = var3.append((char) var4);
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = param0;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              L6: {
                if (stackIn_14_0 < -106) {
                  break L6;
                } else {
                  field_c = (String) null;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5 = var3.toString();
                  if (var5.equals("true")) {
                    break L8;
                  } else {
                    if (var5.equals("false")) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          if (var5.charAt(0) == 45) {
                            break L10;
                          } else {
                            if (!Character.isDigit(var5.charAt(0))) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var4 = gg.field_G;
                        if (var6 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                      var4 = rn.field_c;
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                var4 = gb.field_z;
                break L7;
              }
              stackOut_24_0 = new og(var4, var2_int, var5);
              stackIn_25_0 = stackOut_24_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("bi.J(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_25_0;
    }

    final void a(int param0) {
        if (param0 != 5605) {
          field_f = (kl) null;
          qn.a(this.field_b, this.field_a, this.field_g);
          return;
        } else {
          qn.a(this.field_b, this.field_a, this.field_g);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            field_c = (String) null;
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
          field_e = (String) null;
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
        field_d = "Playing";
        field_c = "Armies of Gielinor Members' Expansion";
        field_e = "To play through the single-player campaigns, please log in or create a free account.";
    }
}
