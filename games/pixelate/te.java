/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends ak {
    private te[] field_Gb;
    private int field_Fb;
    private char[] field_Hb;
    static String field_Eb;
    private int[] field_Tb;
    private int field_Ob;
    private lo[] field_Sb;
    private int field_Kb;
    private te field_Pb;
    static String field_Ib;
    private int field_Jb;
    static ea field_Nb;
    private int field_Lb;
    private int field_Rb;
    private int field_Ub;
    private int field_Mb;
    static al field_Qb;

    final static void b(boolean param0, int param1) {
        int var2_int = 0;
        ck[] var3 = null;
        int var4 = 0;
        ck var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = -84 / ((29 - param1) / 52);
            var3 = jm.field_d;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                var5.a(100, param0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "te.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -2671) {
            field_Nb = (ea) null;
        }
        u.field_h = param0;
    }

    final void l(int param0) {
        int var3 = 0;
        lo var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        lo[] var6 = this.field_Sb;
        lo[] var2 = var6;
        if (param0 != 17872) {
            this.field_Hb = (char[]) null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_U = false;
            var4.field_P = 0;
        }
        if (!(null == this.field_Pb)) {
            this.field_Pb.l(17872);
            this.field_Pb.c(2779);
        }
        this.field_Pb = null;
        this.field_Lb = -1;
        this.a(12, (byte) -85);
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener(fj.field_c);
        param1.removeMouseMotionListener(fj.field_c);
        if (param0 != -47) {
            return;
        }
        try {
            param1.removeFocusListener(fj.field_c);
            jm.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          this.field_Fb = 2 * param3 + this.field_Rb;
          this.a(param0 - this.field_Ob, this.field_Ob, param1, 256, this.field_Fb);
          if (param5 != this.field_Ub) {
            this.field_Ub = param5;
            this.a(this.field_Kb, (byte) -79);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 == -94) {
            break L1;
          } else {
            this.field_Gb = (te[]) null;
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (var7 >= this.field_Mb) {
            L3: {
              if ((this.field_Lb ^ -1) == 0) {
                break L3;
              } else {
                if (this.field_Gb[this.field_Lb] == null) {
                  break L3;
                } else {
                  var7 = this.field_Gb[this.field_Lb].field_Mb;
                  var8 = this.field_Jb * (var7 + this.field_Lb) + this.field_S;
                  L4: while (true) {
                    if (var8 <= param0) {
                      this.field_Gb[this.field_Lb].a(var8, param1 + this.field_Fb, param2, param3, (byte) -94, this.field_Sb[this.field_Lb].field_gb);
                      break L3;
                    } else {
                      var8 = var8 - this.field_Jb;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            this.field_Sb[var7].a(this.field_Jb, param3, param2, this.field_Sb[var7].field_S, 0, this.field_Fb, param4 + -2147483554);
            var7++;
            continue L2;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if ((ke.field_a ^ -1) != -86) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (null != this.field_Pb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (this.field_Pb.field_Lb == -1) {
                this.l(17872);
                this.a(0, (byte) -82);
                return true;
              } else {
                break L1;
              }
            }
          }
          return this.field_Pb.a(param0, 0, param2);
        } else {
          L2: {
            if (null != this.field_Pb) {
              break L2;
            } else {
              if (bo.field_h != this) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  mj.a(false);
                  return true;
                }
              }
            }
          }
          L3: {
            var5 = nj.field_f;
            if (var5 <= param1) {
              break L3;
            } else {
              L4: {
                if (rk.field_d != var5) {
                  break L4;
                } else {
                  var5 = 63;
                  break L4;
                }
              }
              var6 = 0;
              L5: while (true) {
                if (this.field_Hb.length <= var6) {
                  break L3;
                } else {
                  if (var5 != this.field_Hb[var6]) {
                    var6++;
                    continue L5;
                  } else {
                    this.a(var6, param0, param1 ^ 88, param2);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int;
        lo var5;
        int var6;
        lo stackIn_7_0 = null;
        lo stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        te var4;
        te var7;
        var6 = Pixelate.field_H ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (this.field_Sb.length <= var4_int) {
            L1: {
              if (this.field_Lb != param1) {
                var7 = this.field_Gb[this.field_Lb];
                var4 = var7;
                if (var4 != null) {
                  var7.b(param0, param1 + 0, param2);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 > (this.field_Kb ^ -1)) {
                this.a(-1 + this.field_Kb, (byte) -106);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var5 = this.field_Sb[var4_int];
            if (1 == var5.field_P) {
              L3: {
                this.a(var4_int, param2, 118, param0);
                stackIn_7_0 = (lo) (var5);

                if (this.field_Lb != var4_int) {
                  stackIn_8_0 = (lo) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L3;
                } else {
                  stackIn_8_0 = (lo) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L3;
                }
              }
              stackIn_8_0.field_U = stackIn_8_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static int n(int param0) {
        if (param0 != 0) {
            return 100;
        }
        return ba.field_f;
    }

    final boolean m(int param0) {
        int var4 = 0;
        lo var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        lo[] var3 = this.field_Sb;
        if (param0 != 14685) {
            return false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (-1 != (var5.field_P ^ -1) ? 1 : 0);
        }
        if (var2 == 0 && (this.field_Lb ^ -1) != 0) {
            if (!(this.field_Gb[this.field_Lb] == null)) {
                var2 = this.field_Gb[this.field_Lb].m(param0 + 0) ? 1 : 0;
            }
        }
        return var2 != 0;
    }

    te(long param0, ak param1, ak param2, ak param3, te[] param4, int[] param5, String[] param6, char[] param7) {
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
        jl var17 = null;
        jl var18 = null;
        this.field_Lb = -1;
        try {
          L0: {
            this.field_Hb = param7;
            this.field_Tb = param5;
            this.field_Gb = param4;
            this.field_Mb = this.field_Tb.length;
            var17 = param3.field_Db;
            var18 = var17;
            this.field_Jb = var18.field_w + (2 + var18.field_z);
            this.field_Rb = 0;
            this.field_Ob = this.field_Jb * this.field_Mb;
            this.field_Sb = new lo[this.field_Mb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= this.field_Mb) {
                this.field_Rb = this.field_Rb + (10 + fe.field_b.field_A);
                this.a(12, (byte) -85);
                break L0;
              } else {
                L2: {
                  if (this.field_Hb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + ig.a(124, this.field_Hb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != this.field_Gb[var13]) {
                      break L4;
                    } else {
                      if (-1 != this.field_Tb[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = fe.field_b;
                  break L3;
                }
                L5: {
                  this.field_Sb[var13] = new lo(0L, param2, (ak) null, param3, (tf) (var14), param6[var13]);
                  this.a(this.field_Sb[var13], (byte) 26);
                  var15 = var17.c(param6[var13]);
                  if (var15 <= this.field_Rb) {
                    break L5;
                  } else {
                    this.field_Rb = var15;
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

            stackIn_15_1 = new StringBuilder().append("te.<init>(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    final int k(int param0) {
        if (param0 != -16200) {
            return 111;
        }
        return this.field_Fb - -(this.field_Pb != null ? this.field_Pb.k(-16200) : 0);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        this.field_Kb = param0;
        if (param1 > -73) {
            this.m(-111);
        }
        for (var5 = 0; var5 < this.field_Mb; var5++) {
            var3 = var5 * this.field_Jb;
            var4 = this.field_Kb * this.field_Kb;
            this.field_Sb[var5].field_S = ((-this.field_gb + this.field_Ub) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (this.field_Lb != param0) {
            if (this.field_Gb[param0] != null) {
              this.l(17872);
              this.a(0, (byte) -96);
              this.field_Lb = param0;
              this.field_Pb = this.field_Gb[this.field_Lb];
              oc.a(this.field_Pb, true);
              this.field_Pb.a(12, (byte) -104);
              break L0;
            } else {
              if (-1 != this.field_Tb[param0]) {
                L1: {
                  var5 = 32768 | this.field_Tb[param0];
                  var6 = ce.field_d;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (io.field_c != null) {
                      var6 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if ((kl.a(var6, 0) ^ -1) == -3) {
                    am.a(1, -26931, var6, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = (String) null;
                dg.a(true, ce.field_d, var5, (String) null, jo.field_k, param3);
                di.a(var5, fp.field_e, jo.field_k, (byte) 9, ce.field_d);
                mj.a(false);
                wn.d(-93);
                break L0;
              } else {
                pd.j(-127);
                mj.a(false);
                break L0;
              }
            }
          } else {
            this.l(17872);
            this.a(0, (byte) -118);
            break L0;
          }
        }
        L3: {
          if (param2 > 54) {
            break L3;
          } else {
            this.a(-128, -51, 10);
            break L3;
          }
        }
    }

    public static void j(int param0) {
        field_Qb = null;
        if (param0 != 1) {
            field_Eb = (String) null;
        }
        field_Eb = null;
        field_Nb = null;
        field_Ib = null;
    }

    static {
        field_Eb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_Ib = "Please log in to access this feature.";
        field_Nb = new ea(2);
    }
}
