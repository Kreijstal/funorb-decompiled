/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ok extends al implements je {
    static int[] field_F;
    static kk field_G;
    al field_B;
    static String[] field_C;
    static ic field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param6 == 127) {
          if (null != ((ok) this).field_B) {
            if (!((ok) this).field_B.h(param6 + -216)) {
              return false;
            } else {
              L0: {
                if (!((ok) this).field_B.a(param0, param1, param2, param3, param4, param5, (byte) 127)) {
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
          ((ok) this).f(-111);
          if (null != ((ok) this).field_B) {
            if (!((ok) this).field_B.h(param6 + -216)) {
              return false;
            } else {
              L1: {
                if (!((ok) this).field_B.a(param0, param1, param2, param3, param4, param5, (byte) 127)) {
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

    al i(int param0) {
        al var2 = null;
        var2 = ((ok) this).field_B;
        if (var2 == null) {
          if (param0 == 199) {
            return null;
          } else {
            field_F = null;
            return null;
          }
        } else {
          if (!var2.h(-89)) {
            if (param0 == 199) {
              return null;
            } else {
              field_F = null;
              return null;
            }
          } else {
            return var2;
          }
        }
    }

    public static void d(byte param0) {
        field_G = null;
        field_C = null;
        if (param0 != -7) {
            return;
        }
        field_F = null;
        field_D = null;
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackOut_22_0 = false;
        boolean stackOut_21_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_4_0 = false;
        if (((ok) this).field_B != null) {
          if (((ok) this).field_B.h(-114)) {
            if (!((ok) this).field_B.a((byte) 121, param1, param2, param3)) {
              var5 = param3;
              if (-81 == (var5 ^ -1)) {
                L0: {
                  if (ni.field_m[81]) {
                    stackOut_22_0 = this.b((byte) 104, param2);
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = this.c((byte) 100, param2);
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return stackIn_23_0;
              } else {
                var5 = -53 % ((17 - param0) / 51);
                return false;
              }
            } else {
              return true;
            }
          } else {
            var5 = param3;
            if (-81 == (var5 ^ -1)) {
              L1: {
                if (ni.field_m[81]) {
                  stackOut_13_0 = this.b((byte) 104, param2);
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = this.c((byte) 100, param2);
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              return stackIn_14_0;
            } else {
              var5 = -53 % ((17 - param0) / 51);
              return false;
            }
          }
        } else {
          var5 = param3;
          if (-81 == (var5 ^ -1)) {
            L2: {
              if (ni.field_m[81]) {
                stackOut_5_0 = this.b((byte) 104, param2);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = this.c((byte) 100, param2);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          } else {
            var5 = -53 % ((17 - param0) / 51);
            return false;
          }
        }
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -83) {
          L0: {
            field_F = null;
            if (null == ((ok) this).i(199)) {
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
            if (null == ((ok) this).i(199)) {
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

    ok(int param0, int param1, int param2, int param3, t param4, tg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        StringBuilder discarded$0 = param2.append(10);
        int var5 = 27 % ((param0 - -90) / 33);
        for (var6 = 0; param3 >= var6; var6++) {
            StringBuilder discarded$1 = param2.append(32);
        }
        if (null != ((ok) this).field_B) {
            StringBuilder discarded$3 = ((ok) this).field_B.a(false, param1, param2, param3 - -1);
        } else {
            StringBuilder discarded$4 = param2.append("null");
            return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ok) this).a((byte) -6);
    }

    void a(int param0, int param1, byte param2, al param3) {
        super.a(param0, param1, param2, param3);
        if (!(((ok) this).field_B == null)) {
            ((ok) this).field_B.a(((ok) this).field_m + param0, param1 + ((ok) this).field_p, (byte) -124, param3);
        }
    }

    final static void a(k param0, int param1, byte param2, kk param3) {
        vi.field_c = il.c(-14496) * param1 / 1000;
        if (param2 != 52) {
          return;
        } else {
          ak.a(param3, 4);
          fe.a(30344, param3);
          cl.a(param3, (byte) -123);
          ea.a(false);
          cj.d(param2 + 45);
          fb.field_a = 0 + -vi.field_c;
          return;
        }
    }

    String e(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.e(param0 + param0);
        if (((ok) this).field_B != null) {
          var3 = ((ok) this).field_B.e(param0 + 0);
          if (var3 != null) {
            return var3;
          } else {
            return var2;
          }
        } else {
          return var2;
        }
    }

    final boolean a(byte param0, al param1) {
        if (param0 <= -104) {
          if (((ok) this).field_B != null) {
            if (!((ok) this).field_B.a((byte) -116, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (0 == param0) {
          if (((ok) this).field_y != null) {
            L0: {
              ((ok) this).field_y.a(-24969, (al) this, param2, true, param1);
              if (null != ((ok) this).field_B) {
                ((ok) this).field_B.a(param0, ((ok) this).field_p + param1, param2 - -((ok) this).field_m, 29221);
                break L0;
              } else {
                break L0;
              }
            }
            if (param3 != 29221) {
              int discarded$6 = ((ok) this).c((byte) 58);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (null != ((ok) this).field_B) {
                ((ok) this).field_B.a(param0, ((ok) this).field_p + param1, param2 - -((ok) this).field_m, 29221);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 != 29221) {
              int discarded$7 = ((ok) this).c((byte) 58);
              return;
            } else {
              return;
            }
          }
        } else {
          L2: {
            if (null != ((ok) this).field_B) {
              ((ok) this).field_B.a(param0, ((ok) this).field_p + param1, param2 - -((ok) this).field_m, 29221);
              break L2;
            } else {
              break L2;
            }
          }
          if (param3 != 29221) {
            int discarded$8 = ((ok) this).c((byte) 58);
            return;
          } else {
            return;
          }
        }
    }

    final void f(int param0) {
        if (!(null == ((ok) this).field_B)) {
            ((ok) this).field_B.f(-24174);
        }
        if (param0 != -24174) {
            field_C = null;
            return;
        }
    }

    private final boolean c(byte param0, al param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 60) {
          if (((ok) this).field_B != null) {
            if (((ok) this).field_B.h(-112)) {
              return false;
            } else {
              L0: {
                if (!((ok) this).field_B.a((byte) -106, param1)) {
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
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param1) {
          return;
        } else {
          L0: {
            if (((ok) this).field_B == null) {
              break L0;
            } else {
              ((ok) this).field_B.a(param0, false, param2, param3 + ((ok) this).field_m, param4, ((ok) this).field_p + param5);
              break L0;
            }
          }
          return;
        }
    }

    boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 0) {
          if (((ok) this).field_B != null) {
            if (!((ok) this).field_B.a(param0, param1, param2, param3, 0, ((ok) this).field_p + param5, param6 + ((ok) this).field_m)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final int c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -14) {
          L0: {
            field_C = null;
            if (null != ((ok) this).field_B) {
              stackOut_7_0 = ((ok) this).field_B.c((byte) -14);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null != ((ok) this).field_B) {
              stackOut_3_0 = ((ok) this).field_B.c((byte) -14);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!((ok) this).a((byte) 121, param3, param2, param1)) {
          if (param0) {
            field_C = null;
            return param2;
          } else {
            return param2;
          }
        } else {
          ((ok) this).a(34, param2, param3, param1);
          ((ok) this).a(4, param1, param2, param3);
          if (!param0) {
            return param2;
          } else {
            field_C = null;
            return param2;
          }
        }
    }

    void a(byte param0) {
        int var2 = -24 / ((48 - param0) / 40);
        if (!(null == ((ok) this).field_B)) {
            ((ok) this).field_B.g(55);
        }
    }

    private final boolean b(byte param0, al param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 104) {
          if (((ok) this).field_B != null) {
            if (((ok) this).field_B.h(-90)) {
              return false;
            } else {
              L0: {
                if (!((ok) this).field_B.a((byte) -118, param1)) {
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
          var4 = null;
          boolean discarded$3 = this.c((byte) 3, (al) null);
          if (((ok) this).field_B != null) {
            if (((ok) this).field_B.h(-90)) {
              return false;
            } else {
              L1: {
                if (!((ok) this).field_B.a((byte) -118, param1)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[128];
        field_C = new String[16];
    }
}
