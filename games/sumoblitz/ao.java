/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ao extends pk implements ug {
    pk[] field_x;
    static ji field_y;
    static String field_z;

    boolean a(pk param0, byte param1) {
        pk[] var3 = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        pk[] var7 = null;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          var7 = ((ao) this).field_x;
          var3 = var7;
          if (param1 == 61) {
            break L0;
          } else {
            ((ao) this).field_x = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, (byte) 61)) {
                return true;
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
    }

    final boolean a(pk param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pk var6 = null;
        pk var7 = null;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (null == ((ao) this).field_x) {
          return false;
        } else {
          var4 = 0;
          var5 = -106 / ((28 - param1) / 42);
          L0: while (true) {
            if (var4 >= ((ao) this).field_x.length) {
              return false;
            } else {
              var6 = ((ao) this).field_x[var4];
              if (var6 != null) {
                if (var6.d(-1)) {
                  var4 = var4 + param2;
                  L1: while (true) {
                    if (var4 < ((ao) this).field_x.length) {
                      L2: {
                        var7 = ((ao) this).field_x[var4];
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a(param0, (byte) 61)) {
                            return true;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var4 = var4 + param2;
                      continue L1;
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

    boolean a(pk param0, char param1, byte param2, int param3) {
        pk[] var5_ref_pk__ = null;
        int var5 = 0;
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        pk[] var9 = null;
        boolean stackIn_18_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (((ao) this).field_x != null) {
          L0: {
            if (param2 >= 9) {
              break L0;
            } else {
              ao.a(-24);
              break L0;
            }
          }
          var9 = ((ao) this).field_x;
          var5_ref_pk__ = var9;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var9.length) {
              var5 = param3;
              if ((var5 ^ -1) != -81) {
                return false;
              } else {
                L2: {
                  if (!hw.field_b[81]) {
                    stackOut_17_0 = ((ao) this).a((byte) -17, param0);
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    stackOut_16_0 = ((ao) this).b(param0, (byte) 113);
                    stackIn_18_0 = stackOut_16_0;
                    break L2;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.d(-1)) {
                  if (var7.a(param0, param1, (byte) 72, param3)) {
                    return true;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    ao(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
    }

    final boolean a(byte param0, pk param1) {
        if (param0 != -17) {
            boolean discarded$0 = ((ao) this).d(-97);
        }
        return ((ao) this).a(param1, (byte) -49, 1);
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 != 0) {
            Object var6 = null;
            boolean discarded$0 = ((ao) this).b((pk) null, (byte) -86);
        }
        if (!(!((ao) this).a(param0, param1, -124, param2))) {
            ((ao) this).a(param0, (byte) -128, param2, param1);
            this.a(param1, param0, 10, param2);
        }
        return param2;
    }

    void a(int param0, int param1, pk param2, int param3) {
        pk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        pk var8 = null;
        int var9 = 0;
        pk[] var10 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        super.a(param0, -118, param2, param3);
        if (null != ((ao) this).field_x) {
          var10 = ((ao) this).field_x;
          var5 = var10;
          var6 = 102 % ((-25 - param1) / 45);
          var7 = 0;
          L0: while (true) {
            if (var10.length <= var7) {
              return;
            } else {
              var8 = var10[var7];
              if (var8 != null) {
                var8.a(((ao) this).field_r + param0, 95, param2, ((ao) this).field_v + param3);
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        pk[] var3 = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 2 % ((param0 - 64) / 51);
        var3 = ((ao) this).field_x;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.c((byte) -68);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract void e(boolean param0);

    final String c(int param0) {
        pk[] var2 = null;
        int var3 = 0;
        pk var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -6696) {
          if (((ao) this).field_x != null) {
            var2 = ((ao) this).field_x;
            var3 = 0;
            L0: while (true) {
              if (var3 < var2.length) {
                var4 = var2[var3];
                if (var4 != null) {
                  var5 = var4.c(-6696);
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
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        pk var6 = null;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (-1 != (param3 ^ -1)) {
            break L0;
          } else {
            if (((ao) this).field_w == null) {
              break L0;
            } else {
              ((ao) this).field_w.a((pk) this, param1, 5592405, true, param0);
              break L0;
            }
          }
        }
        L1: {
          if (((ao) this).field_x == null) {
            break L1;
          } else {
            var5 = -1 + ((ao) this).field_x.length;
            L2: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L1;
              } else {
                var6 = ((ao) this).field_x[var5];
                if (var6 != null) {
                  var6.a(((ao) this).field_r + param0, ((ao) this).field_v + param1, (byte) -62, param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param2 <= -35) {
            break L3;
          } else {
            var8 = null;
            boolean discarded$1 = ((ao) this).a((pk) null, -125, -13, -18, -36, 44, -11);
            break L3;
          }
        }
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        pk[] var7 = null;
        int var8 = 0;
        pk var9 = null;
        int var10 = 0;
        pk[] var11 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (((ao) this).field_x == null) {
          return;
        } else {
          var11 = ((ao) this).field_x;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var8 >= var11.length) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  boolean discarded$1 = ((ao) this).d(49);
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, false, param2 + ((ao) this).field_r, param3, param4, param5 + ((ao) this).field_v);
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        pk[] var8 = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        Object var12 = null;
        pk[] var13 = null;
        L0: {
          var11 = Sumoblitz.field_L ? 1 : 0;
          if (param2 == -1) {
            break L0;
          } else {
            var12 = null;
            boolean discarded$2 = ((ao) this).a((pk) null, 'ﾅ', (byte) -58, -49);
            break L0;
          }
        }
        if (((ao) this).field_x != null) {
          var13 = ((ao) this).field_x;
          var8 = var13;
          var9 = 0;
          L1: while (true) {
            if (var13.length <= var9) {
              return false;
            } else {
              var10 = var13[var9];
              if (var10 != null) {
                if (var10.d(-1)) {
                  if (var10.a(param0, param1, -1, param3, param4, param5, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L1;
                  }
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

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        pk[] var11 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        if (((ao) this).field_x != null) {
          L0: {
            if (param2 == 10) {
              break L0;
            } else {
              var10 = null;
              boolean discarded$36 = ((ao) this).a((pk) null, (byte) -20);
              break L0;
            }
          }
          var11 = ((ao) this).field_x;
          var6 = 0;
          L1: while (true) {
            if (var11.length <= var6) {
              return;
            } else {
              var7 = var11[var6];
              StringBuilder discarded$37 = param3.append(10);
              var8 = 0;
              L2: while (true) {
                if (param1 < var8) {
                  if (var7 != null) {
                    StringBuilder discarded$38 = var7.a(1 + param1, param0, param3, 0);
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$39 = param3.append("null");
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$40 = param3.append(32);
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

    final static boolean a(String param0, int param1) {
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() < bn.field_T) {
              break L0;
            } else {
              if (param0.length() <= or.field_k) {
                if (param1 == 30996) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    final boolean b(pk param0, byte param1) {
        if (param1 != 113) {
            return true;
        }
        return ((ao) this).a((byte) -128, param0, 1);
    }

    private final pk d(boolean param0) {
        pk[] var2 = null;
        int var3 = 0;
        pk var4 = null;
        int var5 = 0;
        pk[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (((ao) this).field_x != null) {
          if (param0) {
            var6 = ((ao) this).field_x;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.d(-1)) {
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
        } else {
          return null;
        }
    }

    final boolean a(byte param0, pk param1, int param2) {
        int var4 = 0;
        pk var5 = null;
        pk var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (((ao) this).field_x == null) {
          return false;
        } else {
          var4 = -1 + ((ao) this).field_x.length;
          L0: while (true) {
            if (var4 < 0) {
              if (param0 <= -127) {
                return false;
              } else {
                int discarded$1 = ((ao) this).e(-70);
                return false;
              }
            } else {
              var5 = ((ao) this).field_x[var4];
              if (var5 != null) {
                if (var5.d(-1)) {
                  var4 = var4 - param2;
                  L1: while (true) {
                    if ((var4 ^ -1) <= -1) {
                      L2: {
                        var6 = ((ao) this).field_x[var4];
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param1, (byte) 61)) {
                            return true;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var4 = var4 - param2;
                      continue L1;
                    } else {
                      var4--;
                      continue L0;
                    }
                  }
                } else {
                  var4--;
                  continue L0;
                }
              } else {
                var4--;
                continue L0;
              }
            }
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            field_z = null;
        }
        return this.d(true) != null ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-51, param1, param2, param3, param4);
        int var6 = 53 / ((28 - param0) / 63);
        ((ao) this).e(false);
    }

    public static void a(int param0) {
        field_z = null;
        field_y = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ao.a((String) null, -34);
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        pk[] var8 = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        pk[] var12 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (null == ((ao) this).field_x) {
          return false;
        } else {
          L0: {
            var12 = ((ao) this).field_x;
            var8 = var12;
            if (param1 <= -42) {
              break L0;
            } else {
              field_y = null;
              break L0;
            }
          }
          var9 = 0;
          L1: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, -84, param2, param3, ((ao) this).field_r + param4, param5, param6 - -((ao) this).field_v)) {
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
        }
    }

    final int e(int param0) {
        int var2 = 0;
        pk[] var3 = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = ((ao) this).field_x;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            var4 = -37 / ((param0 - -10) / 46);
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.e(-117);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new ji();
        field_z = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
