/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ng extends fa {
    int field_B;
    eb field_y;
    static hh[] field_A;
    boolean field_D;
    static double field_s;
    int field_x;
    static int field_u;
    int field_k;
    int field_E;
    String field_l;
    int field_z;
    String field_q;
    static String field_t;
    int field_p;
    static String field_v;
    static int[] field_m;
    static String field_w;
    kd field_r;
    static hh[] field_o;
    int field_C;
    fn field_n;

    public final String toString() {
        return ((ng) this).a(new StringBuilder(), false, 0, new Hashtable()).toString();
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        if (param1 != 3) {
            field_A = null;
            return false;
        }
        return false;
    }

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 == -58) {
          if (!((ng) this).a(93, param5, param3, param6, param4)) {
            return false;
          } else {
            ((ng) this).field_k = param2;
            return false;
          }
        } else {
          return false;
        }
    }

    int e(int param0) {
        if (param0 <= 31) {
            ((ng) this).field_l = null;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        var5 = -54 / ((70 - param3) / 49);
        if (0 == param1) {
          if (null == ((ng) this).field_y) {
            return;
          } else {
            ((ng) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
            return;
          }
        } else {
          return;
        }
    }

    boolean a(ng param0, int param1) {
        if (param1 != 27) {
            ((ng) this).field_k = -73;
            return false;
        }
        return false;
    }

    void h(int param0) {
        if (param0 != 2) {
            boolean discarded$0 = ((ng) this).a(-82, false, (byte) 61, -91);
        }
    }

    final static void a(boolean param0) {
        l.b(true);
        if (param0) {
            return;
        }
        vk.n(93);
    }

    void a(int param0, int param1, int param2, ng param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var5 = ((ng) this).a(param0 + 66, param2, param1, bg.field_k, uf.field_d) ? 1 : 0;
          if (var5 != 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (((ng) this).field_D) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        if (stackIn_6_0 != stackIn_6_1) {
          L2: {
            stackOut_11_0 = this;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var5 == 0) {
              stackOut_13_0 = this;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L2;
            } else {
              stackOut_12_0 = this;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L2;
            }
          }
          ((ng) this).field_D = stackIn_14_1 != 0;
          if (null != ((ng) this).field_n) {
            if (!(((ng) this).field_n instanceof n)) {
              if (param0 != 40) {
                boolean discarded$8 = ((ng) this).b(true);
                return;
              } else {
                return;
              }
            } else {
              ((n) (Object) ((ng) this).field_n).a((ng) this, var5 != 0, true);
              if (param0 != 40) {
                boolean discarded$9 = ((ng) this).b(true);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 40) {
              boolean discarded$10 = ((ng) this).b(true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 == 40) {
            return;
          } else {
            boolean discarded$11 = ((ng) this).b(true);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 != 0) {
          ng.a(true);
          field_A = null;
          field_o = null;
          field_t = null;
          field_v = null;
          field_w = null;
          return;
        } else {
          field_A = null;
          field_o = null;
          field_t = null;
          field_v = null;
          field_w = null;
          return;
        }
    }

    boolean b(boolean param0) {
        if (!param0) {
            field_u = -102;
            return false;
        }
        return false;
    }

    final void c(byte param0) {
        ((ng) this).a(((ng) this).field_E, (byte) 99, ((ng) this).field_p, ((ng) this).field_z, ((ng) this).field_C);
        if (param0 <= 48) {
            Object var3 = null;
            ((ng) this).a(124, -118, -106, (ng) null);
        }
    }

    String b(byte param0) {
        if (param0 < 16) {
            return null;
        }
        return !((ng) this).field_D ? null : ((ng) this).field_l;
    }

    final static void g(int param0) {
        tf var1 = null;
        tf var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var1 = new tf(540, 140);
        h.a(-126, var1);
        ja.a();
        t.d();
        ga.field_f = param0;
        ma.d((byte) 106);
        var2 = var1.a();
        var3 = 0;
        L0: while (true) {
          if (15 > var3) {
            var2.e(-2, -2, 16777215);
            t.c(4, 4, 0, 0, 540, 140);
            var3++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            bd.field_a.c();
            var1.d(0, 0);
            ia.a((byte) 92);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = ((ng) this).e(63);
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 > var4) {
              var5 = -7 % ((44 - param2) / 51);
              break L1;
            } else {
              ((ng) this).a(param0, var5, param1, (byte) -63);
              var5++;
              if (var7 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          var6 = hb.e((byte) -115);
          if (var6 != null) {
            h.field_X.a(var6, oo.field_f, false, tm.field_V);
            return;
          } else {
            return;
          }
        }
    }

    final static void i(int param0) {
        pj[] var1 = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        pj[] var5 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        var5 = up.field_n;
        var1 = var5;
        var2 = param0;
        L0: while (true) {
          if (var5.length > var2) {
            var3 = var5[var2];
            var3.field_f = true;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        Object var5 = null;
        if (!((ng) this).b(true)) {
          var4 = param1;
          if ((var4 ^ -1) == -81) {
            return ((ng) this).a((ng) this, 27);
          } else {
            if (param2) {
              var5 = null;
              boolean discarded$2 = ((ng) this).a((byte) -104, (ng) null, 48, -22, 91, 48, -13);
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (!((ng) this).a(param1, 3, (ng) this, param0)) {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return ((ng) this).a((ng) this, 27);
            } else {
              if (!param2) {
                return false;
              } else {
                var5 = null;
                boolean discarded$3 = ((ng) this).a((byte) -104, (ng) null, 48, -22, 91, 48, -13);
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, boolean param1, byte param2, int param3) {
        int var5 = 0;
        bn var6 = null;
        int var7 = 0;
        bn var8 = null;
        bn var9 = null;
        bn var10 = null;
        bn var11 = null;
        bn var12 = null;
        bn var13 = null;
        bn var14 = null;
        bn var15 = null;
        L0: {
          L1: {
            var7 = Pixelate.field_H ? 1 : 0;
            ((ng) this).a(40, param0, param3, (ng) this);
            var5 = ((ng) this).b(true) ? 1 : 0;
            if (!param1) {
              break L1;
            } else {
              L2: {
                if (lp.field_i == 0) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    boolean discarded$1 = ((ng) this).a(uf.field_d, (byte) 80, param0, param3, bg.field_k, lp.field_i, (ng) this);
                    break L2;
                  } else {
                    if (0 != nm.field_c) {
                      if (!((ng) this).a((byte) -58, (ng) this, nm.field_c, param0, uo.field_a, param3, ji.field_c)) {
                        if (var5 == 0) {
                          L3: {
                            if (ef.field_b != 0) {
                              break L3;
                            } else {
                              if (db.field_R != 0) {
                                L4: {
                                  ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                                  var9 = qf.field_a;
                                  var6 = var9;
                                  if (var9 != null) {
                                    L5: {
                                      if (var9.field_n instanceof s) {
                                        ((s) (Object) var9.field_n).a(-92, var9, (ne) null);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    qf.field_a = null;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  if (var5 == 0) {
                                    break L3;
                                  } else {
                                    if (0 == nm.field_c) {
                                      break L3;
                                    } else {
                                      ((ng) this).h(2);
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          L6: {
                            db.field_R = ef.field_b;
                            if (param2 == 99) {
                              break L6;
                            } else {
                              ((ng) this).field_E = -110;
                              break L6;
                            }
                          }
                          ij.a(-5516, ((ng) this).b((byte) 37));
                          return param1;
                        } else {
                          L7: {
                            ((ng) this).h(2);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              param1 = false;
                              break L7;
                            }
                          }
                          L8: {
                            if (ef.field_b != 0) {
                              break L8;
                            } else {
                              if (db.field_R != 0) {
                                L9: {
                                  ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                                  var10 = qf.field_a;
                                  if (var10 != null) {
                                    L10: {
                                      if (var10.field_n instanceof s) {
                                        ((s) (Object) var10.field_n).a(-92, var10, (ne) null);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    qf.field_a = null;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                if (var7 == 0) {
                                  break L8;
                                } else {
                                  if (0 == nm.field_c) {
                                    break L8;
                                  } else {
                                    ((ng) this).h(2);
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          L11: {
                            db.field_R = ef.field_b;
                            if (param2 == 99) {
                              break L11;
                            } else {
                              ((ng) this).field_E = -110;
                              break L11;
                            }
                          }
                          ij.a(-5516, ((ng) this).b((byte) 37));
                          return param1;
                        }
                      } else {
                        L12: {
                          param1 = false;
                          if (ef.field_b != 0) {
                            break L12;
                          } else {
                            if (db.field_R != 0) {
                              L13: {
                                ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                                var8 = qf.field_a;
                                var6 = var8;
                                if (var8 != null) {
                                  L14: {
                                    if (var8.field_n instanceof s) {
                                      ((s) (Object) var8.field_n).a(-92, var8, (ne) null);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  qf.field_a = null;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (var7 == 0) {
                                break L12;
                              } else {
                                if (var5 == 0) {
                                  break L12;
                                } else {
                                  if (0 == nm.field_c) {
                                    break L12;
                                  } else {
                                    ((ng) this).h(2);
                                    break L12;
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        L15: {
                          db.field_R = ef.field_b;
                          if (param2 == 99) {
                            break L15;
                          } else {
                            ((ng) this).field_E = -110;
                            break L15;
                          }
                        }
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      }
                    } else {
                      L16: {
                        if (ef.field_b != 0) {
                          break L16;
                        } else {
                          if (db.field_R != 0) {
                            L17: {
                              ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                              var10 = qf.field_a;
                              if (var10 != null) {
                                L18: {
                                  if (var10.field_n instanceof s) {
                                    ((s) (Object) var10.field_n).a(-92, var10, (ne) null);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                qf.field_a = null;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (0 == nm.field_c) {
                                  break L16;
                                } else {
                                  ((ng) this).h(2);
                                  break L16;
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L19: {
                        db.field_R = ef.field_b;
                        if (param2 == 99) {
                          break L19;
                        } else {
                          ((ng) this).field_E = -110;
                          break L19;
                        }
                      }
                      ij.a(-5516, ((ng) this).b((byte) 37));
                      return param1;
                    }
                  }
                }
              }
              if (0 != nm.field_c) {
                if (((ng) this).a((byte) -58, (ng) this, nm.field_c, param0, uo.field_a, param3, ji.field_c)) {
                  param1 = false;
                  if (ef.field_b != 0) {
                    break L0;
                  } else {
                    if (db.field_R != 0) {
                      L20: {
                        ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                        var15 = qf.field_a;
                        if (var15 != null) {
                          L21: {
                            if (var15.field_n instanceof s) {
                              ((s) (Object) var15.field_n).a(-92, var15, (ne) null);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          qf.field_a = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      db.field_R = ef.field_b;
                      if (param2 == 99) {
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      } else {
                        ((ng) this).field_E = -110;
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      }
                    }
                  }
                } else {
                  if (var5 != 0) {
                    ((ng) this).h(2);
                    if (var7 != 0) {
                      L22: {
                        param1 = false;
                        if (ef.field_b != 0) {
                          break L22;
                        } else {
                          if (db.field_R != 0) {
                            L23: {
                              ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                              var14 = qf.field_a;
                              var6 = var14;
                              if (var14 != null) {
                                L24: {
                                  if (var14.field_n instanceof s) {
                                    ((s) (Object) var14.field_n).a(-92, var14, (ne) null);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                qf.field_a = null;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            if (var7 == 0) {
                              break L22;
                            } else {
                              if (var5 == 0) {
                                break L22;
                              } else {
                                if (0 == nm.field_c) {
                                  break L22;
                                } else {
                                  ((ng) this).h(2);
                                  db.field_R = ef.field_b;
                                  if (param2 == 99) {
                                    ij.a(-5516, ((ng) this).b((byte) 37));
                                    return param1;
                                  } else {
                                    ((ng) this).field_E = -110;
                                    ij.a(-5516, ((ng) this).b((byte) 37));
                                    return param1;
                                  }
                                }
                              }
                            }
                          } else {
                            L25: {
                              db.field_R = ef.field_b;
                              if (param2 == 99) {
                                break L25;
                              } else {
                                ((ng) this).field_E = -110;
                                break L25;
                              }
                            }
                            ij.a(-5516, ((ng) this).b((byte) 37));
                            return param1;
                          }
                        }
                      }
                      db.field_R = ef.field_b;
                      if (param2 == 99) {
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      } else {
                        ((ng) this).field_E = -110;
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      }
                    } else {
                      L26: {
                        if (ef.field_b != 0) {
                          break L26;
                        } else {
                          if (db.field_R != 0) {
                            L27: {
                              ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                              var13 = qf.field_a;
                              var6 = var13;
                              if (var13 != null) {
                                L28: {
                                  if (var13.field_n instanceof s) {
                                    ((s) (Object) var13.field_n).a(-92, var13, (ne) null);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                qf.field_a = null;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            if (var7 == 0) {
                              break L26;
                            } else {
                              if (var5 == 0) {
                                break L26;
                              } else {
                                if (0 == nm.field_c) {
                                  break L26;
                                } else {
                                  ((ng) this).h(2);
                                  db.field_R = ef.field_b;
                                  if (param2 != 99) {
                                    ((ng) this).field_E = -110;
                                    ij.a(-5516, ((ng) this).b((byte) 37));
                                    return param1;
                                  } else {
                                    ij.a(-5516, ((ng) this).b((byte) 37));
                                    return param1;
                                  }
                                }
                              }
                            }
                          } else {
                            db.field_R = ef.field_b;
                            if (param2 != 99) {
                              ((ng) this).field_E = -110;
                              ij.a(-5516, ((ng) this).b((byte) 37));
                              return param1;
                            } else {
                              ij.a(-5516, ((ng) this).b((byte) 37));
                              return param1;
                            }
                          }
                        }
                      }
                      db.field_R = ef.field_b;
                      if (param2 != 99) {
                        ((ng) this).field_E = -110;
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      } else {
                        ij.a(-5516, ((ng) this).b((byte) 37));
                        return param1;
                      }
                    }
                  } else {
                    L29: {
                      if (ef.field_b != 0) {
                        break L29;
                      } else {
                        if (db.field_R != 0) {
                          L30: {
                            ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                            var12 = qf.field_a;
                            if (var12 != null) {
                              L31: {
                                if (var12.field_n instanceof s) {
                                  ((s) (Object) var12.field_n).a(-92, var12, (ne) null);
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              qf.field_a = null;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (var7 == 0) {
                            break L29;
                          } else {
                            if (var5 == 0) {
                              break L29;
                            } else {
                              if (0 == nm.field_c) {
                                break L29;
                              } else {
                                ((ng) this).h(2);
                                db.field_R = ef.field_b;
                                if (param2 != 99) {
                                  ((ng) this).field_E = -110;
                                  ij.a(-5516, ((ng) this).b((byte) 37));
                                  return param1;
                                } else {
                                  ij.a(-5516, ((ng) this).b((byte) 37));
                                  return param1;
                                }
                              }
                            }
                          }
                        } else {
                          db.field_R = ef.field_b;
                          if (param2 != 99) {
                            ((ng) this).field_E = -110;
                            ij.a(-5516, ((ng) this).b((byte) 37));
                            return param1;
                          } else {
                            ij.a(-5516, ((ng) this).b((byte) 37));
                            return param1;
                          }
                        }
                      }
                    }
                    db.field_R = ef.field_b;
                    if (param2 != 99) {
                      ((ng) this).field_E = -110;
                      ij.a(-5516, ((ng) this).b((byte) 37));
                      return param1;
                    } else {
                      ij.a(-5516, ((ng) this).b((byte) 37));
                      return param1;
                    }
                  }
                }
              } else {
                L32: {
                  if (ef.field_b != 0) {
                    break L32;
                  } else {
                    if (db.field_R != 0) {
                      L33: {
                        ((ng) this).a(bg.field_k, param3, (ng) this, param2 + -99, param0, uf.field_d);
                        var11 = qf.field_a;
                        var6 = var11;
                        if (var11 != null) {
                          L34: {
                            if (var11.field_n instanceof s) {
                              ((s) (Object) var11.field_n).a(-92, var11, (ne) null);
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          qf.field_a = null;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      if (var7 == 0) {
                        break L32;
                      } else {
                        if (var5 == 0) {
                          break L32;
                        } else {
                          if (0 == nm.field_c) {
                            break L32;
                          } else {
                            ((ng) this).h(2);
                            break L32;
                          }
                        }
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                db.field_R = ef.field_b;
                if (param2 != 99) {
                  ((ng) this).field_E = -110;
                  ij.a(-5516, ((ng) this).b((byte) 37));
                  return param1;
                } else {
                  ij.a(-5516, ((ng) this).b((byte) 37));
                  return param1;
                }
              }
            }
          }
          if (var5 == 0) {
            break L0;
          } else {
            if (0 == nm.field_c) {
              break L0;
            } else {
              ((ng) this).h(2);
              db.field_R = ef.field_b;
              if (param2 == 99) {
                ij.a(-5516, ((ng) this).b((byte) 37));
                return param1;
              } else {
                ((ng) this).field_E = -110;
                ij.a(-5516, ((ng) this).b((byte) 37));
                return param1;
              }
            }
          }
        }
        db.field_R = ef.field_b;
        if (param2 == 99) {
          ij.a(-5516, ((ng) this).b((byte) 37));
          return param1;
        } else {
          ((ng) this).field_E = -110;
          ij.a(-5516, ((ng) this).b((byte) 37));
          return param1;
        }
    }

    ng(String param0, fn param1) {
        this(param0, h.field_X.field_a, param1);
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var6 = 0;
        StringBuilder var9 = null;
        StringBuilder var10 = null;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          StringBuilder discarded$21 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ng) this).field_z).append(",").append(((ng) this).field_p).append(" ").append(((ng) this).field_E).append("x").append(((ng) this).field_C);
          if (((ng) this).field_q != null) {
            StringBuilder discarded$22 = param3.append(" text=\"").append(((ng) this).field_q).append(34);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -2) {
          if (!((ng) this).field_D) {
            L1: {
              if (((ng) this).b(true)) {
                StringBuilder discarded$23 = param3.append(" focused");
                break L1;
              } else {
                break L1;
              }
            }
            if (((ng) this).field_y != null) {
              StringBuilder discarded$24 = param3.append(" renderer=");
              if (((ng) this).field_y instanceof ng) {
                L2: {
                  var9 = ((ng) this).a(param3, false, param0 - -1, param2);
                  if (null == ((ng) this).field_n) {
                    break L2;
                  } else {
                    StringBuilder discarded$25 = var9.append(" listener=");
                    if (((ng) this).field_n instanceof ng) {
                      param3 = ((ng) this).a(var9, false, param0 + 1, param2);
                      break L2;
                    } else {
                      StringBuilder discarded$26 = var9.append(((ng) this).field_n);
                      param3 = ((ng) this).a(var9, false, param0 + 1, param2);
                      break L2;
                    }
                  }
                }
                return;
              } else {
                StringBuilder discarded$27 = param3.append(((ng) this).field_y);
                if (var6 == 0) {
                  if (null != ((ng) this).field_n) {
                    StringBuilder discarded$28 = param3.append(" listener=");
                    if (!(((ng) this).field_n instanceof ng)) {
                      StringBuilder discarded$29 = param3.append(((ng) this).field_n);
                      if (var6 != 0) {
                        param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    var10 = ((ng) this).a(param3, false, param0 - -1, param2);
                    if (null == ((ng) this).field_n) {
                      break L3;
                    } else {
                      StringBuilder discarded$30 = var10.append(" listener=");
                      if (((ng) this).field_n instanceof ng) {
                        param3 = ((ng) this).a(var10, false, param0 + 1, param2);
                        break L3;
                      } else {
                        StringBuilder discarded$31 = var10.append(((ng) this).field_n);
                        param3 = ((ng) this).a(var10, false, param0 + 1, param2);
                        break L3;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L4: {
                if (null == ((ng) this).field_n) {
                  break L4;
                } else {
                  StringBuilder discarded$32 = param3.append(" listener=");
                  if (((ng) this).field_n instanceof ng) {
                    param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                    break L4;
                  } else {
                    StringBuilder discarded$33 = param3.append(((ng) this).field_n);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                      break L4;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L5: {
              StringBuilder discarded$34 = param3.append(" mouseover");
              if (((ng) this).b(true)) {
                StringBuilder discarded$35 = param3.append(" focused");
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((ng) this).field_y != null) {
                StringBuilder discarded$36 = param3.append(" renderer=");
                if (((ng) this).field_y instanceof ng) {
                  param3 = ((ng) this).a(param3, false, param0 - -1, param2);
                  break L6;
                } else {
                  StringBuilder discarded$37 = param3.append(((ng) this).field_y);
                  if (var6 != 0) {
                    param3 = ((ng) this).a(param3, false, param0 - -1, param2);
                    break L6;
                  } else {
                    L7: {
                      if (null == ((ng) this).field_n) {
                        break L7;
                      } else {
                        StringBuilder discarded$38 = param3.append(" listener=");
                        if (((ng) this).field_n instanceof ng) {
                          param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                          break L7;
                        } else {
                          StringBuilder discarded$39 = param3.append(((ng) this).field_n);
                          if (var6 == 0) {
                            break L7;
                          } else {
                            param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                            break L7;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                break L6;
              }
            }
            if (null == ((ng) this).field_n) {
              return;
            } else {
              L8: {
                StringBuilder discarded$40 = param3.append(" listener=");
                if (((ng) this).field_n instanceof ng) {
                  param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                  break L8;
                } else {
                  StringBuilder discarded$41 = param3.append(((ng) this).field_n);
                  if (var6 == 0) {
                    break L8;
                  } else {
                    param3 = ((ng) this).a(param3, false, param0 + 1, param2);
                    break L8;
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        if (param1 < 61) {
            String discarded$0 = ((ng) this).toString();
            return false;
        }
        return false;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        L0: {
          var2 = we.b(nh.a(param0, -29667), -7067);
          if (var2 == null) {
            var2 = "";
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -1) {
          ng.i(-36);
          return var2;
        } else {
          return var2;
        }
    }

    StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        L0: {
          if (((ng) this).a(-59, param2, param0, param3)) {
            ((ng) this).a(param2, (byte) -2, param3, param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          field_o = null;
          return param0;
        } else {
          return param0;
        }
    }

    void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        ((ng) this).field_k = param3;
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        ((ng) this).field_E = param0;
        ((ng) this).field_z = param3;
        ((ng) this).field_C = param4;
        if (param1 <= 19) {
          ng.g(-105);
          ((ng) this).field_p = param2;
          return;
        } else {
          ((ng) this).field_p = param2;
          return;
        }
    }

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param0 < -34) {
          if (!param3.containsKey(this)) {
            Object discarded$4 = param3.put(this, this);
            return true;
          } else {
            StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 >= 55) {
          if (param4 >= param1 - -((ng) this).field_z) {
            if (((ng) this).field_p + param2 > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ng) this).field_E + param1 + ((ng) this).field_z <= param4) {
                    break L1;
                  } else {
                    if (param3 >= ((ng) this).field_C + (((ng) this).field_p + param2)) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((ng) this).field_y = null;
          if (param4 >= param1 - -((ng) this).field_z) {
            if (((ng) this).field_p + param2 <= param3) {
              if (((ng) this).field_E + param1 + ((ng) this).field_z > param4) {
                if (param3 >= ((ng) this).field_C + (((ng) this).field_p + param2)) {
                  return false;
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
            return false;
          }
        }
    }

    protected ng() {
        ((ng) this).field_B = 0;
        ((ng) this).field_x = 0;
    }

    ng(String param0, eb param1, fn param2) {
        af var4 = null;
        ((ng) this).field_B = 0;
        ((ng) this).field_x = 0;
        ((ng) this).field_y = param1;
        ((ng) this).field_n = param2;
        ((ng) this).field_q = param0;
        if (((ng) this).field_y instanceof af) {
            var4 = (af) (Object) ((ng) this).field_y;
            ((ng) this).field_E = var4.a(14871, (ng) this);
            ((ng) this).field_C = var4.a((ng) this, 4592);
        }
    }

    ng(int param0, int param1, int param2, int param3, eb param4, fn param5) {
        ((ng) this).field_B = 0;
        ((ng) this).field_x = 0;
        ((ng) this).field_y = param4;
        ((ng) this).field_E = param2;
        ((ng) this).field_z = param0;
        ((ng) this).field_C = param3;
        ((ng) this).field_p = param1;
        ((ng) this).field_n = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0.07;
        field_t = "you";
        field_v = "Please enter your date of birth to enable chat:";
        field_m = new int[]{2, 20, 21, 27, 6, 5, 13};
        field_w = "EXCLUSIVE";
    }
}
