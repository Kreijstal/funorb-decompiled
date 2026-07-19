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
        this.field_d.a(et.field_c, true, asa.field_a);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ura var6 = null;
        var5 = VoidHunters.field_G;
        this.field_d.g(1, -124);
        if (param2 == 5) {
          if (-1 == (128 & param1 ^ -1)) {
            if ((1 & param0) == 1) {
              if (this.field_g.field_b) {
                this.field_f = (float)(this.field_d.field_pc % 4000) / 4000.0f;
                this.field_d.a(this.field_g.field_d, -118);
                this.field_d.g(0, -64);
                return;
              } else {
                var4 = this.field_d.field_pc % 4000 * 16 / 4000;
                this.field_d.a(this.field_g.field_a[var4], param2 + -126);
                this.field_d.g(0, -64);
                return;
              }
            } else {
              if (!this.field_g.field_b) {
                this.field_d.a(this.field_g.field_a[0], -128);
                this.field_d.g(0, -64);
                return;
              } else {
                this.field_d.a(this.field_g.field_d, -122);
                this.field_d.g(0, -64);
                return;
              }
            }
          } else {
            this.field_d.a((ura) null, -123);
            this.field_d.g(0, -64);
            return;
          }
        } else {
          var6 = (ura) null;
          this.a((byte) -1, -12, (ura) null);
          if (-1 == (128 & param1 ^ -1)) {
            if ((1 & param0) == 1) {
              if (this.field_g.field_b) {
                this.field_f = (float)(this.field_d.field_pc % 4000) / 4000.0f;
                this.field_d.a(this.field_g.field_d, -118);
                this.field_d.g(0, -64);
                return;
              } else {
                var4 = this.field_d.field_pc % 4000 * 16 / 4000;
                this.field_d.a(this.field_g.field_a[var4], param2 + -126);
                this.field_d.g(0, -64);
                return;
              }
            } else {
              if (!this.field_g.field_b) {
                this.field_d.a(this.field_g.field_a[0], -128);
                this.field_d.g(0, -64);
                return;
              } else {
                this.field_d.a(this.field_g.field_d, -122);
                this.field_d.g(0, -64);
                return;
              }
            }
          } else {
            this.field_d.a((ura) null, -123);
            this.field_d.g(0, -64);
            return;
          }
        }
    }

    public static void d(byte param0) {
        int var1 = 93 % ((-34 - param0) / 63);
        field_h = null;
        field_e = null;
    }

    wu(pf param0, rga param1) {
        super(param0);
        this.field_f = 0.0f;
        try {
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_d.g(1, param0 ^ -72);
        this.field_d.a(et.field_c, true, je.field_c);
        this.field_d.a(true, param0 ^ -21120, false, qcb.field_q, 0);
        this.field_d.a(0, (byte) -101, pja.field_l);
        this.field_d.d(-34, 0);
        this.field_d.g(0, -79);
        this.field_d.e(-128, -16777216);
        this.field_d.a(0, (byte) -111, pea.field_d);
        if (param0 != 5) {
          this.d(-88);
          this.d(param0 + 3);
          return;
        } else {
          this.d(param0 + 3);
          return;
        }
    }

    final boolean a(byte param0) {
        int var2 = -105 % ((param0 - 34) / 63);
        return this.field_g.c((byte) 85);
    }

    final void a(int param0) {
        this.field_d.g(1, -59);
        this.field_d.a(asa.field_a, true, asa.field_a);
        this.field_d.a(0, qcb.field_q, param0 ^ 2536);
        this.field_d.a(0, (byte) -101, qcb.field_q);
        this.field_d.d(-70, 1);
        this.field_d.a((ura) null, -124);
        this.field_d.g(0, -62);
        this.field_d.a(0, (byte) -76, qcb.field_q);
        if (param0 != 2543) {
            field_h = (phb) null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        String var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
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
          if ((foa.field_p ^ -1) == -2) {
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
                  if (!param1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L5;
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    break L5;
                  }
                }
                L6: {
                  mjb.field_e = stackIn_31_0 != 0;
                  discarded$5 = di.field_l.a(false, -13027);
                  var6 = mnb.field_d ? 1 : 0;
                  if (bqa.a(false)) {
                    stackOut_33_0 = 7;
                    stackIn_34_0 = stackOut_33_0;
                    break L6;
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_34_0 = stackOut_32_0;
                    break L6;
                  }
                }
                L7: {
                  lha.a(stackIn_34_0, var6 != 0, (byte) -85, -1);
                  dua.field_o = false;
                  aka.field_p = false;
                  bg.field_o = true;
                  idb.field_o = true;
                  if (wh.g(-120)) {
                    dpa.field_p.h(24335, 71);
                    vga.field_b = ldb.field_o;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              } else {
                L8: {
                  if (si.field_o[86]) {
                    param0 = true;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var5 = hob.a(new Random(), 2147483647, 117);
                  if (!param0) {
                    break L9;
                  } else {
                    var4 = 3;
                    qqa.a(true, (byte) -41);
                    break L9;
                  }
                }
                L10: {
                  vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
                  if (!param1) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L10;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L10;
                  }
                }
                L11: {
                  mjb.field_e = stackIn_19_0 != 0;
                  discarded$6 = di.field_l.a(false, -13027);
                  var6 = mnb.field_d ? 1 : 0;
                  if (bqa.a(false)) {
                    stackOut_21_0 = 7;
                    stackIn_22_0 = stackOut_21_0;
                    break L11;
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_22_0 = stackOut_20_0;
                    break L11;
                  }
                }
                L12: {
                  lha.a(stackIn_22_0, var6 != 0, (byte) -85, -1);
                  dua.field_o = false;
                  aka.field_p = false;
                  bg.field_o = true;
                  idb.field_o = true;
                  if (wh.g(-120)) {
                    dpa.field_p.h(24335, 71);
                    vga.field_b = ldb.field_o;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            }
          }
        }
        L13: {
          if (!ssa.b(2)) {
            break L13;
          } else {
            if (!si.field_o[82]) {
              break L13;
            } else {
              var4 = 1;
              break L13;
            }
          }
        }
        if (ssa.b(2)) {
          if (!si.field_o[86]) {
            L14: {
              var5 = hob.a(new Random(), 2147483647, 117);
              if (!param0) {
                break L14;
              } else {
                var4 = 3;
                qqa.a(true, (byte) -41);
                break L14;
              }
            }
            L15: {
              vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
              if (!param1) {
                stackOut_73_0 = 0;
                stackIn_74_0 = stackOut_73_0;
                break L15;
              } else {
                stackOut_72_0 = 1;
                stackIn_74_0 = stackOut_72_0;
                break L15;
              }
            }
            L16: {
              mjb.field_e = stackIn_74_0 != 0;
              discarded$7 = di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              if (bqa.a(false)) {
                stackOut_76_0 = 7;
                stackIn_77_0 = stackOut_76_0;
                break L16;
              } else {
                stackOut_75_0 = 0;
                stackIn_77_0 = stackOut_75_0;
                break L16;
              }
            }
            L17: {
              lha.a(stackIn_77_0, var6 != 0, (byte) -85, -1);
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
          } else {
            L18: {
              param0 = true;
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
              if (!param1) {
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                break L19;
              } else {
                stackOut_60_0 = 1;
                stackIn_62_0 = stackOut_60_0;
                break L19;
              }
            }
            L20: {
              mjb.field_e = stackIn_62_0 != 0;
              discarded$8 = di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              if (bqa.a(false)) {
                stackOut_64_0 = 7;
                stackIn_65_0 = stackOut_64_0;
                break L20;
              } else {
                stackOut_63_0 = 0;
                stackIn_65_0 = stackOut_63_0;
                break L20;
              }
            }
            L21: {
              lha.a(stackIn_65_0, var6 != 0, (byte) -85, -1);
              dua.field_o = false;
              aka.field_p = false;
              bg.field_o = true;
              idb.field_o = true;
              if (wh.g(-120)) {
                dpa.field_p.h(24335, 71);
                vga.field_b = ldb.field_o;
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        } else {
          L22: {
            var5 = hob.a(new Random(), 2147483647, 117);
            if (!param0) {
              break L22;
            } else {
              var4 = 3;
              qqa.a(true, (byte) -41);
              break L22;
            }
          }
          L23: {
            vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
            if (!param1) {
              stackOut_48_0 = 0;
              stackIn_49_0 = stackOut_48_0;
              break L23;
            } else {
              stackOut_47_0 = 1;
              stackIn_49_0 = stackOut_47_0;
              break L23;
            }
          }
          L24: {
            mjb.field_e = stackIn_49_0 != 0;
            discarded$9 = di.field_l.a(false, -13027);
            var6 = mnb.field_d ? 1 : 0;
            if (bqa.a(false)) {
              stackOut_51_0 = 7;
              stackIn_52_0 = stackOut_51_0;
              break L24;
            } else {
              stackOut_50_0 = 0;
              stackIn_52_0 = stackOut_50_0;
              break L24;
            }
          }
          L25: {
            lha.a(stackIn_52_0, var6 != 0, (byte) -85, -1);
            dua.field_o = false;
            aka.field_p = false;
            bg.field_o = true;
            idb.field_o = true;
            if (wh.g(-120)) {
              dpa.field_p.h(24335, 71);
              vga.field_b = ldb.field_o;
              break L25;
            } else {
              break L25;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        oj var2 = null;
        oj var3 = null;
        ura var4 = null;
        L0: {
          if (0 == this.field_d.t((byte) 9)) {
            var2 = this.field_d.p(0);
            this.field_d.g(1, -90);
            var3 = this.field_d.H((byte) 82);
            var3.a(var2, 16383);
            var3.b(-3286, 0.125f, 0.125f, 1.0f);
            var3.a(this.field_f, 0.0f, 0.0f, (byte) 13);
            this.field_d.a(wda.field_o, true);
            this.field_d.g(0, -52);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 8) {
          var4 = (ura) null;
          this.a((byte) -37, 101, (ura) null);
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
              this.field_d.a(param2, -124);
              if (param0 > 42) {
                break L1;
              } else {
                field_h = (phb) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wu.E(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_e = "<%0> has entered another game.";
    }
}
