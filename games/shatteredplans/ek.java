/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ek extends vg implements ni {
    static String field_H;
    static String field_y;
    static bi field_z;
    vg[] field_B;
    static String field_G;
    static int field_A;
    static qr field_E;
    static bc field_D;
    static boolean[] field_F;

    private final boolean a(int param0, int param1, vg param2) {
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        vg var7 = null;
        vg var7_ref = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 24 / ((param1 - -58) / 41);
        if (null != ((ek) this).field_B) {
          var5 = ((ek) this).field_B.length - 1;
          L0: while (true) {
            if (var5 < 0) {
              return false;
            } else {
              var6 = ((ek) this).field_B[var5];
              var7 = var6;
              var7 = var6;
              if (var6 != null) {
                if (var6.f(1)) {
                  var5 = var5 - param0;
                  L1: while (true) {
                    if ((var5 ^ -1) <= -1) {
                      L2: {
                        var7_ref = ((ek) this).field_B[var5];
                        if (var7_ref == null) {
                          break L2;
                        } else {
                          if (var7_ref.a((byte) 123, param2)) {
                            return true;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5 = var5 - param0;
                      continue L1;
                    } else {
                      var5--;
                      continue L0;
                    }
                  }
                } else {
                  var5--;
                  continue L0;
                }
              } else {
                var5--;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        vg[] var8 = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ek) this).field_B == null) {
          return false;
        } else {
          var12 = ((ek) this).field_B;
          var8 = var12;
          var9 = param0;
          L0: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.f(1)) {
                  if (var10.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
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

    ek(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        vg[] var5_ref_vg__ = null;
        int var5 = 0;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        boolean stackIn_18_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          L0: {
            if (param2 == 13) {
              break L0;
            } else {
              bi[] discarded$2 = ek.a(12, 50, -9, 113, (byte) 82);
              break L0;
            }
          }
          var9 = ((ek) this).field_B;
          var5_ref_vg__ = var9;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var9.length) {
              var5 = param0;
              if (80 != var5) {
                return false;
              } else {
                L2: {
                  if (di.field_p[81]) {
                    stackOut_17_0 = this.a(111, param3);
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    stackOut_16_0 = this.a(param3, -1);
                    stackIn_18_0 = stackOut_16_0;
                    break L2;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.f(1)) {
                  if (var7.a(param0, param1, 13, param3)) {
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

    private final boolean a(vg param0, int param1) {
        if (param1 != -1) {
            boolean discarded$0 = ek.a(-30, 122, -111, (byte) 51, -17, -36, -28);
        }
        return this.a(param0, (byte) -110, 1);
    }

    private final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        int var9 = 0;
        vg[] var10 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ek) this).field_B != null) {
          var10 = ((ek) this).field_B;
          var6 = param3;
          L0: while (true) {
            if (var6 >= var10.length) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param1.append(10);
              var8 = 0;
              L1: while (true) {
                if (param0 < var8) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param1.append("null");
                    var6++;
                    continue L0;
                  } else {
                    StringBuilder discarded$36 = var7.a((byte) -28, param2, 1 + param0, param1);
                    var6++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$37 = param1.append(32);
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= 99) {
            vg discarded$0 = this.a((byte) 48);
        }
        super.a(param0, param1, (byte) 101, param3, param4);
        ((ek) this).h(116);
    }

    final static bi[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -92) {
            field_E = null;
        }
        return pg.a(param2, 1, 1, (byte) -41, param3, param0, 3, 1, param1);
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 < -66) {
            break L0;
          } else {
            ek.a(-78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 > param1) {
              break L2;
            } else {
              if (param2 + param5 <= param1) {
                break L2;
              } else {
                if (param6 < param4) {
                  break L2;
                } else {
                  if (param6 >= param0 + param4) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void e(byte param0) {
        vg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        vg[] var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = ((ek) this).field_B;
        var2 = var7;
        var3 = 119 % ((param0 - -84) / 33);
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.e((byte) 6);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_z = null;
        field_F = null;
        field_y = null;
        field_G = null;
        field_E = null;
        if (param0 != -1) {
            field_F = null;
        }
        field_H = null;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        vg var6 = null;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            if (null == ((ek) this).field_p) {
              break L0;
            } else {
              ((ek) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == -11857) {
            break L1;
          } else {
            ((ek) this).a(-17, 93, (byte) 121, 115, -79);
            break L1;
          }
        }
        L2: {
          if (((ek) this).field_B != null) {
            var5 = -1 + ((ek) this).field_B.length;
            L3: while (true) {
              if ((var5 ^ -1) > -1) {
                break L2;
              } else {
                var6 = ((ek) this).field_B[var5];
                if (var6 != null) {
                  var6.a(param0, param1 ^ 0, ((ek) this).field_q + param2, ((ek) this).field_m + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        vg[] var8 = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          var12 = ((ek) this).field_B;
          var8 = var12;
          var9 = 0;
          L0: while (true) {
            if (var9 >= var12.length) {
              if (param2 >= 95) {
                return false;
              } else {
                return true;
              }
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, param1, (byte) 111, param3, ((ek) this).field_m + param4, ((ek) this).field_q + param5, param6)) {
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

    private final vg a(byte param0) {
        vg[] var2 = null;
        int var3 = 0;
        vg var4 = null;
        int var5 = 0;
        vg[] var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          var6 = ((ek) this).field_B;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 != -96) {
                field_z = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.f(1)) {
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

    final boolean f(int param0) {
        if (param0 != 1) {
            return false;
        }
        return null != this.a((byte) -96) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        vg[] var7 = null;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        vg[] var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ek) this).field_B == null) {
          return;
        } else {
          var11 = ((ek) this).field_B;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var8 >= var11.length) {
              L1: {
                if (param4 == -600269855) {
                  break L1;
                } else {
                  field_E = null;
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, ((ek) this).field_q + param1, param2 - -((ek) this).field_m, param3, -600269855, param5);
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

    abstract void h(int param0);

    final boolean a(byte param0, vg param1) {
        vg[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        int var7 = 0;
        vg[] var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 101 / ((61 - param0) / 59);
        var8 = ((ek) this).field_B;
        var3 = var8;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var8.length) {
            return false;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              if (var6.a((byte) -10, param1)) {
                return true;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(vg param0, byte param1, int param2) {
        int var4 = 0;
        vg var5 = null;
        vg var6 = null;
        vg var6_ref = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((ek) this).field_B == null) {
          return false;
        } else {
          if (param1 <= -70) {
            var4 = 0;
            L0: while (true) {
              if (((ek) this).field_B.length <= var4) {
                return false;
              } else {
                var5 = ((ek) this).field_B[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  if (var5.f(1)) {
                    var4 = var4 + param2;
                    L1: while (true) {
                      if (var4 < ((ek) this).field_B.length) {
                        L2: {
                          var6_ref = ((ek) this).field_B[var4];
                          if (var6_ref != null) {
                            if (!var6_ref.a((byte) 126, param0)) {
                              break L2;
                            } else {
                              return true;
                            }
                          } else {
                            break L2;
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
          } else {
            return false;
          }
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        vg[] var5 = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (null == ((ek) this).field_B) {
          return;
        } else {
          var9 = ((ek) this).field_B;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(((ek) this).field_m + param0, param1 - -((ek) this).field_q, param2, (byte) 91);
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

    final int e(int param0) {
        int var2 = 0;
        vg[] var3 = null;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -600269855) {
          var3 = ((ek) this).field_B;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.e(param0 + 0);
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
        } else {
          return -89;
        }
    }

    private final boolean a(int param0, vg param1) {
        if (param0 < 98) {
            return true;
        }
        return this.a(1, 22, param1);
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((ek) this).a(false, param2, param3, param1)) {
            ((ek) this).a(param1, param2, false, param3);
            this.a(param2, param3, param1, 0);
        }
        int var5 = -103 % ((64 - param0) / 61);
        return param3;
    }

    final String c(boolean param0) {
        vg[] var2 = null;
        int var3 = 0;
        vg var4 = null;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          var2 = ((ek) this).field_B;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (!param0) {
                var7 = null;
                boolean discarded$1 = ((ek) this).a(115, -37, -38, (vg) null, 68, 55, -109);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.c(true);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has resigned.";
        field_H = "Year of Great Beginnings";
        field_G = "Unrated game";
    }
}
