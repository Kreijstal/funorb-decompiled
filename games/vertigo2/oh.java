/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oh extends iq implements dq {
    static String field_E;
    static nj field_D;
    iq field_C;
    static volatile boolean field_F;

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        StringBuilder discarded$5 = param3.append(10);
        if (param0 != 1000) {
            return;
        }
        for (var5 = 0; param2 >= var5; var5++) {
            StringBuilder discarded$6 = param3.append(32);
        }
        if (null != ((oh) this).field_C) {
            StringBuilder discarded$8 = ((oh) this).field_C.a(param1, 1 + param2, (byte) -79, param3);
        } else {
            StringBuilder discarded$9 = param3.append("null");
            return;
        }
    }

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        vb var3 = null;
        if (param2 != null) {
          if (136 < param2.length) {
            var3 = new vb();
            ((dh) (Object) var3).a(param2, true);
            return (Object) (Object) var3;
          } else {
            if (param1) {
              if (!param0) {
                return (Object) (Object) param2;
              } else {
                return (Object) (Object) kk.a(param2, (byte) 103);
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    iq a(int param0) {
        iq var2 = null;
        if (param0 != 15197) {
            field_D = null;
            var2 = ((oh) this).field_C;
            if (var2 == null) {
                return null;
            }
            if (!(!var2.f(68))) {
                return var2;
            }
            return null;
        }
        var2 = ((oh) this).field_C;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.f(68))) {
            return var2;
        }
        return null;
    }

    final static void a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = ed.field_n;
        var3 = gb.field_d;
        if (param1) {
          field_D = null;
          var4 = ee.field_b.field_z.b(param0, 500);
          var5 = ee.field_b.field_z.a(param0, 500) + 6;
          var6 = r.field_f * var4 + 2;
          var7 = jf.a(var5, 12, var2, 1);
          var8 = dm.a(20, 0, var6, var3);
          bi.e(var7, var8, var5, var6, 0);
          bi.b(1 + var7, var8 + 1, var5 + -2, var6 - 2, 16777088);
          int discarded$2 = ee.field_b.field_z.a(param0, var7 + 3, -ee.field_b.field_z.field_z + (1 + (var8 - -hc.field_b)), 500, 1000, 0, -1, 0, 0, r.field_f);
          return;
        } else {
          var4 = ee.field_b.field_z.b(param0, 500);
          var5 = ee.field_b.field_z.a(param0, 500) + 6;
          var6 = r.field_f * var4 + 2;
          var7 = jf.a(var5, 12, var2, 1);
          var8 = dm.a(20, 0, var6, var3);
          bi.e(var7, var8, var5, var6, 0);
          bi.b(1 + var7, var8 + 1, var5 + -2, var6 - 2, 16777088);
          int discarded$3 = ee.field_b.field_z.a(param0, var7 + 3, -ee.field_b.field_z.field_z + (1 + (var8 - -hc.field_b)), 500, 1000, 0, -1, 0, 0, r.field_f);
          return;
        }
    }

    final boolean a(byte param0, iq param1) {
        if (param0 == 116) {
          if (((oh) this).field_C != null) {
            if (!((oh) this).field_C.a((byte) 116, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_F = true;
          if (((oh) this).field_C != null) {
            if (!((oh) this).field_C.a((byte) 116, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final int c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -97) {
          L0: {
            field_E = null;
            if (null != ((oh) this).field_C) {
              stackOut_7_0 = ((oh) this).field_C.c((byte) -105);
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
            if (null != ((oh) this).field_C) {
              stackOut_3_0 = ((oh) this).field_C.c((byte) -105);
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

    void a(byte param0, int param1, int param2, iq param3) {
        Object var6 = null;
        super.a((byte) 112, param1, param2, param3);
        if (param0 <= 6) {
          L0: {
            var6 = null;
            oh.a((String) null, false);
            if (null != ((oh) this).field_C) {
              ((oh) this).field_C.a((byte) 14, ((oh) this).field_o + param1, ((oh) this).field_t + param2, param3);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((oh) this).field_C) {
              ((oh) this).field_C.a((byte) 14, ((oh) this).field_o + param1, ((oh) this).field_t + param2, param3);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        if (param1 != 46) {
          return;
        } else {
          L0: {
            if (((oh) this).field_C != null) {
              ((oh) this).field_C.a(param0, (byte) 46, param2 + ((oh) this).field_o, param3 + ((oh) this).field_t, param4, param5);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    String a(boolean param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.a(param0);
        if (((oh) this).field_C != null) {
          var3 = ((oh) this).field_C.a(false);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != 0) {
            break L0;
          } else {
            if (null != ((oh) this).field_B) {
              ((oh) this).field_B.a(true, param2, true, (iq) this, param3);
              break L0;
            } else {
              if (((oh) this).field_C != null) {
                ((oh) this).field_C.a(param0, param1, ((oh) this).field_o + param2, ((oh) this).field_t + param3);
                if (!param0) {
                  return;
                } else {
                  field_D = null;
                  return;
                }
              } else {
                if (param0) {
                  field_D = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (((oh) this).field_C == null) {
          if (param0) {
            field_D = null;
            return;
          } else {
            return;
          }
        } else {
          ((oh) this).field_C.a(param0, param1, ((oh) this).field_o + param2, ((oh) this).field_t + param3);
          if (param0) {
            field_D = null;
            return;
          } else {
            return;
          }
        }
    }

    void a(byte param0) {
        if (null == ((oh) this).field_C) {
          if (param0 < 93) {
            int discarded$4 = ((oh) this).c((byte) 67);
            return;
          } else {
            return;
          }
        } else {
          ((oh) this).field_C.g(-63);
          if (param0 >= 93) {
            return;
          } else {
            int discarded$5 = ((oh) this).c((byte) 67);
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((oh) this).a((byte) 96);
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (!((oh) this).a(param3, -1, param1, param0)) {
          if (param2 != -79) {
            return null;
          } else {
            return param3;
          }
        } else {
          ((oh) this).a(param0, param3, true, param1);
          ((oh) this).a(param2 ^ -935, param0, param1, param3);
          if (param2 != -79) {
            return null;
          } else {
            return param3;
          }
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 3) {
          L0: {
            int discarded$11 = ((oh) this).c((byte) 103);
            if (null == ((oh) this).a(15197)) {
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
            if (null == ((oh) this).a(15197)) {
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

    boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        Object var9 = null;
        if (param5 < -107) {
          if (((oh) this).field_C != null) {
            if (!((oh) this).field_C.a(param0, param1 - -((oh) this).field_o, ((oh) this).field_t + param2, param3, param4, (byte) -116, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var9 = null;
          ((oh) this).a((byte) -57, -98, -76, (iq) null);
          if (((oh) this).field_C != null) {
            if (!((oh) this).field_C.a(param0, param1 - -((oh) this).field_o, ((oh) this).field_t + param2, param3, param4, (byte) -116, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var8 = -119 % ((-87 - param5) / 35);
        if (((oh) this).field_C != null) {
          if (!((oh) this).field_C.f(48)) {
            return false;
          } else {
            L0: {
              if (!((oh) this).field_C.a(param0, param1, param2, param3, param4, (byte) 126, param6)) {
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

    final static u[] a(byte param0, String param1, String param2, r param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param0 != -39) {
          var6 = null;
          Object discarded$2 = oh.a(true, true, (byte[]) null);
          var4 = param3.a((byte) 123, param2);
          var5 = param3.a(var4, param1, 101);
          return an.a(var5, param3, var4, (byte) 120);
        } else {
          var4 = param3.a((byte) 123, param2);
          var5 = param3.a(var4, param1, 101);
          return an.a(var5, param3, var4, (byte) 120);
        }
    }

    oh(int param0, int param1, int param2, int param3, ur param4, uf param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean a(int param0, iq param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 21) {
          if (((oh) this).field_C != null) {
            if (((oh) this).field_C.f(38)) {
              return false;
            } else {
              L0: {
                if (!((oh) this).field_C.a((byte) 116, param1)) {
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
          if (((oh) this).field_C != null) {
            if (((oh) this).field_C.f(38)) {
              return false;
            } else {
              L1: {
                if (!((oh) this).field_C.a((byte) 116, param1)) {
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

    final boolean a(char param0, int param1, int param2, iq param3) {
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
        if (null != ((oh) this).field_C) {
          if (((oh) this).field_C.f(85)) {
            if (!((oh) this).field_C.a(param0, param1 + 0, param2, param3)) {
              if (param1 == 13) {
                var5 = param2;
                if (var5 == 80) {
                  L0: {
                    if (!cr.field_eb[81]) {
                      stackOut_28_0 = this.a(param3, 16777088);
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      stackOut_27_0 = this.a(78, param3);
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
            if (param1 == 13) {
              var5 = param2;
              if (var5 == 80) {
                L1: {
                  if (!cr.field_eb[81]) {
                    stackOut_17_0 = this.a(param3, 16777088);
                    stackIn_18_0 = stackOut_17_0;
                    break L1;
                  } else {
                    stackOut_16_0 = this.a(78, param3);
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
          if (param1 == 13) {
            var5 = param2;
            if (var5 != 80) {
              return false;
            } else {
              L2: {
                if (!cr.field_eb[81]) {
                  stackOut_6_0 = this.a(param3, 16777088);
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = this.a(78, param3);
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

    private final boolean a(iq param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 16777088) {
          if (null != ((oh) this).field_C) {
            if (((oh) this).field_C.f(param1 ^ 16777102)) {
              return false;
            } else {
              L0: {
                if (!((oh) this).field_C.a((byte) 116, param0)) {
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
          field_E = null;
          if (null != ((oh) this).field_C) {
            if (((oh) this).field_C.f(param1 ^ 16777102)) {
              return false;
            } else {
              L1: {
                if (!((oh) this).field_C.a((byte) 116, param0)) {
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

    final void d(byte param0) {
        if (param0 != 2) {
          L0: {
            ((oh) this).a(true, -64, 58, -19);
            if (null != ((oh) this).field_C) {
              ((oh) this).field_C.d((byte) 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((oh) this).field_C) {
              ((oh) this).field_C.d((byte) 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void e(byte param0) {
        Object var2 = null;
        if (param0 >= -95) {
          var2 = null;
          oh.a((String) null, false);
          field_E = null;
          field_D = null;
          return;
        } else {
          field_E = null;
          field_D = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_F = false;
        field_D = new nj();
    }
}
