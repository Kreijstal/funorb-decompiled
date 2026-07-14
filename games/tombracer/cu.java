/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu extends nv {
    private int field_r;
    private kpa field_w;
    private int field_s;
    private int field_u;
    private kpa field_A;
    private boolean field_n;
    static String field_x;
    private int field_t;
    private int field_p;
    private int field_z;
    private int field_q;
    private int field_y;
    private int field_v;
    static int[] field_o;

    final kpa j(byte param0) {
        int var2 = -44 / ((-56 - param0) / 45);
        return ((cu) this).field_w;
    }

    private final fsa b(int param0) {
        int var2 = -100 / ((48 - param0) / 57);
        if (((cu) this).field_n) {
            return ((cu) this).field_g;
        }
        return ((cu) this).e(6);
    }

    private final void g(byte param0) {
        fsa var2 = null;
        if (param0 <= 54) {
          ((cu) this).field_q = 119;
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        } else {
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        }
    }

    private final int a(int param0, up param1) {
        int var3 = 0;
        var3 = param1.field_j;
        if (param0 > 71) {
          if (0 >= ((cu) this).field_s) {
            if (0 < ((cu) this).field_s) {
              if (!this.a((byte) -94, var3)) {
                return 0;
              } else {
                L0: {
                  ((cu) this).field_s = ((cu) this).field_s + param1.field_b;
                  if (((cu) this).field_s > ((cu) this).field_z) {
                    ((cu) this).field_s = ((cu) this).field_z;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return param1.field_b;
              }
            } else {
              return 0;
            }
          } else {
            if (this.a(var3, (byte) 10)) {
              ((cu) this).field_s = ((cu) this).field_s - param1.field_b;
              if ((((cu) this).field_s ^ -1) < -1) {
                if (((cu) this).field_v > 0) {
                  if (!this.b(-106).m((byte) -99)) {
                    ((cu) this).field_v = ((cu) this).field_v - param1.field_b;
                    if (0 < ((cu) this).field_v) {
                      return param1.field_b;
                    } else {
                      this.d(true);
                      return param1.field_b;
                    }
                  } else {
                    return param1.field_b;
                  }
                } else {
                  return param1.field_b;
                }
              } else {
                this.g((byte) 121);
                return param1.field_b;
              }
            } else {
              if (0 < ((cu) this).field_s) {
                if (!this.a((byte) -94, var3)) {
                  return 0;
                } else {
                  L1: {
                    ((cu) this).field_s = ((cu) this).field_s + param1.field_b;
                    if (((cu) this).field_s > ((cu) this).field_z) {
                      ((cu) this).field_s = ((cu) this).field_z;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return param1.field_b;
                }
              } else {
                return 0;
              }
            }
          }
        } else {
          return 13;
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1);
        var3 = 0;
        L0: while (true) {
          if (-7 >= (var3 ^ -1)) {
            ((cu) this).field_p = ((cu) this).field_y;
            ((cu) this).field_v = ((cu) this).field_r;
            ((cu) this).field_q = ((cu) this).field_u;
            ((cu) this).field_s = ((cu) this).field_z;
            return;
          } else {
            L1: {
              if (((cu) this).field_w.a(0, var3)) {
                break L1;
              } else {
                if (((cu) this).field_A.a(0, var3)) {
                  break L1;
                } else {
                  var3++;
                  var3++;
                  continue L0;
                }
              }
            }
            param1.a(26492, true, var3);
            var3++;
            var3++;
            continue L0;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -123;
        }
        return 24;
    }

    private final boolean a(int param0, byte param1) {
        if (param1 != 10) {
            ((cu) this).field_v = 0;
            return ((cu) this).field_w.a(0, param0);
        }
        return ((cu) this).field_w.a(0, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((cu) this).field_r = param0;
        ((cu) this).field_y = param1;
        if (param2 < 29) {
            return;
        }
        ((cu) this).field_t = param3;
    }

    private final void d(boolean param0) {
        if (!param0) {
            return;
        }
        ((cu) this).field_v = ((cu) this).field_r;
        this.b(110).n(((cu) this).field_t, -127);
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7 = -96 / ((param4 - 62) / 52);
        return this.a(94, param2);
    }

    final static hja a(boolean param0, int param1, cn param2, int param3) {
        if (!jna.a(param0, param1, param3, param2)) {
            return null;
        }
        return sba.d((byte) 120);
    }

    final void k(int param0) {
        if (-1 > ((cu) this).field_p) {
          ((cu) this).field_p = ((cu) this).field_p - 1;
          if (-1 == ((cu) this).field_p) {
            ((cu) this).field_v = ((cu) this).field_v + 1;
            ((cu) this).field_p = ((cu) this).field_y;
            if (((cu) this).field_r < ((cu) this).field_v) {
              L0: {
                ((cu) this).field_v = ((cu) this).field_r;
                if (-1 <= ((cu) this).field_q) {
                  break L0;
                } else {
                  ((cu) this).field_q = ((cu) this).field_q - 1;
                  if (-1 != ((cu) this).field_q) {
                    break L0;
                  } else {
                    ((cu) this).field_s = ((cu) this).field_s + 1;
                    ((cu) this).field_q = ((cu) this).field_u;
                    if (((cu) this).field_s > ((cu) this).field_z) {
                      ((cu) this).field_s = ((cu) this).field_z;
                      break L0;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((cu) this).field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                ((cu) this).field_q = -100;
                return;
              }
            } else {
              L1: {
                if (-1 <= ((cu) this).field_q) {
                  break L1;
                } else {
                  ((cu) this).field_q = ((cu) this).field_q - 1;
                  if (-1 != ((cu) this).field_q) {
                    break L1;
                  } else {
                    ((cu) this).field_s = ((cu) this).field_s + 1;
                    ((cu) this).field_q = ((cu) this).field_u;
                    if (((cu) this).field_s > ((cu) this).field_z) {
                      ((cu) this).field_s = ((cu) this).field_z;
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((cu) this).field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                ((cu) this).field_q = -100;
                return;
              }
            }
          } else {
            if (-1 < ((cu) this).field_q) {
              ((cu) this).field_q = ((cu) this).field_q - 1;
              if (-1 == (((cu) this).field_q ^ -1)) {
                ((cu) this).field_s = ((cu) this).field_s + 1;
                ((cu) this).field_q = ((cu) this).field_u;
                if (((cu) this).field_s > ((cu) this).field_z) {
                  ((cu) this).field_s = ((cu) this).field_z;
                  if (param0 != 5418) {
                    ((cu) this).field_q = -100;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 != 5418) {
                    ((cu) this).field_q = -100;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                ((cu) this).field_q = -100;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 < ((cu) this).field_q) {
            ((cu) this).field_q = ((cu) this).field_q - 1;
            if (-1 == (((cu) this).field_q ^ -1)) {
              ((cu) this).field_s = ((cu) this).field_s + 1;
              ((cu) this).field_q = ((cu) this).field_u;
              if (((cu) this).field_s > ((cu) this).field_z) {
                ((cu) this).field_s = ((cu) this).field_z;
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 5418) {
                  ((cu) this).field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                ((cu) this).field_q = -100;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 5418) {
              ((cu) this).field_q = -100;
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, ep param1, up param2) {
        if (param0 != 25940) {
            ((cu) this).field_w = null;
            return this.a(76, param2);
        }
        return this.a(76, param2);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -127, !((cu) this).field_n ? 0 : 1, 1);
        param1.a((byte) -29, ((cu) this).field_r, 8);
        param1.a((byte) -127, ((cu) this).field_z, 8);
        param1.a((byte) -128, ((cu) this).field_u, 4);
        param1.a((byte) -126, ((cu) this).field_y, 4);
        param1.a((byte) 107, ((cu) this).field_t, 8);
        ((cu) this).field_w.a(param1, (byte) -120);
        ((cu) this).field_A.a(param1, (byte) -120);
    }

    cu(la param0, boolean param1) {
        super(param0, param1);
        ((cu) this).field_u = 0;
        ((cu) this).field_r = 25;
        ((cu) this).field_t = 25;
        ((cu) this).field_z = 50;
        ((cu) this).field_y = 10;
        ((cu) this).field_n = false;
        ((cu) this).field_w = new kpa(6);
        ((cu) this).field_w.a(3, -17075, true);
        ((cu) this).field_w.a(0, -17075, true);
        ((cu) this).field_A = new kpa(6);
    }

    public static void c(int param0) {
        field_x = null;
        field_o = null;
        if (param0 != -1) {
            field_x = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        Object var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -67) {
          L0: {
            stackOut_11_0 = er.c(param1, param2, 52);
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((param1 & 458752) == 0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          if (stackIn_14_0 | stackIn_14_1 == 0) {
            if (uu.a(true, param1, param2)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            var4 = null;
            hja discarded$8 = cu.a(true, -98, (cn) null, 106);
            stackOut_1_0 = er.c(param1, param2, 52);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((param1 & 458752) == 0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!uu.a(true, param1, param2)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    final int a(int param0, up param1, pc param2) {
        if (param0 > -85) {
            return -55;
        }
        return this.a(127, param1);
    }

    cu(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((cu) this).field_n = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        ((cu) this).field_r = param1.b((byte) 44, 8);
        ((cu) this).field_z = param1.b((byte) 44, 8);
        ((cu) this).field_u = param1.b((byte) 44, 4);
        ((cu) this).field_y = param1.b((byte) 44, 4);
        ((cu) this).field_t = param1.b((byte) 44, 8);
        ((cu) this).field_w = new kpa(6, param0.field_E, param1);
        ((cu) this).field_A = new kpa(6, param0.field_E, param1);
    }

    private final boolean a(byte param0, int param1) {
        int var3 = -126 / ((19 - param0) / 56);
        return ((cu) this).field_A.a(0, param1);
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 27, param0, ((cu) this).field_s);
        if (param1 >= -48) {
          return 119;
        } else {
          param0 = fs.a((byte) 59, param0, ((cu) this).field_v);
          return param0;
        }
    }

    final void b(byte param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            this.g((byte) -127);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
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
          ((cu) this).field_n = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((cu) this).field_n = stackIn_4_1 != 0;
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        ((cu) this).field_z = param1;
        ((cu) this).field_u = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Music: ";
    }
}
