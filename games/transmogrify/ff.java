/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ff extends aj implements fb, df {
    static String field_C;
    static String field_x;
    static ti field_z;
    private boolean field_E;
    private lj field_J;
    private lj field_w;
    private rg field_G;
    static int[] field_H;
    private boolean field_y;
    private rg field_L;
    private boolean field_K;
    private lj field_A;
    private String field_B;
    static hj field_D;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != ((ff) this).field_A) {
                if (param0 == ((ff) this).field_J) {
                  hg.c(0);
                  break L1;
                } else {
                  if (((ff) this).field_w == param0) {
                    if (!((ff) this).field_K) {
                      if (((ff) this).field_E) {
                        kc.a((byte) -128);
                        break L1;
                      } else {
                        qa.b(param1 + -13);
                        break L1;
                      }
                    } else {
                      int discarded$123 = 81;
                      gb.a();
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                int discarded$124 = -123;
                this.d();
                break L1;
              }
            }
            L2: {
              if (param1 == 17) {
                break L2;
              } else {
                ((ff) this).field_A = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("ff.MA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, rg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (((ff) this).field_L == param1) {
                boolean discarded$4 = ((ff) this).field_G.a((qg) this, param0 + -1421);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1330) {
              L2: {
                if (param1 == ((ff) this).field_G) {
                  int discarded$5 = -123;
                  this.d();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ff.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void d() {
        L0: {
          L1: {
            int discarded$8 = -43;
            if (bg.g()) {
              break L1;
            } else {
              if (((ff) this).field_L.field_k.length() <= 0) {
                break L0;
              } else {
                if (((ff) this).field_G.field_k.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          int discarded$9 = -4776;
          hd.a(((ff) this).field_G.field_k, ((ff) this).field_L.field_k);
          break L0;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (!(null == ((ff) this).field_B)) {
            int discarded$0 = vd.field_h.a(((ff) this).field_B, 20 + (((ff) this).field_p + param0), 15 + (((ff) this).field_n + param1), -40 + ((ff) this).field_l, ((ff) this).field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        }
        int var5 = -124 / ((param3 - 77) / 34);
        if (((ff) this).field_J != null) {
            sb.d(10 + param0, param1 - -134, ((ff) this).field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, (byte) 119);
    }

    ff(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ui) null);
        RuntimeException var6 = null;
        qa var6_ref = null;
        kg var7 = null;
        String var8 = null;
        kh var9 = null;
        oc var12 = null;
        oc var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        lj stackIn_17_1 = null;
        lj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        lj stackIn_18_1 = null;
        lj stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        lj stackIn_19_1 = null;
        lj stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        lj stackOut_16_1 = null;
        lj stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        lj stackOut_18_1 = null;
        lj stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        lj stackOut_17_1 = null;
        lj stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ff) this).field_y = stackIn_4_1 != 0;
              ((ff) this).field_B = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param4) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ff) this).field_E = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ff) this).field_K = stackIn_10_1 != 0;
              if (!((ff) this).field_K) {
                break L4;
              } else {
                L5: {
                  if (((ff) this).field_y) {
                    break L5;
                  } else {
                    if (!((ff) this).field_E) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((ff) this).field_L = (rg) (Object) new vc(param0, (ma) this, 100);
              ((ff) this).field_G = (rg) (Object) new vc("", (ma) this, 20);
              if (!((ff) this).field_K) {
                L7: {
                  ((ff) this).field_A = new lj(da.field_B, (ma) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((ff) this).field_E) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = gl.field_z;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = te.field_f;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ff) this).field_w = new lj(stackIn_19_3, (ma) null);
                if (!((ff) this).field_y) {
                  break L6;
                } else {
                  ((ff) this).field_J = new lj(je.field_c, (ma) this);
                  break L6;
                }
              } else {
                ((ff) this).field_A = new lj(rc.field_b, (ma) null);
                ((ff) this).field_w = new lj(ta.field_b, (ma) null);
                ((ff) this).field_L.field_t = false;
                break L6;
              }
            }
            L8: {
              ((ff) this).field_L.field_q = (ui) (Object) new ni(10000536);
              ((ff) this).field_G.field_q = (ui) (Object) new nc(10000536);
              var6_ref = new qa();
              ((ff) this).field_A.field_q = (ui) (Object) var6_ref;
              if (null == ((ff) this).field_w) {
                break L8;
              } else {
                ((ff) this).field_w.field_q = (ui) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((ff) this).field_L.field_j = fc.field_e;
              if (((ff) this).field_J == null) {
                break L9;
              } else {
                ((ff) this).field_J.field_q = (ui) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((ff) this).field_J) {
                break L10;
              } else {
                ((ff) this).field_J.field_j = uf.field_b;
                break L10;
              }
            }
            L11: {
              if (!((ff) this).field_K) {
                if (!((ff) this).field_E) {
                  ((ff) this).field_w.field_q = (ui) (Object) new ek();
                  break L11;
                } else {
                  ((ff) this).field_w.field_j = pa.field_a;
                  ((ff) this).field_w.field_q = (ui) (Object) new ek();
                  break L11;
                }
              } else {
                ((ff) this).field_w.field_j = je.field_a;
                break L11;
              }
            }
            L12: {
              ((ff) this).field_n = 15;
              var7 = vd.field_h;
              if (((ff) this).field_B == null) {
                break L12;
              } else {
                ((ff) this).field_n = ((ff) this).field_n + (var7.a(((ff) this).field_B, ((ff) this).field_l - 40, var7.field_y) + 5);
                break L12;
              }
            }
            L13: {
              var8 = e.field_q;
              var9 = ga.a(125, ha.b(81));
              if (aa.field_d == var9) {
                var8 = pf.field_c;
                break L13;
              } else {
                if (of.field_f != var9) {
                  break L13;
                } else {
                  var8 = te.field_b;
                  break L13;
                }
              }
            }
            L14: {
              oc dupTemp$2 = new oc(10, ((ff) this).field_n, ((ff) this).field_l - 20, 25, (qg) (Object) ((ff) this).field_L, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((ff) this).a((qg) (Object) dupTemp$2, (byte) -83);
              ((ff) this).field_n = ((ff) this).field_n + (((qg) (Object) var12).field_h + 5);
              oc dupTemp$3 = new oc(10, ((ff) this).field_n, ((ff) this).field_l + -20, 25, (qg) (Object) ((ff) this).field_G, false, 80, 3, var7, 16777215, ee.field_y);
              var13 = dupTemp$3;
              ((ff) this).a((qg) (Object) dupTemp$3, (byte) -84);
              ((ff) this).field_n = ((ff) this).field_n + (((qg) (Object) var13).field_h + 5);
              ((ff) this).field_A.field_m = (ma) this;
              if (null == ((ff) this).field_J) {
                break L14;
              } else {
                ((ff) this).field_J.field_m = (ma) this;
                break L14;
              }
            }
            L15: {
              if (((ff) this).field_w == null) {
                break L15;
              } else {
                ((ff) this).field_w.field_m = (ma) this;
                break L15;
              }
            }
            L16: {
              if (null != ((ff) this).field_J) {
                ((ff) this).field_A.a(-116, ((ff) this).field_n, 85, ((ff) this).field_l - 95, 30);
                ((ff) this).field_n = ((ff) this).field_n + 60;
                break L16;
              } else {
                ((ff) this).field_A.a(-102, ((ff) this).field_n, 8, -6 + ((ff) this).field_l + -10, 30);
                ((ff) this).field_n = ((ff) this).field_n + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((ff) this).field_J) {
                break L17;
              } else {
                ((ff) this).field_J.a(92, ((ff) this).field_n, 8, -16 + ((ff) this).field_l, 30);
                ((ff) this).field_n = ((ff) this).field_n + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((ff) this).field_w) {
                break L18;
              } else {
                L19: {
                  if (((ff) this).field_K) {
                    break L19;
                  } else {
                    if (((ff) this).field_E) {
                      break L19;
                    } else {
                      ((ff) this).field_w.a(58, ((ff) this).field_n, 8, 40, 20);
                      ((ff) this).field_n = ((ff) this).field_n + 25;
                      break L18;
                    }
                  }
                }
                ((ff) this).field_w.a(113, ((ff) this).field_n, 8, -6 + ((ff) this).field_l - 10, 30);
                ((ff) this).field_n = ((ff) this).field_n + 35;
                break L18;
              }
            }
            L20: {
              ((ff) this).a(26, 0, 0, ((ff) this).field_l, ((ff) this).field_n + 3);
              ((ff) this).a((qg) (Object) ((ff) this).field_A, (byte) -104);
              if (((ff) this).field_J == null) {
                break L20;
              } else {
                ((ff) this).a((qg) (Object) ((ff) this).field_J, (byte) -96);
                break L20;
              }
            }
            L21: {
              if (((ff) this).field_w == null) {
                break L21;
              } else {
                ((ff) this).a((qg) (Object) ((ff) this).field_w, (byte) -81);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("ff.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(pl param0, boolean param1) {
        try {
            jj.field_a.a(1048576, !param1 ? true : false, 256, 1000000, param0, 100);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ff.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 256 + ',' + 1048576 + ',' + 40 + ')');
        }
    }

    final void a(String param0, int param1) {
        rg var3 = null;
        String var4 = null;
        try {
            if (param1 != 30) {
                ff.m(-73);
            }
            var3 = ((ff) this).field_L;
            var4 = param0;
            var3.a(var4, false, param1 + -29);
            ((ff) this).field_G.i(81);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ff.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 123, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 != 98) {
                var5_int = 39 % ((param2 - 65) / 55);
                if (99 != param0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((ff) this).b(param1, 108);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((ff) this).a(2, param1);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ff.K(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void m(int param0) {
        field_D = null;
        if (param0 <= 119) {
            field_x = null;
        }
        field_H = null;
        field_C = null;
        field_x = null;
        field_z = null;
    }

    public final void a(rg param0, int param1) {
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
              if (param1 < -55) {
                break L1;
              } else {
                ((ff) this).field_K = false;
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
            stackOut_3_1 = new StringBuilder().append("ff.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = 0;
        var2 = -69 / ((-53 - param0) / 57);
        if (null == ((ff) this).field_L.field_k) {
          return "";
        } else {
          return ((ff) this).field_L.field_k;
        }
    }

    final void l(int param0) {
        ((ff) this).field_L.i(81);
        ((ff) this).field_G.i(param0 ^ -31940);
        if (param0 != -31891) {
            field_z = null;
        }
    }

    final static void a() {
        int var1 = 124;
        Object var2 = null;
        ec.a(hf.field_g, -126, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Names can only contain letters, numbers, spaces and underscores";
        field_H = new int[]{7059175, 8189570, 16770707, 16536152};
        field_x = "Not yet achieved";
    }
}
