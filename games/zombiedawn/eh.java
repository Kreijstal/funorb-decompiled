/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eh extends ga implements jf {
    static boolean field_z;
    static boolean field_x;
    static int field_y;
    static int field_A;
    ga[] field_B;

    void a(ga param0, byte param1, int param2, int param3) {
        ga[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        var9 = ZombieDawn.field_J;
        super.a(param0, (byte) -1, param2, param3);
        if (((eh) this).field_B != null) {
          var10 = ((eh) this).field_B;
          var5 = var10;
          var7 = 43 % ((param1 - 46) / 42);
          var6 = 0;
          L0: while (true) {
            if (var10.length <= var6) {
              return;
            } else {
              var8 = var10[var6];
              if (var8 != null) {
                var8.a(param0, (byte) -22, param2 - -((eh) this).field_j, ((eh) this).field_k + param3);
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

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        ga[] var8 = null;
        int var9 = 0;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        var11 = ZombieDawn.field_J;
        if (null == ((eh) this).field_B) {
          return false;
        } else {
          if (param5) {
            var12 = ((eh) this).field_B;
            var8 = var12;
            var9 = 0;
            L0: while (true) {
              if (var9 >= var12.length) {
                return false;
              } else {
                var10 = var12[var9];
                if (var10 != null) {
                  if (var10.e(-17741)) {
                    if (var10.a(param0, param1, param2, param3, param4, true, param6)) {
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
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        ga[] var8 = null;
        int var9 = 0;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        var11 = ZombieDawn.field_J;
        if (((eh) this).field_B == null) {
          return false;
        } else {
          var12 = ((eh) this).field_B;
          var8 = var12;
          var9 = 0;
          L0: while (true) {
            if (var9 >= var12.length) {
              if (param1 == 1) {
                return false;
              } else {
                return true;
              }
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, 1, param2 - -((eh) this).field_j, param3, param4 - -((eh) this).field_k, param5, param6)) {
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
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        if (!param2) {
            ((eh) this).e((byte) -8);
        }
        if (((eh) this).a(param0, param1, 11098, param3)) {
            ((eh) this).a(param0, param3, 87, param1);
            this.a(param3, param1, !param2 ? true : false, param0);
        }
        return param1;
    }

    final boolean a(ga param0, boolean param1) {
        if (param1) {
            ((eh) this).e((byte) 88);
        }
        return ((eh) this).a((byte) -102, 1, param0);
    }

    abstract void e(byte param0);

    private final ga d(byte param0) {
        ga[] var2 = null;
        int var3 = 0;
        ga var4 = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (null != ((eh) this).field_B) {
          L0: {
            var2 = ((eh) this).field_B;
            var3 = 0;
            if (param0 > 87) {
              break L0;
            } else {
              ((eh) this).field_B = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              if (var4 != null) {
                if (var4.e(-17741)) {
                  return var4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, ga param1) {
        if (param0 != 12139) {
            field_A = -64;
        }
        return ((eh) this).a(true, param1, 1);
    }

    final String d(int param0) {
        int var2 = 0;
        ga[] var3 = null;
        int var4 = 0;
        ga var5 = null;
        String var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var2 = -37 % ((param0 - 10) / 58);
        if (((eh) this).field_B != null) {
          var3 = ((eh) this).field_B;
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.d(-58);
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

    final static boolean a(oh param0, oh param1, byte param2) {
        int var4 = ZombieDawn.field_J;
        int var3 = param0.field_kb + -param1.field_kb;
        if (oo.field_T == param0.field_ib) {
            // wide iinc 3 -200
        } else {
            if (!(null != param0.field_ib)) {
                // wide iinc 3 200
            }
        }
        if (param2 != 20) {
            return false;
        }
        if (oo.field_T == param1.field_ib) {
            // wide iinc 3 200
        } else {
            if (!(null != param1.field_ib)) {
                // wide iinc 3 -200
            }
        }
        return 0 < var3 ? true : false;
    }

    final static boolean a(boolean param0, dj param1) {
        if (param0) {
            return false;
        }
        return param1.c(9001);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 19 / ((param0 - -23) / 48);
        super.a(102, param1, param2, param3, param4);
        ((eh) this).e((byte) 99);
    }

    final static void a(String param0, float param1, int param2) {
        ka.field_a = param0;
        if (param2 != -1) {
            field_x = true;
        }
        mm.field_k = param1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ga var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (param1 != param3) {
            break L0;
          } else {
            if (((eh) this).field_h == null) {
              break L0;
            } else {
              ((eh) this).field_h.a(16777215, true, param0, (ga) this, param2);
              break L0;
            }
          }
        }
        L1: {
          if (null == ((eh) this).field_B) {
            break L1;
          } else {
            var5 = -1 + ((eh) this).field_B.length;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((eh) this).field_B[var5];
                if (var6 != null) {
                  var6.a(((eh) this).field_j + param0, param1, param2 - -((eh) this).field_k, 0);
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
    }

    private final void a(int param0, StringBuilder param1, boolean param2, Hashtable param3) {
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
        int var9 = 0;
        ga[] var10 = null;
        var9 = ZombieDawn.field_J;
        if (!param2) {
          if (((eh) this).field_B == null) {
            return;
          } else {
            var10 = ((eh) this).field_B;
            var6 = 0;
            L0: while (true) {
              if (var10.length <= var6) {
                return;
              } else {
                var7 = var10[var6];
                StringBuilder discarded$34 = param1.append(10);
                var8 = 0;
                L1: while (true) {
                  if (var8 > param0) {
                    if (var7 != null) {
                      StringBuilder discarded$35 = var7.a(param3, param1, true, 1 + param0);
                      var6++;
                      continue L0;
                    } else {
                      StringBuilder discarded$36 = param1.append("null");
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
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        ga[] var2 = null;
        int var3 = 0;
        ga var4 = null;
        int var5 = 0;
        Object var6 = null;
        ga[] var7 = null;
        var5 = ZombieDawn.field_J;
        var7 = ((eh) this).field_B;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 57) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((eh) this).a((byte) 99, -77, (ga) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c((byte) 57);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    boolean a(byte param0, ga param1) {
        ga[] var3 = null;
        int var4 = 0;
        ga var5 = null;
        int var6 = 0;
        ga[] var7 = null;
        var6 = ZombieDawn.field_J;
        var7 = ((eh) this).field_B;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param0 > 67) {
              return false;
            } else {
              return false;
            }
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a((byte) 88, param1)) {
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

    final boolean a(byte param0, int param1, ga param2) {
        int var4 = 0;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        if (param0 == -102) {
          if (null != ((eh) this).field_B) {
            var4 = -1 + ((eh) this).field_B.length;
            L0: while (true) {
              if (0 > var4) {
                return false;
              } else {
                var5 = ((eh) this).field_B[var4];
                if (var5 != null) {
                  if (var5.e(-17741)) {
                    var4 = var4 - param1;
                    L1: while (true) {
                      if (-1 >= (var4 ^ -1)) {
                        L2: {
                          var6 = ((eh) this).field_B[var4];
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a((byte) 109, param2)) {
                              return true;
                            } else {
                              break L2;
                            }
                          }
                        }
                        var4 = var4 - param1;
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    eh(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ga[] var7 = null;
        int var8 = 0;
        ga var9 = null;
        int var10 = 0;
        ga[] var11 = null;
        L0: {
          var10 = ZombieDawn.field_J;
          if (param1 > 1) {
            break L0;
          } else {
            field_z = false;
            break L0;
          }
        }
        if (((eh) this).field_B == null) {
          return;
        } else {
          var11 = ((eh) this).field_B;
          var7 = var11;
          var8 = 0;
          L1: while (true) {
            if (var8 >= var11.length) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(((eh) this).field_k + param0, 107, param2, param3, ((eh) this).field_j + param4, param5);
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

    final int c(int param0) {
        int var2 = 0;
        ga[] var3 = null;
        int var4 = 0;
        ga var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var2 = 0;
        var3 = ((eh) this).field_B;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var3.length) {
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

    final boolean a(boolean param0, ga param1, int param2) {
        int var4 = 0;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = ZombieDawn.field_J;
        if (null != ((eh) this).field_B) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((eh) this).field_B.length) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  var8 = null;
                  boolean discarded$1 = eh.a((oh) null, (oh) null, (byte) -8);
                  break L1;
                }
              }
              return false;
            } else {
              var5 = ((eh) this).field_B[var4];
              if (var5 != null) {
                if (var5.e(-17741)) {
                  var4 = var4 + param2;
                  L2: while (true) {
                    if (((eh) this).field_B.length > var4) {
                      L3: {
                        var6 = ((eh) this).field_B[var4];
                        if (var6 != null) {
                          if (var6.a((byte) 106, param1)) {
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
        } else {
          return false;
        }
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            field_A = 103;
        }
        return null != this.d((byte) 100) ? true : false;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        ga[] var5_ref_ga__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        boolean stackIn_16_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_14_0 = false;
        var9 = ZombieDawn.field_J;
        if (null != ((eh) this).field_B) {
          var10 = ((eh) this).field_B;
          var5_ref_ga__ = var10;
          var6 = -81 % ((-83 - param0) / 32);
          var7 = 0;
          L0: while (true) {
            if (var10.length <= var7) {
              var5 = param1;
              if (var5 != 80) {
                return false;
              } else {
                L1: {
                  if (bo.field_p[81]) {
                    stackOut_15_0 = ((eh) this).a(param2, false);
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = ((eh) this).a(12139, param2);
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              }
            } else {
              var8 = var10[var7];
              if (var8 != null) {
                if (var8.e(-17741)) {
                  if (var8.a(-123, param1, param2, param3)) {
                    return true;
                  } else {
                    var7++;
                    continue L0;
                  }
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = false;
        field_x = false;
        field_A = 0;
    }
}
