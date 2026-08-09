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
            this.field_Cb = -14;
        }
        return this.field_Fb + (null != this.field_Eb ? this.field_Eb.g(22514) : 0);
    }

    final void a(boolean param0) {
        int var3 = 0;
        tv var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        tv[] var6 = this.field_Gb;
        tv[] var2 = var6;
        if (!param0) {
            this.a(33, (byte) -9, 44);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_cb = false;
            var4.field_y = 0;
        }
        if (!(null == this.field_Eb)) {
            this.field_Eb.a(param0);
            this.field_Eb.p(1);
        }
        this.field_Eb = null;
        this.field_tb = -1;
        this.a(12, 6);
    }

    public static void f(int param0) {
        field_Ab = null;
        if (param0 <= 52) {
            field_Ab = (String) null;
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        tv var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        tv[] var3 = this.field_Gb;
        for (var4 = param0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_y ? 1 : 0);
        }
        if (var2 == 0) {
            if (0 != (this.field_tb ^ -1) && null != this.field_zb[this.field_tb]) {
                var2 = this.field_zb[this.field_tb].h(param0 ^ 0) ? 1 : 0;
            }
        }
        return var2 != 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        this.field_Cb = param0;
        if (param1 <= 3) {
            return;
        }
        for (var5 = 0; this.field_Bb > var5; var5++) {
            var4 = this.field_Cb * this.field_Cb;
            var3 = this.field_wb * var5;
            this.field_Gb[var5].field_T = (var3 * (144 + -var4) - -((this.field_Db + -this.field_A) * var4)) / 144;
        }
    }

    eua(long param0, jea param1, jea param2, jea param3, eua[] param4, int[] param5, String[] param6, char[] param7) {
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
        il var17 = null;
        il var18 = null;
        this.field_tb = -1;
        try {
          L0: {
            this.field_zb = param4;
            this.field_ub = param5;
            this.field_xb = param7;
            this.field_Bb = this.field_ub.length;
            var17 = param3.field_H;
            var18 = var17;
            this.field_wb = var18.field_k + (var18.field_w + 2);
            this.field_Gb = new tv[this.field_Bb];
            this.field_vb = 0;
            this.field_yb = this.field_Bb * this.field_wb;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= this.field_Bb) {
                this.field_vb = this.field_vb + (10 + gfa.field_j.field_n);
                this.a(12, 93);
                break L0;
              } else {
                L2: {
                  if (this.field_xb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + no.a((byte) 67, this.field_xb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != this.field_zb[var13]) {
                      break L4;
                    } else {
                      if (-1 != this.field_ub[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = gfa.field_j;
                  break L3;
                }
                L5: {
                  this.field_Gb[var13] = new tv(0L, param2, (jea) null, param3, (iu) (var14), param6[var13]);
                  this.b(-123, this.field_Gb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (this.field_vb >= var15) {
                    break L5;
                  } else {
                    this.field_vb = var15;
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

            stackIn_15_1 = new StringBuilder().append("eua.<init>(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param3 == -62) {
            break L0;
          } else {
            this.field_vb = 1;
            break L0;
          }
        }
        L1: {
          if (param2 != this.field_tb) {
            if (this.field_zb[param2] != null) {
              this.a(true);
              this.a(0, 60);
              this.field_tb = param2;
              this.field_Eb = this.field_zb[this.field_tb];
              hj.a(this.field_Eb, (byte) 122);
              this.field_Eb.a(12, 116);
              break L1;
            } else {
              if (0 != (this.field_ub[param2] ^ -1)) {
                L2: {
                  var5 = this.field_ub[param2] | 32768;
                  var6 = bta.field_q;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (uu.field_a == null) {
                      break L2;
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (gda.a(var6, -20011) == 2) {
                    loa.a(var6, param0, (byte) 108, 1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = (String) null;
                opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
                oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
                f.b(param3 + -48);
                jq.c((byte) -25);
                break L1;
              } else {
                kra.a(false);
                f.b(param3 + 7);
                break L1;
              }
            }
          } else {
            this.a(true);
            this.a(0, 70);
            break L1;
          }
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if ((fna.field_h ^ -1) != -86) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Eb != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if ((this.field_Eb.field_tb ^ -1) != 0) {
                break L1;
              } else {
                this.a(true);
                this.a(0, 124);
                return true;
              }
            }
          }
          return this.field_Eb.a(param0, (byte) -105, param2);
        } else {
          L2: {
            if (null != this.field_Eb) {
              break L2;
            } else {
              if (this != kga.field_n) {
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
                if (var6 >= this.field_xb.length) {
                  return false;
                } else {
                  if (this.field_xb[var6] == var5) {
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
        int var4_int;
        tv var5;
        int var6;
        tv stackIn_7_0 = null;
        tv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        eua var4;
        eua var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_Gb.length) {
            L1: {
              if (param2 <= -52) {
                break L1;
              } else {
                eua.f(-120);
                break L1;
              }
            }
            L2: {
              if (this.field_tb == -1) {
                break L2;
              } else {
                var7 = this.field_zb[this.field_tb];
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
              if ((this.field_Cb ^ -1) >= -1) {
                break L3;
              } else {
                this.a(this.field_Cb - 1, 66);
                break L3;
              }
            }
            return;
          } else {
            var5 = this.field_Gb[var4_int];
            if (-2 == (var5.field_y ^ -1)) {
              L4: {
                this.a(param1, param0, var4_int, (byte) -62);
                stackIn_7_0 = (tv) (var5);

                if (var4_int != this.field_tb) {
                  stackIn_8_0 = (tv) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L4;
                } else {
                  stackIn_8_0 = (tv) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L4;
                }
              }
              stackIn_8_0.field_cb = stackIn_8_1 != 0;
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
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          this.field_Fb = this.field_vb - -(2 * param5);
          this.a(this.field_Fb, this.field_yb, -23776, -this.field_yb + param4, param1);
          if (param3 != this.field_Db) {
            this.field_Db = param3;
            this.a(this.field_Cb, 77);
            break L0;
          } else {
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (this.field_Bb <= var7) {
            L2: {
              if (param2 == -3269) {
                break L2;
              } else {
                field_Ab = (String) null;
                break L2;
              }
            }
            L3: {
              if ((this.field_tb ^ -1) == 0) {
                break L3;
              } else {
                if (null != this.field_zb[this.field_tb]) {
                  var7 = this.field_zb[this.field_tb].field_Bb;
                  var8 = (this.field_tb - -var7) * this.field_wb + this.field_T;
                  L4: while (true) {
                    if (param4 >= var8) {
                      this.field_zb[this.field_tb].a(param0, this.field_Fb + param1, param2 + 0, this.field_Gb[this.field_tb].field_A, var8, param5);
                      break L3;
                    } else {
                      var8 = var8 - this.field_wb;
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
            this.field_Gb[var7].a(this.field_Fb, 0, param0, this.field_wb, 0, param5, this.field_Gb[var7].field_T);
            var7++;
            continue L1;
          }
        }
    }

    static {
        field_Ab = "Lindemann totems";
    }
}
