/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pe extends hn implements wm, ng {
    static String field_M;
    private lg field_B;
    private boolean field_I;
    private lg field_D;
    static t field_J;
    private String field_N;
    private lg field_K;
    private boolean field_F;
    private tk field_C;
    static uc field_E;
    private tk field_L;
    private boolean field_G;
    static char[] field_H;

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var5_int = -115 / ((-33 - param3) / 57);
            if (!super.a(param0, param1, param2, -117)) {
              if (param0 != 98) {
                if (param0 == 99) {
                  stackOut_8_0 = ((pe) this).b(param1, -9928);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((pe) this).a((byte) -94, param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("pe.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    final void h(int param0) {
        ((pe) this).field_C.i((byte) 85);
        if (param0 != 16180) {
            return;
        }
        ((pe) this).field_L.i((byte) 77);
    }

    pe(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (el) null);
        RuntimeException var6 = null;
        rf var6_ref = null;
        uc var7 = null;
        String var8 = null;
        he var9 = null;
        na var12 = null;
        na var13 = null;
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
        lg stackIn_17_1 = null;
        lg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        lg stackIn_18_1 = null;
        lg stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        lg stackIn_19_1 = null;
        lg stackIn_19_2 = null;
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
        lg stackOut_16_1 = null;
        lg stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        lg stackOut_18_1 = null;
        lg stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        lg stackOut_17_1 = null;
        lg stackOut_17_2 = null;
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
              if (!param4) {
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
              ((pe) this).field_F = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
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
              ((pe) this).field_G = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
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
              ((pe) this).field_I = stackIn_10_1 != 0;
              ((pe) this).field_N = param1;
              if (!((pe) this).field_G) {
                break L4;
              } else {
                L5: {
                  if (((pe) this).field_I) {
                    break L5;
                  } else {
                    if (!((pe) this).field_F) {
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
              ((pe) this).field_C = (tk) (Object) new gp(param0, (ca) this, 100);
              ((pe) this).field_L = (tk) (Object) new gp("", (ca) this, 20);
              if (!((pe) this).field_G) {
                L7: {
                  ((pe) this).field_K = new lg(qp.field_r, (ca) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!((pe) this).field_F) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = qh.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = ha.field_c;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((pe) this).field_B = new lg(stackIn_19_3, (ca) null);
                if (!((pe) this).field_I) {
                  break L6;
                } else {
                  ((pe) this).field_D = new lg(qh.field_e, (ca) this);
                  break L6;
                }
              } else {
                ((pe) this).field_K = new lg(qm.field_b, (ca) null);
                ((pe) this).field_B = new lg(pf.field_q, (ca) null);
                ((pe) this).field_C.field_x = false;
                break L6;
              }
            }
            L8: {
              ((pe) this).field_C.field_q = (el) (Object) new ig(10000536);
              ((pe) this).field_L.field_q = (el) (Object) new io(10000536);
              var6_ref = new rf();
              ((pe) this).field_K.field_q = (el) (Object) var6_ref;
              if (null == ((pe) this).field_B) {
                break L8;
              } else {
                ((pe) this).field_B.field_q = (el) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((pe) this).field_D == null) {
                break L9;
              } else {
                ((pe) this).field_D.field_q = (el) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((pe) this).field_C.field_n = eo.field_e;
              if (((pe) this).field_D == null) {
                break L10;
              } else {
                ((pe) this).field_D.field_n = um.field_q;
                break L10;
              }
            }
            L11: {
              if (((pe) this).field_G) {
                ((pe) this).field_B.field_n = qg.field_v;
                break L11;
              } else {
                if (((pe) this).field_F) {
                  ((pe) this).field_B.field_n = ll.field_m;
                  ((pe) this).field_B.field_q = (el) (Object) new je();
                  break L11;
                } else {
                  ((pe) this).field_B.field_q = (el) (Object) new je();
                  break L11;
                }
              }
            }
            L12: {
              ((pe) this).field_k = 15;
              var7 = dg.field_e;
              if (((pe) this).field_N == null) {
                break L12;
              } else {
                ((pe) this).field_k = ((pe) this).field_k + (5 + var7.a(((pe) this).field_N, ((pe) this).field_p + -40, var7.field_x));
                break L12;
              }
            }
            L13: {
              var8 = hq.field_c;
              var9 = go.a(false, ip.a(9));
              if (var9 != mf.field_u) {
                if (h.field_l != var9) {
                  break L13;
                } else {
                  var8 = gj.field_g;
                  break L13;
                }
              } else {
                var8 = go.field_v;
                break L13;
              }
            }
            L14: {
              na dupTemp$2 = new na(10, ((pe) this).field_k, ((pe) this).field_p + -20, 25, (gm) (Object) ((pe) this).field_C, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((pe) this).a((gm) (Object) dupTemp$2, -6938);
              ((pe) this).field_k = ((pe) this).field_k + (((gm) (Object) var12).field_o + 5);
              na dupTemp$3 = new na(10, ((pe) this).field_k, -20 + ((pe) this).field_p, 25, (gm) (Object) ((pe) this).field_L, false, 80, 3, var7, 16777215, hm.field_v);
              var13 = dupTemp$3;
              ((pe) this).a((gm) (Object) dupTemp$3, -6938);
              ((pe) this).field_K.field_t = (ca) this;
              ((pe) this).field_k = ((pe) this).field_k + (5 + ((gm) (Object) var13).field_o);
              if (((pe) this).field_D == null) {
                break L14;
              } else {
                ((pe) this).field_D.field_t = (ca) this;
                break L14;
              }
            }
            L15: {
              if (null == ((pe) this).field_B) {
                break L15;
              } else {
                ((pe) this).field_B.field_t = (ca) this;
                break L15;
              }
            }
            L16: {
              if (((pe) this).field_D == null) {
                ((pe) this).field_K.a((byte) -46, 8, ((pe) this).field_k, 30, -16 + ((pe) this).field_p);
                ((pe) this).field_k = ((pe) this).field_k + 35;
                break L16;
              } else {
                ((pe) this).field_K.a((byte) -97, 85, ((pe) this).field_k, 30, ((pe) this).field_p - 95);
                ((pe) this).field_k = ((pe) this).field_k + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((pe) this).field_D) {
                break L17;
              } else {
                ((pe) this).field_D.a((byte) -18, 8, ((pe) this).field_k, 30, ((pe) this).field_p - 16);
                ((pe) this).field_k = ((pe) this).field_k + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((pe) this).field_B) {
                break L18;
              } else {
                L19: {
                  if (((pe) this).field_G) {
                    break L19;
                  } else {
                    if (!((pe) this).field_F) {
                      ((pe) this).field_B.a((byte) -21, 8, ((pe) this).field_k, 20, 40);
                      ((pe) this).field_k = ((pe) this).field_k + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((pe) this).field_B.a((byte) -13, 8, ((pe) this).field_k, 30, -6 + ((pe) this).field_p - 10);
                ((pe) this).field_k = ((pe) this).field_k + 35;
                break L18;
              }
            }
            L20: {
              ((pe) this).a((byte) 123, 0, 0, 3 + ((pe) this).field_k, ((pe) this).field_p);
              ((pe) this).a((gm) (Object) ((pe) this).field_K, -6938);
              if (((pe) this).field_D == null) {
                break L20;
              } else {
                ((pe) this).a((gm) (Object) ((pe) this).field_D, -6938);
                break L20;
              }
            }
            L21: {
              if (((pe) this).field_B == null) {
                break L21;
              } else {
                ((pe) this).a((gm) (Object) ((pe) this).field_B, -6938);
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
            stackOut_57_1 = new StringBuilder().append("pe.<init>(");
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
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, double param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              if (param1 == eq.field_a) {
                break L2;
              } else {
                var3_int = 0;
                L3: while (true) {
                  if (var3_int >= 256) {
                    eq.field_a = param1;
                    break L2;
                  } else {
                    L4: {
                      var4 = (int)(Math.pow((double)var3_int / 255.0, param1) * 255.0);
                      stackOut_6_0 = uk.field_b;
                      stackOut_6_1 = var3_int;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (255 < var4) {
                        stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 255;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L4;
                      } else {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = var4;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L4;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                    var3_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "pe.C(" + param0 + 44 + param1 + 41);
        }
    }

    final String i(int param0) {
        if (param0 >= -68) {
            ((pe) this).field_B = null;
        }
        if (((pe) this).field_C.field_m == null) {
            return "";
        }
        return ((pe) this).field_C.field_m;
    }

    final void a(int param0, String param1) {
        tk var3 = null;
        String var4 = null;
        try {
            if (param0 >= -54) {
                field_E = null;
            }
            var3 = ((pe) this).field_C;
            var4 = param1;
            var3.a(false, var4, true);
            ((pe) this).field_L.i((byte) 68);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "pe.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, tk param1) {
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
              if (param0 > 3) {
                break L1;
              } else {
                String discarded$2 = ((pe) this).i(127);
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
            stackOut_3_1 = new StringBuilder().append("pe.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_E = null;
        field_M = null;
        field_H = null;
    }

    final static byte[] a(int param0, int param1, byte[] param2, df param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param3.e(param1, -90);
              if (param0 > 74) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    if (param2.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param3.e(3, 78);
                var6 = (byte)param3.e(8, -93);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param2[var7] = (byte)(param3.e(var5, -58) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param2;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("pe.M(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_18_0;
    }

    private final void a(byte param0) {
        L0: {
          L1: {
            if (vg.d(0)) {
              break L1;
            } else {
              if (((pe) this).field_C.field_m.length() <= 0) {
                break L0;
              } else {
                if (0 >= ((pe) this).field_L.field_m.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          sa.a(((pe) this).field_C.field_m, 122, ((pe) this).field_L.field_m);
          break L0;
        }
        L2: {
          if (param0 >= 120) {
            break L2;
          } else {
            boolean discarded$2 = ((pe) this).a(99, (gm) null, 'ﾠ', 63);
            break L2;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(null == ((pe) this).field_N)) {
            int discarded$0 = dg.field_e.a(((pe) this).field_N, param3 + ((pe) this).field_w + 20, param2 - -((pe) this).field_k + 15, -40 + ((pe) this).field_p, ((pe) this).field_o, 16777215, -1, 1, 0, dg.field_e.field_x);
        }
        if (param1 >= -7) {
            ((pe) this).field_C = null;
        }
        if (!(null == ((pe) this).field_D)) {
            ph.b(param3 + 10, 134 + param2, -20 + ((pe) this).field_p, 4210752);
        }
        super.a(param0, (byte) -98, param2, param3);
    }

    final static jb[] a(byte param0, df param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        jb[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        jb var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jb[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var2_int = param1.e(8, -80);
            if (var2_int <= 0) {
              var4_int = -80 / ((-20 - param0) / 36);
              var3 = param1.e(12, -73);
              var4 = new jb[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_10_0 = (jb[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (df.a(param1, -103)) {
                      var6 = new jb();
                      int discarded$12 = param1.e(24, -59);
                      int discarded$13 = param1.e(24, 55);
                      var6.field_a = param1.e(24, -85);
                      int discarded$14 = param1.e(9, -113);
                      int discarded$15 = param1.e(12, -114);
                      int discarded$16 = param1.e(12, 99);
                      int discarded$17 = param1.e(12, 97);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param1.e(ci.a(-1 + var5, 2), -64);
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (jb[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("pe.G(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public final void a(tk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -122) {
                break L1;
              } else {
                ((pe) this).field_F = false;
                break L1;
              }
            }
            L2: {
              if (((pe) this).field_C != param0) {
                break L2;
              } else {
                boolean discarded$2 = ((pe) this).field_L.a((gm) this, false);
                break L2;
              }
            }
            L3: {
              if (((pe) this).field_L != param0) {
                break L3;
              } else {
                this.a((byte) 124);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pe.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 <= -85) {
                break L1;
              } else {
                ((pe) this).field_F = false;
                break L1;
              }
            }
            L2: {
              if (param1 == ((pe) this).field_K) {
                this.a((byte) 123);
                break L2;
              } else {
                if (param1 == ((pe) this).field_D) {
                  m.a(11);
                  break L2;
                } else {
                  if (((pe) this).field_B != param1) {
                    break L2;
                  } else {
                    if (((pe) this).field_G) {
                      aj.a(2);
                      break L2;
                    } else {
                      if (!((pe) this).field_F) {
                        ka.a((byte) -110);
                        break L2;
                      } else {
                        of.b((byte) 105);
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("pe.NA(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Discard";
        field_H = new char[128];
    }
}
