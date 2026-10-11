/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static char[] field_f;
    private int field_t;
    private int field_e;
    private int field_k;
    private int field_g;
    private int field_o;
    private int field_d;
    private int field_l;
    static boolean field_i;
    private int field_a;
    private int field_j;
    private float field_c;
    private int field_p;
    static boolean field_m;
    static String field_b;
    private boolean field_s;
    private nc field_n;
    private int field_h;
    private int field_u;
    private int field_v;
    private int field_r;
    private int field_q;

    final void b(int param0) {
        if (null != ih.field_b) {
          return;
        }
        if (bn.field_d <= 0) {
          this.field_s = false;
        }
        if (!this.field_s) {
          if (fl.field_i < this.field_l) {
            fi.field_s = (this.field_l - fl.field_i) / 2;
          } else {
            if (this.field_l > 0) {
              fi.field_s = 0;
            }
          }
          if (fl.field_i != this.field_h ||
            this.field_r != km.field_B) {
            this.field_n.a(this.field_r, this.field_h, (byte) 125);
          }
          return;
        }
        int fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_k = this.field_t;
        if (this.field_q <= qk.field_b) {
          this.c((byte) 22);
          if (param0 != -7927) {
            li.b((byte) 33);
          }
          return;
        }
        this.field_s = false;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_l = param0;
        if (param2 > -104) {
          return;
        }
        this.field_j = param1;
    }

    public static void b(byte param0) {
        if (param0 != 112) {
          field_b = (String) null;
        }
        field_b = null;
        field_f = null;
    }

    final boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1558) {
          li.b((byte) -22);
        }
        stackIn_6_0 = (qk.field_b >= this.field_q) && (bn.field_d > 0);
        return stackIn_6_0;
    }

    final h a(int param0) {
        this.field_g = fl.field_i;
        this.field_v = km.field_B;
        this.field_n.a(this.field_p, this.field_e, (byte) 106);
        km.field_Db = false;
        if (param0 != 11) {
          li.a(true);
        }
        h var2 = wm.a(this.field_e, 0, this.field_p, 0, 5416, ei.field_c);
        if (var2 == null) {
          this.a((byte) -122);
        }
        return var2;
    }

    final static void a(boolean param0) {
        int stackIn_44_0 = 0;
        ic stackIn_62_0 = null;
        ic stackIn_66_0 = null;
        boolean stackIn_67_1 = false;
        double stackIn_69_2 = 0.0;
        boolean stackIn_70_3;
        int var1;
        double var2_double;
        ic var2;
        int var3;
        double var4;
        double var6;
        int var8;
        double var4Lifetime1;
        double var6Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        if (tg.field_x == 0 &&
          !gb.g(true) &&
          !ug.a(true) &&
          !eg.a((byte) 47)) {
          if (param0) {
            field_f = (char[]) null;
          }
          if (oi.field_g != 0 &&
            hm.field_c == 10) {
            el.a(12229, true);
          }
          if (oi.field_g != 0) {
            qa.field_e = uk.a(-123, ii.field_b, a.field_y);
            if (0 == qa.field_e &&
              wn.field_C != 0) {
              if (bc.field_c < 2) {
                bc.field_c = co.field_l;
              } else {
                bc.field_c = 0;
              }
              ka.a(mf.a(108, i.field_y), (byte) 87);
            } else {
              if (2 == wn.field_C &&
                5 == qa.field_e) {
                el.a(true, (byte) -106);
              }
            }
          }
          qa.field_e = uk.a(-109, nl.field_u, hk.field_Jb);
          if (j.field_e != 0 &&
            2 == wn.field_C) {
            if (qa.field_e == 1) {
              tl.a(0.0f, param0, 0.029999999329447746f);
            } else {
              if (qa.field_e != 2) {
                if (qa.field_e != 3) {
                  if (qa.field_e == 4) {
                    tl.a(-8.0f, false, 0.0f);
                  }
                } else {
                  tl.a(8.0f, false, 0.0f);
                }
              } else {
                tl.a(0.0f, false, -0.029999999329447746f);
              }
            }
          }
          if (hm.field_c == i.field_y) {
            if (pg.field_g == nf.field_g) {
              if (10 != i.field_y) {
                stackIn_44_0 = (-1 != qa.field_e) ? 1 : 0;
              } else {
                stackIn_44_0 = 1;
              }
            } else {
              stackIn_44_0 = 1;
            }
          } else {
            stackIn_44_0 = 1;
          }
          var1 = stackIn_44_0;
          if (!ke.field_p.field_g) {
            fa.field_k = (double)(hk.field_Jb - tm.field_g + 200);
            sf.field_M = (double)nl.field_u;
          } else {
            var2_double = (double)(nl.field_u - (df.field_e >> 1)) / 512.0;
            var4 = (double)(-tm.field_g + hk.field_Jb) / 512.0;
            var6 = -nk.field_K[2] / (nk.field_K[11] + (nk.field_K[5] * var2_double + var4 * nk.field_K[8]));
            sf.field_M = 4.0 * ((var2_double * nk.field_K[3] + var4 * nk.field_K[6] + nk.field_K[9]) * var6 + nk.field_K[0]);
            fa.field_k = (double)(-(df.field_f >> 1) + 440) + (nk.field_K[1] + (nk.field_K[10] + (var2_double * nk.field_K[4] + nk.field_K[7] * var4)) * var6) * 4.0;
            if (0.0 > nk.field_K[11]) {
              sf.field_M = 320.0 - sf.field_M;
            } else {
              sf.field_M = 320.0 + sf.field_M;
            }
            if (we.field_c.field_J > hk.field_Jb) {
              if ((j.field_e == 2 ||
                dc.field_Y[81]) &&
                (sf.field_F != -1 &&
                nl.field_u != -1)) {
                tl.a(0.0f, false, 0.004999999888241291f * (float)(-sf.field_F + nl.field_u));
              }
              if (og.field_b != 0) {
                tl.a((float)(24 * og.field_b), false, 0.0f);
              }
            }
          }
          if (vg.field_I == null) {
            stackIn_62_0 = ei.field_b;
          } else {
            stackIn_62_0 = vg.field_I;
          }
          var2 = stackIn_62_0;
          if (var2 != null) {
            stackIn_66_0 = var2;
            stackIn_67_1 = (-1 != i.field_y) ? false : true;
            stackIn_69_2 = fa.field_k;
            stackIn_70_3 = (!(nk.field_K[11] < 0.0)) ? false : true;
            ((ic) (Object) stackIn_66_0).a(stackIn_67_1, stackIn_69_2, stackIn_70_3, j.field_e, sf.field_M, oi.field_g, var1 != 0, (byte) -64);
          }
          if (ab.b(i.field_y, 1)) {
            al.field_j[i.field_y].a(var1 != 0, fa.field_k, sf.field_M, oi.field_g, -3666, oi.field_g);
          }
          if (w.field_J &&
            ke.field_p.field_h &&
            sf.field_F != -1 &&
            nl.field_u != -1 &&
            hk.field_Jb != -1) {
            var3 = Math.abs(nl.field_u - sf.field_F) + Math.abs(-pb.field_h + hk.field_Jb);
            var4Lifetime1 = sf.field_M;
            var6Lifetime1 = fa.field_k;
            if (110.0 < var4Lifetime1 &&
              var4Lifetime1 < 530.0 &&
              var6Lifetime1 > 0.0 &&
              var6Lifetime1 < 400.0) {
              gd.field_n.a(new pm((int)(16.0 * var4Lifetime1), (int)(var6Lifetime1 * 16.0), Math.min(ke.field_p.field_c, ke.field_p.field_i * var3 + ke.field_p.field_a)), (byte) -38);
            }
          }
          if (db.b((byte) 13, 0) &&
            hj.field_h > 0 &&
            oi.field_g == 1 &&
            nl.field_u > il.field_k &&
            nl.field_u < il.field_I &&
            il.field_B < hk.field_Jb &&
            hk.field_Jb < il.field_p &&
            (rn.field_c & 512) == 0) {
            vf.a(-64);
          }
          pb.field_h = hk.field_Jb;
          sf.field_F = nl.field_u;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, byte param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime2;
        var20 = Virogrid.field_F ? 1 : 0;
        try {
          if (param4 >= 0 &&
            param0 < fk.field_n) {
            if (param1 < 0 &&
              0 > param5 &&
              param7 < 0) {
              return;
            }
            if (param1 >= fk.field_o &&
              param5 >= fk.field_o &&
              param7 >= fk.field_o) {
              return;
            }
            var10 = 31 / ((0 - param8) / 32);
            var15 = -param0 + param4;
            if (param2 == param0) {
              if (param4 != param0) {
                var16 = param4 - param2;
                if (param1 >= param5) {
                  var9_int = param5 << 16;
                  var11 = param1 << 16;
                  var13 = (param7 - param1 << 16) / var15;
                  var12 = (-param5 + param7 << 16) / var16;
                } else {
                  var13 = (-param5 + param7 << 16) / var16;
                  var9_int = param1 << 16;
                  var11 = param5 << 16;
                  var12 = (param7 - param1 << 16) / var15;
                }
              } else {
                var13 = 0;
                var9_int = param1 << 16;
                var12 = 0;
                var11 = param5 << 16;
              }
              if (param0 < 0) {
                param0 = Math.min(-param0, param2 - param0);
                var9_int = var9_int + param0 * var12;
                var11 = var11 + param0 * var13;
                param0 = 0;
              }
              var14 = 0;
            } else {
              var11 = param1 << 16;
              var9_int = param1 << 16;
              var16 = -param0 + param2;
              var13 = (param7 - param1 << 16) / var15;
              var12 = (param5 - param1 << 16) / var16;
              if (var13 <= var12) {
                var17 = var12;
                var12 = var13;
                var13 = var17;
                var14 = 1;
              } else {
                var14 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param2 < 0) {
                  param0 = param2 - param0;
                  var9_int = var9_int + param0 * var12;
                  var11 = var11 + var13 * param0;
                  param0 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var11 = var11 + param0 * var13;
                  var9_int = var9_int + param0 * var12;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = fk.field_m[param0];
                while (param0 < param2) {
                  var18 = var9_int >> 16;
                  if (fk.field_o > var18) {
                    var19 = -(var9_int >> 16) + (var11 >> 16);
                    if (var19 != 0) {
                      if (fk.field_o <= var18 + var19) {
                        var19 = fk.field_o + (-var18 - 1);
                      }
                      if (var18 >= 0) {
                        jm.a(var19, param3, var18 + var17Lifetime2, true, param6);
                      } else {
                        jm.a(var18 + var19, param3, var17Lifetime2, true, param6);
                      }
                    } else {
                      if (var18 >= 0 &&
                        fk.field_o > var18) {
                        jm.a(var19, param3, var17Lifetime2 + var18, true, param6);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= fk.field_n) {
                    return;
                  }
                  var9_int = var9_int + var12;
                  var17Lifetime2 = var17Lifetime2 + df.field_e;
                  var11 = var11 + var13;
                }
              }
              var17Lifetime3 = -param2 + param4;
              if (var17Lifetime3 != 0) {
                var18Lifetime2 = param7 << 16;
                if (var14 != 0) {
                  var11 = param5 << 16;
                } else {
                  var9_int = param5 << 16;
                }
                var13 = (-var11 + var18Lifetime2) / var17Lifetime3;
                var12 = (var18Lifetime2 - var9_int) / var17Lifetime3;
              } else {
                var12 = 0;
                var13 = 0;
              }
            }
            if (param0 < 0) {
              param0 = -param0;
              var11 = var11 + var13 * param0;
              var9_int = var9_int + param0 * var12;
              param0 = 0;
            }
            var16Lifetime1 = fk.field_m[param0];
            while (param0 < param4) {
              var17Lifetime1 = var9_int >> 16;
              if (var17Lifetime1 < fk.field_o) {
                var18Lifetime1 = (var11 >> 16) - (var9_int >> 16);
                if (var18Lifetime1 != 0) {
                  if (var18Lifetime1 + var17Lifetime1 >= fk.field_o) {
                    var18Lifetime1 = fk.field_o + (-var17Lifetime1 - 1);
                  }
                  if (var17Lifetime1 >= 0) {
                    jm.a(var18Lifetime1, param3, var16Lifetime1 + var17Lifetime1, true, param6);
                  } else {
                    jm.a(var17Lifetime1 + var18Lifetime1, param3, var16Lifetime1, true, param6);
                  }
                } else {
                  if (var17Lifetime1 >= 0 &&
                    var17Lifetime1 < fk.field_o) {
                    jm.a(var18Lifetime1, param3, var16Lifetime1 + var17Lifetime1, true, param6);
                  }
                }
              }
              param0++;
              if (param0 >= fk.field_n) {
                return;
              }
              var9_int = var9_int + var12;
              var16Lifetime1 = var16Lifetime1 + df.field_e;
              var11 = var11 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_76_0 = var9;
          stackIn_76_1 = new StringBuilder().append("li.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = this.field_l;
        var3 = this.field_j;
        if (!this.c(-1558)) {
          this.field_s = false;
          return;
        }
        if (this.field_a >= var3) {
          if (var3 < this.field_o) {
            var3 = this.field_o;
          }
        } else {
          var3 = this.field_a;
        }
        if (var2 > this.field_u) {
          var2 = this.field_u;
        } else {
          if (var2 < this.field_d) {
            var2 = this.field_d;
          }
        }
        if (0.0f < this.field_c) {
          var4 = (int)(0.5f + this.field_c * (float)var3);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_c);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (var2 != fl.field_i ||
          var3 != km.field_B) {
          this.field_n.a(var3, var2, (byte) 40);
        }
        if (param0 != 22) {
          this.field_e = 41;
        }
        if (this.field_l > 0) {
          fi.field_s = (this.field_l - fl.field_i) / 2;
        }
    }

    final void a(byte param0) {
        this.field_n.a(this.field_v, this.field_g, (byte) 47);
        if (param0 != -122) {
          int[] var3 = (int[]) null;
          li.a(16, 40, -84, (int[]) null, -112, -39, -22, 49, (byte) -74);
        }
    }

    private li() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new char[]{(char)91, (char)93, (char)35};
        field_m = false;
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
