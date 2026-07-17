/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wu extends uda {
    private float field_f;
    static phb field_h;
    static String field_e;
    private rga field_g;

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            return;
        }
        ((wu) this).field_d.a(et.field_c, true, asa.field_a);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = VoidHunters.field_G;
        ((wu) this).field_d.g(1, -124);
        if (param2 == 5) {
          if ((128 & param1) == 0) {
            if ((1 & param0) == 1) {
              if (((wu) this).field_g.field_b) {
                ((wu) this).field_f = (float)(((wu) this).field_d.field_pc % 4000) / 4000.0f;
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_d, -118);
                ((wu) this).field_d.g(0, -64);
                return;
              } else {
                var4 = ((wu) this).field_d.field_pc % 4000 * 16 / 4000;
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_a[var4], param2 + -126);
                ((wu) this).field_d.g(0, -64);
                return;
              }
            } else {
              if (!((wu) this).field_g.field_b) {
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_a[0], -128);
                ((wu) this).field_d.g(0, -64);
                return;
              } else {
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_d, -122);
                ((wu) this).field_d.g(0, -64);
                return;
              }
            }
          } else {
            ((wu) this).field_d.a((ura) null, -123);
            ((wu) this).field_d.g(0, -64);
            return;
          }
        } else {
          var6 = null;
          ((wu) this).a((byte) -1, -12, (ura) null);
          if ((128 & param1) == 0) {
            if ((1 & param0) == 1) {
              if (((wu) this).field_g.field_b) {
                ((wu) this).field_f = (float)(((wu) this).field_d.field_pc % 4000) / 4000.0f;
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_d, -118);
                ((wu) this).field_d.g(0, -64);
                return;
              } else {
                var4 = ((wu) this).field_d.field_pc % 4000 * 16 / 4000;
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_a[var4], param2 + -126);
                ((wu) this).field_d.g(0, -64);
                return;
              }
            } else {
              if (!((wu) this).field_g.field_b) {
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_a[0], -128);
                ((wu) this).field_d.g(0, -64);
                return;
              } else {
                ((wu) this).field_d.a((ura) (Object) ((wu) this).field_g.field_d, -122);
                ((wu) this).field_d.g(0, -64);
                return;
              }
            }
          } else {
            ((wu) this).field_d.a((ura) null, -123);
            ((wu) this).field_d.g(0, -64);
            return;
          }
        }
    }

    public static void d() {
        int var1 = 0;
        field_h = null;
        field_e = null;
    }

    wu(pf param0, rga param1) {
        super(param0);
        ((wu) this).field_f = 0.0f;
        try {
            ((wu) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "wu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1) {
        ((wu) this).field_d.g(1, param0 ^ -72);
        ((wu) this).field_d.a(et.field_c, true, je.field_c);
        ((wu) this).field_d.a(true, param0 ^ -21120, false, qcb.field_q, 0);
        ((wu) this).field_d.a(0, (byte) -101, pja.field_l);
        ((wu) this).field_d.d(-34, 0);
        ((wu) this).field_d.g(0, -79);
        ((wu) this).field_d.e(-128, -16777216);
        ((wu) this).field_d.a(0, (byte) -111, pea.field_d);
        if (param0 != 5) {
          ((wu) this).d(-88);
          ((wu) this).d(param0 + 3);
          return;
        } else {
          ((wu) this).d(param0 + 3);
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -105 % ((param0 - 34) / 63);
        return ((wu) this).field_g.c((byte) 85);
    }

    final void a(int param0) {
        ((wu) this).field_d.g(1, -59);
        ((wu) this).field_d.a(asa.field_a, true, asa.field_a);
        ((wu) this).field_d.a(0, qcb.field_q, param0 ^ 2536);
        ((wu) this).field_d.a(0, (byte) -101, qcb.field_q);
        ((wu) this).field_d.d(-70, 1);
        ((wu) this).field_d.a((ura) null, -124);
        ((wu) this).field_d.g(0, -62);
        ((wu) this).field_d.a(0, (byte) -76, qcb.field_q);
        if (param0 != 2543) {
            field_h = null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        String var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          var2 = kca.field_a;
          if (var2 != null) {
            break L0;
          } else {
            var2 = "You";
            break L0;
          }
        }
        L1: {
          var3 = new String[]{var2};
          if (foa.field_p == 1) {
            var3 = new String[]{var2, null, null, null, null, null};
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = 2;
          if (!ssa.b(2)) {
            break L2;
          } else {
            if (si.field_o[81]) {
              var4 = 0;
              break L2;
            } else {
              L3: {
                if (!ssa.b(2)) {
                  break L3;
                } else {
                  if (!si.field_o[82]) {
                    break L3;
                  } else {
                    var4 = 1;
                    break L3;
                  }
                }
              }
              if (!ssa.b(2)) {
                L4: {
                  var5 = hob.a(new Random(), 2147483647, 117);
                  if (!param0) {
                    break L4;
                  } else {
                    var4 = 3;
                    qqa.a(true, (byte) -41);
                    break L4;
                  }
                }
                L5: {
                  vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
                  mjb.field_e = false;
                  int discarded$5 = di.field_l.a(false, -13027);
                  var6 = mnb.field_d ? 1 : 0;
                  if (bqa.a(false)) {
                    stackOut_27_0 = 7;
                    stackIn_28_0 = stackOut_27_0;
                    break L5;
                  } else {
                    stackOut_26_0 = 0;
                    stackIn_28_0 = stackOut_26_0;
                    break L5;
                  }
                }
                L6: {
                  lha.a(stackIn_28_0, var6 != 0, (byte) -85, -1);
                  dua.field_o = false;
                  aka.field_p = false;
                  bg.field_o = true;
                  idb.field_o = true;
                  if (wh.g(-120)) {
                    dpa.field_p.h(24335, 71);
                    vga.field_b = ldb.field_o;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                L7: {
                  if (si.field_o[86]) {
                    param0 = true;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var5 = hob.a(new Random(), 2147483647, 117);
                  if (!param0) {
                    break L8;
                  } else {
                    var4 = 3;
                    qqa.a(true, (byte) -41);
                    break L8;
                  }
                }
                L9: {
                  vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
                  mjb.field_e = false;
                  int discarded$6 = di.field_l.a(false, -13027);
                  var6 = mnb.field_d ? 1 : 0;
                  if (bqa.a(false)) {
                    stackOut_18_0 = 7;
                    stackIn_19_0 = stackOut_18_0;
                    break L9;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L9;
                  }
                }
                L10: {
                  lha.a(stackIn_19_0, var6 != 0, (byte) -85, -1);
                  dua.field_o = false;
                  aka.field_p = false;
                  bg.field_o = true;
                  idb.field_o = true;
                  if (wh.g(-120)) {
                    dpa.field_p.h(24335, 71);
                    vga.field_b = ldb.field_o;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return;
              }
            }
          }
        }
        L11: {
          if (!ssa.b(2)) {
            break L11;
          } else {
            if (!si.field_o[82]) {
              break L11;
            } else {
              var4 = 1;
              break L11;
            }
          }
        }
        if (ssa.b(2)) {
          if (!si.field_o[86]) {
            L12: {
              var5 = hob.a(new Random(), 2147483647, 117);
              if (!param0) {
                break L12;
              } else {
                var4 = 3;
                qqa.a(true, (byte) -41);
                break L12;
              }
            }
            L13: {
              vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
              mjb.field_e = false;
              int discarded$7 = di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              if (bqa.a(false)) {
                stackOut_61_0 = 7;
                stackIn_62_0 = stackOut_61_0;
                break L13;
              } else {
                stackOut_60_0 = 0;
                stackIn_62_0 = stackOut_60_0;
                break L13;
              }
            }
            L14: {
              lha.a(stackIn_62_0, var6 != 0, (byte) -85, -1);
              dua.field_o = false;
              aka.field_p = false;
              bg.field_o = true;
              idb.field_o = true;
              if (wh.g(-120)) {
                dpa.field_p.h(24335, 71);
                vga.field_b = ldb.field_o;
                break L14;
              } else {
                break L14;
              }
            }
            return;
          } else {
            L15: {
              param0 = true;
              var5 = hob.a(new Random(), 2147483647, 117);
              if (!param0) {
                break L15;
              } else {
                var4 = 3;
                qqa.a(true, (byte) -41);
                break L15;
              }
            }
            L16: {
              vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
              mjb.field_e = false;
              int discarded$8 = di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              if (bqa.a(false)) {
                stackOut_52_0 = 7;
                stackIn_53_0 = stackOut_52_0;
                break L16;
              } else {
                stackOut_51_0 = 0;
                stackIn_53_0 = stackOut_51_0;
                break L16;
              }
            }
            L17: {
              lha.a(stackIn_53_0, var6 != 0, (byte) -85, -1);
              dua.field_o = false;
              aka.field_p = false;
              bg.field_o = true;
              idb.field_o = true;
              if (wh.g(-120)) {
                dpa.field_p.h(24335, 71);
                vga.field_b = ldb.field_o;
                break L17;
              } else {
                break L17;
              }
            }
            return;
          }
        } else {
          L18: {
            var5 = hob.a(new Random(), 2147483647, 117);
            if (!param0) {
              break L18;
            } else {
              var4 = 3;
              qqa.a(true, (byte) -41);
              break L18;
            }
          }
          L19: {
            vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
            mjb.field_e = false;
            int discarded$9 = di.field_l.a(false, -13027);
            var6 = mnb.field_d ? 1 : 0;
            if (bqa.a(false)) {
              stackOut_42_0 = 7;
              stackIn_43_0 = stackOut_42_0;
              break L19;
            } else {
              stackOut_41_0 = 0;
              stackIn_43_0 = stackOut_41_0;
              break L19;
            }
          }
          L20: {
            lha.a(stackIn_43_0, var6 != 0, (byte) -85, -1);
            dua.field_o = false;
            aka.field_p = false;
            bg.field_o = true;
            idb.field_o = true;
            if (wh.g(-120)) {
              dpa.field_p.h(24335, 71);
              vga.field_b = ldb.field_o;
              break L20;
            } else {
              break L20;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        oj var2 = null;
        oj var3 = null;
        Object var4 = null;
        L0: {
          if (0 == ((wu) this).field_d.t((byte) 9)) {
            var2 = ((wu) this).field_d.p(0);
            ((wu) this).field_d.g(1, -90);
            var3 = ((wu) this).field_d.H((byte) 82);
            var3.a((pw) (Object) var2, 16383);
            var3.b(-3286, 0.125f, 0.125f, 1.0f);
            var3.a(((wu) this).field_f, 0.0f, 0.0f, (byte) 13);
            ((wu) this).field_d.a(wda.field_o, true);
            ((wu) this).field_d.g(0, -52);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 8) {
          var4 = null;
          ((wu) this).a((byte) -37, 101, (ura) null);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ura param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((wu) this).field_d.a(param2, -124);
              if (param0 > 42) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wu.E(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has entered another game.";
    }
}
