/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends hn {
    static int field_z;
    private ih field_r;
    private boolean field_F;
    private int field_x;
    private int field_C;
    ih field_y;
    private boolean field_B;
    static int field_o;
    static String field_u;
    ih field_w;
    ih field_D;
    private int[] field_E;
    private um field_p;
    private um field_q;
    private int[] field_t;
    static kl field_s;
    private int field_v;
    private int field_G;
    private um field_A;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((nm) this).field_x >= -1) {
          ((nm) this).a(param2);
          return;
        } else {
          L0: {
            if (((nm) this).field_F) {
              if (-1 < ((nm) this).field_C) {
                if (!((nm) this).field_w.g(11899)) {
                  ((nm) this).field_F = false;
                  ((nm) this).field_p = null;
                  ((nm) this).field_C = -((nm) this).field_C;
                  break L0;
                } else {
                  if (((nm) this).field_C >= 0) {
                    break L0;
                  } else {
                    if (((nm) this).field_D.g(11899)) {
                      break L0;
                    } else {
                      ((nm) this).field_F = false;
                      ((nm) this).field_C = -((nm) this).field_C;
                      ((nm) this).field_A = null;
                      break L0;
                    }
                  }
                }
              } else {
                if (((nm) this).field_C >= 0) {
                  break L0;
                } else {
                  if (((nm) this).field_D.g(11899)) {
                    break L0;
                  } else {
                    ((nm) this).field_F = false;
                    ((nm) this).field_C = -((nm) this).field_C;
                    ((nm) this).field_A = null;
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L1: {
            var4 = (((nm) this).field_G >> -1158767380) * ((nm) this).field_x / 256;
            var5 = -var4 + ((nm) this).field_x;
            if (((nm) this).field_C == 0) {
              break L1;
            } else {
              ((nm) this).field_G = ((nm) this).field_G + param2 * ((nm) this).field_C;
              if (1048576 > ((nm) this).field_G) {
                if (-1 > (((nm) this).field_G ^ -1)) {
                  break L1;
                } else {
                  ((nm) this).field_G = 0;
                  if (((nm) this).field_F) {
                    break L1;
                  } else {
                    ((nm) this).field_C = 0;
                    if (!((nm) this).field_B) {
                      L2: {
                        if (((nm) this).field_p == null) {
                          break L2;
                        } else {
                          ((nm) this).field_w.j(7);
                          break L2;
                        }
                      }
                      ((nm) this).field_p = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                ((nm) this).field_G = 1048576;
                if (((nm) this).field_F) {
                  break L1;
                } else {
                  ((nm) this).field_C = 0;
                  if (!((nm) this).field_B) {
                    L3: {
                      if (null != ((nm) this).field_A) {
                        ((nm) this).field_D.j(7);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((nm) this).field_A = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L4: {
            if (!rc.field_q) {
              stackOut_33_0 = param2;
              stackIn_34_0 = stackOut_33_0;
              break L4;
            } else {
              stackOut_32_0 = param2 << -1077437279;
              stackIn_34_0 = stackOut_32_0;
              break L4;
            }
          }
          L5: {
            var6 = stackIn_34_0;
            if (-257 < ((nm) this).field_v) {
              L6: {
                if (((nm) this).field_p != null) {
                  break L6;
                } else {
                  if (null == ((nm) this).field_A) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (-257 != var4) {
                if (-257 == (var5 ^ -1)) {
                  ((nm) this).field_D.b(param0, param1, param2);
                  break L5;
                } else {
                  L7: {
                    L8: {
                      if (null == ((nm) this).field_t) {
                        break L8;
                      } else {
                        if (var6 <= ((nm) this).field_t.length) {
                          vm.a(((nm) this).field_t, 0, var6);
                          vm.a(((nm) this).field_E, 0, var6);
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((nm) this).field_t = new int[var6];
                    ((nm) this).field_E = new int[var6];
                    break L7;
                  }
                  L9: {
                    ((nm) this).field_w.b(((nm) this).field_t, 0, param2);
                    ((nm) this).field_D.b(((nm) this).field_E, 0, param2);
                    if (!rc.field_q) {
                      stackOut_49_0 = param1;
                      stackIn_50_0 = stackOut_49_0;
                      break L9;
                    } else {
                      param1 = param1 << 1;
                      stackOut_48_0 = param1 << 1;
                      stackIn_50_0 = stackOut_48_0;
                      break L9;
                    }
                  }
                  var7 = stackIn_50_0;
                  var8 = 0;
                  L10: while (true) {
                    if (var8 >= var6) {
                      break L5;
                    } else {
                      param0[var7 - -var8] = param0[var7 - -var8] + (var5 * ((nm) this).field_E[var8] + var4 * ((nm) this).field_t[var8] >> 1437544328);
                      var8++;
                      continue L10;
                    }
                  }
                }
              } else {
                ((nm) this).field_w.b(param0, param1, param2);
                break L5;
              }
            } else {
              break L5;
            }
          }
          L11: {
            if (((nm) this).field_q == null) {
              break L11;
            } else {
              if (-1 != (((nm) this).field_v ^ -1)) {
                L12: {
                  L13: {
                    if (((nm) this).field_t == null) {
                      break L13;
                    } else {
                      if (var6 > ((nm) this).field_t.length) {
                        break L13;
                      } else {
                        vm.a(((nm) this).field_t, 0, var6);
                        break L12;
                      }
                    }
                  }
                  ((nm) this).field_E = new int[var6];
                  ((nm) this).field_t = new int[var6];
                  break L12;
                }
                L14: {
                  ((nm) this).field_r.b(((nm) this).field_t, 0, param2);
                  if (!rc.field_q) {
                    stackOut_63_0 = param1;
                    stackIn_64_0 = stackOut_63_0;
                    break L14;
                  } else {
                    param1 = param1 << 1;
                    stackOut_62_0 = param1 << 1;
                    stackIn_64_0 = stackOut_62_0;
                    break L14;
                  }
                }
                var7 = stackIn_64_0;
                var8 = ((nm) this).field_x * ((nm) this).field_v / 256;
                var9 = -var8 + ((nm) this).field_x;
                var10 = 0;
                L15: while (true) {
                  if (var10 >= var6) {
                    break L11;
                  } else {
                    param0[var10 + var7] = param0[var10 + var7] * var9 - -(var8 * ((nm) this).field_t[var10]) >> -1668644856;
                    var10++;
                    continue L15;
                  }
                }
              } else {
                break L11;
              }
            }
          }
          return;
        }
    }

    final static void a(um param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param3 == 41) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_u = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (lk.field_e == null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    bk.a(param2, 1048576, param0, param3 + 20566, param1);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (null != au.field_Kb) {
                        statePc = 6;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = (Object) (Object) l.field_a;
                    // monitorenter l.field_a
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        au.field_Kb.a(param2, -1, (byte) -91);
                        if (lo.field_u == param0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        au.field_Kb.j(7);
                        l.field_a.c();
                        lo.field_u = param0;
                        if (lo.field_u == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        au.field_Kb.a(2, param1, lo.field_u);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var5;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final hn a() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
            return false;
        }
        return (param0 ^ -1) <= -1 ? true : false;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((nm) this).field_G >= -1) {
            break L0;
          } else {
            if (((nm) this).field_p != null) {
              ((nm) this).field_w.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1048577 <= ((nm) this).field_G) {
            if (-1 >= ((nm) this).field_v) {
              break L1;
            } else {
              if (null == ((nm) this).field_q) {
                break L1;
              } else {
                ((nm) this).field_r.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= ((nm) this).field_v) {
              break L1;
            } else {
              if (null == ((nm) this).field_q) {
                break L1;
              } else {
                ((nm) this).field_r.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!((nm) this).field_F) {
            break L2;
          } else {
            if (((nm) this).field_C > 0) {
              if (!((nm) this).field_w.g(11899)) {
                ((nm) this).field_F = false;
                ((nm) this).field_C = -((nm) this).field_C;
                ((nm) this).field_p = null;
                break L2;
              } else {
                if ((((nm) this).field_C ^ -1) <= -1) {
                  break L2;
                } else {
                  if (((nm) this).field_D.g(11899)) {
                    break L2;
                  } else {
                    ((nm) this).field_F = false;
                    ((nm) this).field_C = -((nm) this).field_C;
                    ((nm) this).field_A = null;
                    break L2;
                  }
                }
              }
            } else {
              if ((((nm) this).field_C ^ -1) <= -1) {
                break L2;
              } else {
                if (((nm) this).field_D.g(11899)) {
                  break L2;
                } else {
                  ((nm) this).field_F = false;
                  ((nm) this).field_C = -((nm) this).field_C;
                  ((nm) this).field_A = null;
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (((nm) this).field_C != 0) {
            ((nm) this).field_G = ((nm) this).field_G + ((nm) this).field_C * param0;
            if ((((nm) this).field_G ^ -1) > -1048577) {
              if ((((nm) this).field_G ^ -1) >= -1) {
                ((nm) this).field_G = 0;
                if (((nm) this).field_F) {
                  break L3;
                } else {
                  ((nm) this).field_C = 0;
                  if (((nm) this).field_B) {
                    break L3;
                  } else {
                    L4: {
                      if (null != ((nm) this).field_p) {
                        ((nm) this).field_w.j(7);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((nm) this).field_p = null;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            } else {
              ((nm) this).field_G = 1048576;
              if (!((nm) this).field_F) {
                ((nm) this).field_C = 0;
                if (!((nm) this).field_B) {
                  L5: {
                    if (((nm) this).field_A != null) {
                      ((nm) this).field_D.j(7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((nm) this).field_A = null;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
    }

    final synchronized void a(int param0, boolean param1, um param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        ih stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ih stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ih stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        ih stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        ih stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ih stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        ih stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ih stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        ih stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        ih stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ih stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        ih stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!((nm) this).field_F) {
            break L0;
          } else {
            if (param1) {
              L1: {
                if (-1 <= (((nm) this).field_C ^ -1)) {
                  L2: {
                    if (null != ((nm) this).field_A) {
                      ((nm) this).field_D.j(7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((nm) this).field_A = param2;
                  if (param2 == null) {
                    break L1;
                  } else {
                    ((nm) this).field_D.a(2, false, param2);
                    this.a(-1, ((nm) this).field_D, param5, param0);
                    break L1;
                  }
                } else {
                  L3: {
                    if (((nm) this).field_p != null) {
                      ((nm) this).field_w.j(7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((nm) this).field_p = param2;
                  if (param2 == null) {
                    break L1;
                  } else {
                    ((nm) this).field_w.a(2, false, param2);
                    this.a(-1, ((nm) this).field_w, param5, param0);
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param1) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L4;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L4;
          }
        }
        ((nm) this).field_F = stackIn_18_1 != 0;
        if (param2 == ((nm) this).field_p) {
          ((nm) this).field_C = param4;
          this.a(-1, ((nm) this).field_w, param5, param0);
          return;
        } else {
          if (param2 == ((nm) this).field_A) {
            ((nm) this).field_C = -param4;
            this.a(-1, ((nm) this).field_D, param5, param0);
            return;
          } else {
            L5: {
              if (param3 == -1) {
                break L5;
              } else {
                var9 = null;
                this.a(-25, (ih) null, 43, -18);
                break L5;
              }
            }
            L6: {
              if (((nm) this).field_p == null) {
                var7 = 1;
                break L6;
              } else {
                if (null == ((nm) this).field_A) {
                  var7 = 0;
                  break L6;
                } else {
                  L7: {
                    if (-524289 >= (((nm) this).field_G ^ -1)) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_30_0;
                  break L6;
                }
              }
            }
            L8: {
              if (var7 != 0) {
                L9: {
                  if (((nm) this).field_p == null) {
                    break L9;
                  } else {
                    ((nm) this).field_w.j(7);
                    break L9;
                  }
                }
                L10: {
                  ((nm) this).field_p = param2;
                  if (param2 != null) {
                    L11: {
                      stackOut_47_0 = ((nm) this).field_w;
                      stackOut_47_1 = 2;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (param1) {
                        stackOut_49_0 = (ih) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L11;
                      } else {
                        stackOut_48_0 = (ih) (Object) stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L11;
                      }
                    }
                    ((ih) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param2);
                    this.a(param3 + 0, ((nm) this).field_w, param5, param0);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((nm) this).field_C = param4;
                break L8;
              } else {
                L12: {
                  if (null == ((nm) this).field_A) {
                    break L12;
                  } else {
                    ((nm) this).field_D.j(7);
                    break L12;
                  }
                }
                L13: {
                  ((nm) this).field_A = param2;
                  if (param2 != null) {
                    L14: {
                      stackOut_38_0 = ((nm) this).field_D;
                      stackOut_38_1 = param3 + 3;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (param1) {
                        stackOut_40_0 = (ih) (Object) stackIn_40_0;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        break L14;
                      } else {
                        stackOut_39_0 = (ih) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        break L14;
                      }
                    }
                    ((ih) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, param2);
                    this.a(param3 ^ 0, ((nm) this).field_D, param5, param0);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((nm) this).field_C = -param4;
                break L8;
              }
            }
            return;
          }
        }
    }

    final hn b() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        ((nm) this).field_x = param0;
        int var3 = 74 % ((param1 - -65) / 46);
    }

    final synchronized int c() {
        return 2;
    }

    private final void a(int param0, ih param1, ih param2) {
        ((nm) this).field_D = param2;
        ((nm) this).field_w = param1;
        ((nm) this).field_G = 1048576;
        ((nm) this).field_y = ((nm) this).field_w;
        if (param0 < 36) {
            Object var5 = null;
            this.a(-114, (ih) null, (ih) null);
        }
    }

    public static void e(int param0) {
        if (param0 != 256) {
            field_u = null;
        }
        field_u = null;
        field_s = null;
    }

    private final void a(int param0, ih param1, int param2, int param3) {
        ((nm) this).field_y = param1;
        param1.a(param3, param0, (byte) -55);
        param1.c(param2, param0 ^ 34);
    }

    final static void a(byte param0, boolean param1) {
        je stackIn_4_0 = null;
        je stackIn_5_0 = null;
        je stackIn_6_0 = null;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_8_0 = null;
        je stackIn_9_0 = null;
        je stackIn_10_0 = null;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_21_0 = null;
        je stackIn_22_0 = null;
        je stackIn_23_0 = null;
        je stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        je stackIn_25_0 = null;
        je stackIn_26_0 = null;
        je stackIn_27_0 = null;
        je stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        je stackOut_3_0 = null;
        je stackOut_4_0 = null;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        je stackOut_7_0 = null;
        je stackOut_8_0 = null;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        je stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        je stackOut_20_0 = null;
        je stackOut_21_0 = null;
        je stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        je stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        je stackOut_24_0 = null;
        je stackOut_25_0 = null;
        je stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        je stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        L0: {
          id.a(-640 + qn.field_l >> -1264848031, 640 + qn.field_l >> -2033411135, qn.field_g, 0, (byte) 91);
          if (gk.field_J <= 0) {
            break L0;
          } else {
            L1: {
              if (null == dh.field_k) {
                break L1;
              } else {
                dh.field_k.f(no.field_T.field_S, 0);
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_3_0 = no.field_T;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_4_0 = (je) (Object) stackIn_4_0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackOut_5_0 = (je) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = (je) (Object) stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L2;
            }
            L4: {
              L5: {
                ((je) (Object) stackIn_7_0).b(stackIn_7_1 != 0, 20);
                stackOut_7_0 = ov.field_i;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_8_0 = (je) (Object) stackIn_8_0;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (bw.field_g) {
                    break L5;
                  } else {
                    stackOut_9_0 = (je) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (je) (Object) stackIn_10_0;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L4;
            }
            ((je) (Object) stackIn_11_0).b(stackIn_11_1 != 0, 20);
            break L0;
          }
        }
        if (param0 == 95) {
          L6: {
            L7: {
              if (0 < bd.field_r) {
                break L7;
              } else {
                if (rk.field_D > 0) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (dh.field_k != null) {
                dh.field_k.f(lk.field_a.field_S, 0);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                stackOut_20_0 = lk.field_a;
                stackIn_23_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (!param1) {
                  break L10;
                } else {
                  stackOut_21_0 = (je) (Object) stackIn_21_0;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (vk.field_f) {
                    break L10;
                  } else {
                    stackOut_22_0 = (je) (Object) stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L9;
                  }
                }
              }
              stackOut_23_0 = (je) (Object) stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L9;
            }
            L11: {
              L12: {
                ((je) (Object) stackIn_24_0).b(stackIn_24_1 != 0, 20);
                stackOut_24_0 = pd.field_c;
                stackIn_27_0 = stackOut_24_0;
                stackIn_25_0 = stackOut_24_0;
                if (!param1) {
                  break L12;
                } else {
                  stackOut_25_0 = (je) (Object) stackIn_25_0;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (vk.field_f) {
                    break L12;
                  } else {
                    stackOut_26_0 = (je) (Object) stackIn_26_0;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L11;
                  }
                }
              }
              stackOut_27_0 = (je) (Object) stackIn_27_0;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L11;
            }
            ((je) (Object) stackIn_28_0).b(stackIn_28_1 != 0, 20);
            break L6;
          }
          rf.b(-18862);
          return;
        } else {
          return;
        }
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = new li(param2);
        s.field_e.a((byte) -119, (tc) (Object) var3);
        hp.a(var3, param1, 25522);
        if (param0 != 0) {
            return null;
        }
        return var3;
    }

    nm(ih param0, ih param1) {
        ((nm) this).field_B = false;
        ((nm) this).field_x = 256;
        ((nm) this).field_v = 0;
        this.a(121, param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "The following settings need to be changed:  ";
        field_o = -1;
    }
}
