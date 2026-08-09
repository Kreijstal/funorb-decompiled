/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private long field_h;
    private int field_i;
    private qa field_e;
    static cj field_j;
    static String field_c;
    private int field_g;
    static boolean field_a;
    static int field_f;
    private qa[] field_k;
    static cj field_d;
    private qa field_b;

    final static void a(int param0, ja[] param1, String param2, boolean param3, int param4, int param5, int param6, fm param7, int param8, byte param9, int param10, int param11, int param12, boolean param13, ja[] param14) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              aj.a(qf.field_c, param8, param4, param0, param5, param10, kk.field_x, param7, param0, param6, e.field_a, param12, new pd(param14), param12, new pd(param1), param7, ua.field_N, ic.field_g, sb.field_c, (byte) 70);
              gk.a(param13, 2, param2, param11, param3);
              if (param9 == -103) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final qa c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        qa var4;
        qa var8;
        qa var11;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_g > 0) {
          if (this.field_e == this.field_k[this.field_g - 1]) {
            if (param0 > 94) {
              L0: while (true) {
                if (this.field_i > this.field_g) {
                  fieldTemp$2 = this.field_g;
                  this.field_g = this.field_g + 1;
                  var8 = this.field_k[fieldTemp$2].field_k;
                  if (this.field_k[this.field_g + -1] != var8) {
                    this.field_e = var8.field_k;
                    return var8;
                  } else {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (qa) null;
            }
          } else {
            var11 = this.field_e;
            this.field_e = var11.field_k;
            return var11;
          }
        } else {
          if (param0 > 94) {
            L1: while (true) {
              if (this.field_i > this.field_g) {
                fieldTemp$3 = this.field_g;
                this.field_g = this.field_g + 1;
                var4 = this.field_k[fieldTemp$3].field_k;
                if (this.field_k[this.field_g + -1] != var4) {
                  this.field_e = var4.field_k;
                  return var4;
                } else {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return (qa) null;
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        if (!param0) {
            field_f = -125;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, qa param1, long param2) {
        qa var5 = null;
        try {
            if (param1.field_p != null) {
                param1.a(-4564);
            }
            var5 = this.field_k[(int)((long)(this.field_i + param0) & param2)];
            param1.field_p = var5.field_p;
            param1.field_k = var5;
            param1.field_p.field_k = param1;
            param1.field_l = param2;
            param1.field_k.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final qa b(byte param0) {
        Object stackIn_8_0 = null;
        Object stackIn_18_0 = null;
        qa var2;
        qa var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_b) {
          if (param0 == 68) {
            var2 = this.field_k[(int)(this.field_h & (long)(this.field_i + -1))];
            L0: while (true) {
              if (this.field_b != var2) {
                stackIn_18_0 = this;

                if (var4 == 0) {
                  if (((sc) (this)).field_h == this.field_b.field_l) {
                    var3 = this.field_b;
                    this.field_b = this.field_b.field_k;
                    return var3;
                  } else {
                    this.field_b = this.field_b.field_k;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      this.field_b = null;
                      return null;
                    }
                  }
                } else {
                  ((sc) (this)).field_b = null;
                  return null;
                }
              } else {
                this.field_b = null;
                return null;
              }
            }
          } else {
            sc.a(false);
            var2 = this.field_k[(int)(this.field_h & (long)(this.field_i + -1))];
            L1: while (true) {
              if (this.field_b != var2) {
                stackIn_8_0 = this;

                if (var4 == 0) {
                  if (((sc) (this)).field_h == this.field_b.field_l) {
                    var3 = this.field_b;
                    this.field_b = this.field_b.field_k;
                    return var3;
                  } else {
                    this.field_b = this.field_b.field_k;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      this.field_b = null;
                      return null;
                    }
                  }
                } else {
                  ((sc) (this)).field_b = null;
                  return null;
                }
              } else {
                this.field_b = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final qa a(byte param0) {
        this.field_g = 0;
        if (param0 != 7) {
            sc.d((byte) -11);
            return this.c((byte) 108);
        }
        return this.c((byte) 108);
    }

    final qa a(long param0, int param1) {
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        qa var4;
        qa var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == -22877) {
          this.field_h = param0;
          var4 = this.field_k[(int)((long)(-1 + this.field_i) & param0)];
          this.field_b = var4.field_k;
          L0: while (true) {
            if (this.field_b != var4) {
              stackIn_7_0 = this;

              if (var6 == 0) {
                if (((sc) (this)).field_b.field_l != param0) {
                  this.field_b = this.field_b.field_k;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_b = null;
                    return null;
                  }
                } else {
                  var5 = this.field_b;
                  this.field_b = this.field_b.field_k;
                  return var5;
                }
              } else {
                ((sc) (this)).field_b = null;
                return null;
              }
            } else {
              this.field_b = null;
              return null;
            }
          }
        } else {
          field_j = (cj) null;
          this.field_h = param0;
          var4 = this.field_k[(int)((long)(-1 + this.field_i) & param0)];
          this.field_b = var4.field_k;
          L1: while (true) {
            if (this.field_b != var4) {
              stackIn_16_0 = this;

              if (var6 == 0) {
                if (((sc) (this)).field_b.field_l != param0) {
                  this.field_b = this.field_b.field_k;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_b = null;
                    return null;
                  }
                } else {
                  var5 = this.field_b;
                  this.field_b = this.field_b.field_k;
                  return var5;
                }
              } else {
                ((sc) (this)).field_b = null;
                return null;
              }
            } else {
              this.field_b = null;
              return null;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= -71) {
            field_f = -61;
            io.a(-21113, false, param1);
            return;
        }
        io.a(-21113, false, param1);
    }

    final static void d(byte param0) {
        L0: {
          if (fh.field_m != null) {
            ec.field_b = fh.field_m;
            ua.field_E = ke.field_j;
            ec.field_b.field_ob = -1;
            fh.field_m = null;
            ec.field_b.field_xb = -1;
            ke.field_j = null;
            break L0;
          } else {
            break L0;
          }
        }
        nq.field_t = null;
        jk.field_d = null;
        if (param0 != 87) {
          field_f = -103;
          sq.field_N = true;
          lj.field_v = null;
          dp.field_c = null;
          br.field_c = null;
          return;
        } else {
          sq.field_N = true;
          lj.field_v = null;
          dp.field_c = null;
          br.field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        if (param0 != 0) {
          field_d = (cj) null;
          var1 = fa.d(false);
          var2 = sk.a((byte) -99);
          po.field_l.a(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1 + (um.field_a << -712202079), (la.field_m << -229064703) + var2, 12018);
          sq.g(param0 + 114);
          return;
        } else {
          var1 = fa.d(false);
          var2 = sk.a((byte) -99);
          po.field_l.a(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1 + (um.field_a << -712202079), (la.field_m << -229064703) + var2, 12018);
          sq.g(param0 + 114);
          return;
        }
    }

    final static void b(int param0) {
        fq.field_i = null;
        if (param0 != 1) {
            field_j = (cj) null;
            wb.field_hb = null;
            return;
        }
        wb.field_hb = null;
    }

    sc(int param0) {
        qa dupTemp$0 = null;
        qa var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_g = 0;
        this.field_i = param0;
        this.field_k = new qa[param0];
        int var2 = 0;
        do {
            if (var2 >= param0) {
                return;
            }
            dupTemp$0 = new qa();
            var3 = dupTemp$0;
            this.field_k[var2] = dupTemp$0;
            var3.field_p = var3;
            var3.field_k = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    static {
        ja discarded$0 = new ja(640, 480);
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_a = false;
    }
}
