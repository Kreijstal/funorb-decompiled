/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eua extends jea {
    private eua field_Eb;
    private int field_vb;
    private int field_Fb;
    private char[] field_xb;
    private tv[] field_Gb;
    private int field_Db;
    private eua[] field_zb;
    private int field_Bb;
    private int field_wb;
    private int field_Cb;
    static String field_Ab;
    private int field_yb;
    private int field_tb;
    private int[] field_ub;

    final int g(int param0) {
        if (param0 != 22514) {
            ((eua) this).field_Cb = -14;
        }
        return ((eua) this).field_Fb + (null != ((eua) this).field_Eb ? ((eua) this).field_Eb.g(22514) : 0);
    }

    final void a(boolean param0) {
        int var3 = 0;
        tv var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        tv[] var6 = ((eua) this).field_Gb;
        tv[] var2 = var6;
        if (!param0) {
            boolean discarded$0 = ((eua) this).a(33, (byte) -9, 44);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_cb = false;
            var4.field_y = 0;
        }
        if (!(null == ((eua) this).field_Eb)) {
            ((eua) this).field_Eb.a(param0);
            ((eua) this).field_Eb.p(1);
        }
        ((eua) this).field_Eb = null;
        ((eua) this).field_tb = -1;
        this.a(12, 6);
    }

    public static void f(int param0) {
        field_Ab = null;
        if (param0 <= 52) {
            field_Ab = null;
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        tv var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        tv[] var3 = ((eua) this).field_Gb;
        for (var4 = param0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_y ? 1 : 0);
        }
        if (var2 == 0) {
            if (((eua) this).field_tb != -1) {
                if (null != ((eua) this).field_zb[((eua) this).field_tb]) {
                    var2 = ((eua) this).field_zb[((eua) this).field_tb].h(param0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        ((eua) this).field_Cb = param0;
        if (param1 <= 3) {
            return;
        }
        for (var5 = 0; ((eua) this).field_Bb > var5; var5++) {
            var4 = ((eua) this).field_Cb * ((eua) this).field_Cb;
            var3 = ((eua) this).field_wb * var5;
            ((eua) this).field_Gb[var5].field_T = (var3 * (144 + -var4) - -((((eua) this).field_Db + -((eua) this).field_A) * var4)) / 144;
        }
    }

    eua(long param0, jea param1, jea param2, jea param3, eua[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        il var17 = null;
        il var18 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((eua) this).field_tb = -1;
        try {
          L0: {
            ((eua) this).field_zb = param4;
            ((eua) this).field_ub = param5;
            ((eua) this).field_xb = param7;
            ((eua) this).field_Bb = ((eua) this).field_ub.length;
            var17 = param3.field_H;
            var18 = var17;
            ((eua) this).field_wb = var18.field_k + (var18.field_w + 2);
            ((eua) this).field_Gb = new tv[((eua) this).field_Bb];
            ((eua) this).field_vb = 0;
            ((eua) this).field_yb = ((eua) this).field_Bb * ((eua) this).field_wb;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((eua) this).field_Bb) {
                ((eua) this).field_vb = ((eua) this).field_vb + (10 + gfa.field_j.field_n);
                this.a(12, 93);
                break L0;
              } else {
                L2: {
                  if (((eua) this).field_xb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + no.a((byte) 67, ((eua) this).field_xb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((eua) this).field_zb[var13]) {
                      break L4;
                    } else {
                      if (-1 != ((eua) this).field_ub[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) gfa.field_j;
                  break L3;
                }
                L5: {
                  ((eua) this).field_Gb[var13] = new tv(0L, param2, (jea) null, param3, (iu) var14, param6[var13]);
                  ((eua) this).b(-123, (jea) (Object) ((eua) this).field_Gb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (((eua) this).field_vb >= var15) {
                    break L5;
                  } else {
                    ((eua) this).field_vb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("eua.<init>(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 != ((eua) this).field_tb) {
            if (((eua) this).field_zb[param2] != null) {
              ((eua) this).a(true);
              this.a(0, 60);
              ((eua) this).field_tb = param2;
              ((eua) this).field_Eb = ((eua) this).field_zb[((eua) this).field_tb];
              int discarded$283 = 122;
              hj.a(((eua) this).field_Eb);
              ((eua) this).field_Eb.a(12, 116);
              break L0;
            } else {
              if (((eua) this).field_ub[param2] != -1) {
                L1: {
                  var5 = ((eua) this).field_ub[param2] | 32768;
                  var6 = bta.field_q;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (uu.field_a == null) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (gda.a(var6, -20011) == 2) {
                    loa.a(var6, param0, (byte) 108, 1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                f.b(-110);
                int discarded$284 = -25;
                jq.c();
                break L0;
              } else {
                int discarded$285 = 0;
                kra.a();
                f.b(-55);
                break L0;
              }
            }
          } else {
            ((eua) this).a(true);
            this.a(0, 70);
            break L0;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (fna.field_h != 85) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (((eua) this).field_Eb != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((eua) this).field_Eb.field_tb != -1) {
                break L1;
              } else {
                ((eua) this).a(true);
                this.a(0, 124);
                return true;
              }
            }
          }
          return ((eua) this).field_Eb.a(param0, (byte) -105, param2);
        } else {
          L2: {
            if (null != ((eua) this).field_Eb) {
              break L2;
            } else {
              if (this != (Object) (Object) kga.field_n) {
                break L2;
              } else {
                if (var4 != 0) {
                  f.b(param1 ^ 48);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          var5 = kda.field_td;
          if (param1 == -105) {
            if (0 < var5) {
              L3: {
                if (var5 == tqa.field_o) {
                  var5 = 63;
                  break L3;
                } else {
                  break L3;
                }
              }
              var6 = 0;
              L4: while (true) {
                if (var6 >= ((eua) this).field_xb.length) {
                  return false;
                } else {
                  if (((eua) this).field_xb[var6] == var5) {
                    this.a(param2, param0, var6, (byte) -62);
                    return true;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        eua var4 = null;
        tv var5 = null;
        int var6 = 0;
        eua var7 = null;
        tv stackIn_5_0 = null;
        tv stackIn_6_0 = null;
        tv stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tv stackOut_4_0 = null;
        tv stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tv stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((eua) this).field_Gb.length) {
            L1: {
              if (param2 <= -52) {
                break L1;
              } else {
                eua.f(-120);
                break L1;
              }
            }
            L2: {
              if (((eua) this).field_tb == -1) {
                break L2;
              } else {
                var7 = ((eua) this).field_zb[((eua) this).field_tb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, param1, (byte) -79);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((eua) this).field_Cb <= 0) {
                break L3;
              } else {
                this.a(((eua) this).field_Cb - 1, 66);
                break L3;
              }
            }
            return;
          } else {
            var5 = ((eua) this).field_Gb[var4_int];
            if (var5.field_y == 1) {
              L4: {
                this.a(param1, param0, var4_int, (byte) -62);
                stackOut_4_0 = (tv) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((eua) this).field_tb) {
                  stackOut_6_0 = (tv) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (tv) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_cb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          ((eua) this).field_Fb = ((eua) this).field_vb - -(2 * param5);
          ((eua) this).a(((eua) this).field_Fb, ((eua) this).field_yb, -23776, -((eua) this).field_yb + param4, param1);
          if (param3 != ((eua) this).field_Db) {
            ((eua) this).field_Db = param3;
            this.a(((eua) this).field_Cb, 77);
            break L0;
          } else {
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (((eua) this).field_Bb <= var7) {
            L2: {
              if (param2 == -3269) {
                break L2;
              } else {
                field_Ab = null;
                break L2;
              }
            }
            L3: {
              if (((eua) this).field_tb == -1) {
                break L3;
              } else {
                if (null != ((eua) this).field_zb[((eua) this).field_tb]) {
                  var7 = ((eua) this).field_zb[((eua) this).field_tb].field_Bb;
                  var8 = (((eua) this).field_tb - -var7) * ((eua) this).field_wb + ((eua) this).field_T;
                  L4: while (true) {
                    if (param4 >= var8) {
                      ((eua) this).field_zb[((eua) this).field_tb].a(param0, ((eua) this).field_Fb + param1, param2, ((eua) this).field_Gb[((eua) this).field_tb].field_A, var8, param5);
                      break L3;
                    } else {
                      var8 = var8 - ((eua) this).field_wb;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            ((eua) this).field_Gb[var7].a(((eua) this).field_Fb, 0, param0, ((eua) this).field_wb, 0, param5, ((eua) this).field_Gb[var7].field_T);
            var7++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "Lindemann totems";
    }
}
