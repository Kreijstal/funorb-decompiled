/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends dv {
    static String field_A;
    static ea field_w;
    static String field_B;
    static String field_C;
    static int field_y;
    static String field_u;
    static String field_v;
    private dr[] field_z;
    static int field_x;

    final boolean a(int param0, char param1, int param2) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_25_0 = 0;
        char stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        char stackOut_27_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ij) this).a(-31501)) {
          var12 = ((ij) this).field_o.q(param0 ^ param0);
          var5 = ((ij) this).field_o.o(param0 ^ 30781);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            if (var5 <= var9) {
              L1: {
                if (0 >= var5) {
                  stackOut_25_0 = 65535;
                  stackIn_26_0 = stackOut_25_0;
                  break L1;
                } else {
                  stackOut_24_0 = var12.charAt(var5 - 1);
                  stackIn_26_0 = stackOut_24_0;
                  break L1;
                }
              }
              L2: {
                var9 = stackIn_26_0;
                if (var12.length() <= var5) {
                  stackOut_28_0 = 65535;
                  stackIn_29_0 = stackOut_28_0;
                  break L2;
                } else {
                  stackOut_27_0 = var12.charAt(var5);
                  stackIn_29_0 = stackOut_27_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  L5: {
                    var10 = stackIn_29_0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (param1 != 34) {
                          break L5;
                        } else {
                          if (var10 == 34) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (39 != param1) {
                          break L6;
                        } else {
                          if (var10 == 39) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var6 != 0) {
                      break L7;
                    } else {
                      if (var7 != 0) {
                        break L7;
                      } else {
                        if (param1 != 41) {
                          break L7;
                        } else {
                          if (var10 == 41) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if ((param2 ^ -1) != -86) {
                      break L8;
                    } else {
                      L9: {
                        if (var9 != 40) {
                          break L9;
                        } else {
                          if (var10 == 41) {
                            boolean discarded$7 = ((ij) this).field_o.a(101, -26126, '￿');
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var6 == 0) {
                          break L10;
                        } else {
                          if (var9 != 34) {
                            break L10;
                          } else {
                            if (var10 == 34) {
                              boolean discarded$8 = ((ij) this).field_o.a(101, -26126, '￿');
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L8;
                      } else {
                        if (39 != var9) {
                          break L8;
                        } else {
                          if (39 != var10) {
                            break L8;
                          } else {
                            boolean discarded$9 = ((ij) this).field_o.a(101, -26126, '￿');
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    boolean discarded$10 = this.a(-30847, param1, param2);
                    var4 = ((ij) this).field_o.q(param0 ^ -30847);
                    var5 = ((ij) this).field_o.o(param0 ^ -30779);
                    if (var6 != 0) {
                      break L11;
                    } else {
                      if (var7 != 0) {
                        break L11;
                      } else {
                        if (param1 == 40) {
                          boolean discarded$11 = ((ij) this).field_o.a(-1, -26126, ')');
                          ((ij) this).field_o.a(-98, var5, var5);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    if (var6 != 0) {
                      break L12;
                    } else {
                      if (var7 != 0) {
                        break L12;
                      } else {
                        if (param1 == 34) {
                          boolean discarded$12 = ((ij) this).field_o.a(-1, -26126, '"');
                          ((ij) this).field_o.a(param0 + 30749, var5, var5);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (var6 != 0) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (param1 == 39) {
                        boolean discarded$13 = ((ij) this).field_o.a(-1, param0 + 4721, '\'');
                        ((ij) this).field_o.a(-98, var5, var5);
                        break L3;
                      } else {
                        vs.field_c = wf.a(((ij) this).field_o.q(0), -101);
                        return true;
                      }
                    }
                  }
                }
                ((ij) this).field_o.c(1 + var5, false);
                break L3;
              }
              vs.field_c = wf.a(((ij) this).field_o.q(0), -101);
              return true;
            } else {
              if (var8 == 0) {
                L13: {
                  L14: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L14;
                    } else {
                      if (var7 != 0) {
                        break L14;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_14_0 = stackOut_8_0;
                        break L13;
                      }
                    }
                  }
                  if (var10 == 92) {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L13;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_14_0 = stackOut_11_0;
                    break L13;
                  }
                }
                L15: {
                  L16: {
                    var8 = stackIn_14_0;
                    stackOut_14_0 = var6;
                    stackIn_17_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var7 != 0) {
                      break L16;
                    } else {
                      stackOut_15_0 = stackIn_15_0;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var10 != 34) {
                        break L16;
                      } else {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        break L15;
                      }
                    }
                  }
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L15;
                }
                L17: {
                  L18: {
                    var6 = stackIn_18_0 ^ stackIn_18_1;
                    stackOut_18_0 = var7;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var6 != 0) {
                      break L18;
                    } else {
                      stackOut_19_0 = stackIn_19_0;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var10 != 39) {
                        break L18;
                      } else {
                        stackOut_20_0 = stackIn_20_0;
                        stackOut_20_1 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L17;
                      }
                    }
                  }
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L17;
                }
                var7 = stackIn_22_0 ^ stackIn_22_1;
                var9++;
                continue L0;
              } else {
                var8 = 0;
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return this.a(-30847, param1, param2);
        }
    }

    ij(at param0, ka param1, hd param2) {
        super(param1, param2);
        ((ij) this).field_z = new dr[param0.b(false)];
        int var4 = 0;
        dr var5 = (dr) (Object) param0.e((byte) 94);
        while (var5 != null) {
            var4++;
            ((ij) this).field_z[var4] = var5;
            var5 = (dr) (Object) param0.a((byte) 123);
        }
        ((ij) this).a(-1, "# <col=ffaaff>FunOrbConsole (loaded " + ((ij) this).field_z.length + " methods at " + new Date() + ")</col>");
    }

    final void b(int param0) {
        int var2 = -78 / ((param0 - 13) / 33);
        String var3 = ((ij) this).field_o.field_Pb.field_X;
        ((ij) this).field_o.field_Pb.field_X = vs.field_c;
        this.b(-100);
        ((ij) this).field_o.field_Pb.field_X = var3;
    }

    final String[] b(boolean param0) {
        int var3 = 0;
        og[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        dr var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object var12 = null;
        String var13 = null;
        og var14 = null;
        ui var15 = null;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var13 = ((ij) this).field_o.q(0);
          var6 = var13;
          var3 = ((ij) this).field_o.o(95);
          var4 = vv.a(var13, 114);
          var5 = ms.a(var3, var4, -122);
          ((ij) this).field_s.field_S = 0;
          var6 = "";
          if (0 > var5) {
            break L0;
          } else {
            L1: {
              var14 = var4[var5];
              var8_int = -var14.field_s + var3;
              if (rn.field_c != var14.field_q) {
                break L1;
              } else {
                if (var8_int > 0) {
                  var13 = var6;
                  var6 = var14.field_o.substring(0, Math.min(var14.field_o.length(), var8_int));
                  ((ij) this).field_s.field_S = ((ij) this).field_t.a(var13.substring(0, var14.field_s));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var9 = var5;
            var10_int = 0;
            L2: while (true) {
              L3: {
                if (-1 < (var9 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (gm.field_d == var4[var9].field_q) {
                      var10_int++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4[var9].field_q != mo.field_j) {
                      break L5;
                    } else {
                      var10_int--;
                      break L5;
                    }
                  }
                  if (var10_int < 0) {
                    break L3;
                  } else {
                    var9--;
                    continue L2;
                  }
                }
              }
              if (0 >= var9) {
                break L0;
              } else {
                if (var4[var9 + -1].field_q == rn.field_c) {
                  var13 = var6;
                  var6 = var4[-1 + var9].field_o;
                  ((ij) this).field_s.field_S = ((ij) this).field_t.a(var13.substring(0, var4[-1 + var9].field_s));
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          var15 = this.a((byte) -75, var6);
          var8 = new String[var15.a(30578)];
          var9 = 0;
          var10 = (dr) (Object) var15.a((byte) 43);
          if (param0) {
            break L6;
          } else {
            var12 = null;
            ui discarded$1 = this.a((byte) 83, (String) null);
            break L6;
          }
        }
        L7: while (true) {
          if (var10 == null) {
            return var8;
          } else {
            var9++;
            var8[var9] = var10.field_A;
            var10 = (dr) (Object) var15.c(24);
            continue L7;
          }
        }
    }

    final static au b(byte param0, int param1) {
        if (param0 != 74) {
            return null;
        }
        return (au) (Object) (null == qm.field_J ? null : qm.field_J.a((byte) -27, (long)param1));
    }

    final void a(byte param0) {
        int var3 = 0;
        og[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dr var12_ref_dr = null;
        int var12 = 0;
        dr var13 = null;
        int var14 = 0;
        String var15 = null;
        og var16 = null;
        ui var17 = null;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var15 = ((ij) this).field_o.q(0);
          var6 = var15;
          var6 = var15;
          var3 = ((ij) this).field_o.o(-105);
          var4 = vv.a(var15, param0 + -11);
          var5 = ms.a(var3, var4, -126);
          var6 = "";
          if (0 > var5) {
            break L0;
          } else {
            var16 = var4[var5];
            var8_int = var3 + -var16.field_s;
            if (rn.field_c != var16.field_q) {
              break L0;
            } else {
              if (0 >= var8_int) {
                break L0;
              } else {
                if (var16.field_o.length() < var8_int) {
                  break L0;
                } else {
                  var6 = var16.field_o.substring(0, var8_int);
                  break L0;
                }
              }
            }
          }
        }
        var17 = this.a((byte) -75, var6);
        if (0 == var17.a(30578)) {
          return;
        } else {
          L1: {
            if (param0 == 122) {
              break L1;
            } else {
              ((ij) this).b(77);
              break L1;
            }
          }
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_dr = (dr) (Object) var17.a((byte) -110);
          L2: while (true) {
            if (var12_ref_dr == null) {
              L3: while (true) {
                L4: {
                  if (var10 == 0) {
                    break L4;
                  } else {
                    if (var11 <= var9) {
                      break L4;
                    } else {
                      var12 = ((dr) (Object) var17.a((byte) -112)).field_B.charAt(var9);
                      var13 = (dr) (Object) var17.c(24);
                      L5: while (true) {
                        if (var13 == null) {
                          var9++;
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            StringBuilder discarded$2 = var8.append(var12);
                            continue L3;
                          }
                        } else {
                          L6: {
                            stackOut_20_0 = var10;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var12 != var13.field_B.charAt(var9)) {
                              stackOut_22_0 = stackIn_22_0;
                              stackOut_22_1 = 0;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              break L6;
                            } else {
                              stackOut_21_0 = stackIn_21_0;
                              stackOut_21_1 = 1;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_23_1 = stackOut_21_1;
                              break L6;
                            }
                          }
                          var10 = stackIn_23_0 & stackIn_23_1;
                          var13 = (dr) (Object) var17.c(24);
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L7: {
                  var12 = var3 - -var8.length();
                  if (var6.length() + var8.length() == var11) {
                    L8: {
                      var12++;
                      StringBuilder discarded$3 = var8.append("()");
                      if ((var17.a(30578) ^ -1) != -2) {
                        break L8;
                      } else {
                        if (((dr) (Object) var17.a((byte) 44)).field_u.length == 0) {
                          var12++;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((ij) this).field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                    ((ij) this).field_o.c(var12, false);
                    break L7;
                  } else {
                    ((ij) this).field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                    ((ij) this).field_o.c(var12, false);
                    break L7;
                  }
                }
                return;
              }
            } else {
              L9: {
                if (var11 > var12_ref_dr.field_B.length()) {
                  var11 = var12_ref_dr.field_B.length();
                  break L9;
                } else {
                  break L9;
                }
              }
              var12_ref_dr = (dr) (Object) var17.c(24);
              continue L2;
            }
          }
        }
    }

    private final ui a(byte param0, String param1) {
        ui var3 = null;
        int var4 = 0;
        int var5 = 0;
        ui var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -75) {
          var6 = new ui();
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((ij) this).field_z.length) {
              return var3;
            } else {
              if (((ij) this).field_z[var4].field_B.startsWith(param1)) {
                ((ij) this).field_z[var4].c((byte) -76);
                var6.a((ms) (Object) ((ij) this).field_z[var4], false);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(String param0, boolean param1) {
        try {
            ef var3 = null;
            cb var3_ref = null;
            je var4 = null;
            og var5 = null;
            at var6 = null;
            es var7 = null;
            int stackIn_2_0 = 0;
            int stackIn_7_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_1_0 = 0;
            int stackOut_6_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = gu.a(false, param0);
                            if (param1) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = 1;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return stackIn_2_0 != 0;
                    }
                    case 3: {
                        try {
                            var7 = new es(var6);
                            var5 = fk.a(var7, -39);
                            if (!var7.a(124)) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw new ef(var7.a((byte) 13).field_s);
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((ij) this).a((Object) (Object) var5.a(1, ((ij) this).field_z), -58);
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ef ? 8 : 9);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        var3 = (ef) (Object) caughtException;
                        param0 = "<col=55ff55>" + param0.substring(0, var3.field_b) + "</col>" + param0.substring(var3.field_b);
                        var4 = (je) (Object) ((ij) this).field_d.field_Jb.field_fb.d((byte) -98);
                        var4.field_X = ((ij) this).field_c + param0;
                        return false;
                    }
                    case 9: {
                        var3_ref = (cb) (Object) caughtException;
                        ((ij) this).a(-1, var3_ref.field_b);
                        return false;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        int var1 = 10 % ((55 - param0) / 54);
        field_A = null;
        field_v = null;
        field_B = null;
        field_u = null;
        field_w = null;
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Model Viewer";
        field_A = "Click a unit's base to select it";
        field_B = "The King Black Dragon is already available.";
        field_y = 0;
        field_v = "Group";
        field_u = "Report abuse";
        field_x = 480;
    }
}
