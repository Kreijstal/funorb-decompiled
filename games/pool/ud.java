/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ud extends ei implements lj {
    static String field_H;
    ei field_L;
    static String field_F;
    static int[] field_I;
    static int[] field_G;
    static String field_M;
    static String field_K;
    static vh field_J;

    ud(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void a(int param0) {
        field_J = null;
        field_M = null;
        field_F = null;
        field_G = null;
        field_I = null;
        field_H = null;
        if (param0 < 45) {
          int discarded$2 = ud.a(0.4757129525911979, 55, -32);
          field_K = null;
          return;
        } else {
          field_K = null;
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        if (param4 < 62) {
          L0: {
            ei discarded$10 = ((ud) this).g(80);
            if (null != ((ud) this).field_L) {
              ((ud) this).field_L.a(((ud) this).field_C + param0, param1, param2 + ((ud) this).field_D, param3, (byte) 103, param5);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((ud) this).field_L) {
              ((ud) this).field_L.a(((ud) this).field_C + param0, param1, param2 + ((ud) this).field_D, param3, (byte) 103, param5);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != 99) {
            return;
        }
        if (!(((ud) this).field_L == null)) {
            ((ud) this).field_L.d((byte) 99);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          var5 = -76 / ((-42 - param1) / 53);
          if (param0 != 0) {
            break L0;
          } else {
            if (((ud) this).field_z != null) {
              ((ud) this).field_z.a(true, param2, (byte) 91, param3, (ei) this);
              break L0;
            } else {
              if (((ud) this).field_L == null) {
                return;
              } else {
                ((ud) this).field_L.a(param0, (byte) -111, param2 + ((ud) this).field_C, ((ud) this).field_D + param3);
                return;
              }
            }
          }
        }
        if (((ud) this).field_L != null) {
          ((ud) this).field_L.a(param0, (byte) -111, param2 + ((ud) this).field_C, ((ud) this).field_D + param3);
          return;
        } else {
          return;
        }
    }

    final boolean d(int param0) {
        int var2 = -73 % ((param0 - 7) / 48);
        return null != ((ud) this).g(-1) ? true : false;
    }

    private final boolean a(ei param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 10) {
          if (((ud) this).field_L != null) {
            if (((ud) this).field_L.d(param1 + 48)) {
              return false;
            } else {
              L0: {
                if (!((ud) this).field_L.a(param0, (byte) -119)) {
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
          ((ud) this).d((byte) -92);
          if (((ud) this).field_L != null) {
            if (((ud) this).field_L.d(param1 + 48)) {
              return false;
            } else {
              L1: {
                if (!((ud) this).field_L.a(param0, (byte) -119)) {
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

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = Pool.field_O;
        StringBuilder discarded$5 = param2.append(10);
        if (param1 != 3) {
            return;
        }
        for (var5 = 0; param3 >= var5; var5++) {
            StringBuilder discarded$6 = param2.append(32);
        }
        if (null != ((ud) this).field_L) {
            StringBuilder discarded$8 = ((ud) this).field_L.a(param2, 1 + param3, param0, param1 ^ 26);
        } else {
            StringBuilder discarded$9 = param2.append("null");
            return;
        }
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (param2) {
          if (null != ((ud) this).field_L) {
            if (!((ud) this).field_L.a(param0, param1 - -((ud) this).field_C, true, param3, param4, ((ud) this).field_D + param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = null;
          if (null != ((ud) this).field_L) {
            if (!((ud) this).field_L.a(param0, param1 - -((ud) this).field_C, true, param3, param4, ((ud) this).field_D + param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        if (param0 < (ec.field_b ^ -1)) {
          var1 = ec.field_b % 32;
          ka.a(true, -var1 + (32 + ec.field_b));
          return;
        } else {
          ka.a(true, 256);
          return;
        }
    }

    final static qb a(qb param0, byte param1, int[] param2) {
        qb var3 = null;
        var3 = new qb(0, 0, 0);
        var3.field_i = param2;
        var3.field_e = param0.field_e;
        var3.field_d = param0.field_d;
        var3.field_b = param0.field_b;
        if (param1 <= 23) {
          int discarded$1 = ud.a(0.5253398849342288, -86, 126);
          var3.field_f = param0.field_f;
          var3.field_j = param0.field_j;
          var3.field_g = param0.field_g;
          var3.field_h = param0.field_h;
          return var3;
        } else {
          var3.field_f = param0.field_f;
          var3.field_j = param0.field_j;
          var3.field_g = param0.field_g;
          var3.field_h = param0.field_h;
          return var3;
        }
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param4 < -126) {
          if (((ud) this).field_L != null) {
            if (!((ud) this).field_L.d(119)) {
              return false;
            } else {
              L0: {
                if (!((ud) this).field_L.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
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

    final int c(int param0) {
        if (param0 <= 33) {
            return 43;
        }
        return ((ud) this).field_L == null ? 0 : ((ud) this).field_L.c(101);
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        int var5 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackOut_25_0 = false;
        boolean stackOut_24_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_7_0 = false;
        boolean stackOut_6_0 = false;
        L0: {
          if (!param2) {
            break L0;
          } else {
            ((ud) this).f((byte) -27);
            break L0;
          }
        }
        if (null != ((ud) this).field_L) {
          if (((ud) this).field_L.d(93)) {
            if (((ud) this).field_L.a(param0, param1, param2, param3)) {
              return true;
            } else {
              var5 = param1;
              if ((var5 ^ -1) == -81) {
                L1: {
                  if (!vj.field_c[81]) {
                    stackOut_25_0 = this.a(param3, 10);
                    stackIn_26_0 = stackOut_25_0;
                    break L1;
                  } else {
                    stackOut_24_0 = this.a(param3, false);
                    stackIn_26_0 = stackOut_24_0;
                    break L1;
                  }
                }
                return stackIn_26_0;
              } else {
                return false;
              }
            }
          } else {
            var5 = param1;
            if ((var5 ^ -1) == -81) {
              L2: {
                if (!vj.field_c[81]) {
                  stackOut_15_0 = this.a(param3, 10);
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_14_0 = this.a(param3, false);
                  stackIn_16_0 = stackOut_14_0;
                  break L2;
                }
              }
              return stackIn_16_0;
            } else {
              return false;
            }
          }
        } else {
          var5 = param1;
          if ((var5 ^ -1) == -81) {
            L3: {
              if (!vj.field_c[81]) {
                stackOut_7_0 = this.a(param3, 10);
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = this.a(param3, false);
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            return stackIn_8_0;
          } else {
            return false;
          }
        }
    }

    ei g(int param0) {
        ei var2 = null;
        var2 = ((ud) this).field_L;
        if (param0 == -1) {
          if (var2 != null) {
            if (!var2.d(86)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    String e(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.e(-58);
        if (param0 <= -10) {
          if (null != ((ud) this).field_L) {
            var3 = ((ud) this).field_L.e(-90);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (param3 <= 13) {
          return null;
        } else {
          L0: {
            if (((ud) this).b(param1, param2, param0, -1)) {
              ((ud) this).a(1, param2, param0, param1);
              ((ud) this).a(param2, 3, param0, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return param0;
        }
    }

    private final boolean a(ei param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param1) {
          if (null != ((ud) this).field_L) {
            if (((ud) this).field_L.d(120)) {
              return false;
            } else {
              L0: {
                if (!((ud) this).field_L.a(param0, (byte) -109)) {
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
          field_G = null;
          if (null != ((ud) this).field_L) {
            if (((ud) this).field_L.d(120)) {
              return false;
            } else {
              L1: {
                if (!((ud) this).field_L.a(param0, (byte) -109)) {
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

    final boolean a(ei param0, byte param1) {
        int var3 = 0;
        var3 = 122 % ((-43 - param1) / 47);
        if (((ud) this).field_L != null) {
          if (!((ud) this).field_L.a(param0, (byte) 60)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ud) this).f((byte) -128);
    }

    void f(byte param0) {
        Object var3 = null;
        if (param0 != -128) {
          L0: {
            var3 = null;
            boolean discarded$8 = ((ud) this).a((ei) null, (byte) 55);
            if (null != ((ud) this).field_L) {
              ((ud) this).field_L.e((byte) -100);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((ud) this).field_L) {
              ((ud) this).field_L.e((byte) -100);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        Object var6 = null;
        L0: {
          super.a(param0, param1 + 0, param2, param3);
          if (((ud) this).field_L != null) {
            ((ud) this).field_L.a(param0, 958, param2 - -((ud) this).field_C, param3 + ((ud) this).field_D);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 958) {
          var6 = null;
          boolean discarded$2 = ((ud) this).a((ei) null, (byte) 51);
          return;
        } else {
          return;
        }
    }

    final static int a(double param0, int param1, int param2) {
        if (param2 != 1) {
            return -6;
        }
        return (int)(0.5 + (double)(1 << param1) * param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Account created successfully!";
        field_K = "Public";
        field_I = new int[3];
        field_M = "Please select options in the following rows:  ";
        field_G = new int[]{62, 20, 21, 49, 6, 5, 3, 61};
    }
}
