/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pc extends qm {
    static String field_w;
    static int field_y;
    boolean field_A;
    static pp[] field_u;
    private boolean field_v;
    boolean field_x;
    private boolean field_z;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        if (((pc) this).field_l != null) {
          if (!(((pc) this).field_l instanceof i)) {
            ((pc) this).field_s = param5;
            return;
          } else {
            ((i) (Object) ((pc) this).field_l).a((pc) this, param2, param1, false, param0, param3);
            ((pc) this).field_s = param5;
            return;
          }
        } else {
          ((pc) this).field_s = param5;
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        if (!param3) {
          if (((pc) this).field_x) {
            if (((pc) this).a(param1, param0, param3, param4, param6)) {
              boolean discarded$2 = ((pc) this).a(true, param2);
              ((pc) this).field_s = param5;
              if (((pc) this).field_l != null) {
                if (((pc) this).field_l instanceof i) {
                  ((i) (Object) ((pc) this).field_l).a(param0, (byte) -122, (pc) this, param5, param6, param4, param1);
                  return true;
                } else {
                  return true;
                }
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
          ((pc) this).field_z = true;
          if (((pc) this).field_x) {
            if (((pc) this).a(param1, param0, param3, param4, param6)) {
              boolean discarded$3 = ((pc) this).a(true, param2);
              ((pc) this).field_s = param5;
              if (((pc) this).field_l != null) {
                if (!(((pc) this).field_l instanceof i)) {
                  return true;
                } else {
                  ((i) (Object) ((pc) this).field_l).a(param0, (byte) -122, (pc) this, param5, param6, param4, param1);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 >= -107) {
            field_u = null;
            return ((pc) this).field_z;
        }
        return ((pc) this).field_z;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.a(param0, 69, param2, param3);
        var5 = -17 % ((-50 - param1) / 59);
        if (-1 != ((pc) this).field_s) {
          if (((pc) this).field_s != gg.field_c) {
            if (!((pc) this).a(bm.field_h, param3, false, param2, qh.field_i)) {
              ((pc) this).a(bm.field_h, param2, param3, qh.field_i, param0, 0);
              return;
            } else {
              if (-1 == gg.field_c) {
                ((pc) this).a(bm.field_h - param2, qh.field_i + -param3, -100, ((pc) this).field_s);
                ((pc) this).a(bm.field_h, param2, param3, qh.field_i, param0, 0);
                return;
              } else {
                ((pc) this).a(bm.field_h, param2, param3, qh.field_i, param0, 0);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        L0: {
          if (!((pc) this).a(0, param0, param3, param2)) {
            break L0;
          } else {
            L1: {
              ((pc) this).a(param0, (byte) 121, param3, param2);
              if (((pc) this).field_A) {
                StringBuilder discarded$4 = param3.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (!((pc) this).field_x) {
              StringBuilder discarded$5 = param3.append(" disabled");
              break L0;
            } else {
              if (param1 <= -85) {
                return param3;
              } else {
                field_u = null;
                return param3;
              }
            }
          }
        }
        if (param1 > -85) {
          field_u = null;
          return param3;
        } else {
          return param3;
        }
    }

    final static void a(int param0, int param1, int param2, dl param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        var20 = CrazyCrystals.field_B;
        var6 = (param2 + -param4 << 2121674536) / param3.field_n;
        param5 = param5 + param3.field_v;
        param0 = param0 + param3.field_t;
        var7 = (param4 << 617553576) - -(var6 * param3.field_v);
        var8 = kh.field_l * param0 + param5;
        var9 = 0;
        if (param1 == 617553576) {
          L0: {
            var10 = param3.field_u;
            var11 = param3.field_l;
            var12 = kh.field_l + -var11;
            if (kh.field_b <= param0) {
              break L0;
            } else {
              var14 = -param0 + kh.field_b;
              var9 = var9 + var11 * var14;
              param0 = kh.field_b;
              var8 = var8 + kh.field_l * var14;
              var10 = var10 - var14;
              break L0;
            }
          }
          L1: {
            var13 = 0;
            if (param5 < kh.field_c) {
              var14 = kh.field_c - param5;
              param5 = kh.field_c;
              var8 = var8 + var14;
              var11 = var11 - var14;
              var13 = var13 + var14;
              var9 = var9 + var14;
              var7 = var7 + var14 * var6;
              var12 = var12 + var14;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (kh.field_j >= var10 + param0) {
              break L2;
            } else {
              var10 = var10 - (var10 + param0 + -kh.field_j);
              break L2;
            }
          }
          L3: {
            if (kh.field_g < param5 - -var11) {
              var14 = -kh.field_g + var11 + param5;
              var11 = var11 - var14;
              var12 = var12 + var14;
              var13 = var13 + var14;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var11 >= -1) {
              break L4;
            } else {
              if (-1 >= var10) {
                break L4;
              } else {
                param0 = -var10;
                L5: while (true) {
                  if (-1 >= param0) {
                    return;
                  } else {
                    var14 = var7;
                    param5 = -var11;
                    L6: while (true) {
                      if (-1 <= param5) {
                        var8 = var8 + var12;
                        var9 = var9 + var13;
                        param0++;
                        continue L5;
                      } else {
                        var15 = var14 >> -1179348984;
                        var16 = -var15 + 256;
                        var14 = var14 + var6;
                        if (0 > var15) {
                          var8++;
                          var9++;
                          param5++;
                          continue L6;
                        } else {
                          var9++;
                          var17 = param3.field_w[var9];
                          if (var17 != 0) {
                            if (255 >= var15) {
                              var18 = kh.field_i[var8];
                              var19 = var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 194422856 & 16711935;
                              kh.field_i[var8] = var19 - -(pf.b(var15 * pf.b(65280, var17) + var16 * pf.b(65280, var18), 16711789) >> 1657473032);
                              var8++;
                              param5++;
                              continue L6;
                            } else {
                              kh.field_i[var8] = var17;
                              var8++;
                              param5++;
                              continue L6;
                            }
                          } else {
                            var8++;
                            param5++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          L7: {
            var21 = null;
            pc.a(-79, 70, -75, (dl) null, 95, -72);
            var10 = param3.field_u;
            var11 = param3.field_l;
            var12 = kh.field_l + -var11;
            if (kh.field_b <= param0) {
              break L7;
            } else {
              var14 = -param0 + kh.field_b;
              var9 = var9 + var11 * var14;
              param0 = kh.field_b;
              var8 = var8 + kh.field_l * var14;
              var10 = var10 - var14;
              break L7;
            }
          }
          L8: {
            var13 = 0;
            if (param5 < kh.field_c) {
              var14 = kh.field_c - param5;
              param5 = kh.field_c;
              var8 = var8 + var14;
              var11 = var11 - var14;
              var13 = var13 + var14;
              var9 = var9 + var14;
              var7 = var7 + var14 * var6;
              var12 = var12 + var14;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (kh.field_j >= var10 + param0) {
              break L9;
            } else {
              var10 = var10 - (var10 + param0 + -kh.field_j);
              break L9;
            }
          }
          L10: {
            if (kh.field_g < param5 - -var11) {
              var14 = -kh.field_g + var11 + param5;
              var11 = var11 - var14;
              var12 = var12 + var14;
              var13 = var13 + var14;
              break L10;
            } else {
              break L10;
            }
          }
          if (var11 < -1) {
            if (-1 <= var10) {
              return;
            } else {
              param0 = -var10;
              L11: while (true) {
                if (-1 >= param0) {
                  return;
                } else {
                  var14 = var7;
                  param5 = -var11;
                  L12: while (true) {
                    if (-1 <= param5) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param0++;
                      continue L11;
                    } else {
                      var15 = var14 >> -1179348984;
                      var16 = -var15 + 256;
                      var14 = var14 + var6;
                      if (0 > var15) {
                        var8++;
                        var9++;
                        param5++;
                        continue L12;
                      } else {
                        var9++;
                        var17 = param3.field_w[var9];
                        if (var17 != 0) {
                          if (255 >= var15) {
                            var18 = kh.field_i[var8];
                            var19 = var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 194422856 & 16711935;
                            kh.field_i[var8] = var19 - -(pf.b(var15 * pf.b(65280, var17) + var16 * pf.b(65280, var18), 16711789) >> 1657473032);
                            var8++;
                            param5++;
                            continue L12;
                          } else {
                            kh.field_i[var8] = var17;
                            var8++;
                            param5++;
                            continue L12;
                          }
                        } else {
                          var8++;
                          param5++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        Object var6 = null;
        if (param1 == 19279) {
          if (((pc) this).e(param1 ^ -19249)) {
            if (param0 != 84) {
              if (-84 != (param0 ^ -1)) {
                return false;
              } else {
                ((pc) this).a(-1, -1, -87, 1);
                return true;
              }
            } else {
              ((pc) this).a(-1, -1, -87, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          var6 = null;
          String discarded$5 = pc.a((String) null, 77);
          if (((pc) this).e(param1 ^ -19249)) {
            if (param0 != 84) {
              if (-84 == (param0 ^ -1)) {
                ((pc) this).a(-1, -1, -87, 1);
                return true;
              } else {
                return false;
              }
            } else {
              ((pc) this).a(-1, -1, -87, 1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    pc(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        ((pc) this).field_x = true;
        ((pc) this).field_v = true;
        ((pc) this).field_z = false;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (((pc) this).field_l == null) {
            break L0;
          } else {
            if (((pc) this).field_l instanceof vd) {
              ((vd) (Object) ((pc) this).field_l).a((byte) -78, param1, param0, param3, (pc) this);
              break L0;
            } else {
              if (param2 <= -75) {
                return;
              } else {
                field_u = null;
                return;
              }
            }
          }
        }
        if (param2 > -75) {
          field_u = null;
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (((pc) this).field_z) {
          ((pc) this).field_z = false;
          if (((pc) this).field_l != null) {
            if (((pc) this).field_l instanceof cq) {
              ((cq) (Object) ((pc) this).field_l).a(((pc) this).field_z, (byte) 80, (qm) this);
              if (param0 >= -84) {
                ((pc) this).field_v = false;
                return;
              } else {
                return;
              }
            } else {
              if (param0 >= -84) {
                ((pc) this).field_v = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 >= -84) {
              ((pc) this).field_v = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 >= -84) {
            ((pc) this).field_v = false;
            return;
          } else {
            return;
          }
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var2 > var4; var4++) {
            var3[-var4 + (var2 - 1)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    boolean a(boolean param0, qm param1) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        if (((pc) this).field_x) {
          if (((pc) this).field_v) {
            L0: {
              param1.b((byte) -116);
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (!param0) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L0;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L0;
              }
            }
            ((pc) this).field_z = stackIn_8_1 != 0;
            if (((pc) this).field_l != null) {
              if (!(((pc) this).field_l instanceof cq)) {
                return true;
              } else {
                ((cq) (Object) ((pc) this).field_l).a(((pc) this).field_z, (byte) 80, (qm) this);
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_u = null;
        int var1 = -118 % ((param0 - 44) / 55);
        field_w = null;
    }

    pc(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
    }

    protected pc() {
        ((pc) this).field_x = true;
        ((pc) this).field_v = true;
        ((pc) this).field_z = false;
        ((pc) this).field_i = pi.field_j.field_e;
    }

    static {
    }
}
