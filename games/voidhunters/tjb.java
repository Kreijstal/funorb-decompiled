/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tjb extends llb {
    private int field_Jb;
    static String field_Cb;
    static int field_wb;
    private int field_zb;
    private int field_Ib;
    private int field_Hb;
    private int field_Eb;
    private int field_Gb;
    private int field_vb;
    private char[] field_yb;
    private tjb[] field_Db;
    private int field_Fb;
    private tjb field_xb;
    private cna[] field_Bb;
    private int[] field_Ab;

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 <= -60) {
            break L0;
          } else {
            ((tjb) this).field_Eb = 67;
            break L0;
          }
        }
        L1: {
          if (pma.field_o != 85) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var4 = stackIn_5_0;
        if (((tjb) this).field_xb != null) {
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              if (((tjb) this).field_xb.field_vb != -1) {
                break L2;
              } else {
                ((tjb) this).j(16384);
                this.a((byte) 112, 0);
                return true;
              }
            }
          }
          return ((tjb) this).field_xb.a(param0, -126, param2);
        } else {
          L3: {
            if (null != ((tjb) this).field_xb) {
              break L3;
            } else {
              if (this != (Object) (Object) fkb.field_m) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L3;
                } else {
                  fea.a(-1);
                  return true;
                }
              }
            }
          }
          L4: {
            var5 = jl.field_r;
            if (var5 <= 0) {
              break L4;
            } else {
              L5: {
                if (ttb.field_B == var5) {
                  var5 = 63;
                  break L5;
                } else {
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (var6 >= ((tjb) this).field_yb.length) {
                  break L4;
                } else {
                  if (var5 == ((tjb) this).field_yb[var6]) {
                    this.a(var6, true, param0, param2);
                    return true;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = VoidHunters.field_G;
          if (((tjb) this).field_vb != param0) {
            if (((tjb) this).field_Db[param0] != null) {
              ((tjb) this).j(16384);
              this.a((byte) 116, 0);
              ((tjb) this).field_vb = param0;
              ((tjb) this).field_xb = ((tjb) this).field_Db[((tjb) this).field_vb];
              wkb.a(((tjb) this).field_xb, 6);
              ((tjb) this).field_xb.a((byte) 121, 12);
              break L0;
            } else {
              if (((tjb) this).field_Ab[param0] != -1) {
                L1: {
                  var5 = 32768 | ((tjb) this).field_Ab[param0];
                  var6 = ow.field_b;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null == lqa.field_o) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (jia.a(var6, (byte) 19) == 2) {
                    mea.a(1, (byte) -119, param2, var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                va.a((String) null, -25719, var5, param3, ow.field_b, waa.field_x);
                jtb.a(ow.field_b, var5, lsa.field_f, false, waa.field_x);
                fea.a(-1);
                fd.a(4907);
                break L0;
              } else {
                wha.a(29012);
                fea.a(-1);
                break L0;
              }
            }
          } else {
            ((tjb) this).j(16384);
            this.a((byte) 121, 0);
            break L0;
          }
        }
    }

    tjb(long param0, llb param1, llb param2, llb param3, tjb[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        no var17 = null;
        no var18 = null;
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
        ((tjb) this).field_vb = -1;
        try {
          L0: {
            ((tjb) this).field_yb = param7;
            ((tjb) this).field_Ab = param5;
            ((tjb) this).field_Db = param4;
            ((tjb) this).field_Gb = ((tjb) this).field_Ab.length;
            var17 = param3.field_eb;
            var18 = var17;
            ((tjb) this).field_Ib = var18.field_A + (var18.field_k + 2);
            ((tjb) this).field_Jb = 0;
            ((tjb) this).field_Bb = new cna[((tjb) this).field_Gb];
            ((tjb) this).field_zb = ((tjb) this).field_Ib * ((tjb) this).field_Gb;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (((tjb) this).field_Gb <= var13) {
                ((tjb) this).field_Jb = ((tjb) this).field_Jb + (10 + ie.field_o.field_m);
                this.a((byte) 120, 12);
                break L0;
              } else {
                L2: {
                  if (((tjb) this).field_yb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + av.a(((tjb) this).field_yb[var13], 6).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (((tjb) this).field_Db[var13] != null) {
                      break L4;
                    } else {
                      if (((tjb) this).field_Ab[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) ie.field_o;
                  break L3;
                }
                L5: {
                  ((tjb) this).field_Bb[var13] = new cna(0L, param2, (llb) null, param3, (phb) var14, param6[var13]);
                  ((tjb) this).b(-561, (llb) (Object) ((tjb) this).field_Bb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (((tjb) this).field_Jb >= var15) {
                    break L5;
                  } else {
                    ((tjb) this).field_Jb = var15;
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
            stackOut_13_1 = new StringBuilder().append("tjb.<init>(").append(param0).append(',');
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
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
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
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
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = VoidHunters.field_G;
        ((tjb) this).field_Fb = param1;
        if (param0 < 109) {
            ((tjb) this).field_Eb = -122;
        }
        for (var5 = 0; var5 < ((tjb) this).field_Gb; var5++) {
            var4 = ((tjb) this).field_Fb * ((tjb) this).field_Fb;
            var3 = var5 * ((tjb) this).field_Ib;
            ((tjb) this).field_Bb[var5].field_K = ((((tjb) this).field_Hb + -((tjb) this).field_u) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    final int k(int param0) {
        if (param0 != -4109) {
            boolean discarded$0 = ((tjb) this).a(-122, 20, 102);
        }
        return ((tjb) this).field_Eb - -(null != ((tjb) this).field_xb ? ((tjb) this).field_xb.k(-4109) : 0);
    }

    public static void i(int param0) {
        field_Cb = null;
    }

    final void j(int param0) {
        int var3 = 0;
        cna var4 = null;
        int var5 = VoidHunters.field_G;
        cna[] var6 = ((tjb) this).field_Bb;
        cna[] var2 = var6;
        if (param0 != 16384) {
            ((tjb) this).field_zb = -32;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_o = 0;
            var4.field_J = false;
        }
        if (!(((tjb) this).field_xb == null)) {
            ((tjb) this).field_xb.j(16384);
            ((tjb) this).field_xb.b(param0 + -20230);
        }
        ((tjb) this).field_xb = null;
        ((tjb) this).field_vb = -1;
        this.a((byte) 113, 12);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
            return false;
        }
        tsb.field_q = true;
        ska.field_p = wt.a(false) + 15000L;
        return qmb.field_q == 11 ? true : false;
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        tjb var4 = null;
        int var5 = 0;
        cna var6 = null;
        int var7 = 0;
        tjb var8 = null;
        cna stackIn_5_0 = null;
        cna stackIn_6_0 = null;
        cna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cna stackOut_4_0 = null;
        cna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cna stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var7 = VoidHunters.field_G;
        var4_int = -84 / ((-12 - param2) / 44);
        var5 = 0;
        L0: while (true) {
          if (((tjb) this).field_Bb.length <= var5) {
            L1: {
              if (((tjb) this).field_vb == -1) {
                break L1;
              } else {
                var8 = ((tjb) this).field_Db[((tjb) this).field_vb];
                var4 = var8;
                if (var4 == null) {
                  break L1;
                } else {
                  var8.a(param0, param1, (byte) 78);
                  break L1;
                }
              }
            }
            L2: {
              if (0 < ((tjb) this).field_Fb) {
                this.a((byte) 123, ((tjb) this).field_Fb + -1);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var6 = ((tjb) this).field_Bb[var5];
            if (var6.field_o == 1) {
              L3: {
                this.a(var5, true, param0, param1);
                stackOut_4_0 = (cna) var6;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var5 != ((tjb) this).field_vb) {
                  stackOut_6_0 = (cna) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (cna) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_J = stackIn_7_1 != 0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        cna var5 = null;
        int var6 = VoidHunters.field_G;
        int var2 = 0;
        cna[] var3 = ((tjb) this).field_Bb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_o != 0 ? 1 : 0);
        }
        if (param0 != -25675) {
            boolean discarded$0 = tjb.l(52);
        }
        if (var2 == 0) {
            if (-1 != ((tjb) this).field_vb) {
                if (!(((tjb) this).field_Db[((tjb) this).field_vb] == null)) {
                    var2 = ((tjb) this).field_Db[((tjb) this).field_vb].h(-25675) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        ((tjb) this).field_Eb = ((tjb) this).field_Jb - -(2 * param3);
        if (param0 == 12) {
          L0: {
            ((tjb) this).a(param2, param0 + -41, ((tjb) this).field_Eb, param1 + -((tjb) this).field_zb, ((tjb) this).field_zb);
            if (param4 != ((tjb) this).field_Hb) {
              ((tjb) this).field_Hb = param4;
              this.a((byte) 116, ((tjb) this).field_Fb);
              break L0;
            } else {
              break L0;
            }
          }
          var7 = 0;
          L1: while (true) {
            if (var7 >= ((tjb) this).field_Gb) {
              L2: {
                if (((tjb) this).field_vb == -1) {
                  break L2;
                } else {
                  if (((tjb) this).field_Db[((tjb) this).field_vb] == null) {
                    break L2;
                  } else {
                    var7 = ((tjb) this).field_Db[((tjb) this).field_vb].field_Gb;
                    var8 = ((tjb) this).field_K + (((tjb) this).field_vb + var7) * ((tjb) this).field_Ib;
                    L3: while (true) {
                      if (param1 >= var8) {
                        ((tjb) this).field_Db[((tjb) this).field_vb].a(12, var8, ((tjb) this).field_Eb + param2, param3, ((tjb) this).field_Bb[((tjb) this).field_vb].field_u, param5);
                        break L2;
                      } else {
                        var8 = var8 - ((tjb) this).field_Ib;
                        continue L3;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              ((tjb) this).field_Bb[var7].a(((tjb) this).field_Bb[var7].field_K, 0, -127, param3, param5, ((tjb) this).field_Eb, ((tjb) this).field_Ib);
              var7++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static Object a(Object[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (ls.field_q) {
              ((byte[]) param0[2])[0] = ((byte[]) param0[12])[2];
              if (param0 != null) {
                if (param0.length > 0) {
                  var2_int = 0;
                  L1: while (true) {
                    if (var2_int < param0.length) {
                      if (VoidHunters.a(true, param0[var2_int])) {
                        stackOut_13_0 = param0[var2_int];
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("tjb.K(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 0 + ')');
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Invalid name";
        field_wb = 2;
    }
}
