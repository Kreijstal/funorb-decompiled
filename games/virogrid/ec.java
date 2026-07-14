/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ec extends fi implements ja {
    static String field_y;
    static float field_z;
    fi field_x;
    static String field_D;
    static String field_A;
    static km field_C;

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param5 == 0) {
          if (((ec) this).field_x != null) {
            if (!((ec) this).field_x.f(true)) {
              return false;
            } else {
              L0: {
                if (!((ec) this).field_x.a(param0, param1, param2, param3, param4, param5 + 0, param6)) {
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
          return true;
        }
    }

    String d(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.d(41);
        if (param0 >= 35) {
          if (((ec) this).field_x != null) {
            var3 = ((ec) this).field_x.d(38);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        } else {
          field_C = null;
          if (((ec) this).field_x != null) {
            var3 = ((ec) this).field_x.d(38);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_D = null;
        field_A = null;
        field_y = null;
        if (param0 != -3298) {
            field_D = null;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackOut_22_0 = false;
        boolean stackOut_21_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_4_0 = false;
        if (((ec) this).field_x != null) {
          if (((ec) this).field_x.f(true)) {
            if (!((ec) this).field_x.a(param0, param1, param2, -124)) {
              var5 = -96 % ((-75 - param3) / 36);
              var6 = param2;
              if (-81 == (var6 ^ -1)) {
                L0: {
                  if (!dc.field_Y[81]) {
                    stackOut_22_0 = this.a((byte) -67, param0);
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = this.a(param0, true);
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return stackIn_23_0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var5 = -96 % ((-75 - param3) / 36);
            var6 = param2;
            if (-81 == (var6 ^ -1)) {
              L1: {
                if (!dc.field_Y[81]) {
                  stackOut_13_0 = this.a((byte) -67, param0);
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = this.a(param0, true);
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              return stackIn_14_0;
            } else {
              return false;
            }
          }
        } else {
          var5 = -96 % ((-75 - param3) / 36);
          var6 = param2;
          if (-81 == (var6 ^ -1)) {
            L2: {
              if (!dc.field_Y[81]) {
                stackOut_5_0 = this.a((byte) -67, param0);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = this.a(param0, true);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          } else {
            return false;
          }
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != ((ec) this).g(!param0 ? true : false) ? true : false;
    }

    private final boolean a(fi param0, boolean param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1) {
          if (((ec) this).field_x != null) {
            if (((ec) this).field_x.f(true)) {
              return false;
            } else {
              L0: {
                if (!((ec) this).field_x.a(param0, -8515)) {
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
          boolean discarded$3 = this.a((byte) -30, (fi) null);
          if (((ec) this).field_x != null) {
            if (((ec) this).field_x.f(true)) {
              return false;
            } else {
              L1: {
                if (!((ec) this).field_x.a(param0, -8515)) {
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

    final boolean a(fi param0, int param1) {
        if (param1 == -8515) {
          if (((ec) this).field_x != null) {
            if (!((ec) this).field_x.a(param0, -8515)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          String discarded$6 = ((ec) this).d(-27);
          if (((ec) this).field_x != null) {
            if (!((ec) this).field_x.a(param0, -8515)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        Object var6 = null;
        if (param1 <= 118) {
          L0: {
            var6 = null;
            StringBuilder discarded$1 = ((ec) this).a((Hashtable) null, (byte) 94, 63, (StringBuilder) null);
            if (((ec) this).a(param0, param2, 34, param3)) {
              ((ec) this).a(param2, param0, (byte) 126, param3);
              ((ec) this).a(param0, param3, 8651, param2);
              break L0;
            } else {
              break L0;
            }
          }
          return param3;
        } else {
          L1: {
            if (((ec) this).a(param0, param2, 34, param3)) {
              ((ec) this).a(param2, param0, (byte) 126, param3);
              ((ec) this).a(param0, param3, 8651, param2);
              break L1;
            } else {
              break L1;
            }
          }
          return param3;
        }
    }

    private final boolean a(byte param0, fi param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -50) {
          if (((ec) this).field_x != null) {
            if (((ec) this).field_x.f(true)) {
              return false;
            } else {
              L0: {
                if (!((ec) this).field_x.a(param1, -8515)) {
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
          boolean discarded$3 = this.a((byte) 59, (fi) null);
          if (((ec) this).field_x != null) {
            if (((ec) this).field_x.f(true)) {
              return false;
            } else {
              L1: {
                if (!((ec) this).field_x.a(param1, -8515)) {
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

    ec(int param0, int param1, int param2, int param3, ol param4, cd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        ((ec) this).e(-37);
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        StringBuilder discarded$15 = param1.append(10);
        var5 = 0;
        L0: while (true) {
          if (param3 < var5) {
            if (param2 == 8651) {
              if (((ec) this).field_x == null) {
                StringBuilder discarded$16 = param1.append("null");
                return;
              } else {
                StringBuilder discarded$17 = ((ec) this).field_x.a(param0, (byte) 122, param3 + 1, param1);
                return;
              }
            } else {
              var7 = null;
              boolean discarded$18 = this.a((fi) null, true);
              if (((ec) this).field_x == null) {
                StringBuilder discarded$19 = param1.append("null");
                return;
              } else {
                StringBuilder discarded$20 = ((ec) this).field_x.a(param0, (byte) 122, param3 + 1, param1);
                return;
              }
            }
          } else {
            StringBuilder discarded$21 = param1.append(32);
            var5++;
            continue L0;
          }
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (((ec) this).field_w != null) {
              ((ec) this).field_w.a(param1, (fi) this, true, param2, -23294);
              break L0;
            } else {
              if (param0 == 37) {
                L1: {
                  if (((ec) this).field_x != null) {
                    ((ec) this).field_x.a((byte) 37, param1 + ((ec) this).field_l, param2 + ((ec) this).field_u, param3);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  field_y = null;
                  if (((ec) this).field_x != null) {
                    ((ec) this).field_x.a((byte) 37, param1 + ((ec) this).field_l, param2 + ((ec) this).field_u, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        if (param0 != 37) {
          L3: {
            field_y = null;
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.a((byte) 37, param1 + ((ec) this).field_l, param2 + ((ec) this).field_u, param3);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.a((byte) 37, param1 + ((ec) this).field_l, param2 + ((ec) this).field_u, param3);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
          if (null != ((ec) this).field_x) {
            if (!((ec) this).field_x.a(param0, param1, false, param3 - -((ec) this).field_l, param4, param5 - -((ec) this).field_u, param6)) {
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

    final void c(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          L0: {
            var3 = null;
            boolean discarded$4 = this.a((fi) null, true);
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.c(-1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.c(-1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 122, param2, param3);
        if (param1 > 113) {
          if (null != ((ec) this).field_x) {
            ((ec) this).field_x.a(((ec) this).field_l + param0, 117, param2, ((ec) this).field_u + param3);
            return;
          } else {
            return;
          }
        } else {
          ((ec) this).field_x = null;
          if (null == ((ec) this).field_x) {
            return;
          } else {
            ((ec) this).field_x.a(((ec) this).field_l + param0, 117, param2, ((ec) this).field_u + param3);
            return;
          }
        }
    }

    fi g(boolean param0) {
        fi var2 = null;
        if (param0) {
            field_D = null;
            var2 = ((ec) this).field_x;
            if (var2 == null) {
                return null;
            }
            if (!(!var2.f(true))) {
                return var2;
            }
            return null;
        }
        var2 = ((ec) this).field_x;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.f(true))) {
            return var2;
        }
        return null;
    }

    final int b(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -39) {
          L0: {
            var3 = null;
            boolean discarded$8 = ((ec) this).a((fi) null, 66);
            if (((ec) this).field_x == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((ec) this).field_x.b((byte) -39);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((ec) this).field_x == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((ec) this).field_x.b((byte) -39);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        if (param5 < 73) {
          L0: {
            ec.a(-26);
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.a(param0, param1, param2 - -((ec) this).field_l, param3, param4 - -((ec) this).field_u, 84);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ec) this).field_x != null) {
              ((ec) this).field_x.a(param0, param1, param2 - -((ec) this).field_l, param3, param4 - -((ec) this).field_u, 84);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void e(int param0) {
        Object var3 = null;
        L0: {
          if (null != ((ec) this).field_x) {
            ((ec) this).field_x.d(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -2) {
          var3 = null;
          boolean discarded$2 = this.a((byte) -16, (fi) null);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Enter name of friend to delete from list";
        field_y = "<%0>'s turn";
        field_A = "This password contains your Player Name, and would be easy to guess";
    }
}
