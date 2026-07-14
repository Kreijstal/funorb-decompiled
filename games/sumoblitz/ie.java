/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ie extends pk implements ug {
    static int field_x;
    pk field_y;

    private final boolean a(boolean param0, pk param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          if (((ie) this).field_y != null) {
            if (((ie) this).field_y.d(-1)) {
              return false;
            } else {
              L0: {
                if (!((ie) this).field_y.a(param1, (byte) 61)) {
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
          ((ie) this).field_y = null;
          if (((ie) this).field_y != null) {
            if (((ie) this).field_y.d(-1)) {
              return false;
            } else {
              L1: {
                if (!((ie) this).field_y.a(param1, (byte) 61)) {
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

    final static jj[] a(int param0) {
        Object var2 = null;
        if (param0 != 32) {
          var2 = null;
          ie.a(-3, (String) null, (java.applet.Applet) null);
          return new jj[]{go.field_m, tr.field_j, na.field_c};
        } else {
          return new jj[]{go.field_m, tr.field_j, na.field_c};
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        StringBuilder discarded$8 = param1.append(10);
        if (param3 != -43) {
          int discarded$9 = ((ie) this).e(-119);
          var5 = 0;
          L0: while (true) {
            if (param0 < var5) {
              L1: {
                if (null != ((ie) this).field_y) {
                  StringBuilder discarded$10 = ((ie) this).field_y.a(1 + param0, param2, param1, 0);
                  break L1;
                } else {
                  StringBuilder discarded$11 = param1.append("null");
                  break L1;
                }
              }
              return;
            } else {
              StringBuilder discarded$12 = param1.append(32);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (param0 < var5) {
              L3: {
                if (null != ((ie) this).field_y) {
                  StringBuilder discarded$13 = ((ie) this).field_y.a(1 + param0, param2, param1, 0);
                  break L3;
                } else {
                  StringBuilder discarded$14 = param1.append("null");
                  break L3;
                }
              }
              return;
            } else {
              StringBuilder discarded$15 = param1.append(32);
              var5++;
              continue L2;
            }
          }
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 < -42) {
          if (((ie) this).field_y != null) {
            if (!((ie) this).field_y.a(param0, -124, param2, param3, param4 + ((ie) this).field_r, param5, param6 + ((ie) this).field_v)) {
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

    final boolean a(pk param0, byte param1) {
        if (param1 == 61) {
          if (((ie) this).field_y != null) {
            if (!((ie) this).field_y.a(param0, (byte) 61)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ie) this).a(-20, -76, (byte) -66, -38);
          if (((ie) this).field_y != null) {
            if (!((ie) this).field_y.a(param0, (byte) 61)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        if (((ie) this).field_y != null) {
          ((ie) this).field_y.c((byte) 121);
          var2 = 71 % ((param0 - 64) / 51);
          return;
        } else {
          var2 = 71 % ((param0 - 64) / 51);
          return;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (((ie) this).field_w != null) {
              ((ie) this).field_w.a((pk) this, param1, 5592405, true, param0);
              break L0;
            } else {
              if (null != ((ie) this).field_y) {
                ((ie) this).field_y.a(((ie) this).field_r + param0, ((ie) this).field_v + param1, (byte) -38, param3);
                if (param2 <= -35) {
                  return;
                } else {
                  int discarded$8 = ((ie) this).e(31);
                  return;
                }
              } else {
                if (param2 > -35) {
                  int discarded$9 = ((ie) this).e(31);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (null == ((ie) this).field_y) {
          if (param2 > -35) {
            int discarded$10 = ((ie) this).e(31);
            return;
          } else {
            return;
          }
        } else {
          ((ie) this).field_y.a(((ie) this).field_r + param0, ((ie) this).field_v + param1, (byte) -38, param3);
          if (param2 > -35) {
            int discarded$11 = ((ie) this).e(31);
            return;
          } else {
            return;
          }
        }
    }

    final int e(int param0) {
        int var2 = 47 % ((-10 - param0) / 46);
        return ((ie) this).field_y == null ? 0 : ((ie) this).field_y.e(-66);
    }

    void d(boolean param0) {
        if (!(((ie) this).field_y == null)) {
            ((ie) this).field_y.c(param0);
        }
        if (param0) {
            field_x = 127;
            return;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackOut_25_0 = false;
        boolean stackOut_24_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_4_0 = false;
        boolean stackOut_3_0 = false;
        if (((ie) this).field_y != null) {
          if (((ie) this).field_y.d(-1)) {
            if (!((ie) this).field_y.a(param0, param1, (byte) 64, param3)) {
              var5 = param3;
              if (var5 != 80) {
                if (param2 < 9) {
                  ((ie) this).field_y = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                L0: {
                  if (hw.field_b[81]) {
                    stackOut_25_0 = this.a(false, param0);
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = this.a(param0, false);
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                return stackIn_26_0;
              }
            } else {
              return true;
            }
          } else {
            var5 = param3;
            if (var5 != 80) {
              if (param2 < 9) {
                ((ie) this).field_y = null;
                return false;
              } else {
                return false;
              }
            } else {
              L1: {
                if (hw.field_b[81]) {
                  stackOut_14_0 = this.a(false, param0);
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = this.a(param0, false);
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              return stackIn_15_0;
            }
          }
        } else {
          var5 = param3;
          if (var5 != 80) {
            if (param2 < 9) {
              ((ie) this).field_y = null;
              return false;
            } else {
              return false;
            }
          } else {
            L2: {
              if (hw.field_b[81]) {
                stackOut_4_0 = this.a(false, param0);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = this.a(param0, false);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5 = -91 / ((param1 - -25) / 45);
        super.a(param0, -84, param2, param3);
        if (!(null == ((ie) this).field_y)) {
            ((ie) this).field_y.a(((ie) this).field_r + param0, -109, param2, param3 + ((ie) this).field_v);
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            return false;
        }
        return ((ie) this).f(16777216) != null ? true : false;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var6 = null;
            String var5 = null;
            String var8 = null;
            int var3 = -31 % ((-22 - param0) / 49);
            js.field_J = param1;
            try {
                var7 = param2.getParameter("cookieprefix");
                var6 = var7;
                var5 = param2.getParameter("cookiehost");
                var6 = var5;
                var8 = var7 + "session=" + param1 + "; version=1; path=/; domain=" + var5;
                var6 = var8;
                if (-1 != (param1.length() ^ -1)) {
                    var6 = var8;
                } else {
                    var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                tw.a("document.cookie=\"" + var6 + "\"", -15428, param2);
            } catch (Throwable throwable) {
            }
            va.a(false, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!((ie) this).a(param0, param1, 103, param2)) {
          if (param3 != 0) {
            ((ie) this).a(-113, -16, (byte) 74, 71);
            return param2;
          } else {
            return param2;
          }
        } else {
          ((ie) this).a(param0, (byte) -128, param2, param1);
          ((ie) this).a(param0, param2, param1, (byte) -43);
          if (param3 == 0) {
            return param2;
          } else {
            ((ie) this).a(-113, -16, (byte) 74, 71);
            return param2;
          }
        }
    }

    pk f(int param0) {
        pk var2 = null;
        if (param0 != 16777216) {
            ((ie) this).field_y = null;
            var2 = ((ie) this).field_y;
            if (var2 == null) {
                return null;
            }
            if (!(!var2.d(-1))) {
                return var2;
            }
            return null;
        }
        var2 = ((ie) this).field_y;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.d(-1))) {
            return var2;
        }
        return null;
    }

    void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (((ie) this).field_y != null) {
            ((ie) this).field_y.a(param0, param1, ((ie) this).field_r + param2, param3, param4, param5 + ((ie) this).field_v);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          field_x = -44;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -17 / ((28 - param0) / 63);
        super.a(117, param1, param2, param3, param4);
        ((ie) this).d(false);
    }

    ie(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String c(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.c(param0);
        if (null != ((ie) this).field_y) {
          var3 = ((ie) this).field_y.c(-6696);
          if (var3 != null) {
            return var3;
          } else {
            return var2;
          }
        } else {
          return var2;
        }
    }

    private final boolean a(pk param0, boolean param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param1) {
          if (null != ((ie) this).field_y) {
            if (((ie) this).field_y.d(-1)) {
              return false;
            } else {
              L0: {
                if (!((ie) this).field_y.a(param0, (byte) 61)) {
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
          boolean discarded$3 = this.a((pk) null, false);
          if (null != ((ie) this).field_y) {
            if (((ie) this).field_y.d(-1)) {
              return false;
            } else {
              L1: {
                if (!((ie) this).field_y.a(param0, (byte) 61)) {
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

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param2 == -1) {
          if (null != ((ie) this).field_y) {
            if (!((ie) this).field_y.d(-1)) {
              return false;
            } else {
              L0: {
                if (!((ie) this).field_y.a(param0, param1, param2 + 0, param3, param4, param5, param6)) {
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

    static {
    }
}
