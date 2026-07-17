/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private int field_q;
    private int field_j;
    static int field_f;
    private int field_e;
    static int field_k;
    static int field_i;
    static int[] field_s;
    private int field_l;
    static int[][] field_d;
    private int field_g;
    static String field_a;
    static of field_c;
    private int field_n;
    private int field_r;
    private int field_o;
    private int field_b;
    static String field_m;
    static dd field_h;
    static int[] field_p;

    final boolean c(byte param0) {
        if (wn.field_i >= ((ci) this).field_j) {
          if (wn.field_i <= ((ci) this).field_l) {
            if (gg.field_f < ((ci) this).field_e) {
              if (param0 > -79) {
                field_k = 111;
                return false;
              } else {
                return false;
              }
            } else {
              if (((ci) this).field_q < gg.field_f) {
                if (param0 > -79) {
                  field_k = 111;
                  return false;
                } else {
                  return false;
                }
              } else {
                this.a(-wp.field_d, false);
                return true;
              }
            }
          } else {
            if (param0 > -79) {
              field_k = 111;
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param0 > -79) {
            field_k = 111;
            return false;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        sa.field_h.a(this.b((byte) 36) + ": " + Integer.toString(this.a(-195801560), 16), ((ci) this).field_r, ((ci) this).field_g, 15658734, -1);
        if (param0 != 3) {
          return;
        } else {
          qh.f(((ci) this).field_j, ((ci) this).field_e, 16, 80, 3381555);
          var2 = ((ci) this).field_q - (this.a(param0 ^ -195801557) + -((ci) this).field_b) * 80 / (((ci) this).field_o + -((ci) this).field_b);
          qh.d(((ci) this).field_j, var2, ((ci) this).field_l, var2, 16764006);
          return;
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var3 = ((ci) this).field_n;
        if (var3 == 0) {
          tl.field_K = param1 >> 8;
          return;
        } else {
          if (var3 != 1) {
            if (var3 != 2) {
              if (var3 != 3) {
                if (var3 == 4) {
                  dr.field_b = param1;
                  dr.field_f = aj.a(6429081, false, dr.field_b);
                  return;
                } else {
                  if (var3 == 5) {
                    l.field_e = param1;
                    l.field_g = aj.a(6429081, false, l.field_e);
                    return;
                  } else {
                    if (var3 == 6) {
                      bl.field_g = param1;
                      return;
                    } else {
                      if (var3 == 7) {
                        uh.field_q = param1;
                        uh.field_w = uh.field_q * 128 / 5;
                        return;
                      } else {
                        if (var3 == 8) {
                          wn.field_l = param1;
                          return;
                        } else {
                          if (var3 == 9) {
                            kj.field_f = param1;
                            return;
                          } else {
                            if (var3 == 10) {
                              pr.field_l = param1;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                kp.field_m = param1 >> 8;
                return;
              }
            } else {
              dj.field_g = param1 >> 8;
              return;
            }
          } else {
            ca.field_l = param1 >> 8;
            return;
          }
        }
    }

    final static void d(byte param0) {
        Object var2 = null;
        L0: {
          wd.field_Ub.k(-22216);
          if (of.field_Nb == null) {
            of.field_Nb = new wa(wd.field_Ub, oa.field_d);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -108) {
          var2 = null;
          ci.a((String) null, -115);
          wd.field_Ub.b((ei) (Object) of.field_Nb, 30000);
          return;
        } else {
          wd.field_Ub.b((ei) (Object) of.field_Nb, 30000);
          return;
        }
    }

    final static void a(String param0, int param1) {
        th.field_g = param0;
        if (param1 >= -126) {
            return;
        }
        try {
            lf.a(12, (byte) 102);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ci.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean b(int param0) {
        if (param0 == 59) {
          if (cd.field_b != 0) {
            if (wn.field_i >= ((ci) this).field_j) {
              if (wn.field_i <= ((ci) this).field_l) {
                if (gg.field_f >= ((ci) this).field_e) {
                  if (((ci) this).field_q < gg.field_f) {
                    return false;
                  } else {
                    this.a(true, ((ci) this).field_b - -((-((ci) this).field_b + ((ci) this).field_o) * (-gg.field_f + ((ci) this).field_q) / 80));
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
          } else {
            return false;
          }
        } else {
          String discarded$1 = this.b((byte) 118);
          if (cd.field_b != 0) {
            if (wn.field_i >= ((ci) this).field_j) {
              if (wn.field_i <= ((ci) this).field_l) {
                if (gg.field_f >= ((ci) this).field_e) {
                  if (((ci) this).field_q < gg.field_f) {
                    return false;
                  } else {
                    this.a(true, ((ci) this).field_b - -((-((ci) this).field_b + ((ci) this).field_o) * (-gg.field_f + ((ci) this).field_q) / 80));
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
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, nm param2, int param3, int param4, nm param5) {
        RuntimeException var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          oc.field_B = param4;
          uk.field_d = param2;
          rm.field_e = param5;
          bj.field_m = param0;
          qi.field_g = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ci.H(").append(param0).append(44).append(26790).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((ci) this).field_o = param0;
        ((ci) this).field_b = param1;
        ((ci) this).field_n = param2;
        int var5 = sa.field_h.field_C + (18 + sa.field_h.field_w);
        ((ci) this).field_g = 472;
        ((ci) this).field_r = var5 * ((ci) this).field_n + sa.field_h.field_C;
        ((ci) this).field_j = sa.field_h.field_w + (((ci) this).field_r - -2);
        ((ci) this).field_l = ((ci) this).field_j - -16;
        ((ci) this).field_e = 392;
        ((ci) this).field_q = 80 + ((ci) this).field_e;
    }

    private final int a(int param0) {
        int var2 = 0;
        if (param0 == -195801560) {
          var2 = ((ci) this).field_n;
          if (0 != var2) {
            if (var2 != 1) {
              if (var2 == 2) {
                return dj.field_g << 8;
              } else {
                if (var2 != 3) {
                  if (var2 == 4) {
                    return dr.field_b;
                  } else {
                    if (5 != var2) {
                      if (var2 != 6) {
                        if (7 == var2) {
                          return uh.field_q;
                        } else {
                          if (var2 != 8) {
                            if (var2 != 9) {
                              if (var2 != 10) {
                                return -1;
                              } else {
                                return pr.field_l;
                              }
                            } else {
                              return kj.field_f;
                            }
                          } else {
                            return wn.field_l;
                          }
                        }
                      } else {
                        return bl.field_g;
                      }
                    } else {
                      return l.field_e;
                    }
                  }
                } else {
                  return kp.field_m << 8;
                }
              }
            } else {
              return ca.field_l << 8;
            }
          } else {
            return tl.field_K << 8;
          }
        } else {
          return 37;
        }
    }

    public static void a() {
        field_a = null;
        field_s = null;
        field_p = null;
        field_h = null;
        field_m = null;
        field_c = null;
        field_d = null;
    }

    ci(float param0, float param1, int param2) {
        int discarded$0 = -4;
        int discarded$1 = -4;
        int discarded$2 = -6;
        this.a(em.a(param1), em.a(param0), param2);
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        Object var4 = null;
        var3 = ((ci) this).field_n;
        if (var3 != 0) {
          if (var3 != 1) {
            if (var3 != 2) {
              if (3 == var3) {
                this.a(true, param0 * 256 + this.a(-195801560));
                var4 = null;
                ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
                return;
              } else {
                this.a(true, param0 + this.a(-195801560));
                var4 = null;
                ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
                return;
              }
            } else {
              this.a(true, param0 * 256 + this.a(-195801560));
              var4 = null;
              ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
              return;
            }
          } else {
            this.a(true, param0 * 256 + this.a(-195801560));
            var4 = null;
            ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
            return;
          }
        } else {
          this.a(true, param0 * 256 + this.a(-195801560));
          var4 = null;
          ci.a(-37, 7, (nm) null, 78, 67, (nm) null);
          return;
        }
    }

    private final String b(byte param0) {
        int var2 = 0;
        if (param0 == 36) {
          var2 = ((ci) this).field_n;
          if (var2 == 0) {
            return "Ball-ball";
          } else {
            if (1 == var2) {
              return "Ball-ball ang";
            } else {
              if (2 == var2) {
                return "Ball-cush";
              } else {
                if (var2 != 3) {
                  if (var2 != 4) {
                    if (var2 == 5) {
                      return "Roll coef";
                    } else {
                      if (var2 != 6) {
                        if (var2 == 7) {
                          return "Ball mass";
                        } else {
                          if (var2 != 8) {
                            if (9 != var2) {
                              if (var2 == 10) {
                                return "Side spin";
                              } else {
                                return "Banana in disk drive error.";
                              }
                            } else {
                              return "Cue force";
                            }
                          } else {
                            return "Z spin fric";
                          }
                        }
                      } else {
                        return "Overspin";
                      }
                    }
                  } else {
                    return "Slid Coef";
                  }
                } else {
                  return "Ball-cush ang";
                }
              }
            }
          }
        } else {
          int discarded$1 = this.a(11);
          var2 = ((ci) this).field_n;
          if (var2 == 0) {
            return "Ball-ball";
          } else {
            if (1 == var2) {
              return "Ball-ball ang";
            } else {
              if (2 == var2) {
                return "Ball-cush";
              } else {
                if (var2 != 3) {
                  if (var2 != 4) {
                    if (var2 == 5) {
                      return "Roll coef";
                    } else {
                      if (var2 != 6) {
                        if (var2 == 7) {
                          return "Ball mass";
                        } else {
                          if (var2 != 8) {
                            if (9 != var2) {
                              if (var2 == 10) {
                                return "Side spin";
                              } else {
                                return "Banana in disk drive error.";
                              }
                            } else {
                              return "Cue force";
                            }
                          } else {
                            return "Z spin fric";
                          }
                        }
                      } else {
                        return "Overspin";
                      }
                    }
                  } else {
                    return "Slid Coef";
                  }
                } else {
                  return "Ball-cush ang";
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[]{8, 8};
        field_f = 0;
        field_i = -1;
        field_a = "Your ignore list is full. Max of 100 hit.";
        field_m = "If you are not, please change your password to something more obscure!";
        field_h = new dd(270, 70);
    }
}
