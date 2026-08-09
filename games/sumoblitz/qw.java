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
                stackIn_67_0 = 1;
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
          field_c = (String) null;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        ah var7 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 >= 57) {
              if (param1.field_Q != 0) {
                if (jc.b(true) <= 20) {
                  var2_int = fi.a(2, he.field_o, (byte) -96);
                  if (1 != var2_int) {
                    L1: {
                      var3 = param1.field_N;
                      var4 = var3;
                      if ((var4 ^ -1) == -5) {
                        var3 = 0;
                        break L1;
                      } else {
                        if (0 == var4) {
                          var3 = 5;
                          break L1;
                        } else {
                          if ((var4 ^ -1) != -6) {
                            if ((var4 ^ -1) == -2) {
                              var3 = 2;
                              break L1;
                            } else {
                              if (2 != var4) {
                                break L1;
                              } else {
                                var3 = 6;
                                break L1;
                              }
                            }
                          } else {
                            var3 = 1;
                            break L1;
                          }
                        }
                      }
                    }
                    L2: {
                      if ((var3 ^ -1) <= -8) {
                        var3 = 6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var7 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b, (byte) -96) << 489241544, var3, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 1331489992);
                    oc.a(var7, false);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L3: {
                      var3 = param1.field_Q + 1;
                      if (6 <= var3) {
                        var3 = 5;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6 = uj.a(var3, 26 + fi.a(588, ki.field_b, (byte) -96) << -1794047064, param1.field_N, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << -840855192);
                    oc.a(var6, false);
                    return;
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("qw.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_c = "Passwords must be between 5 and 20 letters and numbers";
    }
}
