/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca extends kd {
    ca field_l;
    ca field_m;
    static boolean field_k;
    long field_j;
    static ng field_n;
    static long field_h;
    static String field_o;
    static ki field_i;

    final static void c(boolean param0) {
        af.a(-56);
        if (!param0) {
          if (null == ug.field_y) {
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          } else {
            jd.a(ug.field_y, 160);
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          }
        } else {
          field_i = null;
          if (null != ug.field_y) {
            jd.a(ug.field_y, 160);
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (!el.a(1)) {
              ck.b((byte) -60);
              return;
            } else {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            }
          } else {
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 81) {
          L0: {
            field_n = null;
            if (ee.field_c != field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ee.field_c != field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(ab param0, int param1, java.awt.Frame param2) {
        ei var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(param1 + -15232, param2);
          L1: while (true) {
            if (0 != var3.field_b) {
              if (1 == var3.field_b) {
                if (param1 != 15232) {
                  var5 = null;
                  ca.a(23, (int[]) null, (bd) null);
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                } else {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                }
              } else {
                ge.a(0, 100L);
                continue L0;
              }
            } else {
              ge.a(0, 10L);
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = -106 % ((42 - param0) / 35);
        field_i = null;
        field_o = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          field_o = null;
          ja.b((byte) -128);
          lf.f(param2, param1, param0, param3);
          return;
        } else {
          ja.b((byte) -128);
          lf.f(param2, param1, param0, param3);
          return;
        }
    }

    final void b(int param0) {
        if (((ca) this).field_m != null) {
          ((ca) this).field_m.field_l = ((ca) this).field_l;
          ((ca) this).field_l.field_m = ((ca) this).field_m;
          ((ca) this).field_l = null;
          if (param0 != 12) {
            field_o = null;
            ((ca) this).field_m = null;
            return;
          } else {
            ((ca) this).field_m = null;
            return;
          }
        } else {
          return;
        }
    }

    protected ca() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        lj.field_b = null;
        re.field_X = null;
        gj.field_t = 0;
        var2 = rc.field_i;
        rc.field_i = jc.field_c;
        if (param1 == 51) {
          kb.field_b.field_j = 2;
          jc.field_c = var2;
          kb.field_b.field_p = kb.field_b.field_p + 1;
          if (param0 == -51) {
            if ((kb.field_b.field_p ^ -1) > -3) {
              if ((kb.field_b.field_p ^ -1) > -3) {
                if (-5 < (kb.field_b.field_p ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == -51) {
                  return 5;
                } else {
                  if (-5 > kb.field_b.field_p) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if ((param1 ^ -1) == -52) {
                return 2;
              } else {
                if (kb.field_b.field_p <= -3) {
                  if (param1 == -51) {
                    return 5;
                  } else {
                    if (-5 > kb.field_b.field_p) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (-5 > kb.field_b.field_p) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            field_o = null;
            if ((kb.field_b.field_p ^ -1) > -3) {
              if ((kb.field_b.field_p ^ -1) > -3) {
                if (-5 < (kb.field_b.field_p ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == -51) {
                  return 5;
                } else {
                  if (-5 > kb.field_b.field_p) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if ((param1 ^ -1) == -52) {
                return 2;
              } else {
                if (kb.field_b.field_p <= -3) {
                  if (param1 == -51) {
                    return 5;
                  } else {
                    if (-5 > kb.field_b.field_p) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (-5 > kb.field_b.field_p) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          if (50 == param1) {
            kb.field_b.field_j = 5;
            jc.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (param0 == -51) {
              if ((kb.field_b.field_p ^ -1) > -3) {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if (-5 < (kb.field_b.field_p ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param1 == -51) {
                    return 5;
                  } else {
                    if (-5 > kb.field_b.field_p) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (param1 == -51) {
                      return 5;
                    } else {
                      if (-5 > kb.field_b.field_p) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
            } else {
              field_o = null;
              if ((kb.field_b.field_p ^ -1) > -3) {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if (-5 < (kb.field_b.field_p ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param1 != -51) {
                    if (-5 > kb.field_b.field_p) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if ((param1 ^ -1) != -52) {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (param1 != -51) {
                      if (-5 > kb.field_b.field_p) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              }
            }
          } else {
            kb.field_b.field_j = 1;
            jc.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (param0 != -51) {
              field_o = null;
              if ((kb.field_b.field_p ^ -1) <= -3) {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 >= (kb.field_b.field_p ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (param1 != -51) {
                      if (-5 <= kb.field_b.field_p) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                }
              } else {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if (-5 >= (kb.field_b.field_p ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (param1 != -51) {
                    if (-5 <= kb.field_b.field_p) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            } else {
              L0: {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  break L0;
                } else {
                  if ((param1 ^ -1) == -52) {
                    return 2;
                  } else {
                    break L0;
                  }
                }
              }
              L1: {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  break L1;
                } else {
                  if (param1 == -51) {
                    return 5;
                  } else {
                    break L1;
                  }
                }
              }
              if (-5 <= kb.field_b.field_p) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final static void a(int param0, int[] param1, bd param2) {
        int var3 = param2.field_h;
        param1[3] = var3 % 18 + 1;
        var3 = var3 / 18;
        param1[2] = 1 + var3 % 12;
        var3 = var3 / param0;
        param1[1] = var3 % 12;
        param1[0] = var3 / 12;
        param1[1] = -param1[1] + 11;
    }

    final static boolean d(boolean param0) {
        if (!param0) {
            field_i = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20000000L;
        field_n = new ng();
        field_o = "Logging in...";
        field_i = new ki();
    }
}
