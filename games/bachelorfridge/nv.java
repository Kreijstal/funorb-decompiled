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
            field_wb = (ee) null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_Db = (char[]) null;
        }
        return this.field_Fb + (this.field_Eb != null ? this.field_Eb.b(param0) : 0);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 >= -91) {
            nv.f(-20);
        }
        this.field_Fb = 2 * param4 + this.field_Gb;
        this.a(this.field_Ib, 31407, this.field_Fb, param3, param2 - this.field_Ib);
        if (!(param1 == this.field_zb)) {
            this.field_zb = param1;
            this.b(this.field_Bb, false);
        }
        for (var7 = 0; this.field_Cb > var7; var7++) {
            this.field_vb[var7].a(this.field_Fb, param4, this.field_Ab, 0, param5, (byte) -88, this.field_vb[var7].field_rb);
        }
        if (-1 != this.field_xb) {
            if (!(this.field_Hb[this.field_xb] == null)) {
                var7 = this.field_Hb[this.field_xb].field_Cb;
                for (var8 = (this.field_xb - -var7) * this.field_Ab + this.field_rb; var8 > param2; var8 = var8 - this.field_Ab) {
                }
                this.field_Hb[this.field_xb].a((byte) -97, this.field_vb[this.field_xb].field_M, var8, this.field_Fb + param3, param4, param5);
            }
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = BachelorFridge.field_y;
          if (param3) {
            break L0;
          } else {
            this.a(-125, -33, -91);
            break L0;
          }
        }
        L1: {
          if (this.field_xb == param1) {
            this.f((byte) -128);
            this.b(0, false);
            break L1;
          } else {
            if (this.field_Hb[param1] == null) {
              if (0 == (this.field_yb[param1] ^ -1)) {
                js.a(121);
                ki.g(-26);
                break L1;
              } else {
                L2: {
                  var5 = 32768 | this.field_yb[param1];
                  var6 = gk.field_d;
                  if (0 != var6) {
                    break L2;
                  } else {
                    if (null != pw.field_w) {
                      var6 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (af.a(var6, 26291) == 2) {
                    fk.a(113, var6, param0, 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = (String) null;
                no.a(var5, gk.field_d, 110, (String) null, bd.field_k, param2);
                ob.a(eaa.field_a, (byte) -47, gk.field_d, var5, bd.field_k);
                ki.g(-26);
                vca.c(true);
                break L1;
              }
            } else {
              this.f((byte) -98);
              this.b(0, false);
              this.field_xb = param1;
              this.field_Eb = this.field_Hb[this.field_xb];
              dka.a(this.field_Eb, (byte) 59);
              this.field_Eb.b(12, false);
              break L1;
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = BachelorFridge.field_y;
        this.field_Bb = param0;
        if (param1) {
            this.b(false);
        }
        for (var5 = 0; this.field_Cb > var5; var5++) {
            var3 = var5 * this.field_Ab;
            var4 = this.field_Bb * this.field_Bb;
            this.field_vb[var5].field_rb = (var4 * (this.field_zb - this.field_M) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void f(byte param0) {
        int var3 = 0;
        gna var4 = null;
        int var5 = BachelorFridge.field_y;
        gna[] var6 = this.field_vb;
        gna[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_t = false;
            var4.field_R = 0;
        }
        if (param0 > -90) {
            this.b(false);
        }
        if (this.field_Eb != null) {
            this.field_Eb.f((byte) -97);
            this.field_Eb.a(false);
        }
        this.field_Eb = null;
        this.field_xb = -1;
        this.b(12, false);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param2 >= -82) {
            field_wb = (ee) null;
        }
        if (jea.field_c != null && 13 == gf.field_k) {
            jea.field_c = null;
            return true;
        }
        if (!lna.field_q) {
            if (gm.field_k || (gf.field_k ^ -1) == -10 || -11 == (gf.field_k ^ -1) || 11 == gf.field_k) {
                return wi.a(103, param0, param1);
            }
            if (gf.field_k == 80) {
                if (!cn.d((byte) 23)) {
                    return false;
                }
                lna.field_q = true;
                return true;
            }
            return false;
        }
        if (!cn.d((byte) 64)) {
            return false;
        }
        int var4 = vaa.a(param3, 1, param0) ? 1 : 0;
        if ((gf.field_k ^ -1) == -81 || (gf.field_k ^ -1) == -85) {
            var4 = 1;
            lna.field_q = false;
        }
        if ((gf.field_k ^ -1) == -14) {
            bea.d(-125);
            var4 = 1;
            lna.field_q = false;
        }
        return var4 != 0;
    }

    nv(long param0, sna param1, sna param2, sna param3, nv[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        po var17 = null;
        po var18 = null;
        this.field_xb = -1;
        try {
          L0: {
            this.field_Db = param7;
            this.field_yb = param5;
            this.field_Hb = param4;
            this.field_Cb = this.field_yb.length;
            var17 = param3.field_jb;
            var18 = var17;
            this.field_Ab = var18.field_B + (2 - -var18.field_u);
            this.field_vb = new gna[this.field_Cb];
            this.field_Gb = 0;
            this.field_Ib = this.field_Cb * this.field_Ab;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_Cb <= var13) {
                this.field_Gb = this.field_Gb + (10 + kga.field_a.field_n);
                this.b(12, false);
                break L0;
              } else {
                L2: {
                  if (0 >= this.field_Db[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + oja.a((byte) -113, this.field_Db[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != this.field_Hb[var13]) {
                      break L4;
                    } else {
                      if ((this.field_yb[var13] ^ -1) != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = kga.field_a;
                  break L3;
                }
                L5: {
                  this.field_vb[var13] = new gna(0L, param2, (sna) null, param3, (kv) (var14), param6[var13]);
                  this.a(-1, this.field_vb[var13]);
                  var15 = var17.a(param6[var13]);
                  if (var15 <= this.field_Gb) {
                    break L5;
                  } else {
                    this.field_Gb = var15;
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
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("nv.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if ((gf.field_k ^ -1) != -86) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (null != this.field_Eb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == this.field_Eb.field_xb) {
                this.f((byte) -107);
                this.b(0, false);
                return true;
              } else {
                break L1;
              }
            }
          }
          return this.field_Eb.b(param0, param1 ^ 0, param2);
        } else {
          L2: {
            if (this.field_Eb != null) {
              break L2;
            } else {
              if (this != da.field_d) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  ki.g(-26);
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
              this.field_zb = -75;
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
                if (var6 >= this.field_Db.length) {
                  break L4;
                } else {
                  if (var5 != this.field_Db[var6]) {
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
        int var2;
        gna[] var3;
        int var4;
        gna var5;
        int var6;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          var2 = 0;
          if (param0 == -16360) {
            break L0;
          } else {
            this.field_Bb = -67;
            break L0;
          }
        }
        var3 = this.field_vb;
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var4 >= var3.length) {
                if (var2 != 0) {
                  break L2;
                } else {
                  if (0 == (this.field_xb ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              } else {
                var5 = var3[var4];
                stackIn_7_0 = var2;

                stackIn_7_1 = var5.field_R;

                L4: {


                  if (stackIn_7_1 == 0) {

                    stackIn_10_1 = 0;
                    break L4;
                  } else {

                    stackIn_10_1 = 1;
                    break L4;
                  }
                }
                var2 = stackIn_7_0 | stackIn_10_1;
                var4++;
                continue L1;
              }
            }
            if (null != this.field_Hb[this.field_xb]) {
              L5: {
                if (!this.field_Hb[this.field_xb].g(-16360)) {
                  stackIn_18_0 = 0;
                  break L5;
                } else {
                  stackIn_18_0 = 1;
                  break L5;
                }
              }
              var2 = stackIn_18_0;
              break L2;
            } else {
              break L2;
            }
          }
          return var2 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int;
        gna var5;
        int var6;
        gna stackIn_7_0 = null;
        gna stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        nv var4;
        nv var7;
        var6 = BachelorFridge.field_y;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_vb.length) {
            if (param1 == 30091) {
              L1: {
                if ((this.field_xb ^ -1) == 0) {
                  break L1;
                } else {
                  var7 = this.field_Hb[this.field_xb];
                  var4 = var7;
                  if (var4 != null) {
                    var7.a(param0, param1 ^ 0, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_Bb <= 0) {
                  break L2;
                } else {
                  this.b(-1 + this.field_Bb, false);
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            var5 = this.field_vb[var4_int];
            if ((var5.field_R ^ -1) == -2) {
              L3: {
                this.a(param0, var4_int, param2, true);
                stackIn_7_0 = (gna) (var5);

                if (this.field_xb != var4_int) {
                  stackIn_8_0 = (gna) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L3;
                } else {
                  stackIn_8_0 = (gna) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L3;
                }
              }
              stackIn_8_0.field_t = stackIn_8_1 != 0;
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
