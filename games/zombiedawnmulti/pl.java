/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pl extends cf implements dh {
    cf[] field_E;
    static pi field_G;
    static go field_J;
    static int field_F;
    static String field_D;
    static ul field_C;
    static cj field_L;
    static int field_I;
    static String field_K;

    void a(int param0, cf param1, int param2, int param3) {
        cf[] var5 = null;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        cf[] var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (((pl) this).field_E == null) {
          return;
        } else {
          var9 = ((pl) this).field_E;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(-5407, param1, ((pl) this).field_y + param2, param3 + ((pl) this).field_i);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    final int f(byte param0) {
        int var2 = 0;
        cf[] var3 = null;
        int var4 = 0;
        cf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = ((pl) this).field_E;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 == 44) {
                break L1;
              } else {
                ((pl) this).g(-103);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.f((byte) 44);
              if (var6 > var2) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8 = 0;
        cf[] var9 = null;
        int var10 = 0;
        cf var11 = null;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pl) this).field_E != null) {
          var8 = -34 % ((48 - param0) / 37);
          var9 = ((pl) this).field_E;
          var10 = 0;
          L0: while (true) {
            if (var9.length <= var10) {
              return false;
            } else {
              var11 = var9[var10];
              if (var11 != null) {
                if (var11.c(127)) {
                  if (var11.a((byte) -14, param1, param2, param3, param4, param5, param6)) {
                    return true;
                  } else {
                    var10++;
                    continue L0;
                  }
                } else {
                  var10++;
                  continue L0;
                }
              } else {
                var10++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            field_L = null;
        }
        return null != this.a(8464) ? true : false;
    }

    final boolean a(cf param0, int param1) {
        cf[] var3 = null;
        int var4 = 0;
        cf var5 = null;
        int var6 = 0;
        cf[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = ((pl) this).field_E;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var7.length <= var4) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, 0)) {
                return true;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        cf[] var5 = null;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pl) this).field_E != null) {
          var5 = ((pl) this).field_E;
          if (param2 == 1) {
            var6 = 0;
            L0: while (true) {
              if (var5.length <= var6) {
                return;
              } else {
                var7 = var5[var6];
                StringBuilder discarded$34 = param3.append(10);
                var8 = 0;
                L1: while (true) {
                  if (param1 < var8) {
                    if (var7 == null) {
                      StringBuilder discarded$35 = param3.append("null");
                      var6++;
                      continue L0;
                    } else {
                      StringBuilder discarded$36 = var7.a(7, param0, param1 - -1, param3);
                      var6++;
                      continue L0;
                    }
                  } else {
                    StringBuilder discarded$37 = param3.append(32);
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    abstract void g(int param0);

    final String d(byte param0) {
        int var2 = 0;
        cf[] var3 = null;
        int var4 = 0;
        cf var5 = null;
        String var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = -83 / ((param0 - 53) / 57);
        if (((pl) this).field_E != null) {
          var3 = ((pl) this).field_E;
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.d((byte) 123);
                if (var6 != null) {
                  return var6;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final cf a(int param0) {
        cf[] var2 = null;
        int var3 = 0;
        cf var4 = null;
        int var5 = 0;
        cf[] var6 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((pl) this).field_E) {
          var6 = ((pl) this).field_E;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 != 8464) {
                field_D = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.c(126)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        cf[] var7 = null;
        int var8 = 0;
        cf var9 = null;
        int var10 = 0;
        cf[] var11 = null;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param4) {
            break L0;
          } else {
            ((pl) this).field_E = null;
            break L0;
          }
        }
        if (((pl) this).field_E == null) {
          return;
        } else {
          var11 = ((pl) this).field_E;
          var7 = var11;
          var8 = 0;
          L1: while (true) {
            if (var8 >= var11.length) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, param1, param2 + ((pl) this).field_i, param3, true, param5 + ((pl) this).field_y);
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param0);
        var3.a(112, 3);
        var3.a(117, 8);
        if (param1 <= 89) {
            return;
        }
        var3.a(param2, (byte) -69);
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        cf[] var8 = null;
        int var9 = 0;
        cf var10 = null;
        int var11 = 0;
        cf[] var12 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((pl) this).field_E) {
          L0: {
            if (param4 == -24) {
              break L0;
            } else {
              field_G = null;
              break L0;
            }
          }
          var12 = ((pl) this).field_E;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, param1, param2, param3, param4 + 0, param5 - -((pl) this).field_y, ((pl) this).field_i + param6)) {
                  return true;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final boolean a(byte param0, cf param1) {
        if (param0 != -20) {
            return false;
        }
        return this.a(param1, false, 1);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((pl) this).g(140);
    }

    public static void f(int param0) {
        field_C = null;
        field_J = null;
        field_L = null;
        field_K = null;
        field_G = null;
        if (param0 <= 80) {
            return;
        }
        field_D = null;
    }

    pl(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
    }

    private final boolean a(cf param0, boolean param1, int param2) {
        int var4 = 0;
        cf var5 = null;
        cf var6 = null;
        cf var6_ref = null;
        int var7 = 0;
        Object var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pl) this).field_E == null) {
          return false;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((pl) this).field_E.length) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  var8 = null;
                  ((pl) this).a(127, (cf) null, -44, -22, false, 122);
                  break L1;
                }
              }
              return false;
            } else {
              var5 = ((pl) this).field_E[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.c(127)) {
                  var4 = var4 + param2;
                  L2: while (true) {
                    if (var4 < ((pl) this).field_E.length) {
                      L3: {
                        var6_ref = ((pl) this).field_E[var4];
                        if (var6_ref != null) {
                          if (var6_ref.a(param0, 0)) {
                            return true;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 + param2;
                      continue L2;
                    } else {
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((pl) this).a(param1, -116, param3, param2)) {
            ((pl) this).a(param2, param3, (byte) 26, param1);
            this.a(param1, param2, 1, param3);
        }
        if (param0 != 7) {
            Object var6 = null;
            boolean discarded$0 = ((pl) this).a(-120, 113, 5, (cf) null, -93, 86, 64);
        }
        return param3;
    }

    private final boolean a(cf param0, byte param1) {
        if (param1 >= -74) {
            pl.a(-78, (byte) 4, -120);
        }
        return this.a(param0, 32, 1);
    }

    final void c(byte param0) {
        cf[] var2 = null;
        int var3 = 0;
        cf var4 = null;
        int var5 = 0;
        Object var6 = null;
        cf[] var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = ((pl) this).field_E;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((pl) this).a((byte) 74, 95, -68, -35, 42, 88, (cf) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c((byte) 32);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(cf param0, int param1, int param2) {
        int var4 = 0;
        cf var5 = null;
        cf var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pl) this).field_E == null) {
          return false;
        } else {
          L0: {
            var4 = -1 + ((pl) this).field_E.length;
            if (param1 == 32) {
              break L0;
            } else {
              field_C = null;
              break L0;
            }
          }
          L1: while (true) {
            if (0 > var4) {
              return false;
            } else {
              var5 = ((pl) this).field_E[var4];
              if (var5 != null) {
                if (var5.c(param1 + 93)) {
                  var4 = var4 - param2;
                  L2: while (true) {
                    if (-1 >= (var4 ^ -1)) {
                      L3: {
                        var6 = ((pl) this).field_E[var4];
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, param1 ^ 32)) {
                            return true;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 = var4 - param2;
                      continue L2;
                    } else {
                      var4--;
                      continue L1;
                    }
                  }
                } else {
                  var4--;
                  continue L1;
                }
              } else {
                var4--;
                continue L1;
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        cf var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (0 != param2) {
            break L0;
          } else {
            if (((pl) this).field_h == null) {
              break L0;
            } else {
              ((pl) this).field_h.a(true, param1, -15112, param3, (cf) this);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -2) {
            break L1;
          } else {
            boolean discarded$2 = ((pl) this).c(31);
            break L1;
          }
        }
        L2: {
          if (null == ((pl) this).field_E) {
            break L2;
          } else {
            var5 = -1 + ((pl) this).field_E.length;
            L3: while (true) {
              if ((var5 ^ -1) > -1) {
                break L2;
              } else {
                var6 = ((pl) this).field_E[var5];
                if (var6 != null) {
                  var6.a(-2, param1 + ((pl) this).field_i, param2, ((pl) this).field_y + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        cf[] var5_ref_cf__ = null;
        int var5 = 0;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        Object var9 = null;
        cf[] var10 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((pl) this).field_E == null) {
          return false;
        } else {
          var10 = ((pl) this).field_E;
          var5_ref_cf__ = var10;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var10.length) {
              L1: {
                if (param3 == -6208) {
                  break L1;
                } else {
                  var9 = null;
                  boolean discarded$1 = ((pl) this).a((cf) null, -34);
                  break L1;
                }
              }
              var5 = param0;
              if (-81 != (var5 ^ -1)) {
                return false;
              } else {
                L2: {
                  if (lc.field_m[81]) {
                    stackOut_18_0 = this.a(param2, (byte) -80);
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = this.a((byte) -20, param2);
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                return stackIn_19_0;
              }
            } else {
              var7 = var10[var6];
              if (var7 != null) {
                if (var7.c(125)) {
                  if (var7.a(param0, param1, param2, -6208)) {
                    return true;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new pi(2);
        field_D = "Make one of your zombies quite appealing, charming humans into following it...to their doom!";
        field_K = "Enter name of player to add to list";
    }
}
