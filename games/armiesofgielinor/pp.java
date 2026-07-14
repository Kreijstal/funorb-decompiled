/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends kq {
    static String field_X;
    int field_O;
    static String field_Y;
    Object[] field_W;
    static int[] field_R;
    int field_Z;
    private gh field_V;
    private ka field_U;
    int field_T;
    static String field_S;

    private final void a(int param0, int param1, Object[] param2) {
        ((pp) this).field_T = param0;
        if (param1 == 5526) {
          ((pp) this).field_W = param2;
          ((pp) this).field_O = -1;
          if (param2 != null) {
            if ((((pp) this).field_T ^ -1) <= 0) {
              if (((pp) this).field_T < ((pp) this).field_W.length) {
                return;
              } else {
                throw new IllegalStateException();
              }
            } else {
              throw new IllegalStateException();
            }
          } else {
            return;
          }
        } else {
          this.a(-25, -92, new Object[6]);
          ((pp) this).field_W = param2;
          ((pp) this).field_O = -1;
          if (param2 != null) {
            if ((((pp) this).field_T ^ -1) <= 0) {
              if (((pp) this).field_T >= ((pp) this).field_W.length) {
                throw new IllegalStateException();
              } else {
                return;
              }
            } else {
              throw new IllegalStateException();
            }
          } else {
            return;
          }
        }
    }

    pp(gh param0, ka param1, Object[] param2, int param3) {
        super((kb) (Object) param0);
        ((pp) this).field_U = param1;
        ((pp) this).field_V = param0;
        ((pp) this).field_Z = ((pp) this).field_U.field_H + ((pp) this).field_U.field_L;
        this.a(param3, 5526, param2);
    }

    public static void b(boolean param0) {
        field_S = null;
        field_X = null;
        field_Y = null;
        field_R = null;
        if (param0) {
            field_Y = null;
        }
    }

    final int a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -126) {
          L0: {
            field_R = null;
            if (null == ((pp) this).field_W) {
              stackOut_7_0 = 200;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = (1 + ((pp) this).field_W.length * 2) * ((pp) this).field_Z >> -78011903;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null == ((pp) this).field_W) {
              stackOut_3_0 = 200;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = (1 + ((pp) this).field_W.length * 2) * ((pp) this).field_Z >> -78011903;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final Object j(int param0) {
        Object stackIn_5_0 = null;
        Object stackOut_3_0 = null;
        if (param0 == -6508) {
          if (null != ((pp) this).field_W) {
            if (((pp) this).field_T == -1) {
              return null;
            } else {
              return ((pp) this).field_W[((pp) this).field_T];
            }
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = stackOut_3_0;
            return (Object) (Object) stackIn_5_0;
          }
        } else {
          return ((pp) this).field_W[0];
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        String var17 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == 0) {
          var5 = param0 + ((pp) this).field_B;
          if (param2 <= -82) {
            L0: {
              var6 = ((pp) this).field_p + param1;
              qn.f(var5, var6, ((pp) this).field_l, ((pp) this).field_w, 0);
              var7 = ((pp) this).field_T;
              if (-1 == ((pp) this).field_O) {
                break L0;
              } else {
                var7 = ((pp) this).field_O;
                break L0;
              }
            }
            if (null == ((pp) this).field_W) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (((pp) this).field_W.length <= var8) {
                  return;
                } else {
                  L2: {
                    var16 = ((pp) this).field_W[var8];
                    var17 = var16.toString();
                    if (var7 != var8) {
                      break L2;
                    } else {
                      qn.b(var5 + 2, 4 + var6, ((pp) this).field_l + -4, ((pp) this).field_Z, 2188450, 128);
                      break L2;
                    }
                  }
                  var6 = var6 + ((pp) this).field_Z;
                  ((pp) this).field_U.b(var17, var5 + 2, var6, 10000536, -1);
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L3: {
              boolean discarded$5 = ((pp) this).b(((int[]) ((pp) this).field_W[13])[3], -51, -121, ((int[]) ((pp) this).field_W[9])[0], -117);
              var6 = ((pp) this).field_p + param1;
              qn.f(var5, var6, ((pp) this).field_l, ((pp) this).field_w, 0);
              var7 = ((pp) this).field_T;
              if (-1 == ((pp) this).field_O) {
                break L3;
              } else {
                var7 = ((pp) this).field_O;
                break L3;
              }
            }
            if (null != ((pp) this).field_W) {
              var8 = 0;
              L4: while (true) {
                if (((pp) this).field_W.length > var8) {
                  L5: {
                    var14 = ((pp) this).field_W[var8];
                    var15 = var14.toString();
                    if (var7 != var8) {
                      break L5;
                    } else {
                      qn.b(var5 + 2, 4 + var6, ((pp) this).field_l + -4, ((pp) this).field_Z, 2188450, 128);
                      break L5;
                    }
                  }
                  var6 = var6 + ((pp) this).field_Z;
                  ((pp) this).field_U.b(var15, var5 + 2, var6, 10000536, -1);
                  var8++;
                  continue L4;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        ((pp) this).field_O = -1;
        if (!((pp) this).field_V.field_H) {
          return false;
        } else {
          if (((pp) this).field_V.field_Q.field_S.field_t) {
            if (((pp) this).field_W == null) {
              return this.b(1, param1, param2, param3, param4);
            } else {
              if (param0 == 1) {
                param2 = param2 - (param4 - -((pp) this).field_p);
                param3 = param3 - (param1 - -((pp) this).field_B);
                if (0 <= param3) {
                  if (param2 >= 0) {
                    if (((pp) this).field_l >= param3) {
                      if (((pp) this).field_w >= param2) {
                        ((pp) this).field_O = param2 / ((pp) this).field_Z;
                        if (((pp) this).field_O >= ((pp) this).field_W.length) {
                          ((pp) this).field_O = -1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                boolean discarded$1 = ((pp) this).b(((int[]) ((pp) this).field_W[22])[2], ((int[]) ((pp) this).field_W[1])[19], 73, ((int[]) ((Object[]) ((pp) this).field_W[0])[3])[0], ((int[]) ((pp) this).field_W[3])[14]);
                param2 = param2 - (param4 - -((pp) this).field_p);
                param3 = param3 - (param1 - -((pp) this).field_B);
                if (0 <= param3) {
                  if (param2 >= 0) {
                    if (((pp) this).field_l >= param3) {
                      if (((pp) this).field_w >= param2) {
                        ((pp) this).field_O = param2 / ((pp) this).field_Z;
                        if (((pp) this).field_O >= ((pp) this).field_W.length) {
                          ((pp) this).field_O = -1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        this.a(param0, param1, param2, param3);
        param1 = param1 - ((pp) this).field_B;
        param2 = param2 - ((pp) this).field_p;
        if (((pp) this).field_W != null) {
          var5 = param2 / ((pp) this).field_Z;
          if ((var5 ^ -1) <= -1) {
            if (((pp) this).field_W.length <= var5) {
              return;
            } else {
              ((pp) this).field_T = var5;
              ((pp) this).field_V.g((byte) 27);
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
        field_X = "<%0> has left the lobby.";
        field_S = "Prestige coats of arms.";
        field_Y = "Capture an enemy goal or defeat an enemy leader to eliminate their side from the battle.";
    }
}
