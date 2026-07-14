/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kl extends qm implements a {
    static String field_x;
    static String field_C;
    static String field_F;
    qm[] field_z;
    static ll[] field_G;
    static String field_y;
    static int field_A;
    static int[] field_B;
    static qb[] field_E;
    static String field_D;

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        qm[] var10 = null;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 31115) {
            break L0;
          } else {
            ((kl) this).field_z = null;
            break L0;
          }
        }
        if (null != ((kl) this).field_z) {
          var10 = ((kl) this).field_z;
          var6 = 0;
          L1: while (true) {
            if (var10.length <= var6) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param2.append(10);
              var8 = 0;
              L2: while (true) {
                if (var8 > param1) {
                  if (var7 != null) {
                    StringBuilder discarded$35 = var7.a(param2, param1 - -1, param3, (byte) 110);
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = param2.append("null");
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param2.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1, byte param2) {
        int var4 = 0;
        qm var5 = null;
        qm var6 = null;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param2 == 9) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        if (((kl) this).field_z != null) {
          var4 = ((kl) this).field_z.length + -1;
          L1: while (true) {
            if ((var4 ^ -1) > -1) {
              return false;
            } else {
              var5 = ((kl) this).field_z[var4];
              if (var5 != null) {
                if (var5.d(-2116)) {
                  var4 = var4 - param0;
                  L2: while (true) {
                    if ((var4 ^ -1) <= -1) {
                      L3: {
                        var6 = ((kl) this).field_z[var4];
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(0, param1)) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      var4 = var4 - param0;
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
        } else {
          return false;
        }
    }

    boolean a(int param0, qm param1) {
        qm[] var3 = null;
        int var4 = 0;
        qm var5 = null;
        int var6 = 0;
        qm[] var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = ((kl) this).field_z;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(0, param1)) {
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

    final boolean a(qm param0, int param1) {
        if (param1 >= -8) {
            Object var4 = null;
            ((kl) this).a((qm) null, 31, -110, 42);
        }
        return ((kl) this).a(1, param0, (byte) 9);
    }

    kl(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        qm var6 = null;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (0 != param2) {
            break L0;
          } else {
            if (null == ((kl) this).field_r) {
              break L0;
            } else {
              ((kl) this).field_r.a((qm) this, 5592405, param1, param3, true);
              break L0;
            }
          }
        }
        L1: {
          if (null != ((kl) this).field_z) {
            var5 = ((kl) this).field_z.length + -1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((kl) this).field_z[var5];
                if (var6 != null) {
                  var6.a((byte) -112, param1 + ((kl) this).field_n, param2, param3 - -((kl) this).field_j);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (param0 < -52) {
            break L3;
          } else {
            field_D = null;
            break L3;
          }
        }
    }

    private final qm a(int param0) {
        qm[] var2 = null;
        int var3 = 0;
        qm var4 = null;
        int var5 = 0;
        qm[] var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((kl) this).field_z) {
          var6 = ((kl) this).field_z;
          var2 = var6;
          var3 = param0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.d(-2116)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
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

    void a(qm param0, int param1, int param2, int param3) {
        qm[] var5 = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(param0, param1, param2, param3);
        if (((kl) this).field_z != null) {
          var9 = ((kl) this).field_z;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0, param1 - -((kl) this).field_n, 170, param3 - -((kl) this).field_j);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, qm param2) {
        int var4 = 0;
        qm var5 = null;
        qm var6 = null;
        qm var6_ref = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (((kl) this).field_z != null) {
          L0: {
            if (param0 == 29787) {
              break L0;
            } else {
              field_A = 123;
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((kl) this).field_z.length) {
              return false;
            } else {
              var5 = ((kl) this).field_z[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.d(param0 + -31903)) {
                  var4 = var4 + param1;
                  L2: while (true) {
                    if (var4 < ((kl) this).field_z.length) {
                      L3: {
                        var6_ref = ((kl) this).field_z[var4];
                        if (var6_ref != null) {
                          if (!var6_ref.a(0, param2)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 + param1;
                      continue L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 1) {
            Object var3 = null;
            boolean discarded$0 = kl.a((String) null, -51);
        }
        return im.a(0, param0) != null ? true : false;
    }

    final int c(int param0) {
        int var2 = 0;
        qm[] var3 = null;
        int var4 = 0;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = ((kl) this).field_z;
        var4 = param0;
        L0: while (true) {
          if (var3.length <= var4) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c(0);
              if (var2 < var6) {
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

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        if (((kl) this).a(param0, (byte) -90, param2, param1)) {
            ((kl) this).a(param0, param1, param2, 1);
            this.a(31115, param1, param0, param2);
        }
        int var5 = 76 % ((50 - param3) / 60);
        return param0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        qm[] var8 = null;
        int var9 = 0;
        qm var10 = null;
        int var11 = 0;
        qm[] var12 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (((kl) this).field_z == null) {
          return false;
        } else {
          var12 = ((kl) this).field_z;
          var8 = var12;
          var9 = param5;
          L0: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.d(-2116)) {
                  if (var10.a(param0, param1, param2, param3, param4, 0, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        qm[] var5_ref_qm__ = null;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        qm[] var9 = null;
        boolean stackIn_16_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_14_0 = false;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (((kl) this).field_z != null) {
          var9 = ((kl) this).field_z;
          var5_ref_qm__ = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              var5 = param3;
              if (var5 != 80) {
                if (param1 < -120) {
                  return false;
                } else {
                  return true;
                }
              } else {
                L1: {
                  if (!ri.field_b[81]) {
                    stackOut_15_0 = ((kl) this).a((byte) -127, param0);
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = ((kl) this).a(param0, -55);
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.d(-2116)) {
                  if (var7.a(param0, (byte) -124, param2, param3)) {
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
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_F = null;
        if (param0 != -90) {
            field_C = null;
        }
        field_y = null;
        field_G = null;
        field_C = null;
        field_x = null;
        field_E = null;
        field_B = null;
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        qm[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        qm var11 = null;
        int var12 = 0;
        qm[] var13 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((kl) this).field_z) {
          var13 = ((kl) this).field_z;
          var8 = var13;
          var9 = 0;
          var10 = -123 / ((-42 - param4) / 35);
          L0: while (true) {
            if (var9 >= var13.length) {
              return false;
            } else {
              var11 = var13[var9];
              if (var11 != null) {
                if (var11.a(param0, param1, param2, ((kl) this).field_j + param3, 34, param5, ((kl) this).field_n + param6)) {
                  return true;
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(byte param0, qm param1) {
        if (param0 > -126) {
            Object var4 = null;
            boolean discarded$0 = ((kl) this).a(-118, 91, 35, -86, 59, 78, (qm) null);
        }
        return ((kl) this).a(29787, 1, param1);
    }

    abstract void e(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        qm[] var7 = null;
        int var8 = 0;
        qm var9 = null;
        int var10 = 0;
        qm[] var11 = null;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == -20592) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        if (null == ((kl) this).field_z) {
          return;
        } else {
          var11 = ((kl) this).field_z;
          var7 = var11;
          var8 = 0;
          L1: while (true) {
            if (var11.length <= var8) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, -20592, param2, ((kl) this).field_j + param3, param4 + ((kl) this).field_n, param5);
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

    final String b(boolean param0) {
        qm[] var2 = null;
        int var3 = 0;
        qm var4 = null;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((kl) this).field_z) {
          var2 = ((kl) this).field_z;
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              if (param0) {
                var7 = null;
                boolean discarded$1 = kl.a((String) null, 33);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.b(param0);
                if (var5 != null) {
                  return var5;
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

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
            return;
        }
        this.a(param0, param1, param2, param3, -57);
        ((kl) this).e(106);
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
            field_D = null;
        }
        return null != this.a(0) ? true : false;
    }

    final void d(byte param0) {
        qm[] var2 = null;
        int var3 = 0;
        qm var4 = null;
        int var5 = 0;
        Object var6 = null;
        qm[] var7 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = ((kl) this).field_z;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 29) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((kl) this).a(-1, (qm) null, (byte) -103);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.d((byte) 29);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Playing";
        field_y = "You require the '<%0>' Achievement to select this item";
        field_F = "  When summoning or increasing the power of your familiar you channel 20 of your health into it. The more life the familiar has the more powerful are the effects it provides. You can channel as much life as you wish each turn into it up to a maximum of 100 health.";
        field_B = new int[1024];
        field_D = "This game option is not available in rated games.";
    }
}
