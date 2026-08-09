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
        try {
            this.field_T = param0;
            if (param1 != 5526) {
                this.a(-25, -92, new Object[6]);
            }
            this.field_W = param2;
            this.field_O = -1;
            if (param2 != null) {
                if ((this.field_T ^ -1) > 0 || this.field_T >= this.field_W.length) {
                    throw new IllegalStateException();
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pp.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    pp(gh param0, ka param1, Object[] param2, int param3) {
        super(param0);
        try {
            this.field_U = param1;
            this.field_V = param0;
            this.field_Z = this.field_U.field_H + this.field_U.field_L;
            this.a(param3, 5526, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        field_S = null;
        field_X = null;
        field_Y = null;
        field_R = null;
        if (param0) {
            field_Y = (String) null;
        }
    }

    final int a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -126) {
          L0: {
            field_R = (int[]) null;
            if (null == this.field_W) {
              stackIn_8_0 = 200;
              break L0;
            } else {
              stackIn_8_0 = (1 + this.field_W.length * 2) * this.field_Z >> -78011903;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null == this.field_W) {
              stackIn_4_0 = 200;
              break L1;
            } else {
              stackIn_4_0 = (1 + this.field_W.length * 2) * this.field_Z >> -78011903;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final Object j(int param0) {
        Object stackIn_5_0 = null;
        if (param0 == -6508) {
          if (null != this.field_W) {
            if (this.field_T == -1) {
              return null;
            } else {
              return this.field_W[this.field_T];
            }
          } else {
            stackIn_5_0 = null;
            return stackIn_5_0;
          }
        } else {
          return this.field_W[0];
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        Object var14;
        String var15;
        Object var16;
        String var17;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 == 0) {
          var5 = param0 + this.field_B;
          if (param2 <= -82) {
            L0: {
              var6 = this.field_p + param1;
              qn.f(var5, var6, this.field_l, this.field_w, 0);
              var7 = this.field_T;
              if (-1 == this.field_O) {
                break L0;
              } else {
                var7 = this.field_O;
                break L0;
              }
            }
            if (null == this.field_W) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (this.field_W.length <= var8) {
                  return;
                } else {
                  L2: {
                    var16 = this.field_W[var8];
                    var17 = var16.toString();
                    if (var7 != var8) {
                      break L2;
                    } else {
                      qn.b(var5 + 2, 4 + var6, this.field_l + -4, this.field_Z, 2188450, 128);
                      break L2;
                    }
                  }
                  var6 = var6 + this.field_Z;
                  this.field_U.b(var17, var5 + 2, var6, 10000536, -1);
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L3: {
              this.b(((int[]) (this.field_W[13]))[3], -51, -121, ((int[]) (this.field_W[9]))[0], -117);
              var6 = this.field_p + param1;
              qn.f(var5, var6, this.field_l, this.field_w, 0);
              var7 = this.field_T;
              if (-1 == this.field_O) {
                break L3;
              } else {
                var7 = this.field_O;
                break L3;
              }
            }
            if (null != this.field_W) {
              var8 = 0;
              L4: while (true) {
                if (this.field_W.length > var8) {
                  L5: {
                    var14 = this.field_W[var8];
                    var15 = var14.toString();
                    if (var7 != var8) {
                      break L5;
                    } else {
                      qn.b(var5 + 2, 4 + var6, this.field_l + -4, this.field_Z, 2188450, 128);
                      break L5;
                    }
                  }
                  var6 = var6 + this.field_Z;
                  this.field_U.b(var15, var5 + 2, var6, 10000536, -1);
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
        this.field_O = -1;
        if (!this.field_V.field_H) {
          return false;
        } else {
          if (this.field_V.field_Q.field_S.field_t) {
            if (this.field_W == null) {
              return super.b(1, param1, param2, param3, param4);
            } else {
              if (param0 == 1) {
                param2 = param2 - (param4 - -this.field_p);
                param3 = param3 - (param1 - -this.field_B);
                if (0 <= param3) {
                  if (param2 >= 0) {
                    if (this.field_l >= param3) {
                      if (this.field_w >= param2) {
                        this.field_O = param2 / this.field_Z;
                        if (this.field_O >= this.field_W.length) {
                          this.field_O = -1;
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
                this.b(((int[]) (this.field_W[22]))[2], ((int[]) (this.field_W[1]))[19], 73, ((int[]) (((Object[]) (this.field_W[0]))[3]))[0], ((int[]) (this.field_W[3]))[14]);
                param2 = param2 - (param4 - -this.field_p);
                param3 = param3 - (param1 - -this.field_B);
                if (0 <= param3) {
                  if (param2 >= 0) {
                    if (this.field_l >= param3) {
                      if (this.field_w >= param2) {
                        this.field_O = param2 / this.field_Z;
                        if (this.field_O >= this.field_W.length) {
                          this.field_O = -1;
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
        int var5;
        super.a(param0, param1, param2, param3);
        param1 = param1 - this.field_B;
        param2 = param2 - this.field_p;
        if (this.field_W != null) {
          var5 = param2 / this.field_Z;
          if ((var5 ^ -1) <= -1) {
            if (this.field_W.length <= var5) {
              return;
            } else {
              this.field_T = var5;
              this.field_V.g((byte) 27);
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
        field_X = "<%0> has left the lobby.";
        field_S = "Prestige coats of arms.";
        field_Y = "Capture an enemy goal or defeat an enemy leader to eliminate their side from the battle.";
    }
}
