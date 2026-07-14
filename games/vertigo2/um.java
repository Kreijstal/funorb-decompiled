/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class um extends iq implements dq {
    static String field_H;
    static qg field_E;
    static ee field_F;
    static String field_C;
    iq[] field_G;
    static String field_D;

    void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        iq var6 = null;
        int var7 = 0;
        ur stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        ur stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        ur stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        ur stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        ur stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        ur stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (((um) this).field_B != null) {
                L1: {
                  stackOut_5_0 = ((um) this).field_B;
                  stackOut_5_1 = 1;
                  stackOut_5_2 = param2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (param0) {
                    stackOut_7_0 = (ur) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    break L1;
                  } else {
                    stackOut_6_0 = (ur) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    break L1;
                  }
                }
                ((ur) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2, stackIn_8_3 != 0, (iq) this, param3);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (null == ((um) this).field_G) {
              break L2;
            } else {
              var5 = -1 + ((um) this).field_G.length;
              L3: while (true) {
                if (var5 < 0) {
                  break L2;
                } else {
                  var6 = ((um) this).field_G[var5];
                  if (var6 != null) {
                    var6.a(false, param1, param2 + ((um) this).field_o, ((um) this).field_t + param3);
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
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, iq param1, int param2) {
        int var4 = 0;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G == null) {
          return false;
        } else {
          var4 = ((um) this).field_G.length - 1;
          L0: while (true) {
            if (0 > var4) {
              if (param0 >= 90) {
                return false;
              } else {
                boolean discarded$1 = ((um) this).f(-89);
                return false;
              }
            } else {
              var5 = ((um) this).field_G[var4];
              if (var5 != null) {
                if (var5.f(67)) {
                  var4 = var4 - param2;
                  L1: while (true) {
                    if (0 <= var4) {
                      L2: {
                        var6 = ((um) this).field_G[var4];
                        if (var6 != null) {
                          if (!var6.a((byte) 116, param1)) {
                            break L2;
                          } else {
                            return true;
                          }
                        } else {
                          break L2;
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

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var9 = 0;
        iq var10 = null;
        int var11 = 0;
        Object var12 = null;
        iq[] var13 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (null != ((um) this).field_G) {
          L0: {
            var13 = ((um) this).field_G;
            var9 = 0;
            if (param5 <= -107) {
              break L0;
            } else {
              var12 = null;
              boolean discarded$2 = ((um) this).a(-62, 27, -12, -87, -46, (byte) -68, (iq) null);
              break L0;
            }
          }
          L1: while (true) {
            if (var13.length <= var9) {
              return false;
            } else {
              var10 = var13[var9];
              if (var10 != null) {
                if (var10.a(param0, param1 - -((um) this).field_o, ((um) this).field_t + param2, param3, param4, (byte) -128, param6)) {
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

    final int c(byte param0) {
        int var2 = 0;
        iq[] var3 = null;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = ((um) this).field_G;
          if (param0 <= -97) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c((byte) -121);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L1;
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

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        iq[] var8 = null;
        int var9 = 0;
        iq var10_ref_iq = null;
        int var10 = 0;
        int var11 = 0;
        iq[] var12 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (null == ((um) this).field_G) {
          return false;
        } else {
          var12 = ((um) this).field_G;
          var8 = var12;
          var9 = 0;
          L0: while (true) {
            if (var9 >= var12.length) {
              var10 = 29 / ((param5 - -87) / 35);
              return false;
            } else {
              var10_ref_iq = var12[var9];
              if (var10_ref_iq != null) {
                if (var10_ref_iq.f(111)) {
                  if (var10_ref_iq.a(param0, param1, param2, param3, param4, (byte) 120, param6)) {
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

    final String a(boolean param0) {
        iq[] var2 = null;
        int var3 = 0;
        iq var4 = null;
        String var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          var7 = ((um) this).field_G;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var7.length) {
              if (param0) {
                field_F = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.a(false);
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

    final static void h(int param0) {
        gg var1 = null;
        int var2 = Vertigo2.field_L ? 1 : 0;
        ri.field_r.b();
        mh.field_d.b();
        eh.field_c = eh.field_c - 1;
        if (!(eh.field_c != param0)) {
            eh.field_c = 200;
            var1 = (gg) (Object) fm.field_b.a((byte) 100);
            while (var1 != null) {
                if (!(var1.field_q.b(param0 + 91))) {
                    var1.c(2);
                }
                var1 = (gg) (Object) fm.field_b.b(104);
            }
            if (!(ro.field_b == null)) {
                var1 = (gg) (Object) ro.field_b.a((byte) 100);
                while (var1 != null) {
                    if (!(var1.field_q.b(86))) {
                        var1.c(2);
                    }
                    var1 = (gg) (Object) ro.field_b.b(96);
                }
            }
        }
        if (qc.field_v != null) {
            if (!(qc.field_v.g(-26083))) {
                fo.field_e = null;
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((um) this).b(!param0 ? true : false);
    }

    public static void a(int param0) {
        field_D = null;
        field_C = null;
        if (param0 <= 6) {
            return;
        }
        field_F = null;
        field_E = null;
        field_H = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (param2 != -79) {
            return null;
        }
        if (!(!((um) this).a(param3, -1, param1, param0))) {
            ((um) this).a(param0, param3, true, param1);
            this.a(param0, true, param3, param1);
        }
        return param3;
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        int var9 = 0;
        iq[] var10 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          L0: {
            if (param1) {
              break L0;
            } else {
              field_H = null;
              break L0;
            }
          }
          var10 = ((um) this).field_G;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var10.length) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param2.append(10);
              var8 = 0;
              L2: while (true) {
                if (var8 > param3) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param2.append("null");
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = var7.a(param0, param3 - -1, (byte) -79, param2);
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

    private final iq a(byte param0) {
        iq[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          var7 = ((um) this).field_G;
          var2 = var7;
          var3 = 29 / ((param0 - 26) / 32);
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              if (var5 != null) {
                if (var5.f(28)) {
                  return var5;
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

    final boolean f(int param0) {
        if (param0 <= 3) {
            boolean discarded$0 = ((um) this).f(-7);
        }
        return null != this.a((byte) -78) ? true : false;
    }

    final void d(byte param0) {
        iq[] var2 = null;
        int var3 = 0;
        iq var4 = null;
        int var5 = 0;
        Object var6 = null;
        iq[] var7 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        var7 = ((um) this).field_G;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((um) this).a(101, -56, -30, -66, -25, (byte) -87, (iq) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.d((byte) 2);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(iq param0, byte param1) {
        if (param1 <= 94) {
            field_F = null;
        }
        return this.a(1, param0, (byte) -127);
    }

    void a(byte param0, int param1, int param2, iq param3) {
        iq[] var5 = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        super.a((byte) 49, param1, param2, param3);
        if (param0 > 6) {
          if (null == ((um) this).field_G) {
            return;
          } else {
            var9 = ((um) this).field_G;
            var5 = var9;
            var6 = 0;
            L0: while (true) {
              if (var9.length <= var6) {
                return;
              } else {
                var7 = var9[var6];
                if (var7 != null) {
                  var7.a((byte) 46, ((um) this).field_o + param1, ((um) this).field_t + param2, param3);
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, long param1) {
        if (-1L <= (param1 ^ -1L)) {
            return;
        }
        if (!param0) {
            field_C = null;
        }
        if ((param1 % 10L ^ -1L) != -1L) {
            an.a(param1, false);
        } else {
            an.a(-1L + param1, false);
            an.a(1L, false);
        }
    }

    private final boolean b(byte param0, iq param1) {
        if (param0 <= 1) {
            field_D = null;
        }
        return this.a(110, param1, 1);
    }

    final boolean a(byte param0, iq param1) {
        iq[] var3 = null;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 116) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        var7 = ((um) this).field_G;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a((byte) 116, param1)) {
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

    um(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
    }

    private final boolean a(int param0, iq param1, byte param2) {
        int var4 = 0;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (null != ((um) this).field_G) {
          L0: {
            var4 = 0;
            if (param2 <= -1) {
              break L0;
            } else {
              field_F = null;
              break L0;
            }
          }
          L1: while (true) {
            if (((um) this).field_G.length <= var4) {
              return false;
            } else {
              var5 = ((um) this).field_G[var4];
              if (var5 != null) {
                if (var5.f(65)) {
                  var4 = var4 + param0;
                  L2: while (true) {
                    if (var4 < ((um) this).field_G.length) {
                      L3: {
                        var6 = ((um) this).field_G[var4];
                        if (var6 != null) {
                          if (!var6.a((byte) 116, param1)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 + param0;
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

    final boolean a(char param0, int param1, int param2, iq param3) {
        iq[] var5_ref_iq__ = null;
        int var5 = 0;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G != null) {
          L0: {
            if (param1 == 13) {
              break L0;
            } else {
              field_C = null;
              break L0;
            }
          }
          var9 = ((um) this).field_G;
          var5_ref_iq__ = var9;
          var6 = 0;
          L1: while (true) {
            if (var6 >= var9.length) {
              var5 = param2;
              if (var5 == 80) {
                L2: {
                  if (!cr.field_eb[81]) {
                    stackOut_18_0 = this.a(param3, (byte) 121);
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = this.b((byte) 104, param3);
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                return stackIn_19_0;
              } else {
                return false;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.f(param1 ^ 87)) {
                  if (var7.a(param0, 13, param2, param3)) {
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

    abstract void b(boolean param0);

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        iq[] var7 = null;
        int var8 = 0;
        iq var9 = null;
        int var10 = 0;
        iq[] var11 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        if (((um) this).field_G == null) {
          return;
        } else {
          var11 = ((um) this).field_G;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var8 >= var11.length) {
              L1: {
                if (param1 == 46) {
                  break L1;
                } else {
                  ((um) this).a(true, -8, 46, -97);
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, (byte) 46, param2 - -((um) this).field_o, ((um) this).field_t + param3, param4, param5);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Match by...";
        field_C = "Year";
        field_D = "Show game chat from my friends";
    }
}
