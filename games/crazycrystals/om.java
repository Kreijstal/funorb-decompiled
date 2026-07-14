/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class om extends qm implements he {
    static boolean field_u;
    qm field_w;
    static String field_v;
    static String field_x;

    void a(qm param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = -79 / ((param1 - -50) / 59);
        super.a(param0, 24, param2, param3);
        if (((om) this).field_w != null) {
          ((om) this).field_w.a(param0, 92, param2 + ((om) this).field_j, ((om) this).field_r + param3);
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        Object var3 = null;
        L0: {
          if (null != ((om) this).field_w) {
            ((om) this).field_w.b((byte) -95);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -84) {
          var3 = null;
          ((om) this).a((qm) null, -36, 90, 38);
          return;
        } else {
          return;
        }
    }

    om(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        if (param5 != 0) {
          return;
        } else {
          L0: {
            if (null != ((om) this).field_w) {
              ((om) this).field_w.a(param0, param1 - -((om) this).field_j, ((om) this).field_r + param2, param3, param4, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final boolean a(qm param0, boolean param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param1) {
          if (null != ((om) this).field_w) {
            if (((om) this).field_w.e(-109)) {
              return false;
            } else {
              L0: {
                if (!((om) this).field_w.a(true, param0)) {
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
          boolean discarded$8 = ((om) this).a(97, 105, (qm) null, 108, -78, 40, 121);
          if (null != ((om) this).field_w) {
            if (((om) this).field_w.e(-109)) {
              return false;
            } else {
              L1: {
                if (!((om) this).field_w.a(true, param0)) {
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

    final boolean a(int param0, int param1, qm param2, char param3) {
        int var5 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackOut_28_0 = false;
        boolean stackOut_27_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_15_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_4_0 = false;
        if (null != ((om) this).field_w) {
          if (((om) this).field_w.e(param1 + -19401)) {
            if (!((om) this).field_w.a(param0, param1 ^ 0, param2, param3)) {
              var5 = param0;
              if (var5 == 80) {
                L0: {
                  if (cp.field_k[81]) {
                    stackOut_28_0 = this.a(param2, false);
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    stackOut_27_0 = this.a(4, param2);
                    stackIn_29_0 = stackOut_27_0;
                    break L0;
                  }
                }
                return stackIn_29_0;
              } else {
                if (param1 != 19279) {
                  field_v = null;
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          } else {
            var5 = param0;
            if (var5 == 80) {
              L1: {
                if (cp.field_k[81]) {
                  stackOut_16_0 = this.a(param2, false);
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = this.a(4, param2);
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              return stackIn_17_0;
            } else {
              if (param1 != 19279) {
                field_v = null;
                return false;
              } else {
                return false;
              }
            }
          }
        } else {
          var5 = param0;
          if (var5 == 80) {
            L2: {
              if (cp.field_k[81]) {
                stackOut_5_0 = this.a(param2, false);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = this.a(4, param2);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          } else {
            if (param1 != 19279) {
              field_v = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    qm d(byte param0) {
        qm var2 = null;
        if (param0 >= 39) {
          var2 = ((om) this).field_w;
          if (var2 != null) {
            if (!var2.e(-111)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          ((om) this).field_w = null;
          var2 = ((om) this).field_w;
          if (var2 != null) {
            if (!var2.e(-111)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(boolean param0, qm param1) {
        if (param0) {
          if (null != ((om) this).field_w) {
            if (!((om) this).field_w.a(true, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          String discarded$6 = ((om) this).a((byte) 61);
          if (null != ((om) this).field_w) {
            if (!((om) this).field_w.a(true, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        if (!param3) {
          if (null != ((om) this).field_w) {
            if (!((om) this).field_w.a(param0 + ((om) this).field_r, param1, param2, false, param4 - -((om) this).field_j, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_v = null;
          if (null != ((om) this).field_w) {
            if (!((om) this).field_w.a(param0 + ((om) this).field_r, param1, param2, false, param4 - -((om) this).field_j, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param3) {
          if (((om) this).field_i != null) {
            ((om) this).field_i.a(param0, false, param2, (qm) this, true);
            if (((om) this).field_w == null) {
              if (param1 >= -12) {
                ((om) this).field_w = null;
                return;
              } else {
                return;
              }
            } else {
              ((om) this).field_w.a(((om) this).field_j + param0, (byte) -127, ((om) this).field_r + param2, param3);
              if (param1 >= -12) {
                ((om) this).field_w = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (((om) this).field_w == null) {
              if (param1 >= -12) {
                ((om) this).field_w = null;
                return;
              } else {
                return;
              }
            } else {
              ((om) this).field_w.a(((om) this).field_j + param0, (byte) -127, ((om) this).field_r + param2, param3);
              if (param1 >= -12) {
                ((om) this).field_w = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (((om) this).field_w == null) {
            if (param1 >= -12) {
              ((om) this).field_w = null;
              return;
            } else {
              return;
            }
          } else {
            ((om) this).field_w.a(((om) this).field_j + param0, (byte) -127, ((om) this).field_r + param2, param3);
            if (param1 >= -12) {
              ((om) this).field_w = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        ((om) this).a(param4 + -8294);
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -107) {
          L0: {
            field_v = null;
            if (((om) this).d((byte) 47) == null) {
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
            if (((om) this).d((byte) 47) == null) {
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

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (param1 < -85) {
          if (((om) this).a(0, param0, param3, param2)) {
            ((om) this).a(param0, (byte) 125, param3, param2);
            ((om) this).a(param3, param2, param0, -91);
            return param3;
          } else {
            return param3;
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 1) {
          if (((om) this).field_w != null) {
            if (!((om) this).field_w.e(-115)) {
              return false;
            } else {
              L0: {
                if (!((om) this).field_w.a(1, param1, param2, param3, param4, param5, param6)) {
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

    final void a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (param3 <= -26) {
          StringBuilder discarded$18 = param0.append(10);
          var5 = 0;
          L0: while (true) {
            if (param2 < var5) {
              if (null == ((om) this).field_w) {
                StringBuilder discarded$19 = param0.append("null");
                return;
              } else {
                StringBuilder discarded$20 = ((om) this).field_w.a(1 + param2, -109, param1, param0);
                return;
              }
            } else {
              StringBuilder discarded$21 = param0.append(32);
              var5++;
              continue L0;
            }
          }
        } else {
          ((om) this).field_w = null;
          StringBuilder discarded$22 = param0.append(10);
          var5 = 0;
          L1: while (true) {
            if (param2 < var5) {
              if (null == ((om) this).field_w) {
                StringBuilder discarded$23 = param0.append("null");
                return;
              } else {
                StringBuilder discarded$24 = ((om) this).field_w.a(1 + param2, -109, param1, param0);
                return;
              }
            } else {
              StringBuilder discarded$25 = param0.append(32);
              var5++;
              continue L1;
            }
          }
        }
    }

    void a(int param0) {
        if (param0 == -8346) {
          if (((om) this).field_w != null) {
            ((om) this).field_w.f(param0 + 8316);
            return;
          } else {
            return;
          }
        } else {
          field_v = null;
          if (((om) this).field_w == null) {
            return;
          } else {
            ((om) this).field_w.f(param0 + 8316);
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_v = null;
        if (param0 != 122) {
            om.e((byte) 110);
        }
    }

    final int c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 30) {
          L0: {
            ((om) this).field_w = null;
            if (null != ((om) this).field_w) {
              stackOut_7_0 = ((om) this).field_w.c((byte) 97);
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
            if (null != ((om) this).field_w) {
              stackOut_3_0 = ((om) this).field_w.c((byte) 97);
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

    String a(byte param0) {
        String var2 = null;
        String var3 = null;
        Object var4 = null;
        var2 = super.a((byte) -46);
        if (param0 <= -23) {
          if (null != ((om) this).field_w) {
            var3 = ((om) this).field_w.a((byte) -72);
            if (var3 != null) {
              return var3;
            } else {
              return var2;
            }
          } else {
            return var2;
          }
        } else {
          var4 = null;
          ((om) this).a((StringBuilder) null, (Hashtable) null, 43, -106);
          if (null != ((om) this).field_w) {
            var3 = ((om) this).field_w.a((byte) -72);
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

    private final boolean a(int param0, qm param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = 7 / ((param0 - -63) / 46);
        if (null != ((om) this).field_w) {
          if (((om) this).field_w.e(-127)) {
            return false;
          } else {
            L0: {
              if (!((om) this).field_w.a(true, param1)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Names should contain a maximum of 12 characters";
    }
}
