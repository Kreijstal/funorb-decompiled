/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qw {
    static int field_b;
    static String field_c;
    static hr[] field_a;

    final static boolean a(int param0, char param1) {
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
        if (param0 == 57) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (122 < param1) {
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
                      if (122 < param1) {
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
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (122 < param1) {
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
                        if (122 < param1) {
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
          field_c = null;
          if (param1 >= 48) {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (122 >= param1) {
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
                        if (122 < param1) {
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
                if (122 < param1) {
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
                  if (122 < param1) {
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

    public static void a(int param0) {
        field_a = null;
        if (param0 > -116) {
            return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        if (param0 != 35) {
            field_b = 62;
            if (!(so.a((byte) 101))) {
                return;
            }
            ou.a(false, 4, (byte) -24);
            return;
        }
        if (!(so.a((byte) 101))) {
            return;
        }
        ou.a(false, 4, (byte) -24);
    }

    final static void a(int param0, ah param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        ah var8 = null;
        ah var9 = null;
        ah var10 = null;
        ah var11 = null;
        ah var12 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 >= 57) {
          if (param1.field_Q != 0) {
            if (jc.b(true) <= 20) {
              var2 = fi.a(2, he.field_o, (byte) -96);
              if (1 != var2) {
                var3 = param1.field_N;
                var4 = var3;
                if ((var4 ^ -1) != -5) {
                  if (0 != var4) {
                    if ((var4 ^ -1) != -6) {
                      if ((var4 ^ -1) != -2) {
                        if (2 == var4) {
                          L0: {
                            var3 = 6;
                            if ((var3 ^ -1) <= -8) {
                              var3 = 6;
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                          var12 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                          oc.a(var12, false);
                          return;
                        } else {
                          L1: {
                            if ((var3 ^ -1) <= -8) {
                              var3 = 6;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          var12 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                          oc.a(var12, false);
                          return;
                        }
                      } else {
                        L2: {
                          var3 = 2;
                          if ((var3 ^ -1) <= -8) {
                            var3 = 6;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        var11 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                        oc.a(var11, false);
                        return;
                      }
                    } else {
                      L3: {
                        var3 = 1;
                        if ((var3 ^ -1) <= -8) {
                          var3 = 6;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var10 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                      oc.a(var10, false);
                      return;
                    }
                  } else {
                    L4: {
                      var3 = 5;
                      if ((var3 ^ -1) <= -8) {
                        var3 = 6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var9 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                    oc.a(var9, false);
                    return;
                  }
                } else {
                  L5: {
                    var3 = 0;
                    if ((var3 ^ -1) <= -8) {
                      var3 = 6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                  oc.a(var8, false);
                  return;
                }
              } else {
                L6: {
                  var3 = param1.field_Q + 1;
                  if (6 <= var3) {
                    var3 = 5;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var6 = uj.a(var3, 26 + fi.a(588, ki.field_b, (byte) -96) << -1794047064, param1.field_N, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << -840855192);
                oc.a(var6, false);
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
        field_c = "Passwords must be between 5 and 20 letters and numbers";
    }
}
