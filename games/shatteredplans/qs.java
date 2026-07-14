/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class qs extends vg implements ni {
    vg field_z;
    static ub field_y;

    private final boolean a(vg param0, int param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = 36 / ((33 - param1) / 61);
        if (null != ((qs) this).field_z) {
          if (((qs) this).field_z.f(1)) {
            return false;
          } else {
            L0: {
              if (!((qs) this).field_z.a((byte) 125, param0)) {
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

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        StringBuilder discarded$5 = param3.append(10);
        if (param0 != 81) {
            ((qs) this).field_z = null;
            for (var5 = 0; param2 >= var5; var5++) {
                StringBuilder discarded$6 = param3.append(32);
            }
            if (null != ((qs) this).field_z) {
                StringBuilder discarded$8 = ((qs) this).field_z.a((byte) -121, param1, 1 + param2, param3);
            } else {
                StringBuilder discarded$9 = param3.append("null");
                return;
            }
            return;
        }
        for (var5 = 0; param2 >= var5; var5++) {
            StringBuilder discarded$10 = param3.append(32);
        }
        if (null != ((qs) this).field_z) {
            StringBuilder discarded$12 = ((qs) this).field_z.a((byte) -121, param1, 1 + param2, param3);
        } else {
            StringBuilder discarded$13 = param3.append("null");
            return;
        }
    }

    final boolean a(byte param0, vg param1) {
        int var3 = 0;
        var3 = -6 % ((param0 - 61) / 59);
        if (((qs) this).field_z != null) {
          if (!((qs) this).field_z.a((byte) -97, param1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        if (null != ((qs) this).field_z) {
          ((qs) this).field_z.e((byte) -124);
          var2 = 31 % ((-84 - param0) / 33);
          return;
        } else {
          var2 = 31 % ((-84 - param0) / 33);
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        if (param4 != -600269855) {
          return;
        } else {
          L0: {
            if (null == ((qs) this).field_z) {
              break L0;
            } else {
              ((qs) this).field_z.a(param0, ((qs) this).field_q + param1, param2 + ((qs) this).field_m, param3, -600269855, param5);
              break L0;
            }
          }
          return;
        }
    }

    void h(int param0) {
        Object var3 = null;
        L0: {
          if (null != ((qs) this).field_z) {
            ((qs) this).field_z.d((byte) 70);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 1) {
          var3 = null;
          ((qs) this).a(-10, 20, (vg) null, (byte) 94);
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_y = null;
        if (param0 < 6) {
            field_y = null;
        }
    }

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          if (null != ((qs) this).field_z) {
            if (!((qs) this).field_z.f(param0 + 1)) {
              return false;
            } else {
              L0: {
                if (!((qs) this).field_z.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
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
          field_y = null;
          if (null != ((qs) this).field_z) {
            if (!((qs) this).field_z.f(param0 + 1)) {
              return false;
            } else {
              L1: {
                if (!((qs) this).field_z.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
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

    final static void d(boolean param0) {
        int var1 = 0;
        if (param0) {
          if (-33 > wm.field_b) {
            L0: {
              var1 = wm.field_b % 32;
              if (-1 != var1) {
                break L0;
              } else {
                var1 = 32;
                break L0;
              }
            }
            ak.c(126, -var1 + wm.field_b);
            return;
          } else {
            ak.c(-127, 0);
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, vg param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 9501) {
          if (((qs) this).field_z != null) {
            if (((qs) this).field_z.f(1)) {
              return false;
            } else {
              L0: {
                if (!((qs) this).field_z.a((byte) 1, param1)) {
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
          boolean discarded$4 = ((qs) this).a((byte) -63, (vg) null);
          if (((qs) this).field_z != null) {
            if (((qs) this).field_z.f(1)) {
              return false;
            } else {
              L1: {
                if (!((qs) this).field_z.a((byte) 1, param1)) {
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

    final int e(int param0) {
        if (param0 != -600269855) {
            return -125;
        }
        return null == ((qs) this).field_z ? 0 : ((qs) this).field_z.e(param0 ^ 0);
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            return true;
        }
        return null != ((qs) this).a(2) ? true : false;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 < 99) {
          int discarded$2 = ((qs) this).e(73);
          super.a(param0, param1, (byte) 108, param3, param4);
          ((qs) this).h(1);
          return;
        } else {
          super.a(param0, param1, (byte) 108, param3, param4);
          ((qs) this).h(1);
          return;
        }
    }

    qs(int param0, int param1, int param2, int param3, iq param4, ko param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String c(boolean param0) {
        String var2 = null;
        String var3 = null;
        Object var4 = null;
        if (param0) {
          var2 = super.c(param0);
          if (((qs) this).field_z != null) {
            var3 = ((qs) this).field_z.c(param0);
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
          boolean discarded$2 = this.a(112, (vg) null);
          var2 = super.c(param0);
          if (((qs) this).field_z != null) {
            var3 = ((qs) this).field_z.c(param0);
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

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 0;
        if (((qs) this).a(false, param2, param3, param1)) {
          ((qs) this).a(param1, param2, false, param3);
          ((qs) this).a(81, param1, param2, param3);
          var5 = -117 % ((param0 - 64) / 61);
          return param3;
        } else {
          var5 = -117 % ((param0 - 64) / 61);
          return param3;
        }
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        if (param2 > 95) {
          if (null != ((qs) this).field_z) {
            if (!((qs) this).field_z.a(param0, param1, (byte) 112, param3, param4 - -((qs) this).field_m, ((qs) this).field_q + param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((qs) this).field_z = null;
          if (null != ((qs) this).field_z) {
            if (!((qs) this).field_z.a(param0, param1, (byte) 112, param3, param4 - -((qs) this).field_m, ((qs) this).field_q + param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    vg a(int param0) {
        vg var2 = null;
        if (param0 == 2) {
          var2 = ((qs) this).field_z;
          if (var2 != null) {
            if (!var2.f(param0 ^ 3)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          ((qs) this).field_z = null;
          var2 = ((qs) this).field_z;
          if (var2 != null) {
            if (!var2.f(param0 ^ 3)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((qs) this).field_z)) {
            ((qs) this).field_z.a(((qs) this).field_m + param0, ((qs) this).field_q + param1, param2, (byte) 91);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == -11857) {
          if (param0 == 0) {
            if (((qs) this).field_p == null) {
              L0: {
                if (null != ((qs) this).field_z) {
                  ((qs) this).field_z.a(param0, -11857, ((qs) this).field_q + param2, ((qs) this).field_m + param3);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                ((qs) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
                if (null != ((qs) this).field_z) {
                  ((qs) this).field_z.a(param0, -11857, ((qs) this).field_q + param2, ((qs) this).field_m + param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (null != ((qs) this).field_z) {
                ((qs) this).field_z.a(param0, -11857, ((qs) this).field_q + param2, ((qs) this).field_m + param3);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_y = null;
          if (param0 != 0) {
            L3: {
              if (null != ((qs) this).field_z) {
                ((qs) this).field_z.a(param0, -11857, ((qs) this).field_q + param2, ((qs) this).field_m + param3);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((qs) this).field_p != null) {
                ((qs) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((qs) this).field_z) {
                ((qs) this).field_z.a(param0, -11857, ((qs) this).field_q + param2, ((qs) this).field_m + param3);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        int var5 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackOut_28_0 = false;
        boolean stackOut_27_0 = false;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_6_0 = false;
        boolean stackOut_5_0 = false;
        if (null != ((qs) this).field_z) {
          if (((qs) this).field_z.f(1)) {
            if (!((qs) this).field_z.a(param0, param1, 13, param3)) {
              if (param2 == 13) {
                var5 = param0;
                if (-81 == (var5 ^ -1)) {
                  L0: {
                    if (di.field_p[81]) {
                      stackOut_28_0 = this.a(9501, param3);
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      stackOut_27_0 = this.a(param3, 125);
                      stackIn_29_0 = stackOut_27_0;
                      break L0;
                    }
                  }
                  return stackIn_29_0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param2 == 13) {
              var5 = param0;
              if (-81 == (var5 ^ -1)) {
                L1: {
                  if (di.field_p[81]) {
                    stackOut_17_0 = this.a(9501, param3);
                    stackIn_18_0 = stackOut_17_0;
                    break L1;
                  } else {
                    stackOut_16_0 = this.a(param3, 125);
                    stackIn_18_0 = stackOut_16_0;
                    break L1;
                  }
                }
                return stackIn_18_0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          if (param2 == 13) {
            var5 = param0;
            if (-81 != (var5 ^ -1)) {
              return false;
            } else {
              L2: {
                if (di.field_p[81]) {
                  stackOut_6_0 = this.a(9501, param3);
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = this.a(param3, 125);
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              return stackIn_7_0;
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
