/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk {
    static ba field_n;
    static cc field_c;
    ak field_b;
    static boolean field_e;
    ak field_a;
    static String field_p;
    ak field_d;
    ak field_g;
    ed field_f;
    int field_o;
    long field_k;
    volatile int field_j;
    byte field_l;
    ed field_i;
    volatile int field_m;
    ia field_h;

    final static int c(int param0) {
        if (param0 != 1) {
            field_e = false;
            return 1;
        }
        return 1;
    }

    abstract void a(Object param0, boolean param1, int param2);

    final static void a(int param0, int param1, int param2, double param3, double param4) {
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (ir.field_d == 0) {
          if (-1 > param2) {
            s.field_t = new nj();
            if (param0 == -1) {
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E) {
                if (-1 < param1) {
                  nj discarded$9 = new nj();
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  if (-1 != (param1 ^ -1)) {
                    bq.field_E = param1;
                    wo.field_S = param4;
                    return;
                  } else {
                    bq.field_E = param1;
                    wo.field_S = param4;
                    return;
                  }
                }
              } else {
                if (-1 != param1) {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              }
            } else {
              field_p = null;
              ir.field_d = param2;
              il.field_e = param3;
              if (0 == bq.field_E) {
                if (-1 < param1) {
                  nj discarded$10 = new nj();
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  if (-1 != (param1 ^ -1)) {
                    bq.field_E = param1;
                    wo.field_S = param4;
                    return;
                  } else {
                    bq.field_E = param1;
                    wo.field_S = param4;
                    return;
                  }
                }
              } else {
                if (-1 != param1) {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              }
            }
          } else {
            if (-1 != param2) {
              if (param0 == -1) {
                L0: {
                  ir.field_d = param2;
                  il.field_e = param3;
                  if (0 != bq.field_E) {
                    break L0;
                  } else {
                    if (-1 <= param1) {
                      break L0;
                    } else {
                      nj discarded$11 = new nj();
                      bq.field_E = param1;
                      wo.field_S = param4;
                      return;
                    }
                  }
                }
                if (-1 != param1) {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              } else {
                L1: {
                  field_p = null;
                  ir.field_d = param2;
                  il.field_e = param3;
                  if (0 != bq.field_E) {
                    break L1;
                  } else {
                    if (-1 <= param1) {
                      break L1;
                    } else {
                      nj discarded$12 = new nj();
                      bq.field_E = param1;
                      wo.field_S = param4;
                      return;
                    }
                  }
                }
                if (-1 != param1) {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              }
            } else {
              s.field_t = null;
              if (param0 == -1) {
                L2: {
                  ir.field_d = param2;
                  il.field_e = param3;
                  if (0 != bq.field_E) {
                    break L2;
                  } else {
                    if (-1 <= param1) {
                      break L2;
                    } else {
                      nj discarded$13 = new nj();
                      bq.field_E = param1;
                      wo.field_S = param4;
                      return;
                    }
                  }
                }
                if (-1 == param1) {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                } else {
                  bq.field_E = param1;
                  wo.field_S = param4;
                  return;
                }
              } else {
                L3: {
                  L4: {
                    field_p = null;
                    ir.field_d = param2;
                    il.field_e = param3;
                    if (0 != bq.field_E) {
                      break L4;
                    } else {
                      if (-1 <= param1) {
                        break L4;
                      } else {
                        nj discarded$14 = new nj();
                        break L3;
                      }
                    }
                  }
                  if (-1 != param1) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              }
            }
          }
        } else {
          if (-1 != (param2 ^ -1)) {
            if (param0 == -1) {
              L5: {
                ir.field_d = param2;
                il.field_e = param3;
                if (0 != bq.field_E) {
                  break L5;
                } else {
                  if (-1 <= param1) {
                    break L5;
                  } else {
                    nj discarded$15 = new nj();
                    bq.field_E = param1;
                    wo.field_S = param4;
                    return;
                  }
                }
              }
              if (-1 == param1) {
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              } else {
                bq.field_E = param1;
                wo.field_S = param4;
                return;
              }
            } else {
              L6: {
                L7: {
                  field_p = null;
                  ir.field_d = param2;
                  il.field_e = param3;
                  if (0 != bq.field_E) {
                    break L7;
                  } else {
                    if (-1 <= param1) {
                      break L7;
                    } else {
                      nj discarded$16 = new nj();
                      break L6;
                    }
                  }
                }
                if (-1 != param1) {
                  break L6;
                } else {
                  break L6;
                }
              }
              bq.field_E = param1;
              wo.field_S = param4;
              return;
            }
          } else {
            L8: {
              s.field_t = null;
              if (param0 == -1) {
                break L8;
              } else {
                field_p = null;
                break L8;
              }
            }
            L9: {
              L10: {
                ir.field_d = param2;
                il.field_e = param3;
                if (0 != bq.field_E) {
                  break L10;
                } else {
                  if (-1 <= param1) {
                    break L10;
                  } else {
                    nj discarded$17 = new nj();
                    break L9;
                  }
                }
              }
              if (-1 != param1) {
                break L9;
              } else {
                break L9;
              }
            }
            bq.field_E = param1;
            wo.field_S = param4;
            return;
          }
        }
    }

    final static boolean c(byte param0) {
        if (param0 < -28) {
          if (hn.field_w >= 10) {
            if (-14 < (qc.field_A ^ -1)) {
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
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= 46) {
            field_n = null;
            field_p = null;
            field_c = null;
            return;
        }
        field_p = null;
        field_c = null;
    }

    final static byte[] a(String param0, boolean param1) {
        if (param1) {
            field_p = null;
            return re.field_a.a("", param0, 0);
        }
        return re.field_a.a("", param0, 0);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final ia a(int param0, int param1, boolean param2, byte param3, boolean param4) {
        long var6 = 0L;
        ia var8 = null;
        ia stackIn_2_0 = null;
        ia stackIn_3_0 = null;
        ia stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ia stackIn_15_0 = null;
        ia stackIn_16_0 = null;
        ia stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ia stackOut_14_0 = null;
        ia stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ia stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ia stackOut_1_0 = null;
        ia stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ia stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param4) {
          L0: {
            var6 = ((long)param1 << 7817440) + (long)param0;
            var8 = new ia();
            var8.field_B = param3;
            var8.field_n = var6;
            stackOut_14_0 = (ia) var8;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param2) {
              stackOut_16_0 = (ia) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (ia) (Object) stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          stackIn_17_0.field_u = stackIn_17_1 != 0;
          if (!param2) {
            if (-21 <= ((tk) this).b(-1)) {
              throw new RuntimeException();
            } else {
              ((tk) this).field_d.a(param4, (gp) (Object) var8);
              return var8;
            }
          } else {
            if (((tk) this).d((byte) -70) <= -21) {
              throw new RuntimeException();
            } else {
              ((tk) this).field_b.a(false, (gp) (Object) var8);
              return var8;
            }
          }
        } else {
          L1: {
            field_c = null;
            var6 = ((long)param1 << 7817440) + (long)param0;
            var8 = new ia();
            var8.field_B = param3;
            var8.field_n = var6;
            stackOut_1_0 = (ia) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param2) {
              stackOut_3_0 = (ia) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ia) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_u = stackIn_4_1 != 0;
          if (!param2) {
            if (-21 <= ((tk) this).b(-1)) {
              throw new RuntimeException();
            } else {
              ((tk) this).field_d.a(param4, (gp) (Object) var8);
              return var8;
            }
          } else {
            if (((tk) this).d((byte) -70) <= -21) {
              throw new RuntimeException();
            } else {
              ((tk) this).field_b.a(false, (gp) (Object) var8);
              return var8;
            }
          }
        }
    }

    abstract void e(int param0);

    abstract boolean d(int param0);

    final int b(int param0) {
        if (param0 != -1) {
            return -12;
        }
        return ((tk) this).field_d.a((byte) 82) + ((tk) this).field_g.a((byte) 89);
    }

    final int d(byte param0) {
        int var2 = -71 / ((-5 - param0) / 62);
        return ((tk) this).field_b.a((byte) 78) - -((tk) this).field_a.a((byte) 60);
    }

    abstract void b(byte param0);

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            tk.a((byte) 29);
            if (((tk) this).d((byte) -127) < 20) {
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
            if (((tk) this).d((byte) -127) < 20) {
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

    final boolean f(int param0) {
        if (param0 != 6) {
            return true;
        }
        return -21 >= (((tk) this).b(-1) ^ -1) ? true : false;
    }

    tk() {
        ((tk) this).field_b = new ak();
        ((tk) this).field_a = new ak();
        ((tk) this).field_d = new ak();
        ((tk) this).field_g = new ak();
        ((tk) this).field_f = new ed(6);
        ((tk) this).field_l = (byte) 0;
        ((tk) this).field_m = 0;
        ((tk) this).field_j = 0;
        ((tk) this).field_i = new ed(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new ba();
        field_p = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
