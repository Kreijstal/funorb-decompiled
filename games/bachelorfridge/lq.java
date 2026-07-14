/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class lq extends wj implements e {
    static String field_z;
    static int[] field_A;
    static int field_y;
    wj[] field_B;

    public static void a(int param0) {
        if (param0 < 43) {
            return;
        }
        field_A = null;
        field_z = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (param2 < 20) {
            return null;
        }
        if (!(!((lq) this).a(param0, param1, param3, (byte) 39))) {
            ((lq) this).a(9, param0, param3, param1);
            this.a(param1, (byte) -28, param0, param3);
        }
        return param3;
    }

    private final wj b(boolean param0) {
        wj[] var2 = null;
        int var3 = 0;
        wj var4 = null;
        int var5 = 0;
        wj[] var6 = null;
        var5 = BachelorFridge.field_y;
        if (null != ((lq) this).field_B) {
          L0: {
            var6 = ((lq) this).field_B;
            var2 = var6;
            if (!param0) {
              break L0;
            } else {
              ((lq) this).field_B = null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.e(1023)) {
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

    abstract void h(int param0);

    void a(int param0, int param1, wj param2, int param3) {
        wj[] var5 = null;
        int var6 = 0;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        var8 = BachelorFridge.field_y;
        this.a(param0, param1, param2, param3);
        if (((lq) this).field_B == null) {
          return;
        } else {
          var9 = ((lq) this).field_B;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0 - -((lq) this).field_s, ((lq) this).field_v + param1, param2, 20);
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

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        ((lq) this).h(param2 ^ -11436);
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        wj[] var7 = null;
        int var8 = 0;
        wj var9 = null;
        int var10 = 0;
        wj[] var11 = null;
        var10 = BachelorFridge.field_y;
        if (((lq) this).field_B == null) {
          return;
        } else {
          L0: {
            if (param2 == -101) {
              break L0;
            } else {
              ((lq) this).a((byte) -33, 24, -35, -40);
              break L0;
            }
          }
          var11 = ((lq) this).field_B;
          var7 = var11;
          var8 = 0;
          L1: while (true) {
            if (var11.length <= var8) {
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0 - -((lq) this).field_s, param1, (byte) -101, param3, param4, param5 - -((lq) this).field_v);
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

    final void f(int param0) {
        wj[] var2 = null;
        int var3 = 0;
        wj var4 = null;
        int var5 = 0;
        wj[] var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((lq) this).field_B;
        var2 = var6;
        var3 = 0;
        if (param0 == 31) {
          L0: while (true) {
            if (var3 >= var6.length) {
              return;
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.f(31);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void g(int param0) {
        cq var1 = null;
        int var2 = BachelorFridge.field_y;
        lc.field_l.f();
        nia.field_m.f();
        rq.field_f = rq.field_f - 1;
        if (!(0 != rq.field_f)) {
            rq.field_f = 200;
            var1 = (cq) (Object) rma.field_d.b((byte) 90);
            while (var1 != null) {
                if (!var1.field_h.a((byte) -106)) {
                    var1.a(false);
                }
                var1 = (cq) (Object) rma.field_d.c(0);
            }
            if (!(jha.field_i == null)) {
                var1 = (cq) (Object) jha.field_i.b((byte) 90);
                while (var1 != null) {
                    if (!(var1.field_h.a((byte) -106))) {
                        var1.a(false);
                    }
                    var1 = (cq) (Object) jha.field_i.c(0);
                }
            }
        }
        if (param0 != 1) {
            lq.a(61);
        }
        if (null != uf.field_c) {
            if (!(uf.field_c.c(28607))) {
                uw.field_o = null;
            }
        }
    }

    private final boolean a(int param0, wj param1, int param2) {
        int var4 = 0;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        if (null == ((lq) this).field_B) {
          return false;
        } else {
          var4 = param2;
          L0: while (true) {
            if (var4 >= ((lq) this).field_B.length) {
              return false;
            } else {
              var5 = ((lq) this).field_B[var4];
              if (var5 != null) {
                if (var5.e(1023)) {
                  var4 = var4 + param0;
                  L1: while (true) {
                    if (((lq) this).field_B.length > var4) {
                      L2: {
                        var6 = ((lq) this).field_B[var4];
                        if (var6 != null) {
                          if (!var6.a(param1, param2 ^ -86)) {
                            break L2;
                          } else {
                            return true;
                          }
                        } else {
                          break L2;
                        }
                      }
                      var4 = var4 + param0;
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

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wj var7 = null;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param2 != 0) {
            break L0;
          } else {
            if (null != ((lq) this).field_f) {
              ((lq) this).field_f.a(param3, (wj) this, 32679, param1, true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var5 = -19 % ((param0 - -20) / 54);
          if (((lq) this).field_B == null) {
            break L1;
          } else {
            var6 = ((lq) this).field_B.length + -1;
            L2: while (true) {
              if ((var6 ^ -1) > -1) {
                break L1;
              } else {
                var7 = ((lq) this).field_B[var6];
                if (var7 != null) {
                  var7.a((byte) 125, param1 + ((lq) this).field_v, param2, param3 + ((lq) this).field_s);
                  var6--;
                  continue L2;
                } else {
                  var6--;
                  continue L2;
                }
              }
            }
          }
        }
    }

    lq(int param0, int param1, int param2, int param3, qda param4) {
        super(param0, param1, param2, param3, param4, (pl) null);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        wj[] var8 = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
        var11 = BachelorFridge.field_y;
        if (null != ((lq) this).field_B) {
          L0: {
            if (param1 == 13) {
              break L0;
            } else {
              field_z = null;
              break L0;
            }
          }
          var12 = ((lq) this).field_B;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.e(1023)) {
                  if (var10.a(param0, 13, param2, param3, param4, param5, param6)) {
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

    final int b(int param0) {
        int var2 = 0;
        wj[] var3 = null;
        int var4 = 0;
        wj var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 <= -3) {
          var3 = ((lq) this).field_B;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.b(-116);
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
          return -10;
        }
    }

    final String c(byte param0) {
        wj[] var2 = null;
        int var3 = 0;
        wj var4 = null;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        wj[] var8 = null;
        var6 = BachelorFridge.field_y;
        if (((lq) this).field_B != null) {
          var8 = ((lq) this).field_B;
          var2 = var8;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var8.length) {
              if (param0 != 16) {
                var7 = null;
                boolean discarded$1 = ((lq) this).a(22, -72, ']', (wj) null);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var8[var3];
              if (var4 != null) {
                var5 = var4.c((byte) 16);
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

    private final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var6 = 0;
        int var7 = 0;
        wj var8 = null;
        int var9 = 0;
        int var10 = 0;
        wj[] var11 = null;
        var10 = BachelorFridge.field_y;
        if (((lq) this).field_B == null) {
          return;
        } else {
          var6 = -86 % ((param1 - 43) / 40);
          var11 = ((lq) this).field_B;
          var7 = 0;
          L0: while (true) {
            if (var7 >= var11.length) {
              return;
            } else {
              var8 = var11[var7];
              StringBuilder discarded$34 = param3.append(10);
              var9 = 0;
              L1: while (true) {
                if (var9 > param0) {
                  if (var8 == null) {
                    StringBuilder discarded$35 = param3.append("null");
                    var7++;
                    continue L0;
                  } else {
                    StringBuilder discarded$36 = var8.a(param2, param0 - -1, (byte) 56, param3);
                    var7++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$37 = param3.append(32);
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        wj[] var5_ref_wj__ = null;
        int var5 = 0;
        int var6 = 0;
        wj var7 = null;
        int var8 = 0;
        wj[] var9 = null;
        boolean stackIn_17_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_15_0 = false;
        var8 = BachelorFridge.field_y;
        if (null != ((lq) this).field_B) {
          var9 = ((lq) this).field_B;
          var5_ref_wj__ = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              var5 = param1;
              if ((var5 ^ -1) == -81) {
                L1: {
                  if (wga.field_q[81]) {
                    stackOut_16_0 = this.b(param3, -99);
                    stackIn_17_0 = stackOut_16_0;
                    break L1;
                  } else {
                    stackOut_15_0 = this.a(90, param3);
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  }
                }
                return stackIn_17_0;
              } else {
                if (param0 == 10) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.e(1023)) {
                  if (var7.a(10, param1, param2, param3)) {
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

    private final boolean a(int param0, wj param1) {
        if (param0 <= 24) {
            return false;
        }
        return this.a(1, param1, 0);
    }

    private final boolean b(wj param0, int param1) {
        int var3 = -58 % ((param1 - 15) / 53);
        return this.a(param0, false, 1);
    }

    final static kv a(ee param0, int param1, kv param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        kv var10 = new kv(param2.field_q, param2.field_p);
        kv var11 = var10;
        if (param1 != 8533) {
            field_z = null;
        }
        var11.b();
        param0.a(param4, param3, param2.field_q, param2.field_p);
        dg.d(0, param3, param4, param3, 16777215);
        dg.d(param2.field_q + param4, param3, param2.field_q, param3, 16777215);
        hga.field_U.a((byte) 117);
        for (var6 = 0; var6 < param2.field_q; var6++) {
            var7 = 0;
            var8 = var6;
            while (var8 < param2.field_v.length) {
                if (!(0 == var10.field_v[var8])) {
                    var7 = 1;
                }
                if (!(var7 == 0)) {
                    param2.field_v[var8] = 0;
                }
                var8 = var8 + param2.field_q;
            }
        }
        return param2;
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            return false;
        }
        return null != this.b(false) ? true : false;
    }

    private final boolean a(wj param0, boolean param1, int param2) {
        int var4 = 0;
        wj var5 = null;
        wj var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        if (((lq) this).field_B != null) {
          var4 = ((lq) this).field_B.length + -1;
          L0: while (true) {
            if ((var4 ^ -1) > -1) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((lq) this).f(-93);
                  break L1;
                }
              }
              return false;
            } else {
              var5 = ((lq) this).field_B[var4];
              if (var5 != null) {
                if (var5.e(1023)) {
                  var4 = var4 - param2;
                  L2: while (true) {
                    if ((var4 ^ -1) <= -1) {
                      L3: {
                        var6 = ((lq) this).field_B[var4];
                        if (var6 != null) {
                          if (!var6.a(param0, -79)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 - param2;
                      continue L2;
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

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        wj[] var8 = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        wj[] var12 = null;
        var11 = BachelorFridge.field_y;
        if (null != ((lq) this).field_B) {
          var12 = ((lq) this).field_B;
          var8 = var12;
          if (param1 == -7375) {
            var9 = 0;
            L0: while (true) {
              if (var9 >= var12.length) {
                return false;
              } else {
                var10 = var12[var9];
                if (var10 != null) {
                  if (var10.b(param0, -7375, ((lq) this).field_s + param2, param3, ((lq) this).field_v + param4, param5, param6)) {
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
        } else {
          return false;
        }
    }

    final boolean a(wj param0, int param1) {
        wj[] var3 = null;
        int var4 = 0;
        wj var5 = null;
        int var6 = 0;
        wj[] var7 = null;
        var6 = BachelorFridge.field_y;
        var7 = ((lq) this).field_B;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            if (param1 <= -78) {
              return false;
            } else {
              field_z = null;
              return false;
            }
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, -88)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Suggest muting this player";
        field_y = 0;
    }
}
