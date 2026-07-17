/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class m extends ue {
    static String[] field_e;
    private boolean field_o;
    private int field_h;
    private boolean field_q;
    private int field_t;
    static int[] field_l;
    private boolean field_p;
    private boolean field_s;
    private re field_g;
    static am field_n;
    private int field_i;
    static String field_m;
    private String field_j;
    private String field_r;
    private ak field_k;
    private boolean field_f;

    m(re param0, int param1, String param2, int param3, int param4, boolean param5) {
        super(5);
        try {
            if (!(a.field_b instanceof m)) {
                gh.field_B = 0;
            }
            ((m) this).field_t = param4;
            ((m) this).field_q = param5 ? true : false;
            ((m) this).field_i = param3;
            ((m) this).field_j = param2;
            ((m) this).field_g = param0;
            ((m) this).field_b.field_c = -1;
            ((m) this).field_h = param1;
            ((m) this).d(136);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "m.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (((m) this).field_s) {
          L0: {
            if (0 >= gh.field_B) {
              break L0;
            } else {
              gh.field_B = gh.field_B - 1;
              break L0;
            }
          }
          L1: {
            if (0 != gh.field_B) {
              break L1;
            } else {
              a.field_b = (ue) (Object) ((m) this).field_g;
              ((m) this).field_g.a(((m) this).field_b.field_i, -13880);
              break L1;
            }
          }
          ((m) this).field_g.a(false);
          return;
        } else {
          L2: {
            if (!((m) this).field_q) {
              ((m) this).field_g.f(-112);
              ((m) this).field_g.c((byte) 73);
              ((m) this).field_g.a((byte) 20, ((m) this).field_h);
              break L2;
            } else {
              break L2;
            }
          }
          if (!((m) this).field_p) {
            L3: {
              if (!((m) this).field_f) {
                break L3;
              } else {
                L4: {
                  if (gh.field_B > 0) {
                    gh.field_B = gh.field_B - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((m) this).field_g.c(2, 40, 180);
                if (((m) this).field_g.field_f >= 40) {
                  if (!((m) this).field_o) {
                    rk.a(0);
                    ((m) this).field_b.a(-1, true, -1);
                    ((m) this).field_o = true;
                    return;
                  } else {
                    ((m) this).field_f = false;
                    ((m) this).field_o = false;
                    if (!rc.a(-98)) {
                      ((m) this).d(136);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L5: {
              if (gh.field_B < 20) {
                gh.field_B = gh.field_B + 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                ((m) this).field_q = true;
                break L6;
              }
            }
            ((m) this).field_g.c(-1);
            L7: while (true) {
              if (!ge.b(-59)) {
                ((m) this).a((byte) 118);
                return;
              } else {
                L8: {
                  if (!rc.a(-93)) {
                    L9: {
                      if (pj.field_q == 96) {
                        al.field_c = (al.field_c + 2) % 3;
                        ((m) this).field_b.field_c = al.field_c;
                        ((m) this).field_b.field_i = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (97 != pj.field_q) {
                        break L10;
                      } else {
                        al.field_c = (al.field_c - -1) % 3;
                        ((m) this).field_b.field_i = false;
                        ((m) this).field_b.field_c = al.field_c;
                        break L10;
                      }
                    }
                    L11: {
                      if (pj.field_q == 98) {
                        L12: {
                          if (4 != ((m) this).field_b.field_c) {
                            ((m) this).field_b.field_c = 4;
                            break L12;
                          } else {
                            ((m) this).field_b.field_c = al.field_c;
                            break L12;
                          }
                        }
                        ((m) this).field_b.field_i = false;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (pj.field_q == 99) {
                      L13: {
                        if (al.field_c == ((m) this).field_b.field_c) {
                          ((m) this).field_b.field_c = 4;
                          break L13;
                        } else {
                          ((m) this).field_b.field_c = al.field_c;
                          break L13;
                        }
                      }
                      ((m) this).field_b.field_i = false;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    L14: {
                      if (pj.field_q != 98) {
                        break L14;
                      } else {
                        L15: {
                          if (4 == ((m) this).field_b.field_c) {
                            ((m) this).field_b.field_c = 3;
                            break L15;
                          } else {
                            ((m) this).field_b.field_c = 4;
                            break L15;
                          }
                        }
                        ((m) this).field_b.field_i = false;
                        break L14;
                      }
                    }
                    if (99 != pj.field_q) {
                      break L8;
                    } else {
                      L16: {
                        if (3 == ((m) this).field_b.field_c) {
                          ((m) this).field_b.field_c = 4;
                          break L16;
                        } else {
                          ((m) this).field_b.field_c = 3;
                          break L16;
                        }
                      }
                      ((m) this).field_b.field_i = false;
                      break L8;
                    }
                  }
                }
                ((m) this).field_b.a((byte) 57);
                if (!((m) this).a(106)) {
                  L17: {
                    if (pj.field_q == 13) {
                      break L17;
                    } else {
                      if (!((m) this).field_b.a(true)) {
                        continue L7;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    L19: {
                      if (!((m) this).field_q) {
                        break L19;
                      } else {
                        if (mo.field_l != 0) {
                          break L19;
                        } else {
                          if (dk.field_h >= uo.field_o) {
                            break L19;
                          } else {
                            ((m) this).field_p = true;
                            break L18;
                          }
                        }
                      }
                    }
                    ((m) this).field_s = true;
                    break L18;
                  }
                  ((m) this).field_b.field_i = false;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L20: {
              if (gh.field_B <= 0) {
                break L20;
              } else {
                gh.field_B = gh.field_B - 1;
                break L20;
              }
            }
            L21: {
              if (0 == gh.field_B) {
                a.field_b = (ue) (Object) new rb(((m) this).field_g, ((m) this).field_b.field_i);
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 >= -122) {
            return;
        }
        field_l = null;
        field_m = null;
        field_e = null;
        field_n = null;
    }

    final static void c() {
    }

    final boolean a(int param0) {
        L0: {
          if (((m) this).field_b.field_c < 0) {
            break L0;
          } else {
            if (((m) this).field_b.field_c > 2) {
              break L0;
            } else {
              if (!((m) this).field_b.a(true)) {
                break L0;
              } else {
                al.field_c = ((m) this).field_b.field_c;
                return false;
              }
            }
          }
        }
        L1: {
          if (((m) this).field_b.field_c != 3) {
            break L1;
          } else {
            if (!((m) this).field_b.a(true)) {
              break L1;
            } else {
              if (!rc.a(-59)) {
                break L1;
              } else {
                ((m) this).field_f = true;
                return true;
              }
            }
          }
        }
        L2: {
          if (4 != ((m) this).field_b.field_c) {
            break L2;
          } else {
            if (!((m) this).field_b.a(true)) {
              break L2;
            } else {
              L3: {
                if (!((m) this).field_q) {
                  break L3;
                } else {
                  if (mo.field_l != 0) {
                    break L3;
                  } else {
                    if (dk.field_h < uo.field_o) {
                      ((m) this).field_p = true;
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ((m) this).field_s = true;
              return true;
            }
          }
        }
        L4: {
          if (param0 > 99) {
            break L4;
          } else {
            ((m) this).field_f = false;
            break L4;
          }
        }
        return false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null == rg.a(param1, (byte) 120)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("m.C(").append(-126).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var6_ref_String__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        int stackIn_6_0 = 0;
        re stackIn_9_0 = null;
        re stackIn_10_0 = null;
        re stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ef stackIn_35_0 = null;
        ef stackIn_36_0 = null;
        ef stackIn_37_0 = null;
        String stackIn_37_1 = null;
        ef stackIn_43_0 = null;
        ef stackIn_44_0 = null;
        ef stackIn_45_0 = null;
        String stackIn_45_1 = null;
        ik stackIn_53_0 = null;
        ik stackIn_54_0 = null;
        ik stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        ik stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        ik stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        ik stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        ik stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ik stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        re stackOut_8_0 = null;
        re stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        re stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ef stackOut_34_0 = null;
        ef stackOut_36_0 = null;
        String stackOut_36_1 = null;
        ef stackOut_35_0 = null;
        String stackOut_35_1 = null;
        ef stackOut_42_0 = null;
        ef stackOut_44_0 = null;
        String stackOut_44_1 = null;
        ef stackOut_43_0 = null;
        String stackOut_43_1 = null;
        ik stackOut_52_0 = null;
        ik stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        ik stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        ik stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        ik stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        ik stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        ik stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        L0: {
          var14 = CrazyCrystals.field_B;
          if (((m) this).field_k != null) {
            break L0;
          } else {
            if (rc.a(-56)) {
              break L0;
            } else {
              int discarded$4 = 1;
              int discarded$5 = 10;
              int discarded$6 = 3;
              int discarded$7 = 125;
              ((m) this).field_k = jp.a(((m) this).field_i);
              break L0;
            }
          }
        }
        L1: {
          ((m) this).field_g.e(75);
          var2 = gh.field_B * (580 * gh.field_B) / 400 + 30;
          if (!((m) this).field_q) {
            stackOut_5_0 = 110;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 80;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        wi.a(30, jn.field_o, var3, -var3 + 407, (byte) -71, -30 + var2);
        kh.d(38, param0 + var3, var2 - 46, -var3 + 391, 0, 192);
        if (((m) this).field_g.field_f == 0) {
          L2: {
            stackOut_8_0 = ((m) this).field_g;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (((m) this).field_s) {
              stackOut_10_0 = (re) (Object) stackIn_10_0;
              stackOut_10_1 = -1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            } else {
              stackOut_9_0 = (re) (Object) stackIn_9_0;
              stackOut_9_1 = ((m) this).field_h;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L2;
            }
          }
          ((re) (Object) stackIn_11_0).a(stackIn_11_1, false);
          if (gh.field_B != 20) {
            return;
          } else {
            L3: {
              if (((m) this).field_q) {
                go.field_l.c(((m) this).field_j, 320, 106, 16777215, -1);
                break L3;
              } else {
                break L3;
              }
            }
            var4 = CrazyCrystals.field_C;
            var5 = qk.a(al.field_c, param0 ^ 119, ((m) this).field_k, lo.field_b);
            go.field_l.a(ae.field_G, 100, 136, 16760896, -1);
            go.field_l.b(vn.field_m, 340, 136, 16760896, -1);
            go.field_l.b(tg.field_a, 440, 136, 16760896, -1);
            go.field_l.b(ff.field_d, 560, 136, 16760896, -1);
            var6 = 0;
            L4: while (true) {
              if (var6 >= 10) {
                L5: {
                  if (null != ((m) this).field_k) {
                    if (((m) this).field_k.field_n) {
                      L6: {
                        if (((m) this).field_k.field_i != null) {
                          var6_ref_String__ = ((m) this).field_k.field_i[al.field_c];
                          var19 = ((m) this).field_k.field_l[al.field_c];
                          var8 = 0;
                          L7: while (true) {
                            if (var8 >= 10) {
                              break L6;
                            } else {
                              if (null != var6_ref_String__[var8]) {
                                L8: {
                                  var4 = null;
                                  var9 = 8438015;
                                  if (var5 != var8) {
                                    break L8;
                                  } else {
                                    var9 = 16777215;
                                    break L8;
                                  }
                                }
                                L9: {
                                  go.field_l.a(var6_ref_String__[var8], 100, 161 - -(var8 * 20), var9, -1);
                                  var10 = var19[var8];
                                  var11 = var10 % 100;
                                  var10 = var10 / 100;
                                  var12 = var10 % 100;
                                  var10 = var10 / 100;
                                  var13 = -var11 + var12;
                                  go.field_l.b(Integer.toString(1 + var13), 340, 161 + 20 * var8, var9, -1);
                                  stackOut_34_0 = go.field_l;
                                  stackIn_36_0 = stackOut_34_0;
                                  stackIn_35_0 = stackOut_34_0;
                                  if (-1 + ((m) this).field_t != var12) {
                                    stackOut_36_0 = (ef) (Object) stackIn_36_0;
                                    stackOut_36_1 = Integer.toString(var12 - -1);
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    break L9;
                                  } else {
                                    stackOut_35_0 = (ef) (Object) stackIn_35_0;
                                    stackOut_35_1 = ah.field_d;
                                    stackIn_37_0 = stackOut_35_0;
                                    stackIn_37_1 = stackOut_35_1;
                                    break L9;
                                  }
                                }
                                ((ef) (Object) stackIn_37_0).b(stackIn_37_1, 440, 161 + 20 * var8, var9, -1);
                                go.field_l.b(Integer.toString(var10), 560, 161 + 20 * var8, var9, -1);
                                var8++;
                                continue L7;
                              } else {
                                var8++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          var4 = ke.field_a;
                          break L6;
                        }
                      }
                      if (var5 >= 0) {
                        break L5;
                      } else {
                        if (null == lo.field_b) {
                          break L5;
                        } else {
                          if (lo.field_b.field_k == ((m) this).field_k.field_g) {
                            L10: {
                              go.field_l.a(je.field_g, 100, 366, 16777215, -1);
                              go.field_l.b(Integer.toString(dk.field_q - -1), 340, 366, 16777215, -1);
                              stackOut_42_0 = go.field_l;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_43_0 = stackOut_42_0;
                              if (((m) this).field_t + -1 == oc.field_b) {
                                stackOut_44_0 = (ef) (Object) stackIn_44_0;
                                stackOut_44_1 = ah.field_d;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                break L10;
                              } else {
                                stackOut_43_0 = (ef) (Object) stackIn_43_0;
                                stackOut_43_1 = Integer.toString(1 + oc.field_b);
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                break L10;
                              }
                            }
                            ((ef) (Object) stackIn_45_0).b(stackIn_45_1, 440, 366, 16777215, -1);
                            go.field_l.b(Integer.toString(kp.field_m), 560, 366, 16777215, -1);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      var4 = wp.field_a;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L11: {
                  if (var4 == null) {
                    break L11;
                  } else {
                    go.field_l.c(var4, 320, 251, 16777215, -1);
                    break L11;
                  }
                }
                go.field_l.c(((m) this).field_r, 320, 391, 16760896, -1);
                var15 = 0;
                var6 = var15;
                L12: while (true) {
                  if (((m) this).field_d.length <= var15) {
                    return;
                  } else {
                    if (((m) this).field_d[var15] != null) {
                      L13: {
                        stackOut_52_0 = ((m) this).field_d[var15];
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_53_0 = stackOut_52_0;
                        if (var15 != ((m) this).field_b.field_c) {
                          stackOut_54_0 = (ik) (Object) stackIn_54_0;
                          stackOut_54_1 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          break L13;
                        } else {
                          stackOut_53_0 = (ik) (Object) stackIn_53_0;
                          stackOut_53_1 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          break L13;
                        }
                      }
                      stackOut_55_0 = (ik) (Object) stackIn_55_0;
                      stackOut_55_1 = stackIn_55_1;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_57_1 = stackOut_55_1;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      if (var15 != ((m) this).field_b.field_c) {
                        L14: {
                          stackOut_57_0 = (ik) (Object) stackIn_57_0;
                          stackOut_57_1 = stackIn_57_1;
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_58_0 = stackOut_57_0;
                          stackIn_58_1 = stackOut_57_1;
                          if (al.field_c == var15) {
                            stackOut_59_0 = (ik) (Object) stackIn_59_0;
                            stackOut_59_1 = stackIn_59_1;
                            stackOut_59_2 = 16760896;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            stackIn_60_2 = stackOut_59_2;
                            break L14;
                          } else {
                            stackOut_58_0 = (ik) (Object) stackIn_58_0;
                            stackOut_58_1 = stackIn_58_1;
                            stackOut_58_2 = 12640511;
                            stackIn_60_0 = stackOut_58_0;
                            stackIn_60_1 = stackOut_58_1;
                            stackIn_60_2 = stackOut_58_2;
                            break L14;
                          }
                        }
                        ((ik) (Object) stackIn_60_0).a(stackIn_60_1 != 0, stackIn_60_2, 1);
                        var15++;
                        continue L12;
                      } else {
                        ((ik) (Object) stackIn_56_0).a(stackIn_56_1 != 0, 16777215, 1);
                        var15++;
                        continue L12;
                      }
                    } else {
                      var15++;
                      continue L12;
                    }
                  }
                }
              } else {
                L15: {
                  var7 = 8438015;
                  if (var6 != var5) {
                    break L15;
                  } else {
                    var7 = 16777215;
                    break L15;
                  }
                }
                go.field_l.b(1 + var6 + ". ", 100, 161 - -(20 * var6), var7, -1);
                var6++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          ((m) this).field_d = new ik[5];
          if (param0 == 136) {
            break L0;
          } else {
            m.c((byte) -42);
            break L0;
          }
        }
        L1: {
          if (rc.a(param0 ^ -163)) {
            ((m) this).field_r = el.field_f;
            ((m) this).field_d[3] = (ik) (Object) new mh(200, 417, 240, si.field_a, 2);
            break L1;
          } else {
            ((m) this).field_r = nl.field_g;
            var2 = go.field_l.a(ga.field_Q[0]);
            var3 = go.field_l.a(ga.field_Q[1]);
            var4 = go.field_l.a(ga.field_Q[2]);
            var5 = 60 + (var2 - -60 + var3 - -var4);
            var6 = (640 + -var5) / 2;
            ((m) this).field_d[0] = (ik) (Object) new mh(var6, 417, ga.field_Q[0], 0);
            var6 = var6 + (var2 - -60);
            ((m) this).field_d[1] = (ik) (Object) new mh(var6, 417, ga.field_Q[1], 0);
            var6 = var6 + (var3 + 60);
            ((m) this).field_d[2] = (ik) (Object) new mh(var6, 417, ga.field_Q[2], 0);
            break L1;
          }
        }
        ((m) this).field_d[4] = (ik) (Object) new mh(200, 450, 240, ag.field_a, 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_m = "Push this rock left or right to break one of the logs.";
    }
}
