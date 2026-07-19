/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gi {
    static byte[] field_c;
    static uc field_b;
    static String[] field_a;
    static sf field_d;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (ii.a(1, param1)) {
            return true;
          } else {
            if (param1 != (char)param0) {
              if (160 != param1) {
                if (32 != param1) {
                  if (95 == param1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (ae.field_a.field_i >= param0) {
                return true;
            }
            if (!(null != sg.field_h)) {
                return false;
            }
            if (!param1) {
                field_d = (sf) null;
            }
            int var2_int = sg.field_h.e(-114);
            if (var2_int > 0) {
                if (!(var2_int <= param0 + -ae.field_a.field_i)) {
                    var2_int = param0 - ae.field_a.field_i;
                }
                sg.field_h.a(var2_int, ae.field_a.field_k, ae.field_a.field_i, false);
                ug.field_d = lj.a((byte) -128);
                ae.field_a.field_i = ae.field_a.field_i + var2_int;
                if (ae.field_a.field_i < param0) {
                    return false;
                }
                ae.field_a.field_i = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (-1 >= (var2_int ^ -1)) {
                    if ((h.b(115) ^ -1L) >= -30001L) {
                        return false;
                    }
                }
                k.c(-28354);
            } catch (IOException iOException) {
                k.c(-28354);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(int param0, byte param1);

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_34_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_33_0 = false;
        boolean stackOut_23_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param5 <= param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 - -1 < param2) {
                L1: {
                  if (param2 <= 5 + param1) {
                    break L1;
                  } else {
                    if (param6 == param4) {
                      break L1;
                    } else {
                      var7_int = (1 & (param6 & param4)) + ((param6 >> -1403664127) + (param4 >> -1570190047));
                      var8 = param1;
                      var9 = param4;
                      var10 = param6;
                      var11 = param1;
                      L2: while (true) {
                        L3: {
                          if (param2 <= var11) {
                            gi.a(param0, param1, var8, param3, param4, param5, var9);
                            stackOut_33_0 = param0;
                            stackIn_34_0 = stackOut_33_0;
                            break L3;
                          } else {
                            var12 = mh.field_y[var11];
                            stackOut_23_0 = param0;
                            stackIn_34_0 = stackOut_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_24_0) {
                                  stackOut_26_0 = uj.field_a[var12];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L4;
                                } else {
                                  stackOut_25_0 = jl.field_b[var12];
                                  stackIn_27_0 = stackOut_25_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_27_0;
                                  if (var7_int >= var13) {
                                    break L6;
                                  } else {
                                    mh.field_y[var11] = mh.field_y[var8];
                                    incrementValue$1 = var8;
                                    var8++;
                                    mh.field_y[incrementValue$1] = var12;
                                    if (var9 <= var13) {
                                      break L5;
                                    } else {
                                      var9 = var13;
                                      if (var14 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                if (var10 >= var13) {
                                  break L5;
                                } else {
                                  var10 = var13;
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        gi.a(stackIn_34_0, var8, param2, -3300, var10, param5, param6);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L7: while (true) {
                  stackOut_10_0 = param1;
                  stackIn_11_0 = stackOut_10_0;
                  L8: while (true) {
                    L9: {
                      if (stackIn_11_0 >= var7_int) {
                        break L9;
                      } else {
                        var8 = param1;
                        L10: while (true) {
                          L11: {
                            if (var8 >= var7_int) {
                              break L11;
                            } else {
                              var9 = mh.field_y[var8];
                              var10 = mh.field_y[1 + var8];
                              stackOut_14_0 = ob.a(param0, var9, true, var10);
                              stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var14 != 0) {
                                continue L8;
                              } else {
                                L12: {
                                  if (stackIn_15_0) {
                                    mh.field_y[var8] = var10;
                                    mh.field_y[1 + var8] = var9;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var7), "gi.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = param2;
                  var7 = param0.length();
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      if (var8 >= var7) {
                        stackOut_42_0 = var5;
                        stackIn_43_0 = stackOut_42_0;
                        break L3;
                      } else {
                        var9 = param0.charAt(var8);
                        stackOut_7_0 = var8;
                        stackIn_43_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_8_0 == 0) {
                                L6: {
                                  if (var9 != 45) {
                                    break L6;
                                  } else {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (var9 != 43) {
                                  break L5;
                                } else {
                                  if (!param1) {
                                    break L5;
                                  } else {
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              L8: {
                                if (var9 < 48) {
                                  break L8;
                                } else {
                                  if (var9 > 57) {
                                    break L8;
                                  } else {
                                    var9 -= 48;
                                    break L7;
                                  }
                                }
                              }
                              L9: {
                                if (var9 < 65) {
                                  break L9;
                                } else {
                                  if (var9 > 90) {
                                    break L9;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              if (var9 < 97) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  if (var11 == 0) {
                                    break L7;
                                  } else {
                                    var9 -= 48;
                                    break L7;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                            if (var9 >= param3) {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              L10: {
                                if (var4_int == 0) {
                                  break L10;
                                } else {
                                  var9 = -var9;
                                  break L10;
                                }
                              }
                              var10 = param3 * var6 - -var9;
                              if (var10 / param3 == var6) {
                                var5 = 1;
                                var6 = var10;
                                break L4;
                              } else {
                                stackOut_38_0 = 0;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var8++;
                          continue L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("gi.L(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_43_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_39_0 != 0;
            }
          }
        }
    }

    abstract byte[] b(int param0, boolean param1);

    abstract rf a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 < 26) {
            field_b = (uc) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
