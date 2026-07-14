/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class bh extends mf implements ra {
    static jc field_D;
    mf[] field_E;
    static ci field_G;
    static String field_H;
    static int field_F;

    final String g(int param0) {
        mf[] var2 = null;
        int var3 = 0;
        mf var4 = null;
        String var5 = null;
        int var6 = 0;
        mf[] var7 = null;
        var6 = Chess.field_G;
        if (((bh) this).field_E != null) {
          var7 = ((bh) this).field_E;
          var2 = var7;
          var3 = param0;
          L0: while (true) {
            if (var3 < var7.length) {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.g(0);
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
    }

    void a(int param0, int param1, mf param2, int param3) {
        mf[] var5 = null;
        int var6 = 0;
        mf var7 = null;
        int var8 = 0;
        mf[] var9 = null;
        var8 = Chess.field_G;
        super.a(param0, -54, param2, param3);
        if (null != ((bh) this).field_E) {
          var9 = ((bh) this).field_E;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              L1: {
                if (param1 < -6) {
                  break L1;
                } else {
                  field_D = null;
                  break L1;
                }
              }
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(((bh) this).field_u + param0, -97, param2, ((bh) this).field_r + param3);
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

    final static void a(dc param0, byte param1, int param2) {
        if (param1 != 46) {
            bh.f((byte) -11);
        }
        nk var5 = qn.field_U;
        var5.f(param2, param1 ^ -90);
        var5.field_l = var5.field_l + 1;
        int var4 = var5.field_l;
        var5.c(1, (byte) -98);
        var5.c(param0.field_j, (byte) -72);
        var5.c((byte) -125, param0.field_l);
        var5.d(param0.field_k, (byte) -81);
        var5.d(param0.field_o, (byte) -81);
        var5.d(param0.field_p, (byte) -81);
        var5.d(param0.field_r, (byte) -81);
        int discarded$0 = var5.b(var4, (byte) -125);
        var5.a(-var4 + var5.field_l, -1);
    }

    private final boolean a(int param0, mf param1, boolean param2) {
        int var4 = 0;
        mf var5 = null;
        mf var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        if (null != ((bh) this).field_E) {
          var4 = ((bh) this).field_E.length + -1;
          L0: while (true) {
            if (0 > var4) {
              if (!param2) {
                return false;
              } else {
                field_F = 8;
                return false;
              }
            } else {
              var5 = ((bh) this).field_E[var4];
              if (var5 != null) {
                if (var5.d((byte) -67)) {
                  var4 = var4 - param0;
                  L1: while (true) {
                    if (-1 >= (var4 ^ -1)) {
                      L2: {
                        var6 = ((bh) this).field_E[var4];
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(0, param1)) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      var4 = var4 - param0;
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
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        ((bh) this).a(30);
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        if (param3 != 1) {
            boolean discarded$0 = bh.e((byte) 117);
        }
        if (((bh) this).a(param1, param0, param2, param3 + -90)) {
            ((bh) this).a(param0, param2, param1, false);
            this.a(param0, 40, param1, param2);
        }
        return param2;
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        mf[] var7 = null;
        int var8 = 0;
        mf var9 = null;
        int var10 = 0;
        mf[] var11 = null;
        var10 = Chess.field_G;
        if (((bh) this).field_E != null) {
          var11 = ((bh) this).field_E;
          var7 = var11;
          var8 = param4;
          L0: while (true) {
            if (var11.length <= var8) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, param1, param2 - -((bh) this).field_u, param3, 0, param5 + ((bh) this).field_r);
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final boolean a(mf param0, int param1) {
        if (param1 != 1) {
            return false;
        }
        return this.a(1, param0, false);
    }

    private final boolean a(byte param0, mf param1, int param2) {
        int var4 = 0;
        mf var5 = null;
        mf var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        if (null != ((bh) this).field_E) {
          var4 = 0;
          if (param0 <= -118) {
            L0: while (true) {
              if (var4 >= ((bh) this).field_E.length) {
                return false;
              } else {
                var5 = ((bh) this).field_E[var4];
                if (var5 != null) {
                  if (var5.d((byte) -67)) {
                    var4 = var4 + param2;
                    L1: while (true) {
                      if (var4 < ((bh) this).field_E.length) {
                        L2: {
                          var6 = ((bh) this).field_E[var4];
                          if (var6 != null) {
                            if (var6.a(0, param1)) {
                              return true;
                            } else {
                              break L2;
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
            return true;
          }
        } else {
          return false;
        }
    }

    final void d(int param0) {
        mf[] var2_ref_mf__ = null;
        int var2 = 0;
        int var3 = 0;
        mf var4 = null;
        int var5 = 0;
        mf[] var6 = null;
        var5 = Chess.field_G;
        var6 = ((bh) this).field_E;
        var2_ref_mf__ = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            var2 = 22 / ((34 - param0) / 57);
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.d(92);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, mf param1) {
        mf[] var3 = null;
        int var4 = 0;
        mf var5 = null;
        int var6 = 0;
        mf[] var7 = null;
        var6 = Chess.field_G;
        var7 = ((bh) this).field_E;
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

    final static boolean e(byte param0) {
        Object var2 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 55) {
            break L0;
          } else {
            var2 = null;
            bh.a((dc) null, (byte) 43, 62);
            break L0;
          }
        }
        L1: {
          L2: {
            if (hm.field_g) {
              break L2;
            } else {
              if (!vi.a(param0 + -58)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void j(int param0) {
        field_G = null;
        field_H = null;
        if (param0 != 0) {
            bh.f((byte) -91);
        }
        field_D = null;
    }

    final int a(boolean param0) {
        int var2 = 0;
        mf[] var3 = null;
        int var4 = 0;
        mf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        var2 = 0;
        if (param0) {
          var3 = ((bh) this).field_E;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.a(param0);
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
        } else {
          return 63;
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        mf var7 = null;
        int var8 = 0;
        int var9 = 0;
        mf[] var10 = null;
        var9 = Chess.field_G;
        if (null == ((bh) this).field_E) {
          return;
        } else {
          if (param1 > 34) {
            var10 = ((bh) this).field_E;
            var6 = 0;
            L0: while (true) {
              if (var10.length <= var6) {
                return;
              } else {
                var7 = var10[var6];
                StringBuilder discarded$34 = param3.append(10);
                var8 = 0;
                L1: while (true) {
                  if (param2 < var8) {
                    if (var7 == null) {
                      StringBuilder discarded$35 = param3.append("null");
                      var6++;
                      continue L0;
                    } else {
                      StringBuilder discarded$36 = var7.a(param0, 1 + param2, param3, 1);
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
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        mf[] var5_ref_mf__ = null;
        int var5 = 0;
        int var6 = 0;
        mf var7 = null;
        int var8 = 0;
        mf[] var9 = null;
        boolean stackIn_18_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        var8 = Chess.field_G;
        if (null != ((bh) this).field_E) {
          var9 = ((bh) this).field_E;
          var5_ref_mf__ = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              L1: {
                if (param2 == -1) {
                  break L1;
                } else {
                  field_G = null;
                  break L1;
                }
              }
              var5 = param1;
              if (-81 != (var5 ^ -1)) {
                return false;
              } else {
                L2: {
                  if (!ok.field_Jb[81]) {
                    stackOut_17_0 = this.a(param3, (byte) 121);
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    stackOut_16_0 = this.a(param3, param2 + 2);
                    stackIn_18_0 = stackOut_16_0;
                    break L2;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.d((byte) -67)) {
                  if (var7.a(param0, param1, -1, param3)) {
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

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        mf[] var8 = null;
        int var9 = 0;
        mf var10 = null;
        int var11 = 0;
        mf[] var12 = null;
        var11 = Chess.field_G;
        if (((bh) this).field_E == null) {
          return false;
        } else {
          var12 = ((bh) this).field_E;
          var8 = var12;
          var9 = 0;
          L0: while (true) {
            if (var9 >= var12.length) {
              if (param0 > 59) {
                return false;
              } else {
                field_F = 27;
                return false;
              }
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.d((byte) -67)) {
                  if (var10.a(106, param1, param2, param3, param4, param5, param6)) {
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

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11) {
        ic.a(param11, param10, false, param3, param4, param7, param6, param9, param2, param5, param8, 16777215, param1, 16777215);
        if (param0 >= -102) {
            field_D = null;
        }
    }

    final static void f(byte param0) {
        try {
            if (!(tc.field_z == null)) {
                try {
                    tc.field_z.a(0L, 0);
                    tc.field_z.a(tk.field_h.field_l, 24, -1, tk.field_h.field_o);
                } catch (Exception exception) {
                }
            }
            tk.field_h.field_l = tk.field_h.field_l + 24;
            if (param0 != -74) {
                field_H = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(mf param0, byte param1) {
        if (param1 <= 43) {
            return true;
        }
        return this.a((byte) -123, param0, 1);
    }

    private final mf h(int param0) {
        mf[] var2 = null;
        int var3 = 0;
        mf var4 = null;
        int var5 = 0;
        mf[] var6 = null;
        L0: {
          var5 = Chess.field_G;
          if (param0 == -31830) {
            break L0;
          } else {
            ((bh) this).field_E = null;
            break L0;
          }
        }
        if (null != ((bh) this).field_E) {
          var6 = ((bh) this).field_E;
          var2 = var6;
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.d((byte) -67)) {
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

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        mf[] var8 = null;
        int var9 = 0;
        mf var10 = null;
        int var11 = 0;
        mf[] var12 = null;
        var11 = Chess.field_G;
        if (null == ((bh) this).field_E) {
          return false;
        } else {
          if (param3 == 88) {
            var12 = ((bh) this).field_E;
            var8 = var12;
            var9 = 0;
            L0: while (true) {
              if (var9 >= var12.length) {
                return false;
              } else {
                var10 = var12[var9];
                if (var10 != null) {
                  if (var10.a(param0, param1, param2, (byte) 88, param4, ((bh) this).field_r + param5, param6 - -((bh) this).field_u)) {
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
            return true;
          }
        }
    }

    final static java.applet.Applet i(int param0) {
        if (param0 != 81) {
            return null;
        }
        if (!(qe.field_B == null)) {
            return qe.field_B;
        }
        return (java.applet.Applet) (Object) nk.field_w;
    }

    abstract void a(int param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        mf var6 = null;
        int var7 = 0;
        L0: {
          var7 = Chess.field_G;
          if (param1 != 0) {
            break L0;
          } else {
            if (null == ((bh) this).field_n) {
              break L0;
            } else {
              ((bh) this).field_n.a((byte) 88, param3, param0, true, (mf) this);
              break L0;
            }
          }
        }
        if (param2 <= -80) {
          L1: {
            if (((bh) this).field_E == null) {
              break L1;
            } else {
              var5 = -1 + ((bh) this).field_E.length;
              L2: while (true) {
                if (-1 < (var5 ^ -1)) {
                  break L1;
                } else {
                  var6 = ((bh) this).field_E[var5];
                  if (var6 != null) {
                    var6.a(param0 + ((bh) this).field_r, param1, -92, ((bh) this).field_u + param3);
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
          return;
        } else {
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
            field_G = null;
        }
        return this.h(-31830) != null ? true : false;
    }

    bh(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4, (rg) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new jc();
    }
}
