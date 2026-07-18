/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int field_h;
    static jj field_g;
    String field_b;
    boolean field_i;
    String[] field_d;
    int field_c;
    static String field_f;
    static String field_e;
    boolean field_a;

    public static void a() {
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static pd a(int param0) {
        if (og.field_a == qe.field_f) {
            throw new IllegalStateException();
        }
        if (k.field_b != qe.field_f) {
            return null;
        }
        qe.field_f = og.field_a;
        return wl.field_Q;
    }

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
        if (param0 > 11) {
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
            if (57 < param1) {
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
          field_g = null;
          if (48 <= param1) {
            if (57 < param1) {
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

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!fd.d(1)) {
                L2: {
                  ai.field_i.a(bb.a(-88, jb.field_b, ef.field_j), 127, bb.a(-110, lm.field_c, mm.field_c));
                  if (ai.field_i.c((byte) -118)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (ai.field_i.field_h < 0) {
                        break L4;
                      } else {
                        var3 = pj.field_l[ai.field_i.field_h];
                        if (var3 == 2) {
                          int discarded$3 = 25501;
                          wf.c();
                          break L3;
                        } else {
                          if (var3 == 5) {
                            int discarded$4 = 25501;
                            wf.c();
                            break L3;
                          } else {
                            L5: {
                              if (var3 != 0) {
                                break L5;
                              } else {
                                if (pe.field_e != 2) {
                                  break L5;
                                } else {
                                  var4 = ll.a(1000) - hj.field_I;
                                  var6 = (int)((-var4 + 10999L) / 1000L);
                                  if (var6 > 0) {
                                    break L5;
                                  } else {
                                    var3 = 2;
                                    ja.a(121, true, 5);
                                    break L5;
                                  }
                                }
                              }
                            }
                            return var3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (pe.field_e != 2) {
                      int discarded$5 = 25501;
                      wf.c();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (pe.field_e != 2) {
                      break L6;
                    } else {
                      var4 = ll.a(1000) - hj.field_I;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        var3 = 2;
                        ja.a(121, true, 5);
                        break L6;
                      }
                    }
                  }
                }
                stackOut_30_0 = var3;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                L7: {
                  ai.field_i.b((byte) -87);
                  if (!ai.field_i.c((byte) -127)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (lf.field_c == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "pd.C(" + false + ')');
        }
        return stackIn_31_0;
    }

    pd(boolean param0) {
        ((pd) this).field_i = param0 ? true : false;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) a.field_d);
        try {
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) a.field_d);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) a.field_d);
            wa.field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "pd.D(" + -26 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "REC";
        field_f = "HARD MODE UNLOCKED";
        field_g = new jj();
    }
}
