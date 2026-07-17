/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nv extends sna {
    private nv field_Eb;
    static ee field_wb;
    private int field_Ib;
    private int[] field_yb;
    private int field_Ab;
    private nv[] field_Hb;
    private int field_Bb;
    private gna[] field_vb;
    private char[] field_Db;
    private int field_Gb;
    private int field_xb;
    private int field_Fb;
    private int field_Cb;
    private int field_zb;

    public static void f(int param0) {
        field_wb = null;
        if (param0 != 20038) {
            field_wb = null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            ((nv) this).field_Db = null;
        }
        return ((nv) this).field_Fb + (((nv) this).field_Eb != null ? ((nv) this).field_Eb.b(param0) : 0);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 >= -91) {
            nv.f(-20);
        }
        ((nv) this).field_Fb = 2 * param4 + ((nv) this).field_Gb;
        ((nv) this).a(((nv) this).field_Ib, 31407, ((nv) this).field_Fb, param3, param2 - ((nv) this).field_Ib);
        if (!(param1 == ((nv) this).field_zb)) {
            ((nv) this).field_zb = param1;
            this.b(((nv) this).field_Bb, false);
        }
        for (var7 = 0; ((nv) this).field_Cb > var7; var7++) {
            ((nv) this).field_vb[var7].a(((nv) this).field_Fb, param4, ((nv) this).field_Ab, 0, param5, (byte) -88, ((nv) this).field_vb[var7].field_rb);
        }
        if (-1 != ((nv) this).field_xb) {
            if (!(((nv) this).field_Hb[((nv) this).field_xb] == null)) {
                var7 = ((nv) this).field_Hb[((nv) this).field_xb].field_Cb;
                var8 = (((nv) this).field_xb - -var7) * ((nv) this).field_Ab + ((nv) this).field_rb;
                while (var8 > param2) {
                    var8 = var8 - ((nv) this).field_Ab;
                }
                ((nv) this).field_Hb[((nv) this).field_xb].a((byte) -97, ((nv) this).field_vb[((nv) this).field_xb].field_M, var8, ((nv) this).field_Fb + param3, param4, param5);
            }
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          if (((nv) this).field_xb == param1) {
            ((nv) this).f((byte) -128);
            this.b(0, false);
            break L0;
          } else {
            if (((nv) this).field_Hb[param1] == null) {
              if (((nv) this).field_yb[param1] == -1) {
                js.a(121);
                int discarded$133 = -26;
                ki.g();
                break L0;
              } else {
                L1: {
                  var5 = 32768 | ((nv) this).field_yb[param1];
                  var6 = gk.field_d;
                  if (0 != var6) {
                    break L1;
                  } else {
                    if (null != pw.field_w) {
                      var6 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (af.a(var6, 26291) == 2) {
                    fk.a(113, var6, param0, 1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                no.a(var5, gk.field_d, 110, (String) null, bd.field_k, param2);
                ob.a(eaa.field_a, (byte) -47, gk.field_d, var5, bd.field_k);
                int discarded$134 = -26;
                ki.g();
                int discarded$135 = 1;
                vca.c();
                break L0;
              }
            } else {
              ((nv) this).f((byte) -98);
              this.b(0, false);
              ((nv) this).field_xb = param1;
              ((nv) this).field_Eb = ((nv) this).field_Hb[((nv) this).field_xb];
              dka.a(((nv) this).field_Eb, (byte) 59);
              ((nv) this).field_Eb.b(12, false);
              break L0;
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = BachelorFridge.field_y;
        ((nv) this).field_Bb = param0;
        for (var5 = 0; ((nv) this).field_Cb > var5; var5++) {
            var3 = var5 * ((nv) this).field_Ab;
            var4 = ((nv) this).field_Bb * ((nv) this).field_Bb;
            ((nv) this).field_vb[var5].field_rb = (var4 * (((nv) this).field_zb - ((nv) this).field_M) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void f(byte param0) {
        int var3 = 0;
        gna var4 = null;
        int var5 = BachelorFridge.field_y;
        gna[] var6 = ((nv) this).field_vb;
        gna[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_t = false;
            var4.field_R = 0;
        }
        if (param0 > -90) {
            int discarded$0 = ((nv) this).b(false);
        }
        if (((nv) this).field_Eb != null) {
            ((nv) this).field_Eb.f((byte) -97);
            ((nv) this).field_Eb.a(false);
        }
        ((nv) this).field_Eb = null;
        ((nv) this).field_xb = -1;
        this.b(12, false);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          if (jea.field_c == null) {
            break L0;
          } else {
            if (13 != gf.field_k) {
              break L0;
            } else {
              jea.field_c = null;
              return true;
            }
          }
        }
        if (lna.field_q) {
          if (cn.d((byte) 64)) {
            L1: {
              if (!vaa.a(param3, 1, param0)) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L1;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = stackIn_20_0;
                if (gf.field_k == 80) {
                  break L3;
                } else {
                  if (gf.field_k != 84) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = 1;
              lna.field_q = false;
              break L2;
            }
            L4: {
              if (gf.field_k != 13) {
                break L4;
              } else {
                bea.d(-125);
                var4 = 1;
                lna.field_q = false;
                break L4;
              }
            }
            return var4 != 0;
          } else {
            return false;
          }
        } else {
          L5: {
            if (gm.field_k) {
              break L5;
            } else {
              if (gf.field_k == 9) {
                break L5;
              } else {
                if (gf.field_k == 10) {
                  break L5;
                } else {
                  if (11 != gf.field_k) {
                    if (gf.field_k != 80) {
                      return false;
                    } else {
                      if (cn.d((byte) 23)) {
                        lna.field_q = true;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
          }
          return wi.a(103, param0, param1);
        }
    }

    nv(long param0, sna param1, sna param2, sna param3, nv[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        po var17 = null;
        po var18 = null;
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
        ((nv) this).field_xb = -1;
        try {
          L0: {
            ((nv) this).field_Db = param7;
            ((nv) this).field_yb = param5;
            ((nv) this).field_Hb = param4;
            ((nv) this).field_Cb = ((nv) this).field_yb.length;
            var17 = param3.field_jb;
            var18 = var17;
            ((nv) this).field_Ab = var18.field_B + (2 - -var18.field_u);
            ((nv) this).field_vb = new gna[((nv) this).field_Cb];
            ((nv) this).field_Gb = 0;
            ((nv) this).field_Ib = ((nv) this).field_Cb * ((nv) this).field_Ab;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (((nv) this).field_Cb <= var13) {
                ((nv) this).field_Gb = ((nv) this).field_Gb + (10 + kga.field_a.field_n);
                this.b(12, false);
                break L0;
              } else {
                L2: {
                  if (0 >= ((nv) this).field_Db[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + oja.a((byte) -113, ((nv) this).field_Db[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((nv) this).field_Hb[var13]) {
                      break L4;
                    } else {
                      if (((nv) this).field_yb[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) kga.field_a;
                  break L3;
                }
                L5: {
                  ((nv) this).field_vb[var13] = new gna(0L, param2, (sna) null, param3, (kv) var14, param6[var13]);
                  ((nv) this).a(-1, (sna) (Object) ((nv) this).field_vb[var13]);
                  var15 = var17.a(param6[var13]);
                  if (var15 <= ((nv) this).field_Gb) {
                    break L5;
                  } else {
                    ((nv) this).field_Gb = var15;
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
            stackOut_13_1 = new StringBuilder().append("nv.<init>(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (gf.field_k != 85) {
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
        if (null != ((nv) this).field_Eb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == ((nv) this).field_Eb.field_xb) {
                ((nv) this).f((byte) -107);
                this.b(0, false);
                return true;
              } else {
                break L1;
              }
            }
          }
          return ((nv) this).field_Eb.b(param0, param1, param2);
        } else {
          L2: {
            if (((nv) this).field_Eb != null) {
              break L2;
            } else {
              if (this != (Object) (Object) da.field_d) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$2 = -26;
                  ki.g();
                  return true;
                }
              }
            }
          }
          L3: {
            var5 = dla.field_j;
            if (param1 == -19044) {
              break L3;
            } else {
              ((nv) this).field_zb = -75;
              break L3;
            }
          }
          L4: {
            if (var5 <= 0) {
              break L4;
            } else {
              L5: {
                if (var5 == gja.field_l) {
                  var5 = 63;
                  break L5;
                } else {
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (var6 >= ((nv) this).field_Db.length) {
                  break L4;
                } else {
                  if (var5 != ((nv) this).field_Db[var6]) {
                    var6++;
                    continue L6;
                  } else {
                    this.a(param2, var6, param0, true);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final boolean g(int param0) {
        int var4 = 0;
        gna var5 = null;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        if (param0 != -16360) {
            ((nv) this).field_Bb = -67;
        }
        gna[] var3 = ((nv) this).field_vb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_R != 0 ? 1 : 0);
        }
        if (var2 == 0) {
            if (((nv) this).field_xb != -1) {
                if (!(null == ((nv) this).field_Hb[((nv) this).field_xb])) {
                    var2 = ((nv) this).field_Hb[((nv) this).field_xb].g(-16360) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        nv var4 = null;
        gna var5 = null;
        int var6 = 0;
        nv var7 = null;
        gna stackIn_5_0 = null;
        gna stackIn_6_0 = null;
        gna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        gna stackOut_4_0 = null;
        gna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        gna stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = BachelorFridge.field_y;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((nv) this).field_vb.length) {
            if (param1 == 30091) {
              L1: {
                if (((nv) this).field_xb == -1) {
                  break L1;
                } else {
                  var7 = ((nv) this).field_Hb[((nv) this).field_xb];
                  var4 = var7;
                  if (var4 != null) {
                    var7.a(param0, param1, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((nv) this).field_Bb <= 0) {
                  break L2;
                } else {
                  this.b(-1 + ((nv) this).field_Bb, false);
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            var5 = ((nv) this).field_vb[var4_int];
            if (var5.field_R == 1) {
              L3: {
                this.a(param0, var4_int, param2, true);
                stackOut_4_0 = (gna) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((nv) this).field_xb != var4_int) {
                  stackOut_6_0 = (gna) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (gna) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_t = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
