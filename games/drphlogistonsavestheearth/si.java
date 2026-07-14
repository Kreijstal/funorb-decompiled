/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class si extends vg implements ba {
    static db field_A;
    vg field_z;
    static he[] field_G;
    static nh field_F;
    static boolean[] field_C;
    static vj field_E;
    static int field_B;
    static he field_D;

    void i(int param0) {
        if (param0 != 0) {
          L0: {
            field_G = null;
            if (null != ((si) this).field_z) {
              ((si) this).field_z.e((byte) 38);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((si) this).field_z) {
              ((si) this).field_z.e((byte) 38);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        int var5 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackOut_24_0 = false;
        boolean stackOut_23_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_7_0 = false;
        boolean stackOut_6_0 = false;
        if (param3 > 63) {
          if (null != ((si) this).field_z) {
            if (((si) this).field_z.a(true)) {
              if (!((si) this).field_z.a(param0, param1, param2, 74)) {
                var5 = param0;
                if (var5 == 80) {
                  L0: {
                    if (ck.field_f[81]) {
                      stackOut_24_0 = this.a(0, param2);
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      stackOut_23_0 = this.a(param2, 6);
                      stackIn_25_0 = stackOut_23_0;
                      break L0;
                    }
                  }
                  return stackIn_25_0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              var5 = param0;
              if (var5 == 80) {
                L1: {
                  if (ck.field_f[81]) {
                    stackOut_15_0 = this.a(0, param2);
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = this.a(param2, 6);
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              } else {
                return false;
              }
            }
          } else {
            var5 = param0;
            if (var5 == 80) {
              L2: {
                if (ck.field_f[81]) {
                  stackOut_7_0 = this.a(0, param2);
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = this.a(param2, 6);
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              return stackIn_8_0;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param2 > 43) {
          if (null != ((si) this).field_z) {
            if (!((si) this).field_z.a(true)) {
              return false;
            } else {
              L0: {
                if (!((si) this).field_z.a(param0, param1, (byte) 113, param3, param4, param5, param6)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          si.f(-83);
          if (null != ((si) this).field_z) {
            if (!((si) this).field_z.a(true)) {
              return false;
            } else {
              L1: {
                if (!((si) this).field_z.a(param0, param1, (byte) 113, param3, param4, param5, param6)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    String e(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.e(-93);
        if (null != ((si) this).field_z) {
          var3 = ((si) this).field_z.e(-71);
          if (var3 == null) {
            if (param0 <= -39) {
              return var2;
            } else {
              field_B = 63;
              return var2;
            }
          } else {
            return var3;
          }
        } else {
          if (param0 <= -39) {
            return var2;
          } else {
            field_B = 63;
            return var2;
          }
        }
    }

    vg h(int param0) {
        int var2 = 0;
        vg var3 = null;
        var2 = -51 % ((-28 - param0) / 57);
        var3 = ((si) this).field_z;
        if (var3 != null) {
          if (!var3.a(true)) {
            return null;
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        if (param3 > 113) {
          if (null != ((si) this).field_z) {
            if (!((si) this).field_z.a(param0, param1, param2, (byte) 123, param4, param5 - -((si) this).field_o, ((si) this).field_m + param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_E = null;
          if (null != ((si) this).field_z) {
            if (!((si) this).field_z.a(param0, param1, param2, (byte) 123, param4, param5 - -((si) this).field_o, ((si) this).field_m + param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param1 == 0) {
          if (((si) this).field_l != null) {
            ((si) this).field_l.a(true, param2 + 143, (vg) this, param3, param0);
            if (param2 != -21) {
              L0: {
                field_G = null;
                if (null != ((si) this).field_z) {
                  ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (null != ((si) this).field_z) {
                  ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            if (param2 != -21) {
              L2: {
                field_G = null;
                if (null != ((si) this).field_z) {
                  ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (null != ((si) this).field_z) {
                  ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          if (param2 != -21) {
            L4: {
              field_G = null;
              if (null != ((si) this).field_z) {
                ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            L5: {
              if (null != ((si) this).field_z) {
                ((si) this).field_z.a(((si) this).field_o + param0, param1, (byte) -21, ((si) this).field_m + param3);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    private final boolean a(vg param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 6) {
          if (null != ((si) this).field_z) {
            if (((si) this).field_z.a(true)) {
              return false;
            } else {
              L0: {
                if (!((si) this).field_z.a(false, param0)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_B = -60;
          if (null != ((si) this).field_z) {
            if (((si) this).field_z.a(true)) {
              return false;
            } else {
              L1: {
                if (!((si) this).field_z.a(false, param0)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 != -10612) {
          return null;
        } else {
          L0: {
            if (((si) this).a(param1, param2, param0, 92)) {
              ((si) this).a(param2, (byte) 89, param0, param1);
              ((si) this).a(10, param2, param0, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return param2;
        }
    }

    final int d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 3) {
          L0: {
            field_F = null;
            if (null == ((si) this).field_z) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((si) this).field_z.d(3);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null == ((si) this).field_z) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((si) this).field_z.d(3);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    si(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        StringBuilder discarded$0 = param1.append((char)param0);
        for (var5 = 0; param2 >= var5; var5++) {
            StringBuilder discarded$1 = param1.append(32);
        }
        if (((si) this).field_z != null) {
            StringBuilder discarded$3 = ((si) this).field_z.a(param2 - -1, param3, param1, -10612);
        } else {
            StringBuilder discarded$4 = param1.append("null");
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        if (((si) this).field_z != null) {
          ((si) this).field_z.c((byte) -93);
          var2 = -113 / ((-10 - param0) / 51);
          return;
        } else {
          var2 = -113 / ((-10 - param0) / 51);
          return;
        }
    }

    final static void f(int param0) {
        cj.field_h = new he[8];
        cj.field_h[4] = od.field_k;
        cj.field_h[2] = ri.field_b;
        cj.field_h[1] = re.field_d;
        cj.field_h[0] = fa.field_o;
        if (param0 != 10) {
          return;
        } else {
          cj.field_h[5] = qc.field_a;
          cj.field_h[6] = p.field_e;
          cj.field_h[3] = of.field_x;
          cj.field_h[7] = c.field_a[0];
          return;
        }
    }

    private final boolean a(int param0, vg param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (null != ((si) this).field_z) {
            if (((si) this).field_z.a(true)) {
              return false;
            } else {
              L0: {
                if (!((si) this).field_z.a(false, param1)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_D = null;
          if (null != ((si) this).field_z) {
            if (((si) this).field_z.a(true)) {
              return false;
            } else {
              L1: {
                if (!((si) this).field_z.a(false, param1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return null != ((si) this).h(115) ? true : false;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        Object var6 = null;
        super.a(param0, param1, param2, (byte) -128);
        if (param3 > -127) {
          L0: {
            var6 = null;
            boolean discarded$1 = ((si) this).a(22, (vg) null, -5, (byte) 124, 57, 35, -88);
            if (null != ((si) this).field_z) {
              ((si) this).field_z.a(param0, param1 - -((si) this).field_o, ((si) this).field_m + param2, (byte) -128);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((si) this).field_z) {
              ((si) this).field_z.a(param0, param1 - -((si) this).field_o, ((si) this).field_m + param2, (byte) -128);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((si) this).i(0);
    }

    public static void g(int param0) {
        field_F = null;
        field_C = null;
        field_E = null;
        if (param0 != 6714) {
          si.f(94);
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        } else {
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        }
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        if (param5) {
          L0: {
            ((si) this).a(-71, 74, (byte) -81, 61);
            if (null != ((si) this).field_z) {
              ((si) this).field_z.a(param0 - -((si) this).field_o, ((si) this).field_m + param1, param2, param3, param4, false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((si) this).field_z) {
              ((si) this).field_z.a(param0 - -((si) this).field_o, ((si) this).field_m + param1, param2, param3, param4, false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(boolean param0, vg param1) {
        if (!param0) {
          if (((si) this).field_z != null) {
            if (!((si) this).field_z.a(param0, param1)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new db(2);
        field_C = new boolean[]{false, false, false, false};
    }
}
