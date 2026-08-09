/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kc {
    private int field_Db;
    private char[] field_Lb;
    private int field_Kb;
    static qb field_Tb;
    static String field_Rb;
    static String field_Gb;
    static String field_Cb;
    private int field_Mb;
    private nl[] field_Bb;
    private int field_Qb;
    private int field_Jb;
    static String field_Ob;
    static String[] field_Ub;
    private int field_Nb;
    private int field_Hb;
    private int field_Eb;
    private ij[] field_Fb;
    static qb[] field_Pb;
    private ij field_Sb;
    private int[] field_Ib;

    private final static void a(int param0, int param1, int param2, long param3, String param4) {
        rf.field_n = param3;
        vh.field_A = param4;
        qj.field_c = param1;
        if (param0 != -1) {
            return;
        }
        try {
            hi.field_g = param2;
            bo.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ij.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        if (param1 != 10) {
            return false;
        }
        return (param0 ^ -1) <= -1 ? true : false;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (this.field_Hb != param3) {
            if (null != this.field_Fb[param3]) {
              this.e(46);
              this.c(-99, 0);
              this.field_Hb = param3;
              this.field_Sb = this.field_Fb[this.field_Hb];
              vl.a((byte) 121, this.field_Sb);
              this.field_Sb.c(-111, 12);
              break L0;
            } else {
              if (this.field_Ib[param3] == -1) {
                ua.g(-19741);
                gb.a(14);
                break L0;
              } else {
                L1: {
                  var5 = 32768 | this.field_Ib[param3];
                  var6 = nj.field_c;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null == wi.field_f) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if ((oh.a((byte) 122, var6) ^ -1) != -3) {
                    break L2;
                  } else {
                    ea.a(param2, 1, true, var6);
                    break L2;
                  }
                }
                var8 = (String) null;
                sd.a(var5, (String) null, 70, param1, nj.field_c, so.field_p);
                ij.a(param0 ^ -13, nj.field_c, var5, gg.field_e, so.field_p);
                gb.a(14);
                cf.a(-113);
                break L0;
              }
            }
          } else {
            this.e(-100);
            this.c(-56, 0);
            break L0;
          }
        }
        L3: {
          if (param0 == 12) {
            break L3;
          } else {
            this.field_Kb = 86;
            break L3;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int;
        nl var5;
        int var6;
        nl stackIn_7_0 = null;
        nl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ij var4;
        ij var7;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (this.field_Bb.length <= var4_int) {
            L1: {
              if (param1 == -10284) {
                break L1;
              } else {
                this.field_Db = 41;
                break L1;
              }
            }
            L2: {
              if (-1 != this.field_Hb) {
                var7 = this.field_Fb[this.field_Hb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, -10284, param2);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 > (this.field_Qb ^ -1)) {
                this.c(param1 ^ 10345, this.field_Qb - 1);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = this.field_Bb[var4_int];
            if (-2 == (var5.field_U ^ -1)) {
              L4: {
                this.a(param1 ^ -10280, param2, param0, var4_int);
                stackIn_7_0 = (nl) (var5);

                if (var4_int != this.field_Hb) {
                  stackIn_8_0 = (nl) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L4;
                } else {
                  stackIn_8_0 = (nl) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L4;
                }
              }
              stackIn_8_0.field_ab = stackIn_8_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void e(int param0) {
        int var3 = 0;
        nl var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        nl[] var6 = this.field_Bb;
        nl[] var2_ref_nl__ = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_U = 0;
            var4.field_ab = false;
        }
        if (!(this.field_Sb == null)) {
            this.field_Sb.e(78);
            this.field_Sb.a(true);
        }
        this.field_Sb = null;
        int var2 = -112 % ((-38 - param0) / 54);
        this.field_Hb = -1;
        this.c(-99, 12);
    }

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_Qb = param1;
        if (param0 >= -50) {
            return;
        }
        for (var5 = 0; var5 < this.field_Jb; var5++) {
            var3 = this.field_Db * var5;
            var4 = this.field_Qb * this.field_Qb;
            this.field_Bb[var5].field_db = (var3 * (-var4 + 144) + var4 * (-this.field_nb + this.field_Mb)) / 144;
        }
    }

    ij(long param0, kc param1, kc param2, kc param3, ij[] param4, int[] param5, String[] param6, char[] param7) {
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
        dj var17 = null;
        dj var18 = null;
        this.field_Hb = -1;
        try {
          L0: {
            this.field_Ib = param5;
            this.field_Fb = param4;
            this.field_Lb = param7;
            this.field_Jb = this.field_Ib.length;
            var17 = param3.field_Z;
            var18 = var17;
            this.field_Db = var18.field_m + 2 - -var18.field_C;
            this.field_Eb = this.field_Db * this.field_Jb;
            this.field_Kb = 0;
            this.field_Bb = new nl[this.field_Jb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_Jb <= var13) {
                this.field_Kb = this.field_Kb + (ql.field_c.field_n + 10);
                this.c(-70, 12);
                break L0;
              } else {
                L2: {
                  if (this.field_Lb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + hg.a(3, this.field_Lb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (this.field_Fb[var13] != null) {
                      break L4;
                    } else {
                      if (-1 != this.field_Ib[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = ql.field_c;
                  break L3;
                }
                L5: {
                  this.field_Bb[var13] = new nl(0L, param2, (kc) null, param3, (qb) (var14), param6[var13]);
                  this.a(this.field_Bb[var13], 90);
                  var15 = var17.b(param6[var13]);
                  if (var15 <= this.field_Kb) {
                    break L5;
                  } else {
                    this.field_Kb = var15;
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

            stackIn_15_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');

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

    final boolean f(byte param0) {
        int var4 = 0;
        nl var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        nl[] var3 = this.field_Bb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_U ? 1 : 0);
        }
        if (param0 != 93) {
            this.field_Kb = 102;
        }
        if (var2 == 0) {
            if (0 != (this.field_Hb ^ -1) && this.field_Fb[this.field_Hb] != null) {
                var2 = this.field_Fb[this.field_Hb].f((byte) 93) ? 1 : 0;
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          this.field_Nb = this.field_Kb + 2 * param0;
          this.a(this.field_Nb, param1, param2 - this.field_Eb, this.field_Eb, (byte) -120);
          if (this.field_Mb == param4) {
            break L0;
          } else {
            this.field_Mb = param4;
            this.c(-95, this.field_Qb);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (var7 >= this.field_Jb) {
            L2: {
              if (param3) {
                break L2;
              } else {
                field_Tb = (qb) null;
                break L2;
              }
            }
            L3: {
              if ((this.field_Hb ^ -1) == 0) {
                break L3;
              } else {
                if (null != this.field_Fb[this.field_Hb]) {
                  var7 = this.field_Fb[this.field_Hb].field_Jb;
                  var8 = this.field_db + (this.field_Hb + var7) * this.field_Db;
                  L4: while (true) {
                    if (var8 <= param2) {
                      this.field_Fb[this.field_Hb].a(param0, param1 - -this.field_Nb, var8, param3, this.field_Bb[this.field_Hb].field_nb, param5);
                      break L3;
                    } else {
                      var8 = var8 - this.field_Db;
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
            this.field_Bb[var7].a(param0, 0, this.field_Db, this.field_Nb, 0, this.field_Bb[var7].field_db, param5);
            var7++;
            continue L1;
          }
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            this.b(39, 104, -123);
        }
        return this.field_Nb + (null == this.field_Sb ? 0 : this.field_Sb.f(param0 + 0));
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (-86 != (vn.field_d ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Sb != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if ((this.field_Sb.field_Hb ^ -1) != 0) {
                break L1;
              } else {
                this.e(42);
                this.c(-103, 0);
                return true;
              }
            }
          }
          return this.field_Sb.b(100, param1, param2);
        } else {
          L2: {
            if (null != this.field_Sb) {
              break L2;
            } else {
              if (this != nn.field_q) {
                break L2;
              } else {
                if (var4 != 0) {
                  gb.a(14);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            var5 = ed.field_Bb;
            if (param0 >= 76) {
              break L3;
            } else {
              this.c(22, -124);
              break L3;
            }
          }
          L4: {
            if (0 >= var5) {
              break L4;
            } else {
              L5: {
                if (se.field_E != var5) {
                  break L5;
                } else {
                  var5 = 63;
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (this.field_Lb.length <= var6) {
                  break L4;
                } else {
                  if (this.field_Lb[var6] == var5) {
                    this.a(12, param1, param2, var6);
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

    public static void g(int param0) {
        field_Ob = null;
        if (param0 != 12) {
            field_Cb = (String) null;
        }
        field_Tb = null;
        field_Gb = null;
        field_Ub = null;
        field_Pb = null;
        field_Cb = null;
        field_Rb = null;
    }

    static {
        field_Cb = "Sorted by win percentage";
        field_Gb = "<%0> has entered another game.";
        field_Rb = "Don't mind";
        field_Ub = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to ArcanistsMultiText.text_benefits."};
        field_Ob = "Click  to buy this spellbook!";
    }
}
