/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk {
    private java.util.zip.Inflater field_d;
    static int field_c;
    static String field_b;
    static cn field_e;
    static int field_a;

    final static wm a(int param0, Random param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var16 = null;
        int stackIn_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        var12 = DungeonAssault.field_K;
        bo.field_Jb = new wm(ib.field_l);
        wl.field_e = new int[ib.field_l];
        h.field_j = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ib.field_l) {
            ue.field_j = new int[ib.field_k];
            var2 = param0;
            L1: while (true) {
              if (ib.field_k <= var2) {
                L2: while (true) {
                  if ((h.field_j ^ -1) >= -1) {
                    L3: {
                      var2 = uj.a(param1, param0 ^ 37, 4);
                      var3 = uj.a(param1, 37, 3);
                      if (var3 == var2) {
                        var3 = 3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (0 != var2) {
                        if (0 != var3) {
                          break L4;
                        } else {
                          bo.field_Jb.a(20, -111);
                          break L4;
                        }
                      } else {
                        bo.field_Jb.a(20, -111);
                        break L4;
                      }
                    }
                    L5: {
                      if (1 != var2) {
                        if (1 != var3) {
                          break L5;
                        } else {
                          bo.field_Jb.a(21, -90);
                          break L5;
                        }
                      } else {
                        bo.field_Jb.a(21, -90);
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var2 == -3) {
                          break L7;
                        } else {
                          if (-3 == var3) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      bo.field_Jb.a(59, -86);
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (3 == var2) {
                          break L9;
                        } else {
                          if ((var3 ^ -1) == -4) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                      bo.field_Jb.a(66, -70);
                      break L8;
                    }
                    var4 = ec.h(24, 5);
                    var5 = 0;
                    L10: while (true) {
                      if (var5 <= -5) {
                        L11: while (true) {
                          var5 = 4;
                          var6 = -1;
                          var7 = 0;
                          L12: while (true) {
                            if (var7 >= ib.field_l) {
                              if (var6 != -1) {
                                bo.field_Jb.a(var6, -88);
                                var4 = ec.h(24, 5);
                                continue L11;
                              } else {
                                return bo.field_Jb;
                              }
                            } else {
                              if (var7 != 20) {
                                if (-22 != (var7 ^ -1)) {
                                  if (var7 != 59) {
                                    if ((var7 ^ -1) != -67) {
                                      if (8 <= qc.a(var7, -127, var4)) {
                                        var8 = sh.a(120, var7, var4);
                                        if (var5 < var8) {
                                          var6 = var7;
                                          var5 = var8;
                                          var7++;
                                          continue L12;
                                        } else {
                                          var7++;
                                          continue L12;
                                        }
                                      } else {
                                        var7++;
                                        continue L12;
                                      }
                                    } else {
                                      var7++;
                                      continue L12;
                                    }
                                  } else {
                                    var7++;
                                    continue L12;
                                  }
                                } else {
                                  var7++;
                                  continue L12;
                                }
                              } else {
                                var7++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        L13: {
                          if (-1 == var5) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L13;
                          } else {
                            if (1 != var5) {
                              if (-3 == (var5 ^ -1)) {
                                stackOut_51_0 = ib.field_k + -ib.field_j;
                                stackIn_53_0 = stackOut_51_0;
                                break L13;
                              } else {
                                stackOut_50_0 = -1 + ib.field_k;
                                stackIn_53_0 = stackOut_50_0;
                                break L13;
                              }
                            } else {
                              stackOut_48_0 = -1 + ib.field_j;
                              stackIn_53_0 = stackOut_48_0;
                              break L13;
                            }
                          }
                        }
                        var6 = stackIn_53_0;
                        var16 = ec.h(var6, param0 ^ 5);
                        var8 = 0;
                        var9 = -1;
                        var10 = 1;
                        L14: while (true) {
                          if (ib.field_l <= var10) {
                            if ((var9 ^ -1) != 0) {
                              bo.field_Jb.a(var9, -126);
                              var5++;
                              continue L10;
                            } else {
                              var5++;
                              continue L10;
                            }
                          } else {
                            if (var10 != -21) {
                              if (var10 != -22) {
                                if (-60 != var10) {
                                  if (-67 != var10) {
                                    if (10 <= qc.a(var10, 122, var16)) {
                                      L15: {
                                        var11 = sh.a(param0 + 123, var10, var16);
                                        if (-1 == var9) {
                                          break L15;
                                        } else {
                                          if (var8 < var11) {
                                            break L15;
                                          } else {
                                            var10++;
                                            continue L14;
                                          }
                                        }
                                      }
                                      var8 = var11;
                                      var9 = var10;
                                      var10++;
                                      continue L14;
                                    } else {
                                      var10++;
                                      continue L14;
                                    }
                                  } else {
                                    var10++;
                                    continue L14;
                                  }
                                } else {
                                  var10++;
                                  continue L14;
                                }
                              } else {
                                var10++;
                                continue L14;
                              }
                            } else {
                              var10++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    fo.a(-126, gd.a(param1, true));
                    continue L2;
                  }
                }
              } else {
                ue.field_j[var2] = var2;
                var2++;
                continue L1;
              }
            }
          } else {
            L16: {
              if (-15 == (var2 ^ -1)) {
                break L16;
              } else {
                if ((var2 ^ -1) == -16) {
                  break L16;
                } else {
                  if (26 == var2) {
                    break L16;
                  } else {
                    if (var2 == 27) {
                      break L16;
                    } else {
                      if ((var2 ^ -1) == -59) {
                        break L16;
                      } else {
                        if ((var2 ^ -1) == -61) {
                          break L16;
                        } else {
                          if (65 == var2) {
                            break L16;
                          } else {
                            if (var2 != 67) {
                              if (var2 == 20) {
                                break L16;
                              } else {
                                if ((var2 ^ -1) == -22) {
                                  break L16;
                                } else {
                                  if ((var2 ^ -1) == -60) {
                                    break L16;
                                  } else {
                                    if (var2 != 66) {
                                      h.field_j = h.field_j + 1;
                                      wl.field_e[h.field_j] = var2;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    public uk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        lj.a((java.awt.Component) (Object) param0, (byte) 70);
        if (param1 >= -119) {
            field_c = 72;
        }
        im.a((java.awt.Component) (Object) param0, (byte) 94);
        if (bn.field_j != null) {
            bn.field_j.a((byte) 123, (java.awt.Component) (Object) param0);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
            field_e = null;
        }
    }

    final void a(int param0, byte[] param1, ec param2) {
        try {
            if (-32 == param2.field_m[param2.field_o]) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (null == ((uk) this).field_d) {
                ((uk) this).field_d = new java.util.zip.Inflater(true);
            }
            try {
                ((uk) this).field_d.setInput(param2.field_m, 10 + param2.field_o, param2.field_m.length + -10 + (-param2.field_o + -8));
                int discarded$0 = ((uk) this).field_d.inflate(param1);
            } catch (Exception exception) {
                ((uk) this).field_d.reset();
                throw new RuntimeException("");
            }
            if (param0 >= -80) {
                field_e = null;
            }
            ((uk) this).field_d.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private uk(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
        field_c = 2;
    }
}
