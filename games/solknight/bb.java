/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bb extends ki implements pi, ka {
    private boolean field_H;
    static fg field_I;
    private vg field_L;
    private vg field_O;
    private boolean field_E;
    private pj field_N;
    private String field_K;
    static int[] field_P;
    private pj field_M;
    private pj field_D;
    static int field_G;
    private boolean field_J;

    public final void a(vg param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((bb) this).field_K = null;
                break L1;
              }
            }
            L2: {
              if (((bb) this).field_O == param0) {
                boolean discarded$4 = ((bb) this).field_L.a(-1463, (rc) this);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 != ((bb) this).field_L) {
                break L3;
              } else {
                int discarded$5 = -1525;
                this.k();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bb.NA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (var6_int < 0) {
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L2: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = var8 - -2;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if (!gh.a(param0.charAt(var5), (byte) -124)) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (ec.a(30418, (CharSequence) (Object) var9)) {
                        if (var5 >= var3_int) {
                          continue L2;
                        } else {
                          if (param0.charAt(var5) == 62) {
                            var5++;
                            int discarded$5 = 6054;
                            var10 = il.a((CharSequence) (Object) var9);
                            StringBuilder discarded$6 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$7 = var6.append(param1[var10]);
                            continue L2;
                          } else {
                            continue L2;
                          }
                        }
                      } else {
                        continue L2;
                      }
                    }
                  } else {
                    StringBuilder discarded$8 = var6.append(param0.substring(var7));
                    stackOut_25_0 = var6.toString();
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  }
                }
              } else {
                var5 = var6_int - -2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!gh.a(param0.charAt(var5), (byte) -124)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (!ec.a(30418, (CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        int discarded$9 = 6054;
                        var8 = il.a((CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (-var5 + var6_int + param1[var8].length());
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("bb.K(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + -63 + ')');
        }
        return stackIn_26_0;
    }

    bb(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (j) null);
        RuntimeException var6 = null;
        gh var6_ref = null;
        mg var7 = null;
        String var8 = null;
        fg var9 = null;
        ke var12 = null;
        ke var13 = null;
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
        pj stackIn_17_1 = null;
        pj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pj stackIn_18_1 = null;
        pj stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        pj stackIn_19_1 = null;
        pj stackIn_19_2 = null;
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
        pj stackOut_16_1 = null;
        pj stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        pj stackOut_18_1 = null;
        pj stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        pj stackOut_17_1 = null;
        pj stackOut_17_2 = null;
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
              if (!param2) {
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
              ((bb) this).field_E = stackIn_4_1 != 0;
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
              ((bb) this).field_H = stackIn_7_1 != 0;
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
              ((bb) this).field_J = stackIn_10_1 != 0;
              ((bb) this).field_K = param1;
              if (!((bb) this).field_E) {
                break L4;
              } else {
                L5: {
                  if (((bb) this).field_J) {
                    break L5;
                  } else {
                    if (!((bb) this).field_H) {
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
              ((bb) this).field_O = (vg) (Object) new qb(param0, (dg) this, 100);
              ((bb) this).field_L = (vg) (Object) new qb("", (dg) this, 20);
              if (!((bb) this).field_E) {
                L7: {
                  ((bb) this).field_N = new pj(ga.field_H, (dg) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((bb) this).field_H) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = pf.field_c;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = u.field_e;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((bb) this).field_D = new pj(stackIn_19_3, (dg) null);
                if (!((bb) this).field_J) {
                  break L6;
                } else {
                  ((bb) this).field_M = new pj(wk.field_g, (dg) this);
                  break L6;
                }
              } else {
                ((bb) this).field_N = new pj(gg.field_c, (dg) null);
                ((bb) this).field_D = new pj(ph.field_e, (dg) null);
                ((bb) this).field_O.field_B = false;
                break L6;
              }
            }
            L8: {
              ((bb) this).field_O.field_w = (j) (Object) new uf(10000536);
              ((bb) this).field_L.field_w = (j) (Object) new bg(10000536);
              var6_ref = new gh();
              ((bb) this).field_N.field_w = (j) (Object) var6_ref;
              if (null == ((bb) this).field_D) {
                break L8;
              } else {
                ((bb) this).field_D.field_w = (j) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((bb) this).field_O.field_z = oc.field_e;
              if (((bb) this).field_M == null) {
                break L9;
              } else {
                ((bb) this).field_M.field_w = (j) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (((bb) this).field_M == null) {
                break L10;
              } else {
                ((bb) this).field_M.field_z = id.field_b;
                break L10;
              }
            }
            L11: {
              if (((bb) this).field_E) {
                ((bb) this).field_D.field_z = hb.field_j;
                break L11;
              } else {
                if (!((bb) this).field_H) {
                  ((bb) this).field_D.field_w = (j) (Object) new ri();
                  break L11;
                } else {
                  ((bb) this).field_D.field_z = a.field_g;
                  ((bb) this).field_D.field_w = (j) (Object) new ri();
                  break L11;
                }
              }
            }
            L12: {
              ((bb) this).field_j = 15;
              var7 = ua.field_G;
              if (((bb) this).field_K == null) {
                break L12;
              } else {
                ((bb) this).field_j = ((bb) this).field_j + (var7.b(((bb) this).field_K, -40 + ((bb) this).field_t, var7.field_F) + 5);
                break L12;
              }
            }
            L13: {
              var8 = hh.field_J;
              var9 = lf.a((byte) 120, ia.g(116));
              if (sk.field_p == var9) {
                var8 = rc.field_y;
                break L13;
              } else {
                if (field_I != var9) {
                  break L13;
                } else {
                  var8 = kf.field_H;
                  break L13;
                }
              }
            }
            L14: {
              ke dupTemp$2 = new ke(10, ((bb) this).field_j, ((bb) this).field_t - 20, 25, (rc) (Object) ((bb) this).field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((bb) this).a((rc) (Object) dupTemp$2, 5411);
              ((bb) this).field_j = ((bb) this).field_j + (((rc) (Object) var12).field_x + 5);
              ke dupTemp$3 = new ke(10, ((bb) this).field_j, ((bb) this).field_t + -20, 25, (rc) (Object) ((bb) this).field_L, false, 80, 3, var7, 16777215, ld.field_O);
              var13 = dupTemp$3;
              ((bb) this).a((rc) (Object) dupTemp$3, 5411);
              ((bb) this).field_N.field_n = (dg) this;
              ((bb) this).field_j = ((bb) this).field_j + (5 + ((rc) (Object) var13).field_x);
              if (((bb) this).field_M == null) {
                break L14;
              } else {
                ((bb) this).field_M.field_n = (dg) this;
                break L14;
              }
            }
            L15: {
              if (null == ((bb) this).field_D) {
                break L15;
              } else {
                ((bb) this).field_D.field_n = (dg) this;
                break L15;
              }
            }
            L16: {
              if (((bb) this).field_M != null) {
                ((bb) this).field_N.b(30, -95 + ((bb) this).field_t, 85, 0, ((bb) this).field_j);
                ((bb) this).field_j = ((bb) this).field_j + 60;
                break L16;
              } else {
                ((bb) this).field_N.b(30, ((bb) this).field_t - 16, 8, 0, ((bb) this).field_j);
                ((bb) this).field_j = ((bb) this).field_j + 35;
                break L16;
              }
            }
            L17: {
              if (null == ((bb) this).field_M) {
                break L17;
              } else {
                ((bb) this).field_M.b(30, -10 + ((bb) this).field_t - 6, 8, 0, ((bb) this).field_j);
                ((bb) this).field_j = ((bb) this).field_j + 35;
                break L17;
              }
            }
            L18: {
              if (((bb) this).field_D == null) {
                break L18;
              } else {
                L19: {
                  if (((bb) this).field_E) {
                    break L19;
                  } else {
                    if (((bb) this).field_H) {
                      break L19;
                    } else {
                      ((bb) this).field_D.b(20, 40, 8, 0, ((bb) this).field_j);
                      ((bb) this).field_j = ((bb) this).field_j + 25;
                      break L18;
                    }
                  }
                }
                ((bb) this).field_D.b(30, -10 + (-6 + ((bb) this).field_t), 8, 0, ((bb) this).field_j);
                ((bb) this).field_j = ((bb) this).field_j + 35;
                break L18;
              }
            }
            L20: {
              ((bb) this).b(3 + ((bb) this).field_j, ((bb) this).field_t, 0, 0, 0);
              ((bb) this).a((rc) (Object) ((bb) this).field_N, 5411);
              if (((bb) this).field_M == null) {
                break L20;
              } else {
                ((bb) this).a((rc) (Object) ((bb) this).field_M, 5411);
                break L20;
              }
            }
            L21: {
              if (null == ((bb) this).field_D) {
                break L21;
              } else {
                ((bb) this).a((rc) (Object) ((bb) this).field_D, 5411);
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
            stackOut_57_1 = new StringBuilder().append("bb.<init>(");
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
          throw fc.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        h.field_g = param1;
        me.field_b = param2;
        je.field_d = 1;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
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
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                ((bb) this).field_J = true;
                break L1;
              }
            }
            L2: {
              if (param3 == ((bb) this).field_N) {
                int discarded$451 = -1525;
                this.k();
                break L2;
              } else {
                if (param3 != ((bb) this).field_M) {
                  if (param3 == ((bb) this).field_D) {
                    if (!((bb) this).field_E) {
                      if (((bb) this).field_H) {
                        ig.a((byte) -82);
                        break L2;
                      } else {
                        int discarded$452 = -13;
                        qd.a();
                        break L2;
                      }
                    } else {
                      int discarded$453 = 15;
                      rf.h();
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  wf.d(350);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("bb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = 34 % ((param1 - 31) / 56);
            if (super.a(param0, (byte) -36, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (98 == param2) {
                stackOut_6_0 = ((bb) this).a((byte) -114, param3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((bb) this).b(90, param3);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(null == ((bb) this).field_K)) {
            int discarded$0 = ua.field_G.a(((bb) this).field_K, ((bb) this).field_m + (param2 + 20), 15 + (((bb) this).field_j + param0), -40 + ((bb) this).field_t, ((bb) this).field_x, 16777215, -1, 1, 0, ua.field_G.field_F);
        }
        if (null != ((bb) this).field_M) {
            mi.b(10 + param2, param0 - -134, ((bb) this).field_t - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(int param0, String param1) {
        vg var3 = null;
        String var4 = null;
        try {
            var3 = ((bb) this).field_O;
            var4 = param1;
            if (param0 != 25) {
                ((bb) this).field_L = null;
            }
            var3.a(param0 ^ -110, false, var4);
            ((bb) this).field_L.l(param0 ^ -125);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "bb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_P = null;
        field_I = null;
    }

    public final void a(vg param0, byte param1) {
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
              if (param1 == -79) {
                break L1;
              } else {
                ((bb) this).field_E = false;
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
            stackOut_3_1 = new StringBuilder().append("bb.N(");
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
          throw fc.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String j(int param0) {
        if (param0 != -19569) {
            return null;
        }
        if (((bb) this).field_O.field_i == null) {
            return "";
        }
        return ((bb) this).field_O.field_i;
    }

    private final void k() {
        L0: {
          L1: {
            if (ji.a(-19688)) {
              break L1;
            } else {
              if (0 >= ((bb) this).field_O.field_i.length()) {
                break L0;
              } else {
                if (((bb) this).field_L.field_i.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          hg.a(8192, ((bb) this).field_O.field_i, ((bb) this).field_L.field_i);
          break L0;
        }
    }

    final static boolean h(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = 34 % ((param0 - -11) / 48);
            if (10 > fj.field_i) {
              break L1;
            } else {
              if (kj.field_R < 13) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void i(int param0) {
        ((bb) this).field_O.l(-115);
        ((bb) this).field_L.l(-87);
        if (param0 < 5) {
            String discarded$0 = ((bb) this).j(-11);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new fg("usename");
        field_P = new int[10];
    }
}
